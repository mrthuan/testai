package lib.zj.office.fc.xls;

import a0.a;
import com.google.android.play.core.assetpacks.b1;
import ei.d;
import hi.b;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import lib.zj.office.fc.dom4j.Element;
import lib.zj.office.fc.dom4j.ElementHandler;
import lib.zj.office.fc.dom4j.ElementPath;
import lib.zj.office.fc.dom4j.io.SAXReader;
import lib.zj.office.fc.openxml4j.opc.PackagePart;
import lib.zj.office.fc.openxml4j.opc.PackageRelationship;
import lib.zj.office.fc.openxml4j.opc.PackageRelationshipCollection;
import lib.zj.office.fc.openxml4j.opc.PackageRelationshipTypes;
import lib.zj.office.fc.openxml4j.opc.ZipPackage;
import lib.zj.office.fc.xls.Reader.WorkbookReader;
import lib.zj.office.fc.xls.Reader.shared.StyleReader;
import lib.zj.office.fc.xls.Reader.shared.ThemeColorReader;
import lib.zj.office.system.AbortReaderError;
import lib.zj.office.system.StopReaderError;
import lib.zj.office.system.f;

/* loaded from: classes3.dex */
public class XLSXReader extends SSReader {
    private d book;
    private String filePath;
    private String key;
    private boolean needParseByStream;
    private PackagePart packagePart;
    private boolean searched;
    private int sharedStringIndex;
    private ZipPackage zipPackage;

    public XLSXReader(f fVar, String str, boolean z10) {
        this.control = fVar;
        this.filePath = str;
        this.needParseByStream = z10;
    }

    private void getPaletteColor() {
        b bVar = new b();
        int i10 = 8;
        byte[] a10 = bVar.a(8);
        while (a10 != null) {
            int i11 = i10 + 1;
            this.book.b(i10, b1.W(a10[0], a10[1], a10[2]));
            a10 = bVar.a(i11);
            i10 = i11;
        }
        ArrayList arrayList = bVar.f18347a;
        if (arrayList != null) {
            arrayList.clear();
        }
    }

    private void getSharedString(PackagePart packagePart) {
        PackageRelationshipCollection relationshipsByType = packagePart.getRelationshipsByType(PackageRelationshipTypes.SHAREDSTRINGS_PART);
        if (relationshipsByType.size() <= 0) {
            return;
        }
        PackagePart part = this.zipPackage.getPart(relationshipsByType.getRelationship(0).getTargetURI());
        this.sharedStringIndex = 0;
        SAXReader sAXReader = new SAXReader();
        try {
            sAXReader.addHandler("/sst/si", new SharedStringSaxHandler());
            InputStream inputStream = part.getInputStream();
            sAXReader.read(inputStream);
            inputStream.close();
        } finally {
            sAXReader.resetHandlers();
        }
    }

    private void getStyles(PackagePart packagePart) {
        if (packagePart.getRelationshipsByType(PackageRelationshipTypes.STYLE_PART).size() <= 0) {
            return;
        }
        StyleReader.instance().getWorkBookStyle(this.zipPackage.getPart(packagePart.getRelationshipsByType(PackageRelationshipTypes.STYLE_PART).getRelationship(0).getTargetURI()), this.book, this);
    }

    private void getThemeColor(PackagePart packagePart) {
        if (packagePart.getRelationshipsByType(PackageRelationshipTypes.THEME_PART).size() <= 0) {
            return;
        }
        ThemeColorReader.instance().getThemeColor(this.zipPackage.getPart(packagePart.getRelationshipsByType(PackageRelationshipTypes.THEME_PART).getRelationship(0).getTargetURI()), this.book);
    }

    private void getWorkBookSharedObjects() {
        getPaletteColor();
        getThemeColor(this.packagePart);
        getStyles(this.packagePart);
        getSharedString(this.packagePart);
    }

    private void initPackagePart() {
        PackageRelationship relationship = this.zipPackage.getRelationshipsByType(PackageRelationshipTypes.CORE_DOCUMENT).getRelationship(0);
        if (relationship.getTargetURI().toString().equals("/xl/workbook.xml")) {
            this.packagePart = this.zipPackage.getPart(relationship);
            return;
        }
        throw new Exception("Format error");
    }

    private void processWorkbook() {
        getWorkBookSharedObjects();
        WorkbookReader.instance().read(this.zipPackage, this.packagePart, this.book, this);
    }

    private boolean searchContent_SharedString(PackagePart packagePart, String str) {
        PackageRelationshipCollection relationshipsByType = packagePart.getRelationshipsByType(PackageRelationshipTypes.SHAREDSTRINGS_PART);
        if (relationshipsByType.size() <= 0) {
            return false;
        }
        PackagePart part = this.zipPackage.getPart(relationshipsByType.getRelationship(0).getTargetURI());
        this.key = str;
        this.searched = false;
        SAXReader sAXReader = new SAXReader();
        try {
            sAXReader.addHandler("/sst/si", new SearchSharedStringSaxHandler());
            InputStream inputStream = part.getInputStream();
            sAXReader.read(inputStream);
            inputStream.close();
            sAXReader.resetHandlers();
            return this.searched;
        } catch (StopReaderError unused) {
            sAXReader.resetHandlers();
            return true;
        } catch (Throwable th2) {
            sAXReader.resetHandlers();
            throw th2;
        }
    }

    @Override // lib.zj.office.system.b, lib.zj.office.system.j
    public void dispose() {
        super.dispose();
        WorkbookReader.instance().dispose();
        ZipPackage zipPackage = this.zipPackage;
        if (zipPackage != null) {
            zipPackage.revert();
        }
    }

    @Override // lib.zj.office.system.b, lib.zj.office.system.j
    public Object getModel() {
        this.book = new d(false);
        this.zipPackage = new ZipPackage(this.filePath, this.needParseByStream);
        initPackagePart();
        processWorkbook();
        return this.book;
    }

    @Override // lib.zj.office.system.b
    public boolean searchContent(File file, String str) {
        boolean searchContent;
        String lowerCase = str.toLowerCase();
        ZipPackage zipPackage = new ZipPackage(file.getAbsolutePath(), this.needParseByStream);
        this.zipPackage = zipPackage;
        PackagePart part = this.zipPackage.getPart(zipPackage.getRelationshipsByType(PackageRelationshipTypes.CORE_DOCUMENT).getRelationship(0));
        this.packagePart = part;
        if (searchContent_SharedString(part, lowerCase)) {
            searchContent = true;
        } else {
            searchContent = WorkbookReader.instance().searchContent(this.zipPackage, this, this.packagePart, lowerCase);
        }
        dispose();
        return searchContent;
    }

    /* loaded from: classes3.dex */
    public class SearchSharedStringSaxHandler implements ElementHandler {
        public SearchSharedStringSaxHandler() {
        }

        @Override // lib.zj.office.fc.dom4j.ElementHandler
        public void onEnd(ElementPath elementPath) {
            if (!((lib.zj.office.system.b) XLSXReader.this).abortReader) {
                Element current = elementPath.getCurrent();
                if (current.getName().equals("si")) {
                    Element element = current.element("t");
                    if (element != null) {
                        if (element.getText().toLowerCase().contains(XLSXReader.this.key)) {
                            XLSXReader.this.searched = true;
                        }
                    } else {
                        Iterator elementIterator = current.elementIterator("r");
                        String str = "";
                        while (elementIterator.hasNext()) {
                            StringBuilder k10 = a.k(str);
                            k10.append(((Element) elementIterator.next()).element("t").getText());
                            str = k10.toString();
                        }
                        if (str.toLowerCase().contains(XLSXReader.this.key)) {
                            XLSXReader.this.searched = true;
                        }
                    }
                }
                current.detach();
                if (!XLSXReader.this.searched) {
                    return;
                }
                throw new StopReaderError("stop");
            }
            throw new AbortReaderError("abort Reader");
        }

        @Override // lib.zj.office.fc.dom4j.ElementHandler
        public void onStart(ElementPath elementPath) {
        }
    }

    /* loaded from: classes3.dex */
    public class SharedStringSaxHandler implements ElementHandler {
        public SharedStringSaxHandler() {
        }

        @Override // lib.zj.office.fc.dom4j.ElementHandler
        public void onEnd(ElementPath elementPath) {
            if (!((lib.zj.office.system.b) XLSXReader.this).abortReader) {
                Element current = elementPath.getCurrent();
                if (current.getName().equals("si")) {
                    Element element = current.element("t");
                    if (element != null) {
                        XLSXReader.this.book.f(XLSXReader.this.sharedStringIndex, element.getText());
                    } else {
                        XLSXReader.this.book.f(XLSXReader.this.sharedStringIndex, current);
                    }
                    XLSXReader.this.sharedStringIndex++;
                }
                current.detach();
                return;
            }
            throw new AbortReaderError("abort Reader");
        }

        @Override // lib.zj.office.fc.dom4j.ElementHandler
        public void onStart(ElementPath elementPath) {
        }
    }
}

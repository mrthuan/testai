package lib.zj.office.fc.xls.Reader;

import androidx.activity.f;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import ei.b;
import ei.c;
import ei.d;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import jf.o;
import ji.a;
import lib.zj.office.fc.dom4j.Document;
import lib.zj.office.fc.dom4j.Element;
import lib.zj.office.fc.dom4j.ElementHandler;
import lib.zj.office.fc.dom4j.ElementPath;
import lib.zj.office.fc.dom4j.io.SAXReader;
import lib.zj.office.fc.openxml4j.opc.PackagePart;
import lib.zj.office.fc.openxml4j.opc.PackageRelationship;
import lib.zj.office.fc.openxml4j.opc.PackageRelationshipCollection;
import lib.zj.office.fc.openxml4j.opc.PackageRelationshipTypes;
import lib.zj.office.fc.openxml4j.opc.ZipPackage;
import lib.zj.office.fc.ppt.reader.PictureReader;
import lib.zj.office.fc.ss.util.CellUtil;
import lib.zj.office.fc.xls.Reader.drawing.DrawingReader;
import lib.zj.office.fc.xls.Reader.table.TableReader;
import lib.zj.office.system.AbortReaderError;
import lib.zj.office.system.StopReaderError;
import lib.zj.office.system.j;

/* loaded from: classes3.dex */
public class SheetReader {
    private static SheetReader reader = new SheetReader();
    private int defaultColWidth;
    private int defaultRowHeight;
    private j iReader;
    private String key;
    private boolean searched;
    private c sheet;

    private void checkTableCell(c cVar) {
        a[] aVarArr;
        ArrayList arrayList = cVar.f16623x;
        if (arrayList != null) {
            aVarArr = (a[]) arrayList.toArray(new a[arrayList.size()]);
        } else {
            aVarArr = null;
        }
        if (aVarArr == null) {
            return;
        }
        for (a aVar : aVarArr) {
            ci.a aVar2 = aVar.f19252a;
            for (int i10 = aVar2.f5690a; i10 <= aVar2.c; i10++) {
                b g10 = cVar.g(i10);
                if (g10 == null) {
                    g10 = new b((aVar2.f5692d - aVar2.f5691b) + 1);
                    g10.f16594a = cVar;
                    g10.f16596d = i10;
                    g10.f16595b = aVar2.f5691b;
                    g10.c = aVar2.f5692d;
                    g10.f(true);
                    cVar.a(g10);
                }
                for (int i11 = aVar2.f5691b; i11 <= aVar2.f5692d; i11++) {
                    ei.a e10 = g10.e(i11, true);
                    if (e10 == null) {
                        e10 = new ei.a((short) 3);
                        e10.f16590d = i11;
                        e10.c = g10.f16596d;
                        e10.f16588a = cVar;
                        e10.f16591e = g10.f16597e;
                        g10.a(e10);
                    }
                    e10.f16593g.f((short) 5, aVar);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public b createRow(Element element, int i10) {
        boolean z10;
        int i11;
        if (!isValidateRow(element)) {
            return null;
        }
        int parseInt = Integer.parseInt(element.attributeValue("r")) - 1;
        String attributeValue = element.attributeValue("spans");
        float f10 = i10;
        if (element.attributeValue("ht") != null) {
            f10 = Float.parseFloat(element.attributeValue("ht")) * 1.3333334f;
        }
        if (element.attributeValue(CellUtil.HIDDEN) != null && Integer.parseInt(element.attributeValue(CellUtil.HIDDEN)) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (element.attributeValue("s") != null) {
            i11 = Integer.parseInt(element.attributeValue("s"));
        } else {
            i11 = 0;
        }
        b bVar = new b(getEndBySpans(attributeValue));
        bVar.f16596d = parseInt;
        bVar.f16598f = f10;
        Boolean valueOf = Boolean.valueOf(z10);
        o oVar = bVar.f16599g;
        oVar.a((short) 0, valueOf);
        bVar.f16594a = this.sheet;
        bVar.f16597e = i11;
        oVar.a((short) 1, Boolean.TRUE);
        return bVar;
    }

    private ci.a getCellRangeAddress(String str) {
        String[] split = str.split(":");
        return new ci.a(aj.b.x(split[0]), aj.b.q(split[0]), aj.b.x(split[1]), aj.b.q(split[1]));
    }

    private int getEndBySpans(String str) {
        if (str != null) {
            String[] split = str.split(" ");
            return Integer.parseInt(split[split.length - 1].split(":")[1], 16) - 1;
        }
        return 0;
    }

    private void getSheetHyperlink(c cVar, Map<String, String> map, Element element) {
        ei.a e10;
        if (element == null) {
            return;
        }
        Iterator elementIterator = element.elementIterator();
        while (elementIterator.hasNext()) {
            Element element2 = (Element) elementIterator.next();
            String attributeValue = element2.attributeValue(FacebookMediationAdapter.KEY_ID);
            String attributeValue2 = element2.attributeValue("ref");
            if (!attributeValue2.contains(":")) {
                attributeValue2 = f.m(attributeValue2, ":", attributeValue2);
            }
            String[] split = attributeValue2.split(":");
            if (split != null) {
                int i10 = 2;
                if (split.length == 2) {
                    int x4 = aj.b.x(split[0]);
                    int q5 = aj.b.q(split[0]);
                    int x10 = aj.b.x(split[1]);
                    int q6 = aj.b.q(split[1]);
                    while (x4 <= x10) {
                        int i11 = q5;
                        while (i11 <= q6) {
                            b g10 = cVar.g(x4);
                            if (g10 != null && (e10 = g10.e(i11, true)) != null) {
                                ih.a aVar = new ih.a();
                                String str = map.get(attributeValue);
                                if (str == null) {
                                    aVar.f18491a = i10;
                                    str = element2.attributeValue("location");
                                } else if (str.contains("mailto")) {
                                    aVar.f18491a = 3;
                                } else if (str.contains("http")) {
                                    aVar.f18491a = 1;
                                } else {
                                    aVar.f18491a = 4;
                                }
                                aVar.f18492b = str;
                                e10.f16593g.f((short) 3, aVar);
                            }
                            i11++;
                            i10 = 2;
                        }
                        x4++;
                        i10 = 2;
                    }
                }
            }
        }
    }

    private Map<String, String> getSheetHyperlinkByRelation(PackagePart packagePart) {
        PackageRelationshipCollection relationshipsByType = packagePart.getRelationshipsByType(PackageRelationshipTypes.HYPERLINK_PART);
        HashMap hashMap = new HashMap(relationshipsByType.size());
        Iterator<PackageRelationship> it = relationshipsByType.iterator();
        while (it.hasNext()) {
            PackageRelationship next = it.next();
            hashMap.put(next.getId(), next.getTargetURI().toString());
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getSheetMergerdCells(Element element) {
        ci.a cellRangeAddress = getCellRangeAddress(element.attributeValue("ref"));
        if (cellRangeAddress.c - cellRangeAddress.f5690a != 1048575 && cellRangeAddress.f5692d - cellRangeAddress.f5691b != 16383) {
            ArrayList arrayList = this.sheet.f16615p;
            arrayList.add(cellRangeAddress);
            int size = arrayList.size() - 1;
            for (int i10 = cellRangeAddress.f5690a; i10 <= cellRangeAddress.c; i10++) {
                b g10 = this.sheet.g(i10);
                if (g10 == null) {
                    g10 = new b(cellRangeAddress.f5692d - cellRangeAddress.f5691b);
                    c cVar = this.sheet;
                    g10.f16594a = cVar;
                    g10.f16596d = i10;
                    cVar.a(g10);
                }
                for (int i11 = cellRangeAddress.f5691b; i11 <= cellRangeAddress.f5692d; i11++) {
                    ei.a e10 = g10.e(i11, true);
                    if (e10 == null) {
                        e10 = new ei.a((short) 3);
                        e10.c = i10;
                        e10.f16590d = i11;
                        e10.f16588a = this.sheet;
                        e10.f16591e = g10.f16597e;
                        g10.a(e10);
                    }
                    e10.f16593g.f((short) 1, Integer.valueOf(size));
                }
            }
        }
    }

    public static SheetReader instance() {
        return reader;
    }

    private boolean isValidateRow(Element element) {
        if (element.attributeValue("ht") != null) {
            return true;
        }
        if (element.attributeValue("s") != null) {
            if (d.s(this.sheet.f16601a.h(Integer.parseInt(element.attributeValue("s"))))) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void modifyRow(b bVar, Element element, int i10) {
        boolean z10;
        int i11;
        if (element.attributeValue("ht") != null) {
            i10 = (int) (Double.parseDouble(element.attributeValue("ht")) * 1.3333333730697632d);
        }
        if (element.attributeValue(CellUtil.HIDDEN) != null && Integer.parseInt(element.attributeValue(CellUtil.HIDDEN)) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (element.attributeValue("s") != null) {
            i11 = Integer.parseInt(element.attributeValue("s"));
        } else {
            i11 = 0;
        }
        bVar.f16598f = i10;
        Boolean valueOf = Boolean.valueOf(z10);
        o oVar = bVar.f16599g;
        oVar.a((short) 0, valueOf);
        bVar.f16597e = i11;
        oVar.a((short) 1, Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setColumnProperty(Element element) {
        double d10;
        boolean z10;
        int i10;
        int parseInt = Integer.parseInt(element.attributeValue("min")) - 1;
        int parseInt2 = Integer.parseInt(element.attributeValue("max")) - 1;
        if (element.attributeValue(InMobiNetworkValues.WIDTH) != null) {
            d10 = Double.parseDouble(element.attributeValue(InMobiNetworkValues.WIDTH)) * 6.0d * 1.3333333730697632d;
        } else {
            d10 = 0.0d;
        }
        if (element.attributeValue(CellUtil.HIDDEN) != null && Integer.parseInt(element.attributeValue(CellUtil.HIDDEN)) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (element.attributeValue("style") != null) {
            i10 = Integer.parseInt(element.attributeValue("style"));
        } else {
            i10 = 0;
        }
        c cVar = this.sheet;
        hi.a aVar = new hi.a((int) d10, parseInt, parseInt2, i10, z10);
        if (cVar.f16616q == null) {
            cVar.f16616q = new ArrayList();
        }
        cVar.f16616q.add(aVar);
    }

    public void getSheet(lib.zj.office.system.f fVar, ZipPackage zipPackage, c cVar, PackagePart packagePart, j jVar) {
        Element element;
        this.sheet = cVar;
        this.iReader = jVar;
        SAXReader sAXReader = new SAXReader();
        try {
            XLSXSaxHandler xLSXSaxHandler = new XLSXSaxHandler();
            sAXReader.addHandler("/worksheet/sheetFormatPr", xLSXSaxHandler);
            sAXReader.addHandler("/worksheet/cols/col", xLSXSaxHandler);
            sAXReader.addHandler("/worksheet/sheetData/row", xLSXSaxHandler);
            sAXReader.addHandler("/worksheet/sheetData/row/c", xLSXSaxHandler);
            sAXReader.addHandler("/worksheet/mergeCells/mergeCell", xLSXSaxHandler);
            InputStream inputStream = packagePart.getInputStream();
            Document read = sAXReader.read(inputStream);
            inputStream.close();
            Element rootElement = read.getRootElement();
            sAXReader.resetHandlers();
            Element element2 = null;
            if (rootElement.element("sheetViews") != null) {
                element = rootElement.element("sheetView");
            } else {
                element = null;
            }
            if (element != null) {
                element2 = element.element("pane");
            }
            if (element2 != null) {
                if (element2.attributeValue("xSplit") != null) {
                    Integer.parseInt(element2.attributeValue("xSplit"));
                }
                if (element2.attributeValue("ySplit") != null) {
                    Integer.parseInt(element2.attributeValue("ySplit"));
                }
                cVar.getClass();
            }
            Map<String, String> sheetHyperlinkByRelation = getSheetHyperlinkByRelation(packagePart);
            PackageRelationshipCollection relationshipsByType = packagePart.getRelationshipsByType(PackageRelationshipTypes.TABLE_PART);
            if (relationshipsByType.size() > 0) {
                Iterator<PackageRelationship> it = relationshipsByType.iterator();
                while (it.hasNext()) {
                    TableReader.instance().read(fVar, zipPackage.getPart(it.next().getTargetURI()), cVar);
                }
            }
            PackageRelationshipCollection relationshipsByType2 = packagePart.getRelationshipsByType(PackageRelationshipTypes.DRAWING_PART);
            if (relationshipsByType2.size() > 0) {
                DrawingReader.instance().read(fVar, zipPackage, zipPackage.getPart(relationshipsByType2.getRelationship(0).getTargetURI()), cVar);
            }
            DrawingReader.instance().processOLEPicture(fVar, zipPackage, packagePart, cVar, rootElement.element("oleObjects"));
            PictureReader.instance().dispose();
            getSheetHyperlink(cVar, sheetHyperlinkByRelation, rootElement.element("hyperlinks"));
            checkTableCell(cVar);
            cVar.o((short) 2);
            dispose();
        } catch (Throwable th2) {
            sAXReader.resetHandlers();
            throw th2;
        }
    }

    public boolean searchContent(ZipPackage zipPackage, j jVar, PackagePart packagePart, String str) {
        this.key = str;
        this.searched = false;
        this.iReader = jVar;
        SAXReader sAXReader = new SAXReader();
        try {
            sAXReader.addHandler("/worksheet/sheetData/row/c", new XLSXSearchSaxHandler());
            InputStream inputStream = packagePart.getInputStream();
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

    private void dispose() {
    }

    /* loaded from: classes3.dex */
    public class XLSXSaxHandler implements ElementHandler {
        public XLSXSaxHandler() {
        }

        @Override // lib.zj.office.fc.dom4j.ElementHandler
        public void onEnd(ElementPath elementPath) {
            ei.a aVar;
            if (!SheetReader.this.iReader.isAborted()) {
                Element current = elementPath.getCurrent();
                String name = current.getName();
                if (name.equals("sheetFormatPr")) {
                    if (current.attributeValue("defaultRowHeight") != null) {
                        SheetReader.this.defaultRowHeight = (int) (Double.parseDouble(current.attributeValue("defaultRowHeight")) * 1.3333333730697632d);
                        SheetReader.this.sheet.f16618s = SheetReader.this.defaultRowHeight;
                    }
                    if (current.attributeValue("defaultColWidth") != null) {
                        SheetReader.this.defaultColWidth = (int) (Double.parseDouble(current.attributeValue("defaultColWidth")) * 6.0d * 1.3333333730697632d);
                        SheetReader.this.sheet.f16619t = SheetReader.this.defaultColWidth;
                    }
                } else if (name.equals("col")) {
                    SheetReader.this.setColumnProperty(current);
                } else if (name.equals("row")) {
                    int parseInt = Integer.parseInt(current.attributeValue("r")) - 1;
                    if (SheetReader.this.sheet.g(parseInt) == null) {
                        c cVar = SheetReader.this.sheet;
                        SheetReader sheetReader = SheetReader.this;
                        cVar.a(sheetReader.createRow(current, sheetReader.defaultRowHeight));
                    } else {
                        SheetReader sheetReader2 = SheetReader.this;
                        sheetReader2.modifyRow(sheetReader2.sheet.g(parseInt), current, SheetReader.this.defaultRowHeight);
                    }
                } else if (name.equals("c")) {
                    String attributeValue = current.attributeValue("r");
                    int x4 = aj.b.x(attributeValue);
                    int q5 = aj.b.q(attributeValue);
                    b g10 = SheetReader.this.sheet.g(x4);
                    if (g10 != null) {
                        aVar = g10.e(q5, false);
                    } else {
                        g10 = new b(q5);
                        g10.f16596d = x4;
                        g10.f16594a = SheetReader.this.sheet;
                        SheetReader.this.sheet.a(g10);
                        aVar = null;
                    }
                    if (aVar == null) {
                        aVar = CellReader.instance().getCell(SheetReader.this.sheet, current);
                    }
                    if (aVar != null) {
                        aVar.f16588a = SheetReader.this.sheet;
                        g10.a(aVar);
                    }
                } else if (name.equals("mergeCell")) {
                    SheetReader.this.getSheetMergerdCells(current);
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

    /* loaded from: classes3.dex */
    public class XLSXSearchSaxHandler implements ElementHandler {
        public XLSXSearchSaxHandler() {
        }

        @Override // lib.zj.office.fc.dom4j.ElementHandler
        public void onEnd(ElementPath elementPath) {
            if (!SheetReader.this.iReader.isAborted()) {
                Element current = elementPath.getCurrent();
                if (current.getName().equals("c") && CellReader.instance().searchContent(current, SheetReader.this.key)) {
                    SheetReader.this.searched = true;
                }
                current.detach();
                if (!SheetReader.this.searched) {
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
}

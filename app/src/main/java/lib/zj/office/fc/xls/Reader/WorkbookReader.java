package lib.zj.office.fc.xls.Reader;

import android.os.Message;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.tom_roush.fontbox.ttf.NamingTable;
import ei.c;
import ei.d;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
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
import lib.zj.office.fc.xls.SSReader;
import lib.zj.office.system.AbortReaderError;
import lib.zj.office.system.f;
import lib.zj.office.system.j;
import lib.zj.office.system.q;

/* loaded from: classes3.dex */
public class WorkbookReader {
    private static final int WINDOWWIDTH = 2;
    private static WorkbookReader reader = new WorkbookReader();
    private d book;
    private PackageRelationshipCollection chartsheetRelCollection;
    private SSReader iReader;
    private Map<Integer, String> sheetIndexList;
    private Map<String, String> sheetNameList;
    private Thread sheetParseThread;
    private int tempIndex;
    private PackageRelationshipCollection worksheetRelCollection;
    private ZipPackage zipPackage;

    /* loaded from: classes3.dex */
    public class SheetThread extends Thread {
        private f control;
        private WorkbookReader reader;
        private int sheetIndex;

        public SheetThread(f fVar, WorkbookReader workbookReader, int i10) {
            this.reader = workbookReader;
            this.sheetIndex = i10;
            this.control = fVar;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                try {
                    this.reader.readSheetInSlideWindow(this.control, this.sheetIndex);
                } catch (Exception e10) {
                    this.control.o().c().a(true, e10);
                    this.reader.dispose();
                } catch (OutOfMemoryError e11) {
                    this.control.o().c().a(true, e11);
                    this.reader.dispose();
                }
            } finally {
                this.reader = null;
            }
        }
    }

    private void getSheetsProp(PackagePart packagePart) {
        Map<Integer, String> map = this.sheetIndexList;
        if (map != null) {
            map.clear();
        } else {
            this.sheetIndexList = new HashMap(5);
        }
        Map<String, String> map2 = this.sheetNameList;
        if (map2 != null) {
            map2.clear();
        } else {
            this.sheetNameList = new HashMap(5);
        }
        this.tempIndex = 0;
        SAXReader sAXReader = new SAXReader();
        try {
            WorkBookSaxHandler workBookSaxHandler = new WorkBookSaxHandler();
            sAXReader.addHandler("/workbook/workbookPr", workBookSaxHandler);
            sAXReader.addHandler("/workbook/sheets/sheet", workBookSaxHandler);
            InputStream inputStream = packagePart.getInputStream();
            sAXReader.read(inputStream);
            inputStream.close();
        } finally {
            sAXReader.resetHandlers();
        }
    }

    public static WorkbookReader instance() {
        return reader;
    }

    private void readSheet(f fVar, int i10) {
        short s4;
        PackagePart part;
        PackageRelationship relationshipByID = this.worksheetRelCollection.getRelationshipByID(this.sheetIndexList.get(Integer.valueOf(i10)));
        if (relationshipByID == null) {
            relationshipByID = this.chartsheetRelCollection.getRelationshipByID(this.sheetIndexList.get(Integer.valueOf(i10)));
            s4 = 1;
        } else {
            s4 = 0;
        }
        if (relationshipByID != null && (part = this.zipPackage.getPart(relationshipByID.getTargetURI())) != null) {
            this.book.o(i10).f16609j = s4;
            SheetReader.instance().getSheet(fVar, this.zipPackage, this.book.o(i10), part, this.iReader);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void readSheetInSlideWindow(f fVar, int i10) {
        int i11;
        int i12;
        d dVar = this.book;
        if (dVar == null) {
            return;
        }
        synchronized (dVar) {
            this.iReader.abortCurrentReading();
            Thread.sleep(50L);
            i11 = i10 - 2;
            int i13 = i11;
            while (true) {
                i12 = i10 + 2;
                if (i13 > i12) {
                    break;
                }
                if (i13 >= 0 && this.book.o(i13) != null && !this.book.o(i13).k()) {
                    this.book.o(i13).o((short) 1);
                }
                i13++;
            }
        }
        if (i10 >= 0 && this.book.o(i10) != null && !this.book.o(i10).k()) {
            readSheet(fVar, i10);
        }
        while (i11 <= i12 && !Thread.currentThread().isInterrupted()) {
            if (i11 >= 0 && this.book.o(i11) != null && !this.book.o(i11).k()) {
                readSheet(fVar, i11);
            }
            i11++;
        }
    }

    private boolean searchContent_Sheet(j jVar, PackageRelationship packageRelationship, String str) {
        PackagePart part = this.zipPackage.getPart(packageRelationship.getTargetURI());
        if (part != null) {
            return SheetReader.instance().searchContent(this.zipPackage, jVar, part, str);
        }
        return false;
    }

    private boolean searchContent_SheetName(PackagePart packagePart, String str) {
        SAXReader sAXReader = new SAXReader();
        InputStream inputStream = packagePart.getInputStream();
        Document read = sAXReader.read(inputStream);
        inputStream.close();
        Iterator elementIterator = read.getRootElement().element("sheets").elementIterator();
        while (elementIterator.hasNext()) {
            if (((Element) elementIterator.next()).attributeValue(NamingTable.TAG).toLowerCase().contains(str)) {
                return true;
            }
        }
        return false;
    }

    public void dispose() {
        Map<String, String> map = this.sheetNameList;
        if (map != null) {
            map.clear();
        }
        Map<Integer, String> map2 = this.sheetIndexList;
        if (map2 != null) {
            map2.clear();
        }
        PackageRelationshipCollection packageRelationshipCollection = this.worksheetRelCollection;
        if (packageRelationshipCollection != null) {
            packageRelationshipCollection.clear();
        }
        PackageRelationshipCollection packageRelationshipCollection2 = this.chartsheetRelCollection;
        if (packageRelationshipCollection2 != null) {
            packageRelationshipCollection2.clear();
        }
        Thread thread = this.sheetParseThread;
        if (thread != null && thread.isAlive() && !this.sheetParseThread.isInterrupted()) {
            this.sheetParseThread.interrupt();
        }
    }

    public void read(ZipPackage zipPackage, PackagePart packagePart, d dVar, SSReader sSReader) {
        this.zipPackage = zipPackage;
        this.book = dVar;
        this.iReader = sSReader;
        getSheetsProp(packagePart);
        for (int i10 = 0; i10 < this.sheetIndexList.size(); i10++) {
            c cVar = new c();
            cVar.f16601a = dVar;
            cVar.f16612m = this.sheetNameList.get(this.sheetIndexList.get(Integer.valueOf(i10)));
            synchronized (dVar) {
                dVar.c.put(Integer.valueOf(i10), cVar);
            }
        }
        this.worksheetRelCollection = packagePart.getRelationshipsByType(PackageRelationshipTypes.WORKSHEET_PART);
        this.chartsheetRelCollection = packagePart.getRelationshipsByType(PackageRelationshipTypes.CHARTSHEET_PART);
        q qVar = new q(sSReader.getControl(), this) { // from class: lib.zj.office.fc.xls.Reader.WorkbookReader.1WorkbookReaderHandler
            private f control;
            private WorkbookReader reader;

            {
                this.reader = this;
                this.control = r2;
            }

            @Override // lib.zj.office.system.q
            public void handleMessage(Message message) {
                int i11 = message.what;
                if (i11 != 0) {
                    if (i11 == 1 || i11 == 4) {
                        WorkbookReader.this.dispose();
                        this.reader = null;
                        return;
                    }
                    return;
                }
                WorkbookReader.this.sheetParseThread = new SheetThread(this.control, this.reader, ((Integer) message.obj).intValue());
                WorkbookReader.this.sheetParseThread.start();
            }
        };
        dVar.f16624a = qVar;
        Message message = new Message();
        message.what = 0;
        message.obj = 0;
        qVar.handleMessage(message);
    }

    public boolean searchContent(ZipPackage zipPackage, j jVar, PackagePart packagePart, String str) {
        if (searchContent_SheetName(packagePart, str)) {
            return true;
        }
        this.zipPackage = zipPackage;
        this.worksheetRelCollection = packagePart.getRelationshipsByType(PackageRelationshipTypes.WORKSHEET_PART);
        for (int i10 = 0; i10 < this.worksheetRelCollection.size(); i10++) {
            if (searchContent_Sheet(jVar, this.worksheetRelCollection.getRelationship(i10), str)) {
                dispose();
                return true;
            }
        }
        return false;
    }

    /* loaded from: classes3.dex */
    public class WorkBookSaxHandler implements ElementHandler {
        public WorkBookSaxHandler() {
        }

        @Override // lib.zj.office.fc.dom4j.ElementHandler
        public void onEnd(ElementPath elementPath) {
            if (!WorkbookReader.this.iReader.isAborted()) {
                Element current = elementPath.getCurrent();
                String name = current.getName();
                boolean z10 = true;
                if (name.equals("sheet")) {
                    String attributeValue = current.attributeValue(FacebookMediationAdapter.KEY_ID);
                    String attributeValue2 = current.attributeValue(NamingTable.TAG);
                    WorkbookReader.this.sheetIndexList.put(Integer.valueOf(WorkbookReader.this.tempIndex), attributeValue);
                    WorkbookReader.this.sheetNameList.put(attributeValue, attributeValue2);
                    WorkbookReader.this.tempIndex++;
                } else if (name.equals("workbookPr")) {
                    String attributeValue3 = current.attributeValue("date1904");
                    boolean z11 = false;
                    if (attributeValue3 != null) {
                        try {
                            try {
                                if (Integer.parseInt(attributeValue3) == 0) {
                                    z10 = false;
                                }
                                z11 = z10;
                            } catch (Exception unused) {
                            }
                        } catch (NumberFormatException unused2) {
                            z11 = Boolean.parseBoolean(attributeValue3);
                        }
                    }
                    d dVar = WorkbookReader.this.book;
                    synchronized (dVar) {
                        dVar.f16625b = z11;
                    }
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

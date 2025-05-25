package lib.zj.office.fc.ppt.reader;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDPrintFieldAttributeObject;
import java.io.InputStream;
import java.util.HashMap;
import lib.zj.office.fc.dom4j.Element;
import lib.zj.office.fc.dom4j.ElementHandler;
import lib.zj.office.fc.dom4j.ElementPath;
import lib.zj.office.fc.dom4j.io.SAXReader;
import lib.zj.office.fc.openxml4j.opc.PackagePart;
import th.c;
import uh.a;
import uh.b;

/* loaded from: classes3.dex */
public class TableStyleReader {
    private c pgModel = null;
    private int defaultFontSize = 12;

    private a getTableCellBorders(Element element) {
        a aVar = new a();
        Element element2 = element.element("left");
        if (element2 != null) {
            aVar.f30371a = element2.element("ln");
        }
        Element element3 = element.element("right");
        if (element3 != null) {
            aVar.c = element3.element("ln");
        }
        Element element4 = element.element("top");
        if (element4 != null) {
            aVar.f30372b = element4.element("ln");
        }
        Element element5 = element.element("bottom");
        if (element5 != null) {
            aVar.f30373d = element5.element("ln");
        }
        return aVar;
    }

    private b processTableCellStyle(Element element) {
        b bVar = new b();
        Element element2 = element.element("tcTxStyle");
        if (element2 != null) {
            zh.c cVar = new zh.c();
            if (PDPrintFieldAttributeObject.CHECKED_STATE_ON.equals(element2.attributeValue("b"))) {
                zh.b.f32374b.getClass();
                zh.b.v(cVar, true);
            }
            if (PDPrintFieldAttributeObject.CHECKED_STATE_ON.equals(element2.attributeValue(OperatorName.SET_FLATNESS))) {
                zh.b.f32374b.getClass();
                zh.b.x(cVar, true);
            }
            zh.b bVar2 = zh.b.f32374b;
            int i10 = this.defaultFontSize;
            bVar2.getClass();
            zh.b.z(cVar, i10);
            bVar.c = cVar;
        }
        Element element3 = element.element("tcStyle");
        Element element4 = element3.element("tcBdr");
        if (element4 != null) {
            bVar.f30374a = getTableCellBorders(element4);
        }
        bVar.f30375b = element3.element("fill");
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processTableStyle(Element element) {
        uh.c cVar = new uh.c();
        String attributeValue = element.attributeValue("styleId");
        Element element2 = element.element("wholeTbl");
        if (element2 != null) {
            cVar.f30376a = processTableCellStyle(element2);
        }
        Element element3 = element.element("band1H");
        if (element3 != null) {
            cVar.f30377b = processTableCellStyle(element3);
        }
        Element element4 = element.element("band2H");
        if (element4 != null) {
            processTableCellStyle(element4);
        }
        Element element5 = element.element("band1V");
        if (element5 != null) {
            cVar.c = processTableCellStyle(element5);
        }
        Element element6 = element.element("band2V");
        if (element6 != null) {
            processTableCellStyle(element6);
        }
        Element element7 = element.element("lastCol");
        if (element7 != null) {
            cVar.f30379e = processTableCellStyle(element7);
        }
        Element element8 = element.element("firstCol");
        if (element8 != null) {
            cVar.f30378d = processTableCellStyle(element8);
        }
        Element element9 = element.element("lastRow");
        if (element9 != null) {
            cVar.f30381g = processTableCellStyle(element9);
        }
        Element element10 = element.element("firstRow");
        if (element10 != null) {
            cVar.f30380f = processTableCellStyle(element10);
        }
        c cVar2 = this.pgModel;
        if (cVar2.f30032f == null) {
            cVar2.f30032f = new HashMap();
        }
        if (attributeValue != null) {
            cVar2.f30032f.put(attributeValue, cVar);
        }
    }

    public void read(c cVar, PackagePart packagePart, int i10) {
        this.pgModel = cVar;
        this.defaultFontSize = i10;
        SAXReader sAXReader = new SAXReader();
        try {
            try {
                InputStream inputStream = packagePart.getInputStream();
                sAXReader.addHandler("/tblStyleLst/tblStyle", new TableStyleSaxHandler());
                sAXReader.read(inputStream);
                inputStream.close();
            } catch (Exception e10) {
                throw e10;
            }
        } finally {
            sAXReader.resetHandlers();
        }
    }

    /* loaded from: classes3.dex */
    public class TableStyleSaxHandler implements ElementHandler {
        public TableStyleSaxHandler() {
        }

        @Override // lib.zj.office.fc.dom4j.ElementHandler
        public void onEnd(ElementPath elementPath) {
            Element current = elementPath.getCurrent();
            try {
                if (current.getName().equals("tblStyle")) {
                    TableStyleReader.this.processTableStyle(current);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            current.detach();
        }

        @Override // lib.zj.office.fc.dom4j.ElementHandler
        public void onStart(ElementPath elementPath) {
        }
    }
}

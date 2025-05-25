package lib.zj.office.fc.xls.Reader.shared;

import ei.d;
import java.io.InputStream;
import lib.zj.office.fc.dom4j.Document;
import lib.zj.office.fc.dom4j.Element;
import lib.zj.office.fc.dom4j.io.SAXReader;
import lib.zj.office.fc.openxml4j.opc.PackagePart;

/* loaded from: classes3.dex */
public class ThemeColorReader {
    private static ThemeColorReader reader = new ThemeColorReader();

    private int getColorIndex(Element element, d dVar) {
        int i10;
        if (element.element("srgbClr") != null) {
            i10 = Integer.parseInt(element.element("srgbClr").attributeValue("val"), 16);
        } else if (element.element("sysClr") != null) {
            i10 = Integer.parseInt(element.element("sysClr").attributeValue("lastClr"), 16);
        } else {
            i10 = -16777216;
        }
        return dVar.a(i10 | (-16777216));
    }

    public static ThemeColorReader instance() {
        return reader;
    }

    public void getThemeColor(PackagePart packagePart, d dVar) {
        SAXReader sAXReader = new SAXReader();
        InputStream inputStream = packagePart.getInputStream();
        Document read = sAXReader.read(inputStream);
        inputStream.close();
        Element element = read.getRootElement().element("themeElements").element("clrScheme");
        int colorIndex = getColorIndex(element.element("lt1"), dVar);
        dVar.d(colorIndex, "lt1");
        dVar.d(colorIndex, "bg1");
        dVar.g(0, colorIndex);
        int colorIndex2 = getColorIndex(element.element("dk1"), dVar);
        dVar.d(colorIndex2, "dk1");
        dVar.d(colorIndex2, "tx1");
        dVar.g(1, colorIndex2);
        int colorIndex3 = getColorIndex(element.element("lt2"), dVar);
        dVar.d(colorIndex3, "lt2");
        dVar.d(colorIndex3, "bg2");
        dVar.g(2, colorIndex3);
        int colorIndex4 = getColorIndex(element.element("dk2"), dVar);
        dVar.d(colorIndex4, "dk2");
        dVar.d(colorIndex4, "tx2");
        dVar.g(3, colorIndex4);
        int colorIndex5 = getColorIndex(element.element("accent1"), dVar);
        dVar.d(colorIndex5, "accent1");
        dVar.g(4, colorIndex5);
        int colorIndex6 = getColorIndex(element.element("accent2"), dVar);
        dVar.d(colorIndex6, "accent2");
        dVar.g(5, colorIndex6);
        int colorIndex7 = getColorIndex(element.element("accent3"), dVar);
        dVar.d(colorIndex7, "accent3");
        dVar.g(6, colorIndex7);
        int colorIndex8 = getColorIndex(element.element("accent4"), dVar);
        dVar.d(colorIndex8, "accent4");
        dVar.g(7, colorIndex8);
        int colorIndex9 = getColorIndex(element.element("accent5"), dVar);
        dVar.d(colorIndex9, "accent5");
        dVar.g(8, colorIndex9);
        int colorIndex10 = getColorIndex(element.element("accent6"), dVar);
        dVar.d(colorIndex10, "accent6");
        dVar.g(9, colorIndex10);
        int colorIndex11 = getColorIndex(element.element("hlink"), dVar);
        dVar.d(colorIndex11, "hlink");
        dVar.g(10, colorIndex11);
        int colorIndex12 = getColorIndex(element.element("folHlink"), dVar);
        dVar.d(colorIndex12, "folHlink");
        dVar.g(11, colorIndex12);
    }
}

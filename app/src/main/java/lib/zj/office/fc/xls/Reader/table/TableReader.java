package lib.zj.office.fc.xls.Reader.table;

import aj.b;
import com.tom_roush.fontbox.ttf.NamingTable;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject;
import ei.c;
import java.io.InputStream;
import java.util.ArrayList;
import ji.a;
import lib.zj.office.fc.dom4j.Document;
import lib.zj.office.fc.dom4j.Element;
import lib.zj.office.fc.dom4j.io.SAXReader;
import lib.zj.office.fc.openxml4j.opc.PackagePart;
import lib.zj.office.system.f;

/* loaded from: classes3.dex */
public class TableReader {
    private static TableReader reader = new TableReader();

    public static TableReader instance() {
        return reader;
    }

    public void read(f fVar, PackagePart packagePart, c cVar) {
        SAXReader sAXReader = new SAXReader();
        try {
            try {
                InputStream inputStream = packagePart.getInputStream();
                Document read = sAXReader.read(inputStream);
                inputStream.close();
                a aVar = new a();
                Element rootElement = read.getRootElement();
                String[] split = rootElement.attributeValue("ref").split(":");
                if (split != null && split.length == 2) {
                    aVar.f19252a = new ci.a(b.x(split[0]), b.q(split[0]), b.x(split[1]), b.q(split[1]));
                }
                String attributeValue = rootElement.attributeValue("totalsRowDxfId");
                if (attributeValue != null) {
                    aVar.f19262l = Integer.parseInt(attributeValue);
                }
                String attributeValue2 = rootElement.attributeValue("totalsRowBorderDxfId");
                if (attributeValue2 != null) {
                    aVar.f19263m = Integer.parseInt(attributeValue2);
                }
                String attributeValue3 = rootElement.attributeValue("headerRowDxfId");
                if (attributeValue3 != null) {
                    aVar.f19260j = Integer.parseInt(attributeValue3);
                }
                String attributeValue4 = rootElement.attributeValue("headerRowBorderDxfId");
                if (attributeValue4 != null) {
                    aVar.f19261k = Integer.parseInt(attributeValue4);
                }
                String attributeValue5 = rootElement.attributeValue("tableBorderDxfId");
                if (attributeValue5 != null) {
                    aVar.f19259i = Integer.parseInt(attributeValue5);
                }
                if (PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES.equalsIgnoreCase(rootElement.attributeValue("headerRowCount"))) {
                    aVar.f19253b = false;
                }
                String attributeValue6 = rootElement.attributeValue("totalsRowCount");
                if (attributeValue6 == null) {
                    attributeValue6 = PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES;
                }
                if (!PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES.equalsIgnoreCase(rootElement.attributeValue("totalsRowShown")) && "1".equalsIgnoreCase(attributeValue6)) {
                    aVar.c = true;
                }
                Element element = rootElement.element("tableStyleInfo");
                if (element != null) {
                    aVar.f19254d = element.attributeValue(NamingTable.TAG);
                    if (!PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES.equalsIgnoreCase(element.attributeValue("showFirstColumn"))) {
                        aVar.f19255e = true;
                    }
                    if (!PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES.equalsIgnoreCase(element.attributeValue("showLastColumn"))) {
                        aVar.f19256f = true;
                    }
                    if (!PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES.equalsIgnoreCase(element.attributeValue("showRowStripes"))) {
                        aVar.f19257g = true;
                    }
                    if (!PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES.equalsIgnoreCase(element.attributeValue("showColumnStripes"))) {
                        aVar.f19258h = true;
                    }
                    if (cVar.f16623x == null) {
                        cVar.f16623x = new ArrayList();
                    }
                    cVar.f16623x.add(aVar);
                }
                sAXReader.resetHandlers();
            } catch (Exception e10) {
                throw e10;
            }
        } catch (Throwable th2) {
            sAXReader.resetHandlers();
            throw th2;
        }
    }
}

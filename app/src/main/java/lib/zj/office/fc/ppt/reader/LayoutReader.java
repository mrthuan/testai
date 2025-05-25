package lib.zj.office.fc.ppt.reader;

import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import java.io.InputStream;
import java.util.Iterator;
import lib.zj.office.fc.dom4j.Element;
import lib.zj.office.fc.dom4j.io.SAXReader;
import lib.zj.office.fc.openxml4j.opc.PackagePart;
import lib.zj.office.fc.openxml4j.opc.ZipPackage;
import lib.zj.office.fc.ppt.ShapeManage;
import lib.zj.office.system.f;
import th.a;
import th.b;
import th.c;
import th.d;
import th.e;

/* loaded from: classes3.dex */
public class LayoutReader {
    private static LayoutReader layoutReader = new LayoutReader();
    private int style = 1001;

    public static LayoutReader instance() {
        return layoutReader;
    }

    private void processBackgroundAndFill(f fVar, ZipPackage zipPackage, PackagePart packagePart, b bVar, a aVar, Element element) {
        Element element2 = element.element("bg");
        if (element2 != null) {
            aVar.f30014a = BackgroundReader.instance().getBackground(fVar, zipPackage, packagePart, bVar, element2);
        }
    }

    private void processTextStyle(f fVar, PackagePart packagePart, b bVar, a aVar, Element element) {
        boolean z10;
        Iterator elementIterator = element.elementIterator();
        while (elementIterator.hasNext()) {
            Element element2 = (Element) elementIterator.next();
            String placeholderType = ReaderKit.instance().getPlaceholderType(element2);
            int placeholderIdx = ReaderKit.instance().getPlaceholderIdx(element2);
            Element element3 = element2.element("txBody");
            if (element3 != null) {
                Element element4 = element3.element("lstStyle");
                StyleReader.instance().setStyleIndex(this.style);
                if (!InMobiNetworkValues.TITLE.equals(placeholderType) && !"ctrTitle".equals(placeholderType) && !"dt".equals(placeholderType) && !"ftr".equals(placeholderType) && !"sldNum".equals(placeholderType)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    aVar.f30015b.put(placeholderType, StyleReader.instance().getStyles(fVar, bVar, element2, element4));
                } else if (placeholderIdx > 0) {
                    aVar.c.put(Integer.valueOf(placeholderIdx), StyleReader.instance().getStyles(fVar, bVar, element2, element4));
                }
                this.style = StyleReader.instance().getStyleIndex();
            }
        }
    }

    public void dispose() {
        this.style = 1001;
    }

    public a getLayouts(f fVar, ZipPackage zipPackage, PackagePart packagePart, c cVar, b bVar, e eVar) {
        a aVar;
        a aVar2;
        Element element;
        String attributeValue;
        boolean z10;
        SAXReader sAXReader = new SAXReader();
        InputStream inputStream = packagePart.getInputStream();
        Element rootElement = sAXReader.read(inputStream).getRootElement();
        if (rootElement != null) {
            a aVar3 = new a();
            if (rootElement.attribute("showMasterSp") != null && (attributeValue = rootElement.attributeValue("showMasterSp")) != null && attributeValue.length() > 0) {
                try {
                    try {
                        if (Integer.parseInt(attributeValue) != 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        aVar3.f30019g = z10;
                    } catch (NumberFormatException unused) {
                        aVar3.f30019g = Boolean.parseBoolean(attributeValue);
                    }
                } catch (Exception unused2) {
                }
            }
            Element element2 = rootElement.element("cSld");
            if (element2 != null && (element = element2.element("spTree")) != null) {
                processBackgroundAndFill(fVar, zipPackage, packagePart, bVar, aVar3, element2);
                processTextStyle(fVar, packagePart, bVar, aVar3, element);
                d dVar = new d();
                dVar.c = 1;
                Iterator elementIterator = element.elementIterator();
                while (elementIterator.hasNext()) {
                    ShapeManage.instance().processShape(fVar, zipPackage, packagePart, null, bVar, aVar3, eVar, dVar, (byte) 1, (Element) elementIterator.next(), null, 1.0f, 1.0f);
                    aVar3 = aVar3;
                    elementIterator = elementIterator;
                    dVar = dVar;
                }
                d dVar2 = dVar;
                aVar2 = aVar3;
                if (dVar2.f() > 0) {
                    aVar2.f30018f = cVar.a(dVar2);
                }
            } else {
                aVar2 = aVar3;
            }
            aVar = aVar2;
        } else {
            aVar = null;
        }
        inputStream.close();
        return aVar;
    }
}

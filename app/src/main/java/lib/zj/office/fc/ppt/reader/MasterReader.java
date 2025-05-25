package lib.zj.office.fc.ppt.reader;

import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Map;
import lib.zj.office.fc.dom4j.Element;
import lib.zj.office.fc.dom4j.io.SAXReader;
import lib.zj.office.fc.openxml4j.opc.PackagePart;
import lib.zj.office.fc.openxml4j.opc.PackageRelationship;
import lib.zj.office.fc.openxml4j.opc.PackageRelationshipTypes;
import lib.zj.office.fc.openxml4j.opc.ZipPackage;
import lib.zj.office.fc.ppt.ShapeManage;
import lib.zj.office.system.f;
import th.b;
import th.c;
import th.d;

/* loaded from: classes3.dex */
public class MasterReader {
    private static MasterReader masterReader = new MasterReader();
    private int styleIndex = 10;

    public static MasterReader instance() {
        return masterReader;
    }

    private void processBackgroundAndFill(f fVar, b bVar, ZipPackage zipPackage, PackagePart packagePart, Element element) {
        Element element2 = element.element("bg");
        if (element2 != null) {
            bVar.f30020a = BackgroundReader.instance().getBackground(fVar, zipPackage, packagePart, bVar, element2);
        }
    }

    private void processClrMap(b bVar, ZipPackage zipPackage, PackagePart packagePart, Element element) {
        PackagePart part;
        PackageRelationship relationship = packagePart.getRelationshipsByType(PackageRelationshipTypes.THEME_PART).getRelationship(0);
        if (relationship != null && (part = zipPackage.getPart(relationship.getTargetURI())) != null) {
            Map<String, Integer> themeColorMap = ThemeReader.instance().getThemeColorMap(part);
            Element element2 = element.element("clrMap");
            if (element2 != null) {
                for (int i10 = 0; i10 < element2.attributeCount(); i10++) {
                    String name = element2.attribute(i10).getName();
                    String attributeValue = element2.attributeValue(name);
                    if (!name.equals(attributeValue)) {
                        bVar.f30021b.put(attributeValue, Integer.valueOf(themeColorMap.get(attributeValue).intValue()));
                    }
                    bVar.f30021b.put(name, Integer.valueOf(themeColorMap.get(attributeValue).intValue()));
                }
            }
        }
    }

    private void processStyle(f fVar, b bVar, Element element) {
        Element element2 = element.element("txStyles");
        if (element2 != null) {
            StyleReader.instance().setStyleIndex(this.styleIndex);
            bVar.f30024f = StyleReader.instance().getStyles(fVar, bVar, null, element2.element("titleStyle"));
            bVar.f30025g = StyleReader.instance().getStyles(fVar, bVar, null, element2.element("bodyStyle"));
            bVar.f30026h = StyleReader.instance().getStyles(fVar, bVar, null, element2.element("otherStyle"));
            this.styleIndex = StyleReader.instance().getStyleIndex();
        }
    }

    private void processTextStyle(f fVar, b bVar, Element element) {
        boolean z10;
        Iterator elementIterator = element.elementIterator();
        while (elementIterator.hasNext()) {
            Element element2 = (Element) elementIterator.next();
            String placeholderType = ReaderKit.instance().getPlaceholderType(element2);
            if ("ctrTitle".equals(placeholderType)) {
                placeholderType = InMobiNetworkValues.TITLE;
            }
            int placeholderIdx = ReaderKit.instance().getPlaceholderIdx(element2);
            Element element3 = element2.element("txBody");
            if (element3 != null) {
                Element element4 = element3.element("lstStyle");
                StyleReader.instance().setStyleIndex(this.styleIndex);
                if (!InMobiNetworkValues.TITLE.equals(placeholderType) && !"ctrTitle".equals(placeholderType) && !"dt".equals(placeholderType) && !"ftr".equals(placeholderType) && !"sldNum".equals(placeholderType)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    bVar.c.put(placeholderType, StyleReader.instance().getStyles(fVar, bVar, element2, element4));
                } else if (placeholderIdx >= -1) {
                    bVar.f30022d.put(Integer.valueOf(placeholderIdx), StyleReader.instance().getStyles(fVar, bVar, element2, element4));
                }
                this.styleIndex = StyleReader.instance().getStyleIndex();
            }
        }
    }

    public void dispose() {
        this.styleIndex = 10;
    }

    public b getMasterData(f fVar, ZipPackage zipPackage, PackagePart packagePart, c cVar) {
        InputStream inputStream;
        b bVar;
        b bVar2;
        SAXReader sAXReader = new SAXReader();
        InputStream inputStream2 = packagePart.getInputStream();
        Element rootElement = sAXReader.read(inputStream2).getRootElement();
        if (rootElement != null) {
            b bVar3 = new b();
            processClrMap(bVar3, zipPackage, packagePart, rootElement);
            processStyle(fVar, bVar3, rootElement);
            Element element = rootElement.element("cSld");
            if (element != null) {
                processBackgroundAndFill(fVar, bVar3, zipPackage, packagePart, element);
                Element element2 = element.element("spTree");
                if (element2 != null) {
                    processTextStyle(fVar, bVar3, element2);
                    d dVar = new d();
                    dVar.c = 0;
                    Iterator elementIterator = element2.elementIterator();
                    while (elementIterator.hasNext()) {
                        ShapeManage.instance().processShape(fVar, zipPackage, packagePart, null, bVar3, null, null, dVar, (byte) 0, (Element) elementIterator.next(), null, 1.0f, 1.0f);
                        bVar3 = bVar3;
                        inputStream2 = inputStream2;
                    }
                    bVar2 = bVar3;
                    inputStream = inputStream2;
                    if (dVar.f() > 0) {
                        bVar2.f30027i = cVar.a(dVar);
                    }
                    bVar = bVar2;
                }
            }
            bVar2 = bVar3;
            inputStream = inputStream2;
            bVar = bVar2;
        } else {
            inputStream = inputStream2;
            bVar = null;
        }
        inputStream.close();
        return bVar;
    }
}

package lib.zj.office.fc.ppt.reader;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import eh.a;
import eh.b;
import eh.d;
import eh.g;
import java.util.List;
import kh.c;
import lib.zj.office.fc.dom4j.Element;
import lib.zj.office.fc.openxml4j.opc.PackagePart;
import lib.zj.office.fc.openxml4j.opc.PackageRelationship;
import lib.zj.office.fc.openxml4j.opc.ZipPackage;
import lib.zj.office.system.f;

/* loaded from: classes3.dex */
public class BackgroundReader {
    private static BackgroundReader bgReader = new BackgroundReader();

    public static BackgroundReader instance() {
        return bgReader;
    }

    public b getBackground(f fVar, ZipPackage zipPackage, PackagePart packagePart, th.b bVar, Element element) {
        if (element != null) {
            Element element2 = element.element("bgPr");
            Element element3 = element.element("bgRef");
            if (element3 != null) {
                b bVar2 = new b();
                bVar2.c = (byte) 0;
                bVar2.f16571d = ReaderKit.instance().getColor(bVar, element3);
                return bVar2;
            }
            return processBackground(fVar, zipPackage, packagePart, bVar, element2);
        }
        return null;
    }

    public int getBackgroundColor(ZipPackage zipPackage, PackagePart packagePart, th.b bVar, Element element, boolean z10) {
        if (element != null) {
            Element element2 = element.element("solidFill");
            if (element2 != null) {
                return ReaderKit.instance().getColor(bVar, element2, z10);
            }
            Element element3 = element.element("gradFill");
            if (element3 != null) {
                Element element4 = element3.element("gsLst");
                if (element4 != null) {
                    return ReaderKit.instance().getColor(bVar, element4.element(OperatorName.SET_GRAPHICS_STATE_PARAMS));
                }
                return 0;
            }
            Element element5 = element.element("fillRef");
            if (element5 != null) {
                return ReaderKit.instance().getColor(bVar, element5);
            }
            Element element6 = element.element("pattFill");
            if (element6 != null) {
                return ReaderKit.instance().getColor(bVar, element6.element("bgClr"));
            }
            return 0;
        }
        return 0;
    }

    public b processBackground(f fVar, ZipPackage zipPackage, PackagePart packagePart, th.b bVar, Element element) {
        return processBackground(fVar, zipPackage, packagePart, bVar, element, false);
    }

    public b processBackground(f fVar, ZipPackage zipPackage, PackagePart packagePart, th.b bVar, Element element, boolean z10) {
        Element element2;
        String attributeValue;
        PackageRelationship relationship;
        PackagePart part;
        String attributeValue2;
        Element element3;
        a aVar = null;
        if (element != null) {
            b bVar2 = new b();
            Element element4 = element.element("solidFill");
            int i10 = 0;
            if (element4 != null) {
                bVar2.c = (byte) 0;
                bVar2.f16571d = ReaderKit.instance().getColor(bVar, element4, z10);
                return bVar2;
            }
            Element element5 = element.element("blipFill");
            if (element5 != null) {
                Element element6 = element5.element("blip");
                if (element6 != null && element6.attribute("embed") != null && (attributeValue = element6.attributeValue("embed")) != null && (relationship = packagePart.getRelationship(attributeValue)) != null && (part = zipPackage.getPart(relationship.getTargetURI())) != null) {
                    Element element7 = element5.element("tile");
                    if (element7 == null) {
                        bVar2.c = (byte) 3;
                        Element element8 = element5.element("stretch");
                        if (element8 != null && (element3 = element8.element("fillRect")) != null) {
                            c cVar = new c();
                            String attributeValue3 = element3.attributeValue(OperatorName.LINE_TO);
                            int i11 = 1;
                            if (attributeValue3 != null) {
                                cVar.f19759a = Float.parseFloat(attributeValue3) / 100000.0f;
                                i10 = 1;
                            }
                            String attributeValue4 = element3.attributeValue("r");
                            if (attributeValue4 != null) {
                                cVar.f19760b = Float.parseFloat(attributeValue4) / 100000.0f;
                                i10 = 1;
                            }
                            String attributeValue5 = element3.attributeValue("t");
                            if (attributeValue5 != null) {
                                cVar.c = Float.parseFloat(attributeValue5) / 100000.0f;
                                i10 = 1;
                            }
                            String attributeValue6 = element3.attributeValue("b");
                            if (attributeValue6 != null) {
                                cVar.f19761d = Float.parseFloat(attributeValue6) / 100000.0f;
                            } else {
                                i11 = i10;
                            }
                            if (i11 != 0) {
                                bVar2.f16570b = cVar;
                            }
                        }
                        bVar2.f16572e = fVar.o().g().d(part);
                    } else {
                        int d10 = fVar.o().g().d(part);
                        bVar2.c = (byte) 2;
                        g S = aj.b.S(fVar.o().g().j(d10), element7);
                        Element element9 = element6.element("alphaModFix");
                        if (element9 != null && (attributeValue2 = element9.attributeValue("amt")) != null) {
                            S.f16567a = Math.round((Integer.parseInt(attributeValue2) / 100000.0f) * 255.0f);
                        }
                        bVar2.c(S);
                    }
                    return bVar2;
                }
            } else {
                Element element10 = element.element("gradFill");
                if (element10 != null) {
                    if (element10.element("gsLst") != null) {
                        bVar2.c = aj.b.s(element10);
                        List elements = element10.element("gsLst").elements(OperatorName.SET_GRAPHICS_STATE_PARAMS);
                        if (elements != null && elements.size() != 0) {
                            int size = elements.size();
                            int[] iArr = new int[size];
                            float[] fArr = new float[size];
                            while (i10 < size) {
                                Element element11 = (Element) elements.get(i10);
                                fArr[i10] = Integer.parseInt(element11.attributeValue("pos")) / 100000.0f;
                                iArr[i10] = ReaderKit.instance().getColor(bVar, element11);
                                i10++;
                            }
                            if (element10.element("lin") != null) {
                                aVar = new d(Integer.parseInt(element2.attributeValue("ang")) / 60000, iArr, fArr);
                            } else {
                                Element element12 = element10.element("path");
                                if (element12 != null) {
                                    byte s4 = aj.b.s(element10);
                                    int w7 = aj.b.w(element12.element("fillToRect"));
                                    if (s4 == 4 || s4 == 5 || s4 == 6) {
                                        aVar = new eh.f(w7, iArr, fArr);
                                    }
                                }
                            }
                        }
                        bVar2.c(aVar);
                        return bVar2;
                    }
                } else {
                    Element element13 = element.element("fillRef");
                    if (element13 != null) {
                        bVar2.c = (byte) 0;
                        bVar2.f16571d = ReaderKit.instance().getColor(bVar, element13);
                        return bVar2;
                    }
                    Element element14 = element.element("pattFill");
                    if (element14 != null) {
                        Element element15 = element14.element("bgClr");
                        bVar2.c = (byte) 0;
                        bVar2.f16571d = ReaderKit.instance().getColor(bVar, element15);
                        return bVar2;
                    }
                }
            }
        }
        return null;
    }
}

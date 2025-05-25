package lib.zj.office.fc.ppt.reader;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import eh.b;
import java.util.List;
import lh.e;
import lh.g;
import lh.h;
import lh.n;
import lib.zj.office.fc.dom4j.Element;
import lib.zj.office.fc.openxml4j.opc.PackagePart;
import lib.zj.office.fc.openxml4j.opc.ZipPackage;
import lib.zj.office.fc.ppt.attribute.ParaAttr;
import lib.zj.office.fc.ppt.attribute.SectionAttr;
import lib.zj.office.java.awt.Rectangle;
import lib.zj.office.system.f;
import th.a;
import th.c;
import th.d;
import zh.l;

/* loaded from: classes3.dex */
public class SmartArtReader {
    private static SmartArtReader reader = new SmartArtReader();

    private b getBackgrouond(f fVar, ZipPackage zipPackage, PackagePart packagePart, c cVar, th.b bVar, a aVar, d dVar, Element element, int i10) {
        b bVar2;
        String attributeValue;
        if (element.attribute("useBgFill") != null && (attributeValue = element.attributeValue("useBgFill")) != null && attributeValue.length() > 0 && Integer.parseInt(attributeValue) > 0) {
            bVar2 = dVar.f30041h;
            if (bVar2 == null) {
                if (aVar != null) {
                    bVar2 = aVar.f30014a;
                }
                if (bVar2 == null && bVar != null) {
                    bVar2 = bVar.f30020a;
                }
            }
        } else {
            bVar2 = null;
        }
        Element element2 = element.element("spPr");
        String name = element.getName();
        if (bVar2 == null && element2.element("noFill") == null && !name.equals("cxnSp")) {
            b processBackground = BackgroundReader.instance().processBackground(fVar, zipPackage, packagePart, bVar, element2);
            if (processBackground == null && i10 != 19 && i10 != 185 && i10 != 85 && i10 != 86 && i10 != 186 && i10 != 87 && i10 != 88 && i10 != 233) {
                return BackgroundReader.instance().processBackground(fVar, zipPackage, packagePart, bVar, element.element("style"));
            }
            return processBackground;
        }
        return bVar2;
    }

    private g getTextBoxData(f fVar, th.b bVar, a aVar, Element element) {
        Rectangle rectangle;
        zh.f fVar2;
        boolean z10;
        Element element2 = element.element("txXfrm");
        zh.f fVar3 = null;
        if (element2 != null) {
            rectangle = ReaderKit.instance().getShapeAnchor(element2, 1.0f, 1.0f);
        } else {
            rectangle = null;
        }
        Element element3 = element.element("txBody");
        if (element3 == null) {
            return null;
        }
        n nVar = new n();
        nVar.f20604e = rectangle;
        l lVar = new l();
        lVar.f32371a = 0L;
        nVar.f20643n = lVar;
        zh.f fVar4 = lVar.c;
        zh.b.f32374b.getClass();
        zh.b.K(fVar4, (int) (rectangle.width * 15.0f));
        zh.b.E(fVar4, (int) (rectangle.height * 15.0f));
        if (aVar != null) {
            fVar2 = aVar.b(0, null);
        } else {
            fVar2 = null;
        }
        if (bVar != null) {
            fVar3 = bVar.b(0, null);
        }
        SectionAttr.instance().setSectionAttribute(element3.element("bodyPr"), fVar4, fVar2, fVar3, false);
        lVar.f32372b = ParaAttr.instance().processParagraph(fVar, bVar, aVar, null, lVar, element.element("style"), element3, "dgm", 0);
        l lVar2 = nVar.f20643n;
        if (lVar2 != null && lVar2.getText() != null && nVar.f20643n.getText().length() > 0 && !"\n".equals(nVar.f20643n.getText())) {
            ReaderKit.instance().processRotation(nVar, element.element("txXfrm"));
        }
        Element element4 = element3.element("bodyPr");
        if (element4 != null) {
            String attributeValue = element4.attributeValue("wrap");
            if (attributeValue != null && !"square".equalsIgnoreCase(attributeValue)) {
                z10 = false;
            } else {
                z10 = true;
            }
            nVar.f20642m = z10;
        }
        return nVar;
    }

    public static SmartArtReader instance() {
        return reader;
    }

    private g processAutoShape(f fVar, ZipPackage zipPackage, PackagePart packagePart, c cVar, th.b bVar, a aVar, d dVar, Element element) {
        int i10;
        int i11;
        Float[] fArr;
        int i12;
        byte b10;
        byte b11;
        b bVar2;
        Float[] fArr2;
        List elements;
        String attributeValue;
        Element element2 = element.element("spPr");
        if (element2 == null) {
            return null;
        }
        Rectangle shapeAnchor = ReaderKit.instance().getShapeAnchor(element2.element("xfrm"), 1.0f, 1.0f);
        String placeholderName = ReaderKit.instance().getPlaceholderName(element);
        boolean z10 = false;
        if (element.getName().equals("cxnSp")) {
            i10 = 20;
        } else if (!placeholderName.contains("Text Box") && !placeholderName.contains("TextBox")) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        Element element3 = element2.element("prstGeom");
        if (element3 != null) {
            if (element3.attribute("prst") != null && (attributeValue = element3.attributeValue("prst")) != null && attributeValue.length() > 0) {
                i10 = o9.d.n(attributeValue);
            }
            Element element4 = element3.element("avLst");
            if (element4 != null && (elements = element4.elements("gd")) != null && elements.size() > 0) {
                fArr2 = new Float[elements.size()];
                for (int i13 = 0; i13 < elements.size(); i13++) {
                    fArr2[i13] = Float.valueOf(Float.parseFloat(((Element) elements.get(i13)).attributeValue("fmla").substring(4)) / 100000.0f);
                }
            } else {
                fArr2 = null;
            }
            i11 = i10;
            fArr = fArr2;
        } else {
            if (element2.element("custGeom") != null) {
                i10 = 233;
            }
            i11 = i10;
            fArr = null;
        }
        Float[] fArr3 = fArr;
        int i14 = i11;
        b backgrouond = getBackgrouond(fVar, zipPackage, packagePart, cVar, bVar, aVar, dVar, element, i14);
        gh.b s4 = com.google.android.play.core.assetpacks.c.s(fVar, zipPackage, packagePart, bVar, element);
        Element element5 = element2.element("ln");
        Element element6 = element.element("style");
        if (element5 == null ? !(element6 == null || element6.element("lnRef") == null) : element5.element("noFill") == null) {
            i12 = i14;
            z10 = true;
        } else {
            i12 = i14;
        }
        if (i12 != 20 && i12 != 32 && i12 != 34 && i12 != 38) {
            if (i12 == 233) {
                lh.c cVar2 = new lh.c();
                if (s4 != null) {
                    bVar2 = s4.f17807b;
                } else {
                    bVar2 = null;
                }
                ge.a.L(cVar2, element, backgrouond, z10, bVar2, element5, shapeAnchor);
                cVar2.f20615m = i12;
                processGrpRotation(cVar2, element2);
                cVar2.f20610k = s4;
                return cVar2;
            } else if (backgrouond == null && s4 == null) {
                return null;
            } else {
                e eVar = new e(i12);
                eVar.f20604e = shapeAnchor;
                if (backgrouond != null) {
                    eVar.f20603d = backgrouond;
                }
                if (s4 != null) {
                    eVar.f20610k = s4;
                }
                eVar.f20616n = fArr3;
                processGrpRotation(eVar, element2);
                return eVar;
            }
        }
        h hVar = new h();
        hVar.f20615m = i12;
        hVar.f20604e = shapeAnchor;
        hVar.f20616n = fArr3;
        hVar.f20610k = s4;
        if (element5 != null) {
            Element element7 = element5.element("headEnd");
            if (element7 != null && element7.attribute("type") != null && (b11 = lh.d.b(element7.attributeValue("type"))) != 0) {
                hVar.r(b11, lh.d.a(element7.attributeValue(OperatorName.SET_LINE_WIDTH)), lh.d.a(element7.attributeValue("len")));
            }
            Element element8 = element5.element("tailEnd");
            if (element8 != null && element8.attribute("type") != null && (b10 = lh.d.b(element8.attributeValue("type"))) != 0) {
                hVar.r(b10, lh.d.a(element8.attributeValue(OperatorName.SET_LINE_WIDTH)), lh.d.a(element8.attributeValue("len")));
            }
        }
        processGrpRotation(hVar, element2);
        return hVar;
    }

    private void processGrpRotation(g gVar, Element element) {
        ReaderKit.instance().processRotation(element, gVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00d4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public lh.k read(lib.zj.office.system.f r17, lib.zj.office.fc.openxml4j.opc.ZipPackage r18, th.c r19, th.b r20, th.a r21, th.d r22, lib.zj.office.fc.openxml4j.opc.PackagePart r23, lib.zj.office.fc.openxml4j.opc.PackagePart r24) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lib.zj.office.fc.ppt.reader.SmartArtReader.read(lib.zj.office.system.f, lib.zj.office.fc.openxml4j.opc.ZipPackage, th.c, th.b, th.a, th.d, lib.zj.office.fc.openxml4j.opc.PackagePart, lib.zj.office.fc.openxml4j.opc.PackagePart):lh.k");
    }
}

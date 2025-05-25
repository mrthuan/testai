package lib.zj.office.fc.ppt;

import android.text.TextUtils;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import eh.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import lh.e;
import lh.g;
import lh.h;
import lh.i;
import lh.k;
import lib.zj.office.fc.dom4j.Element;
import lib.zj.office.fc.openxml4j.opc.PackagePart;
import lib.zj.office.fc.openxml4j.opc.PackageRelationship;
import lib.zj.office.fc.openxml4j.opc.PackageRelationshipTypes;
import lib.zj.office.fc.openxml4j.opc.ZipPackage;
import lib.zj.office.fc.ppt.attribute.RunAttr;
import lib.zj.office.fc.ppt.reader.BackgroundReader;
import lib.zj.office.fc.ppt.reader.HyperlinkReader;
import lib.zj.office.fc.ppt.reader.PictureReader;
import lib.zj.office.fc.ppt.reader.ReaderKit;
import lib.zj.office.fc.ppt.reader.TableReader;
import lib.zj.office.fc.xls.Reader.drawing.ChartReader;
import lib.zj.office.java.awt.Rectangle;
import lib.zj.office.system.f;
import th.a;
import th.c;
import th.d;

/* loaded from: classes3.dex */
public class ShapeManage {
    private static ShapeManage kit = new ShapeManage();

    private b getBackgrouond(f fVar, ZipPackage zipPackage, PackagePart packagePart, c cVar, th.b bVar, a aVar, d dVar, Element element, int i10, byte b10, String str, int i11) {
        b bVar2;
        int i12;
        int i13;
        String attributeValue;
        boolean z10 = true;
        if (element.attribute("useBgFill") != null && (attributeValue = element.attributeValue("useBgFill")) != null && attributeValue.length() > 0 && "1".equals(attributeValue)) {
            b bVar3 = dVar.f30041h;
            if (bVar3 == null) {
                if (aVar != null) {
                    bVar3 = aVar.f30014a;
                }
                if (bVar3 == null && bVar != null) {
                    bVar3 = bVar.f30020a;
                }
            }
            if (bVar3 != null) {
                bVar3.f16569a = true;
            }
            return bVar3;
        }
        Element element2 = element.element("spPr");
        String name = element.getName();
        if (element2.element("noFill") != null || name.equals("cxnSp") || ((bVar2 = BackgroundReader.instance().processBackground(fVar, zipPackage, packagePart, bVar, element2)) == null && i11 != 19 && i11 != 185 && i11 != 85 && i11 != 86 && i11 != 186 && i11 != 87 && i11 != 88 && i11 != 233 && (bVar2 = BackgroundReader.instance().processBackground(fVar, zipPackage, packagePart, bVar, element.element("style"))) != null && bVar2.c == 0 && (bVar2.f16571d & 16777215) == 0)) {
            bVar2 = null;
        }
        if (bVar2 == null && b10 == 2) {
            if (!InMobiNetworkValues.TITLE.equals(str) && !"ctrTitle".equals(str) && !"subTitle".equals(str) && !"body".equals(str)) {
                z10 = false;
            }
            if (z10 && aVar != null && (i13 = aVar.f30018f) >= 0 && i10 >= 0) {
                d e10 = cVar.e(i13);
                HashMap hashMap = aVar.f30017e;
                Integer num = hashMap != null ? (Integer) hashMap.get(Integer.valueOf(i10)) : null;
                if (num != null) {
                    g[] i14 = e10.i();
                    int i15 = 0;
                    while (true) {
                        if (i15 >= i14.length) {
                            break;
                        }
                        if (num.intValue() == i14[i15].e()) {
                            g gVar = i14[i15];
                            if (gVar instanceof e) {
                                bVar2 = ((e) gVar).f20603d;
                                break;
                            }
                        }
                        i15++;
                    }
                }
            }
        }
        if (bVar2 != null || b10 != 2 || bVar == null || (i12 = bVar.f30027i) < 0 || i10 < 0) {
            return bVar2;
        }
        g[] i16 = cVar.e(i12).i();
        HashMap hashMap2 = bVar.f30023e;
        if ((hashMap2 != null ? (Integer) hashMap2.get(Integer.valueOf(i10)) : null) != null) {
            HashMap hashMap3 = bVar.f30023e;
            Integer num2 = hashMap3 != null ? (Integer) hashMap3.get(Integer.valueOf(i10)) : null;
            if (num2 != null) {
                for (int i17 = 0; i17 < i16.length; i17++) {
                    if (num2.intValue() == i16[i17].e()) {
                        g gVar2 = i16[i17];
                        if (gVar2 instanceof e) {
                            return ((e) gVar2).f20603d;
                        }
                    }
                }
                return bVar2;
            }
            return bVar2;
        }
        return bVar2;
    }

    public static ShapeManage instance() {
        return kit;
    }

    private boolean isRect(String str, int i10) {
        if ((str != null && (str.contains("Title") || str.contains(InMobiNetworkValues.TITLE) || str.contains("ctrTitle") || str.contains("subTitle") || str.contains("body") || str.contains("body") || str.contains("half") || str.contains("dt") || str.contains("ftr") || str.contains("sldNum"))) || i10 > 0) {
            return true;
        }
        return false;
    }

    private void processGrpRotation(g gVar, g gVar2, Element element) {
        ReaderKit.instance().processRotation(element, gVar2);
    }

    private Rectangle processGrpSpRect(lh.f fVar, Rectangle rectangle) {
        if (fVar != null) {
            rectangle.f20688x += fVar.f20618m;
            rectangle.f20689y += fVar.f20619n;
        }
        return rectangle;
    }

    private void processSmartArt(d dVar, Element element, Rectangle rectangle) {
        k kVar;
        if (element != null) {
            try {
                String attributeValue = element.element("relIds").attributeValue("dm");
                int parseInt = Integer.parseInt(attributeValue.substring(3));
                HashMap hashMap = dVar.f30046m;
                if (hashMap != null) {
                    kVar = (k) hashMap.remove(attributeValue);
                } else {
                    kVar = null;
                }
                if (kVar != null) {
                    kVar.f20604e = rectangle;
                    for (g gVar : kVar.q()) {
                        gVar.l(parseInt);
                    }
                    dVar.c(kVar);
                }
            } catch (Exception unused) {
            }
        }
    }

    public i addPicture(f fVar, PackagePart packagePart, d dVar, int i10, Rectangle rectangle, Element element, lh.f fVar2, kh.b bVar) {
        if (packagePart != null) {
            i iVar = new i();
            iVar.f20623m = fVar.o().g().d(packagePart);
            iVar.f20604e = rectangle;
            processGrpRotation(fVar2, iVar, element);
            iVar.c = i10;
            iVar.f20625o = bVar;
            if (fVar2 == null) {
                dVar.c(iVar);
                return iVar;
            }
            fVar2.q(iVar);
            return iVar;
        }
        return null;
    }

    public lh.b processAutoShape(f fVar, ZipPackage zipPackage, PackagePart packagePart, c cVar, th.b bVar, a aVar, d dVar, Element element, int i10, int i11, Rectangle rectangle, boolean z10, lh.f fVar2, byte b10, String str, boolean z11) {
        int i12;
        Float[] fArr;
        int i13;
        byte b11;
        byte b12;
        Float[] fArr2;
        String attributeValue;
        Element element2 = element.element("spPr");
        if (element2 != null) {
            String placeholderName = ReaderKit.instance().getPlaceholderName(element);
            boolean z12 = true;
            if (element.getName().equals("cxnSp")) {
                i12 = 32;
            } else {
                i12 = (z10 || placeholderName.contains("Text Box") || placeholderName.contains("TextBox")) ? 1 : 0;
            }
            Element element3 = element2.element("prstGeom");
            if (element3 != null) {
                if (element3.attribute("prst") != null && (attributeValue = element3.attributeValue("prst")) != null && attributeValue.length() > 0) {
                    i12 = o9.d.n(attributeValue);
                }
                Element element4 = element3.element("avLst");
                if (element4 != null) {
                    List elements = element4.elements("gd");
                    if (elements.size() > 0) {
                        fArr2 = new Float[elements.size()];
                        for (int i14 = 0; i14 < elements.size(); i14++) {
                            fArr2[i14] = Float.valueOf(Float.parseFloat(((Element) elements.get(i14)).attributeValue("fmla").substring(4)) / 100000.0f);
                        }
                        i13 = i12;
                        fArr = fArr2;
                    }
                }
                fArr2 = null;
                i13 = i12;
                fArr = fArr2;
            } else {
                if (element2.element("custGeom") != null) {
                    i12 = 233;
                } else if (z10) {
                    fArr = null;
                    i13 = 1;
                }
                i13 = i12;
                fArr = null;
            }
            Float[] fArr3 = fArr;
            int i15 = i13;
            b backgrouond = getBackgrouond(fVar, zipPackage, packagePart, cVar, bVar, aVar, dVar, element, i11, b10, str, i15);
            gh.b s4 = com.google.android.play.core.assetpacks.c.s(fVar, zipPackage, packagePart, bVar, element);
            Element element5 = element2.element("ln");
            Element element6 = element.element("style");
            if (element5 == null ? element6 == null || element6.element("lnRef") == null : element5.element("noFill") != null) {
                z12 = false;
            }
            if (i15 == 20 || i15 == 32 || i15 == 33 || i15 == 34 || i15 == 37 || i15 == 38 || i15 == 39 || i15 == 40) {
                if (z12) {
                    h hVar = new h();
                    hVar.f20615m = i15;
                    hVar.f20604e = rectangle;
                    hVar.c = i10;
                    hVar.f20608i = z11;
                    hVar.f20616n = fArr3;
                    hVar.f20610k = s4;
                    if (element5 != null) {
                        Element element7 = element5.element("headEnd");
                        if (element7 != null && element7.attribute("type") != null && (b12 = lh.d.b(element7.attributeValue("type"))) != 0) {
                            hVar.r(b12, lh.d.a(element7.attributeValue(OperatorName.SET_LINE_WIDTH)), lh.d.a(element7.attributeValue("len")));
                        }
                        Element element8 = element5.element("tailEnd");
                        if (element8 != null && element8.attribute("type") != null && (b11 = lh.d.b(element8.attributeValue("type"))) != 0) {
                            hVar.q(b11, lh.d.a(element8.attributeValue(OperatorName.SET_LINE_WIDTH)), lh.d.a(element8.attributeValue("len")));
                        }
                    }
                    return hVar;
                }
                return null;
            } else if (i15 == 233) {
                lh.c cVar2 = new lh.c();
                ge.a.L(cVar2, element, backgrouond, z12, s4 != null ? s4.f17807b : null, element5, rectangle);
                cVar2.f20615m = i15;
                cVar2.c = i10;
                processGrpRotation(fVar2, cVar2, element2);
                cVar2.f20608i = z11;
                cVar2.f20610k = s4;
                return cVar2;
            } else if (backgrouond != null || s4 != null) {
                e eVar = new e(i15);
                eVar.f20604e = rectangle;
                eVar.c = i10;
                eVar.f20608i = z11;
                if (backgrouond != null) {
                    eVar.f20603d = backgrouond;
                }
                if (s4 != null) {
                    eVar.f20610k = s4;
                }
                eVar.f20616n = fArr3;
                return eVar;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0117, code lost:
        if (("dt".equals(r5) || "ftr".equals(r5) || "sldNum".equals(r5)) == false) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0194  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int processAutoShapeAndTextShape(lib.zj.office.system.f r33, lib.zj.office.fc.openxml4j.opc.ZipPackage r34, lib.zj.office.fc.openxml4j.opc.PackagePart r35, th.c r36, th.b r37, th.a r38, th.e r39, th.d r40, byte r41, lib.zj.office.fc.dom4j.Element r42, lh.f r43, float r44, float r45, boolean r46) {
        /*
            Method dump skipped, instructions count: 690
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lib.zj.office.fc.ppt.ShapeManage.processAutoShapeAndTextShape(lib.zj.office.system.f, lib.zj.office.fc.openxml4j.opc.ZipPackage, lib.zj.office.fc.openxml4j.opc.PackagePart, th.c, th.b, th.a, th.e, th.d, byte, lib.zj.office.fc.dom4j.Element, lh.f, float, float, boolean):int");
    }

    public int processGraphicFrame(f fVar, ZipPackage zipPackage, PackagePart packagePart, c cVar, th.b bVar, a aVar, d dVar, Element element, lh.f fVar2, float f10, float f11) {
        Element element2;
        lh.b table;
        PackageRelationship relationship;
        Element element3;
        Element element4;
        Element element5;
        Element element6;
        Element element7 = element.element("nvGraphicFramePr");
        int parseInt = (element7 == null || (element6 = element7.element("cNvPr")) == null) ? 0 : Integer.parseInt(element6.attributeValue(FacebookMediationAdapter.KEY_ID));
        Rectangle shapeAnchor = ReaderKit.instance().getShapeAnchor(element.element("xfrm"), f10, f11);
        if (shapeAnchor == null && aVar != null) {
            String placeholderType = ReaderKit.instance().getPlaceholderType(element);
            int placeholderIdx = ReaderKit.instance().getPlaceholderIdx(element);
            Rectangle a10 = aVar.a(placeholderIdx, placeholderType);
            shapeAnchor = (a10 != null || bVar == null) ? a10 : bVar.a(placeholderIdx, placeholderType);
        }
        if (shapeAnchor != null) {
            Rectangle processGrpSpRect = processGrpSpRect(fVar2, shapeAnchor);
            Element element8 = element.element("graphic");
            if (element8 != null && (element2 = element8.element("graphicData")) != null && element2.attribute("uri") != null) {
                String attributeValue = element2.attributeValue("uri");
                if (attributeValue.equals(PackageRelationshipTypes.OLE_TYPE)) {
                    Element element9 = element2.element("oleObj");
                    if (element9 == null) {
                        Element element10 = element2.element("AlternateContent");
                        if (element10 != null && (element3 = element10.element("Fallback")) != null && (element4 = element3.element("oleObj")) != null && (element5 = element4.element("pic")) != null) {
                            processPicture(fVar, zipPackage, packagePart, bVar, aVar, dVar, element5, fVar2, f10, f11);
                        }
                    } else if (element9.attribute("spid") != null) {
                        addPicture(fVar, PictureReader.instance().getOLEPart(zipPackage, packagePart, element9.attributeValue("spid"), Boolean.FALSE), dVar, parseInt, processGrpSpRect, element.element("spPr"), fVar2, null);
                    }
                } else if (attributeValue.equals(PackageRelationshipTypes.CHART_TYPE)) {
                    Element element11 = element2.element("chart");
                    if (element11 != null && element11.attribute(FacebookMediationAdapter.KEY_ID) != null && (relationship = packagePart.getRelationship(element11.attributeValue(FacebookMediationAdapter.KEY_ID))) != null) {
                        ui.a read = ChartReader.instance().read(fVar, zipPackage, zipPackage.getPart(relationship.getTargetURI()), bVar.f30021b, (byte) 2);
                        if (read != null) {
                            lh.a aVar2 = new lh.a();
                            aVar2.f20600m = read;
                            aVar2.f20604e = processGrpSpRect;
                            aVar2.c = parseInt;
                            dVar.c(aVar2);
                        }
                    }
                } else if (attributeValue.equals(PackageRelationshipTypes.TABLE_TYPE)) {
                    Element element12 = element2.element("tbl");
                    if (element12 != null && element12.element("tblPr") != null && (table = TableReader.instance().getTable(fVar, zipPackage, packagePart, cVar, bVar, element12, processGrpSpRect)) != null) {
                        table.f20604e = processGrpSpRect;
                        table.c = parseInt;
                        dVar.c(table);
                    }
                } else if (attributeValue.equals(PackageRelationshipTypes.DIAGRAM_TYPE)) {
                    processSmartArt(dVar, element2, processGrpSpRect);
                }
            }
        }
        return parseInt;
    }

    public int processPicture(f fVar, ZipPackage zipPackage, PackagePart packagePart, th.b bVar, a aVar, d dVar, Element element, lh.f fVar2, float f10, float f11) {
        Element element2;
        String attributeValue;
        Element element3;
        int linkIndex;
        ih.a b10;
        Element element4;
        Element element5;
        Element element6;
        Element element7 = element.element("nvPicPr");
        int i10 = 0;
        String str = "";
        if (element7 != null && (element6 = element7.element("cNvPr")) != null) {
            Element element8 = element6.element("hlinkClick");
            try {
                i10 = Integer.parseInt(element6.attributeValue(FacebookMediationAdapter.KEY_ID));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            if (element8 != null) {
                str = element8.attributeValue(FacebookMediationAdapter.KEY_ID);
            }
        }
        int i11 = i10;
        String str2 = str;
        Element element9 = element.element("blipFill");
        if (element9 == null && (element4 = element.element("AlternateContent")) != null && (element5 = element4.element("Fallback")) != null) {
            element9 = element5.element("blipFill");
        }
        Element element10 = element9;
        if (element10 != null && (element2 = element10.element("blip")) != null && element2.element("duotone") == null && element2.attribute("embed") != null && (attributeValue = element2.attributeValue("embed")) != null && (element3 = element.element("spPr")) != null) {
            Rectangle shapeAnchor = ReaderKit.instance().getShapeAnchor(element3.element("xfrm"), f10, f11);
            if (shapeAnchor == null && aVar != null) {
                String placeholderType = ReaderKit.instance().getPlaceholderType(element);
                int placeholderIdx = ReaderKit.instance().getPlaceholderIdx(element);
                Rectangle a10 = aVar.a(placeholderIdx, placeholderType);
                shapeAnchor = (a10 != null || bVar == null) ? a10 : bVar.a(placeholderIdx, placeholderType);
            }
            if (shapeAnchor != null) {
                Rectangle processGrpSpRect = processGrpSpRect(fVar2, shapeAnchor);
                PackageRelationship relationship = packagePart.getRelationship(attributeValue);
                if (relationship != null) {
                    b processBackground = BackgroundReader.instance().processBackground(fVar, zipPackage, packagePart, bVar, element3);
                    gh.b s4 = com.google.android.play.core.assetpacks.c.s(fVar, zipPackage, packagePart, bVar, element);
                    i addPicture = addPicture(fVar, zipPackage.getPart(relationship.getTargetURI()), dVar, i11, processGrpSpRect, element.element("spPr"), fVar2, b.b.A(element10));
                    if (addPicture != null) {
                        if (!TextUtils.isEmpty(str2) && (linkIndex = HyperlinkReader.instance().getLinkIndex(str2)) >= 0 && (b10 = fVar.o().d().b(linkIndex)) != null) {
                            addPicture.f20624n = b10;
                        }
                        addPicture.f20603d = processBackground;
                        addPicture.f20610k = s4;
                    }
                }
                return i11;
            }
        }
        return i11;
    }

    public Integer processShape(f fVar, ZipPackage zipPackage, PackagePart packagePart, c cVar, th.b bVar, a aVar, th.e eVar, d dVar, byte b10, Element element, lh.f fVar2, float f10, float f11) {
        Element element2;
        lh.f fVar3;
        d dVar2;
        Element element3;
        lh.f fVar4 = fVar2;
        float f12 = f10;
        float f13 = f11;
        float[] fArr = null;
        if (ReaderKit.instance().isHidden(element)) {
            return null;
        }
        boolean contains = packagePart.getPartName().getName().contains("/ppt/slides/");
        char c = 0;
        boolean z10 = contains || (!contains && ReaderKit.instance().isUserDrawn(element));
        RunAttr.instance().setSlide(z10);
        String name = element.getName();
        if (!name.equals("sp") && !name.equals("cxnSp")) {
            if (name.equals("pic")) {
                if (z10) {
                    return Integer.valueOf(processPicture(fVar, zipPackage, packagePart, bVar, aVar, dVar, element, fVar2, f10, f11));
                }
            } else if (name.equals("graphicFrame")) {
                if (z10) {
                    return Integer.valueOf(processGraphicFrame(fVar, zipPackage, packagePart, cVar, bVar, aVar, dVar, element, fVar2, f10, f11));
                }
            } else if (name.equals("grpSp")) {
                Element element4 = element.element("nvGrpSpPr");
                int parseInt = (element4 == null || (element3 = element4.element("cNvPr")) == null) ? 0 : Integer.parseInt(element3.attributeValue(FacebookMediationAdapter.KEY_ID));
                Element element5 = element.element("grpSpPr");
                if (element5 != null) {
                    Rectangle processGrpSpRect = processGrpSpRect(fVar4, ReaderKit.instance().getShapeAnchor(element5.element("xfrm"), f12, f13));
                    fArr = ReaderKit.instance().getAnchorFitZoom(element5.element("xfrm"));
                    Rectangle childShapeAnchor = ReaderKit.instance().getChildShapeAnchor(element5.element("xfrm"), fArr[0] * f12, fArr[1] * f13);
                    lh.f fVar5 = new lh.f();
                    fVar5.f20618m = processGrpSpRect.f20688x - childShapeAnchor.f20688x;
                    fVar5.f20619n = processGrpSpRect.f20689y - childShapeAnchor.f20689y;
                    fVar5.c = parseInt;
                    fVar5.f20604e = processGrpSpRect;
                    fVar5.f20601a = fVar4;
                    processGrpRotation(fVar4, fVar5, element5);
                    fVar3 = fVar5;
                } else {
                    fVar3 = null;
                }
                ArrayList arrayList = new ArrayList();
                Iterator elementIterator = element.elementIterator();
                while (elementIterator.hasNext()) {
                    ArrayList arrayList2 = arrayList;
                    lh.f fVar6 = fVar3;
                    int i10 = parseInt;
                    lh.f fVar7 = fVar4;
                    Integer processShape = processShape(fVar, zipPackage, packagePart, cVar, bVar, aVar, eVar, dVar, b10, (Element) elementIterator.next(), fVar6, fArr[c] * f12, fArr[1] * f13);
                    if (processShape != null) {
                        arrayList2.add(processShape);
                    }
                    fVar3 = fVar6;
                    f12 = f10;
                    f13 = f11;
                    fVar4 = fVar7;
                    arrayList = arrayList2;
                    parseInt = i10;
                    c = 0;
                }
                ArrayList arrayList3 = arrayList;
                lh.f fVar8 = fVar3;
                int i11 = parseInt;
                lh.f fVar9 = fVar4;
                if (fVar9 == null) {
                    dVar2 = dVar;
                    dVar2.c(fVar8);
                } else {
                    dVar2 = dVar;
                    fVar9.q(fVar8);
                }
                dVar2.a(i11, arrayList3);
                return Integer.valueOf(i11);
            } else if (name.equals("AlternateContent") && (element2 = element.element("Fallback")) != null) {
                Iterator elementIterator2 = element2.elementIterator();
                while (elementIterator2.hasNext()) {
                    processShape(fVar, zipPackage, packagePart, cVar, bVar, aVar, eVar, dVar, b10, (Element) elementIterator2.next(), fVar2, f10, f11);
                }
            }
            RunAttr.instance().setSlide(false);
            return null;
        }
        return Integer.valueOf(processAutoShapeAndTextShape(fVar, zipPackage, packagePart, cVar, bVar, aVar, eVar, dVar, b10, element, fVar2, f10, f11, z10));
    }
}

package lib.zj.office.fc.xls.Reader.drawing;

import android.text.TextUtils;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import ei.c;
import fi.b;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import lh.i;
import lh.k;
import lh.n;
import lib.zj.office.fc.dom4j.Document;
import lib.zj.office.fc.dom4j.Element;
import lib.zj.office.fc.dom4j.io.SAXReader;
import lib.zj.office.fc.openxml4j.opc.PackagePart;
import lib.zj.office.fc.openxml4j.opc.PackageRelationship;
import lib.zj.office.fc.openxml4j.opc.PackageRelationshipCollection;
import lib.zj.office.fc.openxml4j.opc.PackageRelationshipTypes;
import lib.zj.office.fc.openxml4j.opc.ZipPackage;
import lib.zj.office.fc.ppt.attribute.ParaAttr;
import lib.zj.office.fc.ppt.attribute.RunAttr;
import lib.zj.office.fc.ppt.attribute.SectionAttr;
import lib.zj.office.fc.ppt.reader.PictureReader;
import lib.zj.office.fc.ppt.reader.ReaderKit;
import lib.zj.office.fc.xls.Reader.SchemeColorUtil;
import lib.zj.office.java.awt.Rectangle;
import lib.zj.office.system.f;
import pdf.pdfreader.viewer.editor.free.utils.t0;
import ui.a;
import zh.j;
import zh.l;

/* loaded from: classes3.dex */
public class DrawingReader {
    private static DrawingReader reader = new DrawingReader();
    private Map<String, a> chartList;
    private Map<String, Integer> drawingList;
    private Map<String, String> drawingListLink;
    private int offset;
    private c sheet;
    private Map<String, k> smartArtList;

    private void dispose() {
        Map<String, Integer> map = this.drawingList;
        if (map != null) {
            map.clear();
        }
        Map<String, String> map2 = this.drawingListLink;
        if (map2 != null) {
            map2.clear();
        }
        Map<String, a> map3 = this.chartList;
        if (map3 != null) {
            map3.clear();
        }
        Map<String, k> map4 = this.smartArtList;
        if (map4 != null) {
            map4.clear();
        }
    }

    private fi.a getCellAnchor(Element element) {
        if (element == null) {
            return null;
        }
        fi.a aVar = new fi.a();
        aVar.f17289b = (short) Integer.parseInt(element.element("col").getText());
        aVar.c = (int) ((((float) Long.parseLong(element.element("colOff").getText())) * 96.0f) / 914400.0f);
        aVar.f17288a = Integer.parseInt(element.element("row").getText());
        aVar.f17290d = (int) ((((float) Long.parseLong(element.element("rowOff").getText())) * 96.0f) / 914400.0f);
        return aVar;
    }

    private void getCellAnchors(f fVar, ZipPackage zipPackage, PackagePart packagePart, Element element) {
        if (element != null && element.hasContent()) {
            Iterator elementIterator = element.elementIterator();
            b bVar = null;
            while (elementIterator.hasNext() && !Thread.currentThread().isInterrupted()) {
                Element element2 = (Element) elementIterator.next();
                if (element2.getName().equalsIgnoreCase("twoCellAnchor")) {
                    bVar = getTwoCellAnchor(element2);
                } else if (element2.getName().equalsIgnoreCase("oneCellAnchor")) {
                    bVar = getOneCellAnchor(element2);
                }
                b bVar2 = bVar;
                Iterator elementIterator2 = element2.elementIterator();
                while (elementIterator2.hasNext()) {
                    if (Thread.currentThread().isInterrupted()) {
                        return;
                    }
                    Element element3 = (Element) elementIterator2.next();
                    mi.a aVar = mi.a.f22038b;
                    c cVar = this.sheet;
                    aVar.getClass();
                    processShape(fVar, zipPackage, packagePart, element3, null, 1.0f, 1.0f, mi.a.d(cVar, bVar2));
                }
                bVar = bVar2;
            }
        }
    }

    private lh.a getChart(Element element, Rectangle rectangle) {
        String attributeValue;
        if (element != null && (attributeValue = element.attributeValue(FacebookMediationAdapter.KEY_ID)) != null) {
            lh.a aVar = new lh.a();
            aVar.f20604e = rectangle;
            aVar.f20600m = this.chartList.get(attributeValue);
            return aVar;
        }
        return null;
    }

    private static yh.a getFont(Element element) {
        yh.a aVar = new yh.a();
        if (element.attributeValue("sz") != null) {
            aVar.f32142b = Integer.parseInt(element.attributeValue("sz")) / 100;
        }
        if (element.attributeValue("b") != null && Integer.parseInt(element.attributeValue("b")) != 0) {
            aVar.f32143d = true;
        }
        if (element.attributeValue(OperatorName.SET_FLATNESS) != null && Integer.parseInt(element.attributeValue(OperatorName.SET_FLATNESS)) != 0) {
            aVar.c = true;
        }
        if (element.attributeValue("u") != null) {
            if (element.attributeValue("u").equalsIgnoreCase("sng")) {
                aVar.f32146g = 1;
            } else if (element.attributeValue("u").equalsIgnoreCase("dbl")) {
                aVar.f32146g = 2;
            }
        }
        if (element.attributeValue("strike") != null && !element.attributeValue("strike").equalsIgnoreCase("noStrike")) {
            aVar.f32147h = true;
        }
        element.element("solidFill");
        aVar.f32144e = 8;
        return aVar;
    }

    public static short getHorizontalByString(String str) {
        if (str != null && !str.equalsIgnoreCase(OperatorName.LINE_TO)) {
            if (str.equalsIgnoreCase("ctr")) {
                return (short) 2;
            }
            if (str.equalsIgnoreCase("r")) {
                return (short) 3;
            }
            if (str.equalsIgnoreCase("just")) {
                return (short) 5;
            }
            return (short) 0;
        }
        return (short) 1;
    }

    private i getImageData(Element element, Rectangle rectangle) {
        Element element2 = element.element("blipFill");
        if (element2 == null) {
            return null;
        }
        kh.b A = b.b.A(element2);
        Element element3 = element2.element("blip");
        if (element3 == null || element3.attributeValue("embed") == null || element3.attributeValue("embed") == null || this.drawingList.get(element3.attributeValue("embed")) == null) {
            return null;
        }
        i iVar = new i();
        int intValue = this.drawingList.get(element3.attributeValue("embed")).intValue();
        iVar.f20604e = rectangle;
        iVar.f20623m = intValue;
        iVar.f20625o = A;
        ReaderKit.instance().processRotation(element.element("spPr"), iVar);
        return iVar;
    }

    private b getOneCellAnchor(Element element) {
        fi.a cellAnchor = getCellAnchor(element.element("from"));
        b bVar = new b((short) 0);
        bVar.f17292b = cellAnchor;
        Element element2 = element.element("ext");
        bVar.f17293d = (int) ((((float) Long.parseLong(element2.attributeValue("cx"))) * 96.0f) / 914400.0f);
        bVar.f17294e = (int) ((((float) Long.parseLong(element2.attributeValue("cy"))) * 96.0f) / 914400.0f);
        return bVar;
    }

    private k getSmartArt(Element element, Rectangle rectangle) {
        if (element != null) {
            try {
                String attributeValue = element.element("relIds").attributeValue("dm");
                Integer.parseInt(attributeValue.substring(3));
                k kVar = this.smartArtList.get(attributeValue);
                kVar.f20604e = rectangle;
                return kVar;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    private n getTextBoxData(f fVar, Element element, Rectangle rectangle) {
        boolean z10;
        n nVar = new n();
        l lVar = new l();
        lVar.f32371a = 0L;
        nVar.f20643n = lVar;
        zh.f fVar2 = lVar.c;
        zh.b bVar = zh.b.f32374b;
        int round = Math.round(rectangle.width * 15.0f);
        bVar.getClass();
        zh.b.K(fVar2, round);
        zh.b.E(fVar2, Math.round(rectangle.height * 15.0f));
        Element element2 = element.element("txBody");
        if (element2 != null) {
            zh.c cVar = new zh.c();
            zh.b.G(cVar, Math.round(144.0f));
            zh.b.H(cVar, Math.round(144.0f));
            zh.b.I(cVar, Math.round(72.0f));
            zh.b.F(cVar, Math.round(72.0f));
            Element element3 = element2.element("bodyPr");
            SectionAttr.instance().setSectionAttribute(element3, fVar2, cVar, null, false);
            if (element3 != null) {
                String attributeValue = element3.attributeValue("wrap");
                if (attributeValue != null && !"square".equalsIgnoreCase(attributeValue)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                nVar.f20642m = z10;
            }
            lVar.f32372b = processParagraph(fVar, lVar, element2);
        }
        nVar.f20604e = rectangle;
        l lVar2 = nVar.f20643n;
        if (lVar2 != null && lVar2.getText() != null && nVar.f20643n.getText().length() > 0 && !"\n".equals(nVar.f20643n.getText())) {
            ReaderKit.instance().processRotation(element.element("spPr"), nVar);
            return nVar;
        }
        return null;
    }

    public static fi.c getTextParagraph(Element element) {
        Element element2;
        fi.c cVar = new fi.c();
        Element element3 = element.element("pPr");
        if (element3 != null) {
            cVar.c.f18493a = getHorizontalByString(element3.attributeValue("algn"));
        }
        yh.a aVar = null;
        String str = "";
        for (Element element4 : element.elements("r")) {
            if (aVar == null && (element2 = element4.element("rPr")) != null) {
                aVar = getFont(element2);
            }
            if (element4.element("t") != null) {
                StringBuilder k10 = a0.a.k(str);
                k10.append(element4.element("t").getText());
                str = k10.toString();
            }
        }
        cVar.f17296b = aVar;
        cVar.f17295a = str;
        return cVar;
    }

    private b getTwoCellAnchor(Element element) {
        b bVar = new b((short) 1);
        bVar.f17292b = getCellAnchor(element.element("from"));
        bVar.c = getCellAnchor(element.element("to"));
        return bVar;
    }

    public static short getVerticalByString(String str) {
        if (str != null && !str.equalsIgnoreCase("ctr")) {
            if (str.equalsIgnoreCase("t")) {
                return (short) 0;
            }
            if (str.equalsIgnoreCase("b")) {
                return (short) 2;
            }
            if (str.equalsIgnoreCase("just") || str.equalsIgnoreCase("dist")) {
                return (short) 3;
            }
        }
        return (short) 1;
    }

    public static DrawingReader instance() {
        return reader;
    }

    private Rectangle processGrpSpRect(lh.f fVar, Rectangle rectangle) {
        if (fVar != null) {
            rectangle.f20688x += fVar.f20618m;
            rectangle.f20689y += fVar.f20619n;
        }
        return rectangle;
    }

    private int processParagraph(f fVar, l lVar, Element element) {
        this.offset = 0;
        for (Element element2 : element.elements("p")) {
            Element element3 = element2.element("pPr");
            j jVar = new j();
            jVar.f32371a = this.offset;
            ParaAttr.instance().setParaAttribute(fVar, element3, jVar.c, null, -1, -1, 0, false, false);
            j processRun = processRun(fVar, lVar, jVar, element2, null);
            processRun.f32372b = this.offset;
            lVar.e(processRun);
        }
        return this.offset;
    }

    private j processRun(f fVar, l lVar, j jVar, Element element, zh.f fVar2) {
        String text;
        int length;
        Element element2;
        j jVar2 = jVar;
        List<Element> elements = element.elements("r");
        if (elements.size() == 0) {
            zh.i iVar = new zh.i("\n");
            Element element3 = element.element("pPr");
            if (element3 != null && (element2 = element3.element("rPr")) != null) {
                RunAttr.instance().setRunAttribute(this.sheet, element2, iVar.c, fVar2);
            }
            int i10 = this.offset;
            iVar.f32371a = i10;
            int i11 = i10 + 1;
            this.offset = i11;
            iVar.f32372b = i11;
            jVar2.e(iVar);
            return jVar2;
        }
        zh.f fVar3 = fVar2;
        zh.i iVar2 = null;
        for (Element element4 : elements) {
            if (element4.getName().equalsIgnoreCase("r")) {
                Element element5 = element4.element("t");
                if (element5 != null && (length = (text = element5.getText()).length()) >= 0) {
                    iVar2 = new zh.i(text);
                    RunAttr.instance().setRunAttribute(this.sheet, element4.element("rPr"), iVar2.c, fVar3);
                    int i12 = this.offset;
                    iVar2.f32371a = i12;
                    int i13 = i12 + length;
                    this.offset = i13;
                    iVar2.f32372b = i13;
                    jVar2.e(iVar2);
                }
            } else if (element4.getName().equalsIgnoreCase("br")) {
                if (iVar2 != null) {
                    iVar2.e(iVar2.getText() + "\n");
                    this.offset = this.offset + 1;
                }
                jVar2.f32372b = this.offset;
                lVar.e(jVar2);
                jVar2 = new j();
                jVar2.f32371a = this.offset;
                fVar3 = null;
                ParaAttr.instance().setParaAttribute(fVar, element.element("pPr"), jVar2.c, null, -1, -1, 0, false, false);
            }
        }
        if (iVar2 != null) {
            iVar2.e(iVar2.getText() + "\n");
            this.offset = this.offset + 1;
        }
        return jVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [ei.c] */
    /* JADX WARN: Type inference failed for: r0v26, types: [lib.zj.office.fc.ppt.reader.ReaderKit] */
    /* JADX WARN: Type inference failed for: r0v27, types: [ei.c] */
    /* JADX WARN: Type inference failed for: r0v32, types: [ei.c] */
    /* JADX WARN: Type inference failed for: r24v0, types: [lh.b, lh.f] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v2, types: [lh.e, lh.b, lh.g] */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v3, types: [lh.b] */
    /* JADX WARN: Type inference failed for: r4v5, types: [lh.b, lh.g] */
    /* JADX WARN: Type inference failed for: r4v7, types: [lh.b, lh.i, lh.g] */
    private void processShape(f fVar, ZipPackage zipPackage, PackagePart packagePart, Element element, lh.f fVar2, float f10, float f11, Rectangle rectangle) {
        Rectangle rectangle2;
        Element element2;
        Element element3;
        Element element4;
        Element element5;
        lh.f fVar3;
        float[] fArr;
        Rectangle rectangle3;
        String name = element.getName();
        int i10 = 1;
        ?? r4 = 0;
        Rectangle rectangle4 = null;
        r4 = 0;
        r4 = 0;
        r4 = 0;
        r4 = 0;
        if (name.equals("grpSp")) {
            Element element6 = element.element("grpSpPr");
            if (element6 != null) {
                Rectangle shapeAnchor = ReaderKit.instance().getShapeAnchor(element6.element("xfrm"), f10, f11);
                if (shapeAnchor.width != 0 && shapeAnchor.height != 0) {
                    rectangle4 = processGrpSpRect(fVar2, shapeAnchor);
                    float[] anchorFitZoom = ReaderKit.instance().getAnchorFitZoom(element6.element("xfrm"));
                    Rectangle childShapeAnchor = ReaderKit.instance().getChildShapeAnchor(element6.element("xfrm"), anchorFitZoom[0] * f10, anchorFitZoom[1] * f11);
                    lh.f fVar4 = new lh.f();
                    fVar4.f20604e = rectangle4;
                    fVar4.f20618m = rectangle4.f20688x - childShapeAnchor.f20688x;
                    fVar4.f20619n = rectangle4.f20689y - childShapeAnchor.f20689y;
                    ReaderKit.instance().processRotation(element6, fVar4);
                    fArr = anchorFitZoom;
                    fVar3 = fVar4;
                } else {
                    return;
                }
            } else {
                fVar3 = null;
                fArr = null;
            }
            if (fVar2 == 0) {
                rectangle3 = rectangle;
            } else {
                Rectangle rectangle5 = new Rectangle();
                Rectangle rectangle6 = fVar2.f20604e;
                int i11 = rectangle.f20688x;
                int i12 = rectangle4.f20688x - rectangle6.f20688x;
                int i13 = rectangle.width;
                int i14 = rectangle6.width;
                rectangle5.f20688x = ((i12 * i13) / i14) + i11;
                int i15 = rectangle.f20689y;
                int i16 = rectangle.height;
                int i17 = rectangle6.height;
                rectangle5.f20689y = (((rectangle4.f20689y - rectangle6.f20689y) * i16) / i17) + i15;
                rectangle5.width = (i13 * rectangle4.width) / i14;
                rectangle5.height = (i16 * rectangle4.height) / i17;
                rectangle3 = rectangle5;
            }
            for (Iterator elementIterator = element.elementIterator(); elementIterator.hasNext(); elementIterator = elementIterator) {
                processShape(fVar, zipPackage, packagePart, (Element) elementIterator.next(), fVar3, fArr[0] * f10, fArr[1] * f11, rectangle3);
                fVar3 = fVar3;
            }
            lh.f fVar5 = fVar3;
            fVar5.f20604e = rectangle3;
            if (fVar2 == 0) {
                this.sheet.b(fVar5);
            } else {
                fVar2.q(fVar5);
            }
        } else if (name.equals("AlternateContent")) {
            Element element7 = element.element("Choice");
            if (element7 != null) {
                Iterator elementIterator2 = element7.elementIterator();
                while (elementIterator2.hasNext()) {
                    processShape(fVar, zipPackage, packagePart, (Element) elementIterator2.next(), fVar2, f10, f11, null);
                }
            }
        } else {
            if (fVar2 == 0) {
                rectangle2 = rectangle;
            } else {
                Element element8 = element.element("spPr");
                if (element8 == null) {
                    return;
                }
                Rectangle processGrpSpRect = processGrpSpRect(fVar2, ReaderKit.instance().getShapeAnchor(element8.element("xfrm"), f10, f11));
                Rectangle rectangle7 = fVar2.f20604e;
                int i18 = rectangle.f20688x;
                int i19 = processGrpSpRect.f20688x - rectangle7.f20688x;
                int i20 = rectangle.width;
                int i21 = rectangle7.width;
                processGrpSpRect.f20688x = ((i19 * i20) / i21) + i18;
                int i22 = rectangle.f20689y;
                int i23 = rectangle.height;
                int i24 = rectangle7.height;
                processGrpSpRect.f20689y = (((processGrpSpRect.f20689y - rectangle7.f20689y) * i23) / i24) + i22;
                processGrpSpRect.width = (i20 * processGrpSpRect.width) / i21;
                processGrpSpRect.height = (i23 * processGrpSpRect.height) / i24;
                rectangle2 = processGrpSpRect;
            }
            if (this.sheet.f16609j == 0 && rectangle2 == null) {
                return;
            }
            if (!name.equals("sp") && !name.equals("cxnSp")) {
                if (name.equals("pic")) {
                    r4 = getImageData(element, rectangle2);
                    if (r4 != 0) {
                        Element element9 = element.element("spPr");
                        Map<String, Integer> schemeColor = SchemeColorUtil.getSchemeColor(this.sheet.f16601a);
                        if (element9 != null) {
                            r4.f20603d = t0.j0(fVar, zipPackage, packagePart, element9, schemeColor);
                            r4.f20610k = com.google.android.play.core.assetpacks.c.r(fVar, zipPackage, packagePart, element9.element("ln"), schemeColor);
                        }
                        Element element10 = element.element("nvPicPr");
                        if (element10 != null && (element4 = element10.element("cNvPr")) != null && (element5 = element4.element("hlinkClick")) != null) {
                            String str = this.drawingListLink.get(element5.attributeValue(FacebookMediationAdapter.KEY_ID));
                            if (!TextUtils.isEmpty(str)) {
                                if (str.contains("mailto:")) {
                                    i10 = 3;
                                }
                                ih.a aVar = new ih.a();
                                aVar.f18491a = i10;
                                aVar.f18492b = str;
                                r4.f20624n = aVar;
                            }
                        }
                        if (fVar2 == 0) {
                            this.sheet.b(r4);
                        } else {
                            fVar2.q(r4);
                        }
                    }
                } else if (name.equals("graphicFrame") && (element2 = element.element("graphic")) != null && (element3 = element2.element("graphicData")) != null && element3.attribute("uri") != null) {
                    String attributeValue = element3.attributeValue("uri");
                    if (attributeValue.equals(PackageRelationshipTypes.CHART_TYPE)) {
                        r4 = getChart(element3.element("chart"), rectangle2);
                    } else if (attributeValue.equals(PackageRelationshipTypes.DIAGRAM_TYPE)) {
                        r4 = getSmartArt(element3, rectangle2);
                    }
                    if (r4 != 0) {
                        ReaderKit.instance().processRotation(element.element("spPr"), r4);
                        if (fVar2 == 0) {
                            this.sheet.b(r4);
                        } else {
                            fVar2.q(r4);
                        }
                    }
                }
            } else {
                r4 = t0.I(fVar, zipPackage, packagePart, element, rectangle2, SchemeColorUtil.getSchemeColor(this.sheet.f16601a), 1, false);
                if (r4 != 0) {
                    if (fVar2 == 0) {
                        this.sheet.b(r4);
                    } else {
                        fVar2.q(r4);
                    }
                }
                n textBoxData = getTextBoxData(fVar, element, rectangle2);
                if (textBoxData != null) {
                    if (fVar2 == 0) {
                        this.sheet.b(textBoxData);
                    } else {
                        fVar2.q(textBoxData);
                    }
                }
            }
            if (r4 != 0 && Math.abs(r4.f20607h) > 1.0f) {
                Rectangle bounds = r4.getBounds();
                mi.a.k(bounds, r4.f20607h);
                r4.f20604e = bounds;
            }
        }
    }

    public void processOLEPicture(f fVar, ZipPackage zipPackage, PackagePart packagePart, c cVar, Element element) {
        PackagePart oLEPart;
        b excelShapeAnchor;
        this.sheet = cVar;
        if (element != null) {
            for (Element element2 : element.elements("oleObject")) {
                String attributeValue = element2.attributeValue("shapeId");
                if (attributeValue != null && (oLEPart = PictureReader.instance().getOLEPart(zipPackage, packagePart, attributeValue, Boolean.TRUE)) != null && (excelShapeAnchor = PictureReader.instance().getExcelShapeAnchor(attributeValue)) != null) {
                    i iVar = new i();
                    iVar.f20623m = fVar.o().g().d(oLEPart);
                    mi.a.f22038b.getClass();
                    iVar.f20604e = mi.a.d(cVar, excelShapeAnchor);
                    cVar.b(iVar);
                }
            }
        }
    }

    public void read(f fVar, ZipPackage zipPackage, PackagePart packagePart, c cVar) {
        this.sheet = cVar;
        Map<String, Integer> schemeColor = SchemeColorUtil.getSchemeColor(cVar.f16601a);
        PackageRelationshipCollection relationshipsByType = packagePart.getRelationshipsByType(PackageRelationshipTypes.CHART_PART);
        this.chartList = new HashMap();
        Iterator<PackageRelationship> it = relationshipsByType.iterator();
        while (it.hasNext()) {
            PackageRelationship next = it.next();
            this.chartList.put(next.getId(), ChartReader.instance().read(fVar, zipPackage, zipPackage.getPart(next.getTargetURI()), schemeColor, (byte) 1));
        }
        this.smartArtList = new HashMap();
        PackageRelationshipCollection relationshipsByType2 = packagePart.getRelationshipsByType(PackageRelationshipTypes.DIAGRAM_DATA);
        if (relationshipsByType2 != null && relationshipsByType2.size() > 0) {
            int size = relationshipsByType2.size();
            for (int i10 = 0; i10 < size; i10++) {
                PackageRelationship relationship = relationshipsByType2.getRelationship(i10);
                this.smartArtList.put(relationship.getId(), SmartArtReader.instance().read(fVar, zipPackage, packagePart, zipPackage.getPart(relationship.getTargetURI()), schemeColor, cVar));
            }
        }
        this.drawingList = new HashMap(10);
        this.drawingListLink = new HashMap(10);
        try {
            Iterator<PackageRelationship> it2 = packagePart.getRelationshipsByType(PackageRelationshipTypes.IMAGE_PART).iterator();
            while (it2.hasNext()) {
                PackageRelationship next2 = it2.next();
                this.drawingList.put(next2.getId(), Integer.valueOf(fVar.o().g().d(zipPackage.getPart(next2.getTargetURI()))));
            }
            Iterator<PackageRelationship> it3 = packagePart.getRelationshipsByType(PackageRelationshipTypes.HYPERLINK_PART).iterator();
            while (it3.hasNext()) {
                PackageRelationship next3 = it3.next();
                this.drawingListLink.put(next3.getId(), next3.getTargetURI().toString());
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        SAXReader sAXReader = new SAXReader();
        InputStream inputStream = packagePart.getInputStream();
        Document read = sAXReader.read(inputStream);
        inputStream.close();
        getCellAnchors(fVar, zipPackage, packagePart, read.getRootElement());
        dispose();
    }
}

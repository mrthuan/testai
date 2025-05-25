package lib.zj.office.fc.xls.Reader.drawing;

import ei.c;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import lh.e;
import lh.k;
import lh.n;
import lib.zj.office.fc.dom4j.Document;
import lib.zj.office.fc.dom4j.Element;
import lib.zj.office.fc.dom4j.io.SAXReader;
import lib.zj.office.fc.openxml4j.opc.PackagePart;
import lib.zj.office.fc.openxml4j.opc.ZipPackage;
import lib.zj.office.fc.ppt.attribute.ParaAttr;
import lib.zj.office.fc.ppt.attribute.RunAttr;
import lib.zj.office.fc.ppt.attribute.SectionAttr;
import lib.zj.office.fc.ppt.reader.ReaderKit;
import lib.zj.office.java.awt.Rectangle;
import lib.zj.office.system.f;
import pdf.pdfreader.viewer.editor.free.utils.t0;
import zh.b;
import zh.i;
import zh.j;
import zh.l;

/* loaded from: classes3.dex */
public class SmartArtReader {
    private static SmartArtReader reader = new SmartArtReader();
    private int offset;
    private c sheet;

    private n getTextBoxData(f fVar, Element element) {
        Rectangle rectangle;
        Element element2;
        Element element3 = element.element("txXfrm");
        if (element3 != null) {
            rectangle = ReaderKit.instance().getShapeAnchor(element3, 1.0f, 1.0f);
        } else {
            rectangle = null;
        }
        if (element.element("txBody") == null) {
            return null;
        }
        n nVar = new n();
        l lVar = new l();
        lVar.f32371a = 0L;
        nVar.f20643n = lVar;
        zh.f fVar2 = lVar.c;
        b bVar = b.f32374b;
        int round = Math.round(rectangle.width * 15.0f);
        bVar.getClass();
        b.K(fVar2, round);
        b.E(fVar2, Math.round(rectangle.height * 15.0f));
        b.G(fVar2, Math.round(30.0f));
        b.H(fVar2, Math.round(30.0f));
        boolean z10 = false;
        b.I(fVar2, 0);
        b.F(fVar2, 0);
        Element element4 = element3.element("bodyPr");
        SectionAttr.instance().setSectionAttribute(element4, fVar2, null, null, false);
        if (element4 != null) {
            String attributeValue = element4.attributeValue("wrap");
            nVar.f20642m = (attributeValue == null || "square".equalsIgnoreCase(attributeValue)) ? true : true;
        }
        lVar.f32372b = processParagraph(fVar, lVar, element2);
        nVar.f20604e = rectangle;
        l lVar2 = nVar.f20643n;
        if (lVar2 != null && lVar2.getText() != null && nVar.f20643n.getText().length() > 0 && !"\n".equals(nVar.f20643n.getText())) {
            ReaderKit.instance().processRotation(nVar, element.element("txXfrm"));
        }
        return nVar;
    }

    public static SmartArtReader instance() {
        return reader;
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
            i iVar = new i("\n");
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
        i iVar2 = null;
        for (Element element4 : elements) {
            if (element4.getName().equalsIgnoreCase("r")) {
                Element element5 = element4.element("t");
                if (element5 != null && (length = (text = element5.getText()).length()) >= 0) {
                    iVar2 = new i(text);
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

    public k read(f fVar, ZipPackage zipPackage, PackagePart packagePart, PackagePart packagePart2, Map<String, Integer> map, c cVar) {
        PackagePart packagePart3;
        Rectangle rectangle;
        Element element;
        Element element2;
        String attributeValue;
        this.sheet = cVar;
        SAXReader sAXReader = new SAXReader();
        InputStream inputStream = packagePart2.getInputStream();
        Document read = sAXReader.read(inputStream);
        inputStream.close();
        Element rootElement = read.getRootElement();
        eh.b j02 = t0.j0(fVar, zipPackage, packagePart2, rootElement.element("bg"), map);
        gh.b r4 = com.google.android.play.core.assetpacks.c.r(fVar, zipPackage, packagePart2, rootElement.element("whole").element("ln"), map);
        Element element3 = rootElement.element("extLst");
        Rectangle rectangle2 = null;
        if (element3 != null && (element = element3.element("ext")) != null && (element2 = element.element("dataModelExt")) != null && (attributeValue = element2.attributeValue("relId")) != null) {
            packagePart3 = zipPackage.getPart(packagePart.getRelationship(attributeValue).getTargetURI());
        } else {
            packagePart3 = null;
        }
        if (packagePart3 == null) {
            return null;
        }
        InputStream inputStream2 = packagePart3.getInputStream();
        Document read2 = sAXReader.read(inputStream2);
        inputStream2.close();
        k kVar = new k();
        kVar.f20603d = j02;
        kVar.f20610k = r4;
        Iterator elementIterator = read2.getRootElement().element("spTree").elementIterator("sp");
        while (elementIterator.hasNext()) {
            Element element4 = (Element) elementIterator.next();
            Element element5 = element4.element("spPr");
            if (element5 != null) {
                rectangle = ReaderKit.instance().getShapeAnchor(element5.element("xfrm"), 1.0f, 1.0f);
            } else {
                rectangle = rectangle2;
            }
            e I = t0.I(fVar, zipPackage, packagePart2, element4, rectangle, map, 1, false);
            ArrayList arrayList = kVar.f20626m;
            if (I != null) {
                arrayList.add(I);
            }
            n textBoxData = getTextBoxData(fVar, element4);
            if (textBoxData != null) {
                arrayList.add(textBoxData);
            }
            rectangle2 = null;
        }
        return kVar;
    }
}

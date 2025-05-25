package lib.zj.office.fc.ppt.reader;

import lib.zj.office.fc.dom4j.Element;
import lib.zj.office.fc.ppt.attribute.ParaAttr;
import lib.zj.office.fc.ppt.attribute.RunAttr;
import lib.zj.office.fc.ppt.attribute.SectionAttr;
import lib.zj.office.fc.ppt.bulletnumber.BulletNumberManage;
import lib.zj.office.system.f;
import th.b;
import th.e;
import zh.c;
import zh.m;
import zh.n;

/* loaded from: classes3.dex */
public class StyleReader {
    private static StyleReader style = new StyleReader();
    private int index;

    public static StyleReader instance() {
        return style;
    }

    private void processSp(e eVar, Element element) {
        Element element2;
        if (element != null) {
            Element element3 = element.element("spPr");
            if (element3 != null) {
                eVar.f30047a = ReaderKit.instance().getShapeAnchor(element3.element("xfrm"), 1.0f, 1.0f);
            }
            Element element4 = element.element("txBody");
            if (element4 != null && (element2 = element4.element("bodyPr")) != null) {
                c cVar = new c();
                SectionAttr.instance().setSectionAttribute(element2, cVar, null, null, false);
                eVar.f30048b = cVar;
            }
        }
    }

    private void processStyle(f fVar, e eVar, b bVar, Element element) {
        if (element != null) {
            Element element2 = element.element("lvl1pPr");
            if (element2 != null) {
                processStyleAttribute(fVar, eVar, bVar, element2, 1);
            }
            Element element3 = element.element("lvl2pPr");
            if (element3 != null) {
                processStyleAttribute(fVar, eVar, bVar, element3, 2);
            }
            Element element4 = element.element("lvl3pPr");
            if (element4 != null) {
                processStyleAttribute(fVar, eVar, bVar, element4, 3);
            }
            Element element5 = element.element("lvl4pPr");
            if (element5 != null) {
                processStyleAttribute(fVar, eVar, bVar, element5, 4);
            }
            Element element6 = element.element("lvl5pPr");
            if (element6 != null) {
                processStyleAttribute(fVar, eVar, bVar, element6, 5);
            }
            Element element7 = element.element("lvl6pPr");
            if (element7 != null) {
                processStyleAttribute(fVar, eVar, bVar, element7, 6);
            }
            Element element8 = element.element("lvl7pPr");
            if (element8 != null) {
                processStyleAttribute(fVar, eVar, bVar, element8, 7);
            }
            Element element9 = element.element("lvl8pPr");
            if (element9 != null) {
                processStyleAttribute(fVar, eVar, bVar, element9, 8);
            }
            Element element10 = element.element("lvl9pPr");
            if (element10 != null) {
                processStyleAttribute(fVar, eVar, bVar, element10, 9);
            }
        }
    }

    private void processStyleAttribute(f fVar, e eVar, b bVar, Element element, int i10) {
        m mVar = new m();
        mVar.f32392a = this.index;
        ParaAttr instance = ParaAttr.instance();
        c cVar = mVar.c;
        instance.setParaAttribute(fVar, element, cVar, null, -1, -1, 0, false, false);
        RunAttr.instance().setRunAttribute(bVar, element.element("defRPr"), cVar, null, 100, -1, false);
        RunAttr instance2 = RunAttr.instance();
        zh.b.f32374b.getClass();
        instance2.setMaxFontSize(zh.b.g(cVar, cVar));
        ParaAttr.instance().processParaWithPct(element, cVar);
        RunAttr.instance().resetMaxFontSize();
        n.f32394b.f32395a.put(Integer.valueOf(mVar.f32392a), mVar);
        eVar.c.put(Integer.valueOf(i10), Integer.valueOf(this.index));
        BulletNumberManage.instance().addBulletNumber(fVar, this.index, element);
        this.index++;
    }

    public int getStyleIndex() {
        return this.index;
    }

    public e getStyles(f fVar, b bVar, Element element, Element element2) {
        e eVar = new e();
        processSp(eVar, element);
        processStyle(fVar, eVar, bVar, element2);
        return eVar;
    }

    public void setStyleIndex(int i10) {
        this.index = i10;
    }
}

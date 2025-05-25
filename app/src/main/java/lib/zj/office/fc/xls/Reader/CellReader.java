package lib.zj.office.fc.xls.Reader;

import aj.b;
import androidx.activity.r;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import ei.a;
import ei.d;
import java.util.List;
import lib.zj.office.fc.dom4j.Element;
import lib.zj.office.fc.ppt.attribute.ParaAttr;
import lib.zj.office.fc.ppt.attribute.RunAttr;
import zh.c;
import zh.i;
import zh.j;
import zh.l;

/* loaded from: classes3.dex */
public class CellReader {
    private static final short CELLTYPE_BOOLEAN = 0;
    private static final short CELLTYPE_ERROR = 2;
    private static final short CELLTYPE_INLINESTRING = 5;
    private static final short CELLTYPE_NUMBER = 1;
    private static final short CELLTYPE_SHAREDSTRING = 3;
    private static final short CELLTYPE_STRING = 4;
    private static CellReader reader = new CellReader();
    private c attrLayout;
    private i leaf;
    private int offset;
    private j paraElem;

    private short getCellType(String str) {
        if (str != null && !str.equalsIgnoreCase("n")) {
            if (str.equalsIgnoreCase("b")) {
                return (short) 0;
            }
            if (str.equalsIgnoreCase("s")) {
                return (short) 3;
            }
            if (str.equalsIgnoreCase("str")) {
                return (short) 4;
            }
            if (str.equalsIgnoreCase("inlineStr")) {
                return (short) 5;
            }
            return (short) 2;
        }
        return (short) 1;
    }

    public static CellReader instance() {
        return reader;
    }

    private boolean isValidateCell(ei.c cVar, Element element) {
        if (element.attributeValue("t") != null || element.element(OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT) != null) {
            return true;
        }
        d dVar = cVar.f16601a;
        if (element.attributeValue("s") != null) {
            if (d.s(dVar.h(Integer.parseInt(element.attributeValue("s"))))) {
                return true;
            }
            return false;
        }
        String attributeValue = element.attributeValue("r");
        int q5 = b.q(attributeValue);
        ei.b g10 = cVar.g(b.x(attributeValue));
        if ((g10 != null && d.s(dVar.h(g10.f16597e))) || d.s(dVar.h(q5))) {
            return true;
        }
        return false;
    }

    private void processBreakLine(a aVar, l lVar, int i10, Element element, String str) {
        d dVar = aVar.f16588a.f16601a;
        if (str != null && str.length() != 0) {
            int length = str.length();
            int i11 = 1;
            if (str.charAt(0) == '\n') {
                i iVar = this.leaf;
                if (iVar != null) {
                    iVar.e(this.leaf.getText() + "\n");
                    this.offset = this.offset + 1;
                } else {
                    this.leaf = new i("\n");
                    RunAttr.instance().setRunAttribute(dVar, i10, element.element("rPr"), this.leaf.c, this.attrLayout);
                    i iVar2 = this.leaf;
                    int i12 = this.offset;
                    iVar2.f32371a = i12;
                    int i13 = i12 + 1;
                    this.offset = i13;
                    iVar2.f32372b = i13;
                    this.paraElem.e(iVar2);
                }
                j jVar = this.paraElem;
                jVar.f32372b = this.offset;
                lVar.e(jVar);
                this.leaf = null;
                String substring = str.substring(1);
                j jVar2 = new j();
                this.paraElem = jVar2;
                jVar2.f32371a = this.offset;
                this.attrLayout = new c();
                ParaAttr.instance().setParaAttribute(aVar.b(), this.paraElem.c, this.attrLayout);
                processBreakLine(aVar, lVar, i10, element, substring);
            } else if (str.charAt(length - 1) == '\n') {
                this.leaf = new i(str.substring(0, str.indexOf("\n") + 1));
                RunAttr.instance().setRunAttribute(dVar, i10, element.element("rPr"), this.leaf.c, this.attrLayout);
                i iVar3 = this.leaf;
                int i14 = this.offset;
                iVar3.f32371a = i14;
                int length2 = iVar3.getText().length() + i14;
                this.offset = length2;
                i iVar4 = this.leaf;
                iVar4.f32372b = length2;
                this.paraElem.e(iVar4);
                j jVar3 = this.paraElem;
                jVar3.f32372b = this.offset;
                lVar.e(jVar3);
                processBreakLine(aVar, lVar, i10, element, str.substring(str.indexOf("\n") + 1));
            } else {
                String[] split = str.split("\n");
                int length3 = split.length;
                String g10 = r.g(new StringBuilder(), split[0], "\n");
                this.leaf = new i(g10);
                RunAttr.instance().setRunAttribute(dVar, i10, element.element("rPr"), this.leaf.c, this.attrLayout);
                i iVar5 = this.leaf;
                int i15 = this.offset;
                iVar5.f32371a = i15;
                int length4 = g10.length() + i15;
                this.offset = length4;
                i iVar6 = this.leaf;
                iVar6.f32372b = length4;
                this.paraElem.e(iVar6);
                j jVar4 = this.paraElem;
                jVar4.f32372b = this.offset;
                lVar.e(jVar4);
                while (true) {
                    int i16 = length3 - 1;
                    if (i11 < i16) {
                        j jVar5 = new j();
                        this.paraElem = jVar5;
                        jVar5.f32371a = this.offset;
                        this.attrLayout = new c();
                        ParaAttr.instance().setParaAttribute(aVar.b(), this.paraElem.c, this.attrLayout);
                        String g11 = r.g(new StringBuilder(), split[i11], "\n");
                        this.leaf = new i(g11);
                        RunAttr.instance().setRunAttribute(dVar, i10, element.element("rPr"), this.leaf.c, this.attrLayout);
                        i iVar7 = this.leaf;
                        int i17 = this.offset;
                        iVar7.f32371a = i17;
                        int length5 = g11.length() + i17;
                        this.offset = length5;
                        i iVar8 = this.leaf;
                        iVar8.f32372b = length5;
                        this.paraElem.e(iVar8);
                        j jVar6 = this.paraElem;
                        jVar6.f32372b = this.offset;
                        lVar.e(jVar6);
                        i11++;
                    } else {
                        j jVar7 = new j();
                        this.paraElem = jVar7;
                        jVar7.f32371a = this.offset;
                        this.attrLayout = new c();
                        ParaAttr.instance().setParaAttribute(aVar.b(), this.paraElem.c, this.attrLayout);
                        String str2 = split[i16];
                        this.leaf = new i(str2);
                        RunAttr.instance().setRunAttribute(dVar, i10, element.element("rPr"), this.leaf.c, this.attrLayout);
                        i iVar9 = this.leaf;
                        int i18 = this.offset;
                        iVar9.f32371a = i18;
                        int length6 = str2.length() + i18;
                        this.offset = length6;
                        i iVar10 = this.leaf;
                        iVar10.f32372b = length6;
                        this.paraElem.e(iVar10);
                        return;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0038, code lost:
        if (r3 != 3) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private zh.l processComplexSST(ei.a r8, lib.zj.office.fc.dom4j.Element r9) {
        /*
            r7 = this;
            zh.l r0 = new zh.l
            r0.<init>()
            r1 = 0
            r0.f32371a = r1
            zh.f r1 = r0.c
            zh.b r2 = zh.b.f32374b
            r3 = 1106247680(0x41f00000, float:30.0)
            int r4 = java.lang.Math.round(r3)
            r2.getClass()
            zh.b.G(r1, r4)
            int r2 = java.lang.Math.round(r3)
            zh.b.H(r1, r2)
            r2 = 0
            zh.b.I(r1, r2)
            zh.b.F(r1, r2)
            ii.e r3 = r8.b()
            short r3 = r3.k()
            if (r3 == 0) goto L3a
            r4 = 1
            if (r3 == r4) goto L3b
            r4 = 2
            if (r3 == r4) goto L3b
            r4 = 3
            if (r3 == r4) goto L3b
        L3a:
            r4 = r2
        L3b:
            zh.b.J(r1, r4)
            ii.e r1 = r8.b()
            short r1 = r1.f18503b
            r7.offset = r2
            zh.j r3 = new zh.j
            r3.<init>()
            r7.paraElem = r3
            int r4 = r7.offset
            long r4 = (long) r4
            r3.f32371a = r4
            zh.c r3 = new zh.c
            r3.<init>()
            r7.attrLayout = r3
            lib.zj.office.fc.ppt.attribute.ParaAttr r3 = lib.zj.office.fc.ppt.attribute.ParaAttr.instance()
            ii.e r4 = r8.b()
            zh.j r5 = r7.paraElem
            zh.f r5 = r5.c
            zh.c r6 = r7.attrLayout
            r3.setParaAttribute(r4, r5, r6)
            zh.j r8 = r7.processRun(r8, r0, r9, r1)
            r7.paraElem = r8
            int r9 = r7.offset
            long r3 = (long) r9
            r8.f32372b = r3
            r0.e(r8)
            int r8 = r7.offset
            long r8 = (long) r8
            r0.f32372b = r8
            r7.offset = r2
            r8 = 0
            r7.paraElem = r8
            r7.attrLayout = r8
            r7.leaf = r8
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: lib.zj.office.fc.xls.Reader.CellReader.processComplexSST(ei.a, lib.zj.office.fc.dom4j.Element):zh.l");
    }

    private j processRun(a aVar, l lVar, Element element, int i10) {
        String str;
        Element element2;
        d dVar = aVar.f16588a.f16601a;
        List<Element> elements = element.elements();
        boolean z10 = !aVar.b().l();
        String str2 = "\n";
        if (elements.size() == 0) {
            this.leaf = new i("\n");
            RunAttr.instance().setRunAttribute(dVar, i10, null, this.leaf.c, this.attrLayout);
            i iVar = this.leaf;
            int i11 = this.offset;
            iVar.f32371a = i11;
            int i12 = i11 + 1;
            this.offset = i12;
            iVar.f32372b = i12;
            this.paraElem.e(iVar);
            return this.paraElem;
        }
        for (Element element3 : elements) {
            if (element3.getName().equalsIgnoreCase("r") && (element2 = element3.element("t")) != null) {
                String text = element2.getText();
                if (text.length() > 0) {
                    if (z10) {
                        String replace = text.replace(str2, "");
                        this.leaf = new i(replace);
                        RunAttr.instance().setRunAttribute(dVar, i10, element3.element("rPr"), this.leaf.c, this.attrLayout);
                        i iVar2 = this.leaf;
                        int i13 = this.offset;
                        iVar2.f32371a = i13;
                        int length = replace.length() + i13;
                        this.offset = length;
                        i iVar3 = this.leaf;
                        iVar3.f32372b = length;
                        this.paraElem.e(iVar3);
                    } else if (!text.contains(str2)) {
                        this.leaf = new i(text);
                        RunAttr.instance().setRunAttribute(dVar, i10, element3.element("rPr"), this.leaf.c, this.attrLayout);
                        i iVar4 = this.leaf;
                        int i14 = this.offset;
                        iVar4.f32371a = i14;
                        int length2 = text.length() + i14;
                        this.offset = length2;
                        i iVar5 = this.leaf;
                        iVar5.f32372b = length2;
                        this.paraElem.e(iVar5);
                    } else {
                        str = str2;
                        processBreakLine(aVar, lVar, i10, element3, text);
                        str2 = str;
                    }
                }
            }
            str = str2;
            str2 = str;
        }
        String str3 = str2;
        i iVar6 = this.leaf;
        if (iVar6 != null) {
            iVar6.e(this.leaf.getText() + str3);
            this.offset = this.offset + 1;
        }
        return this.paraElem;
    }

    public a getCell(ei.c cVar, Element element) {
        a aVar;
        int e10;
        if (!isValidateCell(cVar, element)) {
            return null;
        }
        short cellType = getCellType(element.attributeValue("t"));
        boolean z10 = false;
        if (cellType != 0) {
            if (cellType != 1) {
                if (cellType != 2 && cellType != 3 && cellType != 4 && cellType != 5) {
                    aVar = new a((short) 3);
                } else {
                    aVar = new a((short) 1);
                }
            } else {
                aVar = new a((short) 0);
            }
        } else {
            aVar = new a((short) 4);
        }
        String attributeValue = element.attributeValue("r");
        aVar.f16590d = b.q(attributeValue);
        aVar.c = b.x(attributeValue);
        d dVar = cVar.f16601a;
        if (element.attributeValue("s") != null) {
            e10 = Integer.parseInt(element.attributeValue("s"));
        } else {
            e10 = cVar.e(aVar.f16590d);
        }
        aVar.f16591e = e10;
        Element element2 = element.element(OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT);
        if (element2 != null) {
            String text = element2.getText();
            if (cellType == 3) {
                int parseInt = Integer.parseInt(text);
                Object m10 = dVar.m(parseInt);
                if (m10 instanceof Element) {
                    aVar.f16588a = cVar;
                    parseInt = dVar.e(processComplexSST(aVar, (Element) m10));
                }
                aVar.f16592f = Integer.valueOf(parseInt);
            } else if (cellType != 4 && cellType != 2) {
                if (cellType == 1) {
                    aVar.f16592f = Double.valueOf(Double.parseDouble(text));
                } else if (cellType == 0) {
                    if (Integer.parseInt(text) != 0) {
                        z10 = true;
                    }
                    aVar.f16592f = Boolean.valueOf(z10);
                } else {
                    aVar.f16592f = text;
                }
            } else {
                aVar.f16592f = Integer.valueOf(dVar.e(text));
            }
        }
        return aVar;
    }

    public boolean searchContent(Element element, String str) {
        Element element2 = element.element(OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT);
        if (element2 != null && getCellType(element.attributeValue("t")) != 3 && element2.getText().toLowerCase().contains(str)) {
            return true;
        }
        return false;
    }
}

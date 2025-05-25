package lib.zj.office.fc.ppt.attribute;

import zh.b;
import zh.c;
import zh.f;

/* loaded from: classes3.dex */
public class SectionAttr {
    public static final int DEFAULT_MARGIN_LEFT_RIGHT = 144;
    public static final int DEFAULT_MARGIN_TOP_BOTTOM = 72;
    public static final int DEFAULT_TABLE_MARGIN = 30;
    private static SectionAttr kit = new SectionAttr();

    public static SectionAttr instance() {
        return kit;
    }

    public f getDefautSectionAttr(f fVar, f fVar2) {
        if (fVar == null && fVar2 == null) {
            return null;
        }
        c cVar = new c();
        if (fVar == null) {
            setPageMarginLeft(fVar2, cVar);
            setPageMarginRight(fVar2, cVar);
            setPageMarginTop(fVar2, cVar);
            setPageMarginBottom(fVar2, cVar);
            setPageVerticalAlign(fVar2, cVar);
        } else if (fVar2 == null) {
            setPageMarginLeft(fVar, cVar);
            setPageMarginRight(fVar, cVar);
            setPageMarginTop(fVar, cVar);
            setPageMarginBottom(fVar, cVar);
            setPageVerticalAlign(fVar, cVar);
        } else {
            b.f32374b.getClass();
            if (b.u(fVar, (short) 8194)) {
                setPageMarginLeft(fVar, cVar);
            } else {
                setPageMarginLeft(fVar2, cVar);
            }
            if (b.u(fVar, (short) 8195)) {
                setPageMarginRight(fVar, cVar);
            } else {
                setPageMarginRight(fVar2, cVar);
            }
            if (b.u(fVar, (short) 8196)) {
                setPageMarginTop(fVar, cVar);
            } else {
                setPageMarginTop(fVar2, cVar);
            }
            if (b.u(fVar, (short) 8197)) {
                setPageMarginBottom(fVar, cVar);
            } else {
                setPageMarginBottom(fVar2, cVar);
            }
            if (b.u(fVar, (short) 8198)) {
                setPageVerticalAlign(fVar, cVar);
            } else {
                setPageVerticalAlign(fVar2, cVar);
            }
        }
        return cVar;
    }

    public void setPageMarginBottom(f fVar, f fVar2) {
        if (fVar != null) {
            b.f32374b.getClass();
            if (b.u(fVar, (short) 8197)) {
                int b10 = ((c) fVar).b((short) 8197, true);
                if (b10 == Integer.MIN_VALUE) {
                    b10 = 1440;
                }
                b.F(fVar2, b10);
            }
        }
    }

    public void setPageMarginLeft(f fVar, f fVar2) {
        if (fVar != null) {
            b.f32374b.getClass();
            if (b.u(fVar, (short) 8194)) {
                b.G(fVar2, b.m(fVar));
            }
        }
    }

    public void setPageMarginRight(f fVar, f fVar2) {
        if (fVar != null) {
            b.f32374b.getClass();
            if (b.u(fVar, (short) 8195)) {
                b.H(fVar2, b.n(fVar));
            }
        }
    }

    public void setPageMarginTop(f fVar, f fVar2) {
        if (fVar != null) {
            b.f32374b.getClass();
            if (b.u(fVar, (short) 8196)) {
                int b10 = ((c) fVar).b((short) 8196, true);
                if (b10 == Integer.MIN_VALUE) {
                    b10 = 1440;
                }
                b.I(fVar2, b10);
            }
        }
    }

    public void setPageVerticalAlign(f fVar, f fVar2) {
        if (fVar != null) {
            b.f32374b.getClass();
            if (b.u(fVar, (short) 8198)) {
                b.J(fVar2, b.o(fVar));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ec, code lost:
        if (r0.equals("dist") != false) goto L81;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setSectionAttribute(lib.zj.office.fc.dom4j.Element r6, zh.f r7, zh.f r8, zh.f r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lib.zj.office.fc.ppt.attribute.SectionAttr.setSectionAttribute(lib.zj.office.fc.dom4j.Element, zh.f, zh.f, zh.f, boolean):void");
    }
}

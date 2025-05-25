package lib.zj.office.fc.hssf.formula;

import a0.a;
import a6.h;
import lib.zj.office.fc.hssf.formula.ptg.AbstractFunctionPtg;
import lib.zj.office.fc.hssf.formula.ptg.AttrPtg;
import lib.zj.office.fc.hssf.formula.ptg.ControlPtg;
import lib.zj.office.fc.hssf.formula.ptg.FuncVarPtg;
import lib.zj.office.fc.hssf.formula.ptg.MemAreaPtg;
import lib.zj.office.fc.hssf.formula.ptg.MemFuncPtg;
import lib.zj.office.fc.hssf.formula.ptg.Ptg;
import lib.zj.office.fc.hssf.formula.ptg.RangePtg;
import lib.zj.office.fc.hssf.formula.ptg.UnionPtg;
import lib.zj.office.fc.hssf.formula.ptg.ValueOperatorPtg;

/* loaded from: classes3.dex */
final class OperandClassTransformer {
    private final int _formulaType;

    public OperandClassTransformer(int i10) {
        this._formulaType = i10;
    }

    private static boolean isSimpleValueFunction(Ptg ptg) {
        if (!(ptg instanceof AbstractFunctionPtg)) {
            return false;
        }
        AbstractFunctionPtg abstractFunctionPtg = (AbstractFunctionPtg) ptg;
        if (abstractFunctionPtg.getDefaultOperandClass() != 32) {
            return false;
        }
        for (int numberOfOperands = abstractFunctionPtg.getNumberOfOperands() - 1; numberOfOperands >= 0; numberOfOperands--) {
            if (abstractFunctionPtg.getParameterClass(numberOfOperands) != 32) {
                return false;
            }
        }
        return true;
    }

    private static boolean isSingleArgSum(Ptg ptg) {
        if (ptg instanceof AttrPtg) {
            return ((AttrPtg) ptg).isSum();
        }
        return false;
    }

    private void setSimpleValueFuncClass(AbstractFunctionPtg abstractFunctionPtg, byte b10, boolean z10) {
        if (!z10 && b10 != 64) {
            abstractFunctionPtg.setClass((byte) 32);
        } else {
            abstractFunctionPtg.setClass((byte) 64);
        }
    }

    private byte transformClass(byte b10, byte b11, boolean z10) {
        if (b11 != 0) {
            if (b11 != 32) {
                if (b11 != 64) {
                    throw new IllegalStateException(a.g("Unexpected operand class (", b11, ")"));
                }
            } else if (!z10) {
                return (byte) 32;
            }
            return (byte) 64;
        } else if (!z10) {
            return b10;
        } else {
            return (byte) 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0053, code lost:
        if (r0 == 32) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007d A[LOOP:0: B:37:0x007a->B:39:0x007d, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void transformFunctionNode(lib.zj.office.fc.hssf.formula.ptg.AbstractFunctionPtg r8, lib.zj.office.fc.hssf.formula.ParseNode[] r9, byte r10, boolean r11) {
        /*
            r7 = this;
            byte r0 = r8.getDefaultOperandClass()
            r1 = 1
            java.lang.String r2 = ")"
            java.lang.String r3 = "Unexpected operand class ("
            r4 = 32
            r5 = 64
            r6 = 0
            if (r11 == 0) goto L32
            if (r0 == 0) goto L28
            if (r0 == r4) goto L24
            if (r0 != r5) goto L1a
            r8.setClass(r5)
            goto L79
        L1a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = a0.a.g(r3, r0, r2)
            r8.<init>(r9)
            throw r8
        L24:
            r8.setClass(r5)
            goto L7a
        L28:
            if (r10 != 0) goto L2e
            r8.setClass(r6)
            goto L79
        L2e:
            r8.setClass(r5)
            goto L79
        L32:
            if (r0 != r10) goto L38
            r8.setClass(r0)
            goto L79
        L38:
            if (r10 == 0) goto L64
            if (r10 == r4) goto L60
            if (r10 != r5) goto L56
            if (r0 == 0) goto L50
            if (r0 != r4) goto L46
            r8.setClass(r5)
            goto L53
        L46:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = a0.a.g(r3, r0, r2)
            r8.<init>(r9)
            throw r8
        L50:
            r8.setClass(r6)
        L53:
            if (r0 != r4) goto L79
            goto L7a
        L56:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = a0.a.g(r3, r10, r2)
            r8.<init>(r9)
            throw r8
        L60:
            r8.setClass(r4)
            goto L79
        L64:
            if (r0 == r4) goto L76
            if (r0 != r5) goto L6c
            r8.setClass(r5)
            goto L79
        L6c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = a0.a.g(r3, r0, r2)
            r8.<init>(r9)
            throw r8
        L76:
            r8.setClass(r4)
        L79:
            r1 = r6
        L7a:
            int r10 = r9.length
            if (r6 >= r10) goto L89
            r10 = r9[r6]
            byte r11 = r8.getParameterClass(r6)
            r7.transformNode(r10, r11, r1)
            int r6 = r6 + 1
            goto L7a
        L89:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lib.zj.office.fc.hssf.formula.OperandClassTransformer.transformFunctionNode(lib.zj.office.fc.hssf.formula.ptg.AbstractFunctionPtg, lib.zj.office.fc.hssf.formula.ParseNode[], byte, boolean):void");
    }

    private void transformNode(ParseNode parseNode, byte b10, boolean z10) {
        boolean z11;
        Ptg token = parseNode.getToken();
        ParseNode[] children = parseNode.getChildren();
        int i10 = 0;
        if (isSimpleValueFunction(token)) {
            if (b10 == 64) {
                z11 = true;
            } else {
                z11 = false;
            }
            while (i10 < children.length) {
                transformNode(children[i10], b10, z11);
                i10++;
            }
            setSimpleValueFuncClass((AbstractFunctionPtg) token, b10, z10);
            return;
        }
        if (isSingleArgSum(token)) {
            token = FuncVarPtg.SUM;
        }
        if (!(token instanceof ValueOperatorPtg) && !(token instanceof ControlPtg) && !(token instanceof MemFuncPtg) && !(token instanceof MemAreaPtg) && !(token instanceof UnionPtg)) {
            if (token instanceof AbstractFunctionPtg) {
                transformFunctionNode((AbstractFunctionPtg) token, children, b10, z10);
                return;
            } else if (children.length > 0) {
                if (token == RangePtg.instance) {
                    return;
                }
                throw new IllegalStateException("Node should not have any children");
            } else if (token.isBaseToken()) {
                return;
            } else {
                token.setClass(transformClass(token.getPtgClass(), b10, z10));
                return;
            }
        }
        if (b10 == 0) {
            b10 = 32;
        }
        while (i10 < children.length) {
            transformNode(children[i10], b10, z10);
            i10++;
        }
    }

    public void transformFormula(ParseNode parseNode) {
        byte b10;
        int i10 = this._formulaType;
        if (i10 != 0) {
            if (i10 != 2) {
                if (i10 != 4 && i10 != 5) {
                    throw new RuntimeException(h.g(new StringBuilder("Incomplete code - formula type ("), this._formulaType, ") not supported yet"));
                }
                b10 = 0;
            } else {
                b10 = 64;
            }
        } else {
            b10 = 32;
        }
        transformNode(parseNode, b10, false);
    }
}

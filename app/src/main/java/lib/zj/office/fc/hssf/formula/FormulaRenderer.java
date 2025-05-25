package lib.zj.office.fc.hssf.formula;

import androidx.appcompat.view.menu.d;
import java.util.Stack;
import lib.zj.office.fc.hssf.formula.ptg.AttrPtg;
import lib.zj.office.fc.hssf.formula.ptg.MemAreaPtg;
import lib.zj.office.fc.hssf.formula.ptg.MemErrPtg;
import lib.zj.office.fc.hssf.formula.ptg.MemFuncPtg;
import lib.zj.office.fc.hssf.formula.ptg.OperationPtg;
import lib.zj.office.fc.hssf.formula.ptg.ParenthesisPtg;
import lib.zj.office.fc.hssf.formula.ptg.Ptg;

/* loaded from: classes3.dex */
public class FormulaRenderer {
    private static String[] getOperands(Stack<String> stack, int i10) {
        String[] strArr = new String[i10];
        for (int i11 = i10 - 1; i11 >= 0; i11--) {
            if (!stack.isEmpty()) {
                strArr[i11] = stack.pop();
            } else {
                StringBuilder e10 = d.e("Too few arguments supplied to operation. Expected (", i10, ") operands but got (");
                e10.append((i10 - i11) - 1);
                e10.append(")");
                throw new IllegalStateException(e10.toString());
            }
        }
        return strArr;
    }

    public static String toFormulaString(FormulaRenderingWorkbook formulaRenderingWorkbook, Ptg[] ptgArr) {
        if (ptgArr != null && ptgArr.length != 0) {
            Stack stack = new Stack();
            for (Ptg ptg : ptgArr) {
                if (!(ptg instanceof MemAreaPtg) && !(ptg instanceof MemFuncPtg) && !(ptg instanceof MemErrPtg)) {
                    if (ptg instanceof ParenthesisPtg) {
                        stack.push("(" + ((String) stack.pop()) + ")");
                    } else if (ptg instanceof AttrPtg) {
                        AttrPtg attrPtg = (AttrPtg) ptg;
                        if (!attrPtg.isOptimizedIf() && !attrPtg.isOptimizedChoose() && !attrPtg.isSkip() && !attrPtg.isSpace() && !attrPtg.isSemiVolatile()) {
                            if (attrPtg.isSum()) {
                                stack.push(attrPtg.toFormulaString(getOperands(stack, attrPtg.getNumberOfOperands())));
                            } else {
                                throw new RuntimeException("Unexpected tAttr: " + attrPtg.toString());
                            }
                        }
                    } else if (ptg instanceof WorkbookDependentFormula) {
                        stack.push(((WorkbookDependentFormula) ptg).toFormulaString(formulaRenderingWorkbook));
                    } else if (!(ptg instanceof OperationPtg)) {
                        stack.push(ptg.toFormulaString());
                    } else {
                        OperationPtg operationPtg = (OperationPtg) ptg;
                        stack.push(operationPtg.toFormulaString(getOperands(stack, operationPtg.getNumberOfOperands())));
                    }
                }
            }
            if (!stack.isEmpty()) {
                String str = (String) stack.pop();
                if (stack.isEmpty()) {
                    return str;
                }
                throw new IllegalStateException("too much stuff left on the stack");
            }
            throw new IllegalStateException("Stack underflow");
        }
        throw new IllegalArgumentException("ptgs must not be null");
    }
}

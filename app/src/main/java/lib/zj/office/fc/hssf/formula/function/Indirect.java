package lib.zj.office.fc.hssf.formula.function;

import lib.zj.office.fc.hssf.formula.OperationEvaluationContext;
import lib.zj.office.fc.hssf.formula.eval.BlankEval;
import lib.zj.office.fc.hssf.formula.eval.ErrorEval;
import lib.zj.office.fc.hssf.formula.eval.EvaluationException;
import lib.zj.office.fc.hssf.formula.eval.MissingArgEval;
import lib.zj.office.fc.hssf.formula.eval.OperandResolver;
import lib.zj.office.fc.hssf.formula.eval.ValueEval;

/* loaded from: classes3.dex */
public final class Indirect implements FreeRefFunction {
    public static final FreeRefFunction instance = new Indirect();

    private Indirect() {
    }

    private static boolean canTrim(CharSequence charSequence) {
        int length = charSequence.length() - 1;
        if (length < 0) {
            return false;
        }
        if (Character.isWhitespace(charSequence.charAt(0)) || Character.isWhitespace(charSequence.charAt(length))) {
            return true;
        }
        return false;
    }

    private static boolean evaluateBooleanArg(ValueEval valueEval, OperationEvaluationContext operationEvaluationContext) {
        ValueEval singleValue = OperandResolver.getSingleValue(valueEval, operationEvaluationContext.getRowIndex(), operationEvaluationContext.getColumnIndex());
        if (singleValue == BlankEval.instance || singleValue == MissingArgEval.instance) {
            return false;
        }
        return OperandResolver.coerceValueToBoolean(singleValue, false).booleanValue();
    }

    private static ValueEval evaluateIndirect(OperationEvaluationContext operationEvaluationContext, String str, boolean z10) {
        String str2;
        String str3;
        String trim;
        String str4;
        int lastIndexOf = str.lastIndexOf(33);
        if (lastIndexOf < 0) {
            str2 = null;
            str3 = null;
        } else {
            String[] parseWorkbookAndSheetName = parseWorkbookAndSheetName(str.subSequence(0, lastIndexOf));
            if (parseWorkbookAndSheetName == null) {
                return ErrorEval.REF_INVALID;
            }
            str2 = parseWorkbookAndSheetName[0];
            String str5 = parseWorkbookAndSheetName[1];
            str = str.substring(lastIndexOf + 1);
            str3 = str5;
        }
        int indexOf = str.indexOf(58);
        if (indexOf < 0) {
            str4 = str.trim();
            trim = null;
        } else {
            String trim2 = str.substring(0, indexOf).trim();
            trim = str.substring(indexOf + 1).trim();
            str4 = trim2;
        }
        return operationEvaluationContext.getDynamicReference(str2, str3, str4, trim, z10);
    }

    private static String[] parseWorkbookAndSheetName(CharSequence charSequence) {
        String str;
        int i10 = 1;
        int length = charSequence.length() - 1;
        if (length < 0 || canTrim(charSequence)) {
            return null;
        }
        char charAt = charSequence.charAt(0);
        if (Character.isWhitespace(charAt)) {
            return null;
        }
        if (charAt == '\'') {
            if (charSequence.charAt(length) != '\'') {
                return null;
            }
            char charAt2 = charSequence.charAt(1);
            if (Character.isWhitespace(charAt2)) {
                return null;
            }
            if (charAt2 == '[') {
                int lastIndexOf = charSequence.toString().lastIndexOf(93);
                if (lastIndexOf < 0 || (str = unescapeString(charSequence.subSequence(2, lastIndexOf))) == null || canTrim(str)) {
                    return null;
                }
                i10 = 1 + lastIndexOf;
            } else {
                str = null;
            }
            String unescapeString = unescapeString(charSequence.subSequence(i10, length));
            if (unescapeString == null) {
                return null;
            }
            return new String[]{str, unescapeString};
        } else if (charAt == '[') {
            int lastIndexOf2 = charSequence.toString().lastIndexOf(93);
            if (lastIndexOf2 < 0) {
                return null;
            }
            CharSequence subSequence = charSequence.subSequence(1, lastIndexOf2);
            if (canTrim(subSequence)) {
                return null;
            }
            CharSequence subSequence2 = charSequence.subSequence(lastIndexOf2 + 1, charSequence.length());
            if (canTrim(subSequence2)) {
                return null;
            }
            return new String[]{subSequence.toString(), subSequence2.toString()};
        } else {
            return new String[]{null, charSequence.toString()};
        }
    }

    private static String unescapeString(CharSequence charSequence) {
        char charAt;
        int length = charSequence.length();
        StringBuilder sb2 = new StringBuilder(length);
        int i10 = 0;
        while (i10 < length) {
            char charAt2 = charSequence.charAt(i10);
            if (charAt2 == '\'') {
                i10++;
                if (i10 >= length || (charAt = charSequence.charAt(i10)) != '\'') {
                    return null;
                }
                charAt2 = charAt;
            }
            sb2.append(charAt2);
            i10++;
        }
        return sb2.toString();
    }

    @Override // lib.zj.office.fc.hssf.formula.function.FreeRefFunction
    public ValueEval evaluate(ValueEval[] valueEvalArr, OperationEvaluationContext operationEvaluationContext) {
        boolean z10 = true;
        if (valueEvalArr.length < 1) {
            return ErrorEval.VALUE_INVALID;
        }
        try {
            String coerceValueToString = OperandResolver.coerceValueToString(OperandResolver.getSingleValue(valueEvalArr[0], operationEvaluationContext.getRowIndex(), operationEvaluationContext.getColumnIndex()));
            int length = valueEvalArr.length;
            if (length != 1) {
                if (length != 2) {
                    return ErrorEval.VALUE_INVALID;
                }
                z10 = evaluateBooleanArg(valueEvalArr[1], operationEvaluationContext);
            }
            return evaluateIndirect(operationEvaluationContext, coerceValueToString, z10);
        } catch (EvaluationException e10) {
            return e10.getErrorEval();
        }
    }
}

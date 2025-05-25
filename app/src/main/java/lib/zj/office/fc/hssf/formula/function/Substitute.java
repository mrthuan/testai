package lib.zj.office.fc.hssf.formula.function;

import lib.zj.office.fc.hssf.formula.eval.ErrorEval;
import lib.zj.office.fc.hssf.formula.eval.EvaluationException;
import lib.zj.office.fc.hssf.formula.eval.StringEval;
import lib.zj.office.fc.hssf.formula.eval.ValueEval;

/* loaded from: classes3.dex */
public final class Substitute extends Var3or4ArgFunction {
    private static String replaceAllOccurrences(String str, String str2, String str3) {
        StringBuffer stringBuffer = new StringBuffer();
        int i10 = 0;
        while (true) {
            int indexOf = str.indexOf(str2, i10);
            if (indexOf < 0) {
                stringBuffer.append(str.substring(i10));
                return stringBuffer.toString();
            }
            stringBuffer.append(str.substring(i10, indexOf));
            stringBuffer.append(str3);
            i10 = str2.length() + indexOf;
        }
    }

    private static String replaceOneOccurrence(String str, String str2, String str3, int i10) {
        if (str2.length() < 1) {
            return str;
        }
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int indexOf = str.indexOf(str2, i11);
            if (indexOf < 0) {
                return str;
            }
            i12++;
            if (i12 == i10) {
                StringBuffer stringBuffer = new StringBuffer(str3.length() + str.length());
                stringBuffer.append(str.substring(0, indexOf));
                stringBuffer.append(str3);
                stringBuffer.append(str.substring(str2.length() + indexOf));
                return stringBuffer.toString();
            }
            i11 = indexOf + str2.length();
        }
    }

    @Override // lib.zj.office.fc.hssf.formula.function.Function3Arg
    public ValueEval evaluate(int i10, int i11, ValueEval valueEval, ValueEval valueEval2, ValueEval valueEval3) {
        try {
            return new StringEval(replaceAllOccurrences(TextFunction.evaluateStringArg(valueEval, i10, i11), TextFunction.evaluateStringArg(valueEval2, i10, i11), TextFunction.evaluateStringArg(valueEval3, i10, i11)));
        } catch (EvaluationException e10) {
            return e10.getErrorEval();
        }
    }

    @Override // lib.zj.office.fc.hssf.formula.function.Function4Arg
    public ValueEval evaluate(int i10, int i11, ValueEval valueEval, ValueEval valueEval2, ValueEval valueEval3, ValueEval valueEval4) {
        try {
            String evaluateStringArg = TextFunction.evaluateStringArg(valueEval, i10, i11);
            String evaluateStringArg2 = TextFunction.evaluateStringArg(valueEval2, i10, i11);
            String evaluateStringArg3 = TextFunction.evaluateStringArg(valueEval3, i10, i11);
            int evaluateIntArg = TextFunction.evaluateIntArg(valueEval4, i10, i11);
            if (evaluateIntArg < 1) {
                return ErrorEval.VALUE_INVALID;
            }
            return new StringEval(replaceOneOccurrence(evaluateStringArg, evaluateStringArg2, evaluateStringArg3, evaluateIntArg));
        } catch (EvaluationException e10) {
            return e10.getErrorEval();
        }
    }
}

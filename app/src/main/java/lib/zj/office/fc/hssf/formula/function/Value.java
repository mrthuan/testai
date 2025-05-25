package lib.zj.office.fc.hssf.formula.function;

import lib.zj.office.fc.hssf.formula.eval.ErrorEval;
import lib.zj.office.fc.hssf.formula.eval.EvaluationException;
import lib.zj.office.fc.hssf.formula.eval.NumberEval;
import lib.zj.office.fc.hssf.formula.eval.OperandResolver;
import lib.zj.office.fc.hssf.formula.eval.ValueEval;

/* loaded from: classes3.dex */
public final class Value extends Fixed1ArgFunction {
    private static final int MIN_DISTANCE_BETWEEN_THOUSANDS_SEPARATOR = 4;
    private static final Double ZERO = new Double(0.0d);

    private static Double convertTextToNumber(String str) {
        int length = str.length();
        boolean z10 = false;
        int i10 = 0;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        while (i10 < length) {
            char charAt = str.charAt(i10);
            if (Character.isDigit(charAt) || charAt == '.') {
                break;
            }
            if (charAt != ' ') {
                if (charAt != '$') {
                    if (charAt != '+') {
                        if (charAt != '-' || z12 || z13) {
                            return null;
                        }
                        z12 = true;
                    } else if (z12 || z13) {
                        return null;
                    } else {
                        z13 = true;
                    }
                } else if (z11) {
                    return null;
                } else {
                    z11 = true;
                }
            }
            i10++;
        }
        if (i10 >= length) {
            if (z11 || z12 || z13) {
                return null;
            }
            return ZERO;
        }
        StringBuffer stringBuffer = new StringBuffer(length);
        int i11 = -32768;
        while (i10 < length) {
            char charAt2 = str.charAt(i10);
            if (Character.isDigit(charAt2)) {
                stringBuffer.append(charAt2);
            } else if (charAt2 != ' ') {
                if (charAt2 != ',') {
                    if (charAt2 != '.') {
                        if ((charAt2 != 'E' && charAt2 != 'e') || i10 - i11 < 4) {
                            return null;
                        }
                        stringBuffer.append(str.substring(i10));
                        i10 = length;
                    } else if (z10 || i10 - i11 < 4) {
                        return null;
                    } else {
                        stringBuffer.append('.');
                        z10 = true;
                    }
                } else if (z10 || i10 - i11 < 4) {
                    return null;
                } else {
                    i11 = i10;
                }
            } else if (str.substring(i10).trim().length() > 0) {
                return null;
            }
            i10++;
        }
        if (!z10 && i10 - i11 < 4) {
            return null;
        }
        try {
            double parseDouble = Double.parseDouble(stringBuffer.toString());
            if (z12) {
                parseDouble = -parseDouble;
            }
            return new Double(parseDouble);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @Override // lib.zj.office.fc.hssf.formula.function.Function1Arg
    public ValueEval evaluate(int i10, int i11, ValueEval valueEval) {
        try {
            Double convertTextToNumber = convertTextToNumber(OperandResolver.coerceValueToString(OperandResolver.getSingleValue(valueEval, i10, i11)));
            if (convertTextToNumber == null) {
                return ErrorEval.VALUE_INVALID;
            }
            return new NumberEval(convertTextToNumber.doubleValue());
        } catch (EvaluationException e10) {
            return e10.getErrorEval();
        }
    }
}

package lib.zj.office.fc.hssf.formula.function;

import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import lib.zj.office.fc.hssf.formula.eval.BoolEval;
import lib.zj.office.fc.hssf.formula.eval.ErrorEval;
import lib.zj.office.fc.hssf.formula.eval.EvaluationException;
import lib.zj.office.fc.hssf.formula.eval.NumberEval;
import lib.zj.office.fc.hssf.formula.eval.OperandResolver;
import lib.zj.office.fc.hssf.formula.eval.StringEval;
import lib.zj.office.fc.hssf.formula.eval.ValueEval;
import lib.zj.office.fc.openxml4j.opc.PackagingURIHelper;

/* loaded from: classes3.dex */
public abstract class TextFunction implements Function {
    protected static final String EMPTY_STRING = "";
    public static final Function CHAR = new Fixed1ArgFunction() { // from class: lib.zj.office.fc.hssf.formula.function.TextFunction.1
        @Override // lib.zj.office.fc.hssf.formula.function.Function1Arg
        public ValueEval evaluate(int i10, int i11, ValueEval valueEval) {
            try {
                int evaluateIntArg = TextFunction.evaluateIntArg(valueEval, i10, i11);
                if (evaluateIntArg >= 0 && evaluateIntArg < 256) {
                    return new StringEval(String.valueOf((char) evaluateIntArg));
                }
                throw new EvaluationException(ErrorEval.VALUE_INVALID);
            } catch (EvaluationException e10) {
                return e10.getErrorEval();
            }
        }
    };
    public static final Function CODE = new SingleArgTextFunc() { // from class: lib.zj.office.fc.hssf.formula.function.TextFunction.2
        @Override // lib.zj.office.fc.hssf.formula.function.TextFunction.SingleArgTextFunc
        public ValueEval evaluate(String str) {
            return new NumberEval(str.codePointAt(0));
        }
    };
    public static final Function LEN = new SingleArgTextFunc() { // from class: lib.zj.office.fc.hssf.formula.function.TextFunction.3
        @Override // lib.zj.office.fc.hssf.formula.function.TextFunction.SingleArgTextFunc
        public ValueEval evaluate(String str) {
            return new NumberEval(str.length());
        }
    };
    public static final Function LOWER = new SingleArgTextFunc() { // from class: lib.zj.office.fc.hssf.formula.function.TextFunction.4
        @Override // lib.zj.office.fc.hssf.formula.function.TextFunction.SingleArgTextFunc
        public ValueEval evaluate(String str) {
            return new StringEval(str.toLowerCase());
        }
    };
    public static final Function UPPER = new SingleArgTextFunc() { // from class: lib.zj.office.fc.hssf.formula.function.TextFunction.5
        @Override // lib.zj.office.fc.hssf.formula.function.TextFunction.SingleArgTextFunc
        public ValueEval evaluate(String str) {
            return new StringEval(str.toUpperCase());
        }
    };
    public static final Function TRIM = new SingleArgTextFunc() { // from class: lib.zj.office.fc.hssf.formula.function.TextFunction.6
        @Override // lib.zj.office.fc.hssf.formula.function.TextFunction.SingleArgTextFunc
        public ValueEval evaluate(String str) {
            return new StringEval(str.trim());
        }
    };
    public static final Function CLEAN = new SingleArgTextFunc() { // from class: lib.zj.office.fc.hssf.formula.function.TextFunction.7
        private boolean isPrintable(char c) {
            if (c >= ' ') {
                return true;
            }
            return false;
        }

        @Override // lib.zj.office.fc.hssf.formula.function.TextFunction.SingleArgTextFunc
        public ValueEval evaluate(String str) {
            StringBuilder sb2 = new StringBuilder();
            for (int i10 = 0; i10 < str.length(); i10++) {
                char charAt = str.charAt(i10);
                if (isPrintable(charAt)) {
                    sb2.append(charAt);
                }
            }
            return new StringEval(sb2.toString());
        }
    };
    public static final Function MID = new Fixed3ArgFunction() { // from class: lib.zj.office.fc.hssf.formula.function.TextFunction.8
        @Override // lib.zj.office.fc.hssf.formula.function.Function3Arg
        public ValueEval evaluate(int i10, int i11, ValueEval valueEval, ValueEval valueEval2, ValueEval valueEval3) {
            try {
                String evaluateStringArg = TextFunction.evaluateStringArg(valueEval, i10, i11);
                int evaluateIntArg = TextFunction.evaluateIntArg(valueEval2, i10, i11);
                int evaluateIntArg2 = TextFunction.evaluateIntArg(valueEval3, i10, i11);
                int i12 = evaluateIntArg - 1;
                if (i12 < 0) {
                    return ErrorEval.VALUE_INVALID;
                }
                if (evaluateIntArg2 < 0) {
                    return ErrorEval.VALUE_INVALID;
                }
                int length = evaluateStringArg.length();
                if (evaluateIntArg2 >= 0 && i12 <= length) {
                    return new StringEval(evaluateStringArg.substring(i12, Math.min(evaluateIntArg2 + i12, length)));
                }
                return new StringEval("");
            } catch (EvaluationException e10) {
                return e10.getErrorEval();
            }
        }
    };
    public static final Function LEFT = new LeftRight(true);
    public static final Function RIGHT = new LeftRight(false);
    public static final Function CONCATENATE = new Function() { // from class: lib.zj.office.fc.hssf.formula.function.TextFunction.9
        @Override // lib.zj.office.fc.hssf.formula.function.Function
        public ValueEval evaluate(ValueEval[] valueEvalArr, int i10, int i11) {
            StringBuilder sb2 = new StringBuilder();
            for (ValueEval valueEval : valueEvalArr) {
                try {
                    sb2.append(TextFunction.evaluateStringArg(valueEval, i10, i11));
                } catch (EvaluationException e10) {
                    return e10.getErrorEval();
                }
            }
            return new StringEval(sb2.toString());
        }
    };
    public static final Function EXACT = new Fixed2ArgFunction() { // from class: lib.zj.office.fc.hssf.formula.function.TextFunction.10
        @Override // lib.zj.office.fc.hssf.formula.function.Function2Arg
        public ValueEval evaluate(int i10, int i11, ValueEval valueEval, ValueEval valueEval2) {
            try {
                return BoolEval.valueOf(TextFunction.evaluateStringArg(valueEval, i10, i11).equals(TextFunction.evaluateStringArg(valueEval2, i10, i11)));
            } catch (EvaluationException e10) {
                return e10.getErrorEval();
            }
        }
    };
    public static final Function TEXT = new Fixed2ArgFunction() { // from class: lib.zj.office.fc.hssf.formula.function.TextFunction.11
        @Override // lib.zj.office.fc.hssf.formula.function.Function2Arg
        public ValueEval evaluate(int i10, int i11, ValueEval valueEval, ValueEval valueEval2) {
            String[] split;
            try {
                double evaluateDoubleArg = TextFunction.evaluateDoubleArg(valueEval, i10, i11);
                String evaluateStringArg = TextFunction.evaluateStringArg(valueEval2, i10, i11);
                if (evaluateStringArg.matches("[\\d,\\#,\\.,\\$,\\,]+")) {
                    return new StringEval(new DecimalFormat(evaluateStringArg).format(evaluateDoubleArg));
                }
                if (evaluateStringArg.indexOf(PackagingURIHelper.FORWARD_SLASH_STRING) == evaluateStringArg.lastIndexOf(PackagingURIHelper.FORWARD_SLASH_STRING) && evaluateStringArg.indexOf(PackagingURIHelper.FORWARD_SLASH_STRING) >= 0 && !evaluateStringArg.contains("-")) {
                    double floor = Math.floor(evaluateDoubleArg);
                    double d10 = evaluateDoubleArg - floor;
                    if (floor * d10 == 0.0d) {
                        return new StringEval(PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES);
                    }
                    String[] split2 = evaluateStringArg.split(" ");
                    if (split2.length == 2) {
                        split = split2[1].split(PackagingURIHelper.FORWARD_SLASH_STRING);
                    } else {
                        split = evaluateStringArg.split(PackagingURIHelper.FORWARD_SLASH_STRING);
                    }
                    if (split.length == 2) {
                        double d11 = 10.0d;
                        double pow = Math.pow(10.0d, split[1].length()) - 1.0d;
                        int pow2 = (int) (Math.pow(10.0d, split[1].length()) - 1.0d);
                        double d12 = 1.0d;
                        double d13 = 0.0d;
                        while (pow2 > 0) {
                            double d14 = pow;
                            for (int pow3 = (int) (Math.pow(d11, split[1].length()) - 1.0d); pow3 > 0; pow3--) {
                                double d15 = pow3;
                                double d16 = d13;
                                double d17 = pow2;
                                double d18 = (d15 / d17) - d10;
                                if (d12 >= Math.abs(d18)) {
                                    d12 = Math.abs(d18);
                                    d14 = d17;
                                    d13 = d15;
                                } else {
                                    d13 = d16;
                                }
                            }
                            pow2--;
                            pow = d14;
                            d11 = 10.0d;
                        }
                        double d19 = pow;
                        DecimalFormat decimalFormat = new DecimalFormat(split[0]);
                        DecimalFormat decimalFormat2 = new DecimalFormat(split[1]);
                        if (split2.length == 2) {
                            DecimalFormat decimalFormat3 = new DecimalFormat(split2[0]);
                            return new StringEval(decimalFormat3.format(floor) + " " + decimalFormat.format(d13) + PackagingURIHelper.FORWARD_SLASH_STRING + decimalFormat2.format(d19));
                        }
                        return new StringEval(decimalFormat.format((d19 * floor) + d13) + PackagingURIHelper.FORWARD_SLASH_STRING + decimalFormat2.format(d19));
                    }
                    return ErrorEval.VALUE_INVALID;
                }
                try {
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(evaluateStringArg);
                    GregorianCalendar gregorianCalendar = new GregorianCalendar(1899, 11, 30, 0, 0, 0);
                    gregorianCalendar.add(5, (int) Math.floor(evaluateDoubleArg));
                    gregorianCalendar.add(14, (int) Math.round((evaluateDoubleArg - Math.floor(evaluateDoubleArg)) * 24.0d * 60.0d * 60.0d * 1000.0d));
                    return new StringEval(simpleDateFormat.format(gregorianCalendar.getTime()));
                } catch (Exception unused) {
                    return ErrorEval.VALUE_INVALID;
                }
            } catch (EvaluationException e10) {
                return e10.getErrorEval();
            }
        }
    };
    public static final Function FIND = new SearchFind(true);
    public static final Function SEARCH = new SearchFind(false);

    /* loaded from: classes3.dex */
    public static final class LeftRight extends Var1or2ArgFunction {
        private static final ValueEval DEFAULT_ARG1 = new NumberEval(1.0d);
        private final boolean _isLeft;

        public LeftRight(boolean z10) {
            this._isLeft = z10;
        }

        @Override // lib.zj.office.fc.hssf.formula.function.Function1Arg
        public ValueEval evaluate(int i10, int i11, ValueEval valueEval) {
            return evaluate(i10, i11, valueEval, DEFAULT_ARG1);
        }

        @Override // lib.zj.office.fc.hssf.formula.function.Function2Arg
        public ValueEval evaluate(int i10, int i11, ValueEval valueEval, ValueEval valueEval2) {
            String substring;
            try {
                String evaluateStringArg = TextFunction.evaluateStringArg(valueEval, i10, i11);
                int evaluateIntArg = TextFunction.evaluateIntArg(valueEval2, i10, i11);
                if (evaluateIntArg < 0) {
                    return ErrorEval.VALUE_INVALID;
                }
                if (this._isLeft) {
                    substring = evaluateStringArg.substring(0, Math.min(evaluateStringArg.length(), evaluateIntArg));
                } else {
                    substring = evaluateStringArg.substring(Math.max(0, evaluateStringArg.length() - evaluateIntArg));
                }
                return new StringEval(substring);
            } catch (EvaluationException e10) {
                return e10.getErrorEval();
            }
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class SingleArgTextFunc extends Fixed1ArgFunction {
        @Override // lib.zj.office.fc.hssf.formula.function.Function1Arg
        public ValueEval evaluate(int i10, int i11, ValueEval valueEval) {
            try {
                return evaluate(TextFunction.evaluateStringArg(valueEval, i10, i11));
            } catch (EvaluationException e10) {
                return e10.getErrorEval();
            }
        }

        public abstract ValueEval evaluate(String str);
    }

    public static final double evaluateDoubleArg(ValueEval valueEval, int i10, int i11) {
        return OperandResolver.coerceValueToDouble(OperandResolver.getSingleValue(valueEval, i10, i11));
    }

    public static final int evaluateIntArg(ValueEval valueEval, int i10, int i11) {
        return OperandResolver.coerceValueToInt(OperandResolver.getSingleValue(valueEval, i10, i11));
    }

    public static final String evaluateStringArg(ValueEval valueEval, int i10, int i11) {
        return OperandResolver.coerceValueToString(OperandResolver.getSingleValue(valueEval, i10, i11));
    }

    @Override // lib.zj.office.fc.hssf.formula.function.Function
    public final ValueEval evaluate(ValueEval[] valueEvalArr, int i10, int i11) {
        try {
            return evaluateFunc(valueEvalArr, i10, i11);
        } catch (EvaluationException e10) {
            return e10.getErrorEval();
        }
    }

    public abstract ValueEval evaluateFunc(ValueEval[] valueEvalArr, int i10, int i11);

    /* loaded from: classes3.dex */
    public static final class SearchFind extends Var2or3ArgFunction {
        private final boolean _isCaseSensitive;

        public SearchFind(boolean z10) {
            this._isCaseSensitive = z10;
        }

        private ValueEval eval(String str, String str2, int i10) {
            int indexOf;
            if (this._isCaseSensitive) {
                indexOf = str.indexOf(str2, i10);
            } else {
                indexOf = str.toUpperCase().indexOf(str2.toUpperCase(), i10);
            }
            if (indexOf == -1) {
                return ErrorEval.VALUE_INVALID;
            }
            return new NumberEval(indexOf + 1);
        }

        @Override // lib.zj.office.fc.hssf.formula.function.Function2Arg
        public ValueEval evaluate(int i10, int i11, ValueEval valueEval, ValueEval valueEval2) {
            try {
                return eval(TextFunction.evaluateStringArg(valueEval2, i10, i11), TextFunction.evaluateStringArg(valueEval, i10, i11), 0);
            } catch (EvaluationException e10) {
                return e10.getErrorEval();
            }
        }

        @Override // lib.zj.office.fc.hssf.formula.function.Function3Arg
        public ValueEval evaluate(int i10, int i11, ValueEval valueEval, ValueEval valueEval2, ValueEval valueEval3) {
            try {
                String evaluateStringArg = TextFunction.evaluateStringArg(valueEval, i10, i11);
                String evaluateStringArg2 = TextFunction.evaluateStringArg(valueEval2, i10, i11);
                int evaluateIntArg = TextFunction.evaluateIntArg(valueEval3, i10, i11) - 1;
                if (evaluateIntArg < 0) {
                    return ErrorEval.VALUE_INVALID;
                }
                return eval(evaluateStringArg2, evaluateStringArg, evaluateIntArg);
            } catch (EvaluationException e10) {
                return e10.getErrorEval();
            }
        }
    }
}

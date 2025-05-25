package lib.zj.office.fc.hssf.formula.eval;

import b.a;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class OperandResolver {
    private static final String Digits = "(\\p{Digit}+)";
    private static final String Exp = "[eE][+-]?(\\p{Digit}+)";
    private static final String fpRegex = "[\\x00-\\x20]*[+-]?(((((\\p{Digit}+)(\\.)?((\\p{Digit}+)?)([eE][+-]?(\\p{Digit}+))?)|(\\.((\\p{Digit}+))([eE][+-]?(\\p{Digit}+))?))))[\\x00-\\x20]*";

    private OperandResolver() {
    }

    public static ValueEval chooseSingleElementFromArea(AreaEval areaEval, int i10, int i11) {
        ValueEval chooseSingleElementFromAreaInternal = chooseSingleElementFromAreaInternal(areaEval, i10, i11);
        if (!(chooseSingleElementFromAreaInternal instanceof ErrorEval)) {
            return chooseSingleElementFromAreaInternal;
        }
        throw new EvaluationException((ErrorEval) chooseSingleElementFromAreaInternal);
    }

    private static ValueEval chooseSingleElementFromAreaInternal(AreaEval areaEval, int i10, int i11) {
        if (areaEval.isColumn()) {
            if (areaEval.isRow()) {
                return areaEval.getRelativeValue(0, 0);
            }
            if (areaEval.containsRow(i10)) {
                return areaEval.getAbsoluteValue(i10, areaEval.getFirstColumn());
            }
            throw EvaluationException.invalidValue();
        } else if (!areaEval.isRow()) {
            if (areaEval.containsRow(i10) && areaEval.containsColumn(i11)) {
                return areaEval.getAbsoluteValue(areaEval.getFirstRow(), areaEval.getFirstColumn());
            }
            throw EvaluationException.invalidValue();
        } else if (areaEval.containsColumn(i11)) {
            return areaEval.getAbsoluteValue(areaEval.getFirstRow(), i11);
        } else {
            throw EvaluationException.invalidValue();
        }
    }

    public static Boolean coerceValueToBoolean(ValueEval valueEval, boolean z10) {
        BlankEval blankEval;
        boolean z11;
        if (valueEval == null || valueEval == (blankEval = BlankEval.instance)) {
            return null;
        }
        if (valueEval instanceof BoolEval) {
            return Boolean.valueOf(((BoolEval) valueEval).getBooleanValue());
        }
        if (valueEval == blankEval) {
            return null;
        }
        if (valueEval instanceof StringEval) {
            if (z10) {
                return null;
            }
            String stringValue = ((StringEval) valueEval).getStringValue();
            if (stringValue.equalsIgnoreCase("true")) {
                return Boolean.TRUE;
            }
            if (stringValue.equalsIgnoreCase("false")) {
                return Boolean.FALSE;
            }
            throw new EvaluationException(ErrorEval.VALUE_INVALID);
        } else if (valueEval instanceof NumericValueEval) {
            double numberValue = ((NumericValueEval) valueEval).getNumberValue();
            if (!Double.isNaN(numberValue)) {
                if (numberValue != 0.0d) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                return Boolean.valueOf(z11);
            }
            throw new EvaluationException(ErrorEval.VALUE_INVALID);
        } else if (valueEval instanceof ErrorEval) {
            throw new EvaluationException((ErrorEval) valueEval);
        } else {
            throw new RuntimeException(a.e(valueEval, new StringBuilder("Unexpected eval ("), ")"));
        }
    }

    public static double coerceValueToDouble(ValueEval valueEval) {
        if (valueEval == BlankEval.instance) {
            return 0.0d;
        }
        if (valueEval instanceof NumericValueEval) {
            return ((NumericValueEval) valueEval).getNumberValue();
        }
        if (valueEval instanceof StringEval) {
            Double parseDouble = parseDouble(((StringEval) valueEval).getStringValue());
            if (parseDouble != null) {
                return parseDouble.doubleValue();
            }
            throw EvaluationException.invalidValue();
        }
        throw new RuntimeException(a.e(valueEval, new StringBuilder("Unexpected arg eval type ("), ")"));
    }

    public static int coerceValueToInt(ValueEval valueEval) {
        if (valueEval == BlankEval.instance) {
            return 0;
        }
        return (int) Math.floor(coerceValueToDouble(valueEval));
    }

    public static String coerceValueToString(ValueEval valueEval) {
        if (valueEval instanceof StringValueEval) {
            return ((StringValueEval) valueEval).getStringValue();
        }
        if (valueEval == BlankEval.instance) {
            return "";
        }
        throw new IllegalArgumentException(a.e(valueEval, new StringBuilder("Unexpected eval class ("), ")"));
    }

    public static ValueEval getSingleValue(ValueEval valueEval, int i10, int i11) {
        if (valueEval instanceof RefEval) {
            valueEval = ((RefEval) valueEval).getInnerValueEval();
        } else if (valueEval instanceof AreaEval) {
            valueEval = chooseSingleElementFromArea((AreaEval) valueEval, i10, i11);
        }
        if (!(valueEval instanceof ErrorEval)) {
            if (valueEval instanceof RefEval) {
                return getSingleValue(valueEval, i10, i11);
            }
            return valueEval;
        }
        throw new EvaluationException((ErrorEval) valueEval);
    }

    public static Double parseDouble(String str) {
        if (Pattern.matches(fpRegex, str)) {
            try {
                return Double.valueOf(Double.parseDouble(str));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }
}

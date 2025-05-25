package lib.zj.office.fc.hssf.formula.function;

import a0.d;
import androidx.activity.r;
import b.a;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.regex.Pattern;
import lib.zj.office.fc.hssf.formula.TwoDEval;
import lib.zj.office.fc.hssf.formula.eval.BlankEval;
import lib.zj.office.fc.hssf.formula.eval.BoolEval;
import lib.zj.office.fc.hssf.formula.eval.ErrorEval;
import lib.zj.office.fc.hssf.formula.eval.EvaluationException;
import lib.zj.office.fc.hssf.formula.eval.NumberEval;
import lib.zj.office.fc.hssf.formula.eval.OperandResolver;
import lib.zj.office.fc.hssf.formula.eval.RefEval;
import lib.zj.office.fc.hssf.formula.eval.StringEval;
import lib.zj.office.fc.hssf.formula.eval.ValueEval;
import lib.zj.office.fc.hssf.formula.function.CountUtils;
import lib.zj.office.fc.ss.usermodel.ErrorConstants;

/* loaded from: classes3.dex */
public final class Countif extends Fixed2ArgFunction {

    /* loaded from: classes3.dex */
    public static final class ErrorMatcher extends MatcherBase {
        private final int _value;

        public ErrorMatcher(int i10, CmpOp cmpOp) {
            super(cmpOp);
            this._value = i10;
        }

        @Override // lib.zj.office.fc.hssf.formula.function.Countif.MatcherBase
        public String getValueText() {
            return ErrorConstants.getText(this._value);
        }

        @Override // lib.zj.office.fc.hssf.formula.function.CountUtils.I_MatchPredicate
        public boolean matches(ValueEval valueEval) {
            if (valueEval instanceof ErrorEval) {
                return evaluate(((ErrorEval) valueEval).getErrorCode() - this._value);
            }
            return false;
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class MatcherBase implements CountUtils.I_MatchPredicate {
        private final CmpOp _operator;

        public MatcherBase(CmpOp cmpOp) {
            this._operator = cmpOp;
        }

        public final boolean evaluate(int i10) {
            return this._operator.evaluate(i10);
        }

        public final int getCode() {
            return this._operator.getCode();
        }

        public abstract String getValueText();

        public final String toString() {
            StringBuffer stringBuffer = new StringBuffer(64);
            stringBuffer.append(getClass().getName());
            stringBuffer.append(" [");
            stringBuffer.append(this._operator.getRepresentation());
            stringBuffer.append(getValueText());
            stringBuffer.append("]");
            return stringBuffer.toString();
        }

        public final boolean evaluate(boolean z10) {
            return this._operator.evaluate(z10);
        }
    }

    /* loaded from: classes3.dex */
    public static final class NumberMatcher extends MatcherBase {
        private final double _value;

        public NumberMatcher(double d10, CmpOp cmpOp) {
            super(cmpOp);
            this._value = d10;
        }

        @Override // lib.zj.office.fc.hssf.formula.function.Countif.MatcherBase
        public String getValueText() {
            return String.valueOf(this._value);
        }

        @Override // lib.zj.office.fc.hssf.formula.function.CountUtils.I_MatchPredicate
        public boolean matches(ValueEval valueEval) {
            if (valueEval instanceof StringEval) {
                int code = getCode();
                if (code != 0 && code != 1) {
                    if (code != 2) {
                        return false;
                    }
                    return true;
                }
                Double parseDouble = OperandResolver.parseDouble(((StringEval) valueEval).getStringValue());
                if (parseDouble == null || this._value != parseDouble.doubleValue()) {
                    return false;
                }
                return true;
            } else if (!(valueEval instanceof NumberEval)) {
                return false;
            } else {
                return evaluate(Double.compare(((NumberEval) valueEval).getNumberValue(), this._value));
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class StringMatcher extends MatcherBase {
        private final Pattern _pattern;
        private final String _value;

        public StringMatcher(String str, CmpOp cmpOp) {
            super(cmpOp);
            this._value = str;
            int code = cmpOp.getCode();
            if (code != 0 && code != 1 && code != 2) {
                this._pattern = null;
            } else {
                this._pattern = getWildCardPattern(str);
            }
        }

        private static Pattern getWildCardPattern(String str) {
            char charAt;
            int length = str.length();
            StringBuffer stringBuffer = new StringBuffer(length);
            int i10 = 0;
            boolean z10 = false;
            while (i10 < length) {
                char charAt2 = str.charAt(i10);
                if (charAt2 != '$' && charAt2 != '.') {
                    if (charAt2 != '?') {
                        if (charAt2 != '[') {
                            if (charAt2 != '~') {
                                if (charAt2 != ']' && charAt2 != '^') {
                                    switch (charAt2) {
                                        case '(':
                                        case ')':
                                            break;
                                        case '*':
                                            stringBuffer.append(".*");
                                            break;
                                        default:
                                            stringBuffer.append(charAt2);
                                            break;
                                    }
                                }
                            } else {
                                int i11 = i10 + 1;
                                if (i11 < length && ((charAt = str.charAt(i11)) == '*' || charAt == '?')) {
                                    stringBuffer.append('[');
                                    stringBuffer.append(charAt);
                                    stringBuffer.append(']');
                                    i10 = i11;
                                } else {
                                    stringBuffer.append('~');
                                }
                            }
                            i10++;
                        }
                    } else {
                        stringBuffer.append('.');
                    }
                    z10 = true;
                    i10++;
                }
                stringBuffer.append("\\");
                stringBuffer.append(charAt2);
                i10++;
            }
            if (z10) {
                return Pattern.compile(stringBuffer.toString());
            }
            return null;
        }

        @Override // lib.zj.office.fc.hssf.formula.function.Countif.MatcherBase
        public String getValueText() {
            Pattern pattern = this._pattern;
            if (pattern == null) {
                return this._value;
            }
            return pattern.pattern();
        }

        @Override // lib.zj.office.fc.hssf.formula.function.CountUtils.I_MatchPredicate
        public boolean matches(ValueEval valueEval) {
            if (valueEval instanceof BlankEval) {
                int code = getCode();
                if ((code != 0 && code != 1) || this._value.length() != 0) {
                    return false;
                }
                return true;
            } else if (!(valueEval instanceof StringEval)) {
                return false;
            } else {
                String stringValue = ((StringEval) valueEval).getStringValue();
                if (stringValue.length() < 1 && this._value.length() < 1) {
                    int code2 = getCode();
                    if (code2 != 0 && code2 != 2) {
                        return false;
                    }
                    return true;
                }
                Pattern pattern = this._pattern;
                if (pattern != null) {
                    return evaluate(pattern.matcher(stringValue).matches());
                }
                return evaluate(stringValue.compareTo(this._value));
            }
        }
    }

    private double countMatchingCellsInArea(ValueEval valueEval, CountUtils.I_MatchPredicate i_MatchPredicate) {
        int countMatchingCellsInArea;
        if (valueEval instanceof RefEval) {
            countMatchingCellsInArea = CountUtils.countMatchingCell((RefEval) valueEval, i_MatchPredicate);
        } else if (valueEval instanceof TwoDEval) {
            countMatchingCellsInArea = CountUtils.countMatchingCellsInArea((TwoDEval) valueEval, i_MatchPredicate);
        } else {
            throw new IllegalArgumentException(a.e(valueEval, new StringBuilder("Bad range arg type ("), ")"));
        }
        return countMatchingCellsInArea;
    }

    public static CountUtils.I_MatchPredicate createCriteriaPredicate(ValueEval valueEval, int i10, int i11) {
        ValueEval evaluateCriteriaArg = evaluateCriteriaArg(valueEval, i10, i11);
        if (evaluateCriteriaArg instanceof NumberEval) {
            return new NumberMatcher(((NumberEval) evaluateCriteriaArg).getNumberValue(), CmpOp.OP_NONE);
        }
        if (evaluateCriteriaArg instanceof BoolEval) {
            return new BooleanMatcher(((BoolEval) evaluateCriteriaArg).getBooleanValue(), CmpOp.OP_NONE);
        }
        if (evaluateCriteriaArg instanceof StringEval) {
            return createGeneralMatchPredicate((StringEval) evaluateCriteriaArg);
        }
        if (evaluateCriteriaArg instanceof ErrorEval) {
            return new ErrorMatcher(((ErrorEval) evaluateCriteriaArg).getErrorCode(), CmpOp.OP_NONE);
        }
        if (evaluateCriteriaArg == BlankEval.instance) {
            return null;
        }
        throw new RuntimeException(a.e(evaluateCriteriaArg, new StringBuilder("Unexpected type for criteria ("), ")"));
    }

    private static CountUtils.I_MatchPredicate createGeneralMatchPredicate(StringEval stringEval) {
        String stringValue = stringEval.getStringValue();
        CmpOp operator = CmpOp.getOperator(stringValue);
        String substring = stringValue.substring(operator.getLength());
        Boolean parseBoolean = parseBoolean(substring);
        if (parseBoolean != null) {
            return new BooleanMatcher(parseBoolean.booleanValue(), operator);
        }
        Double parseDouble = OperandResolver.parseDouble(substring);
        if (parseDouble != null) {
            return new NumberMatcher(parseDouble.doubleValue(), operator);
        }
        ErrorEval parseError = parseError(substring);
        if (parseError != null) {
            return new ErrorMatcher(parseError.getErrorCode(), operator);
        }
        return new StringMatcher(substring, operator);
    }

    private static ValueEval evaluateCriteriaArg(ValueEval valueEval, int i10, int i11) {
        try {
            return OperandResolver.getSingleValue(valueEval, i10, (short) i11);
        } catch (EvaluationException e10) {
            return e10.getErrorEval();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001c, code lost:
        if (r0 != 't') goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Boolean parseBoolean(java.lang.String r3) {
        /*
            int r0 = r3.length()
            r1 = 1
            r2 = 0
            if (r0 >= r1) goto L9
            return r2
        L9:
            r0 = 0
            char r0 = r3.charAt(r0)
            r1 = 70
            if (r0 == r1) goto L2a
            r1 = 84
            if (r0 == r1) goto L1f
            r1 = 102(0x66, float:1.43E-43)
            if (r0 == r1) goto L2a
            r1 = 116(0x74, float:1.63E-43)
            if (r0 == r1) goto L1f
            goto L35
        L1f:
            java.lang.String r0 = "TRUE"
            boolean r3 = r0.equalsIgnoreCase(r3)
            if (r3 == 0) goto L35
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            return r3
        L2a:
            java.lang.String r0 = "FALSE"
            boolean r3 = r0.equalsIgnoreCase(r3)
            if (r3 == 0) goto L35
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            return r3
        L35:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: lib.zj.office.fc.hssf.formula.function.Countif.parseBoolean(java.lang.String):java.lang.Boolean");
    }

    private static ErrorEval parseError(String str) {
        if (str.length() >= 4 && str.charAt(0) == '#') {
            if (str.equals("#NULL!")) {
                return ErrorEval.NULL_INTERSECTION;
            }
            if (str.equals("#DIV/0!")) {
                return ErrorEval.DIV_ZERO;
            }
            if (str.equals("#VALUE!")) {
                return ErrorEval.VALUE_INVALID;
            }
            if (str.equals("#REF!")) {
                return ErrorEval.REF_INVALID;
            }
            if (str.equals("#NAME?")) {
                return ErrorEval.NAME_INVALID;
            }
            if (str.equals("#NUM!")) {
                return ErrorEval.NUM_ERROR;
            }
            if (str.equals("#N/A")) {
                return ErrorEval.NA;
            }
        }
        return null;
    }

    @Override // lib.zj.office.fc.hssf.formula.function.Function2Arg
    public ValueEval evaluate(int i10, int i11, ValueEval valueEval, ValueEval valueEval2) {
        CountUtils.I_MatchPredicate createCriteriaPredicate = createCriteriaPredicate(valueEval2, i10, i11);
        if (createCriteriaPredicate == null) {
            return NumberEval.ZERO;
        }
        return new NumberEval(countMatchingCellsInArea(valueEval, createCriteriaPredicate));
    }

    /* loaded from: classes3.dex */
    public static final class CmpOp {
        public static final int EQ = 1;
        public static final int GE = 6;
        public static final int GT = 5;
        public static final int LE = 3;
        public static final int LT = 4;
        public static final int NE = 2;
        public static final int NONE = 0;
        private final int _code;
        private final String _representation;
        public static final CmpOp OP_NONE = op("", 0);
        public static final CmpOp OP_EQ = op("=", 1);
        public static final CmpOp OP_NE = op("<>", 2);
        public static final CmpOp OP_LE = op("<=", 3);
        public static final CmpOp OP_LT = op("<", 4);
        public static final CmpOp OP_GT = op(">", 5);
        public static final CmpOp OP_GE = op(">=", 6);

        private CmpOp(String str, int i10) {
            this._representation = str;
            this._code = i10;
        }

        public static CmpOp getOperator(String str) {
            int length = str.length();
            if (length < 1) {
                return OP_NONE;
            }
            switch (str.charAt(0)) {
                case '<':
                    if (length > 1) {
                        char charAt = str.charAt(1);
                        if (charAt != '=') {
                            if (charAt == '>') {
                                return OP_NE;
                            }
                        } else {
                            return OP_LE;
                        }
                    }
                    return OP_LT;
                case '=':
                    return OP_EQ;
                case '>':
                    if (length > 1 && str.charAt(1) == '=') {
                        return OP_GE;
                    }
                    return OP_GT;
                default:
                    return OP_NONE;
            }
        }

        private static CmpOp op(String str, int i10) {
            return new CmpOp(str, i10);
        }

        public boolean evaluate(boolean z10) {
            int i10 = this._code;
            if (i10 == 0 || i10 == 1) {
                return z10;
            }
            if (i10 == 2) {
                return !z10;
            }
            throw new RuntimeException(r.g(new StringBuilder("Cannot call boolean evaluate on non-equality operator '"), this._representation, OperatorName.SHOW_TEXT_LINE));
        }

        public int getCode() {
            return this._code;
        }

        public int getLength() {
            return this._representation.length();
        }

        public String getRepresentation() {
            return this._representation;
        }

        public String toString() {
            StringBuffer stringBuffer = new StringBuffer(64);
            d.h(CmpOp.class, stringBuffer, " [");
            stringBuffer.append(this._representation);
            stringBuffer.append("]");
            return stringBuffer.toString();
        }

        public boolean evaluate(int i10) {
            switch (this._code) {
                case 0:
                case 1:
                    return i10 == 0;
                case 2:
                    return i10 != 0;
                case 3:
                    return i10 <= 0;
                case 4:
                    return i10 < 0;
                case 5:
                    return i10 > 0;
                case 6:
                    return i10 <= 0;
                default:
                    throw new RuntimeException(r.g(new StringBuilder("Cannot call boolean evaluate on non-equality operator '"), this._representation, OperatorName.SHOW_TEXT_LINE));
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class BooleanMatcher extends MatcherBase {
        private final int _value;

        public BooleanMatcher(boolean z10, CmpOp cmpOp) {
            super(cmpOp);
            this._value = boolToInt(z10);
        }

        @Override // lib.zj.office.fc.hssf.formula.function.Countif.MatcherBase
        public String getValueText() {
            if (this._value == 1) {
                return "TRUE";
            }
            return "FALSE";
        }

        @Override // lib.zj.office.fc.hssf.formula.function.CountUtils.I_MatchPredicate
        public boolean matches(ValueEval valueEval) {
            if ((valueEval instanceof StringEval) || !(valueEval instanceof BoolEval)) {
                return false;
            }
            return evaluate(boolToInt(((BoolEval) valueEval).getBooleanValue()) - this._value);
        }

        private static int boolToInt(boolean z10) {
            return z10 ? 1 : 0;
        }
    }
}

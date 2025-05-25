package lib.zj.office.fc.hssf.formula.eval;

import b.a;
import lib.zj.office.fc.hssf.formula.function.Fixed2ArgFunction;
import lib.zj.office.fc.hssf.formula.function.Function;
import lib.zj.office.fc.ss.util.NumberComparer;

/* loaded from: classes3.dex */
public abstract class RelationalOperationEval extends Fixed2ArgFunction {
    public static final Function EqualEval = new RelationalOperationEval() { // from class: lib.zj.office.fc.hssf.formula.eval.RelationalOperationEval.1
        @Override // lib.zj.office.fc.hssf.formula.eval.RelationalOperationEval
        public boolean convertComparisonResult(int i10) {
            if (i10 == 0) {
                return true;
            }
            return false;
        }
    };
    public static final Function GreaterEqualEval = new RelationalOperationEval() { // from class: lib.zj.office.fc.hssf.formula.eval.RelationalOperationEval.2
        @Override // lib.zj.office.fc.hssf.formula.eval.RelationalOperationEval
        public boolean convertComparisonResult(int i10) {
            if (i10 >= 0) {
                return true;
            }
            return false;
        }
    };
    public static final Function GreaterThanEval = new RelationalOperationEval() { // from class: lib.zj.office.fc.hssf.formula.eval.RelationalOperationEval.3
        @Override // lib.zj.office.fc.hssf.formula.eval.RelationalOperationEval
        public boolean convertComparisonResult(int i10) {
            if (i10 > 0) {
                return true;
            }
            return false;
        }
    };
    public static final Function LessEqualEval = new RelationalOperationEval() { // from class: lib.zj.office.fc.hssf.formula.eval.RelationalOperationEval.4
        @Override // lib.zj.office.fc.hssf.formula.eval.RelationalOperationEval
        public boolean convertComparisonResult(int i10) {
            if (i10 <= 0) {
                return true;
            }
            return false;
        }
    };
    public static final Function LessThanEval = new RelationalOperationEval() { // from class: lib.zj.office.fc.hssf.formula.eval.RelationalOperationEval.5
        @Override // lib.zj.office.fc.hssf.formula.eval.RelationalOperationEval
        public boolean convertComparisonResult(int i10) {
            if (i10 < 0) {
                return true;
            }
            return false;
        }
    };
    public static final Function NotEqualEval = new RelationalOperationEval() { // from class: lib.zj.office.fc.hssf.formula.eval.RelationalOperationEval.6
        @Override // lib.zj.office.fc.hssf.formula.eval.RelationalOperationEval
        public boolean convertComparisonResult(int i10) {
            if (i10 != 0) {
                return true;
            }
            return false;
        }
    };

    private static int compareBlank(ValueEval valueEval) {
        if (valueEval == BlankEval.instance) {
            return 0;
        }
        if (valueEval instanceof BoolEval) {
            if (!((BoolEval) valueEval).getBooleanValue()) {
                return 0;
            }
            return -1;
        } else if (valueEval instanceof NumberEval) {
            return NumberComparer.compare(0.0d, ((NumberEval) valueEval).getNumberValue());
        } else {
            if (valueEval instanceof StringEval) {
                if (((StringEval) valueEval).getStringValue().length() < 1) {
                    return 0;
                }
                return -1;
            }
            throw new IllegalArgumentException(a.e(valueEval, new StringBuilder("bad value class ("), ")"));
        }
    }

    private static int doCompare(ValueEval valueEval, ValueEval valueEval2) {
        BlankEval blankEval = BlankEval.instance;
        if (valueEval == blankEval) {
            return compareBlank(valueEval2);
        }
        if (valueEval2 == blankEval) {
            return -compareBlank(valueEval);
        }
        if (valueEval instanceof BoolEval) {
            if (!(valueEval2 instanceof BoolEval)) {
                return 1;
            }
            BoolEval boolEval = (BoolEval) valueEval;
            if (boolEval.getBooleanValue() == ((BoolEval) valueEval2).getBooleanValue()) {
                return 0;
            }
            if (boolEval.getBooleanValue()) {
                return 1;
            }
            return -1;
        } else if (valueEval2 instanceof BoolEval) {
            return -1;
        } else {
            if (valueEval instanceof StringEval) {
                if (!(valueEval2 instanceof StringEval)) {
                    return 1;
                }
                return ((StringEval) valueEval).getStringValue().compareToIgnoreCase(((StringEval) valueEval2).getStringValue());
            } else if (valueEval2 instanceof StringEval) {
                return -1;
            } else {
                if ((valueEval instanceof NumberEval) && (valueEval2 instanceof NumberEval)) {
                    return NumberComparer.compare(((NumberEval) valueEval).getNumberValue(), ((NumberEval) valueEval2).getNumberValue());
                }
                throw new IllegalArgumentException("Bad operand types (" + valueEval.getClass().getName() + "), (" + valueEval2.getClass().getName() + ")");
            }
        }
    }

    public abstract boolean convertComparisonResult(int i10);

    @Override // lib.zj.office.fc.hssf.formula.function.Function2Arg
    public ValueEval evaluate(int i10, int i11, ValueEval valueEval, ValueEval valueEval2) {
        try {
            return BoolEval.valueOf(convertComparisonResult(doCompare(OperandResolver.getSingleValue(valueEval, i10, i11), OperandResolver.getSingleValue(valueEval2, i10, i11))));
        } catch (EvaluationException e10) {
            return e10.getErrorEval();
        }
    }
}

package lib.zj.office.fc.hssf.formula.function;

import lib.zj.office.fc.hssf.formula.eval.AreaEval;
import lib.zj.office.fc.hssf.formula.eval.BlankEval;
import lib.zj.office.fc.hssf.formula.eval.BoolEval;
import lib.zj.office.fc.hssf.formula.eval.ErrorEval;
import lib.zj.office.fc.hssf.formula.eval.EvaluationException;
import lib.zj.office.fc.hssf.formula.eval.NumberEval;
import lib.zj.office.fc.hssf.formula.eval.OperandResolver;
import lib.zj.office.fc.hssf.formula.eval.RefEval;
import lib.zj.office.fc.hssf.formula.eval.StringEval;
import lib.zj.office.fc.hssf.formula.eval.ValueEval;

/* loaded from: classes3.dex */
public abstract class LogicalFunction extends Fixed1ArgFunction {
    public static final Function ISLOGICAL = new LogicalFunction() { // from class: lib.zj.office.fc.hssf.formula.function.LogicalFunction.1
        @Override // lib.zj.office.fc.hssf.formula.function.LogicalFunction
        public boolean evaluate(ValueEval valueEval) {
            return valueEval instanceof BoolEval;
        }
    };
    public static final Function ISNONTEXT = new LogicalFunction() { // from class: lib.zj.office.fc.hssf.formula.function.LogicalFunction.2
        @Override // lib.zj.office.fc.hssf.formula.function.LogicalFunction
        public boolean evaluate(ValueEval valueEval) {
            return !(valueEval instanceof StringEval);
        }
    };
    public static final Function ISNUMBER = new LogicalFunction() { // from class: lib.zj.office.fc.hssf.formula.function.LogicalFunction.3
        @Override // lib.zj.office.fc.hssf.formula.function.LogicalFunction
        public boolean evaluate(ValueEval valueEval) {
            return valueEval instanceof NumberEval;
        }
    };
    public static final Function ISTEXT = new LogicalFunction() { // from class: lib.zj.office.fc.hssf.formula.function.LogicalFunction.4
        @Override // lib.zj.office.fc.hssf.formula.function.LogicalFunction
        public boolean evaluate(ValueEval valueEval) {
            return valueEval instanceof StringEval;
        }
    };
    public static final Function ISBLANK = new LogicalFunction() { // from class: lib.zj.office.fc.hssf.formula.function.LogicalFunction.5
        @Override // lib.zj.office.fc.hssf.formula.function.LogicalFunction
        public boolean evaluate(ValueEval valueEval) {
            return valueEval instanceof BlankEval;
        }
    };
    public static final Function ISERROR = new LogicalFunction() { // from class: lib.zj.office.fc.hssf.formula.function.LogicalFunction.6
        @Override // lib.zj.office.fc.hssf.formula.function.LogicalFunction
        public boolean evaluate(ValueEval valueEval) {
            return valueEval instanceof ErrorEval;
        }
    };
    public static final Function ISNA = new LogicalFunction() { // from class: lib.zj.office.fc.hssf.formula.function.LogicalFunction.7
        @Override // lib.zj.office.fc.hssf.formula.function.LogicalFunction
        public boolean evaluate(ValueEval valueEval) {
            if (valueEval == ErrorEval.NA) {
                return true;
            }
            return false;
        }
    };
    public static final Function ISREF = new Fixed1ArgFunction() { // from class: lib.zj.office.fc.hssf.formula.function.LogicalFunction.8
        @Override // lib.zj.office.fc.hssf.formula.function.Function1Arg
        public ValueEval evaluate(int i10, int i11, ValueEval valueEval) {
            if (!(valueEval instanceof RefEval) && !(valueEval instanceof AreaEval)) {
                return BoolEval.FALSE;
            }
            return BoolEval.TRUE;
        }
    };

    @Override // lib.zj.office.fc.hssf.formula.function.Function1Arg
    public ValueEval evaluate(int i10, int i11, ValueEval valueEval) {
        ValueEval errorEval;
        try {
            errorEval = OperandResolver.getSingleValue(valueEval, i10, i11);
        } catch (EvaluationException e10) {
            errorEval = e10.getErrorEval();
        }
        return BoolEval.valueOf(evaluate(errorEval));
    }

    public abstract boolean evaluate(ValueEval valueEval);
}

package lib.zj.office.fc.hssf.formula;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;
import lib.zj.office.fc.hssf.formula.eval.ConcatEval;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;
import lib.zj.office.fc.hssf.formula.eval.IntersectionEval;
import lib.zj.office.fc.hssf.formula.eval.PercentEval;
import lib.zj.office.fc.hssf.formula.eval.RangeEval;
import lib.zj.office.fc.hssf.formula.eval.RelationalOperationEval;
import lib.zj.office.fc.hssf.formula.eval.TwoOperandNumericOperation;
import lib.zj.office.fc.hssf.formula.eval.UnaryMinusEval;
import lib.zj.office.fc.hssf.formula.eval.UnaryPlusEval;
import lib.zj.office.fc.hssf.formula.eval.ValueEval;
import lib.zj.office.fc.hssf.formula.function.Function;
import lib.zj.office.fc.hssf.formula.function.Indirect;
import lib.zj.office.fc.hssf.formula.ptg.AbstractFunctionPtg;
import lib.zj.office.fc.hssf.formula.ptg.AddPtg;
import lib.zj.office.fc.hssf.formula.ptg.ConcatPtg;
import lib.zj.office.fc.hssf.formula.ptg.DividePtg;
import lib.zj.office.fc.hssf.formula.ptg.EqualPtg;
import lib.zj.office.fc.hssf.formula.ptg.GreaterEqualPtg;
import lib.zj.office.fc.hssf.formula.ptg.GreaterThanPtg;
import lib.zj.office.fc.hssf.formula.ptg.IntersectionPtg;
import lib.zj.office.fc.hssf.formula.ptg.LessEqualPtg;
import lib.zj.office.fc.hssf.formula.ptg.LessThanPtg;
import lib.zj.office.fc.hssf.formula.ptg.MultiplyPtg;
import lib.zj.office.fc.hssf.formula.ptg.NotEqualPtg;
import lib.zj.office.fc.hssf.formula.ptg.OperationPtg;
import lib.zj.office.fc.hssf.formula.ptg.PercentPtg;
import lib.zj.office.fc.hssf.formula.ptg.PowerPtg;
import lib.zj.office.fc.hssf.formula.ptg.RangePtg;
import lib.zj.office.fc.hssf.formula.ptg.SubtractPtg;
import lib.zj.office.fc.hssf.formula.ptg.UnaryMinusPtg;
import lib.zj.office.fc.hssf.formula.ptg.UnaryPlusPtg;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class OperationEvaluatorFactory {
    private static final Map<OperationPtg, Function> _instancesByPtgClass = initialiseInstancesMap();

    private OperationEvaluatorFactory() {
    }

    public static ValueEval evaluate(OperationPtg operationPtg, ValueEval[] valueEvalArr, OperationEvaluationContext operationEvaluationContext) {
        if (operationPtg != null) {
            Function function = _instancesByPtgClass.get(operationPtg);
            if (function != null) {
                return function.evaluate(valueEvalArr, operationEvaluationContext.getRowIndex(), (short) operationEvaluationContext.getColumnIndex());
            }
            if (operationPtg instanceof AbstractFunctionPtg) {
                short functionIndex = ((AbstractFunctionPtg) operationPtg).getFunctionIndex();
                if (functionIndex != 148) {
                    if (functionIndex != 255) {
                        return FunctionEval.getBasicFunction(functionIndex).evaluate(valueEvalArr, operationEvaluationContext.getRowIndex(), (short) operationEvaluationContext.getColumnIndex());
                    }
                    return UserDefinedFunction.instance.evaluate(valueEvalArr, operationEvaluationContext);
                }
                return Indirect.instance.evaluate(valueEvalArr, operationEvaluationContext);
            }
            throw new RuntimeException("Unexpected operation ptg class (" + operationPtg.getClass().getName() + ")");
        }
        throw new IllegalArgumentException("ptg must not be null");
    }

    private static Map<OperationPtg, Function> initialiseInstancesMap() {
        HashMap hashMap = new HashMap(32);
        put(hashMap, EqualPtg.instance, RelationalOperationEval.EqualEval);
        put(hashMap, GreaterEqualPtg.instance, RelationalOperationEval.GreaterEqualEval);
        put(hashMap, GreaterThanPtg.instance, RelationalOperationEval.GreaterThanEval);
        put(hashMap, LessEqualPtg.instance, RelationalOperationEval.LessEqualEval);
        put(hashMap, LessThanPtg.instance, RelationalOperationEval.LessThanEval);
        put(hashMap, NotEqualPtg.instance, RelationalOperationEval.NotEqualEval);
        put(hashMap, ConcatPtg.instance, ConcatEval.instance);
        put(hashMap, AddPtg.instance, TwoOperandNumericOperation.AddEval);
        put(hashMap, DividePtg.instance, TwoOperandNumericOperation.DivideEval);
        put(hashMap, MultiplyPtg.instance, TwoOperandNumericOperation.MultiplyEval);
        put(hashMap, PercentPtg.instance, PercentEval.instance);
        put(hashMap, PowerPtg.instance, TwoOperandNumericOperation.PowerEval);
        put(hashMap, SubtractPtg.instance, TwoOperandNumericOperation.SubtractEval);
        put(hashMap, UnaryMinusPtg.instance, UnaryMinusEval.instance);
        put(hashMap, UnaryPlusPtg.instance, UnaryPlusEval.instance);
        put(hashMap, RangePtg.instance, RangeEval.instance);
        put(hashMap, IntersectionPtg.instance, IntersectionEval.instance);
        return hashMap;
    }

    private static void put(Map<OperationPtg, Function> map, OperationPtg operationPtg, Function function) {
        Constructor<?>[] declaredConstructors = operationPtg.getClass().getDeclaredConstructors();
        if (declaredConstructors.length <= 1 && Modifier.isPrivate(declaredConstructors[0].getModifiers())) {
            map.put(operationPtg, function);
            return;
        }
        throw new RuntimeException("Failed to verify instance (" + operationPtg.getClass().getName() + ") is a singleton.");
    }
}

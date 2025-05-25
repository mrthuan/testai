package com.tom_roush.pdfbox.pdmodel.common.function.type4;

import java.util.Stack;

/* loaded from: classes2.dex */
class RelationalOperators {

    /* loaded from: classes2.dex */
    public static abstract class AbstractNumberComparisonOperator implements Operator {
        private AbstractNumberComparisonOperator() {
        }

        public /* synthetic */ AbstractNumberComparisonOperator(int i10) {
            this();
        }

        public abstract boolean compare(Number number, Number number2);

        @Override // com.tom_roush.pdfbox.pdmodel.common.function.type4.Operator
        public void execute(ExecutionContext executionContext) {
            Stack<Object> stack = executionContext.getStack();
            stack.push(Boolean.valueOf(compare((Number) stack.pop(), (Number) stack.pop())));
        }
    }

    /* loaded from: classes2.dex */
    public static class Eq implements Operator {
        @Override // com.tom_roush.pdfbox.pdmodel.common.function.type4.Operator
        public void execute(ExecutionContext executionContext) {
            Stack<Object> stack = executionContext.getStack();
            stack.push(Boolean.valueOf(isEqual(stack.pop(), stack.pop())));
        }

        public boolean isEqual(Object obj, Object obj2) {
            if ((obj instanceof Number) && (obj2 instanceof Number)) {
                if (((Number) obj).floatValue() == ((Number) obj2).floatValue()) {
                    return true;
                }
                return false;
            }
            return obj.equals(obj2);
        }
    }

    /* loaded from: classes2.dex */
    public static class Ge extends AbstractNumberComparisonOperator {
        public Ge() {
            super(0);
        }

        @Override // com.tom_roush.pdfbox.pdmodel.common.function.type4.RelationalOperators.AbstractNumberComparisonOperator
        public boolean compare(Number number, Number number2) {
            if (number.floatValue() >= number2.floatValue()) {
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes2.dex */
    public static class Gt extends AbstractNumberComparisonOperator {
        public Gt() {
            super(0);
        }

        @Override // com.tom_roush.pdfbox.pdmodel.common.function.type4.RelationalOperators.AbstractNumberComparisonOperator
        public boolean compare(Number number, Number number2) {
            if (number.floatValue() > number2.floatValue()) {
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes2.dex */
    public static class Le extends AbstractNumberComparisonOperator {
        public Le() {
            super(0);
        }

        @Override // com.tom_roush.pdfbox.pdmodel.common.function.type4.RelationalOperators.AbstractNumberComparisonOperator
        public boolean compare(Number number, Number number2) {
            if (number.floatValue() <= number2.floatValue()) {
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes2.dex */
    public static class Lt extends AbstractNumberComparisonOperator {
        public Lt() {
            super(0);
        }

        @Override // com.tom_roush.pdfbox.pdmodel.common.function.type4.RelationalOperators.AbstractNumberComparisonOperator
        public boolean compare(Number number, Number number2) {
            if (number.floatValue() < number2.floatValue()) {
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes2.dex */
    public static class Ne extends Eq {
        @Override // com.tom_roush.pdfbox.pdmodel.common.function.type4.RelationalOperators.Eq
        public boolean isEqual(Object obj, Object obj2) {
            return !super.isEqual(obj, obj2);
        }
    }

    private RelationalOperators() {
    }
}

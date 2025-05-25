package com.tom_roush.pdfbox.pdmodel.common.function.type4;

import java.util.Stack;

/* loaded from: classes2.dex */
class BitwiseOperators {

    /* loaded from: classes2.dex */
    public static abstract class AbstractLogicalOperator implements Operator {
        private AbstractLogicalOperator() {
        }

        public /* synthetic */ AbstractLogicalOperator(int i10) {
            this();
        }

        public abstract boolean applyForBoolean(boolean z10, boolean z11);

        public abstract int applyforInteger(int i10, int i11);

        @Override // com.tom_roush.pdfbox.pdmodel.common.function.type4.Operator
        public void execute(ExecutionContext executionContext) {
            Stack<Object> stack = executionContext.getStack();
            Object pop = stack.pop();
            Object pop2 = stack.pop();
            if ((pop2 instanceof Boolean) && (pop instanceof Boolean)) {
                stack.push(Boolean.valueOf(applyForBoolean(((Boolean) pop2).booleanValue(), ((Boolean) pop).booleanValue())));
            } else if ((pop2 instanceof Integer) && (pop instanceof Integer)) {
                stack.push(Integer.valueOf(applyforInteger(((Integer) pop2).intValue(), ((Integer) pop).intValue())));
            } else {
                throw new ClassCastException("Operands must be bool/bool or int/int");
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class And extends AbstractLogicalOperator {
        public And() {
            super(0);
        }

        @Override // com.tom_roush.pdfbox.pdmodel.common.function.type4.BitwiseOperators.AbstractLogicalOperator
        public boolean applyForBoolean(boolean z10, boolean z11) {
            if (z10 && z11) {
                return true;
            }
            return false;
        }

        @Override // com.tom_roush.pdfbox.pdmodel.common.function.type4.BitwiseOperators.AbstractLogicalOperator
        public int applyforInteger(int i10, int i11) {
            return i10 & i11;
        }
    }

    /* loaded from: classes2.dex */
    public static class Bitshift implements Operator {
        @Override // com.tom_roush.pdfbox.pdmodel.common.function.type4.Operator
        public void execute(ExecutionContext executionContext) {
            Stack<Object> stack = executionContext.getStack();
            int intValue = ((Integer) stack.pop()).intValue();
            int intValue2 = ((Integer) stack.pop()).intValue();
            if (intValue < 0) {
                stack.push(Integer.valueOf(intValue2 >> Math.abs(intValue)));
            } else {
                stack.push(Integer.valueOf(intValue2 << intValue));
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class False implements Operator {
        @Override // com.tom_roush.pdfbox.pdmodel.common.function.type4.Operator
        public void execute(ExecutionContext executionContext) {
            executionContext.getStack().push(Boolean.FALSE);
        }
    }

    /* loaded from: classes2.dex */
    public static class Not implements Operator {
        @Override // com.tom_roush.pdfbox.pdmodel.common.function.type4.Operator
        public void execute(ExecutionContext executionContext) {
            Stack<Object> stack = executionContext.getStack();
            Object pop = stack.pop();
            if (pop instanceof Boolean) {
                stack.push(Boolean.valueOf(!((Boolean) pop).booleanValue()));
            } else if (pop instanceof Integer) {
                stack.push(Integer.valueOf(-((Integer) pop).intValue()));
            } else {
                throw new ClassCastException("Operand must be bool or int");
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class Or extends AbstractLogicalOperator {
        public Or() {
            super(0);
        }

        @Override // com.tom_roush.pdfbox.pdmodel.common.function.type4.BitwiseOperators.AbstractLogicalOperator
        public boolean applyForBoolean(boolean z10, boolean z11) {
            if (!z10 && !z11) {
                return false;
            }
            return true;
        }

        @Override // com.tom_roush.pdfbox.pdmodel.common.function.type4.BitwiseOperators.AbstractLogicalOperator
        public int applyforInteger(int i10, int i11) {
            return i10 | i11;
        }
    }

    /* loaded from: classes2.dex */
    public static class True implements Operator {
        @Override // com.tom_roush.pdfbox.pdmodel.common.function.type4.Operator
        public void execute(ExecutionContext executionContext) {
            executionContext.getStack().push(Boolean.TRUE);
        }
    }

    /* loaded from: classes2.dex */
    public static class Xor extends AbstractLogicalOperator {
        public Xor() {
            super(0);
        }

        @Override // com.tom_roush.pdfbox.pdmodel.common.function.type4.BitwiseOperators.AbstractLogicalOperator
        public boolean applyForBoolean(boolean z10, boolean z11) {
            return z10 ^ z11;
        }

        @Override // com.tom_roush.pdfbox.pdmodel.common.function.type4.BitwiseOperators.AbstractLogicalOperator
        public int applyforInteger(int i10, int i11) {
            return i10 ^ i11;
        }
    }

    private BitwiseOperators() {
    }
}

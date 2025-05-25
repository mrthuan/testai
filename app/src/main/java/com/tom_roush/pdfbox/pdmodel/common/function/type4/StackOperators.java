package com.tom_roush.pdfbox.pdmodel.common.function.type4;

import b.a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

/* loaded from: classes2.dex */
class StackOperators {

    /* loaded from: classes2.dex */
    public static class Copy implements Operator {
        @Override // com.tom_roush.pdfbox.pdmodel.common.function.type4.Operator
        public void execute(ExecutionContext executionContext) {
            Stack<Object> stack = executionContext.getStack();
            int intValue = ((Number) stack.pop()).intValue();
            if (intValue > 0) {
                int size = stack.size();
                stack.addAll(new ArrayList(stack.subList(size - intValue, size)));
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class Dup implements Operator {
        @Override // com.tom_roush.pdfbox.pdmodel.common.function.type4.Operator
        public void execute(ExecutionContext executionContext) {
            Stack<Object> stack = executionContext.getStack();
            stack.push(stack.peek());
        }
    }

    /* loaded from: classes2.dex */
    public static class Exch implements Operator {
        @Override // com.tom_roush.pdfbox.pdmodel.common.function.type4.Operator
        public void execute(ExecutionContext executionContext) {
            Stack<Object> stack = executionContext.getStack();
            Object pop = stack.pop();
            Object pop2 = stack.pop();
            stack.push(pop);
            stack.push(pop2);
        }
    }

    /* loaded from: classes2.dex */
    public static class Index implements Operator {
        @Override // com.tom_roush.pdfbox.pdmodel.common.function.type4.Operator
        public void execute(ExecutionContext executionContext) {
            Stack<Object> stack = executionContext.getStack();
            int intValue = ((Number) stack.pop()).intValue();
            if (intValue >= 0) {
                stack.push(stack.get((stack.size() - intValue) - 1));
                return;
            }
            throw new IllegalArgumentException(a.c("rangecheck: ", intValue));
        }
    }

    /* loaded from: classes2.dex */
    public static class Pop implements Operator {
        @Override // com.tom_roush.pdfbox.pdmodel.common.function.type4.Operator
        public void execute(ExecutionContext executionContext) {
            executionContext.getStack().pop();
        }
    }

    /* loaded from: classes2.dex */
    public static class Roll implements Operator {
        @Override // com.tom_roush.pdfbox.pdmodel.common.function.type4.Operator
        public void execute(ExecutionContext executionContext) {
            Stack<Object> stack = executionContext.getStack();
            int intValue = ((Number) stack.pop()).intValue();
            int intValue2 = ((Number) stack.pop()).intValue();
            if (intValue == 0) {
                return;
            }
            if (intValue2 >= 0) {
                LinkedList linkedList = new LinkedList();
                LinkedList linkedList2 = new LinkedList();
                int i10 = 0;
                if (intValue < 0) {
                    int i11 = intValue2 + intValue;
                    while (i10 < i11) {
                        linkedList2.addFirst(stack.pop());
                        i10++;
                    }
                    while (intValue < 0) {
                        linkedList.addFirst(stack.pop());
                        intValue++;
                    }
                    stack.addAll(linkedList2);
                    stack.addAll(linkedList);
                    return;
                }
                int i12 = intValue2 - intValue;
                while (intValue > 0) {
                    linkedList.addFirst(stack.pop());
                    intValue--;
                }
                while (i10 < i12) {
                    linkedList2.addFirst(stack.pop());
                    i10++;
                }
                stack.addAll(linkedList);
                stack.addAll(linkedList2);
                return;
            }
            throw new IllegalArgumentException(a.c("rangecheck: ", intValue2));
        }
    }

    private StackOperators() {
    }
}

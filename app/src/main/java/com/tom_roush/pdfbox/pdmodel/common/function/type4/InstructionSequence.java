package com.tom_roush.pdfbox.pdmodel.common.function.type4;

import a0.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/* loaded from: classes2.dex */
public class InstructionSequence {
    private final List<Object> instructions = new ArrayList();

    public void addBoolean(boolean z10) {
        this.instructions.add(Boolean.valueOf(z10));
    }

    public void addInteger(int i10) {
        this.instructions.add(Integer.valueOf(i10));
    }

    public void addName(String str) {
        this.instructions.add(str);
    }

    public void addProc(InstructionSequence instructionSequence) {
        this.instructions.add(instructionSequence);
    }

    public void addReal(float f10) {
        this.instructions.add(Float.valueOf(f10));
    }

    public void execute(ExecutionContext executionContext) {
        Stack<Object> stack = executionContext.getStack();
        for (Object obj : this.instructions) {
            if (obj instanceof String) {
                String str = (String) obj;
                Operator operator = executionContext.getOperators().getOperator(str);
                if (operator != null) {
                    operator.execute(executionContext);
                } else {
                    throw new UnsupportedOperationException(a.h("Unknown operator or name: ", str));
                }
            } else {
                stack.push(obj);
            }
        }
        while (!stack.isEmpty() && (stack.peek() instanceof InstructionSequence)) {
            ((InstructionSequence) stack.pop()).execute(executionContext);
        }
    }
}

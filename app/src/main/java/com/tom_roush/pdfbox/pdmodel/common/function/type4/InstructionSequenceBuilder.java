package com.tom_roush.pdfbox.pdmodel.common.function.type4;

import com.tom_roush.pdfbox.pdmodel.common.function.type4.Parser;
import java.util.Stack;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class InstructionSequenceBuilder extends Parser.AbstractSyntaxHandler {
    private static final Pattern INTEGER_PATTERN = Pattern.compile("[\\+\\-]?\\d+");
    private static final Pattern REAL_PATTERN = Pattern.compile("[\\-]?\\d*\\.\\d*([Ee]\\-?\\d+)?");
    private final InstructionSequence mainSequence;
    private final Stack<InstructionSequence> seqStack;

    private InstructionSequenceBuilder() {
        InstructionSequence instructionSequence = new InstructionSequence();
        this.mainSequence = instructionSequence;
        Stack<InstructionSequence> stack = new Stack<>();
        this.seqStack = stack;
        stack.push(instructionSequence);
    }

    private InstructionSequence getCurrentSequence() {
        return this.seqStack.peek();
    }

    public static InstructionSequence parse(CharSequence charSequence) {
        InstructionSequenceBuilder instructionSequenceBuilder = new InstructionSequenceBuilder();
        Parser.parse(charSequence, instructionSequenceBuilder);
        return instructionSequenceBuilder.getInstructionSequence();
    }

    public static int parseInt(String str) {
        if (str.startsWith("+")) {
            str = str.substring(1);
        }
        return Integer.parseInt(str);
    }

    public static float parseReal(String str) {
        return Float.parseFloat(str);
    }

    public InstructionSequence getInstructionSequence() {
        return this.mainSequence;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.function.type4.Parser.SyntaxHandler
    public void token(CharSequence charSequence) {
        token(charSequence.toString());
    }

    private void token(String str) {
        if ("{".equals(str)) {
            InstructionSequence instructionSequence = new InstructionSequence();
            getCurrentSequence().addProc(instructionSequence);
            this.seqStack.push(instructionSequence);
        } else if ("}".equals(str)) {
            this.seqStack.pop();
        } else if (INTEGER_PATTERN.matcher(str).matches()) {
            getCurrentSequence().addInteger(parseInt(str));
        } else if (REAL_PATTERN.matcher(str).matches()) {
            getCurrentSequence().addReal(parseReal(str));
        } else {
            getCurrentSequence().addName(str);
        }
    }
}

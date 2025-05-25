package com.tom_roush.pdfbox.pdmodel.common.function;

import androidx.activity.f;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.pdmodel.common.PDRange;
import com.tom_roush.pdfbox.pdmodel.common.function.type4.ExecutionContext;
import com.tom_roush.pdfbox.pdmodel.common.function.type4.InstructionSequence;
import com.tom_roush.pdfbox.pdmodel.common.function.type4.InstructionSequenceBuilder;
import com.tom_roush.pdfbox.pdmodel.common.function.type4.Operators;
import lib.zj.office.fc.codec.CharEncoding;

/* loaded from: classes2.dex */
public class PDFunctionType4 extends PDFunction {
    private static final Operators OPERATORS = new Operators();
    private final InstructionSequence instructions;

    public PDFunctionType4(COSBase cOSBase) {
        super(cOSBase);
        this.instructions = InstructionSequenceBuilder.parse(new String(getPDStream().toByteArray(), CharEncoding.ISO_8859_1));
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.function.PDFunction
    public float[] eval(float[] fArr) {
        ExecutionContext executionContext = new ExecutionContext(OPERATORS);
        for (int i10 = 0; i10 < fArr.length; i10++) {
            PDRange domainForInput = getDomainForInput(i10);
            executionContext.getStack().push(Float.valueOf(clipToRange(fArr[i10], domainForInput.getMin(), domainForInput.getMax())));
        }
        this.instructions.execute(executionContext);
        int numberOfOutputParameters = getNumberOfOutputParameters();
        int size = executionContext.getStack().size();
        if (size >= numberOfOutputParameters) {
            float[] fArr2 = new float[numberOfOutputParameters];
            while (true) {
                numberOfOutputParameters--;
                if (numberOfOutputParameters >= 0) {
                    PDRange rangeForOutput = getRangeForOutput(numberOfOutputParameters);
                    float popReal = executionContext.popReal();
                    fArr2[numberOfOutputParameters] = popReal;
                    fArr2[numberOfOutputParameters] = clipToRange(popReal, rangeForOutput.getMin(), rangeForOutput.getMax());
                } else {
                    return fArr2;
                }
            }
        } else {
            throw new IllegalStateException(f.k("The type 4 function returned ", size, " values but the Range entry indicates that ", numberOfOutputParameters, " values be returned."));
        }
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.function.PDFunction
    public int getFunctionType() {
        return 4;
    }
}

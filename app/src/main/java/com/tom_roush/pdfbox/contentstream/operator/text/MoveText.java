package com.tom_roush.pdfbox.contentstream.operator.text;

import com.tom_roush.pdfbox.contentstream.operator.MissingOperandException;
import com.tom_roush.pdfbox.contentstream.operator.Operator;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.contentstream.operator.OperatorProcessor;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSNumber;
import com.tom_roush.pdfbox.util.Matrix;
import java.util.List;

/* loaded from: classes2.dex */
public class MoveText extends OperatorProcessor {
    @Override // com.tom_roush.pdfbox.contentstream.operator.OperatorProcessor
    public String getName() {
        return OperatorName.MOVE_TEXT;
    }

    @Override // com.tom_roush.pdfbox.contentstream.operator.OperatorProcessor
    public void process(Operator operator, List<COSBase> list) {
        if (list.size() >= 2) {
            Matrix textLineMatrix = this.context.getTextLineMatrix();
            if (textLineMatrix == null) {
                getName();
                return;
            }
            COSBase cOSBase = list.get(0);
            COSBase cOSBase2 = list.get(1);
            if (!(cOSBase instanceof COSNumber) || !(cOSBase2 instanceof COSNumber)) {
                return;
            }
            textLineMatrix.concatenate(new Matrix(1.0f, 0.0f, 0.0f, 1.0f, ((COSNumber) cOSBase).floatValue(), ((COSNumber) cOSBase2).floatValue()));
            this.context.setTextMatrix(textLineMatrix.m11clone());
            return;
        }
        throw new MissingOperandException(operator, list);
    }
}

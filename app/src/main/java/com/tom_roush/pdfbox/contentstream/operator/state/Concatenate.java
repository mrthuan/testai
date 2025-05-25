package com.tom_roush.pdfbox.contentstream.operator.state;

import com.tom_roush.pdfbox.contentstream.operator.MissingOperandException;
import com.tom_roush.pdfbox.contentstream.operator.Operator;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.contentstream.operator.OperatorProcessor;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSNumber;
import com.tom_roush.pdfbox.util.Matrix;
import java.util.List;

/* loaded from: classes2.dex */
public class Concatenate extends OperatorProcessor {
    @Override // com.tom_roush.pdfbox.contentstream.operator.OperatorProcessor
    public String getName() {
        return OperatorName.CONCAT;
    }

    @Override // com.tom_roush.pdfbox.contentstream.operator.OperatorProcessor
    public void process(Operator operator, List<COSBase> list) {
        if (list.size() >= 6) {
            if (!checkArrayTypesClass(list, COSNumber.class)) {
                return;
            }
            this.context.getGraphicsState().getCurrentTransformationMatrix().concatenate(new Matrix(((COSNumber) list.get(0)).floatValue(), ((COSNumber) list.get(1)).floatValue(), ((COSNumber) list.get(2)).floatValue(), ((COSNumber) list.get(3)).floatValue(), ((COSNumber) list.get(4)).floatValue(), ((COSNumber) list.get(5)).floatValue()));
            return;
        }
        throw new MissingOperandException(operator, list);
    }
}

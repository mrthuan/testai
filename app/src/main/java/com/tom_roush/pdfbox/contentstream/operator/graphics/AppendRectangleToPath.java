package com.tom_roush.pdfbox.contentstream.operator.graphics;

import com.tom_roush.pdfbox.contentstream.operator.MissingOperandException;
import com.tom_roush.pdfbox.contentstream.operator.Operator;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSNumber;
import java.util.List;

/* loaded from: classes2.dex */
public final class AppendRectangleToPath extends GraphicsOperatorProcessor {
    @Override // com.tom_roush.pdfbox.contentstream.operator.OperatorProcessor
    public String getName() {
        return OperatorName.APPEND_RECT;
    }

    @Override // com.tom_roush.pdfbox.contentstream.operator.OperatorProcessor
    public void process(Operator operator, List<COSBase> list) {
        if (list.size() >= 4) {
            if (!checkArrayTypesClass(list, COSNumber.class)) {
                return;
            }
            float floatValue = ((COSNumber) list.get(0)).floatValue();
            float floatValue2 = ((COSNumber) list.get(1)).floatValue();
            float floatValue3 = ((COSNumber) list.get(2)).floatValue() + floatValue;
            float floatValue4 = ((COSNumber) list.get(3)).floatValue() + floatValue2;
            ((GraphicsOperatorProcessor) this).context.appendRectangle(((GraphicsOperatorProcessor) this).context.transformedPoint(floatValue, floatValue2), ((GraphicsOperatorProcessor) this).context.transformedPoint(floatValue3, floatValue2), ((GraphicsOperatorProcessor) this).context.transformedPoint(floatValue3, floatValue4), ((GraphicsOperatorProcessor) this).context.transformedPoint(floatValue, floatValue4));
            return;
        }
        throw new MissingOperandException(operator, list);
    }
}

package com.tom_roush.pdfbox.contentstream.operator.graphics;

import android.graphics.PointF;
import com.tom_roush.pdfbox.contentstream.operator.MissingOperandException;
import com.tom_roush.pdfbox.contentstream.operator.Operator;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSNumber;
import java.util.List;

/* loaded from: classes2.dex */
public class CurveToReplicateInitialPoint extends GraphicsOperatorProcessor {
    @Override // com.tom_roush.pdfbox.contentstream.operator.OperatorProcessor
    public String getName() {
        return OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT;
    }

    @Override // com.tom_roush.pdfbox.contentstream.operator.OperatorProcessor
    public void process(Operator operator, List<COSBase> list) {
        if (list.size() >= 4) {
            if (!checkArrayTypesClass(list, COSNumber.class)) {
                return;
            }
            PointF currentPoint = ((GraphicsOperatorProcessor) this).context.getCurrentPoint();
            PointF transformedPoint = ((GraphicsOperatorProcessor) this).context.transformedPoint(((COSNumber) list.get(0)).floatValue(), ((COSNumber) list.get(1)).floatValue());
            PointF transformedPoint2 = ((GraphicsOperatorProcessor) this).context.transformedPoint(((COSNumber) list.get(2)).floatValue(), ((COSNumber) list.get(3)).floatValue());
            if (currentPoint == null) {
                ((GraphicsOperatorProcessor) this).context.moveTo(transformedPoint2.x, transformedPoint2.y);
                return;
            }
            ((GraphicsOperatorProcessor) this).context.curveTo(currentPoint.x, currentPoint.y, transformedPoint.x, transformedPoint.y, transformedPoint2.x, transformedPoint2.y);
            return;
        }
        throw new MissingOperandException(operator, list);
    }
}

package com.tom_roush.pdfbox.contentstream.operator.graphics;

import android.graphics.PointF;
import com.tom_roush.pdfbox.contentstream.PDFGraphicsStreamEngine;
import com.tom_roush.pdfbox.contentstream.operator.MissingOperandException;
import com.tom_roush.pdfbox.contentstream.operator.Operator;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSNumber;
import java.util.List;

/* loaded from: classes2.dex */
public final class CurveToReplicateFinalPoint extends GraphicsOperatorProcessor {
    @Override // com.tom_roush.pdfbox.contentstream.operator.OperatorProcessor
    public String getName() {
        return OperatorName.CURVE_TO_REPLICATE_FINAL_POINT;
    }

    @Override // com.tom_roush.pdfbox.contentstream.operator.OperatorProcessor
    public void process(Operator operator, List<COSBase> list) {
        if (list.size() >= 4) {
            if (!checkArrayTypesClass(list, COSNumber.class)) {
                return;
            }
            PointF transformedPoint = ((GraphicsOperatorProcessor) this).context.transformedPoint(((COSNumber) list.get(0)).floatValue(), ((COSNumber) list.get(1)).floatValue());
            PointF transformedPoint2 = ((GraphicsOperatorProcessor) this).context.transformedPoint(((COSNumber) list.get(2)).floatValue(), ((COSNumber) list.get(3)).floatValue());
            PDFGraphicsStreamEngine pDFGraphicsStreamEngine = ((GraphicsOperatorProcessor) this).context;
            float f10 = transformedPoint.x;
            float f11 = transformedPoint.y;
            float f12 = transformedPoint2.x;
            float f13 = transformedPoint2.y;
            pDFGraphicsStreamEngine.curveTo(f10, f11, f12, f13, f12, f13);
            return;
        }
        throw new MissingOperandException(operator, list);
    }
}

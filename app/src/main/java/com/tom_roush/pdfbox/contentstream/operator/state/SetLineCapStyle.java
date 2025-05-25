package com.tom_roush.pdfbox.contentstream.operator.state;

import android.graphics.Paint;
import com.tom_roush.pdfbox.contentstream.operator.MissingOperandException;
import com.tom_roush.pdfbox.contentstream.operator.Operator;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.contentstream.operator.OperatorProcessor;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSNumber;
import java.util.List;

/* loaded from: classes2.dex */
public class SetLineCapStyle extends OperatorProcessor {
    @Override // com.tom_roush.pdfbox.contentstream.operator.OperatorProcessor
    public String getName() {
        return OperatorName.SET_LINE_CAPSTYLE;
    }

    @Override // com.tom_roush.pdfbox.contentstream.operator.OperatorProcessor
    public void process(Operator operator, List<COSBase> list) {
        Paint.Cap cap;
        if (!list.isEmpty()) {
            int intValue = ((COSNumber) list.get(0)).intValue();
            if (intValue != 0) {
                if (intValue != 1) {
                    if (intValue != 2) {
                        cap = null;
                    } else {
                        cap = Paint.Cap.SQUARE;
                    }
                } else {
                    cap = Paint.Cap.ROUND;
                }
            } else {
                cap = Paint.Cap.BUTT;
            }
            this.context.getGraphicsState().setLineCap(cap);
            return;
        }
        throw new MissingOperandException(operator, list);
    }
}

package com.tom_roush.pdfbox.contentstream.operator.text;

import com.tom_roush.pdfbox.contentstream.operator.MissingOperandException;
import com.tom_roush.pdfbox.contentstream.operator.Operator;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.contentstream.operator.OperatorProcessor;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSNumber;
import com.tom_roush.pdfbox.pdmodel.graphics.state.RenderingMode;
import java.util.List;

/* loaded from: classes2.dex */
public class SetTextRenderingMode extends OperatorProcessor {
    @Override // com.tom_roush.pdfbox.contentstream.operator.OperatorProcessor
    public String getName() {
        return OperatorName.SET_TEXT_RENDERINGMODE;
    }

    @Override // com.tom_roush.pdfbox.contentstream.operator.OperatorProcessor
    public void process(Operator operator, List<COSBase> list) {
        int intValue;
        if (!list.isEmpty()) {
            COSBase cOSBase = list.get(0);
            if ((cOSBase instanceof COSNumber) && (intValue = ((COSNumber) cOSBase).intValue()) >= 0 && intValue < RenderingMode.values().length) {
                this.context.getGraphicsState().getTextState().setRenderingMode(RenderingMode.fromInt(intValue));
                return;
            }
            return;
        }
        throw new MissingOperandException(operator, list);
    }
}

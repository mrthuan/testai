package com.tom_roush.pdfbox.contentstream.operator.state;

import com.tom_roush.pdfbox.contentstream.operator.MissingOperandException;
import com.tom_roush.pdfbox.contentstream.operator.Operator;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.contentstream.operator.OperatorProcessor;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.graphics.state.RenderingIntent;
import java.util.List;

/* loaded from: classes2.dex */
public class SetRenderingIntent extends OperatorProcessor {
    @Override // com.tom_roush.pdfbox.contentstream.operator.OperatorProcessor
    public String getName() {
        return OperatorName.SET_RENDERINGINTENT;
    }

    @Override // com.tom_roush.pdfbox.contentstream.operator.OperatorProcessor
    public void process(Operator operator, List<COSBase> list) {
        if (!list.isEmpty()) {
            COSBase cOSBase = list.get(0);
            if (!(cOSBase instanceof COSName)) {
                return;
            }
            this.context.getGraphicsState().setRenderingIntent(RenderingIntent.fromString(((COSName) cOSBase).getName()));
            return;
        }
        throw new MissingOperandException(operator, list);
    }
}

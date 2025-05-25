package com.tom_roush.pdfbox.contentstream.operator.text;

import a0.a;
import com.tom_roush.pdfbox.contentstream.operator.MissingOperandException;
import com.tom_roush.pdfbox.contentstream.operator.Operator;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.contentstream.operator.OperatorProcessor;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSNumber;
import java.util.List;

/* loaded from: classes2.dex */
public class SetCharSpacing extends OperatorProcessor {
    @Override // com.tom_roush.pdfbox.contentstream.operator.OperatorProcessor
    public String getName() {
        return OperatorName.SET_CHAR_SPACING;
    }

    @Override // com.tom_roush.pdfbox.contentstream.operator.OperatorProcessor
    public void process(Operator operator, List<COSBase> list) {
        if (!list.isEmpty()) {
            Object f10 = a.f(list, -1);
            if (f10 instanceof COSNumber) {
                this.context.getGraphicsState().getTextState().setCharacterSpacing(((COSNumber) f10).floatValue());
                return;
            }
            return;
        }
        throw new MissingOperandException(operator, list);
    }
}

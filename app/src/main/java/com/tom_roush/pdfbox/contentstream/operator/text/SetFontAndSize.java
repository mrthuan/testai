package com.tom_roush.pdfbox.contentstream.operator.text;

import com.tom_roush.pdfbox.contentstream.operator.MissingOperandException;
import com.tom_roush.pdfbox.contentstream.operator.Operator;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.contentstream.operator.OperatorProcessor;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSNumber;
import com.tom_roush.pdfbox.pdmodel.font.PDFont;
import java.util.List;

/* loaded from: classes2.dex */
public class SetFontAndSize extends OperatorProcessor {
    @Override // com.tom_roush.pdfbox.contentstream.operator.OperatorProcessor
    public String getName() {
        return OperatorName.SET_FONT_AND_SIZE;
    }

    @Override // com.tom_roush.pdfbox.contentstream.operator.OperatorProcessor
    public void process(Operator operator, List<COSBase> list) {
        if (list.size() >= 2) {
            COSBase cOSBase = list.get(0);
            COSBase cOSBase2 = list.get(1);
            if (!(cOSBase instanceof COSName) || !(cOSBase2 instanceof COSNumber)) {
                return;
            }
            COSName cOSName = (COSName) cOSBase;
            this.context.getGraphicsState().getTextState().setFontSize(((COSNumber) cOSBase2).floatValue());
            PDFont font = this.context.getResources().getFont(cOSName);
            if (font == null) {
                cOSName.getName();
            }
            this.context.getGraphicsState().getTextState().setFont(font);
            return;
        }
        throw new MissingOperandException(operator, list);
    }
}

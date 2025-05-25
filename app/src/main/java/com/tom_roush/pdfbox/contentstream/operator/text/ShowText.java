package com.tom_roush.pdfbox.contentstream.operator.text;

import com.tom_roush.pdfbox.contentstream.operator.Operator;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.contentstream.operator.OperatorProcessor;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSString;
import java.util.List;

/* loaded from: classes2.dex */
public class ShowText extends OperatorProcessor {
    @Override // com.tom_roush.pdfbox.contentstream.operator.OperatorProcessor
    public String getName() {
        return OperatorName.SHOW_TEXT;
    }

    @Override // com.tom_roush.pdfbox.contentstream.operator.OperatorProcessor
    public void process(Operator operator, List<COSBase> list) {
        if (list.isEmpty()) {
            return;
        }
        COSBase cOSBase = list.get(0);
        if (!(cOSBase instanceof COSString) || this.context.getTextMatrix() == null) {
            return;
        }
        this.context.showTextString(((COSString) cOSBase).getBytes());
    }
}

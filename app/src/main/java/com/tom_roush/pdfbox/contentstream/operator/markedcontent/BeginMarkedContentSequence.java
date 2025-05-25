package com.tom_roush.pdfbox.contentstream.operator.markedcontent;

import com.tom_roush.pdfbox.contentstream.operator.Operator;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.contentstream.operator.OperatorProcessor;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSName;
import java.util.List;

/* loaded from: classes2.dex */
public class BeginMarkedContentSequence extends OperatorProcessor {
    @Override // com.tom_roush.pdfbox.contentstream.operator.OperatorProcessor
    public String getName() {
        return OperatorName.BEGIN_MARKED_CONTENT;
    }

    @Override // com.tom_roush.pdfbox.contentstream.operator.OperatorProcessor
    public void process(Operator operator, List<COSBase> list) {
        COSName cOSName = null;
        for (COSBase cOSBase : list) {
            if (cOSBase instanceof COSName) {
                cOSName = (COSName) cOSBase;
            }
        }
        this.context.beginMarkedContentSequence(cOSName, null);
    }
}

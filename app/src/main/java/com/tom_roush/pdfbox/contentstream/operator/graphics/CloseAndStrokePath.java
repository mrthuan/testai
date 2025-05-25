package com.tom_roush.pdfbox.contentstream.operator.graphics;

import com.tom_roush.pdfbox.contentstream.operator.Operator;
import com.tom_roush.pdfbox.cos.COSBase;
import java.util.List;

/* loaded from: classes2.dex */
public class CloseAndStrokePath extends GraphicsOperatorProcessor {
    @Override // com.tom_roush.pdfbox.contentstream.operator.OperatorProcessor
    public String getName() {
        return "s";
    }

    @Override // com.tom_roush.pdfbox.contentstream.operator.OperatorProcessor
    public void process(Operator operator, List<COSBase> list) {
        ((GraphicsOperatorProcessor) this).context.processOperator("h", list);
        ((GraphicsOperatorProcessor) this).context.processOperator("S", list);
    }
}

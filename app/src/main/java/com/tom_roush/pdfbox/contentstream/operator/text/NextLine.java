package com.tom_roush.pdfbox.contentstream.operator.text;

import com.tom_roush.pdfbox.contentstream.operator.Operator;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.contentstream.operator.OperatorProcessor;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSFloat;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class NextLine extends OperatorProcessor {
    @Override // com.tom_roush.pdfbox.contentstream.operator.OperatorProcessor
    public String getName() {
        return OperatorName.NEXT_LINE;
    }

    @Override // com.tom_roush.pdfbox.contentstream.operator.OperatorProcessor
    public void process(Operator operator, List<COSBase> list) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new COSFloat(0.0f));
        arrayList.add(new COSFloat(this.context.getGraphicsState().getTextState().getLeading() * (-1.0f)));
        this.context.processOperator(OperatorName.MOVE_TEXT, arrayList);
    }
}

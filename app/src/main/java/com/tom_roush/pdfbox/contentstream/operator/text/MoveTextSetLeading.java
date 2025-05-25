package com.tom_roush.pdfbox.contentstream.operator.text;

import com.tom_roush.pdfbox.contentstream.operator.MissingOperandException;
import com.tom_roush.pdfbox.contentstream.operator.Operator;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.contentstream.operator.OperatorProcessor;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSFloat;
import com.tom_roush.pdfbox.cos.COSNumber;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class MoveTextSetLeading extends OperatorProcessor {
    @Override // com.tom_roush.pdfbox.contentstream.operator.OperatorProcessor
    public String getName() {
        return "TD";
    }

    @Override // com.tom_roush.pdfbox.contentstream.operator.OperatorProcessor
    public void process(Operator operator, List<COSBase> list) {
        if (list.size() >= 2) {
            COSBase cOSBase = list.get(1);
            if (!(cOSBase instanceof COSNumber)) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(new COSFloat(((COSNumber) cOSBase).floatValue() * (-1.0f)));
            this.context.processOperator(OperatorName.SET_TEXT_LEADING, arrayList);
            this.context.processOperator(OperatorName.MOVE_TEXT, list);
            return;
        }
        throw new MissingOperandException(operator, list);
    }
}

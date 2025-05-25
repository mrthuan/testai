package com.tom_roush.pdfbox.contentstream.operator.state;

import com.tom_roush.pdfbox.contentstream.operator.MissingOperandException;
import com.tom_roush.pdfbox.contentstream.operator.Operator;
import com.tom_roush.pdfbox.contentstream.operator.OperatorProcessor;
import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSNumber;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public class SetLineDashPattern extends OperatorProcessor {
    @Override // com.tom_roush.pdfbox.contentstream.operator.OperatorProcessor
    public String getName() {
        return "d";
    }

    @Override // com.tom_roush.pdfbox.contentstream.operator.OperatorProcessor
    public void process(Operator operator, List<COSBase> list) {
        if (list.size() >= 2) {
            COSBase cOSBase = list.get(0);
            if (!(cOSBase instanceof COSArray)) {
                return;
            }
            COSBase cOSBase2 = list.get(1);
            if (!(cOSBase2 instanceof COSNumber)) {
                return;
            }
            COSArray cOSArray = (COSArray) cOSBase;
            int intValue = ((COSNumber) cOSBase2).intValue();
            Iterator<COSBase> it = cOSArray.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                COSBase next = it.next();
                if (next instanceof COSNumber) {
                    if (((COSNumber) next).floatValue() != 0.0f) {
                        break;
                    }
                } else {
                    Objects.toString(next);
                    cOSArray = new COSArray();
                    break;
                }
            }
            this.context.setLineDashPattern(cOSArray, intValue);
            return;
        }
        throw new MissingOperandException(operator, list);
    }
}

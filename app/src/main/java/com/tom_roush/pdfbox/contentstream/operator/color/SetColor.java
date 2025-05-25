package com.tom_roush.pdfbox.contentstream.operator.color;

import com.tom_roush.pdfbox.contentstream.operator.MissingOperandException;
import com.tom_roush.pdfbox.contentstream.operator.Operator;
import com.tom_roush.pdfbox.contentstream.operator.OperatorProcessor;
import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSNumber;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDColor;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDColorSpace;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class SetColor extends OperatorProcessor {
    public abstract PDColor getColor();

    public abstract PDColorSpace getColorSpace();

    @Override // com.tom_roush.pdfbox.contentstream.operator.OperatorProcessor
    public void process(Operator operator, List<COSBase> list) {
        PDColorSpace colorSpace = getColorSpace();
        if (list.size() >= colorSpace.getNumberOfComponents()) {
            if (!checkArrayTypesClass(list, COSNumber.class)) {
                return;
            }
            COSArray cOSArray = new COSArray();
            cOSArray.addAll(list);
            setColor(new PDColor(cOSArray, colorSpace));
            return;
        }
        throw new MissingOperandException(operator, list);
    }

    public abstract void setColor(PDColor pDColor);
}

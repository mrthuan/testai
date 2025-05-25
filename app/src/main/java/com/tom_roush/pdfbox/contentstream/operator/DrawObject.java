package com.tom_roush.pdfbox.contentstream.operator;

import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.graphics.PDXObject;
import com.tom_roush.pdfbox.pdmodel.graphics.form.PDFormXObject;
import com.tom_roush.pdfbox.pdmodel.graphics.form.PDTransparencyGroup;
import java.util.List;

/* loaded from: classes2.dex */
public class DrawObject extends OperatorProcessor {
    @Override // com.tom_roush.pdfbox.contentstream.operator.OperatorProcessor
    public String getName() {
        return OperatorName.DRAW_OBJECT;
    }

    @Override // com.tom_roush.pdfbox.contentstream.operator.OperatorProcessor
    public void process(Operator operator, List<COSBase> list) {
        if (!list.isEmpty()) {
            COSBase cOSBase = list.get(0);
            if (!(cOSBase instanceof COSName)) {
                return;
            }
            COSName cOSName = (COSName) cOSBase;
            if (this.context.getResources().isImageXObject(cOSName)) {
                return;
            }
            PDXObject xObject = this.context.getResources().getXObject(cOSName);
            if (xObject instanceof PDFormXObject) {
                try {
                    this.context.increaseLevel();
                    if (this.context.getLevel() > 25) {
                        return;
                    }
                    PDFormXObject pDFormXObject = (PDFormXObject) xObject;
                    if (pDFormXObject instanceof PDTransparencyGroup) {
                        this.context.showTransparencyGroup((PDTransparencyGroup) pDFormXObject);
                    } else {
                        this.context.showForm(pDFormXObject);
                    }
                    return;
                } finally {
                    this.context.decreaseLevel();
                }
            }
            return;
        }
        throw new MissingOperandException(operator, list);
    }
}

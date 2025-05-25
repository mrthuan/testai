package com.tom_roush.pdfbox.contentstream.operator.markedcontent;

import com.tom_roush.pdfbox.contentstream.operator.MissingOperandException;
import com.tom_roush.pdfbox.contentstream.operator.Operator;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.contentstream.operator.OperatorProcessor;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.graphics.PDXObject;
import com.tom_roush.pdfbox.pdmodel.graphics.form.PDFormXObject;
import com.tom_roush.pdfbox.pdmodel.graphics.form.PDTransparencyGroup;
import com.tom_roush.pdfbox.text.PDFMarkedContentExtractor;
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
            PDXObject xObject = this.context.getResources().getXObject((COSName) cOSBase);
            ((PDFMarkedContentExtractor) this.context).xobject(xObject);
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

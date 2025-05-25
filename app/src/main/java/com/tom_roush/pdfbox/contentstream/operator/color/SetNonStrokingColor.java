package com.tom_roush.pdfbox.contentstream.operator.color;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDColor;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDColorSpace;

/* loaded from: classes2.dex */
public class SetNonStrokingColor extends SetColor {
    @Override // com.tom_roush.pdfbox.contentstream.operator.color.SetColor
    public PDColor getColor() {
        return this.context.getGraphicsState().getNonStrokingColor();
    }

    @Override // com.tom_roush.pdfbox.contentstream.operator.color.SetColor
    public PDColorSpace getColorSpace() {
        return this.context.getGraphicsState().getNonStrokingColorSpace();
    }

    @Override // com.tom_roush.pdfbox.contentstream.operator.OperatorProcessor
    public String getName() {
        return OperatorName.NON_STROKING_COLOR;
    }

    @Override // com.tom_roush.pdfbox.contentstream.operator.color.SetColor
    public void setColor(PDColor pDColor) {
        this.context.getGraphicsState().setNonStrokingColor(pDColor);
    }
}

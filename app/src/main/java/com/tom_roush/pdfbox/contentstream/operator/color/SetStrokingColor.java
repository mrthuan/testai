package com.tom_roush.pdfbox.contentstream.operator.color;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDColor;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDColorSpace;

/* loaded from: classes2.dex */
public class SetStrokingColor extends SetColor {
    @Override // com.tom_roush.pdfbox.contentstream.operator.color.SetColor
    public PDColor getColor() {
        return this.context.getGraphicsState().getStrokingColor();
    }

    @Override // com.tom_roush.pdfbox.contentstream.operator.color.SetColor
    public PDColorSpace getColorSpace() {
        return this.context.getGraphicsState().getStrokingColorSpace();
    }

    @Override // com.tom_roush.pdfbox.contentstream.operator.OperatorProcessor
    public String getName() {
        return OperatorName.STROKING_COLOR;
    }

    @Override // com.tom_roush.pdfbox.contentstream.operator.color.SetColor
    public void setColor(PDColor pDColor) {
        this.context.getGraphicsState().setStrokingColor(pDColor);
    }
}

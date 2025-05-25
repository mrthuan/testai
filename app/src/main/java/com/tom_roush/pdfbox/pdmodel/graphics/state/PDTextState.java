package com.tom_roush.pdfbox.pdmodel.graphics.state;

import com.tom_roush.pdfbox.pdmodel.font.PDFont;

/* loaded from: classes2.dex */
public class PDTextState implements Cloneable {
    private PDFont font;
    private float fontSize;
    private float characterSpacing = 0.0f;
    private float wordSpacing = 0.0f;
    private float horizontalScaling = 100.0f;
    private float leading = 0.0f;
    private RenderingMode renderingMode = RenderingMode.FILL;
    private float rise = 0.0f;
    private boolean knockout = true;

    public float getCharacterSpacing() {
        return this.characterSpacing;
    }

    public PDFont getFont() {
        return this.font;
    }

    public float getFontSize() {
        return this.fontSize;
    }

    public float getHorizontalScaling() {
        return this.horizontalScaling;
    }

    public boolean getKnockoutFlag() {
        return this.knockout;
    }

    public float getLeading() {
        return this.leading;
    }

    public RenderingMode getRenderingMode() {
        return this.renderingMode;
    }

    public float getRise() {
        return this.rise;
    }

    public float getWordSpacing() {
        return this.wordSpacing;
    }

    public void setCharacterSpacing(float f10) {
        this.characterSpacing = f10;
    }

    public void setFont(PDFont pDFont) {
        this.font = pDFont;
    }

    public void setFontSize(float f10) {
        this.fontSize = f10;
    }

    public void setHorizontalScaling(float f10) {
        this.horizontalScaling = f10;
    }

    public void setKnockoutFlag(boolean z10) {
        this.knockout = z10;
    }

    public void setLeading(float f10) {
        this.leading = f10;
    }

    public void setRenderingMode(RenderingMode renderingMode) {
        this.renderingMode = renderingMode;
    }

    public void setRise(float f10) {
        this.rise = f10;
    }

    public void setWordSpacing(float f10) {
        this.wordSpacing = f10;
    }

    /* renamed from: clone */
    public PDTextState m10clone() {
        try {
            return (PDTextState) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }
}

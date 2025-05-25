package com.tom_roush.pdfbox.pdmodel.interactive.form;

import com.tom_roush.pdfbox.pdmodel.font.PDFont;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class AppearanceStyle {
    private PDFont font;
    private float fontSize = 12.0f;
    private float leading = 14.4f;

    public PDFont getFont() {
        return this.font;
    }

    public float getFontSize() {
        return this.fontSize;
    }

    public float getLeading() {
        return this.leading;
    }

    public void setFont(PDFont pDFont) {
        this.font = pDFont;
    }

    public void setFontSize(float f10) {
        this.fontSize = f10;
        this.leading = f10 * 1.2f;
    }

    public void setLeading(float f10) {
        this.leading = f10;
    }
}

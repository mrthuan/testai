package com.tom_roush.pdfbox.pdmodel.font;

import com.tom_roush.fontbox.FontBoxFont;
import com.tom_roush.fontbox.ttf.OpenTypeFont;

/* loaded from: classes2.dex */
public final class CIDFontMapping extends FontMapping<OpenTypeFont> {
    private final FontBoxFont ttf;

    public CIDFontMapping(OpenTypeFont openTypeFont, FontBoxFont fontBoxFont, boolean z10) {
        super(openTypeFont, z10);
        this.ttf = fontBoxFont;
    }

    public FontBoxFont getTrueTypeFont() {
        return this.ttf;
    }

    public boolean isCIDFont() {
        if (getFont() != null) {
            return true;
        }
        return false;
    }
}

package com.tom_roush.pdfbox.pdmodel.font;

import com.tom_roush.fontbox.FontBoxFont;

/* loaded from: classes2.dex */
public class FontMapping<T extends FontBoxFont> {
    private final T font;
    private final boolean isFallback;

    public FontMapping(T t4, boolean z10) {
        this.font = t4;
        this.isFallback = z10;
    }

    public T getFont() {
        return this.font;
    }

    public boolean isFallback() {
        return this.isFallback;
    }
}

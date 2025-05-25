package com.tom_roush.pdfbox.pdmodel.font;

import com.tom_roush.fontbox.FontBoxFont;
import java.lang.ref.SoftReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class FontCache {
    private final Map<FontInfo, SoftReference<FontBoxFont>> cache = new ConcurrentHashMap();

    public void addFont(FontInfo fontInfo, FontBoxFont fontBoxFont) {
        this.cache.put(fontInfo, new SoftReference<>(fontBoxFont));
    }

    public FontBoxFont getFont(FontInfo fontInfo) {
        SoftReference<FontBoxFont> softReference = this.cache.get(fontInfo);
        if (softReference != null) {
            return softReference.get();
        }
        return null;
    }
}

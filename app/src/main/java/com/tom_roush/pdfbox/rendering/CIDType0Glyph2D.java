package com.tom_roush.pdfbox.rendering;

import android.graphics.Path;
import com.tom_roush.pdfbox.pdmodel.font.PDCIDFontType0;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class CIDType0Glyph2D implements Glyph2D {
    private final Map<Integer, Path> cache = new HashMap();
    private final PDCIDFontType0 font;
    private final String fontName;

    public CIDType0Glyph2D(PDCIDFontType0 pDCIDFontType0) {
        this.font = pDCIDFontType0;
        this.fontName = pDCIDFontType0.getBaseFont();
    }

    @Override // com.tom_roush.pdfbox.rendering.Glyph2D
    public void dispose() {
        this.cache.clear();
    }

    @Override // com.tom_roush.pdfbox.rendering.Glyph2D
    public Path getPathForCharacterCode(int i10) {
        Path path = this.cache.get(Integer.valueOf(i10));
        if (path == null) {
            try {
                if (!this.font.hasGlyph(i10)) {
                    String.format("%04x", Integer.valueOf(this.font.getParent().codeToCID(i10)));
                }
                Path path2 = this.font.getPath(i10);
                this.cache.put(Integer.valueOf(i10), path2);
                return path2;
            } catch (IOException unused) {
                return new Path();
            }
        }
        return path;
    }
}

package com.tom_roush.pdfbox.rendering;

import android.graphics.Path;
import com.tom_roush.pdfbox.pdmodel.font.PDSimpleFont;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes2.dex */
final class Type1Glyph2D implements Glyph2D {
    private final Map<Integer, Path> cache = new HashMap();
    private final PDSimpleFont font;

    public Type1Glyph2D(PDSimpleFont pDSimpleFont) {
        this.font = pDSimpleFont;
    }

    private static String getUniNameOfCodePoint(int i10) {
        String upperCase = Integer.toString(i10, 16).toUpperCase(Locale.US);
        int length = upperCase.length();
        if (length != 1) {
            if (length != 2) {
                if (length != 3) {
                    return "uni".concat(upperCase);
                }
                return "uni0".concat(upperCase);
            }
            return "uni00".concat(upperCase);
        }
        return "uni000".concat(upperCase);
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
                String name = this.font.getEncoding().getName(i10);
                if (!this.font.hasGlyph(name)) {
                    this.font.getName();
                    if (i10 == 10 && this.font.isStandard14()) {
                        Path path2 = new Path();
                        this.cache.put(Integer.valueOf(i10), path2);
                        return path2;
                    }
                    String unicode = this.font.getGlyphList().toUnicode(name);
                    if (unicode != null && unicode.length() == 1) {
                        String uniNameOfCodePoint = getUniNameOfCodePoint(unicode.codePointAt(0));
                        if (this.font.hasGlyph(uniNameOfCodePoint)) {
                            name = uniNameOfCodePoint;
                        }
                    }
                }
                Path path3 = this.font.getPath(name);
                if (path3 == null) {
                    return this.font.getPath(".notdef");
                }
                return path3;
            } catch (IOException unused) {
                return new Path();
            }
        }
        return path;
    }
}

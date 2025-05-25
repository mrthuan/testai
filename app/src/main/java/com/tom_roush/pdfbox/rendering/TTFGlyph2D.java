package com.tom_roush.pdfbox.rendering;

import android.graphics.Path;
import com.tom_roush.fontbox.ttf.HeaderTable;
import com.tom_roush.fontbox.ttf.TrueTypeFont;
import com.tom_roush.harmony.awt.geom.AffineTransform;
import com.tom_roush.pdfbox.pdmodel.font.PDCIDFontType2;
import com.tom_roush.pdfbox.pdmodel.font.PDFont;
import com.tom_roush.pdfbox.pdmodel.font.PDTrueTypeFont;
import com.tom_roush.pdfbox.pdmodel.font.PDType0Font;
import com.tom_roush.pdfbox.pdmodel.font.PDVectorFont;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class TTFGlyph2D implements Glyph2D {
    private final PDFont font;
    private final Map<Integer, Path> glyphs;
    private boolean hasScaling;
    private final boolean isCIDFont;
    private float scale;
    private final TrueTypeFont ttf;
    private PDVectorFont vectorFont;

    public TTFGlyph2D(PDTrueTypeFont pDTrueTypeFont) {
        this(pDTrueTypeFont.getTrueTypeFont(), pDTrueTypeFont, false);
        this.vectorFont = pDTrueTypeFont;
    }

    private int getGIDForCharacterCode(int i10) {
        if (this.isCIDFont) {
            return ((PDType0Font) this.font).codeToGID(i10);
        }
        return ((PDTrueTypeFont) this.font).codeToGID(i10);
    }

    @Override // com.tom_roush.pdfbox.rendering.Glyph2D
    public void dispose() {
        this.glyphs.clear();
    }

    @Override // com.tom_roush.pdfbox.rendering.Glyph2D
    public Path getPathForCharacterCode(int i10) {
        return getPathForGID(getGIDForCharacterCode(i10), i10);
    }

    public Path getPathForGID(int i10, int i11) {
        if (i10 == 0 && !this.isCIDFont && i11 == 10 && this.font.isStandard14()) {
            this.font.getName();
            return new Path();
        }
        Path path = this.glyphs.get(Integer.valueOf(i10));
        if (path == null) {
            if (i10 == 0 || i10 >= this.ttf.getMaximumProfile().getNumGlyphs()) {
                if (this.isCIDFont) {
                    String.format("%04x", Integer.valueOf(((PDType0Font) this.font).codeToCID(i11)));
                    this.font.getName();
                } else {
                    this.font.getName();
                }
            }
            Path path2 = this.vectorFont.getPath(i11);
            if (i10 == 0 && !this.font.isEmbedded() && !this.font.isStandard14()) {
                path = null;
            } else {
                path = path2;
            }
            if (path == null) {
                path = new Path();
            } else if (this.hasScaling) {
                float f10 = this.scale;
                path.transform(AffineTransform.getScaleInstance(f10, f10).toMatrix());
            }
        }
        return new Path(path);
    }

    public TTFGlyph2D(PDType0Font pDType0Font) {
        this(((PDCIDFontType2) pDType0Font.getDescendantFont()).getTrueTypeFont(), pDType0Font, true);
        this.vectorFont = pDType0Font;
    }

    private TTFGlyph2D(TrueTypeFont trueTypeFont, PDFont pDFont, boolean z10) {
        this.scale = 1.0f;
        this.glyphs = new HashMap();
        this.font = pDFont;
        this.ttf = trueTypeFont;
        this.isCIDFont = z10;
        HeaderTable header = trueTypeFont.getHeader();
        if (header == null || header.getUnitsPerEm() == 1000) {
            return;
        }
        this.scale = 1000.0f / header.getUnitsPerEm();
        this.hasScaling = true;
    }
}

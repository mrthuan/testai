package com.tom_roush.pdfbox.pdmodel.font;

import android.graphics.Path;
import com.tom_roush.fontbox.cmap.CMap;
import com.tom_roush.fontbox.ttf.CmapLookup;
import com.tom_roush.fontbox.ttf.GlyphData;
import com.tom_roush.fontbox.ttf.OpenTypeFont;
import com.tom_roush.fontbox.ttf.TrueTypeFont;
import com.tom_roush.fontbox.util.BoundingBox;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.pdmodel.common.PDRectangle;
import com.tom_roush.pdfbox.util.Matrix;
import java.util.Set;

/* loaded from: classes2.dex */
public class PDCIDFontType2 extends PDCIDFont {
    private final int[] cid2gid;
    private final CmapLookup cmap;
    private BoundingBox fontBBox;
    private Matrix fontMatrix;
    private final boolean isDamaged;
    private final boolean isEmbedded;
    private final Set<Integer> noMapping;
    private final TrueTypeFont ttf;

    public PDCIDFontType2(COSDictionary cOSDictionary, PDType0Font pDType0Font) {
        this(cOSDictionary, pDType0Font, null);
    }

    private TrueTypeFont findFontOrSubstitute() {
        OpenTypeFont openTypeFont;
        CIDFontMapping cIDFont = FontMappers.instance().getCIDFont(getBaseFont(), getFontDescriptor(), getCIDSystemInfo());
        if (cIDFont.isCIDFont()) {
            openTypeFont = cIDFont.getFont();
        } else {
            openTypeFont = (TrueTypeFont) cIDFont.getTrueTypeFont();
        }
        if (cIDFont.isFallback()) {
            openTypeFont.getName();
            getBaseFont();
        }
        return openTypeFont;
    }

    private BoundingBox generateBoundingBox() {
        PDRectangle fontBoundingBox;
        if (getFontDescriptor() != null && (fontBoundingBox = getFontDescriptor().getFontBoundingBox()) != null && (Float.compare(fontBoundingBox.getLowerLeftX(), 0.0f) != 0 || Float.compare(fontBoundingBox.getLowerLeftY(), 0.0f) != 0 || Float.compare(fontBoundingBox.getUpperRightX(), 0.0f) != 0 || Float.compare(fontBoundingBox.getUpperRightY(), 0.0f) != 0)) {
            return new BoundingBox(fontBoundingBox.getLowerLeftX(), fontBoundingBox.getLowerLeftY(), fontBoundingBox.getUpperRightX(), fontBoundingBox.getUpperRightY());
        }
        return this.ttf.getFontBBox();
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDCIDFont
    public int codeToCID(int i10) {
        String unicode;
        CMap cMap = this.parent.getCMap();
        if (!cMap.hasCIDMappings() && cMap.hasUnicodeMappings() && (unicode = cMap.toUnicode(i10)) != null) {
            return unicode.codePointAt(0);
        }
        return cMap.toCID(i10);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDCIDFont
    public int codeToGID(int i10) {
        if (!this.isEmbedded) {
            if (this.cid2gid != null && !this.isDamaged) {
                getName();
                int codeToCID = codeToCID(i10);
                int[] iArr = this.cid2gid;
                if (codeToCID >= iArr.length) {
                    return 0;
                }
                return iArr[codeToCID];
            }
            String unicode = this.parent.toUnicode(i10);
            if (unicode == null) {
                if (!this.noMapping.contains(Integer.valueOf(i10))) {
                    this.noMapping.add(Integer.valueOf(i10));
                    getName();
                }
                return codeToCID(i10);
            }
            return this.cmap.getGlyphId(unicode.codePointAt(0));
        }
        int codeToCID2 = codeToCID(i10);
        int[] iArr2 = this.cid2gid;
        if (iArr2 != null) {
            if (codeToCID2 >= iArr2.length) {
                return 0;
            }
            return iArr2[codeToCID2];
        } else if (codeToCID2 >= this.ttf.getNumberOfGlyphs()) {
            return 0;
        } else {
            return codeToCID2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    @Override // com.tom_roush.pdfbox.pdmodel.font.PDCIDFont
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public byte[] encode(int r7) {
        /*
            r6 = this;
            boolean r0 = r6.isEmbedded
            r1 = 0
            if (r0 == 0) goto L4b
            com.tom_roush.pdfbox.pdmodel.font.PDType0Font r0 = r6.parent
            com.tom_roush.fontbox.cmap.CMap r0 = r0.getCMap()
            java.lang.String r0 = r0.getName()
            java.lang.String r2 = "Identity-"
            boolean r0 = r0.startsWith(r2)
            r2 = -1
            if (r0 == 0) goto L21
            com.tom_roush.fontbox.ttf.CmapLookup r0 = r6.cmap
            if (r0 == 0) goto L34
            int r0 = r0.getGlyphId(r7)
            goto L35
        L21:
            com.tom_roush.pdfbox.pdmodel.font.PDType0Font r0 = r6.parent
            com.tom_roush.fontbox.cmap.CMap r0 = r0.getCMapUCS2()
            if (r0 == 0) goto L34
            com.tom_roush.pdfbox.pdmodel.font.PDType0Font r0 = r6.parent
            com.tom_roush.fontbox.cmap.CMap r0 = r0.getCMapUCS2()
            int r0 = r0.toCID(r7)
            goto L35
        L34:
            r0 = r2
        L35:
            if (r0 != r2) goto L51
            com.tom_roush.pdfbox.pdmodel.font.PDType0Font r0 = r6.parent
            com.tom_roush.fontbox.cmap.CMap r0 = r0.getToUnicodeCMap()
            char r2 = (char) r7
            java.lang.String r2 = java.lang.Character.toString(r2)
            byte[] r0 = r0.getCodesFromUnicode(r2)
            if (r0 == 0) goto L49
            return r0
        L49:
            r0 = r1
            goto L51
        L4b:
            com.tom_roush.fontbox.ttf.CmapLookup r0 = r6.cmap
            int r0 = r0.getGlyphId(r7)
        L51:
            r2 = 1
            r3 = 2
            if (r0 == 0) goto L64
            byte[] r7 = new byte[r3]
            int r3 = r0 >> 8
            r3 = r3 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3
            r7[r1] = r3
            r0 = r0 & 255(0xff, float:3.57E-43)
            byte r0 = (byte) r0
            r7[r2] = r0
            return r7
        L64:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r7)
            r4[r1] = r5
            char r7 = (char) r7
            java.lang.Character r7 = java.lang.Character.valueOf(r7)
            r4[r2] = r7
            java.lang.String r7 = r6.getName()
            r4[r3] = r7
            java.lang.String r7 = "No glyph for U+%04X (%c) in font %s"
            java.lang.String r7 = java.lang.String.format(r7, r4)
            r0.<init>(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tom_roush.pdfbox.pdmodel.font.PDCIDFontType2.encode(int):byte[]");
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public BoundingBox getBoundingBox() {
        if (this.fontBBox == null) {
            this.fontBBox = generateBoundingBox();
        }
        return this.fontBBox;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public Matrix getFontMatrix() {
        if (this.fontMatrix == null) {
            this.fontMatrix = new Matrix(0.001f, 0.0f, 0.0f, 0.001f, 0.0f, 0.0f);
        }
        return this.fontMatrix;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public float getHeight(int i10) {
        return (this.ttf.getHorizontalHeader().getAscender() + (-this.ttf.getHorizontalHeader().getDescender())) / this.ttf.getUnitsPerEm();
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDVectorFont
    public Path getPath(int i10) {
        TrueTypeFont trueTypeFont = this.ttf;
        if ((trueTypeFont instanceof OpenTypeFont) && ((OpenTypeFont) trueTypeFont).isPostScript()) {
            return ((OpenTypeFont) this.ttf).getCFF().getFont().getType2CharString(codeToGID(i10)).getPath();
        }
        GlyphData glyph = this.ttf.getGlyph().getGlyph(codeToGID(i10));
        if (glyph != null) {
            return glyph.getPath();
        }
        return new Path();
    }

    public TrueTypeFont getTrueTypeFont() {
        return this.ttf;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public float getWidthFromFont(int i10) {
        int advanceWidth = this.ttf.getAdvanceWidth(codeToGID(i10));
        int unitsPerEm = this.ttf.getUnitsPerEm();
        if (unitsPerEm != 1000) {
            advanceWidth = (int) ((1000.0f / unitsPerEm) * advanceWidth);
        }
        return advanceWidth;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDVectorFont
    public boolean hasGlyph(int i10) {
        if (codeToGID(i10) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public boolean isDamaged() {
        return this.isDamaged;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public boolean isEmbedded() {
        return this.isEmbedded;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public PDCIDFontType2(com.tom_roush.pdfbox.cos.COSDictionary r4, com.tom_roush.pdfbox.pdmodel.font.PDType0Font r5, com.tom_roush.fontbox.ttf.TrueTypeFont r6) {
        /*
            r3 = this;
            r3.<init>(r4, r5)
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            r3.noMapping = r4
            com.tom_roush.pdfbox.pdmodel.font.PDFontDescriptor r4 = r3.getFontDescriptor()
            r5 = 0
            r0 = 1
            if (r6 == 0) goto L19
            r3.ttf = r6
            r3.isEmbedded = r0
            r3.isDamaged = r5
            goto L5d
        L19:
            r6 = 0
            if (r4 == 0) goto L2d
            com.tom_roush.pdfbox.pdmodel.common.PDStream r1 = r4.getFontFile2()
            if (r1 != 0) goto L26
            com.tom_roush.pdfbox.pdmodel.common.PDStream r1 = r4.getFontFile3()
        L26:
            if (r1 != 0) goto L2e
            com.tom_roush.pdfbox.pdmodel.common.PDStream r1 = r4.getFontFile()
            goto L2e
        L2d:
            r1 = r6
        L2e:
            if (r1 == 0) goto L4c
            com.tom_roush.fontbox.ttf.OTFParser r2 = new com.tom_roush.fontbox.ttf.OTFParser     // Catch: java.io.IOException -> L47
            r2.<init>(r0)     // Catch: java.io.IOException -> L47
            com.tom_roush.pdfbox.cos.COSInputStream r1 = r1.createInputStream()     // Catch: java.io.IOException -> L47
            com.tom_roush.fontbox.ttf.OpenTypeFont r6 = r2.parse(r1)     // Catch: java.io.IOException -> L47
            boolean r1 = r6.isPostScript()     // Catch: java.io.IOException -> L47
            if (r1 == 0) goto L4c
            r4.getFontName()     // Catch: java.io.IOException -> L47
            goto L4a
        L47:
            r3.getBaseFont()
        L4a:
            r4 = r0
            goto L4d
        L4c:
            r4 = r5
        L4d:
            if (r6 == 0) goto L50
            goto L51
        L50:
            r0 = r5
        L51:
            r3.isEmbedded = r0
            r3.isDamaged = r4
            if (r6 != 0) goto L5b
            com.tom_roush.fontbox.ttf.TrueTypeFont r6 = r3.findFontOrSubstitute()
        L5b:
            r3.ttf = r6
        L5d:
            com.tom_roush.fontbox.ttf.TrueTypeFont r4 = r3.ttf
            com.tom_roush.fontbox.ttf.CmapLookup r4 = r4.getUnicodeCmapLookup(r5)
            r3.cmap = r4
            int[] r4 = r3.readCIDToGIDMap()
            r3.cid2gid = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tom_roush.pdfbox.pdmodel.font.PDCIDFontType2.<init>(com.tom_roush.pdfbox.cos.COSDictionary, com.tom_roush.pdfbox.pdmodel.font.PDType0Font, com.tom_roush.fontbox.ttf.TrueTypeFont):void");
    }
}

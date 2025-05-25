package com.tom_roush.pdfbox.pdmodel.font;

import android.graphics.Path;
import android.graphics.PointF;
import com.tom_roush.fontbox.FontBoxFont;
import com.tom_roush.fontbox.cff.CFFCIDFont;
import com.tom_roush.fontbox.cff.CFFFont;
import com.tom_roush.fontbox.cff.CFFParser;
import com.tom_roush.fontbox.cff.CFFType1Font;
import com.tom_roush.fontbox.cff.Type2CharString;
import com.tom_roush.fontbox.util.BoundingBox;
import com.tom_roush.harmony.awt.geom.AffineTransform;
import com.tom_roush.pdfbox.pdmodel.common.PDRectangle;
import com.tom_roush.pdfbox.util.Matrix;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class PDCIDFontType0 extends PDCIDFont {
    private Float avgWidth;
    private int[] cid2gid;
    private final CFFCIDFont cidFont;
    private BoundingBox fontBBox;
    private Matrix fontMatrix;
    private final AffineTransform fontMatrixTransform;
    private final Map<Integer, Float> glyphHeights;
    private final boolean isDamaged;
    private final boolean isEmbedded;
    private final FontBoxFont t1Font;

    /* loaded from: classes2.dex */
    public class FF3ByteSource implements CFFParser.ByteSource {
        public /* synthetic */ FF3ByteSource(PDCIDFontType0 pDCIDFontType0, int i10) {
            this();
        }

        @Override // com.tom_roush.fontbox.cff.CFFParser.ByteSource
        public byte[] getBytes() {
            return PDCIDFontType0.this.getFontDescriptor().getFontFile3().toByteArray();
        }

        private FF3ByteSource() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public PDCIDFontType0(com.tom_roush.pdfbox.cos.COSDictionary r6, com.tom_roush.pdfbox.pdmodel.font.PDType0Font r7) {
        /*
            r5 = this;
            r5.<init>(r6, r7)
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            r5.glyphHeights = r6
            r6 = 0
            r5.avgWidth = r6
            r5.cid2gid = r6
            com.tom_roush.pdfbox.pdmodel.font.PDFontDescriptor r7 = r5.getFontDescriptor()
            if (r7 == 0) goto L20
            com.tom_roush.pdfbox.pdmodel.common.PDStream r0 = r7.getFontFile3()
            if (r0 == 0) goto L20
            byte[] r0 = r0.toByteArray()
            goto L21
        L20:
            r0 = r6
        L21:
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L34
            int r3 = r0.length
            if (r3 <= 0) goto L34
            r3 = r0[r1]
            r3 = r3 & 255(0xff, float:3.57E-43)
            r4 = 37
            if (r3 != r4) goto L34
            r7.getFontName()
            goto L4e
        L34:
            if (r0 == 0) goto L51
            com.tom_roush.fontbox.cff.CFFParser r3 = new com.tom_roush.fontbox.cff.CFFParser
            r3.<init>()
            com.tom_roush.pdfbox.pdmodel.font.PDCIDFontType0$FF3ByteSource r4 = new com.tom_roush.pdfbox.pdmodel.font.PDCIDFontType0$FF3ByteSource     // Catch: java.io.IOException -> L4b
            r4.<init>(r5, r1)     // Catch: java.io.IOException -> L4b
            java.util.List r0 = r3.parse(r0, r4)     // Catch: java.io.IOException -> L4b
            java.lang.Object r0 = r0.get(r1)     // Catch: java.io.IOException -> L4b
            com.tom_roush.fontbox.cff.CFFFont r0 = (com.tom_roush.fontbox.cff.CFFFont) r0     // Catch: java.io.IOException -> L4b
            goto L52
        L4b:
            r7.getFontName()
        L4e:
            r0 = r6
            r7 = r2
            goto L53
        L51:
            r0 = r6
        L52:
            r7 = r1
        L53:
            if (r0 == 0) goto L6f
            boolean r7 = r0 instanceof com.tom_roush.fontbox.cff.CFFCIDFont
            if (r7 == 0) goto L60
            com.tom_roush.fontbox.cff.CFFCIDFont r0 = (com.tom_roush.fontbox.cff.CFFCIDFont) r0
            r5.cidFont = r0
            r5.t1Font = r6
            goto L64
        L60:
            r5.cidFont = r6
            r5.t1Font = r0
        L64:
            int[] r6 = r5.readCIDToGIDMap()
            r5.cid2gid = r6
            r5.isEmbedded = r2
            r5.isDamaged = r1
            goto Lc1
        L6f:
            com.tom_roush.pdfbox.pdmodel.font.FontMapper r0 = com.tom_roush.pdfbox.pdmodel.font.FontMappers.instance()
            java.lang.String r2 = r5.getBaseFont()
            com.tom_roush.pdfbox.pdmodel.font.PDFontDescriptor r3 = r5.getFontDescriptor()
            com.tom_roush.pdfbox.pdmodel.font.PDCIDSystemInfo r4 = r5.getCIDSystemInfo()
            com.tom_roush.pdfbox.pdmodel.font.CIDFontMapping r0 = r0.getCIDFont(r2, r3, r4)
            boolean r2 = r0.isCIDFont()
            if (r2 == 0) goto La9
            com.tom_roush.fontbox.FontBoxFont r2 = r0.getFont()
            com.tom_roush.fontbox.ttf.OpenTypeFont r2 = (com.tom_roush.fontbox.ttf.OpenTypeFont) r2
            com.tom_roush.fontbox.ttf.CFFTable r2 = r2.getCFF()
            com.tom_roush.fontbox.cff.CFFFont r2 = r2.getFont()
            boolean r3 = r2 instanceof com.tom_roush.fontbox.cff.CFFCIDFont
            if (r3 == 0) goto La2
            com.tom_roush.fontbox.cff.CFFCIDFont r2 = (com.tom_roush.fontbox.cff.CFFCIDFont) r2
            r5.cidFont = r2
            r5.t1Font = r6
            goto Lb1
        La2:
            com.tom_roush.fontbox.cff.CFFType1Font r2 = (com.tom_roush.fontbox.cff.CFFType1Font) r2
            r5.cidFont = r6
            r5.t1Font = r2
            goto Lb1
        La9:
            r5.cidFont = r6
            com.tom_roush.fontbox.FontBoxFont r2 = r0.getTrueTypeFont()
            r5.t1Font = r2
        Lb1:
            boolean r6 = r0.isFallback()
            if (r6 == 0) goto Lbd
            r2.getName()
            r5.getBaseFont()
        Lbd:
            r5.isEmbedded = r1
            r5.isDamaged = r7
        Lc1:
            com.tom_roush.pdfbox.util.Matrix r6 = r5.getFontMatrix()
            com.tom_roush.harmony.awt.geom.AffineTransform r6 = r6.createAffineTransform()
            r5.fontMatrixTransform = r6
            r0 = 4652007308841189376(0x408f400000000000, double:1000.0)
            r6.scale(r0, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tom_roush.pdfbox.pdmodel.font.PDCIDFontType0.<init>(com.tom_roush.pdfbox.cos.COSDictionary, com.tom_roush.pdfbox.pdmodel.font.PDType0Font):void");
    }

    private BoundingBox generateBoundingBox() {
        if (getFontDescriptor() != null) {
            PDRectangle fontBoundingBox = getFontDescriptor().getFontBoundingBox();
            if (fontBoundingBox.getLowerLeftX() != 0.0f || fontBoundingBox.getLowerLeftY() != 0.0f || fontBoundingBox.getUpperRightX() != 0.0f || fontBoundingBox.getUpperRightY() != 0.0f) {
                return new BoundingBox(fontBoundingBox.getLowerLeftX(), fontBoundingBox.getLowerLeftY(), fontBoundingBox.getUpperRightX(), fontBoundingBox.getUpperRightY());
            }
        }
        CFFCIDFont cFFCIDFont = this.cidFont;
        if (cFFCIDFont != null) {
            return cFFCIDFont.getFontBBox();
        }
        try {
            return this.t1Font.getFontBBox();
        } catch (IOException unused) {
            return new BoundingBox();
        }
    }

    private float getAverageCharacterWidth() {
        return 500.0f;
    }

    private String getGlyphName(int i10) {
        String unicode = this.parent.toUnicode(i10);
        if (unicode == null) {
            return ".notdef";
        }
        return UniUtil.getUniNameOfCodePoint(unicode.codePointAt(0));
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDCIDFont
    public int codeToCID(int i10) {
        return this.parent.getCMap().toCID(i10);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDCIDFont
    public int codeToGID(int i10) {
        int codeToCID = codeToCID(i10);
        CFFCIDFont cFFCIDFont = this.cidFont;
        if (cFFCIDFont != null) {
            return cFFCIDFont.getCharset().getGIDForCID(codeToCID);
        }
        return codeToCID;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDCIDFont
    public byte[] encode(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDCIDFont, com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public float getAverageFontWidth() {
        if (this.avgWidth == null) {
            this.avgWidth = Float.valueOf(getAverageCharacterWidth());
        }
        return this.avgWidth.floatValue();
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public BoundingBox getBoundingBox() {
        if (this.fontBBox == null) {
            this.fontBBox = generateBoundingBox();
        }
        return this.fontBBox;
    }

    public CFFFont getCFFFont() {
        CFFCIDFont cFFCIDFont = this.cidFont;
        if (cFFCIDFont != null) {
            return cFFCIDFont;
        }
        FontBoxFont fontBoxFont = this.t1Font;
        if (fontBoxFont instanceof CFFType1Font) {
            return (CFFType1Font) fontBoxFont;
        }
        return null;
    }

    public FontBoxFont getFontBoxFont() {
        CFFCIDFont cFFCIDFont = this.cidFont;
        if (cFFCIDFont != null) {
            return cFFCIDFont;
        }
        return this.t1Font;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public final Matrix getFontMatrix() {
        List<Number> fontMatrix;
        if (this.fontMatrix == null) {
            CFFCIDFont cFFCIDFont = this.cidFont;
            if (cFFCIDFont != null) {
                fontMatrix = cFFCIDFont.getFontMatrix();
            } else {
                try {
                    fontMatrix = this.t1Font.getFontMatrix();
                } catch (IOException unused) {
                    return new Matrix(0.001f, 0.0f, 0.0f, 0.001f, 0.0f, 0.0f);
                }
            }
            if (fontMatrix != null && fontMatrix.size() == 6) {
                this.fontMatrix = new Matrix(fontMatrix.get(0).floatValue(), fontMatrix.get(1).floatValue(), fontMatrix.get(2).floatValue(), fontMatrix.get(3).floatValue(), fontMatrix.get(4).floatValue(), fontMatrix.get(5).floatValue());
            } else {
                this.fontMatrix = new Matrix(0.001f, 0.0f, 0.0f, 0.001f, 0.0f, 0.0f);
            }
        }
        return this.fontMatrix;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public float getHeight(int i10) {
        int codeToCID = codeToCID(i10);
        if (!this.glyphHeights.containsKey(Integer.valueOf(codeToCID))) {
            float height = getType2CharString(codeToCID).getBounds().height();
            this.glyphHeights.put(Integer.valueOf(codeToCID), Float.valueOf(height));
            return height;
        }
        return this.glyphHeights.get(Integer.valueOf(codeToCID)).floatValue();
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDVectorFont
    public Path getPath(int i10) {
        int codeToCID = codeToCID(i10);
        int[] iArr = this.cid2gid;
        if (iArr != null && this.isEmbedded) {
            codeToCID = iArr[codeToCID];
        }
        Type2CharString type2CharString = getType2CharString(codeToCID);
        if (type2CharString != null) {
            return type2CharString.getPath();
        }
        if (this.isEmbedded) {
            FontBoxFont fontBoxFont = this.t1Font;
            if (fontBoxFont instanceof CFFType1Font) {
                return ((CFFType1Font) fontBoxFont).getType2CharString(codeToCID).getPath();
            }
        }
        return this.t1Font.getPath(getGlyphName(i10));
    }

    public Type2CharString getType2CharString(int i10) {
        CFFCIDFont cFFCIDFont = this.cidFont;
        if (cFFCIDFont != null) {
            return cFFCIDFont.getType2CharString(i10);
        }
        FontBoxFont fontBoxFont = this.t1Font;
        if (fontBoxFont instanceof CFFType1Font) {
            return ((CFFType1Font) fontBoxFont).getType2CharString(i10);
        }
        return null;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public float getWidthFromFont(int i10) {
        float width;
        int width2;
        int codeToCID = codeToCID(i10);
        if (this.cidFont != null) {
            width2 = getType2CharString(codeToCID).getWidth();
        } else {
            if (this.isEmbedded) {
                FontBoxFont fontBoxFont = this.t1Font;
                if (fontBoxFont instanceof CFFType1Font) {
                    width2 = ((CFFType1Font) fontBoxFont).getType2CharString(codeToCID).getWidth();
                }
            }
            width = this.t1Font.getWidth(getGlyphName(i10));
            PointF pointF = new PointF(width, 0.0f);
            this.fontMatrixTransform.transform(pointF, pointF);
            return pointF.x;
        }
        width = width2;
        PointF pointF2 = new PointF(width, 0.0f);
        this.fontMatrixTransform.transform(pointF2, pointF2);
        return pointF2.x;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDVectorFont
    public boolean hasGlyph(int i10) {
        int codeToCID = codeToCID(i10);
        Type2CharString type2CharString = getType2CharString(codeToCID);
        if (type2CharString != null) {
            if (type2CharString.getGID() != 0) {
                return true;
            }
            return false;
        }
        if (this.isEmbedded) {
            FontBoxFont fontBoxFont = this.t1Font;
            if (fontBoxFont instanceof CFFType1Font) {
                if (((CFFType1Font) fontBoxFont).getType2CharString(codeToCID).getGID() != 0) {
                    return true;
                }
                return false;
            }
        }
        return this.t1Font.hasGlyph(getGlyphName(i10));
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public boolean isDamaged() {
        return this.isDamaged;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public boolean isEmbedded() {
        return this.isEmbedded;
    }
}

package com.tom_roush.pdfbox.pdmodel.font;

import android.graphics.Path;
import com.tom_roush.fontbox.EncodedFont;
import com.tom_roush.fontbox.FontBoxFont;
import com.tom_roush.fontbox.cff.CFFParser;
import com.tom_roush.fontbox.cff.CFFType1Font;
import com.tom_roush.fontbox.util.BoundingBox;
import com.tom_roush.harmony.awt.geom.AffineTransform;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.common.PDRectangle;
import com.tom_roush.pdfbox.pdmodel.font.encoding.Encoding;
import com.tom_roush.pdfbox.pdmodel.font.encoding.StandardEncoding;
import com.tom_roush.pdfbox.pdmodel.font.encoding.Type1Encoding;
import com.tom_roush.pdfbox.util.Matrix;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class PDType1CFont extends PDSimpleFont {
    private Float avgWidth;
    private final CFFType1Font cffFont;
    private BoundingBox fontBBox;
    private Matrix fontMatrix;
    private final AffineTransform fontMatrixTransform;
    private final FontBoxFont genericFont;
    private final Map<String, Float> glyphHeights;
    private final boolean isDamaged;
    private final boolean isEmbedded;

    /* loaded from: classes2.dex */
    public class FF3ByteSource implements CFFParser.ByteSource {
        public /* synthetic */ FF3ByteSource(PDType1CFont pDType1CFont, int i10) {
            this();
        }

        @Override // com.tom_roush.fontbox.cff.CFFParser.ByteSource
        public byte[] getBytes() {
            return PDType1CFont.this.getFontDescriptor().getFontFile3().toByteArray();
        }

        private FF3ByteSource() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0028 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public PDType1CFont(com.tom_roush.pdfbox.cos.COSDictionary r7) {
        /*
            r6 = this;
            r6.<init>(r7)
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            r6.glyphHeights = r7
            r7 = 0
            r6.avgWidth = r7
            com.tom_roush.pdfbox.pdmodel.font.PDFontDescriptor r0 = r6.getFontDescriptor()
            if (r0 == 0) goto L23
            com.tom_roush.pdfbox.pdmodel.common.PDStream r1 = r0.getFontFile3()
            if (r1 == 0) goto L23
            byte[] r1 = r1.toByteArray()
            int r2 = r1.length
            if (r2 != 0) goto L24
            r6.getName()
        L23:
            r1 = r7
        L24:
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L43
            com.tom_roush.fontbox.cff.CFFParser r4 = new com.tom_roush.fontbox.cff.CFFParser     // Catch: java.io.IOException -> L3e
            r4.<init>()     // Catch: java.io.IOException -> L3e
            com.tom_roush.pdfbox.pdmodel.font.PDType1CFont$FF3ByteSource r5 = new com.tom_roush.pdfbox.pdmodel.font.PDType1CFont$FF3ByteSource     // Catch: java.io.IOException -> L3e
            r5.<init>(r6, r2)     // Catch: java.io.IOException -> L3e
            java.util.List r1 = r4.parse(r1, r5)     // Catch: java.io.IOException -> L3e
            java.lang.Object r1 = r1.get(r2)     // Catch: java.io.IOException -> L3e
            com.tom_roush.fontbox.cff.CFFType1Font r1 = (com.tom_roush.fontbox.cff.CFFType1Font) r1     // Catch: java.io.IOException -> L3e
            r7 = r1
            goto L43
        L3e:
            r6.getName()
            r1 = r3
            goto L44
        L43:
            r1 = r2
        L44:
            r6.isDamaged = r1
            r6.cffFont = r7
            if (r7 == 0) goto L4f
            r6.genericFont = r7
            r6.isEmbedded = r3
            goto L6f
        L4f:
            com.tom_roush.pdfbox.pdmodel.font.FontMapper r7 = com.tom_roush.pdfbox.pdmodel.font.FontMappers.instance()
            java.lang.String r1 = r6.getBaseFont()
            com.tom_roush.pdfbox.pdmodel.font.FontMapping r7 = r7.getFontBoxFont(r1, r0)
            com.tom_roush.fontbox.FontBoxFont r0 = r7.getFont()
            r6.genericFont = r0
            boolean r7 = r7.isFallback()
            if (r7 == 0) goto L6d
            r0.getName()
            r6.getBaseFont()
        L6d:
            r6.isEmbedded = r2
        L6f:
            r6.readEncoding()
            com.tom_roush.pdfbox.util.Matrix r7 = r6.getFontMatrix()
            com.tom_roush.harmony.awt.geom.AffineTransform r7 = r7.createAffineTransform()
            r6.fontMatrixTransform = r7
            r0 = 4652007308841189376(0x408f400000000000, double:1000.0)
            r7.scale(r0, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tom_roush.pdfbox.pdmodel.font.PDType1CFont.<init>(com.tom_roush.pdfbox.cos.COSDictionary):void");
    }

    private BoundingBox generateBoundingBox() {
        PDRectangle fontBoundingBox;
        if (getFontDescriptor() != null && (fontBoundingBox = getFontDescriptor().getFontBoundingBox()) != null && (fontBoundingBox.getLowerLeftX() != 0.0f || fontBoundingBox.getLowerLeftY() != 0.0f || fontBoundingBox.getUpperRightX() != 0.0f || fontBoundingBox.getUpperRightY() != 0.0f)) {
            return new BoundingBox(fontBoundingBox.getLowerLeftX(), fontBoundingBox.getLowerLeftY(), fontBoundingBox.getUpperRightX(), fontBoundingBox.getUpperRightY());
        }
        return this.genericFont.getFontBBox();
    }

    private float getAverageCharacterWidth() {
        return 500.0f;
    }

    private String getNameInFont(String str) {
        if (!isEmbedded() && !this.genericFont.hasGlyph(str)) {
            String unicode = getGlyphList().toUnicode(str);
            if (unicode != null && unicode.length() == 1) {
                String uniNameOfCodePoint = UniUtil.getUniNameOfCodePoint(unicode.codePointAt(0));
                if (this.genericFont.hasGlyph(uniNameOfCodePoint)) {
                    return uniNameOfCodePoint;
                }
            }
            return ".notdef";
        }
        return str;
    }

    public String codeToName(int i10) {
        return getEncoding().getName(i10);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFont
    public byte[] encode(int i10) {
        String codePointToName = getGlyphList().codePointToName(i10);
        if (this.encoding.contains(codePointToName)) {
            String nameInFont = getNameInFont(codePointToName);
            Map<String, Integer> nameToCodeMap = this.encoding.getNameToCodeMap();
            if (nameInFont.equals(".notdef") || !this.genericFont.hasGlyph(nameInFont)) {
                throw new IllegalArgumentException(String.format("No glyph for U+%04X in font %s", Integer.valueOf(i10), getName()));
            }
            return new byte[]{(byte) nameToCodeMap.get(codePointToName).intValue()};
        }
        throw new IllegalArgumentException(String.format("U+%04X ('%s') is not available in this font's encoding: %s", Integer.valueOf(i10), codePointToName, this.encoding.getEncodingName()));
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFont, com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public float getAverageFontWidth() {
        if (this.avgWidth == null) {
            this.avgWidth = Float.valueOf(getAverageCharacterWidth());
        }
        return this.avgWidth.floatValue();
    }

    public final String getBaseFont() {
        return this.dict.getNameAsString(COSName.BASE_FONT);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public BoundingBox getBoundingBox() {
        if (this.fontBBox == null) {
            this.fontBBox = generateBoundingBox();
        }
        return this.fontBBox;
    }

    public CFFType1Font getCFFType1Font() {
        return this.cffFont;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDSimpleFont
    public FontBoxFont getFontBoxFont() {
        return this.genericFont;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFont, com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public final Matrix getFontMatrix() {
        List<Number> list;
        if (this.fontMatrix == null) {
            try {
                list = this.genericFont.getFontMatrix();
            } catch (IOException unused) {
                this.fontMatrix = PDFont.DEFAULT_FONT_MATRIX;
                list = null;
            }
            if (list != null && list.size() == 6) {
                this.fontMatrix = new Matrix(list.get(0).floatValue(), list.get(1).floatValue(), list.get(2).floatValue(), list.get(3).floatValue(), list.get(4).floatValue(), list.get(5).floatValue());
            } else {
                return super.getFontMatrix();
            }
        }
        return this.fontMatrix;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public float getHeight(int i10) {
        String codeToName = codeToName(i10);
        if (!this.glyphHeights.containsKey(codeToName)) {
            CFFType1Font cFFType1Font = this.cffFont;
            if (cFFType1Font == null) {
                return 0.0f;
            }
            float height = cFFType1Font.getType1CharString(codeToName).getBounds().height();
            this.glyphHeights.put(codeToName, Float.valueOf(height));
            return height;
        }
        return this.glyphHeights.get(codeToName).floatValue();
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public final String getName() {
        return getBaseFont();
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDSimpleFont
    public Path getPath(String str) {
        if (str.equals(".notdef") && !isEmbedded() && !isStandard14()) {
            return new Path();
        }
        if ("sfthyphen".equals(str)) {
            return this.genericFont.getPath("hyphen");
        }
        if ("nbspace".equals(str)) {
            return this.genericFont.getPath("space");
        }
        return this.genericFont.getPath(str);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFont
    public float getStringWidth(String str) {
        float f10 = 0.0f;
        if (this.cffFont == null) {
            return 0.0f;
        }
        for (int i10 = 0; i10 < str.length(); i10++) {
            f10 += this.cffFont.getType1CharString(getGlyphList().codePointToName(str.codePointAt(i10))).getWidth();
        }
        return f10;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public float getWidthFromFont(int i10) {
        float[] fArr = {this.genericFont.getWidth(getNameInFont(codeToName(i10))), 0.0f};
        this.fontMatrixTransform.transform(fArr, 0, fArr, 0, 1);
        return fArr[0];
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDSimpleFont
    public boolean hasGlyph(String str) {
        return this.genericFont.hasGlyph(str);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public boolean isDamaged() {
        return this.isDamaged;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public boolean isEmbedded() {
        return this.isEmbedded;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFont
    public int readCode(InputStream inputStream) {
        return inputStream.read();
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDSimpleFont
    public Encoding readEncodingFromFont() {
        if (!isEmbedded() && getStandard14AFM() != null) {
            return new Type1Encoding(getStandard14AFM());
        }
        FontBoxFont fontBoxFont = this.genericFont;
        if (fontBoxFont instanceof EncodedFont) {
            return Type1Encoding.fromFontBox(((EncodedFont) fontBoxFont).getEncoding());
        }
        return StandardEncoding.INSTANCE;
    }
}

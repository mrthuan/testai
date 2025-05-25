package com.tom_roush.pdfbox.pdmodel.font;

import android.graphics.Path;
import android.graphics.RectF;
import com.tom_roush.fontbox.EncodedFont;
import com.tom_roush.fontbox.FontBoxFont;
import com.tom_roush.fontbox.type1.Type1Font;
import com.tom_roush.fontbox.util.BoundingBox;
import com.tom_roush.harmony.awt.geom.AffineTransform;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.PDDocument;
import com.tom_roush.pdfbox.pdmodel.common.PDRectangle;
import com.tom_roush.pdfbox.pdmodel.font.encoding.Encoding;
import com.tom_roush.pdfbox.pdmodel.font.encoding.StandardEncoding;
import com.tom_roush.pdfbox.pdmodel.font.encoding.SymbolEncoding;
import com.tom_roush.pdfbox.pdmodel.font.encoding.Type1Encoding;
import com.tom_roush.pdfbox.pdmodel.font.encoding.WinAnsiEncoding;
import com.tom_roush.pdfbox.pdmodel.font.encoding.ZapfDingbatsEncoding;
import com.tom_roush.pdfbox.util.Matrix;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import lib.zj.office.fc.hslf.record.RecordTypes;

/* loaded from: classes2.dex */
public class PDType1Font extends PDSimpleFont {
    private static final Map<String, String> ALT_NAMES;
    public static final PDType1Font COURIER;
    public static final PDType1Font COURIER_BOLD;
    public static final PDType1Font COURIER_BOLD_OBLIQUE;
    public static final PDType1Font COURIER_OBLIQUE;
    public static final PDType1Font HELVETICA;
    public static final PDType1Font HELVETICA_BOLD;
    public static final PDType1Font HELVETICA_BOLD_OBLIQUE;
    public static final PDType1Font HELVETICA_OBLIQUE;
    private static final int PFB_START_MARKER = 128;
    public static final PDType1Font SYMBOL;
    public static final PDType1Font TIMES_BOLD;
    public static final PDType1Font TIMES_BOLD_ITALIC;
    public static final PDType1Font TIMES_ITALIC;
    public static final PDType1Font TIMES_ROMAN;
    public static final PDType1Font ZAPF_DINGBATS;
    private final Map<Integer, byte[]> codeToBytesMap;
    private BoundingBox fontBBox;
    private Matrix fontMatrix;
    private final AffineTransform fontMatrixTransform;
    private final FontBoxFont genericFont;
    private final boolean isDamaged;
    private final boolean isEmbedded;
    private final Type1Font type1font;

    static {
        HashMap hashMap = new HashMap();
        ALT_NAMES = hashMap;
        hashMap.put("ff", "f_f");
        hashMap.put("ffi", "f_f_i");
        hashMap.put("ffl", "f_f_l");
        hashMap.put("fi", "f_i");
        hashMap.put("fl", "f_l");
        hashMap.put("st", "s_t");
        hashMap.put("IJ", "I_J");
        hashMap.put("ij", "i_j");
        hashMap.put("ellipsis", "elipsis");
        TIMES_ROMAN = new PDType1Font("Times-Roman");
        TIMES_BOLD = new PDType1Font("Times-Bold");
        TIMES_ITALIC = new PDType1Font("Times-Italic");
        TIMES_BOLD_ITALIC = new PDType1Font("Times-BoldItalic");
        HELVETICA = new PDType1Font("Helvetica");
        HELVETICA_BOLD = new PDType1Font("Helvetica-Bold");
        HELVETICA_OBLIQUE = new PDType1Font("Helvetica-Oblique");
        HELVETICA_BOLD_OBLIQUE = new PDType1Font("Helvetica-BoldOblique");
        COURIER = new PDType1Font("Courier");
        COURIER_BOLD = new PDType1Font("Courier-Bold");
        COURIER_OBLIQUE = new PDType1Font("Courier-Oblique");
        COURIER_BOLD_OBLIQUE = new PDType1Font("Courier-BoldOblique");
        SYMBOL = new PDType1Font("Symbol");
        ZAPF_DINGBATS = new PDType1Font("ZapfDingbats");
    }

    private PDType1Font(String str) {
        super(str);
        this.dict.setItem(COSName.SUBTYPE, (COSBase) COSName.TYPE1);
        this.dict.setName(COSName.BASE_FONT, str);
        if ("ZapfDingbats".equals(str)) {
            this.encoding = ZapfDingbatsEncoding.INSTANCE;
        } else if ("Symbol".equals(str)) {
            this.encoding = SymbolEncoding.INSTANCE;
        } else {
            this.encoding = WinAnsiEncoding.INSTANCE;
            this.dict.setItem(COSName.ENCODING, (COSBase) COSName.WIN_ANSI_ENCODING);
        }
        this.codeToBytesMap = new ConcurrentHashMap();
        this.type1font = null;
        FontMapping<FontBoxFont> fontBoxFont = FontMappers.instance().getFontBoxFont(getBaseFont(), getFontDescriptor());
        FontBoxFont font = fontBoxFont.getFont();
        this.genericFont = font;
        if (fontBoxFont.isFallback()) {
            try {
                font.getName();
            } catch (IOException unused) {
            }
            getBaseFont();
        }
        this.isEmbedded = false;
        this.isDamaged = false;
        this.fontMatrixTransform = new AffineTransform();
    }

    private static int findBinaryOffsetAfterExec(byte[] bArr, int i10) {
        byte b10;
        while (true) {
            if (i10 <= 0) {
                break;
            } else if (bArr[i10 + 0] == 101 && bArr[i10 + 1] == 120 && bArr[i10 + 2] == 101 && bArr[i10 + 3] == 99) {
                i10 += 4;
                while (i10 < bArr.length && ((b10 = bArr[i10]) == 13 || b10 == 10 || b10 == 32 || b10 == 9)) {
                    i10++;
                }
            } else {
                i10--;
            }
        }
        return i10;
    }

    private BoundingBox generateBoundingBox() {
        PDRectangle fontBoundingBox;
        if (getFontDescriptor() != null && (fontBoundingBox = getFontDescriptor().getFontBoundingBox()) != null && (fontBoundingBox.getLowerLeftX() != 0.0f || fontBoundingBox.getLowerLeftY() != 0.0f || fontBoundingBox.getUpperRightX() != 0.0f || fontBoundingBox.getUpperRightY() != 0.0f)) {
            return new BoundingBox(fontBoundingBox.getLowerLeftX(), fontBoundingBox.getLowerLeftY(), fontBoundingBox.getUpperRightX(), fontBoundingBox.getUpperRightY());
        }
        return this.genericFont.getFontBBox();
    }

    private String getNameInFont(String str) {
        Integer num;
        if (!isEmbedded() && !this.genericFont.hasGlyph(str)) {
            String str2 = ALT_NAMES.get(str);
            if (str2 != null && !str.equals(".notdef") && this.genericFont.hasGlyph(str2)) {
                return str2;
            }
            String unicode = getGlyphList().toUnicode(str);
            if (unicode != null && unicode.length() == 1) {
                String uniNameOfCodePoint = UniUtil.getUniNameOfCodePoint(unicode.codePointAt(0));
                if (this.genericFont.hasGlyph(uniNameOfCodePoint)) {
                    return uniNameOfCodePoint;
                }
                if ("SymbolMT".equals(this.genericFont.getName()) && (num = SymbolEncoding.INSTANCE.getNameToCodeMap().get(str)) != null) {
                    String uniNameOfCodePoint2 = UniUtil.getUniNameOfCodePoint(num.intValue() + RecordTypes.EscherDggContainer);
                    if (this.genericFont.hasGlyph(uniNameOfCodePoint2)) {
                        return uniNameOfCodePoint2;
                    }
                }
            }
            return ".notdef";
        }
        return str;
    }

    private int repairLength1(byte[] bArr, int i10) {
        int max = Math.max(0, i10 - 4);
        if (max <= 0 || max > bArr.length - 4) {
            max = bArr.length - 4;
        }
        int findBinaryOffsetAfterExec = findBinaryOffsetAfterExec(bArr, max);
        if (findBinaryOffsetAfterExec == 0 && i10 > 0) {
            findBinaryOffsetAfterExec = findBinaryOffsetAfterExec(bArr, bArr.length - 4);
        }
        if (i10 - findBinaryOffsetAfterExec != 0 && findBinaryOffsetAfterExec > 0) {
            getName();
            return findBinaryOffsetAfterExec;
        }
        return i10;
    }

    private int repairLength2(byte[] bArr, int i10, int i11) {
        if (i11 >= 0 && i11 <= bArr.length - i10) {
            return i11;
        }
        getName();
        return bArr.length - i10;
    }

    public String codeToName(int i10) {
        return getNameInFont(getEncoding().getName(i10));
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFont
    public byte[] encode(int i10) {
        byte[] bArr = this.codeToBytesMap.get(Integer.valueOf(i10));
        if (bArr != null) {
            return bArr;
        }
        String codePointToName = getGlyphList().codePointToName(i10);
        if (isStandard14()) {
            if (this.encoding.contains(codePointToName)) {
                if (".notdef".equals(codePointToName)) {
                    throw new IllegalArgumentException(String.format("No glyph for U+%04X in font %s", Integer.valueOf(i10), getName()));
                }
            } else {
                throw new IllegalArgumentException(String.format("U+%04X ('%s') is not available in this font %s encoding: %s", Integer.valueOf(i10), codePointToName, getName(), this.encoding.getEncodingName()));
            }
        } else if (this.encoding.contains(codePointToName)) {
            String nameInFont = getNameInFont(codePointToName);
            if (nameInFont.equals(".notdef") || !this.genericFont.hasGlyph(nameInFont)) {
                throw new IllegalArgumentException(String.format("No glyph for U+%04X in font %s (generic: %s)", Integer.valueOf(i10), getName(), this.genericFont.getName()));
            }
        } else {
            throw new IllegalArgumentException(String.format("U+%04X ('%s') is not available in this font %s (generic: %s) encoding: %s", Integer.valueOf(i10), codePointToName, getName(), this.genericFont.getName(), this.encoding.getEncodingName()));
        }
        byte[] bArr2 = {(byte) this.encoding.getNameToCodeMap().get(codePointToName).intValue()};
        this.codeToBytesMap.put(Integer.valueOf(i10), bArr2);
        return bArr2;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFont, com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public float getAverageFontWidth() {
        if (getStandard14AFM() != null) {
            return getStandard14AFM().getAverageCharacterWidth();
        }
        return super.getAverageFontWidth();
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
        if (getStandard14AFM() != null) {
            return getStandard14AFM().getCharacterHeight(getEncoding().getName(i10));
        }
        RectF rectF = new RectF();
        this.genericFont.getPath(codeToName).computeBounds(rectF, true);
        return rectF.height();
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public String getName() {
        return getBaseFont();
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDSimpleFont
    public Path getPath(String str) {
        if (str.equals(".notdef") && !this.isEmbedded) {
            return new Path();
        }
        return this.genericFont.getPath(getNameInFont(str));
    }

    public Type1Font getType1Font() {
        return this.type1font;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public float getWidthFromFont(int i10) {
        String codeToName = codeToName(i10);
        if (!this.isEmbedded && ".notdef".equals(codeToName)) {
            return 250.0f;
        }
        float[] fArr = {this.genericFont.getWidth(codeToName), 0.0f};
        this.fontMatrixTransform.transform(fArr, 0, fArr, 0, 1);
        return fArr[0];
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDSimpleFont
    public boolean hasGlyph(String str) {
        return this.genericFont.hasGlyph(getNameInFont(str));
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

    public PDType1Font(PDDocument pDDocument, InputStream inputStream) {
        this(pDDocument, inputStream, null);
    }

    public PDType1Font(PDDocument pDDocument, InputStream inputStream, Encoding encoding) {
        PDType1FontEmbedder pDType1FontEmbedder = new PDType1FontEmbedder(pDDocument, this.dict, inputStream, encoding);
        this.encoding = encoding == null ? pDType1FontEmbedder.getFontEncoding() : encoding;
        this.glyphList = pDType1FontEmbedder.getGlyphList();
        this.type1font = pDType1FontEmbedder.getType1Font();
        this.genericFont = pDType1FontEmbedder.getType1Font();
        this.isEmbedded = true;
        this.isDamaged = false;
        this.fontMatrixTransform = new AffineTransform();
        this.codeToBytesMap = new HashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public PDType1Font(com.tom_roush.pdfbox.cos.COSDictionary r10) {
        /*
            r9 = this;
            java.lang.String r0 = "Invalid length data, actual length: "
            r9.<init>(r10)
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>()
            r9.codeToBytesMap = r10
            com.tom_roush.pdfbox.pdmodel.font.PDFontDescriptor r10 = r9.getFontDescriptor()
            r1 = 1
            r2 = 0
            r3 = 0
            if (r10 == 0) goto La4
            com.tom_roush.pdfbox.pdmodel.common.PDStream r4 = r10.getFontFile3()
            if (r4 != 0) goto L9c
            com.tom_roush.pdfbox.pdmodel.common.PDStream r4 = r10.getFontFile()
            if (r4 == 0) goto La4
            com.tom_roush.pdfbox.cos.COSStream r5 = r4.getCOSObject()     // Catch: java.io.IOException -> L93 com.tom_roush.fontbox.type1.DamagedFontException -> L97
            com.tom_roush.pdfbox.cos.COSName r6 = com.tom_roush.pdfbox.cos.COSName.LENGTH1     // Catch: java.io.IOException -> L93 com.tom_roush.fontbox.type1.DamagedFontException -> L97
            int r6 = r5.getInt(r6)     // Catch: java.io.IOException -> L93 com.tom_roush.fontbox.type1.DamagedFontException -> L97
            com.tom_roush.pdfbox.cos.COSName r7 = com.tom_roush.pdfbox.cos.COSName.LENGTH2     // Catch: java.io.IOException -> L93 com.tom_roush.fontbox.type1.DamagedFontException -> L97
            int r5 = r5.getInt(r7)     // Catch: java.io.IOException -> L93 com.tom_roush.fontbox.type1.DamagedFontException -> L97
            byte[] r4 = r4.toByteArray()     // Catch: java.io.IOException -> L93 com.tom_roush.fontbox.type1.DamagedFontException -> L97
            int r7 = r4.length     // Catch: java.io.IOException -> L93 com.tom_roush.fontbox.type1.DamagedFontException -> L97
            if (r7 == 0) goto L8b
            int r6 = r9.repairLength1(r4, r6)     // Catch: java.io.IOException -> L93 com.tom_roush.fontbox.type1.DamagedFontException -> L97
            int r5 = r9.repairLength2(r4, r6, r5)     // Catch: java.io.IOException -> L93 com.tom_roush.fontbox.type1.DamagedFontException -> L97
            int r7 = r4.length     // Catch: java.io.IOException -> L93 com.tom_roush.fontbox.type1.DamagedFontException -> L97
            if (r7 <= 0) goto L51
            r7 = r4[r3]     // Catch: java.io.IOException -> L93 com.tom_roush.fontbox.type1.DamagedFontException -> L97
            r7 = r7 & 255(0xff, float:3.57E-43)
            r8 = 128(0x80, float:1.8E-43)
            if (r7 != r8) goto L51
            com.tom_roush.fontbox.type1.Type1Font r0 = com.tom_roush.fontbox.type1.Type1Font.createWithPFB(r4)     // Catch: java.io.IOException -> L93 com.tom_roush.fontbox.type1.DamagedFontException -> L97
        L4f:
            r2 = r0
            goto La4
        L51:
            if (r6 < 0) goto L68
            int r7 = r6 + r5
            if (r6 > r7) goto L68
            byte[] r0 = java.util.Arrays.copyOfRange(r4, r3, r6)     // Catch: java.io.IOException -> L93 com.tom_roush.fontbox.type1.DamagedFontException -> L97
            byte[] r4 = java.util.Arrays.copyOfRange(r4, r6, r7)     // Catch: java.io.IOException -> L93 com.tom_roush.fontbox.type1.DamagedFontException -> L97
            if (r6 <= 0) goto La4
            if (r5 <= 0) goto La4
            com.tom_roush.fontbox.type1.Type1Font r0 = com.tom_roush.fontbox.type1.Type1Font.createWithSegments(r0, r4)     // Catch: java.io.IOException -> L93 com.tom_roush.fontbox.type1.DamagedFontException -> L97
            goto L4f
        L68:
            java.io.IOException r7 = new java.io.IOException     // Catch: java.io.IOException -> L93 com.tom_roush.fontbox.type1.DamagedFontException -> L97
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L93 com.tom_roush.fontbox.type1.DamagedFontException -> L97
            r8.<init>(r0)     // Catch: java.io.IOException -> L93 com.tom_roush.fontbox.type1.DamagedFontException -> L97
            int r0 = r4.length     // Catch: java.io.IOException -> L93 com.tom_roush.fontbox.type1.DamagedFontException -> L97
            r8.append(r0)     // Catch: java.io.IOException -> L93 com.tom_roush.fontbox.type1.DamagedFontException -> L97
            java.lang.String r0 = ", /Length1: "
            r8.append(r0)     // Catch: java.io.IOException -> L93 com.tom_roush.fontbox.type1.DamagedFontException -> L97
            r8.append(r6)     // Catch: java.io.IOException -> L93 com.tom_roush.fontbox.type1.DamagedFontException -> L97
            java.lang.String r0 = ", /Length2: "
            r8.append(r0)     // Catch: java.io.IOException -> L93 com.tom_roush.fontbox.type1.DamagedFontException -> L97
            r8.append(r5)     // Catch: java.io.IOException -> L93 com.tom_roush.fontbox.type1.DamagedFontException -> L97
            java.lang.String r0 = r8.toString()     // Catch: java.io.IOException -> L93 com.tom_roush.fontbox.type1.DamagedFontException -> L97
            r7.<init>(r0)     // Catch: java.io.IOException -> L93 com.tom_roush.fontbox.type1.DamagedFontException -> L97
            throw r7     // Catch: java.io.IOException -> L93 com.tom_roush.fontbox.type1.DamagedFontException -> L97
        L8b:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.io.IOException -> L93 com.tom_roush.fontbox.type1.DamagedFontException -> L97
            java.lang.String r4 = "Font data unavailable"
            r0.<init>(r4)     // Catch: java.io.IOException -> L93 com.tom_roush.fontbox.type1.DamagedFontException -> L97
            throw r0     // Catch: java.io.IOException -> L93 com.tom_roush.fontbox.type1.DamagedFontException -> L97
        L93:
            r10.getFontName()
            goto L9a
        L97:
            r10.getFontName()
        L9a:
            r0 = r1
            goto La5
        L9c:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Use PDType1CFont for FontFile3"
            r10.<init>(r0)
            throw r10
        La4:
            r0 = r3
        La5:
            if (r2 == 0) goto La8
            goto La9
        La8:
            r1 = r3
        La9:
            r9.isEmbedded = r1
            r9.isDamaged = r0
            r9.type1font = r2
            if (r2 == 0) goto Lb4
            r9.genericFont = r2
            goto Ld2
        Lb4:
            com.tom_roush.pdfbox.pdmodel.font.FontMapper r0 = com.tom_roush.pdfbox.pdmodel.font.FontMappers.instance()
            java.lang.String r1 = r9.getBaseFont()
            com.tom_roush.pdfbox.pdmodel.font.FontMapping r10 = r0.getFontBoxFont(r1, r10)
            com.tom_roush.fontbox.FontBoxFont r0 = r10.getFont()
            r9.genericFont = r0
            boolean r10 = r10.isFallback()
            if (r10 == 0) goto Ld2
            r0.getName()
            r9.getBaseFont()
        Ld2:
            r9.readEncoding()
            com.tom_roush.pdfbox.util.Matrix r10 = r9.getFontMatrix()
            com.tom_roush.harmony.awt.geom.AffineTransform r10 = r10.createAffineTransform()
            r9.fontMatrixTransform = r10
            r0 = 4652007308841189376(0x408f400000000000, double:1000.0)
            r10.scale(r0, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tom_roush.pdfbox.pdmodel.font.PDType1Font.<init>(com.tom_roush.pdfbox.cos.COSDictionary):void");
    }
}

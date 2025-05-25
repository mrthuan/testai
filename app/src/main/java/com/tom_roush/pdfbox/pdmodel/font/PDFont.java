package com.tom_roush.pdfbox.pdmodel.font;

import a0.a;
import com.tom_roush.fontbox.afm.FontMetrics;
import com.tom_roush.fontbox.cmap.CMap;
import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSInputStream;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSNumber;
import com.tom_roush.pdfbox.cos.COSStream;
import com.tom_roush.pdfbox.io.IOUtils;
import com.tom_roush.pdfbox.pdmodel.common.COSArrayList;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;
import com.tom_roush.pdfbox.pdmodel.font.encoding.GlyphList;
import com.tom_roush.pdfbox.util.Matrix;
import com.tom_roush.pdfbox.util.Vector;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public abstract class PDFont implements COSObjectable, PDFontLike {
    protected static final Matrix DEFAULT_FONT_MATRIX = new Matrix(0.001f, 0.0f, 0.0f, 0.001f, 0.0f, 0.0f);
    private final FontMetrics afmStandard14;
    private float avgFontWidth;
    private final Map<Integer, Float> codeToWidthMap;
    protected final COSDictionary dict;
    private PDFontDescriptor fontDescriptor;
    private float fontWidthOfSpace;
    private final CMap toUnicodeCMap;
    private List<Float> widths;

    public PDFont() {
        this.fontWidthOfSpace = -1.0f;
        COSDictionary cOSDictionary = new COSDictionary();
        this.dict = cOSDictionary;
        cOSDictionary.setItem(COSName.TYPE, (COSBase) COSName.FONT);
        this.toUnicodeCMap = null;
        this.fontDescriptor = null;
        this.afmStandard14 = null;
        this.codeToWidthMap = new HashMap();
    }

    private PDFontDescriptor loadFontDescriptor() {
        COSDictionary cOSDictionary = this.dict.getCOSDictionary(COSName.FONT_DESC);
        if (cOSDictionary != null) {
            return new PDFontDescriptor(cOSDictionary);
        }
        FontMetrics fontMetrics = this.afmStandard14;
        if (fontMetrics != null) {
            return PDType1FontEmbedder.buildFontDescriptor(fontMetrics);
        }
        return null;
    }

    private CMap loadUnicodeCmap() {
        String str;
        COSBase dictionaryObject = this.dict.getDictionaryObject(COSName.TO_UNICODE);
        if (dictionaryObject == null) {
            return null;
        }
        try {
            CMap readCMap = readCMap(dictionaryObject);
            if (readCMap != null && !readCMap.hasUnicodeMappings()) {
                getName();
                String str2 = "";
                if (readCMap.getName() == null) {
                    str = "";
                } else {
                    str = readCMap.getName();
                }
                if (readCMap.getOrdering() != null) {
                    str2 = readCMap.getOrdering();
                }
                COSBase dictionaryObject2 = this.dict.getDictionaryObject(COSName.ENCODING);
                if (str.contains("Identity") || str2.contains("Identity") || COSName.IDENTITY_H.equals(dictionaryObject2) || COSName.IDENTITY_V.equals(dictionaryObject2)) {
                    return CMapManager.getPredefinedCMap(COSName.IDENTITY_H.getName());
                }
                return readCMap;
            }
            return readCMap;
        } catch (IOException unused) {
            getName();
            return null;
        }
    }

    public abstract void addToSubset(int i10);

    public abstract byte[] encode(int i10);

    public final byte[] encode(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i10 = 0;
        while (i10 < str.length()) {
            int codePointAt = str.codePointAt(i10);
            byteArrayOutputStream.write(encode(codePointAt));
            i10 += Character.charCount(codePointAt);
        }
        return byteArrayOutputStream.toByteArray();
    }

    public boolean equals(Object obj) {
        if ((obj instanceof PDFont) && ((PDFont) obj).getCOSObject() == getCOSObject()) {
            return true;
        }
        return false;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public float getAverageFontWidth() {
        float f10;
        float f11;
        float f12 = this.avgFontWidth;
        if (f12 == 0.0f) {
            COSArray cOSArray = this.dict.getCOSArray(COSName.WIDTHS);
            if (cOSArray != null) {
                f10 = 0.0f;
                f11 = 0.0f;
                for (int i10 = 0; i10 < cOSArray.size(); i10++) {
                    COSNumber cOSNumber = (COSNumber) cOSArray.getObject(i10);
                    if (cOSNumber.floatValue() > 0.0f) {
                        f10 += cOSNumber.floatValue();
                        f11 += 1.0f;
                    }
                }
            } else {
                f10 = 0.0f;
                f11 = 0.0f;
            }
            if (f10 > 0.0f) {
                f12 = f10 / f11;
            } else {
                f12 = 0.0f;
            }
            this.avgFontWidth = f12;
        }
        return f12;
    }

    public Vector getDisplacement(int i10) {
        return new Vector(getWidth(i10) / 1000.0f, 0.0f);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public PDFontDescriptor getFontDescriptor() {
        return this.fontDescriptor;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public Matrix getFontMatrix() {
        return DEFAULT_FONT_MATRIX;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public Vector getPositionVector(int i10) {
        throw new UnsupportedOperationException("Horizontal fonts have no position vector");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033 A[Catch: Exception -> 0x0046, TryCatch #0 {Exception -> 0x0046, blocks: (B:6:0x0014, B:8:0x0018, B:10:0x001f, B:12:0x002c, B:14:0x0033, B:15:0x0039, B:17:0x003f, B:11:0x0026), top: B:22:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003f A[Catch: Exception -> 0x0046, TRY_LEAVE, TryCatch #0 {Exception -> 0x0046, blocks: (B:6:0x0014, B:8:0x0018, B:10:0x001f, B:12:0x002c, B:14:0x0033, B:15:0x0039, B:17:0x003f, B:11:0x0026), top: B:22:0x0014 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public float getSpaceWidth() {
        /*
            r3 = this;
            float r0 = r3.fontWidthOfSpace
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L4a
            com.tom_roush.pdfbox.cos.COSDictionary r0 = r3.dict
            com.tom_roush.pdfbox.cos.COSName r1 = com.tom_roush.pdfbox.cos.COSName.TO_UNICODE
            com.tom_roush.pdfbox.cos.COSBase r0 = r0.getDictionaryObject(r1)
            r1 = 32
            if (r0 == 0) goto L26
            com.tom_roush.fontbox.cmap.CMap r0 = r3.toUnicodeCMap     // Catch: java.lang.Exception -> L46
            if (r0 == 0) goto L26
            int r0 = r0.getSpaceMapping()     // Catch: java.lang.Exception -> L46
            r2 = -1
            if (r0 <= r2) goto L2c
            float r0 = r3.getWidth(r0)     // Catch: java.lang.Exception -> L46
            r3.fontWidthOfSpace = r0     // Catch: java.lang.Exception -> L46
            goto L2c
        L26:
            float r0 = r3.getWidth(r1)     // Catch: java.lang.Exception -> L46
            r3.fontWidthOfSpace = r0     // Catch: java.lang.Exception -> L46
        L2c:
            float r0 = r3.fontWidthOfSpace     // Catch: java.lang.Exception -> L46
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L39
            float r0 = r3.getWidthFromFont(r1)     // Catch: java.lang.Exception -> L46
            r3.fontWidthOfSpace = r0     // Catch: java.lang.Exception -> L46
        L39:
            float r0 = r3.fontWidthOfSpace     // Catch: java.lang.Exception -> L46
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L4a
            float r0 = r3.getAverageFontWidth()     // Catch: java.lang.Exception -> L46
            r3.fontWidthOfSpace = r0     // Catch: java.lang.Exception -> L46
            goto L4a
        L46:
            r0 = 1132068864(0x437a0000, float:250.0)
            r3.fontWidthOfSpace = r0
        L4a:
            float r0 = r3.fontWidthOfSpace
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tom_roush.pdfbox.pdmodel.font.PDFont.getSpaceWidth():float");
    }

    public final FontMetrics getStandard14AFM() {
        return this.afmStandard14;
    }

    public abstract float getStandard14Width(int i10);

    public float getStringWidth(String str) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(encode(str));
        float f10 = 0.0f;
        while (byteArrayInputStream.available() > 0) {
            f10 += getWidth(readCode(byteArrayInputStream));
        }
        return f10;
    }

    public String getSubType() {
        return this.dict.getNameAsString(COSName.SUBTYPE);
    }

    public CMap getToUnicodeCMap() {
        return this.toUnicodeCMap;
    }

    public String getType() {
        return this.dict.getNameAsString(COSName.TYPE);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public float getWidth(int i10) {
        Float f10 = this.codeToWidthMap.get(Integer.valueOf(i10));
        if (f10 != null) {
            return f10.floatValue();
        }
        if (this.dict.getDictionaryObject(COSName.WIDTHS) != null || this.dict.containsKey(COSName.MISSING_WIDTH)) {
            int i11 = this.dict.getInt(COSName.FIRST_CHAR, -1);
            int i12 = this.dict.getInt(COSName.LAST_CHAR, -1);
            int size = getWidths().size();
            int i13 = i10 - i11;
            if (size > 0 && i10 >= i11 && i10 <= i12 && i13 < size) {
                Float f11 = getWidths().get(i13);
                if (f11 == null) {
                    f11 = Float.valueOf(0.0f);
                }
                this.codeToWidthMap.put(Integer.valueOf(i10), f11);
                return f11.floatValue();
            }
            PDFontDescriptor fontDescriptor = getFontDescriptor();
            if (fontDescriptor != null) {
                Float valueOf = Float.valueOf(fontDescriptor.getMissingWidth());
                this.codeToWidthMap.put(Integer.valueOf(i10), valueOf);
                return valueOf.floatValue();
            }
        }
        if (isStandard14()) {
            Float valueOf2 = Float.valueOf(getStandard14Width(i10));
            this.codeToWidthMap.put(Integer.valueOf(i10), valueOf2);
            return valueOf2.floatValue();
        }
        Float valueOf3 = Float.valueOf(getWidthFromFont(i10));
        this.codeToWidthMap.put(Integer.valueOf(i10), valueOf3);
        return valueOf3.floatValue();
    }

    public final List<Float> getWidths() {
        if (this.widths == null) {
            COSArray cOSArray = this.dict.getCOSArray(COSName.WIDTHS);
            if (cOSArray != null) {
                this.widths = COSArrayList.convertFloatCOSArrayToList(cOSArray);
            } else {
                this.widths = Collections.emptyList();
            }
        }
        return this.widths;
    }

    public int hashCode() {
        return getCOSObject().hashCode();
    }

    public boolean isStandard14() {
        if (isEmbedded()) {
            return false;
        }
        return Standard14Fonts.containsName(getName());
    }

    public abstract boolean isVertical();

    public final CMap readCMap(COSBase cOSBase) {
        if (cOSBase instanceof COSName) {
            return CMapManager.getPredefinedCMap(((COSName) cOSBase).getName());
        }
        if (cOSBase instanceof COSStream) {
            COSInputStream cOSInputStream = null;
            try {
                cOSInputStream = ((COSStream) cOSBase).createInputStream();
                return CMapManager.parseCMap(cOSInputStream);
            } finally {
                IOUtils.closeQuietly(cOSInputStream);
            }
        }
        throw new IOException("Expected Name or Stream");
    }

    public abstract int readCode(InputStream inputStream);

    public final void setFontDescriptor(PDFontDescriptor pDFontDescriptor) {
        this.fontDescriptor = pDFontDescriptor;
    }

    public abstract void subset();

    public String toString() {
        return getClass().getSimpleName() + " " + getName();
    }

    public String toUnicode(int i10, GlyphList glyphList) {
        return toUnicode(i10);
    }

    public abstract boolean willBeSubset();

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSDictionary getCOSObject() {
        return this.dict;
    }

    public String toUnicode(int i10) {
        CMap cMap = this.toUnicodeCMap;
        if (cMap != null) {
            if (cMap.getName() != null && this.toUnicodeCMap.getName().startsWith("Identity-") && ((this.dict.getDictionaryObject(COSName.TO_UNICODE) instanceof COSName) || !this.toUnicodeCMap.hasUnicodeMappings())) {
                return new String(new char[]{(char) i10});
            }
            return this.toUnicodeCMap.toUnicode(i10);
        }
        return null;
    }

    public PDFont(String str) {
        this.fontWidthOfSpace = -1.0f;
        COSDictionary cOSDictionary = new COSDictionary();
        this.dict = cOSDictionary;
        cOSDictionary.setItem(COSName.TYPE, (COSBase) COSName.FONT);
        this.toUnicodeCMap = null;
        FontMetrics afm = Standard14Fonts.getAFM(str);
        this.afmStandard14 = afm;
        if (afm != null) {
            this.fontDescriptor = PDType1FontEmbedder.buildFontDescriptor(afm);
            this.codeToWidthMap = new ConcurrentHashMap();
            return;
        }
        throw new IllegalArgumentException(a.h("No AFM for font ", str));
    }

    public PDFont(COSDictionary cOSDictionary) {
        this.fontWidthOfSpace = -1.0f;
        this.dict = cOSDictionary;
        this.codeToWidthMap = new HashMap();
        this.afmStandard14 = Standard14Fonts.getAFM(getName());
        this.fontDescriptor = loadFontDescriptor();
        this.toUnicodeCMap = loadUnicodeCmap();
    }
}

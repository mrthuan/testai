package com.tom_roush.pdfbox.pdmodel.font;

import android.graphics.Path;
import com.tom_roush.fontbox.FontBoxFont;
import com.tom_roush.fontbox.util.BoundingBox;
import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSStream;
import com.tom_roush.pdfbox.pdmodel.PDResources;
import com.tom_roush.pdfbox.pdmodel.ResourceCache;
import com.tom_roush.pdfbox.pdmodel.common.PDRectangle;
import com.tom_roush.pdfbox.pdmodel.font.encoding.DictionaryEncoding;
import com.tom_roush.pdfbox.pdmodel.font.encoding.Encoding;
import com.tom_roush.pdfbox.pdmodel.font.encoding.GlyphList;
import com.tom_roush.pdfbox.util.Matrix;
import com.tom_roush.pdfbox.util.Vector;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* loaded from: classes2.dex */
public class PDType3Font extends PDSimpleFont {
    private COSDictionary charProcs;
    private BoundingBox fontBBox;
    private Matrix fontMatrix;
    private final ResourceCache resourceCache;
    private PDResources resources;

    public PDType3Font(COSDictionary cOSDictionary) {
        this(cOSDictionary, null);
    }

    private BoundingBox generateBoundingBox() {
        PDRectangle fontBBox = getFontBBox();
        if (fontBBox.getLowerLeftX() == 0.0f && fontBBox.getLowerLeftY() == 0.0f && fontBBox.getUpperRightX() == 0.0f && fontBBox.getUpperRightY() == 0.0f) {
            COSDictionary charProcs = getCharProcs();
            for (COSName cOSName : charProcs.keySet()) {
                COSBase dictionaryObject = charProcs.getDictionaryObject(cOSName);
                if (dictionaryObject instanceof COSStream) {
                    try {
                        PDRectangle glyphBBox = new PDType3CharProc(this, (COSStream) dictionaryObject).getGlyphBBox();
                        if (glyphBBox != null) {
                            fontBBox.setLowerLeftX(Math.min(fontBBox.getLowerLeftX(), glyphBBox.getLowerLeftX()));
                            fontBBox.setLowerLeftY(Math.min(fontBBox.getLowerLeftY(), glyphBBox.getLowerLeftY()));
                            fontBBox.setUpperRightX(Math.max(fontBBox.getUpperRightX(), glyphBBox.getUpperRightX()));
                            fontBBox.setUpperRightY(Math.max(fontBBox.getUpperRightY(), glyphBBox.getUpperRightY()));
                        }
                    } catch (IOException unused) {
                    }
                }
            }
        }
        return new BoundingBox(fontBBox.getLowerLeftX(), fontBBox.getLowerLeftY(), fontBBox.getUpperRightX(), fontBBox.getUpperRightY());
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFont
    public byte[] encode(int i10) {
        throw new UnsupportedOperationException("Not implemented: Type3");
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public BoundingBox getBoundingBox() {
        if (this.fontBBox == null) {
            this.fontBBox = generateBoundingBox();
        }
        return this.fontBBox;
    }

    public PDType3CharProc getCharProc(int i10) {
        COSStream cOSStream;
        String name = getEncoding().getName(i10);
        if (getCharProcs() == null || (cOSStream = getCharProcs().getCOSStream(COSName.getPDFName(name))) == null) {
            return null;
        }
        return new PDType3CharProc(this, cOSStream);
    }

    public COSDictionary getCharProcs() {
        if (this.charProcs == null) {
            this.charProcs = this.dict.getCOSDictionary(COSName.CHAR_PROCS);
        }
        return this.charProcs;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFont
    public Vector getDisplacement(int i10) {
        return getFontMatrix().transform(new Vector(getWidth(i10), 0.0f));
    }

    public PDRectangle getFontBBox() {
        COSBase dictionaryObject = this.dict.getDictionaryObject(COSName.FONT_BBOX);
        if (dictionaryObject instanceof COSArray) {
            return new PDRectangle((COSArray) dictionaryObject);
        }
        return null;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDSimpleFont
    public FontBoxFont getFontBoxFont() {
        throw new UnsupportedOperationException("not supported for Type 3 fonts");
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFont, com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public Matrix getFontMatrix() {
        if (this.fontMatrix == null) {
            COSBase dictionaryObject = this.dict.getDictionaryObject(COSName.FONT_MATRIX);
            if (dictionaryObject instanceof COSArray) {
                this.fontMatrix = new Matrix((COSArray) dictionaryObject);
            } else {
                return super.getFontMatrix();
            }
        }
        return this.fontMatrix;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public float getHeight(int i10) {
        float f10;
        PDFontDescriptor fontDescriptor = getFontDescriptor();
        if (fontDescriptor == null) {
            return 0.0f;
        }
        PDRectangle fontBoundingBox = fontDescriptor.getFontBoundingBox();
        if (fontBoundingBox != null) {
            f10 = fontBoundingBox.getHeight() / 2.0f;
        } else {
            f10 = 0.0f;
        }
        if (f10 == 0.0f) {
            f10 = fontDescriptor.getCapHeight();
        }
        if (f10 == 0.0f) {
            f10 = fontDescriptor.getAscent();
        }
        if (f10 == 0.0f) {
            float xHeight = fontDescriptor.getXHeight();
            if (xHeight > 0.0f) {
                return xHeight - fontDescriptor.getDescent();
            }
            return xHeight;
        }
        return f10;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public String getName() {
        return this.dict.getNameAsString(COSName.NAME);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDSimpleFont
    public Path getPath(String str) {
        throw new UnsupportedOperationException("not supported for Type 3 fonts");
    }

    public PDResources getResources() {
        if (this.resources == null) {
            COSBase dictionaryObject = this.dict.getDictionaryObject(COSName.RESOURCES);
            if (dictionaryObject instanceof COSDictionary) {
                this.resources = new PDResources((COSDictionary) dictionaryObject, this.resourceCache);
            }
        }
        return this.resources;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFont, com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public float getWidth(int i10) {
        Float f10;
        int i11 = this.dict.getInt(COSName.FIRST_CHAR, -1);
        int i12 = this.dict.getInt(COSName.LAST_CHAR, -1);
        List<Float> widths = getWidths();
        if (!widths.isEmpty() && i10 >= i11 && i10 <= i12) {
            int i13 = i10 - i11;
            if (i13 >= widths.size() || (f10 = widths.get(i13)) == null) {
                return 0.0f;
            }
            return f10.floatValue();
        }
        PDFontDescriptor fontDescriptor = getFontDescriptor();
        if (fontDescriptor != null) {
            return fontDescriptor.getMissingWidth();
        }
        return getWidthFromFont(i10);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public float getWidthFromFont(int i10) {
        PDType3CharProc charProc = getCharProc(i10);
        if (charProc != null && charProc.getContentStream() != null && charProc.getContentStream().getLength() != 0) {
            return charProc.getWidth();
        }
        return 0.0f;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDSimpleFont
    public boolean hasGlyph(String str) {
        return getCharProcs().getDictionaryObject(COSName.getPDFName(str)) instanceof COSStream;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public boolean isDamaged() {
        return false;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public boolean isEmbedded() {
        return true;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDSimpleFont
    public Boolean isFontSymbolic() {
        return Boolean.FALSE;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDSimpleFont, com.tom_roush.pdfbox.pdmodel.font.PDFont
    public boolean isStandard14() {
        return false;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFont
    public int readCode(InputStream inputStream) {
        return inputStream.read();
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDSimpleFont
    public final void readEncoding() {
        COSBase dictionaryObject = this.dict.getDictionaryObject(COSName.ENCODING);
        if (dictionaryObject instanceof COSName) {
            COSName cOSName = (COSName) dictionaryObject;
            Encoding encoding = Encoding.getInstance(cOSName);
            this.encoding = encoding;
            if (encoding == null) {
                cOSName.getName();
            }
        } else if (dictionaryObject instanceof COSDictionary) {
            this.encoding = new DictionaryEncoding((COSDictionary) dictionaryObject);
        }
        this.glyphList = GlyphList.getAdobeGlyphList();
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDSimpleFont
    public Encoding readEncodingFromFont() {
        throw new UnsupportedOperationException("not supported for Type 3 fonts");
    }

    public PDType3Font(COSDictionary cOSDictionary, ResourceCache resourceCache) {
        super(cOSDictionary);
        this.resourceCache = resourceCache;
        readEncoding();
    }
}

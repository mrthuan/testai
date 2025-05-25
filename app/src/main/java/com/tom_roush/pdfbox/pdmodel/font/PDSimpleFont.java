package com.tom_roush.pdfbox.pdmodel.font;

import android.graphics.Path;
import com.tom_roush.fontbox.FontBoxFont;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.font.encoding.DictionaryEncoding;
import com.tom_roush.pdfbox.pdmodel.font.encoding.Encoding;
import com.tom_roush.pdfbox.pdmodel.font.encoding.GlyphList;
import com.tom_roush.pdfbox.pdmodel.font.encoding.MacRomanEncoding;
import com.tom_roush.pdfbox.pdmodel.font.encoding.StandardEncoding;
import com.tom_roush.pdfbox.pdmodel.font.encoding.WinAnsiEncoding;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class PDSimpleFont extends PDFont {
    protected Encoding encoding;
    protected GlyphList glyphList;
    private Boolean isSymbolic;
    private final Set<Integer> noUnicode;

    public PDSimpleFont() {
        this.noUnicode = new HashSet();
    }

    private void assignGlyphList(String str) {
        if ("ZapfDingbats".equals(str)) {
            this.glyphList = GlyphList.getZapfDingbats();
        } else {
            this.glyphList = GlyphList.getAdobeGlyphList();
        }
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFont
    public void addToSubset(int i10) {
        throw new UnsupportedOperationException();
    }

    public Encoding getEncoding() {
        return this.encoding;
    }

    public abstract FontBoxFont getFontBoxFont();

    public GlyphList getGlyphList() {
        return this.glyphList;
    }

    public abstract Path getPath(String str);

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFont
    public final float getStandard14Width(int i10) {
        if (getStandard14AFM() != null) {
            String name = getEncoding().getName(i10);
            if (".notdef".equals(name)) {
                return 250.0f;
            }
            if ("nbspace".equals(name)) {
                name = "space";
            } else if ("sfthyphen".equals(name)) {
                name = "hyphen";
            }
            return getStandard14AFM().getCharacterWidth(name);
        }
        throw new IllegalStateException("No AFM");
    }

    public final Boolean getSymbolicFlag() {
        if (getFontDescriptor() != null) {
            return Boolean.valueOf(getFontDescriptor().isSymbolic());
        }
        return null;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public boolean hasExplicitWidth(int i10) {
        int i11;
        if (this.dict.containsKey(COSName.WIDTHS) && i10 >= (i11 = this.dict.getInt(COSName.FIRST_CHAR, -1)) && i10 - i11 < getWidths().size()) {
            return true;
        }
        return false;
    }

    public abstract boolean hasGlyph(String str);

    public Boolean isFontSymbolic() {
        boolean z10;
        Boolean symbolicFlag = getSymbolicFlag();
        if (symbolicFlag != null) {
            return symbolicFlag;
        }
        if (isStandard14()) {
            String mappedFontName = Standard14Fonts.getMappedFontName(getName());
            if (!mappedFontName.equals("Symbol") && !mappedFontName.equals("ZapfDingbats")) {
                z10 = false;
            } else {
                z10 = true;
            }
            return Boolean.valueOf(z10);
        }
        Encoding encoding = this.encoding;
        if (encoding == null) {
            if (this instanceof PDTrueTypeFont) {
                return Boolean.TRUE;
            }
            throw new IllegalStateException("PDFBox bug: encoding should not be null!");
        } else if (!(encoding instanceof WinAnsiEncoding) && !(encoding instanceof MacRomanEncoding) && !(encoding instanceof StandardEncoding)) {
            if (encoding instanceof DictionaryEncoding) {
                for (String str : ((DictionaryEncoding) encoding).getDifferences().values()) {
                    if (!".notdef".equals(str) && (!WinAnsiEncoding.INSTANCE.contains(str) || !MacRomanEncoding.INSTANCE.contains(str) || !StandardEncoding.INSTANCE.contains(str))) {
                        return Boolean.TRUE;
                    }
                }
                return Boolean.FALSE;
            }
            return null;
        } else {
            return Boolean.FALSE;
        }
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFont
    public boolean isStandard14() {
        if (getEncoding() instanceof DictionaryEncoding) {
            DictionaryEncoding dictionaryEncoding = (DictionaryEncoding) getEncoding();
            if (dictionaryEncoding.getDifferences().size() > 0) {
                Encoding baseEncoding = dictionaryEncoding.getBaseEncoding();
                for (Map.Entry<Integer, String> entry : dictionaryEncoding.getDifferences().entrySet()) {
                    if (!entry.getValue().equals(baseEncoding.getName(entry.getKey().intValue()))) {
                        return false;
                    }
                }
            }
        }
        return super.isStandard14();
    }

    public final boolean isSymbolic() {
        if (this.isSymbolic == null) {
            Boolean isFontSymbolic = isFontSymbolic();
            if (isFontSymbolic != null) {
                this.isSymbolic = isFontSymbolic;
            } else {
                this.isSymbolic = Boolean.TRUE;
            }
        }
        return this.isSymbolic.booleanValue();
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFont
    public boolean isVertical() {
        return false;
    }

    public void readEncoding() {
        boolean z10;
        Encoding encoding;
        COSBase dictionaryObject = this.dict.getDictionaryObject(COSName.ENCODING);
        if (dictionaryObject instanceof COSName) {
            COSName cOSName = (COSName) dictionaryObject;
            Encoding encoding2 = Encoding.getInstance(cOSName);
            this.encoding = encoding2;
            if (encoding2 == null) {
                cOSName.getName();
                this.encoding = readEncodingFromFont();
            }
        } else if (dictionaryObject instanceof COSDictionary) {
            COSDictionary cOSDictionary = (COSDictionary) dictionaryObject;
            Boolean symbolicFlag = getSymbolicFlag();
            COSName cOSName2 = cOSDictionary.getCOSName(COSName.BASE_ENCODING);
            if (cOSName2 != null && Encoding.getInstance(cOSName2) != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10 && Boolean.TRUE.equals(symbolicFlag)) {
                encoding = readEncodingFromFont();
            } else {
                encoding = null;
            }
            if (symbolicFlag == null) {
                symbolicFlag = Boolean.FALSE;
            }
            this.encoding = new DictionaryEncoding(cOSDictionary, !symbolicFlag.booleanValue(), encoding);
        } else if (dictionaryObject == null) {
            this.encoding = readEncodingFromFont();
        }
        assignGlyphList(Standard14Fonts.getMappedFontName(getName()));
    }

    public abstract Encoding readEncodingFromFont();

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFont
    public void subset() {
        throw new UnsupportedOperationException();
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFont
    public String toUnicode(int i10) {
        return toUnicode(i10, GlyphList.getAdobeGlyphList());
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFont
    public boolean willBeSubset() {
        return false;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFont
    public String toUnicode(int i10, GlyphList glyphList) {
        String str;
        if (this.glyphList != GlyphList.getAdobeGlyphList()) {
            glyphList = this.glyphList;
        }
        String unicode = super.toUnicode(i10);
        if (unicode != null) {
            return unicode;
        }
        Encoding encoding = this.encoding;
        if (encoding != null) {
            str = encoding.getName(i10);
            String unicode2 = glyphList.toUnicode(str);
            if (unicode2 != null) {
                return unicode2;
            }
        } else {
            str = null;
        }
        if (!this.noUnicode.contains(Integer.valueOf(i10))) {
            this.noUnicode.add(Integer.valueOf(i10));
            if (str != null) {
                getName();
            } else {
                getName();
            }
        }
        return null;
    }

    public PDSimpleFont(String str) {
        super(str);
        this.noUnicode = new HashSet();
        assignGlyphList(str);
    }

    public PDSimpleFont(COSDictionary cOSDictionary) {
        super(cOSDictionary);
        this.noUnicode = new HashSet();
    }
}

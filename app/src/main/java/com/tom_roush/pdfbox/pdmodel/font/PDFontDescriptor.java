package com.tom_roush.pdfbox.pdmodel.font;

import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSStream;
import com.tom_roush.pdfbox.cos.COSString;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;
import com.tom_roush.pdfbox.pdmodel.common.PDRectangle;
import com.tom_roush.pdfbox.pdmodel.common.PDStream;

/* loaded from: classes2.dex */
public final class PDFontDescriptor implements COSObjectable {
    private static final int FLAG_ALL_CAP = 65536;
    private static final int FLAG_FIXED_PITCH = 1;
    private static final int FLAG_FORCE_BOLD = 262144;
    private static final int FLAG_ITALIC = 64;
    private static final int FLAG_NON_SYMBOLIC = 32;
    private static final int FLAG_SCRIPT = 8;
    private static final int FLAG_SERIF = 2;
    private static final int FLAG_SMALL_CAP = 131072;
    private static final int FLAG_SYMBOLIC = 4;
    private final COSDictionary dic;
    private float xHeight = Float.NEGATIVE_INFINITY;
    private float capHeight = Float.NEGATIVE_INFINITY;
    private int flags = -1;

    public PDFontDescriptor() {
        COSDictionary cOSDictionary = new COSDictionary();
        this.dic = cOSDictionary;
        cOSDictionary.setItem(COSName.TYPE, (COSBase) COSName.FONT_DESC);
    }

    private boolean isFlagBitOn(int i10) {
        if ((i10 & getFlags()) != 0) {
            return true;
        }
        return false;
    }

    private void setFlagBit(int i10, boolean z10) {
        int i11;
        int flags = getFlags();
        if (z10) {
            i11 = i10 | flags;
        } else {
            i11 = (~i10) & flags;
        }
        setFlags(i11);
    }

    public float getAscent() {
        return this.dic.getFloat(COSName.ASCENT, 0.0f);
    }

    public float getAverageWidth() {
        return this.dic.getFloat(COSName.AVG_WIDTH, 0.0f);
    }

    public PDStream getCIDSet() {
        COSBase dictionaryObject = this.dic.getDictionaryObject(COSName.CID_SET);
        if (dictionaryObject instanceof COSStream) {
            return new PDStream((COSStream) dictionaryObject);
        }
        return null;
    }

    public float getCapHeight() {
        if (this.capHeight == Float.NEGATIVE_INFINITY) {
            this.capHeight = Math.abs(this.dic.getFloat(COSName.CAP_HEIGHT, 0.0f));
        }
        return this.capHeight;
    }

    public String getCharSet() {
        COSString cOSString = (COSString) this.dic.getDictionaryObject(COSName.CHAR_SET);
        if (cOSString != null) {
            return cOSString.getString();
        }
        return null;
    }

    public float getDescent() {
        return this.dic.getFloat(COSName.DESCENT, 0.0f);
    }

    public int getFlags() {
        if (this.flags == -1) {
            this.flags = this.dic.getInt(COSName.FLAGS, 0);
        }
        return this.flags;
    }

    public PDRectangle getFontBoundingBox() {
        COSArray cOSArray = this.dic.getCOSArray(COSName.FONT_BBOX);
        if (cOSArray != null) {
            return new PDRectangle(cOSArray);
        }
        return null;
    }

    public String getFontFamily() {
        COSString cOSString = (COSString) this.dic.getDictionaryObject(COSName.FONT_FAMILY);
        if (cOSString != null) {
            return cOSString.getString();
        }
        return null;
    }

    public PDStream getFontFile() {
        COSBase dictionaryObject = this.dic.getDictionaryObject(COSName.FONT_FILE);
        if (dictionaryObject instanceof COSStream) {
            return new PDStream((COSStream) dictionaryObject);
        }
        return null;
    }

    public PDStream getFontFile2() {
        COSBase dictionaryObject = this.dic.getDictionaryObject(COSName.FONT_FILE2);
        if (dictionaryObject instanceof COSStream) {
            return new PDStream((COSStream) dictionaryObject);
        }
        return null;
    }

    public PDStream getFontFile3() {
        COSBase dictionaryObject = this.dic.getDictionaryObject(COSName.FONT_FILE3);
        if (dictionaryObject instanceof COSStream) {
            return new PDStream((COSStream) dictionaryObject);
        }
        return null;
    }

    public String getFontName() {
        COSBase dictionaryObject = this.dic.getDictionaryObject(COSName.FONT_NAME);
        if (dictionaryObject instanceof COSName) {
            return ((COSName) dictionaryObject).getName();
        }
        return null;
    }

    public String getFontStretch() {
        COSName cOSName = (COSName) this.dic.getDictionaryObject(COSName.FONT_STRETCH);
        if (cOSName != null) {
            return cOSName.getName();
        }
        return null;
    }

    public float getFontWeight() {
        return this.dic.getFloat(COSName.FONT_WEIGHT, 0.0f);
    }

    public float getItalicAngle() {
        return this.dic.getFloat(COSName.ITALIC_ANGLE, 0.0f);
    }

    public float getLeading() {
        return this.dic.getFloat(COSName.LEADING, 0.0f);
    }

    public float getMaxWidth() {
        return this.dic.getFloat(COSName.MAX_WIDTH, 0.0f);
    }

    public float getMissingWidth() {
        return this.dic.getFloat(COSName.MISSING_WIDTH, 0.0f);
    }

    public PDPanose getPanose() {
        COSDictionary cOSDictionary = (COSDictionary) this.dic.getDictionaryObject(COSName.STYLE);
        if (cOSDictionary != null) {
            return new PDPanose(((COSString) cOSDictionary.getDictionaryObject(COSName.PANOSE)).getBytes());
        }
        return null;
    }

    public float getStemH() {
        return this.dic.getFloat(COSName.STEM_H, 0.0f);
    }

    public float getStemV() {
        return this.dic.getFloat(COSName.STEM_V, 0.0f);
    }

    public float getXHeight() {
        if (this.xHeight == Float.NEGATIVE_INFINITY) {
            this.xHeight = Math.abs(this.dic.getFloat(COSName.XHEIGHT, 0.0f));
        }
        return this.xHeight;
    }

    public boolean hasMissingWidth() {
        return this.dic.containsKey(COSName.MISSING_WIDTH);
    }

    public boolean hasWidths() {
        if (!this.dic.containsKey(COSName.WIDTHS) && !this.dic.containsKey(COSName.MISSING_WIDTH)) {
            return false;
        }
        return true;
    }

    public boolean isAllCap() {
        return isFlagBitOn(FLAG_ALL_CAP);
    }

    public boolean isFixedPitch() {
        return isFlagBitOn(1);
    }

    public boolean isForceBold() {
        return isFlagBitOn(FLAG_FORCE_BOLD);
    }

    public boolean isItalic() {
        return isFlagBitOn(64);
    }

    public boolean isNonSymbolic() {
        return isFlagBitOn(32);
    }

    public boolean isScript() {
        return isFlagBitOn(8);
    }

    public boolean isSerif() {
        return isFlagBitOn(2);
    }

    public boolean isSmallCap() {
        return isFlagBitOn(FLAG_SMALL_CAP);
    }

    public boolean isSymbolic() {
        return isFlagBitOn(4);
    }

    public void setAllCap(boolean z10) {
        setFlagBit(FLAG_ALL_CAP, z10);
    }

    public void setAscent(float f10) {
        this.dic.setFloat(COSName.ASCENT, f10);
    }

    public void setAverageWidth(float f10) {
        this.dic.setFloat(COSName.AVG_WIDTH, f10);
    }

    public void setCIDSet(PDStream pDStream) {
        this.dic.setItem(COSName.CID_SET, pDStream);
    }

    public void setCapHeight(float f10) {
        this.dic.setFloat(COSName.CAP_HEIGHT, f10);
        this.capHeight = f10;
    }

    public void setCharacterSet(String str) {
        COSString cOSString;
        if (str != null) {
            cOSString = new COSString(str);
        } else {
            cOSString = null;
        }
        this.dic.setItem(COSName.CHAR_SET, (COSBase) cOSString);
    }

    public void setDescent(float f10) {
        this.dic.setFloat(COSName.DESCENT, f10);
    }

    public void setFixedPitch(boolean z10) {
        setFlagBit(1, z10);
    }

    public void setFlags(int i10) {
        this.dic.setInt(COSName.FLAGS, i10);
        this.flags = i10;
    }

    public void setFontBoundingBox(PDRectangle pDRectangle) {
        COSArray cOSArray;
        if (pDRectangle != null) {
            cOSArray = pDRectangle.getCOSArray();
        } else {
            cOSArray = null;
        }
        this.dic.setItem(COSName.FONT_BBOX, (COSBase) cOSArray);
    }

    public void setFontFamily(String str) {
        COSString cOSString;
        if (str != null) {
            cOSString = new COSString(str);
        } else {
            cOSString = null;
        }
        this.dic.setItem(COSName.FONT_FAMILY, (COSBase) cOSString);
    }

    public void setFontFile(PDStream pDStream) {
        this.dic.setItem(COSName.FONT_FILE, pDStream);
    }

    public void setFontFile2(PDStream pDStream) {
        this.dic.setItem(COSName.FONT_FILE2, pDStream);
    }

    public void setFontFile3(PDStream pDStream) {
        this.dic.setItem(COSName.FONT_FILE3, pDStream);
    }

    public void setFontName(String str) {
        COSName cOSName;
        if (str != null) {
            cOSName = COSName.getPDFName(str);
        } else {
            cOSName = null;
        }
        this.dic.setItem(COSName.FONT_NAME, (COSBase) cOSName);
    }

    public void setFontStretch(String str) {
        COSName cOSName;
        if (str != null) {
            cOSName = COSName.getPDFName(str);
        } else {
            cOSName = null;
        }
        this.dic.setItem(COSName.FONT_STRETCH, (COSBase) cOSName);
    }

    public void setFontWeight(float f10) {
        this.dic.setFloat(COSName.FONT_WEIGHT, f10);
    }

    public void setForceBold(boolean z10) {
        setFlagBit(FLAG_FORCE_BOLD, z10);
    }

    public void setItalic(boolean z10) {
        setFlagBit(64, z10);
    }

    public void setItalicAngle(float f10) {
        this.dic.setFloat(COSName.ITALIC_ANGLE, f10);
    }

    public void setLeading(float f10) {
        this.dic.setFloat(COSName.LEADING, f10);
    }

    public void setMaxWidth(float f10) {
        this.dic.setFloat(COSName.MAX_WIDTH, f10);
    }

    public void setMissingWidth(float f10) {
        this.dic.setFloat(COSName.MISSING_WIDTH, f10);
    }

    public void setNonSymbolic(boolean z10) {
        setFlagBit(32, z10);
    }

    public void setScript(boolean z10) {
        setFlagBit(8, z10);
    }

    public void setSerif(boolean z10) {
        setFlagBit(2, z10);
    }

    public void setSmallCap(boolean z10) {
        setFlagBit(FLAG_SMALL_CAP, z10);
    }

    public void setStemH(float f10) {
        this.dic.setFloat(COSName.STEM_H, f10);
    }

    public void setStemV(float f10) {
        this.dic.setFloat(COSName.STEM_V, f10);
    }

    public void setSymbolic(boolean z10) {
        setFlagBit(4, z10);
    }

    public void setXHeight(float f10) {
        this.dic.setFloat(COSName.XHEIGHT, f10);
        this.xHeight = f10;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSDictionary getCOSObject() {
        return this.dic;
    }

    public PDFontDescriptor(COSDictionary cOSDictionary) {
        this.dic = cOSDictionary;
    }
}

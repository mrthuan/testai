package lib.zj.office.fc.hssf.usermodel;

import lib.zj.office.fc.hssf.record.FontRecord;
import lib.zj.office.fc.ss.usermodel.IFont;

/* loaded from: classes3.dex */
public final class HSSFFont implements IFont {
    public static final String FONT_ARIAL = "Arial";
    private FontRecord font;
    private short index;

    public HSSFFont(short s4, FontRecord fontRecord) {
        this.font = fontRecord;
        this.index = s4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof HSSFFont)) {
            return false;
        }
        HSSFFont hSSFFont = (HSSFFont) obj;
        FontRecord fontRecord = this.font;
        if (fontRecord == null) {
            if (hSSFFont.font != null) {
                return false;
            }
        } else if (!fontRecord.equals(hSSFFont.font)) {
            return false;
        }
        if (this.index == hSSFFont.index) {
            return true;
        }
        return false;
    }

    @Override // lib.zj.office.fc.ss.usermodel.IFont
    public short getBoldweight() {
        return this.font.getBoldWeight();
    }

    @Override // lib.zj.office.fc.ss.usermodel.IFont
    public int getCharSet() {
        byte charset = this.font.getCharset();
        if (charset >= 0) {
            return charset;
        }
        return charset + 256;
    }

    @Override // lib.zj.office.fc.ss.usermodel.IFont
    public short getColor() {
        short colorPaletteIndex = this.font.getColorPaletteIndex();
        if (colorPaletteIndex == Short.MAX_VALUE) {
            return (short) 8;
        }
        return colorPaletteIndex;
    }

    @Override // lib.zj.office.fc.ss.usermodel.IFont
    public short getFontHeight() {
        return this.font.getFontHeight();
    }

    @Override // lib.zj.office.fc.ss.usermodel.IFont
    public short getFontHeightInPoints() {
        return (short) (this.font.getFontHeight() / 20);
    }

    @Override // lib.zj.office.fc.ss.usermodel.IFont
    public String getFontName() {
        return this.font.getFontName();
    }

    @Override // lib.zj.office.fc.ss.usermodel.IFont
    public short getIndex() {
        return this.index;
    }

    @Override // lib.zj.office.fc.ss.usermodel.IFont
    public boolean getItalic() {
        return this.font.isItalic();
    }

    @Override // lib.zj.office.fc.ss.usermodel.IFont
    public boolean getStrikeout() {
        return this.font.isStruckout();
    }

    @Override // lib.zj.office.fc.ss.usermodel.IFont
    public short getTypeOffset() {
        return this.font.getSuperSubScript();
    }

    @Override // lib.zj.office.fc.ss.usermodel.IFont
    public byte getUnderline() {
        return this.font.getUnderline();
    }

    public int hashCode() {
        int hashCode;
        FontRecord fontRecord = this.font;
        if (fontRecord == null) {
            hashCode = 0;
        } else {
            hashCode = fontRecord.hashCode();
        }
        return ((hashCode + 31) * 31) + this.index;
    }

    @Override // lib.zj.office.fc.ss.usermodel.IFont
    public void setBoldweight(short s4) {
        this.font.setBoldWeight(s4);
    }

    @Override // lib.zj.office.fc.ss.usermodel.IFont
    public void setCharSet(int i10) {
        byte b10 = (byte) i10;
        if (i10 > 127) {
            b10 = (byte) (i10 - 256);
        }
        setCharSet(b10);
    }

    @Override // lib.zj.office.fc.ss.usermodel.IFont
    public void setColor(short s4) {
        this.font.setColorPaletteIndex(s4);
    }

    @Override // lib.zj.office.fc.ss.usermodel.IFont
    public void setFontHeight(short s4) {
        this.font.setFontHeight(s4);
    }

    @Override // lib.zj.office.fc.ss.usermodel.IFont
    public void setFontHeightInPoints(short s4) {
        this.font.setFontHeight((short) (s4 * 20));
    }

    @Override // lib.zj.office.fc.ss.usermodel.IFont
    public void setFontName(String str) {
        this.font.setFontName(str);
    }

    @Override // lib.zj.office.fc.ss.usermodel.IFont
    public void setItalic(boolean z10) {
        this.font.setItalic(z10);
    }

    @Override // lib.zj.office.fc.ss.usermodel.IFont
    public void setStrikeout(boolean z10) {
        this.font.setStrikeout(z10);
    }

    @Override // lib.zj.office.fc.ss.usermodel.IFont
    public void setTypeOffset(short s4) {
        this.font.setSuperSubScript(s4);
    }

    @Override // lib.zj.office.fc.ss.usermodel.IFont
    public void setUnderline(byte b10) {
        this.font.setUnderline(b10);
    }

    public String toString() {
        return "org.apache.poi.hssf.usermodel.HSSFFont{" + this.font + "}";
    }

    @Override // lib.zj.office.fc.ss.usermodel.IFont
    public void setCharSet(byte b10) {
        this.font.setCharset(b10);
    }
}

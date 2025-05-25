package lib.zj.office.fc.hssf.record;

import lib.zj.office.fc.util.BitField;
import lib.zj.office.fc.util.BitFieldFactory;
import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndianOutput;
import lib.zj.office.fc.util.StringUtil;

/* loaded from: classes3.dex */
public final class FontRecord extends StandardRecord {
    public static final short SS_NONE = 0;
    public static final short SS_SUB = 2;
    public static final short SS_SUPER = 1;
    public static final byte U_DOUBLE = 2;
    public static final byte U_DOUBLE_ACCOUNTING = 34;
    public static final byte U_NONE = 0;
    public static final byte U_SINGLE = 1;
    public static final byte U_SINGLE_ACCOUNTING = 33;
    public static final short sid = 49;
    private String field_11_font_name;
    private short field_1_font_height;
    private short field_2_attributes;
    private short field_3_color_palette_index;
    private short field_4_bold_weight;
    private short field_5_super_sub_script;
    private byte field_6_underline;
    private byte field_7_family;
    private byte field_8_charset;
    private byte field_9_zero;
    private static final BitField italic = BitFieldFactory.getInstance(2);
    private static final BitField strikeout = BitFieldFactory.getInstance(8);
    private static final BitField macoutline = BitFieldFactory.getInstance(16);
    private static final BitField macshadow = BitFieldFactory.getInstance(32);

    public FontRecord() {
        this.field_9_zero = (byte) 0;
    }

    public void cloneStyleFrom(FontRecord fontRecord) {
        this.field_1_font_height = fontRecord.field_1_font_height;
        this.field_2_attributes = fontRecord.field_2_attributes;
        this.field_3_color_palette_index = fontRecord.field_3_color_palette_index;
        this.field_4_bold_weight = fontRecord.field_4_bold_weight;
        this.field_5_super_sub_script = fontRecord.field_5_super_sub_script;
        this.field_6_underline = fontRecord.field_6_underline;
        this.field_7_family = fontRecord.field_7_family;
        this.field_8_charset = fontRecord.field_8_charset;
        this.field_9_zero = fontRecord.field_9_zero;
        this.field_11_font_name = fontRecord.field_11_font_name;
    }

    public short getAttributes() {
        return this.field_2_attributes;
    }

    public short getBoldWeight() {
        return this.field_4_bold_weight;
    }

    public byte getCharset() {
        return this.field_8_charset;
    }

    public short getColorPaletteIndex() {
        return this.field_3_color_palette_index;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        int length = this.field_11_font_name.length();
        int i10 = 1;
        if (length < 1) {
            return 16;
        }
        if (StringUtil.hasMultibyte(this.field_11_font_name)) {
            i10 = 2;
        }
        return (length * i10) + 16;
    }

    public byte getFamily() {
        return this.field_7_family;
    }

    public short getFontHeight() {
        return this.field_1_font_height;
    }

    public String getFontName() {
        return this.field_11_font_name;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return (short) 49;
    }

    public short getSuperSubScript() {
        return this.field_5_super_sub_script;
    }

    public byte getUnderline() {
        return this.field_6_underline;
    }

    public int hashCode() {
        int hashCode;
        String str = this.field_11_font_name;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return ((((((((((((((((((hashCode + 31) * 31) + this.field_1_font_height) * 31) + this.field_2_attributes) * 31) + this.field_3_color_palette_index) * 31) + this.field_4_bold_weight) * 31) + this.field_5_super_sub_script) * 31) + this.field_6_underline) * 31) + this.field_7_family) * 31) + this.field_8_charset) * 31) + this.field_9_zero;
    }

    public boolean isItalic() {
        return italic.isSet(this.field_2_attributes);
    }

    public boolean isMacoutlined() {
        return macoutline.isSet(this.field_2_attributes);
    }

    public boolean isMacshadowed() {
        return macshadow.isSet(this.field_2_attributes);
    }

    public boolean isStruckout() {
        return strikeout.isSet(this.field_2_attributes);
    }

    public boolean sameProperties(FontRecord fontRecord) {
        if (this.field_1_font_height == fontRecord.field_1_font_height && this.field_2_attributes == fontRecord.field_2_attributes && this.field_3_color_palette_index == fontRecord.field_3_color_palette_index && this.field_4_bold_weight == fontRecord.field_4_bold_weight && this.field_5_super_sub_script == fontRecord.field_5_super_sub_script && this.field_6_underline == fontRecord.field_6_underline && this.field_7_family == fontRecord.field_7_family && this.field_8_charset == fontRecord.field_8_charset && this.field_9_zero == fontRecord.field_9_zero && this.field_11_font_name.equals(fontRecord.field_11_font_name)) {
            return true;
        }
        return false;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeShort(getFontHeight());
        littleEndianOutput.writeShort(getAttributes());
        littleEndianOutput.writeShort(getColorPaletteIndex());
        littleEndianOutput.writeShort(getBoldWeight());
        littleEndianOutput.writeShort(getSuperSubScript());
        littleEndianOutput.writeByte(getUnderline());
        littleEndianOutput.writeByte(getFamily());
        littleEndianOutput.writeByte(getCharset());
        littleEndianOutput.writeByte(this.field_9_zero);
        int length = this.field_11_font_name.length();
        littleEndianOutput.writeByte(length);
        boolean hasMultibyte = StringUtil.hasMultibyte(this.field_11_font_name);
        littleEndianOutput.writeByte(hasMultibyte ? 1 : 0);
        if (length > 0) {
            if (hasMultibyte) {
                StringUtil.putUnicodeLE(this.field_11_font_name, littleEndianOutput);
            } else {
                StringUtil.putCompressedUnicode(this.field_11_font_name, littleEndianOutput);
            }
        }
    }

    public void setAttributes(short s4) {
        this.field_2_attributes = s4;
    }

    public void setBoldWeight(short s4) {
        this.field_4_bold_weight = s4;
    }

    public void setCharset(byte b10) {
        this.field_8_charset = b10;
    }

    public void setColorPaletteIndex(short s4) {
        this.field_3_color_palette_index = s4;
    }

    public void setFamily(byte b10) {
        this.field_7_family = b10;
    }

    public void setFontHeight(short s4) {
        this.field_1_font_height = s4;
    }

    public void setFontName(String str) {
        this.field_11_font_name = str;
    }

    public void setItalic(boolean z10) {
        this.field_2_attributes = italic.setShortBoolean(this.field_2_attributes, z10);
    }

    public void setMacoutline(boolean z10) {
        this.field_2_attributes = macoutline.setShortBoolean(this.field_2_attributes, z10);
    }

    public void setMacshadow(boolean z10) {
        this.field_2_attributes = macshadow.setShortBoolean(this.field_2_attributes, z10);
    }

    public void setStrikeout(boolean z10) {
        this.field_2_attributes = strikeout.setShortBoolean(this.field_2_attributes, z10);
    }

    public void setSuperSubScript(short s4) {
        this.field_5_super_sub_script = s4;
    }

    public void setUnderline(byte b10) {
        this.field_6_underline = b10;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[FONT]\n    .fontheight    = ");
        stringBuffer.append(HexDump.shortToHex(getFontHeight()));
        stringBuffer.append("\n    .attributes    = ");
        stringBuffer.append(HexDump.shortToHex(getAttributes()));
        stringBuffer.append("\n       .italic     = ");
        stringBuffer.append(isItalic());
        stringBuffer.append("\n       .strikout   = ");
        stringBuffer.append(isStruckout());
        stringBuffer.append("\n       .macoutlined= ");
        stringBuffer.append(isMacoutlined());
        stringBuffer.append("\n       .macshadowed= ");
        stringBuffer.append(isMacshadowed());
        stringBuffer.append("\n    .colorpalette  = ");
        stringBuffer.append(HexDump.shortToHex(getColorPaletteIndex()));
        stringBuffer.append("\n    .boldweight    = ");
        stringBuffer.append(HexDump.shortToHex(getBoldWeight()));
        stringBuffer.append("\n    .supersubscript= ");
        stringBuffer.append(HexDump.shortToHex(getSuperSubScript()));
        stringBuffer.append("\n    .underline     = ");
        stringBuffer.append(HexDump.byteToHex(getUnderline()));
        stringBuffer.append("\n    .family        = ");
        stringBuffer.append(HexDump.byteToHex(getFamily()));
        stringBuffer.append("\n    .charset       = ");
        stringBuffer.append(HexDump.byteToHex(getCharset()));
        stringBuffer.append("\n    .fontname      = ");
        stringBuffer.append(getFontName());
        stringBuffer.append("\n[/FONT]\n");
        return stringBuffer.toString();
    }

    public FontRecord(RecordInputStream recordInputStream) {
        this.field_9_zero = (byte) 0;
        this.field_1_font_height = recordInputStream.readShort();
        this.field_2_attributes = recordInputStream.readShort();
        this.field_3_color_palette_index = recordInputStream.readShort();
        this.field_4_bold_weight = recordInputStream.readShort();
        this.field_5_super_sub_script = recordInputStream.readShort();
        this.field_6_underline = recordInputStream.readByte();
        this.field_7_family = recordInputStream.readByte();
        this.field_8_charset = recordInputStream.readByte();
        this.field_9_zero = recordInputStream.readByte();
        int readUByte = recordInputStream.readUByte();
        int readUByte2 = recordInputStream.readUByte();
        if (readUByte <= 0) {
            this.field_11_font_name = "";
        } else if (readUByte2 == 0) {
            this.field_11_font_name = recordInputStream.readCompressedUnicode(readUByte);
        } else {
            this.field_11_font_name = recordInputStream.readUnicodeLEString(readUByte);
        }
    }
}

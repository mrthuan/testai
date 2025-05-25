package lib.zj.office.fc.hssf.record.cf;

import com.google.android.gms.common.api.Api;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject;
import lib.zj.office.fc.hssf.record.RecordInputStream;
import lib.zj.office.fc.util.BitField;
import lib.zj.office.fc.util.BitFieldFactory;
import lib.zj.office.fc.util.LittleEndian;

/* loaded from: classes3.dex */
public final class FontFormatting {
    public static final int FONT_CELL_HEIGHT_PRESERVED = -1;
    private static final short FONT_WEIGHT_BOLD = 700;
    private static final short FONT_WEIGHT_NORMAL = 400;
    private static final int OFFSET_ESCAPEMENT_TYPE = 74;
    private static final int OFFSET_ESCAPEMENT_TYPE_MODIFIED = 92;
    private static final int OFFSET_FONT_COLOR_INDEX = 80;
    private static final int OFFSET_FONT_FORMATING_END = 116;
    private static final int OFFSET_FONT_HEIGHT = 64;
    private static final int OFFSET_FONT_NAME = 0;
    private static final int OFFSET_FONT_OPTIONS = 68;
    private static final int OFFSET_FONT_WEIGHT = 72;
    private static final int OFFSET_FONT_WEIGHT_MODIFIED = 100;
    private static final int OFFSET_NOT_USED1 = 104;
    private static final int OFFSET_NOT_USED2 = 108;
    private static final int OFFSET_NOT_USED3 = 112;
    private static final int OFFSET_OPTION_FLAGS = 88;
    private static final int OFFSET_UNDERLINE_TYPE = 76;
    private static final int OFFSET_UNDERLINE_TYPE_MODIFIED = 96;
    private static final int RAW_DATA_SIZE = 118;
    public static final short SS_NONE = 0;
    public static final short SS_SUB = 2;
    public static final short SS_SUPER = 1;
    public static final byte U_DOUBLE = 2;
    public static final byte U_DOUBLE_ACCOUNTING = 34;
    public static final byte U_NONE = 0;
    public static final byte U_SINGLE = 1;
    public static final byte U_SINGLE_ACCOUNTING = 33;
    private byte[] _rawData;
    private static final BitField posture = BitFieldFactory.getInstance(2);
    private static final BitField outline = BitFieldFactory.getInstance(8);
    private static final BitField shadow = BitFieldFactory.getInstance(16);
    private static final BitField cancellation = BitFieldFactory.getInstance(128);
    private static final BitField styleModified = BitFieldFactory.getInstance(2);
    private static final BitField outlineModified = BitFieldFactory.getInstance(8);
    private static final BitField shadowModified = BitFieldFactory.getInstance(16);
    private static final BitField cancellationModified = BitFieldFactory.getInstance(128);

    private FontFormatting(byte[] bArr) {
        this._rawData = bArr;
    }

    private boolean getFontOption(BitField bitField) {
        return bitField.isSet(getInt(68));
    }

    private int getInt(int i10) {
        return LittleEndian.getInt(this._rawData, i10);
    }

    private boolean getOptionFlag(BitField bitField) {
        if (bitField.getValue(getInt(88)) == 0) {
            return true;
        }
        return false;
    }

    private short getShort(int i10) {
        return LittleEndian.getShort(this._rawData, i10);
    }

    private void setFontOption(boolean z10, BitField bitField) {
        setInt(68, bitField.setBoolean(getInt(68), z10));
    }

    private void setFontWeight(short s4) {
        if (s4 < 100) {
            s4 = 100;
        }
        if (s4 > 1000) {
            s4 = 1000;
        }
        setShort(72, s4);
    }

    private void setInt(int i10, int i11) {
        LittleEndian.putInt(this._rawData, i10, i11);
    }

    private void setOptionFlag(boolean z10, BitField bitField) {
        setInt(88, bitField.setValue(getInt(88), !z10 ? 1 : 0));
    }

    private void setShort(int i10, int i11) {
        LittleEndian.putShort(this._rawData, i10, (short) i11);
    }

    public Object clone() {
        return new FontFormatting((byte[]) this._rawData.clone());
    }

    public short getEscapementType() {
        return getShort(74);
    }

    public short getFontColorIndex() {
        return (short) getInt(80);
    }

    public int getFontHeight() {
        return getInt(64);
    }

    public short getFontWeight() {
        return getShort(72);
    }

    public byte[] getRawRecord() {
        return this._rawData;
    }

    public short getUnderlineType() {
        return getShort(76);
    }

    public boolean isBold() {
        if (getFontWeight() == 700) {
            return true;
        }
        return false;
    }

    public boolean isEscapementTypeModified() {
        if (getInt(92) == 0) {
            return true;
        }
        return false;
    }

    public boolean isFontCancellationModified() {
        return getOptionFlag(cancellationModified);
    }

    public boolean isFontOutlineModified() {
        return getOptionFlag(outlineModified);
    }

    public boolean isFontShadowModified() {
        return getOptionFlag(shadowModified);
    }

    public boolean isFontStyleModified() {
        return getOptionFlag(styleModified);
    }

    public boolean isFontWeightModified() {
        if (getInt(100) == 0) {
            return true;
        }
        return false;
    }

    public boolean isItalic() {
        return getFontOption(posture);
    }

    public boolean isOutlineOn() {
        return getFontOption(outline);
    }

    public boolean isShadowOn() {
        return getFontOption(shadow);
    }

    public boolean isStruckout() {
        return getFontOption(cancellation);
    }

    public boolean isUnderlineTypeModified() {
        if (getInt(96) == 0) {
            return true;
        }
        return false;
    }

    public void setBold(boolean z10) {
        short s4;
        if (z10) {
            s4 = 700;
        } else {
            s4 = 400;
        }
        setFontWeight(s4);
    }

    public void setEscapementType(short s4) {
        setShort(74, s4);
    }

    public void setEscapementTypeModified(boolean z10) {
        setInt(92, !z10 ? 1 : 0);
    }

    public void setFontCancellationModified(boolean z10) {
        setOptionFlag(z10, cancellationModified);
    }

    public void setFontColorIndex(short s4) {
        setInt(80, s4);
    }

    public void setFontHeight(int i10) {
        setInt(64, i10);
    }

    public void setFontOutlineModified(boolean z10) {
        setOptionFlag(z10, outlineModified);
    }

    public void setFontShadowModified(boolean z10) {
        setOptionFlag(z10, shadowModified);
    }

    public void setFontStyleModified(boolean z10) {
        setOptionFlag(z10, styleModified);
    }

    public void setFontWieghtModified(boolean z10) {
        setInt(100, !z10 ? 1 : 0);
    }

    public void setItalic(boolean z10) {
        setFontOption(z10, posture);
    }

    public void setOutline(boolean z10) {
        setFontOption(z10, outline);
    }

    public void setShadow(boolean z10) {
        setFontOption(z10, shadow);
    }

    public void setStrikeout(boolean z10) {
        setFontOption(z10, cancellation);
    }

    public void setUnderlineType(short s4) {
        setShort(76, s4);
    }

    public void setUnderlineTypeModified(boolean z10) {
        setInt(96, !z10 ? 1 : 0);
    }

    public String toString() {
        String str;
        String str2;
        StringBuffer stringBuffer = new StringBuffer("\t[Font Formatting]\n\t.font height = ");
        stringBuffer.append(getFontHeight());
        stringBuffer.append(" twips\n");
        if (isFontStyleModified()) {
            stringBuffer.append("\t.font posture = ");
            if (isItalic()) {
                str2 = "Italic";
            } else {
                str2 = PDLayoutAttributeObject.LINE_HEIGHT_NORMAL;
            }
            stringBuffer.append(str2);
            stringBuffer.append("\n");
        } else {
            stringBuffer.append("\t.font posture = ]not modified]\n");
        }
        if (isFontOutlineModified()) {
            stringBuffer.append("\t.font outline = ");
            stringBuffer.append(isOutlineOn());
            stringBuffer.append("\n");
        } else {
            stringBuffer.append("\t.font outline is not modified\n");
        }
        if (isFontShadowModified()) {
            stringBuffer.append("\t.font shadow = ");
            stringBuffer.append(isShadowOn());
            stringBuffer.append("\n");
        } else {
            stringBuffer.append("\t.font shadow is not modified\n");
        }
        if (isFontCancellationModified()) {
            stringBuffer.append("\t.font strikeout = ");
            stringBuffer.append(isStruckout());
            stringBuffer.append("\n");
        } else {
            stringBuffer.append("\t.font strikeout is not modified\n");
        }
        if (isFontStyleModified()) {
            stringBuffer.append("\t.font weight = ");
            stringBuffer.append((int) getFontWeight());
            if (getFontWeight() == 400) {
                str = "(Normal)";
            } else if (getFontWeight() == 700) {
                str = "(Bold)";
            } else {
                str = "0x" + Integer.toHexString(getFontWeight());
            }
            stringBuffer.append(str);
            stringBuffer.append("\n");
        } else {
            stringBuffer.append("\t.font weight = ]not modified]\n");
        }
        if (isEscapementTypeModified()) {
            stringBuffer.append("\t.escapement type = ");
            stringBuffer.append((int) getEscapementType());
            stringBuffer.append("\n");
        } else {
            stringBuffer.append("\t.escapement type is not modified\n");
        }
        if (isUnderlineTypeModified()) {
            stringBuffer.append("\t.underline type = ");
            stringBuffer.append((int) getUnderlineType());
            stringBuffer.append("\n");
        } else {
            stringBuffer.append("\t.underline type is not modified\n");
        }
        stringBuffer.append("\t.color index = ");
        stringBuffer.append("0x" + Integer.toHexString(getFontColorIndex()).toUpperCase());
        stringBuffer.append("\n\t[/Font Formatting]\n");
        return stringBuffer.toString();
    }

    public FontFormatting() {
        this(new byte[118]);
        setFontHeight(-1);
        setItalic(false);
        setFontWieghtModified(false);
        setOutline(false);
        setShadow(false);
        setStrikeout(false);
        setEscapementType((short) 0);
        setUnderlineType((short) 0);
        setFontColorIndex((short) -1);
        setFontStyleModified(false);
        setFontOutlineModified(false);
        setFontShadowModified(false);
        setFontCancellationModified(false);
        setEscapementTypeModified(false);
        setUnderlineTypeModified(false);
        setShort(0, 0);
        setInt(104, 1);
        setInt(108, 0);
        setInt(112, Api.BaseClientBuilder.API_PRIORITY_OTHER);
        setShort(116, 1);
    }

    public FontFormatting(RecordInputStream recordInputStream) {
        this(new byte[118]);
        int i10 = 0;
        while (true) {
            byte[] bArr = this._rawData;
            if (i10 >= bArr.length) {
                return;
            }
            bArr[i10] = recordInputStream.readByte();
            i10++;
        }
    }
}

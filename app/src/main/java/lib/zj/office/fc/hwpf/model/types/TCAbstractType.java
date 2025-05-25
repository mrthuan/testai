package lib.zj.office.fc.hwpf.model.types;

import lib.zj.office.fc.hwpf.model.HDFType;
import lib.zj.office.fc.hwpf.usermodel.BorderCode;
import lib.zj.office.fc.util.BitField;
import lib.zj.office.fc.util.Internal;

@Internal
/* loaded from: classes3.dex */
public abstract class TCAbstractType implements HDFType {
    protected byte field_10_ftsCellPaddingRight;
    protected short field_11_wCellSpacingLeft;
    protected short field_12_wCellSpacingTop;
    protected short field_13_wCellSpacingBottom;
    protected short field_14_wCellSpacingRight;
    protected byte field_15_ftsCellSpacingLeft;
    protected byte field_16_ftsCellSpacingTop;
    protected byte field_17_ftsCellSpacingBottom;
    protected byte field_18_ftsCellSpacingRight;
    protected BorderCode field_19_brcTop;
    protected short field_1_rgf;
    protected BorderCode field_20_brcLeft;
    protected BorderCode field_21_brcBottom;
    protected BorderCode field_22_brcRight;
    protected short field_2_wWidth;
    protected short field_3_wCellPaddingLeft;
    protected short field_4_wCellPaddingTop;
    protected short field_5_wCellPaddingBottom;
    protected short field_6_wCellPaddingRight;
    protected byte field_7_ftsCellPaddingLeft;
    protected byte field_8_ftsCellPaddingTop;
    protected byte field_9_ftsCellPaddingBottom;
    private static BitField fFirstMerged = new BitField(1);
    private static BitField fMerged = new BitField(2);
    private static BitField fVertical = new BitField(4);
    private static BitField fBackward = new BitField(8);
    private static BitField fRotateFont = new BitField(16);
    private static BitField fVertMerge = new BitField(32);
    private static BitField fVertRestart = new BitField(64);
    private static BitField vertAlign = new BitField(384);
    private static BitField ftsWidth = new BitField(3584);
    private static BitField fFitText = new BitField(4096);
    private static BitField fNoWrap = new BitField(8192);
    private static BitField fUnused = new BitField(49152);

    public BorderCode getBrcBottom() {
        return this.field_21_brcBottom;
    }

    public BorderCode getBrcLeft() {
        return this.field_20_brcLeft;
    }

    public BorderCode getBrcRight() {
        return this.field_22_brcRight;
    }

    public BorderCode getBrcTop() {
        return this.field_19_brcTop;
    }

    public byte getFUnused() {
        return (byte) fUnused.getValue(this.field_1_rgf);
    }

    public byte getFtsCellPaddingBottom() {
        return this.field_9_ftsCellPaddingBottom;
    }

    public byte getFtsCellPaddingLeft() {
        return this.field_7_ftsCellPaddingLeft;
    }

    public byte getFtsCellPaddingRight() {
        return this.field_10_ftsCellPaddingRight;
    }

    public byte getFtsCellPaddingTop() {
        return this.field_8_ftsCellPaddingTop;
    }

    public byte getFtsCellSpacingBottom() {
        return this.field_17_ftsCellSpacingBottom;
    }

    public byte getFtsCellSpacingLeft() {
        return this.field_15_ftsCellSpacingLeft;
    }

    public byte getFtsCellSpacingRight() {
        return this.field_18_ftsCellSpacingRight;
    }

    public byte getFtsCellSpacingTop() {
        return this.field_16_ftsCellSpacingTop;
    }

    public byte getFtsWidth() {
        return (byte) ftsWidth.getValue(this.field_1_rgf);
    }

    public short getRgf() {
        return this.field_1_rgf;
    }

    public int getSize() {
        return 48;
    }

    public byte getVertAlign() {
        return (byte) vertAlign.getValue(this.field_1_rgf);
    }

    public short getWCellPaddingBottom() {
        return this.field_5_wCellPaddingBottom;
    }

    public short getWCellPaddingLeft() {
        return this.field_3_wCellPaddingLeft;
    }

    public short getWCellPaddingRight() {
        return this.field_6_wCellPaddingRight;
    }

    public short getWCellPaddingTop() {
        return this.field_4_wCellPaddingTop;
    }

    public short getWCellSpacingBottom() {
        return this.field_13_wCellSpacingBottom;
    }

    public short getWCellSpacingLeft() {
        return this.field_11_wCellSpacingLeft;
    }

    public short getWCellSpacingRight() {
        return this.field_14_wCellSpacingRight;
    }

    public short getWCellSpacingTop() {
        return this.field_12_wCellSpacingTop;
    }

    public short getWWidth() {
        return this.field_2_wWidth;
    }

    public boolean isFBackward() {
        return fBackward.isSet(this.field_1_rgf);
    }

    public boolean isFFirstMerged() {
        return fFirstMerged.isSet(this.field_1_rgf);
    }

    public boolean isFFitText() {
        return fFitText.isSet(this.field_1_rgf);
    }

    public boolean isFMerged() {
        return fMerged.isSet(this.field_1_rgf);
    }

    public boolean isFNoWrap() {
        return fNoWrap.isSet(this.field_1_rgf);
    }

    public boolean isFRotateFont() {
        return fRotateFont.isSet(this.field_1_rgf);
    }

    public boolean isFVertMerge() {
        return fVertMerge.isSet(this.field_1_rgf);
    }

    public boolean isFVertRestart() {
        return fVertRestart.isSet(this.field_1_rgf);
    }

    public boolean isFVertical() {
        return fVertical.isSet(this.field_1_rgf);
    }

    public void setBrcBottom(BorderCode borderCode) {
        this.field_21_brcBottom = borderCode;
    }

    public void setBrcLeft(BorderCode borderCode) {
        this.field_20_brcLeft = borderCode;
    }

    public void setBrcRight(BorderCode borderCode) {
        this.field_22_brcRight = borderCode;
    }

    public void setBrcTop(BorderCode borderCode) {
        this.field_19_brcTop = borderCode;
    }

    public void setFBackward(boolean z10) {
        this.field_1_rgf = (short) fBackward.setBoolean(this.field_1_rgf, z10);
    }

    public void setFFirstMerged(boolean z10) {
        this.field_1_rgf = (short) fFirstMerged.setBoolean(this.field_1_rgf, z10);
    }

    public void setFFitText(boolean z10) {
        this.field_1_rgf = (short) fFitText.setBoolean(this.field_1_rgf, z10);
    }

    public void setFMerged(boolean z10) {
        this.field_1_rgf = (short) fMerged.setBoolean(this.field_1_rgf, z10);
    }

    public void setFNoWrap(boolean z10) {
        this.field_1_rgf = (short) fNoWrap.setBoolean(this.field_1_rgf, z10);
    }

    public void setFRotateFont(boolean z10) {
        this.field_1_rgf = (short) fRotateFont.setBoolean(this.field_1_rgf, z10);
    }

    public void setFUnused(byte b10) {
        this.field_1_rgf = (short) fUnused.setValue(this.field_1_rgf, b10);
    }

    public void setFVertMerge(boolean z10) {
        this.field_1_rgf = (short) fVertMerge.setBoolean(this.field_1_rgf, z10);
    }

    public void setFVertRestart(boolean z10) {
        this.field_1_rgf = (short) fVertRestart.setBoolean(this.field_1_rgf, z10);
    }

    public void setFVertical(boolean z10) {
        this.field_1_rgf = (short) fVertical.setBoolean(this.field_1_rgf, z10);
    }

    public void setFtsCellPaddingBottom(byte b10) {
        this.field_9_ftsCellPaddingBottom = b10;
    }

    public void setFtsCellPaddingLeft(byte b10) {
        this.field_7_ftsCellPaddingLeft = b10;
    }

    public void setFtsCellPaddingRight(byte b10) {
        this.field_10_ftsCellPaddingRight = b10;
    }

    public void setFtsCellPaddingTop(byte b10) {
        this.field_8_ftsCellPaddingTop = b10;
    }

    public void setFtsCellSpacingBottom(byte b10) {
        this.field_17_ftsCellSpacingBottom = b10;
    }

    public void setFtsCellSpacingLeft(byte b10) {
        this.field_15_ftsCellSpacingLeft = b10;
    }

    public void setFtsCellSpacingRight(byte b10) {
        this.field_18_ftsCellSpacingRight = b10;
    }

    public void setFtsCellSpacingTop(byte b10) {
        this.field_16_ftsCellSpacingTop = b10;
    }

    public void setFtsWidth(byte b10) {
        this.field_1_rgf = (short) ftsWidth.setValue(this.field_1_rgf, b10);
    }

    public void setRgf(short s4) {
        this.field_1_rgf = s4;
    }

    public void setVertAlign(byte b10) {
        this.field_1_rgf = (short) vertAlign.setValue(this.field_1_rgf, b10);
    }

    public void setWCellPaddingBottom(short s4) {
        this.field_5_wCellPaddingBottom = s4;
    }

    public void setWCellPaddingLeft(short s4) {
        this.field_3_wCellPaddingLeft = s4;
    }

    public void setWCellPaddingRight(short s4) {
        this.field_6_wCellPaddingRight = s4;
    }

    public void setWCellPaddingTop(short s4) {
        this.field_4_wCellPaddingTop = s4;
    }

    public void setWCellSpacingBottom(short s4) {
        this.field_13_wCellSpacingBottom = s4;
    }

    public void setWCellSpacingLeft(short s4) {
        this.field_11_wCellSpacingLeft = s4;
    }

    public void setWCellSpacingRight(short s4) {
        this.field_14_wCellSpacingRight = s4;
    }

    public void setWCellSpacingTop(short s4) {
        this.field_12_wCellSpacingTop = s4;
    }

    public void setWWidth(short s4) {
        this.field_2_wWidth = s4;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[TC]\n    .rgf                  =  (");
        stringBuffer.append((int) getRgf());
        stringBuffer.append(" )\n         .fFirstMerged             = ");
        stringBuffer.append(isFFirstMerged());
        stringBuffer.append("\n         .fMerged                  = ");
        stringBuffer.append(isFMerged());
        stringBuffer.append("\n         .fVertical                = ");
        stringBuffer.append(isFVertical());
        stringBuffer.append("\n         .fBackward                = ");
        stringBuffer.append(isFBackward());
        stringBuffer.append("\n         .fRotateFont              = ");
        stringBuffer.append(isFRotateFont());
        stringBuffer.append("\n         .fVertMerge               = ");
        stringBuffer.append(isFVertMerge());
        stringBuffer.append("\n         .fVertRestart             = ");
        stringBuffer.append(isFVertRestart());
        stringBuffer.append("\n         .vertAlign                = ");
        stringBuffer.append((int) getVertAlign());
        stringBuffer.append("\n         .ftsWidth                 = ");
        stringBuffer.append((int) getFtsWidth());
        stringBuffer.append("\n         .fFitText                 = ");
        stringBuffer.append(isFFitText());
        stringBuffer.append("\n         .fNoWrap                  = ");
        stringBuffer.append(isFNoWrap());
        stringBuffer.append("\n         .fUnused                  = ");
        stringBuffer.append((int) getFUnused());
        stringBuffer.append("\n    .wWidth               =  (");
        stringBuffer.append((int) getWWidth());
        stringBuffer.append(" )\n    .wCellPaddingLeft     =  (");
        stringBuffer.append((int) getWCellPaddingLeft());
        stringBuffer.append(" )\n    .wCellPaddingTop      =  (");
        stringBuffer.append((int) getWCellPaddingTop());
        stringBuffer.append(" )\n    .wCellPaddingBottom   =  (");
        stringBuffer.append((int) getWCellPaddingBottom());
        stringBuffer.append(" )\n    .wCellPaddingRight    =  (");
        stringBuffer.append((int) getWCellPaddingRight());
        stringBuffer.append(" )\n    .ftsCellPaddingLeft   =  (");
        stringBuffer.append((int) getFtsCellPaddingLeft());
        stringBuffer.append(" )\n    .ftsCellPaddingTop    =  (");
        stringBuffer.append((int) getFtsCellPaddingTop());
        stringBuffer.append(" )\n    .ftsCellPaddingBottom =  (");
        stringBuffer.append((int) getFtsCellPaddingBottom());
        stringBuffer.append(" )\n    .ftsCellPaddingRight  =  (");
        stringBuffer.append((int) getFtsCellPaddingRight());
        stringBuffer.append(" )\n    .wCellSpacingLeft     =  (");
        stringBuffer.append((int) getWCellSpacingLeft());
        stringBuffer.append(" )\n    .wCellSpacingTop      =  (");
        stringBuffer.append((int) getWCellSpacingTop());
        stringBuffer.append(" )\n    .wCellSpacingBottom   =  (");
        stringBuffer.append((int) getWCellSpacingBottom());
        stringBuffer.append(" )\n    .wCellSpacingRight    =  (");
        stringBuffer.append((int) getWCellSpacingRight());
        stringBuffer.append(" )\n    .ftsCellSpacingLeft   =  (");
        stringBuffer.append((int) getFtsCellSpacingLeft());
        stringBuffer.append(" )\n    .ftsCellSpacingTop    =  (");
        stringBuffer.append((int) getFtsCellSpacingTop());
        stringBuffer.append(" )\n    .ftsCellSpacingBottom =  (");
        stringBuffer.append((int) getFtsCellSpacingBottom());
        stringBuffer.append(" )\n    .ftsCellSpacingRight  =  (");
        stringBuffer.append((int) getFtsCellSpacingRight());
        stringBuffer.append(" )\n    .brcTop               =  (");
        stringBuffer.append(getBrcTop());
        stringBuffer.append(" )\n    .brcLeft              =  (");
        stringBuffer.append(getBrcLeft());
        stringBuffer.append(" )\n    .brcBottom            =  (");
        stringBuffer.append(getBrcBottom());
        stringBuffer.append(" )\n    .brcRight             =  (");
        stringBuffer.append(getBrcRight());
        stringBuffer.append(" )\n[/TC]\n");
        return stringBuffer.toString();
    }
}

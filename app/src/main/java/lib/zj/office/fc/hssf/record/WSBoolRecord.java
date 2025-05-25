package lib.zj.office.fc.hssf.record;

import lib.zj.office.fc.util.BitField;
import lib.zj.office.fc.util.BitFieldFactory;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class WSBoolRecord extends StandardRecord {
    public static final short sid = 129;
    private byte field_1_wsbool;
    private byte field_2_wsbool;
    private static final BitField autobreaks = BitFieldFactory.getInstance(1);
    private static final BitField dialog = BitFieldFactory.getInstance(16);
    private static final BitField applystyles = BitFieldFactory.getInstance(32);
    private static final BitField rowsumsbelow = BitFieldFactory.getInstance(64);
    private static final BitField rowsumsright = BitFieldFactory.getInstance(128);
    private static final BitField fittopage = BitFieldFactory.getInstance(1);
    private static final BitField displayguts = BitFieldFactory.getInstance(6);
    private static final BitField alternateexpression = BitFieldFactory.getInstance(64);
    private static final BitField alternateformula = BitFieldFactory.getInstance(128);

    public WSBoolRecord() {
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public Object clone() {
        WSBoolRecord wSBoolRecord = new WSBoolRecord();
        wSBoolRecord.field_1_wsbool = this.field_1_wsbool;
        wSBoolRecord.field_2_wsbool = this.field_2_wsbool;
        return wSBoolRecord;
    }

    public boolean getAlternateExpression() {
        return alternateexpression.isSet(this.field_2_wsbool);
    }

    public boolean getAlternateFormula() {
        return alternateformula.isSet(this.field_2_wsbool);
    }

    public boolean getAutobreaks() {
        return autobreaks.isSet(this.field_1_wsbool);
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return 2;
    }

    public boolean getDialog() {
        return dialog.isSet(this.field_1_wsbool);
    }

    public boolean getDisplayGuts() {
        return displayguts.isSet(this.field_2_wsbool);
    }

    public boolean getFitToPage() {
        return fittopage.isSet(this.field_2_wsbool);
    }

    public boolean getRowSumsBelow() {
        return rowsumsbelow.isSet(this.field_1_wsbool);
    }

    public boolean getRowSumsRight() {
        return rowsumsright.isSet(this.field_1_wsbool);
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return (short) 129;
    }

    public byte getWSBool1() {
        return this.field_1_wsbool;
    }

    public byte getWSBool2() {
        return this.field_2_wsbool;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeByte(getWSBool2());
        littleEndianOutput.writeByte(getWSBool1());
    }

    public void setAlternateExpression(boolean z10) {
        this.field_2_wsbool = alternateexpression.setByteBoolean(this.field_2_wsbool, z10);
    }

    public void setAlternateFormula(boolean z10) {
        this.field_2_wsbool = alternateformula.setByteBoolean(this.field_2_wsbool, z10);
    }

    public void setAutobreaks(boolean z10) {
        this.field_1_wsbool = autobreaks.setByteBoolean(this.field_1_wsbool, z10);
    }

    public void setDialog(boolean z10) {
        this.field_1_wsbool = dialog.setByteBoolean(this.field_1_wsbool, z10);
    }

    public void setDisplayGuts(boolean z10) {
        this.field_2_wsbool = displayguts.setByteBoolean(this.field_2_wsbool, z10);
    }

    public void setFitToPage(boolean z10) {
        this.field_2_wsbool = fittopage.setByteBoolean(this.field_2_wsbool, z10);
    }

    public void setRowSumsBelow(boolean z10) {
        this.field_1_wsbool = rowsumsbelow.setByteBoolean(this.field_1_wsbool, z10);
    }

    public void setRowSumsRight(boolean z10) {
        this.field_1_wsbool = rowsumsright.setByteBoolean(this.field_1_wsbool, z10);
    }

    public void setWSBool1(byte b10) {
        this.field_1_wsbool = b10;
    }

    public void setWSBool2(byte b10) {
        this.field_2_wsbool = b10;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[WSBOOL]\n    .wsbool1        = ");
        stringBuffer.append(Integer.toHexString(getWSBool1()));
        stringBuffer.append("\n        .autobreaks = ");
        stringBuffer.append(getAutobreaks());
        stringBuffer.append("\n        .dialog     = ");
        stringBuffer.append(getDialog());
        stringBuffer.append("\n        .rowsumsbelw= ");
        stringBuffer.append(getRowSumsBelow());
        stringBuffer.append("\n        .rowsumsrigt= ");
        stringBuffer.append(getRowSumsRight());
        stringBuffer.append("\n    .wsbool2        = ");
        stringBuffer.append(Integer.toHexString(getWSBool2()));
        stringBuffer.append("\n        .fittopage  = ");
        stringBuffer.append(getFitToPage());
        stringBuffer.append("\n        .displayguts= ");
        stringBuffer.append(getDisplayGuts());
        stringBuffer.append("\n        .alternateex= ");
        stringBuffer.append(getAlternateExpression());
        stringBuffer.append("\n        .alternatefo= ");
        stringBuffer.append(getAlternateFormula());
        stringBuffer.append("\n[/WSBOOL]\n");
        return stringBuffer.toString();
    }

    public WSBoolRecord(RecordInputStream recordInputStream) {
        byte[] readRemainder = recordInputStream.readRemainder();
        this.field_1_wsbool = readRemainder[1];
        this.field_2_wsbool = readRemainder[0];
    }
}

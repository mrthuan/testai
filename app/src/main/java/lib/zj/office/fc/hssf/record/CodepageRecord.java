package lib.zj.office.fc.hssf.record;

import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class CodepageRecord extends StandardRecord {
    public static final short CODEPAGE = 1200;
    public static final short sid = 66;
    private short field_1_codepage;

    public CodepageRecord() {
    }

    public short getCodepage() {
        return this.field_1_codepage;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return 2;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return (short) 66;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeShort(getCodepage());
    }

    public void setCodepage(short s4) {
        this.field_1_codepage = s4;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[CODEPAGE]\n    .codepage        = ");
        stringBuffer.append(Integer.toHexString(getCodepage()));
        stringBuffer.append("\n[/CODEPAGE]\n");
        return stringBuffer.toString();
    }

    public CodepageRecord(RecordInputStream recordInputStream) {
        this.field_1_codepage = recordInputStream.readShort();
    }
}

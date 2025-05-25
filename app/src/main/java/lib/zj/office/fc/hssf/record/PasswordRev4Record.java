package lib.zj.office.fc.hssf.record;

import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class PasswordRev4Record extends StandardRecord {
    public static final short sid = 444;
    private int field_1_password;

    public PasswordRev4Record(int i10) {
        this.field_1_password = i10;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return 2;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return (short) 444;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeShort(this.field_1_password);
    }

    public void setPassword(short s4) {
        this.field_1_password = s4;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[PROT4REVPASSWORD]\n    .password = ");
        stringBuffer.append(HexDump.shortToHex(this.field_1_password));
        stringBuffer.append("\n[/PROT4REVPASSWORD]\n");
        return stringBuffer.toString();
    }

    public PasswordRev4Record(RecordInputStream recordInputStream) {
        this.field_1_password = recordInputStream.readShort();
    }
}

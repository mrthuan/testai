package lib.zj.office.fc.hssf.record;

import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class PasswordRecord extends StandardRecord {
    public static final short sid = 19;
    private int field_1_password;

    public PasswordRecord(int i10) {
        this.field_1_password = i10;
    }

    public static short hashPassword(String str) {
        byte[] bytes = str.getBytes();
        int i10 = 0;
        if (bytes.length > 0) {
            int length = bytes.length;
            while (true) {
                int i11 = length - 1;
                if (length <= 0) {
                    break;
                }
                i10 = bytes[i11] ^ (((i10 >> 14) & 1) | ((i10 << 1) & 32767));
                length = i11;
            }
            i10 = (bytes.length ^ (((i10 >> 14) & 1) | ((i10 << 1) & 32767))) ^ 52811;
        }
        return (short) i10;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public Object clone() {
        return new PasswordRecord(this.field_1_password);
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return 2;
    }

    public int getPassword() {
        return this.field_1_password;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return (short) 19;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeShort(this.field_1_password);
    }

    public void setPassword(int i10) {
        this.field_1_password = i10;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[PASSWORD]\n    .password = ");
        stringBuffer.append(HexDump.shortToHex(this.field_1_password));
        stringBuffer.append("\n[/PASSWORD]\n");
        return stringBuffer.toString();
    }

    public PasswordRecord(RecordInputStream recordInputStream) {
        this.field_1_password = recordInputStream.readShort();
    }
}

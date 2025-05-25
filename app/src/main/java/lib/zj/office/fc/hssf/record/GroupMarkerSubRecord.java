package lib.zj.office.fc.hssf.record;

import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndianInput;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class GroupMarkerSubRecord extends SubRecord {
    private static final byte[] EMPTY_BYTE_ARRAY = new byte[0];
    public static final short sid = 6;
    private byte[] reserved;

    public GroupMarkerSubRecord() {
        this.reserved = EMPTY_BYTE_ARRAY;
    }

    @Override // lib.zj.office.fc.hssf.record.SubRecord
    public Object clone() {
        GroupMarkerSubRecord groupMarkerSubRecord = new GroupMarkerSubRecord();
        groupMarkerSubRecord.reserved = new byte[this.reserved.length];
        int i10 = 0;
        while (true) {
            byte[] bArr = this.reserved;
            if (i10 < bArr.length) {
                groupMarkerSubRecord.reserved[i10] = bArr[i10];
                i10++;
            } else {
                return groupMarkerSubRecord;
            }
        }
    }

    @Override // lib.zj.office.fc.hssf.record.SubRecord
    public int getDataSize() {
        return this.reserved.length;
    }

    public short getSid() {
        return (short) 6;
    }

    @Override // lib.zj.office.fc.hssf.record.SubRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeShort(6);
        littleEndianOutput.writeShort(this.reserved.length);
        littleEndianOutput.write(this.reserved);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String property = System.getProperty("line.separator");
        stringBuffer.append("[ftGmo]" + property);
        stringBuffer.append("  reserved = ");
        stringBuffer.append(HexDump.toHex(this.reserved));
        stringBuffer.append(property);
        stringBuffer.append("[/ftGmo]" + property);
        return stringBuffer.toString();
    }

    public GroupMarkerSubRecord(LittleEndianInput littleEndianInput, int i10) {
        byte[] bArr = new byte[i10];
        littleEndianInput.readFully(bArr);
        this.reserved = bArr;
    }
}

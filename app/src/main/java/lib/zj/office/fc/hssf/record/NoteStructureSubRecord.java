package lib.zj.office.fc.hssf.record;

import a0.a;
import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndianInput;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class NoteStructureSubRecord extends SubRecord {
    private static final int ENCODED_SIZE = 22;
    public static final short sid = 13;
    private byte[] reserved;

    public NoteStructureSubRecord() {
        this.reserved = new byte[22];
    }

    @Override // lib.zj.office.fc.hssf.record.SubRecord
    public Object clone() {
        NoteStructureSubRecord noteStructureSubRecord = new NoteStructureSubRecord();
        byte[] bArr = this.reserved;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        noteStructureSubRecord.reserved = bArr2;
        return noteStructureSubRecord;
    }

    @Override // lib.zj.office.fc.hssf.record.SubRecord
    public int getDataSize() {
        return this.reserved.length;
    }

    public short getSid() {
        return (short) 13;
    }

    @Override // lib.zj.office.fc.hssf.record.SubRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeShort(13);
        littleEndianOutput.writeShort(this.reserved.length);
        littleEndianOutput.write(this.reserved);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[ftNts ]\n  size     = ");
        stringBuffer.append(getDataSize());
        stringBuffer.append("\n  reserved = ");
        stringBuffer.append(HexDump.toHex(this.reserved));
        stringBuffer.append("\n[/ftNts ]\n");
        return stringBuffer.toString();
    }

    public NoteStructureSubRecord(LittleEndianInput littleEndianInput, int i10) {
        if (i10 == 22) {
            byte[] bArr = new byte[i10];
            littleEndianInput.readFully(bArr);
            this.reserved = bArr;
            return;
        }
        throw new RecordFormatException(a.g("Unexpected size (", i10, ")"));
    }
}

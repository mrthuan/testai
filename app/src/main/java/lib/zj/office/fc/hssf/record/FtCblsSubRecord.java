package lib.zj.office.fc.hssf.record;

import a0.a;
import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndianInput;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class FtCblsSubRecord extends SubRecord {
    private static final int ENCODED_SIZE = 20;
    public static final short sid = 12;
    private byte[] reserved;

    public FtCblsSubRecord() {
        this.reserved = new byte[20];
    }

    @Override // lib.zj.office.fc.hssf.record.SubRecord
    public Object clone() {
        FtCblsSubRecord ftCblsSubRecord = new FtCblsSubRecord();
        byte[] bArr = this.reserved;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        ftCblsSubRecord.reserved = bArr2;
        return ftCblsSubRecord;
    }

    @Override // lib.zj.office.fc.hssf.record.SubRecord
    public int getDataSize() {
        return this.reserved.length;
    }

    public short getSid() {
        return (short) 12;
    }

    @Override // lib.zj.office.fc.hssf.record.SubRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeShort(12);
        littleEndianOutput.writeShort(this.reserved.length);
        littleEndianOutput.write(this.reserved);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[FtCbls ]\n  size     = ");
        stringBuffer.append(getDataSize());
        stringBuffer.append("\n  reserved = ");
        stringBuffer.append(HexDump.toHex(this.reserved));
        stringBuffer.append("\n[/FtCbls ]\n");
        return stringBuffer.toString();
    }

    public FtCblsSubRecord(LittleEndianInput littleEndianInput, int i10) {
        if (i10 == 20) {
            byte[] bArr = new byte[i10];
            littleEndianInput.readFully(bArr);
            this.reserved = bArr;
            return;
        }
        throw new RecordFormatException(a.g("Unexpected size (", i10, ")"));
    }
}

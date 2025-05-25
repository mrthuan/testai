package lib.zj.office.fc.hssf.record;

import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class DBCellRecord extends StandardRecord {
    public static final int BLOCK_SIZE = 32;
    public static final short sid = 215;
    private final int field_1_row_offset;
    private final short[] field_2_cell_offsets;

    /* loaded from: classes3.dex */
    public static final class Builder {
        private short[] _cellOffsets = new short[4];
        private int _nCellOffsets;

        public void addCellOffset(int i10) {
            short[] sArr = this._cellOffsets;
            int length = sArr.length;
            int i11 = this._nCellOffsets;
            if (length <= i11) {
                short[] sArr2 = new short[i11 * 2];
                System.arraycopy(sArr, 0, sArr2, 0, i11);
                this._cellOffsets = sArr2;
            }
            short[] sArr3 = this._cellOffsets;
            int i12 = this._nCellOffsets;
            sArr3[i12] = (short) i10;
            this._nCellOffsets = i12 + 1;
        }

        public DBCellRecord build(int i10) {
            int i11 = this._nCellOffsets;
            short[] sArr = new short[i11];
            System.arraycopy(this._cellOffsets, 0, sArr, 0, i11);
            return new DBCellRecord(i10, sArr);
        }
    }

    public DBCellRecord(int i10, short[] sArr) {
        this.field_1_row_offset = i10;
        this.field_2_cell_offsets = sArr;
    }

    public static int calculateSizeOfRecords(int i10, int i11) {
        return (i11 * 2) + (i10 * 8);
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return (this.field_2_cell_offsets.length * 2) + 4;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return sid;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeInt(this.field_1_row_offset);
        int i10 = 0;
        while (true) {
            short[] sArr = this.field_2_cell_offsets;
            if (i10 < sArr.length) {
                littleEndianOutput.writeShort(sArr[i10]);
                i10++;
            } else {
                return;
            }
        }
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[DBCELL]\n    .rowoffset = ");
        stringBuffer.append(HexDump.intToHex(this.field_1_row_offset));
        stringBuffer.append("\n");
        for (int i10 = 0; i10 < this.field_2_cell_offsets.length; i10++) {
            stringBuffer.append("    .cell_");
            stringBuffer.append(i10);
            stringBuffer.append(" = ");
            stringBuffer.append(HexDump.shortToHex(this.field_2_cell_offsets[i10]));
            stringBuffer.append("\n");
        }
        stringBuffer.append("[/DBCELL]\n");
        return stringBuffer.toString();
    }

    public DBCellRecord(RecordInputStream recordInputStream) {
        this.field_1_row_offset = recordInputStream.readUShort();
        this.field_2_cell_offsets = new short[recordInputStream.remaining() / 2];
        int i10 = 0;
        while (true) {
            short[] sArr = this.field_2_cell_offsets;
            if (i10 >= sArr.length) {
                return;
            }
            sArr[i10] = recordInputStream.readShort();
            i10++;
        }
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public Object clone() {
        return this;
    }
}

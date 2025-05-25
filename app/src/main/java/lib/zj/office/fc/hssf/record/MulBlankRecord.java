package lib.zj.office.fc.hssf.record;

import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class MulBlankRecord extends StandardRecord {
    public static final short sid = 190;
    private final int _firstCol;
    private final int _lastCol;
    private final int _row;
    private final short[] _xfs;

    public MulBlankRecord(int i10, int i11, short[] sArr) {
        this._row = i10;
        this._firstCol = i11;
        this._xfs = sArr;
        this._lastCol = (i11 + sArr.length) - 1;
    }

    private static short[] parseXFs(RecordInputStream recordInputStream) {
        int remaining = (recordInputStream.remaining() - 2) / 2;
        short[] sArr = new short[remaining];
        for (int i10 = 0; i10 < remaining; i10++) {
            sArr[i10] = recordInputStream.readShort();
        }
        return sArr;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return (this._xfs.length * 2) + 6;
    }

    public int getFirstColumn() {
        return this._firstCol;
    }

    public int getLastColumn() {
        return this._lastCol;
    }

    public int getNumColumns() {
        return (this._lastCol - this._firstCol) + 1;
    }

    public int getRow() {
        return this._row;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return (short) 190;
    }

    public short getXFAt(int i10) {
        return this._xfs[i10];
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeShort(this._row);
        littleEndianOutput.writeShort(this._firstCol);
        int length = this._xfs.length;
        for (int i10 = 0; i10 < length; i10++) {
            littleEndianOutput.writeShort(this._xfs[i10]);
        }
        littleEndianOutput.writeShort(this._lastCol);
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[MULBLANK]\nrow  = ");
        stringBuffer.append(Integer.toHexString(getRow()));
        stringBuffer.append("\nfirstcol  = ");
        stringBuffer.append(Integer.toHexString(getFirstColumn()));
        stringBuffer.append("\n lastcol  = ");
        stringBuffer.append(Integer.toHexString(this._lastCol));
        stringBuffer.append("\n");
        for (int i10 = 0; i10 < getNumColumns(); i10++) {
            stringBuffer.append("xf");
            stringBuffer.append(i10);
            stringBuffer.append("\t\t= ");
            stringBuffer.append(Integer.toHexString(getXFAt(i10)));
            stringBuffer.append("\n");
        }
        stringBuffer.append("[/MULBLANK]\n");
        return stringBuffer.toString();
    }

    public MulBlankRecord(RecordInputStream recordInputStream) {
        this._row = recordInputStream.readUShort();
        this._firstCol = recordInputStream.readShort();
        this._xfs = parseXFs(recordInputStream);
        this._lastCol = recordInputStream.readShort();
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public Object clone() {
        return this;
    }
}

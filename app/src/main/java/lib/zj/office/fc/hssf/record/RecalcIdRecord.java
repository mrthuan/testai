package lib.zj.office.fc.hssf.record;

import androidx.activity.r;
import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class RecalcIdRecord extends StandardRecord {
    public static final short sid = 449;
    private int _engineId;
    private final int _reserved0;

    public RecalcIdRecord() {
        this._reserved0 = 0;
        this._engineId = 0;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return 8;
    }

    public int getEngineId() {
        return this._engineId;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return (short) 449;
    }

    public boolean isNeeded() {
        return true;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeShort(449);
        littleEndianOutput.writeShort(this._reserved0);
        littleEndianOutput.writeInt(this._engineId);
    }

    public void setEngineId(int i10) {
        this._engineId = i10;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[RECALCID]\n    .reserved = ");
        r.j(this._reserved0, stringBuffer, "\n    .engineId = ");
        stringBuffer.append(HexDump.intToHex(this._engineId));
        stringBuffer.append("\n[/RECALCID]\n");
        return stringBuffer.toString();
    }

    public RecalcIdRecord(RecordInputStream recordInputStream) {
        recordInputStream.readUShort();
        this._reserved0 = recordInputStream.readUShort();
        this._engineId = recordInputStream.readInt();
    }
}

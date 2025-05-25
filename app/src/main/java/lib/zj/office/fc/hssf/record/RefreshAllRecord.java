package lib.zj.office.fc.hssf.record;

import lib.zj.office.fc.util.BitField;
import lib.zj.office.fc.util.BitFieldFactory;
import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class RefreshAllRecord extends StandardRecord {
    private static final BitField refreshFlag = BitFieldFactory.getInstance(1);
    public static final short sid = 439;
    private int _options;

    private RefreshAllRecord(int i10) {
        this._options = i10;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public Object clone() {
        return new RefreshAllRecord(this._options);
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return 2;
    }

    public boolean getRefreshAll() {
        return refreshFlag.isSet(this._options);
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return sid;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeShort(this._options);
    }

    public void setRefreshAll(boolean z10) {
        this._options = refreshFlag.setBoolean(this._options, z10);
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[REFRESHALL]\n    .options      = ");
        stringBuffer.append(HexDump.shortToHex(this._options));
        stringBuffer.append("\n[/REFRESHALL]\n");
        return stringBuffer.toString();
    }

    public RefreshAllRecord(RecordInputStream recordInputStream) {
        this(recordInputStream.readUShort());
    }

    public RefreshAllRecord(boolean z10) {
        this(0);
        setRefreshAll(z10);
    }
}

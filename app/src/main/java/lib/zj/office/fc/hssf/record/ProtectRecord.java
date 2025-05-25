package lib.zj.office.fc.hssf.record;

import lib.zj.office.fc.util.BitField;
import lib.zj.office.fc.util.BitFieldFactory;
import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class ProtectRecord extends StandardRecord {
    private static final BitField protectFlag = BitFieldFactory.getInstance(1);
    public static final short sid = 18;
    private int _options;

    private ProtectRecord(int i10) {
        this._options = i10;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public Object clone() {
        return new ProtectRecord(this._options);
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return 2;
    }

    public boolean getProtect() {
        return protectFlag.isSet(this._options);
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return (short) 18;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeShort(this._options);
    }

    public void setProtect(boolean z10) {
        this._options = protectFlag.setBoolean(this._options, z10);
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[PROTECT]\n    .options = ");
        stringBuffer.append(HexDump.shortToHex(this._options));
        stringBuffer.append("\n[/PROTECT]\n");
        return stringBuffer.toString();
    }

    public ProtectRecord(boolean z10) {
        this(0);
        setProtect(z10);
    }

    public ProtectRecord(RecordInputStream recordInputStream) {
        this(recordInputStream.readShort());
    }
}

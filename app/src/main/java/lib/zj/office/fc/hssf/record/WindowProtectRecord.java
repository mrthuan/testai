package lib.zj.office.fc.hssf.record;

import lib.zj.office.fc.util.BitField;
import lib.zj.office.fc.util.BitFieldFactory;
import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class WindowProtectRecord extends StandardRecord {
    private static final BitField settingsProtectedFlag = BitFieldFactory.getInstance(1);
    public static final short sid = 25;
    private int _options;

    public WindowProtectRecord(int i10) {
        this._options = i10;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public Object clone() {
        return new WindowProtectRecord(this._options);
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return 2;
    }

    public boolean getProtect() {
        return settingsProtectedFlag.isSet(this._options);
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return (short) 25;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeShort(this._options);
    }

    public void setProtect(boolean z10) {
        this._options = settingsProtectedFlag.setBoolean(this._options, z10);
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[WINDOWPROTECT]\n    .options = ");
        stringBuffer.append(HexDump.shortToHex(this._options));
        stringBuffer.append("\n[/WINDOWPROTECT]\n");
        return stringBuffer.toString();
    }

    public WindowProtectRecord(RecordInputStream recordInputStream) {
        this(recordInputStream.readUShort());
    }

    public WindowProtectRecord(boolean z10) {
        this(0);
        setProtect(z10);
    }
}

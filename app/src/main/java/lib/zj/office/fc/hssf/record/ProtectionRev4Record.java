package lib.zj.office.fc.hssf.record;

import lib.zj.office.fc.util.BitField;
import lib.zj.office.fc.util.BitFieldFactory;
import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class ProtectionRev4Record extends StandardRecord {
    private static final BitField protectedFlag = BitFieldFactory.getInstance(1);
    public static final short sid = 431;
    private int _options;

    private ProtectionRev4Record(int i10) {
        this._options = i10;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return 2;
    }

    public boolean getProtect() {
        return protectedFlag.isSet(this._options);
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return sid;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeShort(this._options);
    }

    public void setProtect(boolean z10) {
        this._options = protectedFlag.setBoolean(this._options, z10);
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[PROT4REV]\n    .options = ");
        stringBuffer.append(HexDump.shortToHex(this._options));
        stringBuffer.append("\n[/PROT4REV]\n");
        return stringBuffer.toString();
    }

    public ProtectionRev4Record(boolean z10) {
        this(0);
        setProtect(z10);
    }

    public ProtectionRev4Record(RecordInputStream recordInputStream) {
        this(recordInputStream.readUShort());
    }
}

package lib.zj.office.fc.hssf.record;

import lib.zj.office.fc.util.BitField;
import lib.zj.office.fc.util.BitFieldFactory;
import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class DSFRecord extends StandardRecord {
    private static final BitField biff5BookStreamFlag = BitFieldFactory.getInstance(1);
    public static final short sid = 353;
    private int _options;

    private DSFRecord(int i10) {
        this._options = i10;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return 2;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return sid;
    }

    public boolean isBiff5BookStreamPresent() {
        return biff5BookStreamFlag.isSet(this._options);
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeShort(this._options);
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[DSF]\n    .options = ");
        stringBuffer.append(HexDump.shortToHex(this._options));
        stringBuffer.append("\n[/DSF]\n");
        return stringBuffer.toString();
    }

    public DSFRecord(boolean z10) {
        this(0);
        this._options = biff5BookStreamFlag.setBoolean(0, z10);
    }

    public DSFRecord(RecordInputStream recordInputStream) {
        this(recordInputStream.readShort());
    }
}

package lib.zj.office.fc.hssf.record;

import lib.zj.office.fc.util.BitField;
import lib.zj.office.fc.util.BitFieldFactory;
import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class UseSelFSRecord extends StandardRecord {
    public static final short sid = 352;
    private static final BitField useNaturalLanguageFormulasFlag = BitFieldFactory.getInstance(1);
    private int _options;

    private UseSelFSRecord(int i10) {
        this._options = i10;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public Object clone() {
        return new UseSelFSRecord(this._options);
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return 2;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return sid;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeShort(this._options);
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[USESELFS]\n    .options = ");
        stringBuffer.append(HexDump.shortToHex(this._options));
        stringBuffer.append("\n[/USESELFS]\n");
        return stringBuffer.toString();
    }

    public UseSelFSRecord(RecordInputStream recordInputStream) {
        this(recordInputStream.readUShort());
    }

    public UseSelFSRecord(boolean z10) {
        this(0);
        this._options = useNaturalLanguageFormulasFlag.setBoolean(this._options, z10);
    }
}

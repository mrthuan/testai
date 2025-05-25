package lib.zj.office.fc.hssf.record;

import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class InterfaceHdrRecord extends StandardRecord {
    public static final int CODEPAGE = 1200;
    public static final short sid = 225;
    private final int _codepage;

    public InterfaceHdrRecord(int i10) {
        this._codepage = i10;
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
        littleEndianOutput.writeShort(this._codepage);
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[INTERFACEHDR]\n    .codepage = ");
        stringBuffer.append(HexDump.shortToHex(this._codepage));
        stringBuffer.append("\n[/INTERFACEHDR]\n");
        return stringBuffer.toString();
    }

    public InterfaceHdrRecord(RecordInputStream recordInputStream) {
        this._codepage = recordInputStream.readShort();
    }
}

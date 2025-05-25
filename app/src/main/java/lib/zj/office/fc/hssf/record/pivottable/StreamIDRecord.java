package lib.zj.office.fc.hssf.record.pivottable;

import lib.zj.office.fc.hssf.record.RecordInputStream;
import lib.zj.office.fc.hssf.record.StandardRecord;
import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class StreamIDRecord extends StandardRecord {
    public static final short sid = 213;
    private int idstm;

    public StreamIDRecord(RecordInputStream recordInputStream) {
        this.idstm = recordInputStream.readShort();
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
        littleEndianOutput.writeShort(this.idstm);
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[SXIDSTM]\n    .idstm      =");
        stringBuffer.append(HexDump.shortToHex(this.idstm));
        stringBuffer.append("\n[/SXIDSTM]\n");
        return stringBuffer.toString();
    }
}

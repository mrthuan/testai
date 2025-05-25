package lib.zj.office.fc.hssf.record.pivottable;

import lib.zj.office.fc.hssf.record.RecordInputStream;
import lib.zj.office.fc.hssf.record.StandardRecord;
import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class ViewSourceRecord extends StandardRecord {
    public static final short sid = 227;
    private int vs;

    public ViewSourceRecord(RecordInputStream recordInputStream) {
        this.vs = recordInputStream.readShort();
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
        littleEndianOutput.writeShort(this.vs);
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[SXVS]\n    .vs      =");
        stringBuffer.append(HexDump.shortToHex(this.vs));
        stringBuffer.append("\n[/SXVS]\n");
        return stringBuffer.toString();
    }
}

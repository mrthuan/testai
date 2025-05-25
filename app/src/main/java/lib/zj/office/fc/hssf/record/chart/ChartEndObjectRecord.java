package lib.zj.office.fc.hssf.record.chart;

import androidx.activity.r;
import lib.zj.office.fc.hssf.record.RecordInputStream;
import lib.zj.office.fc.hssf.record.StandardRecord;
import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class ChartEndObjectRecord extends StandardRecord {
    public static final short sid = 2133;
    private short grbitFrt;
    private short iObjectKind;
    private byte[] reserved = new byte[6];
    private short rt;

    public ChartEndObjectRecord(RecordInputStream recordInputStream) {
        this.rt = recordInputStream.readShort();
        this.grbitFrt = recordInputStream.readShort();
        this.iObjectKind = recordInputStream.readShort();
        if (recordInputStream.available() != 0) {
            recordInputStream.readFully(this.reserved);
        }
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return 12;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return (short) 2133;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeShort(this.rt);
        littleEndianOutput.writeShort(this.grbitFrt);
        littleEndianOutput.writeShort(this.iObjectKind);
        littleEndianOutput.write(this.reserved);
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[ENDOBJECT]\n    .rt         =");
        r.j(this.rt, stringBuffer, "\n    .grbitFrt   =");
        r.j(this.grbitFrt, stringBuffer, "\n    .iObjectKind=");
        r.j(this.iObjectKind, stringBuffer, "\n    .reserved   =");
        stringBuffer.append(HexDump.toHex(this.reserved));
        stringBuffer.append("\n[/ENDOBJECT]\n");
        return stringBuffer.toString();
    }
}

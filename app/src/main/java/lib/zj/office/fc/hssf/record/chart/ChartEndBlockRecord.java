package lib.zj.office.fc.hssf.record.chart;

import androidx.activity.r;
import lib.zj.office.fc.hssf.record.RecordInputStream;
import lib.zj.office.fc.hssf.record.StandardRecord;
import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class ChartEndBlockRecord extends StandardRecord {
    public static final short sid = 2131;
    private short grbitFrt;
    private short iObjectKind;
    private short rt;
    private byte[] unused;

    public ChartEndBlockRecord() {
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return this.unused.length + 6;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return sid;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeShort(this.rt);
        littleEndianOutput.writeShort(this.grbitFrt);
        littleEndianOutput.writeShort(this.iObjectKind);
        littleEndianOutput.write(this.unused);
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[ENDBLOCK]\n    .rt         =");
        r.j(this.rt, stringBuffer, "\n    .grbitFrt   =");
        r.j(this.grbitFrt, stringBuffer, "\n    .iObjectKind=");
        r.j(this.iObjectKind, stringBuffer, "\n    .unused     =");
        stringBuffer.append(HexDump.toHex(this.unused));
        stringBuffer.append("\n[/ENDBLOCK]\n");
        return stringBuffer.toString();
    }

    public ChartEndBlockRecord(RecordInputStream recordInputStream) {
        this.rt = recordInputStream.readShort();
        this.grbitFrt = recordInputStream.readShort();
        this.iObjectKind = recordInputStream.readShort();
        if (recordInputStream.available() == 0) {
            this.unused = new byte[0];
            return;
        }
        byte[] bArr = new byte[6];
        this.unused = bArr;
        recordInputStream.readFully(bArr);
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public ChartEndBlockRecord clone() {
        ChartEndBlockRecord chartEndBlockRecord = new ChartEndBlockRecord();
        chartEndBlockRecord.rt = this.rt;
        chartEndBlockRecord.grbitFrt = this.grbitFrt;
        chartEndBlockRecord.iObjectKind = this.iObjectKind;
        chartEndBlockRecord.unused = (byte[]) this.unused.clone();
        return chartEndBlockRecord;
    }
}

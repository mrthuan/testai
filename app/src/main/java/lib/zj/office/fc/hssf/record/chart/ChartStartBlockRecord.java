package lib.zj.office.fc.hssf.record.chart;

import androidx.activity.r;
import lib.zj.office.fc.hssf.record.RecordInputStream;
import lib.zj.office.fc.hssf.record.StandardRecord;
import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class ChartStartBlockRecord extends StandardRecord {
    public static final short sid = 2130;
    private short grbitFrt;
    private short iObjectContext;
    private short iObjectInstance1;
    private short iObjectInstance2;
    private short iObjectKind;
    private short rt;

    public ChartStartBlockRecord() {
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return 12;
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
        littleEndianOutput.writeShort(this.iObjectContext);
        littleEndianOutput.writeShort(this.iObjectInstance1);
        littleEndianOutput.writeShort(this.iObjectInstance2);
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[STARTBLOCK]\n    .rt              =");
        r.j(this.rt, stringBuffer, "\n    .grbitFrt        =");
        r.j(this.grbitFrt, stringBuffer, "\n    .iObjectKind     =");
        r.j(this.iObjectKind, stringBuffer, "\n    .iObjectContext  =");
        r.j(this.iObjectContext, stringBuffer, "\n    .iObjectInstance1=");
        r.j(this.iObjectInstance1, stringBuffer, "\n    .iObjectInstance2=");
        stringBuffer.append(HexDump.shortToHex(this.iObjectInstance2));
        stringBuffer.append("\n[/STARTBLOCK]\n");
        return stringBuffer.toString();
    }

    public ChartStartBlockRecord(RecordInputStream recordInputStream) {
        this.rt = recordInputStream.readShort();
        this.grbitFrt = recordInputStream.readShort();
        this.iObjectKind = recordInputStream.readShort();
        this.iObjectContext = recordInputStream.readShort();
        this.iObjectInstance1 = recordInputStream.readShort();
        this.iObjectInstance2 = recordInputStream.readShort();
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public ChartStartBlockRecord clone() {
        ChartStartBlockRecord chartStartBlockRecord = new ChartStartBlockRecord();
        chartStartBlockRecord.rt = this.rt;
        chartStartBlockRecord.grbitFrt = this.grbitFrt;
        chartStartBlockRecord.iObjectKind = this.iObjectKind;
        chartStartBlockRecord.iObjectContext = this.iObjectContext;
        chartStartBlockRecord.iObjectInstance1 = this.iObjectInstance1;
        chartStartBlockRecord.iObjectInstance2 = this.iObjectInstance2;
        return chartStartBlockRecord;
    }
}

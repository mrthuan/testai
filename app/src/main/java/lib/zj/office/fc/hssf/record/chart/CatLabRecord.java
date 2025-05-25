package lib.zj.office.fc.hssf.record.chart;

import androidx.activity.r;
import lib.zj.office.fc.hssf.record.RecordInputStream;
import lib.zj.office.fc.hssf.record.StandardRecord;
import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class CatLabRecord extends StandardRecord {
    public static final short sid = 2134;
    private short at;
    private short grbit;
    private short grbitFrt;
    private short rt;
    private Short unused;
    private short wOffset;

    public CatLabRecord(RecordInputStream recordInputStream) {
        this.rt = recordInputStream.readShort();
        this.grbitFrt = recordInputStream.readShort();
        this.wOffset = recordInputStream.readShort();
        this.at = recordInputStream.readShort();
        this.grbit = recordInputStream.readShort();
        if (recordInputStream.available() == 0) {
            this.unused = null;
        } else {
            this.unused = Short.valueOf(recordInputStream.readShort());
        }
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        int i10;
        if (this.unused == null) {
            i10 = 0;
        } else {
            i10 = 2;
        }
        return i10 + 10;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return (short) 2134;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeShort(this.rt);
        littleEndianOutput.writeShort(this.grbitFrt);
        littleEndianOutput.writeShort(this.wOffset);
        littleEndianOutput.writeShort(this.at);
        littleEndianOutput.writeShort(this.grbit);
        Short sh2 = this.unused;
        if (sh2 != null) {
            littleEndianOutput.writeShort(sh2.shortValue());
        }
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[CATLAB]\n    .rt      =");
        r.j(this.rt, stringBuffer, "\n    .grbitFrt=");
        r.j(this.grbitFrt, stringBuffer, "\n    .wOffset =");
        r.j(this.wOffset, stringBuffer, "\n    .at      =");
        r.j(this.at, stringBuffer, "\n    .grbit   =");
        r.j(this.grbit, stringBuffer, "\n    .unused  =");
        stringBuffer.append(HexDump.shortToHex(this.unused.shortValue()));
        stringBuffer.append("\n[/CATLAB]\n");
        return stringBuffer.toString();
    }
}

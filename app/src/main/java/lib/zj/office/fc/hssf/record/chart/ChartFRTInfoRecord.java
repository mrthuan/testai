package lib.zj.office.fc.hssf.record.chart;

import androidx.activity.r;
import lib.zj.office.fc.hssf.record.RecordInputStream;
import lib.zj.office.fc.hssf.record.StandardRecord;
import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndianInput;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class ChartFRTInfoRecord extends StandardRecord {
    public static final short sid = 2128;
    private short grbitFrt;
    private CFRTID[] rgCFRTID;
    private short rt;
    private byte verOriginator;
    private byte verWriter;

    /* loaded from: classes3.dex */
    public static final class CFRTID {
        public static final int ENCODED_SIZE = 4;
        private int rtFirst;
        private int rtLast;

        public CFRTID(LittleEndianInput littleEndianInput) {
            this.rtFirst = littleEndianInput.readShort();
            this.rtLast = littleEndianInput.readShort();
        }

        public void serialize(LittleEndianOutput littleEndianOutput) {
            littleEndianOutput.writeShort(this.rtFirst);
            littleEndianOutput.writeShort(this.rtLast);
        }
    }

    public ChartFRTInfoRecord(RecordInputStream recordInputStream) {
        this.rt = recordInputStream.readShort();
        this.grbitFrt = recordInputStream.readShort();
        this.verOriginator = recordInputStream.readByte();
        this.verWriter = recordInputStream.readByte();
        int readShort = recordInputStream.readShort();
        this.rgCFRTID = new CFRTID[readShort];
        for (int i10 = 0; i10 < readShort; i10++) {
            this.rgCFRTID[i10] = new CFRTID(recordInputStream);
        }
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return (this.rgCFRTID.length * 4) + 8;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return sid;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeShort(this.rt);
        littleEndianOutput.writeShort(this.grbitFrt);
        littleEndianOutput.writeByte(this.verOriginator);
        littleEndianOutput.writeByte(this.verWriter);
        int length = this.rgCFRTID.length;
        littleEndianOutput.writeShort(length);
        for (int i10 = 0; i10 < length; i10++) {
            this.rgCFRTID[i10].serialize(littleEndianOutput);
        }
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[CHARTFRTINFO]\n    .rt           =");
        r.j(this.rt, stringBuffer, "\n    .grbitFrt     =");
        r.j(this.grbitFrt, stringBuffer, "\n    .verOriginator=");
        stringBuffer.append(HexDump.byteToHex(this.verOriginator));
        stringBuffer.append("\n    .verWriter    =");
        stringBuffer.append(HexDump.byteToHex(this.verOriginator));
        stringBuffer.append("\n    .nCFRTIDs     =");
        stringBuffer.append(HexDump.shortToHex(this.rgCFRTID.length));
        stringBuffer.append("\n[/CHARTFRTINFO]\n");
        return stringBuffer.toString();
    }
}

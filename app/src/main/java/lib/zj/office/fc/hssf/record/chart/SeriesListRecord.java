package lib.zj.office.fc.hssf.record.chart;

import lib.zj.office.fc.hssf.record.RecordInputStream;
import lib.zj.office.fc.hssf.record.StandardRecord;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class SeriesListRecord extends StandardRecord {
    public static final short sid = 4118;
    private short[] field_1_seriesNumbers;

    public SeriesListRecord(short[] sArr) {
        this.field_1_seriesNumbers = sArr;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public Object clone() {
        return new SeriesListRecord((short[]) this.field_1_seriesNumbers.clone());
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return (this.field_1_seriesNumbers.length * 2) + 2;
    }

    public short[] getSeriesNumbers() {
        return this.field_1_seriesNumbers;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return sid;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        int length = this.field_1_seriesNumbers.length;
        littleEndianOutput.writeShort(length);
        for (int i10 = 0; i10 < length; i10++) {
            littleEndianOutput.writeShort(this.field_1_seriesNumbers[i10]);
        }
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[SERIESLIST]\n    .seriesNumbers=  (");
        stringBuffer.append(getSeriesNumbers());
        stringBuffer.append(" )\n[/SERIESLIST]\n");
        return stringBuffer.toString();
    }

    public SeriesListRecord(RecordInputStream recordInputStream) {
        int readUShort = recordInputStream.readUShort();
        short[] sArr = new short[readUShort];
        for (int i10 = 0; i10 < readUShort; i10++) {
            sArr[i10] = recordInputStream.readShort();
        }
        this.field_1_seriesNumbers = sArr;
    }
}

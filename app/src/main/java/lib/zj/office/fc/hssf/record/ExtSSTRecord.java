package lib.zj.office.fc.hssf.record;

import java.util.ArrayList;
import lib.zj.office.fc.hssf.record.cont.ContinuableRecord;
import lib.zj.office.fc.hssf.record.cont.ContinuableRecordOutput;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class ExtSSTRecord extends ContinuableRecord {
    public static final int DEFAULT_BUCKET_SIZE = 8;
    public static final int MAX_BUCKETS = 128;
    public static final short sid = 255;
    private InfoSubRecord[] _sstInfos;
    private short _stringsPerBucket;

    public ExtSSTRecord() {
        this._stringsPerBucket = (short) 8;
        this._sstInfos = new InfoSubRecord[0];
    }

    public static final int getNumberOfInfoRecsForStrings(int i10) {
        int i11 = i10 / 8;
        if (i10 % 8 != 0) {
            i11++;
        }
        if (i11 > 128) {
            return 128;
        }
        return i11;
    }

    public static final int getRecordSizeForStrings(int i10) {
        return (getNumberOfInfoRecsForStrings(i10) * 8) + 6;
    }

    public int getDataSize() {
        return (this._sstInfos.length * 8) + 2;
    }

    public InfoSubRecord[] getInfoSubRecords() {
        return this._sstInfos;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return (short) 255;
    }

    @Override // lib.zj.office.fc.hssf.record.cont.ContinuableRecord
    public void serialize(ContinuableRecordOutput continuableRecordOutput) {
        continuableRecordOutput.writeShort(this._stringsPerBucket);
        int i10 = 0;
        while (true) {
            InfoSubRecord[] infoSubRecordArr = this._sstInfos;
            if (i10 < infoSubRecordArr.length) {
                infoSubRecordArr[i10].serialize(continuableRecordOutput);
                i10++;
            } else {
                return;
            }
        }
    }

    public void setBucketOffsets(int[] iArr, int[] iArr2) {
        this._sstInfos = new InfoSubRecord[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            this._sstInfos[i10] = new InfoSubRecord(iArr[i10], iArr2[i10]);
        }
    }

    public void setNumStringsPerBucket(short s4) {
        this._stringsPerBucket = s4;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[EXTSST]\n    .dsst           = ");
        stringBuffer.append(Integer.toHexString(this._stringsPerBucket));
        stringBuffer.append("\n    .numInfoRecords = ");
        stringBuffer.append(this._sstInfos.length);
        stringBuffer.append("\n");
        for (int i10 = 0; i10 < this._sstInfos.length; i10++) {
            stringBuffer.append("    .inforecord     = ");
            stringBuffer.append(i10);
            stringBuffer.append("\n    .streampos      = ");
            stringBuffer.append(Integer.toHexString(this._sstInfos[i10].getStreamPos()));
            stringBuffer.append("\n    .sstoffset      = ");
            stringBuffer.append(Integer.toHexString(this._sstInfos[i10].getBucketSSTOffset()));
            stringBuffer.append("\n");
        }
        stringBuffer.append("[/EXTSST]\n");
        return stringBuffer.toString();
    }

    /* loaded from: classes3.dex */
    public static final class InfoSubRecord {
        public static final int ENCODED_SIZE = 8;
        private int field_1_stream_pos;
        private int field_2_bucket_sst_offset;
        private short field_3_zero;

        public InfoSubRecord(int i10, int i11) {
            this.field_1_stream_pos = i10;
            this.field_2_bucket_sst_offset = i11;
        }

        public int getBucketSSTOffset() {
            return this.field_2_bucket_sst_offset;
        }

        public int getStreamPos() {
            return this.field_1_stream_pos;
        }

        public void serialize(LittleEndianOutput littleEndianOutput) {
            littleEndianOutput.writeInt(this.field_1_stream_pos);
            littleEndianOutput.writeShort(this.field_2_bucket_sst_offset);
            littleEndianOutput.writeShort(this.field_3_zero);
        }

        public InfoSubRecord(RecordInputStream recordInputStream) {
            this.field_1_stream_pos = recordInputStream.readInt();
            this.field_2_bucket_sst_offset = recordInputStream.readShort();
            this.field_3_zero = recordInputStream.readShort();
        }
    }

    public ExtSSTRecord(RecordInputStream recordInputStream) {
        this._stringsPerBucket = recordInputStream.readShort();
        ArrayList arrayList = new ArrayList(recordInputStream.remaining() / 8);
        while (recordInputStream.available() > 0) {
            arrayList.add(new InfoSubRecord(recordInputStream));
            if (recordInputStream.available() == 0 && recordInputStream.hasNextRecord() && recordInputStream.getNextSid() == 60) {
                recordInputStream.nextRecord();
            }
        }
        this._sstInfos = (InfoSubRecord[]) arrayList.toArray(new InfoSubRecord[arrayList.size()]);
    }
}

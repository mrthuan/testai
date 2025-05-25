package lib.zj.office.fc.hssf.record;

import java.util.Iterator;
import lib.zj.office.fc.hssf.record.cont.ContinuableRecord;
import lib.zj.office.fc.hssf.record.cont.ContinuableRecordOutput;
import lib.zj.office.fc.util.IntMapper;

/* loaded from: classes3.dex */
public final class SSTRecord extends ContinuableRecord {
    private static final lib.zj.office.fc.hssf.record.common.UnicodeString EMPTY_STRING = new lib.zj.office.fc.hssf.record.common.UnicodeString("");
    static final int MAX_DATA_SPACE = 8216;
    static final int SST_RECORD_OVERHEAD = 12;
    static final int STD_RECORD_OVERHEAD = 4;
    public static final short sid = 252;
    int[] bucketAbsoluteOffsets;
    int[] bucketRelativeOffsets;
    private SSTDeserializer deserializer;
    private int field_1_num_strings;
    private int field_2_num_unique_strings;
    private IntMapper<lib.zj.office.fc.hssf.record.common.UnicodeString> field_3_strings;

    public SSTRecord() {
        this.field_1_num_strings = 0;
        this.field_2_num_unique_strings = 0;
        IntMapper<lib.zj.office.fc.hssf.record.common.UnicodeString> intMapper = new IntMapper<>();
        this.field_3_strings = intMapper;
        this.deserializer = new SSTDeserializer(intMapper);
    }

    public int addString(lib.zj.office.fc.hssf.record.common.UnicodeString unicodeString) {
        this.field_1_num_strings++;
        if (unicodeString == null) {
            unicodeString = EMPTY_STRING;
        }
        int index = this.field_3_strings.getIndex(unicodeString);
        if (index == -1) {
            int size = this.field_3_strings.size();
            this.field_2_num_unique_strings++;
            SSTDeserializer.addToStringTable(this.field_3_strings, unicodeString);
            return size;
        }
        return index;
    }

    public int calcExtSSTRecordSize() {
        return ExtSSTRecord.getRecordSizeForStrings(this.field_3_strings.size());
    }

    public int countStrings() {
        return this.field_3_strings.size();
    }

    public ExtSSTRecord createExtSSTRecord(int i10) {
        int[] iArr = this.bucketAbsoluteOffsets;
        if (iArr != null && iArr != null) {
            ExtSSTRecord extSSTRecord = new ExtSSTRecord();
            extSSTRecord.setNumStringsPerBucket((short) 8);
            int[] iArr2 = (int[]) this.bucketAbsoluteOffsets.clone();
            int[] iArr3 = (int[]) this.bucketRelativeOffsets.clone();
            for (int i11 = 0; i11 < iArr2.length; i11++) {
                iArr2[i11] = iArr2[i11] + i10;
            }
            extSSTRecord.setBucketOffsets(iArr2, iArr3);
            return extSSTRecord;
        }
        throw new IllegalStateException("SST record has not yet been serialized.");
    }

    public SSTDeserializer getDeserializer() {
        return this.deserializer;
    }

    public int getNumStrings() {
        return this.field_1_num_strings;
    }

    public int getNumUniqueStrings() {
        return this.field_2_num_unique_strings;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return (short) 252;
    }

    public lib.zj.office.fc.hssf.record.common.UnicodeString getString(int i10) {
        return this.field_3_strings.get(i10);
    }

    public Iterator<lib.zj.office.fc.hssf.record.common.UnicodeString> getStrings() {
        return this.field_3_strings.iterator();
    }

    @Override // lib.zj.office.fc.hssf.record.cont.ContinuableRecord
    public void serialize(ContinuableRecordOutput continuableRecordOutput) {
        SSTSerializer sSTSerializer = new SSTSerializer(this.field_3_strings, getNumStrings(), getNumUniqueStrings());
        sSTSerializer.serialize(continuableRecordOutput);
        this.bucketAbsoluteOffsets = sSTSerializer.getBucketAbsoluteOffsets();
        this.bucketRelativeOffsets = sSTSerializer.getBucketRelativeOffsets();
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[SST]\n    .numstrings     = ");
        stringBuffer.append(Integer.toHexString(getNumStrings()));
        stringBuffer.append("\n    .uniquestrings  = ");
        stringBuffer.append(Integer.toHexString(getNumUniqueStrings()));
        stringBuffer.append("\n");
        for (int i10 = 0; i10 < this.field_3_strings.size(); i10++) {
            stringBuffer.append("    .string_" + i10 + "      = ");
            stringBuffer.append(this.field_3_strings.get(i10).getDebugInfo());
            stringBuffer.append("\n");
        }
        stringBuffer.append("[/SST]\n");
        return stringBuffer.toString();
    }

    public SSTRecord(RecordInputStream recordInputStream) {
        this.field_1_num_strings = recordInputStream.readInt();
        this.field_2_num_unique_strings = recordInputStream.readInt();
        IntMapper<lib.zj.office.fc.hssf.record.common.UnicodeString> intMapper = new IntMapper<>();
        this.field_3_strings = intMapper;
        SSTDeserializer sSTDeserializer = new SSTDeserializer(intMapper);
        this.deserializer = sSTDeserializer;
        sSTDeserializer.manufactureStrings(this.field_2_num_unique_strings, recordInputStream);
    }
}

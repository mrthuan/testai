package lib.zj.office.fc.hssf.record;

import lib.zj.office.fc.hssf.record.cont.ContinuableRecordOutput;
import lib.zj.office.fc.util.IntMapper;

/* loaded from: classes3.dex */
final class SSTSerializer {
    private final int _numStrings;
    private final int _numUniqueStrings;
    private final int[] bucketAbsoluteOffsets;
    private final int[] bucketRelativeOffsets;
    private final IntMapper<lib.zj.office.fc.hssf.record.common.UnicodeString> strings;

    public SSTSerializer(IntMapper<lib.zj.office.fc.hssf.record.common.UnicodeString> intMapper, int i10, int i11) {
        this.strings = intMapper;
        this._numStrings = i10;
        this._numUniqueStrings = i11;
        int numberOfInfoRecsForStrings = ExtSSTRecord.getNumberOfInfoRecsForStrings(intMapper.size());
        this.bucketAbsoluteOffsets = new int[numberOfInfoRecsForStrings];
        this.bucketRelativeOffsets = new int[numberOfInfoRecsForStrings];
    }

    private lib.zj.office.fc.hssf.record.common.UnicodeString getUnicodeString(int i10) {
        return getUnicodeString(this.strings, i10);
    }

    public int[] getBucketAbsoluteOffsets() {
        return this.bucketAbsoluteOffsets;
    }

    public int[] getBucketRelativeOffsets() {
        return this.bucketRelativeOffsets;
    }

    public void serialize(ContinuableRecordOutput continuableRecordOutput) {
        continuableRecordOutput.writeInt(this._numStrings);
        continuableRecordOutput.writeInt(this._numUniqueStrings);
        for (int i10 = 0; i10 < this.strings.size(); i10++) {
            if (i10 % 8 == 0) {
                int totalSize = continuableRecordOutput.getTotalSize();
                int i11 = i10 / 8;
                if (i11 < 128) {
                    this.bucketAbsoluteOffsets[i11] = totalSize;
                    this.bucketRelativeOffsets[i11] = totalSize;
                }
            }
            getUnicodeString(i10).serialize(continuableRecordOutput);
        }
    }

    private static lib.zj.office.fc.hssf.record.common.UnicodeString getUnicodeString(IntMapper<lib.zj.office.fc.hssf.record.common.UnicodeString> intMapper, int i10) {
        return intMapper.get(i10);
    }
}

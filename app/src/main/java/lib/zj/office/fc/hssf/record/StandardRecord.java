package lib.zj.office.fc.hssf.record;

import lib.zj.office.fc.util.LittleEndianByteArrayOutputStream;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public abstract class StandardRecord extends Record {
    public abstract int getDataSize();

    @Override // lib.zj.office.fc.hssf.record.RecordBase
    public final int getRecordSize() {
        return getDataSize() + 4;
    }

    @Override // lib.zj.office.fc.hssf.record.RecordBase
    public final int serialize(int i10, byte[] bArr) {
        int dataSize = getDataSize();
        int i11 = dataSize + 4;
        LittleEndianByteArrayOutputStream littleEndianByteArrayOutputStream = new LittleEndianByteArrayOutputStream(bArr, i10, i11);
        littleEndianByteArrayOutputStream.writeShort(getSid());
        littleEndianByteArrayOutputStream.writeShort(dataSize);
        serialize(littleEndianByteArrayOutputStream);
        if (littleEndianByteArrayOutputStream.getWriteIndex() - i10 == i11) {
            return i11;
        }
        throw new IllegalStateException("Error in serialization of (" + getClass().getName() + "): Incorrect number of bytes written - expected " + i11 + " but got " + (littleEndianByteArrayOutputStream.getWriteIndex() - i10));
    }

    public abstract void serialize(LittleEndianOutput littleEndianOutput);
}

package lib.zj.office.fc.util;

import b.a;
import java.io.InputStream;

/* loaded from: classes3.dex */
public class LongField implements FixedField {
    private final int _offset;
    private long _value;

    public LongField(int i10) {
        if (i10 >= 0) {
            this._offset = i10;
            return;
        }
        throw new ArrayIndexOutOfBoundsException(a.c("Illegal offset: ", i10));
    }

    public long get() {
        return this._value;
    }

    @Override // lib.zj.office.fc.util.FixedField
    public void readFromBytes(byte[] bArr) {
        this._value = LittleEndian.getLong(bArr, this._offset);
    }

    @Override // lib.zj.office.fc.util.FixedField
    public void readFromStream(InputStream inputStream) {
        this._value = LittleEndian.readLong(inputStream);
    }

    public void set(long j10) {
        this._value = j10;
    }

    @Override // lib.zj.office.fc.util.FixedField
    public String toString() {
        return String.valueOf(this._value);
    }

    @Override // lib.zj.office.fc.util.FixedField
    public void writeToBytes(byte[] bArr) {
        LittleEndian.putLong(bArr, this._offset, this._value);
    }

    public void set(long j10, byte[] bArr) {
        this._value = j10;
        writeToBytes(bArr);
    }

    public LongField(int i10, long j10) {
        this(i10);
        set(j10);
    }

    public LongField(int i10, byte[] bArr) {
        this(i10);
        readFromBytes(bArr);
    }

    public LongField(int i10, long j10, byte[] bArr) {
        this(i10);
        set(j10, bArr);
    }
}

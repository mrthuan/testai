package lib.zj.office.fc.util;

import java.io.InputStream;

/* loaded from: classes3.dex */
public class IntegerField implements FixedField {
    private final int _offset;
    private int _value;

    public IntegerField(int i10) {
        if (i10 >= 0) {
            this._offset = i10;
            return;
        }
        throw new ArrayIndexOutOfBoundsException("negative offset");
    }

    public int get() {
        return this._value;
    }

    @Override // lib.zj.office.fc.util.FixedField
    public void readFromBytes(byte[] bArr) {
        this._value = LittleEndian.getInt(bArr, this._offset);
    }

    @Override // lib.zj.office.fc.util.FixedField
    public void readFromStream(InputStream inputStream) {
        this._value = LittleEndian.readInt(inputStream);
    }

    public void set(int i10) {
        this._value = i10;
    }

    @Override // lib.zj.office.fc.util.FixedField
    public String toString() {
        return String.valueOf(this._value);
    }

    @Override // lib.zj.office.fc.util.FixedField
    public void writeToBytes(byte[] bArr) {
        LittleEndian.putInt(bArr, this._offset, this._value);
    }

    public void set(int i10, byte[] bArr) {
        this._value = i10;
        writeToBytes(bArr);
    }

    public IntegerField(int i10, int i11) {
        this(i10);
        set(i11);
    }

    public IntegerField(int i10, byte[] bArr) {
        this(i10);
        readFromBytes(bArr);
    }

    public IntegerField(int i10, int i11, byte[] bArr) {
        this(i10);
        set(i11, bArr);
    }
}

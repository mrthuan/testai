package lib.zj.office.fc.util;

import b.a;
import java.io.InputStream;

/* loaded from: classes3.dex */
public class ShortField implements FixedField {
    private final int _offset;
    private short _value;

    public ShortField(int i10) {
        if (i10 >= 0) {
            this._offset = i10;
            return;
        }
        throw new ArrayIndexOutOfBoundsException(a.c("Illegal offset: ", i10));
    }

    public short get() {
        return this._value;
    }

    @Override // lib.zj.office.fc.util.FixedField
    public void readFromBytes(byte[] bArr) {
        this._value = LittleEndian.getShort(bArr, this._offset);
    }

    @Override // lib.zj.office.fc.util.FixedField
    public void readFromStream(InputStream inputStream) {
        this._value = LittleEndian.readShort(inputStream);
    }

    public void set(short s4) {
        this._value = s4;
    }

    @Override // lib.zj.office.fc.util.FixedField
    public String toString() {
        return String.valueOf((int) this._value);
    }

    @Override // lib.zj.office.fc.util.FixedField
    public void writeToBytes(byte[] bArr) {
        LittleEndian.putShort(bArr, this._offset, this._value);
    }

    public void set(short s4, byte[] bArr) {
        this._value = s4;
        writeToBytes(bArr);
    }

    public ShortField(int i10, short s4) {
        this(i10);
        set(s4);
    }

    public ShortField(int i10, byte[] bArr) {
        this(i10);
        readFromBytes(bArr);
    }

    public ShortField(int i10, short s4, byte[] bArr) {
        this(i10);
        set(s4, bArr);
    }
}

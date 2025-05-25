package lib.zj.office.fc.util;

import java.io.InputStream;
import java.nio.BufferUnderflowException;

/* loaded from: classes3.dex */
public class ByteField implements FixedField {
    private static final byte _default_value = 0;
    private final int _offset;
    private byte _value;

    public ByteField(int i10) {
        this(i10, (byte) 0);
    }

    public byte get() {
        return this._value;
    }

    @Override // lib.zj.office.fc.util.FixedField
    public void readFromBytes(byte[] bArr) {
        this._value = bArr[this._offset];
    }

    @Override // lib.zj.office.fc.util.FixedField
    public void readFromStream(InputStream inputStream) {
        int read = inputStream.read();
        if (read >= 0) {
            this._value = (byte) read;
            return;
        }
        throw new BufferUnderflowException();
    }

    public void set(byte b10) {
        this._value = b10;
    }

    @Override // lib.zj.office.fc.util.FixedField
    public String toString() {
        return String.valueOf((int) this._value);
    }

    @Override // lib.zj.office.fc.util.FixedField
    public void writeToBytes(byte[] bArr) {
        bArr[this._offset] = this._value;
    }

    public ByteField(int i10, byte b10) {
        if (i10 >= 0) {
            this._offset = i10;
            set(b10);
            return;
        }
        throw new ArrayIndexOutOfBoundsException("offset cannot be negative");
    }

    public void set(byte b10, byte[] bArr) {
        set(b10);
        writeToBytes(bArr);
    }

    public ByteField(int i10, byte[] bArr) {
        this(i10);
        readFromBytes(bArr);
    }

    public ByteField(int i10, byte b10, byte[] bArr) {
        this(i10, b10);
        writeToBytes(bArr);
    }
}

package yi;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

/* compiled from: ByteOrderInputStream.java */
/* loaded from: classes3.dex */
public class a extends b implements DataInput {

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f32151e = new int[8];

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f32152f = new int[8];

    /* renamed from: d  reason: collision with root package name */
    public final boolean f32153d;

    static {
        int i10 = 1;
        int i11 = 1;
        for (int i12 = 0; i12 < 8; i12++) {
            f32151e[i12] = i10;
            f32152f[i12] = i11;
            i10 <<= 1;
            i11 = (i11 << 1) + 1;
        }
    }

    public a(FileInputStream fileInputStream) {
        super(fileInputStream);
        this.f32153d = true;
    }

    public final byte[] b(int i10) {
        byte[] bArr = new byte[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            int read = ((e) this).read();
            if (read >= 0) {
                bArr[i11] = (byte) read;
            } else {
                throw new EOFException();
            }
        }
        return bArr;
    }

    public final int[] c(int i10) {
        int[] iArr = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            int read = ((e) this).read();
            if (read >= 0) {
                iArr[i11] = read;
            } else {
                throw new EOFException();
            }
        }
        return iArr;
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        if (readUnsignedByte() != 0) {
            return true;
        }
        return false;
    }

    @Override // java.io.DataInput
    public final byte readByte() {
        int read = ((e) this).read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final char readChar() {
        int readUnsignedByte = readUnsignedByte();
        int readUnsignedByte2 = readUnsignedByte();
        if (this.f32153d) {
            return (char) ((readUnsignedByte << 8) + readUnsignedByte2);
        }
        return (char) ((readUnsignedByte2 << 8) + readUnsignedByte);
    }

    @Override // java.io.DataInput
    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i10, int i11) {
        if (i11 < 0) {
            throw new IndexOutOfBoundsException();
        }
        int i12 = 0;
        while (i12 < i11) {
            int read = read(bArr, i10 + i12, i11 - i12);
            if (read < 0) {
                throw new EOFException();
            }
            i12 += read;
        }
    }

    @Override // java.io.DataInput
    public final int readInt() {
        int readUnsignedByte = readUnsignedByte();
        int readUnsignedByte2 = readUnsignedByte();
        int readUnsignedByte3 = readUnsignedByte();
        int readUnsignedByte4 = readUnsignedByte();
        if (this.f32153d) {
            return (readUnsignedByte4 << 24) + (readUnsignedByte3 << 16) + (readUnsignedByte2 << 8) + readUnsignedByte;
        }
        return readUnsignedByte4 + (readUnsignedByte << 24) + (readUnsignedByte2 << 16) + (readUnsignedByte3 << 8);
    }

    @Override // java.io.DataInput
    public final String readLine() {
        throw new IOException("ByteOrderInputStream.readLine() is deprecated and not implemented.");
    }

    @Override // java.io.DataInput
    public final long readLong() {
        long readInt = readInt();
        long readInt2 = readInt();
        if (this.f32153d) {
            return (readInt2 << 32) + (readInt & 4294967295L);
        }
        return (readInt2 & 4294967295L) + (readInt << 32);
    }

    @Override // java.io.DataInput
    public final short readShort() {
        int readUnsignedByte = readUnsignedByte();
        int readUnsignedByte2 = readUnsignedByte();
        if (this.f32153d) {
            return (short) ((readUnsignedByte2 << 8) + readUnsignedByte);
        }
        return (short) ((readUnsignedByte << 8) + readUnsignedByte2);
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        return DataInputStream.readUTF(this);
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        int read = ((e) this).read();
        if (read >= 0) {
            return read;
        }
        throw new EOFException();
    }

    public final long readUnsignedInt() {
        long readUnsignedByte = readUnsignedByte();
        long readUnsignedByte2 = readUnsignedByte();
        long readUnsignedByte3 = readUnsignedByte();
        long readUnsignedByte4 = readUnsignedByte();
        if (this.f32153d) {
            return (readUnsignedByte4 << 24) + (readUnsignedByte3 << 16) + (readUnsignedByte2 << 8) + readUnsignedByte;
        }
        return readUnsignedByte4 + (readUnsignedByte << 24) + (readUnsignedByte2 << 16) + (readUnsignedByte3 << 8);
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() {
        int readUnsignedByte = readUnsignedByte();
        int readUnsignedByte2 = readUnsignedByte();
        if (this.f32153d) {
            return (readUnsignedByte2 << 8) + readUnsignedByte;
        }
        return readUnsignedByte2 + (readUnsignedByte << 8);
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i10) {
        int i11 = 0;
        while (i11 < i10) {
            long j10 = i10 - i11;
            skip(j10);
            int i12 = (int) j10;
            if (i12 <= 0) {
                break;
            }
            i11 += i12;
        }
        return i11;
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) {
        readFully(bArr, 0, bArr.length);
    }
}

package lib.zj.office.fc.util;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
public class LittleEndianInputStream extends FilterInputStream implements LittleEndianInput {
    public LittleEndianInputStream(InputStream inputStream) {
        super(inputStream);
    }

    private static void checkEOF(int i10) {
        if (i10 >= 0) {
            return;
        }
        throw new RuntimeException("Unexpected end-of-file");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, lib.zj.office.fc.util.LittleEndianInput
    public int available() {
        try {
            return super.available();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // lib.zj.office.fc.util.LittleEndianInput
    public byte readByte() {
        return (byte) readUByte();
    }

    @Override // lib.zj.office.fc.util.LittleEndianInput
    public double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override // lib.zj.office.fc.util.LittleEndianInput
    public void readFully(byte[] bArr) {
        readFully(bArr, 0, bArr.length);
    }

    @Override // lib.zj.office.fc.util.LittleEndianInput
    public int readInt() {
        try {
            int read = ((FilterInputStream) this).in.read();
            int read2 = ((FilterInputStream) this).in.read();
            int read3 = ((FilterInputStream) this).in.read();
            int read4 = ((FilterInputStream) this).in.read();
            checkEOF(read | read2 | read3 | read4);
            return (read4 << 24) + (read3 << 16) + (read2 << 8) + (read << 0);
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // lib.zj.office.fc.util.LittleEndianInput
    public long readLong() {
        try {
            int read = ((FilterInputStream) this).in.read();
            int read2 = ((FilterInputStream) this).in.read();
            int read3 = ((FilterInputStream) this).in.read();
            int read4 = ((FilterInputStream) this).in.read();
            int read5 = ((FilterInputStream) this).in.read();
            int read6 = ((FilterInputStream) this).in.read();
            int read7 = ((FilterInputStream) this).in.read();
            int read8 = ((FilterInputStream) this).in.read();
            checkEOF(read | read2 | read3 | read4 | read5 | read6 | read7 | read8);
            return (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8) + (read << 0);
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // lib.zj.office.fc.util.LittleEndianInput
    public short readShort() {
        return (short) readUShort();
    }

    @Override // lib.zj.office.fc.util.LittleEndianInput
    public int readUByte() {
        try {
            int read = ((FilterInputStream) this).in.read();
            checkEOF(read);
            return read;
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // lib.zj.office.fc.util.LittleEndianInput
    public int readUShort() {
        try {
            int read = ((FilterInputStream) this).in.read();
            int read2 = ((FilterInputStream) this).in.read();
            checkEOF(read | read2);
            return (read2 << 8) + (read << 0);
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // lib.zj.office.fc.util.LittleEndianInput
    public void readFully(byte[] bArr, int i10, int i11) {
        int i12 = i11 + i10;
        while (i10 < i12) {
            try {
                int read = ((FilterInputStream) this).in.read();
                checkEOF(read);
                bArr[i10] = (byte) read;
                i10++;
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        }
    }
}

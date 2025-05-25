package com.tom_roush.fontbox.ttf;

import com.tom_roush.fontbox.util.Charsets;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Calendar;
import java.util.TimeZone;

/* loaded from: classes2.dex */
abstract class TTFDataStream implements Closeable {
    public abstract long getCurrentPosition();

    public abstract InputStream getOriginalData();

    public abstract long getOriginalDataSize();

    public abstract int read();

    public abstract int read(byte[] bArr, int i10, int i11);

    public byte[] read(int i10) {
        byte[] bArr = new byte[i10];
        int i11 = 0;
        while (i11 < i10) {
            int read = read(bArr, i11, i10 - i11);
            if (read == -1) {
                break;
            }
            i11 += read;
        }
        if (i11 == i10) {
            return bArr;
        }
        throw new IOException("Unexpected end of TTF stream reached");
    }

    public float read32Fixed() {
        return (float) ((readUnsignedShort() / 65536.0d) + readSignedShort());
    }

    public Calendar readInternationalDate() {
        long readLong = readLong();
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        calendar.set(1904, 0, 1, 0, 0, 0);
        calendar.set(14, 0);
        calendar.setTimeInMillis((readLong * 1000) + calendar.getTimeInMillis());
        return calendar;
    }

    public abstract long readLong();

    public int readSignedByte() {
        int read = read();
        if (read > 127) {
            return read - 256;
        }
        return read;
    }

    public abstract short readSignedShort();

    public String readString(int i10) {
        return readString(i10, Charsets.ISO_8859_1);
    }

    public String readTag() {
        return new String(read(4), Charsets.US_ASCII);
    }

    public int readUnsignedByte() {
        int read = read();
        if (read != -1) {
            return read;
        }
        throw new EOFException("premature EOF");
    }

    public int[] readUnsignedByteArray(int i10) {
        int[] iArr = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            iArr[i11] = read();
        }
        return iArr;
    }

    public long readUnsignedInt() {
        long read = read();
        long read2 = read();
        long read3 = read();
        long read4 = read();
        if (read4 >= 0) {
            return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
        }
        throw new EOFException();
    }

    public abstract int readUnsignedShort();

    public int[] readUnsignedShortArray(int i10) {
        int[] iArr = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            iArr[i11] = readUnsignedShort();
        }
        return iArr;
    }

    public abstract void seek(long j10);

    public String readString(int i10, String str) {
        return new String(read(i10), str);
    }

    public String readString(int i10, Charset charset) {
        return new String(read(i10), charset);
    }
}

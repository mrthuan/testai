package com.tom_roush.harmony.javax.imageio.stream;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class RandomAccessMemoryCache {
    private static final int BLOCK_MASK = 511;
    private static final int BLOCK_SHIFT = 9;
    private static final int BLOCK_SIZE = 512;
    private long length;
    private int firstUndisposed = 0;
    private ArrayList<byte[]> blocks = new ArrayList<>();

    private void grow(long j10) {
        int size = (((int) (j10 >> 9)) - this.blocks.size()) + 1;
        for (int i10 = 0; i10 < size; i10++) {
            this.blocks.add(new byte[512]);
        }
        this.length = j10 + 1;
    }

    public int appendData(InputStream inputStream, int i10) {
        if (i10 <= 0) {
            return 0;
        }
        long j10 = this.length;
        grow((i10 + j10) - 1);
        int i11 = (int) (j10 >> 9);
        int i12 = (int) (j10 & 511);
        int i13 = 0;
        while (i10 > 0) {
            byte[] bArr = this.blocks.get(i11);
            int min = Math.min(512 - i12, i10);
            i10 -= min;
            i13 += min;
            while (min > 0) {
                int read = inputStream.read(bArr, i12, min);
                if (read < 0) {
                    this.length -= i10 - i13;
                    return i13;
                }
                min -= read;
                i12 += read;
            }
            i11++;
            i12 = 0;
        }
        return i13;
    }

    public void close() {
        this.blocks.clear();
        this.length = 0L;
    }

    public void freeBefore(long j10) {
        int i10 = (int) (j10 >> 9);
        int i11 = this.firstUndisposed;
        if (i10 <= i11) {
            return;
        }
        while (i11 < i10) {
            this.blocks.set(i11, null);
            i11++;
        }
        this.firstUndisposed = i10;
    }

    public int getData(long j10) {
        if (j10 >= this.length) {
            return -1;
        }
        return this.blocks.get((int) (j10 >> 9))[(int) (j10 & 511)] & 255;
    }

    public long length() {
        return this.length;
    }

    public void putData(int i10, long j10) {
        if (j10 >= this.length) {
            grow(j10);
        }
        this.blocks.get((int) (j10 >> 9))[(int) (j10 & 511)] = (byte) i10;
    }

    public int getData(byte[] bArr, int i10, int i11, long j10) {
        if (i11 > bArr.length - i10 || i11 < 0 || i10 < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (i11 == 0) {
            return 0;
        }
        long j11 = this.length;
        if (j10 >= j11) {
            return -1;
        }
        if (i11 + j10 > j11) {
            i11 = (int) (j11 - j10);
        }
        int i12 = (int) (j10 & 511);
        int min = Math.min(i11, 512 - i12);
        System.arraycopy(this.blocks.get((int) (j10 >> 9)), i12, bArr, i10, min);
        return min;
    }

    public void putData(byte[] bArr, int i10, int i11, long j10) {
        if (i11 > bArr.length - i10 || i11 < 0 || i10 < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (i11 == 0) {
            return;
        }
        long j11 = (i11 + j10) - 1;
        if (j11 >= this.length) {
            grow(j11);
        }
        while (i11 > 0) {
            int i12 = (int) (511 & j10);
            int min = Math.min(512 - i12, i11);
            System.arraycopy(bArr, i10, this.blocks.get((int) (j10 >> 9)), i12, min);
            j10 += min;
            i11 -= min;
            i10 += min;
        }
    }

    public void getData(OutputStream outputStream, int i10, long j10) {
        if (i10 + j10 <= this.length) {
            int i11 = (int) (j10 >> 9);
            int i12 = (int) (j10 & 511);
            if (i11 < this.firstUndisposed) {
                throw new IndexOutOfBoundsException("The requested data are already disposed");
            }
            while (i10 > 0) {
                int min = Math.min(512 - i12, i10);
                outputStream.write(this.blocks.get(i11), i12, min);
                i11++;
                i10 -= min;
                i12 = 0;
            }
            return;
        }
        throw new IndexOutOfBoundsException("Argument out of cache");
    }
}

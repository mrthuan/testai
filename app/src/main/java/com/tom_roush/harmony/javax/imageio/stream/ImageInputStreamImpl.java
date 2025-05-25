package com.tom_roush.harmony.javax.imageio.stream;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteOrder;

/* loaded from: classes2.dex */
public abstract class ImageInputStreamImpl implements ImageInputStream {
    int currentByte;
    protected ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
    protected long streamPos = 0;
    protected long flushedPos = 0;
    protected int bitOffset = 0;
    private boolean closed = false;
    private final PositionStack posStack = new PositionStack(0);
    private final PositionStack offsetStack = new PositionStack(0);
    private final byte[] buff = new byte[8];

    /* loaded from: classes2.dex */
    public static class PositionStack {
        private static final int SIZE = 10;
        private int pos;
        private long[] values;

        public /* synthetic */ PositionStack(int i10) {
            this();
        }

        private void ensure(int i10) {
            long[] jArr = new long[Math.max(this.values.length * 2, i10)];
            long[] jArr2 = this.values;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            this.values = jArr;
        }

        public boolean isEmpty() {
            if (this.pos == 0) {
                return true;
            }
            return false;
        }

        public long pop() {
            long[] jArr = this.values;
            int i10 = this.pos - 1;
            this.pos = i10;
            return jArr[i10];
        }

        public void push(long j10) {
            int i10 = this.pos;
            if (i10 >= this.values.length) {
                ensure(i10 + 1);
            }
            long[] jArr = this.values;
            int i11 = this.pos;
            this.pos = i11 + 1;
            jArr[i11] = j10;
        }

        private PositionStack() {
            this.values = new long[10];
            this.pos = 0;
        }
    }

    public final void checkClosed() {
        if (!this.closed) {
            return;
        }
        throw new IOException("stream is closed");
    }

    @Override // com.tom_roush.harmony.javax.imageio.stream.ImageInputStream
    public void close() {
        checkClosed();
        this.closed = true;
    }

    public void finalize() {
        if (!this.closed) {
            try {
                close();
            } finally {
                super.finalize();
            }
        }
    }

    @Override // com.tom_roush.harmony.javax.imageio.stream.ImageInputStream
    public void flush() {
        flushBefore(getStreamPosition());
    }

    @Override // com.tom_roush.harmony.javax.imageio.stream.ImageInputStream
    public void flushBefore(long j10) {
        if (j10 <= getStreamPosition()) {
            if (j10 >= this.flushedPos) {
                this.flushedPos = j10;
                return;
            }
            throw new IndexOutOfBoundsException("Trying to flush within already flushed portion");
        }
        throw new IndexOutOfBoundsException("Trying to flush outside of current position");
    }

    @Override // com.tom_roush.harmony.javax.imageio.stream.ImageInputStream
    public int getBitOffset() {
        checkClosed();
        return this.bitOffset;
    }

    @Override // com.tom_roush.harmony.javax.imageio.stream.ImageInputStream
    public ByteOrder getByteOrder() {
        return this.byteOrder;
    }

    @Override // com.tom_roush.harmony.javax.imageio.stream.ImageInputStream
    public long getFlushedPosition() {
        return this.flushedPos;
    }

    @Override // com.tom_roush.harmony.javax.imageio.stream.ImageInputStream
    public long getStreamPosition() {
        checkClosed();
        return this.streamPos;
    }

    @Override // com.tom_roush.harmony.javax.imageio.stream.ImageInputStream
    public boolean isCached() {
        return false;
    }

    @Override // com.tom_roush.harmony.javax.imageio.stream.ImageInputStream
    public boolean isCachedFile() {
        return false;
    }

    @Override // com.tom_roush.harmony.javax.imageio.stream.ImageInputStream
    public boolean isCachedMemory() {
        return false;
    }

    @Override // com.tom_roush.harmony.javax.imageio.stream.ImageInputStream
    public long length() {
        return -1L;
    }

    @Override // com.tom_roush.harmony.javax.imageio.stream.ImageInputStream
    public void mark() {
        try {
            this.posStack.push(getStreamPosition());
            this.offsetStack.push(getBitOffset());
        } catch (IOException e10) {
            e10.printStackTrace();
            throw new RuntimeException("Stream marking error");
        }
    }

    @Override // com.tom_roush.harmony.javax.imageio.stream.ImageInputStream
    public abstract int read();

    @Override // com.tom_roush.harmony.javax.imageio.stream.ImageInputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // com.tom_roush.harmony.javax.imageio.stream.ImageInputStream
    public abstract int read(byte[] bArr, int i10, int i11);

    @Override // com.tom_roush.harmony.javax.imageio.stream.ImageInputStream
    public int readBit() {
        checkClosed();
        int i10 = this.bitOffset;
        int read = read();
        if (read != -1) {
            int i11 = (i10 + 1) & 7;
            if (i11 != 0) {
                read >>= 8 - i11;
                seek(getStreamPosition() - 1);
            }
            this.bitOffset = i11;
            return read & 1;
        }
        throw new EOFException();
    }

    @Override // com.tom_roush.harmony.javax.imageio.stream.ImageInputStream
    public long readBits(int i10) {
        checkClosed();
        if (i10 >= 0 && i10 <= 64) {
            long j10 = 0;
            for (int i11 = 0; i11 < i10; i11++) {
                j10 = (j10 << 1) | readBit();
            }
            return j10;
        }
        throw new IllegalArgumentException();
    }

    @Override // com.tom_roush.harmony.javax.imageio.stream.ImageInputStream, java.io.DataInput
    public boolean readBoolean() {
        int read = read();
        if (read >= 0) {
            if (read != 0) {
                return true;
            }
            return false;
        }
        throw new EOFException("EOF reached");
    }

    @Override // com.tom_roush.harmony.javax.imageio.stream.ImageInputStream, java.io.DataInput
    public byte readByte() {
        int read = read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new EOFException("EOF reached");
    }

    @Override // com.tom_roush.harmony.javax.imageio.stream.ImageInputStream
    public void readBytes(IIOByteBuffer iIOByteBuffer, int i10) {
        if (iIOByteBuffer != null) {
            byte[] bArr = new byte[i10];
            int read = read(bArr, 0, i10);
            iIOByteBuffer.setData(bArr);
            iIOByteBuffer.setOffset(0);
            iIOByteBuffer.setLength(read);
            return;
        }
        throw new NullPointerException("buffer is NULL");
    }

    @Override // com.tom_roush.harmony.javax.imageio.stream.ImageInputStream, java.io.DataInput
    public char readChar() {
        return (char) readShort();
    }

    @Override // com.tom_roush.harmony.javax.imageio.stream.ImageInputStream, java.io.DataInput
    public double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override // com.tom_roush.harmony.javax.imageio.stream.ImageInputStream, java.io.DataInput
    public float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    @Override // com.tom_roush.harmony.javax.imageio.stream.ImageInputStream, java.io.DataInput
    public void readFully(byte[] bArr, int i10, int i11) {
        if (i10 < 0 || i11 < 0 || i10 + i11 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        while (i11 > 0) {
            int read = read(bArr, i10, i11);
            if (read == -1) {
                throw new EOFException();
            }
            i10 += read;
            i11 -= read;
        }
    }

    @Override // com.tom_roush.harmony.javax.imageio.stream.ImageInputStream, java.io.DataInput
    public int readInt() {
        int i10;
        byte b10;
        if (read(this.buff, 0, 4) >= 0) {
            if (this.byteOrder == ByteOrder.BIG_ENDIAN) {
                byte[] bArr = this.buff;
                i10 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8);
                b10 = bArr[3];
            } else {
                byte[] bArr2 = this.buff;
                i10 = ((bArr2[3] & 255) << 24) | ((bArr2[2] & 255) << 16) | ((bArr2[1] & 255) << 8);
                b10 = bArr2[0];
            }
            return (b10 & 255) | i10;
        }
        throw new EOFException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
        r1 = false;
     */
    @Override // com.tom_roush.harmony.javax.imageio.stream.ImageInputStream, java.io.DataInput
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String readLine() {
        /*
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 80
            r0.<init>(r1)
            r1 = 1
        L8:
            int r2 = r7.read()
            r3 = -1
            if (r2 == r3) goto L33
            r1 = 10
            r4 = 0
            if (r2 != r1) goto L15
            goto L2b
        L15:
            r5 = 13
            if (r2 != r5) goto L2d
            int r2 = r7.read()
            if (r2 == r1) goto L2b
            if (r2 == r3) goto L2b
            long r1 = r7.getStreamPosition()
            r5 = 1
            long r1 = r1 - r5
            r7.seek(r1)
        L2b:
            r1 = r4
            goto L33
        L2d:
            char r1 = (char) r2
            r0.append(r1)
            r1 = r4
            goto L8
        L33:
            if (r1 == 0) goto L37
            r0 = 0
            goto L3b
        L37:
            java.lang.String r0 = r0.toString()
        L3b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tom_roush.harmony.javax.imageio.stream.ImageInputStreamImpl.readLine():java.lang.String");
    }

    @Override // com.tom_roush.harmony.javax.imageio.stream.ImageInputStream, java.io.DataInput
    public long readLong() {
        if (read(this.buff, 0, 8) >= 0) {
            if (this.byteOrder == ByteOrder.BIG_ENDIAN) {
                byte[] bArr = this.buff;
                int i10 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                int i11 = ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16);
                return ((i10 & 4294967295L) << 32) | (((bArr[7] & 255) | ((bArr[6] & 255) << 8) | i11) & 4294967295L);
            }
            byte[] bArr2 = this.buff;
            int i12 = (bArr2[0] & 255) | ((bArr2[3] & 255) << 24) | ((bArr2[2] & 255) << 16) | ((bArr2[1] & 255) << 8);
            int i13 = (bArr2[5] & 255) << 8;
            int i14 = bArr2[4] & 255;
            return (i12 & 4294967295L) | (((i14 | (i13 | (((bArr2[7] & 255) << 24) | ((bArr2[6] & 255) << 16)))) & 4294967295L) << 32);
        }
        throw new EOFException();
    }

    @Override // com.tom_roush.harmony.javax.imageio.stream.ImageInputStream, java.io.DataInput
    public short readShort() {
        int i10;
        byte b10;
        if (read(this.buff, 0, 2) >= 0) {
            if (this.byteOrder == ByteOrder.BIG_ENDIAN) {
                byte[] bArr = this.buff;
                i10 = bArr[0] << 8;
                b10 = bArr[1];
            } else {
                byte[] bArr2 = this.buff;
                i10 = bArr2[1] << 8;
                b10 = bArr2[0];
            }
            return (short) ((b10 & 255) | i10);
        }
        throw new EOFException();
    }

    @Override // com.tom_roush.harmony.javax.imageio.stream.ImageInputStream, java.io.DataInput
    public String readUTF() {
        ByteOrder byteOrder = getByteOrder();
        setByteOrder(ByteOrder.BIG_ENDIAN);
        int readUnsignedShort = readUnsignedShort();
        char[] cArr = new char[readUnsignedShort];
        readFully(new byte[readUnsignedShort], 0, readUnsignedShort);
        setByteOrder(byteOrder);
        return new DataInputStream(new ByteArrayInputStream(this.buff)).readUTF();
    }

    @Override // com.tom_roush.harmony.javax.imageio.stream.ImageInputStream, java.io.DataInput
    public int readUnsignedByte() {
        int read = read();
        if (read >= 0) {
            return read;
        }
        throw new EOFException("EOF reached");
    }

    @Override // com.tom_roush.harmony.javax.imageio.stream.ImageInputStream
    public long readUnsignedInt() {
        return readInt() & 4294967295L;
    }

    @Override // com.tom_roush.harmony.javax.imageio.stream.ImageInputStream, java.io.DataInput
    public int readUnsignedShort() {
        return readShort() & 65535;
    }

    @Override // com.tom_roush.harmony.javax.imageio.stream.ImageInputStream
    public void reset() {
        if (!this.posStack.isEmpty() && !this.offsetStack.isEmpty()) {
            long pop = this.posStack.pop();
            if (pop >= this.flushedPos) {
                seek(pop);
                setBitOffset((int) this.offsetStack.pop());
                return;
            }
            throw new IOException("marked position lies in the flushed portion of the stream");
        }
    }

    @Override // com.tom_roush.harmony.javax.imageio.stream.ImageInputStream
    public void seek(long j10) {
        checkClosed();
        if (j10 >= getFlushedPosition()) {
            this.bitOffset = 0;
            this.streamPos = j10;
            return;
        }
        throw new IllegalArgumentException("trying to seek before flushed pos");
    }

    @Override // com.tom_roush.harmony.javax.imageio.stream.ImageInputStream
    public void setBitOffset(int i10) {
        checkClosed();
        if (i10 >= 0 && i10 <= 7) {
            this.bitOffset = i10;
            return;
        }
        throw new IllegalArgumentException();
    }

    @Override // com.tom_roush.harmony.javax.imageio.stream.ImageInputStream
    public void setByteOrder(ByteOrder byteOrder) {
        this.byteOrder = byteOrder;
    }

    @Override // com.tom_roush.harmony.javax.imageio.stream.ImageInputStream, java.io.DataInput
    public int skipBytes(int i10) {
        return (int) skipBytes(i10);
    }

    @Override // com.tom_roush.harmony.javax.imageio.stream.ImageInputStream
    public long skipBytes(long j10) {
        seek(getStreamPosition() + j10);
        return j10;
    }

    @Override // com.tom_roush.harmony.javax.imageio.stream.ImageInputStream, java.io.DataInput
    public void readFully(byte[] bArr) {
        readFully(bArr, 0, bArr.length);
    }

    @Override // com.tom_roush.harmony.javax.imageio.stream.ImageInputStream
    public void readFully(short[] sArr, int i10, int i11) {
        if (i10 < 0 || i11 < 0 || i10 + i11 > sArr.length) {
            throw new IndexOutOfBoundsException();
        }
        for (int i12 = 0; i12 < i11; i12++) {
            sArr[i10 + i12] = readShort();
        }
    }

    @Override // com.tom_roush.harmony.javax.imageio.stream.ImageInputStream
    public void readFully(char[] cArr, int i10, int i11) {
        if (i10 < 0 || i11 < 0 || i10 + i11 > cArr.length) {
            throw new IndexOutOfBoundsException();
        }
        for (int i12 = 0; i12 < i11; i12++) {
            cArr[i10 + i12] = readChar();
        }
    }

    @Override // com.tom_roush.harmony.javax.imageio.stream.ImageInputStream
    public void readFully(int[] iArr, int i10, int i11) {
        if (i10 < 0 || i11 < 0 || i10 + i11 > iArr.length) {
            throw new IndexOutOfBoundsException();
        }
        for (int i12 = 0; i12 < i11; i12++) {
            iArr[i10 + i12] = readInt();
        }
    }

    @Override // com.tom_roush.harmony.javax.imageio.stream.ImageInputStream
    public void readFully(long[] jArr, int i10, int i11) {
        if (i10 < 0 || i11 < 0 || i10 + i11 > jArr.length) {
            throw new IndexOutOfBoundsException();
        }
        for (int i12 = 0; i12 < i11; i12++) {
            jArr[i10 + i12] = readLong();
        }
    }

    @Override // com.tom_roush.harmony.javax.imageio.stream.ImageInputStream
    public void readFully(float[] fArr, int i10, int i11) {
        if (i10 < 0 || i11 < 0 || i10 + i11 > fArr.length) {
            throw new IndexOutOfBoundsException();
        }
        for (int i12 = 0; i12 < i11; i12++) {
            fArr[i10 + i12] = readFloat();
        }
    }

    @Override // com.tom_roush.harmony.javax.imageio.stream.ImageInputStream
    public void readFully(double[] dArr, int i10, int i11) {
        if (i10 < 0 || i11 < 0 || i10 + i11 > dArr.length) {
            throw new IndexOutOfBoundsException();
        }
        for (int i12 = 0; i12 < i11; i12++) {
            dArr[i10 + i12] = readFloat();
        }
    }
}

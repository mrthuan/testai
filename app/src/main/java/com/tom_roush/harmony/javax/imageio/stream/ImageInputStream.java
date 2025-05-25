package com.tom_roush.harmony.javax.imageio.stream;

import java.io.DataInput;
import java.nio.ByteOrder;

/* loaded from: classes2.dex */
public interface ImageInputStream extends DataInput {
    void close();

    void flush();

    void flushBefore(long j10);

    int getBitOffset();

    ByteOrder getByteOrder();

    long getFlushedPosition();

    long getStreamPosition();

    boolean isCached();

    boolean isCachedFile();

    boolean isCachedMemory();

    long length();

    void mark();

    int read();

    int read(byte[] bArr);

    int read(byte[] bArr, int i10, int i11);

    int readBit();

    long readBits(int i10);

    @Override // java.io.DataInput
    boolean readBoolean();

    @Override // java.io.DataInput
    byte readByte();

    void readBytes(IIOByteBuffer iIOByteBuffer, int i10);

    @Override // java.io.DataInput
    char readChar();

    @Override // java.io.DataInput
    double readDouble();

    @Override // java.io.DataInput
    float readFloat();

    @Override // java.io.DataInput
    void readFully(byte[] bArr);

    @Override // java.io.DataInput
    void readFully(byte[] bArr, int i10, int i11);

    void readFully(char[] cArr, int i10, int i11);

    void readFully(double[] dArr, int i10, int i11);

    void readFully(float[] fArr, int i10, int i11);

    void readFully(int[] iArr, int i10, int i11);

    void readFully(long[] jArr, int i10, int i11);

    void readFully(short[] sArr, int i10, int i11);

    @Override // java.io.DataInput
    int readInt();

    @Override // java.io.DataInput
    String readLine();

    @Override // java.io.DataInput
    long readLong();

    @Override // java.io.DataInput
    short readShort();

    @Override // java.io.DataInput
    String readUTF();

    @Override // java.io.DataInput
    int readUnsignedByte();

    long readUnsignedInt();

    @Override // java.io.DataInput
    int readUnsignedShort();

    void reset();

    void seek(long j10);

    void setBitOffset(int i10);

    void setByteOrder(ByteOrder byteOrder);

    @Override // java.io.DataInput
    int skipBytes(int i10);

    long skipBytes(long j10);
}

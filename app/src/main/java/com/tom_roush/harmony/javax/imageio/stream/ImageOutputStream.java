package com.tom_roush.harmony.javax.imageio.stream;

import java.io.DataOutput;

/* loaded from: classes2.dex */
public interface ImageOutputStream extends DataOutput, ImageInputStream {
    @Override // com.tom_roush.harmony.javax.imageio.stream.ImageInputStream
    void flushBefore(long j10);

    @Override // java.io.DataOutput
    void write(int i10);

    @Override // java.io.DataOutput
    void write(byte[] bArr);

    @Override // java.io.DataOutput
    void write(byte[] bArr, int i10, int i11);

    void writeBit(int i10);

    void writeBits(long j10, int i10);

    @Override // java.io.DataOutput
    void writeBoolean(boolean z10);

    @Override // java.io.DataOutput
    void writeByte(int i10);

    @Override // java.io.DataOutput
    void writeBytes(String str);

    @Override // java.io.DataOutput
    void writeChar(int i10);

    @Override // java.io.DataOutput
    void writeChars(String str);

    void writeChars(char[] cArr, int i10, int i11);

    @Override // java.io.DataOutput
    void writeDouble(double d10);

    void writeDoubles(double[] dArr, int i10, int i11);

    @Override // java.io.DataOutput
    void writeFloat(float f10);

    void writeFloats(float[] fArr, int i10, int i11);

    @Override // java.io.DataOutput
    void writeInt(int i10);

    void writeInts(int[] iArr, int i10, int i11);

    @Override // java.io.DataOutput
    void writeLong(long j10);

    void writeLongs(long[] jArr, int i10, int i11);

    @Override // java.io.DataOutput
    void writeShort(int i10);

    void writeShorts(short[] sArr, int i10, int i11);

    @Override // java.io.DataOutput
    void writeUTF(String str);
}

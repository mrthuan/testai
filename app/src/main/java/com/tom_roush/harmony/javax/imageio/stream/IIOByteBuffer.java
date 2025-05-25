package com.tom_roush.harmony.javax.imageio.stream;

/* loaded from: classes2.dex */
public class IIOByteBuffer {
    private byte[] data;
    private int length;
    private int offset;

    public IIOByteBuffer(byte[] bArr, int i10, int i11) {
        this.data = bArr;
        this.offset = i10;
        this.length = i11;
    }

    public byte[] getData() {
        return this.data;
    }

    public int getLength() {
        return this.length;
    }

    public int getOffset() {
        return this.offset;
    }

    public void setData(byte[] bArr) {
        this.data = bArr;
    }

    public void setLength(int i10) {
        this.length = i10;
    }

    public void setOffset(int i10) {
        this.offset = i10;
    }
}

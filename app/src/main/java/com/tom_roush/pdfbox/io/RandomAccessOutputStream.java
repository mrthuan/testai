package com.tom_roush.pdfbox.io;

import java.io.OutputStream;

/* loaded from: classes2.dex */
public class RandomAccessOutputStream extends OutputStream {
    private final RandomAccessWrite writer;

    public RandomAccessOutputStream(RandomAccessWrite randomAccessWrite) {
        this.writer = randomAccessWrite;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) {
        this.writer.write(bArr, i10, i11);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.writer.write(bArr);
    }

    @Override // java.io.OutputStream
    public void write(int i10) {
        this.writer.write(i10);
    }
}

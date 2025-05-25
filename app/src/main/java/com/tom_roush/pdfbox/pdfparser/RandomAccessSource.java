package com.tom_roush.pdfbox.pdfparser;

import com.tom_roush.pdfbox.io.RandomAccessRead;

/* loaded from: classes2.dex */
final class RandomAccessSource implements SequentialSource {
    private final RandomAccessRead reader;

    public RandomAccessSource(RandomAccessRead randomAccessRead) {
        this.reader = randomAccessRead;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.reader.close();
    }

    @Override // com.tom_roush.pdfbox.pdfparser.SequentialSource
    public long getPosition() {
        return this.reader.getPosition();
    }

    @Override // com.tom_roush.pdfbox.pdfparser.SequentialSource
    public boolean isEOF() {
        return this.reader.isEOF();
    }

    @Override // com.tom_roush.pdfbox.pdfparser.SequentialSource
    public int peek() {
        return this.reader.peek();
    }

    @Override // com.tom_roush.pdfbox.pdfparser.SequentialSource
    public int read() {
        return this.reader.read();
    }

    @Override // com.tom_roush.pdfbox.pdfparser.SequentialSource
    public byte[] readFully(int i10) {
        return this.reader.readFully(i10);
    }

    @Override // com.tom_roush.pdfbox.pdfparser.SequentialSource
    public void unread(int i10) {
        this.reader.rewind(1);
    }

    @Override // com.tom_roush.pdfbox.pdfparser.SequentialSource
    public int read(byte[] bArr) {
        return this.reader.read(bArr);
    }

    @Override // com.tom_roush.pdfbox.pdfparser.SequentialSource
    public void unread(byte[] bArr) {
        this.reader.rewind(bArr.length);
    }

    @Override // com.tom_roush.pdfbox.pdfparser.SequentialSource
    public int read(byte[] bArr, int i10, int i11) {
        return this.reader.read(bArr, i10, i11);
    }

    @Override // com.tom_roush.pdfbox.pdfparser.SequentialSource
    public void unread(byte[] bArr, int i10, int i11) {
        this.reader.rewind(i11);
    }
}

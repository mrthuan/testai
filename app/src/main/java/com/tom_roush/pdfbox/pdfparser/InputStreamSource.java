package com.tom_roush.pdfbox.pdfparser;

import java.io.EOFException;
import java.io.InputStream;
import java.io.PushbackInputStream;

/* loaded from: classes2.dex */
final class InputStreamSource implements SequentialSource {
    private final PushbackInputStream input;
    private int position = 0;

    public InputStreamSource(InputStream inputStream) {
        this.input = new PushbackInputStream(inputStream, 32767);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.input.close();
    }

    @Override // com.tom_roush.pdfbox.pdfparser.SequentialSource
    public long getPosition() {
        return this.position;
    }

    @Override // com.tom_roush.pdfbox.pdfparser.SequentialSource
    public boolean isEOF() {
        if (peek() == -1) {
            return true;
        }
        return false;
    }

    @Override // com.tom_roush.pdfbox.pdfparser.SequentialSource
    public int peek() {
        int read = this.input.read();
        if (read != -1) {
            this.input.unread(read);
        }
        return read;
    }

    @Override // com.tom_roush.pdfbox.pdfparser.SequentialSource
    public int read() {
        int read = this.input.read();
        this.position++;
        return read;
    }

    @Override // com.tom_roush.pdfbox.pdfparser.SequentialSource
    public byte[] readFully(int i10) {
        byte[] bArr = new byte[i10];
        int i11 = 0;
        do {
            int read = read(bArr, i11, i10 - i11);
            if (read >= 0) {
                i11 += read;
            } else {
                throw new EOFException();
            }
        } while (i11 < i10);
        return bArr;
    }

    @Override // com.tom_roush.pdfbox.pdfparser.SequentialSource
    public void unread(int i10) {
        this.input.unread(i10);
        this.position--;
    }

    @Override // com.tom_roush.pdfbox.pdfparser.SequentialSource
    public int read(byte[] bArr) {
        int read = this.input.read(bArr);
        if (read > 0) {
            this.position += read;
            return read;
        }
        return -1;
    }

    @Override // com.tom_roush.pdfbox.pdfparser.SequentialSource
    public void unread(byte[] bArr) {
        this.input.unread(bArr);
        this.position -= bArr.length;
    }

    @Override // com.tom_roush.pdfbox.pdfparser.SequentialSource
    public int read(byte[] bArr, int i10, int i11) {
        int read = this.input.read(bArr, i10, i11);
        if (read > 0) {
            this.position += read;
            return read;
        }
        return -1;
    }

    @Override // com.tom_roush.pdfbox.pdfparser.SequentialSource
    public void unread(byte[] bArr, int i10, int i11) {
        this.input.unread(bArr, i10, i11);
        this.position -= i11;
    }
}

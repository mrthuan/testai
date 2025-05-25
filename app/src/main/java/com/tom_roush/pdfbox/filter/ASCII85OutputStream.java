package com.tom_roush.pdfbox.filter;

import java.io.FilterOutputStream;
import java.io.OutputStream;

/* loaded from: classes2.dex */
final class ASCII85OutputStream extends FilterOutputStream {
    private static final char NEWLINE = '\n';
    private static final char OFFSET = '!';
    private static final char Z = 'z';
    private int count;
    private boolean flushed;
    private byte[] indata;
    private int lineBreak;
    private int maxline;
    private byte[] outdata;
    private char terminator;

    public ASCII85OutputStream(OutputStream outputStream) {
        super(outputStream);
        this.lineBreak = 72;
        this.maxline = 72;
        this.count = 0;
        this.indata = new byte[4];
        this.outdata = new byte[5];
        this.flushed = true;
        this.terminator = '~';
    }

    private void transformASCII85() {
        byte[] bArr = this.indata;
        long j10 = ((bArr[3] & 255) | (((bArr[0] << 8) | (bArr[1] & 255)) << 16) | ((bArr[2] & 255) << 8)) & 4294967295L;
        if (j10 == 0) {
            byte[] bArr2 = this.outdata;
            bArr2[0] = 122;
            bArr2[1] = 0;
            return;
        }
        long j11 = j10 / 52200625;
        byte[] bArr3 = this.outdata;
        bArr3[0] = (byte) (j11 + 33);
        long j12 = j10 - ((((j11 * 85) * 85) * 85) * 85);
        long j13 = j12 / 614125;
        bArr3[1] = (byte) (j13 + 33);
        long j14 = j12 - (((j13 * 85) * 85) * 85);
        long j15 = j14 / 7225;
        bArr3[2] = (byte) (j15 + 33);
        long j16 = j14 - ((j15 * 85) * 85);
        bArr3[3] = (byte) ((j16 / 85) + 33);
        bArr3[4] = (byte) ((j16 % 85) + 33);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            flush();
            super.close();
        } finally {
            this.outdata = null;
            this.indata = null;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public void flush() {
        if (this.flushed) {
            return;
        }
        int i10 = this.count;
        if (i10 > 0) {
            while (i10 < 4) {
                this.indata[i10] = 0;
                i10++;
            }
            transformASCII85();
            if (this.outdata[0] == 122) {
                for (int i11 = 0; i11 < 5; i11++) {
                    this.outdata[i11] = 33;
                }
            }
            for (int i12 = 0; i12 < this.count + 1; i12++) {
                ((FilterOutputStream) this).out.write(this.outdata[i12]);
                int i13 = this.lineBreak - 1;
                this.lineBreak = i13;
                if (i13 == 0) {
                    ((FilterOutputStream) this).out.write(10);
                    this.lineBreak = this.maxline;
                }
            }
        }
        int i14 = this.lineBreak - 1;
        this.lineBreak = i14;
        if (i14 == 0) {
            ((FilterOutputStream) this).out.write(10);
        }
        ((FilterOutputStream) this).out.write(this.terminator);
        ((FilterOutputStream) this).out.write(62);
        ((FilterOutputStream) this).out.write(10);
        this.count = 0;
        this.lineBreak = this.maxline;
        this.flushed = true;
        super.flush();
    }

    public int getLineLength() {
        return this.maxline;
    }

    public char getTerminator() {
        return this.terminator;
    }

    public void setLineLength(int i10) {
        if (this.lineBreak > i10) {
            this.lineBreak = i10;
        }
        this.maxline = i10;
    }

    public void setTerminator(char c) {
        if (c >= 'v' && c <= '~' && c != 'z') {
            this.terminator = c;
            return;
        }
        throw new IllegalArgumentException("Terminator must be 118-126 excluding z");
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i10) {
        byte b10;
        this.flushed = false;
        byte[] bArr = this.indata;
        int i11 = this.count;
        int i12 = i11 + 1;
        this.count = i12;
        bArr[i11] = (byte) i10;
        if (i12 < 4) {
            return;
        }
        transformASCII85();
        for (int i13 = 0; i13 < 5 && (b10 = this.outdata[i13]) != 0; i13++) {
            ((FilterOutputStream) this).out.write(b10);
            int i14 = this.lineBreak - 1;
            this.lineBreak = i14;
            if (i14 == 0) {
                ((FilterOutputStream) this).out.write(10);
                this.lineBreak = this.maxline;
            }
        }
        this.count = 0;
    }
}

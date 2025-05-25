package com.tom_roush.pdfbox.io;

import com.google.android.gms.common.api.Api;
import java.io.InputStream;

/* loaded from: classes2.dex */
public class RandomAccessInputStream extends InputStream {
    private final RandomAccessRead input;
    private long position = 0;

    public RandomAccessInputStream(RandomAccessRead randomAccessRead) {
        this.input = randomAccessRead;
    }

    @Override // java.io.InputStream
    public int available() {
        restorePosition();
        long length = this.input.length() - this.input.getPosition();
        if (length > 2147483647L) {
            return Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        return (int) length;
    }

    @Override // java.io.InputStream
    public int read() {
        restorePosition();
        if (this.input.isEOF()) {
            return -1;
        }
        int read = this.input.read();
        if (read != -1) {
            this.position++;
        } else {
            this.input.getPosition();
        }
        return read;
    }

    public void restorePosition() {
        this.input.seek(this.position);
    }

    @Override // java.io.InputStream
    public long skip(long j10) {
        restorePosition();
        this.input.seek(this.position + j10);
        this.position += j10;
        return j10;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        restorePosition();
        if (this.input.isEOF()) {
            return -1;
        }
        int read = this.input.read(bArr, i10, i11);
        if (read != -1) {
            this.position += read;
        } else {
            this.input.getPosition();
        }
        return read;
    }
}

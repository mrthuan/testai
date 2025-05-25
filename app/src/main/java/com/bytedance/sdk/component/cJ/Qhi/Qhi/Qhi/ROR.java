package com.bytedance.sdk.component.cJ.Qhi.Qhi.Qhi;

import java.io.InputStream;
import java.net.HttpURLConnection;

/* compiled from: NetInputStram.java */
/* loaded from: classes.dex */
public class ROR extends InputStream {
    InputStream Qhi;
    HttpURLConnection cJ;

    public ROR(InputStream inputStream, HttpURLConnection httpURLConnection) {
        this.Qhi = inputStream;
        this.cJ = httpURLConnection;
    }

    @Override // java.io.InputStream
    public int available() {
        InputStream inputStream = this.Qhi;
        if (inputStream != null) {
            return inputStream.available();
        }
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        InputStream inputStream = this.Qhi;
        if (inputStream != null) {
            inputStream.close();
            this.Qhi = null;
        }
        HttpURLConnection httpURLConnection = this.cJ;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
            this.cJ = null;
        }
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i10) {
        InputStream inputStream = this.Qhi;
        if (inputStream != null) {
            inputStream.mark(i10);
        }
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        InputStream inputStream = this.Qhi;
        if (inputStream != null) {
            return inputStream.markSupported();
        }
        return false;
    }

    @Override // java.io.InputStream
    public int read() {
        InputStream inputStream = this.Qhi;
        if (inputStream != null) {
            return inputStream.read();
        }
        return 0;
    }

    @Override // java.io.InputStream
    public void reset() {
        InputStream inputStream = this.Qhi;
        if (inputStream != null) {
            inputStream.reset();
        }
    }

    @Override // java.io.InputStream
    public long skip(long j10) {
        InputStream inputStream = this.Qhi;
        if (inputStream != null) {
            return inputStream.skip(j10);
        }
        return 0L;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        InputStream inputStream = this.Qhi;
        if (inputStream != null) {
            return inputStream.read(bArr);
        }
        return 0;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        InputStream inputStream = this.Qhi;
        if (inputStream != null) {
            return inputStream.read(bArr, i10, i11);
        }
        return 0;
    }
}

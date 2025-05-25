package com.google.android.play.core.assetpacks;

import java.io.FileInputStream;
import java.io.InputStream;

/* compiled from: com.google.android.play:asset-delivery@@2.2.2 */
/* loaded from: classes2.dex */
public final class f0 extends InputStream {

    /* renamed from: a  reason: collision with root package name */
    public final InputStream f13230a;

    /* renamed from: b  reason: collision with root package name */
    public long f13231b;

    public f0(FileInputStream fileInputStream, long j10) {
        this.f13230a = fileInputStream;
        this.f13231b = j10;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        this.f13230a.close();
        this.f13231b = 0L;
    }

    @Override // java.io.InputStream
    public final int read() {
        long j10 = this.f13231b;
        if (j10 <= 0) {
            return -1;
        }
        this.f13231b = j10 - 1;
        return this.f13230a.read();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        long j10 = this.f13231b;
        if (j10 <= 0) {
            return -1;
        }
        int read = this.f13230a.read(bArr, i10, (int) Math.min(i11, j10));
        if (read != -1) {
            this.f13231b -= read;
        }
        return read;
    }
}

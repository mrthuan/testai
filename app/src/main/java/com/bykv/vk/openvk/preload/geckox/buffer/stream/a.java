package com.bykv.vk.openvk.preload.geckox.buffer.stream;

import com.google.android.gms.common.api.Api;
import java.io.InputStream;

/* compiled from: BufferInputStream.java */
/* loaded from: classes.dex */
public final class a extends InputStream {

    /* renamed from: a  reason: collision with root package name */
    private com.bykv.vk.openvk.preload.geckox.buffer.a f7544a;

    /* renamed from: b  reason: collision with root package name */
    private long f7545b;

    public a(com.bykv.vk.openvk.preload.geckox.buffer.a aVar) {
        this.f7544a = aVar;
    }

    @Override // java.io.InputStream
    public final int available() {
        long b10 = this.f7544a.b() - this.f7544a.c();
        if (b10 > 2147483647L) {
            return Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        return (int) b10;
    }

    @Override // java.io.InputStream
    public final synchronized void mark(int i10) {
        this.f7545b = i10;
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return this.f7544a.b(bArr);
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        this.f7544a.b(this.f7545b);
    }

    @Override // java.io.InputStream
    public final long skip(long j10) {
        return this.f7544a.a(j10);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        return this.f7544a.b(bArr, i10, i11);
    }

    @Override // java.io.InputStream
    public final int read() {
        return this.f7544a.d();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}

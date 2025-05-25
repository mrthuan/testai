package com.inmobi.media;

import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

/* renamed from: com.inmobi.media.e3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1608e3 extends FilterOutputStream {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C1622f3 f15025a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1608e3(C1622f3 c1622f3, FileOutputStream fileOutputStream) {
        super(fileOutputStream);
        this.f15025a = c1622f3;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            ((FilterOutputStream) this).out.close();
        } catch (IOException unused) {
            this.f15025a.c = true;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public final void flush() {
        try {
            ((FilterOutputStream) this).out.flush();
        } catch (IOException unused) {
            this.f15025a.c = true;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i10) {
        try {
            ((FilterOutputStream) this).out.write(i10);
        } catch (IOException unused) {
            this.f15025a.c = true;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) {
        try {
            ((FilterOutputStream) this).out.write(bArr, i10, i11);
        } catch (IOException unused) {
            this.f15025a.c = true;
        }
    }
}

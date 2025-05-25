package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Enumeration;

/* compiled from: com.google.android.play:asset-delivery@@2.2.2 */
/* loaded from: classes2.dex */
public final class o1 extends InputStream {

    /* renamed from: a  reason: collision with root package name */
    public final Enumeration f13347a;

    /* renamed from: b  reason: collision with root package name */
    public FileInputStream f13348b;

    public o1(Enumeration enumeration) {
        this.f13347a = enumeration;
        a();
    }

    public final void a() {
        FileInputStream fileInputStream = this.f13348b;
        if (fileInputStream != null) {
            fileInputStream.close();
        }
        Enumeration enumeration = this.f13347a;
        if (enumeration.hasMoreElements()) {
            this.f13348b = new FileInputStream((File) enumeration.nextElement());
        } else {
            this.f13348b = null;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        FileInputStream fileInputStream = this.f13348b;
        if (fileInputStream != null) {
            fileInputStream.close();
            this.f13348b = null;
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        while (true) {
            FileInputStream fileInputStream = this.f13348b;
            if (fileInputStream == null) {
                return -1;
            }
            int read = fileInputStream.read();
            if (read != -1) {
                return read;
            }
            a();
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        if (this.f13348b == null) {
            return -1;
        }
        bArr.getClass();
        if (i10 < 0 || i11 < 0 || i11 > bArr.length - i10) {
            throw new IndexOutOfBoundsException();
        }
        if (i11 != 0) {
            do {
                int read = this.f13348b.read(bArr, i10, i11);
                if (read > 0) {
                    return read;
                }
                a();
            } while (this.f13348b != null);
            return -1;
        }
        return 0;
    }
}

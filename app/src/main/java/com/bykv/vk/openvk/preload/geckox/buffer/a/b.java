package com.bykv.vk.openvk.preload.geckox.buffer.a;

import com.bykv.vk.openvk.preload.geckox.utils.CloseableUtils;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: FileBuffer.java */
/* loaded from: classes.dex */
final class b implements com.bykv.vk.openvk.preload.geckox.buffer.a {

    /* renamed from: a  reason: collision with root package name */
    private RandomAccessFile f7538a;

    /* renamed from: b  reason: collision with root package name */
    private AtomicBoolean f7539b = new AtomicBoolean(false);
    private File c;

    public b(File file) {
        this.c = file;
        file.getParentFile().mkdirs();
        try {
            this.f7538a = new RandomAccessFile(file, "rw");
        } catch (Exception e10) {
            CloseableUtils.close(this.f7538a);
            throw new IOException("create raf mSwap failed! path: " + file.getAbsolutePath() + " caused by: " + e10.getMessage(), e10);
        }
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final void a() {
        if (this.f7539b.get()) {
            throw new IOException("released!");
        }
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final long b() {
        return this.f7538a.length();
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final long c() {
        if (!this.f7539b.get()) {
            return this.f7538a.getFilePointer();
        }
        throw new IOException("released!");
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final int d() {
        byte[] bArr = new byte[1];
        if (b(bArr) <= 0) {
            return -1;
        }
        return bArr[0];
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final void e() {
        if (this.f7539b.getAndSet(true)) {
            return;
        }
        CloseableUtils.close(this.f7538a);
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final File f() {
        return this.c;
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final void b(long j10) {
        if (!this.f7539b.get()) {
            if (j10 < 0) {
                j10 = 0;
            }
            this.f7538a.seek(j10);
            return;
        }
        throw new IOException("released!");
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final void a(int i10) {
        a(new byte[]{(byte) i10});
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final void a(byte[] bArr) {
        a(bArr, 0, bArr.length);
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final synchronized long a(long j10) {
        int i10;
        if (this.f7539b.get()) {
            throw new IOException("released!");
        }
        i10 = (int) j10;
        if (i10 == j10) {
        } else {
            throw new IOException("too large:".concat(String.valueOf(j10)));
        }
        return this.f7538a.skipBytes(i10);
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final int b(byte[] bArr) {
        return b(bArr, 0, bArr.length);
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final int b(byte[] bArr, int i10, int i11) {
        int read;
        if (!this.f7539b.get()) {
            if (bArr == null || i11 <= 0 || i10 < 0 || i10 >= bArr.length) {
                return 0;
            }
            if (i10 + i11 > bArr.length) {
                i11 = bArr.length - i10;
            }
            synchronized (this) {
                read = this.f7538a.read(bArr, i10, i11);
            }
            return read;
        }
        throw new IOException("released!");
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final int a(byte[] bArr, int i10, int i11) {
        if (!this.f7539b.get()) {
            if (bArr == null || bArr.length == 0 || i11 <= 0 || i10 < 0 || i10 >= bArr.length) {
                return 0;
            }
            if (i10 + i11 > bArr.length) {
                i11 = bArr.length - i10;
            }
            synchronized (this) {
                this.f7538a.write(bArr, i10, i11);
            }
            return i11;
        }
        throw new IOException("released!");
    }
}

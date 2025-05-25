package com.bykv.vk.openvk.preload.geckox.buffer.a;

import com.bykv.vk.openvk.preload.geckox.utils.CloseableUtils;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: RAFBuffer.java */
/* loaded from: classes.dex */
final class c implements com.bykv.vk.openvk.preload.geckox.buffer.a {

    /* renamed from: a  reason: collision with root package name */
    private long f7540a;

    /* renamed from: b  reason: collision with root package name */
    private long f7541b;
    private RandomAccessFile c;

    /* renamed from: d  reason: collision with root package name */
    private AtomicBoolean f7542d = new AtomicBoolean(false);

    /* renamed from: e  reason: collision with root package name */
    private File f7543e;

    public c(long j10, File file) {
        this.f7540a = j10;
        this.f7543e = file;
        file.getParentFile().mkdirs();
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            this.c = randomAccessFile;
            randomAccessFile.setLength(j10);
        } catch (Exception e10) {
            CloseableUtils.close(this.c);
            throw new IOException("create raf swap failed! path: " + file.getAbsolutePath() + " caused by: " + e10.getMessage(), e10);
        }
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final void a() {
        if (this.f7542d.get()) {
            throw new IOException("released!");
        }
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final long b() {
        return this.f7540a;
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final long c() {
        if (!this.f7542d.get()) {
            return this.f7541b;
        }
        throw new IOException("released!");
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final int d() {
        byte[] bArr = new byte[1];
        if (b(bArr) == 0) {
            return -1;
        }
        return bArr[0];
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final void e() {
        if (this.f7542d.getAndSet(true)) {
            return;
        }
        CloseableUtils.close(this.c);
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final File f() {
        return this.f7543e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0014, code lost:
        if (r4 > r0) goto L5;
     */
    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(long r4) {
        /*
            r3 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.f7542d
            boolean r0 = r0.get()
            if (r0 != 0) goto L1f
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 >= 0) goto L10
        Le:
            r4 = r0
            goto L17
        L10:
            long r0 = r3.f7540a
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 <= 0) goto L17
            goto Le
        L17:
            r3.f7541b = r4
            java.io.RandomAccessFile r0 = r3.c
            r0.seek(r4)
            return
        L1f:
            java.io.IOException r4 = new java.io.IOException
            java.lang.String r5 = "released!"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bykv.vk.openvk.preload.geckox.buffer.a.c.b(long):void");
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
        int skipBytes;
        if (this.f7542d.get()) {
            throw new IOException("released!");
        }
        int i10 = (int) j10;
        if (i10 == j10) {
            skipBytes = this.c.skipBytes(i10);
            this.f7541b = this.c.getFilePointer();
        } else {
            throw new IOException("too large:".concat(String.valueOf(j10)));
        }
        return skipBytes;
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final int b(byte[] bArr) {
        return b(bArr, 0, bArr.length);
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final int b(byte[] bArr, int i10, int i11) {
        if (!this.f7542d.get()) {
            if (bArr == null || i11 <= 0 || i10 < 0 || i10 >= bArr.length) {
                return 0;
            }
            if (i10 + i11 > bArr.length) {
                i11 = bArr.length - i10;
            }
            synchronized (this) {
                long j10 = this.f7541b;
                long j11 = this.f7540a;
                if (j10 == j11) {
                    return -1;
                }
                if (i11 + j10 > j11) {
                    i11 = (int) (j11 - j10);
                }
                int read = this.c.read(bArr, i10, i11);
                if (read == -1) {
                    return -1;
                }
                this.f7541b += read;
                return read;
            }
        }
        throw new IOException("released!");
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final int a(byte[] bArr, int i10, int i11) {
        if (!this.f7542d.get()) {
            if (bArr == null || bArr.length == 0 || i11 <= 0 || i10 < 0 || i10 >= bArr.length) {
                return 0;
            }
            if (i10 + i11 > bArr.length) {
                i11 = bArr.length - i10;
            }
            synchronized (this) {
                long j10 = this.f7541b;
                long j11 = this.f7540a;
                if (j10 == j11) {
                    return 0;
                }
                if (i11 + j10 > j11) {
                    i11 = (int) (j11 - j10);
                }
                this.c.write(bArr, i10, i11);
                this.f7541b += i11;
                return i11;
            }
        }
        throw new IOException("released!");
    }
}

package com.bykv.vk.openvk.component.video.Qhi.Qhi.Qhi;

import android.content.Context;
import android.support.v4.media.session.h;
import com.bytedance.sdk.component.cJ.Qhi.iMK;
import com.bytedance.sdk.component.cJ.Qhi.zc;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.SocketTimeoutException;
import java.util.concurrent.TimeUnit;

/* compiled from: MediaDownloadPlayCacheImpl.java */
/* loaded from: classes.dex */
public class cJ implements ac {
    private File CJ;
    private final com.bykv.vk.openvk.component.video.api.ac.ac WAv;

    /* renamed from: ac  reason: collision with root package name */
    private File f7121ac;

    /* renamed from: fl  reason: collision with root package name */
    private long f7122fl;

    /* renamed from: hm  reason: collision with root package name */
    private RandomAccessFile f7123hm;
    private volatile long Qhi = -2147483648L;
    private final Object cJ = new Object();
    private volatile long Tgh = -1;
    private volatile boolean ROR = false;
    private volatile boolean Sf = false;

    public cJ(Context context, com.bykv.vk.openvk.component.video.api.ac.ac acVar) {
        this.f7122fl = 0L;
        this.f7123hm = null;
        this.WAv = acVar;
        try {
            this.f7121ac = com.bykv.vk.openvk.component.video.Qhi.fl.cJ.cJ(acVar.cJ(), acVar.iMK());
            this.CJ = com.bykv.vk.openvk.component.video.Qhi.fl.cJ.ac(acVar.cJ(), acVar.iMK());
            if (CJ()) {
                this.f7123hm = new RandomAccessFile(this.CJ, "r");
            } else {
                this.f7123hm = new RandomAccessFile(this.f7121ac, "rw");
            }
            if (!CJ()) {
                this.f7122fl = this.f7121ac.length();
                Qhi();
            }
        } catch (Throwable unused) {
            acVar.ABk();
        }
    }

    private boolean CJ() {
        return this.CJ.exists();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Tgh() {
        synchronized (this.cJ) {
            if (CJ()) {
                this.WAv.ABk();
                this.WAv.iMK();
            } else if (this.f7121ac.renameTo(this.CJ)) {
                RandomAccessFile randomAccessFile = this.f7123hm;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.f7123hm = new RandomAccessFile(this.CJ, "rw");
                this.WAv.iMK();
                this.WAv.ABk();
            } else {
                throw new IOException("Error renaming file " + this.f7121ac + " to " + this.CJ + " for completion!");
            }
        }
    }

    private long fl() {
        if (CJ()) {
            return this.CJ.length();
        }
        return this.f7121ac.length();
    }

    @Override // com.bykv.vk.openvk.component.video.Qhi.Qhi.Qhi.ac
    public long ac() {
        if (CJ()) {
            this.Qhi = this.CJ.length();
        } else {
            synchronized (this.cJ) {
                int i10 = 0;
                do {
                    if (this.Qhi == -2147483648L) {
                        i10 += 15;
                        try {
                            this.cJ.wait(5L);
                        } catch (InterruptedException unused) {
                            throw new IOException("total length InterruptException");
                        }
                    }
                } while (i10 <= 20000);
                return -1L;
            }
        }
        return this.Qhi;
    }

    @Override // com.bykv.vk.openvk.component.video.Qhi.Qhi.Qhi.ac
    public void cJ() {
        try {
            if (!this.ROR) {
                this.f7123hm.close();
            }
            File file = this.f7121ac;
            if (file != null) {
                file.setLastModified(System.currentTimeMillis());
            }
            File file2 = this.CJ;
            if (file2 != null) {
                file2.setLastModified(System.currentTimeMillis());
            }
        } catch (Throwable unused) {
        }
        this.ROR = true;
    }

    public void Qhi() {
        zc.Qhi qhi;
        if (com.bykv.vk.openvk.component.video.api.ac.CJ() != null) {
            qhi = com.bykv.vk.openvk.component.video.api.ac.CJ().cJ();
        } else {
            qhi = new zc.Qhi("v_cache");
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        qhi.Qhi(this.WAv.hpZ(), timeUnit).cJ(this.WAv.HzH(), timeUnit).ac(this.WAv.kYc(), timeUnit);
        zc Qhi = qhi.Qhi();
        this.WAv.iMK();
        Qhi.Qhi(new iMK.Qhi().Qhi("RANGE", h.e(new StringBuilder("bytes="), this.f7122fl, "-")).cJ(this.WAv.ABk()).Qhi().Qhi("videoLoadWhenPlaying").Qhi(9).cJ()).Qhi(new com.bytedance.sdk.component.cJ.Qhi.ac() { // from class: com.bykv.vk.openvk.component.video.Qhi.Qhi.Qhi.cJ.1
            @Override // com.bytedance.sdk.component.cJ.Qhi.ac
            public void Qhi(com.bytedance.sdk.component.cJ.Qhi.cJ cJVar, IOException iOException) {
                cJ.this.Sf = false;
                cJ.this.Qhi = -1L;
            }

            /* JADX WARN: Removed duplicated region for block: B:106:0x00c0 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:108:0x0079 A[SYNTHETIC] */
            @Override // com.bytedance.sdk.component.cJ.Qhi.ac
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void Qhi(com.bytedance.sdk.component.cJ.Qhi.cJ r17, com.bytedance.sdk.component.cJ.Qhi.hpZ r18) {
                /*
                    Method dump skipped, instructions count: 460
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bykv.vk.openvk.component.video.Qhi.Qhi.Qhi.cJ.AnonymousClass1.Qhi(com.bytedance.sdk.component.cJ.Qhi.cJ, com.bytedance.sdk.component.cJ.Qhi.hpZ):void");
            }
        });
    }

    @Override // com.bykv.vk.openvk.component.video.Qhi.Qhi.Qhi.ac
    public int Qhi(long j10, byte[] bArr, int i10, int i11) {
        try {
            if (j10 == this.Qhi) {
                return -1;
            }
            int i12 = 0;
            int i13 = 0;
            while (!this.ROR) {
                synchronized (this.cJ) {
                    if (j10 < fl()) {
                        this.f7123hm.seek(j10);
                        i13 = this.f7123hm.read(bArr, i10, i11);
                    } else {
                        i12 += 33;
                        this.cJ.wait(33L);
                    }
                }
                if (i13 > 0) {
                    return i13;
                }
                if (i12 >= 20000) {
                    throw new SocketTimeoutException();
                }
            }
            return -1;
        } catch (Throwable th2) {
            if (th2 instanceof IOException) {
                throw th2;
            }
            throw new IOException();
        }
    }
}

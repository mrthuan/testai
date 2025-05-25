package com.squareup.picasso;

import android.content.Context;
import gk.h;
import java.io.File;
import java.io.IOException;
import okhttp3.c;
import okhttp3.e;
import okhttp3.k;
import okhttp3.s;
import okhttp3.t;
import okhttp3.x;

/* loaded from: classes2.dex */
public final class OkHttp3Downloader implements Downloader {
    private final c cache;
    final e.a client;
    private boolean sharedClient;

    public OkHttp3Downloader(Context context) {
        this(Utils.createDefaultCacheDir(context));
    }

    @Override // com.squareup.picasso.Downloader
    public x load(t tVar) {
        okhttp3.internal.connection.e a10 = ((s) this.client).a(tVar);
        if (a10.f23298g.compareAndSet(false, true)) {
            a10.f23297f.h();
            h hVar = h.f17912a;
            a10.f23299h = h.f17912a.g();
            a10.f23296e.getClass();
            try {
                k kVar = a10.f23293a.f23383a;
                synchronized (kVar) {
                    kVar.f23354d.add(a10);
                }
                return a10.g();
            } finally {
                a10.f23293a.f23383a.c(a10);
            }
        }
        throw new IllegalStateException("Already Executed".toString());
    }

    @Override // com.squareup.picasso.Downloader
    public void shutdown() {
        c cVar;
        if (!this.sharedClient && (cVar = this.cache) != null) {
            try {
                cVar.close();
            } catch (IOException unused) {
            }
        }
    }

    public OkHttp3Downloader(File file) {
        this(file, Utils.calculateDiskCacheSize(file));
    }

    public OkHttp3Downloader(Context context, long j10) {
        this(Utils.createDefaultCacheDir(context), j10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public OkHttp3Downloader(java.io.File r3, long r4) {
        /*
            r2 = this;
            okhttp3.s$a r0 = new okhttp3.s$a
            r0.<init>()
            okhttp3.c r1 = new okhttp3.c
            r1.<init>(r3, r4)
            r0.f23417k = r1
            okhttp3.s r3 = new okhttp3.s
            r3.<init>(r0)
            r2.<init>(r3)
            r3 = 0
            r2.sharedClient = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.OkHttp3Downloader.<init>(java.io.File, long):void");
    }

    public OkHttp3Downloader(s sVar) {
        this.sharedClient = true;
        this.client = sVar;
        this.cache = sVar.f23392k;
    }

    public OkHttp3Downloader(e.a aVar) {
        this.sharedClient = true;
        this.client = aVar;
        this.cache = null;
    }
}

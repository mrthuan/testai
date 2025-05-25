package com.apm.insight.j;

import android.os.Handler;

/* loaded from: classes.dex */
public abstract class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private Handler f6555a;

    /* renamed from: b  reason: collision with root package name */
    private final long f6556b;
    private final long c;

    public a(Handler handler, long j10, long j11) {
        this.f6555a = handler;
        this.f6556b = j10;
        this.c = j11;
    }

    public void a() {
        if (b() > 0) {
            this.f6555a.postDelayed(this, b());
        } else {
            this.f6555a.post(this);
        }
    }

    public long b() {
        return this.f6556b;
    }

    public long c() {
        return this.c;
    }

    public void a(long j10) {
        if (j10 > 0) {
            this.f6555a.postDelayed(this, j10);
        } else {
            this.f6555a.post(this);
        }
    }
}

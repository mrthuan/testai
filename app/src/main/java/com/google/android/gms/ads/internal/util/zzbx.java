package com.google.android.gms.ads.internal.util;

import android.os.SystemClock;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes.dex */
public final class zzbx {

    /* renamed from: a  reason: collision with root package name */
    public long f10439a;

    /* renamed from: b  reason: collision with root package name */
    public long f10440b = Long.MIN_VALUE;
    public final Object c = new Object();

    public zzbx(long j10) {
        this.f10439a = j10;
    }

    public final boolean a() {
        synchronized (this.c) {
            com.google.android.gms.ads.internal.zzu.B.f10560j.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f10440b + this.f10439a > elapsedRealtime) {
                return false;
            }
            this.f10440b = elapsedRealtime;
            return true;
        }
    }
}

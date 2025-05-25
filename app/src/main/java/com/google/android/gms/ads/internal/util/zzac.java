package com.google.android.gms.ads.internal.util;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes.dex */
public final class zzac {

    /* renamed from: a  reason: collision with root package name */
    public boolean f10372a = false;

    /* renamed from: b  reason: collision with root package name */
    public float f10373b = 1.0f;

    public final synchronized float a() {
        if (e()) {
            return this.f10373b;
        }
        return 1.0f;
    }

    public final synchronized void b(boolean z10) {
        this.f10372a = z10;
    }

    public final synchronized void c(float f10) {
        this.f10373b = f10;
    }

    public final synchronized boolean d() {
        return this.f10372a;
    }

    public final synchronized boolean e() {
        if (this.f10373b >= 0.0f) {
            return true;
        }
        return false;
    }
}

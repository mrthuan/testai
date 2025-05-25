package com.google.android.gms.common.api.internal;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: classes.dex */
public final class q0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ LifecycleCallback f11028a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f11029b;
    public final /* synthetic */ zzb c;

    public q0(zzb zzbVar, LifecycleCallback lifecycleCallback, String str) {
        this.c = zzbVar;
        this.f11028a = lifecycleCallback;
        this.f11029b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        zzb zzbVar = this.c;
        int i10 = zzbVar.f11157b;
        LifecycleCallback lifecycleCallback = this.f11028a;
        if (i10 > 0) {
            Bundle bundle2 = zzbVar.c;
            if (bundle2 != null) {
                bundle = bundle2.getBundle(this.f11029b);
            } else {
                bundle = null;
            }
            lifecycleCallback.e(bundle);
        }
        if (zzbVar.f11157b >= 2) {
            lifecycleCallback.i();
        }
        if (zzbVar.f11157b >= 3) {
            lifecycleCallback.g();
        }
        if (zzbVar.f11157b >= 4) {
            lifecycleCallback.j();
        }
        if (zzbVar.f11157b >= 5) {
            lifecycleCallback.f();
        }
    }
}

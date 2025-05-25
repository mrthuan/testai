package com.google.android.gms.measurement.internal;

import a8.v;
import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
/* loaded from: classes2.dex */
public final class zzfh {

    /* renamed from: a  reason: collision with root package name */
    public final String f11735a;

    /* renamed from: b  reason: collision with root package name */
    public final String f11736b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public final long f11737d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ v f11738e;

    public /* synthetic */ zzfh(v vVar, long j10) {
        boolean z10;
        this.f11738e = vVar;
        Preconditions.f("health_monitor");
        if (j10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Preconditions.b(z10);
        this.f11735a = "health_monitor:start";
        this.f11736b = "health_monitor:count";
        this.c = "health_monitor:value";
        this.f11737d = j10;
    }

    public final void a() {
        v vVar = this.f11738e;
        vVar.m();
        ((zzge) vVar.f3529a).f11785n.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor edit = vVar.q().edit();
        edit.remove(this.f11736b);
        edit.remove(this.c);
        edit.putLong(this.f11735a, currentTimeMillis);
        edit.apply();
    }
}

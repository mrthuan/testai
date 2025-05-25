package com.google.android.gms.measurement.internal;

import a8.v;
import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
/* loaded from: classes2.dex */
public final class zzfd {

    /* renamed from: a  reason: collision with root package name */
    public final String f11724a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f11725b;
    public boolean c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f11726d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ v f11727e;

    public zzfd(v vVar, String str, boolean z10) {
        this.f11727e = vVar;
        Preconditions.f(str);
        this.f11724a = str;
        this.f11725b = z10;
    }

    public final void a(boolean z10) {
        SharedPreferences.Editor edit = this.f11727e.q().edit();
        edit.putBoolean(this.f11724a, z10);
        edit.apply();
        this.f11726d = z10;
    }

    public final boolean b() {
        if (!this.c) {
            this.c = true;
            this.f11726d = this.f11727e.q().getBoolean(this.f11724a, this.f11725b);
        }
        return this.f11726d;
    }
}

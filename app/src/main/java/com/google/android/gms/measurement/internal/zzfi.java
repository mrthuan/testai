package com.google.android.gms.measurement.internal;

import a8.v;
import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
/* loaded from: classes2.dex */
public final class zzfi {

    /* renamed from: a  reason: collision with root package name */
    public final String f11739a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f11740b;
    public String c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ v f11741d;

    public zzfi(v vVar, String str) {
        this.f11741d = vVar;
        Preconditions.f(str);
        this.f11739a = str;
    }

    public final String a() {
        if (!this.f11740b) {
            this.f11740b = true;
            this.c = this.f11741d.q().getString(this.f11739a, null);
        }
        return this.c;
    }

    public final void b(String str) {
        SharedPreferences.Editor edit = this.f11741d.q().edit();
        edit.putString(this.f11739a, str);
        edit.apply();
        this.c = str;
    }
}

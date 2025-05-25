package com.google.android.gms.measurement.internal;

import a8.v;
import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
/* loaded from: classes2.dex */
public final class zzff {

    /* renamed from: a  reason: collision with root package name */
    public final String f11731a;

    /* renamed from: b  reason: collision with root package name */
    public final long f11732b;
    public boolean c;

    /* renamed from: d  reason: collision with root package name */
    public long f11733d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ v f11734e;

    public zzff(v vVar, String str, long j10) {
        this.f11734e = vVar;
        Preconditions.f(str);
        this.f11731a = str;
        this.f11732b = j10;
    }

    public final long a() {
        if (!this.c) {
            this.c = true;
            this.f11733d = this.f11734e.q().getLong(this.f11731a, this.f11732b);
        }
        return this.f11733d;
    }

    public final void b(long j10) {
        SharedPreferences.Editor edit = this.f11734e.q().edit();
        edit.putLong(this.f11731a, j10);
        edit.apply();
        this.f11733d = j10;
    }
}

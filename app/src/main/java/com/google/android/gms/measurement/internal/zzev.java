package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import androidx.activity.f;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
/* loaded from: classes2.dex */
public final class zzev {

    /* renamed from: a  reason: collision with root package name */
    public final String f11721a;

    /* renamed from: b  reason: collision with root package name */
    public final String f11722b;
    public final long c;

    /* renamed from: d  reason: collision with root package name */
    public final Bundle f11723d;

    public zzev(String str, String str2, Bundle bundle, long j10) {
        this.f11721a = str;
        this.f11722b = str2;
        this.f11723d = bundle;
        this.c = j10;
    }

    public static zzev b(zzaw zzawVar) {
        return new zzev(zzawVar.f11546a, zzawVar.c, zzawVar.f11547b.d(), zzawVar.f11548d);
    }

    public final zzaw a() {
        return new zzaw(this.f11721a, new zzau(new Bundle(this.f11723d)), this.f11722b, this.c);
    }

    public final String toString() {
        String obj = this.f11723d.toString();
        StringBuilder sb2 = new StringBuilder("origin=");
        sb2.append(this.f11722b);
        sb2.append(",name=");
        return f.o(sb2, this.f11721a, ",params=", obj);
    }
}

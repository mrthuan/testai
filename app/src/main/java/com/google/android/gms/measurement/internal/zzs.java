package com.google.android.gms.measurement.internal;

import a8.v;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
/* loaded from: classes2.dex */
public final class zzs {

    /* renamed from: a  reason: collision with root package name */
    public final zzge f11945a;

    public zzs(zzge zzgeVar) {
        this.f11945a = zzgeVar;
    }

    public final void a(String str, Bundle bundle) {
        String uri;
        zzge zzgeVar = this.f11945a;
        zzgb zzgbVar = zzgeVar.f11781j;
        zzge.f(zzgbVar);
        zzgbVar.m();
        if (!zzgeVar.b()) {
            if (bundle.isEmpty()) {
                uri = null;
            } else {
                if (true == str.isEmpty()) {
                    str = "auto";
                }
                Uri.Builder builder = new Uri.Builder();
                builder.path(str);
                for (String str2 : bundle.keySet()) {
                    builder.appendQueryParameter(str2, bundle.getString(str2));
                }
                uri = builder.build().toString();
            }
            if (!TextUtils.isEmpty(uri)) {
                v vVar = zzgeVar.f11779h;
                zzge.d(vVar);
                vVar.f358u.b(uri);
                zzge.d(vVar);
                zzgeVar.f11785n.getClass();
                vVar.f359v.b(System.currentTimeMillis());
            }
        }
    }

    public final boolean b() {
        v vVar = this.f11945a.f11779h;
        zzge.d(vVar);
        if (vVar.f359v.a() > 0) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        if (!b()) {
            return false;
        }
        zzge zzgeVar = this.f11945a;
        zzgeVar.f11785n.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        v vVar = zzgeVar.f11779h;
        zzge.d(vVar);
        if (currentTimeMillis - vVar.f359v.a() <= zzgeVar.f11778g.s(null, zzeh.T)) {
            return false;
        }
        return true;
    }
}

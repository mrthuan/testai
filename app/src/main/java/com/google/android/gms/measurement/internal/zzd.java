package com.google.android.gms.measurement.internal;

import a8.a;
import a8.i;
import a8.k;
import android.os.Bundle;
import java.util.Iterator;
import y.b;
import y.h;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
/* loaded from: classes2.dex */
public final class zzd extends k {

    /* renamed from: b  reason: collision with root package name */
    public final b f11603b;
    public final b c;

    /* renamed from: d  reason: collision with root package name */
    public long f11604d;

    public zzd(zzge zzgeVar) {
        super(zzgeVar);
        this.c = new b();
        this.f11603b = new b();
    }

    public final void n(String str, long j10) {
        Object obj = this.f3529a;
        if (str != null && str.length() != 0) {
            zzgb zzgbVar = ((zzge) obj).f11781j;
            zzge.f(zzgbVar);
            zzgbVar.u(new a(this, str, j10));
            return;
        }
        zzeu zzeuVar = ((zzge) obj).f11780i;
        zzge.f(zzeuVar);
        zzeuVar.f11712f.a("Ad unit id must be a non-empty string");
    }

    public final void o(String str, long j10) {
        Object obj = this.f3529a;
        if (str != null && str.length() != 0) {
            zzgb zzgbVar = ((zzge) obj).f11781j;
            zzge.f(zzgbVar);
            zzgbVar.u(new i(this, str, j10));
            return;
        }
        zzeu zzeuVar = ((zzge) obj).f11780i;
        zzge.f(zzeuVar);
        zzeuVar.f11712f.a("Ad unit id must be a non-empty string");
    }

    public final void p(long j10) {
        zziy zziyVar = ((zzge) this.f3529a).f11786o;
        zzge.e(zziyVar);
        zziq s4 = zziyVar.s(false);
        b bVar = this.f11603b;
        Iterator it = ((h.c) bVar.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            r(str, j10 - ((Long) bVar.getOrDefault(str, null)).longValue(), s4);
        }
        if (!bVar.isEmpty()) {
            q(j10 - this.f11604d, s4);
        }
        s(j10);
    }

    public final void q(long j10, zziq zziqVar) {
        Object obj = this.f3529a;
        if (zziqVar == null) {
            zzeu zzeuVar = ((zzge) obj).f11780i;
            zzge.f(zzeuVar);
            zzeuVar.f11720n.a("Not logging ad exposure. No active activity");
        } else if (j10 < 1000) {
            zzeu zzeuVar2 = ((zzge) obj).f11780i;
            zzge.f(zzeuVar2);
            zzeuVar2.f11720n.b(Long.valueOf(j10), "Not logging ad exposure. Less than 1000 ms. exposure");
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j10);
            zzlo.z(zziqVar, bundle, true);
            zzij zzijVar = ((zzge) obj).f11787p;
            zzge.e(zzijVar);
            zzijVar.t(bundle, "am", "_xa");
        }
    }

    public final void r(String str, long j10, zziq zziqVar) {
        Object obj = this.f3529a;
        if (zziqVar == null) {
            zzeu zzeuVar = ((zzge) obj).f11780i;
            zzge.f(zzeuVar);
            zzeuVar.f11720n.a("Not logging ad unit exposure. No active activity");
        } else if (j10 < 1000) {
            zzeu zzeuVar2 = ((zzge) obj).f11780i;
            zzge.f(zzeuVar2);
            zzeuVar2.f11720n.b(Long.valueOf(j10), "Not logging ad unit exposure. Less than 1000 ms. exposure");
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j10);
            zzlo.z(zziqVar, bundle, true);
            zzij zzijVar = ((zzge) obj).f11787p;
            zzge.e(zzijVar);
            zzijVar.t(bundle, "am", "_xu");
        }
    }

    public final void s(long j10) {
        b bVar = this.f11603b;
        Iterator it = ((h.c) bVar.keySet()).iterator();
        while (it.hasNext()) {
            bVar.put((String) it.next(), Long.valueOf(j10));
        }
        if (!bVar.isEmpty()) {
            this.f11604d = j10;
        }
    }
}

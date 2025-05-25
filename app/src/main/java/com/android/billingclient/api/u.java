package com.android.billingclient.api;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.adjust.sdk.Constants;
import com.google.android.gms.common.api.internal.zabq;
import com.google.android.gms.measurement.internal.zzeu;
import com.google.android.gms.measurement.internal.zzgb;
import com.google.android.gms.measurement.internal.zzge;
import com.google.android.gms.measurement.internal.zzij;
import com.google.android.gms.measurement.internal.zziy;
import com.google.android.gms.measurement.internal.zzs;
import com.google.android.play.core.assetpacks.m2;
import com.google.android.play.core.assetpacks.t2;
import java.util.concurrent.Executor;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes.dex */
public final /* synthetic */ class u implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6283a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f6284b;

    public /* synthetic */ u(Object obj, int i10) {
        this.f6283a = i10;
        this.f6284b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        switch (this.f6283a) {
            case 0:
                v vVar = (v) this.f6284b;
                vVar.c.f6182a = 0;
                vVar.c.f6187g = null;
                f fVar = y.f6297k;
                vVar.c.D(w.a(24, 6, fVar));
                vVar.a(fVar);
                return;
            case 1:
                ((zabq) this.f6284b).f();
                return;
            case 2:
                zzs zzsVar = ((zzij) this.f6284b).f11836n;
                zzge zzgeVar = zzsVar.f11945a;
                zzgb zzgbVar = zzgeVar.f11781j;
                zzge.f(zzgbVar);
                zzgbVar.m();
                if (zzsVar.b()) {
                    boolean c = zzsVar.c();
                    zzij zzijVar = zzgeVar.f11787p;
                    a8.v vVar2 = zzgeVar.f11779h;
                    if (c) {
                        zzge.d(vVar2);
                        vVar2.f358u.b(null);
                        Bundle bundle = new Bundle();
                        bundle.putString("source", "(not set)");
                        bundle.putString(Constants.MEDIUM, "(not set)");
                        bundle.putString("_cis", "intent");
                        bundle.putLong("_cc", 1L);
                        zzge.e(zzijVar);
                        zzijVar.t(bundle, "auto", "_cmpx");
                    } else {
                        zzge.d(vVar2);
                        String a10 = vVar2.f358u.a();
                        if (TextUtils.isEmpty(a10)) {
                            zzeu zzeuVar = zzgeVar.f11780i;
                            zzge.f(zzeuVar);
                            zzeuVar.f11713g.a("Cache still valid but referrer not found");
                        } else {
                            long a11 = vVar2.f359v.a() / 3600000;
                            Uri parse = Uri.parse(a10);
                            Bundle bundle2 = new Bundle();
                            Pair pair = new Pair(parse.getPath(), bundle2);
                            for (String str2 : parse.getQueryParameterNames()) {
                                bundle2.putString(str2, parse.getQueryParameter(str2));
                            }
                            ((Bundle) pair.second).putLong("_cc", (a11 - 1) * 3600000);
                            Object obj = pair.first;
                            if (obj == null) {
                                str = "app";
                            } else {
                                str = (String) obj;
                            }
                            zzge.e(zzijVar);
                            zzijVar.t((Bundle) pair.second, str, "_cmp");
                        }
                        vVar2.f358u.b(null);
                    }
                    zzge.d(vVar2);
                    vVar2.f359v.b(0L);
                    return;
                }
                return;
            case 3:
                ((zziy) this.f6284b).f11853j = null;
                return;
            default:
                m2 m2Var = (m2) this.f6284b;
                com.google.android.play.core.assetpacks.d0 d0Var = m2Var.f13315a;
                d8.o i10 = ((t2) m2Var.f13322i.a()).i(d0Var.q());
                q9.k kVar = m2Var.f13323j;
                i10.f((Executor) kVar.a(), new m7.g(d0Var));
                i10.d((Executor) kVar.a(), new com.google.android.play.core.assetpacks.c());
                return;
        }
    }
}

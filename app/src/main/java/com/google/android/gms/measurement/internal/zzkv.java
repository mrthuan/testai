package com.google.android.gms.measurement.internal;

import a6.h;
import a8.b2;
import a8.d2;
import a8.e;
import a8.n0;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzra;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.2 */
/* loaded from: classes2.dex */
public final class zzkv extends b2 {
    public final d2 n(String str) {
        String str2;
        zzra.zzc();
        zzge zzgeVar = (zzge) this.f3529a;
        d2 d2Var = null;
        if (zzgeVar.f11778g.v(null, zzeh.f11664m0)) {
            zzeu zzeuVar = zzgeVar.f11780i;
            zzge.f(zzeuVar);
            zzeuVar.f11720n.a("sgtm feature flag enabled.");
            zzlg zzlgVar = this.f117b;
            e eVar = zzlgVar.c;
            zzlg.C(eVar);
            n0 G = eVar.G(str);
            if (G == null) {
                return new d2(o(str));
            }
            if (G.z()) {
                zzeu zzeuVar2 = zzgeVar.f11780i;
                zzge.f(zzeuVar2);
                zzeuVar2.f11720n.a("sgtm upload enabled in manifest.");
                zzfv zzfvVar = zzlgVar.f11883a;
                zzlg.C(zzfvVar);
                com.google.android.gms.internal.measurement.zzff w7 = zzfvVar.w(G.E());
                if (w7 != null) {
                    String zzj = w7.zzj();
                    if (!TextUtils.isEmpty(zzj)) {
                        String zzi = w7.zzi();
                        zzeu zzeuVar3 = zzgeVar.f11780i;
                        zzge.f(zzeuVar3);
                        if (true != TextUtils.isEmpty(zzi)) {
                            str2 = "N";
                        } else {
                            str2 = "Y";
                        }
                        zzeuVar3.f11720n.c(zzj, "sgtm configured with upload_url, server_info", str2);
                        if (TextUtils.isEmpty(zzi)) {
                            zzgeVar.getClass();
                            d2Var = new d2(zzj);
                        } else {
                            d2Var = new d2(zzj, h.h("x-google-sgtm-server-info", zzi));
                        }
                    }
                }
            }
            if (d2Var != null) {
                return d2Var;
            }
        }
        return new d2(o(str));
    }

    public final String o(String str) {
        zzfv zzfvVar = this.f117b.f11883a;
        zzlg.C(zzfvVar);
        zzfvVar.m();
        zzfvVar.s(str);
        String str2 = (String) zzfvVar.f11761l.getOrDefault(str, null);
        if (!TextUtils.isEmpty(str2)) {
            Uri parse = Uri.parse((String) zzeh.f11673r.a(null));
            Uri.Builder buildUpon = parse.buildUpon();
            String authority = parse.getAuthority();
            buildUpon.authority(str2 + "." + authority);
            return buildUpon.build().toString();
        }
        return (String) zzeh.f11673r.a(null);
    }
}

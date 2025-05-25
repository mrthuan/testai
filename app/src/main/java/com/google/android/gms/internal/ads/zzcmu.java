package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzcmu implements zzcly {
    private final CookieManager zza = com.google.android.gms.ads.internal.zzu.B.f10555e.i();

    public zzcmu(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzcly
    public final void zza(Map map) {
        if (this.zza != null) {
            if (((String) map.get("clear")) != null) {
                String str = (String) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzaF);
                String cookie = this.zza.getCookie(str);
                if (cookie != null) {
                    List zze = zzfvh.zzb(zzfui.zzc(';')).zze(cookie);
                    for (int i10 = 0; i10 < zze.size(); i10++) {
                        CookieManager cookieManager = this.zza;
                        Iterator it = zzfvh.zzb(zzfui.zzc('=')).zzc((String) zze.get(i10)).iterator();
                        it.getClass();
                        if (it.hasNext()) {
                            cookieManager.setCookie(str, String.valueOf((String) it.next()).concat(String.valueOf((String) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzar))));
                        } else {
                            throw new IndexOutOfBoundsException(a0.a.g("position (0) must be less than the number of elements that remained (", 0, ")"));
                        }
                    }
                    return;
                }
                return;
            }
            String str2 = (String) map.get("cookie");
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            this.zza.setCookie((String) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzaF), str2);
        }
    }
}

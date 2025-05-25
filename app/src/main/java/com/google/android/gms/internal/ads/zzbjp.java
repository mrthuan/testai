package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbjp implements zzbix {
    private final zzbjo zza;

    public zzbjp(zzbjo zzbjoVar) {
        this.zza = zzbjoVar;
    }

    public static void zzb(zzcej zzcejVar, zzbjo zzbjoVar) {
        zzcejVar.zzag("/reward", new zzbjp(zzbjoVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbix
    public final void zza(Object obj, Map map) {
        String str = (String) map.get("action");
        if ("grant".equals(str)) {
            zzbvz zzbvzVar = null;
            try {
                int parseInt = Integer.parseInt((String) map.get("amount"));
                String str2 = (String) map.get("type");
                if (!TextUtils.isEmpty(str2)) {
                    zzbvzVar = new zzbvz(str2, parseInt);
                }
            } catch (NumberFormatException unused) {
                com.google.android.gms.ads.internal.util.client.zzm.g(5);
            }
            this.zza.zza(zzbvzVar);
        } else if ("video_start".equals(str)) {
            this.zza.zzc();
        } else if ("video_complete".equals(str)) {
            this.zza.zzb();
        }
    }
}

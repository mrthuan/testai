package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzbie implements zzbix {
    @Override // com.google.android.gms.internal.ads.zzbix
    public final void zza(Object obj, Map map) {
        zzcej zzcejVar = (zzcej) obj;
        com.google.android.gms.ads.internal.overlay.zzx zzxVar = com.google.android.gms.ads.internal.zzu.B.f10567q;
        Context context = zzcejVar.getContext();
        synchronized (zzxVar) {
            zzxVar.c = zzcejVar;
            if (!zzxVar.c(context)) {
                zzxVar.a("Unable to bind", "on_play_store_bind");
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("action", "fetch_completed");
            zzbzo.zze.execute(new com.google.android.gms.ads.internal.overlay.zzv(zzxVar, "on_play_store_bind", hashMap));
        }
    }
}

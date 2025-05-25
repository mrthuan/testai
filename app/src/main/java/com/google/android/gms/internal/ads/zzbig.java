package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzbig implements zzbix {
    @Override // com.google.android.gms.internal.ads.zzbix
    public final void zza(Object obj, Map map) {
        zzfta zzftaVar;
        zzcej zzcejVar = (zzcej) obj;
        com.google.android.gms.ads.internal.overlay.zzx zzxVar = com.google.android.gms.ads.internal.zzu.B.f10567q;
        if (zzxVar.f10339e && (zzftaVar = zzxVar.f10338d) != null) {
            zzftaVar.zzc(zzxVar.d(), zzxVar.f10340f);
            zzbzo.zze.execute(new com.google.android.gms.ads.internal.overlay.zzv(zzxVar, "onLMDOverlayExpand", new HashMap()));
            return;
        }
        com.google.android.gms.ads.internal.util.zze.h("LastMileDelivery not connected");
    }
}

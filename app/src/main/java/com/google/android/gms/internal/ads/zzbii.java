package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzbii implements zzbix {
    @Override // com.google.android.gms.internal.ads.zzbix
    public final void zza(Object obj, Map map) {
        zzfta zzftaVar;
        zzcej zzcejVar = (zzcej) obj;
        com.google.android.gms.ads.internal.overlay.zzx zzxVar = com.google.android.gms.ads.internal.zzu.B.f10567q;
        if (zzxVar.f10339e && (zzftaVar = zzxVar.f10338d) != null) {
            zzfsy zzc = zzfsz.zzc();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzkC)).booleanValue() && !TextUtils.isEmpty(zzxVar.f10337b)) {
                zzc.zza(zzxVar.f10337b);
            } else {
                String str = zzxVar.f10336a;
                if (str != null) {
                    zzc.zzb(str);
                } else {
                    zzxVar.a("Missing session token and/or appId", "onLMDupdate");
                }
            }
            zzftaVar.zzb(zzc.zzc(), zzxVar.f10340f);
            return;
        }
        com.google.android.gms.ads.internal.util.zze.h("LastMileDelivery not connected");
    }
}

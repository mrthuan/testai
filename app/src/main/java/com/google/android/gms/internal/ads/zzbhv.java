package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zzbhv implements zzbix {
    public final /* synthetic */ zzdeq zza;
    public final /* synthetic */ zzcni zzb;

    public /* synthetic */ zzbhv(zzdeq zzdeqVar, zzcni zzcniVar) {
        this.zza = zzdeqVar;
        this.zzb = zzcniVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbix
    public final void zza(Object obj, Map map) {
        zzcej zzcejVar = (zzcej) obj;
        zzbiw.zzc(map, this.zza);
        final String str = (String) map.get("u");
        if (str == null) {
            com.google.android.gms.ads.internal.util.client.zzm.e("URL missing from click GMSG.");
            return;
        }
        final zzcni zzcniVar = this.zzb;
        zzgca zzu = zzgca.zzu(zzbiw.zza(zzcejVar, str));
        zzgbq zzgbqVar = new zzgbq() { // from class: com.google.android.gms.internal.ads.zzbhx
            @Override // com.google.android.gms.internal.ads.zzgbq
            public final y9.a zza(Object obj2) {
                zzcni zzcniVar2;
                String str2 = (String) obj2;
                zzbix zzbixVar = zzbiw.zza;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzjg)).booleanValue() && (zzcniVar2 = zzcni.this) != null && zzcni.zzj(str)) {
                    return zzcniVar2.zzb(str2, com.google.android.gms.ads.internal.client.zzay.f10107f.f10111e);
                }
                return zzgcj.zzh(str2);
            }
        };
        zzgcu zzgcuVar = zzbzo.zza;
        zzgcj.zzr(zzgcj.zzn(zzu, zzgbqVar, zzgcuVar), new zzbil(zzcejVar), zzgcuVar);
    }
}

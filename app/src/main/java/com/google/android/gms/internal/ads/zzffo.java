package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zzffo implements zzbix {
    public final /* synthetic */ zzdeq zza;
    public final /* synthetic */ zzcni zzb;
    public final /* synthetic */ zzfll zzc;
    public final /* synthetic */ zzedh zzd;

    public /* synthetic */ zzffo(zzdeq zzdeqVar, zzcni zzcniVar, zzfll zzfllVar, zzedh zzedhVar) {
        this.zza = zzdeqVar;
        this.zzb = zzcniVar;
        this.zzc = zzfllVar;
        this.zzd = zzedhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbix
    public final void zza(Object obj, Map map) {
        zzcej zzcejVar = (zzcej) obj;
        zzbiw.zzc(map, this.zza);
        String str = (String) map.get("u");
        if (str == null) {
            com.google.android.gms.ads.internal.util.client.zzm.e("URL missing from click GMSG.");
            return;
        }
        zzedh zzedhVar = this.zzd;
        zzfll zzfllVar = this.zzc;
        zzgcj.zzr(zzbiw.zza(zzcejVar, str), new zzffq(zzcejVar, this.zzb, zzfllVar, zzedhVar), zzbzo.zza);
    }
}

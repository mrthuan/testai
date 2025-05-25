package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzcvk implements zzhfc {
    private final zzhfu zza;
    private final zzhfu zzb;
    private final zzhfu zzc;

    public zzcvk(zzhfu zzhfuVar, zzhfu zzhfuVar2, zzhfu zzhfuVar3) {
        this.zza = zzhfuVar;
        this.zzb = zzhfuVar2;
        this.zzc = zzhfuVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhfu, com.google.android.gms.internal.ads.zzhft
    public final /* bridge */ /* synthetic */ Object zzb() {
        final Context context = (Context) this.zza.zzb();
        final VersionInfoParcel zza = ((zzchc) this.zzb).zza();
        final zzffg zza2 = ((zzcwh) this.zzc).zza();
        return new zzful() { // from class: com.google.android.gms.internal.ads.zzcvj
            @Override // com.google.android.gms.internal.ads.zzful
            public final Object apply(Object obj) {
                zzfel zzfelVar = (zzfel) obj;
                com.google.android.gms.ads.internal.util.zzau zzauVar = new com.google.android.gms.ads.internal.util.zzau(context);
                zzauVar.c = zzfelVar.zzB;
                zzauVar.f10403f = zzfelVar.zzC.toString();
                zzauVar.f10402e = zza.f10345a;
                zzauVar.f10401d = zza2.zzf;
                return zzauVar;
            }
        };
    }
}

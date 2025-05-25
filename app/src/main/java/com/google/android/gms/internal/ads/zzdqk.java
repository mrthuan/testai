package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzbbc;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdqk implements zzhfc {
    private final zzhfu zza;
    private final zzhfu zzb;
    private final zzhfu zzc;
    private final zzhfu zzd;
    private final zzhfu zze;

    public zzdqk(zzhfu zzhfuVar, zzhfu zzhfuVar2, zzhfu zzhfuVar3, zzhfu zzhfuVar4, zzhfu zzhfuVar5) {
        this.zza = zzhfuVar;
        this.zzb = zzhfuVar2;
        this.zzc = zzhfuVar3;
        this.zzd = zzhfuVar4;
        this.zze = zzhfuVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzhfu, com.google.android.gms.internal.ads.zzhft
    public final /* bridge */ /* synthetic */ Object zzb() {
        int i10;
        Context zza = ((zzcgp) this.zza).zza();
        final String zzb = ((zzdxd) this.zzb).zzb();
        VersionInfoParcel zza2 = ((zzchc) this.zzc).zza();
        final zzbbc.zza.EnumC0157zza enumC0157zza = (zzbbc.zza.EnumC0157zza) this.zzd.zzb();
        final String str = (String) this.zze.zzb();
        zzbav zzbavVar = new zzbav(new zzbbb(zza));
        zzbbc.zzar.zza zzd = zzbbc.zzar.zzd();
        zzd.zzg(zza2.f10346b);
        zzd.zzi(zza2.c);
        if (true != zza2.f10347d) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        zzd.zzh(i10);
        final zzbbc.zzar zzbr = zzd.zzbr();
        zzbavVar.zzb(new zzbau() { // from class: com.google.android.gms.internal.ads.zzdqj
            @Override // com.google.android.gms.internal.ads.zzbau
            public final void zza(zzbbc.zzt.zza zzaVar) {
                zzbbc.zza.zzb zzbM = zzaVar.zze().zzbM();
                zzbM.zzH(zzbbc.zza.EnumC0157zza.this);
                zzaVar.zzG(zzbM);
                zzbbc.zzm.zza zzbM2 = zzaVar.zzg().zzbM();
                zzbM2.zzm(zzb);
                zzbM2.zzw(zzbr);
                zzaVar.zzK(zzbM2);
                zzaVar.zzO(str);
            }
        });
        return zzbavVar;
    }
}

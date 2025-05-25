package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzglh implements zzgdz {
    final String zza;
    final Class zzb;
    final zzgsu zzc;

    public zzglh(String str, Class cls, zzgsu zzgsuVar, zzgzr zzgzrVar) {
        this.zza = str;
        this.zzb = cls;
        this.zzc = zzgsuVar;
    }

    public static zzgdz zzd(String str, Class cls, zzgsu zzgsuVar, zzgzr zzgzrVar) {
        return new zzglh(str, cls, zzgsuVar, zzgzrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgdz
    public final zzgsv zza(zzgwm zzgwmVar) {
        zzgsy zza = zzgsz.zza();
        zza.zzb(this.zza);
        zza.zzc(zzgwmVar);
        zza.zza(zzgtz.RAW);
        zzgnq zzd = zzgmk.zzc().zzd(zzgma.zzb().zza(zzgmk.zzc().zzb(zzgnm.zza((zzgsz) zza.zzbr())), null), zzgnl.class, zzgdx.zza());
        zzgst zza2 = zzgsv.zza();
        zzgnl zzgnlVar = (zzgnl) zzd;
        zza2.zzb(zzgnlVar.zzg());
        zza2.zzc(zzgnlVar.zze());
        zza2.zza(zzgnlVar.zzb());
        return (zzgsv) zza2.zzbr();
    }

    @Override // com.google.android.gms.internal.ads.zzgdz
    public final Class zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgdz
    public final Object zzc(zzgwm zzgwmVar) {
        return zzgmh.zza().zzc(zzgmk.zzc().zza(zzgnl.zza(this.zza, zzgwmVar, this.zzc, zzgtz.RAW, null), zzgdx.zza()), this.zzb);
    }
}

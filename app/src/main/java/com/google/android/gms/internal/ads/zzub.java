package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzub extends zztw {
    public static final Object zzc = new Object();
    private final Object zzd;
    private final Object zze;

    private zzub(zzcc zzccVar, Object obj, Object obj2) {
        super(zzccVar);
        this.zzd = obj;
        this.zze = obj2;
    }

    public static zzub zzq(zzbc zzbcVar) {
        return new zzub(new zzuc(zzbcVar), zzcb.zza, zzc);
    }

    public static zzub zzr(zzcc zzccVar, Object obj, Object obj2) {
        return new zzub(zzccVar, obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.zztw, com.google.android.gms.internal.ads.zzcc
    public final int zza(Object obj) {
        Object obj2;
        if (zzc.equals(obj) && (obj2 = this.zze) != null) {
            obj = obj2;
        }
        return this.zzb.zza(obj);
    }

    @Override // com.google.android.gms.internal.ads.zztw, com.google.android.gms.internal.ads.zzcc
    public final zzca zzd(int i10, zzca zzcaVar, boolean z10) {
        this.zzb.zzd(i10, zzcaVar, z10);
        if (zzet.zzG(zzcaVar.zzb, this.zze) && z10) {
            zzcaVar.zzb = zzc;
        }
        return zzcaVar;
    }

    @Override // com.google.android.gms.internal.ads.zztw, com.google.android.gms.internal.ads.zzcc
    public final zzcb zze(int i10, zzcb zzcbVar, long j10) {
        this.zzb.zze(i10, zzcbVar, j10);
        if (zzet.zzG(zzcbVar.zzb, this.zzd)) {
            zzcbVar.zzb = zzcb.zza;
        }
        return zzcbVar;
    }

    @Override // com.google.android.gms.internal.ads.zztw, com.google.android.gms.internal.ads.zzcc
    public final Object zzf(int i10) {
        Object zzf = this.zzb.zzf(i10);
        if (zzet.zzG(zzf, this.zze)) {
            return zzc;
        }
        return zzf;
    }

    public final zzub zzp(zzcc zzccVar) {
        return new zzub(zzccVar, this.zzd, this.zze);
    }
}

package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgqu extends zzgxy implements zzgzk {
    private static final zzgqu zza;
    private static volatile zzgzr zzb;
    private int zzc;
    private int zzd;
    private zzgra zze;
    private zzgsl zzf;

    static {
        zzgqu zzgquVar = new zzgqu();
        zza = zzgquVar;
        zzgxy.zzcb(zzgqu.class, zzgquVar);
    }

    private zzgqu() {
    }

    public static zzgqt zzc() {
        return (zzgqt) zza.zzaZ();
    }

    public static zzgqu zze(zzgwm zzgwmVar, zzgxi zzgxiVar) {
        return (zzgqu) zzgxy.zzbr(zza, zzgwmVar, zzgxiVar);
    }

    public static zzgzr zzh() {
        return zza.zzbN();
    }

    public static /* synthetic */ void zzi(zzgqu zzgquVar, zzgra zzgraVar) {
        zzgraVar.getClass();
        zzgquVar.zze = zzgraVar;
        zzgquVar.zzc |= 1;
    }

    public static /* synthetic */ void zzj(zzgqu zzgquVar, zzgsl zzgslVar) {
        zzgslVar.getClass();
        zzgquVar.zzf = zzgslVar;
        zzgquVar.zzc |= 2;
    }

    public final int zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgxy
    public final Object zzde(zzgxx zzgxxVar, Object obj, Object obj2) {
        switch (zzgxxVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return zzgxy.zzbS(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"zzc", "zzd", "zze", "zzf"});
            case 3:
                return new zzgqu();
            case 4:
                return new zzgqt(null);
            case 5:
                return zza;
            case 6:
                zzgzr zzgzrVar = zzb;
                if (zzgzrVar == null) {
                    synchronized (zzgqu.class) {
                        zzgzrVar = zzb;
                        if (zzgzrVar == null) {
                            zzgzrVar = new zzgxt(zza);
                            zzb = zzgzrVar;
                        }
                    }
                }
                return zzgzrVar;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final zzgra zzf() {
        zzgra zzgraVar = this.zze;
        if (zzgraVar == null) {
            return zzgra.zze();
        }
        return zzgraVar;
    }

    public final zzgsl zzg() {
        zzgsl zzgslVar = this.zzf;
        if (zzgslVar == null) {
            return zzgsl.zze();
        }
        return zzgslVar;
    }
}

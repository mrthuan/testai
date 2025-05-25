package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzaxi extends zzgxy implements zzgzk {
    private static final zzaxi zza;
    private static volatile zzgzr zzb;
    private int zzc;
    private zzaxl zzd;
    private zzgwm zze;
    private zzgwm zzf;

    static {
        zzaxi zzaxiVar = new zzaxi();
        zza = zzaxiVar;
        zzgxy.zzcb(zzaxi.class, zzaxiVar);
    }

    private zzaxi() {
        zzgwm zzgwmVar = zzgwm.zzb;
        this.zze = zzgwmVar;
        this.zzf = zzgwmVar;
    }

    public static zzaxi zzc(zzgwm zzgwmVar, zzgxi zzgxiVar) {
        return (zzaxi) zzgxy.zzbr(zza, zzgwmVar, zzgxiVar);
    }

    public final zzaxl zzd() {
        zzaxl zzaxlVar = this.zzd;
        if (zzaxlVar == null) {
            return zzaxl.zzg();
        }
        return zzaxlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgxy
    public final Object zzde(zzgxx zzgxxVar, Object obj, Object obj2) {
        switch (zzgxxVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return zzgxy.zzbS(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzc", "zzd", "zze", "zzf"});
            case 3:
                return new zzaxi();
            case 4:
                return new zzaxh(null);
            case 5:
                return zza;
            case 6:
                zzgzr zzgzrVar = zzb;
                if (zzgzrVar == null) {
                    synchronized (zzaxi.class) {
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

    public final zzgwm zze() {
        return this.zzf;
    }

    public final zzgwm zzf() {
        return this.zze;
    }
}

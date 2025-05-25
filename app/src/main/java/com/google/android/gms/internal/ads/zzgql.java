package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgql extends zzgxy implements zzgzk {
    private static final zzgql zza;
    private static volatile zzgzr zzb;
    private int zzc;
    private int zzd;
    private zzgwm zze = zzgwm.zzb;
    private zzgqr zzf;

    static {
        zzgql zzgqlVar = new zzgql();
        zza = zzgqlVar;
        zzgxy.zzcb(zzgql.class, zzgqlVar);
    }

    private zzgql() {
    }

    public static zzgqk zzc() {
        return (zzgqk) zza.zzaZ();
    }

    public static zzgql zze(zzgwm zzgwmVar, zzgxi zzgxiVar) {
        return (zzgql) zzgxy.zzbr(zza, zzgwmVar, zzgxiVar);
    }

    public static zzgzr zzh() {
        return zza.zzbN();
    }

    public static /* synthetic */ void zzj(zzgql zzgqlVar, zzgqr zzgqrVar) {
        zzgqrVar.getClass();
        zzgqlVar.zzf = zzgqrVar;
        zzgqlVar.zzc |= 1;
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
                return zzgxy.zzbS(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003ဉ\u0000", new Object[]{"zzc", "zzd", "zze", "zzf"});
            case 3:
                return new zzgql();
            case 4:
                return new zzgqk(null);
            case 5:
                return zza;
            case 6:
                zzgzr zzgzrVar = zzb;
                if (zzgzrVar == null) {
                    synchronized (zzgql.class) {
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

    public final zzgqr zzf() {
        zzgqr zzgqrVar = this.zzf;
        if (zzgqrVar == null) {
            return zzgqr.zze();
        }
        return zzgqrVar;
    }

    public final zzgwm zzg() {
        return this.zze;
    }
}

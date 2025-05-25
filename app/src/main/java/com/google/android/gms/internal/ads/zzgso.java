package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgso extends zzgxy implements zzgzk {
    private static final zzgso zza;
    private static volatile zzgzr zzb;
    private int zzc;
    private zzgsr zzd;
    private int zze;
    private int zzf;

    static {
        zzgso zzgsoVar = new zzgso();
        zza = zzgsoVar;
        zzgxy.zzcb(zzgso.class, zzgsoVar);
    }

    private zzgso() {
    }

    public static zzgsn zzd() {
        return (zzgsn) zza.zzaZ();
    }

    public static zzgso zzf() {
        return zza;
    }

    public static zzgso zzg(zzgwm zzgwmVar, zzgxi zzgxiVar) {
        return (zzgso) zzgxy.zzbr(zza, zzgwmVar, zzgxiVar);
    }

    public static /* synthetic */ void zzi(zzgso zzgsoVar, zzgsr zzgsrVar) {
        zzgsrVar.getClass();
        zzgsoVar.zzd = zzgsrVar;
        zzgsoVar.zzc |= 1;
    }

    public final int zza() {
        return this.zze;
    }

    public final int zzc() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzgxy
    public final Object zzde(zzgxx zzgxxVar, Object obj, Object obj2) {
        switch (zzgxxVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return zzgxy.zzbS(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\u000b", new Object[]{"zzc", "zzd", "zze", "zzf"});
            case 3:
                return new zzgso();
            case 4:
                return new zzgsn(null);
            case 5:
                return zza;
            case 6:
                zzgzr zzgzrVar = zzb;
                if (zzgzrVar == null) {
                    synchronized (zzgso.class) {
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

    public final zzgsr zzh() {
        zzgsr zzgsrVar = this.zzd;
        if (zzgsrVar == null) {
            return zzgsr.zzf();
        }
        return zzgsrVar;
    }
}

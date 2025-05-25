package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgqx extends zzgxy implements zzgzk {
    private static final zzgqx zza;
    private static volatile zzgzr zzb;
    private int zzc;
    private zzgrd zzd;
    private zzgso zze;

    static {
        zzgqx zzgqxVar = new zzgqx();
        zza = zzgqxVar;
        zzgxy.zzcb(zzgqx.class, zzgqxVar);
    }

    private zzgqx() {
    }

    public static zzgqw zza() {
        return (zzgqw) zza.zzaZ();
    }

    public static zzgqx zzd(zzgwm zzgwmVar, zzgxi zzgxiVar) {
        return (zzgqx) zzgxy.zzbr(zza, zzgwmVar, zzgxiVar);
    }

    public static /* synthetic */ void zzg(zzgqx zzgqxVar, zzgrd zzgrdVar) {
        zzgrdVar.getClass();
        zzgqxVar.zzd = zzgrdVar;
        zzgqxVar.zzc |= 1;
    }

    public static /* synthetic */ void zzh(zzgqx zzgqxVar, zzgso zzgsoVar) {
        zzgsoVar.getClass();
        zzgqxVar.zze = zzgsoVar;
        zzgqxVar.zzc |= 2;
    }

    @Override // com.google.android.gms.internal.ads.zzgxy
    public final Object zzde(zzgxx zzgxxVar, Object obj, Object obj2) {
        switch (zzgxxVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return zzgxy.zzbS(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzc", "zzd", "zze"});
            case 3:
                return new zzgqx();
            case 4:
                return new zzgqw(null);
            case 5:
                return zza;
            case 6:
                zzgzr zzgzrVar = zzb;
                if (zzgzrVar == null) {
                    synchronized (zzgqx.class) {
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

    public final zzgrd zze() {
        zzgrd zzgrdVar = this.zzd;
        if (zzgrdVar == null) {
            return zzgrd.zze();
        }
        return zzgrdVar;
    }

    public final zzgso zzf() {
        zzgso zzgsoVar = this.zze;
        if (zzgsoVar == null) {
            return zzgso.zzf();
        }
        return zzgsoVar;
    }
}

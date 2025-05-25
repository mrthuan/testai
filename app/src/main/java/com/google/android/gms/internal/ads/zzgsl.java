package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgsl extends zzgxy implements zzgzk {
    private static final zzgsl zza;
    private static volatile zzgzr zzb;
    private int zzc;
    private int zzd;
    private zzgsr zze;
    private zzgwm zzf = zzgwm.zzb;

    static {
        zzgsl zzgslVar = new zzgsl();
        zza = zzgslVar;
        zzgxy.zzcb(zzgsl.class, zzgslVar);
    }

    private zzgsl() {
    }

    public static zzgsk zzc() {
        return (zzgsk) zza.zzaZ();
    }

    public static zzgsl zze() {
        return zza;
    }

    public static zzgsl zzf(zzgwm zzgwmVar, zzgxi zzgxiVar) {
        return (zzgsl) zzgxy.zzbr(zza, zzgwmVar, zzgxiVar);
    }

    public static zzgzr zzi() {
        return zza.zzbN();
    }

    public static /* synthetic */ void zzj(zzgsl zzgslVar, zzgsr zzgsrVar) {
        zzgsrVar.getClass();
        zzgslVar.zze = zzgsrVar;
        zzgslVar.zzc |= 1;
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
                return zzgxy.zzbS(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zzc", "zzd", "zze", "zzf"});
            case 3:
                return new zzgsl();
            case 4:
                return new zzgsk(null);
            case 5:
                return zza;
            case 6:
                zzgzr zzgzrVar = zzb;
                if (zzgzrVar == null) {
                    synchronized (zzgsl.class) {
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

    public final zzgsr zzg() {
        zzgsr zzgsrVar = this.zze;
        if (zzgsrVar == null) {
            return zzgsr.zzf();
        }
        return zzgsrVar;
    }

    public final zzgwm zzh() {
        return this.zzf;
    }
}

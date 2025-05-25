package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgry extends zzgxy implements zzgzk {
    private static final zzgry zza;
    private static volatile zzgzr zzb;
    private int zzc;
    private zzgwm zzd = zzgwm.zzb;

    static {
        zzgry zzgryVar = new zzgry();
        zza = zzgryVar;
        zzgxy.zzcb(zzgry.class, zzgryVar);
    }

    private zzgry() {
    }

    public static zzgrx zzc() {
        return (zzgrx) zza.zzaZ();
    }

    public static zzgry zze(zzgwm zzgwmVar, zzgxi zzgxiVar) {
        return (zzgry) zzgxy.zzbr(zza, zzgwmVar, zzgxiVar);
    }

    public static zzgzr zzg() {
        return zza.zzbN();
    }

    public final int zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgxy
    public final Object zzde(zzgxx zzgxxVar, Object obj, Object obj2) {
        switch (zzgxxVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return zzgxy.zzbS(zza, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zzc", "zzd"});
            case 3:
                return new zzgry();
            case 4:
                return new zzgrx(null);
            case 5:
                return zza;
            case 6:
                zzgzr zzgzrVar = zzb;
                if (zzgzrVar == null) {
                    synchronized (zzgry.class) {
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

    public final zzgwm zzf() {
        return this.zzd;
    }
}

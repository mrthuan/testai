package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgra extends zzgxy implements zzgzk {
    private static final zzgra zza;
    private static volatile zzgzr zzb;
    private int zzc;
    private int zzd;
    private zzgrg zze;
    private zzgwm zzf = zzgwm.zzb;

    static {
        zzgra zzgraVar = new zzgra();
        zza = zzgraVar;
        zzgxy.zzcb(zzgra.class, zzgraVar);
    }

    private zzgra() {
    }

    public static zzgqz zzc() {
        return (zzgqz) zza.zzaZ();
    }

    public static zzgra zze() {
        return zza;
    }

    public static /* synthetic */ void zzh(zzgra zzgraVar, zzgrg zzgrgVar) {
        zzgrgVar.getClass();
        zzgraVar.zze = zzgrgVar;
        zzgraVar.zzc |= 1;
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
                return new zzgra();
            case 4:
                return new zzgqz(null);
            case 5:
                return zza;
            case 6:
                zzgzr zzgzrVar = zzb;
                if (zzgzrVar == null) {
                    synchronized (zzgra.class) {
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

    public final zzgrg zzf() {
        zzgrg zzgrgVar = this.zze;
        if (zzgrgVar == null) {
            return zzgrg.zze();
        }
        return zzgrgVar;
    }

    public final zzgwm zzg() {
        return this.zzf;
    }
}

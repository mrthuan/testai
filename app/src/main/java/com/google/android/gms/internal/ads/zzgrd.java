package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgrd extends zzgxy implements zzgzk {
    private static final zzgrd zza;
    private static volatile zzgzr zzb;
    private int zzc;
    private zzgrg zzd;
    private int zze;

    static {
        zzgrd zzgrdVar = new zzgrd();
        zza = zzgrdVar;
        zzgxy.zzcb(zzgrd.class, zzgrdVar);
    }

    private zzgrd() {
    }

    public static zzgrc zzc() {
        return (zzgrc) zza.zzaZ();
    }

    public static zzgrd zze() {
        return zza;
    }

    public static /* synthetic */ void zzg(zzgrd zzgrdVar, zzgrg zzgrgVar) {
        zzgrgVar.getClass();
        zzgrdVar.zzd = zzgrgVar;
        zzgrdVar.zzc |= 1;
    }

    public final int zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzgxy
    public final Object zzde(zzgxx zzgxxVar, Object obj, Object obj2) {
        switch (zzgxxVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return zzgxy.zzbS(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zzc", "zzd", "zze"});
            case 3:
                return new zzgrd();
            case 4:
                return new zzgrc(null);
            case 5:
                return zza;
            case 6:
                zzgzr zzgzrVar = zzb;
                if (zzgzrVar == null) {
                    synchronized (zzgrd.class) {
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
        zzgrg zzgrgVar = this.zzd;
        if (zzgrgVar == null) {
            return zzgrg.zze();
        }
        return zzgrgVar;
    }
}

package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzasi extends zzgxy implements zzgzk {
    private static final zzasi zza;
    private static volatile zzgzr zzb;
    private int zzc;
    private long zzd = -1;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private long zzj = -1;
    private long zzk = -1;

    static {
        zzasi zzasiVar = new zzasi();
        zza = zzasiVar;
        zzgxy.zzcb(zzasi.class, zzasiVar);
    }

    private zzasi() {
    }

    public static zzash zza() {
        return (zzash) zza.zzaZ();
    }

    public static /* synthetic */ void zzd(zzasi zzasiVar, long j10) {
        zzasiVar.zzc |= 1;
        zzasiVar.zzd = j10;
    }

    public static /* synthetic */ void zze(zzasi zzasiVar, long j10) {
        zzasiVar.zzc |= 4;
        zzasiVar.zzf = j10;
    }

    public static /* synthetic */ void zzf(zzasi zzasiVar, long j10) {
        zzasiVar.zzc |= 8;
        zzasiVar.zzg = j10;
    }

    public static /* synthetic */ void zzg(zzasi zzasiVar, long j10) {
        zzasiVar.zzc |= 16;
        zzasiVar.zzh = j10;
    }

    public static /* synthetic */ void zzh(zzasi zzasiVar, long j10) {
        zzasiVar.zzc |= 32;
        zzasiVar.zzi = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzgxy
    public final Object zzde(zzgxx zzgxxVar, Object obj, Object obj2) {
        switch (zzgxxVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return zzgxy.zzbS(zza, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
            case 3:
                return new zzasi();
            case 4:
                return new zzash(null);
            case 5:
                return zza;
            case 6:
                zzgzr zzgzrVar = zzb;
                if (zzgzrVar == null) {
                    synchronized (zzasi.class) {
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
}

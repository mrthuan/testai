package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzaxl extends zzgxy implements zzgzk {
    private static final zzaxl zza;
    private static volatile zzgzr zzb;
    private int zzc;
    private String zzd = "";
    private String zze = "";
    private long zzf;
    private long zzg;
    private long zzh;

    static {
        zzaxl zzaxlVar = new zzaxl();
        zza = zzaxlVar;
        zzgxy.zzcb(zzaxl.class, zzaxlVar);
    }

    private zzaxl() {
    }

    public static zzaxk zze() {
        return (zzaxk) zza.zzaZ();
    }

    public static zzaxl zzg() {
        return zza;
    }

    public static zzaxl zzh(zzgwm zzgwmVar) {
        return (zzaxl) zzgxy.zzbm(zza, zzgwmVar);
    }

    public static zzaxl zzi(zzgwm zzgwmVar, zzgxi zzgxiVar) {
        return (zzaxl) zzgxy.zzbr(zza, zzgwmVar, zzgxiVar);
    }

    public static /* synthetic */ void zzl(zzaxl zzaxlVar, String str) {
        str.getClass();
        zzaxlVar.zzc |= 1;
        zzaxlVar.zzd = str;
    }

    public static /* synthetic */ void zzm(zzaxl zzaxlVar, long j10) {
        zzaxlVar.zzc |= 16;
        zzaxlVar.zzh = j10;
    }

    public static /* synthetic */ void zzn(zzaxl zzaxlVar, String str) {
        str.getClass();
        zzaxlVar.zzc |= 2;
        zzaxlVar.zze = str;
    }

    public static /* synthetic */ void zzo(zzaxl zzaxlVar, long j10) {
        zzaxlVar.zzc |= 4;
        zzaxlVar.zzf = j10;
    }

    public static /* synthetic */ void zzp(zzaxl zzaxlVar, long j10) {
        zzaxlVar.zzc |= 8;
        zzaxlVar.zzg = j10;
    }

    public final long zza() {
        return this.zzg;
    }

    public final long zzc() {
        return this.zzf;
    }

    public final long zzd() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzgxy
    public final Object zzde(zzgxx zzgxxVar, Object obj, Object obj2) {
        switch (zzgxxVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return zzgxy.zzbS(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
            case 3:
                return new zzaxl();
            case 4:
                return new zzaxk(null);
            case 5:
                return zza;
            case 6:
                zzgzr zzgzrVar = zzb;
                if (zzgzrVar == null) {
                    synchronized (zzaxl.class) {
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

    public final String zzj() {
        return this.zze;
    }

    public final String zzk() {
        return this.zzd;
    }
}

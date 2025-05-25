package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzfpi extends zzgxy implements zzgzk {
    private static final zzfpi zza;
    private static volatile zzgzr zzb;
    private int zzc;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private zzfpe zzg;

    static {
        zzfpi zzfpiVar = new zzfpi();
        zza = zzfpiVar;
        zzgxy.zzcb(zzfpi.class, zzfpiVar);
    }

    private zzfpi() {
    }

    public static zzfpg zza() {
        return (zzfpg) zza.zzaZ();
    }

    public static /* synthetic */ zzfpi zzc() {
        return zza;
    }

    public static /* synthetic */ void zzd(zzfpi zzfpiVar, String str) {
        str.getClass();
        zzfpiVar.zzc |= 2;
        zzfpiVar.zze = str;
    }

    public static /* synthetic */ void zze(zzfpi zzfpiVar, zzfpe zzfpeVar) {
        zzfpeVar.getClass();
        zzfpiVar.zzg = zzfpeVar;
        zzfpiVar.zzc |= 8;
    }

    public static /* synthetic */ void zzf(zzfpi zzfpiVar, int i10) {
        zzfpiVar.zzd = 1;
        zzfpiVar.zzc = 1 | zzfpiVar.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgxy
    public final Object zzde(zzgxx zzgxxVar, Object obj, Object obj2) {
        switch (zzgxxVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return zzgxy.zzbS(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"zzc", "zzd", zzfph.zza, "zze", "zzf", "zzg"});
            case 3:
                return new zzfpi();
            case 4:
                return new zzfpg(null);
            case 5:
                return zza;
            case 6:
                zzgzr zzgzrVar = zzb;
                if (zzgzrVar == null) {
                    synchronized (zzfpi.class) {
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

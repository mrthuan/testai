package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzfpe extends zzgxy implements zzgzk {
    private static final zzfpe zza;
    private static volatile zzgzr zzb;
    private int zzc;
    private zzgyg zzd = zzgxy.zzbG();
    private String zze = "";
    private String zzf = "";
    private String zzg = "";

    static {
        zzfpe zzfpeVar = new zzfpe();
        zza = zzfpeVar;
        zzgxy.zzcb(zzfpe.class, zzfpeVar);
    }

    private zzfpe() {
    }

    public static zzfpd zza() {
        return (zzfpd) zza.zzaZ();
    }

    public static /* synthetic */ void zzd(zzfpe zzfpeVar, String str) {
        str.getClass();
        zzfpeVar.zzc |= 1;
        zzfpeVar.zze = str;
    }

    public static /* synthetic */ void zze(zzfpe zzfpeVar, int i10) {
        zzgyg zzgygVar = zzfpeVar.zzd;
        if (!zzgygVar.zzc()) {
            zzfpeVar.zzd = zzgxy.zzbH(zzgygVar);
        }
        zzfpeVar.zzd.zzi(2);
    }

    @Override // com.google.android.gms.internal.ads.zzgxy
    public final Object zzde(zzgxx zzgxxVar, Object obj, Object obj2) {
        switch (zzgxxVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return zzgxy.zzbS(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ࠞ\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"zzc", "zzd", zzfpc.zza, "zze", "zzf", "zzg"});
            case 3:
                return new zzfpe();
            case 4:
                return new zzfpd(null);
            case 5:
                return zza;
            case 6:
                zzgzr zzgzrVar = zzb;
                if (zzgzrVar == null) {
                    synchronized (zzfpe.class) {
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

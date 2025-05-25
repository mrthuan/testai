package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzhdq extends zzgxy implements zzgzk {
    private static final zzhdq zza;
    private static volatile zzgzr zzb;
    private int zzc;
    private long zze;
    private boolean zzf;
    private int zzg;
    private boolean zzj;
    private String zzd = "";
    private String zzh = "";
    private String zzi = "";

    static {
        zzhdq zzhdqVar = new zzhdq();
        zza = zzhdqVar;
        zzgxy.zzcb(zzhdq.class, zzhdqVar);
    }

    private zzhdq() {
    }

    public static zzhdp zzc() {
        return (zzhdp) zza.zzaZ();
    }

    public static /* synthetic */ zzhdq zzd() {
        return zza;
    }

    public static /* synthetic */ void zze(zzhdq zzhdqVar, String str) {
        zzhdqVar.zzc |= 1;
        zzhdqVar.zzd = str;
    }

    public static /* synthetic */ void zzf(zzhdq zzhdqVar, long j10) {
        zzhdqVar.zzc |= 2;
        zzhdqVar.zze = j10;
    }

    public static /* synthetic */ void zzg(zzhdq zzhdqVar, boolean z10) {
        zzhdqVar.zzc |= 4;
        zzhdqVar.zzf = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzgxy
    public final Object zzde(zzgxx zzgxxVar, Object obj, Object obj2) {
        switch (zzgxxVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return zzgxy.zzbS(zza, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဇ\u0002\u0004᠌\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဇ\u0006", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", zzhdr.zza, "zzh", "zzi", "zzj"});
            case 3:
                return new zzhdq();
            case 4:
                return new zzhdp(null);
            case 5:
                return zza;
            case 6:
                zzgzr zzgzrVar = zzb;
                if (zzgzrVar == null) {
                    synchronized (zzhdq.class) {
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

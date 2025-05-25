package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzhec extends zzgxy implements zzgzk {
    private static final zzhec zza;
    private static volatile zzgzr zzb;
    private int zzc;
    private int zzd;
    private int zzg;
    private String zze = "";
    private zzgyg zzf = zzgxy.zzbG();
    private zzgyk zzh = zzgxy.zzbK();
    private zzgwm zzi = zzgwm.zzb;

    static {
        zzhec zzhecVar = new zzhec();
        zza = zzhecVar;
        zzgxy.zzcb(zzhec.class, zzhecVar);
    }

    private zzhec() {
    }

    @Override // com.google.android.gms.internal.ads.zzgxy
    public final Object zzde(zzgxx zzgxxVar, Object obj, Object obj2) {
        switch (zzgxxVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return zzgxy.zzbS(zza, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0002\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u0016\u0005င\u0002\u0006\u001b\u0007ည\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", zzhea.class, "zzi"});
            case 3:
                return new zzhec();
            case 4:
                return new zzheb(null);
            case 5:
                return zza;
            case 6:
                zzgzr zzgzrVar = zzb;
                if (zzgzrVar == null) {
                    synchronized (zzhec.class) {
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

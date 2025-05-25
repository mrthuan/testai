package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
@Deprecated
/* loaded from: classes2.dex */
public final class zzhcy extends zzgxy implements zzgzk {
    private static final zzhcy zza;
    private static volatile zzgzr zzb;
    private int zzc;
    private int zzd;
    private zzhcx zze;
    private zzhcx zzf;

    static {
        zzhcy zzhcyVar = new zzhcy();
        zza = zzhcyVar;
        zzgxy.zzcb(zzhcy.class, zzhcyVar);
    }

    private zzhcy() {
    }

    @Override // com.google.android.gms.internal.ads.zzgxy
    public final Object zzde(zzgxx zzgxxVar, Object obj, Object obj2) {
        switch (zzgxxVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return zzgxy.zzbS(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzc", "zzd", zzhcv.zza, "zze", "zzf"});
            case 3:
                return new zzhcy();
            case 4:
                return new zzhcu(null);
            case 5:
                return zza;
            case 6:
                zzgzr zzgzrVar = zzb;
                if (zzgzrVar == null) {
                    synchronized (zzhcy.class) {
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

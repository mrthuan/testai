package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzhbt extends zzgxy implements zzgzk {
    private static final zzhbt zza;
    private static volatile zzgzr zzb;
    private int zzc;
    private int zzd;
    private long zze;
    private zzgwm zzf = zzgwm.zzb;

    static {
        zzhbt zzhbtVar = new zzhbt();
        zza = zzhbtVar;
        zzgxy.zzcb(zzhbt.class, zzhbtVar);
    }

    private zzhbt() {
    }

    @Override // com.google.android.gms.internal.ads.zzgxy
    public final Object zzde(zzgxx zzgxxVar, Object obj, Object obj2) {
        switch (zzgxxVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return zzgxy.zzbS(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001\u0003ည\u0002", new Object[]{"zzc", "zzd", zzhbs.zza, "zze", "zzf"});
            case 3:
                return new zzhbt();
            case 4:
                return new zzhbr(null);
            case 5:
                return zza;
            case 6:
                zzgzr zzgzrVar = zzb;
                if (zzgzrVar == null) {
                    synchronized (zzhbt.class) {
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

package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzhco extends zzgxy implements zzgzk {
    private static final zzhco zza;
    private static volatile zzgzr zzb;
    private int zzc;
    private zzgwm zzd;
    private zzgwm zze;
    private zzgwm zzf;

    static {
        zzhco zzhcoVar = new zzhco();
        zza = zzhcoVar;
        zzgxy.zzcb(zzhco.class, zzhcoVar);
    }

    private zzhco() {
        zzgwm zzgwmVar = zzgwm.zzb;
        this.zzd = zzgwmVar;
        this.zze = zzgwmVar;
        this.zzf = zzgwmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgxy
    public final Object zzde(zzgxx zzgxxVar, Object obj, Object obj2) {
        switch (zzgxxVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return zzgxy.zzbS(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzc", "zzd", "zze", "zzf"});
            case 3:
                return new zzhco();
            case 4:
                return new zzhcn(null);
            case 5:
                return zza;
            case 6:
                zzgzr zzgzrVar = zzb;
                if (zzgzrVar == null) {
                    synchronized (zzhco.class) {
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

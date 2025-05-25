package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzhct extends zzgxy implements zzgzk {
    private static final zzhct zza;
    private static volatile zzgzr zzb;
    private int zzc;
    private zzhcs zzd;
    private zzgwm zzf;
    private zzgwm zzg;
    private int zzh;
    private zzgwm zzi;
    private byte zzj = 2;
    private zzgyk zze = zzgxy.zzbK();

    static {
        zzhct zzhctVar = new zzhct();
        zza = zzhctVar;
        zzgxy.zzcb(zzhct.class, zzhctVar);
    }

    private zzhct() {
        zzgwm zzgwmVar = zzgwm.zzb;
        this.zzf = zzgwmVar;
        this.zzg = zzgwmVar;
        this.zzi = zzgwmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgxy
    public final Object zzde(zzgxx zzgxxVar, Object obj, Object obj2) {
        byte b10 = 1;
        switch (zzgxxVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.zzj);
            case 1:
                if (obj == null) {
                    b10 = 0;
                }
                this.zzj = b10;
                return null;
            case 2:
                return zzgxy.zzbS(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003\u0006ည\u0004", new Object[]{"zzc", "zzd", "zze", zzhcl.class, "zzf", "zzg", "zzh", "zzi"});
            case 3:
                return new zzhct();
            case 4:
                return new zzhcq(null);
            case 5:
                return zza;
            case 6:
                zzgzr zzgzrVar = zzb;
                if (zzgzrVar == null) {
                    synchronized (zzhct.class) {
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

package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzhcb extends zzgxy implements zzgzk {
    private static final zzhcb zza;
    private static volatile zzgzr zzb;
    private int zzc;
    private String zzd = "";

    static {
        zzhcb zzhcbVar = new zzhcb();
        zza = zzhcbVar;
        zzgxy.zzcb(zzhcb.class, zzhcbVar);
    }

    private zzhcb() {
    }

    public static zzhca zzc() {
        return (zzhca) zza.zzaZ();
    }

    public static /* synthetic */ zzhcb zzd() {
        return zza;
    }

    public static /* synthetic */ void zze(zzhcb zzhcbVar, String str) {
        zzhcbVar.zzc |= 1;
        zzhcbVar.zzd = str;
    }

    @Override // com.google.android.gms.internal.ads.zzgxy
    public final Object zzde(zzgxx zzgxxVar, Object obj, Object obj2) {
        switch (zzgxxVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return zzgxy.zzbS(zza, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzc", "zzd"});
            case 3:
                return new zzhcb();
            case 4:
                return new zzhca(null);
            case 5:
                return zza;
            case 6:
                zzgzr zzgzrVar = zzb;
                if (zzgzrVar == null) {
                    synchronized (zzhcb.class) {
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

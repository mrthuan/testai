package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgrv extends zzgxy implements zzgzk {
    private static final zzgrv zza;
    private static volatile zzgzr zzb;
    private int zzc;
    private int zzd;

    static {
        zzgrv zzgrvVar = new zzgrv();
        zza = zzgrvVar;
        zzgxy.zzcb(zzgrv.class, zzgrvVar);
    }

    private zzgrv() {
    }

    public static zzgru zzd() {
        return (zzgru) zza.zzaZ();
    }

    public static zzgrv zzf(zzgwm zzgwmVar, zzgxi zzgxiVar) {
        return (zzgrv) zzgxy.zzbr(zza, zzgwmVar, zzgxiVar);
    }

    public final int zza() {
        return this.zzc;
    }

    public final int zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgxy
    public final Object zzde(zzgxx zzgxxVar, Object obj, Object obj2) {
        switch (zzgxxVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return zzgxy.zzbS(zza, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zzc", "zzd"});
            case 3:
                return new zzgrv();
            case 4:
                return new zzgru(null);
            case 5:
                return zza;
            case 6:
                zzgzr zzgzrVar = zzb;
                if (zzgzrVar == null) {
                    synchronized (zzgrv.class) {
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

package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzass extends zzgxy implements zzgzk {
    private static final zzass zza;
    private static volatile zzgzr zzb;
    private int zzc;
    private long zzd;
    private String zze = "";
    private zzgwm zzf = zzgwm.zzb;

    static {
        zzass zzassVar = new zzass();
        zza = zzassVar;
        zzgxy.zzcb(zzass.class, zzassVar);
    }

    private zzass() {
    }

    public static zzass zzd() {
        return zza;
    }

    public final long zza() {
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
                return zzgxy.zzbS(zza, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"zzc", "zzd", "zze", "zzf"});
            case 3:
                return new zzass();
            case 4:
                return new zzasr(null);
            case 5:
                return zza;
            case 6:
                zzgzr zzgzrVar = zzb;
                if (zzgzrVar == null) {
                    synchronized (zzass.class) {
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

    public final boolean zze() {
        if ((this.zzc & 1) != 0) {
            return true;
        }
        return false;
    }
}

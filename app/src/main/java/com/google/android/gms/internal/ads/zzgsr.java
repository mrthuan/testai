package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgsr extends zzgxy implements zzgzk {
    private static final zzgsr zza;
    private static volatile zzgzr zzb;
    private int zzc;
    private int zzd;

    static {
        zzgsr zzgsrVar = new zzgsr();
        zza = zzgsrVar;
        zzgxy.zzcb(zzgsr.class, zzgsrVar);
    }

    private zzgsr() {
    }

    public static zzgsq zzd() {
        return (zzgsq) zza.zzaZ();
    }

    public static zzgsr zzf() {
        return zza;
    }

    public final int zza() {
        return this.zzd;
    }

    public final zzgsi zzc() {
        zzgsi zzgsiVar;
        int i10 = this.zzc;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 5) {
                                zzgsiVar = null;
                            } else {
                                zzgsiVar = zzgsi.SHA224;
                            }
                        } else {
                            zzgsiVar = zzgsi.SHA512;
                        }
                    } else {
                        zzgsiVar = zzgsi.SHA256;
                    }
                } else {
                    zzgsiVar = zzgsi.SHA384;
                }
            } else {
                zzgsiVar = zzgsi.SHA1;
            }
        } else {
            zzgsiVar = zzgsi.UNKNOWN_HASH;
        }
        if (zzgsiVar == null) {
            return zzgsi.UNRECOGNIZED;
        }
        return zzgsiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgxy
    public final Object zzde(zzgxx zzgxxVar, Object obj, Object obj2) {
        switch (zzgxxVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return zzgxy.zzbS(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zzc", "zzd"});
            case 3:
                return new zzgsr();
            case 4:
                return new zzgsq(null);
            case 5:
                return zza;
            case 6:
                zzgzr zzgzrVar = zzb;
                if (zzgzrVar == null) {
                    synchronized (zzgsr.class) {
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

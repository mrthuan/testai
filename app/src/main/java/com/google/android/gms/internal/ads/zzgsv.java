package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgsv extends zzgxy implements zzgzk {
    private static final zzgsv zza;
    private static volatile zzgzr zzb;
    private String zzc = "";
    private zzgwm zzd = zzgwm.zzb;
    private int zze;

    static {
        zzgsv zzgsvVar = new zzgsv();
        zza = zzgsvVar;
        zzgxy.zzcb(zzgsv.class, zzgsvVar);
    }

    private zzgsv() {
    }

    public static zzgst zza() {
        return (zzgst) zza.zzaZ();
    }

    public static zzgsv zze() {
        return zza;
    }

    public static /* synthetic */ void zzh(zzgsv zzgsvVar, String str) {
        str.getClass();
        zzgsvVar.zzc = str;
    }

    public static /* synthetic */ void zzi(zzgsv zzgsvVar, zzgwm zzgwmVar) {
        zzgwmVar.getClass();
        zzgsvVar.zzd = zzgwmVar;
    }

    public final zzgsu zzc() {
        zzgsu zzgsuVar;
        int i10 = this.zze;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            zzgsuVar = null;
                        } else {
                            zzgsuVar = zzgsu.REMOTE;
                        }
                    } else {
                        zzgsuVar = zzgsu.ASYMMETRIC_PUBLIC;
                    }
                } else {
                    zzgsuVar = zzgsu.ASYMMETRIC_PRIVATE;
                }
            } else {
                zzgsuVar = zzgsu.SYMMETRIC;
            }
        } else {
            zzgsuVar = zzgsu.UNKNOWN_KEYMATERIAL;
        }
        if (zzgsuVar == null) {
            return zzgsu.UNRECOGNIZED;
        }
        return zzgsuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgxy
    public final Object zzde(zzgxx zzgxxVar, Object obj, Object obj2) {
        switch (zzgxxVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return zzgxy.zzbS(zza, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzc", "zzd", "zze"});
            case 3:
                return new zzgsv();
            case 4:
                return new zzgst(null);
            case 5:
                return zza;
            case 6:
                zzgzr zzgzrVar = zzb;
                if (zzgzrVar == null) {
                    synchronized (zzgsv.class) {
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

    public final zzgwm zzf() {
        return this.zzd;
    }

    public final String zzg() {
        return this.zzc;
    }
}

package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgtg extends zzgxy implements zzgzk {
    private static final zzgtg zza;
    private static volatile zzgzr zzb;
    private int zzc;
    private zzgsv zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        zzgtg zzgtgVar = new zzgtg();
        zza = zzgtgVar;
        zzgxy.zzcb(zzgtg.class, zzgtgVar);
    }

    private zzgtg() {
    }

    public static zzgtf zzd() {
        return (zzgtf) zza.zzaZ();
    }

    public static /* synthetic */ void zzg(zzgtg zzgtgVar, zzgsv zzgsvVar) {
        zzgsvVar.getClass();
        zzgtgVar.zzd = zzgsvVar;
        zzgtgVar.zzc |= 1;
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzgsv zzc() {
        zzgsv zzgsvVar = this.zzd;
        if (zzgsvVar == null) {
            return zzgsv.zze();
        }
        return zzgsvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgxy
    public final Object zzde(zzgxx zzgxxVar, Object obj, Object obj2) {
        switch (zzgxxVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return zzgxy.zzbS(zza, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
            case 3:
                return new zzgtg();
            case 4:
                return new zzgtf(null);
            case 5:
                return zza;
            case 6:
                zzgzr zzgzrVar = zzb;
                if (zzgzrVar == null) {
                    synchronized (zzgtg.class) {
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

    public final zzgtz zzf() {
        zzgtz zzb2 = zzgtz.zzb(this.zzg);
        if (zzb2 == null) {
            return zzgtz.UNRECOGNIZED;
        }
        return zzb2;
    }

    public final boolean zzj() {
        if ((this.zzc & 1) != 0) {
            return true;
        }
        return false;
    }

    public final int zzk() {
        int i10 = this.zze;
        int i11 = 2;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        i11 = 0;
                    } else {
                        i11 = 5;
                    }
                } else {
                    i11 = 4;
                }
            } else {
                i11 = 3;
            }
        }
        if (i11 == 0) {
            return 1;
        }
        return i11;
    }
}

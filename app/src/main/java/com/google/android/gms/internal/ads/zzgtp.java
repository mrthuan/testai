package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgtp extends zzgxy implements zzgzk {
    private static final zzgtp zza;
    private static volatile zzgzr zzb;
    private int zzc;
    private int zzd;
    private zzgts zze;

    static {
        zzgtp zzgtpVar = new zzgtp();
        zza = zzgtpVar;
        zzgxy.zzcb(zzgtp.class, zzgtpVar);
    }

    private zzgtp() {
    }

    public static zzgto zzc() {
        return (zzgto) zza.zzaZ();
    }

    public static zzgtp zze(zzgwm zzgwmVar, zzgxi zzgxiVar) {
        return (zzgtp) zzgxy.zzbr(zza, zzgwmVar, zzgxiVar);
    }

    public static zzgzr zzg() {
        return zza.zzbN();
    }

    public static /* synthetic */ void zzh(zzgtp zzgtpVar, zzgts zzgtsVar) {
        zzgtsVar.getClass();
        zzgtpVar.zze = zzgtsVar;
        zzgtpVar.zzc |= 1;
    }

    public final int zza() {
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
                return zzgxy.zzbS(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zzc", "zzd", "zze"});
            case 3:
                return new zzgtp();
            case 4:
                return new zzgto(null);
            case 5:
                return zza;
            case 6:
                zzgzr zzgzrVar = zzb;
                if (zzgzrVar == null) {
                    synchronized (zzgtp.class) {
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

    public final zzgts zzf() {
        zzgts zzgtsVar = this.zze;
        if (zzgtsVar == null) {
            return zzgts.zzd();
        }
        return zzgtsVar;
    }
}

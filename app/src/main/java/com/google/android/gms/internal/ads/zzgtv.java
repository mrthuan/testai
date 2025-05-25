package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgtv extends zzgxy implements zzgzk {
    private static final zzgtv zza;
    private static volatile zzgzr zzb;
    private int zzc;
    private int zzd;
    private zzgty zze;

    static {
        zzgtv zzgtvVar = new zzgtv();
        zza = zzgtvVar;
        zzgxy.zzcb(zzgtv.class, zzgtvVar);
    }

    private zzgtv() {
    }

    public static zzgtu zzc() {
        return (zzgtu) zza.zzaZ();
    }

    public static zzgtv zze(zzgwm zzgwmVar, zzgxi zzgxiVar) {
        return (zzgtv) zzgxy.zzbr(zza, zzgwmVar, zzgxiVar);
    }

    public static zzgzr zzg() {
        return zza.zzbN();
    }

    public static /* synthetic */ void zzh(zzgtv zzgtvVar, zzgty zzgtyVar) {
        zzgtyVar.getClass();
        zzgtvVar.zze = zzgtyVar;
        zzgtvVar.zzc |= 1;
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
                return new zzgtv();
            case 4:
                return new zzgtu(null);
            case 5:
                return zza;
            case 6:
                zzgzr zzgzrVar = zzb;
                if (zzgzrVar == null) {
                    synchronized (zzgtv.class) {
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

    public final zzgty zzf() {
        zzgty zzgtyVar = this.zze;
        if (zzgtyVar == null) {
            return zzgty.zze();
        }
        return zzgtyVar;
    }
}

package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgts extends zzgxy implements zzgzk {
    private static final zzgts zza;
    private static volatile zzgzr zzb;
    private String zzc = "";

    static {
        zzgts zzgtsVar = new zzgts();
        zza = zzgtsVar;
        zzgxy.zzcb(zzgts.class, zzgtsVar);
    }

    private zzgts() {
    }

    public static zzgtr zza() {
        return (zzgtr) zza.zzaZ();
    }

    public static zzgts zzd() {
        return zza;
    }

    public static zzgts zze(zzgwm zzgwmVar, zzgxi zzgxiVar) {
        return (zzgts) zzgxy.zzbr(zza, zzgwmVar, zzgxiVar);
    }

    public static /* synthetic */ void zzg(zzgts zzgtsVar, String str) {
        str.getClass();
        zzgtsVar.zzc = str;
    }

    @Override // com.google.android.gms.internal.ads.zzgxy
    public final Object zzde(zzgxx zzgxxVar, Object obj, Object obj2) {
        switch (zzgxxVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return zzgxy.zzbS(zza, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zzc"});
            case 3:
                return new zzgts();
            case 4:
                return new zzgtr(null);
            case 5:
                return zza;
            case 6:
                zzgzr zzgzrVar = zzb;
                if (zzgzrVar == null) {
                    synchronized (zzgts.class) {
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

    public final String zzf() {
        return this.zzc;
    }
}

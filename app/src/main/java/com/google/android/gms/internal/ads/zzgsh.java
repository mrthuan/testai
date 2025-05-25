package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgsh extends zzgxy implements zzgzk {
    private static final zzgsh zza;
    private static volatile zzgzr zzb;

    static {
        zzgsh zzgshVar = new zzgsh();
        zza = zzgshVar;
        zzgxy.zzcb(zzgsh.class, zzgshVar);
    }

    private zzgsh() {
    }

    public static zzgsh zzc() {
        return zza;
    }

    public static zzgsh zzd(zzgwm zzgwmVar, zzgxi zzgxiVar) {
        return (zzgsh) zzgxy.zzbr(zza, zzgwmVar, zzgxiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgxy
    public final Object zzde(zzgxx zzgxxVar, Object obj, Object obj2) {
        switch (zzgxxVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return zzgxy.zzbS(zza, "\u0000\u0000", null);
            case 3:
                return new zzgsh();
            case 4:
                return new zzgsg(null);
            case 5:
                return zza;
            case 6:
                zzgzr zzgzrVar = zzb;
                if (zzgzrVar == null) {
                    synchronized (zzgsh.class) {
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

package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgqo extends zzgxy implements zzgzk {
    private static final zzgqo zza;
    private static volatile zzgzr zzb;
    private int zzc;
    private int zzd;
    private zzgqr zze;

    static {
        zzgqo zzgqoVar = new zzgqo();
        zza = zzgqoVar;
        zzgxy.zzcb(zzgqo.class, zzgqoVar);
    }

    private zzgqo() {
    }

    public static zzgqn zzc() {
        return (zzgqn) zza.zzaZ();
    }

    public static zzgqo zze(zzgwm zzgwmVar, zzgxi zzgxiVar) {
        return (zzgqo) zzgxy.zzbr(zza, zzgwmVar, zzgxiVar);
    }

    public static /* synthetic */ void zzh(zzgqo zzgqoVar, zzgqr zzgqrVar) {
        zzgqrVar.getClass();
        zzgqoVar.zze = zzgqrVar;
        zzgqoVar.zzc |= 1;
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
                return new zzgqo();
            case 4:
                return new zzgqn(null);
            case 5:
                return zza;
            case 6:
                zzgzr zzgzrVar = zzb;
                if (zzgzrVar == null) {
                    synchronized (zzgqo.class) {
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

    public final zzgqr zzf() {
        zzgqr zzgqrVar = this.zze;
        if (zzgqrVar == null) {
            return zzgqr.zze();
        }
        return zzgqrVar;
    }
}

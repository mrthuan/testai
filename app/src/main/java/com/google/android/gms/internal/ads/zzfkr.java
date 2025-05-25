package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzfkr extends zzgxy implements zzgzk {
    private static final zzfkr zza;
    private static volatile zzgzr zzb;
    private zzgyk zzc = zzgxy.zzbK();

    static {
        zzfkr zzfkrVar = new zzfkr();
        zza = zzfkrVar;
        zzgxy.zzcb(zzfkr.class, zzfkrVar);
    }

    private zzfkr() {
    }

    public static zzfko zzc() {
        return (zzfko) zza.zzaZ();
    }

    public static /* synthetic */ zzfkr zzd() {
        return zza;
    }

    public static /* synthetic */ void zze(zzfkr zzfkrVar) {
        zzfkrVar.zzc = zzgxy.zzbK();
    }

    public static /* synthetic */ void zzf(zzfkr zzfkrVar, zzfkq zzfkqVar) {
        zzfkqVar.getClass();
        zzgyk zzgykVar = zzfkrVar.zzc;
        if (!zzgykVar.zzc()) {
            zzfkrVar.zzc = zzgxy.zzbL(zzgykVar);
        }
        zzfkrVar.zzc.add(zzfkqVar);
    }

    public final int zza() {
        return this.zzc.size();
    }

    @Override // com.google.android.gms.internal.ads.zzgxy
    public final Object zzde(zzgxx zzgxxVar, Object obj, Object obj2) {
        switch (zzgxxVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return zzgxy.zzbS(zza, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzc", zzfkq.class});
            case 3:
                return new zzfkr();
            case 4:
                return new zzfko(null);
            case 5:
                return zza;
            case 6:
                zzgzr zzgzrVar = zzb;
                if (zzgzrVar == null) {
                    synchronized (zzfkr.class) {
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

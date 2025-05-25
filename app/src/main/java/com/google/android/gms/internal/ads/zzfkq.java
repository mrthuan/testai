package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzfkq extends zzgxy implements zzgzk {
    private static final zzfkq zza;
    private static volatile zzgzr zzb;
    private int zzc;
    private zzfkm zzd;

    static {
        zzfkq zzfkqVar = new zzfkq();
        zza = zzfkqVar;
        zzgxy.zzcb(zzfkq.class, zzfkqVar);
    }

    private zzfkq() {
    }

    public static zzfkp zza() {
        return (zzfkp) zza.zzaZ();
    }

    public static /* synthetic */ zzfkq zzc() {
        return zza;
    }

    public static /* synthetic */ void zzd(zzfkq zzfkqVar, zzfkm zzfkmVar) {
        zzfkmVar.getClass();
        zzfkqVar.zzd = zzfkmVar;
        zzfkqVar.zzc |= 1;
    }

    @Override // com.google.android.gms.internal.ads.zzgxy
    public final Object zzde(zzgxx zzgxxVar, Object obj, Object obj2) {
        switch (zzgxxVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return zzgxy.zzbS(zza, "\u0000\u0001\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0000\u0006ဉ\u0000", new Object[]{"zzc", "zzd"});
            case 3:
                return new zzfkq();
            case 4:
                return new zzfkp(null);
            case 5:
                return zza;
            case 6:
                zzgzr zzgzrVar = zzb;
                if (zzgzrVar == null) {
                    synchronized (zzfkq.class) {
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

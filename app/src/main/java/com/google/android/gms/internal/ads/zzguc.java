package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
@Deprecated
/* loaded from: classes2.dex */
public final class zzguc extends zzgxy implements zzgzk {
    public static final /* synthetic */ int zza = 0;
    private static final zzguc zzb;
    private static volatile zzgzr zzc;
    private String zzd = "";
    private zzgyk zze = zzgxy.zzbK();

    static {
        zzguc zzgucVar = new zzguc();
        zzb = zzgucVar;
        zzgxy.zzcb(zzguc.class, zzgucVar);
    }

    private zzguc() {
    }

    @Override // com.google.android.gms.internal.ads.zzgxy
    public final Object zzde(zzgxx zzgxxVar, Object obj, Object obj2) {
        switch (zzgxxVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return zzgxy.zzbS(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zzd", "zze", zzgtc.class});
            case 3:
                return new zzguc();
            case 4:
                return new zzgub(null);
            case 5:
                return zzb;
            case 6:
                zzgzr zzgzrVar = zzc;
                if (zzgzrVar == null) {
                    synchronized (zzguc.class) {
                        zzgzrVar = zzc;
                        if (zzgzrVar == null) {
                            zzgzrVar = new zzgxt(zzb);
                            zzc = zzgzrVar;
                        }
                    }
                }
                return zzgzrVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgtm extends zzgxy implements zzgzk {
    private static final zzgtm zza;
    private static volatile zzgzr zzb;
    private int zzc;
    private zzgyk zzd = zzgxy.zzbK();

    static {
        zzgtm zzgtmVar = new zzgtm();
        zza = zzgtmVar;
        zzgxy.zzcb(zzgtm.class, zzgtmVar);
    }

    private zzgtm() {
    }

    public static zzgtj zza() {
        return (zzgtj) zza.zzaZ();
    }

    public static /* synthetic */ zzgtm zzc() {
        return zza;
    }

    public static /* synthetic */ void zzd(zzgtm zzgtmVar, int i10) {
        zzgtmVar.zzc = i10;
    }

    public static /* synthetic */ void zze(zzgtm zzgtmVar, zzgtl zzgtlVar) {
        zzgtlVar.getClass();
        zzgyk zzgykVar = zzgtmVar.zzd;
        if (!zzgykVar.zzc()) {
            zzgtmVar.zzd = zzgxy.zzbL(zzgykVar);
        }
        zzgtmVar.zzd.add(zzgtlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgxy
    public final Object zzde(zzgxx zzgxxVar, Object obj, Object obj2) {
        switch (zzgxxVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return zzgxy.zzbS(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzc", "zzd", zzgtl.class});
            case 3:
                return new zzgtm();
            case 4:
                return new zzgtj(null);
            case 5:
                return zza;
            case 6:
                zzgzr zzgzrVar = zzb;
                if (zzgzrVar == null) {
                    synchronized (zzgtm.class) {
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

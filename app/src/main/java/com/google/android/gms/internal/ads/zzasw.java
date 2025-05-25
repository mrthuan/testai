package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzasw extends zzgxy implements zzgzk {
    private static final zzasw zza;
    private static volatile zzgzr zzb;
    private int zzc;
    private zzgyk zzd = zzgxy.zzbK();
    private zzgwm zze = zzgwm.zzb;
    private int zzf = 1;
    private int zzg = 1;

    static {
        zzasw zzaswVar = new zzasw();
        zza = zzaswVar;
        zzgxy.zzcb(zzasw.class, zzaswVar);
    }

    private zzasw() {
    }

    public static zzasv zza() {
        return (zzasv) zza.zzaZ();
    }

    public static /* synthetic */ void zzd(zzasw zzaswVar, zzgwm zzgwmVar) {
        zzgyk zzgykVar = zzaswVar.zzd;
        if (!zzgykVar.zzc()) {
            zzaswVar.zzd = zzgxy.zzbL(zzgykVar);
        }
        zzaswVar.zzd.add(zzgwmVar);
    }

    public static /* synthetic */ void zze(zzasw zzaswVar, zzgwm zzgwmVar) {
        zzaswVar.zzc |= 1;
        zzaswVar.zze = zzgwmVar;
    }

    public static /* synthetic */ void zzf(zzasw zzaswVar, int i10) {
        zzaswVar.zzg = 4;
        zzaswVar.zzc = 4 | zzaswVar.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgxy
    public final Object zzde(zzgxx zzgxxVar, Object obj, Object obj2) {
        switch (zzgxxVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return zzgxy.zzbS(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000\u0003᠌\u0001\u0004᠌\u0002", new Object[]{"zzc", "zzd", "zze", "zzf", zzasq.zza, "zzg", zzaso.zza});
            case 3:
                return new zzasw();
            case 4:
                return new zzasv(null);
            case 5:
                return zza;
            case 6:
                zzgzr zzgzrVar = zzb;
                if (zzgzrVar == null) {
                    synchronized (zzasw.class) {
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

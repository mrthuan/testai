package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgtl extends zzgxy implements zzgzk {
    private static final zzgtl zza;
    private static volatile zzgzr zzb;
    private String zzc = "";
    private int zzd;
    private int zze;
    private int zzf;

    static {
        zzgtl zzgtlVar = new zzgtl();
        zza = zzgtlVar;
        zzgxy.zzcb(zzgtl.class, zzgtlVar);
    }

    private zzgtl() {
    }

    public static zzgtk zza() {
        return (zzgtk) zza.zzaZ();
    }

    public static /* synthetic */ zzgtl zzc() {
        return zza;
    }

    public static /* synthetic */ void zzd(zzgtl zzgtlVar, String str) {
        str.getClass();
        zzgtlVar.zzc = str;
    }

    public static /* synthetic */ void zze(zzgtl zzgtlVar, zzgtz zzgtzVar) {
        zzgtlVar.zzf = zzgtzVar.zza();
    }

    public static /* synthetic */ void zzf(zzgtl zzgtlVar, int i10) {
        zzgtlVar.zze = i10;
    }

    public static /* synthetic */ void zzg(zzgtl zzgtlVar, int i10) {
        zzgtlVar.zzd = zzgsw.zza(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzgxy
    public final Object zzde(zzgxx zzgxxVar, Object obj, Object obj2) {
        switch (zzgxxVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return zzgxy.zzbS(zza, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzc", "zzd", "zze", "zzf"});
            case 3:
                return new zzgtl();
            case 4:
                return new zzgtk(null);
            case 5:
                return zza;
            case 6:
                zzgzr zzgzrVar = zzb;
                if (zzgzrVar == null) {
                    synchronized (zzgtl.class) {
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

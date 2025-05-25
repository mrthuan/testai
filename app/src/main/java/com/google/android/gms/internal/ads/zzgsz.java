package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgsz extends zzgxy implements zzgzk {
    private static final zzgsz zza;
    private static volatile zzgzr zzb;
    private String zzc = "";
    private zzgwm zzd = zzgwm.zzb;
    private int zze;

    static {
        zzgsz zzgszVar = new zzgsz();
        zza = zzgszVar;
        zzgxy.zzcb(zzgsz.class, zzgszVar);
    }

    private zzgsz() {
    }

    public static zzgsy zza() {
        return (zzgsy) zza.zzaZ();
    }

    public static zzgsy zzc(zzgsz zzgszVar) {
        return (zzgsy) zza.zzba(zzgszVar);
    }

    public static zzgsz zze() {
        return zza;
    }

    public static zzgsz zzf(byte[] bArr, zzgxi zzgxiVar) {
        return (zzgsz) zzgxy.zzbx(zza, bArr, zzgxiVar);
    }

    public static /* synthetic */ void zzj(zzgsz zzgszVar, String str) {
        str.getClass();
        zzgszVar.zzc = str;
    }

    public static /* synthetic */ void zzk(zzgsz zzgszVar, zzgwm zzgwmVar) {
        zzgwmVar.getClass();
        zzgszVar.zzd = zzgwmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgxy
    public final Object zzde(zzgxx zzgxxVar, Object obj, Object obj2) {
        switch (zzgxxVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return zzgxy.zzbS(zza, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzc", "zzd", "zze"});
            case 3:
                return new zzgsz();
            case 4:
                return new zzgsy(null);
            case 5:
                return zza;
            case 6:
                zzgzr zzgzrVar = zzb;
                if (zzgzrVar == null) {
                    synchronized (zzgsz.class) {
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

    public final zzgtz zzg() {
        zzgtz zzb2 = zzgtz.zzb(this.zze);
        if (zzb2 == null) {
            return zzgtz.UNRECOGNIZED;
        }
        return zzb2;
    }

    public final zzgwm zzh() {
        return this.zzd;
    }

    public final String zzi() {
        return this.zzc;
    }
}

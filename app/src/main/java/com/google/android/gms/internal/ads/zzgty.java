package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgty extends zzgxy implements zzgzk {
    private static final zzgty zza;
    private static volatile zzgzr zzb;
    private int zzc;
    private String zzd = "";
    private zzgsz zze;

    static {
        zzgty zzgtyVar = new zzgty();
        zza = zzgtyVar;
        zzgxy.zzcb(zzgty.class, zzgtyVar);
    }

    private zzgty() {
    }

    public static zzgtx zzc() {
        return (zzgtx) zza.zzaZ();
    }

    public static zzgty zze() {
        return zza;
    }

    public static zzgty zzf(zzgwm zzgwmVar, zzgxi zzgxiVar) {
        return (zzgty) zzgxy.zzbr(zza, zzgwmVar, zzgxiVar);
    }

    public static /* synthetic */ void zzh(zzgty zzgtyVar, String str) {
        str.getClass();
        zzgtyVar.zzd = str;
    }

    public static /* synthetic */ void zzi(zzgty zzgtyVar, zzgsz zzgszVar) {
        zzgszVar.getClass();
        zzgtyVar.zze = zzgszVar;
        zzgtyVar.zzc |= 1;
    }

    public final zzgsz zza() {
        zzgsz zzgszVar = this.zze;
        if (zzgszVar == null) {
            return zzgsz.zze();
        }
        return zzgszVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgxy
    public final Object zzde(zzgxx zzgxxVar, Object obj, Object obj2) {
        switch (zzgxxVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return zzgxy.zzbS(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"zzc", "zzd", "zze"});
            case 3:
                return new zzgty();
            case 4:
                return new zzgtx(null);
            case 5:
                return zza;
            case 6:
                zzgzr zzgzrVar = zzb;
                if (zzgzrVar == null) {
                    synchronized (zzgty.class) {
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

    public final String zzg() {
        return this.zzd;
    }
}

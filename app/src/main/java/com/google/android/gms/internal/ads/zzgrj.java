package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgrj extends zzgxy implements zzgzk {
    private static final zzgrj zza;
    private static volatile zzgzr zzb;
    private int zzc;
    private int zzd;
    private zzgrp zze;
    private zzgwm zzf = zzgwm.zzb;

    static {
        zzgrj zzgrjVar = new zzgrj();
        zza = zzgrjVar;
        zzgxy.zzcb(zzgrj.class, zzgrjVar);
    }

    private zzgrj() {
    }

    public static zzgri zzc() {
        return (zzgri) zza.zzaZ();
    }

    public static zzgrj zze(zzgwm zzgwmVar, zzgxi zzgxiVar) {
        return (zzgrj) zzgxy.zzbr(zza, zzgwmVar, zzgxiVar);
    }

    public static zzgzr zzh() {
        return zza.zzbN();
    }

    public static /* synthetic */ void zzi(zzgrj zzgrjVar, zzgrp zzgrpVar) {
        zzgrpVar.getClass();
        zzgrjVar.zze = zzgrpVar;
        zzgrjVar.zzc |= 1;
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
                return zzgxy.zzbS(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zzc", "zzd", "zze", "zzf"});
            case 3:
                return new zzgrj();
            case 4:
                return new zzgri(null);
            case 5:
                return zza;
            case 6:
                zzgzr zzgzrVar = zzb;
                if (zzgzrVar == null) {
                    synchronized (zzgrj.class) {
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

    public final zzgrp zzf() {
        zzgrp zzgrpVar = this.zze;
        if (zzgrpVar == null) {
            return zzgrp.zze();
        }
        return zzgrpVar;
    }

    public final zzgwm zzg() {
        return this.zzf;
    }
}

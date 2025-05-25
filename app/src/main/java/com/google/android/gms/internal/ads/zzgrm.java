package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgrm extends zzgxy implements zzgzk {
    private static final zzgrm zza;
    private static volatile zzgzr zzb;
    private int zzc;
    private zzgrp zzd;
    private int zze;

    static {
        zzgrm zzgrmVar = new zzgrm();
        zza = zzgrmVar;
        zzgxy.zzcb(zzgrm.class, zzgrmVar);
    }

    private zzgrm() {
    }

    public static zzgrl zzc() {
        return (zzgrl) zza.zzaZ();
    }

    public static zzgrm zze(zzgwm zzgwmVar, zzgxi zzgxiVar) {
        return (zzgrm) zzgxy.zzbr(zza, zzgwmVar, zzgxiVar);
    }

    public static /* synthetic */ void zzg(zzgrm zzgrmVar, zzgrp zzgrpVar) {
        zzgrpVar.getClass();
        zzgrmVar.zzd = zzgrpVar;
        zzgrmVar.zzc |= 1;
    }

    public final int zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzgxy
    public final Object zzde(zzgxx zzgxxVar, Object obj, Object obj2) {
        switch (zzgxxVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return zzgxy.zzbS(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zzc", "zzd", "zze"});
            case 3:
                return new zzgrm();
            case 4:
                return new zzgrl(null);
            case 5:
                return zza;
            case 6:
                zzgzr zzgzrVar = zzb;
                if (zzgzrVar == null) {
                    synchronized (zzgrm.class) {
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
        zzgrp zzgrpVar = this.zzd;
        if (zzgrpVar == null) {
            return zzgrp.zze();
        }
        return zzgrpVar;
    }
}

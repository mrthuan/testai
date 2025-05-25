package com.google.android.gms.internal.ads;

import lib.zj.office.fc.openxml4j.opc.ContentTypes;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzhdj extends zzgxy implements zzgzk {
    private static final zzhdj zza;
    private static volatile zzgzr zzb;
    private int zzc;
    private int zzd;
    private String zze = "";
    private zzgwm zzf;
    private zzgwm zzg;

    static {
        zzhdj zzhdjVar = new zzhdj();
        zza = zzhdjVar;
        zzgxy.zzcb(zzhdj.class, zzhdjVar);
    }

    private zzhdj() {
        zzgwm zzgwmVar = zzgwm.zzb;
        this.zzf = zzgwmVar;
        this.zzg = zzgwmVar;
    }

    public static zzhdh zzc() {
        return (zzhdh) zza.zzaZ();
    }

    public static /* synthetic */ zzhdj zzd() {
        return zza;
    }

    public static /* synthetic */ void zze(zzhdj zzhdjVar, String str) {
        zzhdjVar.zzc |= 2;
        zzhdjVar.zze = ContentTypes.IMAGE_PNG;
    }

    public static /* synthetic */ void zzf(zzhdj zzhdjVar, zzgwm zzgwmVar) {
        zzgwmVar.getClass();
        zzhdjVar.zzc |= 4;
        zzhdjVar.zzf = zzgwmVar;
    }

    public static /* synthetic */ void zzg(zzhdj zzhdjVar, int i10) {
        zzhdjVar.zzd = 1;
        zzhdjVar.zzc = 1 | zzhdjVar.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgxy
    public final Object zzde(zzgxx zzgxxVar, Object obj, Object obj2) {
        switch (zzgxxVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return zzgxy.zzbS(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zzc", "zzd", zzhdi.zza, "zze", "zzf", "zzg"});
            case 3:
                return new zzhdj();
            case 4:
                return new zzhdh(null);
            case 5:
                return zza;
            case 6:
                zzgzr zzgzrVar = zzb;
                if (zzgzrVar == null) {
                    synchronized (zzhdj.class) {
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

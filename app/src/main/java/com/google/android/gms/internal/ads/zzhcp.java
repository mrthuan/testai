package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzhcp extends zzgxy implements zzgzk {
    private static final zzhcp zza;
    private static volatile zzgzr zzb;
    private int zzc;
    private zzhco zzd;
    private zzgwm zzf;
    private zzgwm zzg;
    private int zzh;
    private byte zzi = 2;
    private zzgyk zze = zzgxy.zzbK();

    static {
        zzhcp zzhcpVar = new zzhcp();
        zza = zzhcpVar;
        zzgxy.zzcb(zzhcp.class, zzhcpVar);
    }

    private zzhcp() {
        zzgwm zzgwmVar = zzgwm.zzb;
        this.zzf = zzgwmVar;
        this.zzg = zzgwmVar;
    }

    public static zzhcm zzc() {
        return (zzhcm) zza.zzaZ();
    }

    public static /* synthetic */ void zze(zzhcp zzhcpVar, zzhcl zzhclVar) {
        zzhclVar.getClass();
        zzgyk zzgykVar = zzhcpVar.zze;
        if (!zzgykVar.zzc()) {
            zzhcpVar.zze = zzgxy.zzbL(zzgykVar);
        }
        zzhcpVar.zze.add(zzhclVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgxy
    public final Object zzde(zzgxx zzgxxVar, Object obj, Object obj2) {
        byte b10 = 1;
        switch (zzgxxVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.zzi);
            case 1:
                if (obj == null) {
                    b10 = 0;
                }
                this.zzi = b10;
                return null;
            case 2:
                return zzgxy.zzbS(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003", new Object[]{"zzc", "zzd", "zze", zzhcl.class, "zzf", "zzg", "zzh"});
            case 3:
                return new zzhcp();
            case 4:
                return new zzhcm(null);
            case 5:
                return zza;
            case 6:
                zzgzr zzgzrVar = zzb;
                if (zzgzrVar == null) {
                    synchronized (zzhcp.class) {
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

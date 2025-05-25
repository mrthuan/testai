package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzhdo extends zzgxy implements zzgzk {
    private static final zzhdo zza;
    private static volatile zzgzr zzb;
    private int zzc;
    private int zzd;
    private zzhcp zzf;
    private zzhct zzg;
    private int zzh;
    private int zzk;
    private byte zzm = 2;
    private String zze = "";
    private zzgyg zzi = zzgxy.zzbG();
    private String zzj = "";
    private zzgyk zzl = zzgxy.zzbK();

    static {
        zzhdo zzhdoVar = new zzhdo();
        zza = zzhdoVar;
        zzgxy.zzcb(zzhdo.class, zzhdoVar);
    }

    private zzhdo() {
    }

    public static zzhdn zzd() {
        return (zzhdn) zza.zzaZ();
    }

    public static /* synthetic */ void zzg(zzhdo zzhdoVar, int i10) {
        zzhdoVar.zzc |= 1;
        zzhdoVar.zzd = i10;
    }

    public static /* synthetic */ void zzh(zzhdo zzhdoVar, String str) {
        str.getClass();
        zzhdoVar.zzc |= 2;
        zzhdoVar.zze = str;
    }

    public static /* synthetic */ void zzi(zzhdo zzhdoVar, zzhcp zzhcpVar) {
        zzhcpVar.getClass();
        zzhdoVar.zzf = zzhcpVar;
        zzhdoVar.zzc |= 4;
    }

    public static /* synthetic */ void zzj(zzhdo zzhdoVar, String str) {
        str.getClass();
        zzgyk zzgykVar = zzhdoVar.zzl;
        if (!zzgykVar.zzc()) {
            zzhdoVar.zzl = zzgxy.zzbL(zzgykVar);
        }
        zzhdoVar.zzl.add(str);
    }

    public static /* synthetic */ void zzk(zzhdo zzhdoVar, int i10) {
        zzhdoVar.zzk = i10 - 1;
        zzhdoVar.zzc |= 64;
    }

    public final int zzc() {
        return this.zzl.size();
    }

    @Override // com.google.android.gms.internal.ads.zzgxy
    public final Object zzde(zzgxx zzgxxVar, Object obj, Object obj2) {
        byte b10 = 1;
        switch (zzgxxVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.zzm);
            case 1:
                if (obj == null) {
                    b10 = 0;
                }
                this.zzm = b10;
                return null;
            case 2:
                return zzgxy.zzbS(zza, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001ᔄ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005င\u0004\u0006\u0016\u0007ဈ\u0005\b᠌\u0006\t\u001a", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", zzhdl.zza, "zzl"});
            case 3:
                return new zzhdo();
            case 4:
                return new zzhdn(null);
            case 5:
                return zza;
            case 6:
                zzgzr zzgzrVar = zzb;
                if (zzgzrVar == null) {
                    synchronized (zzhdo.class) {
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

    public final String zzf() {
        return this.zze;
    }
}

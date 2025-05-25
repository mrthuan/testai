package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzhcl extends zzgxy implements zzgzk {
    private static final zzhcl zza;
    private static volatile zzgzr zzb;
    private int zzc;
    private zzgwm zzd;
    private zzgwm zze;
    private byte zzf = 2;

    static {
        zzhcl zzhclVar = new zzhcl();
        zza = zzhclVar;
        zzgxy.zzcb(zzhcl.class, zzhclVar);
    }

    private zzhcl() {
        zzgwm zzgwmVar = zzgwm.zzb;
        this.zzd = zzgwmVar;
        this.zze = zzgwmVar;
    }

    public static zzhck zzc() {
        return (zzhck) zza.zzaZ();
    }

    public static /* synthetic */ zzhcl zzd() {
        return zza;
    }

    public static /* synthetic */ void zze(zzhcl zzhclVar, zzgwm zzgwmVar) {
        zzhclVar.zzc |= 1;
        zzhclVar.zzd = zzgwmVar;
    }

    public static /* synthetic */ void zzf(zzhcl zzhclVar, zzgwm zzgwmVar) {
        zzhclVar.zzc |= 2;
        zzhclVar.zze = zzgwmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgxy
    public final Object zzde(zzgxx zzgxxVar, Object obj, Object obj2) {
        byte b10 = 1;
        switch (zzgxxVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.zzf);
            case 1:
                if (obj == null) {
                    b10 = 0;
                }
                this.zzf = b10;
                return null;
            case 2:
                return zzgxy.zzbS(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔊ\u0000\u0002ည\u0001", new Object[]{"zzc", "zzd", "zze"});
            case 3:
                return new zzhcl();
            case 4:
                return new zzhck(null);
            case 5:
                return zza;
            case 6:
                zzgzr zzgzrVar = zzb;
                if (zzgzrVar == null) {
                    synchronized (zzhcl.class) {
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

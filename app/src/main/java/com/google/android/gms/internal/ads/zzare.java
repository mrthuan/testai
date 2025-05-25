package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzare extends zzgxy implements zzgzk {
    private static final zzare zza;
    private static volatile zzgzr zzb;
    private int zzc;
    private long zze;
    private long zzi;
    private long zzj;
    private long zzl;
    private int zzp;
    private String zzd = "";
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzk = "";
    private String zzm = "";
    private String zzn = "";
    private zzgyk zzo = zzgxy.zzbK();

    static {
        zzare zzareVar = new zzare();
        zza = zzareVar;
        zzgxy.zzcb(zzare.class, zzareVar);
    }

    private zzare() {
    }

    public static zzara zza() {
        return (zzara) zza.zzaZ();
    }

    public static /* synthetic */ void zzd(zzare zzareVar, long j10) {
        zzareVar.zzc |= 2;
        zzareVar.zze = j10;
    }

    public static /* synthetic */ void zze(zzare zzareVar, String str) {
        str.getClass();
        zzareVar.zzc |= 4;
        zzareVar.zzf = str;
    }

    public static /* synthetic */ void zzf(zzare zzareVar, String str) {
        str.getClass();
        zzareVar.zzc |= 8;
        zzareVar.zzg = str;
    }

    public static /* synthetic */ void zzg(zzare zzareVar, String str) {
        zzareVar.zzc |= 16;
        zzareVar.zzh = str;
    }

    public static /* synthetic */ void zzh(zzare zzareVar, String str) {
        zzareVar.zzc |= 1024;
        zzareVar.zzn = str;
    }

    public static /* synthetic */ void zzi(zzare zzareVar, String str) {
        str.getClass();
        zzareVar.zzc |= 1;
        zzareVar.zzd = str;
    }

    public static /* synthetic */ void zzj(zzare zzareVar, int i10) {
        zzareVar.zzp = i10 - 1;
        zzareVar.zzc |= 2048;
    }

    @Override // com.google.android.gms.internal.ads.zzgxy
    public final Object zzde(zzgxx zzgxxVar, Object obj, Object obj2) {
        switch (zzgxxVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return zzgxy.zzbS(zza, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဈ\u0007\tဂ\b\nဈ\t\u000bဈ\n\f\u001b\r᠌\u000b", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", zzarc.class, "zzp", zzard.zza});
            case 3:
                return new zzare();
            case 4:
                return new zzara(null);
            case 5:
                return zza;
            case 6:
                zzgzr zzgzrVar = zzb;
                if (zzgzrVar == null) {
                    synchronized (zzare.class) {
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

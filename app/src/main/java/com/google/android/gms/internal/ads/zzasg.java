package com.google.android.gms.internal.ads;

import lib.zj.office.fc.hpsf.Variant;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzasg extends zzgxy implements zzgzk {
    private static final zzasg zza;
    private static volatile zzgzr zzb;
    private int zzc;
    private long zzw;
    private long zzx;
    private long zzd = -1;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private int zzj = 1000;
    private long zzk = -1;
    private long zzl = -1;
    private long zzm = -1;
    private int zzn = 1000;
    private long zzo = -1;
    private long zzp = -1;
    private long zzu = -1;
    private long zzv = -1;
    private long zzy = -1;
    private long zzz = -1;
    private long zzA = -1;
    private long zzB = -1;

    static {
        zzasg zzasgVar = new zzasg();
        zza = zzasgVar;
        zzgxy.zzcb(zzasg.class, zzasgVar);
    }

    private zzasg() {
    }

    public static zzasf zza() {
        return (zzasf) zza.zzaZ();
    }

    public static /* synthetic */ void zzd(zzasg zzasgVar, long j10) {
        zzasgVar.zzc |= 1;
        zzasgVar.zzd = j10;
    }

    public static /* synthetic */ void zze(zzasg zzasgVar, long j10) {
        zzasgVar.zzc |= 2;
        zzasgVar.zze = j10;
    }

    public static /* synthetic */ void zzf(zzasg zzasgVar, long j10) {
        zzasgVar.zzc |= 4;
        zzasgVar.zzf = j10;
    }

    public static /* synthetic */ void zzg(zzasg zzasgVar, long j10) {
        zzasgVar.zzc |= 8;
        zzasgVar.zzg = j10;
    }

    public static /* synthetic */ void zzh(zzasg zzasgVar) {
        zzasgVar.zzc &= -9;
        zzasgVar.zzg = -1L;
    }

    public static /* synthetic */ void zzi(zzasg zzasgVar, long j10) {
        zzasgVar.zzc |= 16;
        zzasgVar.zzh = j10;
    }

    public static /* synthetic */ void zzj(zzasg zzasgVar, long j10) {
        zzasgVar.zzc |= 32;
        zzasgVar.zzi = j10;
    }

    public static /* synthetic */ void zzk(zzasg zzasgVar, long j10) {
        zzasgVar.zzc |= 128;
        zzasgVar.zzk = j10;
    }

    public static /* synthetic */ void zzl(zzasg zzasgVar, long j10) {
        zzasgVar.zzc |= 256;
        zzasgVar.zzl = j10;
    }

    public static /* synthetic */ void zzm(zzasg zzasgVar, long j10) {
        zzasgVar.zzc |= 512;
        zzasgVar.zzm = j10;
    }

    public static /* synthetic */ void zzn(zzasg zzasgVar, long j10) {
        zzasgVar.zzc |= 2048;
        zzasgVar.zzo = j10;
    }

    public static /* synthetic */ void zzo(zzasg zzasgVar, long j10) {
        zzasgVar.zzc |= 4096;
        zzasgVar.zzp = j10;
    }

    public static /* synthetic */ void zzp(zzasg zzasgVar, long j10) {
        zzasgVar.zzc |= 8192;
        zzasgVar.zzu = j10;
    }

    public static /* synthetic */ void zzq(zzasg zzasgVar, long j10) {
        zzasgVar.zzc |= 16384;
        zzasgVar.zzv = j10;
    }

    public static /* synthetic */ void zzr(zzasg zzasgVar, long j10) {
        zzasgVar.zzc |= Variant.VT_RESERVED;
        zzasgVar.zzw = j10;
    }

    public static /* synthetic */ void zzs(zzasg zzasgVar, long j10) {
        zzasgVar.zzc |= 65536;
        zzasgVar.zzx = j10;
    }

    public static /* synthetic */ void zzt(zzasg zzasgVar, long j10) {
        zzasgVar.zzc |= 131072;
        zzasgVar.zzy = j10;
    }

    public static /* synthetic */ void zzu(zzasg zzasgVar, long j10) {
        zzasgVar.zzc |= 262144;
        zzasgVar.zzz = j10;
    }

    public static /* synthetic */ void zzv(zzasg zzasgVar, int i10) {
        zzasgVar.zzj = i10 - 1;
        zzasgVar.zzc |= 64;
    }

    public static /* synthetic */ void zzw(zzasg zzasgVar, int i10) {
        zzasgVar.zzn = i10 - 1;
        zzasgVar.zzc |= 1024;
    }

    @Override // com.google.android.gms.internal.ads.zzgxy
    public final Object zzde(zzgxx zzgxxVar, Object obj, Object obj2) {
        switch (zzgxxVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                zzgye zzgyeVar = zzasp.zza;
                return zzgxy.zzbS(zza, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007᠌\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000b᠌\n\fဂ\u000b\rဂ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂ\u0014", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", zzgyeVar, "zzk", "zzl", "zzm", "zzn", zzgyeVar, "zzo", "zzp", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB"});
            case 3:
                return new zzasg();
            case 4:
                return new zzasf(null);
            case 5:
                return zza;
            case 6:
                zzgzr zzgzrVar = zzb;
                if (zzgzrVar == null) {
                    synchronized (zzasg.class) {
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

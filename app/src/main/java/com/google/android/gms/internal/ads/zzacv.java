package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzacv {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final long zzj;
    public final zzacu zzk;
    private final zzbk zzl;

    private zzacv(int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, zzacu zzacuVar, zzbk zzbkVar) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = i12;
        this.zzd = i13;
        this.zze = i14;
        this.zzf = zzi(i14);
        this.zzg = i15;
        this.zzh = i16;
        this.zzi = zzh(i16);
        this.zzj = j10;
        this.zzk = zzacuVar;
        this.zzl = zzbkVar;
    }

    private static int zzh(int i10) {
        if (i10 != 8) {
            if (i10 != 12) {
                if (i10 != 16) {
                    if (i10 != 20) {
                        if (i10 != 24) {
                            return -1;
                        }
                        return 6;
                    }
                    return 5;
                }
                return 4;
            }
            return 2;
        }
        return 1;
    }

    private static int zzi(int i10) {
        switch (i10) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long zza() {
        long j10 = this.zzj;
        if (j10 == 0) {
            return -9223372036854775807L;
        }
        return (j10 * 1000000) / this.zze;
    }

    public final long zzb(long j10) {
        return Math.max(0L, Math.min((j10 * this.zze) / 1000000, this.zzj - 1));
    }

    public final zzaf zzc(byte[] bArr, zzbk zzbkVar) {
        bArr[4] = Byte.MIN_VALUE;
        zzbk zzd = zzd(zzbkVar);
        zzad zzadVar = new zzad();
        zzadVar.zzX("audio/flac");
        int i10 = this.zzd;
        if (i10 <= 0) {
            i10 = -1;
        }
        zzadVar.zzP(i10);
        zzadVar.zzy(this.zzg);
        zzadVar.zzY(this.zze);
        zzadVar.zzR(zzet.zzl(this.zzh));
        zzadVar.zzL(Collections.singletonList(bArr));
        zzadVar.zzQ(zzd);
        return zzadVar.zzad();
    }

    public final zzbk zzd(zzbk zzbkVar) {
        zzbk zzbkVar2 = this.zzl;
        if (zzbkVar2 == null) {
            return zzbkVar;
        }
        return zzbkVar2.zzd(zzbkVar);
    }

    public final zzacv zze(List list) {
        return new zzacv(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzg, this.zzh, this.zzj, this.zzk, zzd(new zzbk(list)));
    }

    public final zzacv zzf(zzacu zzacuVar) {
        return new zzacv(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzg, this.zzh, this.zzj, zzacuVar, this.zzl);
    }

    public final zzacv zzg(List list) {
        return new zzacv(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzg, this.zzh, this.zzj, this.zzk, zzd(zzadv.zzb(list)));
    }

    public zzacv(byte[] bArr, int i10) {
        zzej zzejVar = new zzej(bArr, bArr.length);
        zzejVar.zzl(i10 * 8);
        this.zza = zzejVar.zzd(16);
        this.zzb = zzejVar.zzd(16);
        this.zzc = zzejVar.zzd(24);
        this.zzd = zzejVar.zzd(24);
        int zzd = zzejVar.zzd(20);
        this.zze = zzd;
        this.zzf = zzi(zzd);
        this.zzg = zzejVar.zzd(3) + 1;
        int zzd2 = zzejVar.zzd(5) + 1;
        this.zzh = zzd2;
        this.zzi = zzh(zzd2);
        this.zzj = zzejVar.zze(36);
        this.zzk = null;
        this.zzl = null;
    }
}

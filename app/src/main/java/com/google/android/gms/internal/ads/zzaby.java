package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzaby implements zzacl {
    private final zzp zzb;
    private final long zzc;
    private long zzd;
    private int zzf;
    private int zzg;
    private byte[] zze = new byte[65536];
    private final byte[] zza = new byte[4096];

    static {
        zzbd.zzb("media3.extractor");
    }

    public zzaby(zzp zzpVar, long j10, long j11) {
        this.zzb = zzpVar;
        this.zzd = j10;
        this.zzc = j11;
    }

    private final int zzp(byte[] bArr, int i10, int i11) {
        int i12 = this.zzg;
        if (i12 == 0) {
            return 0;
        }
        int min = Math.min(i12, i11);
        System.arraycopy(this.zze, 0, bArr, i10, min);
        zzu(min);
        return min;
    }

    private final int zzq(byte[] bArr, int i10, int i11, int i12, boolean z10) {
        if (!Thread.interrupted()) {
            int zza = this.zzb.zza(bArr, i10 + i12, i11 - i12);
            if (zza == -1) {
                if (i12 == 0 && z10) {
                    return -1;
                }
                throw new EOFException();
            }
            return i12 + zza;
        }
        throw new InterruptedIOException();
    }

    private final int zzr(int i10) {
        int min = Math.min(this.zzg, i10);
        zzu(min);
        return min;
    }

    private final void zzs(int i10) {
        if (i10 != -1) {
            this.zzd += i10;
        }
    }

    private final void zzt(int i10) {
        int i11 = this.zzf + i10;
        int length = this.zze.length;
        if (i11 > length) {
            this.zze = Arrays.copyOf(this.zze, Math.max(65536 + i11, Math.min(length + length, i11 + 524288)));
        }
    }

    private final void zzu(int i10) {
        byte[] bArr;
        int i11 = this.zzg - i10;
        this.zzg = i11;
        this.zzf = 0;
        byte[] bArr2 = this.zze;
        if (i11 < bArr2.length - 524288) {
            bArr = new byte[65536 + i11];
        } else {
            bArr = bArr2;
        }
        System.arraycopy(bArr2, i10, bArr, 0, i11);
        this.zze = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzacl, com.google.android.gms.internal.ads.zzp
    public final int zza(byte[] bArr, int i10, int i11) {
        int zzp = zzp(bArr, i10, i11);
        if (zzp == 0) {
            zzp = zzq(bArr, i10, i11, 0, true);
        }
        zzs(zzp);
        return zzp;
    }

    @Override // com.google.android.gms.internal.ads.zzacl
    public final int zzb(byte[] bArr, int i10, int i11) {
        int min;
        zzt(i11);
        int i12 = this.zzg;
        int i13 = this.zzf;
        int i14 = i12 - i13;
        if (i14 == 0) {
            min = zzq(this.zze, i13, i11, 0, true);
            if (min == -1) {
                return -1;
            }
            this.zzg += min;
        } else {
            min = Math.min(i11, i14);
        }
        System.arraycopy(this.zze, this.zzf, bArr, i10, min);
        this.zzf += min;
        return min;
    }

    @Override // com.google.android.gms.internal.ads.zzacl
    public final int zzc(int i10) {
        int zzr = zzr(1);
        if (zzr == 0) {
            zzr = zzq(this.zza, 0, Math.min(1, 4096), 0, true);
        }
        zzs(zzr);
        return zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzacl
    public final long zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzacl
    public final long zze() {
        return this.zzd + this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzacl
    public final long zzf() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzacl
    public final void zzg(int i10) {
        zzl(i10, false);
    }

    @Override // com.google.android.gms.internal.ads.zzacl
    public final void zzh(byte[] bArr, int i10, int i11) {
        zzm(bArr, i10, i11, false);
    }

    @Override // com.google.android.gms.internal.ads.zzacl
    public final void zzi(byte[] bArr, int i10, int i11) {
        zzn(bArr, i10, i11, false);
    }

    @Override // com.google.android.gms.internal.ads.zzacl
    public final void zzj() {
        this.zzf = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzacl
    public final void zzk(int i10) {
        zzo(i10, false);
    }

    public final boolean zzl(int i10, boolean z10) {
        zzt(i10);
        int i11 = this.zzg - this.zzf;
        while (i11 < i10) {
            i11 = zzq(this.zze, this.zzf, i10, i11, z10);
            if (i11 == -1) {
                return false;
            }
            this.zzg = this.zzf + i11;
        }
        this.zzf += i10;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzacl
    public final boolean zzm(byte[] bArr, int i10, int i11, boolean z10) {
        if (!zzl(i11, z10)) {
            return false;
        }
        System.arraycopy(this.zze, this.zzf - i11, bArr, i10, i11);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzacl
    public final boolean zzn(byte[] bArr, int i10, int i11, boolean z10) {
        int zzp = zzp(bArr, i10, i11);
        while (zzp < i11 && zzp != -1) {
            zzp = zzq(bArr, i10, i11, zzp, z10);
        }
        zzs(zzp);
        if (zzp != -1) {
            return true;
        }
        return false;
    }

    public final boolean zzo(int i10, boolean z10) {
        int zzr = zzr(i10);
        while (zzr < i10 && zzr != -1) {
            zzr = zzq(this.zza, -zzr, Math.min(i10, zzr + 4096), zzr, false);
        }
        zzs(zzr);
        if (zzr != -1) {
            return true;
        }
        return false;
    }
}

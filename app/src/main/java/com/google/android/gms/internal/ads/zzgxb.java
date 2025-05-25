package com.google.android.gms.internal.ads;

import java.io.OutputStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgxb extends zzgwy {
    private final OutputStream zzg;

    public zzgxb(OutputStream outputStream, int i10) {
        super(i10);
        if (outputStream != null) {
            this.zzg = outputStream;
            return;
        }
        throw new NullPointerException("out");
    }

    private final void zzJ() {
        this.zzg.write(this.zza, 0, this.zzc);
        this.zzc = 0;
    }

    private final void zzK(int i10) {
        if (this.zzb - this.zzc < i10) {
            zzJ();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgxd
    public final void zzL() {
        if (this.zzc > 0) {
            zzJ();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgxd
    public final void zzM(byte b10) {
        if (this.zzc == this.zzb) {
            zzJ();
        }
        zzc(b10);
    }

    @Override // com.google.android.gms.internal.ads.zzgxd
    public final void zzN(int i10, boolean z10) {
        zzK(11);
        zzf(i10 << 3);
        zzc(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.ads.zzgxd
    public final void zzO(int i10, zzgwm zzgwmVar) {
        zzu((i10 << 3) | 2);
        zzu(zzgwmVar.zzd());
        zzgwmVar.zzo(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgxd, com.google.android.gms.internal.ads.zzgwd
    public final void zza(byte[] bArr, int i10, int i11) {
        zzr(bArr, i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.zzgxd
    public final void zzh(int i10, int i11) {
        zzK(14);
        zzf((i10 << 3) | 5);
        zzd(i11);
    }

    @Override // com.google.android.gms.internal.ads.zzgxd
    public final void zzi(int i10) {
        zzK(4);
        zzd(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzgxd
    public final void zzj(int i10, long j10) {
        zzK(18);
        zzf((i10 << 3) | 1);
        zze(j10);
    }

    @Override // com.google.android.gms.internal.ads.zzgxd
    public final void zzk(long j10) {
        zzK(8);
        zze(j10);
    }

    @Override // com.google.android.gms.internal.ads.zzgxd
    public final void zzl(int i10, int i11) {
        zzK(20);
        zzf(i10 << 3);
        if (i11 >= 0) {
            zzf(i11);
        } else {
            zzg(i11);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgxd
    public final void zzm(int i10) {
        if (i10 >= 0) {
            zzu(i10);
        } else {
            zzw(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgxd
    public final void zzn(int i10, zzgzj zzgzjVar, zzhae zzhaeVar) {
        zzu((i10 << 3) | 2);
        zzu(((zzgvv) zzgzjVar).zzaM(zzhaeVar));
        zzhaeVar.zzj(zzgzjVar, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzgxd
    public final void zzo(int i10, zzgzj zzgzjVar) {
        zzu(11);
        zzt(2, i10);
        zzu(26);
        zzu(zzgzjVar.zzaY());
        zzgzjVar.zzda(this);
        zzu(12);
    }

    @Override // com.google.android.gms.internal.ads.zzgxd
    public final void zzp(int i10, zzgwm zzgwmVar) {
        zzu(11);
        zzt(2, i10);
        zzO(3, zzgwmVar);
        zzu(12);
    }

    @Override // com.google.android.gms.internal.ads.zzgxd
    public final void zzq(int i10, String str) {
        zzu((i10 << 3) | 2);
        zzx(str);
    }

    public final void zzr(byte[] bArr, int i10, int i11) {
        int i12 = this.zzb;
        int i13 = this.zzc;
        int i14 = i12 - i13;
        if (i14 >= i11) {
            System.arraycopy(bArr, i10, this.zza, i13, i11);
            this.zzc += i11;
            this.zzd += i11;
            return;
        }
        System.arraycopy(bArr, i10, this.zza, i13, i14);
        int i15 = i10 + i14;
        this.zzc = this.zzb;
        this.zzd += i14;
        zzJ();
        int i16 = i11 - i14;
        if (i16 <= this.zzb) {
            System.arraycopy(bArr, i15, this.zza, 0, i16);
            this.zzc = i16;
        } else {
            this.zzg.write(bArr, i15, i16);
        }
        this.zzd += i16;
    }

    @Override // com.google.android.gms.internal.ads.zzgxd
    public final void zzs(int i10, int i11) {
        zzu((i10 << 3) | i11);
    }

    @Override // com.google.android.gms.internal.ads.zzgxd
    public final void zzt(int i10, int i11) {
        zzK(20);
        zzf(i10 << 3);
        zzf(i11);
    }

    @Override // com.google.android.gms.internal.ads.zzgxd
    public final void zzu(int i10) {
        zzK(5);
        zzf(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzgxd
    public final void zzv(int i10, long j10) {
        zzK(20);
        zzf(i10 << 3);
        zzg(j10);
    }

    @Override // com.google.android.gms.internal.ads.zzgxd
    public final void zzw(long j10) {
        zzK(10);
        zzg(j10);
    }

    public final void zzx(String str) {
        int zze;
        try {
            int length = str.length() * 3;
            int zzD = zzgxd.zzD(length);
            int i10 = zzD + length;
            int i11 = this.zzb;
            if (i10 > i11) {
                byte[] bArr = new byte[length];
                int zzd = zzhbe.zzd(str, bArr, 0, length);
                zzu(zzd);
                zzr(bArr, 0, zzd);
                return;
            }
            if (i10 > i11 - this.zzc) {
                zzJ();
            }
            int zzD2 = zzgxd.zzD(str.length());
            int i12 = this.zzc;
            try {
                if (zzD2 == zzD) {
                    int i13 = i12 + zzD2;
                    this.zzc = i13;
                    int zzd2 = zzhbe.zzd(str, this.zza, i13, this.zzb - i13);
                    this.zzc = i12;
                    zze = (zzd2 - i12) - zzD2;
                    zzf(zze);
                    this.zzc = zzd2;
                } else {
                    zze = zzhbe.zze(str);
                    zzf(zze);
                    this.zzc = zzhbe.zzd(str, this.zza, this.zzc, zze);
                }
                this.zzd += zze;
            } catch (zzhbd e10) {
                this.zzd -= this.zzc - i12;
                this.zzc = i12;
                throw e10;
            } catch (ArrayIndexOutOfBoundsException e11) {
                throw new zzgxa(e11);
            }
        } catch (zzhbd e12) {
            zzH(str, e12);
        }
    }
}

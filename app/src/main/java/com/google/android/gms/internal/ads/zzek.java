package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzek {
    private static final char[] zza = {'\r', '\n'};
    private static final char[] zzb = {'\n'};
    private static final zzfxw zzc = zzfxw.zzr(zzfuj.zza, zzfuj.zzc, zzfuj.zzf, zzfuj.zzd, zzfuj.zze);
    private byte[] zzd;
    private int zze;
    private int zzf;

    public zzek(byte[] bArr, int i10) {
        this.zzd = bArr;
        this.zzf = i10;
    }

    private final char zzN(Charset charset, char[] cArr) {
        int zzO = zzO(charset);
        if (zzO != 0) {
            int i10 = zzO >> 16;
            for (char c : cArr) {
                char c10 = (char) i10;
                if (c == c10) {
                    this.zze += (char) zzO;
                    return c10;
                }
            }
        }
        return (char) 0;
    }

    private final int zzO(Charset charset) {
        int i10;
        byte zza2;
        char zzb2;
        int i11 = 1;
        if (charset.equals(zzfuj.zzc) || charset.equals(zzfuj.zza)) {
            if (this.zzf - this.zze > 0) {
                zza2 = (byte) zzgam.zza(this.zzd[i10] & 255);
                return (zzgam.zza(zza2) << 16) + i11;
            }
        }
        if (charset.equals(zzfuj.zzf) || charset.equals(zzfuj.zzd)) {
            int i12 = this.zzf;
            int i13 = this.zze;
            if (i12 - i13 >= 2) {
                byte[] bArr = this.zzd;
                zzb2 = zzgam.zzb(bArr[i13], bArr[i13 + 1]);
                zza2 = (byte) zzb2;
                i11 = 2;
                return (zzgam.zza(zza2) << 16) + i11;
            }
        }
        if (charset.equals(zzfuj.zze)) {
            int i14 = this.zzf;
            int i15 = this.zze;
            if (i14 - i15 >= 2) {
                byte[] bArr2 = this.zzd;
                zzb2 = zzgam.zzb(bArr2[i15 + 1], bArr2[i15]);
                zza2 = (byte) zzb2;
                i11 = 2;
                return (zzgam.zza(zza2) << 16) + i11;
            }
            return 0;
        }
        return 0;
    }

    public final String zzA(int i10, Charset charset) {
        byte[] bArr = this.zzd;
        int i11 = this.zze;
        String str = new String(bArr, i11, i10, charset);
        this.zze = i11 + i10;
        return str;
    }

    public final Charset zzB() {
        int i10 = this.zzf;
        int i11 = this.zze;
        int i12 = i10 - i11;
        if (i12 >= 3) {
            byte[] bArr = this.zzd;
            if (bArr[i11] == -17 && bArr[i11 + 1] == -69 && bArr[i11 + 2] == -65) {
                this.zze = i11 + 3;
                return zzfuj.zzc;
            }
        }
        if (i12 >= 2) {
            byte[] bArr2 = this.zzd;
            byte b10 = bArr2[i11];
            if (b10 == -2) {
                if (bArr2[i11 + 1] == -1) {
                    this.zze = i11 + 2;
                    return zzfuj.zzd;
                }
                return null;
            } else if (b10 == -1 && bArr2[i11 + 1] == -2) {
                this.zze = i11 + 2;
                return zzfuj.zze;
            } else {
                return null;
            }
        }
        return null;
    }

    public final short zzC() {
        byte[] bArr = this.zzd;
        int i10 = this.zze;
        int i11 = i10 + 1;
        this.zze = i11 + 1;
        return (short) (((bArr[i11] & 255) << 8) | (bArr[i10] & 255));
    }

    public final short zzD() {
        byte[] bArr = this.zzd;
        int i10 = this.zze;
        int i11 = i10 + 1;
        this.zze = i11 + 1;
        return (short) ((bArr[i11] & 255) | ((bArr[i10] & 255) << 8));
    }

    public final void zzE(int i10) {
        byte[] bArr = this.zzd;
        if (i10 > bArr.length) {
            this.zzd = Arrays.copyOf(bArr, i10);
        }
    }

    public final void zzF(zzej zzejVar, int i10) {
        zzG(zzejVar.zza, 0, i10);
        zzejVar.zzl(0);
    }

    public final void zzG(byte[] bArr, int i10, int i11) {
        System.arraycopy(this.zzd, this.zze, bArr, i10, i11);
        this.zze += i11;
    }

    public final void zzH(int i10) {
        byte[] bArr = this.zzd;
        if (bArr.length < i10) {
            bArr = new byte[i10];
        }
        zzI(bArr, i10);
    }

    public final void zzI(byte[] bArr, int i10) {
        this.zzd = bArr;
        this.zzf = i10;
        this.zze = 0;
    }

    public final void zzJ(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 <= this.zzd.length) {
            z10 = true;
        }
        zzdi.zzd(z10);
        this.zzf = i10;
    }

    public final void zzK(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 <= this.zzf) {
            z10 = true;
        }
        zzdi.zzd(z10);
        this.zze = i10;
    }

    public final void zzL(int i10) {
        zzK(this.zze + i10);
    }

    public final byte[] zzM() {
        return this.zzd;
    }

    public final char zza(Charset charset) {
        zzdi.zze(zzc.contains(charset), "Unsupported charset: ".concat(String.valueOf(charset)));
        return (char) (zzO(charset) >> 16);
    }

    public final int zzb() {
        return this.zzf - this.zze;
    }

    public final int zzc() {
        return this.zzd.length;
    }

    public final int zzd() {
        return this.zze;
    }

    public final int zze() {
        return this.zzf;
    }

    public final int zzf() {
        return this.zzd[this.zze] & 255;
    }

    public final int zzg() {
        byte[] bArr = this.zzd;
        int i10 = this.zze;
        int i11 = i10 + 1;
        int i12 = i11 + 1;
        int i13 = i12 + 1;
        this.zze = i13 + 1;
        return (bArr[i13] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i11] & 255) << 16) | ((bArr[i12] & 255) << 8);
    }

    public final int zzh() {
        byte[] bArr = this.zzd;
        int i10 = this.zze;
        int i11 = i10 + 1;
        int i12 = i11 + 1;
        this.zze = i12 + 1;
        return (bArr[i12] & 255) | (((bArr[i10] & 255) << 24) >> 8) | ((bArr[i11] & 255) << 8);
    }

    public final int zzi() {
        byte[] bArr = this.zzd;
        int i10 = this.zze;
        int i11 = i10 + 1;
        int i12 = i11 + 1;
        int i13 = i12 + 1;
        this.zze = i13 + 1;
        return ((bArr[i13] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i11] & 255) << 8) | ((bArr[i12] & 255) << 16);
    }

    public final int zzj() {
        int zzi = zzi();
        if (zzi >= 0) {
            return zzi;
        }
        throw new IllegalStateException(b.a.c("Top bit not zero: ", zzi));
    }

    public final int zzk() {
        byte[] bArr = this.zzd;
        int i10 = this.zze;
        int i11 = i10 + 1;
        this.zze = i11 + 1;
        return ((bArr[i11] & 255) << 8) | (bArr[i10] & 255);
    }

    public final int zzl() {
        return (zzm() << 21) | (zzm() << 14) | (zzm() << 7) | zzm();
    }

    public final int zzm() {
        byte[] bArr = this.zzd;
        int i10 = this.zze;
        this.zze = i10 + 1;
        return bArr[i10] & 255;
    }

    public final int zzn() {
        byte[] bArr = this.zzd;
        int i10 = this.zze;
        int i11 = i10 + 1;
        this.zze = i11 + 1 + 2;
        return (bArr[i11] & 255) | ((bArr[i10] & 255) << 8);
    }

    public final int zzo() {
        byte[] bArr = this.zzd;
        int i10 = this.zze;
        int i11 = i10 + 1;
        int i12 = i11 + 1;
        this.zze = i12 + 1;
        return (bArr[i12] & 255) | ((bArr[i10] & 255) << 16) | ((bArr[i11] & 255) << 8);
    }

    public final int zzp() {
        int zzg = zzg();
        if (zzg >= 0) {
            return zzg;
        }
        throw new IllegalStateException(b.a.c("Top bit not zero: ", zzg));
    }

    public final int zzq() {
        byte[] bArr = this.zzd;
        int i10 = this.zze;
        int i11 = i10 + 1;
        this.zze = i11 + 1;
        return (bArr[i11] & 255) | ((bArr[i10] & 255) << 8);
    }

    public final long zzr() {
        int i10;
        byte[] bArr = this.zzd;
        int i11 = this.zze;
        int i12 = i11 + 1;
        long j10 = bArr[i11];
        int i13 = i12 + 1;
        long j11 = bArr[i12];
        int i14 = i13 + 1;
        long j12 = bArr[i13];
        int i15 = i14 + 1;
        long j13 = bArr[i14];
        int i16 = i15 + 1;
        long j14 = bArr[i15];
        int i17 = i16 + 1;
        long j15 = bArr[i16];
        long j16 = bArr[i17];
        this.zze = i17 + 1 + 1;
        return ((bArr[i10] & 255) << 56) | ((j16 & 255) << 48) | (j10 & 255) | ((j11 & 255) << 8) | ((j12 & 255) << 16) | ((j13 & 255) << 24) | ((j14 & 255) << 32) | ((j15 & 255) << 40);
    }

    public final long zzs() {
        int i10;
        byte[] bArr = this.zzd;
        int i11 = this.zze;
        int i12 = i11 + 1;
        long j10 = bArr[i11];
        int i13 = i12 + 1;
        long j11 = bArr[i12];
        long j12 = bArr[i13];
        this.zze = i13 + 1 + 1;
        return ((bArr[i10] & 255) << 24) | (j10 & 255) | ((j11 & 255) << 8) | ((j12 & 255) << 16);
    }

    public final long zzt() {
        int i10;
        byte[] bArr = this.zzd;
        int i11 = this.zze;
        int i12 = i11 + 1;
        long j10 = bArr[i11];
        int i13 = i12 + 1;
        long j11 = bArr[i12];
        int i14 = i13 + 1;
        long j12 = bArr[i13];
        int i15 = i14 + 1;
        long j13 = bArr[i14];
        int i16 = i15 + 1;
        long j14 = bArr[i15];
        int i17 = i16 + 1;
        long j15 = bArr[i16];
        long j16 = bArr[i17];
        this.zze = i17 + 1 + 1;
        return (bArr[i10] & 255) | ((j10 & 255) << 56) | ((j11 & 255) << 48) | ((j12 & 255) << 40) | ((j13 & 255) << 32) | ((j14 & 255) << 24) | ((j15 & 255) << 16) | ((j16 & 255) << 8);
    }

    public final long zzu() {
        int i10;
        byte[] bArr = this.zzd;
        int i11 = this.zze;
        int i12 = i11 + 1;
        long j10 = bArr[i11];
        int i13 = i12 + 1;
        long j11 = bArr[i12];
        long j12 = bArr[i13];
        this.zze = i13 + 1 + 1;
        return (bArr[i10] & 255) | ((j10 & 255) << 24) | ((j11 & 255) << 16) | ((j12 & 255) << 8);
    }

    public final long zzv() {
        long zzt = zzt();
        if (zzt >= 0) {
            return zzt;
        }
        throw new IllegalStateException(androidx.appcompat.view.menu.d.c("Top bit not zero: ", zzt));
    }

    public final long zzw() {
        int i10;
        int i11;
        byte b10;
        int i12;
        long j10 = this.zzd[this.zze];
        int i13 = 7;
        while (true) {
            i10 = 0;
            if (i13 < 0) {
                break;
            }
            if (((1 << i13) & j10) != 0) {
                i13--;
            } else if (i13 < 6) {
                j10 &= i12 - 1;
                i10 = 7 - i13;
            } else if (i13 == 7) {
                i10 = 1;
            }
        }
        if (i10 != 0) {
            for (i11 = 1; i11 < i10; i11++) {
                if ((this.zzd[this.zze + i11] & 192) == 128) {
                    j10 = (j10 << 6) | (b10 & Field.BARCODE);
                } else {
                    throw new NumberFormatException(androidx.appcompat.view.menu.d.c("Invalid UTF-8 sequence continuation byte: ", j10));
                }
            }
            this.zze += i10;
            return j10;
        }
        throw new NumberFormatException(androidx.appcompat.view.menu.d.c("Invalid UTF-8 sequence first byte: ", j10));
    }

    public final String zzx(char c) {
        int i10 = this.zzf;
        int i11 = this.zze;
        if (i10 - i11 != 0) {
            while (i11 < this.zzf && this.zzd[i11] != 0) {
                i11++;
            }
            byte[] bArr = this.zzd;
            int i12 = this.zze;
            String zzB = zzet.zzB(bArr, i12, i11 - i12);
            this.zze = i11;
            if (i11 < this.zzf) {
                this.zze = i11 + 1;
            }
            return zzB;
        }
        return null;
    }

    public final String zzy(Charset charset) {
        zzdi.zze(zzc.contains(charset), "Unsupported charset: ".concat(String.valueOf(charset)));
        if (this.zzf - this.zze == 0) {
            return null;
        }
        Charset charset2 = zzfuj.zza;
        if (!charset.equals(charset2)) {
            zzB();
        }
        int i10 = 1;
        if (!charset.equals(zzfuj.zzc) && !charset.equals(charset2)) {
            i10 = 2;
            if (!charset.equals(zzfuj.zzf) && !charset.equals(zzfuj.zze) && !charset.equals(zzfuj.zzd)) {
                throw new IllegalArgumentException("Unsupported charset: ".concat(String.valueOf(charset)));
            }
        }
        int i11 = this.zze;
        while (true) {
            int i12 = this.zzf;
            if (i11 < i12 - (i10 - 1)) {
                if ((charset.equals(zzfuj.zzc) || charset.equals(zzfuj.zza)) && zzet.zzM(this.zzd[i11])) {
                    break;
                }
                if (charset.equals(zzfuj.zzf) || charset.equals(zzfuj.zzd)) {
                    byte[] bArr = this.zzd;
                    if (bArr[i11] == 0 && zzet.zzM(bArr[i11 + 1])) {
                        break;
                    }
                }
                if (charset.equals(zzfuj.zze)) {
                    byte[] bArr2 = this.zzd;
                    if (bArr2[i11 + 1] == 0 && zzet.zzM(bArr2[i11])) {
                        break;
                    }
                }
                i11 += i10;
            } else {
                i11 = i12;
                break;
            }
        }
        String zzA = zzA(i11 - this.zze, charset);
        if (this.zze != this.zzf && zzN(charset, zza) == '\r') {
            zzN(charset, zzb);
        }
        return zzA;
    }

    public final String zzz(int i10) {
        int i11;
        if (i10 == 0) {
            return "";
        }
        int i12 = this.zze;
        int i13 = (i12 + i10) - 1;
        if (i13 < this.zzf && this.zzd[i13] == 0) {
            i11 = i10 - 1;
        } else {
            i11 = i10;
        }
        String zzB = zzet.zzB(this.zzd, i12, i11);
        this.zze += i10;
        return zzB;
    }

    public zzek() {
        this.zzd = zzet.zzf;
    }

    public zzek(int i10) {
        this.zzd = new byte[i10];
        this.zzf = i10;
    }

    public zzek(byte[] bArr) {
        this.zzd = bArr;
        this.zzf = bArr.length;
    }
}

package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzvq {
    private final zzek zza = new zzek(32);
    private zzvp zzb;
    private zzvp zzc;
    private zzvp zzd;
    private long zze;
    private final zzyk zzf;

    public zzvq(zzyk zzykVar) {
        this.zzf = zzykVar;
        zzvp zzvpVar = new zzvp(0L, 65536);
        this.zzb = zzvpVar;
        this.zzc = zzvpVar;
        this.zzd = zzvpVar;
    }

    private final int zzi(int i10) {
        zzvp zzvpVar = this.zzd;
        if (zzvpVar.zzc == null) {
            zzyd zzb = this.zzf.zzb();
            zzvp zzvpVar2 = new zzvp(this.zzd.zzb, 65536);
            zzvpVar.zzc = zzb;
            zzvpVar.zzd = zzvpVar2;
        }
        return Math.min(i10, (int) (this.zzd.zzb - this.zze));
    }

    private static zzvp zzj(zzvp zzvpVar, long j10) {
        while (j10 >= zzvpVar.zzb) {
            zzvpVar = zzvpVar.zzd;
        }
        return zzvpVar;
    }

    private static zzvp zzk(zzvp zzvpVar, long j10, ByteBuffer byteBuffer, int i10) {
        zzvp zzj = zzj(zzvpVar, j10);
        while (i10 > 0) {
            int min = Math.min(i10, (int) (zzj.zzb - j10));
            byteBuffer.put(zzj.zzc.zza, zzj.zza(j10), min);
            i10 -= min;
            j10 += min;
            if (j10 == zzj.zzb) {
                zzj = zzj.zzd;
            }
        }
        return zzj;
    }

    private static zzvp zzl(zzvp zzvpVar, long j10, byte[] bArr, int i10) {
        zzvp zzj = zzj(zzvpVar, j10);
        int i11 = i10;
        while (i11 > 0) {
            int min = Math.min(i11, (int) (zzj.zzb - j10));
            System.arraycopy(zzj.zzc.zza, zzj.zza(j10), bArr, i10 - i11, min);
            i11 -= min;
            j10 += min;
            if (j10 == zzj.zzb) {
                zzj = zzj.zzd;
            }
        }
        return zzj;
    }

    private static zzvp zzm(zzvp zzvpVar, zzhd zzhdVar, zzvs zzvsVar, zzek zzekVar) {
        zzvp zzvpVar2;
        boolean z10;
        if (zzhdVar.zzk()) {
            long j10 = zzvsVar.zzb;
            int i10 = 1;
            zzekVar.zzH(1);
            zzvp zzl = zzl(zzvpVar, j10, zzekVar.zzM(), 1);
            long j11 = j10 + 1;
            byte b10 = zzekVar.zzM()[0];
            int i11 = b10 & 128;
            int i12 = b10 & Byte.MAX_VALUE;
            zzha zzhaVar = zzhdVar.zzb;
            byte[] bArr = zzhaVar.zza;
            if (bArr == null) {
                zzhaVar.zza = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            if (i11 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            zzvpVar2 = zzl(zzl, j11, zzhaVar.zza, i12);
            long j12 = j11 + i12;
            if (z10) {
                zzekVar.zzH(2);
                zzvpVar2 = zzl(zzvpVar2, j12, zzekVar.zzM(), 2);
                j12 += 2;
                i10 = zzekVar.zzq();
            }
            int i13 = i10;
            int[] iArr = zzhaVar.zzd;
            if (iArr == null || iArr.length < i13) {
                iArr = new int[i13];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = zzhaVar.zze;
            if (iArr3 == null || iArr3.length < i13) {
                iArr3 = new int[i13];
            }
            int[] iArr4 = iArr3;
            if (z10) {
                int i14 = i13 * 6;
                zzekVar.zzH(i14);
                zzvpVar2 = zzl(zzvpVar2, j12, zzekVar.zzM(), i14);
                j12 += i14;
                zzekVar.zzK(0);
                for (int i15 = 0; i15 < i13; i15++) {
                    iArr2[i15] = zzekVar.zzq();
                    iArr4[i15] = zzekVar.zzp();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = zzvsVar.zza - ((int) (j12 - zzvsVar.zzb));
            }
            zzado zzadoVar = zzvsVar.zzc;
            int i16 = zzet.zza;
            zzhaVar.zzc(i13, iArr2, iArr4, zzadoVar.zzb, zzhaVar.zza, zzadoVar.zza, zzadoVar.zzc, zzadoVar.zzd);
            long j13 = zzvsVar.zzb;
            int i17 = (int) (j12 - j13);
            zzvsVar.zzb = j13 + i17;
            zzvsVar.zza -= i17;
        } else {
            zzvpVar2 = zzvpVar;
        }
        if (zzhdVar.zze()) {
            zzekVar.zzH(4);
            zzvp zzl2 = zzl(zzvpVar2, zzvsVar.zzb, zzekVar.zzM(), 4);
            int zzp = zzekVar.zzp();
            zzvsVar.zzb += 4;
            zzvsVar.zza -= 4;
            zzhdVar.zzi(zzp);
            zzvp zzk = zzk(zzl2, zzvsVar.zzb, zzhdVar.zzc, zzp);
            zzvsVar.zzb += zzp;
            int i18 = zzvsVar.zza - zzp;
            zzvsVar.zza = i18;
            ByteBuffer byteBuffer = zzhdVar.zzf;
            if (byteBuffer != null && byteBuffer.capacity() >= i18) {
                zzhdVar.zzf.clear();
            } else {
                zzhdVar.zzf = ByteBuffer.allocate(i18);
            }
            return zzk(zzk, zzvsVar.zzb, zzhdVar.zzf, zzvsVar.zza);
        }
        zzhdVar.zzi(zzvsVar.zza);
        return zzk(zzvpVar2, zzvsVar.zzb, zzhdVar.zzc, zzvsVar.zza);
    }

    private final void zzn(int i10) {
        long j10 = this.zze + i10;
        this.zze = j10;
        zzvp zzvpVar = this.zzd;
        if (j10 == zzvpVar.zzb) {
            this.zzd = zzvpVar.zzd;
        }
    }

    public final int zza(zzp zzpVar, int i10, boolean z10) {
        int zzi = zzi(i10);
        zzvp zzvpVar = this.zzd;
        int zza = zzpVar.zza(zzvpVar.zzc.zza, zzvpVar.zza(this.zze), zzi);
        if (zza == -1) {
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        zzn(zza);
        return zza;
    }

    public final long zzb() {
        return this.zze;
    }

    public final void zzc(long j10) {
        zzvp zzvpVar;
        if (j10 != -1) {
            while (true) {
                zzvpVar = this.zzb;
                if (j10 < zzvpVar.zzb) {
                    break;
                }
                this.zzf.zzc(zzvpVar.zzc);
                this.zzb = this.zzb.zzb();
            }
            if (this.zzc.zza < zzvpVar.zza) {
                this.zzc = zzvpVar;
            }
        }
    }

    public final void zzd(zzhd zzhdVar, zzvs zzvsVar) {
        zzm(this.zzc, zzhdVar, zzvsVar, this.zza);
    }

    public final void zze(zzhd zzhdVar, zzvs zzvsVar) {
        this.zzc = zzm(this.zzc, zzhdVar, zzvsVar, this.zza);
    }

    public final void zzf() {
        zzvp zzvpVar = this.zzb;
        if (zzvpVar.zzc != null) {
            this.zzf.zzd(zzvpVar);
            zzvpVar.zzb();
        }
        this.zzb.zze(0L, 65536);
        zzvp zzvpVar2 = this.zzb;
        this.zzc = zzvpVar2;
        this.zzd = zzvpVar2;
        this.zze = 0L;
        this.zzf.zzg();
    }

    public final void zzg() {
        this.zzc = this.zzb;
    }

    public final void zzh(zzek zzekVar, int i10) {
        while (i10 > 0) {
            int zzi = zzi(i10);
            zzvp zzvpVar = this.zzd;
            zzekVar.zzG(zzvpVar.zzc.zza, zzvpVar.zza(this.zze), zzi);
            i10 -= zzi;
            zzn(zzi);
        }
    }
}

package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgwo extends zzgww {
    private final byte[] zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private final int zzi;
    private int zzj;
    private int zzk;

    public /* synthetic */ zzgwo(byte[] bArr, int i10, int i11, boolean z10, zzgwn zzgwnVar) {
        super(null);
        this.zzk = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.zze = bArr;
        this.zzf = i11 + i10;
        this.zzh = i10;
        this.zzi = i10;
    }

    private final void zzC() {
        int i10 = this.zzf + this.zzg;
        this.zzf = i10;
        int i11 = i10 - this.zzi;
        int i12 = this.zzk;
        if (i11 > i12) {
            int i13 = i11 - i12;
            this.zzg = i13;
            this.zzf = i10 - i13;
            return;
        }
        this.zzg = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final boolean zzA() {
        if (this.zzh == this.zzf) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final boolean zzB() {
        if (zzq() != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final double zza() {
        return Double.longBitsToDouble(zzp());
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final float zzb() {
        return Float.intBitsToFloat(zzh());
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final int zzc() {
        return this.zzh - this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final int zzd(int i10) {
        if (i10 >= 0) {
            int i11 = (this.zzh - this.zzi) + i10;
            if (i11 >= 0) {
                int i12 = this.zzk;
                if (i11 <= i12) {
                    this.zzk = i11;
                    zzC();
                    return i12;
                }
                throw zzgyn.zzi();
            }
            throw zzgyn.zzg();
        }
        throw zzgyn.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final int zze() {
        return zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final int zzf() {
        return zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final int zzg() {
        return zzi();
    }

    public final int zzh() {
        int i10 = this.zzh;
        if (this.zzf - i10 >= 4) {
            byte[] bArr = this.zze;
            this.zzh = i10 + 4;
            int i11 = (bArr[i10 + 1] & 255) << 8;
            return ((bArr[i10 + 3] & 255) << 24) | i11 | (bArr[i10] & 255) | ((bArr[i10 + 2] & 255) << 16);
        }
        throw zzgyn.zzi();
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0067, code lost:
        if (r2[r3] < 0) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzi() {
        /*
            r5 = this;
            int r0 = r5.zzh
            int r1 = r5.zzf
            if (r1 != r0) goto L7
            goto L6d
        L7:
            byte[] r2 = r5.zze
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 < 0) goto L12
            r5.zzh = r3
            return r0
        L12:
            int r1 = r1 - r3
            r4 = 9
            if (r1 < r4) goto L6d
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L23
            r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L6a
        L23:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L30
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L2e:
            r1 = r3
            goto L6a
        L30:
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L3e
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L6a
        L3e:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            r4 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r4
            if (r1 >= 0) goto L2e
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L6a
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L2e
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L6a
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L2e
            int r1 = r3 + 1
            r2 = r2[r3]
            if (r2 >= 0) goto L6a
            goto L6d
        L6a:
            r5.zzh = r1
            return r0
        L6d:
            long r0 = r5.zzr()
            int r0 = (int) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgwo.zzi():int");
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final int zzj() {
        return zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final int zzk() {
        return zzgww.zzD(zzi());
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final int zzl() {
        if (zzA()) {
            this.zzj = 0;
            return 0;
        }
        int zzi = zzi();
        this.zzj = zzi;
        if ((zzi >>> 3) != 0) {
            return zzi;
        }
        throw zzgyn.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final int zzm() {
        return zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final long zzn() {
        return zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final long zzo() {
        return zzq();
    }

    public final long zzp() {
        int i10 = this.zzh;
        if (this.zzf - i10 >= 8) {
            byte[] bArr = this.zze;
            this.zzh = i10 + 8;
            long j10 = bArr[i10 + 2];
            long j11 = bArr[i10 + 3];
            return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((j10 & 255) << 16) | ((j11 & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
        }
        throw zzgyn.zzi();
    }

    public final long zzq() {
        long j10;
        long j11;
        long j12;
        long j13;
        int i10;
        int i11 = this.zzh;
        int i12 = this.zzf;
        if (i12 != i11) {
            byte[] bArr = this.zze;
            int i13 = i11 + 1;
            byte b10 = bArr[i11];
            if (b10 >= 0) {
                this.zzh = i13;
                return b10;
            } else if (i12 - i13 >= 9) {
                int i14 = i13 + 1;
                int i15 = b10 ^ (bArr[i13] << 7);
                if (i15 < 0) {
                    i10 = i15 ^ (-128);
                } else {
                    int i16 = i14 + 1;
                    int i17 = i15 ^ (bArr[i14] << 14);
                    if (i17 >= 0) {
                        j10 = i17 ^ 16256;
                    } else {
                        i14 = i16 + 1;
                        int i18 = i17 ^ (bArr[i16] << 21);
                        if (i18 < 0) {
                            i10 = i18 ^ (-2080896);
                        } else {
                            i16 = i14 + 1;
                            long j14 = i18 ^ (bArr[i14] << 28);
                            if (j14 >= 0) {
                                j13 = 266354560;
                            } else {
                                int i19 = i16 + 1;
                                long j15 = j14 ^ (bArr[i16] << 35);
                                if (j15 < 0) {
                                    j12 = -34093383808L;
                                } else {
                                    i16 = i19 + 1;
                                    j14 = j15 ^ (bArr[i19] << 42);
                                    if (j14 >= 0) {
                                        j13 = 4363953127296L;
                                    } else {
                                        i19 = i16 + 1;
                                        j15 = j14 ^ (bArr[i16] << 49);
                                        if (j15 < 0) {
                                            j12 = -558586000294016L;
                                        } else {
                                            i16 = i19 + 1;
                                            j10 = (j15 ^ (bArr[i19] << 56)) ^ 71499008037633920L;
                                            if (j10 < 0) {
                                                i19 = i16 + 1;
                                                if (bArr[i16] >= 0) {
                                                    j11 = j10;
                                                    i14 = i19;
                                                    this.zzh = i14;
                                                    return j11;
                                                }
                                            }
                                        }
                                    }
                                }
                                j11 = j12 ^ j15;
                                i14 = i19;
                                this.zzh = i14;
                                return j11;
                            }
                            j10 = j14 ^ j13;
                        }
                    }
                    i14 = i16;
                    j11 = j10;
                    this.zzh = i14;
                    return j11;
                }
                j11 = i10;
                this.zzh = i14;
                return j11;
            }
        }
        return zzr();
    }

    public final long zzr() {
        long j10 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            int i11 = this.zzh;
            if (i11 != this.zzf) {
                byte[] bArr = this.zze;
                this.zzh = i11 + 1;
                byte b10 = bArr[i11];
                j10 |= (b10 & Byte.MAX_VALUE) << i10;
                if ((b10 & 128) == 0) {
                    return j10;
                }
            } else {
                throw zzgyn.zzi();
            }
        }
        throw zzgyn.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final long zzs() {
        return zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final long zzt() {
        return zzgww.zzF(zzq());
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final long zzu() {
        return zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final zzgwm zzv() {
        int zzi = zzi();
        if (zzi > 0) {
            int i10 = this.zzf;
            int i11 = this.zzh;
            if (zzi <= i10 - i11) {
                zzgwm zzv = zzgwm.zzv(this.zze, i11, zzi);
                this.zzh += zzi;
                return zzv;
            }
        }
        if (zzi != 0) {
            if (zzi > 0) {
                int i12 = this.zzf;
                int i13 = this.zzh;
                if (zzi <= i12 - i13) {
                    int i14 = zzi + i13;
                    this.zzh = i14;
                    return new zzgwk(Arrays.copyOfRange(this.zze, i13, i14));
                }
            }
            if (zzi <= 0) {
                throw zzgyn.zzf();
            }
            throw zzgyn.zzi();
        }
        return zzgwm.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final String zzw() {
        int zzi = zzi();
        if (zzi > 0) {
            int i10 = this.zzf;
            int i11 = this.zzh;
            if (zzi <= i10 - i11) {
                String str = new String(this.zze, i11, zzi, zzgyl.zza);
                this.zzh += zzi;
                return str;
            }
        }
        if (zzi == 0) {
            return "";
        }
        if (zzi < 0) {
            throw zzgyn.zzf();
        }
        throw zzgyn.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final String zzx() {
        int zzi = zzi();
        if (zzi > 0) {
            int i10 = this.zzf;
            int i11 = this.zzh;
            if (zzi <= i10 - i11) {
                String zzh = zzhbe.zzh(this.zze, i11, zzi);
                this.zzh += zzi;
                return zzh;
            }
        }
        if (zzi == 0) {
            return "";
        }
        if (zzi <= 0) {
            throw zzgyn.zzf();
        }
        throw zzgyn.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final void zzy(int i10) {
        if (this.zzj == i10) {
            return;
        }
        throw zzgyn.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final void zzz(int i10) {
        this.zzk = i10;
        zzC();
    }
}

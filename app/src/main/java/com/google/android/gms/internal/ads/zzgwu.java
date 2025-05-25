package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api;
import java.nio.ByteBuffer;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgwu extends zzgww {
    private final ByteBuffer zze;
    private final long zzf;
    private long zzg;
    private long zzh;
    private final long zzi;
    private int zzj;
    private int zzk;
    private int zzl;

    public /* synthetic */ zzgwu(ByteBuffer byteBuffer, boolean z10, zzgwt zzgwtVar) {
        super(null);
        this.zzl = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.zze = byteBuffer;
        long zze = zzhaz.zze(byteBuffer);
        this.zzf = zze;
        this.zzg = byteBuffer.limit() + zze;
        long position = zze + byteBuffer.position();
        this.zzh = position;
        this.zzi = position;
    }

    private final int zzC() {
        return (int) (this.zzg - this.zzh);
    }

    private final void zzI() {
        long j10 = this.zzg + this.zzj;
        this.zzg = j10;
        int i10 = (int) (j10 - this.zzi);
        int i11 = this.zzl;
        if (i10 > i11) {
            int i12 = i10 - i11;
            this.zzj = i12;
            this.zzg = j10 - i12;
            return;
        }
        this.zzj = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final boolean zzA() {
        if (this.zzh == this.zzg) {
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
        return (int) (this.zzh - this.zzi);
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final int zzd(int i10) {
        if (i10 >= 0) {
            int zzc = i10 + zzc();
            int i11 = this.zzl;
            if (zzc <= i11) {
                this.zzl = zzc;
                zzI();
                return i11;
            }
            throw zzgyn.zzi();
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
        long j10 = this.zzh;
        if (this.zzg - j10 >= 4) {
            this.zzh = 4 + j10;
            int zza = (zzhaz.zza(1 + j10) & 255) << 8;
            return ((zzhaz.zza(j10 + 3) & 255) << 24) | zza | (zzhaz.zza(j10) & 255) | ((zzhaz.zza(2 + j10) & 255) << 16);
        }
        throw zzgyn.zzi();
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0082, code lost:
        if (com.google.android.gms.internal.ads.zzhaz.zza(r4) >= 0) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzi() {
        /*
            r10 = this;
            long r0 = r10.zzh
            long r2 = r10.zzg
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 != 0) goto La
            goto L87
        La:
            r2 = 1
            long r4 = r0 + r2
            byte r0 = com.google.android.gms.internal.ads.zzhaz.zza(r0)
            if (r0 < 0) goto L17
            r10.zzh = r4
            return r0
        L17:
            long r6 = r10.zzg
            long r6 = r6 - r4
            r8 = 9
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 < 0) goto L87
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.zzhaz.zza(r4)
            int r1 = r1 << 7
            r0 = r0 ^ r1
            if (r0 >= 0) goto L2e
            r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L84
        L2e:
            long r4 = r6 + r2
            byte r1 = com.google.android.gms.internal.ads.zzhaz.zza(r6)
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L3d
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L3b:
            r6 = r4
            goto L84
        L3d:
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.zzhaz.zza(r4)
            int r1 = r1 << 21
            r0 = r0 ^ r1
            if (r0 >= 0) goto L4d
            r1 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r1
            goto L84
        L4d:
            long r4 = r6 + r2
            byte r1 = com.google.android.gms.internal.ads.zzhaz.zza(r6)
            int r6 = r1 << 28
            r0 = r0 ^ r6
            r6 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r6
            if (r1 >= 0) goto L3b
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.zzhaz.zza(r4)
            if (r1 >= 0) goto L84
            long r4 = r6 + r2
            byte r1 = com.google.android.gms.internal.ads.zzhaz.zza(r6)
            if (r1 >= 0) goto L3b
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.zzhaz.zza(r4)
            if (r1 >= 0) goto L84
            long r4 = r6 + r2
            byte r1 = com.google.android.gms.internal.ads.zzhaz.zza(r6)
            if (r1 >= 0) goto L3b
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.zzhaz.zza(r4)
            if (r1 < 0) goto L87
        L84:
            r10.zzh = r6
            return r0
        L87:
            long r0 = r10.zzr()
            int r0 = (int) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgwu.zzi():int");
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
            this.zzk = 0;
            return 0;
        }
        int zzi = zzi();
        this.zzk = zzi;
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
        long j10 = this.zzh;
        if (this.zzg - j10 >= 8) {
            this.zzh = 8 + j10;
            return ((zzhaz.zza(j10 + 7) & 255) << 56) | (zzhaz.zza(j10) & 255) | ((zzhaz.zza(1 + j10) & 255) << 8) | ((zzhaz.zza(2 + j10) & 255) << 16) | ((zzhaz.zza(3 + j10) & 255) << 24) | ((zzhaz.zza(4 + j10) & 255) << 32) | ((zzhaz.zza(5 + j10) & 255) << 40) | ((zzhaz.zza(6 + j10) & 255) << 48);
        }
        throw zzgyn.zzi();
    }

    public final long zzq() {
        long zza;
        long j10;
        long j11;
        int i10;
        long j12 = this.zzh;
        if (this.zzg != j12) {
            long j13 = j12 + 1;
            byte zza2 = zzhaz.zza(j12);
            if (zza2 >= 0) {
                this.zzh = j13;
                return zza2;
            } else if (this.zzg - j13 >= 9) {
                long j14 = j13 + 1;
                int zza3 = zza2 ^ (zzhaz.zza(j13) << 7);
                if (zza3 < 0) {
                    i10 = zza3 ^ (-128);
                } else {
                    long j15 = j14 + 1;
                    int zza4 = zza3 ^ (zzhaz.zza(j14) << 14);
                    if (zza4 >= 0) {
                        zza = zza4 ^ 16256;
                    } else {
                        j14 = j15 + 1;
                        int zza5 = zza4 ^ (zzhaz.zza(j15) << 21);
                        if (zza5 < 0) {
                            i10 = zza5 ^ (-2080896);
                        } else {
                            j15 = j14 + 1;
                            long zza6 = zza5 ^ (zzhaz.zza(j14) << 28);
                            if (zza6 >= 0) {
                                j11 = 266354560;
                            } else {
                                long j16 = j15 + 1;
                                long zza7 = zza6 ^ (zzhaz.zza(j15) << 35);
                                if (zza7 < 0) {
                                    j10 = -34093383808L;
                                } else {
                                    j15 = j16 + 1;
                                    zza6 = zza7 ^ (zzhaz.zza(j16) << 42);
                                    if (zza6 >= 0) {
                                        j11 = 4363953127296L;
                                    } else {
                                        j16 = j15 + 1;
                                        zza7 = zza6 ^ (zzhaz.zza(j15) << 49);
                                        if (zza7 < 0) {
                                            j10 = -558586000294016L;
                                        } else {
                                            j15 = j16 + 1;
                                            zza = (zza7 ^ (zzhaz.zza(j16) << 56)) ^ 71499008037633920L;
                                            if (zza < 0) {
                                                long j17 = 1 + j15;
                                                if (zzhaz.zza(j15) >= 0) {
                                                    j14 = j17;
                                                    this.zzh = j14;
                                                    return zza;
                                                }
                                            }
                                        }
                                    }
                                }
                                zza = zza7 ^ j10;
                                j14 = j16;
                                this.zzh = j14;
                                return zza;
                            }
                            zza = zza6 ^ j11;
                        }
                    }
                    j14 = j15;
                    this.zzh = j14;
                    return zza;
                }
                zza = i10;
                this.zzh = j14;
                return zza;
            }
        }
        return zzr();
    }

    public final long zzr() {
        long j10 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            long j11 = this.zzh;
            if (j11 != this.zzg) {
                this.zzh = 1 + j11;
                byte zza = zzhaz.zza(j11);
                j10 |= (zza & Byte.MAX_VALUE) << i10;
                if ((zza & 128) == 0) {
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
        if (zzi > 0 && zzi <= zzC()) {
            byte[] bArr = new byte[zzi];
            long j10 = zzi;
            zzhaz.zzo(this.zzh, bArr, 0L, j10);
            this.zzh += j10;
            return new zzgwk(bArr);
        } else if (zzi == 0) {
            return zzgwm.zzb;
        } else {
            if (zzi < 0) {
                throw zzgyn.zzf();
            }
            throw zzgyn.zzi();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final String zzw() {
        int zzi = zzi();
        if (zzi > 0 && zzi <= zzC()) {
            byte[] bArr = new byte[zzi];
            long j10 = zzi;
            zzhaz.zzo(this.zzh, bArr, 0L, j10);
            String str = new String(bArr, zzgyl.zza);
            this.zzh += j10;
            return str;
        } else if (zzi == 0) {
            return "";
        } else {
            if (zzi < 0) {
                throw zzgyn.zzf();
            }
            throw zzgyn.zzi();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final String zzx() {
        int zzi = zzi();
        if (zzi > 0 && zzi <= zzC()) {
            String zzg = zzhbe.zzg(this.zze, (int) (this.zzh - this.zzf), zzi);
            this.zzh += zzi;
            return zzg;
        } else if (zzi == 0) {
            return "";
        } else {
            if (zzi <= 0) {
                throw zzgyn.zzf();
            }
            throw zzgyn.zzi();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final void zzy(int i10) {
        if (this.zzk == i10) {
            return;
        }
        throw zzgyn.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final void zzz(int i10) {
        this.zzl = i10;
        zzI();
    }
}

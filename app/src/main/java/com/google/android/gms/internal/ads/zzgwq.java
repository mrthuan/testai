package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
final class zzgwq extends zzgww {
    private final Iterable zze;
    private final Iterator zzf;
    private ByteBuffer zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private long zzn;
    private long zzo;

    public /* synthetic */ zzgwq(Iterable iterable, int i10, boolean z10, zzgwp zzgwpVar) {
        super(null);
        this.zzj = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.zzh = i10;
        this.zze = iterable;
        this.zzf = iterable.iterator();
        this.zzl = 0;
        if (i10 == 0) {
            this.zzg = zzgyl.zzc;
            this.zzm = 0L;
            this.zzn = 0L;
            this.zzo = 0L;
            return;
        }
        zzM();
    }

    private final int zzI() {
        return (int) (((this.zzh - this.zzl) - this.zzm) + this.zzn);
    }

    private final void zzJ() {
        if (this.zzf.hasNext()) {
            zzM();
            return;
        }
        throw zzgyn.zzi();
    }

    private final void zzK(byte[] bArr, int i10, int i11) {
        if (i11 <= zzI()) {
            int i12 = i11;
            while (i12 > 0) {
                if (this.zzo - this.zzm == 0) {
                    zzJ();
                }
                int min = Math.min(i12, (int) (this.zzo - this.zzm));
                long j10 = min;
                zzhaz.zzo(this.zzm, bArr, i11 - i12, j10);
                i12 -= min;
                this.zzm += j10;
            }
        } else if (i11 <= 0) {
        } else {
            throw zzgyn.zzi();
        }
    }

    private final void zzL() {
        int i10 = this.zzh + this.zzi;
        this.zzh = i10;
        int i11 = this.zzj;
        if (i10 > i11) {
            int i12 = i10 - i11;
            this.zzi = i12;
            this.zzh = i10 - i12;
            return;
        }
        this.zzi = 0;
    }

    private final void zzM() {
        ByteBuffer byteBuffer = (ByteBuffer) this.zzf.next();
        this.zzg = byteBuffer;
        this.zzl += (int) (this.zzm - this.zzn);
        long position = byteBuffer.position();
        this.zzm = position;
        this.zzn = position;
        this.zzo = this.zzg.limit();
        long zze = zzhaz.zze(this.zzg);
        this.zzm += zze;
        this.zzn += zze;
        this.zzo += zze;
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final boolean zzA() {
        if ((this.zzl + this.zzm) - this.zzn == this.zzh) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final boolean zzB() {
        if (zzr() != 0) {
            return true;
        }
        return false;
    }

    public final long zzC() {
        long j10 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            byte zzh = zzh();
            j10 |= (zzh & Byte.MAX_VALUE) << i10;
            if ((zzh & 128) == 0) {
                return j10;
            }
        }
        throw zzgyn.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final double zza() {
        return Double.longBitsToDouble(zzq());
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final float zzb() {
        return Float.intBitsToFloat(zzi());
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final int zzc() {
        return (int) ((this.zzl + this.zzm) - this.zzn);
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final int zzd(int i10) {
        if (i10 >= 0) {
            int zzc = i10 + zzc();
            int i11 = this.zzj;
            if (zzc <= i11) {
                this.zzj = zzc;
                zzL();
                return i11;
            }
            throw zzgyn.zzi();
        }
        throw zzgyn.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final int zze() {
        return zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final int zzf() {
        return zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final int zzg() {
        return zzp();
    }

    public final byte zzh() {
        if (this.zzo - this.zzm == 0) {
            zzJ();
        }
        long j10 = this.zzm;
        this.zzm = 1 + j10;
        return zzhaz.zza(j10);
    }

    public final int zzi() {
        long j10 = this.zzo;
        long j11 = this.zzm;
        if (j10 - j11 >= 4) {
            this.zzm = 4 + j11;
            return (zzhaz.zza(j11) & 255) | ((zzhaz.zza(1 + j11) & 255) << 8) | ((zzhaz.zza(2 + j11) & 255) << 16) | ((zzhaz.zza(j11 + 3) & 255) << 24);
        }
        return (zzh() & 255) | ((zzh() & 255) << 8) | ((zzh() & 255) << 16) | ((zzh() & 255) << 24);
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final int zzj() {
        return zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final int zzk() {
        return zzgww.zzD(zzp());
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final int zzl() {
        if (zzA()) {
            this.zzk = 0;
            return 0;
        }
        int zzp = zzp();
        this.zzk = zzp;
        if ((zzp >>> 3) != 0) {
            return zzp;
        }
        throw zzgyn.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final int zzm() {
        return zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final long zzn() {
        return zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final long zzo() {
        return zzr();
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0087, code lost:
        if (com.google.android.gms.internal.ads.zzhaz.zza(r4) >= 0) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzp() {
        /*
            r10 = this;
            long r0 = r10.zzm
            long r2 = r10.zzo
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 != 0) goto La
            goto L8c
        La:
            r2 = 1
            long r4 = r0 + r2
            byte r0 = com.google.android.gms.internal.ads.zzhaz.zza(r0)
            if (r0 < 0) goto L1a
            long r4 = r10.zzm
            long r4 = r4 + r2
            r10.zzm = r4
            return r0
        L1a:
            long r6 = r10.zzo
            long r8 = r10.zzm
            long r6 = r6 - r8
            r8 = 10
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 < 0) goto L8c
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.zzhaz.zza(r4)
            int r1 = r1 << 7
            r0 = r0 ^ r1
            if (r0 >= 0) goto L33
            r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L89
        L33:
            long r4 = r6 + r2
            byte r1 = com.google.android.gms.internal.ads.zzhaz.zza(r6)
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L42
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L40:
            r6 = r4
            goto L89
        L42:
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.zzhaz.zza(r4)
            int r1 = r1 << 21
            r0 = r0 ^ r1
            if (r0 >= 0) goto L52
            r1 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r1
            goto L89
        L52:
            long r4 = r6 + r2
            byte r1 = com.google.android.gms.internal.ads.zzhaz.zza(r6)
            int r6 = r1 << 28
            r0 = r0 ^ r6
            r6 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r6
            if (r1 >= 0) goto L40
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.zzhaz.zza(r4)
            if (r1 >= 0) goto L89
            long r4 = r6 + r2
            byte r1 = com.google.android.gms.internal.ads.zzhaz.zza(r6)
            if (r1 >= 0) goto L40
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.zzhaz.zza(r4)
            if (r1 >= 0) goto L89
            long r4 = r6 + r2
            byte r1 = com.google.android.gms.internal.ads.zzhaz.zza(r6)
            if (r1 >= 0) goto L40
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.zzhaz.zza(r4)
            if (r1 < 0) goto L8c
        L89:
            r10.zzm = r6
            return r0
        L8c:
            long r0 = r10.zzC()
            int r0 = (int) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgwq.zzp():int");
    }

    public final long zzq() {
        long j10 = this.zzo;
        long j11 = this.zzm;
        if (j10 - j11 >= 8) {
            this.zzm = 8 + j11;
            long zza = zzhaz.zza(j11) & 255;
            long zza2 = (zzhaz.zza(1 + j11) & 255) << 8;
            return ((zzhaz.zza(j11 + 4) & 255) << 32) | zza | zza2 | ((zzhaz.zza(j11 + 2) & 255) << 16) | ((zzhaz.zza(3 + j11) & 255) << 24) | ((zzhaz.zza(j11 + 5) & 255) << 40) | ((zzhaz.zza(j11 + 6) & 255) << 48) | ((zzhaz.zza(j11 + 7) & 255) << 56);
        }
        long zzh = (zzh() & 255) << 8;
        return (zzh() & 255) | zzh | ((zzh() & 255) << 16) | ((zzh() & 255) << 24) | ((zzh() & 255) << 32) | ((zzh() & 255) << 40) | ((zzh() & 255) << 48) | ((zzh() & 255) << 56);
    }

    public final long zzr() {
        long zza;
        long j10;
        long j11;
        int i10;
        long j12 = this.zzm;
        if (this.zzo != j12) {
            long j13 = j12 + 1;
            byte zza2 = zzhaz.zza(j12);
            if (zza2 >= 0) {
                this.zzm++;
                return zza2;
            } else if (this.zzo - this.zzm >= 10) {
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
                                                    this.zzm = j14;
                                                    return zza;
                                                }
                                            }
                                        }
                                    }
                                }
                                zza = zza7 ^ j10;
                                j14 = j16;
                                this.zzm = j14;
                                return zza;
                            }
                            zza = zza6 ^ j11;
                        }
                    }
                    j14 = j15;
                    this.zzm = j14;
                    return zza;
                }
                zza = i10;
                this.zzm = j14;
                return zza;
            }
        }
        return zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final long zzs() {
        return zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final long zzt() {
        return zzgww.zzF(zzr());
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final long zzu() {
        return zzr();
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final zzgwm zzv() {
        int zzp = zzp();
        if (zzp > 0) {
            long j10 = this.zzo;
            long j11 = this.zzm;
            long j12 = zzp;
            if (j12 <= j10 - j11) {
                byte[] bArr = new byte[zzp];
                zzhaz.zzo(j11, bArr, 0L, j12);
                this.zzm += j12;
                return new zzgwk(bArr);
            }
        }
        if (zzp > 0 && zzp <= zzI()) {
            byte[] bArr2 = new byte[zzp];
            zzK(bArr2, 0, zzp);
            return new zzgwk(bArr2);
        } else if (zzp == 0) {
            return zzgwm.zzb;
        } else {
            if (zzp < 0) {
                throw zzgyn.zzf();
            }
            throw zzgyn.zzi();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final String zzw() {
        int zzp = zzp();
        if (zzp > 0) {
            long j10 = this.zzo;
            long j11 = this.zzm;
            long j12 = zzp;
            if (j12 <= j10 - j11) {
                byte[] bArr = new byte[zzp];
                zzhaz.zzo(j11, bArr, 0L, j12);
                String str = new String(bArr, zzgyl.zza);
                this.zzm += j12;
                return str;
            }
        }
        if (zzp > 0 && zzp <= zzI()) {
            byte[] bArr2 = new byte[zzp];
            zzK(bArr2, 0, zzp);
            return new String(bArr2, zzgyl.zza);
        } else if (zzp == 0) {
            return "";
        } else {
            if (zzp < 0) {
                throw zzgyn.zzf();
            }
            throw zzgyn.zzi();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final String zzx() {
        int zzp = zzp();
        if (zzp > 0) {
            long j10 = this.zzo;
            long j11 = this.zzm;
            long j12 = zzp;
            if (j12 <= j10 - j11) {
                String zzg = zzhbe.zzg(this.zzg, (int) (j11 - this.zzn), zzp);
                this.zzm += j12;
                return zzg;
            }
        }
        if (zzp >= 0 && zzp <= zzI()) {
            byte[] bArr = new byte[zzp];
            zzK(bArr, 0, zzp);
            return zzhbe.zzh(bArr, 0, zzp);
        } else if (zzp == 0) {
            return "";
        } else {
            if (zzp <= 0) {
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
        this.zzj = i10;
        zzL();
    }
}

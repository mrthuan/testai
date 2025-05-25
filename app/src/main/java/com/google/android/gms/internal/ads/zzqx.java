package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzqx extends zzcu {
    private int zzd;
    private boolean zze;
    private int zzf;
    private long zzg;
    private byte[] zzi;
    private byte[] zzl;
    private int zzh = 0;
    private int zzj = 0;
    private int zzk = 0;

    public zzqx() {
        byte[] bArr = zzet.zzf;
        this.zzi = bArr;
        this.zzl = bArr;
    }

    private final int zzq(int i10) {
        boolean z10 = true;
        int zzr = ((zzr(2000000L) - this.zzh) * this.zzd) - (this.zzi.length >> 1);
        if (zzr < 0) {
            z10 = false;
        }
        zzdi.zzf(z10);
        int i11 = this.zzd;
        return (((int) Math.min((i10 * 0.2f) + 0.5f, zzr)) / i11) * i11;
    }

    private final int zzr(long j10) {
        return (int) ((j10 * this.zzb.zzb) / 1000000);
    }

    private static int zzs(byte b10, byte b11) {
        return (b10 << 8) | (b11 & 255);
    }

    private final void zzt(boolean z10) {
        int i10;
        int i11;
        boolean z11;
        int i12;
        boolean z12;
        int i13 = this.zzk;
        int length = this.zzi.length;
        boolean z13 = true;
        if (i13 != length) {
            if (z10) {
                z10 = true;
            } else {
                return;
            }
        }
        if (this.zzh == 0) {
            if (z10) {
                zzu(i13, 3);
                i11 = i13;
            } else {
                if (i13 >= (length >> 1)) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                zzdi.zzf(z12);
                i11 = this.zzi.length >> 1;
                zzu(i11, 0);
            }
            i10 = i11;
        } else {
            int i14 = length >> 1;
            int i15 = i13 - i14;
            if (z10) {
                int zzq = zzq(i15) + (this.zzi.length >> 1);
                zzu(zzq, 2);
                int i16 = i14 + i15;
                i10 = zzq;
                i11 = i16;
            } else {
                int zzq2 = zzq(i15);
                zzu(zzq2, 1);
                i10 = zzq2;
                i11 = i15;
            }
        }
        if (i11 % this.zzd == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        zzdi.zzg(z11, "bytesConsumed is not aligned to frame size: %s" + i11);
        if (i13 < i10) {
            z13 = false;
        }
        zzdi.zzf(z13);
        this.zzk -= i11;
        int i17 = this.zzj + i11;
        this.zzj = i17;
        this.zzj = i17 % this.zzi.length;
        this.zzh = (i10 / this.zzd) + this.zzh;
        this.zzg += (i11 - i10) / i12;
    }

    private final void zzu(int i10, int i11) {
        boolean z10;
        boolean z11;
        boolean z12;
        int i12;
        if (i10 == 0) {
            return;
        }
        boolean z13 = true;
        if (this.zzk >= i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzdi.zzd(z10);
        if (i11 == 2) {
            int i13 = this.zzj;
            int i14 = this.zzk;
            int i15 = i13 + i14;
            byte[] bArr = this.zzi;
            int length = bArr.length;
            if (i15 <= length) {
                System.arraycopy(bArr, i15 - i10, this.zzl, 0, i10);
            } else {
                int i16 = i14 - (length - i13);
                if (i16 >= i10) {
                    System.arraycopy(bArr, i16 - i10, this.zzl, 0, i10);
                } else {
                    int i17 = i10 - i16;
                    System.arraycopy(bArr, length - i17, this.zzl, 0, i17);
                    System.arraycopy(this.zzi, 0, this.zzl, i17, i16);
                }
            }
        } else {
            int i18 = this.zzj;
            int i19 = i18 + i10;
            byte[] bArr2 = this.zzi;
            int length2 = bArr2.length;
            if (i19 <= length2) {
                System.arraycopy(bArr2, i18, this.zzl, 0, i10);
            } else {
                int i20 = length2 - i18;
                System.arraycopy(bArr2, i18, this.zzl, 0, i20);
                System.arraycopy(this.zzi, 0, this.zzl, i20, i10 - i20);
            }
        }
        if (i10 % this.zzd == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        zzdi.zze(z11, "sizeToOutput is not aligned to frame size: " + i10);
        if (this.zzj < this.zzi.length) {
            z12 = true;
        } else {
            z12 = false;
        }
        zzdi.zzf(z12);
        byte[] bArr3 = this.zzl;
        int i21 = i10 % this.zzd;
        String c = b.a.c("byteOutput size is not aligned to frame size ", i10);
        if (i21 != 0) {
            z13 = false;
        }
        zzdi.zze(z13, c);
        if (i11 != 3) {
            for (int i22 = 0; i22 < i10; i22 += 2) {
                int i23 = i22 + 1;
                int zzs = zzs(bArr3[i23], bArr3[i22]);
                if (i11 == 0) {
                    i12 = ((((i22 * 1000) / (i10 - 1)) * (-90)) / 1000) + 100;
                } else {
                    i12 = 10;
                    if (i11 == 2) {
                        i12 = 10 + (((90000 * i22) / (i10 - 1)) / 1000);
                    }
                }
                int i24 = (zzs * i12) / 100;
                if (i24 >= 32767) {
                    bArr3[i22] = -1;
                    bArr3[i23] = Byte.MAX_VALUE;
                } else if (i24 <= -32768) {
                    bArr3[i22] = 0;
                    bArr3[i23] = Byte.MIN_VALUE;
                } else {
                    bArr3[i22] = (byte) (i24 & FunctionEval.FunctionID.EXTERNAL_FUNC);
                    bArr3[i23] = (byte) (i24 >> 8);
                }
            }
        }
        zzj(i10).put(bArr3, 0, i10).flip();
    }

    private static final boolean zzv(byte b10, byte b11) {
        if (Math.abs(zzs(b10, b11)) > 1024) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzct
    public final void zze(ByteBuffer byteBuffer) {
        boolean z10;
        int limit;
        int i10;
        boolean z11;
        int position;
        while (byteBuffer.hasRemaining() && !zzn()) {
            boolean z12 = true;
            if (this.zzf != 0) {
                if (this.zzj < this.zzi.length) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                zzdi.zzf(z10);
                int limit2 = byteBuffer.limit();
                int position2 = byteBuffer.position() + 1;
                while (true) {
                    if (position2 < byteBuffer.limit()) {
                        if (zzv(byteBuffer.get(position2), byteBuffer.get(position2 - 1))) {
                            int i11 = this.zzd;
                            limit = (position2 / i11) * i11;
                            break;
                        }
                        position2 += 2;
                    } else {
                        limit = byteBuffer.limit();
                        break;
                    }
                }
                int position3 = limit - byteBuffer.position();
                int i12 = this.zzj;
                int i13 = this.zzk;
                int i14 = i12 + i13;
                int length = this.zzi.length;
                if (i14 < length) {
                    i10 = length - i14;
                } else {
                    i14 = i13 - (length - i12);
                    i10 = i12 - i14;
                }
                int min = Math.min(position3, i10);
                byteBuffer.limit(byteBuffer.position() + min);
                byteBuffer.get(this.zzi, i14, min);
                int i15 = this.zzk + min;
                this.zzk = i15;
                if (i15 <= this.zzi.length) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                zzdi.zzf(z11);
                if (limit >= limit2 || position3 >= i10) {
                    z12 = false;
                }
                zzt(z12);
                if (z12) {
                    this.zzf = 0;
                    this.zzh = 0;
                }
                byteBuffer.limit(limit2);
            } else {
                int limit3 = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit3, byteBuffer.position() + this.zzi.length));
                int limit4 = byteBuffer.limit() - 1;
                while (true) {
                    if (limit4 >= byteBuffer.position()) {
                        if (zzv(byteBuffer.get(limit4), byteBuffer.get(limit4 - 1))) {
                            int i16 = this.zzd;
                            position = ((limit4 / i16) * i16) + i16;
                            break;
                        }
                        limit4 -= 2;
                    } else {
                        position = byteBuffer.position();
                        break;
                    }
                }
                if (position == byteBuffer.position()) {
                    this.zzf = 1;
                } else {
                    byteBuffer.limit(Math.min(position, byteBuffer.capacity()));
                    zzj(byteBuffer.remaining()).put(byteBuffer).flip();
                }
                byteBuffer.limit(limit3);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcu, com.google.android.gms.internal.ads.zzct
    public final boolean zzg() {
        if (super.zzg() && this.zze) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcu
    public final zzcr zzi(zzcr zzcrVar) {
        if (zzcrVar.zzd == 2) {
            if (zzcrVar.zzb == -1) {
                return zzcr.zza;
            }
            return zzcrVar;
        }
        throw new zzcs("Unhandled input format:", zzcrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcu
    public final void zzk() {
        if (zzg()) {
            int i10 = this.zzb.zzc;
            this.zzd = i10 + i10;
            int i11 = this.zzd;
            int zzr = ((zzr(100000L) / 2) / i11) * i11;
            int i12 = zzr + zzr;
            if (this.zzi.length != i12) {
                this.zzi = new byte[i12];
                this.zzl = new byte[i12];
            }
        }
        this.zzf = 0;
        this.zzg = 0L;
        this.zzh = 0;
        this.zzj = 0;
        this.zzk = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcu
    public final void zzl() {
        if (this.zzk > 0) {
            zzt(true);
            this.zzh = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcu
    public final void zzm() {
        this.zze = false;
        byte[] bArr = zzet.zzf;
        this.zzi = bArr;
        this.zzl = bArr;
    }

    public final long zzo() {
        return this.zzg;
    }

    public final void zzp(boolean z10) {
        this.zze = z10;
    }
}

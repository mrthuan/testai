package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import java.util.Arrays;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzako {
    private final zzek zza = new zzek();
    private final int[] zzb = new int[256];
    private boolean zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;

    public static /* bridge */ /* synthetic */ void zzb(zzako zzakoVar, zzek zzekVar, int i10) {
        int zzo;
        if (i10 >= 4) {
            zzekVar.zzL(3);
            int i11 = i10 - 4;
            if ((zzekVar.zzm() & 128) != 0) {
                if (i11 >= 7 && (zzo = zzekVar.zzo()) >= 4) {
                    zzakoVar.zzh = zzekVar.zzq();
                    zzakoVar.zzi = zzekVar.zzq();
                    zzakoVar.zza.zzH(zzo - 4);
                    i11 -= 7;
                } else {
                    return;
                }
            }
            zzek zzekVar2 = zzakoVar.zza;
            int zzd = zzekVar2.zzd();
            int zze = zzekVar2.zze();
            if (zzd < zze && i11 > 0) {
                int min = Math.min(i11, zze - zzd);
                zzekVar.zzG(zzekVar2.zzM(), zzd, min);
                zzakoVar.zza.zzK(zzd + min);
            }
        }
    }

    public static /* bridge */ /* synthetic */ void zzc(zzako zzakoVar, zzek zzekVar, int i10) {
        if (i10 < 19) {
            return;
        }
        zzakoVar.zzd = zzekVar.zzq();
        zzakoVar.zze = zzekVar.zzq();
        zzekVar.zzL(11);
        zzakoVar.zzf = zzekVar.zzq();
        zzakoVar.zzg = zzekVar.zzq();
    }

    public static /* bridge */ /* synthetic */ void zzd(zzako zzakoVar, zzek zzekVar, int i10) {
        if (i10 % 5 != 2) {
            return;
        }
        zzekVar.zzL(2);
        int i11 = 0;
        Arrays.fill(zzakoVar.zzb, 0);
        int i12 = i10 / 5;
        int i13 = 0;
        while (i13 < i12) {
            int zzm = zzekVar.zzm();
            int zzm2 = zzekVar.zzm();
            int zzm3 = zzekVar.zzm();
            int zzm4 = zzekVar.zzm();
            double d10 = zzm2;
            double d11 = zzm3 - 128;
            double d12 = zzm4 - 128;
            zzakoVar.zzb[zzm] = Math.max(0, Math.min((int) ((d12 * 1.772d) + d10), (int) FunctionEval.FunctionID.EXTERNAL_FUNC)) | (zzekVar.zzm() << 24) | (Math.max(i11, Math.min((int) ((1.402d * d11) + d10), (int) FunctionEval.FunctionID.EXTERNAL_FUNC)) << 16) | (Math.max(0, Math.min((int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d)), (int) FunctionEval.FunctionID.EXTERNAL_FUNC)) << 8);
            i13++;
            i11 = 0;
        }
        zzakoVar.zzc = true;
    }

    public final zzdb zza() {
        int i10;
        int i11;
        if (this.zzd != 0 && this.zze != 0 && this.zzh != 0 && this.zzi != 0) {
            zzek zzekVar = this.zza;
            if (zzekVar.zze() != 0 && zzekVar.zzd() == zzekVar.zze() && this.zzc) {
                zzekVar.zzK(0);
                int i12 = this.zzh * this.zzi;
                int[] iArr = new int[i12];
                int i13 = 0;
                while (i13 < i12) {
                    int zzm = this.zza.zzm();
                    if (zzm != 0) {
                        i10 = i13 + 1;
                        iArr[i13] = this.zzb[zzm];
                    } else {
                        int zzm2 = this.zza.zzm();
                        if (zzm2 != 0) {
                            int i14 = zzm2 & 63;
                            if ((zzm2 & 64) != 0) {
                                i14 = (i14 << 8) | this.zza.zzm();
                            }
                            if ((zzm2 & 128) == 0) {
                                i11 = this.zzb[0];
                            } else {
                                i11 = this.zzb[this.zza.zzm()];
                            }
                            i10 = i14 + i13;
                            Arrays.fill(iArr, i13, i10, i11);
                        }
                    }
                    i13 = i10;
                }
                Bitmap createBitmap = Bitmap.createBitmap(iArr, this.zzh, this.zzi, Bitmap.Config.ARGB_8888);
                zzcz zzczVar = new zzcz();
                zzczVar.zzc(createBitmap);
                zzczVar.zzh(this.zzf / this.zzd);
                zzczVar.zzi(0);
                zzczVar.zze(this.zzg / this.zze, 0);
                zzczVar.zzf(0);
                zzczVar.zzk(this.zzh / this.zzd);
                zzczVar.zzd(this.zzi / this.zze);
                return zzczVar.zzp();
            }
            return null;
        }
        return null;
    }

    public final void zze() {
        this.zzd = 0;
        this.zze = 0;
        this.zzf = 0;
        this.zzg = 0;
        this.zzh = 0;
        this.zzi = 0;
        this.zza.zzH(0);
        this.zzc = false;
    }
}

package com.google.android.gms.internal.ads;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.util.List;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzalg implements zzaka {
    private final zzek zza = new zzek();
    private final boolean zzb;
    private final int zzc;
    private final int zzd;
    private final String zze;
    private final float zzf;
    private final int zzg;

    public zzalg(List list) {
        if (list.size() == 1 && (((byte[]) list.get(0)).length == 48 || ((byte[]) list.get(0)).length == 53)) {
            byte[] bArr = (byte[]) list.get(0);
            this.zzc = bArr[24];
            this.zzd = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
            this.zze = true == "Serif".equals(zzet.zzB(bArr, 43, bArr.length + (-43))) ? "serif" : "sans-serif";
            int i10 = bArr[25] * 20;
            this.zzg = i10;
            boolean z10 = (bArr[0] & 32) != 0;
            this.zzb = z10;
            if (z10) {
                this.zzf = Math.max(0.0f, Math.min(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i10, 0.95f));
                return;
            } else {
                this.zzf = 0.85f;
                return;
            }
        }
        this.zzc = 0;
        this.zzd = -1;
        this.zze = "sans-serif";
        this.zzb = false;
        this.zzf = 0.85f;
        this.zzg = -1;
    }

    private static void zzc(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        if (i10 != i11) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i10 >>> 8) | ((i10 & FunctionEval.FunctionID.EXTERNAL_FUNC) << 24)), i12, i13, i14 | 33);
        }
    }

    private static void zzd(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        if (i10 != i11) {
            int i15 = i14 | 33;
            int i16 = i10 & 1;
            int i17 = i10 & 2;
            boolean z10 = true;
            if (i16 != 0) {
                if (i17 != 0) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i12, i13, i15);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i12, i13, i15);
                    z10 = false;
                }
            } else {
                if (i17 != 0) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), i12, i13, i15);
                }
                z10 = false;
            }
            if ((i10 & 4) == 0) {
                if (i16 == 0 && !z10) {
                    spannableStringBuilder.setSpan(new StyleSpan(0), i12, i13, i15);
                    return;
                }
                return;
            }
            spannableStringBuilder.setSpan(new UnderlineSpan(), i12, i13, i15);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzaka
    public final void zza(byte[] bArr, int i10, int i11, zzajz zzajzVar, zzdn zzdnVar) {
        boolean z10;
        String zzA;
        int i12;
        boolean z11;
        boolean z12;
        int i13;
        this.zza.zzI(bArr, i10 + i11);
        this.zza.zzK(i10);
        zzek zzekVar = this.zza;
        int i14 = 1;
        int i15 = 0;
        int i16 = 2;
        if (zzekVar.zzb() >= 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzdi.zzd(z10);
        int zzq = zzekVar.zzq();
        if (zzq == 0) {
            zzA = "";
        } else {
            int zzd = zzekVar.zzd();
            Charset zzB = zzekVar.zzB();
            int zzd2 = zzekVar.zzd() - zzd;
            if (zzB == null) {
                zzB = zzfuj.zzc;
            }
            zzA = zzekVar.zzA(zzq - zzd2, zzB);
        }
        if (zzA.isEmpty()) {
            zzdnVar.zza(new zzajs(zzfxr.zzm(), -9223372036854775807L, -9223372036854775807L));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(zzA);
        zzd(spannableStringBuilder, this.zzc, 0, 0, spannableStringBuilder.length(), 16711680);
        zzc(spannableStringBuilder, this.zzd, -1, 0, spannableStringBuilder.length(), 16711680);
        String str = this.zze;
        int length = spannableStringBuilder.length();
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float f10 = this.zzf;
        while (true) {
            zzek zzekVar2 = this.zza;
            if (zzekVar2.zzb() >= 8) {
                int zzd3 = zzekVar2.zzd();
                int zzg = zzekVar2.zzg();
                int zzg2 = this.zza.zzg();
                if (zzg2 == 1937013100) {
                    if (this.zza.zzb() >= i16) {
                        z12 = i14;
                    } else {
                        z12 = i15;
                    }
                    zzdi.zzd(z12);
                    int zzq2 = this.zza.zzq();
                    int i17 = i16;
                    int i18 = i15;
                    while (i15 < zzq2) {
                        zzek zzekVar3 = this.zza;
                        boolean z13 = i18;
                        if (zzekVar3.zzb() >= 12) {
                            z13 = i14;
                        }
                        zzdi.zzd(z13);
                        int zzq3 = zzekVar3.zzq();
                        int zzq4 = zzekVar3.zzq();
                        zzekVar3.zzL(i17);
                        int zzm = zzekVar3.zzm();
                        zzekVar3.zzL(i14);
                        int zzg3 = zzekVar3.zzg();
                        if (zzq4 > spannableStringBuilder.length()) {
                            i13 = zzq2;
                            zzea.zzf("Tx3gParser", androidx.activity.f.k("Truncating styl end (", zzq4, ") to cueText.length() (", spannableStringBuilder.length(), ")."));
                            zzq4 = spannableStringBuilder.length();
                        } else {
                            i13 = zzq2;
                        }
                        if (zzq3 >= zzq4) {
                            zzea.zzf("Tx3gParser", androidx.activity.f.k("Ignoring styl with start (", zzq3, ") >= end (", zzq4, ")."));
                        } else {
                            int i19 = zzq4;
                            zzd(spannableStringBuilder, zzm, this.zzc, zzq3, i19, 0);
                            zzc(spannableStringBuilder, zzg3, this.zzd, zzq3, i19, 0);
                        }
                        i15++;
                        i14 = 1;
                        i18 = 0;
                        i17 = 2;
                        zzq2 = i13;
                    }
                    i16 = i17;
                } else {
                    if (zzg2 == 1952608120 && this.zzb) {
                        i12 = 2;
                        if (this.zza.zzb() >= 2) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        zzdi.zzd(z11);
                        f10 = Math.max(0.0f, Math.min(this.zza.zzq() / this.zzg, 0.95f));
                    } else {
                        i12 = 2;
                    }
                    i16 = i12;
                }
                this.zza.zzK(zzd3 + zzg);
                i14 = 1;
                i15 = 0;
            } else {
                zzcz zzczVar = new zzcz();
                zzczVar.zzl(spannableStringBuilder);
                zzczVar.zze(f10, 0);
                zzczVar.zzf(0);
                zzdnVar.zza(new zzajs(zzfxr.zzn(zzczVar.zzp()), -9223372036854775807L, -9223372036854775807L));
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaka
    public final /* synthetic */ void zzb() {
    }
}

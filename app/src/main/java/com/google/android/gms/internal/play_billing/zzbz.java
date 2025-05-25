package com.google.android.gms.internal.play_billing;

import java.util.List;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes2.dex */
final class zzbz implements zzfx {
    private final zzby zza;

    private zzbz(zzby zzbyVar) {
        byte[] bArr = zzda.zzd;
        this.zza = zzbyVar;
        zzbyVar.zza = this;
    }

    public static zzbz zza(zzby zzbyVar) {
        zzbz zzbzVar = zzbyVar.zza;
        if (zzbzVar != null) {
            return zzbzVar;
        }
        return new zzbz(zzbyVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzA(int i10, List list, boolean z10) {
        int i11 = 0;
        if (list instanceof zzdr) {
            zzdr zzdrVar = (zzdr) list;
            if (z10) {
                this.zza.zzo(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < zzdrVar.size(); i13++) {
                    zzdrVar.zze(i13);
                    i12 += 8;
                }
                this.zza.zzq(i12);
                while (i11 < zzdrVar.size()) {
                    this.zza.zzi(zzdrVar.zze(i11));
                    i11++;
                }
                return;
            }
            while (i11 < zzdrVar.size()) {
                this.zza.zzh(i10, zzdrVar.zze(i11));
                i11++;
            }
        } else if (z10) {
            this.zza.zzo(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                ((Long) list.get(i15)).longValue();
                i14 += 8;
            }
            this.zza.zzq(i14);
            while (i11 < list.size()) {
                this.zza.zzi(((Long) list.get(i11)).longValue());
                i11++;
            }
        } else {
            while (i11 < list.size()) {
                this.zza.zzh(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzB(int i10, int i11) {
        this.zza.zzp(i10, (i11 >> 31) ^ (i11 + i11));
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzC(int i10, List list, boolean z10) {
        int i11 = 0;
        if (list instanceof zzct) {
            zzct zzctVar = (zzct) list;
            if (z10) {
                this.zza.zzo(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < zzctVar.size(); i13++) {
                    int zze = zzctVar.zze(i13);
                    i12 += zzby.zzw((zze >> 31) ^ (zze + zze));
                }
                this.zza.zzq(i12);
                while (i11 < zzctVar.size()) {
                    zzby zzbyVar = this.zza;
                    int zze2 = zzctVar.zze(i11);
                    zzbyVar.zzq((zze2 >> 31) ^ (zze2 + zze2));
                    i11++;
                }
                return;
            }
            while (i11 < zzctVar.size()) {
                zzby zzbyVar2 = this.zza;
                int zze3 = zzctVar.zze(i11);
                zzbyVar2.zzp(i10, (zze3 >> 31) ^ (zze3 + zze3));
                i11++;
            }
        } else if (z10) {
            this.zza.zzo(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                int intValue = ((Integer) list.get(i15)).intValue();
                i14 += zzby.zzw((intValue >> 31) ^ (intValue + intValue));
            }
            this.zza.zzq(i14);
            while (i11 < list.size()) {
                zzby zzbyVar3 = this.zza;
                int intValue2 = ((Integer) list.get(i11)).intValue();
                zzbyVar3.zzq((intValue2 >> 31) ^ (intValue2 + intValue2));
                i11++;
            }
        } else {
            while (i11 < list.size()) {
                zzby zzbyVar4 = this.zza;
                int intValue3 = ((Integer) list.get(i11)).intValue();
                zzbyVar4.zzp(i10, (intValue3 >> 31) ^ (intValue3 + intValue3));
                i11++;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzD(int i10, long j10) {
        this.zza.zzr(i10, (j10 >> 63) ^ (j10 + j10));
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzE(int i10, List list, boolean z10) {
        int i11 = 0;
        if (list instanceof zzdr) {
            zzdr zzdrVar = (zzdr) list;
            if (z10) {
                this.zza.zzo(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < zzdrVar.size(); i13++) {
                    long zze = zzdrVar.zze(i13);
                    i12 += zzby.zzx((zze >> 63) ^ (zze + zze));
                }
                this.zza.zzq(i12);
                while (i11 < zzdrVar.size()) {
                    zzby zzbyVar = this.zza;
                    long zze2 = zzdrVar.zze(i11);
                    zzbyVar.zzs((zze2 >> 63) ^ (zze2 + zze2));
                    i11++;
                }
                return;
            }
            while (i11 < zzdrVar.size()) {
                zzby zzbyVar2 = this.zza;
                long zze3 = zzdrVar.zze(i11);
                zzbyVar2.zzr(i10, (zze3 >> 63) ^ (zze3 + zze3));
                i11++;
            }
        } else if (z10) {
            this.zza.zzo(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                long longValue = ((Long) list.get(i15)).longValue();
                i14 += zzby.zzx((longValue >> 63) ^ (longValue + longValue));
            }
            this.zza.zzq(i14);
            while (i11 < list.size()) {
                zzby zzbyVar3 = this.zza;
                long longValue2 = ((Long) list.get(i11)).longValue();
                zzbyVar3.zzs((longValue2 >> 63) ^ (longValue2 + longValue2));
                i11++;
            }
        } else {
            while (i11 < list.size()) {
                zzby zzbyVar4 = this.zza;
                long longValue3 = ((Long) list.get(i11)).longValue();
                zzbyVar4.zzr(i10, (longValue3 >> 63) ^ (longValue3 + longValue3));
                i11++;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    @Deprecated
    public final void zzF(int i10) {
        this.zza.zzo(i10, 3);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzG(int i10, String str) {
        this.zza.zzm(i10, str);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzH(int i10, List list) {
        int i11 = 0;
        if (list instanceof zzdk) {
            zzdk zzdkVar = (zzdk) list;
            while (i11 < list.size()) {
                Object zzf = zzdkVar.zzf(i11);
                if (zzf instanceof String) {
                    this.zza.zzm(i10, (String) zzf);
                } else {
                    this.zza.zze(i10, (zzbq) zzf);
                }
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzm(i10, (String) list.get(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzI(int i10, int i11) {
        this.zza.zzp(i10, i11);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzJ(int i10, List list, boolean z10) {
        int i11 = 0;
        if (list instanceof zzct) {
            zzct zzctVar = (zzct) list;
            if (z10) {
                this.zza.zzo(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < zzctVar.size(); i13++) {
                    i12 += zzby.zzw(zzctVar.zze(i13));
                }
                this.zza.zzq(i12);
                while (i11 < zzctVar.size()) {
                    this.zza.zzq(zzctVar.zze(i11));
                    i11++;
                }
                return;
            }
            while (i11 < zzctVar.size()) {
                this.zza.zzp(i10, zzctVar.zze(i11));
                i11++;
            }
        } else if (z10) {
            this.zza.zzo(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                i14 += zzby.zzw(((Integer) list.get(i15)).intValue());
            }
            this.zza.zzq(i14);
            while (i11 < list.size()) {
                this.zza.zzq(((Integer) list.get(i11)).intValue());
                i11++;
            }
        } else {
            while (i11 < list.size()) {
                this.zza.zzp(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzK(int i10, long j10) {
        this.zza.zzr(i10, j10);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzL(int i10, List list, boolean z10) {
        int i11 = 0;
        if (list instanceof zzdr) {
            zzdr zzdrVar = (zzdr) list;
            if (z10) {
                this.zza.zzo(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < zzdrVar.size(); i13++) {
                    i12 += zzby.zzx(zzdrVar.zze(i13));
                }
                this.zza.zzq(i12);
                while (i11 < zzdrVar.size()) {
                    this.zza.zzs(zzdrVar.zze(i11));
                    i11++;
                }
                return;
            }
            while (i11 < zzdrVar.size()) {
                this.zza.zzr(i10, zzdrVar.zze(i11));
                i11++;
            }
        } else if (z10) {
            this.zza.zzo(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                i14 += zzby.zzx(((Long) list.get(i15)).longValue());
            }
            this.zza.zzq(i14);
            while (i11 < list.size()) {
                this.zza.zzs(((Long) list.get(i11)).longValue());
                i11++;
            }
        } else {
            while (i11 < list.size()) {
                this.zza.zzr(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzb(int i10, boolean z10) {
        this.zza.zzd(i10, z10);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzc(int i10, List list, boolean z10) {
        int i11 = 0;
        if (list instanceof zzbe) {
            zzbe zzbeVar = (zzbe) list;
            if (z10) {
                this.zza.zzo(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < zzbeVar.size(); i13++) {
                    zzbeVar.zzf(i13);
                    i12++;
                }
                this.zza.zzq(i12);
                while (i11 < zzbeVar.size()) {
                    this.zza.zzb(zzbeVar.zzf(i11) ? (byte) 1 : (byte) 0);
                    i11++;
                }
                return;
            }
            while (i11 < zzbeVar.size()) {
                this.zza.zzd(i10, zzbeVar.zzf(i11));
                i11++;
            }
        } else if (z10) {
            this.zza.zzo(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                ((Boolean) list.get(i15)).booleanValue();
                i14++;
            }
            this.zza.zzq(i14);
            while (i11 < list.size()) {
                this.zza.zzb(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : (byte) 0);
                i11++;
            }
        } else {
            while (i11 < list.size()) {
                this.zza.zzd(i10, ((Boolean) list.get(i11)).booleanValue());
                i11++;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzd(int i10, zzbq zzbqVar) {
        this.zza.zze(i10, zzbqVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zze(int i10, List list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.zza.zze(i10, (zzbq) list.get(i11));
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzf(int i10, double d10) {
        this.zza.zzh(i10, Double.doubleToRawLongBits(d10));
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzg(int i10, List list, boolean z10) {
        int i11 = 0;
        if (list instanceof zzca) {
            zzca zzcaVar = (zzca) list;
            if (z10) {
                this.zza.zzo(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < zzcaVar.size(); i13++) {
                    zzcaVar.zze(i13);
                    i12 += 8;
                }
                this.zza.zzq(i12);
                while (i11 < zzcaVar.size()) {
                    this.zza.zzi(Double.doubleToRawLongBits(zzcaVar.zze(i11)));
                    i11++;
                }
                return;
            }
            while (i11 < zzcaVar.size()) {
                this.zza.zzh(i10, Double.doubleToRawLongBits(zzcaVar.zze(i11)));
                i11++;
            }
        } else if (z10) {
            this.zza.zzo(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                ((Double) list.get(i15)).doubleValue();
                i14 += 8;
            }
            this.zza.zzq(i14);
            while (i11 < list.size()) {
                this.zza.zzi(Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                i11++;
            }
        } else {
            while (i11 < list.size()) {
                this.zza.zzh(i10, Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                i11++;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    @Deprecated
    public final void zzh(int i10) {
        this.zza.zzo(i10, 4);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzi(int i10, int i11) {
        this.zza.zzj(i10, i11);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzj(int i10, List list, boolean z10) {
        int i11 = 0;
        if (list instanceof zzct) {
            zzct zzctVar = (zzct) list;
            if (z10) {
                this.zza.zzo(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < zzctVar.size(); i13++) {
                    i12 += zzby.zzx(zzctVar.zze(i13));
                }
                this.zza.zzq(i12);
                while (i11 < zzctVar.size()) {
                    this.zza.zzk(zzctVar.zze(i11));
                    i11++;
                }
                return;
            }
            while (i11 < zzctVar.size()) {
                this.zza.zzj(i10, zzctVar.zze(i11));
                i11++;
            }
        } else if (z10) {
            this.zza.zzo(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                i14 += zzby.zzx(((Integer) list.get(i15)).intValue());
            }
            this.zza.zzq(i14);
            while (i11 < list.size()) {
                this.zza.zzk(((Integer) list.get(i11)).intValue());
                i11++;
            }
        } else {
            while (i11 < list.size()) {
                this.zza.zzj(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzk(int i10, int i11) {
        this.zza.zzf(i10, i11);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzl(int i10, List list, boolean z10) {
        int i11 = 0;
        if (list instanceof zzct) {
            zzct zzctVar = (zzct) list;
            if (z10) {
                this.zza.zzo(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < zzctVar.size(); i13++) {
                    zzctVar.zze(i13);
                    i12 += 4;
                }
                this.zza.zzq(i12);
                while (i11 < zzctVar.size()) {
                    this.zza.zzg(zzctVar.zze(i11));
                    i11++;
                }
                return;
            }
            while (i11 < zzctVar.size()) {
                this.zza.zzf(i10, zzctVar.zze(i11));
                i11++;
            }
        } else if (z10) {
            this.zza.zzo(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                ((Integer) list.get(i15)).intValue();
                i14 += 4;
            }
            this.zza.zzq(i14);
            while (i11 < list.size()) {
                this.zza.zzg(((Integer) list.get(i11)).intValue());
                i11++;
            }
        } else {
            while (i11 < list.size()) {
                this.zza.zzf(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzm(int i10, long j10) {
        this.zza.zzh(i10, j10);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzn(int i10, List list, boolean z10) {
        int i11 = 0;
        if (list instanceof zzdr) {
            zzdr zzdrVar = (zzdr) list;
            if (z10) {
                this.zza.zzo(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < zzdrVar.size(); i13++) {
                    zzdrVar.zze(i13);
                    i12 += 8;
                }
                this.zza.zzq(i12);
                while (i11 < zzdrVar.size()) {
                    this.zza.zzi(zzdrVar.zze(i11));
                    i11++;
                }
                return;
            }
            while (i11 < zzdrVar.size()) {
                this.zza.zzh(i10, zzdrVar.zze(i11));
                i11++;
            }
        } else if (z10) {
            this.zza.zzo(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                ((Long) list.get(i15)).longValue();
                i14 += 8;
            }
            this.zza.zzq(i14);
            while (i11 < list.size()) {
                this.zza.zzi(((Long) list.get(i11)).longValue());
                i11++;
            }
        } else {
            while (i11 < list.size()) {
                this.zza.zzh(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzo(int i10, float f10) {
        this.zza.zzf(i10, Float.floatToRawIntBits(f10));
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzp(int i10, List list, boolean z10) {
        int i11 = 0;
        if (list instanceof zzck) {
            zzck zzckVar = (zzck) list;
            if (z10) {
                this.zza.zzo(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < zzckVar.size(); i13++) {
                    zzckVar.zze(i13);
                    i12 += 4;
                }
                this.zza.zzq(i12);
                while (i11 < zzckVar.size()) {
                    this.zza.zzg(Float.floatToRawIntBits(zzckVar.zze(i11)));
                    i11++;
                }
                return;
            }
            while (i11 < zzckVar.size()) {
                this.zza.zzf(i10, Float.floatToRawIntBits(zzckVar.zze(i11)));
                i11++;
            }
        } else if (z10) {
            this.zza.zzo(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                ((Float) list.get(i15)).floatValue();
                i14 += 4;
            }
            this.zza.zzq(i14);
            while (i11 < list.size()) {
                this.zza.zzg(Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                i11++;
            }
        } else {
            while (i11 < list.size()) {
                this.zza.zzf(i10, Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                i11++;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzq(int i10, Object obj, zzeo zzeoVar) {
        zzby zzbyVar = this.zza;
        zzbyVar.zzo(i10, 3);
        zzeoVar.zzi((zzec) obj, zzbyVar.zza);
        zzbyVar.zzo(i10, 4);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzr(int i10, int i11) {
        this.zza.zzj(i10, i11);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzs(int i10, List list, boolean z10) {
        int i11 = 0;
        if (list instanceof zzct) {
            zzct zzctVar = (zzct) list;
            if (z10) {
                this.zza.zzo(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < zzctVar.size(); i13++) {
                    i12 += zzby.zzx(zzctVar.zze(i13));
                }
                this.zza.zzq(i12);
                while (i11 < zzctVar.size()) {
                    this.zza.zzk(zzctVar.zze(i11));
                    i11++;
                }
                return;
            }
            while (i11 < zzctVar.size()) {
                this.zza.zzj(i10, zzctVar.zze(i11));
                i11++;
            }
        } else if (z10) {
            this.zza.zzo(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                i14 += zzby.zzx(((Integer) list.get(i15)).intValue());
            }
            this.zza.zzq(i14);
            while (i11 < list.size()) {
                this.zza.zzk(((Integer) list.get(i11)).intValue());
                i11++;
            }
        } else {
            while (i11 < list.size()) {
                this.zza.zzj(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzt(int i10, long j10) {
        this.zza.zzr(i10, j10);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzu(int i10, List list, boolean z10) {
        int i11 = 0;
        if (list instanceof zzdr) {
            zzdr zzdrVar = (zzdr) list;
            if (z10) {
                this.zza.zzo(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < zzdrVar.size(); i13++) {
                    i12 += zzby.zzx(zzdrVar.zze(i13));
                }
                this.zza.zzq(i12);
                while (i11 < zzdrVar.size()) {
                    this.zza.zzs(zzdrVar.zze(i11));
                    i11++;
                }
                return;
            }
            while (i11 < zzdrVar.size()) {
                this.zza.zzr(i10, zzdrVar.zze(i11));
                i11++;
            }
        } else if (z10) {
            this.zza.zzo(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                i14 += zzby.zzx(((Long) list.get(i15)).longValue());
            }
            this.zza.zzq(i14);
            while (i11 < list.size()) {
                this.zza.zzs(((Long) list.get(i11)).longValue());
                i11++;
            }
        } else {
            while (i11 < list.size()) {
                this.zza.zzr(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzv(int i10, Object obj, zzeo zzeoVar) {
        zzec zzecVar = (zzec) obj;
        zzbv zzbvVar = (zzbv) this.zza;
        zzbvVar.zzq((i10 << 3) | 2);
        zzbvVar.zzq(((zzay) zzecVar).zza(zzeoVar));
        zzeoVar.zzi(zzecVar, zzbvVar.zza);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzw(int i10, Object obj) {
        if (obj instanceof zzbq) {
            zzbv zzbvVar = (zzbv) this.zza;
            zzbvVar.zzq(11);
            zzbvVar.zzp(2, i10);
            zzbvVar.zze(3, (zzbq) obj);
            zzbvVar.zzq(12);
            return;
        }
        zzby zzbyVar = this.zza;
        zzec zzecVar = (zzec) obj;
        zzbv zzbvVar2 = (zzbv) zzbyVar;
        zzbvVar2.zzq(11);
        zzbvVar2.zzp(2, i10);
        zzbvVar2.zzq(26);
        zzbvVar2.zzq(zzecVar.zzf());
        zzecVar.zze(zzbyVar);
        zzbvVar2.zzq(12);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzx(int i10, int i11) {
        this.zza.zzf(i10, i11);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzy(int i10, List list, boolean z10) {
        int i11 = 0;
        if (list instanceof zzct) {
            zzct zzctVar = (zzct) list;
            if (z10) {
                this.zza.zzo(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < zzctVar.size(); i13++) {
                    zzctVar.zze(i13);
                    i12 += 4;
                }
                this.zza.zzq(i12);
                while (i11 < zzctVar.size()) {
                    this.zza.zzg(zzctVar.zze(i11));
                    i11++;
                }
                return;
            }
            while (i11 < zzctVar.size()) {
                this.zza.zzf(i10, zzctVar.zze(i11));
                i11++;
            }
        } else if (z10) {
            this.zza.zzo(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                ((Integer) list.get(i15)).intValue();
                i14 += 4;
            }
            this.zza.zzq(i14);
            while (i11 < list.size()) {
                this.zza.zzg(((Integer) list.get(i11)).intValue());
                i11++;
            }
        } else {
            while (i11 < list.size()) {
                this.zza.zzf(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzz(int i10, long j10) {
        this.zza.zzh(i10, j10);
    }
}

package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.2 */
/* loaded from: classes2.dex */
final class zzkj implements zzoc {
    private final zzki zza;

    private zzkj(zzki zzkiVar) {
        byte[] bArr = zzlj.zzd;
        this.zza = zzkiVar;
        zzkiVar.zza = this;
    }

    public static zzkj zza(zzki zzkiVar) {
        zzkj zzkjVar = zzkiVar.zza;
        if (zzkjVar != null) {
            return zzkjVar;
        }
        return new zzkj(zzkiVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzA(int i10, int i11) {
        this.zza.zzp(i10, (i11 >> 31) ^ (i11 + i11));
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzB(int i10, List list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.zza.zzo(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                int intValue = ((Integer) list.get(i13)).intValue();
                i12 += zzki.zzx((intValue >> 31) ^ (intValue + intValue));
            }
            this.zza.zzq(i12);
            while (i11 < list.size()) {
                zzki zzkiVar = this.zza;
                int intValue2 = ((Integer) list.get(i11)).intValue();
                zzkiVar.zzq((intValue2 >> 31) ^ (intValue2 + intValue2));
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            zzki zzkiVar2 = this.zza;
            int intValue3 = ((Integer) list.get(i11)).intValue();
            zzkiVar2.zzp(i10, (intValue3 >> 31) ^ (intValue3 + intValue3));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzC(int i10, long j10) {
        this.zza.zzr(i10, (j10 >> 63) ^ (j10 + j10));
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzD(int i10, List list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.zza.zzo(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                long longValue = ((Long) list.get(i13)).longValue();
                i12 += zzki.zzy((longValue >> 63) ^ (longValue + longValue));
            }
            this.zza.zzq(i12);
            while (i11 < list.size()) {
                zzki zzkiVar = this.zza;
                long longValue2 = ((Long) list.get(i11)).longValue();
                zzkiVar.zzs((longValue2 >> 63) ^ (longValue2 + longValue2));
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            zzki zzkiVar2 = this.zza;
            long longValue3 = ((Long) list.get(i11)).longValue();
            zzkiVar2.zzr(i10, (longValue3 >> 63) ^ (longValue3 + longValue3));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    @Deprecated
    public final void zzE(int i10) {
        this.zza.zzo(i10, 3);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzF(int i10, String str) {
        this.zza.zzm(i10, str);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzG(int i10, List list) {
        int i11 = 0;
        if (list instanceof zzlq) {
            zzlq zzlqVar = (zzlq) list;
            while (i11 < list.size()) {
                Object zzf = zzlqVar.zzf(i11);
                if (zzf instanceof String) {
                    this.zza.zzm(i10, (String) zzf);
                } else {
                    this.zza.zze(i10, (zzka) zzf);
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

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzH(int i10, int i11) {
        this.zza.zzp(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzI(int i10, List list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.zza.zzo(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzki.zzx(((Integer) list.get(i13)).intValue());
            }
            this.zza.zzq(i12);
            while (i11 < list.size()) {
                this.zza.zzq(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzp(i10, ((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzJ(int i10, long j10) {
        this.zza.zzr(i10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzK(int i10, List list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.zza.zzo(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzki.zzy(((Long) list.get(i13)).longValue());
            }
            this.zza.zzq(i12);
            while (i11 < list.size()) {
                this.zza.zzs(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzr(i10, ((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzb(int i10, boolean z10) {
        this.zza.zzd(i10, z10);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzc(int i10, List list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.zza.zzo(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Boolean) list.get(i13)).booleanValue();
                i12++;
            }
            this.zza.zzq(i12);
            while (i11 < list.size()) {
                this.zza.zzb(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : (byte) 0);
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzd(i10, ((Boolean) list.get(i11)).booleanValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzd(int i10, zzka zzkaVar) {
        this.zza.zze(i10, zzkaVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zze(int i10, List list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.zza.zze(i10, (zzka) list.get(i11));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzf(int i10, double d10) {
        this.zza.zzh(i10, Double.doubleToRawLongBits(d10));
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzg(int i10, List list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.zza.zzo(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Double) list.get(i13)).doubleValue();
                i12 += 8;
            }
            this.zza.zzq(i12);
            while (i11 < list.size()) {
                this.zza.zzi(Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzh(i10, Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    @Deprecated
    public final void zzh(int i10) {
        this.zza.zzo(i10, 4);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzi(int i10, int i11) {
        this.zza.zzj(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzj(int i10, List list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.zza.zzo(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzki.zzu(((Integer) list.get(i13)).intValue());
            }
            this.zza.zzq(i12);
            while (i11 < list.size()) {
                this.zza.zzk(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzj(i10, ((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzk(int i10, int i11) {
        this.zza.zzf(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzl(int i10, List list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.zza.zzo(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).intValue();
                i12 += 4;
            }
            this.zza.zzq(i12);
            while (i11 < list.size()) {
                this.zza.zzg(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzf(i10, ((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzm(int i10, long j10) {
        this.zza.zzh(i10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzn(int i10, List list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.zza.zzo(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Long) list.get(i13)).longValue();
                i12 += 8;
            }
            this.zza.zzq(i12);
            while (i11 < list.size()) {
                this.zza.zzi(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzh(i10, ((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzo(int i10, float f10) {
        this.zza.zzf(i10, Float.floatToRawIntBits(f10));
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzp(int i10, List list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.zza.zzo(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Float) list.get(i13)).floatValue();
                i12 += 4;
            }
            this.zza.zzq(i12);
            while (i11 < list.size()) {
                this.zza.zzg(Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzf(i10, Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzq(int i10, Object obj, zzmt zzmtVar) {
        zzki zzkiVar = this.zza;
        zzkiVar.zzo(i10, 3);
        zzmtVar.zzi((zzmi) obj, zzkiVar.zza);
        zzkiVar.zzo(i10, 4);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzr(int i10, int i11) {
        this.zza.zzj(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzs(int i10, List list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.zza.zzo(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzki.zzu(((Integer) list.get(i13)).intValue());
            }
            this.zza.zzq(i12);
            while (i11 < list.size()) {
                this.zza.zzk(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzj(i10, ((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzt(int i10, long j10) {
        this.zza.zzr(i10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzu(int i10, List list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.zza.zzo(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzki.zzy(((Long) list.get(i13)).longValue());
            }
            this.zza.zzq(i12);
            while (i11 < list.size()) {
                this.zza.zzs(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzr(i10, ((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzv(int i10, Object obj, zzmt zzmtVar) {
        zzmi zzmiVar = (zzmi) obj;
        zzkf zzkfVar = (zzkf) this.zza;
        zzkfVar.zzq((i10 << 3) | 2);
        zzkfVar.zzq(((zzjk) zzmiVar).zzbu(zzmtVar));
        zzmtVar.zzi(zzmiVar, zzkfVar.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzw(int i10, int i11) {
        this.zza.zzf(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzx(int i10, List list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.zza.zzo(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).intValue();
                i12 += 4;
            }
            this.zza.zzq(i12);
            while (i11 < list.size()) {
                this.zza.zzg(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzf(i10, ((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzy(int i10, long j10) {
        this.zza.zzh(i10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzz(int i10, List list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.zza.zzo(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Long) list.get(i13)).longValue();
                i12 += 8;
            }
            this.zza.zzq(i12);
            while (i11 < list.size()) {
                this.zza.zzi(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzh(i10, ((Long) list.get(i11)).longValue());
            i11++;
        }
    }
}

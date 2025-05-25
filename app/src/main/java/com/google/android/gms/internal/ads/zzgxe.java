package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
final class zzgxe implements zzhbh {
    private final zzgxd zza;

    private zzgxe(zzgxd zzgxdVar) {
        zzgyl.zzc(zzgxdVar, "output");
        this.zza = zzgxdVar;
        zzgxdVar.zze = this;
    }

    public static zzgxe zza(zzgxd zzgxdVar) {
        zzgxe zzgxeVar = zzgxdVar.zze;
        if (zzgxeVar != null) {
            return zzgxeVar;
        }
        return new zzgxe(zzgxdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhbh
    public final void zzA(int i10, List list, boolean z10) {
        int i11 = 0;
        if (list instanceof zzgyy) {
            zzgyy zzgyyVar = (zzgyy) list;
            if (z10) {
                this.zza.zzs(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < zzgyyVar.size(); i13++) {
                    zzgyyVar.zza(i13);
                    i12 += 8;
                }
                this.zza.zzu(i12);
                while (i11 < zzgyyVar.size()) {
                    this.zza.zzk(zzgyyVar.zza(i11));
                    i11++;
                }
                return;
            }
            while (i11 < zzgyyVar.size()) {
                this.zza.zzj(i10, zzgyyVar.zza(i11));
                i11++;
            }
        } else if (z10) {
            this.zza.zzs(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                ((Long) list.get(i15)).longValue();
                i14 += 8;
            }
            this.zza.zzu(i14);
            while (i11 < list.size()) {
                this.zza.zzk(((Long) list.get(i11)).longValue());
                i11++;
            }
        } else {
            while (i11 < list.size()) {
                this.zza.zzj(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbh
    public final void zzB(int i10, int i11) {
        this.zza.zzt(i10, (i11 >> 31) ^ (i11 + i11));
    }

    @Override // com.google.android.gms.internal.ads.zzhbh
    public final void zzC(int i10, List list, boolean z10) {
        int i11 = 0;
        if (list instanceof zzgxz) {
            zzgxz zzgxzVar = (zzgxz) list;
            if (z10) {
                this.zza.zzs(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < zzgxzVar.size(); i13++) {
                    int zzd = zzgxzVar.zzd(i13);
                    i12 += zzgxd.zzD((zzd >> 31) ^ (zzd + zzd));
                }
                this.zza.zzu(i12);
                while (i11 < zzgxzVar.size()) {
                    zzgxd zzgxdVar = this.zza;
                    int zzd2 = zzgxzVar.zzd(i11);
                    zzgxdVar.zzu((zzd2 >> 31) ^ (zzd2 + zzd2));
                    i11++;
                }
                return;
            }
            while (i11 < zzgxzVar.size()) {
                zzgxd zzgxdVar2 = this.zza;
                int zzd3 = zzgxzVar.zzd(i11);
                zzgxdVar2.zzt(i10, (zzd3 >> 31) ^ (zzd3 + zzd3));
                i11++;
            }
        } else if (z10) {
            this.zza.zzs(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                int intValue = ((Integer) list.get(i15)).intValue();
                i14 += zzgxd.zzD((intValue >> 31) ^ (intValue + intValue));
            }
            this.zza.zzu(i14);
            while (i11 < list.size()) {
                zzgxd zzgxdVar3 = this.zza;
                int intValue2 = ((Integer) list.get(i11)).intValue();
                zzgxdVar3.zzu((intValue2 >> 31) ^ (intValue2 + intValue2));
                i11++;
            }
        } else {
            while (i11 < list.size()) {
                zzgxd zzgxdVar4 = this.zza;
                int intValue3 = ((Integer) list.get(i11)).intValue();
                zzgxdVar4.zzt(i10, (intValue3 >> 31) ^ (intValue3 + intValue3));
                i11++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbh
    public final void zzD(int i10, long j10) {
        this.zza.zzv(i10, (j10 >> 63) ^ (j10 + j10));
    }

    @Override // com.google.android.gms.internal.ads.zzhbh
    public final void zzE(int i10, List list, boolean z10) {
        int i11 = 0;
        if (list instanceof zzgyy) {
            zzgyy zzgyyVar = (zzgyy) list;
            if (z10) {
                this.zza.zzs(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < zzgyyVar.size(); i13++) {
                    long zza = zzgyyVar.zza(i13);
                    i12 += zzgxd.zzE((zza >> 63) ^ (zza + zza));
                }
                this.zza.zzu(i12);
                while (i11 < zzgyyVar.size()) {
                    zzgxd zzgxdVar = this.zza;
                    long zza2 = zzgyyVar.zza(i11);
                    zzgxdVar.zzw((zza2 >> 63) ^ (zza2 + zza2));
                    i11++;
                }
                return;
            }
            while (i11 < zzgyyVar.size()) {
                zzgxd zzgxdVar2 = this.zza;
                long zza3 = zzgyyVar.zza(i11);
                zzgxdVar2.zzv(i10, (zza3 >> 63) ^ (zza3 + zza3));
                i11++;
            }
        } else if (z10) {
            this.zza.zzs(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                long longValue = ((Long) list.get(i15)).longValue();
                i14 += zzgxd.zzE((longValue >> 63) ^ (longValue + longValue));
            }
            this.zza.zzu(i14);
            while (i11 < list.size()) {
                zzgxd zzgxdVar3 = this.zza;
                long longValue2 = ((Long) list.get(i11)).longValue();
                zzgxdVar3.zzw((longValue2 >> 63) ^ (longValue2 + longValue2));
                i11++;
            }
        } else {
            while (i11 < list.size()) {
                zzgxd zzgxdVar4 = this.zza;
                long longValue3 = ((Long) list.get(i11)).longValue();
                zzgxdVar4.zzv(i10, (longValue3 >> 63) ^ (longValue3 + longValue3));
                i11++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbh
    @Deprecated
    public final void zzF(int i10) {
        this.zza.zzs(i10, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzhbh
    public final void zzG(int i10, String str) {
        this.zza.zzq(i10, str);
    }

    @Override // com.google.android.gms.internal.ads.zzhbh
    public final void zzH(int i10, List list) {
        int i11 = 0;
        if (list instanceof zzgyv) {
            zzgyv zzgyvVar = (zzgyv) list;
            while (i11 < list.size()) {
                Object zzc = zzgyvVar.zzc();
                if (zzc instanceof String) {
                    this.zza.zzq(i10, (String) zzc);
                } else {
                    this.zza.zzO(i10, (zzgwm) zzc);
                }
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzq(i10, (String) list.get(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbh
    public final void zzI(int i10, int i11) {
        this.zza.zzt(i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.zzhbh
    public final void zzJ(int i10, List list, boolean z10) {
        int i11 = 0;
        if (list instanceof zzgxz) {
            zzgxz zzgxzVar = (zzgxz) list;
            if (z10) {
                this.zza.zzs(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < zzgxzVar.size(); i13++) {
                    i12 += zzgxd.zzD(zzgxzVar.zzd(i13));
                }
                this.zza.zzu(i12);
                while (i11 < zzgxzVar.size()) {
                    this.zza.zzu(zzgxzVar.zzd(i11));
                    i11++;
                }
                return;
            }
            while (i11 < zzgxzVar.size()) {
                this.zza.zzt(i10, zzgxzVar.zzd(i11));
                i11++;
            }
        } else if (z10) {
            this.zza.zzs(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                i14 += zzgxd.zzD(((Integer) list.get(i15)).intValue());
            }
            this.zza.zzu(i14);
            while (i11 < list.size()) {
                this.zza.zzu(((Integer) list.get(i11)).intValue());
                i11++;
            }
        } else {
            while (i11 < list.size()) {
                this.zza.zzt(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbh
    public final void zzK(int i10, long j10) {
        this.zza.zzv(i10, j10);
    }

    @Override // com.google.android.gms.internal.ads.zzhbh
    public final void zzL(int i10, List list, boolean z10) {
        int i11 = 0;
        if (list instanceof zzgyy) {
            zzgyy zzgyyVar = (zzgyy) list;
            if (z10) {
                this.zza.zzs(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < zzgyyVar.size(); i13++) {
                    i12 += zzgxd.zzE(zzgyyVar.zza(i13));
                }
                this.zza.zzu(i12);
                while (i11 < zzgyyVar.size()) {
                    this.zza.zzw(zzgyyVar.zza(i11));
                    i11++;
                }
                return;
            }
            while (i11 < zzgyyVar.size()) {
                this.zza.zzv(i10, zzgyyVar.zza(i11));
                i11++;
            }
        } else if (z10) {
            this.zza.zzs(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                i14 += zzgxd.zzE(((Long) list.get(i15)).longValue());
            }
            this.zza.zzu(i14);
            while (i11 < list.size()) {
                this.zza.zzw(((Long) list.get(i11)).longValue());
                i11++;
            }
        } else {
            while (i11 < list.size()) {
                this.zza.zzv(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbh
    public final void zzb(int i10, boolean z10) {
        this.zza.zzN(i10, z10);
    }

    @Override // com.google.android.gms.internal.ads.zzhbh
    public final void zzc(int i10, List list, boolean z10) {
        int i11 = 0;
        if (list instanceof zzgwc) {
            zzgwc zzgwcVar = (zzgwc) list;
            if (z10) {
                this.zza.zzs(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < zzgwcVar.size(); i13++) {
                    zzgwcVar.zzh(i13);
                    i12++;
                }
                this.zza.zzu(i12);
                while (i11 < zzgwcVar.size()) {
                    this.zza.zzM(zzgwcVar.zzh(i11) ? (byte) 1 : (byte) 0);
                    i11++;
                }
                return;
            }
            while (i11 < zzgwcVar.size()) {
                this.zza.zzN(i10, zzgwcVar.zzh(i11));
                i11++;
            }
        } else if (z10) {
            this.zza.zzs(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                ((Boolean) list.get(i15)).booleanValue();
                i14++;
            }
            this.zza.zzu(i14);
            while (i11 < list.size()) {
                this.zza.zzM(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : (byte) 0);
                i11++;
            }
        } else {
            while (i11 < list.size()) {
                this.zza.zzN(i10, ((Boolean) list.get(i11)).booleanValue());
                i11++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbh
    public final void zzd(int i10, zzgwm zzgwmVar) {
        this.zza.zzO(i10, zzgwmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhbh
    public final void zze(int i10, List list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.zza.zzO(i10, (zzgwm) list.get(i11));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbh
    public final void zzf(int i10, double d10) {
        this.zza.zzj(i10, Double.doubleToRawLongBits(d10));
    }

    @Override // com.google.android.gms.internal.ads.zzhbh
    public final void zzg(int i10, List list, boolean z10) {
        int i11 = 0;
        if (list instanceof zzgxf) {
            zzgxf zzgxfVar = (zzgxf) list;
            if (z10) {
                this.zza.zzs(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < zzgxfVar.size(); i13++) {
                    zzgxfVar.zzd(i13);
                    i12 += 8;
                }
                this.zza.zzu(i12);
                while (i11 < zzgxfVar.size()) {
                    this.zza.zzk(Double.doubleToRawLongBits(zzgxfVar.zzd(i11)));
                    i11++;
                }
                return;
            }
            while (i11 < zzgxfVar.size()) {
                this.zza.zzj(i10, Double.doubleToRawLongBits(zzgxfVar.zzd(i11)));
                i11++;
            }
        } else if (z10) {
            this.zza.zzs(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                ((Double) list.get(i15)).doubleValue();
                i14 += 8;
            }
            this.zza.zzu(i14);
            while (i11 < list.size()) {
                this.zza.zzk(Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                i11++;
            }
        } else {
            while (i11 < list.size()) {
                this.zza.zzj(i10, Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                i11++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbh
    @Deprecated
    public final void zzh(int i10) {
        this.zza.zzs(i10, 4);
    }

    @Override // com.google.android.gms.internal.ads.zzhbh
    public final void zzi(int i10, int i11) {
        this.zza.zzl(i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.zzhbh
    public final void zzj(int i10, List list, boolean z10) {
        int i11 = 0;
        if (list instanceof zzgxz) {
            zzgxz zzgxzVar = (zzgxz) list;
            if (z10) {
                this.zza.zzs(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < zzgxzVar.size(); i13++) {
                    i12 += zzgxd.zzE(zzgxzVar.zzd(i13));
                }
                this.zza.zzu(i12);
                while (i11 < zzgxzVar.size()) {
                    this.zza.zzm(zzgxzVar.zzd(i11));
                    i11++;
                }
                return;
            }
            while (i11 < zzgxzVar.size()) {
                this.zza.zzl(i10, zzgxzVar.zzd(i11));
                i11++;
            }
        } else if (z10) {
            this.zza.zzs(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                i14 += zzgxd.zzE(((Integer) list.get(i15)).intValue());
            }
            this.zza.zzu(i14);
            while (i11 < list.size()) {
                this.zza.zzm(((Integer) list.get(i11)).intValue());
                i11++;
            }
        } else {
            while (i11 < list.size()) {
                this.zza.zzl(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbh
    public final void zzk(int i10, int i11) {
        this.zza.zzh(i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.zzhbh
    public final void zzl(int i10, List list, boolean z10) {
        int i11 = 0;
        if (list instanceof zzgxz) {
            zzgxz zzgxzVar = (zzgxz) list;
            if (z10) {
                this.zza.zzs(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < zzgxzVar.size(); i13++) {
                    zzgxzVar.zzd(i13);
                    i12 += 4;
                }
                this.zza.zzu(i12);
                while (i11 < zzgxzVar.size()) {
                    this.zza.zzi(zzgxzVar.zzd(i11));
                    i11++;
                }
                return;
            }
            while (i11 < zzgxzVar.size()) {
                this.zza.zzh(i10, zzgxzVar.zzd(i11));
                i11++;
            }
        } else if (z10) {
            this.zza.zzs(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                ((Integer) list.get(i15)).intValue();
                i14 += 4;
            }
            this.zza.zzu(i14);
            while (i11 < list.size()) {
                this.zza.zzi(((Integer) list.get(i11)).intValue());
                i11++;
            }
        } else {
            while (i11 < list.size()) {
                this.zza.zzh(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbh
    public final void zzm(int i10, long j10) {
        this.zza.zzj(i10, j10);
    }

    @Override // com.google.android.gms.internal.ads.zzhbh
    public final void zzn(int i10, List list, boolean z10) {
        int i11 = 0;
        if (list instanceof zzgyy) {
            zzgyy zzgyyVar = (zzgyy) list;
            if (z10) {
                this.zza.zzs(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < zzgyyVar.size(); i13++) {
                    zzgyyVar.zza(i13);
                    i12 += 8;
                }
                this.zza.zzu(i12);
                while (i11 < zzgyyVar.size()) {
                    this.zza.zzk(zzgyyVar.zza(i11));
                    i11++;
                }
                return;
            }
            while (i11 < zzgyyVar.size()) {
                this.zza.zzj(i10, zzgyyVar.zza(i11));
                i11++;
            }
        } else if (z10) {
            this.zza.zzs(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                ((Long) list.get(i15)).longValue();
                i14 += 8;
            }
            this.zza.zzu(i14);
            while (i11 < list.size()) {
                this.zza.zzk(((Long) list.get(i11)).longValue());
                i11++;
            }
        } else {
            while (i11 < list.size()) {
                this.zza.zzj(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbh
    public final void zzo(int i10, float f10) {
        this.zza.zzh(i10, Float.floatToRawIntBits(f10));
    }

    @Override // com.google.android.gms.internal.ads.zzhbh
    public final void zzp(int i10, List list, boolean z10) {
        int i11 = 0;
        if (list instanceof zzgxp) {
            zzgxp zzgxpVar = (zzgxp) list;
            if (z10) {
                this.zza.zzs(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < zzgxpVar.size(); i13++) {
                    zzgxpVar.zzd(i13);
                    i12 += 4;
                }
                this.zza.zzu(i12);
                while (i11 < zzgxpVar.size()) {
                    this.zza.zzi(Float.floatToRawIntBits(zzgxpVar.zzd(i11)));
                    i11++;
                }
                return;
            }
            while (i11 < zzgxpVar.size()) {
                this.zza.zzh(i10, Float.floatToRawIntBits(zzgxpVar.zzd(i11)));
                i11++;
            }
        } else if (z10) {
            this.zza.zzs(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                ((Float) list.get(i15)).floatValue();
                i14 += 4;
            }
            this.zza.zzu(i14);
            while (i11 < list.size()) {
                this.zza.zzi(Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                i11++;
            }
        } else {
            while (i11 < list.size()) {
                this.zza.zzh(i10, Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                i11++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbh
    public final void zzq(int i10, Object obj, zzhae zzhaeVar) {
        zzgxd zzgxdVar = this.zza;
        zzgxdVar.zzs(i10, 3);
        zzhaeVar.zzj((zzgzj) obj, zzgxdVar.zze);
        zzgxdVar.zzs(i10, 4);
    }

    @Override // com.google.android.gms.internal.ads.zzhbh
    public final void zzr(int i10, int i11) {
        this.zza.zzl(i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.zzhbh
    public final void zzs(int i10, List list, boolean z10) {
        int i11 = 0;
        if (list instanceof zzgxz) {
            zzgxz zzgxzVar = (zzgxz) list;
            if (z10) {
                this.zza.zzs(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < zzgxzVar.size(); i13++) {
                    i12 += zzgxd.zzE(zzgxzVar.zzd(i13));
                }
                this.zza.zzu(i12);
                while (i11 < zzgxzVar.size()) {
                    this.zza.zzm(zzgxzVar.zzd(i11));
                    i11++;
                }
                return;
            }
            while (i11 < zzgxzVar.size()) {
                this.zza.zzl(i10, zzgxzVar.zzd(i11));
                i11++;
            }
        } else if (z10) {
            this.zza.zzs(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                i14 += zzgxd.zzE(((Integer) list.get(i15)).intValue());
            }
            this.zza.zzu(i14);
            while (i11 < list.size()) {
                this.zza.zzm(((Integer) list.get(i11)).intValue());
                i11++;
            }
        } else {
            while (i11 < list.size()) {
                this.zza.zzl(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbh
    public final void zzt(int i10, long j10) {
        this.zza.zzv(i10, j10);
    }

    @Override // com.google.android.gms.internal.ads.zzhbh
    public final void zzu(int i10, List list, boolean z10) {
        int i11 = 0;
        if (list instanceof zzgyy) {
            zzgyy zzgyyVar = (zzgyy) list;
            if (z10) {
                this.zza.zzs(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < zzgyyVar.size(); i13++) {
                    i12 += zzgxd.zzE(zzgyyVar.zza(i13));
                }
                this.zza.zzu(i12);
                while (i11 < zzgyyVar.size()) {
                    this.zza.zzw(zzgyyVar.zza(i11));
                    i11++;
                }
                return;
            }
            while (i11 < zzgyyVar.size()) {
                this.zza.zzv(i10, zzgyyVar.zza(i11));
                i11++;
            }
        } else if (z10) {
            this.zza.zzs(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                i14 += zzgxd.zzE(((Long) list.get(i15)).longValue());
            }
            this.zza.zzu(i14);
            while (i11 < list.size()) {
                this.zza.zzw(((Long) list.get(i11)).longValue());
                i11++;
            }
        } else {
            while (i11 < list.size()) {
                this.zza.zzv(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbh
    public final void zzv(int i10, Object obj, zzhae zzhaeVar) {
        this.zza.zzn(i10, (zzgzj) obj, zzhaeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhbh
    public final void zzw(int i10, Object obj) {
        if (obj instanceof zzgwm) {
            this.zza.zzp(i10, (zzgwm) obj);
        } else {
            this.zza.zzo(i10, (zzgzj) obj);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbh
    public final void zzx(int i10, int i11) {
        this.zza.zzh(i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.zzhbh
    public final void zzy(int i10, List list, boolean z10) {
        int i11 = 0;
        if (list instanceof zzgxz) {
            zzgxz zzgxzVar = (zzgxz) list;
            if (z10) {
                this.zza.zzs(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < zzgxzVar.size(); i13++) {
                    zzgxzVar.zzd(i13);
                    i12 += 4;
                }
                this.zza.zzu(i12);
                while (i11 < zzgxzVar.size()) {
                    this.zza.zzi(zzgxzVar.zzd(i11));
                    i11++;
                }
                return;
            }
            while (i11 < zzgxzVar.size()) {
                this.zza.zzh(i10, zzgxzVar.zzd(i11));
                i11++;
            }
        } else if (z10) {
            this.zza.zzs(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                ((Integer) list.get(i15)).intValue();
                i14 += 4;
            }
            this.zza.zzu(i14);
            while (i11 < list.size()) {
                this.zza.zzi(((Integer) list.get(i11)).intValue());
                i11++;
            }
        } else {
            while (i11 < list.size()) {
                this.zza.zzh(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbh
    public final void zzz(int i10, long j10) {
        this.zza.zzj(i10, j10);
    }
}

package com.google.android.gms.internal.ads;

import lib.zj.office.fc.hssf.formula.eval.FunctionEval;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzaik {
    public final zzadp zza;
    public zzaiz zzd;
    public zzaih zze;
    public int zzf;
    public int zzg;
    public int zzh;
    public int zzi;
    private boolean zzl;
    public final zzaiy zzb = new zzaiy();
    public final zzek zzc = new zzek();
    private final zzek zzj = new zzek(1);
    private final zzek zzk = new zzek();

    public zzaik(zzadp zzadpVar, zzaiz zzaizVar, zzaih zzaihVar) {
        this.zza = zzadpVar;
        this.zzd = zzaizVar;
        this.zze = zzaihVar;
        zzh(zzaizVar, zzaihVar);
    }

    public final int zza() {
        int i10;
        if (!this.zzl) {
            i10 = this.zzd.zzg[this.zzf];
        } else if (this.zzb.zzj[this.zzf]) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        if (zzf() != null) {
            return i10 | 1073741824;
        }
        return i10;
    }

    public final int zzb() {
        if (!this.zzl) {
            return this.zzd.zzd[this.zzf];
        }
        return this.zzb.zzh[this.zzf];
    }

    public final int zzc(int i10, int i11) {
        zzek zzekVar;
        boolean z10;
        int i12;
        zzaix zzf = zzf();
        if (zzf == null) {
            return 0;
        }
        int i13 = zzf.zzd;
        if (i13 != 0) {
            zzekVar = this.zzb.zzn;
        } else {
            byte[] bArr = zzf.zze;
            int i14 = zzet.zza;
            zzek zzekVar2 = this.zzk;
            int length = bArr.length;
            zzekVar2.zzI(bArr, length);
            zzekVar = this.zzk;
            i13 = length;
        }
        boolean zzb = this.zzb.zzb(this.zzf);
        if (!zzb && i11 == 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        zzek zzekVar3 = this.zzj;
        if (true != z10) {
            i12 = 0;
        } else {
            i12 = 128;
        }
        zzekVar3.zzM()[0] = (byte) (i12 | i13);
        zzekVar3.zzK(0);
        this.zza.zzr(this.zzj, 1, 1);
        this.zza.zzr(zzekVar, i13, 1);
        if (!z10) {
            return i13 + 1;
        }
        if (!zzb) {
            this.zzc.zzH(8);
            zzek zzekVar4 = this.zzc;
            byte[] zzM = zzekVar4.zzM();
            zzM[0] = 0;
            zzM[1] = 1;
            zzM[2] = 0;
            zzM[3] = (byte) i11;
            zzM[4] = (byte) ((i10 >> 24) & FunctionEval.FunctionID.EXTERNAL_FUNC);
            zzM[5] = (byte) ((i10 >> 16) & FunctionEval.FunctionID.EXTERNAL_FUNC);
            zzM[6] = (byte) ((i10 >> 8) & FunctionEval.FunctionID.EXTERNAL_FUNC);
            zzM[7] = (byte) (i10 & FunctionEval.FunctionID.EXTERNAL_FUNC);
            this.zza.zzr(zzekVar4, 8, 1);
            return i13 + 9;
        }
        int i15 = i13 + 1;
        zzek zzekVar5 = this.zzb.zzn;
        int zzq = zzekVar5.zzq();
        zzekVar5.zzL(-2);
        int i16 = (zzq * 6) + 2;
        if (i11 != 0) {
            this.zzc.zzH(i16);
            byte[] zzM2 = this.zzc.zzM();
            zzekVar5.zzG(zzM2, 0, i16);
            int i17 = (((zzM2[2] & 255) << 8) | (zzM2[3] & 255)) + i11;
            zzM2[2] = (byte) ((i17 >> 8) & FunctionEval.FunctionID.EXTERNAL_FUNC);
            zzM2[3] = (byte) (i17 & FunctionEval.FunctionID.EXTERNAL_FUNC);
            zzekVar5 = this.zzc;
        }
        this.zza.zzr(zzekVar5, i16, 1);
        return i15 + i16;
    }

    public final long zzd() {
        if (!this.zzl) {
            return this.zzd.zzc[this.zzf];
        }
        return this.zzb.zzf[this.zzh];
    }

    public final long zze() {
        if (!this.zzl) {
            return this.zzd.zzf[this.zzf];
        }
        zzaiy zzaiyVar = this.zzb;
        return zzaiyVar.zzi[this.zzf];
    }

    public final zzaix zzf() {
        if (!this.zzl) {
            return null;
        }
        zzaiy zzaiyVar = this.zzb;
        zzaih zzaihVar = zzaiyVar.zza;
        int i10 = zzet.zza;
        int i11 = zzaihVar.zza;
        zzaix zzaixVar = zzaiyVar.zzm;
        if (zzaixVar == null) {
            zzaixVar = this.zzd.zza.zza(i11);
        }
        if (zzaixVar == null || !zzaixVar.zza) {
            return null;
        }
        return zzaixVar;
    }

    public final void zzh(zzaiz zzaizVar, zzaih zzaihVar) {
        this.zzd = zzaizVar;
        this.zze = zzaihVar;
        this.zza.zzl(zzaizVar.zza.zzf);
        zzi();
    }

    public final void zzi() {
        zzaiy zzaiyVar = this.zzb;
        zzaiyVar.zzd = 0;
        zzaiyVar.zzp = 0L;
        zzaiyVar.zzq = false;
        zzaiyVar.zzk = false;
        zzaiyVar.zzo = false;
        zzaiyVar.zzm = null;
        this.zzf = 0;
        this.zzh = 0;
        this.zzg = 0;
        this.zzi = 0;
        this.zzl = false;
    }

    public final boolean zzk() {
        this.zzf++;
        if (!this.zzl) {
            return false;
        }
        int i10 = this.zzg + 1;
        this.zzg = i10;
        int[] iArr = this.zzb.zzg;
        int i11 = this.zzh;
        if (i10 != iArr[i11]) {
            return true;
        }
        this.zzh = i11 + 1;
        this.zzg = 0;
        return false;
    }
}

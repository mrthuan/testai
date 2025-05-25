package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzaf {
    public final int zzA;
    public final int zzB;
    public final int zzC;
    public final int zzD;
    public final int zzE;
    public final int zzF;
    public final int zzG;
    private int zzH;
    public final String zza;
    public final String zzb;
    public final List zzc;
    public final String zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final String zzj;
    public final zzbk zzk;
    public final String zzl;
    public final String zzm;
    public final int zzn;
    public final List zzo;
    public final zzy zzp;
    public final long zzq;
    public final int zzr;
    public final int zzs;
    public final float zzt;
    public final int zzu;
    public final float zzv;
    public final byte[] zzw;
    public final int zzx;
    public final zzo zzy;
    public final int zzz;

    static {
        new zzaf(new zzad());
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
        Integer.toString(8, 36);
        Integer.toString(9, 36);
        Integer.toString(10, 36);
        Integer.toString(11, 36);
        Integer.toString(12, 36);
        Integer.toString(13, 36);
        Integer.toString(14, 36);
        Integer.toString(15, 36);
        Integer.toString(16, 36);
        Integer.toString(17, 36);
        Integer.toString(18, 36);
        Integer.toString(19, 36);
        Integer.toString(20, 36);
        Integer.toString(21, 36);
        Integer.toString(22, 36);
        Integer.toString(23, 36);
        Integer.toString(24, 36);
        Integer.toString(25, 36);
        Integer.toString(26, 36);
        Integer.toString(27, 36);
        Integer.toString(28, 36);
        Integer.toString(29, 36);
        Integer.toString(30, 36);
        Integer.toString(31, 36);
        Integer.toString(32, 36);
    }

    public final boolean equals(Object obj) {
        int i10;
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaf.class == obj.getClass()) {
            zzaf zzafVar = (zzaf) obj;
            int i11 = this.zzH;
            if ((i11 == 0 || (i10 = zzafVar.zzH) == 0 || i11 == i10) && this.zze == zzafVar.zze && this.zzf == zzafVar.zzf && this.zzg == zzafVar.zzg && this.zzh == zzafVar.zzh && this.zzn == zzafVar.zzn && this.zzq == zzafVar.zzq && this.zzr == zzafVar.zzr && this.zzs == zzafVar.zzs && this.zzu == zzafVar.zzu && this.zzx == zzafVar.zzx && this.zzz == zzafVar.zzz && this.zzA == zzafVar.zzA && this.zzB == zzafVar.zzB && this.zzC == zzafVar.zzC && this.zzD == zzafVar.zzD && this.zzE == zzafVar.zzE && this.zzG == zzafVar.zzG && Float.compare(this.zzt, zzafVar.zzt) == 0 && Float.compare(this.zzv, zzafVar.zzv) == 0 && zzet.zzG(this.zza, zzafVar.zza) && zzet.zzG(this.zzb, zzafVar.zzb) && this.zzc.equals(zzafVar.zzc) && zzet.zzG(this.zzj, zzafVar.zzj) && zzet.zzG(this.zzl, zzafVar.zzl) && zzet.zzG(this.zzm, zzafVar.zzm) && zzet.zzG(this.zzd, zzafVar.zzd) && Arrays.equals(this.zzw, zzafVar.zzw) && zzet.zzG(this.zzk, zzafVar.zzk) && zzet.zzG(this.zzy, zzafVar.zzy) && zzet.zzG(this.zzp, zzafVar.zzp) && zzd(zzafVar)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int i10 = this.zzH;
        if (i10 == 0) {
            String str = this.zza;
            int i11 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            String str2 = this.zzb;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int hashCode7 = this.zzc.hashCode() + ((((hashCode + 527) * 31) + hashCode2) * 31);
            String str3 = this.zzd;
            if (str3 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str3.hashCode();
            }
            int i12 = ((((((((((hashCode7 * 31) + hashCode3) * 31) + this.zze) * 31) + this.zzf) * 31) + this.zzg) * 31) + this.zzh) * 31;
            String str4 = this.zzj;
            if (str4 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = str4.hashCode();
            }
            int i13 = (i12 + hashCode4) * 31;
            zzbk zzbkVar = this.zzk;
            if (zzbkVar == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = zzbkVar.hashCode();
            }
            int i14 = (i13 + hashCode5) * 31;
            String str5 = this.zzl;
            if (str5 == null) {
                hashCode6 = 0;
            } else {
                hashCode6 = str5.hashCode();
            }
            int i15 = (i14 + hashCode6) * 31;
            String str6 = this.zzm;
            if (str6 != null) {
                i11 = str6.hashCode();
            }
            int floatToIntBits = Float.floatToIntBits(this.zzt);
            int floatToIntBits2 = Float.floatToIntBits(this.zzv);
            int i16 = this.zzG + ((((((((((((((((((((floatToIntBits2 + ((((floatToIntBits + ((((((((((i15 + i11) * 31) + this.zzn) * 31) + ((int) this.zzq)) * 31) + this.zzr) * 31) + this.zzs) * 31)) * 31) + this.zzu) * 31)) * 31) + this.zzx) * 31) + this.zzz) * 31) + this.zzA) * 31) + this.zzB) * 31) + this.zzC) * 31) + this.zzD) * 31) + this.zzE) * 31) - 1) * 31) - 1) * 31);
            this.zzH = i16;
            return i16;
        }
        return i10;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzy);
        StringBuilder sb2 = new StringBuilder("Format(");
        sb2.append(this.zza);
        sb2.append(", ");
        sb2.append(this.zzb);
        sb2.append(", ");
        sb2.append(this.zzl);
        sb2.append(", ");
        sb2.append(this.zzm);
        sb2.append(", ");
        sb2.append(this.zzj);
        sb2.append(", ");
        sb2.append(this.zzi);
        sb2.append(", ");
        sb2.append(this.zzd);
        sb2.append(", [");
        sb2.append(this.zzr);
        sb2.append(", ");
        sb2.append(this.zzs);
        sb2.append(", ");
        sb2.append(this.zzt);
        sb2.append(", ");
        sb2.append(valueOf);
        sb2.append("], [");
        sb2.append(this.zzz);
        sb2.append(", ");
        return a6.h.g(sb2, this.zzA, "])");
    }

    public final int zza() {
        int i10;
        int i11 = this.zzr;
        if (i11 == -1 || (i10 = this.zzs) == -1) {
            return -1;
        }
        return i11 * i10;
    }

    public final zzad zzb() {
        return new zzad(this, null);
    }

    public final zzaf zzc(int i10) {
        zzad zzadVar = new zzad(this, null);
        zzadVar.zzC(i10);
        return new zzaf(zzadVar);
    }

    public final boolean zzd(zzaf zzafVar) {
        if (this.zzo.size() != zzafVar.zzo.size()) {
            return false;
        }
        for (int i10 = 0; i10 < this.zzo.size(); i10++) {
            if (!Arrays.equals((byte[]) this.zzo.get(i10), (byte[]) zzafVar.zzo.get(i10))) {
                return false;
            }
        }
        return true;
    }

    private zzaf(zzad zzadVar) {
        boolean z10;
        String str;
        this.zza = zzad.zzah(zzadVar);
        String zzD = zzet.zzD(zzad.zzaj(zzadVar));
        this.zzd = zzD;
        if (zzad.zzam(zzadVar).isEmpty() && zzad.zzai(zzadVar) != null) {
            this.zzc = zzfxr.zzn(new zzak(zzD, zzad.zzai(zzadVar)));
            this.zzb = zzad.zzai(zzadVar);
        } else if (!zzad.zzam(zzadVar).isEmpty() && zzad.zzai(zzadVar) == null) {
            this.zzc = zzad.zzam(zzadVar);
            List zzam = zzad.zzam(zzadVar);
            Iterator it = zzam.iterator();
            while (true) {
                if (it.hasNext()) {
                    zzak zzakVar = (zzak) it.next();
                    if (TextUtils.equals(zzakVar.zza, zzD)) {
                        str = zzakVar.zzb;
                        break;
                    }
                } else {
                    str = ((zzak) zzam.get(0)).zzb;
                    break;
                }
            }
            this.zzb = str;
        } else {
            if (!zzad.zzam(zzadVar).isEmpty() || zzad.zzai(zzadVar) != null) {
                for (int i10 = 0; i10 < zzad.zzam(zzadVar).size(); i10++) {
                    if (!((zzak) zzad.zzam(zzadVar).get(i10)).zzb.equals(zzad.zzai(zzadVar))) {
                    }
                }
                z10 = false;
                zzdi.zzf(z10);
                this.zzc = zzad.zzam(zzadVar);
                this.zzb = zzad.zzai(zzadVar);
            }
            z10 = true;
            zzdi.zzf(z10);
            this.zzc = zzad.zzam(zzadVar);
            this.zzb = zzad.zzai(zzadVar);
        }
        this.zze = zzad.zzq(zzadVar);
        this.zzf = zzad.zzn(zzadVar);
        int zzd = zzad.zzd(zzadVar);
        this.zzg = zzd;
        int zzm = zzad.zzm(zzadVar);
        this.zzh = zzm;
        this.zzi = zzm != -1 ? zzm : zzd;
        this.zzj = zzad.zzaf(zzadVar);
        this.zzk = zzad.zzae(zzadVar);
        this.zzl = zzad.zzag(zzadVar);
        this.zzm = zzad.zzak(zzadVar);
        this.zzn = zzad.zzk(zzadVar);
        this.zzo = zzad.zzal(zzadVar) == null ? Collections.emptyList() : zzad.zzal(zzadVar);
        zzy zzv = zzad.zzv(zzadVar);
        this.zzp = zzv;
        this.zzq = zzad.zzt(zzadVar);
        this.zzr = zzad.zzs(zzadVar);
        this.zzs = zzad.zzj(zzadVar);
        this.zzt = zzad.zza(zzadVar);
        this.zzu = zzad.zzo(zzadVar) == -1 ? 0 : zzad.zzo(zzadVar);
        this.zzv = zzad.zzb(zzadVar) == -1.0f ? 1.0f : zzad.zzb(zzadVar);
        this.zzw = zzad.zzan(zzadVar);
        this.zzx = zzad.zzr(zzadVar);
        this.zzy = zzad.zzu(zzadVar);
        this.zzz = zzad.zze(zzadVar);
        this.zzA = zzad.zzp(zzadVar);
        this.zzB = zzad.zzl(zzadVar);
        this.zzC = zzad.zzh(zzadVar) == -1 ? 0 : zzad.zzh(zzadVar);
        this.zzD = zzad.zzi(zzadVar) != -1 ? zzad.zzi(zzadVar) : 0;
        this.zzE = zzad.zzc(zzadVar);
        this.zzF = zzad.zzg(zzadVar);
        if (zzad.zzf(zzadVar) != 0 || zzv == null) {
            this.zzG = zzad.zzf(zzadVar);
        } else {
            this.zzG = 1;
        }
    }
}

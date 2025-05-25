package com.google.android.gms.internal.ads;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.LocaleList;
import android.text.TextUtils;
import com.google.android.gms.common.api.Api;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzxc extends zzxp implements Comparable {
    private final int zze;
    private final boolean zzf;
    private final String zzg;
    private final zzxi zzh;
    private final boolean zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final boolean zzm;
    private final int zzn;
    private final int zzo;
    private final boolean zzp;
    private final int zzq;
    private final int zzr;
    private final int zzs;
    private final int zzt;
    private final boolean zzu;
    private final boolean zzv;

    public zzxc(int i10, zzcd zzcdVar, int i11, zzxi zzxiVar, int i12, boolean z10, zzfuv zzfuvVar, int i13) {
        super(i10, zzcdVar, i11);
        int i14;
        int i15;
        int i16;
        boolean z11;
        boolean z12;
        String[] strArr;
        int i17;
        boolean z13;
        boolean z14;
        boolean z15;
        LocaleList locales;
        String languageTags;
        this.zzh = zzxiVar;
        int i18 = 1;
        if (true != zzxiVar.zzL) {
            i14 = 16;
        } else {
            i14 = 24;
        }
        this.zzg = zzxt.zzh(this.zzd.zzd);
        this.zzi = zzlf.zza(i12, false);
        int i19 = 0;
        while (true) {
            int size = zzxiVar.zzn.size();
            i15 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            if (i19 < size) {
                i16 = zzxt.zzc(this.zzd, (String) zzxiVar.zzn.get(i19), false);
                if (i16 > 0) {
                    break;
                }
                i19++;
            } else {
                i16 = 0;
                i19 = Integer.MAX_VALUE;
                break;
            }
        }
        this.zzk = i19;
        this.zzj = i16;
        this.zzl = zzxt.zzb(this.zzd.zzf, 0);
        zzaf zzafVar = this.zzd;
        int i20 = zzafVar.zzf;
        if (i20 != 0 && (i20 & 1) == 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.zzm = z11;
        if (1 != (zzafVar.zze & 1)) {
            z12 = false;
        } else {
            z12 = true;
        }
        this.zzp = z12;
        this.zzq = zzafVar.zzz;
        this.zzr = zzafVar.zzA;
        this.zzs = zzafVar.zzi;
        this.zzf = zzfuvVar.zza(zzafVar);
        Configuration configuration = Resources.getSystem().getConfiguration();
        if (zzet.zza >= 24) {
            locales = configuration.getLocales();
            languageTags = locales.toLanguageTags();
            strArr = languageTags.split(",", -1);
        } else {
            strArr = new String[]{configuration.locale.toLanguageTag()};
        }
        for (int i21 = 0; i21 < strArr.length; i21++) {
            strArr[i21] = zzet.zzD(strArr[i21]);
        }
        int i22 = 0;
        while (true) {
            if (i22 < strArr.length) {
                i17 = zzxt.zzc(this.zzd, strArr[i22], false);
                if (i17 > 0) {
                    break;
                }
                i22++;
            } else {
                i17 = 0;
                i22 = Integer.MAX_VALUE;
                break;
            }
        }
        this.zzn = i22;
        this.zzo = i17;
        int i23 = 0;
        while (true) {
            if (i23 >= zzxiVar.zzr.size()) {
                break;
            }
            String str = this.zzd.zzm;
            if (str != null && str.equals(zzxiVar.zzr.get(i23))) {
                i15 = i23;
                break;
            }
            i23++;
        }
        this.zzt = i15;
        if ((i12 & 384) == 128) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.zzu = z13;
        if ((i12 & 64) == 64) {
            z14 = true;
        } else {
            z14 = false;
        }
        this.zzv = z14;
        zzxi zzxiVar2 = this.zzh;
        if (!zzlf.zza(i12, zzxiVar2.zzN) || (!(z15 = this.zzf) && !zzxiVar2.zzG)) {
            i18 = 0;
        } else if (zzlf.zza(i12, false) && z15 && this.zzd.zzi != -1 && ((zzxiVar2.zzP || !z10) && (i14 & i12) != 0)) {
            i18 = 2;
        }
        this.zze = i18;
    }

    @Override // java.lang.Comparable
    /* renamed from: zza */
    public final int compareTo(zzxc zzxcVar) {
        zzfzc zzfzcVar;
        zzfzc zza;
        if (!this.zzf || !this.zzi) {
            zzfzcVar = zzxt.zzb;
            zza = zzfzcVar.zza();
        } else {
            zza = zzxt.zzb;
        }
        zzfxg zzc = zzfxg.zzj().zzd(this.zzi, zzxcVar.zzi).zzc(Integer.valueOf(this.zzk), Integer.valueOf(zzxcVar.zzk), zzfzc.zzc().zza()).zzb(this.zzj, zzxcVar.zzj).zzb(this.zzl, zzxcVar.zzl).zzd(this.zzp, zzxcVar.zzp).zzd(this.zzm, zzxcVar.zzm).zzc(Integer.valueOf(this.zzn), Integer.valueOf(zzxcVar.zzn), zzfzc.zzc().zza()).zzb(this.zzo, zzxcVar.zzo).zzd(this.zzf, zzxcVar.zzf).zzc(Integer.valueOf(this.zzt), Integer.valueOf(zzxcVar.zzt), zzfzc.zzc().zza());
        boolean z10 = this.zzh.zzy;
        zzfxg zzc2 = zzc.zzd(this.zzu, zzxcVar.zzu).zzd(this.zzv, zzxcVar.zzv).zzc(Integer.valueOf(this.zzq), Integer.valueOf(zzxcVar.zzq), zza).zzc(Integer.valueOf(this.zzr), Integer.valueOf(zzxcVar.zzr), zza);
        if (zzet.zzG(this.zzg, zzxcVar.zzg)) {
            zzc2 = zzc2.zzc(Integer.valueOf(this.zzs), Integer.valueOf(zzxcVar.zzs), zza);
        }
        return zzc2.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzxp
    public final int zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzxp
    public final /* bridge */ /* synthetic */ boolean zzc(zzxp zzxpVar) {
        String str;
        zzxc zzxcVar = (zzxc) zzxpVar;
        boolean z10 = this.zzh.zzJ;
        zzaf zzafVar = this.zzd;
        int i10 = zzafVar.zzz;
        if (i10 != -1) {
            zzaf zzafVar2 = zzxcVar.zzd;
            if (i10 == zzafVar2.zzz && (str = zzafVar.zzm) != null && TextUtils.equals(str, zzafVar2.zzm)) {
                boolean z11 = this.zzh.zzI;
                int i11 = this.zzd.zzA;
                if (i11 != -1 && i11 == zzxcVar.zzd.zzA && this.zzu == zzxcVar.zzu && this.zzv == zzxcVar.zzv) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }
}

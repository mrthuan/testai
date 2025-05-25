package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzxn extends zzxp implements Comparable {
    private final int zze;
    private final boolean zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final boolean zzm;

    public zzxn(int i10, zzcd zzcdVar, int i11, zzxi zzxiVar, int i12, String str) {
        super(i10, zzcdVar, i11);
        boolean z10;
        boolean z11;
        zzfxr zzfxrVar;
        int i13;
        boolean z12;
        boolean z13;
        boolean z14;
        int i14 = 0;
        this.zzf = zzlf.zza(i12, false);
        int i15 = this.zzd.zze;
        int i16 = zzxiVar.zzv;
        if (1 != (i15 & 1)) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.zzg = z10;
        if ((i15 & 2) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.zzh = z11;
        if (zzxiVar.zzt.isEmpty()) {
            zzfxrVar = zzfxr.zzn("");
        } else {
            zzfxrVar = zzxiVar.zzt;
        }
        int i17 = 0;
        while (true) {
            if (i17 < zzfxrVar.size()) {
                i13 = zzxt.zzc(this.zzd, (String) zzfxrVar.get(i17), false);
                if (i13 > 0) {
                    break;
                }
                i17++;
            } else {
                i17 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                i13 = 0;
                break;
            }
        }
        this.zzi = i17;
        this.zzj = i13;
        int zzb = zzxt.zzb(this.zzd.zzf, zzxiVar.zzu);
        this.zzk = zzb;
        if ((this.zzd.zzf & 1088) != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.zzm = z12;
        if (zzxt.zzh(str) == null) {
            z13 = true;
        } else {
            z13 = false;
        }
        int zzc = zzxt.zzc(this.zzd, str, z13);
        this.zzl = zzc;
        if (i13 <= 0 && ((!zzxiVar.zzt.isEmpty() || zzb <= 0) && !this.zzg && (!this.zzh || zzc <= 0))) {
            z14 = false;
        } else {
            z14 = true;
        }
        if (zzlf.zza(i12, zzxiVar.zzN) && z14) {
            i14 = 1;
        }
        this.zze = i14;
    }

    @Override // java.lang.Comparable
    /* renamed from: zza */
    public final int compareTo(zzxn zzxnVar) {
        zzfzc zza;
        zzfxg zzd = zzfxg.zzj().zzd(this.zzf, zzxnVar.zzf).zzc(Integer.valueOf(this.zzi), Integer.valueOf(zzxnVar.zzi), zzfzc.zzc().zza()).zzb(this.zzj, zzxnVar.zzj).zzb(this.zzk, zzxnVar.zzk).zzd(this.zzg, zzxnVar.zzg);
        Boolean valueOf = Boolean.valueOf(this.zzh);
        Boolean valueOf2 = Boolean.valueOf(zzxnVar.zzh);
        if (this.zzj == 0) {
            zza = zzfzc.zzc();
        } else {
            zza = zzfzc.zzc().zza();
        }
        zzfxg zzb = zzd.zzc(valueOf, valueOf2, zza).zzb(this.zzl, zzxnVar.zzl);
        if (this.zzk == 0) {
            zzb = zzb.zze(this.zzm, zzxnVar.zzm);
        }
        return zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzxp
    public final int zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzxp
    public final /* bridge */ /* synthetic */ boolean zzc(zzxp zzxpVar) {
        zzxn zzxnVar = (zzxn) zzxpVar;
        return false;
    }
}

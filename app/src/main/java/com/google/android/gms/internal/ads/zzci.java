package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public class zzci {
    public final zzfxu zzA;
    public final zzfxw zzB;
    public final int zza = Api.BaseClientBuilder.API_PRIORITY_OTHER;
    public final int zzb = Api.BaseClientBuilder.API_PRIORITY_OTHER;
    public final int zzc = Api.BaseClientBuilder.API_PRIORITY_OTHER;
    public final int zzd = Api.BaseClientBuilder.API_PRIORITY_OTHER;
    public final int zze = 0;
    public final int zzf = 0;
    public final int zzg = 0;
    public final int zzh = 0;
    public final int zzi;
    public final int zzj;
    public final boolean zzk;
    public final zzfxr zzl;
    public final int zzm;
    public final zzfxr zzn;
    public final int zzo;
    public final int zzp;
    public final int zzq;
    public final zzfxr zzr;
    public final zzcg zzs;
    public final zzfxr zzt;
    public final int zzu;
    public final int zzv;
    public final boolean zzw;
    public final boolean zzx;
    public final boolean zzy;
    public final boolean zzz;

    static {
        new zzci(new zzch());
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
    }

    public zzci(zzch zzchVar) {
        int i10;
        int i11;
        boolean z10;
        zzfxr zzfxrVar;
        zzfxr zzfxrVar2;
        zzfxr zzfxrVar3;
        zzcg zzcgVar;
        zzfxr zzfxrVar4;
        int i12;
        HashMap hashMap;
        HashSet hashSet;
        i10 = zzchVar.zze;
        this.zzi = i10;
        i11 = zzchVar.zzf;
        this.zzj = i11;
        z10 = zzchVar.zzg;
        this.zzk = z10;
        zzfxrVar = zzchVar.zzh;
        this.zzl = zzfxrVar;
        this.zzm = 0;
        zzfxrVar2 = zzchVar.zzi;
        this.zzn = zzfxrVar2;
        this.zzo = 0;
        this.zzp = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.zzq = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        zzfxrVar3 = zzchVar.zzl;
        this.zzr = zzfxrVar3;
        zzcgVar = zzchVar.zzm;
        this.zzs = zzcgVar;
        zzfxrVar4 = zzchVar.zzn;
        this.zzt = zzfxrVar4;
        i12 = zzchVar.zzo;
        this.zzu = i12;
        this.zzv = 0;
        this.zzw = false;
        this.zzx = false;
        this.zzy = false;
        this.zzz = false;
        hashMap = zzchVar.zzp;
        this.zzA = zzfxu.zzc(hashMap);
        hashSet = zzchVar.zzq;
        this.zzB = zzfxw.zzl(hashSet);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzci zzciVar = (zzci) obj;
            if (this.zzk == zzciVar.zzk && this.zzi == zzciVar.zzi && this.zzj == zzciVar.zzj && this.zzl.equals(zzciVar.zzl) && this.zzn.equals(zzciVar.zzn) && this.zzr.equals(zzciVar.zzr) && this.zzs.equals(zzciVar.zzs) && this.zzt.equals(zzciVar.zzt) && this.zzu == zzciVar.zzu && this.zzA.equals(zzciVar.zzA) && this.zzB.equals(zzciVar.zzB)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.zzl.hashCode() + (((((((this.zzk ? 1 : 0) - 1048002209) * 31) + this.zzi) * 31) + this.zzj) * 31);
        int hashCode2 = this.zzn.hashCode();
        int hashCode3 = this.zzr.hashCode();
        int hashCode4 = ((this.zzt.hashCode() + ((((hashCode3 + ((((((hashCode2 + (hashCode * 961)) * 961) + Api.BaseClientBuilder.API_PRIORITY_OTHER) * 31) + Api.BaseClientBuilder.API_PRIORITY_OTHER) * 31)) * 31) + 29791) * 31)) * 31) + this.zzu;
        int hashCode5 = this.zzA.hashCode() + (hashCode4 * 887503681);
        return this.zzB.hashCode() + (hashCode5 * 31);
    }
}

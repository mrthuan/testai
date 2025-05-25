package com.google.android.gms.internal.ads;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzux extends zztq {
    private static final zzbc zza;
    private final zzuk[] zzb;
    private final zzcc[] zzc;
    private final ArrayList zzd;
    private int zze = -1;
    private long[][] zzf = new long[0];
    private zzuw zzg;
    private final zztt zzh;

    static {
        zzam zzamVar = new zzam();
        zzamVar.zza("MergingMediaSource");
        zza = zzamVar.zzc();
    }

    public zzux(boolean z10, boolean z11, zztt zzttVar, zzuk... zzukVarArr) {
        this.zzb = zzukVarArr;
        this.zzh = zzttVar;
        this.zzd = new ArrayList(Arrays.asList(zzukVarArr));
        this.zzc = new zzcc[zzukVarArr.length];
        new HashMap();
        zzfyx.zzb(8).zzb(2).zza();
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final /* bridge */ /* synthetic */ void zzA(Object obj, zzuk zzukVar, zzcc zzccVar) {
        int i10;
        if (this.zzg == null) {
            if (this.zze == -1) {
                i10 = zzccVar.zzb();
                this.zze = i10;
            } else {
                int zzb = zzccVar.zzb();
                int i11 = this.zze;
                if (zzb != i11) {
                    this.zzg = new zzuw(0);
                    return;
                }
                i10 = i11;
            }
            if (this.zzf.length == 0) {
                this.zzf = (long[][]) Array.newInstance(Long.TYPE, i10, this.zzc.length);
            }
            this.zzd.remove(zzukVar);
            this.zzc[((Integer) obj).intValue()] = zzccVar;
            if (this.zzd.isEmpty()) {
                zzo(this.zzc[0]);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuk
    public final void zzG(zzug zzugVar) {
        zzuv zzuvVar = (zzuv) zzugVar;
        int i10 = 0;
        while (true) {
            zzuk[] zzukVarArr = this.zzb;
            if (i10 < zzukVarArr.length) {
                zzukVarArr[i10].zzG(zzuvVar.zzn(i10));
                i10++;
            } else {
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuk
    public final zzug zzI(zzui zzuiVar, zzyk zzykVar, long j10) {
        zzcc[] zzccVarArr = this.zzc;
        int length = this.zzb.length;
        zzug[] zzugVarArr = new zzug[length];
        int zza2 = zzccVarArr[0].zza(zzuiVar.zza);
        for (int i10 = 0; i10 < length; i10++) {
            zzugVarArr[i10] = this.zzb[i10].zzI(zzuiVar.zza(this.zzc[i10].zzf(zza2)), zzykVar, j10 - this.zzf[zza2][i10]);
        }
        return new zzuv(this.zzh, this.zzf[zza2], zzugVarArr);
    }

    @Override // com.google.android.gms.internal.ads.zzuk
    public final zzbc zzJ() {
        zzuk[] zzukVarArr = this.zzb;
        if (zzukVarArr.length > 0) {
            return zzukVarArr[0].zzJ();
        }
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zztq, com.google.android.gms.internal.ads.zzth
    public final void zzn(zzgu zzguVar) {
        super.zzn(zzguVar);
        int i10 = 0;
        while (true) {
            zzuk[] zzukVarArr = this.zzb;
            if (i10 < zzukVarArr.length) {
                zzB(Integer.valueOf(i10), zzukVarArr[i10]);
                i10++;
            } else {
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zztq, com.google.android.gms.internal.ads.zzth
    public final void zzq() {
        super.zzq();
        Arrays.fill(this.zzc, (Object) null);
        this.zze = -1;
        this.zzg = null;
        this.zzd.clear();
        Collections.addAll(this.zzd, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzth, com.google.android.gms.internal.ads.zzuk
    public final void zzt(zzbc zzbcVar) {
        this.zzb[0].zzt(zzbcVar);
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final /* bridge */ /* synthetic */ zzui zzy(Object obj, zzui zzuiVar) {
        if (((Integer) obj).intValue() == 0) {
            return zzuiVar;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zztq, com.google.android.gms.internal.ads.zzuk
    public final void zzz() {
        zzuw zzuwVar = this.zzg;
        if (zzuwVar == null) {
            super.zzz();
            return;
        }
        throw zzuwVar;
    }
}

package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzfxd extends zzfxg {
    public zzfxd() {
        super(null);
    }

    public static final zzfxg zzf(int i10) {
        zzfxg zzfxgVar;
        zzfxg zzfxgVar2;
        zzfxg zzfxgVar3;
        if (i10 < 0) {
            zzfxgVar3 = zzfxg.zzb;
            return zzfxgVar3;
        } else if (i10 > 0) {
            zzfxgVar2 = zzfxg.zzc;
            return zzfxgVar2;
        } else {
            zzfxgVar = zzfxg.zza;
            return zzfxgVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfxg
    public final int zza() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfxg
    public final zzfxg zzb(int i10, int i11) {
        int i12;
        if (i10 < i11) {
            i12 = -1;
        } else if (i10 > i11) {
            i12 = 1;
        } else {
            i12 = 0;
        }
        return zzf(i12);
    }

    @Override // com.google.android.gms.internal.ads.zzfxg
    public final zzfxg zzc(Object obj, Object obj2, Comparator comparator) {
        return zzf(comparator.compare(obj, obj2));
    }

    @Override // com.google.android.gms.internal.ads.zzfxg
    public final zzfxg zzd(boolean z10, boolean z11) {
        return zzf(zzgal.zza(z10, z11));
    }

    @Override // com.google.android.gms.internal.ads.zzfxg
    public final zzfxg zze(boolean z10, boolean z11) {
        return zzf(zzgal.zza(z11, z10));
    }
}

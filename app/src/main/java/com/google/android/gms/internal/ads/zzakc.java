package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzakc implements zzacn {
    private final zzacn zzb;
    private final zzajy zzc;
    private final SparseArray zzd = new SparseArray();

    public zzakc(zzacn zzacnVar, zzajy zzajyVar) {
        this.zzb = zzacnVar;
        this.zzc = zzajyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zzD() {
        this.zzb.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zzO(zzadi zzadiVar) {
        this.zzb.zzO(zzadiVar);
    }

    public final void zza() {
        for (int i10 = 0; i10 < this.zzd.size(); i10++) {
            ((zzake) this.zzd.valueAt(i10)).zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final zzadp zzw(int i10, int i11) {
        if (i11 != 3) {
            return this.zzb.zzw(i10, i11);
        }
        zzake zzakeVar = (zzake) this.zzd.get(i10);
        if (zzakeVar != null) {
            return zzakeVar;
        }
        zzake zzakeVar2 = new zzake(this.zzb.zzw(i10, 3), this.zzc);
        this.zzd.put(i10, zzakeVar2);
        return zzakeVar2;
    }
}

package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
abstract class zzgbt extends zzgbi {
    private List zza;

    public zzgbt(zzfxm zzfxmVar, boolean z10) {
        super(zzfxmVar, z10, true);
        List zza;
        if (zzfxmVar.isEmpty()) {
            zza = Collections.emptyList();
        } else {
            zza = zzfyh.zza(zzfxmVar.size());
        }
        for (int i10 = 0; i10 < zzfxmVar.size(); i10++) {
            zza.add(null);
        }
        this.zza = zza;
    }

    public abstract Object zzG(List list);

    @Override // com.google.android.gms.internal.ads.zzgbi
    public final void zzf(int i10, Object obj) {
        List list = this.zza;
        if (list != null) {
            list.set(i10, new zzgbs(obj));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgbi
    public final void zzu() {
        List list = this.zza;
        if (list != null) {
            zzc(zzG(list));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgbi
    public final void zzy(int i10) {
        super.zzy(i10);
        this.zza = null;
    }
}

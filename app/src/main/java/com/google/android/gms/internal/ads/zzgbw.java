package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgbw extends zzgbi {
    private zzgbv zza;

    public zzgbw(zzfxm zzfxmVar, boolean z10, Executor executor, Callable callable) {
        super(zzfxmVar, z10, false);
        this.zza = new zzgbu(this, callable, executor);
        zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final void zzq() {
        zzgbv zzgbvVar = this.zza;
        if (zzgbvVar != null) {
            zzgbvVar.zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgbi
    public final void zzu() {
        zzgbv zzgbvVar = this.zza;
        if (zzgbvVar != null) {
            zzgbvVar.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgbi
    public final void zzy(int i10) {
        super.zzy(i10);
        if (i10 == 1) {
            this.zza = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgbi
    public final void zzf(int i10, Object obj) {
    }
}

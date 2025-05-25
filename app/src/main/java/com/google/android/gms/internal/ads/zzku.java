package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzku implements zzkl {
    public final zzud zza;
    public int zzd;
    public boolean zze;
    public final List zzc = new ArrayList();
    public final Object zzb = new Object();

    public zzku(zzuk zzukVar, boolean z10) {
        this.zza = new zzud(zzukVar, z10);
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    public final zzcc zza() {
        return this.zza.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    public final Object zzb() {
        return this.zzb;
    }

    public final void zzc(int i10) {
        this.zzd = i10;
        this.zze = false;
        this.zzc.clear();
    }
}

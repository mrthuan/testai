package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzcvq implements zzcye, zzcxl {
    private final zzfel zza;

    public zzcvq(Context context, zzfel zzfelVar, zzbss zzbssVar) {
        this.zza = zzfelVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcye
    public final void zzs() {
        zzbst zzbstVar = this.zza.zzad;
        if (zzbstVar != null && zzbstVar.zza) {
            ArrayList arrayList = new ArrayList();
            if (!this.zza.zzad.zzb.isEmpty()) {
                arrayList.add(this.zza.zzad.zzb);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxl
    public final void zzdj(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzcxl
    public final void zzdl(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzcxl
    public final void zzdm(Context context) {
    }
}

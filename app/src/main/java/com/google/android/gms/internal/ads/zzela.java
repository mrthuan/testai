package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzela {
    private final zzdgp zza;

    public zzela(zzdgp zzdgpVar) {
        this.zza = zzdgpVar;
    }

    public final /* bridge */ /* synthetic */ Object zza(zzfex zzfexVar, zzfel zzfelVar, View view, zzekw zzekwVar) {
        zzeky zzekyVar = new zzeky(this, new zzdgx() { // from class: com.google.android.gms.internal.ads.zzekx
            @Override // com.google.android.gms.internal.ads.zzdgx
            public final void zza(boolean z10, Context context, zzcxd zzcxdVar) {
            }
        });
        zzdfp zze = this.zza.zze(new zzcsk(zzfexVar, zzfelVar, null), zzekyVar);
        zzekwVar.zzd(new zzekz(this, zze));
        return zze.zzg();
    }
}

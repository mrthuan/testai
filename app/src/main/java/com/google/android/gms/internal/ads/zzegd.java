package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzegd extends zzbpy {
    final /* synthetic */ zzege zza;
    private final zzeew zzb;

    public /* synthetic */ zzegd(zzege zzegeVar, zzeew zzeewVar, zzegc zzegcVar) {
        this.zza = zzegeVar;
        this.zzb = zzeewVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpz
    public final void zze(String str) {
        ((zzegp) this.zzb.zzc).zzi(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbpz
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) {
        ((zzegp) this.zzb.zzc).zzh(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbpz
    public final void zzg(IObjectWrapper iObjectWrapper) {
        zzege.zze(this.zza, (View) ObjectWrapper.L0(iObjectWrapper));
        ((zzegp) this.zzb.zzc).zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzbpz
    public final void zzh(zzbov zzbovVar) {
        zzege.zzd(this.zza, zzbovVar);
        ((zzegp) this.zzb.zzc).zzo();
    }
}

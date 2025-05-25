package com.google.android.gms.internal.ads;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdiv implements zzgcf {
    final /* synthetic */ View zza;
    final /* synthetic */ zzdiw zzb;

    public zzdiv(zzdiw zzdiwVar, View view) {
        this.zza = view;
        this.zzb = zzdiwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcf
    public final void zza(Throwable th2) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzeI)).booleanValue()) {
            com.google.android.gms.ads.internal.zzu.B.f10557g.zzv(th2, "omid native display exp");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        this.zzb.zzac(this.zza, (zzeeo) obj);
    }
}

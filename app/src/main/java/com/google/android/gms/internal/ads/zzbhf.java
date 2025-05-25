package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbhf extends zzbgg {
    final /* synthetic */ zzbhi zza;

    public /* synthetic */ zzbhf(zzbhi zzbhiVar, zzbhe zzbheVar) {
        this.zza = zzbhiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbgh
    public final void zze(zzbfx zzbfxVar, String str) {
        zzbhi zzbhiVar = this.zza;
        if (zzbhi.zza(zzbhiVar) == null) {
            return;
        }
        zzbhi.zza(zzbhiVar).zzb(zzbhi.zze(zzbhiVar, zzbfxVar), str);
    }
}

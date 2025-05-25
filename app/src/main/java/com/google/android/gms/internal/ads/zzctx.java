package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzctx implements com.google.android.gms.ads.internal.client.zza {
    private final zzcub zza;
    private final zzffg zzb;

    public zzctx(zzcub zzcubVar, zzffg zzffgVar) {
        this.zza = zzcubVar;
        this.zzb = zzffgVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        this.zza.zzc(this.zzb.zzf);
    }
}

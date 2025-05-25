package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.VideoController;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes.dex */
public final class zzfj extends zzds {

    /* renamed from: a  reason: collision with root package name */
    public final VideoController.VideoLifecycleCallbacks f10193a;

    public zzfj(VideoController.VideoLifecycleCallbacks videoLifecycleCallbacks) {
        this.f10193a = videoLifecycleCallbacks;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdt
    public final void q0(boolean z10) {
        this.f10193a.onVideoMute(z10);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdt
    public final void zze() {
        this.f10193a.onVideoEnd();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdt
    public final void zzg() {
        this.f10193a.onVideoPause();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdt
    public final void zzh() {
        this.f10193a.onVideoPlay();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdt
    public final void zzi() {
        this.f10193a.onVideoStart();
    }
}

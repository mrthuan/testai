package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.MuteThisAdListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes.dex */
public final class zzct extends zzcr {

    /* renamed from: a  reason: collision with root package name */
    public final MuteThisAdListener f10121a;

    public zzct(MuteThisAdListener muteThisAdListener) {
        this.f10121a = muteThisAdListener;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcs
    public final void zze() {
        this.f10121a.a();
    }
}

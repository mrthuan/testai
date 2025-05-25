package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.BackgroundDetector;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes.dex */
public final class u implements BackgroundDetector.BackgroundStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ GoogleApiManager f11036a;

    public u(GoogleApiManager googleApiManager) {
        this.f11036a = googleApiManager;
    }

    @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
    public final void a(boolean z10) {
        com.google.android.gms.internal.base.zau zauVar = this.f11036a.f10952n;
        zauVar.sendMessage(zauVar.obtainMessage(1, Boolean.valueOf(z10)));
    }
}

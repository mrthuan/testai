package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes.dex */
public final class zaae extends zap {

    /* renamed from: f  reason: collision with root package name */
    public final y.d f11047f;

    /* renamed from: g  reason: collision with root package name */
    public final GoogleApiManager f11048g;

    public zaae(LifecycleFragment lifecycleFragment, GoogleApiManager googleApiManager, GoogleApiAvailability googleApiAvailability) {
        super(lifecycleFragment, googleApiAvailability);
        this.f11047f = new y.d();
        this.f11048g = googleApiManager;
        lifecycleFragment.e("ConnectionlessLifecycleHelper", this);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void g() {
        if (!this.f11047f.isEmpty()) {
            this.f11048g.a(this);
        }
    }

    @Override // com.google.android.gms.common.api.internal.zap, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void i() {
        this.f11150b = true;
        if (!this.f11047f.isEmpty()) {
            this.f11048g.a(this);
        }
    }

    @Override // com.google.android.gms.common.api.internal.zap, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void j() {
        this.f11150b = false;
        GoogleApiManager googleApiManager = this.f11048g;
        googleApiManager.getClass();
        synchronized (GoogleApiManager.f10938r) {
            if (googleApiManager.f10949k == this) {
                googleApiManager.f10949k = null;
                googleApiManager.f10950l.clear();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zap
    public final void k(ConnectionResult connectionResult, int i10) {
        this.f11048g.h(connectionResult, i10);
    }

    @Override // com.google.android.gms.common.api.internal.zap
    public final void l() {
        com.google.android.gms.internal.base.zau zauVar = this.f11048g.f10952n;
        zauVar.sendMessage(zauVar.obtainMessage(3));
    }
}

package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.BaseImplementation;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes.dex */
public final class zaax implements zabf {

    /* renamed from: a  reason: collision with root package name */
    public final zabi f11072a;

    public zaax(zabi zabiVar) {
        this.f11072a = zabiVar;
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void b() {
        zabi zabiVar = this.f11072a;
        zabiVar.f11095a.lock();
        try {
            zabiVar.f11104k = new zaaw(zabiVar, zabiVar.f11101h, zabiVar.f11102i, zabiVar.f11097d, zabiVar.f11103j, zabiVar.f11095a, zabiVar.c);
            zabiVar.f11104k.e();
            zabiVar.f11096b.signalAll();
        } finally {
            zabiVar.f11095a.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void e() {
        zabi zabiVar = this.f11072a;
        for (Api.Client client : zabiVar.f11099f.values()) {
            client.disconnect();
        }
        zabiVar.f11106m.f11086p = Collections.emptySet();
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final BaseImplementation.ApiMethodImpl f(BaseImplementation.ApiMethodImpl apiMethodImpl) {
        this.f11072a.f11106m.f11078h.add(apiMethodImpl);
        return apiMethodImpl;
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final boolean g() {
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final BaseImplementation.ApiMethodImpl h(BaseImplementation.ApiMethodImpl apiMethodImpl) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void a(Bundle bundle) {
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void d(int i10) {
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void c(ConnectionResult connectionResult, Api api, boolean z10) {
    }
}

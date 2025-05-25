package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.locks.Lock;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes.dex */
public final class o implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ zaaw f11024a;

    public /* synthetic */ o(zaaw zaawVar) {
        this.f11024a = zaawVar;
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        zaaw zaawVar = this.f11024a;
        Preconditions.j(zaawVar.f11068r);
        com.google.android.gms.signin.zae zaeVar = zaawVar.f11061k;
        Preconditions.j(zaeVar);
        zaeVar.b(new n(zaawVar));
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        boolean z10;
        zaaw zaawVar = this.f11024a;
        Lock lock = zaawVar.f11053b;
        Lock lock2 = zaawVar.f11053b;
        lock.lock();
        try {
            if (zaawVar.f11062l && !connectionResult.d()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                zaawVar.i();
                zaawVar.n();
            } else {
                zaawVar.l(connectionResult);
            }
            lock2.unlock();
        } catch (Throwable th2) {
            lock2.unlock();
            throw th2;
        }
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int i10) {
    }
}

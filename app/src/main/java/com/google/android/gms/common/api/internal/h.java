package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Lock;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes.dex */
public final class h implements BaseGmsClient.ConnectionProgressReportCallbacks {

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference f11007a;

    /* renamed from: b  reason: collision with root package name */
    public final Api f11008b;
    public final boolean c;

    public h(zaaw zaawVar, Api api, boolean z10) {
        this.f11007a = new WeakReference(zaawVar);
        this.f11008b = api;
        this.c = z10;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks
    public final void a(ConnectionResult connectionResult) {
        boolean z10;
        zaaw zaawVar = (zaaw) this.f11007a.get();
        if (zaawVar == null) {
            return;
        }
        if (Looper.myLooper() == zaawVar.f11052a.f11106m.f11077g) {
            z10 = true;
        } else {
            z10 = false;
        }
        Preconditions.l("onReportServiceBinding must be called on the GoogleApiClient handler thread", z10);
        Lock lock = zaawVar.f11053b;
        lock.lock();
        try {
            if (zaawVar.o(0)) {
                if (!connectionResult.f()) {
                    zaawVar.m(connectionResult, this.f11008b, this.c);
                }
                if (zaawVar.p()) {
                    zaawVar.n();
                }
            }
        } finally {
            lock.unlock();
        }
    }
}

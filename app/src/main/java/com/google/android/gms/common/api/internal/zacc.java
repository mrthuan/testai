package com.google.android.gms.common.api.internal;

import android.app.Activity;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.CancellationException;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes.dex */
public final class zacc extends zap {
    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void f() {
        new CancellationException("Host activity was destroyed before Google Play services could be made available.");
        throw null;
    }

    @Override // com.google.android.gms.common.api.internal.zap
    public final void k(ConnectionResult connectionResult, int i10) {
        String str = connectionResult.f10877d;
        if (str == null) {
            str = "Error connecting to Google Play services";
        }
        new ApiException(new Status(connectionResult.f10876b, str, connectionResult.c, connectionResult));
        throw null;
    }

    @Override // com.google.android.gms.common.api.internal.zap
    public final void l() {
        Activity i10 = this.f10955a.i();
        if (i10 != null) {
            if (this.f11152e.d(i10) == 0) {
                throw null;
            }
            throw null;
        }
        new ApiException(new Status(8, null, null, null));
        throw null;
    }
}

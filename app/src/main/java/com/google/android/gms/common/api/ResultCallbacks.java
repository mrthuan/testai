package com.google.android.gms.common.api;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Result;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: classes.dex */
public abstract class ResultCallbacks<R extends Result> implements ResultCallback<R> {
    @Override // com.google.android.gms.common.api.ResultCallback
    @KeepForSdk
    public final void a(R r4) {
        Status status = r4.getStatus();
        if (status.d()) {
            c();
            return;
        }
        b(status);
        if (r4 instanceof Releasable) {
            try {
                ((Releasable) r4).release();
            } catch (RuntimeException unused) {
                "Unable to release ".concat(String.valueOf(r4));
            }
        }
    }

    public abstract void b(Status status);

    public abstract void c();
}

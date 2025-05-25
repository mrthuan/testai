package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes.dex */
public abstract class i0 extends zac {

    /* renamed from: b  reason: collision with root package name */
    public final TaskCompletionSource f11011b;

    public i0(int i10, TaskCompletionSource taskCompletionSource) {
        super(i10);
        this.f11011b = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void a(Status status) {
        this.f11011b.c(new ApiException(status));
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void b(RuntimeException runtimeException) {
        this.f11011b.c(runtimeException);
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void c(zabq zabqVar) {
        try {
            h(zabqVar);
        } catch (DeadObjectException e10) {
            a(zai.e(e10));
            throw e10;
        } catch (RemoteException e11) {
            a(zai.e(e11));
        } catch (RuntimeException e12) {
            this.f11011b.c(e12);
        }
    }

    public abstract void h(zabq zabqVar);
}

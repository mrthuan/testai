package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes.dex */
public final class zag extends zac {

    /* renamed from: b  reason: collision with root package name */
    public final TaskApiCall f11147b;
    public final TaskCompletionSource c;

    /* renamed from: d  reason: collision with root package name */
    public final StatusExceptionMapper f11148d;

    public zag(int i10, TaskApiCall taskApiCall, TaskCompletionSource taskCompletionSource, StatusExceptionMapper statusExceptionMapper) {
        super(i10);
        this.c = taskCompletionSource;
        this.f11147b = taskApiCall;
        this.f11148d = statusExceptionMapper;
        if (i10 == 2 && taskApiCall.f10963b) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void a(Status status) {
        this.c.c(this.f11148d.a(status));
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void b(RuntimeException runtimeException) {
        this.c.c(runtimeException);
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void c(zabq zabqVar) {
        TaskCompletionSource taskCompletionSource = this.c;
        try {
            this.f11147b.a(zabqVar.f11111b, taskCompletionSource);
        } catch (DeadObjectException e10) {
            throw e10;
        } catch (RemoteException e11) {
            a(zai.e(e11));
        } catch (RuntimeException e12) {
            taskCompletionSource.c(e12);
        }
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void d(zaad zaadVar, boolean z10) {
        Boolean valueOf = Boolean.valueOf(z10);
        Map map = zaadVar.f11046b;
        TaskCompletionSource taskCompletionSource = this.c;
        map.put(taskCompletionSource, valueOf);
        taskCompletionSource.f11978a.b(new c(zaadVar, taskCompletionSource));
    }

    @Override // com.google.android.gms.common.api.internal.zac
    public final boolean f(zabq zabqVar) {
        return this.f11147b.f10963b;
    }

    @Override // com.google.android.gms.common.api.internal.zac
    public final Feature[] g(zabq zabqVar) {
        return this.f11147b.f10962a;
    }
}

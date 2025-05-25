package com.google.android.gms.tasks;

import com.google.android.gms.internal.appset.zzq;
import d8.o;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
/* loaded from: classes2.dex */
public abstract class Task<TResult> {
    public void a(Executor executor, OnCanceledListener onCanceledListener) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    public Task<TResult> b(OnCompleteListener<TResult> onCompleteListener) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public void c(Executor executor, OnCompleteListener onCompleteListener) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public abstract o d(Executor executor, OnFailureListener onFailureListener);

    public abstract o e(OnSuccessListener onSuccessListener);

    public abstract o f(Executor executor, OnSuccessListener onSuccessListener);

    public <TContinuationResult> Task<TContinuationResult> g(Executor executor, Continuation<TResult, TContinuationResult> continuation) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public Task h(zzq zzqVar) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    public <TContinuationResult> Task<TContinuationResult> i(Executor executor, Continuation<TResult, Task<TContinuationResult>> continuation) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    public abstract Exception j();

    public abstract TResult k();

    public abstract Object l();

    public abstract boolean m();

    public abstract boolean n();

    public abstract boolean o();

    public <TContinuationResult> Task<TContinuationResult> p(Executor executor, SuccessContinuation<TResult, TContinuationResult> successContinuation) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }
}

package d8;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.appset.zzq;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.DuplicateTaskCompletionException;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskExecutors;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
/* loaded from: classes2.dex */
public final class o<TResult> extends Task<TResult> {

    /* renamed from: a  reason: collision with root package name */
    public final Object f16147a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final l f16148b = new l();
    public boolean c;

    /* renamed from: d  reason: collision with root package name */
    public volatile boolean f16149d;

    /* renamed from: e  reason: collision with root package name */
    public Object f16150e;

    /* renamed from: f  reason: collision with root package name */
    public Exception f16151f;

    @Override // com.google.android.gms.tasks.Task
    public final void a(Executor executor, OnCanceledListener onCanceledListener) {
        this.f16148b.a(new f(executor, onCanceledListener));
        w();
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task<TResult> b(OnCompleteListener<TResult> onCompleteListener) {
        this.f16148b.a(new g(TaskExecutors.f11979a, onCompleteListener));
        w();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final void c(Executor executor, OnCompleteListener onCompleteListener) {
        this.f16148b.a(new g(executor, onCompleteListener));
        w();
    }

    @Override // com.google.android.gms.tasks.Task
    public final o d(Executor executor, OnFailureListener onFailureListener) {
        this.f16148b.a(new h(executor, onFailureListener));
        w();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final o e(OnSuccessListener onSuccessListener) {
        f(TaskExecutors.f11979a, onSuccessListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final o f(Executor executor, OnSuccessListener onSuccessListener) {
        this.f16148b.a(new i(executor, onSuccessListener));
        w();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final <TContinuationResult> Task<TContinuationResult> g(Executor executor, Continuation<TResult, TContinuationResult> continuation) {
        o oVar = new o();
        this.f16148b.a(new d(executor, continuation, oVar));
        w();
        return oVar;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task h(zzq zzqVar) {
        return i(TaskExecutors.f11979a, zzqVar);
    }

    @Override // com.google.android.gms.tasks.Task
    public final <TContinuationResult> Task<TContinuationResult> i(Executor executor, Continuation<TResult, Task<TContinuationResult>> continuation) {
        o oVar = new o();
        this.f16148b.a(new e(executor, continuation, oVar));
        w();
        return oVar;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Exception j() {
        Exception exc;
        synchronized (this.f16147a) {
            exc = this.f16151f;
        }
        return exc;
    }

    @Override // com.google.android.gms.tasks.Task
    public final TResult k() {
        TResult tresult;
        synchronized (this.f16147a) {
            Preconditions.l("Task is not yet complete", this.c);
            if (!this.f16149d) {
                Exception exc = this.f16151f;
                if (exc == null) {
                    tresult = (TResult) this.f16150e;
                } else {
                    throw new RuntimeExecutionException(exc);
                }
            } else {
                throw new CancellationException("Task is already canceled.");
            }
        }
        return tresult;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Object l() {
        Object obj;
        synchronized (this.f16147a) {
            Preconditions.l("Task is not yet complete", this.c);
            if (!this.f16149d) {
                if (!IOException.class.isInstance(this.f16151f)) {
                    Exception exc = this.f16151f;
                    if (exc == null) {
                        obj = this.f16150e;
                    } else {
                        throw new RuntimeExecutionException(exc);
                    }
                } else {
                    throw ((Throwable) IOException.class.cast(this.f16151f));
                }
            } else {
                throw new CancellationException("Task is already canceled.");
            }
        }
        return obj;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean m() {
        return this.f16149d;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean n() {
        boolean z10;
        synchronized (this.f16147a) {
            z10 = this.c;
        }
        return z10;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean o() {
        boolean z10;
        synchronized (this.f16147a) {
            z10 = false;
            if (this.c && !this.f16149d && this.f16151f == null) {
                z10 = true;
            }
        }
        return z10;
    }

    @Override // com.google.android.gms.tasks.Task
    public final <TContinuationResult> Task<TContinuationResult> p(Executor executor, SuccessContinuation<TResult, TContinuationResult> successContinuation) {
        o oVar = new o();
        this.f16148b.a(new j(executor, successContinuation, oVar));
        w();
        return oVar;
    }

    public final void q(androidx.privacysandbox.ads.adservices.java.internal.a aVar) {
        a(TaskExecutors.f11979a, aVar);
    }

    public final o r(OnFailureListener onFailureListener) {
        d(TaskExecutors.f11979a, onFailureListener);
        return this;
    }

    public final void s(h5.a aVar) {
        g(TaskExecutors.f11979a, aVar);
    }

    public final void t(Exception exc) {
        if (exc != null) {
            synchronized (this.f16147a) {
                if (!this.c) {
                    this.c = true;
                    this.f16151f = exc;
                } else {
                    throw DuplicateTaskCompletionException.of(this);
                }
            }
            this.f16148b.b(this);
            return;
        }
        throw new NullPointerException("Exception must not be null");
    }

    public final void u(Object obj) {
        synchronized (this.f16147a) {
            if (!this.c) {
                this.c = true;
                this.f16150e = obj;
            } else {
                throw DuplicateTaskCompletionException.of(this);
            }
        }
        this.f16148b.b(this);
    }

    public final void v() {
        synchronized (this.f16147a) {
            if (this.c) {
                return;
            }
            this.c = true;
            this.f16149d = true;
            this.f16148b.b(this);
        }
    }

    public final void w() {
        synchronized (this.f16147a) {
            if (!this.c) {
                return;
            }
            this.f16148b.b(this);
        }
    }
}

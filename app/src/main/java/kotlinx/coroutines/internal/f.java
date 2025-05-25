package kotlinx.coroutines.internal;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.g0;
import kotlinx.coroutines.n0;
import kotlinx.coroutines.o1;
import kotlinx.coroutines.y;

/* compiled from: DispatchedContinuation.kt */
/* loaded from: classes.dex */
public final class f<T> extends g0<T> implements wf.b, kotlin.coroutines.c<T> {

    /* renamed from: h  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f20174h = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "_reusableCancellableContinuation");
    private volatile Object _reusableCancellableContinuation;

    /* renamed from: d  reason: collision with root package name */
    public final CoroutineDispatcher f20175d;

    /* renamed from: e  reason: collision with root package name */
    public final kotlin.coroutines.c<T> f20176e;

    /* renamed from: f  reason: collision with root package name */
    public Object f20177f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f20178g;

    /* JADX WARN: Multi-variable type inference failed */
    public f(CoroutineDispatcher coroutineDispatcher, kotlin.coroutines.c<? super T> cVar) {
        super(-1);
        this.f20175d = coroutineDispatcher;
        this.f20176e = cVar;
        this.f20177f = ge.a.f17756g;
        this.f20178g = ThreadContextKt.b(getContext());
    }

    @Override // kotlinx.coroutines.g0
    public final void c(Object obj, CancellationException cancellationException) {
        if (obj instanceof kotlinx.coroutines.q) {
            ((kotlinx.coroutines.q) obj).f20228b.invoke(cancellationException);
        }
    }

    @Override // wf.b
    public final wf.b getCallerFrame() {
        kotlin.coroutines.c<T> cVar = this.f20176e;
        if (cVar instanceof wf.b) {
            return (wf.b) cVar;
        }
        return null;
    }

    @Override // kotlin.coroutines.c
    public final CoroutineContext getContext() {
        return this.f20176e.getContext();
    }

    @Override // kotlinx.coroutines.g0
    public final Object i() {
        Object obj = this.f20177f;
        this.f20177f = ge.a.f17756g;
        return obj;
    }

    @Override // kotlin.coroutines.c
    public final void resumeWith(Object obj) {
        Object pVar;
        kotlin.coroutines.c<T> cVar = this.f20176e;
        CoroutineContext context = cVar.getContext();
        Throwable m16exceptionOrNullimpl = Result.m16exceptionOrNullimpl(obj);
        if (m16exceptionOrNullimpl == null) {
            pVar = obj;
        } else {
            pVar = new kotlinx.coroutines.p(false, m16exceptionOrNullimpl);
        }
        CoroutineDispatcher coroutineDispatcher = this.f20175d;
        if (coroutineDispatcher.p()) {
            this.f20177f = pVar;
            this.c = 0;
            coroutineDispatcher.n(context, this);
            return;
        }
        n0 a10 = o1.a();
        if (a10.W()) {
            this.f20177f = pVar;
            this.c = 0;
            a10.x(this);
            return;
        }
        a10.U(true);
        try {
            CoroutineContext context2 = getContext();
            Object c = ThreadContextKt.c(context2, this.f20178g);
            cVar.resumeWith(obj);
            tf.d dVar = tf.d.f30009a;
            ThreadContextKt.a(context2, c);
            do {
            } while (a10.Y());
        } finally {
            try {
            } finally {
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f20175d + ", " + y.c(this.f20176e) + ']';
    }

    @Override // kotlinx.coroutines.g0
    public final kotlin.coroutines.c<T> d() {
        return this;
    }
}

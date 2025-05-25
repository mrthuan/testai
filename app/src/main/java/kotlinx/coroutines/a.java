package kotlinx.coroutines;

import kotlin.Result;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.y0;

/* compiled from: AbstractCoroutine.kt */
/* loaded from: classes.dex */
public abstract class a<T> extends c1 implements kotlin.coroutines.c<T>, w {
    public final CoroutineContext c;

    public a(CoroutineContext coroutineContext, boolean z10) {
        super(z10);
        W((y0) coroutineContext.get(y0.b.f20277a));
        this.c = coroutineContext.plus(this);
    }

    @Override // kotlinx.coroutines.c1
    public final String H() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // kotlinx.coroutines.c1
    public final void V(CompletionHandlerException completionHandlerException) {
        v.a(this.c, completionHandlerException);
    }

    @Override // kotlinx.coroutines.c1, kotlinx.coroutines.y0
    public boolean a() {
        return super.a();
    }

    @Override // kotlinx.coroutines.c1
    public final String a0() {
        return super.a0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.c1
    public final void d0(Object obj) {
        boolean z10;
        if (obj instanceof p) {
            p pVar = (p) obj;
            Throwable th2 = pVar.f20226a;
            pVar.getClass();
            if (p.f20225b.get(pVar) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            k0(z10, th2);
            return;
        }
        l0(obj);
    }

    @Override // kotlin.coroutines.c
    public final CoroutineContext getContext() {
        return this.c;
    }

    @Override // kotlinx.coroutines.w
    public final CoroutineContext n() {
        return this.c;
    }

    @Override // kotlin.coroutines.c
    public final void resumeWith(Object obj) {
        Throwable m16exceptionOrNullimpl = Result.m16exceptionOrNullimpl(obj);
        if (m16exceptionOrNullimpl != null) {
            obj = new p(false, m16exceptionOrNullimpl);
        }
        Object Z = Z(obj);
        if (Z == aj.b.f562j) {
            return;
        }
        D(Z);
    }

    public void l0(T t4) {
    }

    public void k0(boolean z10, Throwable th2) {
    }
}

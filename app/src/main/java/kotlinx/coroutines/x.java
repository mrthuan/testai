package kotlinx.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.y0;

/* compiled from: CoroutineScope.kt */
/* loaded from: classes.dex */
public final class x {
    public static final kotlinx.coroutines.internal.d a(CoroutineContext coroutineContext) {
        if (coroutineContext.get(y0.b.f20277a) == null) {
            coroutineContext = coroutineContext.plus(new a1(null));
        }
        return new kotlinx.coroutines.internal.d(coroutineContext);
    }

    public static final kotlinx.coroutines.internal.d b() {
        m1 m1Var = new m1(null);
        lg.b bVar = j0.f20206a;
        return new kotlinx.coroutines.internal.d(m1Var.plus(kotlinx.coroutines.internal.l.f20194a));
    }

    public static final <R> Object c(cg.p<? super w, ? super kotlin.coroutines.c<? super R>, ? extends Object> pVar, kotlin.coroutines.c<? super R> cVar) {
        kotlinx.coroutines.internal.p pVar2 = new kotlinx.coroutines.internal.p(cVar, cVar.getContext());
        Object A = ea.a.A(pVar2, pVar2, pVar);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return A;
    }

    public static final boolean d(w wVar) {
        CoroutineContext n10 = wVar.n();
        int i10 = y0.f20276d1;
        y0 y0Var = (y0) n10.get(y0.b.f20277a);
        if (y0Var != null) {
            return y0Var.a();
        }
        return true;
    }
}

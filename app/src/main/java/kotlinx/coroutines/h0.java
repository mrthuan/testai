package kotlinx.coroutines;

import kotlin.Result;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.internal.ThreadContextKt;

/* compiled from: DispatchedTask.kt */
/* loaded from: classes.dex */
public final class h0 {
    public static final <T> void a(g0<? super T> g0Var, kotlin.coroutines.c<? super T> cVar, boolean z10) {
        Object f10;
        q1<?> q1Var;
        boolean m02;
        Object i10 = g0Var.i();
        Throwable e10 = g0Var.e(i10);
        if (e10 != null) {
            f10 = androidx.activity.s.v(e10);
        } else {
            f10 = g0Var.f(i10);
        }
        Object m13constructorimpl = Result.m13constructorimpl(f10);
        if (z10) {
            kotlin.jvm.internal.g.c(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
            kotlinx.coroutines.internal.f fVar = (kotlinx.coroutines.internal.f) cVar;
            kotlin.coroutines.c<T> cVar2 = fVar.f20176e;
            CoroutineContext context = cVar2.getContext();
            Object c = ThreadContextKt.c(context, fVar.f20178g);
            if (c != ThreadContextKt.f20165a) {
                q1Var = CoroutineContextKt.d(cVar2, context, c);
            } else {
                q1Var = null;
            }
            try {
                fVar.f20176e.resumeWith(m13constructorimpl);
                tf.d dVar = tf.d.f30009a;
                if (q1Var != null) {
                    if (!m02) {
                        return;
                    }
                }
                return;
            } finally {
                if (q1Var == null || q1Var.m0()) {
                    ThreadContextKt.a(context, c);
                }
            }
        }
        cVar.resumeWith(m13constructorimpl);
    }
}

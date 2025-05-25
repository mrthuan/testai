package kotlinx.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* compiled from: Delay.kt */
/* loaded from: classes.dex */
public final class e0 {
    public static final Object a(long j10, kotlin.coroutines.c<? super tf.d> cVar) {
        d0 d0Var;
        if (j10 <= 0) {
            return tf.d.f30009a;
        }
        h hVar = new h(1, com.google.android.play.core.assetpacks.b1.L(cVar));
        hVar.s();
        if (j10 < Long.MAX_VALUE) {
            CoroutineContext.a aVar = hVar.f20159e.get(d.a.f19936a);
            if (aVar instanceof d0) {
                d0Var = (d0) aVar;
            } else {
                d0Var = null;
            }
            if (d0Var == null) {
                d0Var = a0.f19982a;
            }
            d0Var.j(j10, hVar);
        }
        Object r4 = hVar.r();
        if (r4 == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return r4;
        }
        return tf.d.f30009a;
    }
}

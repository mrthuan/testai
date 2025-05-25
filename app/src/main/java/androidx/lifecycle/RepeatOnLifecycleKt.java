package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* compiled from: RepeatOnLifecycle.kt */
/* loaded from: classes.dex */
public final class RepeatOnLifecycleKt {
    public static final Object a(Lifecycle lifecycle, Lifecycle.State state, cg.p<? super kotlinx.coroutines.w, ? super kotlin.coroutines.c<? super tf.d>, ? extends Object> pVar, kotlin.coroutines.c<? super tf.d> cVar) {
        boolean z10;
        if (state != Lifecycle.State.INITIALIZED) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (lifecycle.b() == Lifecycle.State.DESTROYED) {
                return tf.d.f30009a;
            }
            Object c = kotlinx.coroutines.x.c(new RepeatOnLifecycleKt$repeatOnLifecycle$3(lifecycle, state, pVar, null), cVar);
            if (c == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return c;
            }
            return tf.d.f30009a;
        }
        throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.".toString());
    }
}

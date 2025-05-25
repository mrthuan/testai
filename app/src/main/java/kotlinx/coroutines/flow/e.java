package kotlinx.coroutines.flow;

import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* compiled from: SafeCollector.common.kt */
/* loaded from: classes.dex */
public final class e implements c<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Object f20095a;

    public e(Object obj) {
        this.f20095a = obj;
    }

    @Override // kotlinx.coroutines.flow.c
    public final Object a(d<? super Object> dVar, kotlin.coroutines.c<? super tf.d> cVar) {
        Object emit = dVar.emit(this.f20095a, cVar);
        if (emit == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return emit;
        }
        return tf.d.f30009a;
    }
}

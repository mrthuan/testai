package kotlinx.coroutines.flow.internal;

import cg.q;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.x;

/* compiled from: SafeCollector.common.kt */
/* loaded from: classes.dex */
public final class f implements kotlinx.coroutines.flow.c<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.c f20118a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.c f20119b;
    public final /* synthetic */ q c;

    public f(kotlinx.coroutines.flow.a aVar, kotlinx.coroutines.flow.e eVar, q qVar) {
        this.f20118a = aVar;
        this.f20119b = eVar;
        this.c = qVar;
    }

    @Override // kotlinx.coroutines.flow.c
    public final Object a(kotlinx.coroutines.flow.d<? super Object> dVar, kotlin.coroutines.c<? super tf.d> cVar) {
        Object c = x.c(new CombineKt$zipImpl$1$1(dVar, this.f20118a, this.f20119b, this.c, null), cVar);
        if (c == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return c;
        }
        return tf.d.f30009a;
    }
}

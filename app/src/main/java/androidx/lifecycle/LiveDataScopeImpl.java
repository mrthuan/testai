package androidx.lifecycle;

import android.annotation.SuppressLint;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import pdf.pdfreader.viewer.editor.free.utils.t0;

/* compiled from: CoroutineLiveData.kt */
/* loaded from: classes.dex */
public final class LiveDataScopeImpl<T> implements t<T> {

    /* renamed from: a  reason: collision with root package name */
    public final CoroutineLiveData<T> f4003a;

    /* renamed from: b  reason: collision with root package name */
    public final CoroutineContext f4004b;

    public LiveDataScopeImpl(CoroutineLiveData<T> target, CoroutineContext context) {
        kotlin.jvm.internal.g.e(target, "target");
        kotlin.jvm.internal.g.e(context, "context");
        this.f4003a = target;
        lg.b bVar = kotlinx.coroutines.j0.f20206a;
        this.f4004b = context.plus(kotlinx.coroutines.internal.l.f20194a.v());
    }

    @Override // androidx.lifecycle.t
    @SuppressLint({"NullSafeMutableLiveData"})
    public final Object emit(T t4, kotlin.coroutines.c<? super tf.d> cVar) {
        Object w02 = t0.w0(this.f4004b, new LiveDataScopeImpl$emit$2(this, t4, null), cVar);
        if (w02 == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return w02;
        }
        return tf.d.f30009a;
    }
}

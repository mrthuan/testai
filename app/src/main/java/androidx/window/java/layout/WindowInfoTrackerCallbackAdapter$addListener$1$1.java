package androidx.window.java.layout;

import androidx.activity.s;
import cg.p;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.w;
import tf.d;
import w0.a;
import wf.c;

/* compiled from: WindowInfoTrackerCallbackAdapter.kt */
@c(c = "androidx.window.java.layout.WindowInfoTrackerCallbackAdapter$addListener$1$1", f = "WindowInfoTrackerCallbackAdapter.kt", l = {96}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class WindowInfoTrackerCallbackAdapter$addListener$1$1 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super d>, Object> {
    final /* synthetic */ a<T> $consumer;
    final /* synthetic */ kotlinx.coroutines.flow.c<T> $flow;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public WindowInfoTrackerCallbackAdapter$addListener$1$1(kotlinx.coroutines.flow.c<? extends T> cVar, a<T> aVar, kotlin.coroutines.c<? super WindowInfoTrackerCallbackAdapter$addListener$1$1> cVar2) {
        super(2, cVar2);
        this.$flow = cVar;
        this.$consumer = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new WindowInfoTrackerCallbackAdapter$addListener$1$1(this.$flow, this.$consumer, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                s.u0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            s.u0(obj);
            kotlinx.coroutines.flow.c<T> cVar = this.$flow;
            final a<T> aVar = this.$consumer;
            Object obj2 = new kotlinx.coroutines.flow.d<T>() { // from class: androidx.window.java.layout.WindowInfoTrackerCallbackAdapter$addListener$1$1$invokeSuspend$$inlined$collect$1
                @Override // kotlinx.coroutines.flow.d
                public Object emit(T t4, kotlin.coroutines.c<? super d> cVar2) {
                    a.this.accept(t4);
                    return d.f30009a;
                }
            };
            this.label = 1;
            if (cVar.a(obj2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return d.f30009a;
    }

    @Override // cg.p
    public final Object invoke(w wVar, kotlin.coroutines.c<? super d> cVar) {
        return ((WindowInfoTrackerCallbackAdapter$addListener$1$1) create(wVar, cVar)).invokeSuspend(d.f30009a);
    }
}

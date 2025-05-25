package androidx.lifecycle;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: CoroutineLiveData.kt */
@wf.c(c = "androidx.lifecycle.LiveDataScopeImpl$emit$2", f = "CoroutineLiveData.kt", l = {99}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class LiveDataScopeImpl$emit$2 extends SuspendLambda implements cg.p<kotlinx.coroutines.w, kotlin.coroutines.c<? super tf.d>, Object> {
    final /* synthetic */ T $value;
    int label;
    final /* synthetic */ LiveDataScopeImpl<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveDataScopeImpl$emit$2(LiveDataScopeImpl<T> liveDataScopeImpl, T t4, kotlin.coroutines.c<? super LiveDataScopeImpl$emit$2> cVar) {
        super(2, cVar);
        this.this$0 = liveDataScopeImpl;
        this.$value = t4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new LiveDataScopeImpl$emit$2(this.this$0, this.$value, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                androidx.activity.s.u0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            androidx.activity.s.u0(obj);
            CoroutineLiveData<T> coroutineLiveData = this.this$0.f4003a;
            this.label = 1;
            if (coroutineLiveData.l(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        this.this$0.f4003a.j(this.$value);
        return tf.d.f30009a;
    }

    @Override // cg.p
    public final Object invoke(kotlinx.coroutines.w wVar, kotlin.coroutines.c<? super tf.d> cVar) {
        return ((LiveDataScopeImpl$emit$2) create(wVar, cVar)).invokeSuspend(tf.d.f30009a);
    }
}

package androidx.lifecycle;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* compiled from: CoroutineLiveData.kt */
@wf.c(c = "androidx.lifecycle.BlockRunner$maybeRun$1", f = "CoroutineLiveData.kt", l = {ShapeTypes.MATH_MINUS}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class BlockRunner$maybeRun$1 extends SuspendLambda implements cg.p<kotlinx.coroutines.w, kotlin.coroutines.c<? super tf.d>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b<Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlockRunner$maybeRun$1(b<Object> bVar, kotlin.coroutines.c<? super BlockRunner$maybeRun$1> cVar) {
        super(2, cVar);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        BlockRunner$maybeRun$1 blockRunner$maybeRun$1 = new BlockRunner$maybeRun$1(this.this$0, cVar);
        blockRunner$maybeRun$1.L$0 = obj;
        return blockRunner$maybeRun$1;
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
            LiveDataScopeImpl liveDataScopeImpl = new LiveDataScopeImpl(this.this$0.f4022a, ((kotlinx.coroutines.w) this.L$0).n());
            cg.p<t<Object>, kotlin.coroutines.c<? super tf.d>, Object> pVar = this.this$0.f4023b;
            this.label = 1;
            if (pVar.invoke(liveDataScopeImpl, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        this.this$0.f4025e.invoke();
        return tf.d.f30009a;
    }

    @Override // cg.p
    public final Object invoke(kotlinx.coroutines.w wVar, kotlin.coroutines.c<? super tf.d> cVar) {
        return ((BlockRunner$maybeRun$1) create(wVar, cVar)).invokeSuspend(tf.d.f30009a);
    }
}

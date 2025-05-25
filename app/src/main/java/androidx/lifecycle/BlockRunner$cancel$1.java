package androidx.lifecycle;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.y0;

/* compiled from: CoroutineLiveData.kt */
@wf.c(c = "androidx.lifecycle.BlockRunner$cancel$1", f = "CoroutineLiveData.kt", l = {188}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class BlockRunner$cancel$1 extends SuspendLambda implements cg.p<kotlinx.coroutines.w, kotlin.coroutines.c<? super tf.d>, Object> {
    int label;
    final /* synthetic */ b<Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlockRunner$cancel$1(b<Object> bVar, kotlin.coroutines.c<? super BlockRunner$cancel$1> cVar) {
        super(2, cVar);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new BlockRunner$cancel$1(this.this$0, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.label;
        boolean z10 = true;
        if (i10 != 0) {
            if (i10 == 1) {
                androidx.activity.s.u0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            androidx.activity.s.u0(obj);
            long j10 = this.this$0.c;
            this.label = 1;
            if (kotlinx.coroutines.e0.a(j10, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        b<Object> bVar = this.this$0;
        if (bVar.f4022a.c <= 0) {
            z10 = false;
        }
        if (!z10) {
            y0 y0Var = bVar.f4026f;
            if (y0Var != null) {
                y0Var.b(null);
            }
            this.this$0.f4026f = null;
        }
        return tf.d.f30009a;
    }

    @Override // cg.p
    public final Object invoke(kotlinx.coroutines.w wVar, kotlin.coroutines.c<? super tf.d> cVar) {
        return ((BlockRunner$cancel$1) create(wVar, cVar)).invokeSuspend(tf.d.f30009a);
    }
}

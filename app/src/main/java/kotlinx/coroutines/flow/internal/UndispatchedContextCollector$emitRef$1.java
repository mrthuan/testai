package kotlinx.coroutines.flow.internal;

import androidx.activity.s;
import cg.p;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: ChannelFlow.kt */
@wf.c(c = "kotlinx.coroutines.flow.internal.UndispatchedContextCollector$emitRef$1", f = "ChannelFlow.kt", l = {212}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class UndispatchedContextCollector$emitRef$1<T> extends SuspendLambda implements p<T, kotlin.coroutines.c<? super tf.d>, Object> {
    final /* synthetic */ kotlinx.coroutines.flow.d<T> $downstream;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UndispatchedContextCollector$emitRef$1(kotlinx.coroutines.flow.d<? super T> dVar, kotlin.coroutines.c<? super UndispatchedContextCollector$emitRef$1> cVar) {
        super(2, cVar);
        this.$downstream = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        UndispatchedContextCollector$emitRef$1 undispatchedContextCollector$emitRef$1 = new UndispatchedContextCollector$emitRef$1(this.$downstream, cVar);
        undispatchedContextCollector$emitRef$1.L$0 = obj;
        return undispatchedContextCollector$emitRef$1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // cg.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, kotlin.coroutines.c<? super tf.d> cVar) {
        return invoke2((UndispatchedContextCollector$emitRef$1<T>) obj, cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
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
            Object obj2 = this.L$0;
            this.label = 1;
            if (this.$downstream.emit(obj2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return tf.d.f30009a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(T t4, kotlin.coroutines.c<? super tf.d> cVar) {
        return ((UndispatchedContextCollector$emitRef$1) create(t4, cVar)).invokeSuspend(tf.d.f30009a);
    }
}

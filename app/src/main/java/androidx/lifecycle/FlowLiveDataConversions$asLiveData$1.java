package androidx.lifecycle;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: FlowLiveData.kt */
@wf.c(c = "androidx.lifecycle.FlowLiveDataConversions$asLiveData$1", f = "FlowLiveData.kt", l = {80}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class FlowLiveDataConversions$asLiveData$1 extends SuspendLambda implements cg.p<t<Object>, kotlin.coroutines.c<? super tf.d>, Object> {
    final /* synthetic */ kotlinx.coroutines.flow.c<Object> $this_asLiveData;
    private /* synthetic */ Object L$0;
    int label;

    /* compiled from: FlowLiveData.kt */
    /* loaded from: classes.dex */
    public static final class a<T> implements kotlinx.coroutines.flow.d {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ t<T> f3977a;

        public a(t<T> tVar) {
            this.f3977a = tVar;
        }

        @Override // kotlinx.coroutines.flow.d
        public final Object emit(T t4, kotlin.coroutines.c<? super tf.d> cVar) {
            Object emit = this.f3977a.emit(t4, cVar);
            if (emit == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return emit;
            }
            return tf.d.f30009a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowLiveDataConversions$asLiveData$1(kotlinx.coroutines.flow.c<Object> cVar, kotlin.coroutines.c<? super FlowLiveDataConversions$asLiveData$1> cVar2) {
        super(2, cVar2);
        this.$this_asLiveData = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        FlowLiveDataConversions$asLiveData$1 flowLiveDataConversions$asLiveData$1 = new FlowLiveDataConversions$asLiveData$1(this.$this_asLiveData, cVar);
        flowLiveDataConversions$asLiveData$1.L$0 = obj;
        return flowLiveDataConversions$asLiveData$1;
    }

    @Override // cg.p
    public final Object invoke(t<Object> tVar, kotlin.coroutines.c<? super tf.d> cVar) {
        return ((FlowLiveDataConversions$asLiveData$1) create(tVar, cVar)).invokeSuspend(tf.d.f30009a);
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
            kotlinx.coroutines.flow.c<Object> cVar = this.$this_asLiveData;
            a aVar = new a((t) this.L$0);
            this.label = 1;
            if (cVar.a(aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return tf.d.f30009a;
    }
}

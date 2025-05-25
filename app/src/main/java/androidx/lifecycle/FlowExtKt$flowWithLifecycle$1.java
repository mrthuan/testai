package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: FlowExt.kt */
@wf.c(c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1", f = "FlowExt.kt", l = {91}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class FlowExtKt$flowWithLifecycle$1 extends SuspendLambda implements cg.p<kotlinx.coroutines.channels.j<Object>, kotlin.coroutines.c<? super tf.d>, Object> {
    final /* synthetic */ Lifecycle $lifecycle;
    final /* synthetic */ Lifecycle.State $minActiveState;
    final /* synthetic */ kotlinx.coroutines.flow.c<Object> $this_flowWithLifecycle;
    private /* synthetic */ Object L$0;
    int label;

    /* compiled from: FlowExt.kt */
    @wf.c(c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1", f = "FlowExt.kt", l = {92}, m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements cg.p<kotlinx.coroutines.w, kotlin.coroutines.c<? super tf.d>, Object> {
        final /* synthetic */ kotlinx.coroutines.channels.j<Object> $$this$callbackFlow;
        final /* synthetic */ kotlinx.coroutines.flow.c<Object> $this_flowWithLifecycle;
        int label;

        /* compiled from: FlowExt.kt */
        /* renamed from: androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1$a */
        /* loaded from: classes.dex */
        public static final class a<T> implements kotlinx.coroutines.flow.d {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ kotlinx.coroutines.channels.j<T> f3976a;

            /* JADX WARN: Multi-variable type inference failed */
            public a(kotlinx.coroutines.channels.j<? super T> jVar) {
                this.f3976a = jVar;
            }

            @Override // kotlinx.coroutines.flow.d
            public final Object emit(T t4, kotlin.coroutines.c<? super tf.d> cVar) {
                Object x4 = this.f3976a.x(t4, cVar);
                if (x4 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return x4;
                }
                return tf.d.f30009a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(kotlinx.coroutines.flow.c<Object> cVar, kotlinx.coroutines.channels.j<Object> jVar, kotlin.coroutines.c<? super AnonymousClass1> cVar2) {
            super(2, cVar2);
            this.$this_flowWithLifecycle = cVar;
            this.$$this$callbackFlow = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return new AnonymousClass1(this.$this_flowWithLifecycle, this.$$this$callbackFlow, cVar);
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
                kotlinx.coroutines.flow.c<Object> cVar = this.$this_flowWithLifecycle;
                a aVar = new a(this.$$this$callbackFlow);
                this.label = 1;
                if (cVar.a(aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return tf.d.f30009a;
        }

        @Override // cg.p
        public final Object invoke(kotlinx.coroutines.w wVar, kotlin.coroutines.c<? super tf.d> cVar) {
            return ((AnonymousClass1) create(wVar, cVar)).invokeSuspend(tf.d.f30009a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowExtKt$flowWithLifecycle$1(Lifecycle lifecycle, Lifecycle.State state, kotlinx.coroutines.flow.c<Object> cVar, kotlin.coroutines.c<? super FlowExtKt$flowWithLifecycle$1> cVar2) {
        super(2, cVar2);
        this.$lifecycle = lifecycle;
        this.$minActiveState = state;
        this.$this_flowWithLifecycle = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        FlowExtKt$flowWithLifecycle$1 flowExtKt$flowWithLifecycle$1 = new FlowExtKt$flowWithLifecycle$1(this.$lifecycle, this.$minActiveState, this.$this_flowWithLifecycle, cVar);
        flowExtKt$flowWithLifecycle$1.L$0 = obj;
        return flowExtKt$flowWithLifecycle$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlinx.coroutines.channels.j jVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                jVar = (kotlinx.coroutines.channels.j) this.L$0;
                androidx.activity.s.u0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            androidx.activity.s.u0(obj);
            kotlinx.coroutines.channels.j jVar2 = (kotlinx.coroutines.channels.j) this.L$0;
            Lifecycle lifecycle = this.$lifecycle;
            Lifecycle.State state = this.$minActiveState;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_flowWithLifecycle, jVar2, null);
            this.L$0 = jVar2;
            this.label = 1;
            if (RepeatOnLifecycleKt.a(lifecycle, state, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            jVar = jVar2;
        }
        jVar.m(null);
        return tf.d.f30009a;
    }

    @Override // cg.p
    public final Object invoke(kotlinx.coroutines.channels.j<Object> jVar, kotlin.coroutines.c<? super tf.d> cVar) {
        return ((FlowExtKt$flowWithLifecycle$1) create(jVar, cVar)).invokeSuspend(tf.d.f30009a);
    }
}

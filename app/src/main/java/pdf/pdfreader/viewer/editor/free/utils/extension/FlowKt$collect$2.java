package pdf.pdfreader.viewer.editor.free.utils.extension;

import androidx.activity.s;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import cg.p;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.w;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Flow.kt */
@wf.c(c = "pdf.pdfreader.viewer.editor.free.utils.extension.FlowKt$collect$2", f = "Flow.kt", l = {35}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class FlowKt$collect$2 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super tf.d>, Object> {
    final /* synthetic */ e<Object> $block;
    final /* synthetic */ kotlinx.coroutines.flow.c<Object> $flow;
    final /* synthetic */ Lifecycle.State $minActiveState;
    final /* synthetic */ androidx.appcompat.app.c $this_collect;
    int label;

    /* compiled from: Flow.kt */
    @wf.c(c = "pdf.pdfreader.viewer.editor.free.utils.extension.FlowKt$collect$2$1", f = "Flow.kt", l = {36}, m = "invokeSuspend")
    /* renamed from: pdf.pdfreader.viewer.editor.free.utils.extension.FlowKt$collect$2$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super tf.d>, Object> {
        final /* synthetic */ e<Object> $block;
        final /* synthetic */ kotlinx.coroutines.flow.c<Object> $flow;
        int label;

        /* compiled from: Flow.kt */
        /* renamed from: pdf.pdfreader.viewer.editor.free.utils.extension.FlowKt$collect$2$1$a */
        /* loaded from: classes3.dex */
        public static final class a<T> implements kotlinx.coroutines.flow.d {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ e<T> f28689a;

            public a(e<T> eVar) {
                this.f28689a = eVar;
            }

            @Override // kotlinx.coroutines.flow.d
            public final Object emit(T t4, kotlin.coroutines.c<? super tf.d> cVar) {
                this.f28689a.e(t4);
                return tf.d.f30009a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(kotlinx.coroutines.flow.c<Object> cVar, e<Object> eVar, kotlin.coroutines.c<? super AnonymousClass1> cVar2) {
            super(2, cVar2);
            this.$flow = cVar;
            this.$block = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return new AnonymousClass1(this.$flow, this.$block, cVar);
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
                kotlinx.coroutines.flow.c<Object> cVar = this.$flow;
                a aVar = new a(this.$block);
                this.label = 1;
                if (cVar.a(aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return tf.d.f30009a;
        }

        @Override // cg.p
        public final Object invoke(w wVar, kotlin.coroutines.c<? super tf.d> cVar) {
            return ((AnonymousClass1) create(wVar, cVar)).invokeSuspend(tf.d.f30009a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt$collect$2(androidx.appcompat.app.c cVar, Lifecycle.State state, kotlinx.coroutines.flow.c<Object> cVar2, e<Object> eVar, kotlin.coroutines.c<? super FlowKt$collect$2> cVar3) {
        super(2, cVar3);
        this.$this_collect = cVar;
        this.$minActiveState = state;
        this.$flow = cVar2;
        this.$block = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new FlowKt$collect$2(this.$this_collect, this.$minActiveState, this.$flow, this.$block, cVar);
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
            Lifecycle lifecycle = this.$this_collect.getLifecycle();
            kotlin.jvm.internal.g.d(lifecycle, "lifecycle");
            Lifecycle.State state = this.$minActiveState;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$flow, this.$block, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.a(lifecycle, state, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return tf.d.f30009a;
    }

    @Override // cg.p
    public final Object invoke(w wVar, kotlin.coroutines.c<? super tf.d> cVar) {
        return ((FlowKt$collect$2) create(wVar, cVar)).invokeSuspend(tf.d.f30009a);
    }
}

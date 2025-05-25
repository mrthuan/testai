package pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity;

import androidx.lifecycle.Lifecycle;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.CallbackFlowBuilder;
import pdf.pdfreader.viewer.editor.free.feature.billing.vm.SubscriptionViewModel;

/* compiled from: AISimpleSubscriptionActivity.kt */
@wf.c(c = "pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AISimpleSubscriptionActivity$initViewModel$2", f = "AISimpleSubscriptionActivity.kt", l = {66}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class AISimpleSubscriptionActivity$initViewModel$2 extends SuspendLambda implements cg.p<kotlinx.coroutines.w, kotlin.coroutines.c<? super tf.d>, Object> {
    int label;
    final /* synthetic */ AISimpleSubscriptionActivity this$0;

    /* compiled from: AISimpleSubscriptionActivity.kt */
    @wf.c(c = "pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AISimpleSubscriptionActivity$initViewModel$2$1", f = "AISimpleSubscriptionActivity.kt", l = {}, m = "invokeSuspend")
    /* renamed from: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AISimpleSubscriptionActivity$initViewModel$2$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements cg.p<ol.d, kotlin.coroutines.c<? super tf.d>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AISimpleSubscriptionActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AISimpleSubscriptionActivity aISimpleSubscriptionActivity, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.this$0 = aISimpleSubscriptionActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                androidx.activity.s.u0(obj);
                ol.d dVar = (ol.d) this.L$0;
                this.this$0.d2(dVar);
                ((SubscriptionViewModel) this.this$0.f24421t.getValue()).i(dVar, this.this$0.f24422u);
                return tf.d.f30009a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // cg.p
        public final Object invoke(ol.d dVar, kotlin.coroutines.c<? super tf.d> cVar) {
            return ((AnonymousClass1) create(dVar, cVar)).invokeSuspend(tf.d.f30009a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AISimpleSubscriptionActivity$initViewModel$2(AISimpleSubscriptionActivity aISimpleSubscriptionActivity, kotlin.coroutines.c<? super AISimpleSubscriptionActivity$initViewModel$2> cVar) {
        super(2, cVar);
        this.this$0 = aISimpleSubscriptionActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new AISimpleSubscriptionActivity$initViewModel$2(this.this$0, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlinx.coroutines.flow.r rVar;
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
            SubscriptionViewModel subscriptionViewModel = (SubscriptionViewModel) this.this$0.f24421t.getValue();
            String plan = this.this$0.f24422u;
            kotlin.jvm.internal.g.e(plan, "plan");
            if (kotlin.jvm.internal.g.a(plan, ea.a.p("DDI=", "HsDK9c9B"))) {
                rVar = subscriptionViewModel.f24952h;
            } else {
                rVar = subscriptionViewModel.f24951g;
            }
            Lifecycle lifecycle = this.this$0.getLifecycle();
            kotlin.jvm.internal.g.d(lifecycle, "lifecycle");
            CallbackFlowBuilder a10 = androidx.lifecycle.g.a(rVar, lifecycle, Lifecycle.State.STARTED);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (aj.b.k(a10, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return tf.d.f30009a;
    }

    @Override // cg.p
    public final Object invoke(kotlinx.coroutines.w wVar, kotlin.coroutines.c<? super tf.d> cVar) {
        return ((AISimpleSubscriptionActivity$initViewModel$2) create(wVar, cVar)).invokeSuspend(tf.d.f30009a);
    }
}

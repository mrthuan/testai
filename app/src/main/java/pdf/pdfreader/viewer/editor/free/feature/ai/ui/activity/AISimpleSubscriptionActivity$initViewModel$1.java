package pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import pdf.pdfreader.viewer.editor.free.billing.BillingRepository;
import pdf.pdfreader.viewer.editor.free.feature.billing.vm.SubscriptionViewModel;

/* compiled from: AISimpleSubscriptionActivity.kt */
@wf.c(c = "pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AISimpleSubscriptionActivity$initViewModel$1", f = "AISimpleSubscriptionActivity.kt", l = {55}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class AISimpleSubscriptionActivity$initViewModel$1 extends SuspendLambda implements cg.p<kotlinx.coroutines.w, kotlin.coroutines.c<? super tf.d>, Object> {
    int label;
    final /* synthetic */ AISimpleSubscriptionActivity this$0;

    /* compiled from: AISimpleSubscriptionActivity.kt */
    @wf.c(c = "pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AISimpleSubscriptionActivity$initViewModel$1$1", f = "AISimpleSubscriptionActivity.kt", l = {57, 59}, m = "invokeSuspend")
    /* renamed from: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AISimpleSubscriptionActivity$initViewModel$1$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements cg.p<kotlinx.coroutines.w, kotlin.coroutines.c<? super tf.d>, Object> {
        int label;
        final /* synthetic */ AISimpleSubscriptionActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AISimpleSubscriptionActivity aISimpleSubscriptionActivity, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.this$0 = aISimpleSubscriptionActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return new AnonymousClass1(this.this$0, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1 && i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                androidx.activity.s.u0(obj);
                ((Result) obj).m21unboximpl();
            } else {
                androidx.activity.s.u0(obj);
                if (kotlin.jvm.internal.g.a(((SubscriptionViewModel) this.this$0.f24421t.getValue()).f24956l, ol.e.c)) {
                    BillingRepository billingRepository = BillingRepository.f24041a;
                    this.label = 1;
                    if (billingRepository.d(this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    BillingRepository billingRepository2 = BillingRepository.f24041a;
                    this.label = 2;
                    if (billingRepository2.b(this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
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
    public AISimpleSubscriptionActivity$initViewModel$1(AISimpleSubscriptionActivity aISimpleSubscriptionActivity, kotlin.coroutines.c<? super AISimpleSubscriptionActivity$initViewModel$1> cVar) {
        super(2, cVar);
        this.this$0 = aISimpleSubscriptionActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new AISimpleSubscriptionActivity$initViewModel$1(this.this$0, cVar);
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
            Lifecycle lifecycle = this.this$0.getLifecycle();
            kotlin.jvm.internal.g.d(lifecycle, "lifecycle");
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.a(lifecycle, state, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return tf.d.f30009a;
    }

    @Override // cg.p
    public final Object invoke(kotlinx.coroutines.w wVar, kotlin.coroutines.c<? super tf.d> cVar) {
        return ((AISimpleSubscriptionActivity$initViewModel$1) create(wVar, cVar)).invokeSuspend(tf.d.f30009a);
    }
}

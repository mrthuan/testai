package pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity;

import androidx.lifecycle.Lifecycle;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.CallbackFlowBuilder;
import kotlinx.coroutines.flow.StateFlowImpl;
import pdf.pdfreader.viewer.editor.free.feature.billing.BillingConfigImpl;

/* compiled from: AISimpleSubscriptionActivity.kt */
@wf.c(c = "pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AISimpleSubscriptionActivity$initViewModel$4", f = "AISimpleSubscriptionActivity.kt", l = {90}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class AISimpleSubscriptionActivity$initViewModel$4 extends SuspendLambda implements cg.p<kotlinx.coroutines.w, kotlin.coroutines.c<? super tf.d>, Object> {
    int label;
    final /* synthetic */ AISimpleSubscriptionActivity this$0;

    /* compiled from: AISimpleSubscriptionActivity.kt */
    /* loaded from: classes3.dex */
    public static final class a<T> implements kotlinx.coroutines.flow.d {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AISimpleSubscriptionActivity f24428a;

        public a(AISimpleSubscriptionActivity aISimpleSubscriptionActivity) {
            this.f24428a = aISimpleSubscriptionActivity;
        }

        @Override // kotlinx.coroutines.flow.d
        public final Object emit(Object obj, kotlin.coroutines.c cVar) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            AISimpleSubscriptionActivity aISimpleSubscriptionActivity = this.f24428a;
            if (booleanValue && !aISimpleSubscriptionActivity.f24423v) {
                aISimpleSubscriptionActivity.c2();
            }
            aISimpleSubscriptionActivity.f24423v = booleanValue;
            return tf.d.f30009a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AISimpleSubscriptionActivity$initViewModel$4(AISimpleSubscriptionActivity aISimpleSubscriptionActivity, kotlin.coroutines.c<? super AISimpleSubscriptionActivity$initViewModel$4> cVar) {
        super(2, cVar);
        this.this$0 = aISimpleSubscriptionActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new AISimpleSubscriptionActivity$initViewModel$4(this.this$0, cVar);
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
            BillingConfigImpl.c.getClass();
            StateFlowImpl stateFlowImpl = BillingConfigImpl.f24856j;
            Lifecycle lifecycle = this.this$0.getLifecycle();
            kotlin.jvm.internal.g.d(lifecycle, "lifecycle");
            CallbackFlowBuilder a10 = androidx.lifecycle.g.a(stateFlowImpl, lifecycle, Lifecycle.State.STARTED);
            a aVar = new a(this.this$0);
            this.label = 1;
            if (a10.a(aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return tf.d.f30009a;
    }

    @Override // cg.p
    public final Object invoke(kotlinx.coroutines.w wVar, kotlin.coroutines.c<? super tf.d> cVar) {
        return ((AISimpleSubscriptionActivity$initViewModel$4) create(wVar, cVar)).invokeSuspend(tf.d.f30009a);
    }
}

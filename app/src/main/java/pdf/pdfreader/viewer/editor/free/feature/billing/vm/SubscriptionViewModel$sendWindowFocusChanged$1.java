package pdf.pdfreader.viewer.editor.free.feature.billing.vm;

import androidx.activity.s;
import cg.p;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.v;
import kotlinx.coroutines.w;
import tf.d;
import wf.c;

/* compiled from: SubscriptionViewModel.kt */
@c(c = "pdf.pdfreader.viewer.editor.free.feature.billing.vm.SubscriptionViewModel$sendWindowFocusChanged$1", f = "SubscriptionViewModel.kt", l = {125}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class SubscriptionViewModel$sendWindowFocusChanged$1 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super d>, Object> {
    final /* synthetic */ boolean $hasFocus;
    int label;
    final /* synthetic */ SubscriptionViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriptionViewModel$sendWindowFocusChanged$1(SubscriptionViewModel subscriptionViewModel, boolean z10, kotlin.coroutines.c<? super SubscriptionViewModel$sendWindowFocusChanged$1> cVar) {
        super(2, cVar);
        this.this$0 = subscriptionViewModel;
        this.$hasFocus = z10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new SubscriptionViewModel$sendWindowFocusChanged$1(this.this$0, this.$hasFocus, cVar);
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
            v vVar = this.this$0.f24950f;
            Boolean valueOf = Boolean.valueOf(this.$hasFocus);
            this.label = 1;
            if (vVar.emit(valueOf, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return d.f30009a;
    }

    @Override // cg.p
    public final Object invoke(w wVar, kotlin.coroutines.c<? super d> cVar) {
        return ((SubscriptionViewModel$sendWindowFocusChanged$1) create(wVar, cVar)).invokeSuspend(d.f30009a);
    }
}

package pdf.pdfreader.viewer.editor.free.feature.billing.vm;

import androidx.activity.s;
import androidx.fragment.app.Fragment;
import cg.p;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.v;
import kotlinx.coroutines.w;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;
import pm.b;
import tf.d;
import wf.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SubscriptionViewModel.kt */
@c(c = "pdf.pdfreader.viewer.editor.free.feature.billing.vm.SubscriptionViewModel$sendRetainPageContinueEvent$1", f = "SubscriptionViewModel.kt", l = {ShapeTypes.FLOW_CHART_DOCUMENT}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class SubscriptionViewModel$sendRetainPageContinueEvent$1 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super d>, Object> {
    final /* synthetic */ Fragment $fragment;
    final /* synthetic */ String $freeTrialCount;
    final /* synthetic */ boolean $isBackPressed;
    int label;
    final /* synthetic */ SubscriptionViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriptionViewModel$sendRetainPageContinueEvent$1(SubscriptionViewModel subscriptionViewModel, Fragment fragment, String str, boolean z10, kotlin.coroutines.c<? super SubscriptionViewModel$sendRetainPageContinueEvent$1> cVar) {
        super(2, cVar);
        this.this$0 = subscriptionViewModel;
        this.$fragment = fragment;
        this.$freeTrialCount = str;
        this.$isBackPressed = z10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new SubscriptionViewModel$sendRetainPageContinueEvent$1(this.this$0, this.$fragment, this.$freeTrialCount, this.$isBackPressed, cVar);
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
            v vVar = this.this$0.f24948d;
            b.e eVar = new b.e(this.$fragment, this.$freeTrialCount, this.$isBackPressed);
            this.label = 1;
            if (vVar.emit(eVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return d.f30009a;
    }

    @Override // cg.p
    public final Object invoke(w wVar, kotlin.coroutines.c<? super d> cVar) {
        return ((SubscriptionViewModel$sendRetainPageContinueEvent$1) create(wVar, cVar)).invokeSuspend(d.f30009a);
    }
}

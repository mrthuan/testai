package pdf.pdfreader.viewer.editor.free.ui.vm;

import androidx.activity.s;
import cg.p;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.v;
import kotlinx.coroutines.w;
import pdf.pdfreader.viewer.editor.free.ads.s.network.NetworkType;
import tf.d;
import wf.c;

/* compiled from: AppViewModel.kt */
@c(c = "pdf.pdfreader.viewer.editor.free.ui.vm.AppViewModel$sendNetworkState$1", f = "AppViewModel.kt", l = {59}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class AppViewModel$sendNetworkState$1 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super d>, Object> {
    final /* synthetic */ NetworkType $newState;
    int label;
    final /* synthetic */ AppViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppViewModel$sendNetworkState$1(AppViewModel appViewModel, NetworkType networkType, kotlin.coroutines.c<? super AppViewModel$sendNetworkState$1> cVar) {
        super(2, cVar);
        this.this$0 = appViewModel;
        this.$newState = networkType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new AppViewModel$sendNetworkState$1(this.this$0, this.$newState, cVar);
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
            v vVar = this.this$0.f28153j;
            NetworkType networkType = this.$newState;
            this.label = 1;
            if (vVar.emit(networkType, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return d.f30009a;
    }

    @Override // cg.p
    public final Object invoke(w wVar, kotlin.coroutines.c<? super d> cVar) {
        return ((AppViewModel$sendNetworkState$1) create(wVar, cVar)).invokeSuspend(d.f30009a);
    }
}

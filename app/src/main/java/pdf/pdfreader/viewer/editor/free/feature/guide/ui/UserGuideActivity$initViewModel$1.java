package pdf.pdfreader.viewer.editor.free.feature.guide.ui;

import androidx.activity.s;
import androidx.lifecycle.Lifecycle;
import cg.p;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g;
import kotlinx.coroutines.flow.CallbackFlowBuilder;
import kotlinx.coroutines.flow.v;
import kotlinx.coroutines.w;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;
import pdf.pdfreader.viewer.editor.free.feature.guide.ui.UserGuideActivity;
import pdf.pdfreader.viewer.editor.free.feature.guide.vm.UserGuideViewModel;
import tf.d;
import tm.b;
import wf.c;

/* compiled from: UserGuideActivity.kt */
@c(c = "pdf.pdfreader.viewer.editor.free.feature.guide.ui.UserGuideActivity$initViewModel$1", f = "UserGuideActivity.kt", l = {ShapeTypes.FLOW_CHART_TERMINATOR}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class UserGuideActivity$initViewModel$1 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super d>, Object> {
    int label;
    final /* synthetic */ UserGuideActivity this$0;

    /* compiled from: UserGuideActivity.kt */
    /* loaded from: classes3.dex */
    public static final class a<T> implements kotlinx.coroutines.flow.d {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ UserGuideActivity f24988a;

        public a(UserGuideActivity userGuideActivity) {
            this.f24988a = userGuideActivity;
        }

        @Override // kotlinx.coroutines.flow.d
        public final Object emit(Object obj, kotlin.coroutines.c cVar) {
            b bVar = (b) obj;
            boolean a10 = g.a(bVar, b.a.f30062a);
            UserGuideActivity userGuideActivity = this.f24988a;
            if (a10) {
                UserGuideActivity.a2(userGuideActivity);
            } else if (g.a(bVar, b.C0379b.f30063a)) {
                UserGuideActivity.a aVar = UserGuideActivity.f24980y;
                userGuideActivity.c2();
            }
            return d.f30009a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserGuideActivity$initViewModel$1(UserGuideActivity userGuideActivity, kotlin.coroutines.c<? super UserGuideActivity$initViewModel$1> cVar) {
        super(2, cVar);
        this.this$0 = userGuideActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new UserGuideActivity$initViewModel$1(this.this$0, cVar);
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
            UserGuideActivity userGuideActivity = this.this$0;
            UserGuideActivity.a aVar = UserGuideActivity.f24980y;
            v vVar = ((UserGuideViewModel) userGuideActivity.f24982t.getValue()).f25052f;
            Lifecycle lifecycle = this.this$0.getLifecycle();
            g.d(lifecycle, "lifecycle");
            CallbackFlowBuilder a10 = androidx.lifecycle.g.a(vVar, lifecycle, Lifecycle.State.STARTED);
            a aVar2 = new a(this.this$0);
            this.label = 1;
            if (a10.a(aVar2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return d.f30009a;
    }

    @Override // cg.p
    public final Object invoke(w wVar, kotlin.coroutines.c<? super d> cVar) {
        return ((UserGuideActivity$initViewModel$1) create(wVar, cVar)).invokeSuspend(d.f30009a);
    }
}

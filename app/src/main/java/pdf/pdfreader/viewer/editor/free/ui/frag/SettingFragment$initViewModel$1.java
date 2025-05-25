package pdf.pdfreader.viewer.editor.free.ui.frag;

import am.a1;
import androidx.lifecycle.Lifecycle;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.CallbackFlowBuilder;
import kotlinx.coroutines.flow.a0;
import kotlinx.coroutines.w;
import pdf.pdfreader.viewer.editor.free.feature.billing.BillingConfigImpl;
import pdf.pdfreader.viewer.editor.free.ui.frag.SettingFragment;

/* compiled from: SettingFragment.kt */
@wf.c(c = "pdf.pdfreader.viewer.editor.free.ui.frag.SettingFragment$initViewModel$1", f = "SettingFragment.kt", l = {494}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class SettingFragment$initViewModel$1 extends SuspendLambda implements cg.p<w, kotlin.coroutines.c<? super tf.d>, Object> {
    int label;
    final /* synthetic */ SettingFragment this$0;

    /* compiled from: SettingFragment.kt */
    /* loaded from: classes3.dex */
    public static final class a<T> implements kotlinx.coroutines.flow.d {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ SettingFragment f27977a;

        public a(SettingFragment settingFragment) {
            this.f27977a = settingFragment;
        }

        @Override // kotlinx.coroutines.flow.d
        public final Object emit(Object obj, kotlin.coroutines.c cVar) {
            int i10;
            boolean booleanValue = ((Boolean) obj).booleanValue();
            SettingFragment.a aVar = SettingFragment.f27957u0;
            SettingFragment settingFragment = this.f27977a;
            if (booleanValue) {
                settingFragment.y0().f711n.j();
            } else {
                settingFragment.y0().f711n.d();
            }
            int i11 = 8;
            if (settingFragment.y0().f710m.getVisibility() == 8 && booleanValue) {
                tn.a.b(settingFragment.g0(), ea.a.p("R2UTdCduZw==", "qE4gNi1Z"), ea.a.p("RGUFdC9uM184cglfR2g4dw==", "yR7qFTbt"));
            }
            a1 y02 = settingFragment.y0();
            if (booleanValue) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            y02.f710m.setVisibility(i10);
            a1 y03 = settingFragment.y0();
            if (booleanValue) {
                i11 = 0;
            }
            y03.f711n.setVisibility(i11);
            return tf.d.f30009a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingFragment$initViewModel$1(SettingFragment settingFragment, kotlin.coroutines.c<? super SettingFragment$initViewModel$1> cVar) {
        super(2, cVar);
        this.this$0 = settingFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new SettingFragment$initViewModel$1(this.this$0, cVar);
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
            androidx.lifecycle.q lifecycle = this.this$0.P;
            kotlin.jvm.internal.g.d(lifecycle, "lifecycle");
            CallbackFlowBuilder a10 = androidx.lifecycle.g.a((a0) BillingConfigImpl.f24869w.getValue(), lifecycle, Lifecycle.State.RESUMED);
            a aVar = new a(this.this$0);
            this.label = 1;
            if (a10.a(aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return tf.d.f30009a;
    }

    @Override // cg.p
    public final Object invoke(w wVar, kotlin.coroutines.c<? super tf.d> cVar) {
        return ((SettingFragment$initViewModel$1) create(wVar, cVar)).invokeSuspend(tf.d.f30009a);
    }
}

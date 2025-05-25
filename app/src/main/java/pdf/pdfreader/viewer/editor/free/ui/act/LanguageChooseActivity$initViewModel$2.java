package pdf.pdfreader.viewer.editor.free.ui.act;

import android.content.Intent;
import androidx.lifecycle.Lifecycle;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.CallbackFlowBuilder;
import kotlinx.coroutines.flow.StateFlowImpl;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;

/* compiled from: LanguageChooseActivity.kt */
@wf.c(c = "pdf.pdfreader.viewer.editor.free.ui.act.LanguageChooseActivity$initViewModel$2", f = "LanguageChooseActivity.kt", l = {353}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class LanguageChooseActivity$initViewModel$2 extends SuspendLambda implements cg.p<kotlinx.coroutines.w, kotlin.coroutines.c<? super tf.d>, Object> {
    int label;
    final /* synthetic */ LanguageChooseActivity this$0;

    /* compiled from: LanguageChooseActivity.kt */
    /* loaded from: classes3.dex */
    public static final class a<T> implements kotlinx.coroutines.flow.d {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ LanguageChooseActivity f26625a;

        public a(LanguageChooseActivity languageChooseActivity) {
            this.f26625a = languageChooseActivity;
        }

        @Override // kotlinx.coroutines.flow.d
        public final Object emit(Object obj, kotlin.coroutines.c cVar) {
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                bool.booleanValue();
                if (bool.booleanValue()) {
                    Intent intent = this.f26625a.getIntent();
                    if (intent != null) {
                        intent.putExtra("deep_line_happy_new_year_2025_from", true);
                    }
                    ReaderPdfApplication.k().d(null);
                }
                return tf.d.f30009a;
            }
            return tf.d.f30009a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageChooseActivity$initViewModel$2(LanguageChooseActivity languageChooseActivity, kotlin.coroutines.c<? super LanguageChooseActivity$initViewModel$2> cVar) {
        super(2, cVar);
        this.this$0 = languageChooseActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new LanguageChooseActivity$initViewModel$2(this.this$0, cVar);
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
            StateFlowImpl stateFlowImpl = ReaderPdfApplication.k().f28155l;
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
        return ((LanguageChooseActivity$initViewModel$2) create(wVar, cVar)).invokeSuspend(tf.d.f30009a);
    }
}

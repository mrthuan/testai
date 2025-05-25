package pdf.pdfreader.viewer.editor.free.ui.act;

import java.util.ArrayList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: LanguageChooseActivity.kt */
@wf.c(c = "pdf.pdfreader.viewer.editor.free.ui.act.LanguageChooseActivity$onStop$1", f = "LanguageChooseActivity.kt", l = {717}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class LanguageChooseActivity$onStop$1 extends SuspendLambda implements cg.p<kotlinx.coroutines.w, kotlin.coroutines.c<? super tf.d>, Object> {
    final /* synthetic */ ArrayList<Long> $fcmTime;
    int label;
    final /* synthetic */ LanguageChooseActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageChooseActivity$onStop$1(LanguageChooseActivity languageChooseActivity, ArrayList<Long> arrayList, kotlin.coroutines.c<? super LanguageChooseActivity$onStop$1> cVar) {
        super(2, cVar);
        this.this$0 = languageChooseActivity;
        this.$fcmTime = arrayList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new LanguageChooseActivity$onStop$1(this.this$0, this.$fcmTime, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.label;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    androidx.activity.s.u0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                androidx.activity.s.u0(obj);
                pdf.pdfreader.viewer.editor.free.service.b bVar = pdf.pdfreader.viewer.editor.free.service.b.f26559a;
                LanguageChooseActivity languageChooseActivity = this.this$0;
                ArrayList<Long> arrayList = this.$fcmTime;
                this.label = 1;
                bVar.getClass();
                if (pdf.pdfreader.viewer.editor.free.service.b.g(arrayList, languageChooseActivity, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } catch (Exception e10) {
            dp.a.a().getClass();
            dp.a.e(e10);
        }
        return tf.d.f30009a;
    }

    @Override // cg.p
    public final Object invoke(kotlinx.coroutines.w wVar, kotlin.coroutines.c<? super tf.d> cVar) {
        return ((LanguageChooseActivity$onStop$1) create(wVar, cVar)).invokeSuspend(tf.d.f30009a);
    }
}

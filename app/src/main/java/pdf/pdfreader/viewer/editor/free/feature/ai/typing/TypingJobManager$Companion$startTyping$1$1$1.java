package pdf.pdfreader.viewer.editor.free.feature.ai.typing;

import android.text.Spanned;
import androidx.activity.s;
import cg.p;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.w;
import tf.d;

/* compiled from: TypingJobManager.kt */
@wf.c(c = "pdf.pdfreader.viewer.editor.free.feature.ai.typing.TypingJobManager$Companion$startTyping$1$1$1", f = "TypingJobManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class TypingJobManager$Companion$startTyping$1$1$1 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super d>, Object> {
    final /* synthetic */ p<Integer, CharSequence, d> $onTypingCompleted;
    final /* synthetic */ Spanned $parsedSpanned;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TypingJobManager$Companion$startTyping$1$1$1(p<? super Integer, ? super CharSequence, d> pVar, Spanned spanned, kotlin.coroutines.c<? super TypingJobManager$Companion$startTyping$1$1$1> cVar) {
        super(2, cVar);
        this.$onTypingCompleted = pVar;
        this.$parsedSpanned = spanned;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new TypingJobManager$Companion$startTyping$1$1$1(this.$onTypingCompleted, this.$parsedSpanned, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            s.u0(obj);
            p<Integer, CharSequence, d> pVar = this.$onTypingCompleted;
            if (pVar != null) {
                pVar.invoke(new Integer(-1), this.$parsedSpanned);
            }
            b bVar = c.c;
            if (bVar != null) {
                bVar.a(this.$parsedSpanned);
                return d.f30009a;
            }
            return null;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // cg.p
    public final Object invoke(w wVar, kotlin.coroutines.c<? super d> cVar) {
        return ((TypingJobManager$Companion$startTyping$1$1$1) create(wVar, cVar)).invokeSuspend(d.f30009a);
    }
}

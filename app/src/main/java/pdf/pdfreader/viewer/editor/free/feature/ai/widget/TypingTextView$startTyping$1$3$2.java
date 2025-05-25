package pdf.pdfreader.viewer.editor.free.feature.ai.widget;

import android.text.Spanned;
import androidx.activity.s;
import cg.p;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.w;

/* compiled from: TypingTextView.kt */
@wf.c(c = "pdf.pdfreader.viewer.editor.free.feature.ai.widget.TypingTextView$startTyping$1$3$2", f = "TypingTextView.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class TypingTextView$startTyping$1$3$2 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super tf.d>, Object> {
    final /* synthetic */ int $i;
    final /* synthetic */ Spanned $it;
    int label;
    final /* synthetic */ TypingTextView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TypingTextView$startTyping$1$3$2(Spanned spanned, int i10, TypingTextView typingTextView, kotlin.coroutines.c<? super TypingTextView$startTyping$1$3$2> cVar) {
        super(2, cVar);
        this.$it = spanned;
        this.$i = i10;
        this.this$0 = typingTextView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new TypingTextView$startTyping$1$3$2(this.$it, this.$i, this.this$0, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            s.u0(obj);
            this.this$0.setText(this.$it.subSequence(0, this.$i));
            return tf.d.f30009a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // cg.p
    public final Object invoke(w wVar, kotlin.coroutines.c<? super tf.d> cVar) {
        return ((TypingTextView$startTyping$1$3$2) create(wVar, cVar)).invokeSuspend(tf.d.f30009a);
    }
}

package pdf.pdfreader.viewer.editor.free.feature.ai.widget;

import androidx.activity.s;
import cg.p;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.w;

/* compiled from: TypingTextView.kt */
@wf.c(c = "pdf.pdfreader.viewer.editor.free.feature.ai.widget.TypingTextView$startTyping$1$4$1", f = "TypingTextView.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class TypingTextView$startTyping$1$4$1 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super tf.d>, Object> {
    final /* synthetic */ p<CharSequence, Boolean, tf.d> $onTypingCompleted;
    int label;
    final /* synthetic */ TypingTextView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TypingTextView$startTyping$1$4$1(TypingTextView typingTextView, p<? super CharSequence, ? super Boolean, tf.d> pVar, kotlin.coroutines.c<? super TypingTextView$startTyping$1$4$1> cVar) {
        super(2, cVar);
        this.this$0 = typingTextView;
        this.$onTypingCompleted = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new TypingTextView$startTyping$1$4$1(this.this$0, this.$onTypingCompleted, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            s.u0(obj);
            this.this$0.setText("");
            p<CharSequence, Boolean, tf.d> pVar = this.$onTypingCompleted;
            if (pVar != null) {
                pVar.invoke("", Boolean.FALSE);
                return tf.d.f30009a;
            }
            return null;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // cg.p
    public final Object invoke(w wVar, kotlin.coroutines.c<? super tf.d> cVar) {
        return ((TypingTextView$startTyping$1$4$1) create(wVar, cVar)).invokeSuspend(tf.d.f30009a);
    }
}

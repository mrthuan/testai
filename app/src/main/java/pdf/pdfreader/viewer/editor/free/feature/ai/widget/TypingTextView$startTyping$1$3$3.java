package pdf.pdfreader.viewer.editor.free.feature.ai.widget;

import android.text.Spanned;
import androidx.activity.s;
import cg.p;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$IntRef;
import kotlinx.coroutines.w;

/* compiled from: TypingTextView.kt */
@wf.c(c = "pdf.pdfreader.viewer.editor.free.feature.ai.widget.TypingTextView$startTyping$1$3$3", f = "TypingTextView.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class TypingTextView$startTyping$1$3$3 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super tf.d>, Object> {
    final /* synthetic */ int $end;
    final /* synthetic */ Spanned $it;
    final /* synthetic */ p<CharSequence, Boolean, tf.d> $onTypingCompleted;
    final /* synthetic */ Ref$IntRef $start;
    int label;
    final /* synthetic */ TypingTextView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TypingTextView$startTyping$1$3$3(TypingTextView typingTextView, Spanned spanned, p<? super CharSequence, ? super Boolean, tf.d> pVar, Ref$IntRef ref$IntRef, int i10, kotlin.coroutines.c<? super TypingTextView$startTyping$1$3$3> cVar) {
        super(2, cVar);
        this.this$0 = typingTextView;
        this.$it = spanned;
        this.$onTypingCompleted = pVar;
        this.$start = ref$IntRef;
        this.$end = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new TypingTextView$startTyping$1$3$3(this.this$0, this.$it, this.$onTypingCompleted, this.$start, this.$end, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z10;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            s.u0(obj);
            this.this$0.setText(this.$it);
            p<CharSequence, Boolean, tf.d> pVar = this.$onTypingCompleted;
            if (pVar != null) {
                Spanned spanned = this.$it;
                if (this.$start.element < this.$end) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                pVar.invoke(spanned, Boolean.valueOf(z10));
                return tf.d.f30009a;
            }
            return null;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // cg.p
    public final Object invoke(w wVar, kotlin.coroutines.c<? super tf.d> cVar) {
        return ((TypingTextView$startTyping$1$3$3) create(wVar, cVar)).invokeSuspend(tf.d.f30009a);
    }
}

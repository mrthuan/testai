package pdf.pdfreader.viewer.editor.free.feature.ai.widget;

import android.text.Spanned;
import cg.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.w;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TypingTextView.kt */
@wf.c(c = "pdf.pdfreader.viewer.editor.free.feature.ai.widget.TypingTextView$startTyping$1", f = "TypingTextView.kt", l = {99, 106, 111, 115, 121}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class TypingTextView$startTyping$1 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super tf.d>, Object> {
    final /* synthetic */ p<CharSequence, Boolean, tf.d> $onTypingCompleted;
    final /* synthetic */ Spanned $span;
    final /* synthetic */ String $text;
    final /* synthetic */ long $typingSpeed;
    final /* synthetic */ int $typingStartIndex;
    int I$0;
    int I$1;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ TypingTextView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TypingTextView$startTyping$1(String str, TypingTextView typingTextView, Spanned spanned, int i10, long j10, p<? super CharSequence, ? super Boolean, tf.d> pVar, kotlin.coroutines.c<? super TypingTextView$startTyping$1> cVar) {
        super(2, cVar);
        this.$text = str;
        this.this$0 = typingTextView;
        this.$span = spanned;
        this.$typingStartIndex = i10;
        this.$typingSpeed = j10;
        this.$onTypingCompleted = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        TypingTextView$startTyping$1 typingTextView$startTyping$1 = new TypingTextView$startTyping$1(this.$text, this.this$0, this.$span, this.$typingStartIndex, this.$typingSpeed, this.$onTypingCompleted, cVar);
        typingTextView$startTyping$1.L$0 = obj;
        return typingTextView$startTyping$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x01a0, code lost:
        if (((tf.d) r2) == null) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0160 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x019d A[RETURN] */
    /* JADX WARN: Type inference failed for: r9v6, types: [android.text.Spanned, T] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x0161 -> B:50:0x0169). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.feature.ai.widget.TypingTextView$startTyping$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // cg.p
    public final Object invoke(w wVar, kotlin.coroutines.c<? super tf.d> cVar) {
        return ((TypingTextView$startTyping$1) create(wVar, cVar)).invokeSuspend(tf.d.f30009a);
    }
}

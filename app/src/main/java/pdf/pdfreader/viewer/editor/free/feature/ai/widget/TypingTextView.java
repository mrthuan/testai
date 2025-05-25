package pdf.pdfreader.viewer.editor.free.feature.ai.widget;

import android.content.Context;
import android.text.SpannableString;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import cg.p;
import kotlinx.coroutines.j0;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.x;
import pdf.pdfreader.viewer.editor.free.utils.t0;

/* compiled from: TypingTextView.kt */
/* loaded from: classes3.dex */
public final class TypingTextView extends AppCompatTextView {

    /* renamed from: k  reason: collision with root package name */
    public static final /* synthetic */ int f24762k = 0;

    /* renamed from: h  reason: collision with root package name */
    public final jf.f f24763h;

    /* renamed from: i  reason: collision with root package name */
    public l1 f24764i;

    /* renamed from: j  reason: collision with root package name */
    public cg.a<tf.d> f24765j;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TypingTextView(Context context) {
        this(context, null, 6, 0);
        kotlin.jvm.internal.g.e(context, ea.a.p("BG8LdC14dA==", "degeHXGX"));
    }

    public final cg.a<tf.d> getOnHeightChange() {
        return this.f24765j;
    }

    public final void l(String str, long j10, SpannableString spannableString, int i10, p pVar) {
        l1 l1Var = this.f24764i;
        if (l1Var != null) {
            l1Var.b(null);
        }
        setText("");
        this.f24764i = t0.d0(x.a(j0.f20206a), null, null, new TypingTextView$startTyping$1(str, this, spannableString, i10, j10, pVar, null), 3);
    }

    public final void m(String text, long j10, p<? super CharSequence, ? super Boolean, tf.d> pVar) {
        kotlin.jvm.internal.g.e(text, "text");
        l(text, j10, null, 0, pVar);
    }

    public final void n() {
        l1 l1Var = this.f24764i;
        if (l1Var != null) {
            l1Var.b(null);
        }
        this.f24764i = null;
    }

    public final void setOnHeightChange(cg.a<tf.d> aVar) {
        this.f24765j = aVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TypingTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        kotlin.jvm.internal.g.e(context, ea.a.p("LG9fdBx4dA==", "PfwVJpEZ"));
    }

    public /* synthetic */ TypingTextView(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TypingTextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        kotlin.jvm.internal.g.e(context, ea.a.p("Nm9adAt4dA==", "YHU4nnEL"));
        this.f24763h = pdf.pdfreader.viewer.editor.free.feature.ai.typing.c.f24352a;
        addOnLayoutChangeListener(new l(this, 0));
    }
}

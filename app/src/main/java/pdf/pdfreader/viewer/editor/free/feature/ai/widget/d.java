package pdf.pdfreader.viewer.editor.free.feature.ai.widget;

import am.b2;

/* compiled from: AIAnswerView.kt */
/* loaded from: classes3.dex */
public final class d implements pdf.pdfreader.viewer.editor.free.feature.ai.typing.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AIAnswerView f24771a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f24772b;
    public final /* synthetic */ b2 c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ cg.l<CharSequence, tf.d> f24773d;

    /* JADX WARN: Multi-variable type inference failed */
    public d(AIAnswerView aIAnswerView, String str, b2 b2Var, cg.l<? super CharSequence, tf.d> lVar) {
        this.f24771a = aIAnswerView;
        this.f24772b = str;
        this.c = b2Var;
        this.f24773d = lVar;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.ai.typing.b
    public final void a(CharSequence spannableStringBuilder) {
        cg.l<CharSequence, tf.d> lVar;
        kotlin.jvm.internal.g.e(spannableStringBuilder, "spannableStringBuilder");
        if (kotlin.jvm.internal.g.a(this.f24771a.getTag(), this.f24772b) && (lVar = this.f24773d) != null) {
            lVar.invoke(spannableStringBuilder);
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.ai.typing.b
    public final void b(CharSequence charSequence) {
        if (kotlin.jvm.internal.g.a(this.f24771a.getTag(), this.f24772b) && charSequence != null) {
            this.c.f763p.setText(charSequence);
        }
    }
}

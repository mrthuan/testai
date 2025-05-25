package lm;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: AIHelper.kt */
/* loaded from: classes3.dex */
public final class d extends ClickableSpan {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ cg.a<tf.d> f21771a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f21772b;

    public d(cg.a<tf.d> aVar, int i10) {
        this.f21771a = aVar;
        this.f21772b = i10;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View widget) {
        kotlin.jvm.internal.g.e(widget, "widget");
        this.f21771a.invoke();
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint ds) {
        kotlin.jvm.internal.g.e(ds, "ds");
        super.updateDrawState(ds);
        ds.setUnderlineText(true);
        ds.setColor(this.f21772b);
    }
}

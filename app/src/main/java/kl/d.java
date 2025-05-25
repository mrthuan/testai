package kl;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: StringEx.kt */
/* loaded from: classes3.dex */
public final class d extends ClickableSpan {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CharacterStyle f19863a;

    public d(CharacterStyle characterStyle) {
        this.f19863a = characterStyle;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View widget) {
        kotlin.jvm.internal.g.e(widget, "widget");
        ((ClickableSpan) this.f19863a).onClick(widget);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint ds) {
        kotlin.jvm.internal.g.e(ds, "ds");
        this.f19863a.updateDrawState(ds);
    }
}

package kl;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* compiled from: StringEx.kt */
/* loaded from: classes3.dex */
public final class c extends b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CharacterStyle f19862a;

    public c(CharacterStyle characterStyle) {
        this.f19862a = characterStyle;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        this.f19862a.updateDrawState(textPaint);
    }
}

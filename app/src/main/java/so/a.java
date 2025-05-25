package so;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* compiled from: GradientColorSpan.kt */
/* loaded from: classes3.dex */
public final class a extends CharacterStyle implements UpdateAppearance {

    /* renamed from: a  reason: collision with root package name */
    public final Shader f29837a;

    public a(LinearGradient linearGradient) {
        ea.a.p("SmgZZD9y", "eI9xZMuT");
        this.f29837a = linearGradient;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (textPaint != null) {
            textPaint.setShader(this.f29837a);
        }
    }
}

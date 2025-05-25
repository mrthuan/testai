package lm;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* compiled from: CustomTypefaceSpan.java */
/* loaded from: classes3.dex */
public final class g extends MetricAffectingSpan {

    /* renamed from: a  reason: collision with root package name */
    public final Typeface f21778a;

    public g(Typeface typeface) {
        this.f21778a = typeface;
    }

    public final void a(Paint paint) {
        int i10;
        Typeface typeface = paint.getTypeface();
        if (typeface != null) {
            i10 = typeface.getStyle();
        } else {
            i10 = 0;
        }
        Typeface typeface2 = this.f21778a;
        int i11 = i10 & (~typeface2.getStyle());
        if ((i11 & 1) != 0) {
            paint.setFakeBoldText(true);
        }
        if ((i11 & 2) != 0) {
            paint.setTextSkewX(-0.25f);
        }
        paint.setTypeface(typeface2);
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        a(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        a(textPaint);
    }
}

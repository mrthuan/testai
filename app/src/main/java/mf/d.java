package mf;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import kf.p;

/* compiled from: CodeSpan.java */
/* loaded from: classes.dex */
public final class d extends MetricAffectingSpan {

    /* renamed from: a  reason: collision with root package name */
    public final p f22026a;

    public d(p pVar) {
        this.f22026a = pVar;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        p pVar = this.f22026a;
        pVar.getClass();
        textPaint.setTypeface(Typeface.MONOSPACE);
        textPaint.setTextSize(textPaint.getTextSize() * 0.87f);
        pVar.getClass();
        textPaint.bgColor = (textPaint.getColor() & 16777215) | 419430400;
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        this.f22026a.getClass();
        textPaint.setTypeface(Typeface.MONOSPACE);
        textPaint.setTextSize(textPaint.getTextSize() * 0.87f);
    }
}

package mf;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* compiled from: EmphasisSpan.java */
/* loaded from: classes.dex */
public final class e extends MetricAffectingSpan {
    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setTextSkewX(-0.25f);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setTextSkewX(-0.25f);
    }
}

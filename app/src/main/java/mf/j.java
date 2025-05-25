package mf;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* compiled from: StrongEmphasisSpan.java */
/* loaded from: classes.dex */
public final class j extends MetricAffectingSpan {
    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setFakeBoldText(true);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setFakeBoldText(true);
    }
}

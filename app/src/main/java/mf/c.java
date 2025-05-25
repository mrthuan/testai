package mf;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.TextPaint;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;
import kf.p;

/* compiled from: CodeBlockSpan.java */
/* loaded from: classes.dex */
public final class c extends MetricAffectingSpan implements LeadingMarginSpan {

    /* renamed from: a  reason: collision with root package name */
    public final p f22024a;

    /* renamed from: b  reason: collision with root package name */
    public final Rect f22025b = h.f22032a;
    public final Paint c = h.c;

    public c(p pVar) {
        this.f22024a = pVar;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i10, int i11, int i12, int i13, int i14, CharSequence charSequence, int i15, int i16, boolean z10, Layout layout) {
        int i17;
        Paint paint2 = this.c;
        paint2.setStyle(Paint.Style.FILL);
        this.f22024a.getClass();
        paint2.setColor((paint.getColor() & 16777215) | 419430400);
        if (i11 > 0) {
            i17 = canvas.getWidth();
        } else {
            i10 -= canvas.getWidth();
            i17 = i10;
        }
        Rect rect = this.f22025b;
        rect.set(i10, i12, i17, i14);
        canvas.drawRect(rect, paint2);
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z10) {
        return this.f22024a.f19739e;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        this.f22024a.getClass();
        textPaint.setTypeface(Typeface.MONOSPACE);
        textPaint.setTextSize(textPaint.getTextSize() * 0.87f);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        this.f22024a.getClass();
        textPaint.setTypeface(Typeface.MONOSPACE);
        textPaint.setTextSize(textPaint.getTextSize() * 0.87f);
    }
}

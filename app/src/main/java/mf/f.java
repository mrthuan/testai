package mf;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;
import java.util.Arrays;
import java.util.Locale;
import kf.p;

/* compiled from: HeadingSpan.java */
/* loaded from: classes.dex */
public final class f extends MetricAffectingSpan implements LeadingMarginSpan {

    /* renamed from: a  reason: collision with root package name */
    public final p f22027a;

    /* renamed from: b  reason: collision with root package name */
    public final Rect f22028b = h.f22032a;
    public final Paint c = h.c;

    /* renamed from: d  reason: collision with root package name */
    public final int f22029d;

    public f(p pVar, int i10) {
        this.f22027a = pVar;
        this.f22029d = i10;
    }

    public final void a(TextPaint textPaint) {
        p pVar = this.f22027a;
        pVar.getClass();
        textPaint.setFakeBoldText(true);
        float[] fArr = pVar.f19741g;
        if (fArr == null) {
            fArr = p.f19735i;
        }
        int length = fArr.length;
        int i10 = this.f22029d;
        if (length >= i10) {
            textPaint.setTextSize(textPaint.getTextSize() * fArr[i10 - 1]);
            return;
        }
        throw new IllegalStateException(String.format(Locale.US, "Supplied heading level: %d is invalid, where configured heading sizes are: `%s`", Integer.valueOf(i10), Arrays.toString(fArr)));
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i10, int i11, int i12, int i13, int i14, CharSequence charSequence, int i15, int i16, boolean z10, Layout layout) {
        int i17;
        int i18 = this.f22029d;
        boolean z11 = true;
        if (i18 == 1 || i18 == 2) {
            if (((charSequence instanceof Spanned) && ((Spanned) charSequence).getSpanEnd(this) == i16) ? false : false) {
                Paint paint2 = this.c;
                paint2.set(paint);
                p pVar = this.f22027a;
                pVar.getClass();
                paint2.setColor((paint2.getColor() & 16777215) | 1258291200);
                paint2.setStyle(Paint.Style.FILL);
                int i19 = pVar.f19740f;
                if (i19 >= 0) {
                    paint2.setStrokeWidth(i19);
                }
                float strokeWidth = paint2.getStrokeWidth();
                if (strokeWidth > 0.0f) {
                    int i20 = (int) ((i14 - strokeWidth) + 0.5f);
                    if (i11 > 0) {
                        i17 = canvas.getWidth();
                    } else {
                        i17 = i10;
                        i10 -= canvas.getWidth();
                    }
                    Rect rect = this.f22028b;
                    rect.set(i10, i20, i17, i14);
                    canvas.drawRect(rect, paint2);
                }
            }
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z10) {
        return 0;
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

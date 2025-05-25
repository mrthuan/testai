package so;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import kotlin.jvm.internal.g;

/* compiled from: VerticalImageSpan.kt */
/* loaded from: classes3.dex */
public final class b extends ImageSpan {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, int i10) {
        super(context, i10);
        g.e(context, ea.a.p("UG8ldBZ4dA==", "cw0MMhBM"));
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        g.e(canvas, "canvas");
        g.e(paint, "paint");
        Drawable drawable = getDrawable();
        canvas.save();
        canvas.translate(f10, (((i14 - i12) - drawable.getBounds().bottom) / 2) + i12);
        drawable.draw(canvas);
        canvas.restore();
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        g.e(paint, "paint");
        Rect bounds = getDrawable().getBounds();
        g.d(bounds, ea.a.p("Ji40bwNuFnM=", "8ABVvrq4"));
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
            int i12 = fontMetricsInt2.descent - fontMetricsInt2.ascent;
            int i13 = (bounds.bottom - bounds.top) / 2;
            int i14 = i12 / 4;
            int i15 = i13 - i14;
            int i16 = -(i13 + i14);
            fontMetricsInt.ascent = i16;
            fontMetricsInt.descent = i15;
            fontMetricsInt.top = i16;
            fontMetricsInt.bottom = i15;
        }
        return bounds.right;
    }
}

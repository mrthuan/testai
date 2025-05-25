package mf;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
import kf.p;

/* compiled from: BulletListItemSpan.java */
/* loaded from: classes.dex */
public final class b implements LeadingMarginSpan {

    /* renamed from: f  reason: collision with root package name */
    public static final boolean f22019f;

    /* renamed from: a  reason: collision with root package name */
    public final p f22020a;

    /* renamed from: b  reason: collision with root package name */
    public final Paint f22021b = h.c;
    public final RectF c = h.f22033b;

    /* renamed from: d  reason: collision with root package name */
    public final Rect f22022d = h.f22032a;

    /* renamed from: e  reason: collision with root package name */
    public final int f22023e;

    static {
        boolean z10;
        int i10 = Build.VERSION.SDK_INT;
        if (24 != i10 && 25 != i10) {
            z10 = false;
        } else {
            z10 = true;
        }
        f22019f = z10;
    }

    public b(p pVar, int i10) {
        this.f22020a = pVar;
        this.f22023e = i10;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i10, int i11, int i12, int i13, int i14, CharSequence charSequence, int i15, int i16, boolean z10, Layout layout) {
        boolean z11;
        int i17;
        int i18;
        Paint.Style style;
        int i19;
        Rect rect = this.f22022d;
        if (z10) {
            if ((charSequence instanceof Spanned) && ((Spanned) charSequence).getSpanStart(this) == i15) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                Paint paint2 = this.f22021b;
                paint2.set(paint);
                p pVar = this.f22020a;
                pVar.getClass();
                paint2.setColor(paint2.getColor());
                int i20 = pVar.c;
                if (i20 != 0) {
                    paint2.setStrokeWidth(i20);
                }
                int i21 = pVar.f19736a;
                int save = canvas.save();
                try {
                    int min = Math.min(i21, (int) ((paint2.descent() - paint2.ascent()) + 0.5f)) / 2;
                    int i22 = pVar.f19738d;
                    if (i22 != 0 && i22 <= min) {
                        min = i22;
                    }
                    int i23 = (i21 - min) / 2;
                    boolean z12 = f22019f;
                    int i24 = this.f22023e;
                    if (z12) {
                        if (i11 < 0) {
                            i19 = i10 - (layout.getWidth() - (i21 * i24));
                        } else {
                            i19 = (i21 * i24) - i10;
                        }
                        int i25 = (i23 * i11) + i10;
                        int i26 = (i11 * min) + i25;
                        int i27 = i11 * i19;
                        i17 = Math.min(i25, i26) + i27;
                        i18 = Math.max(i25, i26) + i27;
                    } else {
                        if (i11 <= 0) {
                            i10 -= i21;
                        }
                        i17 = i10 + i23;
                        i18 = i17 + min;
                    }
                    int descent = (i13 + ((int) (((paint2.descent() + paint2.ascent()) / 2.0f) + 0.5f))) - (min / 2);
                    int i28 = min + descent;
                    if (i24 != 0 && i24 != 1) {
                        rect.set(i17, descent, i18, i28);
                        paint2.setStyle(Paint.Style.FILL);
                        canvas.drawRect(rect, paint2);
                    }
                    RectF rectF = this.c;
                    rectF.set(i17, descent, i18, i28);
                    if (i24 == 0) {
                        style = Paint.Style.FILL;
                    } else {
                        style = Paint.Style.STROKE;
                    }
                    paint2.setStyle(style);
                    canvas.drawOval(rectF, paint2);
                } finally {
                    canvas.restoreToCount(save);
                }
            }
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z10) {
        return this.f22020a.f19736a;
    }
}

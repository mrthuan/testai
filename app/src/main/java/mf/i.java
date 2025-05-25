package mf;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
import kf.p;

/* compiled from: OrderedListItemSpan.java */
/* loaded from: classes.dex */
public final class i implements LeadingMarginSpan {

    /* renamed from: a  reason: collision with root package name */
    public final p f22034a;

    /* renamed from: b  reason: collision with root package name */
    public final String f22035b;
    public final Paint c = h.c;

    /* renamed from: d  reason: collision with root package name */
    public int f22036d;

    public i(p pVar, String str) {
        this.f22034a = pVar;
        this.f22035b = str;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i10, int i11, int i12, int i13, int i14, CharSequence charSequence, int i15, int i16, boolean z10, Layout layout) {
        boolean z11;
        int i17;
        if (z10) {
            if ((charSequence instanceof Spanned) && ((Spanned) charSequence).getSpanStart(this) == i15) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                Paint paint2 = this.c;
                paint2.set(paint);
                p pVar = this.f22034a;
                pVar.getClass();
                paint2.setColor(paint2.getColor());
                int i18 = pVar.c;
                if (i18 != 0) {
                    paint2.setStrokeWidth(i18);
                }
                String str = this.f22035b;
                int measureText = (int) (paint2.measureText(str) + 0.5f);
                int i19 = pVar.f19736a;
                if (measureText > i19) {
                    this.f22036d = measureText;
                    i19 = measureText;
                } else {
                    this.f22036d = 0;
                }
                if (i11 > 0) {
                    i17 = ((i19 * i11) + i10) - measureText;
                } else {
                    i17 = (i19 - measureText) + (i11 * i19) + i10;
                }
                canvas.drawText(str, i17, i13, paint2);
            }
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z10) {
        return Math.max(this.f22036d, this.f22034a.f19736a);
    }
}

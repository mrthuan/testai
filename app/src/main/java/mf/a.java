package mf;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import kf.p;

/* compiled from: BlockQuoteSpan.java */
/* loaded from: classes.dex */
public final class a implements LeadingMarginSpan {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f22016a;

    /* renamed from: b  reason: collision with root package name */
    public final p f22017b;
    public final Rect c;

    /* renamed from: d  reason: collision with root package name */
    public final Paint f22018d;

    public a(p pVar, int i10) {
        this.f22016a = i10;
        if (i10 != 1) {
            this.c = h.f22032a;
            this.f22018d = h.c;
            this.f22017b = pVar;
            return;
        }
        this.c = h.f22032a;
        this.f22018d = h.c;
        this.f22017b = pVar;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i10, int i11, int i12, int i13, int i14, CharSequence charSequence, int i15, int i16, boolean z10, Layout layout) {
        int i17;
        Paint paint2 = this.f22018d;
        int i18 = this.f22016a;
        Rect rect = this.c;
        p pVar = this.f22017b;
        switch (i18) {
            case 0:
                int i19 = pVar.f19737b;
                if (i19 == 0) {
                    i19 = (int) ((pVar.f19736a * 0.25f) + 0.5f);
                }
                paint2.set(paint);
                paint2.setStyle(Paint.Style.FILL);
                paint2.setColor((paint2.getColor() & 16777215) | 419430400);
                int i20 = i11 * i19;
                int i21 = i10 + i20;
                int i22 = i20 + i21;
                rect.set(Math.min(i21, i22), i12, Math.max(i21, i22), i14);
                canvas.drawRect(rect, paint2);
                return;
            default:
                int i23 = ((i14 - i12) / 2) + i12;
                paint2.set(paint);
                pVar.getClass();
                paint2.setColor((paint2.getColor() & 16777215) | 419430400);
                paint2.setStyle(Paint.Style.FILL);
                int i24 = pVar.f19742h;
                if (i24 >= 0) {
                    paint2.setStrokeWidth(i24);
                }
                int strokeWidth = (int) ((((int) (paint2.getStrokeWidth() + 0.5f)) / 2.0f) + 0.5f);
                if (i11 > 0) {
                    i17 = canvas.getWidth();
                } else {
                    i17 = i10;
                    i10 -= canvas.getWidth();
                }
                rect.set(i10, i23 - strokeWidth, i17, i23 + strokeWidth);
                canvas.drawRect(rect, paint2);
                return;
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z10) {
        switch (this.f22016a) {
            case 0:
                return this.f22017b.f19736a;
            default:
                return 0;
        }
    }
}

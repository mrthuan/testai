package xi;

import android.graphics.Paint;
import android.graphics.Point;
import lib.zj.office.java.awt.Rectangle;

/* compiled from: AbstractExtTextOut.java */
/* loaded from: classes3.dex */
public abstract class d extends wi.e {
    public final Rectangle c;

    /* renamed from: d  reason: collision with root package name */
    public final int f31667d;

    /* renamed from: e  reason: collision with root package name */
    public final float f31668e;

    /* renamed from: f  reason: collision with root package name */
    public final float f31669f;

    public d(int i10, Rectangle rectangle, int i11, float f10, float f11) {
        super(i10);
        this.c = rectangle;
        this.f31667d = i11;
        this.f31668e = f10;
        this.f31669f = f11;
    }

    @Override // wi.e, xi.l0
    public final void a(wi.d dVar) {
        f2 d10 = d();
        String str = d10.f31703b;
        Point point = d10.f31702a;
        float f10 = point.x;
        float f11 = point.y;
        Paint paint = dVar.f31240k;
        Paint.Style style = paint.getStyle();
        paint.setColor(dVar.f31242m.getRGB());
        paint.setStrokeWidth(0.0f);
        if (2700 == dVar.f31255z) {
            for (int i10 = 0; i10 < str.length(); i10++) {
                dVar.f31236g.drawText(String.valueOf(str.charAt(i10)), f10, (paint.getTextSize() * i10) + f11, paint);
            }
        } else {
            if (dVar.f31241l == 0) {
                f11 += paint.getTextSize() - 3.0f;
            }
            dVar.f31236g.drawText(str, f10, f11, paint);
        }
        paint.setStyle(style);
    }

    public abstract f2 d();

    @Override // wi.e
    public final String toString() {
        return super.toString() + "\n  bounds: " + this.c + "\n  mode: " + this.f31667d + "\n  xScale: " + this.f31668e + "\n  yScale: " + this.f31669f + "\n" + d().toString();
    }
}

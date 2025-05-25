package gj;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import lib.zj.office.java.awt.Rectangle;

/* compiled from: TableView.java */
/* loaded from: classes3.dex */
public final class p extends l {
    @Override // gj.l, ai.a, ai.e
    public final Rectangle A(long j10, Rectangle rectangle, boolean z10) {
        ai.e u7 = u(j10, 10, z10);
        if (u7 != null) {
            u7.A(j10, rectangle, z10);
        }
        rectangle.f20688x += this.f480b;
        rectangle.f20689y += this.c;
        return rectangle;
    }

    @Override // gj.l, ai.a, ai.e
    public final long C(int i10, int i11, boolean z10) {
        int i12 = i10 - this.f480b;
        int i13 = i11 - this.c;
        ai.e eVar = this.f490m;
        if (eVar != null && i13 > eVar.getY()) {
            while (eVar != null) {
                if (i13 >= eVar.getY()) {
                    if (i13 < eVar.e((byte) 1) + eVar.getY()) {
                        break;
                    }
                }
                eVar = eVar.o();
            }
        }
        if (eVar == null) {
            eVar = this.f490m;
        }
        if (eVar != null) {
            return eVar.C(i12, i13, z10);
        }
        return -1L;
    }

    @Override // gj.l, ai.a, ai.e
    public final void dispose() {
        super.dispose();
    }

    @Override // gj.l, ai.a, ai.e
    public final void g(Canvas canvas, int i10, int i11, float f10) {
        float f11;
        float f12;
        float f13;
        Rect rect;
        float f14;
        c cVar;
        boolean z10;
        float f15;
        float f16;
        float f17;
        int i12;
        float f18;
        float f19;
        p pVar = this;
        float f20 = (pVar.f480b * f10) + i10;
        float f21 = (pVar.c * f10) + i11;
        Rect clipBounds = canvas.getClipBounds();
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        sg.d.b(paint);
        m mVar = (m) pVar.f490m;
        while (mVar != null) {
            float f22 = (mVar.f480b * f10) + f20;
            float f23 = (mVar.c * f10) + f21;
            float f24 = mVar.f482e * f10;
            float f25 = 0.0f;
            c cVar2 = (c) mVar.f490m;
            float f26 = 0.0f;
            while (true) {
                boolean z11 = true;
                while (cVar2 != null) {
                    int i13 = (int) f22;
                    f11 = f21;
                    int i14 = (int) f23;
                    if (cVar2.h(clipBounds, i13, i14, f10)) {
                        if (!cVar2.f17815q || cVar2.f17814p) {
                            float f27 = (cVar2.c * f10) + f23;
                            rect = clipBounds;
                            if (z11) {
                                f15 = (cVar2.f480b * f10) + f22;
                                z10 = false;
                            } else {
                                z10 = z11;
                                f15 = f26 + f25;
                            }
                            float e10 = cVar2.e((byte) 0) * f10;
                            float max = Math.max(cVar2.f482e * f10, f24);
                            float f28 = f15 + e10;
                            if (cVar2.G() && Math.abs(f28 - ((pVar.f481d * f10) + f20)) <= 10.0f) {
                                f28 = (pVar.f481d * f10) + f20;
                            }
                            float f29 = f28;
                            if (cVar2.f17817s != -1) {
                                int color = paint.getColor();
                                paint.setColor(cVar2.f17817s);
                                paint.setStyle(Paint.Style.FILL);
                                f16 = f29;
                                f17 = f15;
                                f13 = f20;
                                i12 = i13;
                                f18 = e10;
                                f19 = f27;
                                f14 = f22;
                                cVar = cVar2;
                                f12 = f24;
                                canvas.drawRect(f15, f27, f16, f27 + max, paint);
                                paint.setColor(color);
                            } else {
                                f16 = f29;
                                f17 = f15;
                                f12 = f24;
                                f13 = f20;
                                f14 = f22;
                                i12 = i13;
                                cVar = cVar2;
                                f18 = e10;
                                f19 = f27;
                            }
                            paint.setStyle(Paint.Style.STROKE);
                            paint.setColor(cVar.f17821w);
                            float f30 = f19 + max;
                            canvas.drawLine(f17, f30, f16, f30, paint);
                            paint.setColor(cVar.f17818t);
                            canvas.drawLine(f17, f19, f16, f19, paint);
                            paint.setColor(cVar.f17820v);
                            canvas.drawLine(f17, f19, f17, f30, paint);
                            paint.setColor(cVar.f17819u);
                            float f31 = f16;
                            canvas.drawLine(f31, f19, f16, f30, paint);
                            canvas.save();
                            f26 = f17;
                            canvas.clipRect(f26, f19, f31, f30);
                            cVar.g(canvas, i12, i14, f10);
                            canvas.restore();
                            f25 = f18;
                            z11 = z10;
                        }
                    } else {
                        f12 = f24;
                        f13 = f20;
                        rect = clipBounds;
                        f14 = f22;
                        cVar = cVar2;
                    }
                    cVar2 = (c) cVar.f492o;
                    pVar = this;
                    f21 = f11;
                    clipBounds = rect;
                    f24 = f12;
                    f20 = f13;
                    f22 = f14;
                }
                cVar2 = (c) cVar2.f492o;
                f21 = f11;
            }
            mVar = (m) mVar.f492o;
            pVar = this;
            f21 = f21;
            clipBounds = clipBounds;
            f20 = f20;
        }
    }

    @Override // gj.l, ai.e
    public final short getType() {
        return (short) 9;
    }
}

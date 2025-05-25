package gj;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import lib.zj.office.PathHolder;

/* compiled from: EncloseCharacterView.java */
/* loaded from: classes3.dex */
public final class d extends f {

    /* renamed from: x  reason: collision with root package name */
    public Paint f17822x;

    /* renamed from: y  reason: collision with root package name */
    public PathHolder f17823y;

    @Override // gj.f
    public final void L(zh.h hVar, zh.h hVar2) {
        super.L(hVar, hVar2);
        Paint paint = new Paint();
        this.f17822x = paint;
        paint.setColor(this.f17828q.f495d);
        this.f17822x.setStyle(Paint.Style.STROKE);
        this.f17822x.setAntiAlias(true);
        sg.d.b(this.f17822x);
        this.f17823y = new PathHolder();
    }

    @Override // gj.f, ai.a, ai.e
    public final void dispose() {
        super.dispose();
    }

    @Override // gj.f, ai.a, ai.e
    public final void g(Canvas canvas, int i10, int i11, float f10) {
        super.g(canvas, i10, i11, f10);
        synchronized (this) {
            int i12 = ((int) (this.f480b * f10)) + i10;
            int i13 = ((int) (this.c * f10)) + i11;
            int i14 = (int) (this.f481d * f10);
            int i15 = (int) (this.f482e * f10);
            byte b10 = this.f17828q.f506o;
            if (b10 == 0) {
                canvas.drawArc(new RectF(i12, i13, i12 + i14, i13 + i15), 0.0f, 360.0f, false, this.f17822x);
            } else if (b10 == 1) {
                canvas.drawRect(i12, i13, i12 + i14, i13 + i15, this.f17822x);
            } else if (b10 == 2) {
                this.f17823y.reset();
                this.f17823y.moveTo((i14 / 2) + i12, i13);
                float f11 = i13 + i15;
                this.f17823y.lineTo(i12, f11);
                this.f17823y.lineTo(i12 + i14, f11);
                this.f17823y.close();
                canvas.drawPath(this.f17823y, this.f17822x);
            } else if (b10 == 3) {
                this.f17823y.reset();
                this.f17823y.moveTo((i14 / 2) + i12, i13);
                this.f17823y.lineTo(i12, (i15 / 2) + i13);
                this.f17823y.lineTo((i14 / 2) + i12, i13 + i15);
                this.f17823y.lineTo(i12 + i14, i13 + (i15 / 2));
                this.f17823y.close();
                canvas.drawPath(this.f17823y, this.f17822x);
            }
        }
    }

    @Override // gj.f, ai.e
    public final short getType() {
        return (short) 14;
    }
}

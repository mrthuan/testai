package a9;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.google.android.material.progressindicator.CircularProgressIndicatorSpec;
import pdf.pdfreader.viewer.editor.free.utils.t0;

/* compiled from: CircularDrawingDelegate.java */
/* loaded from: classes2.dex */
public final class c extends k<CircularProgressIndicatorSpec> {
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public float f402d;

    /* renamed from: e  reason: collision with root package name */
    public float f403e;

    /* renamed from: f  reason: collision with root package name */
    public float f404f;

    public c(CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        super(circularProgressIndicatorSpec);
        this.c = 1;
    }

    @Override // a9.k
    public final void a(Canvas canvas, Rect rect, float f10) {
        int i10;
        float width = rect.width() / f();
        float height = rect.height() / f();
        S s4 = this.f438a;
        float f11 = (((CircularProgressIndicatorSpec) s4).f12779g / 2.0f) + ((CircularProgressIndicatorSpec) s4).f12780h;
        canvas.translate((f11 * width) + rect.left, (f11 * height) + rect.top);
        canvas.scale(width, height);
        canvas.rotate(-90.0f);
        float f12 = -f11;
        canvas.clipRect(f12, f12, f11, f11);
        if (((CircularProgressIndicatorSpec) s4).f12781i == 0) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        this.c = i10;
        this.f402d = ((CircularProgressIndicatorSpec) s4).f397a * f10;
        this.f403e = ((CircularProgressIndicatorSpec) s4).f398b * f10;
        this.f404f = (((CircularProgressIndicatorSpec) s4).f12779g - ((CircularProgressIndicatorSpec) s4).f397a) / 2.0f;
        if ((this.f439b.d() && ((CircularProgressIndicatorSpec) s4).f400e == 2) || (this.f439b.c() && ((CircularProgressIndicatorSpec) s4).f401f == 1)) {
            this.f404f = (((1.0f - f10) * ((CircularProgressIndicatorSpec) s4).f397a) / 2.0f) + this.f404f;
        } else if ((this.f439b.d() && ((CircularProgressIndicatorSpec) s4).f400e == 1) || (this.f439b.c() && ((CircularProgressIndicatorSpec) s4).f401f == 2)) {
            this.f404f -= ((1.0f - f10) * ((CircularProgressIndicatorSpec) s4).f397a) / 2.0f;
        }
    }

    @Override // a9.k
    public final void b(int i10, Paint paint, Canvas canvas, float f10, float f11) {
        if (f10 == f11) {
            return;
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(i10);
        paint.setStrokeWidth(this.f402d);
        float f12 = this.c;
        float f13 = f10 * 360.0f * f12;
        if (f11 < f10) {
            f11 += 1.0f;
        }
        float f14 = (f11 - f10) * 360.0f * f12;
        float f15 = this.f404f;
        float f16 = -f15;
        canvas.drawArc(new RectF(f16, f16, f15, f15), f13, f14, false, paint);
        if (this.f403e > 0.0f && Math.abs(f14) < 360.0f) {
            paint.setStyle(Paint.Style.FILL);
            float f17 = this.f402d;
            float f18 = this.f403e;
            canvas.save();
            canvas.rotate(f13);
            float f19 = this.f404f;
            float f20 = f17 / 2.0f;
            canvas.drawRoundRect(new RectF(f19 - f20, f18, f19 + f20, -f18), f18, f18, paint);
            canvas.restore();
            float f21 = this.f402d;
            float f22 = this.f403e;
            canvas.save();
            canvas.rotate(f13 + f14);
            float f23 = this.f404f;
            float f24 = f21 / 2.0f;
            canvas.drawRoundRect(new RectF(f23 - f24, f22, f23 + f24, -f22), f22, f22, paint);
            canvas.restore();
        }
    }

    @Override // a9.k
    public final void c(Canvas canvas, Paint paint) {
        int x4 = t0.x(((CircularProgressIndicatorSpec) this.f438a).f399d, this.f439b.f437j);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(x4);
        paint.setStrokeWidth(this.f402d);
        float f10 = this.f404f;
        canvas.drawArc(new RectF(-f10, -f10, f10, f10), 0.0f, 360.0f, false, paint);
    }

    @Override // a9.k
    public final int d() {
        return f();
    }

    @Override // a9.k
    public final int e() {
        return f();
    }

    public final int f() {
        S s4 = this.f438a;
        return (((CircularProgressIndicatorSpec) s4).f12780h * 2) + ((CircularProgressIndicatorSpec) s4).f12779g;
    }
}

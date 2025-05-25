package a9;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import com.google.android.material.progressindicator.LinearProgressIndicatorSpec;
import pdf.pdfreader.viewer.editor.free.utils.t0;

/* compiled from: LinearDrawingDelegate.java */
/* loaded from: classes2.dex */
public final class m extends k<LinearProgressIndicatorSpec> {
    public float c;

    /* renamed from: d  reason: collision with root package name */
    public float f442d;

    /* renamed from: e  reason: collision with root package name */
    public float f443e;

    /* renamed from: f  reason: collision with root package name */
    public Path f444f;

    public m(LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(linearProgressIndicatorSpec);
        this.c = 300.0f;
    }

    @Override // a9.k
    public final void a(Canvas canvas, Rect rect, float f10) {
        this.c = rect.width();
        S s4 = this.f438a;
        float f11 = ((LinearProgressIndicatorSpec) s4).f397a;
        canvas.translate((rect.width() / 2.0f) + rect.left, Math.max(0.0f, (rect.height() - ((LinearProgressIndicatorSpec) s4).f397a) / 2.0f) + (rect.height() / 2.0f) + rect.top);
        if (((LinearProgressIndicatorSpec) s4).f12785i) {
            canvas.scale(-1.0f, 1.0f);
        }
        if ((this.f439b.d() && ((LinearProgressIndicatorSpec) s4).f400e == 1) || (this.f439b.c() && ((LinearProgressIndicatorSpec) s4).f401f == 2)) {
            canvas.scale(1.0f, -1.0f);
        }
        if (this.f439b.d() || this.f439b.c()) {
            canvas.translate(0.0f, ((f10 - 1.0f) * ((LinearProgressIndicatorSpec) s4).f397a) / 2.0f);
        }
        float f12 = this.c;
        canvas.clipRect((-f12) / 2.0f, (-f11) / 2.0f, f12 / 2.0f, f11 / 2.0f);
        this.f442d = ((LinearProgressIndicatorSpec) s4).f397a * f10;
        this.f443e = ((LinearProgressIndicatorSpec) s4).f398b * f10;
    }

    @Override // a9.k
    public final void b(int i10, Paint paint, Canvas canvas, float f10, float f11) {
        if (f10 == f11) {
            return;
        }
        float f12 = this.c;
        float f13 = (-f12) / 2.0f;
        float f14 = (f11 * f12) + f13;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(i10);
        canvas.save();
        canvas.clipPath(this.f444f);
        float f15 = this.f442d;
        RectF rectF = new RectF(((f10 * f12) + f13) - (this.f443e * 2.0f), (-f15) / 2.0f, f14, f15 / 2.0f);
        float f16 = this.f443e;
        canvas.drawRoundRect(rectF, f16, f16, paint);
        canvas.restore();
    }

    @Override // a9.k
    public final void c(Canvas canvas, Paint paint) {
        int x4 = t0.x(((LinearProgressIndicatorSpec) this.f438a).f399d, this.f439b.f437j);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(x4);
        Path path = new Path();
        this.f444f = path;
        float f10 = this.c;
        float f11 = this.f442d;
        RectF rectF = new RectF((-f10) / 2.0f, (-f11) / 2.0f, f10 / 2.0f, f11 / 2.0f);
        float f12 = this.f443e;
        path.addRoundRect(rectF, f12, f12, Path.Direction.CCW);
        canvas.drawPath(this.f444f, paint);
    }

    @Override // a9.k
    public final int d() {
        return ((LinearProgressIndicatorSpec) this.f438a).f397a;
    }

    @Override // a9.k
    public final int e() {
        return -1;
    }
}

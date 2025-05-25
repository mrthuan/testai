package c4;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import c4.v;

/* compiled from: TransformationUtils.java */
/* loaded from: classes.dex */
public final class u implements v.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ float f5548a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ float f5549b;
    public final /* synthetic */ float c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ float f5550d;

    public u(float f10, float f11, float f12, float f13) {
        this.f5548a = f10;
        this.f5549b = f11;
        this.c = f12;
        this.f5550d = f13;
    }

    @Override // c4.v.a
    public final void a(Canvas canvas, RectF rectF, Paint paint) {
        Path path = new Path();
        float f10 = this.f5548a;
        float f11 = this.f5549b;
        float f12 = this.c;
        float f13 = this.f5550d;
        path.addRoundRect(rectF, new float[]{f10, f10, f11, f11, f12, f12, f13, f13}, Path.Direction.CW);
        canvas.drawPath(path, paint);
    }
}

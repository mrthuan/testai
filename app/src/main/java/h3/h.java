package h3;

import android.graphics.Path;
import android.graphics.PointF;
import p3.g;

/* compiled from: PathKeyframe.java */
/* loaded from: classes.dex */
public final class h extends q3.a<PointF> {

    /* renamed from: o  reason: collision with root package name */
    public Path f17975o;

    /* renamed from: p  reason: collision with root package name */
    public final q3.a<PointF> f17976p;

    public h(e3.e eVar, q3.a<PointF> aVar) {
        super(eVar, aVar.f29065b, aVar.c, aVar.f29066d, aVar.f29067e, aVar.f29068f);
        this.f17976p = aVar;
        d();
    }

    public final void d() {
        boolean z10;
        T t4 = this.c;
        T t10 = this.f29065b;
        if (t4 != 0 && t10 != 0 && ((PointF) t10).equals(((PointF) t4).x, ((PointF) t4).y)) {
            z10 = true;
        } else {
            z10 = false;
        }
        T t11 = this.c;
        if (t11 != 0 && !z10) {
            PointF pointF = (PointF) t10;
            PointF pointF2 = (PointF) t11;
            q3.a<PointF> aVar = this.f17976p;
            PointF pointF3 = aVar.f29075m;
            PointF pointF4 = aVar.f29076n;
            g.a aVar2 = p3.g.f23679a;
            Path path = new Path();
            path.moveTo(pointF.x, pointF.y);
            if (pointF3 != null && pointF4 != null && (pointF3.length() != 0.0f || pointF4.length() != 0.0f)) {
                float f10 = pointF.x;
                float f11 = pointF2.x;
                float f12 = pointF2.y;
                path.cubicTo(pointF3.x + f10, pointF.y + pointF3.y, f11 + pointF4.x, f12 + pointF4.y, f11, f12);
            } else {
                path.lineTo(pointF2.x, pointF2.y);
            }
            this.f17975o = path;
        }
    }
}

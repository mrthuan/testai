package h3;

import android.graphics.PointF;
import androidx.activity.r;
import java.util.List;

/* compiled from: PointKeyframeAnimation.java */
/* loaded from: classes.dex */
public final class j extends f<PointF> {

    /* renamed from: i  reason: collision with root package name */
    public final PointF f17981i;

    public j(List<q3.a<PointF>> list) {
        super(list);
        this.f17981i = new PointF();
    }

    @Override // h3.a
    public final Object g(q3.a aVar, float f10) {
        T t4;
        T t10 = aVar.f29065b;
        if (t10 != 0 && (t4 = aVar.c) != 0) {
            PointF pointF = (PointF) t10;
            PointF pointF2 = (PointF) t4;
            n3.a aVar2 = this.f17963e;
            if (aVar2 != null) {
                aVar.f29068f.floatValue();
                e();
                PointF pointF3 = (PointF) aVar2.e(pointF, pointF2);
                if (pointF3 != null) {
                    return pointF3;
                }
            }
            PointF pointF4 = this.f17981i;
            float f11 = pointF.x;
            float l10 = r.l(pointF2.x, f11, f10, f11);
            float f12 = pointF.y;
            pointF4.set(l10, ((pointF2.y - f12) * f10) + f12);
            return pointF4;
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}

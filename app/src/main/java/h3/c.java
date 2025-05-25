package h3;

import android.graphics.PointF;
import androidx.activity.r;

/* compiled from: FloatKeyframeAnimation.java */
/* loaded from: classes.dex */
public final class c extends f<Float> {
    @Override // h3.a
    public final Object g(q3.a aVar, float f10) {
        return Float.valueOf(l(aVar, f10));
    }

    public final float k() {
        return l(b(), d());
    }

    public final float l(q3.a<Float> aVar, float f10) {
        if (aVar.f29065b != null && aVar.c != null) {
            n3.a aVar2 = this.f17963e;
            Float f11 = aVar.f29065b;
            if (aVar2 != null) {
                aVar.f29068f.floatValue();
                Float f12 = aVar.c;
                e();
                Float f13 = (Float) aVar2.e(f11, f12);
                if (f13 != null) {
                    return f13.floatValue();
                }
            }
            if (aVar.f29069g == -3987645.8f) {
                aVar.f29069g = f11.floatValue();
            }
            float f14 = aVar.f29069g;
            if (aVar.f29070h == -3987645.8f) {
                aVar.f29070h = aVar.c.floatValue();
            }
            float f15 = aVar.f29070h;
            PointF pointF = p3.f.f23678a;
            return r.l(f15, f14, f10, f14);
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}

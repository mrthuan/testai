package h3;

import android.graphics.PointF;

/* compiled from: IntegerKeyframeAnimation.java */
/* loaded from: classes.dex */
public final class e extends f<Integer> {
    @Override // h3.a
    public final Object g(q3.a aVar, float f10) {
        return Integer.valueOf(k(aVar, f10));
    }

    public final int k(q3.a<Integer> aVar, float f10) {
        if (aVar.f29065b != null && aVar.c != null) {
            n3.a aVar2 = this.f17963e;
            Integer num = aVar.f29065b;
            if (aVar2 != null) {
                aVar.f29068f.floatValue();
                Integer num2 = aVar.c;
                e();
                Integer num3 = (Integer) aVar2.e(num, num2);
                if (num3 != null) {
                    return num3.intValue();
                }
            }
            if (aVar.f29071i == 784923401) {
                aVar.f29071i = num.intValue();
            }
            int i10 = aVar.f29071i;
            if (aVar.f29072j == 784923401) {
                aVar.f29072j = aVar.c.intValue();
            }
            int i11 = aVar.f29072j;
            PointF pointF = p3.f.f23678a;
            return (int) ((f10 * (i11 - i10)) + i10);
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}

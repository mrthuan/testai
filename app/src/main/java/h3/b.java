package h3;

/* compiled from: ColorKeyframeAnimation.java */
/* loaded from: classes.dex */
public final class b extends f<Integer> {
    @Override // h3.a
    public final Object g(q3.a aVar, float f10) {
        return Integer.valueOf(k(aVar, f10));
    }

    public final int k(q3.a<Integer> aVar, float f10) {
        Integer num = aVar.f29065b;
        if (num != null && aVar.c != null) {
            int intValue = num.intValue();
            int intValue2 = aVar.c.intValue();
            n3.a aVar2 = this.f17963e;
            if (aVar2 != null) {
                aVar.f29068f.floatValue();
                Integer valueOf = Integer.valueOf(intValue);
                Integer valueOf2 = Integer.valueOf(intValue2);
                e();
                Integer num2 = (Integer) aVar2.e(valueOf, valueOf2);
                if (num2 != null) {
                    return num2.intValue();
                }
            }
            return ea.a.q(p3.f.b(f10, 0.0f, 1.0f), intValue, intValue2);
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}

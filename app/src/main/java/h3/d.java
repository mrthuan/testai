package h3;

import android.graphics.PointF;
import androidx.activity.r;
import java.util.List;

/* compiled from: GradientColorKeyframeAnimation.java */
/* loaded from: classes.dex */
public final class d extends f<l3.c> {

    /* renamed from: i  reason: collision with root package name */
    public final l3.c f17972i;

    public d(List<q3.a<l3.c>> list) {
        super(list);
        l3.c cVar = list.get(0).f29065b;
        int length = cVar != null ? cVar.f20451b.length : 0;
        this.f17972i = new l3.c(new float[length], new int[length]);
    }

    @Override // h3.a
    public final Object g(q3.a aVar, float f10) {
        l3.c cVar = (l3.c) aVar.f29065b;
        l3.c cVar2 = (l3.c) aVar.c;
        l3.c cVar3 = this.f17972i;
        cVar3.getClass();
        int[] iArr = cVar.f20451b;
        int length = iArr.length;
        int[] iArr2 = cVar2.f20451b;
        if (length == iArr2.length) {
            for (int i10 = 0; i10 < iArr.length; i10++) {
                float f11 = cVar.f20450a[i10];
                float f12 = cVar2.f20450a[i10];
                PointF pointF = p3.f.f23678a;
                cVar3.f20450a[i10] = r.l(f12, f11, f10, f11);
                cVar3.f20451b[i10] = ea.a.q(f10, iArr[i10], iArr2[i10]);
            }
            return cVar3;
        }
        StringBuilder sb2 = new StringBuilder("Cannot interpolate between gradients. Lengths vary (");
        sb2.append(iArr.length);
        sb2.append(" vs ");
        throw new IllegalArgumentException(a6.h.g(sb2, iArr2.length, ")"));
    }
}

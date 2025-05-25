package h3;

import android.graphics.PointF;
import androidx.activity.r;
import java.util.List;

/* compiled from: ScaleKeyframeAnimation.java */
/* loaded from: classes.dex */
public final class k extends f<q3.c> {

    /* renamed from: i  reason: collision with root package name */
    public final q3.c f17982i;

    public k(List<q3.a<q3.c>> list) {
        super(list);
        this.f17982i = new q3.c();
    }

    @Override // h3.a
    public final Object g(q3.a aVar, float f10) {
        T t4;
        T t10 = aVar.f29065b;
        if (t10 != 0 && (t4 = aVar.c) != 0) {
            q3.c cVar = (q3.c) t10;
            q3.c cVar2 = (q3.c) t4;
            n3.a aVar2 = this.f17963e;
            if (aVar2 != null) {
                aVar.f29068f.floatValue();
                e();
                q3.c cVar3 = (q3.c) aVar2.e(cVar, cVar2);
                if (cVar3 != null) {
                    return cVar3;
                }
            }
            float f11 = cVar.f29079a;
            float f12 = cVar2.f29079a;
            PointF pointF = p3.f.f23678a;
            float l10 = r.l(f12, f11, f10, f11);
            float f13 = cVar.f29080b;
            float l11 = r.l(cVar2.f29080b, f13, f10, f13);
            q3.c cVar4 = this.f17982i;
            cVar4.f29079a = l10;
            cVar4.f29080b = l11;
            return cVar4;
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}

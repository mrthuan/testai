package h3;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;

/* compiled from: PathKeyframeAnimation.java */
/* loaded from: classes.dex */
public final class i extends f<PointF> {

    /* renamed from: i  reason: collision with root package name */
    public final PointF f17977i;

    /* renamed from: j  reason: collision with root package name */
    public final float[] f17978j;

    /* renamed from: k  reason: collision with root package name */
    public h f17979k;

    /* renamed from: l  reason: collision with root package name */
    public final PathMeasure f17980l;

    public i(List<? extends q3.a<PointF>> list) {
        super(list);
        this.f17977i = new PointF();
        this.f17978j = new float[2];
        this.f17980l = new PathMeasure();
    }

    @Override // h3.a
    public final Object g(q3.a aVar, float f10) {
        h hVar = (h) aVar;
        Path path = hVar.f17975o;
        if (path == null) {
            return (PointF) aVar.f29065b;
        }
        n3.a aVar2 = this.f17963e;
        if (aVar2 != null) {
            hVar.f29068f.floatValue();
            Object obj = hVar.c;
            e();
            PointF pointF = (PointF) aVar2.e(hVar.f29065b, obj);
            if (pointF != null) {
                return pointF;
            }
        }
        h hVar2 = this.f17979k;
        PathMeasure pathMeasure = this.f17980l;
        if (hVar2 != hVar) {
            pathMeasure.setPath(path, false);
            this.f17979k = hVar;
        }
        float[] fArr = this.f17978j;
        pathMeasure.getPosTan(pathMeasure.getLength() * f10, fArr, null);
        PointF pointF2 = this.f17977i;
        pointF2.set(fArr[0], fArr[1]);
        return pointF2;
    }
}

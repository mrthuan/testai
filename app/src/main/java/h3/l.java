package h3;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.activity.r;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ShapeKeyframeAnimation.java */
/* loaded from: classes.dex */
public final class l extends a<l3.g, Path> {

    /* renamed from: i  reason: collision with root package name */
    public final l3.g f17983i;

    /* renamed from: j  reason: collision with root package name */
    public final Path f17984j;

    public l(List<q3.a<l3.g>> list) {
        super(list);
        this.f17983i = new l3.g();
        this.f17984j = new Path();
    }

    @Override // h3.a
    public final Path g(q3.a<l3.g> aVar, float f10) {
        boolean z10;
        l3.g gVar = aVar.f29065b;
        l3.g gVar2 = aVar.c;
        l3.g gVar3 = this.f17983i;
        if (gVar3.f20468b == null) {
            gVar3.f20468b = new PointF();
        }
        if (!gVar.c && !gVar2.c) {
            z10 = false;
        } else {
            z10 = true;
        }
        gVar3.c = z10;
        ArrayList arrayList = gVar.f20467a;
        int size = arrayList.size();
        int size2 = gVar2.f20467a.size();
        ArrayList arrayList2 = gVar2.f20467a;
        if (size != size2) {
            p3.c.b("Curves must have the same number of control points. Shape 1: " + arrayList.size() + "\tShape 2: " + arrayList2.size());
        }
        int min = Math.min(arrayList.size(), arrayList2.size());
        ArrayList arrayList3 = gVar3.f20467a;
        if (arrayList3.size() < min) {
            for (int size3 = arrayList3.size(); size3 < min; size3++) {
                arrayList3.add(new j3.a());
            }
        } else if (arrayList3.size() > min) {
            for (int size4 = arrayList3.size() - 1; size4 >= min; size4--) {
                arrayList3.remove(arrayList3.size() - 1);
            }
        }
        PointF pointF = gVar.f20468b;
        PointF pointF2 = gVar2.f20468b;
        float f11 = pointF.x;
        float f12 = pointF2.x;
        PointF pointF3 = p3.f.f23678a;
        float l10 = r.l(f12, f11, f10, f11);
        float f13 = pointF.y;
        float l11 = r.l(pointF2.y, f13, f10, f13);
        if (gVar3.f20468b == null) {
            gVar3.f20468b = new PointF();
        }
        gVar3.f20468b.set(l10, l11);
        for (int size5 = arrayList3.size() - 1; size5 >= 0; size5--) {
            j3.a aVar2 = (j3.a) arrayList.get(size5);
            j3.a aVar3 = (j3.a) arrayList2.get(size5);
            PointF pointF4 = aVar2.f19024a;
            PointF pointF5 = aVar3.f19024a;
            float f14 = pointF4.x;
            float l12 = r.l(pointF5.x, f14, f10, f14);
            float f15 = pointF4.y;
            ((j3.a) arrayList3.get(size5)).f19024a.set(l12, r.l(pointF5.y, f15, f10, f15));
            PointF pointF6 = aVar2.f19025b;
            float f16 = pointF6.x;
            PointF pointF7 = aVar3.f19025b;
            float l13 = r.l(pointF7.x, f16, f10, f16);
            float f17 = pointF6.y;
            ((j3.a) arrayList3.get(size5)).f19025b.set(l13, r.l(pointF7.y, f17, f10, f17));
            PointF pointF8 = aVar2.c;
            float f18 = pointF8.x;
            PointF pointF9 = aVar3.c;
            float l14 = r.l(pointF9.x, f18, f10, f18);
            float f19 = pointF8.y;
            ((j3.a) arrayList3.get(size5)).c.set(l14, r.l(pointF9.y, f19, f10, f19));
        }
        Path path = this.f17984j;
        path.reset();
        PointF pointF10 = gVar3.f20468b;
        path.moveTo(pointF10.x, pointF10.y);
        PointF pointF11 = p3.f.f23678a;
        pointF11.set(pointF10.x, pointF10.y);
        for (int i10 = 0; i10 < arrayList3.size(); i10++) {
            j3.a aVar4 = (j3.a) arrayList3.get(i10);
            PointF pointF12 = aVar4.f19024a;
            boolean equals = pointF12.equals(pointF11);
            PointF pointF13 = aVar4.f19025b;
            PointF pointF14 = aVar4.c;
            if (equals && pointF13.equals(pointF14)) {
                path.lineTo(pointF14.x, pointF14.y);
            } else {
                path.cubicTo(pointF12.x, pointF12.y, pointF13.x, pointF13.y, pointF14.x, pointF14.y);
            }
            pointF11.set(pointF14.x, pointF14.y);
        }
        if (gVar3.c) {
            path.close();
        }
        return path;
    }
}

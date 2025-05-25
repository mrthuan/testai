package h3;

import android.graphics.PointF;
import h3.a;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: SplitDimensionPathKeyframeAnimation.java */
/* loaded from: classes.dex */
public final class m extends a<PointF, PointF> {

    /* renamed from: i  reason: collision with root package name */
    public final PointF f17985i;

    /* renamed from: j  reason: collision with root package name */
    public final a<Float, Float> f17986j;

    /* renamed from: k  reason: collision with root package name */
    public final a<Float, Float> f17987k;

    public m(c cVar, c cVar2) {
        super(Collections.emptyList());
        this.f17985i = new PointF();
        this.f17986j = cVar;
        this.f17987k = cVar2;
        i(this.f17962d);
    }

    @Override // h3.a
    public final PointF f() {
        return this.f17985i;
    }

    @Override // h3.a
    public final PointF g(q3.a<PointF> aVar, float f10) {
        return this.f17985i;
    }

    @Override // h3.a
    public final void i(float f10) {
        a<Float, Float> aVar = this.f17986j;
        aVar.i(f10);
        a<Float, Float> aVar2 = this.f17987k;
        aVar2.i(f10);
        this.f17985i.set(aVar.f().floatValue(), aVar2.f().floatValue());
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f17960a;
            if (i10 < arrayList.size()) {
                ((a.InterfaceC0242a) arrayList.get(i10)).a();
                i10++;
            } else {
                return;
            }
        }
    }
}

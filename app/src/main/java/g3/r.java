package g3;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import com.airbnb.lottie.model.content.ShapeStroke;

/* compiled from: StrokeContent.java */
/* loaded from: classes.dex */
public final class r extends a {

    /* renamed from: o  reason: collision with root package name */
    public final com.airbnb.lottie.model.layer.a f17611o;

    /* renamed from: p  reason: collision with root package name */
    public final String f17612p;

    /* renamed from: q  reason: collision with root package name */
    public final boolean f17613q;

    /* renamed from: r  reason: collision with root package name */
    public final h3.f f17614r;

    /* renamed from: s  reason: collision with root package name */
    public h3.p f17615s;

    public r(e3.k kVar, com.airbnb.lottie.model.layer.a aVar, ShapeStroke shapeStroke) {
        super(kVar, aVar, shapeStroke.f6076g.toPaintCap(), shapeStroke.f6077h.toPaintJoin(), shapeStroke.f6078i, shapeStroke.f6074e, shapeStroke.f6075f, shapeStroke.c, shapeStroke.f6072b);
        this.f17611o = aVar;
        this.f17612p = shapeStroke.f6071a;
        this.f17613q = shapeStroke.f6079j;
        h3.a a10 = shapeStroke.f6073d.a();
        this.f17614r = (h3.f) a10;
        a10.a(this);
        aVar.e(a10);
    }

    @Override // g3.a, j3.e
    public final void c(n3.a aVar, Object obj) {
        super.c(aVar, obj);
        Integer num = e3.o.f16415b;
        h3.f fVar = this.f17614r;
        if (obj == num) {
            fVar.j(aVar);
        } else if (obj == e3.o.C) {
            h3.p pVar = this.f17615s;
            com.airbnb.lottie.model.layer.a aVar2 = this.f17611o;
            if (pVar != null) {
                aVar2.m(pVar);
            }
            if (aVar == null) {
                this.f17615s = null;
                return;
            }
            h3.p pVar2 = new h3.p(aVar, null);
            this.f17615s = pVar2;
            pVar2.a(this);
            aVar2.e(fVar);
        }
    }

    @Override // g3.a, g3.e
    public final void f(Canvas canvas, Matrix matrix, int i10) {
        if (this.f17613q) {
            return;
        }
        h3.b bVar = (h3.b) this.f17614r;
        int k10 = bVar.k(bVar.b(), bVar.d());
        f3.a aVar = this.f17505i;
        aVar.setColor(k10);
        h3.p pVar = this.f17615s;
        if (pVar != null) {
            aVar.setColorFilter((ColorFilter) pVar.f());
        }
        super.f(canvas, matrix, i10);
    }

    @Override // g3.c
    public final String getName() {
        return this.f17612p;
    }
}

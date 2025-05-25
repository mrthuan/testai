package g3;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import h3.a;
import java.util.ArrayList;
import java.util.List;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;

/* compiled from: FillContent.java */
/* loaded from: classes.dex */
public final class g implements e, a.InterfaceC0242a, k {

    /* renamed from: a  reason: collision with root package name */
    public final Path f17532a;

    /* renamed from: b  reason: collision with root package name */
    public final f3.a f17533b;
    public final com.airbnb.lottie.model.layer.a c;

    /* renamed from: d  reason: collision with root package name */
    public final String f17534d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f17535e;

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList f17536f;

    /* renamed from: g  reason: collision with root package name */
    public final h3.f f17537g;

    /* renamed from: h  reason: collision with root package name */
    public final h3.e f17538h;

    /* renamed from: i  reason: collision with root package name */
    public h3.p f17539i;

    /* renamed from: j  reason: collision with root package name */
    public final e3.k f17540j;

    public g(e3.k kVar, com.airbnb.lottie.model.layer.a aVar, l3.h hVar) {
        k3.d dVar;
        Path path = new Path();
        this.f17532a = path;
        this.f17533b = new f3.a(1);
        this.f17536f = new ArrayList();
        this.c = aVar;
        this.f17534d = hVar.c;
        this.f17535e = hVar.f20473f;
        this.f17540j = kVar;
        k3.m mVar = hVar.f20471d;
        if (mVar != null && (dVar = hVar.f20472e) != null) {
            path.setFillType(hVar.f20470b);
            h3.a a10 = mVar.a();
            this.f17537g = (h3.f) a10;
            a10.a(this);
            aVar.e(a10);
            h3.a<Integer, Integer> a11 = dVar.a();
            this.f17538h = (h3.e) a11;
            a11.a(this);
            aVar.e(a11);
            return;
        }
        this.f17537g = null;
        this.f17538h = null;
    }

    @Override // h3.a.InterfaceC0242a
    public final void a() {
        this.f17540j.invalidateSelf();
    }

    @Override // g3.c
    public final void b(List<c> list, List<c> list2) {
        for (int i10 = 0; i10 < list2.size(); i10++) {
            c cVar = list2.get(i10);
            if (cVar instanceof m) {
                this.f17536f.add((m) cVar);
            }
        }
    }

    @Override // j3.e
    public final void c(n3.a aVar, Object obj) {
        if (obj == e3.o.f16414a) {
            this.f17537g.j(aVar);
        } else if (obj == e3.o.f16416d) {
            this.f17538h.j(aVar);
        } else if (obj == e3.o.C) {
            h3.p pVar = this.f17539i;
            com.airbnb.lottie.model.layer.a aVar2 = this.c;
            if (pVar != null) {
                aVar2.m(pVar);
            }
            if (aVar == null) {
                this.f17539i = null;
                return;
            }
            h3.p pVar2 = new h3.p(aVar, null);
            this.f17539i = pVar2;
            pVar2.a(this);
            aVar2.e(this.f17539i);
        }
    }

    @Override // g3.e
    public final void d(RectF rectF, Matrix matrix, boolean z10) {
        Path path = this.f17532a;
        path.reset();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f17536f;
            if (i10 < arrayList.size()) {
                path.addPath(((m) arrayList.get(i10)).getPath(), matrix);
                i10++;
            } else {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            }
        }
    }

    @Override // g3.e
    public final void f(Canvas canvas, Matrix matrix, int i10) {
        if (this.f17535e) {
            return;
        }
        h3.b bVar = (h3.b) this.f17537g;
        int k10 = bVar.k(bVar.b(), bVar.d());
        f3.a aVar = this.f17533b;
        aVar.setColor(k10);
        PointF pointF = p3.f.f23678a;
        int i11 = 0;
        aVar.setAlpha(Math.max(0, Math.min((int) FunctionEval.FunctionID.EXTERNAL_FUNC, (int) androidx.activity.r.b(i10 / 255.0f, this.f17538h.f().intValue(), 100.0f, 255.0f))));
        h3.p pVar = this.f17539i;
        if (pVar != null) {
            aVar.setColorFilter((ColorFilter) pVar.f());
        }
        Path path = this.f17532a;
        path.reset();
        while (true) {
            ArrayList arrayList = this.f17536f;
            if (i11 < arrayList.size()) {
                path.addPath(((m) arrayList.get(i11)).getPath(), matrix);
                i11++;
            } else {
                canvas.drawPath(path, aVar);
                androidx.activity.s.y();
                return;
            }
        }
    }

    @Override // j3.e
    public final void g(j3.d dVar, int i10, ArrayList arrayList, j3.d dVar2) {
        p3.f.d(dVar, i10, arrayList, dVar2, this);
    }

    @Override // g3.c
    public final String getName() {
        return this.f17534d;
    }
}

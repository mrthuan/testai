package g3;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import h3.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* compiled from: RepeaterContent.java */
/* loaded from: classes.dex */
public final class p implements e, m, j, a.InterfaceC0242a, k {

    /* renamed from: a  reason: collision with root package name */
    public final Matrix f17597a = new Matrix();

    /* renamed from: b  reason: collision with root package name */
    public final Path f17598b = new Path();
    public final e3.k c;

    /* renamed from: d  reason: collision with root package name */
    public final com.airbnb.lottie.model.layer.a f17599d;

    /* renamed from: e  reason: collision with root package name */
    public final String f17600e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f17601f;

    /* renamed from: g  reason: collision with root package name */
    public final h3.c f17602g;

    /* renamed from: h  reason: collision with root package name */
    public final h3.c f17603h;

    /* renamed from: i  reason: collision with root package name */
    public final h3.o f17604i;

    /* renamed from: j  reason: collision with root package name */
    public d f17605j;

    public p(e3.k kVar, com.airbnb.lottie.model.layer.a aVar, l3.f fVar) {
        this.c = kVar;
        this.f17599d = aVar;
        this.f17600e = fVar.f20463a;
        this.f17601f = fVar.f20466e;
        h3.a<Float, Float> a10 = fVar.f20464b.a();
        this.f17602g = (h3.c) a10;
        aVar.e(a10);
        a10.a(this);
        h3.a<Float, Float> a11 = fVar.c.a();
        this.f17603h = (h3.c) a11;
        aVar.e(a11);
        a11.a(this);
        k3.k kVar2 = fVar.f20465d;
        kVar2.getClass();
        h3.o oVar = new h3.o(kVar2);
        this.f17604i = oVar;
        oVar.a(aVar);
        oVar.b(this);
    }

    @Override // h3.a.InterfaceC0242a
    public final void a() {
        this.c.invalidateSelf();
    }

    @Override // g3.c
    public final void b(List<c> list, List<c> list2) {
        this.f17605j.b(list, list2);
    }

    @Override // j3.e
    public final void c(n3.a aVar, Object obj) {
        if (this.f17604i.c(aVar, obj)) {
            return;
        }
        if (obj == e3.o.f16429q) {
            this.f17602g.j(aVar);
        } else if (obj == e3.o.f16430r) {
            this.f17603h.j(aVar);
        }
    }

    @Override // g3.e
    public final void d(RectF rectF, Matrix matrix, boolean z10) {
        this.f17605j.d(rectF, matrix, z10);
    }

    @Override // g3.j
    public final void e(ListIterator<c> listIterator) {
        if (this.f17605j != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add(listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.f17605j = new d(this.c, this.f17599d, "Repeater", this.f17601f, arrayList, null);
    }

    @Override // g3.e
    public final void f(Canvas canvas, Matrix matrix, int i10) {
        float floatValue = this.f17602g.f().floatValue();
        float floatValue2 = this.f17603h.f().floatValue();
        h3.o oVar = this.f17604i;
        float floatValue3 = oVar.f17999m.f().floatValue() / 100.0f;
        float floatValue4 = oVar.f18000n.f().floatValue() / 100.0f;
        int i11 = (int) floatValue;
        while (true) {
            i11--;
            if (i11 >= 0) {
                Matrix matrix2 = this.f17597a;
                matrix2.set(matrix);
                float f10 = i11;
                matrix2.preConcat(oVar.e(f10 + floatValue2));
                PointF pointF = p3.f.f23678a;
                this.f17605j.f(canvas, matrix2, (int) ((((floatValue4 - floatValue3) * (f10 / floatValue)) + floatValue3) * i10));
            } else {
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
        return this.f17600e;
    }

    @Override // g3.m
    public final Path getPath() {
        Path path = this.f17605j.getPath();
        Path path2 = this.f17598b;
        path2.reset();
        float floatValue = this.f17602g.f().floatValue();
        float floatValue2 = this.f17603h.f().floatValue();
        int i10 = (int) floatValue;
        while (true) {
            i10--;
            if (i10 >= 0) {
                Matrix matrix = this.f17597a;
                matrix.set(this.f17604i.e(i10 + floatValue2));
                path2.addPath(path, matrix);
            } else {
                return path2;
            }
        }
    }
}

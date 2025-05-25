package g3;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import h3.a;
import java.util.ArrayList;
import java.util.List;

/* compiled from: EllipseContent.java */
/* loaded from: classes.dex */
public final class f implements m, a.InterfaceC0242a, k {

    /* renamed from: b  reason: collision with root package name */
    public final String f17526b;
    public final e3.k c;

    /* renamed from: d  reason: collision with root package name */
    public final h3.j f17527d;

    /* renamed from: e  reason: collision with root package name */
    public final h3.a<?, PointF> f17528e;

    /* renamed from: f  reason: collision with root package name */
    public final l3.a f17529f;

    /* renamed from: h  reason: collision with root package name */
    public boolean f17531h;

    /* renamed from: a  reason: collision with root package name */
    public final Path f17525a = new Path();

    /* renamed from: g  reason: collision with root package name */
    public final b f17530g = new b(0);

    public f(e3.k kVar, com.airbnb.lottie.model.layer.a aVar, l3.a aVar2) {
        this.f17526b = aVar2.f20446a;
        this.c = kVar;
        h3.a<?, ?> a10 = aVar2.c.a();
        this.f17527d = (h3.j) a10;
        h3.a<PointF, PointF> a11 = aVar2.f20447b.a();
        this.f17528e = a11;
        this.f17529f = aVar2;
        aVar.e(a10);
        aVar.e(a11);
        a10.a(this);
        a11.a(this);
    }

    @Override // h3.a.InterfaceC0242a
    public final void a() {
        this.f17531h = false;
        this.c.invalidateSelf();
    }

    @Override // g3.c
    public final void b(List<c> list, List<c> list2) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i10 < arrayList.size()) {
                c cVar = (c) arrayList.get(i10);
                if (cVar instanceof s) {
                    s sVar = (s) cVar;
                    if (sVar.c == ShapeTrimPath.Type.SIMULTANEOUSLY) {
                        ((List) this.f17530g.f17514a).add(sVar);
                        sVar.c(this);
                    }
                }
                i10++;
            } else {
                return;
            }
        }
    }

    @Override // j3.e
    public final void c(n3.a aVar, Object obj) {
        if (obj == e3.o.f16419g) {
            this.f17527d.j(aVar);
        } else if (obj == e3.o.f16422j) {
            this.f17528e.j(aVar);
        }
    }

    @Override // j3.e
    public final void g(j3.d dVar, int i10, ArrayList arrayList, j3.d dVar2) {
        p3.f.d(dVar, i10, arrayList, dVar2, this);
    }

    @Override // g3.c
    public final String getName() {
        return this.f17526b;
    }

    @Override // g3.m
    public final Path getPath() {
        boolean z10 = this.f17531h;
        Path path = this.f17525a;
        if (z10) {
            return path;
        }
        path.reset();
        l3.a aVar = this.f17529f;
        if (aVar.f20449e) {
            this.f17531h = true;
            return path;
        }
        PointF f10 = this.f17527d.f();
        float f11 = f10.x / 2.0f;
        float f12 = f10.y / 2.0f;
        float f13 = f11 * 0.55228f;
        float f14 = f12 * 0.55228f;
        path.reset();
        if (aVar.f20448d) {
            float f15 = -f12;
            path.moveTo(0.0f, f15);
            float f16 = 0.0f - f13;
            float f17 = -f11;
            float f18 = 0.0f - f14;
            path.cubicTo(f16, f15, f17, f18, f17, 0.0f);
            float f19 = f14 + 0.0f;
            path.cubicTo(f17, f19, f16, f12, 0.0f, f12);
            float f20 = f13 + 0.0f;
            path.cubicTo(f20, f12, f11, f19, f11, 0.0f);
            path.cubicTo(f11, f18, f20, f15, 0.0f, f15);
        } else {
            float f21 = -f12;
            path.moveTo(0.0f, f21);
            float f22 = f13 + 0.0f;
            float f23 = 0.0f - f14;
            path.cubicTo(f22, f21, f11, f23, f11, 0.0f);
            float f24 = f14 + 0.0f;
            path.cubicTo(f11, f24, f22, f12, 0.0f, f12);
            float f25 = 0.0f - f13;
            float f26 = -f11;
            path.cubicTo(f25, f12, f26, f24, f26, 0.0f);
            path.cubicTo(f26, f23, f25, f21, 0.0f, f21);
        }
        PointF f27 = this.f17528e.f();
        path.offset(f27.x, f27.y);
        path.close();
        this.f17530g.b(path);
        this.f17531h = true;
        return path;
    }
}

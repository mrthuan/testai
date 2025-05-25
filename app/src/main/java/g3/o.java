package g3;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import h3.a;
import java.util.ArrayList;
import java.util.List;

/* compiled from: RectangleContent.java */
/* loaded from: classes.dex */
public final class o implements a.InterfaceC0242a, k, m {
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f17590d;

    /* renamed from: e  reason: collision with root package name */
    public final e3.k f17591e;

    /* renamed from: f  reason: collision with root package name */
    public final h3.a<?, PointF> f17592f;

    /* renamed from: g  reason: collision with root package name */
    public final h3.j f17593g;

    /* renamed from: h  reason: collision with root package name */
    public final h3.c f17594h;

    /* renamed from: j  reason: collision with root package name */
    public boolean f17596j;

    /* renamed from: a  reason: collision with root package name */
    public final Path f17588a = new Path();

    /* renamed from: b  reason: collision with root package name */
    public final RectF f17589b = new RectF();

    /* renamed from: i  reason: collision with root package name */
    public final b f17595i = new b(0);

    public o(e3.k kVar, com.airbnb.lottie.model.layer.a aVar, l3.e eVar) {
        this.c = eVar.f20459a;
        this.f17590d = eVar.f20462e;
        this.f17591e = kVar;
        h3.a<PointF, PointF> a10 = eVar.f20460b.a();
        this.f17592f = a10;
        h3.a<?, ?> a11 = eVar.c.a();
        this.f17593g = (h3.j) a11;
        h3.a<?, ?> a12 = eVar.f20461d.a();
        this.f17594h = (h3.c) a12;
        aVar.e(a10);
        aVar.e(a11);
        aVar.e(a12);
        a10.a(this);
        a11.a(this);
        a12.a(this);
    }

    @Override // h3.a.InterfaceC0242a
    public final void a() {
        this.f17596j = false;
        this.f17591e.invalidateSelf();
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
                        ((List) this.f17595i.f17514a).add(sVar);
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
        if (obj == e3.o.f16420h) {
            this.f17593g.j(aVar);
        } else if (obj == e3.o.f16422j) {
            this.f17592f.j(aVar);
        } else if (obj == e3.o.f16421i) {
            this.f17594h.j(aVar);
        }
    }

    @Override // j3.e
    public final void g(j3.d dVar, int i10, ArrayList arrayList, j3.d dVar2) {
        p3.f.d(dVar, i10, arrayList, dVar2, this);
    }

    @Override // g3.c
    public final String getName() {
        return this.c;
    }

    @Override // g3.m
    public final Path getPath() {
        float k10;
        boolean z10 = this.f17596j;
        Path path = this.f17588a;
        if (z10) {
            return path;
        }
        path.reset();
        if (this.f17590d) {
            this.f17596j = true;
            return path;
        }
        PointF f10 = this.f17593g.f();
        float f11 = f10.x / 2.0f;
        float f12 = f10.y / 2.0f;
        h3.c cVar = this.f17594h;
        if (cVar == null) {
            k10 = 0.0f;
        } else {
            k10 = cVar.k();
        }
        float min = Math.min(f11, f12);
        if (k10 > min) {
            k10 = min;
        }
        PointF f13 = this.f17592f.f();
        path.moveTo(f13.x + f11, (f13.y - f12) + k10);
        path.lineTo(f13.x + f11, (f13.y + f12) - k10);
        int i10 = (k10 > 0.0f ? 1 : (k10 == 0.0f ? 0 : -1));
        RectF rectF = this.f17589b;
        if (i10 > 0) {
            float f14 = f13.x + f11;
            float f15 = k10 * 2.0f;
            float f16 = f13.y + f12;
            rectF.set(f14 - f15, f16 - f15, f14, f16);
            path.arcTo(rectF, 0.0f, 90.0f, false);
        }
        path.lineTo((f13.x - f11) + k10, f13.y + f12);
        if (i10 > 0) {
            float f17 = f13.x - f11;
            float f18 = f13.y + f12;
            float f19 = k10 * 2.0f;
            rectF.set(f17, f18 - f19, f19 + f17, f18);
            path.arcTo(rectF, 90.0f, 90.0f, false);
        }
        path.lineTo(f13.x - f11, (f13.y - f12) + k10);
        if (i10 > 0) {
            float f20 = f13.x - f11;
            float f21 = f13.y - f12;
            float f22 = k10 * 2.0f;
            rectF.set(f20, f21, f20 + f22, f22 + f21);
            path.arcTo(rectF, 180.0f, 90.0f, false);
        }
        path.lineTo((f13.x + f11) - k10, f13.y - f12);
        if (i10 > 0) {
            float f23 = f13.x + f11;
            float f24 = k10 * 2.0f;
            float f25 = f13.y - f12;
            rectF.set(f23 - f24, f25, f23, f24 + f25);
            path.arcTo(rectF, 270.0f, 90.0f, false);
        }
        path.close();
        this.f17595i.b(path);
        this.f17596j = true;
        return path;
    }
}

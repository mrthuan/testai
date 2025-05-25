package g3;

import android.graphics.Path;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import h3.a;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ShapeContent.java */
/* loaded from: classes.dex */
public final class q implements m, a.InterfaceC0242a {

    /* renamed from: b  reason: collision with root package name */
    public final boolean f17607b;
    public final e3.k c;

    /* renamed from: d  reason: collision with root package name */
    public final h3.l f17608d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f17609e;

    /* renamed from: a  reason: collision with root package name */
    public final Path f17606a = new Path();

    /* renamed from: f  reason: collision with root package name */
    public final b f17610f = new b(0);

    public q(e3.k kVar, com.airbnb.lottie.model.layer.a aVar, l3.j jVar) {
        jVar.getClass();
        this.f17607b = jVar.f20478d;
        this.c = kVar;
        h3.a<l3.g, Path> a10 = jVar.c.a();
        this.f17608d = (h3.l) a10;
        aVar.e(a10);
        a10.a(this);
    }

    @Override // h3.a.InterfaceC0242a
    public final void a() {
        this.f17609e = false;
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
                        ((List) this.f17610f.f17514a).add(sVar);
                        sVar.c(this);
                    }
                }
                i10++;
            } else {
                return;
            }
        }
    }

    @Override // g3.m
    public final Path getPath() {
        boolean z10 = this.f17609e;
        Path path = this.f17606a;
        if (z10) {
            return path;
        }
        path.reset();
        if (this.f17607b) {
            this.f17609e = true;
            return path;
        }
        path.set(this.f17608d.f());
        path.setFillType(Path.FillType.EVEN_ODD);
        this.f17610f.b(path);
        this.f17609e = true;
        return path;
    }
}

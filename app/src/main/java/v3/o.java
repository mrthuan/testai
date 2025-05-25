package v3;

import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.engine.c;
import z3.o;

/* compiled from: SourceGenerator.java */
/* loaded from: classes.dex */
public final class o implements d.a<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o.a f30535a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ com.bumptech.glide.load.engine.i f30536b;

    public o(com.bumptech.glide.load.engine.i iVar, o.a aVar) {
        this.f30536b = iVar;
        this.f30535a = aVar;
    }

    @Override // com.bumptech.glide.load.data.d.a
    public final void c(Exception exc) {
        boolean z10;
        com.bumptech.glide.load.engine.i iVar = this.f30536b;
        o.a<?> aVar = this.f30535a;
        o.a<?> aVar2 = iVar.f7033f;
        if (aVar2 != null && aVar2 == aVar) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            c cVar = iVar.f7034g;
            com.bumptech.glide.load.data.d<?> dVar = aVar.c;
            iVar.f7030b.a(cVar, exc, dVar, dVar.d());
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public final void f(Object obj) {
        boolean z10;
        com.bumptech.glide.load.engine.i iVar = this.f30536b;
        o.a<?> aVar = this.f30535a;
        o.a<?> aVar2 = iVar.f7033f;
        if (aVar2 != null && aVar2 == aVar) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            f fVar = iVar.f7029a.f6959p;
            if (obj != null && fVar.c(aVar.c.d())) {
                iVar.f7032e = obj;
                iVar.f7030b.d();
                return;
            }
            c.a aVar3 = iVar.f7030b;
            t3.b bVar = aVar.f32257a;
            com.bumptech.glide.load.data.d<?> dVar = aVar.c;
            aVar3.c(bVar, obj, dVar, dVar.d(), iVar.f7034g);
        }
    }
}

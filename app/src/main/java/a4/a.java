package a4;

import com.bumptech.glide.load.data.j;
import java.io.InputStream;
import java.util.ArrayDeque;
import z3.m;
import z3.n;
import z3.o;
import z3.p;
import z3.s;

/* compiled from: HttpGlideUrlLoader.java */
/* loaded from: classes.dex */
public final class a implements o<z3.g, InputStream> {

    /* renamed from: b  reason: collision with root package name */
    public static final t3.d<Integer> f33b = t3.d.a(2500, "com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout");

    /* renamed from: a  reason: collision with root package name */
    public final n<z3.g, z3.g> f34a;

    /* compiled from: HttpGlideUrlLoader.java */
    /* renamed from: a4.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0001a implements p<z3.g, InputStream> {

        /* renamed from: a  reason: collision with root package name */
        public final n<z3.g, z3.g> f35a = new n<>();

        @Override // z3.p
        public final o<z3.g, InputStream> b(s sVar) {
            return new a(this.f35a);
        }
    }

    public a(n<z3.g, z3.g> nVar) {
        this.f34a = nVar;
    }

    @Override // z3.o
    public final /* bridge */ /* synthetic */ boolean a(z3.g gVar) {
        return true;
    }

    @Override // z3.o
    public final o.a<InputStream> b(z3.g gVar, int i10, int i11, t3.e eVar) {
        z3.g gVar2 = gVar;
        n<z3.g, z3.g> nVar = this.f34a;
        if (nVar != null) {
            n.a a10 = n.a.a(gVar2);
            m mVar = nVar.f32253a;
            Object a11 = mVar.a(a10);
            ArrayDeque arrayDeque = n.a.f32254d;
            synchronized (arrayDeque) {
                arrayDeque.offer(a10);
            }
            z3.g gVar3 = (z3.g) a11;
            if (gVar3 == null) {
                mVar.d(n.a.a(gVar2), gVar2);
            } else {
                gVar2 = gVar3;
            }
        }
        return new o.a<>(gVar2, new j(gVar2, ((Integer) eVar.c(f33b)).intValue()));
    }
}

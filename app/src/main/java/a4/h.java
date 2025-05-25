package a4;

import java.io.InputStream;
import java.net.URL;
import z3.o;
import z3.p;
import z3.s;

/* compiled from: UrlLoader.java */
/* loaded from: classes.dex */
public final class h implements o<URL, InputStream> {

    /* renamed from: a  reason: collision with root package name */
    public final o<z3.g, InputStream> f57a;

    /* compiled from: UrlLoader.java */
    /* loaded from: classes.dex */
    public static class a implements p<URL, InputStream> {
        @Override // z3.p
        public final o<URL, InputStream> b(s sVar) {
            return new h(sVar.c(z3.g.class, InputStream.class));
        }
    }

    public h(o<z3.g, InputStream> oVar) {
        this.f57a = oVar;
    }

    @Override // z3.o
    public final /* bridge */ /* synthetic */ boolean a(URL url) {
        return true;
    }

    @Override // z3.o
    public final o.a<InputStream> b(URL url, int i10, int i11, t3.e eVar) {
        return this.f57a.b(new z3.g(url), i10, i11, eVar);
    }
}

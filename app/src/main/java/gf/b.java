package gf;

import gf.c;
import java.nio.ByteBuffer;
import we.c;

/* compiled from: BasicMessageChannel.java */
/* loaded from: classes.dex */
public final class b<T> {

    /* renamed from: a  reason: collision with root package name */
    public final gf.c f17787a;

    /* renamed from: b  reason: collision with root package name */
    public final String f17788b;
    public final f<T> c;

    /* renamed from: d  reason: collision with root package name */
    public final c.InterfaceC0236c f17789d;

    /* compiled from: BasicMessageChannel.java */
    /* loaded from: classes.dex */
    public final class a implements c.a {

        /* renamed from: a  reason: collision with root package name */
        public final c<T> f17790a;

        public a(c cVar) {
            this.f17790a = cVar;
        }

        @Override // gf.c.a
        public final void a(ByteBuffer byteBuffer, c.e eVar) {
            b bVar = b.this;
            try {
                this.f17790a.n(bVar.c.b(byteBuffer), new gf.a(this, eVar));
            } catch (RuntimeException unused) {
                String str = bVar.f17788b;
                eVar.a(null);
            }
        }
    }

    /* compiled from: BasicMessageChannel.java */
    /* renamed from: gf.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public final class C0235b implements c.b {

        /* renamed from: a  reason: collision with root package name */
        public final d<T> f17792a;

        public C0235b(d dVar) {
            this.f17792a = dVar;
        }

        @Override // gf.c.b
        public final void a(ByteBuffer byteBuffer) {
            b bVar = b.this;
            try {
                this.f17792a.i(bVar.c.b(byteBuffer));
            } catch (RuntimeException unused) {
                String str = bVar.f17788b;
            }
        }
    }

    /* compiled from: BasicMessageChannel.java */
    /* loaded from: classes.dex */
    public interface c<T> {
        void n(Object obj, gf.a aVar);
    }

    /* compiled from: BasicMessageChannel.java */
    /* loaded from: classes.dex */
    public interface d<T> {
        void i(T t4);
    }

    public b(gf.c cVar, String str, f<T> fVar, c.InterfaceC0236c interfaceC0236c) {
        this.f17787a = cVar;
        this.f17788b = str;
        this.c = fVar;
        this.f17789d = interfaceC0236c;
    }

    public final void a(T t4, d<T> dVar) {
        C0235b c0235b;
        ByteBuffer a10 = this.c.a(t4);
        if (dVar == null) {
            c0235b = null;
        } else {
            c0235b = new C0235b(dVar);
        }
        this.f17787a.a(this.f17788b, a10, c0235b);
    }

    public final void b(c<T> cVar) {
        String str = this.f17788b;
        gf.c cVar2 = this.f17787a;
        a aVar = null;
        c.InterfaceC0236c interfaceC0236c = this.f17789d;
        if (interfaceC0236c != null) {
            if (cVar != null) {
                aVar = new a(cVar);
            }
            cVar2.d(str, aVar, interfaceC0236c);
            return;
        }
        if (cVar != null) {
            aVar = new a(cVar);
        }
        cVar2.f(str, aVar);
    }
}

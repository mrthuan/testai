package q4;

import android.util.Log;
import q4.d;

/* compiled from: FactoryPools.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final C0366a f29081a = new C0366a();

    /* compiled from: FactoryPools.java */
    /* loaded from: classes.dex */
    public interface b<T> {
        T a();
    }

    /* compiled from: FactoryPools.java */
    /* loaded from: classes.dex */
    public static final class c<T> implements w0.d<T> {

        /* renamed from: a  reason: collision with root package name */
        public final b<T> f29082a;

        /* renamed from: b  reason: collision with root package name */
        public final e<T> f29083b;
        public final w0.d<T> c;

        public c(w0.e eVar, b bVar, e eVar2) {
            this.c = eVar;
            this.f29082a = bVar;
            this.f29083b = eVar2;
        }

        @Override // w0.d
        public final boolean a(T t4) {
            if (t4 instanceof d) {
                ((d) t4).b().f29084a = true;
            }
            this.f29083b.a(t4);
            return this.c.a(t4);
        }

        @Override // w0.d
        public final T b() {
            T b10 = this.c.b();
            if (b10 == null) {
                b10 = this.f29082a.a();
                if (Log.isLoggable("FactoryPools", 2)) {
                    b10.getClass().toString();
                }
            }
            if (b10 instanceof d) {
                ((d) b10).b().f29084a = false;
            }
            return b10;
        }
    }

    /* compiled from: FactoryPools.java */
    /* loaded from: classes.dex */
    public interface d {
        d.a b();
    }

    /* compiled from: FactoryPools.java */
    /* loaded from: classes.dex */
    public interface e<T> {
        void a(T t4);
    }

    public static c a(int i10, b bVar) {
        return new c(new w0.e(i10), bVar, f29081a);
    }

    /* compiled from: FactoryPools.java */
    /* renamed from: q4.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0366a implements e<Object> {
        @Override // q4.a.e
        public final void a(Object obj) {
        }
    }
}

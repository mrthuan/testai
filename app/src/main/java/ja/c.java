package ja;

import android.util.Log;
import db.a;
import ga.p;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;
import oa.b0;
import oa.d0;

/* compiled from: CrashlyticsNativeComponentDeferredProxy.java */
/* loaded from: classes2.dex */
public final class c implements ja.a {
    public static final a c = new a();

    /* renamed from: a  reason: collision with root package name */
    public final db.a<ja.a> f19072a;

    /* renamed from: b  reason: collision with root package name */
    public final AtomicReference<ja.a> f19073b = new AtomicReference<>(null);

    /* compiled from: CrashlyticsNativeComponentDeferredProxy.java */
    /* loaded from: classes2.dex */
    public static final class a implements e {
        @Override // ja.e
        public final File a() {
            return null;
        }

        @Override // ja.e
        public final File b() {
            return null;
        }

        @Override // ja.e
        public final File c() {
            return null;
        }

        @Override // ja.e
        public final b0.a d() {
            return null;
        }

        @Override // ja.e
        public final File e() {
            return null;
        }

        @Override // ja.e
        public final File f() {
            return null;
        }

        @Override // ja.e
        public final File g() {
            return null;
        }
    }

    public c(db.a<ja.a> aVar) {
        this.f19072a = aVar;
        ((p) aVar).a(new a1.e(this, 4));
    }

    @Override // ja.a
    public final e a(String str) {
        ja.a aVar = this.f19073b.get();
        if (aVar == null) {
            return c;
        }
        return aVar.a(str);
    }

    @Override // ja.a
    public final boolean b() {
        ja.a aVar = this.f19073b.get();
        if (aVar != null && aVar.b()) {
            return true;
        }
        return false;
    }

    @Override // ja.a
    public final void c(final String str, final String str2, final long j10, final d0 d0Var) {
        Log.isLoggable("FirebaseCrashlytics", 2);
        ((p) this.f19072a).a(new a.InterfaceC0196a() { // from class: ja.b
            @Override // db.a.InterfaceC0196a
            public final void g(db.b bVar) {
                ((a) bVar.get()).c(str, str2, j10, d0Var);
            }
        });
    }

    @Override // ja.a
    public final boolean d(String str) {
        ja.a aVar = this.f19073b.get();
        if (aVar != null && aVar.d(str)) {
            return true;
        }
        return false;
    }
}

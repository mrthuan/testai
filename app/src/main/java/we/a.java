package we;

import android.content.res.AssetManager;
import androidx.activity.r;
import gf.c;
import gf.l;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import we.c;

/* compiled from: DartExecutor.java */
/* loaded from: classes.dex */
public final class a implements gf.c {

    /* renamed from: a  reason: collision with root package name */
    public final FlutterJNI f31178a;

    /* renamed from: b  reason: collision with root package name */
    public final AssetManager f31179b;
    public final we.c c;

    /* renamed from: d  reason: collision with root package name */
    public final c f31180d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f31181e;

    /* compiled from: DartExecutor.java */
    /* renamed from: we.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0396a implements c.a {
        public C0396a() {
        }

        @Override // gf.c.a
        public final void a(ByteBuffer byteBuffer, c.e eVar) {
            l.f17805b.getClass();
            l.c(byteBuffer);
            a.this.getClass();
        }
    }

    /* compiled from: DartExecutor.java */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f31183a;

        /* renamed from: b  reason: collision with root package name */
        public final String f31184b;

        public b(String str, String str2) {
            this.f31183a = str;
            this.f31184b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (!this.f31183a.equals(bVar.f31183a)) {
                return false;
            }
            return this.f31184b.equals(bVar.f31184b);
        }

        public final int hashCode() {
            return this.f31184b.hashCode() + (this.f31183a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("DartEntrypoint( bundle path: ");
            sb2.append(this.f31183a);
            sb2.append(", function: ");
            return r.g(sb2, this.f31184b, " )");
        }
    }

    /* compiled from: DartExecutor.java */
    /* loaded from: classes.dex */
    public static class c implements gf.c {

        /* renamed from: a  reason: collision with root package name */
        public final we.c f31185a;

        public c(we.c cVar) {
            this.f31185a = cVar;
        }

        @Override // gf.c
        public final void a(String str, ByteBuffer byteBuffer, c.b bVar) {
            this.f31185a.a(str, byteBuffer, bVar);
        }

        @Override // gf.c
        public final c.InterfaceC0236c b() {
            return c(new c.d());
        }

        public final c.InterfaceC0236c c(c.d dVar) {
            return this.f31185a.e(dVar);
        }

        @Override // gf.c
        public final void d(String str, c.a aVar, c.InterfaceC0236c interfaceC0236c) {
            this.f31185a.d(str, aVar, interfaceC0236c);
        }

        @Override // gf.c
        public final void f(String str, c.a aVar) {
            this.f31185a.d(str, aVar, null);
        }
    }

    public a(FlutterJNI flutterJNI, AssetManager assetManager) {
        this.f31181e = false;
        C0396a c0396a = new C0396a();
        this.f31178a = flutterJNI;
        this.f31179b = assetManager;
        we.c cVar = new we.c(flutterJNI);
        this.c = cVar;
        cVar.d("flutter/isolate", c0396a, null);
        this.f31180d = new c(cVar);
        if (flutterJNI.isAttached()) {
            this.f31181e = true;
        }
    }

    @Override // gf.c
    @Deprecated
    public final void a(String str, ByteBuffer byteBuffer, c.b bVar) {
        this.f31180d.a(str, byteBuffer, bVar);
    }

    @Override // gf.c
    public final c.InterfaceC0236c b() {
        return c(new c.d());
    }

    @Deprecated
    public final c.InterfaceC0236c c(c.d dVar) {
        return this.f31180d.c(dVar);
    }

    @Override // gf.c
    @Deprecated
    public final void d(String str, c.a aVar, c.InterfaceC0236c interfaceC0236c) {
        this.f31180d.d(str, aVar, interfaceC0236c);
    }

    @Override // gf.c
    @Deprecated
    public final void f(String str, c.a aVar) {
        this.f31180d.f(str, aVar);
    }
}

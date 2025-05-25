package ye;

import io.flutter.embedding.engine.FlutterJNI;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* compiled from: FlutterLoader.java */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public boolean f32131a;

    /* renamed from: b  reason: collision with root package name */
    public b f32132b;
    public long c;

    /* renamed from: d  reason: collision with root package name */
    public ye.b f32133d;

    /* renamed from: e  reason: collision with root package name */
    public final FlutterJNI f32134e;

    /* renamed from: f  reason: collision with root package name */
    public final ExecutorService f32135f;

    /* renamed from: g  reason: collision with root package name */
    public Future<a> f32136g;

    /* compiled from: FlutterLoader.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f32137a;

        /* renamed from: b  reason: collision with root package name */
        public final String f32138b;

        public a(String str, String str2) {
            this.f32137a = str;
            this.f32138b = str2;
        }
    }

    /* compiled from: FlutterLoader.java */
    /* loaded from: classes.dex */
    public static class b {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d() {
        this(new FlutterJNI(), te.b.a().c);
        te.b.a().f30004b.getClass();
    }

    public d(FlutterJNI flutterJNI, ExecutorService executorService) {
        this.f32131a = false;
        this.f32134e = flutterJNI;
        this.f32135f = executorService;
    }
}

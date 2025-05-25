package te;

import io.flutter.embedding.engine.FlutterJNI;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import ye.d;

/* compiled from: FlutterInjector.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: d  reason: collision with root package name */
    public static b f30002d;

    /* renamed from: a  reason: collision with root package name */
    public final d f30003a;

    /* renamed from: b  reason: collision with root package name */
    public final FlutterJNI.c f30004b;
    public final ExecutorService c;

    public b(d dVar, FlutterJNI.c cVar, ExecutorService executorService) {
        this.f30003a = dVar;
        this.f30004b = cVar;
        this.c = executorService;
    }

    public static b a() {
        if (f30002d == null) {
            FlutterJNI.c cVar = new FlutterJNI.c();
            ExecutorService newCachedThreadPool = Executors.newCachedThreadPool(new a());
            f30002d = new b(new d(new FlutterJNI(), newCachedThreadPool), cVar, newCachedThreadPool);
        }
        return f30002d;
    }
}

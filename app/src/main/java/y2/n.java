package y2;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.work.ListenableWorker;
import java.util.UUID;

/* compiled from: WorkForegroundRunnable.java */
/* loaded from: classes.dex */
public final class n implements Runnable {

    /* renamed from: g  reason: collision with root package name */
    public static final /* synthetic */ int f32012g = 0;

    /* renamed from: a  reason: collision with root package name */
    public final androidx.work.impl.utils.futures.a<Void> f32013a = new androidx.work.impl.utils.futures.a<>();

    /* renamed from: b  reason: collision with root package name */
    public final Context f32014b;
    public final x2.p c;

    /* renamed from: d  reason: collision with root package name */
    public final ListenableWorker f32015d;

    /* renamed from: e  reason: collision with root package name */
    public final o2.e f32016e;

    /* renamed from: f  reason: collision with root package name */
    public final z2.a f32017f;

    /* compiled from: WorkForegroundRunnable.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ androidx.work.impl.utils.futures.a f32018a;

        public a(androidx.work.impl.utils.futures.a aVar) {
            this.f32018a = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f32018a.j(n.this.f32015d.getForegroundInfoAsync());
        }
    }

    /* compiled from: WorkForegroundRunnable.java */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ androidx.work.impl.utils.futures.a f32020a;

        public b(androidx.work.impl.utils.futures.a aVar) {
            this.f32020a = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            n nVar = n.this;
            try {
                o2.d dVar = (o2.d) this.f32020a.get();
                if (dVar != null) {
                    o2.h c = o2.h.c();
                    int i10 = n.f32012g;
                    Object[] objArr = new Object[1];
                    x2.p pVar = nVar.c;
                    ListenableWorker listenableWorker = nVar.f32015d;
                    objArr[0] = pVar.c;
                    String.format("Updating notification for %s", objArr);
                    c.a(new Throwable[0]);
                    listenableWorker.setRunInForeground(true);
                    androidx.work.impl.utils.futures.a<Void> aVar = nVar.f32013a;
                    o2.e eVar = nVar.f32016e;
                    Context context = nVar.f32014b;
                    UUID id2 = listenableWorker.getId();
                    p pVar2 = (p) eVar;
                    pVar2.getClass();
                    androidx.work.impl.utils.futures.a aVar2 = new androidx.work.impl.utils.futures.a();
                    ((z2.b) pVar2.f32026a).a(new o(pVar2, aVar2, id2, dVar, context));
                    aVar.j(aVar2);
                    return;
                }
                throw new IllegalStateException(String.format("Worker was marked important (%s) but did not provide ForegroundInfo", nVar.c.c));
            } catch (Throwable th2) {
                nVar.f32013a.i(th2);
            }
        }
    }

    static {
        o2.h.e("WorkForegroundRunnable");
    }

    @SuppressLint({"LambdaLast"})
    public n(Context context, x2.p pVar, ListenableWorker listenableWorker, o2.e eVar, z2.a aVar) {
        this.f32014b = context;
        this.c = pVar;
        this.f32015d = listenableWorker;
        this.f32016e = eVar;
        this.f32017f = aVar;
    }

    @Override // java.lang.Runnable
    @SuppressLint({"UnsafeExperimentalUsageError"})
    public final void run() {
        if (this.c.f31573q && !s0.a.a()) {
            androidx.work.impl.utils.futures.a aVar = new androidx.work.impl.utils.futures.a();
            z2.b bVar = (z2.b) this.f32017f;
            bVar.c.execute(new a(aVar));
            aVar.addListener(new b(aVar), bVar.c);
            return;
        }
        this.f32013a.h(null);
    }
}

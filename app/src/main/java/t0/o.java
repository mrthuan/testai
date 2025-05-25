package t0;

import android.os.Handler;
import java.util.concurrent.Callable;

/* compiled from: RequestExecutor.java */
/* loaded from: classes.dex */
public final class o<T> implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final Callable<T> f29903a;

    /* renamed from: b  reason: collision with root package name */
    public final w0.a<T> f29904b;
    public final Handler c;

    /* compiled from: RequestExecutor.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ w0.a f29905a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Object f29906b;

        public a(w0.a aVar, Object obj) {
            this.f29905a = aVar;
            this.f29906b = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            this.f29905a.accept(this.f29906b);
        }
    }

    public o(Handler handler, i iVar, j jVar) {
        this.f29903a = iVar;
        this.f29904b = jVar;
        this.c = handler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        T t4;
        try {
            t4 = this.f29903a.call();
        } catch (Exception unused) {
            t4 = null;
        }
        this.c.post(new a(this.f29904b, t4));
    }
}

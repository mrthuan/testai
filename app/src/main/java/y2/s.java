package y2;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.util.HashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* compiled from: WorkTimer.java */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    public final ScheduledExecutorService f32033a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f32034b;
    public final HashMap c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f32035d;

    /* compiled from: WorkTimer.java */
    /* loaded from: classes.dex */
    public class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        public int f32036a = 0;

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
            newThread.setName("WorkManager-WorkTimer-thread-" + this.f32036a);
            this.f32036a = this.f32036a + 1;
            return newThread;
        }
    }

    /* compiled from: WorkTimer.java */
    /* loaded from: classes.dex */
    public interface b {
        void a(String str);
    }

    /* compiled from: WorkTimer.java */
    /* loaded from: classes.dex */
    public static class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final s f32037a;

        /* renamed from: b  reason: collision with root package name */
        public final String f32038b;

        public c(s sVar, String str) {
            this.f32037a = sVar;
            this.f32038b = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (this.f32037a.f32035d) {
                if (((c) this.f32037a.f32034b.remove(this.f32038b)) != null) {
                    b bVar = (b) this.f32037a.c.remove(this.f32038b);
                    if (bVar != null) {
                        bVar.a(this.f32038b);
                    }
                } else {
                    o2.h c = o2.h.c();
                    String.format("Timer with %s is already marked as complete.", this.f32038b);
                    c.a(new Throwable[0]);
                }
            }
        }
    }

    static {
        o2.h.e("WorkTimer");
    }

    public s() {
        a aVar = new a();
        this.f32034b = new HashMap();
        this.c = new HashMap();
        this.f32035d = new Object();
        this.f32033a = Executors.newSingleThreadScheduledExecutor(aVar);
    }

    public final void a(String str, b bVar) {
        synchronized (this.f32035d) {
            o2.h c10 = o2.h.c();
            String.format("Starting timer for %s", str);
            c10.a(new Throwable[0]);
            b(str);
            c cVar = new c(this, str);
            this.f32034b.put(str, cVar);
            this.c.put(str, bVar);
            this.f32033a.schedule(cVar, TTAdConstant.AD_MAX_EVENT_TIME, TimeUnit.MILLISECONDS);
        }
    }

    public final void b(String str) {
        synchronized (this.f32035d) {
            if (((c) this.f32034b.remove(str)) != null) {
                o2.h c10 = o2.h.c();
                String.format("Stopping timer for %s", str);
                c10.a(new Throwable[0]);
                this.c.remove(str);
            }
        }
    }
}

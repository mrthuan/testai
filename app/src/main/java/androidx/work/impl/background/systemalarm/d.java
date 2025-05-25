package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import o2.h;
import p2.j;
import y2.m;
import y2.s;

/* compiled from: SystemAlarmDispatcher.java */
/* loaded from: classes.dex */
public final class d implements p2.a {

    /* renamed from: k  reason: collision with root package name */
    public static final /* synthetic */ int f4948k = 0;

    /* renamed from: a  reason: collision with root package name */
    public final Context f4949a;

    /* renamed from: b  reason: collision with root package name */
    public final z2.a f4950b;
    public final s c;

    /* renamed from: d  reason: collision with root package name */
    public final p2.c f4951d;

    /* renamed from: e  reason: collision with root package name */
    public final j f4952e;

    /* renamed from: f  reason: collision with root package name */
    public final androidx.work.impl.background.systemalarm.a f4953f;

    /* renamed from: g  reason: collision with root package name */
    public final Handler f4954g;

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList f4955h;

    /* renamed from: i  reason: collision with root package name */
    public Intent f4956i;

    /* renamed from: j  reason: collision with root package name */
    public c f4957j;

    /* compiled from: SystemAlarmDispatcher.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            d dVar;
            RunnableC0028d runnableC0028d;
            synchronized (d.this.f4955h) {
                d dVar2 = d.this;
                dVar2.f4956i = (Intent) dVar2.f4955h.get(0);
            }
            Intent intent = d.this.f4956i;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = d.this.f4956i.getIntExtra("KEY_START_ID", 0);
                h c = h.c();
                int i10 = d.f4948k;
                String.format("Processing command %s, %s", d.this.f4956i, Integer.valueOf(intExtra));
                c.a(new Throwable[0]);
                PowerManager.WakeLock a10 = m.a(d.this.f4949a, String.format("%s (%s)", action, Integer.valueOf(intExtra)));
                try {
                    h c10 = h.c();
                    String.format("Acquiring operation wake lock (%s) %s", action, a10);
                    c10.a(new Throwable[0]);
                    a10.acquire();
                    d dVar3 = d.this;
                    dVar3.f4953f.e(intExtra, dVar3.f4956i, dVar3);
                    h c11 = h.c();
                    String.format("Releasing operation wake lock (%s) %s", action, a10);
                    c11.a(new Throwable[0]);
                    a10.release();
                    dVar = d.this;
                    runnableC0028d = new RunnableC0028d(dVar);
                } catch (Throwable th2) {
                    try {
                        h c12 = h.c();
                        int i11 = d.f4948k;
                        c12.b(th2);
                        h c13 = h.c();
                        String.format("Releasing operation wake lock (%s) %s", action, a10);
                        c13.a(new Throwable[0]);
                        a10.release();
                        dVar = d.this;
                        runnableC0028d = new RunnableC0028d(dVar);
                    } catch (Throwable th3) {
                        h c14 = h.c();
                        int i12 = d.f4948k;
                        String.format("Releasing operation wake lock (%s) %s", action, a10);
                        c14.a(new Throwable[0]);
                        a10.release();
                        d dVar4 = d.this;
                        dVar4.f(new RunnableC0028d(dVar4));
                        throw th3;
                    }
                }
                dVar.f(runnableC0028d);
            }
        }
    }

    /* compiled from: SystemAlarmDispatcher.java */
    /* loaded from: classes.dex */
    public static class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final d f4959a;

        /* renamed from: b  reason: collision with root package name */
        public final Intent f4960b;
        public final int c;

        public b(int i10, Intent intent, d dVar) {
            this.f4959a = dVar;
            this.f4960b = intent;
            this.c = i10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f4959a.a(this.c, this.f4960b);
        }
    }

    /* compiled from: SystemAlarmDispatcher.java */
    /* loaded from: classes.dex */
    public interface c {
    }

    /* compiled from: SystemAlarmDispatcher.java */
    /* renamed from: androidx.work.impl.background.systemalarm.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class RunnableC0028d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final d f4961a;

        public RunnableC0028d(d dVar) {
            this.f4961a = dVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            d dVar = this.f4961a;
            dVar.getClass();
            h c = h.c();
            int i10 = d.f4948k;
            c.a(new Throwable[0]);
            dVar.c();
            synchronized (dVar.f4955h) {
                if (dVar.f4956i != null) {
                    h c10 = h.c();
                    String.format("Removing command %s", dVar.f4956i);
                    c10.a(new Throwable[0]);
                    if (((Intent) dVar.f4955h.remove(0)).equals(dVar.f4956i)) {
                        dVar.f4956i = null;
                    } else {
                        throw new IllegalStateException("Dequeue-d command is not the first.");
                    }
                }
                y2.j jVar = ((z2.b) dVar.f4950b).f32218a;
                if (!dVar.f4953f.d() && dVar.f4955h.isEmpty() && !jVar.a()) {
                    h.c().a(new Throwable[0]);
                    c cVar = dVar.f4957j;
                    if (cVar != null) {
                        ((SystemAlarmService) cVar).b();
                    }
                } else if (!dVar.f4955h.isEmpty()) {
                    dVar.g();
                }
            }
        }
    }

    static {
        h.e("SystemAlarmDispatcher");
    }

    public d(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f4949a = applicationContext;
        this.f4953f = new androidx.work.impl.background.systemalarm.a(applicationContext);
        this.c = new s();
        j e10 = j.e(context);
        this.f4952e = e10;
        p2.c cVar = e10.f23631f;
        this.f4951d = cVar;
        this.f4950b = e10.f23629d;
        cVar.a(this);
        this.f4955h = new ArrayList();
        this.f4956i = null;
        this.f4954g = new Handler(Looper.getMainLooper());
    }

    public final void a(int i10, Intent intent) {
        h c10 = h.c();
        String.format("Adding command %s (%s)", intent, Integer.valueOf(i10));
        c10.a(new Throwable[0]);
        c();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            h.c().f(new Throwable[0]);
        } else if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && d()) {
        } else {
            intent.putExtra("KEY_START_ID", i10);
            synchronized (this.f4955h) {
                boolean z10 = !this.f4955h.isEmpty();
                this.f4955h.add(intent);
                if (!z10) {
                    g();
                }
            }
        }
    }

    @Override // p2.a
    public final void b(String str, boolean z10) {
        int i10 = androidx.work.impl.background.systemalarm.a.f4934d;
        Intent intent = new Intent(this.f4949a, SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z10);
        f(new b(0, intent, this));
    }

    public final void c() {
        if (this.f4954g.getLooper().getThread() == Thread.currentThread()) {
            return;
        }
        throw new IllegalStateException("Needs to be invoked on the main thread.");
    }

    public final boolean d() {
        c();
        synchronized (this.f4955h) {
            Iterator it = this.f4955h.iterator();
            while (it.hasNext()) {
                if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) it.next()).getAction())) {
                    return true;
                }
            }
            return false;
        }
    }

    public final void e() {
        h.c().a(new Throwable[0]);
        this.f4951d.f(this);
        ScheduledExecutorService scheduledExecutorService = this.c.f32033a;
        if (!scheduledExecutorService.isShutdown()) {
            scheduledExecutorService.shutdownNow();
        }
        this.f4957j = null;
    }

    public final void f(Runnable runnable) {
        this.f4954g.post(runnable);
    }

    public final void g() {
        c();
        PowerManager.WakeLock a10 = m.a(this.f4949a, "ProcessCommand");
        try {
            a10.acquire();
            ((z2.b) this.f4952e.f23629d).a(new a());
        } finally {
            a10.release();
        }
    }
}

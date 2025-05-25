package p2;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import p2.m;

/* compiled from: Processor.java */
/* loaded from: classes.dex */
public final class c implements p2.a, w2.a {

    /* renamed from: l  reason: collision with root package name */
    public static final /* synthetic */ int f23600l = 0;

    /* renamed from: b  reason: collision with root package name */
    public final Context f23602b;
    public final androidx.work.a c;

    /* renamed from: d  reason: collision with root package name */
    public final z2.a f23603d;

    /* renamed from: e  reason: collision with root package name */
    public final WorkDatabase f23604e;

    /* renamed from: h  reason: collision with root package name */
    public final List<d> f23607h;

    /* renamed from: g  reason: collision with root package name */
    public final HashMap f23606g = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    public final HashMap f23605f = new HashMap();

    /* renamed from: i  reason: collision with root package name */
    public final HashSet f23608i = new HashSet();

    /* renamed from: j  reason: collision with root package name */
    public final ArrayList f23609j = new ArrayList();

    /* renamed from: a  reason: collision with root package name */
    public PowerManager.WakeLock f23601a = null;

    /* renamed from: k  reason: collision with root package name */
    public final Object f23610k = new Object();

    /* compiled from: Processor.java */
    /* loaded from: classes.dex */
    public static class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final p2.a f23611a;

        /* renamed from: b  reason: collision with root package name */
        public final String f23612b;
        public final y9.a<Boolean> c;

        public a(p2.a aVar, String str, androidx.work.impl.utils.futures.a aVar2) {
            this.f23611a = aVar;
            this.f23612b = str;
            this.c = aVar2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z10;
            try {
                z10 = this.c.get().booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                z10 = true;
            }
            this.f23611a.b(this.f23612b, z10);
        }
    }

    static {
        o2.h.e("Processor");
    }

    public c(Context context, androidx.work.a aVar, z2.b bVar, WorkDatabase workDatabase, List list) {
        this.f23602b = context;
        this.c = aVar;
        this.f23603d = bVar;
        this.f23604e = workDatabase;
        this.f23607h = list;
    }

    public static boolean c(String str, m mVar) {
        boolean z10;
        if (mVar != null) {
            mVar.f23657s = true;
            mVar.i();
            y9.a<ListenableWorker.a> aVar = mVar.f23656r;
            if (aVar != null) {
                z10 = aVar.isDone();
                mVar.f23656r.cancel(true);
            } else {
                z10 = false;
            }
            ListenableWorker listenableWorker = mVar.f23644f;
            if (listenableWorker != null && !z10) {
                listenableWorker.stop();
            } else {
                String.format("WorkSpec %s is already done. Not interrupting.", mVar.f23643e);
                o2.h c = o2.h.c();
                int i10 = m.f23639t;
                c.a(new Throwable[0]);
            }
            o2.h c10 = o2.h.c();
            String.format("WorkerWrapper interrupted for %s", str);
            c10.a(new Throwable[0]);
            return true;
        }
        o2.h c11 = o2.h.c();
        String.format("WorkerWrapper could not be found for %s", str);
        c11.a(new Throwable[0]);
        return false;
    }

    public final void a(p2.a aVar) {
        synchronized (this.f23610k) {
            this.f23609j.add(aVar);
        }
    }

    @Override // p2.a
    public final void b(String str, boolean z10) {
        synchronized (this.f23610k) {
            this.f23606g.remove(str);
            o2.h c = o2.h.c();
            String.format("%s %s executed; reschedule = %s", c.class.getSimpleName(), str, Boolean.valueOf(z10));
            c.a(new Throwable[0]);
            Iterator it = this.f23609j.iterator();
            while (it.hasNext()) {
                ((p2.a) it.next()).b(str, z10);
            }
        }
    }

    public final boolean d(String str) {
        boolean contains;
        synchronized (this.f23610k) {
            contains = this.f23608i.contains(str);
        }
        return contains;
    }

    public final boolean e(String str) {
        boolean z10;
        synchronized (this.f23610k) {
            if (!this.f23606g.containsKey(str) && !this.f23605f.containsKey(str)) {
                z10 = false;
            }
            z10 = true;
        }
        return z10;
    }

    public final void f(p2.a aVar) {
        synchronized (this.f23610k) {
            this.f23609j.remove(aVar);
        }
    }

    public final void g(String str, o2.d dVar) {
        synchronized (this.f23610k) {
            o2.h c = o2.h.c();
            String.format("Moving WorkSpec (%s) to the foreground", str);
            c.d(new Throwable[0]);
            m mVar = (m) this.f23606g.remove(str);
            if (mVar != null) {
                if (this.f23601a == null) {
                    PowerManager.WakeLock a10 = y2.m.a(this.f23602b, "ProcessorForegroundLck");
                    this.f23601a = a10;
                    a10.acquire();
                }
                this.f23605f.put(str, mVar);
                androidx.core.content.a.startForegroundService(this.f23602b, androidx.work.impl.foreground.a.c(this.f23602b, str, dVar));
            }
        }
    }

    public final boolean h(String str, WorkerParameters.a aVar) {
        synchronized (this.f23610k) {
            if (e(str)) {
                o2.h c = o2.h.c();
                String.format("Work %s is already enqueued for processing", str);
                c.a(new Throwable[0]);
                return false;
            }
            m.a aVar2 = new m.a(this.f23602b, this.c, this.f23603d, this, this.f23604e, str);
            aVar2.f23663g = this.f23607h;
            if (aVar != null) {
                aVar2.f23664h = aVar;
            }
            m mVar = new m(aVar2);
            androidx.work.impl.utils.futures.a<Boolean> aVar3 = mVar.f23655q;
            aVar3.addListener(new a(this, str, aVar3), ((z2.b) this.f23603d).c);
            this.f23606g.put(str, mVar);
            ((z2.b) this.f23603d).f32218a.execute(mVar);
            o2.h c10 = o2.h.c();
            String.format("%s: processing %s", c.class.getSimpleName(), str);
            c10.a(new Throwable[0]);
            return true;
        }
    }

    public final void i() {
        synchronized (this.f23610k) {
            if (!(!this.f23605f.isEmpty())) {
                Context context = this.f23602b;
                int i10 = androidx.work.impl.foreground.a.f4967k;
                Intent intent = new Intent(context, SystemForegroundService.class);
                intent.setAction("ACTION_STOP_FOREGROUND");
                this.f23602b.startService(intent);
                PowerManager.WakeLock wakeLock = this.f23601a;
                if (wakeLock != null) {
                    wakeLock.release();
                    this.f23601a = null;
                }
            }
        }
    }

    public final boolean j(String str) {
        boolean c;
        synchronized (this.f23610k) {
            o2.h c10 = o2.h.c();
            String.format("Processor stopping foreground work %s", str);
            c10.a(new Throwable[0]);
            c = c(str, (m) this.f23605f.remove(str));
        }
        return c;
    }

    public final boolean k(String str) {
        boolean c;
        synchronized (this.f23610k) {
            o2.h c10 = o2.h.c();
            String.format("Processor stopping background work %s", str);
            c10.a(new Throwable[0]);
            c = c(str, (m) this.f23606g.remove(str));
        }
        return c;
    }
}

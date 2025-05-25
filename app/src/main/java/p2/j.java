package p2;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.room.RoomDatabase;
import androidx.work.WorkerParameters;
import androidx.work.a;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.a;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.impl.utils.ForceStopRunnable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import o2.h;
import pdf.pdfreader.viewer.editor.free.R;
import x2.r;

/* compiled from: WorkManagerImpl.java */
/* loaded from: classes.dex */
public final class j extends o2.l {

    /* renamed from: j  reason: collision with root package name */
    public static j f23624j;

    /* renamed from: k  reason: collision with root package name */
    public static j f23625k;

    /* renamed from: l  reason: collision with root package name */
    public static final Object f23626l;

    /* renamed from: a  reason: collision with root package name */
    public Context f23627a;

    /* renamed from: b  reason: collision with root package name */
    public androidx.work.a f23628b;
    public WorkDatabase c;

    /* renamed from: d  reason: collision with root package name */
    public z2.a f23629d;

    /* renamed from: e  reason: collision with root package name */
    public List<d> f23630e;

    /* renamed from: f  reason: collision with root package name */
    public c f23631f;

    /* renamed from: g  reason: collision with root package name */
    public y2.h f23632g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f23633h;

    /* renamed from: i  reason: collision with root package name */
    public BroadcastReceiver.PendingResult f23634i;

    static {
        o2.h.e("WorkManagerImpl");
        f23624j = null;
        f23625k = null;
        f23626l = new Object();
    }

    public j(Context context, androidx.work.a aVar, z2.b bVar) {
        RoomDatabase.a a10;
        boolean isDeviceProtectedStorage;
        boolean z10 = context.getResources().getBoolean(R.bool.workmanager_test_configuration);
        Context applicationContext = context.getApplicationContext();
        y2.j jVar = bVar.f32218a;
        int i10 = WorkDatabase.f4913k;
        if (z10) {
            a10 = new RoomDatabase.a(applicationContext, WorkDatabase.class, null);
            a10.f4637h = true;
        } else {
            String[] strArr = i.f23623a;
            a10 = androidx.room.b.a(applicationContext, WorkDatabase.class, "androidx.work.workdb");
            a10.f4636g = new g(applicationContext);
        }
        a10.f4634e = jVar;
        h hVar = new h();
        if (a10.f4633d == null) {
            a10.f4633d = new ArrayList<>();
        }
        a10.f4633d.add(hVar);
        a10.a(androidx.work.impl.a.f4923a);
        a10.a(new a.h(applicationContext, 2, 3));
        a10.a(androidx.work.impl.a.f4924b);
        a10.a(androidx.work.impl.a.c);
        a10.a(new a.h(applicationContext, 5, 6));
        a10.a(androidx.work.impl.a.f4925d);
        a10.a(androidx.work.impl.a.f4926e);
        a10.a(androidx.work.impl.a.f4927f);
        a10.a(new a.i(applicationContext));
        a10.a(new a.h(applicationContext, 10, 11));
        a10.a(androidx.work.impl.a.f4928g);
        a10.f4639j = false;
        a10.f4640k = true;
        WorkDatabase workDatabase = (WorkDatabase) a10.b();
        Context applicationContext2 = context.getApplicationContext();
        h.a aVar2 = new h.a(aVar.f4906f);
        synchronized (o2.h.class) {
            o2.h.f22685a = aVar2;
        }
        int i11 = e.f23613a;
        s2.b bVar2 = new s2.b(applicationContext2, this);
        y2.g.a(applicationContext2, SystemJobService.class, true);
        o2.h.c().a(new Throwable[0]);
        List<d> asList = Arrays.asList(bVar2, new q2.c(applicationContext2, aVar, bVar, this));
        c cVar = new c(context, aVar, bVar, workDatabase, asList);
        Context applicationContext3 = context.getApplicationContext();
        this.f23627a = applicationContext3;
        this.f23628b = aVar;
        this.f23629d = bVar;
        this.c = workDatabase;
        this.f23630e = asList;
        this.f23631f = cVar;
        this.f23632g = new y2.h(workDatabase);
        this.f23633h = false;
        if (Build.VERSION.SDK_INT >= 24) {
            isDeviceProtectedStorage = applicationContext3.isDeviceProtectedStorage();
            if (isDeviceProtectedStorage) {
                throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
            }
        }
        ((z2.b) this.f23629d).a(new ForceStopRunnable(applicationContext3, this));
    }

    @Deprecated
    public static j d() {
        synchronized (f23626l) {
            j jVar = f23624j;
            if (jVar != null) {
                return jVar;
            }
            return f23625k;
        }
    }

    public static j e(Context context) {
        j d10;
        synchronized (f23626l) {
            d10 = d();
            if (d10 == null) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext instanceof a.b) {
                    f(applicationContext, ((a.b) applicationContext).a());
                    d10 = e(applicationContext);
                } else {
                    throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                }
            }
        }
        return d10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0016, code lost:
        r4 = r4.getApplicationContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001c, code lost:
        if (p2.j.f23625k != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001e, code lost:
        p2.j.f23625k = new p2.j(r4, r5, new z2.b(r5.f4903b));
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
        p2.j.f23624j = p2.j.f23625k;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void f(android.content.Context r4, androidx.work.a r5) {
        /*
            java.lang.Object r0 = p2.j.f23626l
            monitor-enter(r0)
            p2.j r1 = p2.j.f23624j     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L14
            p2.j r2 = p2.j.f23625k     // Catch: java.lang.Throwable -> L32
            if (r2 != 0) goto Lc
            goto L14
        Lc:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L32
            java.lang.String r5 = "WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information."
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L32
            throw r4     // Catch: java.lang.Throwable -> L32
        L14:
            if (r1 != 0) goto L30
            android.content.Context r4 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> L32
            p2.j r1 = p2.j.f23625k     // Catch: java.lang.Throwable -> L32
            if (r1 != 0) goto L2c
            p2.j r1 = new p2.j     // Catch: java.lang.Throwable -> L32
            z2.b r2 = new z2.b     // Catch: java.lang.Throwable -> L32
            java.util.concurrent.ExecutorService r3 = r5.f4903b     // Catch: java.lang.Throwable -> L32
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L32
            r1.<init>(r4, r5, r2)     // Catch: java.lang.Throwable -> L32
            p2.j.f23625k = r1     // Catch: java.lang.Throwable -> L32
        L2c:
            p2.j r4 = p2.j.f23625k     // Catch: java.lang.Throwable -> L32
            p2.j.f23624j = r4     // Catch: java.lang.Throwable -> L32
        L30:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            return
        L32:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p2.j.f(android.content.Context, androidx.work.a):void");
    }

    @Override // o2.l
    public final b a(List list) {
        if (!list.isEmpty()) {
            f fVar = new f(this, list);
            if (!fVar.f23620h) {
                y2.e eVar = new y2.e(fVar);
                ((z2.b) this.f23629d).a(eVar);
                fVar.f23621i = eVar.f31999b;
            } else {
                o2.h c = o2.h.c();
                String.format("Already enqueued work ids (%s)", TextUtils.join(", ", fVar.f23617e));
                c.f(new Throwable[0]);
            }
            return fVar.f23621i;
        }
        throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
    }

    public final b c(UUID uuid) {
        y2.a aVar = new y2.a(this, uuid);
        ((z2.b) this.f23629d).a(aVar);
        return aVar.f31997a;
    }

    public final void g() {
        synchronized (f23626l) {
            this.f23633h = true;
            BroadcastReceiver.PendingResult pendingResult = this.f23634i;
            if (pendingResult != null) {
                pendingResult.finish();
                this.f23634i = null;
            }
        }
    }

    public final void h() {
        ArrayList f10;
        Context context = this.f23627a;
        int i10 = s2.b.f29703e;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null && (f10 = s2.b.f(context, jobScheduler)) != null && !f10.isEmpty()) {
            Iterator it = f10.iterator();
            while (it.hasNext()) {
                s2.b.b(jobScheduler, ((JobInfo) it.next()).getId());
            }
        }
        r rVar = (r) this.c.p();
        RoomDatabase roomDatabase = rVar.f31577a;
        roomDatabase.b();
        r.h hVar = rVar.f31584i;
        b2.e a10 = hVar.a();
        roomDatabase.c();
        try {
            a10.h();
            roomDatabase.j();
            roomDatabase.g();
            hVar.c(a10);
            e.a(this.f23628b, this.c, this.f23630e);
        } catch (Throwable th2) {
            roomDatabase.g();
            hVar.c(a10);
            throw th2;
        }
    }

    public final void i(String str, WorkerParameters.a aVar) {
        ((z2.b) this.f23629d).a(new y2.k(this, str, aVar));
    }

    public final void j(String str) {
        ((z2.b) this.f23629d).a(new y2.l(this, str, false));
    }
}

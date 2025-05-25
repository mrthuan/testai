package bk;

import com.google.android.gms.common.api.Api;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import kotlin.jvm.internal.g;
import lib.zj.office.fc.hpsf.Constants;

/* compiled from: TaskRunner.kt */
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: h  reason: collision with root package name */
    public static final b f5451h = new b();

    /* renamed from: i  reason: collision with root package name */
    public static final d f5452i;

    /* renamed from: j  reason: collision with root package name */
    public static final Logger f5453j;

    /* renamed from: a  reason: collision with root package name */
    public final a f5454a;
    public boolean c;

    /* renamed from: d  reason: collision with root package name */
    public long f5456d;

    /* renamed from: b  reason: collision with root package name */
    public int f5455b = Constants.CP_MAC_ROMAN;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList f5457e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList f5458f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    public final e f5459g = new e(this);

    /* compiled from: TaskRunner.kt */
    /* loaded from: classes3.dex */
    public interface a {
        void a(d dVar, long j10);

        void b(d dVar);

        long c();

        void execute(Runnable runnable);
    }

    /* compiled from: TaskRunner.kt */
    /* loaded from: classes3.dex */
    public static final class b {
    }

    /* compiled from: TaskRunner.kt */
    /* loaded from: classes3.dex */
    public static final class c implements a {

        /* renamed from: a  reason: collision with root package name */
        public final ThreadPoolExecutor f5460a;

        public c(ak.a aVar) {
            this.f5460a = new ThreadPoolExecutor(0, (int) Api.BaseClientBuilder.API_PRIORITY_OTHER, 60L, TimeUnit.SECONDS, new SynchronousQueue(), aVar);
        }

        @Override // bk.d.a
        public final void a(d taskRunner, long j10) {
            g.e(taskRunner, "taskRunner");
            long j11 = j10 / 1000000;
            long j12 = j10 - (1000000 * j11);
            if (j11 > 0 || j10 > 0) {
                taskRunner.wait(j11, (int) j12);
            }
        }

        @Override // bk.d.a
        public final void b(d taskRunner) {
            g.e(taskRunner, "taskRunner");
            taskRunner.notify();
        }

        @Override // bk.d.a
        public final long c() {
            return System.nanoTime();
        }

        @Override // bk.d.a
        public final void execute(Runnable runnable) {
            g.e(runnable, "runnable");
            this.f5460a.execute(runnable);
        }
    }

    static {
        String name = g.h(" TaskRunner", ak.b.f670g);
        g.e(name, "name");
        f5452i = new d(new c(new ak.a(name, true)));
        Logger logger = Logger.getLogger(d.class.getName());
        g.d(logger, "getLogger(TaskRunner::class.java.name)");
        f5453j = logger;
    }

    public d(c cVar) {
        this.f5454a = cVar;
    }

    public static final void a(d dVar, bk.a aVar) {
        dVar.getClass();
        byte[] bArr = ak.b.f665a;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(aVar.f5442a);
        try {
            long a10 = aVar.a();
            synchronized (dVar) {
                dVar.b(aVar, a10);
                tf.d dVar2 = tf.d.f30009a;
            }
            currentThread.setName(name);
        } catch (Throwable th2) {
            synchronized (dVar) {
                dVar.b(aVar, -1L);
                tf.d dVar3 = tf.d.f30009a;
                currentThread.setName(name);
                throw th2;
            }
        }
    }

    public final void b(bk.a aVar, long j10) {
        boolean z10;
        byte[] bArr = ak.b.f665a;
        bk.c cVar = aVar.c;
        g.b(cVar);
        if (cVar.f5448d == aVar) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            boolean z11 = cVar.f5450f;
            cVar.f5450f = false;
            cVar.f5448d = null;
            this.f5457e.remove(cVar);
            if (j10 != -1 && !z11 && !cVar.c) {
                cVar.e(aVar, j10, true);
            }
            if (!cVar.f5449e.isEmpty()) {
                this.f5458f.add(cVar);
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final bk.a c() {
        long j10;
        boolean z10;
        byte[] bArr = ak.b.f665a;
        while (true) {
            ArrayList arrayList = this.f5458f;
            if (arrayList.isEmpty()) {
                return null;
            }
            a aVar = this.f5454a;
            long c10 = aVar.c();
            Iterator it = arrayList.iterator();
            long j11 = Long.MAX_VALUE;
            bk.a aVar2 = null;
            while (true) {
                if (it.hasNext()) {
                    bk.a aVar3 = (bk.a) ((bk.c) it.next()).f5449e.get(0);
                    j10 = c10;
                    long max = Math.max(0L, aVar3.f5444d - c10);
                    if (max > 0) {
                        j11 = Math.min(max, j11);
                    } else if (aVar2 != null) {
                        z10 = true;
                        break;
                    } else {
                        aVar2 = aVar3;
                    }
                    c10 = j10;
                } else {
                    j10 = c10;
                    z10 = false;
                    break;
                }
            }
            if (aVar2 != null) {
                byte[] bArr2 = ak.b.f665a;
                aVar2.f5444d = -1L;
                bk.c cVar = aVar2.c;
                g.b(cVar);
                cVar.f5449e.remove(aVar2);
                arrayList.remove(cVar);
                cVar.f5448d = aVar2;
                this.f5457e.add(cVar);
                if (z10 || (!this.c && (!arrayList.isEmpty()))) {
                    aVar.execute(this.f5459g);
                }
                return aVar2;
            } else if (this.c) {
                if (j11 < this.f5456d - j10) {
                    aVar.b(this);
                    return null;
                }
                return null;
            } else {
                this.c = true;
                this.f5456d = j10 + j11;
                try {
                    try {
                        aVar.a(this, j11);
                    } catch (InterruptedException unused) {
                        d();
                    }
                } finally {
                    this.c = false;
                }
            }
        }
    }

    public final void d() {
        ArrayList arrayList = this.f5457e;
        int size = arrayList.size() - 1;
        if (size >= 0) {
            while (true) {
                int i10 = size - 1;
                ((bk.c) arrayList.get(size)).b();
                if (i10 < 0) {
                    break;
                }
                size = i10;
            }
        }
        ArrayList arrayList2 = this.f5458f;
        int size2 = arrayList2.size() - 1;
        if (size2 < 0) {
            return;
        }
        while (true) {
            int i11 = size2 - 1;
            bk.c cVar = (bk.c) arrayList2.get(size2);
            cVar.b();
            if (cVar.f5449e.isEmpty()) {
                arrayList2.remove(size2);
            }
            if (i11 >= 0) {
                size2 = i11;
            } else {
                return;
            }
        }
    }

    public final void e(bk.c taskQueue) {
        g.e(taskQueue, "taskQueue");
        byte[] bArr = ak.b.f665a;
        if (taskQueue.f5448d == null) {
            boolean z10 = !taskQueue.f5449e.isEmpty();
            ArrayList arrayList = this.f5458f;
            if (z10) {
                g.e(arrayList, "<this>");
                if (!arrayList.contains(taskQueue)) {
                    arrayList.add(taskQueue);
                }
            } else {
                arrayList.remove(taskQueue);
            }
        }
        boolean z11 = this.c;
        a aVar = this.f5454a;
        if (z11) {
            aVar.b(this);
        } else {
            aVar.execute(this.f5459g);
        }
    }

    public final bk.c f() {
        int i10;
        synchronized (this) {
            i10 = this.f5455b;
            this.f5455b = i10 + 1;
        }
        return new bk.c(this, g.h(Integer.valueOf(i10), OperatorName.RESTORE));
    }
}

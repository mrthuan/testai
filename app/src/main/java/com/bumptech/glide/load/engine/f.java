package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.DecodeJob;
import com.bumptech.glide.load.engine.g;
import com.bumptech.glide.request.SingleRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import q4.a;
import q4.d;
import v3.l;

/* compiled from: EngineJob.java */
/* loaded from: classes.dex */
public final class f<R> implements DecodeJob.b<R>, a.d {

    /* renamed from: y  reason: collision with root package name */
    public static final c f6983y = new c();

    /* renamed from: a  reason: collision with root package name */
    public final e f6984a;

    /* renamed from: b  reason: collision with root package name */
    public final d.a f6985b;
    public final g.a c;

    /* renamed from: d  reason: collision with root package name */
    public final w0.d<f<?>> f6986d;

    /* renamed from: e  reason: collision with root package name */
    public final c f6987e;

    /* renamed from: f  reason: collision with root package name */
    public final v3.g f6988f;

    /* renamed from: g  reason: collision with root package name */
    public final y3.a f6989g;

    /* renamed from: h  reason: collision with root package name */
    public final y3.a f6990h;

    /* renamed from: i  reason: collision with root package name */
    public final y3.a f6991i;

    /* renamed from: j  reason: collision with root package name */
    public final y3.a f6992j;

    /* renamed from: k  reason: collision with root package name */
    public final AtomicInteger f6993k;

    /* renamed from: l  reason: collision with root package name */
    public t3.b f6994l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f6995m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f6996n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f6997o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f6998p;

    /* renamed from: q  reason: collision with root package name */
    public l<?> f6999q;

    /* renamed from: r  reason: collision with root package name */
    public DataSource f7000r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f7001s;

    /* renamed from: t  reason: collision with root package name */
    public GlideException f7002t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f7003u;

    /* renamed from: v  reason: collision with root package name */
    public g<?> f7004v;

    /* renamed from: w  reason: collision with root package name */
    public DecodeJob<R> f7005w;

    /* renamed from: x  reason: collision with root package name */
    public volatile boolean f7006x;

    /* compiled from: EngineJob.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final l4.f f7007a;

        public a(l4.f fVar) {
            this.f7007a = fVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            SingleRequest singleRequest = (SingleRequest) this.f7007a;
            singleRequest.f7072a.a();
            synchronized (singleRequest.f7073b) {
                synchronized (f.this) {
                    e eVar = f.this.f6984a;
                    l4.f fVar = this.f7007a;
                    eVar.getClass();
                    if (eVar.f7013a.contains(new d(fVar, p4.e.f23695b))) {
                        f fVar2 = f.this;
                        l4.f fVar3 = this.f7007a;
                        fVar2.getClass();
                        ((SingleRequest) fVar3).k(fVar2.f7002t, 5);
                    }
                    f.this.d();
                }
            }
        }
    }

    /* compiled from: EngineJob.java */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final l4.f f7009a;

        public b(l4.f fVar) {
            this.f7009a = fVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            SingleRequest singleRequest = (SingleRequest) this.f7009a;
            singleRequest.f7072a.a();
            synchronized (singleRequest.f7073b) {
                synchronized (f.this) {
                    e eVar = f.this.f6984a;
                    l4.f fVar = this.f7009a;
                    eVar.getClass();
                    if (eVar.f7013a.contains(new d(fVar, p4.e.f23695b))) {
                        f.this.f7004v.b();
                        f fVar2 = f.this;
                        l4.f fVar3 = this.f7009a;
                        fVar2.getClass();
                        SingleRequest singleRequest2 = (SingleRequest) fVar3;
                        singleRequest2.l(fVar2.f7000r, fVar2.f7004v);
                        f.this.j(this.f7009a);
                    }
                    f.this.d();
                }
            }
        }
    }

    /* compiled from: EngineJob.java */
    /* loaded from: classes.dex */
    public static class c {
    }

    /* compiled from: EngineJob.java */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final l4.f f7011a;

        /* renamed from: b  reason: collision with root package name */
        public final Executor f7012b;

        public d(l4.f fVar, Executor executor) {
            this.f7011a = fVar;
            this.f7012b = executor;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof d) {
                return this.f7011a.equals(((d) obj).f7011a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f7011a.hashCode();
        }
    }

    /* compiled from: EngineJob.java */
    /* loaded from: classes.dex */
    public static final class e implements Iterable<d> {

        /* renamed from: a  reason: collision with root package name */
        public final List<d> f7013a;

        public e(ArrayList arrayList) {
            this.f7013a = arrayList;
        }

        @Override // java.lang.Iterable
        public final Iterator<d> iterator() {
            return this.f7013a.iterator();
        }
    }

    public f() {
        throw null;
    }

    public f(y3.a aVar, y3.a aVar2, y3.a aVar3, y3.a aVar4, v3.g gVar, g.a aVar5, a.c cVar) {
        c cVar2 = f6983y;
        this.f6984a = new e(new ArrayList(2));
        this.f6985b = new d.a();
        this.f6993k = new AtomicInteger();
        this.f6989g = aVar;
        this.f6990h = aVar2;
        this.f6991i = aVar3;
        this.f6992j = aVar4;
        this.f6988f = gVar;
        this.c = aVar5;
        this.f6986d = cVar;
        this.f6987e = cVar2;
    }

    public final synchronized void a(l4.f fVar, Executor executor) {
        this.f6985b.a();
        e eVar = this.f6984a;
        eVar.getClass();
        eVar.f7013a.add(new d(fVar, executor));
        boolean z10 = true;
        if (this.f7001s) {
            e(1);
            executor.execute(new b(fVar));
        } else if (this.f7003u) {
            e(1);
            executor.execute(new a(fVar));
        } else {
            if (this.f7006x) {
                z10 = false;
            }
            com.google.android.play.core.assetpacks.c.k("Cannot add callbacks to a cancelled EngineJob", z10);
        }
    }

    @Override // q4.a.d
    public final d.a b() {
        return this.f6985b;
    }

    public final void c() {
        Object obj;
        if (f()) {
            return;
        }
        this.f7006x = true;
        DecodeJob<R> decodeJob = this.f7005w;
        decodeJob.D = true;
        com.bumptech.glide.load.engine.c cVar = decodeJob.B;
        if (cVar != null) {
            cVar.cancel();
        }
        v3.g gVar = this.f6988f;
        t3.b bVar = this.f6994l;
        com.bumptech.glide.load.engine.e eVar = (com.bumptech.glide.load.engine.e) gVar;
        synchronized (eVar) {
            w1.f fVar = eVar.f6963a;
            fVar.getClass();
            if (this.f6998p) {
                obj = fVar.c;
            } else {
                obj = fVar.f30907b;
            }
            Map map = (Map) obj;
            if (equals(map.get(bVar))) {
                map.remove(bVar);
            }
        }
    }

    public final void d() {
        boolean z10;
        g<?> gVar;
        synchronized (this) {
            this.f6985b.a();
            com.google.android.play.core.assetpacks.c.k("Not yet complete!", f());
            int decrementAndGet = this.f6993k.decrementAndGet();
            if (decrementAndGet >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            com.google.android.play.core.assetpacks.c.k("Can't decrement below 0", z10);
            if (decrementAndGet == 0) {
                gVar = this.f7004v;
                i();
            } else {
                gVar = null;
            }
        }
        if (gVar != null) {
            gVar.d();
        }
    }

    public final synchronized void e(int i10) {
        g<?> gVar;
        com.google.android.play.core.assetpacks.c.k("Not yet complete!", f());
        if (this.f6993k.getAndAdd(i10) == 0 && (gVar = this.f7004v) != null) {
            gVar.b();
        }
    }

    public final boolean f() {
        if (!this.f7003u && !this.f7001s && !this.f7006x) {
            return false;
        }
        return true;
    }

    public final void g() {
        synchronized (this) {
            this.f6985b.a();
            if (this.f7006x) {
                i();
            } else if (!this.f6984a.f7013a.isEmpty()) {
                if (!this.f7003u) {
                    this.f7003u = true;
                    t3.b bVar = this.f6994l;
                    e eVar = this.f6984a;
                    eVar.getClass();
                    ArrayList<d> arrayList = new ArrayList(eVar.f7013a);
                    e(arrayList.size() + 1);
                    ((com.bumptech.glide.load.engine.e) this.f6988f).e(this, bVar, null);
                    for (d dVar : arrayList) {
                        dVar.f7012b.execute(new a(dVar.f7011a));
                    }
                    d();
                    return;
                }
                throw new IllegalStateException("Already failed once");
            } else {
                throw new IllegalStateException("Received an exception without any callbacks to notify");
            }
        }
    }

    public final void h() {
        synchronized (this) {
            this.f6985b.a();
            if (this.f7006x) {
                this.f6999q.a();
                i();
            } else if (!this.f6984a.f7013a.isEmpty()) {
                if (!this.f7001s) {
                    c cVar = this.f6987e;
                    l<?> lVar = this.f6999q;
                    boolean z10 = this.f6995m;
                    t3.b bVar = this.f6994l;
                    g.a aVar = this.c;
                    cVar.getClass();
                    this.f7004v = new g<>(lVar, z10, true, bVar, aVar);
                    this.f7001s = true;
                    e eVar = this.f6984a;
                    eVar.getClass();
                    ArrayList<d> arrayList = new ArrayList(eVar.f7013a);
                    e(arrayList.size() + 1);
                    ((com.bumptech.glide.load.engine.e) this.f6988f).e(this, this.f6994l, this.f7004v);
                    for (d dVar : arrayList) {
                        dVar.f7012b.execute(new b(dVar.f7011a));
                    }
                    d();
                    return;
                }
                throw new IllegalStateException("Already have resource");
            } else {
                throw new IllegalStateException("Received a resource without any callbacks to notify");
            }
        }
    }

    public final synchronized void i() {
        if (this.f6994l != null) {
            this.f6984a.f7013a.clear();
            this.f6994l = null;
            this.f7004v = null;
            this.f6999q = null;
            this.f7003u = false;
            this.f7006x = false;
            this.f7001s = false;
            this.f7005w.n();
            this.f7005w = null;
            this.f7002t = null;
            this.f7000r = null;
            this.f6986d.a(this);
        } else {
            throw new IllegalArgumentException();
        }
    }

    public final synchronized void j(l4.f fVar) {
        boolean z10;
        this.f6985b.a();
        e eVar = this.f6984a;
        eVar.getClass();
        eVar.f7013a.remove(new d(fVar, p4.e.f23695b));
        if (this.f6984a.f7013a.isEmpty()) {
            c();
            if (!this.f7001s && !this.f7003u) {
                z10 = false;
                if (z10 && this.f6993k.get() == 0) {
                    i();
                }
            }
            z10 = true;
            if (z10) {
                i();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0017 A[Catch: all -> 0x002f, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000d, B:11:0x0017, B:19:0x002a, B:12:0x001a, B:14:0x001e, B:15:0x0021, B:17:0x0025, B:18:0x0028), top: B:25:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001a A[Catch: all -> 0x002f, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000d, B:11:0x0017, B:19:0x002a, B:12:0x001a, B:14:0x001e, B:15:0x0021, B:17:0x0025, B:18:0x0028), top: B:25:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void k(com.bumptech.glide.load.engine.DecodeJob<R> r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            r2.f7005w = r3     // Catch: java.lang.Throwable -> L2f
            com.bumptech.glide.load.engine.DecodeJob$Stage r0 = com.bumptech.glide.load.engine.DecodeJob.Stage.INITIALIZE     // Catch: java.lang.Throwable -> L2f
            com.bumptech.glide.load.engine.DecodeJob$Stage r0 = r3.i(r0)     // Catch: java.lang.Throwable -> L2f
            com.bumptech.glide.load.engine.DecodeJob$Stage r1 = com.bumptech.glide.load.engine.DecodeJob.Stage.RESOURCE_CACHE     // Catch: java.lang.Throwable -> L2f
            if (r0 == r1) goto L14
            com.bumptech.glide.load.engine.DecodeJob$Stage r1 = com.bumptech.glide.load.engine.DecodeJob.Stage.DATA_CACHE     // Catch: java.lang.Throwable -> L2f
            if (r0 != r1) goto L12
            goto L14
        L12:
            r0 = 0
            goto L15
        L14:
            r0 = 1
        L15:
            if (r0 == 0) goto L1a
            y3.a r0 = r2.f6989g     // Catch: java.lang.Throwable -> L2f
            goto L2a
        L1a:
            boolean r0 = r2.f6996n     // Catch: java.lang.Throwable -> L2f
            if (r0 == 0) goto L21
            y3.a r0 = r2.f6991i     // Catch: java.lang.Throwable -> L2f
            goto L2a
        L21:
            boolean r0 = r2.f6997o     // Catch: java.lang.Throwable -> L2f
            if (r0 == 0) goto L28
            y3.a r0 = r2.f6992j     // Catch: java.lang.Throwable -> L2f
            goto L2a
        L28:
            y3.a r0 = r2.f6990h     // Catch: java.lang.Throwable -> L2f
        L2a:
            r0.execute(r3)     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r2)
            return
        L2f:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.f.k(com.bumptech.glide.load.engine.DecodeJob):void");
    }
}

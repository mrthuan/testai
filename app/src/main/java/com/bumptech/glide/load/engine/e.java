package com.bumptech.glide.load.engine;

import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.DecodeJob;
import com.bumptech.glide.load.engine.a;
import com.bumptech.glide.load.engine.g;
import com.bumptech.glide.request.SingleRequest;
import java.io.File;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;
import q4.a;
import v3.l;
import v3.n;
import x3.a;
import x3.h;

/* compiled from: Engine.java */
/* loaded from: classes.dex */
public final class e implements v3.g, h.a, g.a {

    /* renamed from: h  reason: collision with root package name */
    public static final boolean f6962h = Log.isLoggable("Engine", 2);

    /* renamed from: a  reason: collision with root package name */
    public final w1.f f6963a;

    /* renamed from: b  reason: collision with root package name */
    public final o9.d f6964b;
    public final x3.h c;

    /* renamed from: d  reason: collision with root package name */
    public final b f6965d;

    /* renamed from: e  reason: collision with root package name */
    public final n f6966e;

    /* renamed from: f  reason: collision with root package name */
    public final a f6967f;

    /* renamed from: g  reason: collision with root package name */
    public final com.bumptech.glide.load.engine.a f6968g;

    /* compiled from: Engine.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final DecodeJob.e f6969a;

        /* renamed from: b  reason: collision with root package name */
        public final a.c f6970b = q4.a.a(ShapeTypes.FLOW_CHART_EXTRACT, new C0054a());
        public int c;

        /* compiled from: Engine.java */
        /* renamed from: com.bumptech.glide.load.engine.e$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0054a implements a.b<DecodeJob<?>> {
            public C0054a() {
            }

            @Override // q4.a.b
            public final DecodeJob<?> a() {
                a aVar = a.this;
                return new DecodeJob<>(aVar.f6969a, aVar.f6970b);
            }
        }

        public a(c cVar) {
            this.f6969a = cVar;
        }
    }

    /* compiled from: Engine.java */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final y3.a f6972a;

        /* renamed from: b  reason: collision with root package name */
        public final y3.a f6973b;
        public final y3.a c;

        /* renamed from: d  reason: collision with root package name */
        public final y3.a f6974d;

        /* renamed from: e  reason: collision with root package name */
        public final v3.g f6975e;

        /* renamed from: f  reason: collision with root package name */
        public final g.a f6976f;

        /* renamed from: g  reason: collision with root package name */
        public final a.c f6977g = q4.a.a(ShapeTypes.FLOW_CHART_EXTRACT, new a());

        /* compiled from: Engine.java */
        /* loaded from: classes.dex */
        public class a implements a.b<f<?>> {
            public a() {
            }

            @Override // q4.a.b
            public final f<?> a() {
                b bVar = b.this;
                return new f<>(bVar.f6972a, bVar.f6973b, bVar.c, bVar.f6974d, bVar.f6975e, bVar.f6976f, bVar.f6977g);
            }
        }

        public b(y3.a aVar, y3.a aVar2, y3.a aVar3, y3.a aVar4, v3.g gVar, g.a aVar5) {
            this.f6972a = aVar;
            this.f6973b = aVar2;
            this.c = aVar3;
            this.f6974d = aVar4;
            this.f6975e = gVar;
            this.f6976f = aVar5;
        }
    }

    /* compiled from: Engine.java */
    /* loaded from: classes.dex */
    public static class c implements DecodeJob.e {

        /* renamed from: a  reason: collision with root package name */
        public final a.InterfaceC0404a f6979a;

        /* renamed from: b  reason: collision with root package name */
        public volatile x3.a f6980b;

        public c(a.InterfaceC0404a interfaceC0404a) {
            this.f6979a = interfaceC0404a;
        }

        public final x3.a a() {
            if (this.f6980b == null) {
                synchronized (this) {
                    if (this.f6980b == null) {
                        x3.c cVar = (x3.c) this.f6979a;
                        x3.e eVar = (x3.e) cVar.f31598b;
                        File cacheDir = eVar.f31603a.getCacheDir();
                        x3.d dVar = null;
                        if (cacheDir == null) {
                            cacheDir = null;
                        } else {
                            String str = eVar.f31604b;
                            if (str != null) {
                                cacheDir = new File(cacheDir, str);
                            }
                        }
                        if (cacheDir != null && (cacheDir.mkdirs() || (cacheDir.exists() && cacheDir.isDirectory()))) {
                            dVar = new x3.d(cacheDir, cVar.f31597a);
                        }
                        this.f6980b = dVar;
                    }
                    if (this.f6980b == null) {
                        this.f6980b = new ge.a();
                    }
                }
            }
            return this.f6980b;
        }
    }

    /* compiled from: Engine.java */
    /* loaded from: classes.dex */
    public class d {

        /* renamed from: a  reason: collision with root package name */
        public final f<?> f6981a;

        /* renamed from: b  reason: collision with root package name */
        public final l4.f f6982b;

        public d(l4.f fVar, f<?> fVar2) {
            this.f6982b = fVar;
            this.f6981a = fVar2;
        }
    }

    public e(x3.h hVar, a.InterfaceC0404a interfaceC0404a, y3.a aVar, y3.a aVar2, y3.a aVar3, y3.a aVar4) {
        this.c = hVar;
        c cVar = new c(interfaceC0404a);
        com.bumptech.glide.load.engine.a aVar5 = new com.bumptech.glide.load.engine.a();
        this.f6968g = aVar5;
        synchronized (this) {
            synchronized (aVar5) {
                aVar5.f6934e = this;
            }
        }
        this.f6964b = new o9.d();
        this.f6963a = new w1.f(1);
        this.f6965d = new b(aVar, aVar2, aVar3, aVar4, this, this);
        this.f6967f = new a(cVar);
        this.f6966e = new n();
        ((x3.g) hVar).f31605d = this;
    }

    public static void f(l lVar) {
        if (lVar instanceof g) {
            ((g) lVar).d();
            return;
        }
        throw new IllegalArgumentException("Cannot release anything but an EngineResource");
    }

    @Override // com.bumptech.glide.load.engine.g.a
    public final void a(t3.b bVar, g<?> gVar) {
        com.bumptech.glide.load.engine.a aVar = this.f6968g;
        synchronized (aVar) {
            a.C0053a c0053a = (a.C0053a) aVar.c.remove(bVar);
            if (c0053a != null) {
                c0053a.c = null;
                c0053a.clear();
            }
        }
        if (gVar.f7014a) {
            ((x3.g) this.c).d(bVar, gVar);
        } else {
            this.f6966e.a(gVar, false);
        }
    }

    public final d b(com.bumptech.glide.d dVar, Object obj, t3.b bVar, int i10, int i11, Class cls, Class cls2, Priority priority, v3.f fVar, p4.b bVar2, boolean z10, boolean z11, t3.e eVar, boolean z12, boolean z13, boolean z14, boolean z15, l4.f fVar2, Executor executor) {
        long j10;
        if (f6962h) {
            int i12 = p4.f.f23697a;
            j10 = SystemClock.elapsedRealtimeNanos();
        } else {
            j10 = 0;
        }
        long j11 = j10;
        this.f6964b.getClass();
        v3.h hVar = new v3.h(obj, bVar, i10, i11, bVar2, cls, cls2, eVar);
        synchronized (this) {
            try {
                g<?> d10 = d(hVar, z12, j11);
                if (d10 == null) {
                    return g(dVar, obj, bVar, i10, i11, cls, cls2, priority, fVar, bVar2, z10, z11, eVar, z12, z13, z14, z15, fVar2, executor, hVar, j11);
                }
                ((SingleRequest) fVar2).l(DataSource.MEMORY_CACHE, d10);
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final g<?> c(t3.b bVar) {
        Object remove;
        g<?> gVar;
        x3.g gVar2 = (x3.g) this.c;
        synchronized (gVar2) {
            remove = gVar2.f23698a.remove(bVar);
            if (remove != null) {
                gVar2.c -= gVar2.b(remove);
            }
        }
        l lVar = (l) remove;
        if (lVar == null) {
            gVar = null;
        } else if (lVar instanceof g) {
            gVar = (g) lVar;
        } else {
            gVar = new g<>(lVar, true, true, bVar, this);
        }
        if (gVar != null) {
            gVar.b();
            this.f6968g.a(bVar, gVar);
        }
        return gVar;
    }

    public final g<?> d(v3.h hVar, boolean z10, long j10) {
        g<?> gVar;
        if (!z10) {
            return null;
        }
        com.bumptech.glide.load.engine.a aVar = this.f6968g;
        synchronized (aVar) {
            a.C0053a c0053a = (a.C0053a) aVar.c.get(hVar);
            if (c0053a == null) {
                gVar = null;
            } else {
                gVar = c0053a.get();
                if (gVar == null) {
                    aVar.b(c0053a);
                }
            }
        }
        if (gVar != null) {
            gVar.b();
        }
        if (gVar != null) {
            if (f6962h) {
                int i10 = p4.f.f23697a;
                SystemClock.elapsedRealtimeNanos();
                Objects.toString(hVar);
            }
            return gVar;
        }
        g<?> c10 = c(hVar);
        if (c10 == null) {
            return null;
        }
        if (f6962h) {
            int i11 = p4.f.f23697a;
            SystemClock.elapsedRealtimeNanos();
            Objects.toString(hVar);
        }
        return c10;
    }

    public final synchronized void e(f<?> fVar, t3.b bVar, g<?> gVar) {
        Object obj;
        if (gVar != null) {
            if (gVar.f7014a) {
                this.f6968g.a(bVar, gVar);
            }
        }
        w1.f fVar2 = this.f6963a;
        fVar2.getClass();
        if (fVar.f6998p) {
            obj = fVar2.c;
        } else {
            obj = fVar2.f30907b;
        }
        Map map = (Map) obj;
        if (fVar.equals(map.get(bVar))) {
            map.remove(bVar);
        }
    }

    public final d g(com.bumptech.glide.d dVar, Object obj, t3.b bVar, int i10, int i11, Class cls, Class cls2, Priority priority, v3.f fVar, p4.b bVar2, boolean z10, boolean z11, t3.e eVar, boolean z12, boolean z13, boolean z14, boolean z15, l4.f fVar2, Executor executor, v3.h hVar, long j10) {
        w1.f fVar3 = this.f6963a;
        f fVar4 = (f) ((Map) (z15 ? fVar3.c : fVar3.f30907b)).get(hVar);
        if (fVar4 != null) {
            fVar4.a(fVar2, executor);
            if (f6962h) {
                int i12 = p4.f.f23697a;
                SystemClock.elapsedRealtimeNanos();
                Objects.toString(hVar);
            }
            return new d(fVar2, fVar4);
        }
        f fVar5 = (f) this.f6965d.f6977g.b();
        com.google.android.play.core.assetpacks.c.l(fVar5);
        synchronized (fVar5) {
            fVar5.f6994l = hVar;
            fVar5.f6995m = z12;
            fVar5.f6996n = z13;
            fVar5.f6997o = z14;
            fVar5.f6998p = z15;
        }
        a aVar = this.f6967f;
        DecodeJob decodeJob = (DecodeJob) aVar.f6970b.b();
        com.google.android.play.core.assetpacks.c.l(decodeJob);
        int i13 = aVar.c;
        aVar.c = i13 + 1;
        com.bumptech.glide.load.engine.d<R> dVar2 = decodeJob.f6893a;
        dVar2.c = dVar;
        dVar2.f6947d = obj;
        dVar2.f6957n = bVar;
        dVar2.f6948e = i10;
        dVar2.f6949f = i11;
        dVar2.f6959p = fVar;
        dVar2.f6950g = cls;
        dVar2.f6951h = decodeJob.f6895d;
        dVar2.f6954k = cls2;
        dVar2.f6958o = priority;
        dVar2.f6952i = eVar;
        dVar2.f6953j = bVar2;
        dVar2.f6960q = z10;
        dVar2.f6961r = z11;
        decodeJob.f6899h = dVar;
        decodeJob.f6900i = bVar;
        decodeJob.f6901j = priority;
        decodeJob.f6902k = hVar;
        decodeJob.f6903l = i10;
        decodeJob.f6904m = i11;
        decodeJob.f6905n = fVar;
        decodeJob.f6911t = z15;
        decodeJob.f6906o = eVar;
        decodeJob.f6907p = fVar5;
        decodeJob.f6908q = i13;
        decodeJob.f6910s = DecodeJob.RunReason.INITIALIZE;
        decodeJob.f6912u = obj;
        w1.f fVar6 = this.f6963a;
        fVar6.getClass();
        ((Map) (fVar5.f6998p ? fVar6.c : fVar6.f30907b)).put(hVar, fVar5);
        fVar5.a(fVar2, executor);
        fVar5.k(decodeJob);
        if (f6962h) {
            int i14 = p4.f.f23697a;
            SystemClock.elapsedRealtimeNanos();
            Objects.toString(hVar);
        }
        return new d(fVar2, fVar5);
    }
}

package com.bumptech.glide.load.engine;

import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.data.e;
import com.bumptech.glide.load.engine.c;
import com.bumptech.glide.load.engine.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import q4.a;
import q4.d;
import v3.j;
import v3.k;
import v3.l;

/* loaded from: classes.dex */
public final class DecodeJob<R> implements c.a, Runnable, Comparable<DecodeJob<?>>, a.d {
    public com.bumptech.glide.load.data.d<?> A;
    public volatile com.bumptech.glide.load.engine.c B;
    public volatile boolean C;
    public volatile boolean D;

    /* renamed from: d  reason: collision with root package name */
    public final e f6895d;

    /* renamed from: e  reason: collision with root package name */
    public final w0.d<DecodeJob<?>> f6896e;

    /* renamed from: h  reason: collision with root package name */
    public com.bumptech.glide.d f6899h;

    /* renamed from: i  reason: collision with root package name */
    public t3.b f6900i;

    /* renamed from: j  reason: collision with root package name */
    public Priority f6901j;

    /* renamed from: k  reason: collision with root package name */
    public v3.h f6902k;

    /* renamed from: l  reason: collision with root package name */
    public int f6903l;

    /* renamed from: m  reason: collision with root package name */
    public int f6904m;

    /* renamed from: n  reason: collision with root package name */
    public v3.f f6905n;

    /* renamed from: o  reason: collision with root package name */
    public t3.e f6906o;

    /* renamed from: p  reason: collision with root package name */
    public b<R> f6907p;

    /* renamed from: q  reason: collision with root package name */
    public int f6908q;

    /* renamed from: r  reason: collision with root package name */
    public Stage f6909r;

    /* renamed from: s  reason: collision with root package name */
    public RunReason f6910s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f6911t;

    /* renamed from: u  reason: collision with root package name */
    public Object f6912u;

    /* renamed from: v  reason: collision with root package name */
    public Thread f6913v;

    /* renamed from: w  reason: collision with root package name */
    public t3.b f6914w;

    /* renamed from: x  reason: collision with root package name */
    public t3.b f6915x;

    /* renamed from: y  reason: collision with root package name */
    public Object f6916y;

    /* renamed from: z  reason: collision with root package name */
    public DataSource f6917z;

    /* renamed from: a  reason: collision with root package name */
    public final com.bumptech.glide.load.engine.d<R> f6893a = new com.bumptech.glide.load.engine.d<>();

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f6894b = new ArrayList();
    public final d.a c = new d.a();

    /* renamed from: f  reason: collision with root package name */
    public final d<?> f6897f = new d<>();

    /* renamed from: g  reason: collision with root package name */
    public final f f6898g = new f();

    /* loaded from: classes.dex */
    public enum RunReason {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    /* loaded from: classes.dex */
    public enum Stage {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f6920a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f6921b;
        public static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[EncodeStrategy.values().length];
            c = iArr;
            try {
                iArr[EncodeStrategy.SOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                c[EncodeStrategy.TRANSFORMED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[Stage.values().length];
            f6921b = iArr2;
            try {
                iArr2[Stage.RESOURCE_CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6921b[Stage.DATA_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6921b[Stage.SOURCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6921b[Stage.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f6921b[Stage.INITIALIZE.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[RunReason.values().length];
            f6920a = iArr3;
            try {
                iArr3[RunReason.INITIALIZE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f6920a[RunReason.SWITCH_TO_SOURCE_SERVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f6920a[RunReason.DECODE_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b<R> {
    }

    /* loaded from: classes.dex */
    public final class c<Z> {

        /* renamed from: a  reason: collision with root package name */
        public final DataSource f6922a;

        public c(DataSource dataSource) {
            this.f6922a = dataSource;
        }
    }

    /* loaded from: classes.dex */
    public static class d<Z> {

        /* renamed from: a  reason: collision with root package name */
        public t3.b f6924a;

        /* renamed from: b  reason: collision with root package name */
        public t3.g<Z> f6925b;
        public k<Z> c;
    }

    /* loaded from: classes.dex */
    public interface e {
    }

    /* loaded from: classes.dex */
    public static class f {

        /* renamed from: a  reason: collision with root package name */
        public boolean f6926a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f6927b;
        public boolean c;

        public final boolean a() {
            if ((this.c || this.f6927b) && this.f6926a) {
                return true;
            }
            return false;
        }
    }

    public DecodeJob(e eVar, a.c cVar) {
        this.f6895d = eVar;
        this.f6896e = cVar;
    }

    @Override // com.bumptech.glide.load.engine.c.a
    public final void a(t3.b bVar, Exception exc, com.bumptech.glide.load.data.d<?> dVar, DataSource dataSource) {
        y3.a aVar;
        dVar.b();
        GlideException glideException = new GlideException("Fetching data failed", exc);
        glideException.setLoggingDetails(bVar, dataSource, dVar.a());
        this.f6894b.add(glideException);
        if (Thread.currentThread() != this.f6913v) {
            this.f6910s = RunReason.SWITCH_TO_SOURCE_SERVICE;
            com.bumptech.glide.load.engine.f fVar = (com.bumptech.glide.load.engine.f) this.f6907p;
            if (fVar.f6996n) {
                aVar = fVar.f6991i;
            } else if (fVar.f6997o) {
                aVar = fVar.f6992j;
            } else {
                aVar = fVar.f6990h;
            }
            aVar.execute(this);
            return;
        }
        p();
    }

    @Override // q4.a.d
    public final d.a b() {
        return this.c;
    }

    @Override // com.bumptech.glide.load.engine.c.a
    public final void c(t3.b bVar, Object obj, com.bumptech.glide.load.data.d<?> dVar, DataSource dataSource, t3.b bVar2) {
        y3.a aVar;
        this.f6914w = bVar;
        this.f6916y = obj;
        this.A = dVar;
        this.f6917z = dataSource;
        this.f6915x = bVar2;
        if (Thread.currentThread() != this.f6913v) {
            this.f6910s = RunReason.DECODE_DATA;
            com.bumptech.glide.load.engine.f fVar = (com.bumptech.glide.load.engine.f) this.f6907p;
            if (fVar.f6996n) {
                aVar = fVar.f6991i;
            } else if (fVar.f6997o) {
                aVar = fVar.f6992j;
            } else {
                aVar = fVar.f6990h;
            }
            aVar.execute(this);
            return;
        }
        g();
    }

    @Override // java.lang.Comparable
    public final int compareTo(DecodeJob<?> decodeJob) {
        DecodeJob<?> decodeJob2 = decodeJob;
        int ordinal = this.f6901j.ordinal() - decodeJob2.f6901j.ordinal();
        if (ordinal == 0) {
            return this.f6908q - decodeJob2.f6908q;
        }
        return ordinal;
    }

    @Override // com.bumptech.glide.load.engine.c.a
    public final void d() {
        y3.a aVar;
        this.f6910s = RunReason.SWITCH_TO_SOURCE_SERVICE;
        com.bumptech.glide.load.engine.f fVar = (com.bumptech.glide.load.engine.f) this.f6907p;
        if (fVar.f6996n) {
            aVar = fVar.f6991i;
        } else if (fVar.f6997o) {
            aVar = fVar.f6992j;
        } else {
            aVar = fVar.f6990h;
        }
        aVar.execute(this);
    }

    public final <Data> l<R> e(com.bumptech.glide.load.data.d<?> dVar, Data data, DataSource dataSource) {
        if (data == null) {
            dVar.b();
            return null;
        }
        try {
            int i10 = p4.f.f23697a;
            SystemClock.elapsedRealtimeNanos();
            l<R> f10 = f(data, dataSource);
            if (Log.isLoggable("DecodeJob", 2)) {
                f10.toString();
                SystemClock.elapsedRealtimeNanos();
                Objects.toString(this.f6902k);
                Thread.currentThread().getName();
            }
            return f10;
        } finally {
            dVar.b();
        }
    }

    public final <Data> l<R> f(Data data, DataSource dataSource) {
        com.bumptech.glide.load.data.e b10;
        boolean z10;
        j<Data, ?, R> c10 = this.f6893a.c(data.getClass());
        t3.e eVar = this.f6906o;
        if (Build.VERSION.SDK_INT >= 26) {
            if (dataSource != DataSource.RESOURCE_DISK_CACHE && !this.f6893a.f6961r) {
                z10 = false;
            } else {
                z10 = true;
            }
            t3.d<Boolean> dVar = com.bumptech.glide.load.resource.bitmap.a.f7055i;
            Boolean bool = (Boolean) eVar.c(dVar);
            if (bool == null || (bool.booleanValue() && !z10)) {
                eVar = new t3.e();
                eVar.f29923b.i(this.f6906o.f29923b);
                eVar.f29923b.put(dVar, Boolean.valueOf(z10));
            }
        }
        t3.e eVar2 = eVar;
        com.bumptech.glide.load.data.f fVar = this.f6899h.f6842b.f6825e;
        synchronized (fVar) {
            e.a aVar = (e.a) fVar.f6879a.get(data.getClass());
            if (aVar == null) {
                Iterator it = fVar.f6879a.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    e.a aVar2 = (e.a) it.next();
                    if (aVar2.a().isAssignableFrom(data.getClass())) {
                        aVar = aVar2;
                        break;
                    }
                }
            }
            if (aVar == null) {
                aVar = com.bumptech.glide.load.data.f.f6878b;
            }
            b10 = aVar.b(data);
        }
        try {
            return c10.a(this.f6903l, this.f6904m, eVar2, b10, new c(dataSource));
        } finally {
            b10.b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g() {
        l lVar;
        boolean z10;
        if (Log.isLoggable("DecodeJob", 2)) {
            String str = "data: " + this.f6916y + ", cache key: " + this.f6914w + ", fetcher: " + this.A;
            int i10 = p4.f.f23697a;
            SystemClock.elapsedRealtimeNanos();
            Objects.toString(this.f6902k);
            if (str != null) {
                ", ".concat(str);
            }
            Thread.currentThread().getName();
        }
        k kVar = null;
        try {
            lVar = (l<R>) e(this.A, this.f6916y, this.f6917z);
        } catch (GlideException e10) {
            e10.setLoggingDetails(this.f6915x, this.f6917z);
            this.f6894b.add(e10);
            lVar = (l<R>) null;
        }
        if (lVar != null) {
            DataSource dataSource = this.f6917z;
            if (lVar instanceof v3.i) {
                ((v3.i) lVar).initialize();
            }
            boolean z11 = true;
            if (this.f6897f.c != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                kVar = (k) k.f30521e.b();
                com.google.android.play.core.assetpacks.c.l(kVar);
                kVar.f30524d = false;
                kVar.c = true;
                kVar.f30523b = lVar;
                lVar = kVar;
            }
            r();
            com.bumptech.glide.load.engine.f fVar = (com.bumptech.glide.load.engine.f) this.f6907p;
            synchronized (fVar) {
                fVar.f6999q = lVar;
                fVar.f7000r = dataSource;
            }
            fVar.h();
            this.f6909r = Stage.ENCODE;
            try {
                d<?> dVar = this.f6897f;
                if (dVar.c == null) {
                    z11 = false;
                }
                if (z11) {
                    e eVar = this.f6895d;
                    t3.e eVar2 = this.f6906o;
                    dVar.getClass();
                    ((e.c) eVar).a().f(dVar.f6924a, new v3.d(dVar.f6925b, dVar.c, eVar2));
                    dVar.c.d();
                }
                k();
                return;
            } finally {
                if (kVar != null) {
                    kVar.d();
                }
            }
        }
        p();
    }

    public final com.bumptech.glide.load.engine.c h() {
        int i10 = a.f6921b[this.f6909r.ordinal()];
        com.bumptech.glide.load.engine.d<R> dVar = this.f6893a;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 == 4) {
                        return null;
                    }
                    throw new IllegalStateException("Unrecognized stage: " + this.f6909r);
                }
                return new i(dVar, this);
            }
            return new com.bumptech.glide.load.engine.b(dVar.a(), dVar, this);
        }
        return new h(dVar, this);
    }

    public final Stage i(Stage stage) {
        int i10 = a.f6921b[stage.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3 && i10 != 4) {
                    if (i10 == 5) {
                        if (this.f6905n.b()) {
                            return Stage.RESOURCE_CACHE;
                        }
                        return i(Stage.RESOURCE_CACHE);
                    }
                    throw new IllegalArgumentException("Unrecognized stage: " + stage);
                }
                return Stage.FINISHED;
            } else if (this.f6911t) {
                return Stage.FINISHED;
            } else {
                return Stage.SOURCE;
            }
        } else if (this.f6905n.a()) {
            return Stage.DATA_CACHE;
        } else {
            return i(Stage.DATA_CACHE);
        }
    }

    public final void j() {
        r();
        GlideException glideException = new GlideException("Failed to load resource", new ArrayList(this.f6894b));
        com.bumptech.glide.load.engine.f fVar = (com.bumptech.glide.load.engine.f) this.f6907p;
        synchronized (fVar) {
            fVar.f7002t = glideException;
        }
        fVar.g();
        m();
    }

    public final void k() {
        boolean a10;
        f fVar = this.f6898g;
        synchronized (fVar) {
            fVar.f6927b = true;
            a10 = fVar.a();
        }
        if (a10) {
            o();
        }
    }

    public final void m() {
        boolean a10;
        f fVar = this.f6898g;
        synchronized (fVar) {
            fVar.c = true;
            a10 = fVar.a();
        }
        if (a10) {
            o();
        }
    }

    public final void n() {
        boolean a10;
        f fVar = this.f6898g;
        synchronized (fVar) {
            fVar.f6926a = true;
            a10 = fVar.a();
        }
        if (a10) {
            o();
        }
    }

    public final void o() {
        f fVar = this.f6898g;
        synchronized (fVar) {
            fVar.f6927b = false;
            fVar.f6926a = false;
            fVar.c = false;
        }
        d<?> dVar = this.f6897f;
        dVar.f6924a = null;
        dVar.f6925b = null;
        dVar.c = null;
        com.bumptech.glide.load.engine.d<R> dVar2 = this.f6893a;
        dVar2.c = null;
        dVar2.f6947d = null;
        dVar2.f6957n = null;
        dVar2.f6950g = null;
        dVar2.f6954k = null;
        dVar2.f6952i = null;
        dVar2.f6958o = null;
        dVar2.f6953j = null;
        dVar2.f6959p = null;
        dVar2.f6945a.clear();
        dVar2.f6955l = false;
        dVar2.f6946b.clear();
        dVar2.f6956m = false;
        this.C = false;
        this.f6899h = null;
        this.f6900i = null;
        this.f6906o = null;
        this.f6901j = null;
        this.f6902k = null;
        this.f6907p = null;
        this.f6909r = null;
        this.B = null;
        this.f6913v = null;
        this.f6914w = null;
        this.f6916y = null;
        this.f6917z = null;
        this.A = null;
        this.D = false;
        this.f6912u = null;
        this.f6894b.clear();
        this.f6896e.a(this);
    }

    public final void p() {
        this.f6913v = Thread.currentThread();
        int i10 = p4.f.f23697a;
        SystemClock.elapsedRealtimeNanos();
        boolean z10 = false;
        while (!this.D && this.B != null && !(z10 = this.B.b())) {
            this.f6909r = i(this.f6909r);
            this.B = h();
            if (this.f6909r == Stage.SOURCE) {
                d();
                return;
            }
        }
        if ((this.f6909r == Stage.FINISHED || this.D) && !z10) {
            j();
        }
    }

    public final void q() {
        int i10 = a.f6920a[this.f6910s.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    g();
                    return;
                }
                throw new IllegalStateException("Unrecognized run reason: " + this.f6910s);
            }
            p();
            return;
        }
        this.f6909r = i(Stage.INITIALIZE);
        this.B = h();
        p();
    }

    public final void r() {
        Throwable th2;
        this.c.a();
        if (this.C) {
            if (this.f6894b.isEmpty()) {
                th2 = null;
            } else {
                th2 = (Throwable) androidx.appcompat.view.menu.d.b(this.f6894b, 1);
            }
            throw new IllegalStateException("Already notified", th2);
        }
        this.C = true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.bumptech.glide.load.data.d<?> dVar = this.A;
        try {
            try {
                if (this.D) {
                    j();
                    if (dVar != null) {
                        return;
                    }
                    return;
                }
                q();
                if (dVar != null) {
                    dVar.b();
                }
            } catch (CallbackException e10) {
                throw e10;
            } catch (Throwable th2) {
                if (Log.isLoggable("DecodeJob", 3)) {
                    Objects.toString(this.f6909r);
                }
                if (this.f6909r != Stage.ENCODE) {
                    this.f6894b.add(th2);
                    j();
                }
                if (!this.D) {
                    throw th2;
                }
                throw th2;
            }
        } finally {
            if (dVar != null) {
                dVar.b();
            }
        }
    }
}

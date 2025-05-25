package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import java.util.Map;
import s.b;

/* loaded from: classes.dex */
public abstract class LiveData<T> {

    /* renamed from: k  reason: collision with root package name */
    public static final Object f3987k = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final Object f3988a;

    /* renamed from: b  reason: collision with root package name */
    public final s.b<x<? super T>, LiveData<T>.c> f3989b;
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f3990d;

    /* renamed from: e  reason: collision with root package name */
    public volatile Object f3991e;

    /* renamed from: f  reason: collision with root package name */
    public volatile Object f3992f;

    /* renamed from: g  reason: collision with root package name */
    public int f3993g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f3994h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f3995i;

    /* renamed from: j  reason: collision with root package name */
    public final a f3996j;

    /* loaded from: classes.dex */
    public class LifecycleBoundObserver extends LiveData<T>.c implements n {

        /* renamed from: e  reason: collision with root package name */
        public final p f3997e;

        public LifecycleBoundObserver(p pVar, x<? super T> xVar) {
            super(xVar);
            this.f3997e = pVar;
        }

        @Override // androidx.lifecycle.n
        public final void d(p pVar, Lifecycle.Event event) {
            p pVar2 = this.f3997e;
            Lifecycle.State b10 = pVar2.getLifecycle().b();
            if (b10 == Lifecycle.State.DESTROYED) {
                LiveData.this.i(this.f4000a);
                return;
            }
            Lifecycle.State state = null;
            while (state != b10) {
                c(j());
                state = b10;
                b10 = pVar2.getLifecycle().b();
            }
        }

        @Override // androidx.lifecycle.LiveData.c
        public final void f() {
            this.f3997e.getLifecycle().c(this);
        }

        @Override // androidx.lifecycle.LiveData.c
        public final boolean g(p pVar) {
            if (this.f3997e == pVar) {
                return true;
            }
            return false;
        }

        @Override // androidx.lifecycle.LiveData.c
        public final boolean j() {
            return this.f3997e.getLifecycle().b().isAtLeast(Lifecycle.State.STARTED);
        }
    }

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            Object obj;
            synchronized (LiveData.this.f3988a) {
                obj = LiveData.this.f3992f;
                LiveData.this.f3992f = LiveData.f3987k;
            }
            LiveData.this.j(obj);
        }
    }

    /* loaded from: classes.dex */
    public class b extends LiveData<T>.c {
        @Override // androidx.lifecycle.LiveData.c
        public final boolean j() {
            return true;
        }
    }

    public LiveData(T t4) {
        this.f3988a = new Object();
        this.f3989b = new s.b<>();
        this.c = 0;
        this.f3992f = f3987k;
        this.f3996j = new a();
        this.f3991e = t4;
        this.f3993g = 0;
    }

    public static void a(String str) {
        if (r.b.m().n()) {
            return;
        }
        throw new IllegalStateException(a6.h.d("Cannot invoke ", str, " on a background thread"));
    }

    public final void b(LiveData<T>.c cVar) {
        if (!cVar.f4001b) {
            return;
        }
        if (!cVar.j()) {
            cVar.c(false);
            return;
        }
        int i10 = cVar.c;
        int i11 = this.f3993g;
        if (i10 >= i11) {
            return;
        }
        cVar.c = i11;
        cVar.f4000a.m((Object) this.f3991e);
    }

    public final void c(LiveData<T>.c cVar) {
        if (this.f3994h) {
            this.f3995i = true;
            return;
        }
        this.f3994h = true;
        do {
            this.f3995i = false;
            if (cVar != null) {
                b(cVar);
                cVar = null;
            } else {
                s.b<x<? super T>, LiveData<T>.c> bVar = this.f3989b;
                bVar.getClass();
                b.d dVar = new b.d();
                bVar.c.put(dVar, Boolean.FALSE);
                while (dVar.hasNext()) {
                    b((c) ((Map.Entry) dVar.next()).getValue());
                    if (this.f3995i) {
                        break;
                    }
                }
            }
        } while (this.f3995i);
        this.f3994h = false;
    }

    public final T d() {
        T t4 = (T) this.f3991e;
        if (t4 != f3987k) {
            return t4;
        }
        return null;
    }

    public final void e(p pVar, x<? super T> xVar) {
        a("observe");
        if (pVar.getLifecycle().b() == Lifecycle.State.DESTROYED) {
            return;
        }
        LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(pVar, xVar);
        LiveData<T>.c b10 = this.f3989b.b(xVar, lifecycleBoundObserver);
        if (b10 != null && !b10.g(pVar)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (b10 != null) {
            return;
        }
        pVar.getLifecycle().a(lifecycleBoundObserver);
    }

    public final void f(x<? super T> xVar) {
        a("observeForever");
        b bVar = new b(xVar);
        LiveData<T>.c b10 = this.f3989b.b(xVar, bVar);
        if (!(b10 instanceof LifecycleBoundObserver)) {
            if (b10 != null) {
                return;
            }
            bVar.c(true);
            return;
        }
        throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
    }

    public void i(x<? super T> xVar) {
        a("removeObserver");
        LiveData<T>.c c10 = this.f3989b.c(xVar);
        if (c10 == null) {
            return;
        }
        c10.f();
        c10.c(false);
    }

    public void j(T t4) {
        a("setValue");
        this.f3993g++;
        this.f3991e = t4;
        c(null);
    }

    public LiveData() {
        this.f3988a = new Object();
        this.f3989b = new s.b<>();
        this.c = 0;
        Object obj = f3987k;
        this.f3992f = obj;
        this.f3996j = new a();
        this.f3991e = obj;
        this.f3993g = -1;
    }

    /* loaded from: classes.dex */
    public abstract class c {

        /* renamed from: a  reason: collision with root package name */
        public final x<? super T> f4000a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f4001b;
        public int c = -1;

        public c(x<? super T> xVar) {
            this.f4000a = xVar;
        }

        public final void c(boolean z10) {
            int i10;
            boolean z11;
            boolean z12;
            if (z10 == this.f4001b) {
                return;
            }
            this.f4001b = z10;
            if (z10) {
                i10 = 1;
            } else {
                i10 = -1;
            }
            LiveData liveData = LiveData.this;
            int i11 = liveData.c;
            liveData.c = i10 + i11;
            if (!liveData.f3990d) {
                liveData.f3990d = true;
                while (true) {
                    try {
                        int i12 = liveData.c;
                        if (i11 == i12) {
                            break;
                        }
                        if (i11 == 0 && i12 > 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (i11 > 0 && i12 == 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z11) {
                            liveData.g();
                        } else if (z12) {
                            liveData.h();
                        }
                        i11 = i12;
                    } finally {
                        liveData.f3990d = false;
                    }
                }
            }
            if (this.f4001b) {
                liveData.c(this);
            }
        }

        public boolean g(p pVar) {
            return false;
        }

        public abstract boolean j();

        public void f() {
        }
    }

    public void g() {
    }

    public void h() {
    }
}

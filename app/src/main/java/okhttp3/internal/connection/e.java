package okhttp3.internal.connection;

import com.google.android.play.core.assetpacks.b1;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.k;
import okhttp3.m;
import okhttp3.s;
import okhttp3.t;

/* compiled from: RealCall.kt */
/* loaded from: classes3.dex */
public final class e implements okhttp3.e {

    /* renamed from: a  reason: collision with root package name */
    public final s f23293a;

    /* renamed from: b  reason: collision with root package name */
    public final t f23294b;
    public final boolean c;

    /* renamed from: d  reason: collision with root package name */
    public final h f23295d;

    /* renamed from: e  reason: collision with root package name */
    public final m f23296e;

    /* renamed from: f  reason: collision with root package name */
    public final c f23297f;

    /* renamed from: g  reason: collision with root package name */
    public final AtomicBoolean f23298g;

    /* renamed from: h  reason: collision with root package name */
    public Object f23299h;

    /* renamed from: i  reason: collision with root package name */
    public d f23300i;

    /* renamed from: j  reason: collision with root package name */
    public f f23301j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f23302k;

    /* renamed from: l  reason: collision with root package name */
    public okhttp3.internal.connection.c f23303l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f23304m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f23305n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f23306o;

    /* renamed from: p  reason: collision with root package name */
    public volatile boolean f23307p;

    /* renamed from: q  reason: collision with root package name */
    public volatile okhttp3.internal.connection.c f23308q;

    /* renamed from: r  reason: collision with root package name */
    public volatile f f23309r;

    /* compiled from: RealCall.kt */
    /* loaded from: classes3.dex */
    public final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final okhttp3.f f23310a;

        /* renamed from: b  reason: collision with root package name */
        public volatile AtomicInteger f23311b;
        public final /* synthetic */ e c;

        public a(e this$0, okhttp3.f fVar) {
            kotlin.jvm.internal.g.e(this$0, "this$0");
            this.c = this$0;
            this.f23310a = fVar;
            this.f23311b = new AtomicInteger(0);
        }

        @Override // java.lang.Runnable
        public final void run() {
            s sVar;
            String h10 = kotlin.jvm.internal.g.h(this.c.f23294b.f23428a.f(), "OkHttp ");
            e eVar = this.c;
            Thread currentThread = Thread.currentThread();
            String name = currentThread.getName();
            currentThread.setName(h10);
            try {
                eVar.f23297f.h();
                boolean z10 = false;
                try {
                    try {
                        this.f23310a.a(eVar, eVar.g());
                        sVar = eVar.f23293a;
                    } catch (IOException e10) {
                        e = e10;
                        z10 = true;
                        if (z10) {
                            gk.h hVar = gk.h.f17912a;
                            gk.h hVar2 = gk.h.f17912a;
                            String h11 = kotlin.jvm.internal.g.h(e.a(eVar), "Callback failure for ");
                            hVar2.getClass();
                            gk.h.i(4, h11, e);
                        } else {
                            this.f23310a.b(eVar, e);
                        }
                        sVar = eVar.f23293a;
                        sVar.f23383a.b(this);
                    } catch (Throwable th2) {
                        th = th2;
                        z10 = true;
                        eVar.cancel();
                        if (!z10) {
                            IOException iOException = new IOException(kotlin.jvm.internal.g.h(th, "canceled due to "));
                            b1.n(iOException, th);
                            this.f23310a.b(eVar, iOException);
                        }
                        throw th;
                    }
                } catch (IOException e11) {
                    e = e11;
                } catch (Throwable th3) {
                    th = th3;
                }
                sVar.f23383a.b(this);
            } finally {
                currentThread.setName(name);
            }
        }
    }

    /* compiled from: RealCall.kt */
    /* loaded from: classes3.dex */
    public static final class b extends WeakReference<e> {

        /* renamed from: a  reason: collision with root package name */
        public final Object f23312a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e referent, Object obj) {
            super(referent);
            kotlin.jvm.internal.g.e(referent, "referent");
            this.f23312a = obj;
        }
    }

    /* compiled from: RealCall.kt */
    /* loaded from: classes3.dex */
    public static final class c extends kk.a {
        public c() {
        }

        @Override // kk.a
        public final void k() {
            e.this.cancel();
        }
    }

    public e(s client, t originalRequest, boolean z10) {
        kotlin.jvm.internal.g.e(client, "client");
        kotlin.jvm.internal.g.e(originalRequest, "originalRequest");
        this.f23293a = client;
        this.f23294b = originalRequest;
        this.c = z10;
        this.f23295d = (h) client.f23384b.f21833a;
        m this_asFactory = (m) client.f23386e.f1924b;
        byte[] bArr = ak.b.f665a;
        kotlin.jvm.internal.g.e(this_asFactory, "$this_asFactory");
        this.f23296e = this_asFactory;
        c cVar = new c();
        cVar.g(0, TimeUnit.MILLISECONDS);
        this.f23297f = cVar;
        this.f23298g = new AtomicBoolean();
        this.f23306o = true;
    }

    public static final String a(e eVar) {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder();
        if (eVar.f23307p) {
            str = "canceled ";
        } else {
            str = "";
        }
        sb2.append(str);
        if (eVar.c) {
            str2 = "web socket";
        } else {
            str2 = "call";
        }
        sb2.append(str2);
        sb2.append(" to ");
        sb2.append(eVar.f23294b.f23428a.f());
        return sb2.toString();
    }

    @Override // okhttp3.e
    public final boolean b() {
        return this.f23307p;
    }

    public final void c(f fVar) {
        boolean z10;
        byte[] bArr = ak.b.f665a;
        if (this.f23301j == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f23301j = fVar;
            fVar.f23327p.add(new b(this, this.f23299h));
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @Override // okhttp3.e
    public final void cancel() {
        Socket socket;
        if (this.f23307p) {
            return;
        }
        this.f23307p = true;
        okhttp3.internal.connection.c cVar = this.f23308q;
        if (cVar != null) {
            cVar.f23271d.cancel();
        }
        f fVar = this.f23309r;
        if (fVar != null && (socket = fVar.c) != null) {
            ak.b.d(socket);
        }
        this.f23296e.getClass();
    }

    public final Object clone() {
        return new e(this.f23293a, this.f23294b, this.c);
    }

    public final <E extends IOException> E d(E e10) {
        E e11;
        Socket j10;
        boolean z10;
        byte[] bArr = ak.b.f665a;
        f fVar = this.f23301j;
        if (fVar != null) {
            synchronized (fVar) {
                j10 = j();
            }
            if (this.f23301j == null) {
                if (j10 != null) {
                    ak.b.d(j10);
                }
                this.f23296e.getClass();
            } else {
                if (j10 == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
        }
        if (this.f23302k || !this.f23297f.i()) {
            e11 = e10;
        } else {
            e11 = new InterruptedIOException("timeout");
            if (e10 != null) {
                e11.initCause(e10);
            }
        }
        if (e10 != null) {
            m mVar = this.f23296e;
            kotlin.jvm.internal.g.b(e11);
            mVar.getClass();
        } else {
            this.f23296e.getClass();
        }
        return e11;
    }

    public final void e(okhttp3.f fVar) {
        a aVar;
        if (this.f23298g.compareAndSet(false, true)) {
            gk.h hVar = gk.h.f17912a;
            this.f23299h = gk.h.f17912a.g();
            this.f23296e.getClass();
            k kVar = this.f23293a.f23383a;
            a aVar2 = new a(this, fVar);
            kVar.getClass();
            synchronized (kVar) {
                kVar.f23353b.add(aVar2);
                e eVar = aVar2.c;
                if (!eVar.c) {
                    String str = eVar.f23294b.f23428a.f23366d;
                    Iterator<a> it = kVar.c.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            aVar = it.next();
                            if (kotlin.jvm.internal.g.a(aVar.c.f23294b.f23428a.f23366d, str)) {
                                break;
                            }
                        } else {
                            Iterator<a> it2 = kVar.f23353b.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    aVar = it2.next();
                                    if (kotlin.jvm.internal.g.a(aVar.c.f23294b.f23428a.f23366d, str)) {
                                        break;
                                    }
                                } else {
                                    aVar = null;
                                    break;
                                }
                            }
                        }
                    }
                    if (aVar != null) {
                        aVar2.f23311b = aVar.f23311b;
                    }
                }
                tf.d dVar = tf.d.f30009a;
            }
            kVar.g();
            return;
        }
        throw new IllegalStateException("Already Executed".toString());
    }

    public final void f(boolean z10) {
        okhttp3.internal.connection.c cVar;
        synchronized (this) {
            if (this.f23306o) {
                tf.d dVar = tf.d.f30009a;
            } else {
                throw new IllegalStateException("released".toString());
            }
        }
        if (z10 && (cVar = this.f23308q) != null) {
            cVar.f23271d.cancel();
            cVar.f23269a.h(cVar, true, true, null);
        }
        this.f23303l = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final okhttp3.x g() {
        /*
            r10 = this;
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            okhttp3.s r0 = r10.f23293a
            java.util.List<okhttp3.q> r0 = r0.c
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            kotlin.collections.k.k0(r0, r2)
            ck.h r0 = new ck.h
            okhttp3.s r1 = r10.f23293a
            r0.<init>(r1)
            r2.add(r0)
            ck.a r0 = new ck.a
            okhttp3.s r1 = r10.f23293a
            ge.a r1 = r1.f23391j
            r0.<init>(r1)
            r2.add(r0)
            okhttp3.internal.cache.a r0 = new okhttp3.internal.cache.a
            okhttp3.s r1 = r10.f23293a
            okhttp3.c r1 = r1.f23392k
            r0.<init>(r1)
            r2.add(r0)
            okhttp3.internal.connection.a r0 = okhttp3.internal.connection.a.f23265a
            r2.add(r0)
            boolean r0 = r10.c
            if (r0 != 0) goto L42
            okhttp3.s r0 = r10.f23293a
            java.util.List<okhttp3.q> r0 = r0.f23385d
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            kotlin.collections.k.k0(r0, r2)
        L42:
            ck.b r0 = new ck.b
            boolean r1 = r10.c
            r0.<init>(r1)
            r2.add(r0)
            ck.f r9 = new ck.f
            r3 = 0
            r4 = 0
            okhttp3.t r5 = r10.f23294b
            okhttp3.s r0 = r10.f23293a
            int r6 = r0.f23404w
            int r7 = r0.f23405x
            int r8 = r0.f23406y
            r0 = r9
            r1 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = 0
            okhttp3.t r1 = r10.f23294b     // Catch: java.lang.Throwable -> L79 java.io.IOException -> L7c
            okhttp3.x r1 = r9.c(r1)     // Catch: java.lang.Throwable -> L79 java.io.IOException -> L7c
            boolean r2 = r10.f23307p     // Catch: java.lang.Throwable -> L79 java.io.IOException -> L7c
            if (r2 != 0) goto L6e
            r10.i(r0)
            return r1
        L6e:
            ak.b.c(r1)     // Catch: java.lang.Throwable -> L79 java.io.IOException -> L7c
            java.io.IOException r1 = new java.io.IOException     // Catch: java.lang.Throwable -> L79 java.io.IOException -> L7c
            java.lang.String r2 = "Canceled"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L79 java.io.IOException -> L7c
            throw r1     // Catch: java.lang.Throwable -> L79 java.io.IOException -> L7c
        L79:
            r1 = move-exception
            r2 = 0
            goto L8e
        L7c:
            r1 = move-exception
            java.io.IOException r1 = r10.i(r1)     // Catch: java.lang.Throwable -> L8c
            if (r1 != 0) goto L8b
            java.lang.NullPointerException r1 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L8c
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Throwable"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L8c
            throw r1     // Catch: java.lang.Throwable -> L8c
        L8b:
            throw r1     // Catch: java.lang.Throwable -> L8c
        L8c:
            r1 = move-exception
            r2 = 1
        L8e:
            if (r2 != 0) goto L93
            r10.i(r0)
        L93:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.e.g():okhttp3.x");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0021 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:8:0x0012, B:17:0x0021, B:19:0x0025, B:20:0x0027, B:22:0x002c, B:27:0x0035, B:29:0x0039, B:34:0x0042, B:14:0x001b), top: B:47:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0025 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:8:0x0012, B:17:0x0021, B:19:0x0025, B:20:0x0027, B:22:0x002c, B:27:0x0035, B:29:0x0039, B:34:0x0042, B:14:0x001b), top: B:47:0x0012 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <E extends java.io.IOException> E h(okhttp3.internal.connection.c r2, boolean r3, boolean r4, E r5) {
        /*
            r1 = this;
            java.lang.String r0 = "exchange"
            kotlin.jvm.internal.g.e(r2, r0)
            okhttp3.internal.connection.c r0 = r1.f23308q
            boolean r2 = kotlin.jvm.internal.g.a(r2, r0)
            if (r2 != 0) goto Le
            return r5
        Le:
            monitor-enter(r1)
            r2 = 0
            if (r3 == 0) goto L19
            boolean r0 = r1.f23304m     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L1f
            goto L19
        L17:
            r2 = move-exception
            goto L5a
        L19:
            if (r4 == 0) goto L41
            boolean r0 = r1.f23305n     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L41
        L1f:
            if (r3 == 0) goto L23
            r1.f23304m = r2     // Catch: java.lang.Throwable -> L17
        L23:
            if (r4 == 0) goto L27
            r1.f23305n = r2     // Catch: java.lang.Throwable -> L17
        L27:
            boolean r3 = r1.f23304m     // Catch: java.lang.Throwable -> L17
            r4 = 1
            if (r3 != 0) goto L32
            boolean r0 = r1.f23305n     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L32
            r0 = r4
            goto L33
        L32:
            r0 = r2
        L33:
            if (r3 != 0) goto L3e
            boolean r3 = r1.f23305n     // Catch: java.lang.Throwable -> L17
            if (r3 != 0) goto L3e
            boolean r3 = r1.f23306o     // Catch: java.lang.Throwable -> L17
            if (r3 != 0) goto L3e
            r2 = r4
        L3e:
            r3 = r2
            r2 = r0
            goto L42
        L41:
            r3 = r2
        L42:
            tf.d r4 = tf.d.f30009a     // Catch: java.lang.Throwable -> L17
            monitor-exit(r1)
            if (r2 == 0) goto L52
            r2 = 0
            r1.f23308q = r2
            okhttp3.internal.connection.f r2 = r1.f23301j
            if (r2 != 0) goto L4f
            goto L52
        L4f:
            r2.h()
        L52:
            if (r3 == 0) goto L59
            java.io.IOException r2 = r1.d(r5)
            return r2
        L59:
            return r5
        L5a:
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.e.h(okhttp3.internal.connection.c, boolean, boolean, java.io.IOException):java.io.IOException");
    }

    public final IOException i(IOException iOException) {
        boolean z10;
        synchronized (this) {
            z10 = false;
            if (this.f23306o) {
                this.f23306o = false;
                if (!this.f23304m && !this.f23305n) {
                    z10 = true;
                }
            }
            tf.d dVar = tf.d.f30009a;
        }
        if (z10) {
            return d(iOException);
        }
        return iOException;
    }

    public final Socket j() {
        boolean z10;
        f fVar = this.f23301j;
        kotlin.jvm.internal.g.b(fVar);
        byte[] bArr = ak.b.f665a;
        ArrayList arrayList = fVar.f23327p;
        Iterator it = arrayList.iterator();
        boolean z11 = false;
        int i10 = 0;
        while (true) {
            if (it.hasNext()) {
                if (kotlin.jvm.internal.g.a(((Reference) it.next()).get(), this)) {
                    break;
                }
                i10++;
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            arrayList.remove(i10);
            this.f23301j = null;
            if (arrayList.isEmpty()) {
                fVar.f23328q = System.nanoTime();
                h hVar = this.f23295d;
                hVar.getClass();
                byte[] bArr2 = ak.b.f665a;
                boolean z12 = fVar.f23321j;
                bk.c cVar = hVar.c;
                if (!z12 && hVar.f23331a != 0) {
                    cVar.c(hVar.f23333d, 0L);
                } else {
                    fVar.f23321j = true;
                    ConcurrentLinkedQueue<f> concurrentLinkedQueue = hVar.f23334e;
                    concurrentLinkedQueue.remove(fVar);
                    if (concurrentLinkedQueue.isEmpty()) {
                        cVar.a();
                    }
                    z11 = true;
                }
                if (z11) {
                    Socket socket = fVar.f23315d;
                    kotlin.jvm.internal.g.b(socket);
                    return socket;
                }
            }
            return null;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}

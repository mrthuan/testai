package ek;

import ek.o;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Ref$IntRef;
import lib.zj.office.fc.hpsf.Variant;
import okhttp3.internal.http2.ErrorCode;
import okio.ByteString;

/* compiled from: Http2Connection.kt */
/* loaded from: classes3.dex */
public final class d implements Closeable {
    public static final t B;
    public final LinkedHashSet A;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f16671a;

    /* renamed from: b  reason: collision with root package name */
    public final b f16672b;
    public final LinkedHashMap c;

    /* renamed from: d  reason: collision with root package name */
    public final String f16673d;

    /* renamed from: e  reason: collision with root package name */
    public int f16674e;

    /* renamed from: f  reason: collision with root package name */
    public int f16675f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f16676g;

    /* renamed from: h  reason: collision with root package name */
    public final bk.d f16677h;

    /* renamed from: i  reason: collision with root package name */
    public final bk.c f16678i;

    /* renamed from: j  reason: collision with root package name */
    public final bk.c f16679j;

    /* renamed from: k  reason: collision with root package name */
    public final bk.c f16680k;

    /* renamed from: l  reason: collision with root package name */
    public final androidx.activity.s f16681l;

    /* renamed from: m  reason: collision with root package name */
    public long f16682m;

    /* renamed from: n  reason: collision with root package name */
    public long f16683n;

    /* renamed from: o  reason: collision with root package name */
    public long f16684o;

    /* renamed from: p  reason: collision with root package name */
    public long f16685p;

    /* renamed from: q  reason: collision with root package name */
    public long f16686q;

    /* renamed from: r  reason: collision with root package name */
    public final t f16687r;

    /* renamed from: s  reason: collision with root package name */
    public t f16688s;

    /* renamed from: t  reason: collision with root package name */
    public long f16689t;

    /* renamed from: u  reason: collision with root package name */
    public long f16690u;

    /* renamed from: v  reason: collision with root package name */
    public long f16691v;

    /* renamed from: w  reason: collision with root package name */
    public long f16692w;

    /* renamed from: x  reason: collision with root package name */
    public final Socket f16693x;

    /* renamed from: y  reason: collision with root package name */
    public final q f16694y;

    /* renamed from: z  reason: collision with root package name */
    public final c f16695z;

    /* compiled from: Http2Connection.kt */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f16696a;

        /* renamed from: b  reason: collision with root package name */
        public final bk.d f16697b;
        public Socket c;

        /* renamed from: d  reason: collision with root package name */
        public String f16698d;

        /* renamed from: e  reason: collision with root package name */
        public kk.h f16699e;

        /* renamed from: f  reason: collision with root package name */
        public kk.g f16700f;

        /* renamed from: g  reason: collision with root package name */
        public b f16701g;

        /* renamed from: h  reason: collision with root package name */
        public final androidx.activity.s f16702h;

        /* renamed from: i  reason: collision with root package name */
        public int f16703i;

        public a(bk.d taskRunner) {
            kotlin.jvm.internal.g.e(taskRunner, "taskRunner");
            this.f16696a = true;
            this.f16697b = taskRunner;
            this.f16701g = b.f16704a;
            this.f16702h = s.f16787a;
        }
    }

    /* compiled from: Http2Connection.kt */
    /* loaded from: classes3.dex */
    public static abstract class b {

        /* renamed from: a  reason: collision with root package name */
        public static final a f16704a = new a();

        /* compiled from: Http2Connection.kt */
        /* loaded from: classes3.dex */
        public static final class a extends b {
            @Override // ek.d.b
            public final void b(p stream) {
                kotlin.jvm.internal.g.e(stream, "stream");
                stream.c(ErrorCode.REFUSED_STREAM, null);
            }
        }

        public void a(d connection, t settings) {
            kotlin.jvm.internal.g.e(connection, "connection");
            kotlin.jvm.internal.g.e(settings, "settings");
        }

        public abstract void b(p pVar);
    }

    /* compiled from: TaskQueue.kt */
    /* renamed from: ek.d$d  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0213d extends bk.a {

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ d f16707e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ long f16708f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0213d(String str, d dVar, long j10) {
            super(str, true);
            this.f16707e = dVar;
            this.f16708f = j10;
        }

        @Override // bk.a
        public final long a() {
            d dVar;
            boolean z10;
            synchronized (this.f16707e) {
                dVar = this.f16707e;
                long j10 = dVar.f16683n;
                long j11 = dVar.f16682m;
                if (j10 < j11) {
                    z10 = true;
                } else {
                    dVar.f16682m = j11 + 1;
                    z10 = false;
                }
            }
            if (z10) {
                dVar.b(null);
                return -1L;
            }
            try {
                dVar.f16694y.h(1, 0, false);
            } catch (IOException e10) {
                dVar.b(e10);
            }
            return this.f16708f;
        }
    }

    /* compiled from: TaskQueue.kt */
    /* loaded from: classes3.dex */
    public static final class e extends bk.a {

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ d f16709e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ int f16710f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ ErrorCode f16711g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, d dVar, int i10, ErrorCode errorCode) {
            super(str, true);
            this.f16709e = dVar;
            this.f16710f = i10;
            this.f16711g = errorCode;
        }

        @Override // bk.a
        public final long a() {
            d dVar = this.f16709e;
            try {
                int i10 = this.f16710f;
                ErrorCode statusCode = this.f16711g;
                dVar.getClass();
                kotlin.jvm.internal.g.e(statusCode, "statusCode");
                dVar.f16694y.i(i10, statusCode);
                return -1L;
            } catch (IOException e10) {
                dVar.b(e10);
                return -1L;
            }
        }
    }

    /* compiled from: TaskQueue.kt */
    /* loaded from: classes3.dex */
    public static final class f extends bk.a {

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ d f16712e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ int f16713f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ long f16714g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, d dVar, int i10, long j10) {
            super(str, true);
            this.f16712e = dVar;
            this.f16713f = i10;
            this.f16714g = j10;
        }

        @Override // bk.a
        public final long a() {
            d dVar = this.f16712e;
            try {
                dVar.f16694y.k(this.f16713f, this.f16714g);
                return -1L;
            } catch (IOException e10) {
                dVar.b(e10);
                return -1L;
            }
        }
    }

    static {
        t tVar = new t();
        tVar.c(7, Variant.VT_ILLEGAL);
        tVar.c(5, 16384);
        B = tVar;
    }

    public d(a aVar) {
        int i10;
        boolean z10 = aVar.f16696a;
        this.f16671a = z10;
        this.f16672b = aVar.f16701g;
        this.c = new LinkedHashMap();
        String str = aVar.f16698d;
        if (str != null) {
            this.f16673d = str;
            if (z10) {
                i10 = 3;
            } else {
                i10 = 2;
            }
            this.f16675f = i10;
            bk.d dVar = aVar.f16697b;
            this.f16677h = dVar;
            bk.c f10 = dVar.f();
            this.f16678i = f10;
            this.f16679j = dVar.f();
            this.f16680k = dVar.f();
            this.f16681l = aVar.f16702h;
            t tVar = new t();
            if (z10) {
                tVar.c(7, 16777216);
            }
            this.f16687r = tVar;
            t tVar2 = B;
            this.f16688s = tVar2;
            this.f16692w = tVar2.a();
            Socket socket = aVar.c;
            if (socket != null) {
                this.f16693x = socket;
                kk.g gVar = aVar.f16700f;
                if (gVar != null) {
                    this.f16694y = new q(gVar, z10);
                    kk.h hVar = aVar.f16699e;
                    if (hVar != null) {
                        this.f16695z = new c(this, new o(hVar, z10));
                        this.A = new LinkedHashSet();
                        int i11 = aVar.f16703i;
                        if (i11 != 0) {
                            long nanos = TimeUnit.MILLISECONDS.toNanos(i11);
                            f10.c(new C0213d(kotlin.jvm.internal.g.h(" ping", str), this, nanos), nanos);
                            return;
                        }
                        return;
                    }
                    kotlin.jvm.internal.g.i("source");
                    throw null;
                }
                kotlin.jvm.internal.g.i("sink");
                throw null;
            }
            kotlin.jvm.internal.g.i("socket");
            throw null;
        }
        kotlin.jvm.internal.g.i("connectionName");
        throw null;
    }

    public final void a(ErrorCode connectionCode, ErrorCode streamCode, IOException iOException) {
        int i10;
        Object[] objArr;
        kotlin.jvm.internal.g.e(connectionCode, "connectionCode");
        kotlin.jvm.internal.g.e(streamCode, "streamCode");
        byte[] bArr = ak.b.f665a;
        try {
            h(connectionCode);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (!this.c.isEmpty()) {
                objArr = this.c.values().toArray(new p[0]);
                if (objArr != null) {
                    this.c.clear();
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                }
            } else {
                objArr = null;
            }
            tf.d dVar = tf.d.f30009a;
        }
        p[] pVarArr = (p[]) objArr;
        if (pVarArr != null) {
            for (p pVar : pVarArr) {
                try {
                    pVar.c(streamCode, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f16694y.close();
        } catch (IOException unused3) {
        }
        try {
            this.f16693x.close();
        } catch (IOException unused4) {
        }
        this.f16678i.f();
        this.f16679j.f();
        this.f16680k.f();
    }

    public final void b(IOException iOException) {
        ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
        a(errorCode, errorCode, iOException);
    }

    public final synchronized p c(int i10) {
        return (p) this.c.get(Integer.valueOf(i10));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a(ErrorCode.NO_ERROR, ErrorCode.CANCEL, null);
    }

    public final synchronized boolean d(long j10) {
        if (this.f16676g) {
            return false;
        }
        if (this.f16685p < this.f16684o) {
            if (j10 >= this.f16686q) {
                return false;
            }
        }
        return true;
    }

    public final synchronized p f(int i10) {
        p pVar;
        pVar = (p) this.c.remove(Integer.valueOf(i10));
        notifyAll();
        return pVar;
    }

    public final void flush() {
        this.f16694y.flush();
    }

    public final void h(ErrorCode statusCode) {
        kotlin.jvm.internal.g.e(statusCode, "statusCode");
        synchronized (this.f16694y) {
            Ref$IntRef ref$IntRef = new Ref$IntRef();
            synchronized (this) {
                if (this.f16676g) {
                    return;
                }
                this.f16676g = true;
                int i10 = this.f16674e;
                ref$IntRef.element = i10;
                tf.d dVar = tf.d.f30009a;
                this.f16694y.d(i10, statusCode, ak.b.f665a);
            }
        }
    }

    public final synchronized void i(long j10) {
        long j11 = this.f16689t + j10;
        this.f16689t = j11;
        long j12 = j11 - this.f16690u;
        if (j12 >= this.f16687r.a() / 2) {
            l(0, j12);
            this.f16690u += j12;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
        throw new java.io.IOException("stream closed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0034, code lost:
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.f16694y.f16780d);
        r6 = r2;
        r8.f16691v += r6;
        r4 = tf.d.f30009a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(int r9, boolean r10, kk.f r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto Ld
            ek.q r12 = r8.f16694y
            r12.b(r10, r9, r11, r3)
            return
        Ld:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L6b
            monitor-enter(r8)
        L12:
            long r4 = r8.f16691v     // Catch: java.lang.Throwable -> L5a java.lang.InterruptedException -> L5c
            long r6 = r8.f16692w     // Catch: java.lang.Throwable -> L5a java.lang.InterruptedException -> L5c
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L33
            java.util.LinkedHashMap r2 = r8.c     // Catch: java.lang.Throwable -> L5a java.lang.InterruptedException -> L5c
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L5a java.lang.InterruptedException -> L5c
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L5a java.lang.InterruptedException -> L5c
            if (r2 == 0) goto L2a
            r8.wait()     // Catch: java.lang.Throwable -> L5a java.lang.InterruptedException -> L5c
            goto L12
        L2a:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L5a java.lang.InterruptedException -> L5c
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L5a java.lang.InterruptedException -> L5c
            throw r9     // Catch: java.lang.Throwable -> L5a java.lang.InterruptedException -> L5c
        L33:
            long r6 = r6 - r4
            long r4 = java.lang.Math.min(r12, r6)     // Catch: java.lang.Throwable -> L5a
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L5a
            ek.q r4 = r8.f16694y     // Catch: java.lang.Throwable -> L5a
            int r4 = r4.f16780d     // Catch: java.lang.Throwable -> L5a
            int r2 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L5a
            long r4 = r8.f16691v     // Catch: java.lang.Throwable -> L5a
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L5a
            long r4 = r4 + r6
            r8.f16691v = r4     // Catch: java.lang.Throwable -> L5a
            tf.d r4 = tf.d.f30009a     // Catch: java.lang.Throwable -> L5a
            monitor-exit(r8)
            long r12 = r12 - r6
            ek.q r4 = r8.f16694y
            if (r10 == 0) goto L55
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L55
            r5 = 1
            goto L56
        L55:
            r5 = r3
        L56:
            r4.b(r5, r9, r11, r2)
            goto Ld
        L5a:
            r9 = move-exception
            goto L69
        L5c:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L5a
            r9.interrupt()     // Catch: java.lang.Throwable -> L5a
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L5a
            r9.<init>()     // Catch: java.lang.Throwable -> L5a
            throw r9     // Catch: java.lang.Throwable -> L5a
        L69:
            monitor-exit(r8)
            throw r9
        L6b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ek.d.j(int, boolean, kk.f, long):void");
    }

    public final void k(int i10, ErrorCode errorCode) {
        kotlin.jvm.internal.g.e(errorCode, "errorCode");
        this.f16678i.c(new e(this.f16673d + '[' + i10 + "] writeSynReset", this, i10, errorCode), 0L);
    }

    public final void l(int i10, long j10) {
        this.f16678i.c(new f(this.f16673d + '[' + i10 + "] windowUpdate", this, i10, j10), 0L);
    }

    /* compiled from: Http2Connection.kt */
    /* loaded from: classes3.dex */
    public final class c implements o.c, cg.a<tf.d> {

        /* renamed from: a  reason: collision with root package name */
        public final o f16705a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ d f16706b;

        public c(d this$0, o oVar) {
            kotlin.jvm.internal.g.e(this$0, "this$0");
            this.f16706b = this$0;
            this.f16705a = oVar;
        }

        @Override // ek.o.c
        public final void a(int i10, List requestHeaders) {
            kotlin.jvm.internal.g.e(requestHeaders, "requestHeaders");
            d dVar = this.f16706b;
            dVar.getClass();
            synchronized (dVar) {
                if (dVar.A.contains(Integer.valueOf(i10))) {
                    dVar.k(i10, ErrorCode.PROTOCOL_ERROR);
                    return;
                }
                dVar.A.add(Integer.valueOf(i10));
                bk.c cVar = dVar.f16679j;
                cVar.c(new k(dVar.f16673d + '[' + i10 + "] onRequest", dVar, i10, requestHeaders), 0L);
            }
        }

        @Override // ek.o.c
        public final void c(int i10, long j10) {
            if (i10 == 0) {
                d dVar = this.f16706b;
                synchronized (dVar) {
                    dVar.f16692w += j10;
                    dVar.notifyAll();
                    tf.d dVar2 = tf.d.f30009a;
                }
                return;
            }
            p c = this.f16706b.c(i10);
            if (c != null) {
                synchronized (c) {
                    c.f16759f += j10;
                    if (j10 > 0) {
                        c.notifyAll();
                    }
                    tf.d dVar3 = tf.d.f30009a;
                }
            }
        }

        @Override // ek.o.c
        public final void d(int i10, int i11, boolean z10) {
            if (z10) {
                d dVar = this.f16706b;
                synchronized (dVar) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 == 3) {
                                dVar.notifyAll();
                            }
                            tf.d dVar2 = tf.d.f30009a;
                        } else {
                            dVar.f16685p++;
                        }
                    } else {
                        dVar.f16683n++;
                    }
                }
                return;
            }
            d dVar3 = this.f16706b;
            dVar3.f16678i.c(new g(kotlin.jvm.internal.g.h(" ping", dVar3.f16673d), this.f16706b, i10, i11), 0L);
        }

        /* JADX WARN: Code restructure failed: missing block: B:58:0x00f6, code lost:
            if (r20 == false) goto L63;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x00f8, code lost:
            r5.j(ak.b.f666b, true);
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x00fd, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:73:?, code lost:
            return;
         */
        @Override // ek.o.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void e(int r17, int r18, kk.h r19, boolean r20) {
            /*
                Method dump skipped, instructions count: 254
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: ek.d.c.e(int, int, kk.h, boolean):void");
        }

        @Override // ek.o.c
        public final void f(int i10, ErrorCode errorCode) {
            boolean z10;
            d dVar = this.f16706b;
            dVar.getClass();
            if (i10 != 0 && (i10 & 1) == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                dVar.f16679j.c(new l(dVar.f16673d + '[' + i10 + "] onReset", dVar, i10, errorCode), 0L);
                return;
            }
            p f10 = dVar.f(i10);
            if (f10 != null) {
                f10.k(errorCode);
            }
        }

        @Override // ek.o.c
        public final void g(int i10, List headerBlock, boolean z10) {
            boolean z11;
            kotlin.jvm.internal.g.e(headerBlock, "headerBlock");
            this.f16706b.getClass();
            if (i10 != 0 && (i10 & 1) == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                d dVar = this.f16706b;
                dVar.getClass();
                dVar.f16679j.c(new j(dVar.f16673d + '[' + i10 + "] onHeaders", dVar, i10, headerBlock, z10), 0L);
                return;
            }
            d dVar2 = this.f16706b;
            synchronized (dVar2) {
                p c = dVar2.c(i10);
                if (c == null) {
                    if (dVar2.f16676g) {
                        return;
                    }
                    if (i10 <= dVar2.f16674e) {
                        return;
                    }
                    if (i10 % 2 == dVar2.f16675f % 2) {
                        return;
                    }
                    p pVar = new p(i10, dVar2, false, z10, ak.b.u(headerBlock));
                    dVar2.f16674e = i10;
                    dVar2.c.put(Integer.valueOf(i10), pVar);
                    bk.c f10 = dVar2.f16677h.f();
                    f10.c(new ek.f(dVar2.f16673d + '[' + i10 + "] onStream", dVar2, pVar), 0L);
                    return;
                }
                tf.d dVar3 = tf.d.f30009a;
                c.j(ak.b.u(headerBlock), z10);
            }
        }

        @Override // ek.o.c
        public final void h(t tVar) {
            d dVar = this.f16706b;
            dVar.f16678i.c(new h(kotlin.jvm.internal.g.h(" applyAndAckSettings", dVar.f16673d), this, tVar), 0L);
        }

        @Override // ek.o.c
        public final void i(int i10, ErrorCode errorCode, ByteString debugData) {
            int i11;
            Object[] array;
            kotlin.jvm.internal.g.e(debugData, "debugData");
            debugData.size();
            d dVar = this.f16706b;
            synchronized (dVar) {
                i11 = 0;
                array = dVar.c.values().toArray(new p[0]);
                if (array != null) {
                    dVar.f16676g = true;
                    tf.d dVar2 = tf.d.f30009a;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                }
            }
            p[] pVarArr = (p[]) array;
            int length = pVarArr.length;
            while (i11 < length) {
                p pVar = pVarArr[i11];
                i11++;
                if (pVar.f16755a > i10 && pVar.h()) {
                    pVar.k(ErrorCode.REFUSED_STREAM);
                    this.f16706b.f(pVar.f16755a);
                }
            }
        }

        @Override // cg.a
        public final tf.d invoke() {
            Throwable th2;
            ErrorCode errorCode;
            d dVar = this.f16706b;
            o oVar = this.f16705a;
            ErrorCode errorCode2 = ErrorCode.INTERNAL_ERROR;
            IOException e10 = null;
            try {
                oVar.b(this);
                while (oVar.a(false, this)) {
                }
                errorCode = ErrorCode.NO_ERROR;
            } catch (IOException e11) {
                e10 = e11;
                errorCode = errorCode2;
            } catch (Throwable th3) {
                th2 = th3;
                errorCode = errorCode2;
                dVar.a(errorCode, errorCode2, e10);
                ak.b.c(oVar);
                throw th2;
            }
            try {
                try {
                    dVar.a(errorCode, ErrorCode.CANCEL, null);
                } catch (Throwable th4) {
                    th2 = th4;
                    dVar.a(errorCode, errorCode2, e10);
                    ak.b.c(oVar);
                    throw th2;
                }
            } catch (IOException e12) {
                e10 = e12;
                ErrorCode errorCode3 = ErrorCode.PROTOCOL_ERROR;
                dVar.a(errorCode3, errorCode3, e10);
                ak.b.c(oVar);
                return tf.d.f30009a;
            }
            ak.b.c(oVar);
            return tf.d.f30009a;
        }

        @Override // ek.o.c
        public final void b() {
        }

        @Override // ek.o.c
        public final void priority() {
        }
    }
}

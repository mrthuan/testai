package ek;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import kk.w;
import kk.y;
import kk.z;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;

/* compiled from: Http2Stream.kt */
/* loaded from: classes3.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final int f16755a;

    /* renamed from: b  reason: collision with root package name */
    public final d f16756b;
    public long c;

    /* renamed from: d  reason: collision with root package name */
    public long f16757d;

    /* renamed from: e  reason: collision with root package name */
    public long f16758e;

    /* renamed from: f  reason: collision with root package name */
    public long f16759f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayDeque<okhttp3.o> f16760g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f16761h;

    /* renamed from: i  reason: collision with root package name */
    public final b f16762i;

    /* renamed from: j  reason: collision with root package name */
    public final a f16763j;

    /* renamed from: k  reason: collision with root package name */
    public final c f16764k;

    /* renamed from: l  reason: collision with root package name */
    public final c f16765l;

    /* renamed from: m  reason: collision with root package name */
    public ErrorCode f16766m;

    /* renamed from: n  reason: collision with root package name */
    public IOException f16767n;

    /* compiled from: Http2Stream.kt */
    /* loaded from: classes3.dex */
    public final class a implements w {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f16768a;

        /* renamed from: b  reason: collision with root package name */
        public final kk.f f16769b;
        public boolean c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ p f16770d;

        public a(p this$0, boolean z10) {
            kotlin.jvm.internal.g.e(this$0, "this$0");
            this.f16770d = this$0;
            this.f16768a = z10;
            this.f16769b = new kk.f();
        }

        @Override // kk.w
        public final void D(kk.f source, long j10) {
            kotlin.jvm.internal.g.e(source, "source");
            byte[] bArr = ak.b.f665a;
            kk.f fVar = this.f16769b;
            fVar.D(source, j10);
            while (fVar.f19826b >= 16384) {
                a(false);
            }
        }

        public final void a(boolean z10) {
            long min;
            boolean z11;
            boolean z12;
            p pVar = this.f16770d;
            synchronized (pVar) {
                pVar.f16765l.h();
                while (pVar.f16758e >= pVar.f16759f && !this.f16768a && !this.c && pVar.f() == null) {
                    pVar.l();
                }
                pVar.f16765l.l();
                pVar.b();
                min = Math.min(pVar.f16759f - pVar.f16758e, this.f16769b.f19826b);
                pVar.f16758e += min;
                if (z10 && min == this.f16769b.f19826b) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                z12 = z11;
                tf.d dVar = tf.d.f30009a;
            }
            this.f16770d.f16765l.h();
            try {
                p pVar2 = this.f16770d;
                pVar2.f16756b.j(pVar2.f16755a, z12, this.f16769b, min);
            } finally {
                this.f16770d.f16765l.l();
            }
        }

        @Override // kk.w, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            boolean z10;
            p pVar = this.f16770d;
            byte[] bArr = ak.b.f665a;
            synchronized (pVar) {
                if (this.c) {
                    return;
                }
                boolean z11 = false;
                if (pVar.f() == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                tf.d dVar = tf.d.f30009a;
                p pVar2 = this.f16770d;
                if (!pVar2.f16763j.f16768a) {
                    if (this.f16769b.f19826b > 0) {
                        z11 = true;
                    }
                    if (z11) {
                        while (this.f16769b.f19826b > 0) {
                            a(true);
                        }
                    } else if (z10) {
                        pVar2.f16756b.j(pVar2.f16755a, true, null, 0L);
                    }
                }
                synchronized (this.f16770d) {
                    this.c = true;
                    tf.d dVar2 = tf.d.f30009a;
                }
                this.f16770d.f16756b.flush();
                this.f16770d.a();
            }
        }

        @Override // kk.w, java.io.Flushable
        public final void flush() {
            p pVar = this.f16770d;
            byte[] bArr = ak.b.f665a;
            synchronized (pVar) {
                pVar.b();
                tf.d dVar = tf.d.f30009a;
            }
            while (this.f16769b.f19826b > 0) {
                a(false);
                this.f16770d.f16756b.flush();
            }
        }

        @Override // kk.w
        public final z z() {
            return this.f16770d.f16765l;
        }
    }

    /* compiled from: Http2Stream.kt */
    /* loaded from: classes3.dex */
    public final class b implements y {

        /* renamed from: a  reason: collision with root package name */
        public final long f16771a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f16772b;
        public final kk.f c;

        /* renamed from: d  reason: collision with root package name */
        public final kk.f f16773d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f16774e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ p f16775f;

        public b(p this$0, long j10, boolean z10) {
            kotlin.jvm.internal.g.e(this$0, "this$0");
            this.f16775f = this$0;
            this.f16771a = j10;
            this.f16772b = z10;
            this.c = new kk.f();
            this.f16773d = new kk.f();
        }

        public final void a(long j10) {
            byte[] bArr = ak.b.f665a;
            this.f16775f.f16756b.i(j10);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            long j10;
            p pVar = this.f16775f;
            synchronized (pVar) {
                this.f16774e = true;
                kk.f fVar = this.f16773d;
                j10 = fVar.f19826b;
                fVar.clear();
                pVar.notifyAll();
                tf.d dVar = tf.d.f30009a;
            }
            if (j10 > 0) {
                a(j10);
            }
            this.f16775f.a();
        }

        @Override // kk.y
        public final long g(kk.f sink, long j10) {
            Throwable th2;
            boolean z10;
            long j11;
            kotlin.jvm.internal.g.e(sink, "sink");
            do {
                p pVar = this.f16775f;
                synchronized (pVar) {
                    pVar.f16764k.h();
                    if (pVar.f() != null && !this.f16772b) {
                        th2 = pVar.f16767n;
                        if (th2 == null) {
                            ErrorCode f10 = pVar.f();
                            kotlin.jvm.internal.g.b(f10);
                            th2 = new StreamResetException(f10);
                        }
                    } else {
                        th2 = null;
                    }
                    if (!this.f16774e) {
                        kk.f fVar = this.f16773d;
                        long j12 = fVar.f19826b;
                        z10 = false;
                        if (j12 > 0) {
                            j11 = fVar.g(sink, Math.min(8192L, j12));
                            long j13 = pVar.c + j11;
                            pVar.c = j13;
                            long j14 = j13 - pVar.f16757d;
                            if (th2 == null && j14 >= pVar.f16756b.f16687r.a() / 2) {
                                pVar.f16756b.l(pVar.f16755a, j14);
                                pVar.f16757d = pVar.c;
                            }
                        } else {
                            if (!this.f16772b && th2 == null) {
                                pVar.l();
                                z10 = true;
                            }
                            j11 = -1;
                        }
                        pVar.f16764k.l();
                        tf.d dVar = tf.d.f30009a;
                    } else {
                        throw new IOException("stream closed");
                    }
                }
            } while (z10);
            if (j11 != -1) {
                a(j11);
                return j11;
            } else if (th2 == null) {
                return -1L;
            } else {
                throw th2;
            }
        }

        @Override // kk.y
        public final z z() {
            return this.f16775f.f16764k;
        }
    }

    /* compiled from: Http2Stream.kt */
    /* loaded from: classes3.dex */
    public final class c extends kk.a {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ p f16776k;

        public c(p this$0) {
            kotlin.jvm.internal.g.e(this$0, "this$0");
            this.f16776k = this$0;
        }

        @Override // kk.a
        public final IOException j(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // kk.a
        public final void k() {
            this.f16776k.e(ErrorCode.CANCEL);
            d dVar = this.f16776k.f16756b;
            synchronized (dVar) {
                long j10 = dVar.f16685p;
                long j11 = dVar.f16684o;
                if (j10 >= j11) {
                    dVar.f16684o = j11 + 1;
                    dVar.f16686q = System.nanoTime() + 1000000000;
                    tf.d dVar2 = tf.d.f30009a;
                    dVar.f16678i.c(new m(kotlin.jvm.internal.g.h(" ping", dVar.f16673d), dVar), 0L);
                }
            }
        }

        public final void l() {
            if (!i()) {
                return;
            }
            throw j(null);
        }
    }

    public p(int i10, d dVar, boolean z10, boolean z11, okhttp3.o oVar) {
        this.f16755a = i10;
        this.f16756b = dVar;
        this.f16759f = dVar.f16688s.a();
        ArrayDeque<okhttp3.o> arrayDeque = new ArrayDeque<>();
        this.f16760g = arrayDeque;
        this.f16762i = new b(this, dVar.f16687r.a(), z11);
        this.f16763j = new a(this, z10);
        this.f16764k = new c(this);
        this.f16765l = new c(this);
        if (oVar != null) {
            if (!h()) {
                arrayDeque.add(oVar);
                return;
            }
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet".toString());
        } else if (h()) {
        } else {
            throw new IllegalStateException("remotely-initiated streams should have headers".toString());
        }
    }

    public final void a() {
        boolean z10;
        boolean i10;
        byte[] bArr = ak.b.f665a;
        synchronized (this) {
            b bVar = this.f16762i;
            if (!bVar.f16772b && bVar.f16774e) {
                a aVar = this.f16763j;
                if (aVar.f16768a || aVar.c) {
                    z10 = true;
                    i10 = i();
                    tf.d dVar = tf.d.f30009a;
                }
            }
            z10 = false;
            i10 = i();
            tf.d dVar2 = tf.d.f30009a;
        }
        if (z10) {
            c(ErrorCode.CANCEL, null);
        } else if (!i10) {
            this.f16756b.f(this.f16755a);
        }
    }

    public final void b() {
        a aVar = this.f16763j;
        if (!aVar.c) {
            if (!aVar.f16768a) {
                if (this.f16766m != null) {
                    IOException iOException = this.f16767n;
                    if (iOException == null) {
                        ErrorCode errorCode = this.f16766m;
                        kotlin.jvm.internal.g.b(errorCode);
                        throw new StreamResetException(errorCode);
                    }
                    throw iOException;
                }
                return;
            }
            throw new IOException("stream finished");
        }
        throw new IOException("stream closed");
    }

    public final void c(ErrorCode rstStatusCode, IOException iOException) {
        kotlin.jvm.internal.g.e(rstStatusCode, "rstStatusCode");
        if (!d(rstStatusCode, iOException)) {
            return;
        }
        d dVar = this.f16756b;
        dVar.getClass();
        dVar.f16694y.i(this.f16755a, rstStatusCode);
    }

    public final boolean d(ErrorCode errorCode, IOException iOException) {
        byte[] bArr = ak.b.f665a;
        synchronized (this) {
            if (f() != null) {
                return false;
            }
            if (this.f16762i.f16772b && this.f16763j.f16768a) {
                return false;
            }
            this.f16766m = errorCode;
            this.f16767n = iOException;
            notifyAll();
            tf.d dVar = tf.d.f30009a;
            this.f16756b.f(this.f16755a);
            return true;
        }
    }

    public final void e(ErrorCode errorCode) {
        kotlin.jvm.internal.g.e(errorCode, "errorCode");
        if (!d(errorCode, null)) {
            return;
        }
        this.f16756b.k(this.f16755a, errorCode);
    }

    public final synchronized ErrorCode f() {
        return this.f16766m;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0011 A[Catch: all -> 0x0023, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:11:0x0011, B:15:0x0017, B:16:0x0022), top: B:20:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0017 A[Catch: all -> 0x0023, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:11:0x0011, B:15:0x0017, B:16:0x0022), top: B:20:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final ek.p.a g() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f16761h     // Catch: java.lang.Throwable -> L23
            if (r0 != 0) goto Le
            boolean r0 = r2.h()     // Catch: java.lang.Throwable -> L23
            if (r0 == 0) goto Lc
            goto Le
        Lc:
            r0 = 0
            goto Lf
        Le:
            r0 = 1
        Lf:
            if (r0 == 0) goto L17
            tf.d r0 = tf.d.f30009a     // Catch: java.lang.Throwable -> L23
            monitor-exit(r2)
            ek.p$a r0 = r2.f16763j
            return r0
        L17:
            java.lang.String r0 = "reply before requesting the sink"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L23
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L23
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L23
            throw r1     // Catch: java.lang.Throwable -> L23
        L23:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ek.p.g():ek.p$a");
    }

    public final boolean h() {
        boolean z10;
        if ((this.f16755a & 1) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f16756b.f16671a == z10) {
            return true;
        }
        return false;
    }

    public final synchronized boolean i() {
        if (this.f16766m != null) {
            return false;
        }
        b bVar = this.f16762i;
        if (bVar.f16772b || bVar.f16774e) {
            a aVar = this.f16763j;
            if (aVar.f16768a || aVar.c) {
                if (this.f16761h) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001f A[Catch: all -> 0x0037, TryCatch #0 {, blocks: (B:4:0x0008, B:8:0x0010, B:11:0x001f, B:12:0x0023, B:9:0x0016), top: B:20:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(okhttp3.o r3, boolean r4) {
        /*
            r2 = this;
            java.lang.String r0 = "headers"
            kotlin.jvm.internal.g.e(r3, r0)
            byte[] r0 = ak.b.f665a
            monitor-enter(r2)
            boolean r0 = r2.f16761h     // Catch: java.lang.Throwable -> L37
            r1 = 1
            if (r0 == 0) goto L16
            if (r4 != 0) goto L10
            goto L16
        L10:
            ek.p$b r3 = r2.f16762i     // Catch: java.lang.Throwable -> L37
            r3.getClass()     // Catch: java.lang.Throwable -> L37
            goto L1d
        L16:
            r2.f16761h = r1     // Catch: java.lang.Throwable -> L37
            java.util.ArrayDeque<okhttp3.o> r0 = r2.f16760g     // Catch: java.lang.Throwable -> L37
            r0.add(r3)     // Catch: java.lang.Throwable -> L37
        L1d:
            if (r4 == 0) goto L23
            ek.p$b r3 = r2.f16762i     // Catch: java.lang.Throwable -> L37
            r3.f16772b = r1     // Catch: java.lang.Throwable -> L37
        L23:
            boolean r3 = r2.i()     // Catch: java.lang.Throwable -> L37
            r2.notifyAll()     // Catch: java.lang.Throwable -> L37
            tf.d r4 = tf.d.f30009a     // Catch: java.lang.Throwable -> L37
            monitor-exit(r2)
            if (r3 != 0) goto L36
            ek.d r3 = r2.f16756b
            int r4 = r2.f16755a
            r3.f(r4)
        L36:
            return
        L37:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ek.p.j(okhttp3.o, boolean):void");
    }

    public final synchronized void k(ErrorCode errorCode) {
        kotlin.jvm.internal.g.e(errorCode, "errorCode");
        if (this.f16766m == null) {
            this.f16766m = errorCode;
            notifyAll();
        }
    }

    public final void l() {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }
}

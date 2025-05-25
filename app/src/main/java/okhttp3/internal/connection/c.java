package okhttp3.internal.connection;

import androidx.activity.r;
import java.io.IOException;
import java.net.ProtocolException;
import kk.j;
import kk.w;
import kk.y;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;
import okhttp3.m;
import okhttp3.x;

/* compiled from: Exchange.kt */
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final e f23269a;

    /* renamed from: b  reason: collision with root package name */
    public final m f23270b;
    public final d c;

    /* renamed from: d  reason: collision with root package name */
    public final ck.d f23271d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f23272e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f23273f;

    /* renamed from: g  reason: collision with root package name */
    public final f f23274g;

    /* compiled from: Exchange.kt */
    /* loaded from: classes3.dex */
    public final class a extends kk.i {

        /* renamed from: b  reason: collision with root package name */
        public final long f23275b;
        public boolean c;

        /* renamed from: d  reason: collision with root package name */
        public long f23276d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f23277e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ c f23278f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c this$0, w delegate, long j10) {
            super(delegate);
            kotlin.jvm.internal.g.e(this$0, "this$0");
            kotlin.jvm.internal.g.e(delegate, "delegate");
            this.f23278f = this$0;
            this.f23275b = j10;
        }

        @Override // kk.i, kk.w
        public final void D(kk.f source, long j10) {
            kotlin.jvm.internal.g.e(source, "source");
            if (!this.f23277e) {
                long j11 = this.f23275b;
                if (j11 != -1 && this.f23276d + j10 > j11) {
                    StringBuilder h10 = r.h("expected ", j11, " bytes but received ");
                    h10.append(this.f23276d + j10);
                    throw new ProtocolException(h10.toString());
                }
                try {
                    super.D(source, j10);
                    this.f23276d += j10;
                    return;
                } catch (IOException e10) {
                    throw a(e10);
                }
            }
            throw new IllegalStateException("closed".toString());
        }

        public final <E extends IOException> E a(E e10) {
            if (this.c) {
                return e10;
            }
            this.c = true;
            return (E) this.f23278f.a(false, true, e10);
        }

        @Override // kk.i, kk.w, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f23277e) {
                return;
            }
            this.f23277e = true;
            long j10 = this.f23275b;
            if (j10 != -1 && this.f23276d != j10) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
                a(null);
            } catch (IOException e10) {
                throw a(e10);
            }
        }

        @Override // kk.i, kk.w, java.io.Flushable
        public final void flush() {
            try {
                super.flush();
            } catch (IOException e10) {
                throw a(e10);
            }
        }
    }

    /* compiled from: Exchange.kt */
    /* loaded from: classes3.dex */
    public final class b extends j {

        /* renamed from: b  reason: collision with root package name */
        public final long f23279b;
        public long c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f23280d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f23281e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f23282f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ c f23283g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(c this$0, y delegate, long j10) {
            super(delegate);
            kotlin.jvm.internal.g.e(this$0, "this$0");
            kotlin.jvm.internal.g.e(delegate, "delegate");
            this.f23283g = this$0;
            this.f23279b = j10;
            this.f23280d = true;
            if (j10 == 0) {
                a(null);
            }
        }

        public final <E extends IOException> E a(E e10) {
            if (this.f23281e) {
                return e10;
            }
            this.f23281e = true;
            c cVar = this.f23283g;
            if (e10 == null && this.f23280d) {
                this.f23280d = false;
                cVar.f23270b.getClass();
                e call = cVar.f23269a;
                kotlin.jvm.internal.g.e(call, "call");
            }
            return (E) cVar.a(true, false, e10);
        }

        @Override // kk.j, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f23282f) {
                return;
            }
            this.f23282f = true;
            try {
                super.close();
                a(null);
            } catch (IOException e10) {
                throw a(e10);
            }
        }

        @Override // kk.j, kk.y
        public final long g(kk.f sink, long j10) {
            kotlin.jvm.internal.g.e(sink, "sink");
            if (!this.f23282f) {
                try {
                    long g10 = this.f19828a.g(sink, 8192L);
                    if (this.f23280d) {
                        this.f23280d = false;
                        c cVar = this.f23283g;
                        m mVar = cVar.f23270b;
                        e call = cVar.f23269a;
                        mVar.getClass();
                        kotlin.jvm.internal.g.e(call, "call");
                    }
                    if (g10 == -1) {
                        a(null);
                        return -1L;
                    }
                    long j11 = this.c + g10;
                    long j12 = this.f23279b;
                    if (j12 != -1 && j11 > j12) {
                        throw new ProtocolException("expected " + j12 + " bytes but received " + j11);
                    }
                    this.c = j11;
                    if (j11 == j12) {
                        a(null);
                    }
                    return g10;
                } catch (IOException e10) {
                    throw a(e10);
                }
            }
            throw new IllegalStateException("closed".toString());
        }
    }

    public c(e eVar, m eventListener, d dVar, ck.d dVar2) {
        kotlin.jvm.internal.g.e(eventListener, "eventListener");
        this.f23269a = eVar;
        this.f23270b = eventListener;
        this.c = dVar;
        this.f23271d = dVar2;
        this.f23274g = dVar2.e();
    }

    public final IOException a(boolean z10, boolean z11, IOException iOException) {
        if (iOException != null) {
            d(iOException);
        }
        m mVar = this.f23270b;
        e call = this.f23269a;
        if (z11) {
            if (iOException != null) {
                mVar.getClass();
                kotlin.jvm.internal.g.e(call, "call");
            } else {
                mVar.getClass();
                kotlin.jvm.internal.g.e(call, "call");
            }
        }
        if (z10) {
            if (iOException != null) {
                mVar.getClass();
                kotlin.jvm.internal.g.e(call, "call");
            } else {
                mVar.getClass();
                kotlin.jvm.internal.g.e(call, "call");
            }
        }
        return call.h(this, z11, z10, iOException);
    }

    public final ck.g b(x xVar) {
        ck.d dVar = this.f23271d;
        try {
            String b10 = x.b(xVar, "Content-Type");
            long g10 = dVar.g(xVar);
            return new ck.g(b10, g10, ge.a.m(new b(this, dVar.c(xVar), g10)));
        } catch (IOException e10) {
            this.f23270b.getClass();
            e call = this.f23269a;
            kotlin.jvm.internal.g.e(call, "call");
            d(e10);
            throw e10;
        }
    }

    public final x.a c(boolean z10) {
        try {
            x.a d10 = this.f23271d.d(z10);
            if (d10 != null) {
                d10.f23466m = this;
            }
            return d10;
        } catch (IOException e10) {
            this.f23270b.getClass();
            e call = this.f23269a;
            kotlin.jvm.internal.g.e(call, "call");
            d(e10);
            throw e10;
        }
    }

    public final void d(IOException iOException) {
        boolean z10;
        this.f23273f = true;
        this.c.c(iOException);
        f e10 = this.f23271d.e();
        e call = this.f23269a;
        synchronized (e10) {
            kotlin.jvm.internal.g.e(call, "call");
            if (iOException instanceof StreamResetException) {
                if (((StreamResetException) iOException).errorCode == ErrorCode.REFUSED_STREAM) {
                    int i10 = e10.f23325n + 1;
                    e10.f23325n = i10;
                    if (i10 > 1) {
                        e10.f23321j = true;
                        e10.f23323l++;
                    }
                } else if (((StreamResetException) iOException).errorCode != ErrorCode.CANCEL || !call.f23307p) {
                    e10.f23321j = true;
                    e10.f23323l++;
                }
            } else {
                if (e10.f23318g != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10 || (iOException instanceof ConnectionShutdownException)) {
                    e10.f23321j = true;
                    if (e10.f23324m == 0) {
                        f.d(call.f23293a, e10.f23314b, iOException);
                        e10.f23323l++;
                    }
                }
            }
        }
    }
}

package ek;

import com.google.android.gms.common.api.Api;
import ek.b;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kk.y;
import kk.z;
import okhttp3.internal.http2.ErrorCode;
import okio.ByteString;

/* compiled from: Http2Reader.kt */
/* loaded from: classes3.dex */
public final class o implements Closeable {

    /* renamed from: e  reason: collision with root package name */
    public static final Logger f16746e;

    /* renamed from: a  reason: collision with root package name */
    public final kk.h f16747a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f16748b;
    public final b c;

    /* renamed from: d  reason: collision with root package name */
    public final b.a f16749d;

    /* compiled from: Http2Reader.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        public static int a(int i10, int i11, int i12) {
            if ((i11 & 8) != 0) {
                i10--;
            }
            if (i12 <= i10) {
                return i10 - i12;
            }
            throw new IOException(a0.d.b("PROTOCOL_ERROR padding ", i12, " > remaining length ", i10));
        }
    }

    /* compiled from: Http2Reader.kt */
    /* loaded from: classes3.dex */
    public interface c {
        void a(int i10, List list);

        void b();

        void c(int i10, long j10);

        void d(int i10, int i11, boolean z10);

        void e(int i10, int i11, kk.h hVar, boolean z10);

        void f(int i10, ErrorCode errorCode);

        void g(int i10, List list, boolean z10);

        void h(t tVar);

        void i(int i10, ErrorCode errorCode, ByteString byteString);

        void priority();
    }

    static {
        Logger logger = Logger.getLogger(ek.c.class.getName());
        kotlin.jvm.internal.g.d(logger, "getLogger(Http2::class.java.name)");
        f16746e = logger;
    }

    public o(kk.h hVar, boolean z10) {
        this.f16747a = hVar;
        this.f16748b = z10;
        b bVar = new b(hVar);
        this.c = bVar;
        this.f16749d = new b.a(bVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:0x01ca, code lost:
        throw new java.io.IOException(kotlin.jvm.internal.g.h(java.lang.Integer.valueOf(r7), "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(boolean r13, ek.o.c r14) {
        /*
            Method dump skipped, instructions count: 782
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ek.o.a(boolean, ek.o$c):boolean");
    }

    public final void b(c handler) {
        kotlin.jvm.internal.g.e(handler, "handler");
        if (this.f16748b) {
            if (!a(true, handler)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            return;
        }
        ByteString byteString = ek.c.f16668b;
        ByteString e10 = this.f16747a.e(byteString.size());
        Level level = Level.FINE;
        Logger logger = f16746e;
        if (logger.isLoggable(level)) {
            logger.fine(ak.b.h(kotlin.jvm.internal.g.h(e10.hex(), "<< CONNECTION "), new Object[0]));
        }
        if (kotlin.jvm.internal.g.a(byteString, e10)) {
            return;
        }
        throw new IOException(kotlin.jvm.internal.g.h(e10.utf8(), "Expected a connection header but was "));
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00eb, code lost:
        throw new java.io.IOException(kotlin.jvm.internal.g.h(java.lang.Integer.valueOf(r3.f16653b), "Invalid dynamic table size update "));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<ek.a> c(int r3, int r4, int r5, int r6) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ek.o.c(int, int, int, int):java.util.List");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f16747a.close();
    }

    public final void d(c cVar, int i10) {
        kk.h hVar = this.f16747a;
        hVar.readInt();
        hVar.readByte();
        byte[] bArr = ak.b.f665a;
        cVar.priority();
    }

    /* compiled from: Http2Reader.kt */
    /* loaded from: classes3.dex */
    public static final class b implements y {

        /* renamed from: a  reason: collision with root package name */
        public final kk.h f16750a;

        /* renamed from: b  reason: collision with root package name */
        public int f16751b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public int f16752d;

        /* renamed from: e  reason: collision with root package name */
        public int f16753e;

        /* renamed from: f  reason: collision with root package name */
        public int f16754f;

        public b(kk.h hVar) {
            this.f16750a = hVar;
        }

        @Override // kk.y
        public final long g(kk.f sink, long j10) {
            int i10;
            int readInt;
            kotlin.jvm.internal.g.e(sink, "sink");
            do {
                int i11 = this.f16753e;
                kk.h hVar = this.f16750a;
                if (i11 == 0) {
                    hVar.skip(this.f16754f);
                    this.f16754f = 0;
                    if ((this.c & 4) != 0) {
                        return -1L;
                    }
                    i10 = this.f16752d;
                    int s4 = ak.b.s(hVar);
                    this.f16753e = s4;
                    this.f16751b = s4;
                    int readByte = hVar.readByte() & 255;
                    this.c = hVar.readByte() & 255;
                    Logger logger = o.f16746e;
                    if (logger.isLoggable(Level.FINE)) {
                        ek.c cVar = ek.c.f16667a;
                        int i12 = this.f16752d;
                        int i13 = this.f16751b;
                        int i14 = this.c;
                        cVar.getClass();
                        logger.fine(ek.c.a(i12, i13, readByte, i14, true));
                    }
                    readInt = hVar.readInt() & Api.BaseClientBuilder.API_PRIORITY_OTHER;
                    this.f16752d = readInt;
                    if (readByte != 9) {
                        throw new IOException(readByte + " != TYPE_CONTINUATION");
                    }
                } else {
                    long g10 = hVar.g(sink, Math.min(8192L, i11));
                    if (g10 == -1) {
                        return -1L;
                    }
                    this.f16753e -= (int) g10;
                    return g10;
                }
            } while (readInt == i10);
            throw new IOException("TYPE_CONTINUATION streamId changed");
        }

        @Override // kk.y
        public final z z() {
            return this.f16750a.z();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }
    }
}

package okhttp3;

import ck.i;
import com.adjust.sdk.Constants;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Pattern;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import okhttp3.TlsVersion;
import okhttp3.internal.cache.DiskLruCache;
import okhttp3.o;
import okhttp3.p;
import okhttp3.r;
import okio.ByteString;

/* compiled from: Cache.kt */
/* loaded from: classes3.dex */
public final class c implements Closeable, Flushable {

    /* renamed from: a  reason: collision with root package name */
    public final DiskLruCache f23136a;

    /* compiled from: Cache.kt */
    /* loaded from: classes3.dex */
    public static final class a extends z {

        /* renamed from: a  reason: collision with root package name */
        public final DiskLruCache.b f23137a;

        /* renamed from: b  reason: collision with root package name */
        public final String f23138b;
        public final String c;

        /* renamed from: d  reason: collision with root package name */
        public final kk.t f23139d;

        /* compiled from: Cache.kt */
        /* renamed from: okhttp3.c$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0319a extends kk.j {

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ kk.y f23140b;
            public final /* synthetic */ a c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0319a(kk.y yVar, a aVar) {
                super(yVar);
                this.f23140b = yVar;
                this.c = aVar;
            }

            @Override // kk.j, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                this.c.f23137a.close();
                super.close();
            }
        }

        public a(DiskLruCache.b bVar, String str, String str2) {
            this.f23137a = bVar;
            this.f23138b = str;
            this.c = str2;
            this.f23139d = ge.a.m(new C0319a(bVar.c.get(1), this));
        }

        @Override // okhttp3.z
        public final long c() {
            String str = this.c;
            if (str == null) {
                return -1L;
            }
            byte[] bArr = ak.b.f665a;
            try {
                return Long.parseLong(str);
            } catch (NumberFormatException unused) {
                return -1L;
            }
        }

        @Override // okhttp3.z
        public final r d() {
            String str = this.f23138b;
            if (str == null) {
                return null;
            }
            Pattern pattern = r.c;
            return r.a.b(str);
        }

        @Override // okhttp3.z
        public final kk.h f() {
            return this.f23139d;
        }
    }

    /* compiled from: Cache.kt */
    /* loaded from: classes3.dex */
    public static final class b {
        public static String a(p url) {
            kotlin.jvm.internal.g.e(url, "url");
            ByteString.Companion.getClass();
            return ByteString.a.c(url.f23371i).md5().hex();
        }

        public static int b(kk.t tVar) {
            boolean z10;
            try {
                long b10 = tVar.b();
                String V = tVar.V();
                if (b10 >= 0 && b10 <= 2147483647L) {
                    if (V.length() > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        return (int) b10;
                    }
                }
                throw new IOException("expected an int but was \"" + b10 + V + '\"');
            } catch (NumberFormatException e10) {
                throw new IOException(e10.getMessage());
            }
        }

        public static Set c(o oVar) {
            int length = oVar.f23361a.length / 2;
            TreeSet treeSet = null;
            int i10 = 0;
            while (i10 < length) {
                int i11 = i10 + 1;
                if (kotlin.text.j.G("Vary", oVar.b(i10), true)) {
                    String d10 = oVar.d(i10);
                    if (treeSet == null) {
                        Comparator CASE_INSENSITIVE_ORDER = String.CASE_INSENSITIVE_ORDER;
                        kotlin.jvm.internal.g.d(CASE_INSENSITIVE_ORDER, "CASE_INSENSITIVE_ORDER");
                        treeSet = new TreeSet(CASE_INSENSITIVE_ORDER);
                    }
                    for (String str : kotlin.text.k.g0(d10, new char[]{','})) {
                        treeSet.add(kotlin.text.k.n0(str).toString());
                    }
                }
                i10 = i11;
            }
            if (treeSet == null) {
                return EmptySet.INSTANCE;
            }
            return treeSet;
        }
    }

    /* compiled from: Cache.kt */
    /* loaded from: classes3.dex */
    public final class d implements okhttp3.internal.cache.c {

        /* renamed from: a  reason: collision with root package name */
        public final DiskLruCache.Editor f23152a;

        /* renamed from: b  reason: collision with root package name */
        public final kk.w f23153b;
        public final a c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f23154d;

        /* compiled from: Cache.kt */
        /* loaded from: classes3.dex */
        public static final class a extends kk.i {

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ c f23156b;
            public final /* synthetic */ d c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(c cVar, d dVar, kk.w wVar) {
                super(wVar);
                this.f23156b = cVar;
                this.c = dVar;
            }

            @Override // kk.i, kk.w, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                c cVar = this.f23156b;
                d dVar = this.c;
                synchronized (cVar) {
                    if (dVar.f23154d) {
                        return;
                    }
                    dVar.f23154d = true;
                    super.close();
                    this.c.f23152a.b();
                }
            }
        }

        public d(DiskLruCache.Editor editor) {
            this.f23152a = editor;
            kk.w d10 = editor.d(1);
            this.f23153b = d10;
            this.c = new a(c.this, this, d10);
        }

        @Override // okhttp3.internal.cache.c
        public final void a() {
            synchronized (c.this) {
                if (this.f23154d) {
                    return;
                }
                this.f23154d = true;
                ak.b.c(this.f23153b);
                try {
                    this.f23152a.a();
                } catch (IOException unused) {
                }
            }
        }
    }

    public c(File directory, long j10) {
        kotlin.jvm.internal.g.e(directory, "directory");
        this.f23136a = new DiskLruCache(directory, j10, bk.d.f5452i);
    }

    public final void a(t request) {
        kotlin.jvm.internal.g.e(request, "request");
        DiskLruCache diskLruCache = this.f23136a;
        String key = b.a(request.f23428a);
        synchronized (diskLruCache) {
            kotlin.jvm.internal.g.e(key, "key");
            diskLruCache.f();
            diskLruCache.a();
            DiskLruCache.o(key);
            DiskLruCache.a aVar = diskLruCache.f23228k.get(key);
            if (aVar != null) {
                diskLruCache.m(aVar);
                if (diskLruCache.f23226i <= diskLruCache.f23222e) {
                    diskLruCache.f23234q = false;
                }
            }
        }
    }

    public final synchronized void b() {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f23136a.close();
    }

    @Override // java.io.Flushable
    public final void flush() {
        this.f23136a.flush();
    }

    /* compiled from: Cache.kt */
    /* renamed from: okhttp3.c$c  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0320c {

        /* renamed from: k  reason: collision with root package name */
        public static final String f23141k;

        /* renamed from: l  reason: collision with root package name */
        public static final String f23142l;

        /* renamed from: a  reason: collision with root package name */
        public final p f23143a;

        /* renamed from: b  reason: collision with root package name */
        public final o f23144b;
        public final String c;

        /* renamed from: d  reason: collision with root package name */
        public final Protocol f23145d;

        /* renamed from: e  reason: collision with root package name */
        public final int f23146e;

        /* renamed from: f  reason: collision with root package name */
        public final String f23147f;

        /* renamed from: g  reason: collision with root package name */
        public final o f23148g;

        /* renamed from: h  reason: collision with root package name */
        public final Handshake f23149h;

        /* renamed from: i  reason: collision with root package name */
        public final long f23150i;

        /* renamed from: j  reason: collision with root package name */
        public final long f23151j;

        static {
            gk.h hVar = gk.h.f17912a;
            gk.h.f17912a.getClass();
            f23141k = kotlin.jvm.internal.g.h("-Sent-Millis", "OkHttp");
            gk.h.f17912a.getClass();
            f23142l = kotlin.jvm.internal.g.h("-Received-Millis", "OkHttp");
        }

        public C0320c(kk.y rawSource) {
            p pVar;
            TlsVersion tlsVersion;
            kotlin.jvm.internal.g.e(rawSource, "rawSource");
            try {
                kk.t m10 = ge.a.m(rawSource);
                String V = m10.V();
                try {
                    p.a aVar = new p.a();
                    aVar.d(null, V);
                    pVar = aVar.a();
                } catch (IllegalArgumentException unused) {
                    pVar = null;
                }
                if (pVar != null) {
                    this.f23143a = pVar;
                    this.c = m10.V();
                    o.a aVar2 = new o.a();
                    int b10 = b.b(m10);
                    int i10 = 0;
                    while (i10 < b10) {
                        i10++;
                        aVar2.b(m10.V());
                    }
                    this.f23144b = aVar2.d();
                    ck.i a10 = i.a.a(m10.V());
                    this.f23145d = a10.f5708a;
                    this.f23146e = a10.f5709b;
                    this.f23147f = a10.c;
                    o.a aVar3 = new o.a();
                    int b11 = b.b(m10);
                    int i11 = 0;
                    while (i11 < b11) {
                        i11++;
                        aVar3.b(m10.V());
                    }
                    String str = f23141k;
                    String e10 = aVar3.e(str);
                    String str2 = f23142l;
                    String e11 = aVar3.e(str2);
                    aVar3.f(str);
                    aVar3.f(str2);
                    long j10 = 0;
                    this.f23150i = e10 == null ? 0L : Long.parseLong(e10);
                    if (e11 != null) {
                        j10 = Long.parseLong(e11);
                    }
                    this.f23151j = j10;
                    this.f23148g = aVar3.d();
                    if (kotlin.jvm.internal.g.a(this.f23143a.f23364a, Constants.SCHEME)) {
                        String V2 = m10.V();
                        if (!(V2.length() > 0)) {
                            g b12 = g.f23175b.b(m10.V());
                            List peerCertificates = a(m10);
                            List localCertificates = a(m10);
                            if (!m10.E()) {
                                TlsVersion.a aVar4 = TlsVersion.Companion;
                                String V3 = m10.V();
                                aVar4.getClass();
                                tlsVersion = TlsVersion.a.a(V3);
                            } else {
                                tlsVersion = TlsVersion.SSL_3_0;
                            }
                            kotlin.jvm.internal.g.e(tlsVersion, "tlsVersion");
                            kotlin.jvm.internal.g.e(peerCertificates, "peerCertificates");
                            kotlin.jvm.internal.g.e(localCertificates, "localCertificates");
                            final List w7 = ak.b.w(peerCertificates);
                            this.f23149h = new Handshake(tlsVersion, b12, ak.b.w(localCertificates), new cg.a<List<? extends Certificate>>() { // from class: okhttp3.Handshake$Companion$get$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(0);
                                }

                                @Override // cg.a
                                public final List<? extends Certificate> invoke() {
                                    return w7;
                                }
                            });
                        } else {
                            throw new IOException("expected \"\" but was \"" + V2 + '\"');
                        }
                    } else {
                        this.f23149h = null;
                    }
                    tf.d dVar = tf.d.f30009a;
                    o9.d.l(rawSource, null);
                    return;
                }
                IOException iOException = new IOException(kotlin.jvm.internal.g.h(V, "Cache corruption for "));
                gk.h hVar = gk.h.f17912a;
                gk.h.f17912a.getClass();
                gk.h.i(5, "cache corruption", iOException);
                throw iOException;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    o9.d.l(rawSource, th2);
                    throw th3;
                }
            }
        }

        public static List a(kk.t tVar) {
            int b10 = b.b(tVar);
            if (b10 == -1) {
                return EmptyList.INSTANCE;
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(b10);
                int i10 = 0;
                while (i10 < b10) {
                    i10++;
                    String V = tVar.V();
                    kk.f fVar = new kk.f();
                    ByteString.Companion.getClass();
                    ByteString a10 = ByteString.a.a(V);
                    kotlin.jvm.internal.g.b(a10);
                    fVar.p(a10);
                    arrayList.add(certificateFactory.generateCertificate(new kk.e(fVar)));
                }
                return arrayList;
            } catch (CertificateException e10) {
                throw new IOException(e10.getMessage());
            }
        }

        public static void b(kk.r rVar, List list) {
            try {
                rVar.h0(list.size());
                rVar.writeByte(10);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    byte[] bytes = ((Certificate) it.next()).getEncoded();
                    ByteString.a aVar = ByteString.Companion;
                    kotlin.jvm.internal.g.d(bytes, "bytes");
                    rVar.K(ByteString.a.e(aVar, bytes).base64());
                    rVar.writeByte(10);
                }
            } catch (CertificateEncodingException e10) {
                throw new IOException(e10.getMessage());
            }
        }

        public final void c(DiskLruCache.Editor editor) {
            p pVar = this.f23143a;
            Handshake handshake = this.f23149h;
            o oVar = this.f23148g;
            o oVar2 = this.f23144b;
            kk.r l10 = ge.a.l(editor.d(0));
            try {
                l10.K(pVar.f23371i);
                l10.writeByte(10);
                l10.K(this.c);
                l10.writeByte(10);
                l10.h0(oVar2.f23361a.length / 2);
                l10.writeByte(10);
                int length = oVar2.f23361a.length / 2;
                int i10 = 0;
                while (i10 < length) {
                    int i11 = i10 + 1;
                    l10.K(oVar2.b(i10));
                    l10.K(": ");
                    l10.K(oVar2.d(i10));
                    l10.writeByte(10);
                    i10 = i11;
                }
                Protocol protocol = this.f23145d;
                int i12 = this.f23146e;
                String message = this.f23147f;
                kotlin.jvm.internal.g.e(protocol, "protocol");
                kotlin.jvm.internal.g.e(message, "message");
                StringBuilder sb2 = new StringBuilder();
                if (protocol == Protocol.HTTP_1_0) {
                    sb2.append("HTTP/1.0");
                } else {
                    sb2.append("HTTP/1.1");
                }
                sb2.append(' ');
                sb2.append(i12);
                sb2.append(' ');
                sb2.append(message);
                String sb3 = sb2.toString();
                kotlin.jvm.internal.g.d(sb3, "StringBuilder().apply(builderAction).toString()");
                l10.K(sb3);
                l10.writeByte(10);
                l10.h0((oVar.f23361a.length / 2) + 2);
                l10.writeByte(10);
                int length2 = oVar.f23361a.length / 2;
                for (int i13 = 0; i13 < length2; i13++) {
                    l10.K(oVar.b(i13));
                    l10.K(": ");
                    l10.K(oVar.d(i13));
                    l10.writeByte(10);
                }
                l10.K(f23141k);
                l10.K(": ");
                l10.h0(this.f23150i);
                l10.writeByte(10);
                l10.K(f23142l);
                l10.K(": ");
                l10.h0(this.f23151j);
                l10.writeByte(10);
                if (kotlin.jvm.internal.g.a(pVar.f23364a, Constants.SCHEME)) {
                    l10.writeByte(10);
                    kotlin.jvm.internal.g.b(handshake);
                    l10.K(handshake.f23119b.f23193a);
                    l10.writeByte(10);
                    b(l10, handshake.a());
                    b(l10, handshake.c);
                    l10.K(handshake.f23118a.javaName());
                    l10.writeByte(10);
                }
                tf.d dVar = tf.d.f30009a;
                o9.d.l(l10, null);
            } finally {
            }
        }

        public C0320c(x xVar) {
            o d10;
            t tVar = xVar.f23442a;
            this.f23143a = tVar.f23428a;
            x xVar2 = xVar.f23448h;
            kotlin.jvm.internal.g.b(xVar2);
            o oVar = xVar2.f23442a.c;
            o oVar2 = xVar.f23446f;
            Set c = b.c(oVar2);
            if (c.isEmpty()) {
                d10 = ak.b.f666b;
            } else {
                o.a aVar = new o.a();
                int length = oVar.f23361a.length / 2;
                int i10 = 0;
                while (i10 < length) {
                    int i11 = i10 + 1;
                    String b10 = oVar.b(i10);
                    if (c.contains(b10)) {
                        aVar.a(b10, oVar.d(i10));
                    }
                    i10 = i11;
                }
                d10 = aVar.d();
            }
            this.f23144b = d10;
            this.c = tVar.f23429b;
            this.f23145d = xVar.f23443b;
            this.f23146e = xVar.f23444d;
            this.f23147f = xVar.c;
            this.f23148g = oVar2;
            this.f23149h = xVar.f23445e;
            this.f23150i = xVar.f23451k;
            this.f23151j = xVar.f23452l;
        }
    }
}

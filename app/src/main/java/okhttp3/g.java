package okhttp3;

import java.util.Comparator;
import java.util.LinkedHashMap;

/* compiled from: CipherSuite.kt */
/* loaded from: classes3.dex */
public final class g {

    /* renamed from: b  reason: collision with root package name */
    public static final b f23175b;
    public static final a c;

    /* renamed from: d  reason: collision with root package name */
    public static final LinkedHashMap f23176d;

    /* renamed from: e  reason: collision with root package name */
    public static final g f23177e;

    /* renamed from: f  reason: collision with root package name */
    public static final g f23178f;

    /* renamed from: g  reason: collision with root package name */
    public static final g f23179g;

    /* renamed from: h  reason: collision with root package name */
    public static final g f23180h;

    /* renamed from: i  reason: collision with root package name */
    public static final g f23181i;

    /* renamed from: j  reason: collision with root package name */
    public static final g f23182j;

    /* renamed from: k  reason: collision with root package name */
    public static final g f23183k;

    /* renamed from: l  reason: collision with root package name */
    public static final g f23184l;

    /* renamed from: m  reason: collision with root package name */
    public static final g f23185m;

    /* renamed from: n  reason: collision with root package name */
    public static final g f23186n;

    /* renamed from: o  reason: collision with root package name */
    public static final g f23187o;

    /* renamed from: p  reason: collision with root package name */
    public static final g f23188p;

    /* renamed from: q  reason: collision with root package name */
    public static final g f23189q;

    /* renamed from: r  reason: collision with root package name */
    public static final g f23190r;

    /* renamed from: s  reason: collision with root package name */
    public static final g f23191s;

    /* renamed from: t  reason: collision with root package name */
    public static final g f23192t;

    /* renamed from: a  reason: collision with root package name */
    public final String f23193a;

    /* compiled from: CipherSuite.kt */
    /* loaded from: classes3.dex */
    public static final class a implements Comparator<String> {
        /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:
            return -1;
         */
        @Override // java.util.Comparator
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int compare(java.lang.String r7, java.lang.String r8) {
            /*
                r6 = this;
                java.lang.String r7 = (java.lang.String) r7
                java.lang.String r8 = (java.lang.String) r8
                java.lang.String r0 = "a"
                kotlin.jvm.internal.g.e(r7, r0)
                java.lang.String r0 = "b"
                kotlin.jvm.internal.g.e(r8, r0)
                int r0 = r7.length()
                int r1 = r8.length()
                int r0 = java.lang.Math.min(r0, r1)
                r1 = 4
            L1b:
                r2 = 1
                r3 = -1
                if (r1 >= r0) goto L34
                char r4 = r7.charAt(r1)
                char r5 = r8.charAt(r1)
                if (r4 == r5) goto L31
                int r7 = kotlin.jvm.internal.g.f(r4, r5)
                if (r7 >= 0) goto L42
            L2f:
                r2 = r3
                goto L42
            L31:
                int r1 = r1 + 1
                goto L1b
            L34:
                int r7 = r7.length()
                int r8 = r8.length()
                if (r7 == r8) goto L41
                if (r7 >= r8) goto L42
                goto L2f
            L41:
                r2 = 0
            L42:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.g.a.compare(java.lang.Object, java.lang.Object):int");
        }
    }

    /* compiled from: CipherSuite.kt */
    /* loaded from: classes3.dex */
    public static final class b {
        public static final g a(b bVar, String str) {
            g gVar = new g(str);
            g.f23176d.put(str, gVar);
            return gVar;
        }

        public final synchronized g b(String javaName) {
            g gVar;
            String str;
            kotlin.jvm.internal.g.e(javaName, "javaName");
            LinkedHashMap linkedHashMap = g.f23176d;
            gVar = (g) linkedHashMap.get(javaName);
            if (gVar == null) {
                if (kotlin.text.j.M(javaName, "TLS_", false)) {
                    String substring = javaName.substring(4);
                    kotlin.jvm.internal.g.d(substring, "this as java.lang.String).substring(startIndex)");
                    str = kotlin.jvm.internal.g.h(substring, "SSL_");
                } else if (kotlin.text.j.M(javaName, "SSL_", false)) {
                    String substring2 = javaName.substring(4);
                    kotlin.jvm.internal.g.d(substring2, "this as java.lang.String).substring(startIndex)");
                    str = kotlin.jvm.internal.g.h(substring2, "TLS_");
                } else {
                    str = javaName;
                }
                gVar = (g) linkedHashMap.get(str);
                if (gVar == null) {
                    gVar = new g(javaName);
                }
                linkedHashMap.put(javaName, gVar);
            }
            return gVar;
        }
    }

    static {
        b bVar = new b();
        f23175b = bVar;
        c = new a();
        f23176d = new LinkedHashMap();
        b.a(bVar, "SSL_RSA_WITH_NULL_MD5");
        b.a(bVar, "SSL_RSA_WITH_NULL_SHA");
        b.a(bVar, "SSL_RSA_EXPORT_WITH_RC4_40_MD5");
        b.a(bVar, "SSL_RSA_WITH_RC4_128_MD5");
        b.a(bVar, "SSL_RSA_WITH_RC4_128_SHA");
        b.a(bVar, "SSL_RSA_EXPORT_WITH_DES40_CBC_SHA");
        b.a(bVar, "SSL_RSA_WITH_DES_CBC_SHA");
        f23177e = b.a(bVar, "SSL_RSA_WITH_3DES_EDE_CBC_SHA");
        b.a(bVar, "SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA");
        b.a(bVar, "SSL_DHE_DSS_WITH_DES_CBC_SHA");
        b.a(bVar, "SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA");
        b.a(bVar, "SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA");
        b.a(bVar, "SSL_DHE_RSA_WITH_DES_CBC_SHA");
        b.a(bVar, "SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA");
        b.a(bVar, "SSL_DH_anon_EXPORT_WITH_RC4_40_MD5");
        b.a(bVar, "SSL_DH_anon_WITH_RC4_128_MD5");
        b.a(bVar, "SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA");
        b.a(bVar, "SSL_DH_anon_WITH_DES_CBC_SHA");
        b.a(bVar, "SSL_DH_anon_WITH_3DES_EDE_CBC_SHA");
        b.a(bVar, "TLS_KRB5_WITH_DES_CBC_SHA");
        b.a(bVar, "TLS_KRB5_WITH_3DES_EDE_CBC_SHA");
        b.a(bVar, "TLS_KRB5_WITH_RC4_128_SHA");
        b.a(bVar, "TLS_KRB5_WITH_DES_CBC_MD5");
        b.a(bVar, "TLS_KRB5_WITH_3DES_EDE_CBC_MD5");
        b.a(bVar, "TLS_KRB5_WITH_RC4_128_MD5");
        b.a(bVar, "TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA");
        b.a(bVar, "TLS_KRB5_EXPORT_WITH_RC4_40_SHA");
        b.a(bVar, "TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5");
        b.a(bVar, "TLS_KRB5_EXPORT_WITH_RC4_40_MD5");
        f23178f = b.a(bVar, "TLS_RSA_WITH_AES_128_CBC_SHA");
        b.a(bVar, "TLS_DHE_DSS_WITH_AES_128_CBC_SHA");
        b.a(bVar, "TLS_DHE_RSA_WITH_AES_128_CBC_SHA");
        b.a(bVar, "TLS_DH_anon_WITH_AES_128_CBC_SHA");
        f23179g = b.a(bVar, "TLS_RSA_WITH_AES_256_CBC_SHA");
        b.a(bVar, "TLS_DHE_DSS_WITH_AES_256_CBC_SHA");
        b.a(bVar, "TLS_DHE_RSA_WITH_AES_256_CBC_SHA");
        b.a(bVar, "TLS_DH_anon_WITH_AES_256_CBC_SHA");
        b.a(bVar, "TLS_RSA_WITH_NULL_SHA256");
        b.a(bVar, "TLS_RSA_WITH_AES_128_CBC_SHA256");
        b.a(bVar, "TLS_RSA_WITH_AES_256_CBC_SHA256");
        b.a(bVar, "TLS_DHE_DSS_WITH_AES_128_CBC_SHA256");
        b.a(bVar, "TLS_RSA_WITH_CAMELLIA_128_CBC_SHA");
        b.a(bVar, "TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA");
        b.a(bVar, "TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA");
        b.a(bVar, "TLS_DHE_RSA_WITH_AES_128_CBC_SHA256");
        b.a(bVar, "TLS_DHE_DSS_WITH_AES_256_CBC_SHA256");
        b.a(bVar, "TLS_DHE_RSA_WITH_AES_256_CBC_SHA256");
        b.a(bVar, "TLS_DH_anon_WITH_AES_128_CBC_SHA256");
        b.a(bVar, "TLS_DH_anon_WITH_AES_256_CBC_SHA256");
        b.a(bVar, "TLS_RSA_WITH_CAMELLIA_256_CBC_SHA");
        b.a(bVar, "TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA");
        b.a(bVar, "TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA");
        b.a(bVar, "TLS_PSK_WITH_RC4_128_SHA");
        b.a(bVar, "TLS_PSK_WITH_3DES_EDE_CBC_SHA");
        b.a(bVar, "TLS_PSK_WITH_AES_128_CBC_SHA");
        b.a(bVar, "TLS_PSK_WITH_AES_256_CBC_SHA");
        b.a(bVar, "TLS_RSA_WITH_SEED_CBC_SHA");
        f23180h = b.a(bVar, "TLS_RSA_WITH_AES_128_GCM_SHA256");
        f23181i = b.a(bVar, "TLS_RSA_WITH_AES_256_GCM_SHA384");
        b.a(bVar, "TLS_DHE_RSA_WITH_AES_128_GCM_SHA256");
        b.a(bVar, "TLS_DHE_RSA_WITH_AES_256_GCM_SHA384");
        b.a(bVar, "TLS_DHE_DSS_WITH_AES_128_GCM_SHA256");
        b.a(bVar, "TLS_DHE_DSS_WITH_AES_256_GCM_SHA384");
        b.a(bVar, "TLS_DH_anon_WITH_AES_128_GCM_SHA256");
        b.a(bVar, "TLS_DH_anon_WITH_AES_256_GCM_SHA384");
        b.a(bVar, "TLS_EMPTY_RENEGOTIATION_INFO_SCSV");
        b.a(bVar, "TLS_FALLBACK_SCSV");
        b.a(bVar, "TLS_ECDH_ECDSA_WITH_NULL_SHA");
        b.a(bVar, "TLS_ECDH_ECDSA_WITH_RC4_128_SHA");
        b.a(bVar, "TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA");
        b.a(bVar, "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA");
        b.a(bVar, "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA");
        b.a(bVar, "TLS_ECDHE_ECDSA_WITH_NULL_SHA");
        b.a(bVar, "TLS_ECDHE_ECDSA_WITH_RC4_128_SHA");
        b.a(bVar, "TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA");
        b.a(bVar, "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA");
        b.a(bVar, "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA");
        b.a(bVar, "TLS_ECDH_RSA_WITH_NULL_SHA");
        b.a(bVar, "TLS_ECDH_RSA_WITH_RC4_128_SHA");
        b.a(bVar, "TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA");
        b.a(bVar, "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA");
        b.a(bVar, "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA");
        b.a(bVar, "TLS_ECDHE_RSA_WITH_NULL_SHA");
        b.a(bVar, "TLS_ECDHE_RSA_WITH_RC4_128_SHA");
        b.a(bVar, "TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA");
        f23182j = b.a(bVar, "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA");
        f23183k = b.a(bVar, "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA");
        b.a(bVar, "TLS_ECDH_anon_WITH_NULL_SHA");
        b.a(bVar, "TLS_ECDH_anon_WITH_RC4_128_SHA");
        b.a(bVar, "TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA");
        b.a(bVar, "TLS_ECDH_anon_WITH_AES_128_CBC_SHA");
        b.a(bVar, "TLS_ECDH_anon_WITH_AES_256_CBC_SHA");
        b.a(bVar, "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256");
        b.a(bVar, "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384");
        b.a(bVar, "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256");
        b.a(bVar, "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384");
        b.a(bVar, "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256");
        b.a(bVar, "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384");
        b.a(bVar, "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256");
        b.a(bVar, "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384");
        f23184l = b.a(bVar, "TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256");
        f23185m = b.a(bVar, "TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384");
        b.a(bVar, "TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256");
        b.a(bVar, "TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384");
        f23186n = b.a(bVar, "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256");
        f23187o = b.a(bVar, "TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384");
        b.a(bVar, "TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256");
        b.a(bVar, "TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384");
        b.a(bVar, "TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA");
        b.a(bVar, "TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA");
        f23188p = b.a(bVar, "TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256");
        f23189q = b.a(bVar, "TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256");
        b.a(bVar, "TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256");
        b.a(bVar, "TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256");
        f23190r = b.a(bVar, "TLS_AES_128_GCM_SHA256");
        f23191s = b.a(bVar, "TLS_AES_256_GCM_SHA384");
        f23192t = b.a(bVar, "TLS_CHACHA20_POLY1305_SHA256");
        b.a(bVar, "TLS_AES_128_CCM_SHA256");
        b.a(bVar, "TLS_AES_128_CCM_8_SHA256");
    }

    public g(String str) {
        this.f23193a = str;
    }

    public final String toString() {
        return this.f23193a;
    }
}

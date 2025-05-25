package jk;

import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import kotlin.collections.EmptyList;
import kotlin.collections.k;
import kotlin.jvm.internal.g;

/* compiled from: OkHostnameVerifier.kt */
/* loaded from: classes3.dex */
public final class c implements HostnameVerifier {

    /* renamed from: a  reason: collision with root package name */
    public static final c f19286a = new c();

    public static ArrayList a(X509Certificate x509Certificate) {
        List b10 = b(x509Certificate, 7);
        List elements = b(x509Certificate, 2);
        g.e(b10, "<this>");
        g.e(elements, "elements");
        if (elements instanceof Collection) {
            List list = elements;
            ArrayList arrayList = new ArrayList(list.size() + b10.size());
            arrayList.addAll(b10);
            arrayList.addAll(list);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(b10);
        k.k0(elements, arrayList2);
        return arrayList2;
    }

    public static List b(X509Certificate x509Certificate, int i10) {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return EmptyList.INSTANCE;
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && g.a(list.get(0), Integer.valueOf(i10)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return EmptyList.INSTANCE;
        }
    }

    public static boolean c(String str) {
        boolean z10;
        boolean z11;
        int i10;
        char c;
        int length = str.length();
        int length2 = str.length();
        if (length2 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (length2 <= str.length()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                long j10 = 0;
                int i11 = 0;
                while (i11 < length2) {
                    char charAt = str.charAt(i11);
                    if (charAt < 128) {
                        j10++;
                    } else {
                        if (charAt < 2048) {
                            i10 = 2;
                        } else if (charAt >= 55296 && charAt <= 57343) {
                            int i12 = i11 + 1;
                            if (i12 < length2) {
                                c = str.charAt(i12);
                            } else {
                                c = 0;
                            }
                            if (charAt <= 56319 && c >= 56320 && c <= 57343) {
                                j10 += 4;
                                i11 += 2;
                            } else {
                                j10++;
                                i11 = i12;
                            }
                        } else {
                            i10 = 3;
                        }
                        j10 += i10;
                    }
                    i11++;
                }
                if (length != ((int) j10)) {
                    return false;
                }
                return true;
            }
            StringBuilder e10 = androidx.appcompat.view.menu.d.e("endIndex > string.length: ", length2, " > ");
            e10.append(str.length());
            throw new IllegalArgumentException(e10.toString().toString());
        }
        throw new IllegalArgumentException(a0.a.g("endIndex < beginIndex: ", length2, " < 0").toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x013c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean d(java.lang.String r11, java.security.cert.X509Certificate r12) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: jk.c.d(java.lang.String, java.security.cert.X509Certificate):boolean");
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String host, SSLSession session) {
        Certificate certificate;
        g.e(host, "host");
        g.e(session, "session");
        if (c(host)) {
            try {
                certificate = session.getPeerCertificates()[0];
                if (certificate == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                }
            } catch (SSLException unused) {
                return false;
            }
        }
        return d(host, (X509Certificate) certificate);
    }
}

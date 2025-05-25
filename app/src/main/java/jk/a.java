package jk;

import kotlin.jvm.internal.g;

/* compiled from: BasicCertificateChainCleaner.kt */
/* loaded from: classes3.dex */
public final class a extends androidx.privacysandbox.ads.adservices.topics.d {

    /* renamed from: a  reason: collision with root package name */
    public final d f19284a;

    public a(d trustRootIndex) {
        g.e(trustRootIndex, "trustRootIndex");
        this.f19284a = trustRootIndex;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof a) && g.a(((a) obj).f19284a, this.f19284a)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0064 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0099 A[SYNTHETIC] */
    @Override // androidx.privacysandbox.ads.adservices.topics.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List f(java.lang.String r10, java.util.List r11) {
        /*
            r9 = this;
            java.lang.String r0 = "chain"
            kotlin.jvm.internal.g.e(r11, r0)
            java.lang.String r0 = "hostname"
            kotlin.jvm.internal.g.e(r10, r0)
            java.util.ArrayDeque r10 = new java.util.ArrayDeque
            java.util.Collection r11 = (java.util.Collection) r11
            r10.<init>(r11)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.lang.Object r0 = r10.removeFirst()
            java.lang.String r1 = "queue.removeFirst()"
            kotlin.jvm.internal.g.d(r0, r1)
            r11.add(r0)
            r0 = 0
            r1 = r0
            r2 = r1
        L25:
            r3 = 9
            if (r1 >= r3) goto Lb7
            int r1 = r1 + 1
            r3 = 1
            java.lang.Object r4 = androidx.appcompat.view.menu.d.b(r11, r3)
            java.security.cert.X509Certificate r4 = (java.security.cert.X509Certificate) r4
            jk.d r5 = r9.f19284a
            java.security.cert.X509Certificate r5 = r5.a(r4)
            if (r5 == 0) goto L67
            int r2 = r11.size()
            if (r2 > r3) goto L46
            boolean r2 = kotlin.jvm.internal.g.a(r4, r5)
            if (r2 != 0) goto L49
        L46:
            r11.add(r5)
        L49:
            java.security.Principal r2 = r5.getIssuerDN()
            java.security.Principal r4 = r5.getSubjectDN()
            boolean r2 = kotlin.jvm.internal.g.a(r2, r4)
            if (r2 != 0) goto L58
            goto L61
        L58:
            java.security.PublicKey r2 = r5.getPublicKey()     // Catch: java.security.GeneralSecurityException -> L61
            r5.verify(r2)     // Catch: java.security.GeneralSecurityException -> L61
            r2 = r3
            goto L62
        L61:
            r2 = r0
        L62:
            if (r2 == 0) goto L65
            return r11
        L65:
            r2 = r3
            goto L25
        L67:
            java.util.Iterator r5 = r10.iterator()
            java.lang.String r6 = "queue.iterator()"
            kotlin.jvm.internal.g.d(r5, r6)
        L70:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto La8
            java.lang.Object r6 = r5.next()
            if (r6 == 0) goto La0
            java.security.cert.X509Certificate r6 = (java.security.cert.X509Certificate) r6
            java.security.Principal r7 = r4.getIssuerDN()
            java.security.Principal r8 = r6.getSubjectDN()
            boolean r7 = kotlin.jvm.internal.g.a(r7, r8)
            if (r7 != 0) goto L8d
            goto L96
        L8d:
            java.security.PublicKey r7 = r6.getPublicKey()     // Catch: java.security.GeneralSecurityException -> L96
            r4.verify(r7)     // Catch: java.security.GeneralSecurityException -> L96
            r7 = r3
            goto L97
        L96:
            r7 = r0
        L97:
            if (r7 == 0) goto L70
            r5.remove()
            r11.add(r6)
            goto L25
        La0:
            java.lang.NullPointerException r10 = new java.lang.NullPointerException
            java.lang.String r11 = "null cannot be cast to non-null type java.security.cert.X509Certificate"
            r10.<init>(r11)
            throw r10
        La8:
            if (r2 == 0) goto Lab
            return r11
        Lab:
            javax.net.ssl.SSLPeerUnverifiedException r10 = new javax.net.ssl.SSLPeerUnverifiedException
            java.lang.String r11 = "Failed to find a trusted cert that signed "
            java.lang.String r11 = kotlin.jvm.internal.g.h(r4, r11)
            r10.<init>(r11)
            throw r10
        Lb7:
            javax.net.ssl.SSLPeerUnverifiedException r10 = new javax.net.ssl.SSLPeerUnverifiedException
            java.lang.String r0 = "Certificate chain too long: "
            java.lang.String r11 = kotlin.jvm.internal.g.h(r11, r0)
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: jk.a.f(java.lang.String, java.util.List):java.util.List");
    }

    public final int hashCode() {
        return this.f19284a.hashCode();
    }
}

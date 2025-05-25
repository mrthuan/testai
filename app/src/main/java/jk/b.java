package jk;

import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import kotlin.jvm.internal.g;

/* compiled from: BasicTrustRootIndex.kt */
/* loaded from: classes3.dex */
public final class b implements d {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashMap f19285a;

    public b(X509Certificate... caCerts) {
        g.e(caCerts, "caCerts");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int length = caCerts.length;
        int i10 = 0;
        while (i10 < length) {
            X509Certificate x509Certificate = caCerts[i10];
            i10++;
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            g.d(subjectX500Principal, "caCert.subjectX500Principal");
            Object obj = linkedHashMap.get(subjectX500Principal);
            if (obj == null) {
                obj = new LinkedHashSet();
                linkedHashMap.put(subjectX500Principal, obj);
            }
            ((Set) obj).add(x509Certificate);
        }
        this.f19285a = linkedHashMap;
    }

    @Override // jk.d
    public final X509Certificate a(X509Certificate cert) {
        boolean z10;
        g.e(cert, "cert");
        Set set = (Set) this.f19285a.get(cert.getIssuerX500Principal());
        Object obj = null;
        if (set == null) {
            return null;
        }
        Iterator it = set.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            try {
                cert.verify(((X509Certificate) next).getPublicKey());
                z10 = true;
                continue;
            } catch (Exception unused) {
                z10 = false;
                continue;
            }
            if (z10) {
                obj = next;
                break;
            }
        }
        return (X509Certificate) obj;
    }

    public final boolean equals(Object obj) {
        if (obj != this && (!(obj instanceof b) || !g.a(((b) obj).f19285a, this.f19285a))) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f19285a.hashCode();
    }
}

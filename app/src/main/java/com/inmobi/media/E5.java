package com.inmobi.media;

/* loaded from: classes2.dex */
public final class E5 {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f14224a;

    /* renamed from: b  reason: collision with root package name */
    public final String f14225b;
    public final boolean c;

    public E5(boolean z10, String landingScheme, boolean z11) {
        kotlin.jvm.internal.g.e(landingScheme, "landingScheme");
        this.f14224a = z10;
        this.f14225b = landingScheme;
        this.c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E5)) {
            return false;
        }
        E5 e52 = (E5) obj;
        if (this.f14224a == e52.f14224a && kotlin.jvm.internal.g.a(this.f14225b, e52.f14225b) && this.c == e52.c) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public final int hashCode() {
        boolean z10 = this.f14224a;
        int i10 = 1;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        int h10 = androidx.activity.f.h(this.f14225b, r02 * 31, 31);
        boolean z11 = this.c;
        if (!z11) {
            i10 = z11 ? 1 : 0;
        }
        return h10 + i10;
    }

    public final String toString() {
        return "LandingPageState(isInAppBrowser=" + this.f14224a + ", landingScheme=" + this.f14225b + ", isCCTEnabled=" + this.c + ')';
    }
}

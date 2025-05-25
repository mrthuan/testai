package wl;

import com.tom_roush.pdfbox.pdmodel.PDPage;
import kotlin.jvm.internal.g;

/* compiled from: PageWrapper.kt */
/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final int f31370a;

    /* renamed from: b  reason: collision with root package name */
    public final PDPage f31371b;

    public f(PDPage pDPage, int i10) {
        ea.a.p("P2FWZQ==", "eMfwtmJZ");
        this.f31370a = i10;
        this.f31371b = pDPage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f31370a == fVar.f31370a && g.a(this.f31371b, fVar.f31371b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f31371b.hashCode() + (this.f31370a * 31);
    }

    public final String toString() {
        return "PageWrapper(index=" + this.f31370a + ", page=" + this.f31371b + ")";
    }
}

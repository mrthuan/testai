package no;

import androidx.activity.r;
import kotlin.jvm.internal.g;

/* compiled from: PDFPrintInfo.kt */
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final String f22614a;

    /* renamed from: b  reason: collision with root package name */
    public final String f22615b;

    public d(String str, String str2) {
        g.e(str, ea.a.p("P2FFaA==", "4OUV1bzP"));
        g.e(str2, ea.a.p("Q2E4cwRvEGQ=", "dgYSgmOz"));
        this.f22614a = str;
        this.f22615b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (g.a(this.f22614a, dVar.f22614a) && g.a(this.f22615b, dVar.f22615b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f22615b.hashCode() + (this.f22614a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PDFPrintInfo(path=");
        sb2.append(this.f22614a);
        sb2.append(", password=");
        return r.g(sb2, this.f22615b, ")");
    }
}

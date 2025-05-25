package qm;

import kotlin.jvm.internal.g;

/* compiled from: InquiryAfterGuideEntity.kt */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final int f29386a;

    /* renamed from: b  reason: collision with root package name */
    public final String f29387b;

    public b(int i10, String str) {
        ea.a.p("UG8ldBZudA==", "Vc90KmQI");
        this.f29386a = i10;
        this.f29387b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f29386a == bVar.f29386a && g.a(this.f29387b, bVar.f29387b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f29387b.hashCode() + (this.f29386a * 31);
    }

    public final String toString() {
        return "InquiryAfterGuideItemEntity(iconRes=" + this.f29386a + ", content=" + this.f29387b + ")";
    }
}

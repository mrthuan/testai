package nl;

import androidx.activity.r;

/* compiled from: File142Params.kt */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final long f22579a;

    /* renamed from: b  reason: collision with root package name */
    public final String f22580b;
    public final String c;

    public a(long j10, String str, String str2) {
        kotlin.jvm.internal.g.e(str, ea.a.p("VWknZSd5EmU=", "Uo8zaJH7"));
        kotlin.jvm.internal.g.e(str2, ea.a.p("Q2E5YR5z", "KaQBuWZp"));
        this.f22579a = j10;
        this.f22580b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f22579a == aVar.f22579a && kotlin.jvm.internal.g.a(this.f22580b, aVar.f22580b) && kotlin.jvm.internal.g.a(this.c, aVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f22579a;
        return this.c.hashCode() + androidx.activity.f.h(this.f22580b, ((int) (j10 ^ (j10 >>> 32))) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("File142Params(id=");
        sb2.append(this.f22579a);
        sb2.append(", fileType=");
        sb2.append(this.f22580b);
        sb2.append(", params=");
        return r.g(sb2, this.c, ")");
    }
}

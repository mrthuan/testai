package androidx.privacysandbox.ads.adservices.topics;

/* compiled from: Topic.kt */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final long f4158a;

    /* renamed from: b  reason: collision with root package name */
    public final long f4159b;
    public final int c;

    public c(long j10, long j11, int i10) {
        this.f4158a = j10;
        this.f4159b = j11;
        this.c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f4158a == cVar.f4158a && this.f4159b == cVar.f4159b && this.c == cVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f4158a;
        long j11 = this.f4159b;
        return (((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) ((j11 >>> 32) ^ j11))) * 31) + this.c;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TaxonomyVersion=");
        sb2.append(this.f4158a);
        sb2.append(", ModelVersion=");
        sb2.append(this.f4159b);
        sb2.append(", TopicCode=");
        return a0.a.h("Topic { ", a6.h.g(sb2, this.c, " }"));
    }
}

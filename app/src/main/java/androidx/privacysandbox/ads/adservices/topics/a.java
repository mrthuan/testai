package androidx.privacysandbox.ads.adservices.topics;

/* compiled from: GetTopicsRequest.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f4155a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f4156b;

    /* compiled from: GetTopicsRequest.kt */
    /* renamed from: androidx.privacysandbox.ads.adservices.topics.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0020a {
    }

    public a() {
        this("", false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (kotlin.jvm.internal.g.a(this.f4155a, aVar.f4155a) && this.f4156b == aVar.f4156b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f4155a.hashCode() * 31;
        if (this.f4156b) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode + i10;
    }

    public final String toString() {
        return "GetTopicsRequest: adsSdkName=" + this.f4155a + ", shouldRecordObservation=" + this.f4156b;
    }

    public a(String adsSdkName, boolean z10) {
        kotlin.jvm.internal.g.e(adsSdkName, "adsSdkName");
        this.f4155a = adsSdkName;
        this.f4156b = z10;
    }
}

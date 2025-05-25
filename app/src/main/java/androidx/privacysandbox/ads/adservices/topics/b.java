package androidx.privacysandbox.ads.adservices.topics;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;

/* compiled from: GetTopicsResponse.kt */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final List<c> f4157a;

    public b(List<c> topics) {
        kotlin.jvm.internal.g.e(topics, "topics");
        this.f4157a = topics;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        List<c> list = this.f4157a;
        b bVar = (b) obj;
        if (list.size() != bVar.f4157a.size()) {
            return false;
        }
        return kotlin.jvm.internal.g.a(new HashSet(list), new HashSet(bVar.f4157a));
    }

    public final int hashCode() {
        return Objects.hash(this.f4157a);
    }

    public final String toString() {
        return "Topics=" + this.f4157a;
    }
}

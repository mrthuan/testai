package e5;

import java.util.List;
import java.util.Map;

/* compiled from: UpdateInfo.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, List<String>> f16453a;

    public a() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof a) && kotlin.jvm.internal.g.a(this.f16453a, ((a) obj).f16453a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Map<String, List<String>> map = this.f16453a;
        if (map == null) {
            return 0;
        }
        return map.hashCode();
    }

    public final String toString() {
        return "Language(lan=" + this.f16453a + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(Map<String, ? extends List<String>> map) {
        this.f16453a = map;
    }
}

package s6;

import androidx.activity.r;

/* compiled from: Encoding.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f29752a;

    public b(String str) {
        if (str != null) {
            this.f29752a = str;
            return;
        }
        throw new NullPointerException("name is null");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        return this.f29752a.equals(((b) obj).f29752a);
    }

    public final int hashCode() {
        return this.f29752a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return r.g(new StringBuilder("Encoding{name=\""), this.f29752a, "\"}");
    }
}

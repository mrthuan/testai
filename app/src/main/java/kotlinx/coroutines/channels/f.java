package kotlinx.coroutines.channels;

/* compiled from: Channel.kt */
/* loaded from: classes.dex */
public final class f<T> {

    /* renamed from: b  reason: collision with root package name */
    public static final b f20037b = new b();

    /* renamed from: a  reason: collision with root package name */
    public final Object f20038a;

    /* compiled from: Channel.kt */
    /* loaded from: classes.dex */
    public static final class a extends b {

        /* renamed from: a  reason: collision with root package name */
        public final Throwable f20039a;

        public a(Throwable th2) {
            this.f20039a = th2;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                if (kotlin.jvm.internal.g.a(this.f20039a, ((a) obj).f20039a)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            Throwable th2 = this.f20039a;
            if (th2 != null) {
                return th2.hashCode();
            }
            return 0;
        }

        @Override // kotlinx.coroutines.channels.f.b
        public final String toString() {
            return "Closed(" + this.f20039a + ')';
        }
    }

    /* compiled from: Channel.kt */
    /* loaded from: classes.dex */
    public static class b {
        public String toString() {
            return "Failed";
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        if (!kotlin.jvm.internal.g.a(this.f20038a, ((f) obj).f20038a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Object obj = this.f20038a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f20038a;
        if (obj instanceof a) {
            return ((a) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}

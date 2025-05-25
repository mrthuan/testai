package kotlinx.coroutines;

/* compiled from: CompletionState.kt */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    public final Object f20227a;

    /* renamed from: b  reason: collision with root package name */
    public final cg.l<Throwable, tf.d> f20228b;

    public q(cg.l lVar, Object obj) {
        this.f20227a = obj;
        this.f20228b = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        if (kotlin.jvm.internal.g.a(this.f20227a, qVar.f20227a) && kotlin.jvm.internal.g.a(this.f20228b, qVar.f20228b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Object obj = this.f20227a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return this.f20228b.hashCode() + (hashCode * 31);
    }

    public final String toString() {
        return "CompletedWithCancellation(result=" + this.f20227a + ", onCancellation=" + this.f20228b + ')';
    }
}

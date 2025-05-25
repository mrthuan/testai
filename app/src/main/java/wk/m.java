package wk;

/* compiled from: Subscription.java */
/* loaded from: classes3.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final Object f31352a;

    /* renamed from: b  reason: collision with root package name */
    public final k f31353b;
    public volatile boolean c = true;

    public m(Object obj, k kVar) {
        this.f31352a = obj;
        this.f31353b = kVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f31352a != mVar.f31352a || !this.f31353b.equals(mVar.f31353b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f31353b.f31344f.hashCode() + this.f31352a.hashCode();
    }
}

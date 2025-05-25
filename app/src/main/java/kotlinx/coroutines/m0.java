package kotlinx.coroutines;

/* compiled from: JobSupport.kt */
/* loaded from: classes.dex */
public final class m0 implements t0 {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f20211a;

    public m0(boolean z10) {
        this.f20211a = z10;
    }

    @Override // kotlinx.coroutines.t0
    public final boolean a() {
        return this.f20211a;
    }

    @Override // kotlinx.coroutines.t0
    public final g1 c() {
        return null;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("Empty{");
        if (this.f20211a) {
            str = "Active";
        } else {
            str = "New";
        }
        return androidx.activity.r.f(sb2, str, '}');
    }
}

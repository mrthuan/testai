package kotlinx.coroutines;

/* compiled from: Builders.common.kt */
/* loaded from: classes.dex */
public class c0<T> extends a<T> implements b0<T> {
    @Override // kotlinx.coroutines.b0
    public final T d() {
        Object S = S();
        if (!(S instanceof t0)) {
            if (!(S instanceof p)) {
                return (T) aj.b.Z(S);
            }
            throw ((p) S).f20226a;
        }
        throw new IllegalStateException("This job has not completed yet".toString());
    }
}

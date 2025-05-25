package kotlinx.coroutines;

/* compiled from: MainCoroutineDispatcher.kt */
/* loaded from: classes.dex */
public abstract class f1 extends CoroutineDispatcher {
    @Override // kotlinx.coroutines.CoroutineDispatcher
    public String toString() {
        f1 f1Var;
        String str;
        lg.b bVar = j0.f20206a;
        f1 f1Var2 = kotlinx.coroutines.internal.l.f20194a;
        if (this == f1Var2) {
            str = "Dispatchers.Main";
        } else {
            try {
                f1Var = f1Var2.v();
            } catch (UnsupportedOperationException unused) {
                f1Var = null;
            }
            if (this == f1Var) {
                str = "Dispatchers.Main.immediate";
            } else {
                str = null;
            }
        }
        if (str == null) {
            return getClass().getSimpleName() + '@' + y.b(this);
        }
        return str;
    }

    public abstract f1 v();
}

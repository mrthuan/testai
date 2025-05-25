package kotlinx.coroutines;

/* compiled from: DefaultExecutor.kt */
/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a  reason: collision with root package name */
    public static final d0 f19982a;

    static {
        String str;
        boolean z10;
        d0 d0Var;
        int i10 = kotlinx.coroutines.internal.s.f20199a;
        try {
            str = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null) {
            z10 = Boolean.parseBoolean(str);
        } else {
            z10 = false;
        }
        if (!z10) {
            d0Var = z.f20278i;
        } else {
            lg.b bVar = j0.f20206a;
            f1 f1Var = kotlinx.coroutines.internal.l.f20194a;
            f1Var.v();
            if (!(f1Var instanceof d0)) {
                d0Var = z.f20278i;
            } else {
                d0Var = (d0) f1Var;
            }
        }
        f19982a = d0Var;
    }
}

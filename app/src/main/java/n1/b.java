package n1;

import androidx.lifecycle.j0;
import androidx.lifecycle.m0;
import kotlin.jvm.internal.g;

/* compiled from: InitializerViewModelFactory.kt */
/* loaded from: classes.dex */
public final class b implements m0.b {

    /* renamed from: a  reason: collision with root package name */
    public final d<?>[] f22315a;

    public b(d<?>... initializers) {
        g.e(initializers, "initializers");
        this.f22315a = initializers;
    }

    @Override // androidx.lifecycle.m0.b
    public final j0 a(Class cls) {
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    @Override // androidx.lifecycle.m0.b
    public final j0 b(Class cls, c cVar) {
        d<?>[] dVarArr;
        j0 j0Var = null;
        for (d<?> dVar : this.f22315a) {
            if (g.a(dVar.f22316a, cls)) {
                Object invoke = dVar.f22317b.invoke(cVar);
                if (invoke instanceof j0) {
                    j0Var = (j0) invoke;
                } else {
                    j0Var = null;
                }
            }
        }
        if (j0Var != null) {
            return j0Var;
        }
        throw new IllegalArgumentException("No initializer set for given class ".concat(cls.getName()));
    }
}

package androidx.lifecycle;

import androidx.lifecycle.j0;
import androidx.lifecycle.m0;

/* compiled from: ViewModelLazy.kt */
/* loaded from: classes.dex */
public final class k0<VM extends j0> implements tf.c<VM> {

    /* renamed from: a  reason: collision with root package name */
    public final ig.c<VM> f4058a;

    /* renamed from: b  reason: collision with root package name */
    public final cg.a<o0> f4059b;
    public final cg.a<m0.b> c;

    /* renamed from: d  reason: collision with root package name */
    public final cg.a<n1.a> f4060d;

    /* renamed from: e  reason: collision with root package name */
    public VM f4061e;

    public k0(kotlin.jvm.internal.c cVar, cg.a aVar, cg.a aVar2, cg.a aVar3) {
        this.f4058a = cVar;
        this.f4059b = aVar;
        this.c = aVar2;
        this.f4060d = aVar3;
    }

    @Override // tf.c
    public final Object getValue() {
        VM vm2 = this.f4061e;
        if (vm2 == null) {
            m0 m0Var = new m0(this.f4059b.invoke(), this.c.invoke(), this.f4060d.invoke());
            ig.c<VM> cVar = this.f4058a;
            kotlin.jvm.internal.g.e(cVar, "<this>");
            Class<?> a10 = ((kotlin.jvm.internal.b) cVar).a();
            kotlin.jvm.internal.g.c(a10, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
            VM vm3 = (VM) m0Var.a(a10);
            this.f4061e = vm3;
            return vm3;
        }
        return vm2;
    }
}

package kotlin.coroutines;

import cg.p;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.g;

/* compiled from: CoroutineContextImpl.kt */
/* loaded from: classes.dex */
public abstract class a implements CoroutineContext.a {

    /* renamed from: a  reason: collision with root package name */
    public final CoroutineContext.b<?> f19932a;

    public a(CoroutineContext.b<?> bVar) {
        this.f19932a = bVar;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final <R> R fold(R r4, p<? super R, ? super CoroutineContext.a, ? extends R> operation) {
        g.e(operation, "operation");
        return operation.invoke(r4, this);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.a> E get(CoroutineContext.b<E> bVar) {
        return (E) CoroutineContext.a.C0271a.a(this, bVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.a
    public final CoroutineContext.b<?> getKey() {
        return this.f19932a;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.b<?> bVar) {
        return CoroutineContext.a.C0271a.b(this, bVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext context) {
        g.e(context, "context");
        return CoroutineContext.DefaultImpls.a(this, context);
    }
}

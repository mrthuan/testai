package kotlinx.coroutines;

import kotlin.coroutines.CoroutineContext;

/* compiled from: CoroutineContext.kt */
/* loaded from: classes.dex */
public final class r1 implements CoroutineContext.a, CoroutineContext.b<r1> {

    /* renamed from: a  reason: collision with root package name */
    public static final r1 f20230a = new r1();

    @Override // kotlin.coroutines.CoroutineContext
    public final <R> R fold(R r4, cg.p<? super R, ? super CoroutineContext.a, ? extends R> operation) {
        kotlin.jvm.internal.g.e(operation, "operation");
        return operation.invoke(r4, this);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final <E extends CoroutineContext.a> E get(CoroutineContext.b<E> bVar) {
        return (E) CoroutineContext.a.C0271a.a(this, bVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(CoroutineContext.b<?> bVar) {
        return CoroutineContext.a.C0271a.b(this, bVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext context) {
        kotlin.jvm.internal.g.e(context, "context");
        return CoroutineContext.DefaultImpls.a(this, context);
    }

    @Override // kotlin.coroutines.CoroutineContext.a
    public final CoroutineContext.b<?> getKey() {
        return this;
    }
}

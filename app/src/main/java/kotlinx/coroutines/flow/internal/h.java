package kotlinx.coroutines.flow.internal;

import cg.p;
import kotlin.coroutines.CoroutineContext;

/* compiled from: SafeCollector.kt */
/* loaded from: classes.dex */
public final class h implements CoroutineContext {

    /* renamed from: a  reason: collision with root package name */
    public final Throwable f20120a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ CoroutineContext f20121b;

    public h(CoroutineContext coroutineContext, Throwable th2) {
        this.f20120a = th2;
        this.f20121b = coroutineContext;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final <R> R fold(R r4, p<? super R, ? super CoroutineContext.a, ? extends R> pVar) {
        return (R) this.f20121b.fold(r4, pVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final <E extends CoroutineContext.a> E get(CoroutineContext.b<E> bVar) {
        return (E) this.f20121b.get(bVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(CoroutineContext.b<?> bVar) {
        return this.f20121b.minusKey(bVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return this.f20121b.plus(coroutineContext);
    }
}

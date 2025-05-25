package kotlin.coroutines;

import cg.l;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContext.a;
import kotlin.jvm.internal.g;

/* compiled from: CoroutineContextImpl.kt */
/* loaded from: classes.dex */
public abstract class b<B extends CoroutineContext.a, E extends B> implements CoroutineContext.b<E> {

    /* renamed from: a  reason: collision with root package name */
    public final l<CoroutineContext.a, E> f19933a;

    /* renamed from: b  reason: collision with root package name */
    public final CoroutineContext.b<?> f19934b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [cg.l<? super kotlin.coroutines.CoroutineContext$a, ? extends E extends B>, cg.l<kotlin.coroutines.CoroutineContext$a, E extends B>, java.lang.Object] */
    public b(CoroutineContext.b<B> baseKey, l<? super CoroutineContext.a, ? extends E> safeCast) {
        g.e(baseKey, "baseKey");
        g.e(safeCast, "safeCast");
        this.f19933a = safeCast;
        this.f19934b = baseKey instanceof b ? (CoroutineContext.b<B>) ((b) baseKey).f19934b : baseKey;
    }
}

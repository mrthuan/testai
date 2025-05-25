package kotlin.coroutines;

import cg.p;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.jvm.internal.g;

/* compiled from: CoroutineContext.kt */
/* loaded from: classes.dex */
public interface CoroutineContext {

    /* compiled from: CoroutineContext.kt */
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        public static CoroutineContext a(CoroutineContext coroutineContext, CoroutineContext context) {
            g.e(context, "context");
            if (context != EmptyCoroutineContext.INSTANCE) {
                return (CoroutineContext) context.fold(coroutineContext, new p<CoroutineContext, a, CoroutineContext>() { // from class: kotlin.coroutines.CoroutineContext$plus$1
                    @Override // cg.p
                    public final CoroutineContext invoke(CoroutineContext acc, CoroutineContext.a element) {
                        CombinedContext combinedContext;
                        g.e(acc, "acc");
                        g.e(element, "element");
                        CoroutineContext minusKey = acc.minusKey(element.getKey());
                        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
                        if (minusKey == emptyCoroutineContext) {
                            return element;
                        }
                        int i10 = d.f19935b1;
                        d.a aVar = d.a.f19936a;
                        d dVar = (d) minusKey.get(aVar);
                        if (dVar == null) {
                            combinedContext = new CombinedContext(minusKey, element);
                        } else {
                            CoroutineContext minusKey2 = minusKey.minusKey(aVar);
                            if (minusKey2 == emptyCoroutineContext) {
                                return new CombinedContext(element, dVar);
                            }
                            combinedContext = new CombinedContext(new CombinedContext(minusKey2, element), dVar);
                        }
                        return combinedContext;
                    }
                });
            }
            return coroutineContext;
        }
    }

    /* compiled from: CoroutineContext.kt */
    /* loaded from: classes.dex */
    public interface a extends CoroutineContext {

        /* compiled from: CoroutineContext.kt */
        /* renamed from: kotlin.coroutines.CoroutineContext$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0271a {
            /* JADX WARN: Multi-variable type inference failed */
            public static <E extends a> E a(a aVar, b<E> key) {
                g.e(key, "key");
                if (!g.a(aVar.getKey(), key)) {
                    return null;
                }
                return aVar;
            }

            public static CoroutineContext b(a aVar, b<?> key) {
                g.e(key, "key");
                if (g.a(aVar.getKey(), key)) {
                    return EmptyCoroutineContext.INSTANCE;
                }
                return aVar;
            }
        }

        b<?> getKey();
    }

    /* compiled from: CoroutineContext.kt */
    /* loaded from: classes.dex */
    public interface b<E extends a> {
    }

    <R> R fold(R r4, p<? super R, ? super a, ? extends R> pVar);

    <E extends a> E get(b<E> bVar);

    CoroutineContext minusKey(b<?> bVar);

    CoroutineContext plus(CoroutineContext coroutineContext);
}

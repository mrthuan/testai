package kotlin.coroutines;

import androidx.activity.r;
import cg.p;
import java.io.Serializable;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.g;

/* compiled from: CoroutineContextImpl.kt */
/* loaded from: classes.dex */
public final class CombinedContext implements CoroutineContext, Serializable {
    private final CoroutineContext.a element;
    private final CoroutineContext left;

    /* compiled from: CoroutineContextImpl.kt */
    /* loaded from: classes.dex */
    public static final class Serialized implements Serializable {
        public static final a Companion = new a();
        private static final long serialVersionUID = 0;
        private final CoroutineContext[] elements;

        /* compiled from: CoroutineContextImpl.kt */
        /* loaded from: classes.dex */
        public static final class a {
        }

        public Serialized(CoroutineContext[] elements) {
            g.e(elements, "elements");
            this.elements = elements;
        }

        private final Object readResolve() {
            CoroutineContext[] coroutineContextArr = this.elements;
            CoroutineContext coroutineContext = EmptyCoroutineContext.INSTANCE;
            for (CoroutineContext coroutineContext2 : coroutineContextArr) {
                coroutineContext = coroutineContext.plus(coroutineContext2);
            }
            return coroutineContext;
        }

        public final CoroutineContext[] getElements() {
            return this.elements;
        }
    }

    public CombinedContext(CoroutineContext left, CoroutineContext.a element) {
        g.e(left, "left");
        g.e(element, "element");
        this.left = left;
        this.element = element;
    }

    private final Object writeReplace() {
        boolean z10;
        int e10 = e();
        final CoroutineContext[] coroutineContextArr = new CoroutineContext[e10];
        final Ref$IntRef ref$IntRef = new Ref$IntRef();
        fold(tf.d.f30009a, new p<tf.d, CoroutineContext.a, tf.d>() { // from class: kotlin.coroutines.CombinedContext$writeReplace$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // cg.p
            public /* bridge */ /* synthetic */ tf.d invoke(tf.d dVar, CoroutineContext.a aVar) {
                invoke2(dVar, aVar);
                return tf.d.f30009a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(tf.d dVar, CoroutineContext.a element) {
                g.e(dVar, "<anonymous parameter 0>");
                g.e(element, "element");
                CoroutineContext[] coroutineContextArr2 = coroutineContextArr;
                Ref$IntRef ref$IntRef2 = ref$IntRef;
                int i10 = ref$IntRef2.element;
                ref$IntRef2.element = i10 + 1;
                coroutineContextArr2[i10] = element;
            }
        });
        if (ref$IntRef.element == e10) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return new Serialized(coroutineContextArr);
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final int e() {
        int i10 = 2;
        CombinedContext combinedContext = this;
        while (true) {
            CoroutineContext coroutineContext = combinedContext.left;
            if (coroutineContext instanceof CombinedContext) {
                combinedContext = (CombinedContext) coroutineContext;
            } else {
                combinedContext = null;
            }
            if (combinedContext == null) {
                return i10;
            }
            i10++;
        }
    }

    public boolean equals(Object obj) {
        boolean z10;
        if (this != obj) {
            if (!(obj instanceof CombinedContext)) {
                return false;
            }
            CombinedContext combinedContext = (CombinedContext) obj;
            if (combinedContext.e() != e()) {
                return false;
            }
            CombinedContext combinedContext2 = this;
            while (true) {
                CoroutineContext.a aVar = combinedContext2.element;
                if (!g.a(combinedContext.get(aVar.getKey()), aVar)) {
                    z10 = false;
                    break;
                }
                CoroutineContext coroutineContext = combinedContext2.left;
                if (coroutineContext instanceof CombinedContext) {
                    combinedContext2 = (CombinedContext) coroutineContext;
                } else {
                    g.c(coroutineContext, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                    CoroutineContext.a aVar2 = (CoroutineContext.a) coroutineContext;
                    z10 = g.a(combinedContext.get(aVar2.getKey()), aVar2);
                    break;
                }
            }
            if (!z10) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <R> R fold(R r4, p<? super R, ? super CoroutineContext.a, ? extends R> operation) {
        g.e(operation, "operation");
        return operation.invoke((Object) this.left.fold(r4, operation), this.element);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.a> E get(CoroutineContext.b<E> key) {
        g.e(key, "key");
        CombinedContext combinedContext = this;
        while (true) {
            E e10 = (E) combinedContext.element.get(key);
            if (e10 != null) {
                return e10;
            }
            CoroutineContext coroutineContext = combinedContext.left;
            if (coroutineContext instanceof CombinedContext) {
                combinedContext = (CombinedContext) coroutineContext;
            } else {
                return (E) coroutineContext.get(key);
            }
        }
    }

    public int hashCode() {
        return this.element.hashCode() + this.left.hashCode();
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.b<?> key) {
        g.e(key, "key");
        if (this.element.get(key) != null) {
            return this.left;
        }
        CoroutineContext minusKey = this.left.minusKey(key);
        if (minusKey == this.left) {
            return this;
        }
        if (minusKey == EmptyCoroutineContext.INSTANCE) {
            return this.element;
        }
        return new CombinedContext(minusKey, this.element);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return CoroutineContext.DefaultImpls.a(this, coroutineContext);
    }

    public String toString() {
        return r.f(new StringBuilder("["), (String) fold("", new p<String, CoroutineContext.a, String>() { // from class: kotlin.coroutines.CombinedContext$toString$1
            @Override // cg.p
            public final String invoke(String acc, CoroutineContext.a element) {
                g.e(acc, "acc");
                g.e(element, "element");
                if (acc.length() == 0) {
                    return element.toString();
                }
                return acc + ", " + element;
            }
        }), ']');
    }
}

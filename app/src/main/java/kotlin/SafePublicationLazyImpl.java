package kotlin;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.g;
import tf.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LazyJVM.kt */
/* loaded from: classes.dex */
public final class SafePublicationLazyImpl<T> implements c<T>, Serializable {
    public static final a Companion = new a();

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater<SafePublicationLazyImpl<?>, Object> f19911a = AtomicReferenceFieldUpdater.newUpdater(SafePublicationLazyImpl.class, Object.class, "_value");
    private volatile Object _value;

    /* renamed from: final  reason: not valid java name */
    private final Object f10final;
    private volatile cg.a<? extends T> initializer;

    /* compiled from: LazyJVM.kt */
    /* loaded from: classes.dex */
    public static final class a {
    }

    public SafePublicationLazyImpl(cg.a<? extends T> initializer) {
        g.e(initializer, "initializer");
        this.initializer = initializer;
        ea.a aVar = ea.a.f16523h;
        this._value = aVar;
        this.f10final = aVar;
    }

    private final Object writeReplace() {
        return new InitializedLazyImpl(getValue());
    }

    @Override // tf.c
    public T getValue() {
        boolean z10;
        T t4 = (T) this._value;
        ea.a aVar = ea.a.f16523h;
        if (t4 != aVar) {
            return t4;
        }
        cg.a<? extends T> aVar2 = this.initializer;
        if (aVar2 != null) {
            T invoke = aVar2.invoke();
            AtomicReferenceFieldUpdater<SafePublicationLazyImpl<?>, Object> atomicReferenceFieldUpdater = f19911a;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(this, aVar, invoke)) {
                    z10 = true;
                    break;
                } else if (atomicReferenceFieldUpdater.get(this) != aVar) {
                    z10 = false;
                    break;
                }
            }
            if (z10) {
                this.initializer = null;
                return invoke;
            }
        }
        return (T) this._value;
    }

    public boolean isInitialized() {
        if (this._value != ea.a.f16523h) {
            return true;
        }
        return false;
    }

    public String toString() {
        if (isInitialized()) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }
}

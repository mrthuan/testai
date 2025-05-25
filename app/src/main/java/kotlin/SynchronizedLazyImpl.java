package kotlin;

import java.io.Serializable;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.g;
import tf.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LazyJVM.kt */
/* loaded from: classes.dex */
public final class SynchronizedLazyImpl<T> implements c<T>, Serializable {
    private volatile Object _value;
    private cg.a<? extends T> initializer;
    private final Object lock;

    public SynchronizedLazyImpl(cg.a<? extends T> initializer, Object obj) {
        g.e(initializer, "initializer");
        this.initializer = initializer;
        this._value = ea.a.f16523h;
        this.lock = obj == null ? this : obj;
    }

    private final Object writeReplace() {
        return new InitializedLazyImpl(getValue());
    }

    @Override // tf.c
    public T getValue() {
        T t4;
        T t10 = (T) this._value;
        ea.a aVar = ea.a.f16523h;
        if (t10 != aVar) {
            return t10;
        }
        synchronized (this.lock) {
            t4 = (T) this._value;
            if (t4 == aVar) {
                cg.a<? extends T> aVar2 = this.initializer;
                g.b(aVar2);
                t4 = aVar2.invoke();
                this._value = t4;
                this.initializer = null;
            }
        }
        return t4;
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

    public /* synthetic */ SynchronizedLazyImpl(cg.a aVar, Object obj, int i10, d dVar) {
        this(aVar, (i10 & 2) != 0 ? null : obj);
    }
}

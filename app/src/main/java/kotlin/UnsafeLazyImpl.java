package kotlin;

import java.io.Serializable;
import kotlin.jvm.internal.g;
import tf.c;

/* compiled from: Lazy.kt */
/* loaded from: classes.dex */
public final class UnsafeLazyImpl<T> implements c<T>, Serializable {
    private Object _value;
    private cg.a<? extends T> initializer;

    public UnsafeLazyImpl(cg.a<? extends T> initializer) {
        g.e(initializer, "initializer");
        this.initializer = initializer;
        this._value = ea.a.f16523h;
    }

    private final Object writeReplace() {
        return new InitializedLazyImpl(getValue());
    }

    @Override // tf.c
    public T getValue() {
        if (this._value == ea.a.f16523h) {
            cg.a<? extends T> aVar = this.initializer;
            g.b(aVar);
            this._value = aVar.invoke();
            this.initializer = null;
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

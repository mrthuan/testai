package kotlin;

import java.io.Serializable;
import tf.c;

/* compiled from: Lazy.kt */
/* loaded from: classes.dex */
public final class InitializedLazyImpl<T> implements c<T>, Serializable {
    private final T value;

    public InitializedLazyImpl(T t4) {
        this.value = t4;
    }

    @Override // tf.c
    public T getValue() {
        return this.value;
    }

    public boolean isInitialized() {
        return true;
    }

    public String toString() {
        return String.valueOf(getValue());
    }
}

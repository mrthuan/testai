package ig;

import cg.l;
import ig.h;

/* compiled from: KProperty.kt */
/* loaded from: classes.dex */
public interface j<T, V> extends h<V>, l<T, V> {

    /* compiled from: KProperty.kt */
    /* loaded from: classes.dex */
    public interface a<T, V> extends h.a<V>, l<T, V> {
    }

    Object getDelegate(T t4);

    a<T, V> getGetter();
}

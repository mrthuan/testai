package kotlin.collections;

import java.util.Iterator;

/* compiled from: PrimitiveIterators.kt */
/* loaded from: classes.dex */
public abstract class p implements Iterator<Integer>, dg.a {
    public abstract int a();

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Integer next() {
        return Integer.valueOf(a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

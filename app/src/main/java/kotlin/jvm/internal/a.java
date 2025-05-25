package kotlin.jvm.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: ArrayIterator.kt */
/* loaded from: classes.dex */
public final class a<T> implements Iterator<T>, dg.a {

    /* renamed from: a  reason: collision with root package name */
    public final T[] f19944a;

    /* renamed from: b  reason: collision with root package name */
    public int f19945b;

    public a(T[] array) {
        g.e(array, "array");
        this.f19944a = array;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f19945b < this.f19944a.length) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final T next() {
        try {
            T[] tArr = this.f19944a;
            int i10 = this.f19945b;
            this.f19945b = i10 + 1;
            return tArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f19945b--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

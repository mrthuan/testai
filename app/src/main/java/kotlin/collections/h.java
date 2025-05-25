package kotlin.collections;

import java.util.Enumeration;
import java.util.Iterator;

/* compiled from: IteratorsJVM.kt */
/* loaded from: classes.dex */
public final class h implements Iterator<Object>, dg.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Enumeration<Object> f19927a;

    public h(Enumeration<Object> enumeration) {
        this.f19927a = enumeration;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f19927a.hasMoreElements();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f19927a.nextElement();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

package jg;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: Sequences.kt */
/* loaded from: classes.dex */
public final class d<T> implements f<T> {

    /* renamed from: a  reason: collision with root package name */
    public final f<T> f19212a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f19213b = false;
    public final cg.l<T, Boolean> c;

    /* compiled from: Sequences.kt */
    /* loaded from: classes.dex */
    public static final class a implements Iterator<T>, dg.a {

        /* renamed from: a  reason: collision with root package name */
        public final Iterator<T> f19214a;

        /* renamed from: b  reason: collision with root package name */
        public int f19215b = -1;
        public T c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ d<T> f19216d;

        public a(d<T> dVar) {
            this.f19216d = dVar;
            this.f19214a = dVar.f19212a.iterator();
        }

        public final void a() {
            T next;
            d<T> dVar;
            do {
                Iterator<T> it = this.f19214a;
                if (it.hasNext()) {
                    next = it.next();
                    dVar = this.f19216d;
                } else {
                    this.f19215b = 0;
                    return;
                }
            } while (dVar.c.invoke(next).booleanValue() != dVar.f19213b);
            this.c = next;
            this.f19215b = 1;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f19215b == -1) {
                a();
            }
            if (this.f19215b == 1) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (this.f19215b == -1) {
                a();
            }
            if (this.f19215b != 0) {
                T t4 = this.c;
                this.c = null;
                this.f19215b = -1;
                return t4;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public d(m mVar, cg.l lVar) {
        this.f19212a = mVar;
        this.c = lVar;
    }

    @Override // jg.f
    public final Iterator<T> iterator() {
        return new a(this);
    }
}

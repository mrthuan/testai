package jg;

import java.util.Iterator;

/* compiled from: Sequences.kt */
/* loaded from: classes.dex */
public final class m<T, R> implements f<R> {

    /* renamed from: a  reason: collision with root package name */
    public final f<T> f19226a;

    /* renamed from: b  reason: collision with root package name */
    public final cg.l<T, R> f19227b;

    /* compiled from: Sequences.kt */
    /* loaded from: classes.dex */
    public static final class a implements Iterator<R>, dg.a {

        /* renamed from: a  reason: collision with root package name */
        public final Iterator<T> f19228a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ m<T, R> f19229b;

        public a(m<T, R> mVar) {
            this.f19229b = mVar;
            this.f19228a = mVar.f19226a.iterator();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f19228a.hasNext();
        }

        @Override // java.util.Iterator
        public final R next() {
            return this.f19229b.f19227b.invoke(this.f19228a.next());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public m(f<? extends T> sequence, cg.l<? super T, ? extends R> transformer) {
        kotlin.jvm.internal.g.e(sequence, "sequence");
        kotlin.jvm.internal.g.e(transformer, "transformer");
        this.f19226a = sequence;
        this.f19227b = transformer;
    }

    @Override // jg.f
    public final Iterator<R> iterator() {
        return new a(this);
    }
}

package jg;

import java.util.Iterator;

/* compiled from: Sequences.kt */
/* loaded from: classes.dex */
public final class b<T> implements f<T>, c<T> {

    /* renamed from: a  reason: collision with root package name */
    public final f<T> f19208a;

    /* renamed from: b  reason: collision with root package name */
    public final int f19209b;

    /* compiled from: Sequences.kt */
    /* loaded from: classes.dex */
    public static final class a implements Iterator<T>, dg.a {

        /* renamed from: a  reason: collision with root package name */
        public final Iterator<T> f19210a;

        /* renamed from: b  reason: collision with root package name */
        public int f19211b;

        public a(b<T> bVar) {
            this.f19210a = bVar.f19208a.iterator();
            this.f19211b = bVar.f19209b;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            Iterator<T> it;
            while (true) {
                int i10 = this.f19211b;
                it = this.f19210a;
                if (i10 <= 0 || !it.hasNext()) {
                    break;
                }
                it.next();
                this.f19211b--;
            }
            return it.hasNext();
        }

        @Override // java.util.Iterator
        public final T next() {
            Iterator<T> it;
            while (true) {
                int i10 = this.f19211b;
                it = this.f19210a;
                if (i10 <= 0 || !it.hasNext()) {
                    break;
                }
                it.next();
                this.f19211b--;
            }
            return it.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(f<? extends T> sequence, int i10) {
        boolean z10;
        kotlin.jvm.internal.g.e(sequence, "sequence");
        this.f19208a = sequence;
        this.f19209b = i10;
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i10 + '.').toString());
    }

    @Override // jg.c
    public final b a(int i10) {
        int i11 = this.f19209b + i10;
        if (i11 < 0) {
            return new b(this, i10);
        }
        return new b(this.f19208a, i11);
    }

    @Override // jg.f
    public final Iterator<T> iterator() {
        return new a(this);
    }
}

package jg;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: Sequences.kt */
/* loaded from: classes.dex */
public final class e<T> implements f<T> {

    /* renamed from: a  reason: collision with root package name */
    public final cg.a<T> f19217a;

    /* renamed from: b  reason: collision with root package name */
    public final cg.l<T, T> f19218b;

    /* compiled from: Sequences.kt */
    /* loaded from: classes.dex */
    public static final class a implements Iterator<T>, dg.a {

        /* renamed from: a  reason: collision with root package name */
        public T f19219a;

        /* renamed from: b  reason: collision with root package name */
        public int f19220b = -2;
        public final /* synthetic */ e<T> c;

        public a(e<T> eVar) {
            this.c = eVar;
        }

        public final void a() {
            T invoke;
            int i10;
            int i11 = this.f19220b;
            e<T> eVar = this.c;
            if (i11 == -2) {
                invoke = eVar.f19217a.invoke();
            } else {
                cg.l<T, T> lVar = eVar.f19218b;
                T t4 = this.f19219a;
                kotlin.jvm.internal.g.b(t4);
                invoke = lVar.invoke(t4);
            }
            this.f19219a = invoke;
            if (invoke == null) {
                i10 = 0;
            } else {
                i10 = 1;
            }
            this.f19220b = i10;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f19220b < 0) {
                a();
            }
            if (this.f19220b == 1) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (this.f19220b < 0) {
                a();
            }
            if (this.f19220b != 0) {
                T t4 = this.f19219a;
                kotlin.jvm.internal.g.c(t4, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
                this.f19220b = -1;
                return t4;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(cg.a<? extends T> aVar, cg.l<? super T, ? extends T> lVar) {
        this.f19217a = aVar;
        this.f19218b = lVar;
    }

    @Override // jg.f
    public final Iterator<T> iterator() {
        return new a(this);
    }
}

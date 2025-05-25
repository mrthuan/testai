package kotlin.collections;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: AbstractIterator.kt */
/* loaded from: classes.dex */
public abstract class a<T> implements Iterator<T>, dg.a {

    /* renamed from: a  reason: collision with root package name */
    public State f19915a = State.NotReady;

    /* renamed from: b  reason: collision with root package name */
    public T f19916b;

    /* compiled from: AbstractIterator.kt */
    /* renamed from: kotlin.collections.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public /* synthetic */ class C0269a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f19917a;

        static {
            int[] iArr = new int[State.values().length];
            try {
                iArr[State.Done.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[State.Ready.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f19917a = iArr;
        }
    }

    public abstract void a();

    public final void b() {
        this.f19915a = State.Done;
    }

    public final void c(T t4) {
        this.f19916b = t4;
        this.f19915a = State.Ready;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        boolean z10;
        State state = this.f19915a;
        State state2 = State.Failed;
        if (state != state2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            int i10 = C0269a.f19917a[state.ordinal()];
            if (i10 == 1) {
                return false;
            }
            if (i10 != 2) {
                this.f19915a = state2;
                a();
                if (this.f19915a != State.Ready) {
                    return false;
                }
            }
            return true;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // java.util.Iterator
    public final T next() {
        if (hasNext()) {
            this.f19915a = State.NotReady;
            return this.f19916b;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

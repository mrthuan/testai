package jg;

import androidx.activity.s;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Result;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* compiled from: SequenceBuilder.kt */
/* loaded from: classes.dex */
public final class g<T> extends h<T> implements Iterator<T>, kotlin.coroutines.c<tf.d>, dg.a {

    /* renamed from: a  reason: collision with root package name */
    public int f19221a;

    /* renamed from: b  reason: collision with root package name */
    public T f19222b;
    public kotlin.coroutines.c<? super tf.d> c;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // jg.h
    public final CoroutineSingletons b(Object obj, kotlin.coroutines.c frame) {
        this.f19222b = obj;
        this.f19221a = 3;
        this.c = frame;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        kotlin.jvm.internal.g.e(frame, "frame");
        return coroutineSingletons;
    }

    public final RuntimeException c() {
        int i10 = this.f19221a;
        if (i10 != 4) {
            if (i10 != 5) {
                return new IllegalStateException("Unexpected state of the iterator: " + this.f19221a);
            }
            return new IllegalStateException("Iterator has failed.");
        }
        return new NoSuchElementException();
    }

    @Override // kotlin.coroutines.c
    public final CoroutineContext getContext() {
        return EmptyCoroutineContext.INSTANCE;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10;
        while (true) {
            i10 = this.f19221a;
            if (i10 != 0) {
                break;
            }
            this.f19221a = 5;
            kotlin.coroutines.c<? super tf.d> cVar = this.c;
            kotlin.jvm.internal.g.b(cVar);
            this.c = null;
            cVar.resumeWith(Result.m13constructorimpl(tf.d.f30009a));
        }
        if (i10 != 1) {
            if (i10 == 2 || i10 == 3) {
                return true;
            }
            if (i10 == 4) {
                return false;
            }
            throw c();
        }
        kotlin.jvm.internal.g.b(null);
        throw null;
    }

    @Override // java.util.Iterator
    public final T next() {
        int i10 = this.f19221a;
        if (i10 != 0 && i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    this.f19221a = 0;
                    T t4 = this.f19222b;
                    this.f19222b = null;
                    return t4;
                }
                throw c();
            }
            this.f19221a = 1;
            kotlin.jvm.internal.g.b(null);
            throw null;
        } else if (hasNext()) {
            return next();
        } else {
            throw new NoSuchElementException();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // kotlin.coroutines.c
    public final void resumeWith(Object obj) {
        s.u0(obj);
        this.f19221a = 4;
    }
}

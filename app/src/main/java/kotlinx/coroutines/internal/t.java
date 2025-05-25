package kotlinx.coroutines.internal;

import java.lang.Comparable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.internal.u;
import kotlinx.coroutines.o0;

/* compiled from: ThreadSafeHeap.kt */
/* loaded from: classes.dex */
public class t<T extends u & Comparable<? super T>> {

    /* renamed from: b  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f20200b = AtomicIntegerFieldUpdater.newUpdater(t.class, "_size");
    private volatile int _size;

    /* renamed from: a  reason: collision with root package name */
    public T[] f20201a;

    public final void a(o0.b bVar) {
        bVar.c((o0.c) this);
        T[] tArr = this.f20201a;
        if (tArr == null) {
            tArr = (T[]) new u[4];
            this.f20201a = tArr;
        } else if (b() >= tArr.length) {
            Object[] copyOf = Arrays.copyOf(tArr, b() * 2);
            kotlin.jvm.internal.g.d(copyOf, "copyOf(this, newSize)");
            tArr = (T[]) ((u[]) copyOf);
            this.f20201a = tArr;
        }
        int b10 = b();
        f20200b.set(this, b10 + 1);
        tArr[b10] = bVar;
        bVar.f20223b = b10;
        f(b10);
    }

    public final int b() {
        return f20200b.get(this);
    }

    public final T c() {
        T t4;
        synchronized (this) {
            T[] tArr = this.f20201a;
            if (tArr != null) {
                t4 = tArr[0];
            } else {
                t4 = null;
            }
        }
        return t4;
    }

    public final void d(u uVar) {
        synchronized (this) {
            if (uVar.a() != null) {
                e(uVar.getIndex());
            }
        }
    }

    public final T e(int i10) {
        T[] tArr = this.f20201a;
        kotlin.jvm.internal.g.b(tArr);
        f20200b.set(this, b() - 1);
        if (i10 < b()) {
            g(i10, b());
            int i11 = (i10 - 1) / 2;
            if (i10 > 0) {
                T t4 = tArr[i10];
                kotlin.jvm.internal.g.b(t4);
                T t10 = tArr[i11];
                kotlin.jvm.internal.g.b(t10);
                if (((Comparable) t4).compareTo(t10) < 0) {
                    g(i10, i11);
                    f(i11);
                }
            }
            while (true) {
                int i12 = (i10 * 2) + 1;
                if (i12 >= b()) {
                    break;
                }
                T[] tArr2 = this.f20201a;
                kotlin.jvm.internal.g.b(tArr2);
                int i13 = i12 + 1;
                if (i13 < b()) {
                    T t11 = tArr2[i13];
                    kotlin.jvm.internal.g.b(t11);
                    T t12 = tArr2[i12];
                    kotlin.jvm.internal.g.b(t12);
                    if (((Comparable) t11).compareTo(t12) < 0) {
                        i12 = i13;
                    }
                }
                T t13 = tArr2[i10];
                kotlin.jvm.internal.g.b(t13);
                T t14 = tArr2[i12];
                kotlin.jvm.internal.g.b(t14);
                if (((Comparable) t13).compareTo(t14) <= 0) {
                    break;
                }
                g(i10, i12);
                i10 = i12;
            }
        }
        T t15 = tArr[b()];
        kotlin.jvm.internal.g.b(t15);
        t15.c(null);
        t15.d(-1);
        tArr[b()] = null;
        return t15;
    }

    public final void f(int i10) {
        while (i10 > 0) {
            T[] tArr = this.f20201a;
            kotlin.jvm.internal.g.b(tArr);
            int i11 = (i10 - 1) / 2;
            T t4 = tArr[i11];
            kotlin.jvm.internal.g.b(t4);
            T t10 = tArr[i10];
            kotlin.jvm.internal.g.b(t10);
            if (((Comparable) t4).compareTo(t10) <= 0) {
                return;
            }
            g(i10, i11);
            i10 = i11;
        }
    }

    public final void g(int i10, int i11) {
        T[] tArr = this.f20201a;
        kotlin.jvm.internal.g.b(tArr);
        T t4 = tArr[i11];
        kotlin.jvm.internal.g.b(t4);
        T t10 = tArr[i10];
        kotlin.jvm.internal.g.b(t10);
        tArr[i10] = t4;
        tArr[i11] = t10;
        t4.d(i10);
        t10.d(i11);
    }
}

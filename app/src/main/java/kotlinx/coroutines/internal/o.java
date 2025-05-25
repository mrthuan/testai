package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlinx.coroutines.scheduling.CoroutineScheduler;

/* compiled from: ResizableAtomicArray.kt */
/* loaded from: classes.dex */
public final class o<T> {
    private volatile AtomicReferenceArray<T> array;

    public o(int i10) {
        this.array = new AtomicReferenceArray<>(i10);
    }

    public final int a() {
        return this.array.length();
    }

    public final T b(int i10) {
        AtomicReferenceArray<T> atomicReferenceArray = this.array;
        if (i10 < atomicReferenceArray.length()) {
            return atomicReferenceArray.get(i10);
        }
        return null;
    }

    public final void c(int i10, CoroutineScheduler.b bVar) {
        AtomicReferenceArray<T> atomicReferenceArray = this.array;
        int length = atomicReferenceArray.length();
        if (i10 < length) {
            atomicReferenceArray.set(i10, bVar);
            return;
        }
        int i11 = i10 + 1;
        int i12 = length * 2;
        if (i11 < i12) {
            i11 = i12;
        }
        AtomicReferenceArray<T> atomicReferenceArray2 = new AtomicReferenceArray<>(i11);
        for (int i13 = 0; i13 < length; i13++) {
            atomicReferenceArray2.set(i13, atomicReferenceArray.get(i13));
        }
        atomicReferenceArray2.set(i10, bVar);
        this.array = atomicReferenceArray2;
    }
}

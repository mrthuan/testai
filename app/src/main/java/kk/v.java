package kk;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SegmentPool.kt */
/* loaded from: classes3.dex */
public final class v {

    /* renamed from: a  reason: collision with root package name */
    public static final u f19855a = new u(new byte[0], 0, 0, false);

    /* renamed from: b  reason: collision with root package name */
    public static final int f19856b;
    public static final AtomicReference<u>[] c;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f19856b = highestOneBit;
        AtomicReference<u>[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i10 = 0; i10 < highestOneBit; i10++) {
            atomicReferenceArr[i10] = new AtomicReference<>();
        }
        c = atomicReferenceArr;
    }

    public static final void a(u uVar) {
        boolean z10;
        int i10;
        boolean z11 = true;
        if (uVar.f19853f == null && uVar.f19854g == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (uVar.f19851d) {
                return;
            }
            AtomicReference<u> atomicReference = c[(int) (Thread.currentThread().getId() & (f19856b - 1))];
            u uVar2 = atomicReference.get();
            if (uVar2 == f19855a) {
                return;
            }
            if (uVar2 != null) {
                i10 = uVar2.c;
            } else {
                i10 = 0;
            }
            if (i10 >= 65536) {
                return;
            }
            uVar.f19853f = uVar2;
            uVar.f19850b = 0;
            uVar.c = i10 + 8192;
            while (true) {
                if (!atomicReference.compareAndSet(uVar2, uVar)) {
                    if (atomicReference.get() != uVar2) {
                        z11 = false;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (!z11) {
                uVar.f19853f = null;
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public static final u b() {
        AtomicReference<u> atomicReference = c[(int) (Thread.currentThread().getId() & (f19856b - 1))];
        u uVar = f19855a;
        u andSet = atomicReference.getAndSet(uVar);
        if (andSet == uVar) {
            return new u();
        }
        if (andSet == null) {
            atomicReference.set(null);
            return new u();
        }
        atomicReference.set(andSet.f19853f);
        andSet.f19853f = null;
        andSet.c = 0;
        return andSet;
    }
}

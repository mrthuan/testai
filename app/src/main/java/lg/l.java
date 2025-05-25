package lg;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* compiled from: WorkQueue.kt */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: b  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f20596b = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "lastScheduledTask");
    public static final AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(l.class, "producerIndex");

    /* renamed from: d  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f20597d = AtomicIntegerFieldUpdater.newUpdater(l.class, "consumerIndex");

    /* renamed from: e  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f20598e = AtomicIntegerFieldUpdater.newUpdater(l.class, "blockingTasksInBuffer");

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReferenceArray<f> f20599a = new AtomicReferenceArray<>(128);
    private volatile int blockingTasksInBuffer;
    private volatile int consumerIndex;
    private volatile Object lastScheduledTask;
    private volatile int producerIndex;

    public final f a(f fVar) {
        if (b() == 127) {
            return fVar;
        }
        boolean z10 = true;
        if (fVar.f20587b.b() != 1) {
            z10 = false;
        }
        if (z10) {
            f20598e.incrementAndGet(this);
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = c;
        int i10 = 127 & atomicIntegerFieldUpdater.get(this);
        while (true) {
            AtomicReferenceArray<f> atomicReferenceArray = this.f20599a;
            if (atomicReferenceArray.get(i10) != null) {
                Thread.yield();
            } else {
                atomicReferenceArray.lazySet(i10, fVar);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
        }
    }

    public final int b() {
        return c.get(this) - f20597d.get(this);
    }

    public final f c() {
        f andSet;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f20597d;
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 - c.get(this) == 0) {
                return null;
            }
            int i11 = i10 & ShapeTypes.VERTICAL_SCROLL;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i10, i10 + 1) && (andSet = this.f20599a.getAndSet(i11, null)) != null) {
                boolean z10 = true;
                if (andSet.f20587b.b() != 1) {
                    z10 = false;
                }
                if (z10) {
                    f20598e.decrementAndGet(this);
                }
                return andSet;
            }
        }
    }

    public final f d(int i10, boolean z10) {
        boolean z11;
        int i11 = i10 & ShapeTypes.VERTICAL_SCROLL;
        AtomicReferenceArray<f> atomicReferenceArray = this.f20599a;
        f fVar = atomicReferenceArray.get(i11);
        if (fVar != null) {
            boolean z12 = false;
            if (fVar.f20587b.b() == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11 == z10) {
                while (true) {
                    if (atomicReferenceArray.compareAndSet(i11, fVar, null)) {
                        z12 = true;
                        break;
                    } else if (atomicReferenceArray.get(i11) != fVar) {
                        break;
                    }
                }
                if (z12) {
                    if (z10) {
                        f20598e.decrementAndGet(this);
                    }
                    return fVar;
                }
            }
        }
        return null;
    }
}

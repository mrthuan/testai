package kotlinx.coroutines.internal;

import com.android.billingclient.api.a0;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: LockFreeTaskQueue.kt */
/* loaded from: classes.dex */
public final class j<E> {

    /* renamed from: e  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f20187e = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_next");

    /* renamed from: f  reason: collision with root package name */
    public static final AtomicLongFieldUpdater f20188f = AtomicLongFieldUpdater.newUpdater(j.class, "_state");

    /* renamed from: g  reason: collision with root package name */
    public static final a0 f20189g = new a0("REMOVE_FROZEN", 8);
    private volatile Object _next;
    private volatile long _state;

    /* renamed from: a  reason: collision with root package name */
    public final int f20190a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f20191b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final AtomicReferenceArray f20192d;

    /* compiled from: LockFreeTaskQueue.kt */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f20193a;

        public a(int i10) {
            this.f20193a = i10;
        }
    }

    public j(int i10, boolean z10) {
        boolean z11;
        this.f20190a = i10;
        this.f20191b = z10;
        int i11 = i10 - 1;
        this.c = i11;
        this.f20192d = new AtomicReferenceArray(i10);
        if (i11 <= 1073741823) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            if ((i10 & i11) == 0) {
                return;
            }
            throw new IllegalStateException("Check failed.".toString());
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0056, code lost:
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(E r17) {
        /*
            r16 = this;
            r6 = r16
            r7 = r17
        L4:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = kotlinx.coroutines.internal.j.f20188f
            long r2 = r8.get(r6)
            r0 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r0 = r0 & r2
            r9 = 0
            int r0 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            r1 = 1
            if (r0 == 0) goto L1d
            r4 = 2305843009213693952(0x2000000000000000, double:1.4916681462400413E-154)
            long r2 = r2 & r4
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 == 0) goto L1c
            r1 = 2
        L1c:
            return r1
        L1d:
            r4 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r4 = r4 & r2
            r11 = 0
            long r4 = r4 >> r11
            int r0 = (int) r4
            r4 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r4 = r4 & r2
            r12 = 30
            long r4 = r4 >> r12
            int r13 = (int) r4
            int r4 = r13 + 2
            int r14 = r6.c
            r4 = r4 & r14
            r5 = r0 & r14
            if (r4 != r5) goto L38
            return r1
        L38:
            boolean r4 = r6.f20191b
            java.util.concurrent.atomic.AtomicReferenceArray r15 = r6.f20192d
            r5 = 1073741823(0x3fffffff, float:1.9999999)
            if (r4 != 0) goto L57
            r4 = r13 & r14
            java.lang.Object r4 = r15.get(r4)
            if (r4 == 0) goto L57
            r2 = 1024(0x400, float:1.435E-42)
            int r3 = r6.f20190a
            if (r3 < r2) goto L56
            int r13 = r13 - r0
            r0 = r13 & r5
            int r2 = r3 >> 1
            if (r0 <= r2) goto L4
        L56:
            return r1
        L57:
            int r0 = r13 + 1
            r0 = r0 & r5
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = kotlinx.coroutines.internal.j.f20188f
            r4 = -1152921503533105153(0xf00000003fffffff, double:-3.1050369248997324E231)
            long r4 = r4 & r2
            long r9 = (long) r0
            long r9 = r9 << r12
            long r4 = r4 | r9
            r0 = r1
            r1 = r16
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L4
            r0 = r13 & r14
            r15.set(r0, r7)
            r0 = r6
        L74:
            long r1 = r8.get(r0)
            r3 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L9f
            kotlinx.coroutines.internal.j r0 = r0.c()
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r0.f20192d
            int r2 = r0.c
            r2 = r2 & r13
            java.lang.Object r5 = r1.get(r2)
            boolean r9 = r5 instanceof kotlinx.coroutines.internal.j.a
            if (r9 == 0) goto L9c
            kotlinx.coroutines.internal.j$a r5 = (kotlinx.coroutines.internal.j.a) r5
            int r5 = r5.f20193a
            if (r5 != r13) goto L9c
            r1.set(r2, r7)
            goto L9d
        L9c:
            r0 = 0
        L9d:
            if (r0 != 0) goto L74
        L9f:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.j.a(java.lang.Object):int");
    }

    public final boolean b() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j10;
        do {
            atomicLongFieldUpdater = f20188f;
            j10 = atomicLongFieldUpdater.get(this);
            if ((j10 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j10) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, 2305843009213693952L | j10));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final j<E> c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j10;
        while (true) {
            atomicLongFieldUpdater = f20188f;
            j10 = atomicLongFieldUpdater.get(this);
            if ((j10 & 1152921504606846976L) == 0) {
                long j11 = j10 | 1152921504606846976L;
                if (atomicLongFieldUpdater.compareAndSet(this, j10, j11)) {
                    j10 = j11;
                    break;
                }
            } else {
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20187e;
            j<E> jVar = (j) atomicReferenceFieldUpdater.get(this);
            if (jVar != null) {
                return jVar;
            }
            j jVar2 = new j(this.f20190a * 2, this.f20191b);
            int i10 = (int) ((1073741823 & j10) >> 0);
            int i11 = (int) ((1152921503533105152L & j10) >> 30);
            while (true) {
                int i12 = this.c;
                int i13 = i10 & i12;
                if (i13 == (i12 & i11)) {
                    break;
                }
                Object obj = this.f20192d.get(i13);
                if (obj == null) {
                    obj = new a(i10);
                }
                jVar2.f20192d.set(jVar2.c & i10, obj);
                i10++;
            }
            atomicLongFieldUpdater.set(jVar2, (-1152921504606846977L) & j10);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, jVar2) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    public final Object d() {
        int i10;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f20188f;
            long j10 = atomicLongFieldUpdater.get(this);
            if ((j10 & 1152921504606846976L) != 0) {
                return f20189g;
            }
            int i11 = this.c;
            int i12 = ((int) ((j10 & 1073741823) >> 0)) & i11;
            if ((((int) ((1152921503533105152L & j10) >> 30)) & i11) == i12) {
                return null;
            }
            AtomicReferenceArray atomicReferenceArray = this.f20192d;
            Object obj = atomicReferenceArray.get(i12);
            boolean z10 = this.f20191b;
            if (obj == null) {
                if (z10) {
                    return null;
                }
            } else if (obj instanceof a) {
                return null;
            } else {
                long j11 = ((i10 + 1) & 1073741823) << 0;
                if (atomicLongFieldUpdater.compareAndSet(this, j10, (j10 & (-1073741824)) | j11)) {
                    atomicReferenceArray.set(i12, null);
                    return obj;
                } else if (z10) {
                    j<E> jVar = this;
                    while (true) {
                        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f20188f;
                        long j12 = atomicLongFieldUpdater2.get(jVar);
                        int i13 = (int) ((j12 & 1073741823) >> 0);
                        if ((j12 & 1152921504606846976L) != 0) {
                            jVar = jVar.c();
                        } else {
                            if (atomicLongFieldUpdater2.compareAndSet(jVar, j12, (j12 & (-1073741824)) | j11)) {
                                jVar.f20192d.set(jVar.c & i13, null);
                                jVar = null;
                            } else {
                                continue;
                            }
                        }
                        if (jVar == null) {
                            return obj;
                        }
                    }
                }
            }
        }
    }
}

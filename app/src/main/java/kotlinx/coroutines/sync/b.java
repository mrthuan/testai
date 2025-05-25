package kotlinx.coroutines.sync;

import cg.l;
import com.android.billingclient.api.a0;
import com.google.android.play.core.assetpacks.b1;
import com.tom_roush.fontbox.ttf.HeaderTable;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.g;
import kotlinx.coroutines.internal.q;

/* compiled from: Semaphore.kt */
/* loaded from: classes.dex */
public class b {
    public static final AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, HeaderTable.TAG);

    /* renamed from: d  reason: collision with root package name */
    public static final AtomicLongFieldUpdater f20256d = AtomicLongFieldUpdater.newUpdater(b.class, "deqIdx");

    /* renamed from: e  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f20257e = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "tail");

    /* renamed from: f  reason: collision with root package name */
    public static final AtomicLongFieldUpdater f20258f = AtomicLongFieldUpdater.newUpdater(b.class, "enqIdx");

    /* renamed from: g  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f20259g = AtomicIntegerFieldUpdater.newUpdater(b.class, "_availablePermits");
    private volatile int _availablePermits;

    /* renamed from: a  reason: collision with root package name */
    public final int f20260a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final l<Throwable, tf.d> f20261b;
    private volatile long deqIdx;
    private volatile long enqIdx;
    private volatile Object head;
    private volatile Object tail;

    public b(int i10) {
        boolean z10;
        if (i10 >= 0 && i10 <= 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            d dVar = new d(0L, null, 2);
            this.head = dVar;
            this.tail = dVar;
            this._availablePermits = 1 - i10;
            this.f20261b = new l<Throwable, tf.d>() { // from class: kotlinx.coroutines.sync.SemaphoreImpl$onCancellationRelease$1
                {
                    super(1);
                }

                @Override // cg.l
                public /* bridge */ /* synthetic */ tf.d invoke(Throwable th2) {
                    invoke2(th2);
                    return tf.d.f30009a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(Throwable th2) {
                    b.this.d();
                }
            };
            return;
        }
        throw new IllegalArgumentException("The number of acquired permits should be in 0..1".toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0070, code lost:
        r7 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0004 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(kotlinx.coroutines.sync.MutexImpl.a r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
        L4:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = kotlinx.coroutines.sync.b.f20259g
            int r2 = r2.getAndDecrement(r0)
            int r3 = r0.f20260a
            if (r2 > r3) goto L4
            cg.l<java.lang.Throwable, tf.d> r3 = r0.f20261b
            if (r2 <= 0) goto L19
            tf.d r2 = tf.d.f30009a
            r1.o(r3, r2)
            goto Lc9
        L19:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = kotlinx.coroutines.sync.b.f20257e
            java.lang.Object r4 = r2.get(r0)
            kotlinx.coroutines.sync.d r4 = (kotlinx.coroutines.sync.d) r4
            java.util.concurrent.atomic.AtomicLongFieldUpdater r5 = kotlinx.coroutines.sync.b.f20258f
            long r5 = r5.getAndIncrement(r0)
            kotlinx.coroutines.sync.SemaphoreImpl$addAcquireToQueue$createNewSegment$1 r7 = kotlinx.coroutines.sync.SemaphoreImpl$addAcquireToQueue$createNewSegment$1.INSTANCE
            int r8 = kotlinx.coroutines.sync.c.f20266f
            long r8 = (long) r8
            long r8 = r5 / r8
        L2e:
            java.lang.Object r10 = com.google.android.play.core.assetpacks.b1.v(r4, r8, r7)
            boolean r11 = com.google.android.play.core.assetpacks.c.L(r10)
            if (r11 != 0) goto L85
            kotlinx.coroutines.internal.q r11 = com.google.android.play.core.assetpacks.c.H(r10)
        L3c:
            java.lang.Object r14 = r2.get(r0)
            kotlinx.coroutines.internal.q r14 = (kotlinx.coroutines.internal.q) r14
            long r12 = r14.c
            r15 = r7
            r16 = r8
            long r7 = r11.c
            int r7 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r7 < 0) goto L4e
            goto L70
        L4e:
            boolean r7 = r11.i()
            if (r7 != 0) goto L56
            r7 = 0
            goto L71
        L56:
            boolean r7 = r2.compareAndSet(r0, r14, r11)
            if (r7 == 0) goto L5e
            r7 = 1
            goto L65
        L5e:
            java.lang.Object r7 = r2.get(r0)
            if (r7 == r14) goto L56
            r7 = 0
        L65:
            if (r7 == 0) goto L78
            boolean r7 = r14.e()
            if (r7 == 0) goto L70
            r14.d()
        L70:
            r7 = 1
        L71:
            if (r7 == 0) goto L74
            goto L85
        L74:
            r7 = r15
            r8 = r16
            goto L2e
        L78:
            boolean r7 = r11.e()
            if (r7 == 0) goto L81
            r11.d()
        L81:
            r7 = r15
            r8 = r16
            goto L3c
        L85:
            kotlinx.coroutines.internal.q r2 = com.google.android.play.core.assetpacks.c.H(r10)
            kotlinx.coroutines.sync.d r2 = (kotlinx.coroutines.sync.d) r2
            int r4 = kotlinx.coroutines.sync.c.f20266f
            long r7 = (long) r4
            long r5 = r5 % r7
            int r4 = (int) r5
            java.util.concurrent.atomic.AtomicReferenceArray r5 = r2.f20267e
        L92:
            r6 = 0
            boolean r6 = r5.compareAndSet(r4, r6, r1)
            if (r6 == 0) goto L9b
            r5 = 1
            goto La2
        L9b:
            java.lang.Object r6 = r5.get(r4)
            if (r6 == 0) goto L92
            r5 = 0
        La2:
            if (r5 == 0) goto La8
            r1.b(r2, r4)
            goto Lc4
        La8:
            com.android.billingclient.api.a0 r6 = kotlinx.coroutines.sync.c.f20263b
            com.android.billingclient.api.a0 r7 = kotlinx.coroutines.sync.c.c
            java.util.concurrent.atomic.AtomicReferenceArray r8 = r2.f20267e
        Lae:
            boolean r2 = r8.compareAndSet(r4, r6, r7)
            if (r2 == 0) goto Lb6
            r2 = 1
            goto Lbd
        Lb6:
            java.lang.Object r2 = r8.get(r4)
            if (r2 == r6) goto Lae
            r2 = 0
        Lbd:
            if (r2 == 0) goto Lc6
            tf.d r2 = tf.d.f30009a
            r1.o(r3, r2)
        Lc4:
            r12 = 1
            goto Lc7
        Lc6:
            r12 = 0
        Lc7:
            if (r12 == 0) goto L4
        Lc9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.sync.b.c(kotlinx.coroutines.sync.MutexImpl$a):void");
    }

    public final void d() {
        int i10;
        Object v10;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f20259g;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i11 = this.f20260a;
            if (andIncrement < i11) {
                if (andIncrement >= 0) {
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c;
                d dVar = (d) atomicReferenceFieldUpdater.get(this);
                long andIncrement2 = f20256d.getAndIncrement(this);
                long j10 = andIncrement2 / c.f20266f;
                SemaphoreImpl$tryResumeNextFromQueue$createNewSegment$1 semaphoreImpl$tryResumeNextFromQueue$createNewSegment$1 = SemaphoreImpl$tryResumeNextFromQueue$createNewSegment$1.INSTANCE;
                do {
                    v10 = b1.v(dVar, j10, semaphoreImpl$tryResumeNextFromQueue$createNewSegment$1);
                    if (com.google.android.play.core.assetpacks.c.L(v10)) {
                        break;
                    }
                    q H = com.google.android.play.core.assetpacks.c.H(v10);
                    while (true) {
                        q qVar = (q) atomicReferenceFieldUpdater.get(this);
                        if (qVar.c >= H.c) {
                            break;
                        } else if (!H.i()) {
                            z13 = false;
                            continue;
                            break;
                        } else {
                            while (true) {
                                if (atomicReferenceFieldUpdater.compareAndSet(this, qVar, H)) {
                                    z14 = true;
                                    break;
                                } else if (atomicReferenceFieldUpdater.get(this) != qVar) {
                                    z14 = false;
                                    break;
                                }
                            }
                            if (z14) {
                                if (qVar.e()) {
                                    qVar.d();
                                }
                            } else if (H.e()) {
                                H.d();
                            }
                        }
                    }
                    z13 = true;
                    continue;
                } while (!z13);
                d dVar2 = (d) com.google.android.play.core.assetpacks.c.H(v10);
                dVar2.a();
                if (dVar2.c <= j10) {
                    int i12 = (int) (andIncrement2 % c.f20266f);
                    a0 a0Var = c.f20263b;
                    AtomicReferenceArray atomicReferenceArray = dVar2.f20267e;
                    Object andSet = atomicReferenceArray.getAndSet(i12, a0Var);
                    if (andSet == null) {
                        int i13 = c.f20262a;
                        int i14 = 0;
                        while (true) {
                            if (i14 < i13) {
                                if (atomicReferenceArray.get(i12) == c.c) {
                                    z10 = true;
                                    continue;
                                    break;
                                }
                                i14++;
                            } else {
                                a0 a0Var2 = c.f20263b;
                                a0 a0Var3 = c.f20264d;
                                while (true) {
                                    if (atomicReferenceArray.compareAndSet(i12, a0Var2, a0Var3)) {
                                        z11 = true;
                                        z12 = true;
                                        break;
                                    } else if (atomicReferenceArray.get(i12) != a0Var2) {
                                        z11 = true;
                                        z12 = false;
                                        break;
                                    }
                                }
                                z10 = z12 ^ z11;
                                continue;
                            }
                        }
                    } else if (andSet != c.f20265e) {
                        if (andSet instanceof g) {
                            g gVar = (g) andSet;
                            a0 g10 = gVar.g(tf.d.f30009a, this.f20261b);
                            if (g10 != null) {
                                gVar.A(g10);
                                z10 = true;
                                continue;
                            }
                        } else if (andSet instanceof mg.b) {
                            z10 = ((mg.b) andSet).a(this, tf.d.f30009a);
                            continue;
                        } else {
                            throw new IllegalStateException(("unexpected: " + andSet).toString());
                        }
                    }
                }
                z10 = false;
                continue;
            } else {
                do {
                    i10 = atomicIntegerFieldUpdater.get(this);
                    if (i10 <= i11) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, i11));
                throw new IllegalStateException(("The number of released permits cannot be greater than " + i11).toString());
            }
        } while (!z10);
    }
}

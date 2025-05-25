package kotlinx.coroutines.channels;

import androidx.activity.s;
import com.android.billingclient.api.a0;
import com.google.android.play.core.assetpacks.b1;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.channels.f;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.UndeliveredElementException;
import kotlinx.coroutines.internal.q;
import kotlinx.coroutines.internal.r;
import kotlinx.coroutines.s1;
import kotlinx.coroutines.selects.TrySelectDetailedResult;

/* compiled from: BufferedChannel.kt */
/* loaded from: classes.dex */
public class BufferedChannel<E> implements kotlinx.coroutines.channels.b<E> {
    public static final AtomicLongFieldUpdater c = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "sendersAndCloseStatus");

    /* renamed from: d  reason: collision with root package name */
    public static final AtomicLongFieldUpdater f20003d = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "receivers");

    /* renamed from: e  reason: collision with root package name */
    public static final AtomicLongFieldUpdater f20004e = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "bufferEnd");

    /* renamed from: f  reason: collision with root package name */
    public static final AtomicLongFieldUpdater f20005f = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "completedExpandBuffersAndPauseFlag");

    /* renamed from: g  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f20006g = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "sendSegment");

    /* renamed from: h  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f20007h = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "receiveSegment");

    /* renamed from: i  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f20008i = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "bufferEndSegment");

    /* renamed from: j  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f20009j = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "_closeCause");

    /* renamed from: k  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f20010k = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "closeHandler");
    private volatile Object _closeCause;

    /* renamed from: a  reason: collision with root package name */
    public final int f20011a;

    /* renamed from: b  reason: collision with root package name */
    public final cg.l<E, tf.d> f20012b;
    private volatile long bufferEnd;
    private volatile Object bufferEndSegment;
    private volatile Object closeHandler;
    private volatile long completedExpandBuffersAndPauseFlag;
    private volatile Object receiveSegment;
    private volatile long receivers;
    private volatile Object sendSegment;
    private volatile long sendersAndCloseStatus;

    /* compiled from: BufferedChannel.kt */
    /* loaded from: classes.dex */
    public final class a implements d<E>, s1 {

        /* renamed from: a  reason: collision with root package name */
        public Object f20013a = kotlinx.coroutines.channels.a.f20029p;

        /* renamed from: b  reason: collision with root package name */
        public kotlinx.coroutines.h<? super Boolean> f20014b;

        public a() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:68:0x0137, code lost:
            if (r2 != null) goto L61;
         */
        /* JADX WARN: Code restructure failed: missing block: B:69:0x0139, code lost:
            r13 = kotlinx.coroutines.internal.OnUndeliveredElementKt.a(r2, r1, r11);
         */
        /* JADX WARN: Code restructure failed: missing block: B:70:0x013d, code lost:
            r15.o(r13, r0);
         */
        @Override // kotlinx.coroutines.channels.d
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl r18) {
            /*
                Method dump skipped, instructions count: 352
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.a.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
        }

        @Override // kotlinx.coroutines.s1
        public final void b(q<?> qVar, int i10) {
            kotlinx.coroutines.h<? super Boolean> hVar = this.f20014b;
            if (hVar != null) {
                hVar.b(qVar, i10);
            }
        }

        @Override // kotlinx.coroutines.channels.d
        public final E next() {
            boolean z10;
            E e10 = (E) this.f20013a;
            a0 a0Var = kotlinx.coroutines.channels.a.f20029p;
            if (e10 != a0Var) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                this.f20013a = a0Var;
                if (e10 != kotlinx.coroutines.channels.a.f20025l) {
                    return e10;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = BufferedChannel.c;
                Throwable o10 = BufferedChannel.this.o();
                if (o10 == null) {
                    o10 = new ClosedReceiveChannelException("Channel was closed");
                }
                int i10 = r.f20198a;
                throw o10;
            }
            throw new IllegalStateException("`hasNext()` has not been invoked".toString());
        }
    }

    /* compiled from: BufferedChannel.kt */
    /* loaded from: classes.dex */
    public static final class b implements s1 {
        @Override // kotlinx.coroutines.s1
        public final void b(q<?> qVar, int i10) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BufferedChannel(int i10, cg.l<? super E, tf.d> lVar) {
        boolean z10;
        long j10;
        this.f20011a = i10;
        this.f20012b = lVar;
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            g<Object> gVar = kotlinx.coroutines.channels.a.f20015a;
            if (i10 != 0) {
                if (i10 != Integer.MAX_VALUE) {
                    j10 = i10;
                } else {
                    j10 = Long.MAX_VALUE;
                }
            } else {
                j10 = 0;
            }
            this.bufferEnd = j10;
            this.completedExpandBuffersAndPauseFlag = n();
            g<Object> gVar2 = new g<>(0L, null, this, 3);
            this.sendSegment = gVar2;
            this.receiveSegment = gVar2;
            if (A()) {
                gVar2 = kotlinx.coroutines.channels.a.f20015a;
                kotlin.jvm.internal.g.c(gVar2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
            }
            this.bufferEndSegment = gVar2;
            if (lVar != 0) {
                new cg.q<mg.b<?>, Object, Object, cg.l<? super Throwable, ? extends tf.d>>(this) { // from class: kotlinx.coroutines.channels.BufferedChannel$onUndeliveredElementReceiveCancellationConstructor$1$1
                    final /* synthetic */ BufferedChannel<E> this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                        this.this$0 = this;
                    }

                    @Override // cg.q
                    public final cg.l<Throwable, tf.d> invoke(final mg.b<?> bVar, Object obj, final Object obj2) {
                        final BufferedChannel<E> bufferedChannel = this.this$0;
                        return new cg.l<Throwable, tf.d>() { // from class: kotlinx.coroutines.channels.BufferedChannel$onUndeliveredElementReceiveCancellationConstructor$1$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                Object obj3 = obj2;
                                if (obj3 != a.f20025l) {
                                    OnUndeliveredElementKt.b(bufferedChannel.f20012b, obj3, bVar.getContext());
                                }
                            }
                        };
                    }
                };
            }
            this._closeCause = kotlinx.coroutines.channels.a.f20032s;
            return;
        }
        throw new IllegalArgumentException(a0.a.g("Invalid channel capacity: ", i10, ", should be >=0").toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <E> java.lang.Object D(kotlinx.coroutines.channels.BufferedChannel<E> r14, kotlin.coroutines.c<? super kotlinx.coroutines.channels.f<? extends E>> r15) {
        /*
            boolean r0 = r15 instanceof kotlinx.coroutines.channels.BufferedChannel$receiveCatching$1
            if (r0 == 0) goto L13
            r0 = r15
            kotlinx.coroutines.channels.BufferedChannel$receiveCatching$1 r0 = (kotlinx.coroutines.channels.BufferedChannel$receiveCatching$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.BufferedChannel$receiveCatching$1 r0 = new kotlinx.coroutines.channels.BufferedChannel$receiveCatching$1
            r0.<init>(r14, r15)
        L18:
            r6 = r0
            java.lang.Object r15 = r6.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r6.label
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2d
            androidx.activity.s.u0(r15)
            kotlinx.coroutines.channels.f r15 = (kotlinx.coroutines.channels.f) r15
            java.lang.Object r14 = r15.f20038a
            goto L9d
        L2d:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L35:
            androidx.activity.s.u0(r15)
            r15 = 0
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.channels.BufferedChannel.f20007h
            java.lang.Object r1 = r1.get(r14)
            kotlinx.coroutines.channels.g r1 = (kotlinx.coroutines.channels.g) r1
        L41:
            boolean r3 = r14.w()
            if (r3 == 0) goto L51
            java.lang.Throwable r14 = r14.o()
            kotlinx.coroutines.channels.f$a r15 = new kotlinx.coroutines.channels.f$a
            r15.<init>(r14)
            goto La3
        L51:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = kotlinx.coroutines.channels.BufferedChannel.f20003d
            long r4 = r3.getAndIncrement(r14)
            int r3 = kotlinx.coroutines.channels.a.f20016b
            long r7 = (long) r3
            long r7 = r4 / r7
            long r9 = (long) r3
            long r9 = r4 % r9
            int r3 = (int) r9
            long r9 = r1.c
            int r9 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r9 == 0) goto L6f
            kotlinx.coroutines.channels.g r7 = r14.k(r7, r1)
            if (r7 != 0) goto L6d
            goto L41
        L6d:
            r13 = r7
            goto L70
        L6f:
            r13 = r1
        L70:
            r7 = r14
            r8 = r13
            r9 = r3
            r10 = r4
            r12 = r15
            java.lang.Object r1 = r7.I(r8, r9, r10, r12)
            com.android.billingclient.api.a0 r7 = kotlinx.coroutines.channels.a.f20026m
            if (r1 == r7) goto La4
            com.android.billingclient.api.a0 r7 = kotlinx.coroutines.channels.a.f20028o
            if (r1 != r7) goto L8e
            long r7 = r14.s()
            int r1 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r1 >= 0) goto L8c
            r13.a()
        L8c:
            r1 = r13
            goto L41
        L8e:
            com.android.billingclient.api.a0 r15 = kotlinx.coroutines.channels.a.f20027n
            if (r1 != r15) goto L9f
            r6.label = r2
            r1 = r14
            r2 = r13
            java.lang.Object r14 = r1.E(r2, r3, r4, r6)
            if (r14 != r0) goto L9d
            return r0
        L9d:
            r15 = r14
            goto La3
        L9f:
            r13.a()
            r15 = r1
        La3:
            return r15
        La4:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "unexpected"
            java.lang.String r15 = r15.toString()
            r14.<init>(r15)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.D(kotlinx.coroutines.channels.BufferedChannel, kotlin.coroutines.c):java.lang.Object");
    }

    public static final g a(BufferedChannel bufferedChannel, long j10, g gVar) {
        Object v10;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j11;
        long j12;
        boolean z10;
        bufferedChannel.getClass();
        g<Object> gVar2 = kotlinx.coroutines.channels.a.f20015a;
        BufferedChannelKt$createSegmentFunction$1 bufferedChannelKt$createSegmentFunction$1 = BufferedChannelKt$createSegmentFunction$1.INSTANCE;
        do {
            v10 = b1.v(gVar, j10, bufferedChannelKt$createSegmentFunction$1);
            if (com.google.android.play.core.assetpacks.c.L(v10)) {
                break;
            }
            q H = com.google.android.play.core.assetpacks.c.H(v10);
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20006g;
                q qVar = (q) atomicReferenceFieldUpdater.get(bufferedChannel);
                z10 = true;
                if (qVar.c >= H.c) {
                    break;
                }
                boolean z11 = false;
                if (!H.i()) {
                    z10 = false;
                    continue;
                    break;
                }
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(bufferedChannel, qVar, H)) {
                        z11 = true;
                        break;
                    } else if (atomicReferenceFieldUpdater.get(bufferedChannel) != qVar) {
                        break;
                    }
                }
                if (z11) {
                    if (qVar.e()) {
                        qVar.d();
                        continue;
                    } else {
                        continue;
                    }
                } else if (H.e()) {
                    H.d();
                }
            }
        } while (!z10);
        if (com.google.android.play.core.assetpacks.c.L(v10)) {
            bufferedChannel.y();
            if (gVar.c * kotlinx.coroutines.channels.a.f20016b < bufferedChannel.q()) {
                gVar.a();
            }
        } else {
            g gVar3 = (g) com.google.android.play.core.assetpacks.c.H(v10);
            long j13 = gVar3.c;
            if (j13 > j10) {
                long j14 = j13 * kotlinx.coroutines.channels.a.f20016b;
                do {
                    atomicLongFieldUpdater = c;
                    j11 = atomicLongFieldUpdater.get(bufferedChannel);
                    j12 = 1152921504606846975L & j11;
                    if (j12 >= j14) {
                        break;
                    }
                    g<Object> gVar4 = kotlinx.coroutines.channels.a.f20015a;
                } while (!atomicLongFieldUpdater.compareAndSet(bufferedChannel, j11, (((int) (j11 >> 60)) << 60) + j12));
                if (gVar3.c * kotlinx.coroutines.channels.a.f20016b < bufferedChannel.q()) {
                    gVar3.a();
                }
            } else {
                return gVar3;
            }
        }
        return null;
    }

    public static final int c(BufferedChannel bufferedChannel, g gVar, int i10, Object obj, long j10, Object obj2, boolean z10) {
        bufferedChannel.getClass();
        gVar.m(i10, obj);
        if (z10) {
            return bufferedChannel.J(gVar, i10, obj, j10, obj2, z10);
        }
        Object k10 = gVar.k(i10);
        if (k10 == null) {
            if (bufferedChannel.d(j10)) {
                if (gVar.j(i10, null, kotlinx.coroutines.channels.a.f20017d)) {
                    return 1;
                }
            } else if (obj2 == null) {
                return 3;
            } else {
                if (gVar.j(i10, null, obj2)) {
                    return 2;
                }
            }
        } else if (k10 instanceof s1) {
            gVar.m(i10, null);
            if (bufferedChannel.G(k10, obj)) {
                gVar.n(i10, kotlinx.coroutines.channels.a.f20022i);
                return 0;
            }
            a0 a0Var = kotlinx.coroutines.channels.a.f20024k;
            if (gVar.f20041f.getAndSet((i10 * 2) + 1, a0Var) != a0Var) {
                gVar.l(i10, true);
            }
            return 5;
        }
        return bufferedChannel.J(gVar, i10, obj, j10, obj2, z10);
    }

    public final boolean A() {
        long n10 = n();
        if (n10 != 0 && n10 != Long.MAX_VALUE) {
            return false;
        }
        return true;
    }

    public final void B(long j10, g<E> gVar) {
        boolean z10;
        g<E> gVar2;
        g<E> gVar3;
        while (gVar.c < j10 && (gVar3 = (g) gVar.b()) != null) {
            gVar = gVar3;
        }
        while (true) {
            if (gVar.c() && (gVar2 = (g) gVar.b()) != null) {
                gVar = gVar2;
            } else {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20008i;
                    q qVar = (q) atomicReferenceFieldUpdater.get(this);
                    z10 = true;
                    if (qVar.c >= gVar.c) {
                        break;
                    }
                    boolean z11 = false;
                    if (!gVar.i()) {
                        z10 = false;
                        break;
                    }
                    while (true) {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, qVar, gVar)) {
                            z11 = true;
                            break;
                        } else if (atomicReferenceFieldUpdater.get(this) != qVar) {
                            break;
                        }
                    }
                    if (z11) {
                        if (qVar.e()) {
                            qVar.d();
                        }
                    } else if (gVar.e()) {
                        gVar.d();
                    }
                }
                if (z10) {
                    return;
                }
            }
        }
    }

    public final Object C(E e10, kotlin.coroutines.c<? super tf.d> cVar) {
        UndeliveredElementException c10;
        kotlinx.coroutines.h hVar = new kotlinx.coroutines.h(1, b1.L(cVar));
        hVar.s();
        cg.l<E, tf.d> lVar = this.f20012b;
        if (lVar != null && (c10 = OnUndeliveredElementKt.c(lVar, e10, null)) != null) {
            b1.n(c10, r());
            hVar.resumeWith(Result.m13constructorimpl(s.v(c10)));
        } else {
            hVar.resumeWith(Result.m13constructorimpl(s.v(r())));
        }
        Object r4 = hVar.r();
        if (r4 == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return r4;
        }
        return tf.d.f30009a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object E(kotlinx.coroutines.channels.g<E> r17, int r18, long r19, kotlin.coroutines.c<? super kotlinx.coroutines.channels.f<? extends E>> r21) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.E(kotlinx.coroutines.channels.g, int, long, kotlin.coroutines.c):java.lang.Object");
    }

    public final void F(s1 s1Var, boolean z10) {
        Throwable r4;
        if (!(s1Var instanceof b)) {
            if (s1Var instanceof kotlinx.coroutines.g) {
                kotlin.coroutines.c cVar = (kotlin.coroutines.c) s1Var;
                if (z10) {
                    r4 = o();
                    if (r4 == null) {
                        r4 = new ClosedReceiveChannelException("Channel was closed");
                    }
                } else {
                    r4 = r();
                }
                cVar.resumeWith(Result.m13constructorimpl(s.v(r4)));
                return;
            } else if (s1Var instanceof k) {
                ((k) s1Var).f20043a.resumeWith(Result.m13constructorimpl(new f(new f.a(o()))));
                return;
            } else if (s1Var instanceof a) {
                a aVar = (a) s1Var;
                kotlinx.coroutines.h<? super Boolean> hVar = aVar.f20014b;
                kotlin.jvm.internal.g.b(hVar);
                aVar.f20014b = null;
                aVar.f20013a = kotlinx.coroutines.channels.a.f20025l;
                Throwable o10 = BufferedChannel.this.o();
                if (o10 == null) {
                    hVar.resumeWith(Result.m13constructorimpl(Boolean.FALSE));
                    return;
                } else {
                    hVar.resumeWith(Result.m13constructorimpl(s.v(o10)));
                    return;
                }
            } else if (s1Var instanceof mg.b) {
                ((mg.b) s1Var).a(this, kotlinx.coroutines.channels.a.f20025l);
                return;
            } else {
                throw new IllegalStateException(("Unexpected waiter: " + s1Var).toString());
            }
        }
        ((b) s1Var).getClass();
        Result.m13constructorimpl(Boolean.FALSE);
        throw null;
    }

    public final boolean G(Object obj, E e10) {
        if (obj instanceof mg.b) {
            return ((mg.b) obj).a(this, e10);
        }
        boolean z10 = obj instanceof k;
        cg.l<E, tf.d> lVar = this.f20012b;
        cg.l<Throwable, tf.d> lVar2 = null;
        if (z10) {
            kotlin.jvm.internal.g.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
            f fVar = new f(e10);
            kotlinx.coroutines.h<f<? extends E>> hVar = ((k) obj).f20043a;
            if (lVar != null) {
                lVar2 = OnUndeliveredElementKt.a(lVar, e10, hVar.f20159e);
            }
            return kotlinx.coroutines.channels.a.a(hVar, fVar, lVar2);
        } else if (obj instanceof a) {
            kotlin.jvm.internal.g.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
            a aVar = (a) obj;
            kotlinx.coroutines.h<? super Boolean> hVar2 = aVar.f20014b;
            kotlin.jvm.internal.g.b(hVar2);
            aVar.f20014b = null;
            aVar.f20013a = e10;
            Boolean bool = Boolean.TRUE;
            cg.l<E, tf.d> lVar3 = BufferedChannel.this.f20012b;
            if (lVar3 != null) {
                lVar2 = OnUndeliveredElementKt.a(lVar3, e10, hVar2.f20159e);
            }
            return kotlinx.coroutines.channels.a.a(hVar2, bool, lVar2);
        } else if (obj instanceof kotlinx.coroutines.g) {
            kotlin.jvm.internal.g.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            kotlinx.coroutines.g gVar = (kotlinx.coroutines.g) obj;
            if (lVar != null) {
                lVar2 = OnUndeliveredElementKt.a(lVar, e10, gVar.getContext());
            }
            return kotlinx.coroutines.channels.a.a(gVar, e10, lVar2);
        } else {
            throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
        }
    }

    public final boolean H(Object obj, g<E> gVar, int i10) {
        TrySelectDetailedResult trySelectDetailedResult;
        if (obj instanceof kotlinx.coroutines.g) {
            kotlin.jvm.internal.g.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return kotlinx.coroutines.channels.a.a((kotlinx.coroutines.g) obj, tf.d.f30009a, null);
        } else if (obj instanceof mg.b) {
            kotlin.jvm.internal.g.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
            tf.d dVar = tf.d.f30009a;
            int d10 = ((mg.a) obj).d(this);
            if (d10 != 0) {
                if (d10 != 1) {
                    if (d10 != 2) {
                        if (d10 == 3) {
                            trySelectDetailedResult = TrySelectDetailedResult.ALREADY_SELECTED;
                        } else {
                            throw new IllegalStateException(("Unexpected internal result: " + d10).toString());
                        }
                    } else {
                        trySelectDetailedResult = TrySelectDetailedResult.CANCELLED;
                    }
                } else {
                    trySelectDetailedResult = TrySelectDetailedResult.REREGISTER;
                }
            } else {
                trySelectDetailedResult = TrySelectDetailedResult.SUCCESSFUL;
            }
            if (trySelectDetailedResult == TrySelectDetailedResult.REREGISTER) {
                gVar.m(i10, null);
            }
            if (trySelectDetailedResult == TrySelectDetailedResult.SUCCESSFUL) {
                return true;
            }
            return false;
        } else if (obj instanceof b) {
            ((b) obj).getClass();
            kotlinx.coroutines.channels.a.a(null, Boolean.TRUE, null);
            throw null;
        } else {
            throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
        }
    }

    public final Object I(g<E> gVar, int i10, long j10, Object obj) {
        Object k10 = gVar.k(i10);
        AtomicReferenceArray atomicReferenceArray = gVar.f20041f;
        AtomicLongFieldUpdater atomicLongFieldUpdater = c;
        if (k10 == null) {
            if (j10 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return kotlinx.coroutines.channels.a.f20027n;
                }
                if (gVar.j(i10, k10, obj)) {
                    i();
                    return kotlinx.coroutines.channels.a.f20026m;
                }
            }
        } else if (k10 == kotlinx.coroutines.channels.a.f20017d && gVar.j(i10, k10, kotlinx.coroutines.channels.a.f20022i)) {
            i();
            Object obj2 = atomicReferenceArray.get(i10 * 2);
            gVar.m(i10, null);
            return obj2;
        }
        while (true) {
            Object k11 = gVar.k(i10);
            if (k11 != null && k11 != kotlinx.coroutines.channels.a.f20018e) {
                if (k11 == kotlinx.coroutines.channels.a.f20017d) {
                    if (gVar.j(i10, k11, kotlinx.coroutines.channels.a.f20022i)) {
                        i();
                        Object obj3 = atomicReferenceArray.get(i10 * 2);
                        gVar.m(i10, null);
                        return obj3;
                    }
                } else {
                    a0 a0Var = kotlinx.coroutines.channels.a.f20023j;
                    if (k11 == a0Var) {
                        return kotlinx.coroutines.channels.a.f20028o;
                    }
                    if (k11 == kotlinx.coroutines.channels.a.f20021h) {
                        return kotlinx.coroutines.channels.a.f20028o;
                    }
                    if (k11 == kotlinx.coroutines.channels.a.f20025l) {
                        i();
                        return kotlinx.coroutines.channels.a.f20028o;
                    } else if (k11 != kotlinx.coroutines.channels.a.f20020g && gVar.j(i10, k11, kotlinx.coroutines.channels.a.f20019f)) {
                        boolean z10 = k11 instanceof n;
                        if (z10) {
                            k11 = ((n) k11).f20044a;
                        }
                        if (H(k11, gVar, i10)) {
                            gVar.n(i10, kotlinx.coroutines.channels.a.f20022i);
                            i();
                            Object obj4 = atomicReferenceArray.get(i10 * 2);
                            gVar.m(i10, null);
                            return obj4;
                        }
                        gVar.n(i10, a0Var);
                        gVar.l(i10, false);
                        if (z10) {
                            i();
                        }
                        return kotlinx.coroutines.channels.a.f20028o;
                    }
                }
            } else if (j10 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (gVar.j(i10, k11, kotlinx.coroutines.channels.a.f20021h)) {
                    i();
                    return kotlinx.coroutines.channels.a.f20028o;
                }
            } else if (obj == null) {
                return kotlinx.coroutines.channels.a.f20027n;
            } else {
                if (gVar.j(i10, k11, obj)) {
                    i();
                    return kotlinx.coroutines.channels.a.f20026m;
                }
            }
        }
    }

    public final int J(g<E> gVar, int i10, E e10, long j10, Object obj, boolean z10) {
        while (true) {
            Object k10 = gVar.k(i10);
            if (k10 == null) {
                if (d(j10) && !z10) {
                    if (gVar.j(i10, null, kotlinx.coroutines.channels.a.f20017d)) {
                        return 1;
                    }
                } else if (z10) {
                    if (gVar.j(i10, null, kotlinx.coroutines.channels.a.f20023j)) {
                        gVar.l(i10, false);
                        return 4;
                    }
                } else if (obj == null) {
                    return 3;
                } else {
                    if (gVar.j(i10, null, obj)) {
                        return 2;
                    }
                }
            } else if (k10 == kotlinx.coroutines.channels.a.f20018e) {
                if (gVar.j(i10, k10, kotlinx.coroutines.channels.a.f20017d)) {
                    return 1;
                }
            } else {
                a0 a0Var = kotlinx.coroutines.channels.a.f20024k;
                if (k10 == a0Var) {
                    gVar.m(i10, null);
                    return 5;
                } else if (k10 == kotlinx.coroutines.channels.a.f20021h) {
                    gVar.m(i10, null);
                    return 5;
                } else if (k10 == kotlinx.coroutines.channels.a.f20025l) {
                    gVar.m(i10, null);
                    y();
                    return 4;
                } else {
                    gVar.m(i10, null);
                    if (k10 instanceof n) {
                        k10 = ((n) k10).f20044a;
                    }
                    if (G(k10, e10)) {
                        gVar.n(i10, kotlinx.coroutines.channels.a.f20022i);
                        return 0;
                    }
                    if (gVar.f20041f.getAndSet((i10 * 2) + 1, a0Var) != a0Var) {
                        gVar.l(i10, true);
                    }
                    return 5;
                }
            }
        }
    }

    public final void K(long j10) {
        long j11;
        boolean z10;
        long j12;
        if (A()) {
            return;
        }
        do {
        } while (n() <= j10);
        int i10 = kotlinx.coroutines.channels.a.c;
        int i11 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f20005f;
            if (i11 < i10) {
                long n10 = n();
                if (n10 == (atomicLongFieldUpdater.get(this) & 4611686018427387903L) && n10 == n()) {
                    return;
                }
                i11++;
            } else {
                do {
                    j11 = atomicLongFieldUpdater.get(this);
                } while (!atomicLongFieldUpdater.compareAndSet(this, j11, 4611686018427387904L + (j11 & 4611686018427387903L)));
                while (true) {
                    long n11 = n();
                    long j13 = atomicLongFieldUpdater.get(this);
                    long j14 = j13 & 4611686018427387903L;
                    if ((j13 & 4611686018427387904L) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (n11 == j14 && n11 == n()) {
                        break;
                    } else if (!z10) {
                        atomicLongFieldUpdater.compareAndSet(this, j13, j14 + 4611686018427387904L);
                    }
                }
                do {
                    j12 = atomicLongFieldUpdater.get(this);
                } while (!atomicLongFieldUpdater.compareAndSet(this, j12, 0 + (j12 & 4611686018427387903L)));
                return;
            }
        }
    }

    @Override // kotlinx.coroutines.channels.l
    public final void b(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        f(true, cancellationException);
    }

    public final boolean d(long j10) {
        if (j10 >= n() && j10 >= q() + this.f20011a) {
            return false;
        }
        return true;
    }

    @Override // kotlinx.coroutines.channels.l
    public final Object e() {
        g<E> gVar;
        s1 s1Var;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f20003d;
        long j10 = atomicLongFieldUpdater.get(this);
        long j11 = c.get(this);
        if (u(j11, true)) {
            return new f.a(o());
        }
        int i10 = (j10 > (j11 & 1152921504606846975L) ? 1 : (j10 == (j11 & 1152921504606846975L) ? 0 : -1));
        Object obj = f.f20037b;
        if (i10 >= 0) {
            return obj;
        }
        a0 a0Var = kotlinx.coroutines.channels.a.f20024k;
        g<E> gVar2 = (g) f20007h.get(this);
        while (!w()) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j12 = kotlinx.coroutines.channels.a.f20016b;
            long j13 = andIncrement / j12;
            int i11 = (int) (andIncrement % j12);
            if (gVar2.c != j13) {
                g<E> k10 = k(j13, gVar2);
                if (k10 == null) {
                    continue;
                } else {
                    gVar = k10;
                }
            } else {
                gVar = gVar2;
            }
            Object I = I(gVar, i11, andIncrement, a0Var);
            if (I == kotlinx.coroutines.channels.a.f20026m) {
                if (a0Var instanceof s1) {
                    s1Var = (s1) a0Var;
                } else {
                    s1Var = null;
                }
                if (s1Var != null) {
                    s1Var.b(gVar, i11);
                }
                K(andIncrement);
                gVar.h();
            } else if (I == kotlinx.coroutines.channels.a.f20028o) {
                if (andIncrement < s()) {
                    gVar.a();
                }
                gVar2 = gVar;
            } else if (I != kotlinx.coroutines.channels.a.f20027n) {
                gVar.a();
                obj = I;
            } else {
                throw new IllegalStateException("unexpected".toString());
            }
            return obj;
        }
        return new f.a(o());
    }

    public final boolean f(boolean z10, Throwable th2) {
        boolean z11;
        long j10;
        long j11;
        int i10;
        Object obj;
        a0 a0Var;
        boolean z12;
        long j12;
        long j13;
        AtomicLongFieldUpdater atomicLongFieldUpdater = c;
        if (z10) {
            do {
                j13 = atomicLongFieldUpdater.get(this);
                if (((int) (j13 >> 60)) != 0) {
                    break;
                }
                g<Object> gVar = kotlinx.coroutines.channels.a.f20015a;
            } while (!atomicLongFieldUpdater.compareAndSet(this, j13, (1 << 60) + (j13 & 1152921504606846975L)));
        }
        a0 a0Var2 = kotlinx.coroutines.channels.a.f20032s;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20009j;
            if (atomicReferenceFieldUpdater.compareAndSet(this, a0Var2, th2)) {
                z11 = true;
                break;
            } else if (atomicReferenceFieldUpdater.get(this) != a0Var2) {
                z11 = false;
                break;
            }
        }
        if (z10) {
            do {
                j12 = atomicLongFieldUpdater.get(this);
                g<Object> gVar2 = kotlinx.coroutines.channels.a.f20015a;
            } while (!atomicLongFieldUpdater.compareAndSet(this, j12, (3 << 60) + (j12 & 1152921504606846975L)));
        } else {
            do {
                j10 = atomicLongFieldUpdater.get(this);
                int i11 = (int) (j10 >> 60);
                if (i11 != 0) {
                    if (i11 != 1) {
                        break;
                    }
                    j11 = j10 & 1152921504606846975L;
                    g<Object> gVar3 = kotlinx.coroutines.channels.a.f20015a;
                    i10 = 3;
                } else {
                    j11 = j10 & 1152921504606846975L;
                    g<Object> gVar4 = kotlinx.coroutines.channels.a.f20015a;
                    i10 = 2;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(this, j10, (i10 << 60) + j11));
        }
        y();
        if (z11) {
            do {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f20010k;
                obj = atomicReferenceFieldUpdater2.get(this);
                if (obj == null) {
                    a0Var = kotlinx.coroutines.channels.a.f20030q;
                } else {
                    a0Var = kotlinx.coroutines.channels.a.f20031r;
                }
                while (true) {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, obj, a0Var)) {
                        z12 = true;
                        continue;
                        break;
                    } else if (atomicReferenceFieldUpdater2.get(this) != obj) {
                        z12 = false;
                        continue;
                        break;
                    }
                }
            } while (!z12);
            if (obj != null) {
                kotlin.jvm.internal.k.c(1, obj);
                ((cg.l) obj).invoke(o());
            }
        }
        return z11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0097, code lost:
        r1 = (kotlinx.coroutines.channels.g) ((kotlinx.coroutines.internal.c) kotlinx.coroutines.internal.c.f20171b.get(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final kotlinx.coroutines.channels.g<E> g(long r13) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.g(long):kotlinx.coroutines.channels.g");
    }

    public final void h(long j10) {
        UndeliveredElementException c10;
        g<E> gVar = (g) f20007h.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f20003d;
            long j11 = atomicLongFieldUpdater.get(this);
            if (j10 < Math.max(this.f20011a + j11, n())) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j11, j11 + 1)) {
                long j12 = kotlinx.coroutines.channels.a.f20016b;
                long j13 = j11 / j12;
                int i10 = (int) (j11 % j12);
                if (gVar.c != j13) {
                    g<E> k10 = k(j13, gVar);
                    if (k10 == null) {
                        continue;
                    } else {
                        gVar = k10;
                    }
                }
                Object I = I(gVar, i10, j11, null);
                if (I == kotlinx.coroutines.channels.a.f20028o) {
                    if (j11 < s()) {
                        gVar.a();
                    }
                } else {
                    gVar.a();
                    cg.l<E, tf.d> lVar = this.f20012b;
                    if (lVar != null && (c10 = OnUndeliveredElementKt.c(lVar, I, null)) != null) {
                        throw c10;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x0158, code lost:
        r13 = r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00db A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x019c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0012 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i() {
        /*
            Method dump skipped, instructions count: 425
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.i():void");
    }

    @Override // kotlinx.coroutines.channels.l
    public final d<E> iterator() {
        return new a();
    }

    @Override // kotlinx.coroutines.channels.l
    public final Object j(kotlin.coroutines.c<? super f<? extends E>> cVar) {
        return D(this, cVar);
    }

    public final g<E> k(long j10, g<E> gVar) {
        Object v10;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j11;
        boolean z10;
        boolean z11;
        boolean z12;
        g<Object> gVar2 = kotlinx.coroutines.channels.a.f20015a;
        BufferedChannelKt$createSegmentFunction$1 bufferedChannelKt$createSegmentFunction$1 = BufferedChannelKt$createSegmentFunction$1.INSTANCE;
        do {
            v10 = b1.v(gVar, j10, bufferedChannelKt$createSegmentFunction$1);
            if (com.google.android.play.core.assetpacks.c.L(v10)) {
                break;
            }
            q H = com.google.android.play.core.assetpacks.c.H(v10);
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20007h;
                q qVar = (q) atomicReferenceFieldUpdater.get(this);
                if (qVar.c >= H.c) {
                    break;
                } else if (!H.i()) {
                    z11 = false;
                    continue;
                    break;
                } else {
                    while (true) {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, qVar, H)) {
                            z12 = true;
                            break;
                        } else if (atomicReferenceFieldUpdater.get(this) != qVar) {
                            z12 = false;
                            break;
                        }
                    }
                    if (z12) {
                        if (qVar.e()) {
                            qVar.d();
                        }
                    } else if (H.e()) {
                        H.d();
                    }
                }
            }
            z11 = true;
            continue;
        } while (!z11);
        if (com.google.android.play.core.assetpacks.c.L(v10)) {
            y();
            if (gVar.c * kotlinx.coroutines.channels.a.f20016b < s()) {
                gVar.a();
            }
        } else {
            g<E> gVar3 = (g) com.google.android.play.core.assetpacks.c.H(v10);
            boolean A = A();
            long j12 = gVar3.c;
            if (!A && j10 <= n() / kotlinx.coroutines.channels.a.f20016b) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f20008i;
                    q qVar2 = (q) atomicReferenceFieldUpdater2.get(this);
                    if (qVar2.c >= j12 || !gVar3.i()) {
                        break;
                    }
                    while (true) {
                        if (atomicReferenceFieldUpdater2.compareAndSet(this, qVar2, gVar3)) {
                            z10 = true;
                            break;
                        } else if (atomicReferenceFieldUpdater2.get(this) != qVar2) {
                            z10 = false;
                            break;
                        }
                    }
                    if (z10) {
                        if (qVar2.e()) {
                            qVar2.d();
                        }
                    } else if (gVar3.e()) {
                        gVar3.d();
                    }
                }
            }
            if (j12 > j10) {
                long j13 = j12 * kotlinx.coroutines.channels.a.f20016b;
                do {
                    atomicLongFieldUpdater = f20003d;
                    j11 = atomicLongFieldUpdater.get(this);
                    if (j11 >= j13) {
                        break;
                    }
                } while (!atomicLongFieldUpdater.compareAndSet(this, j11, j13));
                if (gVar3.c * kotlinx.coroutines.channels.a.f20016b < s()) {
                    gVar3.a();
                }
            } else {
                return gVar3;
            }
        }
        return null;
    }

    @Override // kotlinx.coroutines.channels.m
    public final boolean m(Throwable th2) {
        return f(false, th2);
    }

    public final long n() {
        return f20004e.get(this);
    }

    public final Throwable o() {
        return (Throwable) f20009j.get(this);
    }

    @Override // kotlinx.coroutines.channels.m
    public final void p(cg.l<? super Throwable, tf.d> lVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        boolean z10;
        boolean z11;
        while (true) {
            atomicReferenceFieldUpdater = f20010k;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, lVar)) {
                z10 = true;
                break;
            } else if (atomicReferenceFieldUpdater.get(this) != null) {
                z10 = false;
                break;
            }
        }
        if (z10) {
            return;
        }
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            a0 a0Var = kotlinx.coroutines.channels.a.f20030q;
            if (obj == a0Var) {
                a0 a0Var2 = kotlinx.coroutines.channels.a.f20031r;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, a0Var, a0Var2)) {
                        z11 = true;
                        continue;
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != a0Var) {
                        z11 = false;
                        continue;
                        break;
                    }
                }
            } else if (obj == kotlinx.coroutines.channels.a.f20031r) {
                throw new IllegalStateException("Another handler was already registered and successfully invoked".toString());
            } else {
                throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
        } while (!z11);
        lVar.invoke(o());
    }

    public final long q() {
        return f20003d.get(this);
    }

    public final Throwable r() {
        Throwable o10 = o();
        if (o10 == null) {
            return new ClosedSendChannelException("Channel was closed");
        }
        return o10;
    }

    public final long s() {
        return c.get(this) & 1152921504606846975L;
    }

    public final void t(long j10) {
        boolean z10;
        boolean z11;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f20005f;
        if ((atomicLongFieldUpdater.addAndGet(this, j10) & 4611686018427387904L) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            do {
                if ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0) {
                    z11 = true;
                    continue;
                } else {
                    z11 = false;
                    continue;
                }
            } while (z11);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:94:0x01c9, code lost:
        r3 = (kotlinx.coroutines.channels.g) r3.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01d0, code lost:
        if (r3 != null) goto L109;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01c9 A[EDGE_INSN: B:112:0x01c9->B:94:0x01c9 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 507
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.toString():java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x0187, code lost:
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c1, code lost:
        r0 = (kotlinx.coroutines.channels.g) ((kotlinx.coroutines.internal.c) kotlinx.coroutines.internal.c.f20171b.get(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean u(long r18, boolean r20) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.u(long, boolean):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d5, code lost:
        return tf.d.f30009a;
     */
    @Override // kotlinx.coroutines.channels.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object v(E r23) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.v(java.lang.Object):java.lang.Object");
    }

    public final boolean w() {
        return u(c.get(this), true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x01b5, code lost:
        return tf.d.f30009a;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:135:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0190  */
    @Override // kotlinx.coroutines.channels.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object x(E r24, kotlin.coroutines.c<? super tf.d> r25) {
        /*
            Method dump skipped, instructions count: 438
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.x(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
    }

    @Override // kotlinx.coroutines.channels.m
    public final boolean y() {
        return u(c.get(this), false);
    }

    public boolean z() {
        return false;
    }
}

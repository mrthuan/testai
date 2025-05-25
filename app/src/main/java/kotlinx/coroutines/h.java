package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.y0;

/* compiled from: CancellableContinuationImpl.kt */
/* loaded from: classes.dex */
public final class h<T> extends g0<T> implements g<T>, wf.b, s1 {

    /* renamed from: f  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f20155f = AtomicIntegerFieldUpdater.newUpdater(h.class, "_decisionAndIndex");

    /* renamed from: g  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f20156g = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_state");

    /* renamed from: h  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f20157h = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_parentHandle");
    private volatile int _decisionAndIndex;
    private volatile Object _parentHandle;
    private volatile Object _state;

    /* renamed from: d  reason: collision with root package name */
    public final kotlin.coroutines.c<T> f20158d;

    /* renamed from: e  reason: collision with root package name */
    public final CoroutineContext f20159e;

    public h(int i10, kotlin.coroutines.c cVar) {
        super(i10);
        this.f20158d = cVar;
        this.f20159e = cVar.getContext();
        this._decisionAndIndex = 536870911;
        this._state = b.f19988a;
    }

    public static Object C(i1 i1Var, Object obj, int i10, cg.l lVar) {
        e eVar;
        if (!(obj instanceof p)) {
            boolean z10 = true;
            if (i10 != 1 && i10 != 2) {
                z10 = false;
            }
            if (z10) {
                if (lVar != null || (i1Var instanceof e)) {
                    if (i1Var instanceof e) {
                        eVar = (e) i1Var;
                    } else {
                        eVar = null;
                    }
                    return new o(obj, eVar, lVar, (CancellationException) null, 16);
                }
                return obj;
            }
            return obj;
        }
        return obj;
    }

    public static void x(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    @Override // kotlinx.coroutines.g
    public final void A(Object obj) {
        q(this.c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0021, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void B(java.lang.Object r7, int r8, cg.l<? super java.lang.Throwable, tf.d> r9) {
        /*
            r6 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.h.f20156g
            java.lang.Object r1 = r0.get(r6)
            boolean r2 = r1 instanceof kotlinx.coroutines.i1
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            r2 = r1
            kotlinx.coroutines.i1 r2 = (kotlinx.coroutines.i1) r2
            java.lang.Object r2 = C(r2, r7, r8, r9)
        L13:
            boolean r5 = r0.compareAndSet(r6, r1, r2)
            if (r5 == 0) goto L1b
            r3 = r4
            goto L21
        L1b:
            java.lang.Object r5 = r0.get(r6)
            if (r5 == r1) goto L13
        L21:
            if (r3 == 0) goto L0
            boolean r7 = r6.w()
            if (r7 != 0) goto L2c
            r6.p()
        L2c:
            r6.q(r8)
            return
        L30:
            boolean r8 = r1 instanceof kotlinx.coroutines.i
            if (r8 == 0) goto L49
            kotlinx.coroutines.i r1 = (kotlinx.coroutines.i) r1
            r1.getClass()
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r8 = kotlinx.coroutines.i.c
            boolean r8 = r8.compareAndSet(r1, r3, r4)
            if (r8 == 0) goto L49
            if (r9 == 0) goto L48
            java.lang.Throwable r7 = r1.f20226a
            r6.k(r9, r7)
        L48:
            return
        L49:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "Already resumed, but proposed with update "
            r9.<init>(r0)
            r9.append(r7)
            java.lang.String r7 = r9.toString()
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.h.B(java.lang.Object, int, cg.l):void");
    }

    @Override // kotlinx.coroutines.g
    public final boolean a() {
        return f20156g.get(this) instanceof i1;
    }

    @Override // kotlinx.coroutines.s1
    public final void b(kotlinx.coroutines.internal.q<?> qVar, int i10) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i11;
        boolean z10;
        do {
            atomicIntegerFieldUpdater = f20155f;
            i11 = atomicIntegerFieldUpdater.get(this);
            if ((i11 & 536870911) == 536870911) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once".toString());
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i11, ((i11 >> 29) << 29) + i10));
        v(qVar);
    }

    @Override // kotlinx.coroutines.g0
    public final void c(Object obj, CancellationException cancellationException) {
        boolean z10;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20156g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof i1)) {
                if (obj2 instanceof p) {
                    return;
                }
                boolean z11 = true;
                if (obj2 instanceof o) {
                    o oVar = (o) obj2;
                    if (oVar.f20217e != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        o a10 = o.a(oVar, null, cancellationException, 15);
                        while (true) {
                            if (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, a10)) {
                                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                                    z11 = false;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        if (z11) {
                            e eVar = oVar.f20215b;
                            if (eVar != null) {
                                j(eVar, cancellationException);
                            }
                            cg.l<Throwable, tf.d> lVar = oVar.c;
                            if (lVar != null) {
                                k(lVar, cancellationException);
                                return;
                            }
                            return;
                        }
                    } else {
                        throw new IllegalStateException("Must be called at most once".toString());
                    }
                } else {
                    o oVar2 = new o(obj2, (e) null, (cg.l) null, cancellationException, 14);
                    while (true) {
                        if (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, oVar2)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj2) {
                                z11 = false;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (z11) {
                        return;
                    }
                }
            } else {
                throw new IllegalStateException("Not completed".toString());
            }
        }
    }

    @Override // kotlinx.coroutines.g0
    public final kotlin.coroutines.c<T> d() {
        return this.f20158d;
    }

    @Override // kotlinx.coroutines.g0
    public final Throwable e(Object obj) {
        Throwable e10 = super.e(obj);
        if (e10 == null) {
            return null;
        }
        return e10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.g0
    public final <T> T f(Object obj) {
        if (obj instanceof o) {
            return (T) ((o) obj).f20214a;
        }
        return obj;
    }

    @Override // kotlinx.coroutines.g
    public final com.android.billingclient.api.a0 g(Object obj, cg.l lVar) {
        com.android.billingclient.api.a0 a0Var;
        boolean z10;
        do {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20156g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            boolean z11 = obj2 instanceof i1;
            a0Var = com.google.android.play.core.assetpacks.c.f13198b;
            if (z11) {
                Object C = C((i1) obj2, obj, this.c, lVar);
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, C)) {
                        z10 = true;
                        continue;
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        z10 = false;
                        continue;
                        break;
                    }
                }
            } else {
                boolean z12 = obj2 instanceof o;
                return null;
            }
        } while (!z10);
        if (!w()) {
            p();
            return a0Var;
        }
        return a0Var;
    }

    @Override // wf.b
    public final wf.b getCallerFrame() {
        kotlin.coroutines.c<T> cVar = this.f20158d;
        if (cVar instanceof wf.b) {
            return (wf.b) cVar;
        }
        return null;
    }

    @Override // kotlin.coroutines.c
    public final CoroutineContext getContext() {
        return this.f20159e;
    }

    @Override // kotlinx.coroutines.g0
    public final Object i() {
        return f20156g.get(this);
    }

    public final void j(e eVar, Throwable th2) {
        try {
            eVar.c(th2);
        } catch (Throwable th3) {
            v.a(this.f20159e, new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th3));
        }
    }

    public final void k(cg.l<? super Throwable, tf.d> lVar, Throwable th2) {
        try {
            lVar.invoke(th2);
        } catch (Throwable th3) {
            v.a(this.f20159e, new CompletionHandlerException("Exception in resume onCancellation handler for " + this, th3));
        }
    }

    public final void m(kotlinx.coroutines.internal.q<?> qVar, Throwable th2) {
        boolean z10;
        CoroutineContext coroutineContext = this.f20159e;
        int i10 = f20155f.get(this) & 536870911;
        if (i10 != 536870911) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            try {
                qVar.g(i10, coroutineContext);
                return;
            } catch (Throwable th3) {
                v.a(coroutineContext, new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th3));
                return;
            }
        }
        throw new IllegalStateException("The index for Segment.onCancellation(..) is broken".toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x002c, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n(java.lang.Throwable r7) {
        /*
            r6 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.h.f20156g
            java.lang.Object r1 = r0.get(r6)
            boolean r2 = r1 instanceof kotlinx.coroutines.i1
            if (r2 != 0) goto Lb
            return
        Lb:
            kotlinx.coroutines.i r2 = new kotlinx.coroutines.i
            boolean r3 = r1 instanceof kotlinx.coroutines.e
            r4 = 0
            r5 = 1
            if (r3 != 0) goto L1a
            boolean r3 = r1 instanceof kotlinx.coroutines.internal.q
            if (r3 == 0) goto L18
            goto L1a
        L18:
            r3 = r4
            goto L1b
        L1a:
            r3 = r5
        L1b:
            r2.<init>(r6, r7, r3)
        L1e:
            boolean r3 = r0.compareAndSet(r6, r1, r2)
            if (r3 == 0) goto L26
            r4 = r5
            goto L2c
        L26:
            java.lang.Object r3 = r0.get(r6)
            if (r3 == r1) goto L1e
        L2c:
            if (r4 == 0) goto L0
            r0 = r1
            kotlinx.coroutines.i1 r0 = (kotlinx.coroutines.i1) r0
            boolean r2 = r0 instanceof kotlinx.coroutines.e
            if (r2 == 0) goto L3b
            kotlinx.coroutines.e r1 = (kotlinx.coroutines.e) r1
            r6.j(r1, r7)
            goto L44
        L3b:
            boolean r0 = r0 instanceof kotlinx.coroutines.internal.q
            if (r0 == 0) goto L44
            kotlinx.coroutines.internal.q r1 = (kotlinx.coroutines.internal.q) r1
            r6.m(r1, r7)
        L44:
            boolean r7 = r6.w()
            if (r7 != 0) goto L4d
            r6.p()
        L4d:
            int r7 = r6.c
            r6.q(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.h.n(java.lang.Throwable):void");
    }

    @Override // kotlinx.coroutines.g
    public final void o(cg.l lVar, Object obj) {
        B(obj, this.c, lVar);
    }

    public final void p() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20157h;
        k0 k0Var = (k0) atomicReferenceFieldUpdater.get(this);
        if (k0Var == null) {
            return;
        }
        k0Var.dispose();
        atomicReferenceFieldUpdater.set(this, h1.f20160a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
        if (r0 == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
        if (r7 != 4) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
        r1 = r6.f20158d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
        if (r0 != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0039, code lost:
        if ((r1 instanceof kotlinx.coroutines.internal.f) == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003c, code lost:
        if (r7 == 1) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003e, code lost:
        if (r7 != 2) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0041, code lost:
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0043, code lost:
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0044, code lost:
        r5 = r6.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0046, code lost:
        if (r5 == 1) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0048, code lost:
        if (r5 != 2) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004a, code lost:
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x004b, code lost:
        if (r7 != r4) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x004d, code lost:
        r7 = ((kotlinx.coroutines.internal.f) r1).f20175d;
        r0 = r1.getContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005a, code lost:
        if (r7.p() == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005c, code lost:
        r7.n(r0, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0060, code lost:
        r7 = kotlinx.coroutines.o1.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0068, code lost:
        if (r7.W() == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006a, code lost:
        r7.x(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006e, code lost:
        r7.U(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0071, code lost:
        kotlinx.coroutines.h0.a(r6, r1, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0078, code lost:
        if (r7.Y() != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x007b, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0088, code lost:
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0089, code lost:
        kotlinx.coroutines.h0.a(r6, r1, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x008c, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:?, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q(int r7) {
        /*
            r6 = this;
        L0:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.h.f20155f
            int r1 = r0.get(r6)
            int r2 = r1 >> 29
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L1c
            if (r2 != r3) goto L10
            r0 = r4
            goto L2a
        L10:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Already resumed"
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        L1c:
            r2 = 536870911(0x1fffffff, float:1.0842021E-19)
            r2 = r2 & r1
            r5 = 1073741824(0x40000000, float:2.0)
            int r2 = r2 + r5
            boolean r0 = r0.compareAndSet(r6, r1, r2)
            if (r0 == 0) goto L0
            r0 = r3
        L2a:
            if (r0 == 0) goto L2d
            return
        L2d:
            r0 = 4
            if (r7 != r0) goto L32
            r0 = r3
            goto L33
        L32:
            r0 = r4
        L33:
            kotlin.coroutines.c<T> r1 = r6.f20158d
            if (r0 != 0) goto L89
            boolean r2 = r1 instanceof kotlinx.coroutines.internal.f
            if (r2 == 0) goto L89
            r2 = 2
            if (r7 == r3) goto L43
            if (r7 != r2) goto L41
            goto L43
        L41:
            r7 = r4
            goto L44
        L43:
            r7 = r3
        L44:
            int r5 = r6.c
            if (r5 == r3) goto L4a
            if (r5 != r2) goto L4b
        L4a:
            r4 = r3
        L4b:
            if (r7 != r4) goto L89
            r7 = r1
            kotlinx.coroutines.internal.f r7 = (kotlinx.coroutines.internal.f) r7
            kotlinx.coroutines.CoroutineDispatcher r7 = r7.f20175d
            kotlin.coroutines.CoroutineContext r0 = r1.getContext()
            boolean r2 = r7.p()
            if (r2 == 0) goto L60
            r7.n(r0, r6)
            goto L8c
        L60:
            kotlinx.coroutines.n0 r7 = kotlinx.coroutines.o1.a()
            boolean r0 = r7.W()
            if (r0 == 0) goto L6e
            r7.x(r6)
            goto L8c
        L6e:
            r7.U(r3)
            kotlinx.coroutines.h0.a(r6, r1, r3)     // Catch: java.lang.Throwable -> L7b
        L74:
            boolean r0 = r7.Y()     // Catch: java.lang.Throwable -> L7b
            if (r0 != 0) goto L74
            goto L80
        L7b:
            r0 = move-exception
            r1 = 0
            r6.h(r0, r1)     // Catch: java.lang.Throwable -> L84
        L80:
            r7.v()
            goto L8c
        L84:
            r0 = move-exception
            r7.v()
            throw r0
        L89:
            kotlinx.coroutines.h0.a(r6, r1, r0)
        L8c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.h.q(int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
        if (r1 == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
        if (((kotlinx.coroutines.k0) kotlinx.coroutines.h.f20157h.get(r8)) != null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003b, code lost:
        t();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
        if (r0 == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
        y();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
        return kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
        if (r0 == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
        y();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:
        r0 = kotlinx.coroutines.h.f20156g.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0053, code lost:
        if ((r0 instanceof kotlinx.coroutines.p) != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0055, code lost:
        r1 = r8.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0057, code lost:
        if (r1 == 1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0059, code lost:
        if (r1 != 2) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005b, code lost:
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005c, code lost:
        if (r4 == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005e, code lost:
        r1 = (kotlinx.coroutines.y0) r8.f20159e.get(kotlinx.coroutines.y0.b.f20277a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0068, code lost:
        if (r1 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006e, code lost:
        if (r1.a() == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0071, code lost:
        r1 = r1.i();
        c(r0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0078, code lost:
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007d, code lost:
        return f(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0082, code lost:
        throw ((kotlinx.coroutines.p) r0).f20226a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r() {
        /*
            r8 = this;
            boolean r0 = r8.w()
        L4:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = kotlinx.coroutines.h.f20155f
            int r2 = r1.get(r8)
            int r3 = r2 >> 29
            r4 = 0
            r5 = 1
            r6 = 2
            if (r3 == 0) goto L21
            if (r3 != r6) goto L15
            r1 = r4
            goto L2f
        L15:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Already suspended"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L21:
            r3 = 536870911(0x1fffffff, float:1.0842021E-19)
            r3 = r3 & r2
            r7 = 536870912(0x20000000, float:1.0842022E-19)
            int r3 = r3 + r7
            boolean r1 = r1.compareAndSet(r8, r2, r3)
            if (r1 == 0) goto L4
            r1 = r5
        L2f:
            if (r1 == 0) goto L46
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.h.f20157h
            java.lang.Object r1 = r1.get(r8)
            kotlinx.coroutines.k0 r1 = (kotlinx.coroutines.k0) r1
            if (r1 != 0) goto L3e
            r8.t()
        L3e:
            if (r0 == 0) goto L43
            r8.y()
        L43:
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            return r0
        L46:
            if (r0 == 0) goto L4b
            r8.y()
        L4b:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.h.f20156g
            java.lang.Object r0 = r0.get(r8)
            boolean r1 = r0 instanceof kotlinx.coroutines.p
            if (r1 != 0) goto L7e
            int r1 = r8.c
            if (r1 == r5) goto L5b
            if (r1 != r6) goto L5c
        L5b:
            r4 = r5
        L5c:
            if (r4 == 0) goto L79
            kotlinx.coroutines.y0$b r1 = kotlinx.coroutines.y0.b.f20277a
            kotlin.coroutines.CoroutineContext r2 = r8.f20159e
            kotlin.coroutines.CoroutineContext$a r1 = r2.get(r1)
            kotlinx.coroutines.y0 r1 = (kotlinx.coroutines.y0) r1
            if (r1 == 0) goto L79
            boolean r2 = r1.a()
            if (r2 == 0) goto L71
            goto L79
        L71:
            java.util.concurrent.CancellationException r1 = r1.i()
            r8.c(r0, r1)
            throw r1
        L79:
            java.lang.Object r0 = r8.f(r0)
            return r0
        L7e:
            kotlinx.coroutines.p r0 = (kotlinx.coroutines.p) r0
            java.lang.Throwable r0 = r0.f20226a
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.h.r():java.lang.Object");
    }

    @Override // kotlin.coroutines.c
    public final void resumeWith(Object obj) {
        Throwable m16exceptionOrNullimpl = Result.m16exceptionOrNullimpl(obj);
        if (m16exceptionOrNullimpl != null) {
            obj = new p(false, m16exceptionOrNullimpl);
        }
        B(obj, this.c, null);
    }

    public final void s() {
        k0 t4 = t();
        if (t4 != null && (!(f20156g.get(this) instanceof i1))) {
            t4.dispose();
            f20157h.set(this, h1.f20160a);
        }
    }

    public final k0 t() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        y0 y0Var = (y0) this.f20159e.get(y0.b.f20277a);
        if (y0Var == null) {
            return null;
        }
        k0 a10 = y0.a.a(y0Var, true, new j(this), 2);
        do {
            atomicReferenceFieldUpdater = f20157h;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, a10)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return a10;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("CancellableContinuation(");
        sb2.append(y.c(this.f20158d));
        sb2.append("){");
        Object obj = f20156g.get(this);
        if (obj instanceof i1) {
            str = "Active";
        } else if (obj instanceof i) {
            str = "Cancelled";
        } else {
            str = "Completed";
        }
        sb2.append(str);
        sb2.append("}@");
        sb2.append(y.b(this));
        return sb2.toString();
    }

    public final void u(cg.l<? super Throwable, tf.d> lVar) {
        e v0Var;
        if (lVar instanceof e) {
            v0Var = (e) lVar;
        } else {
            v0Var = new v0(lVar);
        }
        v(v0Var);
    }

    public final void v(Object obj) {
        boolean z10;
        boolean z11;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20156g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            boolean z12 = true;
            if (obj2 instanceof b) {
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, obj)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            z12 = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (z12) {
                    return;
                }
            } else {
                if (obj2 instanceof e) {
                    z10 = true;
                } else {
                    z10 = obj2 instanceof kotlinx.coroutines.internal.q;
                }
                Throwable th2 = null;
                if (!z10) {
                    boolean z13 = obj2 instanceof p;
                    if (z13) {
                        p pVar = (p) obj2;
                        pVar.getClass();
                        if (p.f20225b.compareAndSet(pVar, 0, 1)) {
                            if (obj2 instanceof i) {
                                if (!z13) {
                                    pVar = null;
                                }
                                if (pVar != null) {
                                    th2 = pVar.f20226a;
                                }
                                if (obj instanceof e) {
                                    j((e) obj, th2);
                                    return;
                                }
                                kotlin.jvm.internal.g.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                                m((kotlinx.coroutines.internal.q) obj, th2);
                                return;
                            }
                            return;
                        }
                        x(obj, obj2);
                        throw null;
                    } else if (obj2 instanceof o) {
                        o oVar = (o) obj2;
                        if (oVar.f20215b == null) {
                            if (obj instanceof kotlinx.coroutines.internal.q) {
                                return;
                            }
                            kotlin.jvm.internal.g.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                            e eVar = (e) obj;
                            Throwable th3 = oVar.f20217e;
                            if (th3 != null) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (z11) {
                                j(eVar, th3);
                                return;
                            }
                            o a10 = o.a(oVar, eVar, null, 29);
                            while (true) {
                                if (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, a10)) {
                                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                                        z12 = false;
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            if (z12) {
                                return;
                            }
                        } else {
                            x(obj, obj2);
                            throw null;
                        }
                    } else if (obj instanceof kotlinx.coroutines.internal.q) {
                        return;
                    } else {
                        kotlin.jvm.internal.g.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                        o oVar2 = new o(obj2, (e) obj, (cg.l) null, (CancellationException) null, 28);
                        while (true) {
                            if (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, oVar2)) {
                                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                                    z12 = false;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        if (z12) {
                            return;
                        }
                    }
                } else {
                    x(obj, obj2);
                    throw null;
                }
            }
        }
    }

    public final boolean w() {
        boolean z10;
        boolean z11;
        if (this.c == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            kotlin.coroutines.c<T> cVar = this.f20158d;
            kotlin.jvm.internal.g.c(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (kotlinx.coroutines.internal.f.f20174h.get((kotlinx.coroutines.internal.f) cVar) != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0041, code lost:
        if (r2 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0044, code lost:
        p();
        n(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004a, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0027, code lost:
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:?, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void y() {
        /*
            r7 = this;
            kotlin.coroutines.c<T> r0 = r7.f20158d
            boolean r1 = r0 instanceof kotlinx.coroutines.internal.f
            r2 = 0
            if (r1 == 0) goto La
            kotlinx.coroutines.internal.f r0 = (kotlinx.coroutines.internal.f) r0
            goto Lb
        La:
            r0 = r2
        Lb:
            if (r0 == 0) goto L6f
        Ld:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.internal.f.f20174h
            java.lang.Object r3 = r1.get(r0)
            com.android.billingclient.api.a0 r4 = ge.a.f17757h
            r5 = 0
            r6 = 1
            if (r3 != r4) goto L2a
        L19:
            boolean r3 = r1.compareAndSet(r0, r4, r7)
            if (r3 == 0) goto L21
            r5 = r6
            goto L27
        L21:
            java.lang.Object r3 = r1.get(r0)
            if (r3 == r4) goto L19
        L27:
            if (r5 == 0) goto Ld
            goto L41
        L2a:
            boolean r4 = r3 instanceof java.lang.Throwable
            if (r4 == 0) goto L57
        L2e:
            boolean r4 = r1.compareAndSet(r0, r3, r2)
            if (r4 == 0) goto L36
            r5 = r6
            goto L3c
        L36:
            java.lang.Object r4 = r1.get(r0)
            if (r4 == r3) goto L2e
        L3c:
            if (r5 == 0) goto L4b
            r2 = r3
            java.lang.Throwable r2 = (java.lang.Throwable) r2
        L41:
            if (r2 != 0) goto L44
            goto L6f
        L44:
            r7.p()
            r7.n(r2)
            return
        L4b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Failed requirement."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L57:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Inconsistent state "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L6f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.h.y():void");
    }

    @Override // kotlinx.coroutines.g
    public final void z(CoroutineDispatcher coroutineDispatcher, tf.d dVar) {
        kotlinx.coroutines.internal.f fVar;
        CoroutineDispatcher coroutineDispatcher2;
        int i10;
        kotlin.coroutines.c<T> cVar = this.f20158d;
        if (cVar instanceof kotlinx.coroutines.internal.f) {
            fVar = (kotlinx.coroutines.internal.f) cVar;
        } else {
            fVar = null;
        }
        if (fVar != null) {
            coroutineDispatcher2 = fVar.f20175d;
        } else {
            coroutineDispatcher2 = null;
        }
        if (coroutineDispatcher2 == coroutineDispatcher) {
            i10 = 4;
        } else {
            i10 = this.c;
        }
        B(dVar, i10, null);
    }
}

package kotlinx.coroutines;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import kotlinx.coroutines.y0;

/* compiled from: JobSupport.kt */
/* loaded from: classes.dex */
public class c1 implements y0, m, j1 {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f19991a = AtomicReferenceFieldUpdater.newUpdater(c1.class, Object.class, "_state");

    /* renamed from: b  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f19992b = AtomicReferenceFieldUpdater.newUpdater(c1.class, Object.class, "_parentHandle");
    private volatile Object _parentHandle;
    private volatile Object _state;

    /* compiled from: JobSupport.kt */
    /* loaded from: classes.dex */
    public static final class a extends b1 {

        /* renamed from: e  reason: collision with root package name */
        public final c1 f19993e;

        /* renamed from: f  reason: collision with root package name */
        public final b f19994f;

        /* renamed from: g  reason: collision with root package name */
        public final l f19995g;

        /* renamed from: h  reason: collision with root package name */
        public final Object f19996h;

        public a(c1 c1Var, b bVar, l lVar, Object obj) {
            this.f19993e = c1Var;
            this.f19994f = bVar;
            this.f19995g = lVar;
            this.f19996h = obj;
        }

        @Override // cg.l
        public final /* bridge */ /* synthetic */ tf.d invoke(Throwable th2) {
            j(th2);
            return tf.d.f30009a;
        }

        @Override // kotlinx.coroutines.r
        public final void j(Throwable th2) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c1.f19991a;
            c1 c1Var = this.f19993e;
            c1Var.getClass();
            l b02 = c1.b0(this.f19995g);
            b bVar = this.f19994f;
            Object obj = this.f19996h;
            if (b02 == null || !c1Var.j0(bVar, b02, obj)) {
                c1Var.C(c1Var.L(bVar, obj));
            }
        }
    }

    /* compiled from: JobSupport.kt */
    /* loaded from: classes.dex */
    public static final class b implements t0 {

        /* renamed from: b  reason: collision with root package name */
        public static final AtomicIntegerFieldUpdater f19997b = AtomicIntegerFieldUpdater.newUpdater(b.class, "_isCompleting");
        public static final AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_rootCause");

        /* renamed from: d  reason: collision with root package name */
        public static final AtomicReferenceFieldUpdater f19998d = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_exceptionsHolder");
        private volatile Object _exceptionsHolder;
        private volatile int _isCompleting = 0;
        private volatile Object _rootCause;

        /* renamed from: a  reason: collision with root package name */
        public final g1 f19999a;

        public b(g1 g1Var, Throwable th2) {
            this.f19999a = g1Var;
            this._rootCause = th2;
        }

        @Override // kotlinx.coroutines.t0
        public final boolean a() {
            if (d() == null) {
                return true;
            }
            return false;
        }

        public final void b(Throwable th2) {
            Throwable d10 = d();
            if (d10 == null) {
                c.set(this, th2);
            } else if (th2 == d10) {
            } else {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19998d;
                Object obj = atomicReferenceFieldUpdater.get(this);
                if (obj == null) {
                    atomicReferenceFieldUpdater.set(this, th2);
                } else if (obj instanceof Throwable) {
                    if (th2 == obj) {
                        return;
                    }
                    ArrayList arrayList = new ArrayList(4);
                    arrayList.add(obj);
                    arrayList.add(th2);
                    atomicReferenceFieldUpdater.set(this, arrayList);
                } else if (obj instanceof ArrayList) {
                    ((ArrayList) obj).add(th2);
                } else {
                    throw new IllegalStateException(("State is " + obj).toString());
                }
            }
        }

        @Override // kotlinx.coroutines.t0
        public final g1 c() {
            return this.f19999a;
        }

        public final Throwable d() {
            return (Throwable) c.get(this);
        }

        public final boolean e() {
            if (d() != null) {
                return true;
            }
            return false;
        }

        public final boolean f() {
            if (f19997b.get(this) != 0) {
                return true;
            }
            return false;
        }

        public final ArrayList g(Throwable th2) {
            ArrayList arrayList;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19998d;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                arrayList = new ArrayList(4);
            } else if (obj instanceof Throwable) {
                ArrayList arrayList2 = new ArrayList(4);
                arrayList2.add(obj);
                arrayList = arrayList2;
            } else if (obj instanceof ArrayList) {
                arrayList = (ArrayList) obj;
            } else {
                throw new IllegalStateException(("State is " + obj).toString());
            }
            Throwable d10 = d();
            if (d10 != null) {
                arrayList.add(0, d10);
            }
            if (th2 != null && !kotlin.jvm.internal.g.a(th2, d10)) {
                arrayList.add(th2);
            }
            atomicReferenceFieldUpdater.set(this, aj.b.f565m);
            return arrayList;
        }

        public final String toString() {
            return "Finishing[cancelling=" + e() + ", completing=" + f() + ", rootCause=" + d() + ", exceptions=" + f19998d.get(this) + ", list=" + this.f19999a + ']';
        }
    }

    /* compiled from: LockFreeLinkedList.kt */
    /* loaded from: classes.dex */
    public static final class c extends LockFreeLinkedListNode.a {

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ c1 f20000d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ Object f20001e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(LockFreeLinkedListNode lockFreeLinkedListNode, c1 c1Var, Object obj) {
            super(lockFreeLinkedListNode);
            this.f20000d = c1Var;
            this.f20001e = obj;
        }

        @Override // kotlinx.coroutines.internal.a
        public final com.android.billingclient.api.a0 c(Object obj) {
            boolean z10;
            LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) obj;
            if (this.f20000d.S() == this.f20001e) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return null;
            }
            return ea.a.f16521f;
        }
    }

    public c1(boolean z10) {
        m0 m0Var;
        if (z10) {
            m0Var = aj.b.f567o;
        } else {
            m0Var = aj.b.f566n;
        }
        this._state = m0Var;
    }

    public static l b0(LockFreeLinkedListNode lockFreeLinkedListNode) {
        while (lockFreeLinkedListNode.i()) {
            lockFreeLinkedListNode = lockFreeLinkedListNode.h();
        }
        while (true) {
            lockFreeLinkedListNode = lockFreeLinkedListNode.g();
            if (!lockFreeLinkedListNode.i()) {
                if (lockFreeLinkedListNode instanceof l) {
                    return (l) lockFreeLinkedListNode;
                }
                if (lockFreeLinkedListNode instanceof g1) {
                    return null;
                }
            }
        }
    }

    public static String h0(Object obj) {
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (bVar.e()) {
                return "Cancelling";
            }
            if (bVar.f()) {
                return "Completing";
            }
        } else if (obj instanceof t0) {
            if (!((t0) obj).a()) {
                return "New";
            }
        } else if (obj instanceof p) {
            return "Cancelled";
        } else {
            return "Completed";
        }
        return "Active";
    }

    public final boolean B(Object obj, g1 g1Var, b1 b1Var) {
        boolean z10;
        boolean z11;
        c cVar = new c(b1Var, this, obj);
        do {
            LockFreeLinkedListNode h10 = g1Var.h();
            LockFreeLinkedListNode.f20163b.lazySet(b1Var, h10);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LockFreeLinkedListNode.f20162a;
            atomicReferenceFieldUpdater.lazySet(b1Var, g1Var);
            cVar.c = g1Var;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(h10, g1Var, cVar)) {
                    z10 = true;
                    break;
                } else if (atomicReferenceFieldUpdater.get(h10) != g1Var) {
                    z10 = false;
                    break;
                }
            }
            if (!z10) {
                z11 = false;
            } else if (cVar.a(h10) == null) {
                z11 = true;
            } else {
                z11 = true;
            }
            if (z11) {
                return true;
            }
        } while (!z11);
        return false;
    }

    public void D(Object obj) {
        C(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x00fd, code lost:
        r0 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x003f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00cd A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean E(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.c1.E(java.lang.Object):boolean");
    }

    public void F(CancellationException cancellationException) {
        E(cancellationException);
    }

    public final boolean G(Throwable th2) {
        if (Y()) {
            return true;
        }
        boolean z10 = th2 instanceof CancellationException;
        k kVar = (k) f19992b.get(this);
        if (kVar != null && kVar != h1.f20160a) {
            if (kVar.b(th2) || z10) {
                return true;
            }
            return false;
        }
        return z10;
    }

    public String H() {
        return "Job was cancelled";
    }

    public boolean I(Throwable th2) {
        if (th2 instanceof CancellationException) {
            return true;
        }
        if (E(th2) && N()) {
            return true;
        }
        return false;
    }

    public final void J(t0 t0Var, Object obj) {
        p pVar;
        Throwable th2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19992b;
        k kVar = (k) atomicReferenceFieldUpdater.get(this);
        if (kVar != null) {
            kVar.dispose();
            atomicReferenceFieldUpdater.set(this, h1.f20160a);
        }
        CompletionHandlerException completionHandlerException = null;
        if (obj instanceof p) {
            pVar = (p) obj;
        } else {
            pVar = null;
        }
        if (pVar != null) {
            th2 = pVar.f20226a;
        } else {
            th2 = null;
        }
        if (t0Var instanceof b1) {
            try {
                ((b1) t0Var).j(th2);
                return;
            } catch (Throwable th3) {
                V(new CompletionHandlerException("Exception in completion handler " + t0Var + " for " + this, th3));
                return;
            }
        }
        g1 c10 = t0Var.c();
        if (c10 != null) {
            Object f10 = c10.f();
            kotlin.jvm.internal.g.c(f10, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            for (LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) f10; !kotlin.jvm.internal.g.a(lockFreeLinkedListNode, c10); lockFreeLinkedListNode = lockFreeLinkedListNode.g()) {
                if (lockFreeLinkedListNode instanceof b1) {
                    b1 b1Var = (b1) lockFreeLinkedListNode;
                    try {
                        b1Var.j(th2);
                    } catch (Throwable th4) {
                        if (completionHandlerException != null) {
                            com.google.android.play.core.assetpacks.b1.n(completionHandlerException, th4);
                        } else {
                            completionHandlerException = new CompletionHandlerException("Exception in completion handler " + b1Var + " for " + this, th4);
                            tf.d dVar = tf.d.f30009a;
                        }
                    }
                }
            }
            if (completionHandlerException != null) {
                V(completionHandlerException);
            }
        }
    }

    public final Throwable K(Object obj) {
        boolean z10;
        if (obj == null) {
            z10 = true;
        } else {
            z10 = obj instanceof Throwable;
        }
        if (z10) {
            Throwable th2 = (Throwable) obj;
            if (th2 == null) {
                return new JobCancellationException(H(), null, this);
            }
            return th2;
        }
        kotlin.jvm.internal.g.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((j1) obj).t();
    }

    public final Object L(b bVar, Object obj) {
        p pVar;
        Throwable M;
        Object obj2;
        boolean z10;
        Throwable th2 = null;
        if (obj instanceof p) {
            pVar = (p) obj;
        } else {
            pVar = null;
        }
        if (pVar != null) {
            th2 = pVar.f20226a;
        }
        synchronized (bVar) {
            bVar.e();
            ArrayList<Throwable> g10 = bVar.g(th2);
            M = M(bVar, g10);
            if (M != null && g10.size() > 1) {
                Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(g10.size()));
                for (Throwable th3 : g10) {
                    if (th3 != M && th3 != M && !(th3 instanceof CancellationException) && newSetFromMap.add(th3)) {
                        com.google.android.play.core.assetpacks.b1.n(M, th3);
                    }
                }
            }
        }
        if (M != null && M != th2) {
            obj = new p(false, M);
        }
        if (M != null) {
            if (!G(M) && !U(M)) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                kotlin.jvm.internal.g.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                p.f20225b.compareAndSet((p) obj, 0, 1);
            }
        }
        d0(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19991a;
        if (obj instanceof t0) {
            obj2 = new u0((t0) obj);
        } else {
            obj2 = obj;
        }
        while (!atomicReferenceFieldUpdater.compareAndSet(this, bVar, obj2) && atomicReferenceFieldUpdater.get(this) == bVar) {
        }
        J(bVar, obj);
        return obj;
    }

    public final Throwable M(b bVar, ArrayList arrayList) {
        Object obj;
        boolean z10;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (!bVar.e()) {
                return null;
            }
            return new JobCancellationException(H(), null, this);
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (!(((Throwable) obj) instanceof CancellationException)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Throwable th2 = (Throwable) obj;
        if (th2 != null) {
            return th2;
        }
        Throwable th3 = (Throwable) arrayList.get(0);
        if (th3 instanceof TimeoutCancellationException) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                Throwable th4 = (Throwable) next;
                if (th4 != th3 && (th4 instanceof TimeoutCancellationException)) {
                    z10 = true;
                    continue;
                } else {
                    z10 = false;
                    continue;
                }
                if (z10) {
                    obj2 = next;
                    break;
                }
            }
            Throwable th5 = (Throwable) obj2;
            if (th5 != null) {
                return th5;
            }
        }
        return th3;
    }

    public boolean N() {
        return true;
    }

    public boolean O() {
        return false;
    }

    public final g1 P(t0 t0Var) {
        g1 c10 = t0Var.c();
        if (c10 == null) {
            if (t0Var instanceof m0) {
                return new g1();
            }
            if (t0Var instanceof b1) {
                f0((b1) t0Var);
                return null;
            }
            throw new IllegalStateException(("State should have list: " + t0Var).toString());
        }
        return c10;
    }

    public final Object S() {
        while (true) {
            Object obj = f19991a.get(this);
            if (!(obj instanceof kotlinx.coroutines.internal.m)) {
                return obj;
            }
            ((kotlinx.coroutines.internal.m) obj).a(this);
        }
    }

    public boolean U(Throwable th2) {
        return false;
    }

    public final void W(y0 y0Var) {
        h1 h1Var = h1.f20160a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19992b;
        if (y0Var == null) {
            atomicReferenceFieldUpdater.set(this, h1Var);
            return;
        }
        y0Var.start();
        k k10 = y0Var.k(this);
        atomicReferenceFieldUpdater.set(this, k10);
        if (u()) {
            k10.dispose();
            atomicReferenceFieldUpdater.set(this, h1Var);
        }
    }

    public final k0 X(cg.l<? super Throwable, tf.d> lVar) {
        return r(false, true, lVar);
    }

    public boolean Y() {
        return false;
    }

    public final Object Z(Object obj) {
        Object i02;
        p pVar;
        do {
            i02 = i0(S(), obj);
            if (i02 == aj.b.f561i) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                Throwable th2 = null;
                if (obj instanceof p) {
                    pVar = (p) obj;
                } else {
                    pVar = null;
                }
                if (pVar != null) {
                    th2 = pVar.f20226a;
                }
                throw new IllegalStateException(str, th2);
            }
        } while (i02 == aj.b.f563k);
        return i02;
    }

    @Override // kotlinx.coroutines.y0
    public boolean a() {
        Object S = S();
        if ((S instanceof t0) && ((t0) S).a()) {
            return true;
        }
        return false;
    }

    public String a0() {
        return getClass().getSimpleName();
    }

    @Override // kotlinx.coroutines.y0
    public void b(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(H(), null, this);
        }
        F(cancellationException);
    }

    public final void c0(g1 g1Var, Throwable th2) {
        Object f10 = g1Var.f();
        kotlin.jvm.internal.g.c(f10, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        CompletionHandlerException completionHandlerException = null;
        for (LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) f10; !kotlin.jvm.internal.g.a(lockFreeLinkedListNode, g1Var); lockFreeLinkedListNode = lockFreeLinkedListNode.g()) {
            if (lockFreeLinkedListNode instanceof z0) {
                b1 b1Var = (b1) lockFreeLinkedListNode;
                try {
                    b1Var.j(th2);
                } catch (Throwable th3) {
                    if (completionHandlerException != null) {
                        com.google.android.play.core.assetpacks.b1.n(completionHandlerException, th3);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + b1Var + " for " + this, th3);
                        tf.d dVar = tf.d.f30009a;
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            V(completionHandlerException);
        }
        G(th2);
    }

    public final void f0(b1 b1Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        boolean z10;
        g1 g1Var = new g1();
        b1Var.getClass();
        LockFreeLinkedListNode.f20163b.lazySet(g1Var, b1Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = LockFreeLinkedListNode.f20162a;
        atomicReferenceFieldUpdater2.lazySet(g1Var, b1Var);
        while (true) {
            if (b1Var.f() == b1Var) {
                while (true) {
                    if (atomicReferenceFieldUpdater2.compareAndSet(b1Var, b1Var, g1Var)) {
                        z10 = true;
                        continue;
                        break;
                    } else if (atomicReferenceFieldUpdater2.get(b1Var) != b1Var) {
                        z10 = false;
                        continue;
                        break;
                    }
                }
                if (z10) {
                    g1Var.e(b1Var);
                    break;
                }
            } else {
                break;
            }
        }
        LockFreeLinkedListNode g10 = b1Var.g();
        do {
            atomicReferenceFieldUpdater = f19991a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, b1Var, g10)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == b1Var);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final <R> R fold(R r4, cg.p<? super R, ? super CoroutineContext.a, ? extends R> operation) {
        kotlin.jvm.internal.g.e(operation, "operation");
        return operation.invoke(r4, this);
    }

    public final int g0(Object obj) {
        boolean z10 = obj instanceof m0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19991a;
        boolean z11 = false;
        if (z10) {
            if (((m0) obj).f20211a) {
                return 0;
            }
            m0 m0Var = aj.b.f567o;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, m0Var)) {
                    z11 = true;
                    break;
                } else if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            if (!z11) {
                return -1;
            }
            e0();
            return 1;
        } else if (!(obj instanceof s0)) {
            return 0;
        } else {
            g1 g1Var = ((s0) obj).f20231a;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, g1Var)) {
                    z11 = true;
                    break;
                } else if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            if (!z11) {
                return -1;
            }
            e0();
            return 1;
        }
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final <E extends CoroutineContext.a> E get(CoroutineContext.b<E> bVar) {
        return (E) CoroutineContext.a.C0271a.a(this, bVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.a
    public final CoroutineContext.b<?> getKey() {
        return y0.b.f20277a;
    }

    @Override // kotlinx.coroutines.y0
    public final y0 getParent() {
        k kVar = (k) f19992b.get(this);
        if (kVar != null) {
            return kVar.getParent();
        }
        return null;
    }

    @Override // kotlinx.coroutines.y0
    public final Object h(kotlin.coroutines.c<? super tf.d> cVar) {
        boolean z10;
        while (true) {
            Object S = S();
            if (!(S instanceof t0)) {
                z10 = false;
                break;
            } else if (g0(S) >= 0) {
                z10 = true;
                break;
            }
        }
        if (!z10) {
            b.b.s(cVar.getContext());
            return tf.d.f30009a;
        }
        h hVar = new h(1, com.google.android.play.core.assetpacks.b1.L(cVar));
        hVar.s();
        hVar.u(new l0(X(new k1(hVar))));
        Object r4 = hVar.r();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (r4 != coroutineSingletons) {
            r4 = tf.d.f30009a;
        }
        if (r4 == coroutineSingletons) {
            return r4;
        }
        return tf.d.f30009a;
    }

    @Override // kotlinx.coroutines.y0
    public final CancellationException i() {
        Object S = S();
        CancellationException cancellationException = null;
        if (S instanceof b) {
            Throwable d10 = ((b) S).d();
            if (d10 != null) {
                String concat = getClass().getSimpleName().concat(" is cancelling");
                if (d10 instanceof CancellationException) {
                    cancellationException = (CancellationException) d10;
                }
                if (cancellationException == null) {
                    if (concat == null) {
                        concat = H();
                    }
                    return new JobCancellationException(concat, d10, this);
                }
                return cancellationException;
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        } else if (!(S instanceof t0)) {
            if (S instanceof p) {
                Throwable th2 = ((p) S).f20226a;
                if (th2 instanceof CancellationException) {
                    cancellationException = (CancellationException) th2;
                }
                if (cancellationException == null) {
                    return new JobCancellationException(H(), th2, this);
                }
                return cancellationException;
            }
            return new JobCancellationException(getClass().getSimpleName().concat(" has completed normally"), null, this);
        } else {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Throwable, T] */
    public final Object i0(Object obj, Object obj2) {
        u0 u0Var;
        boolean z10;
        b bVar;
        p pVar;
        l lVar;
        if (!(obj instanceof t0)) {
            return aj.b.f561i;
        }
        boolean z11 = true;
        boolean z12 = false;
        if (((obj instanceof m0) || (obj instanceof b1)) && !(obj instanceof l) && !(obj2 instanceof p)) {
            t0 t0Var = (t0) obj;
            if (obj2 instanceof t0) {
                u0Var = new u0((t0) obj2);
            } else {
                u0Var = obj2;
            }
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19991a;
                if (atomicReferenceFieldUpdater.compareAndSet(this, t0Var, u0Var)) {
                    z10 = true;
                    break;
                } else if (atomicReferenceFieldUpdater.get(this) != t0Var) {
                    z10 = false;
                    break;
                }
            }
            if (!z10) {
                z11 = false;
            } else {
                d0(obj2);
                J(t0Var, obj2);
            }
            if (z11) {
                return obj2;
            }
            return aj.b.f563k;
        }
        t0 t0Var2 = (t0) obj;
        g1 P = P(t0Var2);
        if (P == null) {
            return aj.b.f563k;
        }
        l lVar2 = null;
        if (t0Var2 instanceof b) {
            bVar = (b) t0Var2;
        } else {
            bVar = null;
        }
        if (bVar == null) {
            bVar = new b(P, null);
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        synchronized (bVar) {
            if (bVar.f()) {
                return aj.b.f561i;
            }
            b.f19997b.set(bVar, 1);
            if (bVar != t0Var2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f19991a;
                while (true) {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, t0Var2, bVar)) {
                        z12 = true;
                        break;
                    } else if (atomicReferenceFieldUpdater2.get(this) != t0Var2) {
                        break;
                    }
                }
                if (!z12) {
                    return aj.b.f563k;
                }
            }
            boolean e10 = bVar.e();
            if (obj2 instanceof p) {
                pVar = (p) obj2;
            } else {
                pVar = null;
            }
            if (pVar != null) {
                bVar.b(pVar.f20226a);
            }
            ?? d10 = Boolean.valueOf(true ^ e10).booleanValue() ? bVar.d() : 0;
            ref$ObjectRef.element = d10;
            tf.d dVar = tf.d.f30009a;
            if (d10 != 0) {
                c0(P, d10);
            }
            if (t0Var2 instanceof l) {
                lVar = (l) t0Var2;
            } else {
                lVar = null;
            }
            if (lVar == null) {
                g1 c10 = t0Var2.c();
                if (c10 != null) {
                    lVar2 = b0(c10);
                }
            } else {
                lVar2 = lVar;
            }
            if (lVar2 != null && j0(bVar, lVar2, obj2)) {
                return aj.b.f562j;
            }
            return L(bVar, obj2);
        }
    }

    @Override // kotlinx.coroutines.y0
    public final boolean isCancelled() {
        Object S = S();
        if (!(S instanceof p) && (!(S instanceof b) || !((b) S).e())) {
            return false;
        }
        return true;
    }

    public final boolean j0(b bVar, l lVar, Object obj) {
        while (y0.a.a(lVar.f20209e, false, new a(this, bVar, lVar, obj), 1) == h1.f20160a) {
            lVar = b0(lVar);
            if (lVar == null) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlinx.coroutines.y0
    public final k k(c1 c1Var) {
        k0 a10 = y0.a.a(this, true, new l(c1Var), 2);
        kotlin.jvm.internal.g.c(a10, "null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
        return (k) a10;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(CoroutineContext.b<?> bVar) {
        return CoroutineContext.a.C0271a.b(this, bVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext context) {
        kotlin.jvm.internal.g.e(context, "context");
        return CoroutineContext.DefaultImpls.a(this, context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [kotlinx.coroutines.s0] */
    @Override // kotlinx.coroutines.y0
    public final k0 r(boolean z10, boolean z11, cg.l<? super Throwable, tf.d> lVar) {
        b1 b1Var;
        boolean z12;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        p pVar;
        Throwable th2;
        Throwable th3 = null;
        if (z10) {
            if (lVar instanceof z0) {
                b1Var = (z0) lVar;
            } else {
                b1Var = null;
            }
            if (b1Var == null) {
                b1Var = new w0(lVar);
            }
        } else {
            if (lVar instanceof b1) {
                b1Var = (b1) lVar;
            } else {
                b1Var = null;
            }
            if (b1Var == null) {
                b1Var = new x0(lVar);
            }
        }
        b1Var.f19989d = this;
        while (true) {
            Object S = S();
            if (S instanceof m0) {
                m0 m0Var = (m0) S;
                if (m0Var.f20211a) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f19991a;
                    while (true) {
                        if (atomicReferenceFieldUpdater2.compareAndSet(this, S, b1Var)) {
                            z12 = true;
                            break;
                        } else if (atomicReferenceFieldUpdater2.get(this) != S) {
                            z12 = false;
                            break;
                        }
                    }
                    if (z12) {
                        return b1Var;
                    }
                } else {
                    g1 g1Var = new g1();
                    if (!m0Var.f20211a) {
                        g1Var = new s0(g1Var);
                    }
                    do {
                        atomicReferenceFieldUpdater = f19991a;
                        if (atomicReferenceFieldUpdater.compareAndSet(this, m0Var, g1Var)) {
                            break;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == m0Var);
                }
            } else if (S instanceof t0) {
                g1 c10 = ((t0) S).c();
                if (c10 == null) {
                    kotlin.jvm.internal.g.c(S, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    f0((b1) S);
                } else {
                    k0 k0Var = h1.f20160a;
                    if (z10 && (S instanceof b)) {
                        synchronized (S) {
                            th2 = ((b) S).d();
                            if (th2 == null || ((lVar instanceof l) && !((b) S).f())) {
                                if (B(S, c10, b1Var)) {
                                    if (th2 == null) {
                                        return b1Var;
                                    }
                                    k0Var = b1Var;
                                }
                            }
                            tf.d dVar = tf.d.f30009a;
                        }
                    } else {
                        th2 = null;
                    }
                    if (th2 != null) {
                        if (z11) {
                            lVar.invoke(th2);
                        }
                        return k0Var;
                    } else if (B(S, c10, b1Var)) {
                        return b1Var;
                    }
                }
            } else {
                if (z11) {
                    if (S instanceof p) {
                        pVar = (p) S;
                    } else {
                        pVar = null;
                    }
                    if (pVar != null) {
                        th3 = pVar.f20226a;
                    }
                    lVar.invoke(th3);
                }
                return h1.f20160a;
            }
        }
    }

    @Override // kotlinx.coroutines.y0
    public final boolean start() {
        int g02;
        do {
            g02 = g0(S());
            if (g02 == 0) {
                return false;
            }
        } while (g02 != 1);
        return true;
    }

    @Override // kotlinx.coroutines.j1
    public final CancellationException t() {
        Throwable th2;
        Object S = S();
        CancellationException cancellationException = null;
        if (S instanceof b) {
            th2 = ((b) S).d();
        } else if (S instanceof p) {
            th2 = ((p) S).f20226a;
        } else if (!(S instanceof t0)) {
            th2 = null;
        } else {
            throw new IllegalStateException(("Cannot be cancelling child in this state: " + S).toString());
        }
        if (th2 instanceof CancellationException) {
            cancellationException = th2;
        }
        if (cancellationException == null) {
            return new JobCancellationException("Parent job is ".concat(h0(S)), th2, this);
        }
        return cancellationException;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(a0() + '{' + h0(S()) + '}');
        sb2.append('@');
        sb2.append(y.b(this));
        return sb2.toString();
    }

    @Override // kotlinx.coroutines.y0
    public final boolean u() {
        return !(S() instanceof t0);
    }

    @Override // kotlinx.coroutines.m
    public final void w(c1 c1Var) {
        E(c1Var);
    }

    public void e0() {
    }

    public void C(Object obj) {
    }

    public void V(CompletionHandlerException completionHandlerException) {
        throw completionHandlerException;
    }

    public void d0(Object obj) {
    }
}

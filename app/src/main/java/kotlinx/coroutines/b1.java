package kotlinx.coroutines;

/* compiled from: JobSupport.kt */
/* loaded from: classes.dex */
public abstract class b1 extends r implements k0, t0 {

    /* renamed from: d  reason: collision with root package name */
    public c1 f19989d;

    @Override // kotlinx.coroutines.t0
    public final boolean a() {
        return true;
    }

    @Override // kotlinx.coroutines.t0
    public final g1 c() {
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0024, code lost:
        continue;
     */
    @Override // kotlinx.coroutines.k0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void dispose() {
        /*
            r7 = this;
            kotlinx.coroutines.c1 r0 = r7.k()
        L4:
            java.lang.Object r1 = r0.S()
            boolean r2 = r1 instanceof kotlinx.coroutines.b1
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L27
            if (r1 == r7) goto L12
            goto L75
        L12:
            kotlinx.coroutines.m0 r2 = aj.b.f567o
        L14:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = kotlinx.coroutines.c1.f19991a
            boolean r6 = r5.compareAndSet(r0, r1, r2)
            if (r6 == 0) goto L1e
            r3 = r4
            goto L24
        L1e:
            java.lang.Object r5 = r5.get(r0)
            if (r5 == r1) goto L14
        L24:
            if (r3 == 0) goto L4
            goto L75
        L27:
            boolean r0 = r1 instanceof kotlinx.coroutines.t0
            if (r0 == 0) goto L75
            kotlinx.coroutines.t0 r1 = (kotlinx.coroutines.t0) r1
            kotlinx.coroutines.g1 r0 = r1.c()
            if (r0 == 0) goto L75
        L33:
            java.lang.Object r0 = r7.f()
            boolean r1 = r0 instanceof kotlinx.coroutines.internal.n
            if (r1 == 0) goto L40
            kotlinx.coroutines.internal.n r0 = (kotlinx.coroutines.internal.n) r0
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = r0.f20195a
            goto L75
        L40:
            if (r0 != r7) goto L45
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r0
            goto L75
        L45:
            java.lang.String r1 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            kotlin.jvm.internal.g.c(r0, r1)
            r1 = r0
            kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r1
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = kotlinx.coroutines.internal.LockFreeLinkedListNode.c
            java.lang.Object r5 = r2.get(r1)
            kotlinx.coroutines.internal.n r5 = (kotlinx.coroutines.internal.n) r5
            if (r5 != 0) goto L5f
            kotlinx.coroutines.internal.n r5 = new kotlinx.coroutines.internal.n
            r5.<init>(r1)
            r2.lazySet(r1, r5)
        L5f:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = kotlinx.coroutines.internal.LockFreeLinkedListNode.f20162a
            boolean r6 = r2.compareAndSet(r7, r0, r5)
            if (r6 == 0) goto L69
            r0 = r4
            goto L70
        L69:
            java.lang.Object r2 = r2.get(r7)
            if (r2 == r0) goto L5f
            r0 = r3
        L70:
            if (r0 == 0) goto L33
            r1.d()
        L75:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.b1.dispose():void");
    }

    public y0 getParent() {
        return k();
    }

    public final c1 k() {
        c1 c1Var = this.f19989d;
        if (c1Var != null) {
            return c1Var;
        }
        kotlin.jvm.internal.g.i("job");
        throw null;
    }

    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
    public final String toString() {
        return getClass().getSimpleName() + '@' + y.b(this) + "[job@" + y.b(k()) + ']';
    }
}

package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlinx.coroutines.y;

/* compiled from: LockFreeLinkedList.kt */
/* loaded from: classes.dex */
public class LockFreeLinkedListNode {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f20162a = AtomicReferenceFieldUpdater.newUpdater(LockFreeLinkedListNode.class, Object.class, "_next");

    /* renamed from: b  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f20163b = AtomicReferenceFieldUpdater.newUpdater(LockFreeLinkedListNode.class, Object.class, "_prev");
    public static final AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(LockFreeLinkedListNode.class, Object.class, "_removedRef");
    private volatile Object _next = this;
    private volatile Object _prev = this;
    private volatile Object _removedRef;

    /* compiled from: LockFreeLinkedList.kt */
    /* loaded from: classes.dex */
    public static abstract class a extends kotlinx.coroutines.internal.a<LockFreeLinkedListNode> {

        /* renamed from: b  reason: collision with root package name */
        public final LockFreeLinkedListNode f20164b;
        public LockFreeLinkedListNode c;

        public a(LockFreeLinkedListNode lockFreeLinkedListNode) {
            this.f20164b = lockFreeLinkedListNode;
        }

        @Override // kotlinx.coroutines.internal.a
        public final void b(LockFreeLinkedListNode lockFreeLinkedListNode, Object obj) {
            boolean z10;
            LockFreeLinkedListNode lockFreeLinkedListNode2;
            LockFreeLinkedListNode lockFreeLinkedListNode3 = lockFreeLinkedListNode;
            boolean z11 = true;
            if (obj == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            LockFreeLinkedListNode lockFreeLinkedListNode4 = this.f20164b;
            if (z10) {
                lockFreeLinkedListNode2 = lockFreeLinkedListNode4;
            } else {
                lockFreeLinkedListNode2 = this.c;
            }
            if (lockFreeLinkedListNode2 != null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LockFreeLinkedListNode.f20162a;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(lockFreeLinkedListNode3, this, lockFreeLinkedListNode2)) {
                        if (atomicReferenceFieldUpdater.get(lockFreeLinkedListNode3) != this) {
                            z11 = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (z11 && z10) {
                    LockFreeLinkedListNode lockFreeLinkedListNode5 = this.c;
                    kotlin.jvm.internal.g.b(lockFreeLinkedListNode5);
                    lockFreeLinkedListNode4.e(lockFreeLinkedListNode5);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0044, code lost:
        r6 = ((kotlinx.coroutines.internal.n) r6).f20195a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004c, code lost:
        if (r5.compareAndSet(r4, r2, r6) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004e, code lost:
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0054, code lost:
        if (r5.get(r4) == r2) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0056, code lost:
        if (r7 != false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final kotlinx.coroutines.internal.LockFreeLinkedListNode d() {
        /*
            r11 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.LockFreeLinkedListNode.f20163b
            java.lang.Object r1 = r0.get(r11)
            kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r1
            r2 = r1
        L9:
            r3 = 0
            r4 = r3
        Lb:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = kotlinx.coroutines.internal.LockFreeLinkedListNode.f20162a
            java.lang.Object r6 = r5.get(r2)
            r7 = 0
            r8 = 1
            if (r6 != r11) goto L2a
            if (r1 != r2) goto L18
            return r2
        L18:
            boolean r3 = r0.compareAndSet(r11, r1, r2)
            if (r3 == 0) goto L20
            r7 = r8
            goto L26
        L20:
            java.lang.Object r3 = r0.get(r11)
            if (r3 == r1) goto L18
        L26:
            if (r7 != 0) goto L29
            goto L0
        L29:
            return r2
        L2a:
            boolean r9 = r11.i()
            if (r9 == 0) goto L31
            return r3
        L31:
            if (r6 != 0) goto L34
            return r2
        L34:
            boolean r9 = r6 instanceof kotlinx.coroutines.internal.m
            if (r9 == 0) goto L3e
            kotlinx.coroutines.internal.m r6 = (kotlinx.coroutines.internal.m) r6
            r6.a(r2)
            goto L0
        L3e:
            boolean r9 = r6 instanceof kotlinx.coroutines.internal.n
            if (r9 == 0) goto L62
            if (r4 == 0) goto L5b
            kotlinx.coroutines.internal.n r6 = (kotlinx.coroutines.internal.n) r6
            kotlinx.coroutines.internal.LockFreeLinkedListNode r6 = r6.f20195a
        L48:
            boolean r3 = r5.compareAndSet(r4, r2, r6)
            if (r3 == 0) goto L50
            r7 = r8
            goto L56
        L50:
            java.lang.Object r3 = r5.get(r4)
            if (r3 == r2) goto L48
        L56:
            if (r7 != 0) goto L59
            goto L0
        L59:
            r2 = r4
            goto L9
        L5b:
            java.lang.Object r2 = r0.get(r2)
            kotlinx.coroutines.internal.LockFreeLinkedListNode r2 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r2
            goto Lb
        L62:
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            kotlin.jvm.internal.g.c(r6, r4)
            r4 = r6
            kotlinx.coroutines.internal.LockFreeLinkedListNode r4 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r4
            r10 = r4
            r4 = r2
            r2 = r10
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.LockFreeLinkedListNode.d():kotlinx.coroutines.internal.LockFreeLinkedListNode");
    }

    public final void e(LockFreeLinkedListNode lockFreeLinkedListNode) {
        boolean z10;
        do {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20163b;
            LockFreeLinkedListNode lockFreeLinkedListNode2 = (LockFreeLinkedListNode) atomicReferenceFieldUpdater.get(lockFreeLinkedListNode);
            if (f() == lockFreeLinkedListNode) {
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(lockFreeLinkedListNode, lockFreeLinkedListNode2, this)) {
                        z10 = true;
                        continue;
                        break;
                    } else if (atomicReferenceFieldUpdater.get(lockFreeLinkedListNode) != lockFreeLinkedListNode2) {
                        z10 = false;
                        continue;
                        break;
                    }
                }
            } else {
                return;
            }
        } while (!z10);
        if (i()) {
            lockFreeLinkedListNode.d();
        }
    }

    public final Object f() {
        while (true) {
            Object obj = f20162a.get(this);
            if (!(obj instanceof m)) {
                return obj;
            }
            ((m) obj).a(this);
        }
    }

    public final LockFreeLinkedListNode g() {
        n nVar;
        LockFreeLinkedListNode lockFreeLinkedListNode;
        Object f10 = f();
        if (f10 instanceof n) {
            nVar = (n) f10;
        } else {
            nVar = null;
        }
        if (nVar == null || (lockFreeLinkedListNode = nVar.f20195a) == null) {
            kotlin.jvm.internal.g.c(f10, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            return (LockFreeLinkedListNode) f10;
        }
        return lockFreeLinkedListNode;
    }

    public final LockFreeLinkedListNode h() {
        LockFreeLinkedListNode d10 = d();
        if (d10 == null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20163b;
            Object obj = atomicReferenceFieldUpdater.get(this);
            while (true) {
                d10 = (LockFreeLinkedListNode) obj;
                if (!d10.i()) {
                    break;
                }
                obj = atomicReferenceFieldUpdater.get(d10);
            }
        }
        return d10;
    }

    public boolean i() {
        return f() instanceof n;
    }

    public String toString() {
        return new PropertyReference0Impl(this) { // from class: kotlinx.coroutines.internal.LockFreeLinkedListNode$toString$1
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.jvm.internal.PropertyReference0
            public Object get() {
                return this.receiver.getClass().getSimpleName();
            }
        } + '@' + y.b(this);
    }
}

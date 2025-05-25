package kotlinx.coroutines;

import kotlin.Pair;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.internal.ThreadContextKt;

/* compiled from: CoroutineContext.kt */
/* loaded from: classes.dex */
public final class q1<T> extends kotlinx.coroutines.internal.p<T> {

    /* renamed from: e  reason: collision with root package name */
    public final ThreadLocal<Pair<CoroutineContext, Object>> f20229e;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public q1(kotlin.coroutines.c r3, kotlin.coroutines.CoroutineContext r4) {
        /*
            r2 = this;
            kotlinx.coroutines.r1 r0 = kotlinx.coroutines.r1.f20230a
            kotlin.coroutines.CoroutineContext$a r1 = r4.get(r0)
            if (r1 != 0) goto Ld
            kotlin.coroutines.CoroutineContext r0 = r4.plus(r0)
            goto Le
        Ld:
            r0 = r4
        Le:
            r2.<init>(r3, r0)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.f20229e = r0
            kotlin.coroutines.CoroutineContext r3 = r3.getContext()
            kotlin.coroutines.d$a r0 = kotlin.coroutines.d.a.f19936a
            kotlin.coroutines.CoroutineContext$a r3 = r3.get(r0)
            boolean r3 = r3 instanceof kotlinx.coroutines.CoroutineDispatcher
            if (r3 != 0) goto L31
            r3 = 0
            java.lang.Object r3 = kotlinx.coroutines.internal.ThreadContextKt.c(r4, r3)
            kotlinx.coroutines.internal.ThreadContextKt.a(r4, r3)
            r2.n0(r4, r3)
        L31:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.q1.<init>(kotlin.coroutines.c, kotlin.coroutines.CoroutineContext):void");
    }

    @Override // kotlinx.coroutines.internal.p, kotlinx.coroutines.c1
    public final void D(Object obj) {
        if (this.threadLocalIsSet) {
            Pair<CoroutineContext, Object> pair = this.f20229e.get();
            if (pair != null) {
                ThreadContextKt.a(pair.component1(), pair.component2());
            }
            this.f20229e.remove();
        }
        Object a10 = s.a(obj);
        kotlin.coroutines.c<T> cVar = this.f20196d;
        CoroutineContext context = cVar.getContext();
        q1<?> q1Var = null;
        Object c = ThreadContextKt.c(context, null);
        if (c != ThreadContextKt.f20165a) {
            q1Var = CoroutineContextKt.d(cVar, context, c);
        }
        try {
            this.f20196d.resumeWith(a10);
            tf.d dVar = tf.d.f30009a;
        } finally {
            if (q1Var == null || q1Var.m0()) {
                ThreadContextKt.a(context, c);
            }
        }
    }

    public final boolean m0() {
        boolean z10;
        if (this.threadLocalIsSet && this.f20229e.get() == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f20229e.remove();
        return !z10;
    }

    public final void n0(CoroutineContext coroutineContext, Object obj) {
        this.threadLocalIsSet = true;
        this.f20229e.set(new Pair<>(coroutineContext, obj));
    }
}

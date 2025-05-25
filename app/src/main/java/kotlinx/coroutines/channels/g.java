package kotlinx.coroutines.channels;

import com.android.billingclient.api.a0;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlinx.coroutines.internal.q;

/* compiled from: BufferedChannel.kt */
/* loaded from: classes.dex */
public final class g<E> extends q<g<E>> {

    /* renamed from: e  reason: collision with root package name */
    public final BufferedChannel<E> f20040e;

    /* renamed from: f  reason: collision with root package name */
    public final AtomicReferenceArray f20041f;

    public g(long j10, g<E> gVar, BufferedChannel<E> bufferedChannel, int i10) {
        super(j10, gVar, i10);
        this.f20040e = bufferedChannel;
        this.f20041f = new AtomicReferenceArray(a.f20016b * 2);
    }

    @Override // kotlinx.coroutines.internal.q
    public final int f() {
        return a.f20016b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x005b, code lost:
        m(r7, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x005e, code lost:
        if (r1 == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0060, code lost:
        kotlin.jvm.internal.g.b(r4);
        r7 = r4.f20012b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0065, code lost:
        if (r7 == null) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0067, code lost:
        kotlinx.coroutines.internal.OnUndeliveredElementKt.b(r7, r0, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x006a, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:?, code lost:
        return;
     */
    @Override // kotlinx.coroutines.internal.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(int r7, kotlin.coroutines.CoroutineContext r8) {
        /*
            r6 = this;
            int r0 = kotlinx.coroutines.channels.a.f20016b
            if (r7 < r0) goto L6
            r1 = 1
            goto L7
        L6:
            r1 = 0
        L7:
            if (r1 == 0) goto La
            int r7 = r7 - r0
        La:
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r6.f20041f
            int r2 = r7 * 2
            java.lang.Object r0 = r0.get(r2)
        L12:
            java.lang.Object r2 = r6.k(r7)
            boolean r3 = r2 instanceof kotlinx.coroutines.s1
            kotlinx.coroutines.channels.BufferedChannel<E> r4 = r6.f20040e
            r5 = 0
            if (r3 != 0) goto L6b
            boolean r3 = r2 instanceof kotlinx.coroutines.channels.n
            if (r3 == 0) goto L22
            goto L6b
        L22:
            com.android.billingclient.api.a0 r3 = kotlinx.coroutines.channels.a.f20023j
            if (r2 == r3) goto L5b
            com.android.billingclient.api.a0 r3 = kotlinx.coroutines.channels.a.f20024k
            if (r2 != r3) goto L2b
            goto L5b
        L2b:
            com.android.billingclient.api.a0 r3 = kotlinx.coroutines.channels.a.f20020g
            if (r2 == r3) goto L12
            com.android.billingclient.api.a0 r3 = kotlinx.coroutines.channels.a.f20019f
            if (r2 != r3) goto L34
            goto L12
        L34:
            com.android.billingclient.api.a0 r7 = kotlinx.coroutines.channels.a.f20022i
            if (r2 == r7) goto L5a
            com.android.billingclient.api.a0 r7 = kotlinx.coroutines.channels.a.f20017d
            if (r2 != r7) goto L3d
            goto L5a
        L3d:
            com.android.billingclient.api.a0 r7 = kotlinx.coroutines.channels.a.f20025l
            if (r2 != r7) goto L42
            return
        L42:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "unexpected state: "
            r8.<init>(r0)
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L5a:
            return
        L5b:
            r6.m(r7, r5)
            if (r1 == 0) goto L6a
            kotlin.jvm.internal.g.b(r4)
            cg.l<E, tf.d> r7 = r4.f20012b
            if (r7 == 0) goto L6a
            kotlinx.coroutines.internal.OnUndeliveredElementKt.b(r7, r0, r8)
        L6a:
            return
        L6b:
            if (r1 == 0) goto L70
            com.android.billingclient.api.a0 r3 = kotlinx.coroutines.channels.a.f20023j
            goto L72
        L70:
            com.android.billingclient.api.a0 r3 = kotlinx.coroutines.channels.a.f20024k
        L72:
            boolean r2 = r6.j(r7, r2, r3)
            if (r2 == 0) goto L12
            r6.m(r7, r5)
            r2 = r1 ^ 1
            r6.l(r7, r2)
            if (r1 == 0) goto L8c
            kotlin.jvm.internal.g.b(r4)
            cg.l<E, tf.d> r7 = r4.f20012b
            if (r7 == 0) goto L8c
            kotlinx.coroutines.internal.OnUndeliveredElementKt.b(r7, r0, r8)
        L8c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.g.g(int, kotlin.coroutines.CoroutineContext):void");
    }

    public final boolean j(int i10, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray = this.f20041f;
        int i11 = (i10 * 2) + 1;
        while (!atomicReferenceArray.compareAndSet(i11, obj, obj2)) {
            if (atomicReferenceArray.get(i11) != obj) {
                return false;
            }
        }
        return true;
    }

    public final Object k(int i10) {
        return this.f20041f.get((i10 * 2) + 1);
    }

    public final void l(int i10, boolean z10) {
        if (z10) {
            BufferedChannel<E> bufferedChannel = this.f20040e;
            kotlin.jvm.internal.g.b(bufferedChannel);
            bufferedChannel.K((this.c * a.f20016b) + i10);
        }
        h();
    }

    public final void m(int i10, Object obj) {
        this.f20041f.lazySet(i10 * 2, obj);
    }

    public final void n(int i10, a0 a0Var) {
        this.f20041f.set((i10 * 2) + 1, a0Var);
    }
}

package kotlinx.coroutines.flow;

/* compiled from: Flow.kt */
/* loaded from: classes.dex */
public abstract class AbstractFlow<T> implements c<T> {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    @Override // kotlinx.coroutines.flow.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(kotlinx.coroutines.flow.d<? super T> r6, kotlin.coroutines.c<? super tf.d> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.AbstractFlow$collect$1
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.AbstractFlow$collect$1 r0 = (kotlinx.coroutines.flow.AbstractFlow$collect$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.AbstractFlow$collect$1 r0 = new kotlinx.coroutines.flow.AbstractFlow$collect$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r6 = r0.L$0
            kotlinx.coroutines.flow.internal.SafeCollector r6 = (kotlinx.coroutines.flow.internal.SafeCollector) r6
            androidx.activity.s.u0(r7)     // Catch: java.lang.Throwable -> L2b
            goto L57
        L2b:
            r7 = move-exception
            goto L61
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            androidx.activity.s.u0(r7)
            kotlinx.coroutines.flow.internal.SafeCollector r7 = new kotlinx.coroutines.flow.internal.SafeCollector
            kotlin.coroutines.CoroutineContext r2 = r0.getContext()
            r7.<init>(r6, r2)
            r0.L$0 = r7     // Catch: java.lang.Throwable -> L5d
            r0.label = r3     // Catch: java.lang.Throwable -> L5d
            r6 = r5
            kotlinx.coroutines.flow.t r6 = (kotlinx.coroutines.flow.t) r6     // Catch: java.lang.Throwable -> L5d
            cg.p<kotlinx.coroutines.flow.d<? super T>, kotlin.coroutines.c<? super tf.d>, java.lang.Object> r6 = r6.f20135a     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r6 = r6.invoke(r7, r0)     // Catch: java.lang.Throwable -> L5d
            if (r6 != r1) goto L51
            goto L53
        L51:
            tf.d r6 = tf.d.f30009a     // Catch: java.lang.Throwable -> L5d
        L53:
            if (r6 != r1) goto L56
            return r1
        L56:
            r6 = r7
        L57:
            r6.releaseIntercepted()
            tf.d r6 = tf.d.f30009a
            return r6
        L5d:
            r6 = move-exception
            r4 = r7
            r7 = r6
            r6 = r4
        L61:
            r6.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.AbstractFlow.a(kotlinx.coroutines.flow.d, kotlin.coroutines.c):java.lang.Object");
    }
}

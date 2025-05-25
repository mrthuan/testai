package kotlinx.coroutines.flow;

/* compiled from: Share.kt */
/* loaded from: classes.dex */
public final class c0<T> implements d<T> {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
    /* JADX WARN: Type inference failed for: r1v1, types: [int, kotlinx.coroutines.flow.internal.SafeCollector] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final tf.d a(kotlin.coroutines.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof kotlinx.coroutines.flow.SubscribedFlowCollector$onSubscription$1
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.flow.SubscribedFlowCollector$onSubscription$1 r0 = (kotlinx.coroutines.flow.SubscribedFlowCollector$onSubscription$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.SubscribedFlowCollector$onSubscription$1 r0 = new kotlinx.coroutines.flow.SubscribedFlowCollector$onSubscription$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L46
            if (r1 == r2) goto L34
            r0 = 2
            if (r1 != r0) goto L2c
            androidx.activity.s.u0(r5)
        L29:
            tf.d r5 = tf.d.f30009a
            return r5
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L34:
            java.lang.Object r1 = r0.L$1
            kotlinx.coroutines.flow.internal.SafeCollector r1 = (kotlinx.coroutines.flow.internal.SafeCollector) r1
            java.lang.Object r0 = r0.L$0
            kotlinx.coroutines.flow.c0 r0 = (kotlinx.coroutines.flow.c0) r0
            androidx.activity.s.u0(r5)     // Catch: java.lang.Throwable -> L5a
            r1.releaseIntercepted()
            r0.getClass()
            goto L29
        L46:
            androidx.activity.s.u0(r5)
            kotlinx.coroutines.flow.internal.SafeCollector r1 = new kotlinx.coroutines.flow.internal.SafeCollector
            kotlin.coroutines.CoroutineContext r5 = r0.getContext()
            r3 = 0
            r1.<init>(r3, r5)
            r0.L$0 = r4     // Catch: java.lang.Throwable -> L5a
            r0.L$1 = r1     // Catch: java.lang.Throwable -> L5a
            r0.label = r2     // Catch: java.lang.Throwable -> L5a
            throw r3     // Catch: java.lang.Throwable -> L5a
        L5a:
            r5 = move-exception
            r1.releaseIntercepted()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.c0.a(kotlin.coroutines.c):tf.d");
    }

    @Override // kotlinx.coroutines.flow.d
    public final Object emit(T t4, kotlin.coroutines.c<? super tf.d> cVar) {
        throw null;
    }
}

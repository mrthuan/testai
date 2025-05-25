package kotlinx.coroutines.flow;

/* compiled from: Errors.kt */
/* loaded from: classes.dex */
public final /* synthetic */ class h {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.io.Serializable a(kotlin.coroutines.c r5, kotlinx.coroutines.flow.c r6, kotlinx.coroutines.flow.d r7) {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$1
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$1 r0 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$1 r0 = new kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r6 = r0.L$0
            kotlin.jvm.internal.Ref$ObjectRef r6 = (kotlin.jvm.internal.Ref$ObjectRef) r6
            androidx.activity.s.u0(r5)     // Catch: java.lang.Throwable -> L2b
            goto L4d
        L2b:
            r5 = move-exception
            goto L53
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            androidx.activity.s.u0(r5)
            kotlin.jvm.internal.Ref$ObjectRef r5 = new kotlin.jvm.internal.Ref$ObjectRef
            r5.<init>()
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2 r2 = new kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2     // Catch: java.lang.Throwable -> L4f
            r2.<init>(r7, r5)     // Catch: java.lang.Throwable -> L4f
            r0.L$0 = r5     // Catch: java.lang.Throwable -> L4f
            r0.label = r3     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r5 = r6.a(r2, r0)     // Catch: java.lang.Throwable -> L4f
            if (r5 != r1) goto L4d
            return r1
        L4d:
            r5 = 0
            return r5
        L4f:
            r6 = move-exception
            r4 = r6
            r6 = r5
            r5 = r4
        L53:
            T r6 = r6.element
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            r7 = 0
            if (r6 == 0) goto L62
            boolean r1 = kotlin.jvm.internal.g.a(r6, r5)
            if (r1 == 0) goto L62
            r1 = r3
            goto L63
        L62:
            r1 = r7
        L63:
            if (r1 != 0) goto L9a
            kotlin.coroutines.CoroutineContext r0 = r0.getContext()
            kotlinx.coroutines.y0$b r1 = kotlinx.coroutines.y0.b.f20277a
            kotlin.coroutines.CoroutineContext$a r0 = r0.get(r1)
            kotlinx.coroutines.y0 r0 = (kotlinx.coroutines.y0) r0
            if (r0 == 0) goto L89
            boolean r1 = r0.isCancelled()
            if (r1 != 0) goto L7a
            goto L89
        L7a:
            java.util.concurrent.CancellationException r0 = r0.i()
            if (r0 == 0) goto L87
            boolean r0 = kotlin.jvm.internal.g.a(r0, r5)
            if (r0 == 0) goto L87
            goto L88
        L87:
            r3 = r7
        L88:
            r7 = r3
        L89:
            if (r7 != 0) goto L9a
            if (r6 != 0) goto L8e
            return r5
        L8e:
            boolean r7 = r5 instanceof java.util.concurrent.CancellationException
            if (r7 == 0) goto L96
            com.google.android.play.core.assetpacks.b1.n(r6, r5)
            throw r6
        L96:
            com.google.android.play.core.assetpacks.b1.n(r5, r6)
            throw r5
        L9a:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.h.a(kotlin.coroutines.c, kotlinx.coroutines.flow.c, kotlinx.coroutines.flow.d):java.io.Serializable");
    }
}

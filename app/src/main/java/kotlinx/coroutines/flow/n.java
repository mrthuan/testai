package kotlinx.coroutines.flow;

/* compiled from: Reduce.kt */
/* loaded from: classes.dex */
public final /* synthetic */ class n {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006e  */
    /* JADX WARN: Type inference failed for: r3v0, types: [T, com.android.billingclient.api.a0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 r5, kotlin.coroutines.c r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt$first$1
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.FlowKt__ReduceKt$first$1 r0 = (kotlinx.coroutines.flow.FlowKt__ReduceKt$first$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__ReduceKt$first$1 r0 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$first$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            com.android.billingclient.api.a0 r3 = ea.a.f16519d
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 != r4) goto L33
            java.lang.Object r5 = r0.L$1
            kotlinx.coroutines.flow.m r5 = (kotlinx.coroutines.flow.m) r5
            java.lang.Object r0 = r0.L$0
            kotlin.jvm.internal.Ref$ObjectRef r0 = (kotlin.jvm.internal.Ref$ObjectRef) r0
            androidx.activity.s.u0(r6)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L31
            goto L61
        L31:
            r6 = move-exception
            goto L5d
        L33:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3b:
            androidx.activity.s.u0(r6)
            kotlin.jvm.internal.Ref$ObjectRef r6 = new kotlin.jvm.internal.Ref$ObjectRef
            r6.<init>()
            r6.element = r3
            kotlinx.coroutines.flow.m r2 = new kotlinx.coroutines.flow.m
            r2.<init>(r6)
            r0.L$0 = r6     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L59
            r0.L$1 = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L59
            r0.label = r4     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L59
            java.lang.Object r5 = r5.a(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L59
            if (r5 != r1) goto L57
            return r1
        L57:
            r0 = r6
            goto L61
        L59:
            r5 = move-exception
            r0 = r6
            r6 = r5
            r5 = r2
        L5d:
            kotlinx.coroutines.flow.d<?> r1 = r6.owner
            if (r1 != r5) goto L6e
        L61:
            T r5 = r0.element
            if (r5 == r3) goto L66
            return r5
        L66:
            java.util.NoSuchElementException r5 = new java.util.NoSuchElementException
            java.lang.String r6 = "Expected at least one element"
            r5.<init>(r6)
            throw r5
        L6e:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.n.a(kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0083  */
    /* JADX WARN: Type inference failed for: r3v0, types: [T, com.android.billingclient.api.a0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(kotlinx.coroutines.flow.a0 r6, cg.p r7, kotlin.coroutines.c r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt$first$3
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.flow.FlowKt__ReduceKt$first$3 r0 = (kotlinx.coroutines.flow.FlowKt__ReduceKt$first$3) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__ReduceKt$first$3 r0 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$first$3
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            com.android.billingclient.api.a0 r3 = ea.a.f16519d
            r4 = 1
            if (r2 == 0) goto L43
            if (r2 != r4) goto L3b
            java.lang.Object r6 = r0.L$2
            kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2 r6 = (kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2) r6
            java.lang.Object r7 = r0.L$1
            kotlin.jvm.internal.Ref$ObjectRef r7 = (kotlin.jvm.internal.Ref$ObjectRef) r7
            java.lang.Object r0 = r0.L$0
            cg.p r0 = (cg.p) r0
            androidx.activity.s.u0(r8)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L35
            goto L6a
        L35:
            r8 = move-exception
            r5 = r8
            r8 = r7
            r7 = r0
            r0 = r5
            goto L64
        L3b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L43:
            androidx.activity.s.u0(r8)
            kotlin.jvm.internal.Ref$ObjectRef r8 = new kotlin.jvm.internal.Ref$ObjectRef
            r8.<init>()
            r8.element = r3
            kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2 r2 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2
            r2.<init>(r7, r8)
            r0.L$0 = r7     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L61
            r0.L$1 = r8     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L61
            r0.L$2 = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L61
            r0.label = r4     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L61
            java.lang.Object r6 = r6.a(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L61
            if (r6 != r1) goto L68
            return r1
        L61:
            r6 = move-exception
            r0 = r6
            r6 = r2
        L64:
            kotlinx.coroutines.flow.d<?> r1 = r0.owner
            if (r1 != r6) goto L83
        L68:
            r0 = r7
            r7 = r8
        L6a:
            T r6 = r7.element
            if (r6 == r3) goto L6f
            return r6
        L6f:
            java.util.NoSuchElementException r6 = new java.util.NoSuchElementException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Expected at least one element matching the predicate "
            r7.<init>(r8)
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L83:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.n.b(kotlinx.coroutines.flow.a0, cg.p, kotlin.coroutines.c):java.lang.Object");
    }
}

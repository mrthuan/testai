package kotlinx.coroutines.flow;

/* compiled from: Channels.kt */
/* loaded from: classes.dex */
public final /* synthetic */ class FlowKt__ChannelsKt {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007d A[Catch: all -> 0x009a, TRY_LEAVE, TryCatch #0 {all -> 0x009a, blocks: (B:13:0x0035, B:23:0x0060, B:27:0x0075, B:29:0x007d, B:18:0x0051, B:22:0x005c), top: B:49:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0092  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x008f -> B:14:0x0038). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object a(kotlinx.coroutines.flow.d<? super T> r7, kotlinx.coroutines.channels.l<? extends T> r8, boolean r9, kotlin.coroutines.c<? super tf.d> r10) {
        /*
            boolean r0 = r10 instanceof kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1
            if (r0 == 0) goto L13
            r0 = r10
            kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1 r0 = (kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1 r0 = new kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 1
            r5 = 2
            if (r2 == 0) goto L55
            if (r2 == r4) goto L43
            if (r2 != r5) goto L3b
            boolean r9 = r0.Z$0
            java.lang.Object r7 = r0.L$2
            kotlinx.coroutines.channels.d r7 = (kotlinx.coroutines.channels.d) r7
            java.lang.Object r8 = r0.L$1
            kotlinx.coroutines.channels.l r8 = (kotlinx.coroutines.channels.l) r8
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.flow.d r2 = (kotlinx.coroutines.flow.d) r2
            androidx.activity.s.u0(r10)     // Catch: java.lang.Throwable -> L9a
        L38:
            r10 = r7
            r7 = r2
            goto L60
        L3b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L43:
            boolean r9 = r0.Z$0
            java.lang.Object r7 = r0.L$2
            kotlinx.coroutines.channels.d r7 = (kotlinx.coroutines.channels.d) r7
            java.lang.Object r8 = r0.L$1
            kotlinx.coroutines.channels.l r8 = (kotlinx.coroutines.channels.l) r8
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.flow.d r2 = (kotlinx.coroutines.flow.d) r2
            androidx.activity.s.u0(r10)     // Catch: java.lang.Throwable -> L9a
            goto L75
        L55:
            androidx.activity.s.u0(r10)
            boolean r10 = r7 instanceof kotlinx.coroutines.flow.d0
            if (r10 != 0) goto Lb6
            kotlinx.coroutines.channels.d r10 = r8.iterator()     // Catch: java.lang.Throwable -> L9a
        L60:
            r0.L$0 = r7     // Catch: java.lang.Throwable -> L9a
            r0.L$1 = r8     // Catch: java.lang.Throwable -> L9a
            r0.L$2 = r10     // Catch: java.lang.Throwable -> L9a
            r0.Z$0 = r9     // Catch: java.lang.Throwable -> L9a
            r0.label = r4     // Catch: java.lang.Throwable -> L9a
            java.lang.Object r2 = r10.a(r0)     // Catch: java.lang.Throwable -> L9a
            if (r2 != r1) goto L71
            return r1
        L71:
            r6 = r2
            r2 = r7
            r7 = r10
            r10 = r6
        L75:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L9a
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L9a
            if (r10 == 0) goto L92
            java.lang.Object r10 = r7.next()     // Catch: java.lang.Throwable -> L9a
            r0.L$0 = r2     // Catch: java.lang.Throwable -> L9a
            r0.L$1 = r8     // Catch: java.lang.Throwable -> L9a
            r0.L$2 = r7     // Catch: java.lang.Throwable -> L9a
            r0.Z$0 = r9     // Catch: java.lang.Throwable -> L9a
            r0.label = r5     // Catch: java.lang.Throwable -> L9a
            java.lang.Object r10 = r2.emit(r10, r0)     // Catch: java.lang.Throwable -> L9a
            if (r10 != r1) goto L38
            return r1
        L92:
            if (r9 == 0) goto L97
            r8.b(r3)
        L97:
            tf.d r7 = tf.d.f30009a
            return r7
        L9a:
            r7 = move-exception
            throw r7     // Catch: java.lang.Throwable -> L9c
        L9c:
            r10 = move-exception
            if (r9 == 0) goto Lb5
            boolean r9 = r7 instanceof java.util.concurrent.CancellationException
            if (r9 == 0) goto La6
            r3 = r7
            java.util.concurrent.CancellationException r3 = (java.util.concurrent.CancellationException) r3
        La6:
            if (r3 != 0) goto Lb2
            java.util.concurrent.CancellationException r3 = new java.util.concurrent.CancellationException
            java.lang.String r9 = "Channel was consumed, consumer had failed"
            r3.<init>(r9)
            r3.initCause(r7)
        Lb2:
            r8.b(r3)
        Lb5:
            throw r10
        Lb6:
            kotlinx.coroutines.flow.d0 r7 = (kotlinx.coroutines.flow.d0) r7
            java.lang.Throwable r7 = r7.f20094a
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ChannelsKt.a(kotlinx.coroutines.flow.d, kotlinx.coroutines.channels.l, boolean, kotlin.coroutines.c):java.lang.Object");
    }
}

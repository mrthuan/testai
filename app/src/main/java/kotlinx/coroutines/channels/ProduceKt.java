package kotlinx.coroutines.channels;

/* compiled from: Produce.kt */
/* loaded from: classes.dex */
public final class ProduceKt {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(kotlinx.coroutines.channels.j<?> r4, cg.a<tf.d> r5, kotlin.coroutines.c<? super tf.d> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.channels.ProduceKt$awaitClose$1
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.channels.ProduceKt$awaitClose$1 r0 = (kotlinx.coroutines.channels.ProduceKt$awaitClose$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ProduceKt$awaitClose$1 r0 = new kotlinx.coroutines.channels.ProduceKt$awaitClose$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r4 = r0.L$1
            r5 = r4
            cg.a r5 = (cg.a) r5
            java.lang.Object r4 = r0.L$0
            kotlinx.coroutines.channels.j r4 = (kotlinx.coroutines.channels.j) r4
            androidx.activity.s.u0(r6)     // Catch: java.lang.Throwable -> L30
            goto L6f
        L30:
            r4 = move-exception
            goto L75
        L32:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3a:
            androidx.activity.s.u0(r6)
            kotlin.coroutines.CoroutineContext r6 = r0.getContext()
            kotlinx.coroutines.y0$b r2 = kotlinx.coroutines.y0.b.f20277a
            kotlin.coroutines.CoroutineContext$a r6 = r6.get(r2)
            if (r6 != r4) goto L4b
            r6 = r3
            goto L4c
        L4b:
            r6 = 0
        L4c:
            if (r6 == 0) goto L79
            r0.L$0 = r4     // Catch: java.lang.Throwable -> L30
            r0.L$1 = r5     // Catch: java.lang.Throwable -> L30
            r0.label = r3     // Catch: java.lang.Throwable -> L30
            kotlinx.coroutines.h r6 = new kotlinx.coroutines.h     // Catch: java.lang.Throwable -> L30
            kotlin.coroutines.c r0 = com.google.android.play.core.assetpacks.b1.L(r0)     // Catch: java.lang.Throwable -> L30
            r6.<init>(r3, r0)     // Catch: java.lang.Throwable -> L30
            r6.s()     // Catch: java.lang.Throwable -> L30
            kotlinx.coroutines.channels.ProduceKt$awaitClose$4$1 r0 = new kotlinx.coroutines.channels.ProduceKt$awaitClose$4$1     // Catch: java.lang.Throwable -> L30
            r0.<init>()     // Catch: java.lang.Throwable -> L30
            r4.p(r0)     // Catch: java.lang.Throwable -> L30
            java.lang.Object r4 = r6.r()     // Catch: java.lang.Throwable -> L30
            if (r4 != r1) goto L6f
            return r1
        L6f:
            r5.invoke()
            tf.d r4 = tf.d.f30009a
            return r4
        L75:
            r5.invoke()
            throw r4
        L79:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ProduceKt.a(kotlinx.coroutines.channels.j, cg.a, kotlin.coroutines.c):java.lang.Object");
    }
}

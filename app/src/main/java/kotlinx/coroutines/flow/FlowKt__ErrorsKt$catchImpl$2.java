package kotlinx.coroutines.flow;

import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: Errors.kt */
/* loaded from: classes.dex */
public final class FlowKt__ErrorsKt$catchImpl$2<T> implements d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d<T> f20062a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Ref$ObjectRef<Throwable> f20063b;

    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__ErrorsKt$catchImpl$2(d<? super T> dVar, Ref$ObjectRef<Throwable> ref$ObjectRef) {
        this.f20062a = dVar;
        this.f20063b = ref$ObjectRef;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    @Override // kotlinx.coroutines.flow.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emit(T r5, kotlin.coroutines.c<? super tf.d> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2$emit$1
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2$emit$1 r0 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2$emit$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2$emit$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.L$0
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2 r5 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2) r5
            androidx.activity.s.u0(r6)     // Catch: java.lang.Throwable -> L2b
            goto L45
        L2b:
            r6 = move-exception
            goto L4a
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            androidx.activity.s.u0(r6)
            kotlinx.coroutines.flow.d<T> r6 = r4.f20062a     // Catch: java.lang.Throwable -> L48
            r0.L$0 = r4     // Catch: java.lang.Throwable -> L48
            r0.label = r3     // Catch: java.lang.Throwable -> L48
            java.lang.Object r5 = r6.emit(r5, r0)     // Catch: java.lang.Throwable -> L48
            if (r5 != r1) goto L45
            return r1
        L45:
            tf.d r5 = tf.d.f30009a
            return r5
        L48:
            r6 = move-exception
            r5 = r4
        L4a:
            kotlin.jvm.internal.Ref$ObjectRef<java.lang.Throwable> r5 = r5.f20063b
            r5.element = r6
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2.emit(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
    }
}

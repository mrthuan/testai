package kotlinx.coroutines.flow;

/* compiled from: Merge.kt */
/* loaded from: classes.dex */
public final class FlowKt__MergeKt$flattenConcat$1$1<T> implements d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d<T> f20074a;

    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__MergeKt$flattenConcat$1$1(d<? super T> dVar) {
        this.f20074a = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    @Override // kotlinx.coroutines.flow.d
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emit(kotlinx.coroutines.flow.c<? extends T> r5, kotlin.coroutines.c<? super tf.d> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__MergeKt$flattenConcat$1$1$emit$1
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.FlowKt__MergeKt$flattenConcat$1$1$emit$1 r0 = (kotlinx.coroutines.flow.FlowKt__MergeKt$flattenConcat$1$1$emit$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__MergeKt$flattenConcat$1$1$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__MergeKt$flattenConcat$1$1$emit$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            androidx.activity.s.u0(r6)
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            androidx.activity.s.u0(r6)
            r0.label = r3
            kotlinx.coroutines.flow.d<T> r6 = r4.f20074a
            java.lang.Object r5 = aj.b.m(r0, r5, r6)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            tf.d r5 = tf.d.f30009a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__MergeKt$flattenConcat$1$1.emit(kotlinx.coroutines.flow.c, kotlin.coroutines.c):java.lang.Object");
    }
}

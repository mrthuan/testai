package kotlinx.coroutines.flow;

import kotlin.jvm.internal.Ref$BooleanRef;

/* compiled from: Limit.kt */
/* loaded from: classes.dex */
public final class FlowKt__LimitKt$dropWhile$1$1<T> implements d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Ref$BooleanRef f20066a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d<T> f20067b;
    public final /* synthetic */ cg.p<T, kotlin.coroutines.c<? super Boolean>, Object> c;

    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__LimitKt$dropWhile$1$1(Ref$BooleanRef ref$BooleanRef, d<? super T> dVar, cg.p<? super T, ? super kotlin.coroutines.c<? super Boolean>, ? extends Object> pVar) {
        this.f20066a = ref$BooleanRef;
        this.f20067b = dVar;
        this.c = pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0089  */
    @Override // kotlinx.coroutines.flow.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emit(T r7, kotlin.coroutines.c<? super tf.d> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1$emit$1
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1$emit$1 r0 = (kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1$emit$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1$emit$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L43
            if (r2 == r5) goto L3f
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            androidx.activity.s.u0(r8)
            goto L86
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            java.lang.Object r7 = r0.L$1
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1 r2 = (kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1) r2
            androidx.activity.s.u0(r8)
            goto L6a
        L3f:
            androidx.activity.s.u0(r8)
            goto L57
        L43:
            androidx.activity.s.u0(r8)
            kotlin.jvm.internal.Ref$BooleanRef r8 = r6.f20066a
            boolean r8 = r8.element
            if (r8 == 0) goto L5a
            r0.label = r5
            kotlinx.coroutines.flow.d<T> r8 = r6.f20067b
            java.lang.Object r7 = r8.emit(r7, r0)
            if (r7 != r1) goto L57
            return r1
        L57:
            tf.d r7 = tf.d.f30009a
            return r7
        L5a:
            r0.L$0 = r6
            r0.L$1 = r7
            r0.label = r4
            cg.p<T, kotlin.coroutines.c<? super java.lang.Boolean>, java.lang.Object> r8 = r6.c
            java.lang.Object r8 = r8.invoke(r7, r0)
            if (r8 != r1) goto L69
            return r1
        L69:
            r2 = r6
        L6a:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L89
            kotlin.jvm.internal.Ref$BooleanRef r8 = r2.f20066a
            r8.element = r5
            r8 = 0
            r0.L$0 = r8
            r0.L$1 = r8
            r0.label = r3
            kotlinx.coroutines.flow.d<T> r8 = r2.f20067b
            java.lang.Object r7 = r8.emit(r7, r0)
            if (r7 != r1) goto L86
            return r1
        L86:
            tf.d r7 = tf.d.f30009a
            return r7
        L89:
            tf.d r7 = tf.d.f30009a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1.emit(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
    }
}

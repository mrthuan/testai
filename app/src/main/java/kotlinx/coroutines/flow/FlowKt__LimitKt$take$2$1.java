package kotlinx.coroutines.flow;

import kotlin.jvm.internal.Ref$IntRef;

/* compiled from: Limit.kt */
/* loaded from: classes.dex */
public final class FlowKt__LimitKt$take$2$1<T> implements d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Ref$IntRef f20068a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f20069b;
    public final /* synthetic */ d<T> c;

    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__LimitKt$take$2$1(Ref$IntRef ref$IntRef, int i10, d<? super T> dVar) {
        this.f20068a = ref$IntRef;
        this.f20069b = i10;
        this.c = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    @Override // kotlinx.coroutines.flow.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emit(T r7, kotlin.coroutines.c<? super tf.d> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1$emit$1
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1$emit$1 r0 = (kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1$emit$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1$emit$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            androidx.activity.s.u0(r8)
            goto L5b
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            androidx.activity.s.u0(r8)
            goto L4f
        L36:
            androidx.activity.s.u0(r8)
            kotlin.jvm.internal.Ref$IntRef r8 = r6.f20068a
            int r2 = r8.element
            int r2 = r2 + r4
            r8.element = r2
            int r8 = r6.f20069b
            kotlinx.coroutines.flow.d<T> r5 = r6.c
            if (r2 >= r8) goto L52
            r0.label = r4
            java.lang.Object r7 = r5.emit(r7, r0)
            if (r7 != r1) goto L4f
            return r1
        L4f:
            tf.d r7 = tf.d.f30009a
            return r7
        L52:
            r0.label = r3
            kotlin.coroutines.intrinsics.CoroutineSingletons r7 = kotlinx.coroutines.flow.j.a(r5, r7, r0)
            if (r7 != r1) goto L5b
            return r1
        L5b:
            tf.d r7 = tf.d.f30009a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1.emit(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
    }
}

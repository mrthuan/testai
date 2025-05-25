package kotlinx.coroutines.flow;

import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: Distinct.kt */
/* loaded from: classes.dex */
public final class DistinctFlowImpl$collect$2<T> implements d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DistinctFlowImpl<T> f20052a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Ref$ObjectRef<Object> f20053b;
    public final /* synthetic */ d<T> c;

    /* JADX WARN: Multi-variable type inference failed */
    public DistinctFlowImpl$collect$2(DistinctFlowImpl<T> distinctFlowImpl, Ref$ObjectRef<Object> ref$ObjectRef, d<? super T> dVar) {
        this.f20052a = distinctFlowImpl;
        this.f20053b = ref$ObjectRef;
        this.c = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    @Override // kotlinx.coroutines.flow.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emit(T r8, kotlin.coroutines.c<? super tf.d> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof kotlinx.coroutines.flow.DistinctFlowImpl$collect$2$emit$1
            if (r0 == 0) goto L13
            r0 = r9
            kotlinx.coroutines.flow.DistinctFlowImpl$collect$2$emit$1 r0 = (kotlinx.coroutines.flow.DistinctFlowImpl$collect$2$emit$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.DistinctFlowImpl$collect$2$emit$1 r0 = new kotlinx.coroutines.flow.DistinctFlowImpl$collect$2$emit$1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            androidx.activity.s.u0(r9)
            goto L61
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L2f:
            androidx.activity.s.u0(r9)
            kotlinx.coroutines.flow.DistinctFlowImpl<T> r9 = r7.f20052a
            cg.l<T, java.lang.Object> r2 = r9.f20051b
            java.lang.Object r2 = r2.invoke(r8)
            kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r4 = r7.f20053b
            T r5 = r4.element
            com.android.billingclient.api.a0 r6 = ea.a.f16519d
            if (r5 == r6) goto L54
            cg.p<java.lang.Object, java.lang.Object, java.lang.Boolean> r9 = r9.c
            java.lang.Object r9 = r9.invoke(r5, r2)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L51
            goto L54
        L51:
            tf.d r8 = tf.d.f30009a
            return r8
        L54:
            r4.element = r2
            r0.label = r3
            kotlinx.coroutines.flow.d<T> r9 = r7.c
            java.lang.Object r8 = r9.emit(r8, r0)
            if (r8 != r1) goto L61
            return r1
        L61:
            tf.d r8 = tf.d.f30009a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.DistinctFlowImpl$collect$2.emit(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
    }
}

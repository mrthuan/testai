package kotlinx.coroutines.flow;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;

/* compiled from: Builders.kt */
/* loaded from: classes.dex */
public final class CallbackFlowBuilder<T> extends b<T> {

    /* renamed from: e  reason: collision with root package name */
    public final cg.p<kotlinx.coroutines.channels.j<? super T>, kotlin.coroutines.c<? super tf.d>, Object> f20049e;

    /* JADX WARN: Multi-variable type inference failed */
    public CallbackFlowBuilder(cg.p<? super kotlinx.coroutines.channels.j<? super T>, ? super kotlin.coroutines.c<? super tf.d>, ? extends Object> pVar, CoroutineContext coroutineContext, int i10, BufferOverflow bufferOverflow) {
        super(pVar, coroutineContext, i10, bufferOverflow);
        this.f20049e = pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0051  */
    @Override // kotlinx.coroutines.flow.internal.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(kotlinx.coroutines.channels.j<? super T> r5, kotlin.coroutines.c<? super tf.d> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.CallbackFlowBuilder$collectTo$1
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.CallbackFlowBuilder$collectTo$1 r0 = (kotlinx.coroutines.flow.CallbackFlowBuilder$collectTo$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.CallbackFlowBuilder$collectTo$1 r0 = new kotlinx.coroutines.flow.CallbackFlowBuilder$collectTo$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r5 = r0.L$0
            kotlinx.coroutines.channels.j r5 = (kotlinx.coroutines.channels.j) r5
            androidx.activity.s.u0(r6)
            goto L48
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            androidx.activity.s.u0(r6)
            r0.L$0 = r5
            r0.label = r3
            cg.p<kotlinx.coroutines.channels.j<? super T>, kotlin.coroutines.c<? super tf.d>, java.lang.Object> r6 = r4.f20092d
            java.lang.Object r6 = r6.invoke(r5, r0)
            if (r6 != r1) goto L43
            goto L45
        L43:
            tf.d r6 = tf.d.f30009a
        L45:
            if (r6 != r1) goto L48
            return r1
        L48:
            boolean r5 = r5.y()
            if (r5 == 0) goto L51
            tf.d r5 = tf.d.f30009a
            return r5
        L51:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.CallbackFlowBuilder.i(kotlinx.coroutines.channels.j, kotlin.coroutines.c):java.lang.Object");
    }

    @Override // kotlinx.coroutines.flow.internal.c
    public final kotlinx.coroutines.flow.internal.c<T> j(CoroutineContext coroutineContext, int i10, BufferOverflow bufferOverflow) {
        return new CallbackFlowBuilder(this.f20049e, coroutineContext, i10, bufferOverflow);
    }
}

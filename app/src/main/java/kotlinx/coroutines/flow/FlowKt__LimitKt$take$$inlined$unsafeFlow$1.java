package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import lib.zj.office.fc.hslf.record.SlideAtom;

/* compiled from: SafeCollector.common.kt */
/* loaded from: classes.dex */
public final class FlowKt__LimitKt$take$$inlined$unsafeFlow$1 implements c<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f20064a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f20065b = 1;

    /* compiled from: SafeCollector.common.kt */
    @wf.c(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1", f = "Limit.kt", l = {115}, m = "collect")
    /* renamed from: kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(kotlin.coroutines.c cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= SlideAtom.USES_MASTER_SLIDE_ID;
            return FlowKt__LimitKt$take$$inlined$unsafeFlow$1.this.a(null, this);
        }
    }

    public FlowKt__LimitKt$take$$inlined$unsafeFlow$1(c cVar) {
        this.f20064a = cVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(3:19|20|(1:22))|12|13|14))|27|6|7|(0)(0)|12|13|14) */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0052, code lost:
        if (r8.owner != r7) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0057, code lost:
        throw r8;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    @Override // kotlinx.coroutines.flow.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(kotlinx.coroutines.flow.d<? super java.lang.Object> r7, kotlin.coroutines.c<? super tf.d> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1$1 r0 = (kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1$1 r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r7 = r0.L$0
            kotlinx.coroutines.flow.d r7 = (kotlinx.coroutines.flow.d) r7
            androidx.activity.s.u0(r8)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4f
            goto L54
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            androidx.activity.s.u0(r8)
            kotlin.jvm.internal.Ref$IntRef r8 = new kotlin.jvm.internal.Ref$IntRef
            r8.<init>()
            kotlinx.coroutines.flow.c r2 = r6.f20064a     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4f
            kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1 r4 = new kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4f
            int r5 = r6.f20065b     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4f
            r4.<init>(r8, r5, r7)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4f
            r0.L$0 = r7     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4f
            r0.label = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4f
            java.lang.Object r7 = r2.a(r4, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4f
            if (r7 != r1) goto L54
            return r1
        L4f:
            r8 = move-exception
            kotlinx.coroutines.flow.d<?> r0 = r8.owner
            if (r0 != r7) goto L57
        L54:
            tf.d r7 = tf.d.f30009a
            return r7
        L57:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1.a(kotlinx.coroutines.flow.d, kotlin.coroutines.c):java.lang.Object");
    }
}

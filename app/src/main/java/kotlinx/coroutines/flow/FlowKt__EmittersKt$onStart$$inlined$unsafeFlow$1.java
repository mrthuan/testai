package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import lib.zj.office.fc.hslf.record.SlideAtom;

/* compiled from: SafeCollector.common.kt */
/* loaded from: classes.dex */
public final class FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 implements c<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ cg.p f20058a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ c f20059b;

    /* compiled from: SafeCollector.common.kt */
    @wf.c(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1", f = "Emitters.kt", l = {116, 120}, m = "collect")
    /* renamed from: kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(kotlin.coroutines.c cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= SlideAtom.USES_MASTER_SLIDE_ID;
            return FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1.this.a(null, this);
        }
    }

    public FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(cg.p pVar, c cVar) {
        this.f20058a = pVar;
        this.f20059b = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0078 A[RETURN] */
    @Override // kotlinx.coroutines.flow.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(kotlinx.coroutines.flow.d<? super java.lang.Object> r7, kotlin.coroutines.c<? super tf.d> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1 r0 = (kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1 r0 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            androidx.activity.s.u0(r8)
            goto L79
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            java.lang.Object r7 = r0.L$2
            kotlinx.coroutines.flow.internal.SafeCollector r7 = (kotlinx.coroutines.flow.internal.SafeCollector) r7
            java.lang.Object r2 = r0.L$1
            kotlinx.coroutines.flow.d r2 = (kotlinx.coroutines.flow.d) r2
            java.lang.Object r4 = r0.L$0
            kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 r4 = (kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1) r4
            androidx.activity.s.u0(r8)     // Catch: java.lang.Throwable -> L42
            goto L64
        L42:
            r8 = move-exception
            goto L80
        L44:
            androidx.activity.s.u0(r8)
            kotlinx.coroutines.flow.internal.SafeCollector r8 = new kotlinx.coroutines.flow.internal.SafeCollector
            kotlin.coroutines.CoroutineContext r2 = r0.getContext()
            r8.<init>(r7, r2)
            cg.p r2 = r6.f20058a     // Catch: java.lang.Throwable -> L7c
            r0.L$0 = r6     // Catch: java.lang.Throwable -> L7c
            r0.L$1 = r7     // Catch: java.lang.Throwable -> L7c
            r0.L$2 = r8     // Catch: java.lang.Throwable -> L7c
            r0.label = r4     // Catch: java.lang.Throwable -> L7c
            java.lang.Object r2 = r2.invoke(r8, r0)     // Catch: java.lang.Throwable -> L7c
            if (r2 != r1) goto L61
            return r1
        L61:
            r4 = r6
            r2 = r7
            r7 = r8
        L64:
            r7.releaseIntercepted()
            kotlinx.coroutines.flow.c r7 = r4.f20059b
            r8 = 0
            r0.L$0 = r8
            r0.L$1 = r8
            r0.L$2 = r8
            r0.label = r3
            java.lang.Object r7 = r7.a(r2, r0)
            if (r7 != r1) goto L79
            return r1
        L79:
            tf.d r7 = tf.d.f30009a
            return r7
        L7c:
            r7 = move-exception
            r5 = r8
            r8 = r7
            r7 = r5
        L80:
            r7.releaseIntercepted()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1.a(kotlinx.coroutines.flow.d, kotlin.coroutines.c):java.lang.Object");
    }
}

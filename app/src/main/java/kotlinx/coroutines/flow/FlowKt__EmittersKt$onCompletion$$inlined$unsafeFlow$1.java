package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import lib.zj.office.fc.hslf.record.SlideAtom;

/* compiled from: SafeCollector.common.kt */
/* loaded from: classes.dex */
public final class FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1 implements c<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f20056a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ cg.q f20057b;

    /* compiled from: SafeCollector.common.kt */
    @wf.c(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1", f = "Emitters.kt", l = {114, 121, 128}, m = "collect")
    /* renamed from: kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(kotlin.coroutines.c cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= SlideAtom.USES_MASTER_SLIDE_ID;
            return FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.this.a(null, this);
        }
    }

    public FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1(FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1, cg.q qVar) {
        this.f20056a = flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1;
        this.f20057b = qVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    @Override // kotlinx.coroutines.flow.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(kotlinx.coroutines.flow.d<? super java.lang.Object> r9, kotlin.coroutines.c<? super tf.d> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r10
            kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1 r0 = (kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1 r0 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L52
            if (r2 == r5) goto L44
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r9 = r0.L$0
            kotlinx.coroutines.flow.internal.SafeCollector r9 = (kotlinx.coroutines.flow.internal.SafeCollector) r9
            androidx.activity.s.u0(r10)     // Catch: java.lang.Throwable -> L32
            goto L7e
        L32:
            r10 = move-exception
            goto L88
        L34:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3c:
            java.lang.Object r9 = r0.L$0
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            androidx.activity.s.u0(r10)
            goto La2
        L44:
            java.lang.Object r9 = r0.L$1
            kotlinx.coroutines.flow.d r9 = (kotlinx.coroutines.flow.d) r9
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1 r2 = (kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1) r2
            androidx.activity.s.u0(r10)     // Catch: java.lang.Throwable -> L50
            goto L65
        L50:
            r9 = move-exception
            goto L8e
        L52:
            androidx.activity.s.u0(r10)
            kotlinx.coroutines.flow.c r10 = r8.f20056a     // Catch: java.lang.Throwable -> L8c
            r0.L$0 = r8     // Catch: java.lang.Throwable -> L8c
            r0.L$1 = r9     // Catch: java.lang.Throwable -> L8c
            r0.label = r5     // Catch: java.lang.Throwable -> L8c
            java.lang.Object r10 = r10.a(r9, r0)     // Catch: java.lang.Throwable -> L8c
            if (r10 != r1) goto L64
            return r1
        L64:
            r2 = r8
        L65:
            kotlinx.coroutines.flow.internal.SafeCollector r10 = new kotlinx.coroutines.flow.internal.SafeCollector
            kotlin.coroutines.CoroutineContext r4 = r0.getContext()
            r10.<init>(r9, r4)
            cg.q r9 = r2.f20057b     // Catch: java.lang.Throwable -> L84
            r0.L$0 = r10     // Catch: java.lang.Throwable -> L84
            r0.L$1 = r6     // Catch: java.lang.Throwable -> L84
            r0.label = r3     // Catch: java.lang.Throwable -> L84
            java.lang.Object r9 = r9.invoke(r10, r6, r0)     // Catch: java.lang.Throwable -> L84
            if (r9 != r1) goto L7d
            return r1
        L7d:
            r9 = r10
        L7e:
            r9.releaseIntercepted()
            tf.d r9 = tf.d.f30009a
            return r9
        L84:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        L88:
            r9.releaseIntercepted()
            throw r10
        L8c:
            r9 = move-exception
            r2 = r8
        L8e:
            kotlinx.coroutines.flow.d0 r10 = new kotlinx.coroutines.flow.d0
            r10.<init>(r9)
            cg.q r2 = r2.f20057b
            r0.L$0 = r9
            r0.L$1 = r6
            r0.label = r4
            java.lang.Object r10 = kotlinx.coroutines.flow.g.a(r10, r2, r9, r0)
            if (r10 != r1) goto La2
            return r1
        La2:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.a(kotlinx.coroutines.flow.d, kotlin.coroutines.c):java.lang.Object");
    }
}

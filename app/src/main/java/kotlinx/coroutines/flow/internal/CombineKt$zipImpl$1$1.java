package kotlinx.coroutines.flow.internal;

import androidx.activity.s;
import cg.p;
import cg.q;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.w;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* compiled from: Combine.kt */
@wf.c(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1", f = "Combine.kt", l = {126}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class CombineKt$zipImpl$1$1 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super tf.d>, Object> {
    final /* synthetic */ kotlinx.coroutines.flow.c<Object> $flow;
    final /* synthetic */ kotlinx.coroutines.flow.c<Object> $flow2;
    final /* synthetic */ kotlinx.coroutines.flow.d<Object> $this_unsafeFlow;
    final /* synthetic */ q<Object, Object, kotlin.coroutines.c<Object>, Object> $transform;
    private /* synthetic */ Object L$0;
    int label;

    /* compiled from: Combine.kt */
    @wf.c(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2", f = "Combine.kt", l = {ShapeTypes.VERTICAL_SCROLL}, m = "invokeSuspend")
    /* renamed from: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends SuspendLambda implements p<tf.d, kotlin.coroutines.c<? super tf.d>, Object> {
        final /* synthetic */ Object $cnt;
        final /* synthetic */ kotlinx.coroutines.flow.c<Object> $flow;
        final /* synthetic */ CoroutineContext $scopeContext;
        final /* synthetic */ kotlinx.coroutines.channels.l<Object> $second;
        final /* synthetic */ kotlinx.coroutines.flow.d<Object> $this_unsafeFlow;
        final /* synthetic */ q<Object, Object, kotlin.coroutines.c<Object>, Object> $transform;
        int label;

        /* compiled from: Combine.kt */
        /* renamed from: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1  reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass1<T> implements kotlinx.coroutines.flow.d {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ CoroutineContext f20104a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ Object f20105b;
            public final /* synthetic */ kotlinx.coroutines.channels.l<Object> c;

            /* renamed from: d  reason: collision with root package name */
            public final /* synthetic */ kotlinx.coroutines.flow.d<Object> f20106d;

            /* renamed from: e  reason: collision with root package name */
            public final /* synthetic */ q<Object, Object, kotlin.coroutines.c<Object>, Object> f20107e;

            /* compiled from: Combine.kt */
            @wf.c(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1", f = "Combine.kt", l = {129, ShapeTypes.FLOW_CHART_PROCESS, ShapeTypes.FLOW_CHART_PROCESS}, m = "invokeSuspend")
            /* renamed from: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1  reason: invalid class name and collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C02731 extends SuspendLambda implements p<tf.d, kotlin.coroutines.c<? super tf.d>, Object> {
                final /* synthetic */ kotlinx.coroutines.channels.l<Object> $second;
                final /* synthetic */ kotlinx.coroutines.flow.d<Object> $this_unsafeFlow;
                final /* synthetic */ q<Object, Object, kotlin.coroutines.c<Object>, Object> $transform;
                final /* synthetic */ Object $value;
                Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C02731(kotlinx.coroutines.channels.l<? extends Object> lVar, kotlinx.coroutines.flow.d<Object> dVar, q<Object, Object, ? super kotlin.coroutines.c<Object>, ? extends Object> qVar, Object obj, kotlin.coroutines.c<? super C02731> cVar) {
                    super(2, cVar);
                    this.$second = lVar;
                    this.$this_unsafeFlow = dVar;
                    this.$transform = qVar;
                    this.$value = obj;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
                    return new C02731(this.$second, this.$this_unsafeFlow, this.$transform, this.$value, cVar);
                }

                /* JADX WARN: Removed duplicated region for block: B:34:0x0072 A[RETURN] */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                    /*
                        r8 = this;
                        kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                        int r1 = r8.label
                        r2 = 0
                        r3 = 3
                        r4 = 2
                        r5 = 1
                        if (r1 == 0) goto L2c
                        if (r1 == r5) goto L24
                        if (r1 == r4) goto L1c
                        if (r1 != r3) goto L14
                        androidx.activity.s.u0(r9)
                        goto L73
                    L14:
                        java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r9.<init>(r0)
                        throw r9
                    L1c:
                        java.lang.Object r1 = r8.L$0
                        kotlinx.coroutines.flow.d r1 = (kotlinx.coroutines.flow.d) r1
                        androidx.activity.s.u0(r9)
                        goto L68
                    L24:
                        androidx.activity.s.u0(r9)
                        kotlinx.coroutines.channels.f r9 = (kotlinx.coroutines.channels.f) r9
                        java.lang.Object r9 = r9.f20038a
                        goto L3a
                    L2c:
                        androidx.activity.s.u0(r9)
                        kotlinx.coroutines.channels.l<java.lang.Object> r9 = r8.$second
                        r8.label = r5
                        java.lang.Object r9 = r9.j(r8)
                        if (r9 != r0) goto L3a
                        return r0
                    L3a:
                        kotlinx.coroutines.flow.d<java.lang.Object> r1 = r8.$this_unsafeFlow
                        boolean r5 = r9 instanceof kotlinx.coroutines.channels.f.b
                        if (r5 == 0) goto L54
                        boolean r0 = r9 instanceof kotlinx.coroutines.channels.f.a
                        if (r0 == 0) goto L47
                        kotlinx.coroutines.channels.f$a r9 = (kotlinx.coroutines.channels.f.a) r9
                        goto L48
                    L47:
                        r9 = r2
                    L48:
                        if (r9 == 0) goto L4c
                        java.lang.Throwable r2 = r9.f20039a
                    L4c:
                        if (r2 != 0) goto L53
                        kotlinx.coroutines.flow.internal.AbortFlowException r2 = new kotlinx.coroutines.flow.internal.AbortFlowException
                        r2.<init>(r1)
                    L53:
                        throw r2
                    L54:
                        cg.q<java.lang.Object, java.lang.Object, kotlin.coroutines.c<java.lang.Object>, java.lang.Object> r5 = r8.$transform
                        java.lang.Object r6 = r8.$value
                        com.android.billingclient.api.a0 r7 = ea.a.f16519d
                        if (r9 != r7) goto L5d
                        r9 = r2
                    L5d:
                        r8.L$0 = r1
                        r8.label = r4
                        java.lang.Object r9 = r5.invoke(r6, r9, r8)
                        if (r9 != r0) goto L68
                        return r0
                    L68:
                        r8.L$0 = r2
                        r8.label = r3
                        java.lang.Object r9 = r1.emit(r9, r8)
                        if (r9 != r0) goto L73
                        return r0
                    L73:
                        tf.d r9 = tf.d.f30009a
                        return r9
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1.AnonymousClass2.AnonymousClass1.C02731.invokeSuspend(java.lang.Object):java.lang.Object");
                }

                @Override // cg.p
                public final Object invoke(tf.d dVar, kotlin.coroutines.c<? super tf.d> cVar) {
                    return ((C02731) create(dVar, cVar)).invokeSuspend(tf.d.f30009a);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(CoroutineContext coroutineContext, Object obj, kotlinx.coroutines.channels.l<? extends Object> lVar, kotlinx.coroutines.flow.d<Object> dVar, q<Object, Object, ? super kotlin.coroutines.c<Object>, ? extends Object> qVar) {
                this.f20104a = coroutineContext;
                this.f20105b = obj;
                this.c = lVar;
                this.f20106d = dVar;
                this.f20107e = qVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
            @Override // kotlinx.coroutines.flow.d
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(java.lang.Object r11, kotlin.coroutines.c<? super tf.d> r12) {
                /*
                    r10 = this;
                    boolean r0 = r12 instanceof kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$emit$1
                    if (r0 == 0) goto L13
                    r0 = r12
                    kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$emit$1 r0 = (kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$emit$1) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L18
                L13:
                    kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$emit$1 r0 = new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$emit$1
                    r0.<init>(r10, r12)
                L18:
                    java.lang.Object r12 = r0.result
                    kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L2f
                    if (r2 != r3) goto L27
                    androidx.activity.s.u0(r12)
                    goto L4f
                L27:
                    java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                    java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                    r11.<init>(r12)
                    throw r11
                L2f:
                    androidx.activity.s.u0(r12)
                    tf.d r12 = tf.d.f30009a
                    kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1 r2 = new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1
                    kotlinx.coroutines.channels.l<java.lang.Object> r5 = r10.c
                    kotlinx.coroutines.flow.d<java.lang.Object> r6 = r10.f20106d
                    cg.q<java.lang.Object, java.lang.Object, kotlin.coroutines.c<java.lang.Object>, java.lang.Object> r7 = r10.f20107e
                    r9 = 0
                    r4 = r2
                    r8 = r11
                    r4.<init>(r5, r6, r7, r8, r9)
                    r0.label = r3
                    kotlin.coroutines.CoroutineContext r11 = r10.f20104a
                    java.lang.Object r3 = r10.f20105b
                    java.lang.Object r11 = pdf.pdfreader.viewer.editor.free.utils.t0.x0(r11, r12, r3, r2, r0)
                    if (r11 != r1) goto L4f
                    return r1
                L4f:
                    tf.d r11 = tf.d.f30009a
                    return r11
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1.AnonymousClass2.AnonymousClass1.emit(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(kotlinx.coroutines.flow.c<Object> cVar, CoroutineContext coroutineContext, Object obj, kotlinx.coroutines.channels.l<? extends Object> lVar, kotlinx.coroutines.flow.d<Object> dVar, q<Object, Object, ? super kotlin.coroutines.c<Object>, ? extends Object> qVar, kotlin.coroutines.c<? super AnonymousClass2> cVar2) {
            super(2, cVar2);
            this.$flow = cVar;
            this.$scopeContext = coroutineContext;
            this.$cnt = obj;
            this.$second = lVar;
            this.$this_unsafeFlow = dVar;
            this.$transform = qVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return new AnonymousClass2(this.$flow, this.$scopeContext, this.$cnt, this.$second, this.$this_unsafeFlow, this.$transform, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 == 1) {
                    s.u0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                s.u0(obj);
                kotlinx.coroutines.flow.c<Object> cVar = this.$flow;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$scopeContext, this.$cnt, this.$second, this.$this_unsafeFlow, this.$transform);
                this.label = 1;
                if (cVar.a(anonymousClass1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return tf.d.f30009a;
        }

        @Override // cg.p
        public final Object invoke(tf.d dVar, kotlin.coroutines.c<? super tf.d> cVar) {
            return ((AnonymousClass2) create(dVar, cVar)).invokeSuspend(tf.d.f30009a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CombineKt$zipImpl$1$1(kotlinx.coroutines.flow.d<Object> dVar, kotlinx.coroutines.flow.c<Object> cVar, kotlinx.coroutines.flow.c<Object> cVar2, q<Object, Object, ? super kotlin.coroutines.c<Object>, ? extends Object> qVar, kotlin.coroutines.c<? super CombineKt$zipImpl$1$1> cVar3) {
        super(2, cVar3);
        this.$this_unsafeFlow = dVar;
        this.$flow2 = cVar;
        this.$flow = cVar2;
        this.$transform = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        CombineKt$zipImpl$1$1 combineKt$zipImpl$1$1 = new CombineKt$zipImpl$1$1(this.$this_unsafeFlow, this.$flow2, this.$flow, this.$transform, cVar);
        combineKt$zipImpl$1$1.L$0 = obj;
        return combineKt$zipImpl$1$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00a4 A[Catch: all -> 0x0016, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0016, blocks: (B:6:0x0011, B:31:0x0098, B:35:0x00a4), top: B:39:0x0008 }] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r1 = r17
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r1.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L24
            if (r2 != r3) goto L1c
            java.lang.Object r0 = r1.L$0
            r2 = r0
            kotlinx.coroutines.channels.l r2 = (kotlinx.coroutines.channels.l) r2
            androidx.activity.s.u0(r18)     // Catch: java.lang.Throwable -> L16 kotlinx.coroutines.flow.internal.AbortFlowException -> L19
            goto L9e
        L16:
            r0 = move-exception
            goto La5
        L19:
            r0 = move-exception
            goto L98
        L1c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L24:
            androidx.activity.s.u0(r18)
            java.lang.Object r2 = r1.L$0
            kotlinx.coroutines.w r2 = (kotlinx.coroutines.w) r2
            kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1 r5 = new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1
            kotlinx.coroutines.flow.c<java.lang.Object> r6 = r1.$flow2
            r5.<init>(r6, r4)
            kotlin.coroutines.EmptyCoroutineContext r6 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            kotlinx.coroutines.channels.BufferOverflow r7 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
            kotlinx.coroutines.CoroutineStart r8 = kotlinx.coroutines.CoroutineStart.DEFAULT
            r9 = 4
            r10 = 0
            kotlinx.coroutines.channels.BufferedChannel r7 = kotlinx.coroutines.channels.e.a(r10, r7, r9)
            kotlin.coroutines.CoroutineContext r6 = kotlinx.coroutines.CoroutineContextKt.c(r2, r6)
            kotlinx.coroutines.channels.i r15 = new kotlinx.coroutines.channels.i
            r15.<init>(r6, r7)
            r8.invoke(r5, r15, r15)
            kotlinx.coroutines.a1 r5 = new kotlinx.coroutines.a1
            r5.<init>(r4)
            kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$1 r6 = new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$1
            kotlinx.coroutines.flow.d<java.lang.Object> r7 = r1.$this_unsafeFlow
            r6.<init>()
            r15.p(r6)
            kotlin.coroutines.CoroutineContext r11 = r2.n()     // Catch: java.lang.Throwable -> L91 kotlinx.coroutines.flow.internal.AbortFlowException -> L95
            java.lang.Object r12 = kotlinx.coroutines.internal.ThreadContextKt.b(r11)     // Catch: java.lang.Throwable -> L91 kotlinx.coroutines.flow.internal.AbortFlowException -> L95
            kotlin.coroutines.CoroutineContext r2 = r2.n()     // Catch: java.lang.Throwable -> L91 kotlinx.coroutines.flow.internal.AbortFlowException -> L95
            kotlin.coroutines.CoroutineContext r2 = r2.plus(r5)     // Catch: java.lang.Throwable -> L91 kotlinx.coroutines.flow.internal.AbortFlowException -> L95
            tf.d r5 = tf.d.f30009a     // Catch: java.lang.Throwable -> L91 kotlinx.coroutines.flow.internal.AbortFlowException -> L95
            kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2 r6 = new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2     // Catch: java.lang.Throwable -> L91 kotlinx.coroutines.flow.internal.AbortFlowException -> L95
            kotlinx.coroutines.flow.c<java.lang.Object> r10 = r1.$flow     // Catch: java.lang.Throwable -> L91 kotlinx.coroutines.flow.internal.AbortFlowException -> L95
            kotlinx.coroutines.flow.d<java.lang.Object> r14 = r1.$this_unsafeFlow     // Catch: java.lang.Throwable -> L91 kotlinx.coroutines.flow.internal.AbortFlowException -> L95
            cg.q<java.lang.Object, java.lang.Object, kotlin.coroutines.c<java.lang.Object>, java.lang.Object> r7 = r1.$transform     // Catch: java.lang.Throwable -> L91 kotlinx.coroutines.flow.internal.AbortFlowException -> L95
            r16 = 0
            r9 = r6
            r13 = r15
            r8 = r15
            r15 = r7
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)     // Catch: java.lang.Throwable -> L8d kotlinx.coroutines.flow.internal.AbortFlowException -> L8f
            r1.L$0 = r8     // Catch: java.lang.Throwable -> L8d kotlinx.coroutines.flow.internal.AbortFlowException -> L8f
            r1.label = r3     // Catch: java.lang.Throwable -> L8d kotlinx.coroutines.flow.internal.AbortFlowException -> L8f
            java.lang.Object r3 = kotlinx.coroutines.internal.ThreadContextKt.b(r2)     // Catch: java.lang.Throwable -> L8d kotlinx.coroutines.flow.internal.AbortFlowException -> L8f
            java.lang.Object r2 = pdf.pdfreader.viewer.editor.free.utils.t0.x0(r2, r5, r3, r6, r1)     // Catch: java.lang.Throwable -> L8d kotlinx.coroutines.flow.internal.AbortFlowException -> L8f
            if (r2 != r0) goto L8b
            return r0
        L8b:
            r2 = r8
            goto L9e
        L8d:
            r0 = move-exception
            goto L93
        L8f:
            r0 = move-exception
            goto L97
        L91:
            r0 = move-exception
            r8 = r15
        L93:
            r15 = r8
            goto La6
        L95:
            r0 = move-exception
            r8 = r15
        L97:
            r2 = r8
        L98:
            kotlinx.coroutines.flow.d<java.lang.Object> r3 = r1.$this_unsafeFlow     // Catch: java.lang.Throwable -> L16
            kotlinx.coroutines.flow.d<?> r5 = r0.owner     // Catch: java.lang.Throwable -> L16
            if (r5 != r3) goto La4
        L9e:
            r2.b(r4)
            tf.d r0 = tf.d.f30009a
            return r0
        La4:
            throw r0     // Catch: java.lang.Throwable -> L16
        La5:
            r15 = r2
        La6:
            r15.b(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // cg.p
    public final Object invoke(w wVar, kotlin.coroutines.c<? super tf.d> cVar) {
        return ((CombineKt$zipImpl$1$1) create(wVar, cVar)).invokeSuspend(tf.d.f30009a);
    }
}

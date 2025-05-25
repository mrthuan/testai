package kotlinx.coroutines.flow;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Share.kt */
@wf.c(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1", f = "Share.kt", l = {214, 218, 219, 225}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class FlowKt__ShareKt$launchSharing$1 extends SuspendLambda implements cg.p<kotlinx.coroutines.w, kotlin.coroutines.c<? super tf.d>, Object> {
    final /* synthetic */ Object $initialValue;
    final /* synthetic */ q<Object> $shared;
    final /* synthetic */ y $started;
    final /* synthetic */ c<Object> $upstream;
    int label;

    /* compiled from: Share.kt */
    @wf.c(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1", f = "Share.kt", l = {}, m = "invokeSuspend")
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements cg.p<Integer, kotlin.coroutines.c<? super Boolean>, Object> {
        /* synthetic */ int I$0;
        int label;

        public AnonymousClass1(kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(cVar);
            anonymousClass1.I$0 = ((Number) obj).intValue();
            return anonymousClass1;
        }

        public final Object invoke(int i10, kotlin.coroutines.c<? super Boolean> cVar) {
            return ((AnonymousClass1) create(Integer.valueOf(i10), cVar)).invokeSuspend(tf.d.f30009a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z10;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                androidx.activity.s.u0(obj);
                if (this.I$0 > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // cg.p
        public /* bridge */ /* synthetic */ Object invoke(Integer num, kotlin.coroutines.c<? super Boolean> cVar) {
            return invoke(num.intValue(), cVar);
        }
    }

    /* compiled from: Share.kt */
    @wf.c(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2", f = "Share.kt", l = {227}, m = "invokeSuspend")
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends SuspendLambda implements cg.p<SharingCommand, kotlin.coroutines.c<? super tf.d>, Object> {
        final /* synthetic */ Object $initialValue;
        final /* synthetic */ q<Object> $shared;
        final /* synthetic */ c<Object> $upstream;
        /* synthetic */ Object L$0;
        int label;

        /* compiled from: Share.kt */
        /* renamed from: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2$a */
        /* loaded from: classes.dex */
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f20077a;

            static {
                int[] iArr = new int[SharingCommand.values().length];
                try {
                    iArr[SharingCommand.START.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[SharingCommand.STOP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[SharingCommand.STOP_AND_RESET_REPLAY_CACHE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f20077a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(c<Object> cVar, q<Object> qVar, Object obj, kotlin.coroutines.c<? super AnonymousClass2> cVar2) {
            super(2, cVar2);
            this.$upstream = cVar;
            this.$shared = qVar;
            this.$initialValue = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$upstream, this.$shared, this.$initialValue, cVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 == 1) {
                    androidx.activity.s.u0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                androidx.activity.s.u0(obj);
                int i11 = a.f20077a[((SharingCommand) this.L$0).ordinal()];
                if (i11 != 1) {
                    if (i11 == 3) {
                        Object obj2 = this.$initialValue;
                        if (obj2 == ea.a.c) {
                            this.$shared.d();
                        } else {
                            this.$shared.e(obj2);
                        }
                    }
                } else {
                    c<Object> cVar = this.$upstream;
                    q<Object> qVar = this.$shared;
                    this.label = 1;
                    if (cVar.a(qVar, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            }
            return tf.d.f30009a;
        }

        @Override // cg.p
        public final Object invoke(SharingCommand sharingCommand, kotlin.coroutines.c<? super tf.d> cVar) {
            return ((AnonymousClass2) create(sharingCommand, cVar)).invokeSuspend(tf.d.f30009a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__ShareKt$launchSharing$1(y yVar, c<Object> cVar, q<Object> qVar, Object obj, kotlin.coroutines.c<? super FlowKt__ShareKt$launchSharing$1> cVar2) {
        super(2, cVar2);
        this.$started = yVar;
        this.$upstream = cVar;
        this.$shared = qVar;
        this.$initialValue = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new FlowKt__ShareKt$launchSharing$1(this.$started, this.$upstream, this.$shared, this.$initialValue, cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0082, code lost:
        if (r4.c == r3) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005f A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r7.label
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L24
            if (r1 == r5) goto L1f
            if (r1 == r4) goto L1b
            if (r1 == r3) goto L1f
            if (r1 != r2) goto L13
            goto L1f
        L13:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1b:
            androidx.activity.s.u0(r8)
            goto L53
        L1f:
            androidx.activity.s.u0(r8)
            goto L9f
        L24:
            androidx.activity.s.u0(r8)
            kotlinx.coroutines.flow.y r8 = r7.$started
            kotlinx.coroutines.flow.z r1 = kotlinx.coroutines.flow.y.a.f20153a
            if (r8 != r1) goto L3a
            kotlinx.coroutines.flow.c<java.lang.Object> r8 = r7.$upstream
            kotlinx.coroutines.flow.q<java.lang.Object> r1 = r7.$shared
            r7.label = r5
            java.lang.Object r8 = r8.a(r1, r7)
            if (r8 != r0) goto L9f
            return r0
        L3a:
            kotlinx.coroutines.flow.StartedLazily r1 = kotlinx.coroutines.flow.y.a.f20154b
            r5 = 0
            if (r8 != r1) goto L60
            kotlinx.coroutines.flow.q<java.lang.Object> r8 = r7.$shared
            kotlinx.coroutines.flow.internal.o r8 = r8.f()
            kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1 r1 = new kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1
            r1.<init>(r5)
            r7.label = r4
            java.lang.Object r8 = kotlinx.coroutines.flow.n.b(r8, r1, r7)
            if (r8 != r0) goto L53
            return r0
        L53:
            kotlinx.coroutines.flow.c<java.lang.Object> r8 = r7.$upstream
            kotlinx.coroutines.flow.q<java.lang.Object> r1 = r7.$shared
            r7.label = r3
            java.lang.Object r8 = r8.a(r1, r7)
            if (r8 != r0) goto L9f
            return r0
        L60:
            kotlinx.coroutines.flow.q<java.lang.Object> r1 = r7.$shared
            kotlinx.coroutines.flow.internal.o r1 = r1.f()
            kotlinx.coroutines.flow.c r8 = r8.a(r1)
            cg.l<java.lang.Object, java.lang.Object> r1 = kotlinx.coroutines.flow.FlowKt__DistinctKt.f20054a
            boolean r1 = r8 instanceof kotlinx.coroutines.flow.a0
            if (r1 == 0) goto L71
            goto L8b
        L71:
            cg.l<java.lang.Object, java.lang.Object> r1 = kotlinx.coroutines.flow.FlowKt__DistinctKt.f20054a
            cg.p<java.lang.Object, java.lang.Object, java.lang.Boolean> r3 = kotlinx.coroutines.flow.FlowKt__DistinctKt.f20055b
            boolean r4 = r8 instanceof kotlinx.coroutines.flow.DistinctFlowImpl
            if (r4 == 0) goto L85
            r4 = r8
            kotlinx.coroutines.flow.DistinctFlowImpl r4 = (kotlinx.coroutines.flow.DistinctFlowImpl) r4
            cg.l<T, java.lang.Object> r6 = r4.f20051b
            if (r6 != r1) goto L85
            cg.p<java.lang.Object, java.lang.Object, java.lang.Boolean> r1 = r4.c
            if (r1 != r3) goto L85
            goto L8b
        L85:
            kotlinx.coroutines.flow.DistinctFlowImpl r1 = new kotlinx.coroutines.flow.DistinctFlowImpl
            r1.<init>(r8)
            r8 = r1
        L8b:
            kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2 r1 = new kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2
            kotlinx.coroutines.flow.c<java.lang.Object> r3 = r7.$upstream
            kotlinx.coroutines.flow.q<java.lang.Object> r4 = r7.$shared
            java.lang.Object r6 = r7.$initialValue
            r1.<init>(r3, r4, r6, r5)
            r7.label = r2
            java.lang.Object r8 = aj.b.k(r8, r1, r7)
            if (r8 != r0) goto L9f
            return r0
        L9f:
            tf.d r8 = tf.d.f30009a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // cg.p
    public final Object invoke(kotlinx.coroutines.w wVar, kotlin.coroutines.c<? super tf.d> cVar) {
        return ((FlowKt__ShareKt$launchSharing$1) create(wVar, cVar)).invokeSuspend(tf.d.f30009a);
    }
}

package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.f1;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;
import pdf.pdfreader.viewer.editor.free.utils.t0;

/* compiled from: RepeatOnLifecycle.kt */
@wf.c(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3", f = "RepeatOnLifecycle.kt", l = {84}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class RepeatOnLifecycleKt$repeatOnLifecycle$3 extends SuspendLambda implements cg.p<kotlinx.coroutines.w, kotlin.coroutines.c<? super tf.d>, Object> {
    final /* synthetic */ cg.p<kotlinx.coroutines.w, kotlin.coroutines.c<? super tf.d>, Object> $block;
    final /* synthetic */ Lifecycle.State $state;
    final /* synthetic */ Lifecycle $this_repeatOnLifecycle;
    private /* synthetic */ Object L$0;
    int label;

    /* compiled from: RepeatOnLifecycle.kt */
    @wf.c(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1", f = "RepeatOnLifecycle.kt", l = {ShapeTypes.ACTION_BUTTON_BACK_PREVIOUS}, m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements cg.p<kotlinx.coroutines.w, kotlin.coroutines.c<? super tf.d>, Object> {
        final /* synthetic */ kotlinx.coroutines.w $$this$coroutineScope;
        final /* synthetic */ cg.p<kotlinx.coroutines.w, kotlin.coroutines.c<? super tf.d>, Object> $block;
        final /* synthetic */ Lifecycle.State $state;
        final /* synthetic */ Lifecycle $this_repeatOnLifecycle;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Lifecycle lifecycle, Lifecycle.State state, kotlinx.coroutines.w wVar, cg.p<? super kotlinx.coroutines.w, ? super kotlin.coroutines.c<? super tf.d>, ? extends Object> pVar, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$this_repeatOnLifecycle = lifecycle;
            this.$state = state;
            this.$$this$coroutineScope = wVar;
            this.$block = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return new AnonymousClass1(this.$this_repeatOnLifecycle, this.$state, this.$$this$coroutineScope, this.$block, cVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00bc  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00c5  */
        /* JADX WARN: Type inference failed for: r15v0, types: [androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1, T, androidx.lifecycle.o] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                r16 = this;
                r1 = r16
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r1.label
                r3 = 0
                r4 = 1
                if (r2 == 0) goto L36
                if (r2 != r4) goto L2e
                java.lang.Object r0 = r1.L$5
                cg.p r0 = (cg.p) r0
                java.lang.Object r0 = r1.L$4
                kotlinx.coroutines.w r0 = (kotlinx.coroutines.w) r0
                java.lang.Object r0 = r1.L$3
                androidx.lifecycle.Lifecycle r0 = (androidx.lifecycle.Lifecycle) r0
                java.lang.Object r0 = r1.L$2
                androidx.lifecycle.Lifecycle$State r0 = (androidx.lifecycle.Lifecycle.State) r0
                java.lang.Object r0 = r1.L$1
                r2 = r0
                kotlin.jvm.internal.Ref$ObjectRef r2 = (kotlin.jvm.internal.Ref$ObjectRef) r2
                java.lang.Object r0 = r1.L$0
                r4 = r0
                kotlin.jvm.internal.Ref$ObjectRef r4 = (kotlin.jvm.internal.Ref$ObjectRef) r4
                androidx.activity.s.u0(r17)     // Catch: java.lang.Throwable -> L2b
                goto L9c
            L2b:
                r0 = move-exception
                goto Lb6
            L2e:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r2)
                throw r0
            L36:
                androidx.activity.s.u0(r17)
                androidx.lifecycle.Lifecycle r2 = r1.$this_repeatOnLifecycle
                androidx.lifecycle.Lifecycle$State r2 = r2.b()
                androidx.lifecycle.Lifecycle$State r5 = androidx.lifecycle.Lifecycle.State.DESTROYED
                if (r2 != r5) goto L46
                tf.d r0 = tf.d.f30009a
                return r0
            L46:
                kotlin.jvm.internal.Ref$ObjectRef r2 = new kotlin.jvm.internal.Ref$ObjectRef
                r2.<init>()
                kotlin.jvm.internal.Ref$ObjectRef r12 = new kotlin.jvm.internal.Ref$ObjectRef
                r12.<init>()
                androidx.lifecycle.Lifecycle$State r5 = r1.$state     // Catch: java.lang.Throwable -> Lb3
                androidx.lifecycle.Lifecycle r13 = r1.$this_repeatOnLifecycle     // Catch: java.lang.Throwable -> Lb3
                kotlinx.coroutines.w r7 = r1.$$this$coroutineScope     // Catch: java.lang.Throwable -> Lb3
                cg.p<kotlinx.coroutines.w, kotlin.coroutines.c<? super tf.d>, java.lang.Object> r11 = r1.$block     // Catch: java.lang.Throwable -> Lb3
                r1.L$0 = r2     // Catch: java.lang.Throwable -> Lb3
                r1.L$1 = r12     // Catch: java.lang.Throwable -> Lb3
                r1.L$2 = r5     // Catch: java.lang.Throwable -> Lb3
                r1.L$3 = r13     // Catch: java.lang.Throwable -> Lb3
                r1.L$4 = r7     // Catch: java.lang.Throwable -> Lb3
                r1.L$5 = r11     // Catch: java.lang.Throwable -> Lb3
                r1.label = r4     // Catch: java.lang.Throwable -> Lb3
                kotlinx.coroutines.h r14 = new kotlinx.coroutines.h     // Catch: java.lang.Throwable -> Lb3
                kotlin.coroutines.c r6 = com.google.android.play.core.assetpacks.b1.L(r16)     // Catch: java.lang.Throwable -> Lb3
                r14.<init>(r4, r6)     // Catch: java.lang.Throwable -> Lb3
                r14.s()     // Catch: java.lang.Throwable -> Lb3
                androidx.lifecycle.Lifecycle$Event$a r4 = androidx.lifecycle.Lifecycle.Event.Companion     // Catch: java.lang.Throwable -> Lb3
                r4.getClass()     // Catch: java.lang.Throwable -> Lb3
                androidx.lifecycle.Lifecycle$Event r6 = androidx.lifecycle.Lifecycle.Event.a.c(r5)     // Catch: java.lang.Throwable -> Lb3
                androidx.lifecycle.Lifecycle$Event r8 = androidx.lifecycle.Lifecycle.Event.a.a(r5)     // Catch: java.lang.Throwable -> Lb3
                kotlinx.coroutines.sync.MutexImpl r10 = new kotlinx.coroutines.sync.MutexImpl     // Catch: java.lang.Throwable -> Lb3
                r4 = 0
                r10.<init>(r4)     // Catch: java.lang.Throwable -> Lb3
                androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1 r15 = new androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1     // Catch: java.lang.Throwable -> Lb3
                r4 = r15
                r5 = r6
                r6 = r2
                r9 = r14
                r4.<init>()     // Catch: java.lang.Throwable -> Lb3
                r12.element = r15     // Catch: java.lang.Throwable -> Lb3
                r13.a(r15)     // Catch: java.lang.Throwable -> Lb3
                java.lang.Object r4 = r14.r()     // Catch: java.lang.Throwable -> Lb3
                if (r4 != r0) goto L9a
                return r0
            L9a:
                r4 = r2
                r2 = r12
            L9c:
                T r0 = r4.element
                kotlinx.coroutines.y0 r0 = (kotlinx.coroutines.y0) r0
                if (r0 == 0) goto La5
                r0.b(r3)
            La5:
                T r0 = r2.element
                androidx.lifecycle.n r0 = (androidx.lifecycle.n) r0
                if (r0 == 0) goto Lb0
                androidx.lifecycle.Lifecycle r2 = r1.$this_repeatOnLifecycle
                r2.c(r0)
            Lb0:
                tf.d r0 = tf.d.f30009a
                return r0
            Lb3:
                r0 = move-exception
                r4 = r2
                r2 = r12
            Lb6:
                T r4 = r4.element
                kotlinx.coroutines.y0 r4 = (kotlinx.coroutines.y0) r4
                if (r4 == 0) goto Lbf
                r4.b(r3)
            Lbf:
                T r2 = r2.element
                androidx.lifecycle.n r2 = (androidx.lifecycle.n) r2
                if (r2 == 0) goto Lca
                androidx.lifecycle.Lifecycle r3 = r1.$this_repeatOnLifecycle
                r3.c(r2)
            Lca:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // cg.p
        public final Object invoke(kotlinx.coroutines.w wVar, kotlin.coroutines.c<? super tf.d> cVar) {
            return ((AnonymousClass1) create(wVar, cVar)).invokeSuspend(tf.d.f30009a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RepeatOnLifecycleKt$repeatOnLifecycle$3(Lifecycle lifecycle, Lifecycle.State state, cg.p<? super kotlinx.coroutines.w, ? super kotlin.coroutines.c<? super tf.d>, ? extends Object> pVar, kotlin.coroutines.c<? super RepeatOnLifecycleKt$repeatOnLifecycle$3> cVar) {
        super(2, cVar);
        this.$this_repeatOnLifecycle = lifecycle;
        this.$state = state;
        this.$block = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        RepeatOnLifecycleKt$repeatOnLifecycle$3 repeatOnLifecycleKt$repeatOnLifecycle$3 = new RepeatOnLifecycleKt$repeatOnLifecycle$3(this.$this_repeatOnLifecycle, this.$state, this.$block, cVar);
        repeatOnLifecycleKt$repeatOnLifecycle$3.L$0 = obj;
        return repeatOnLifecycleKt$repeatOnLifecycle$3;
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
            kotlinx.coroutines.w wVar = (kotlinx.coroutines.w) this.L$0;
            lg.b bVar = kotlinx.coroutines.j0.f20206a;
            f1 v10 = kotlinx.coroutines.internal.l.f20194a.v();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_repeatOnLifecycle, this.$state, wVar, this.$block, null);
            this.label = 1;
            if (t0.w0(v10, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return tf.d.f30009a;
    }

    @Override // cg.p
    public final Object invoke(kotlinx.coroutines.w wVar, kotlin.coroutines.c<? super tf.d> cVar) {
        return ((RepeatOnLifecycleKt$repeatOnLifecycle$3) create(wVar, cVar)).invokeSuspend(tf.d.f30009a);
    }
}

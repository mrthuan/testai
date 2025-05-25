package kotlinx.coroutines.flow;

import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* compiled from: SharingStarted.kt */
@wf.c(c = "kotlinx.coroutines.flow.StartedLazily$command$1", f = "SharingStarted.kt", l = {ShapeTypes.FLOW_CHART_MAGNETIC_DISK}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class StartedLazily$command$1 extends SuspendLambda implements cg.p<d<? super SharingCommand>, kotlin.coroutines.c<? super tf.d>, Object> {
    final /* synthetic */ a0<Integer> $subscriptionCount;
    private /* synthetic */ Object L$0;
    int label;

    /* compiled from: SharingStarted.kt */
    /* renamed from: kotlinx.coroutines.flow.StartedLazily$command$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1<T> implements d {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Ref$BooleanRef f20085a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ d<SharingCommand> f20086b;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Ref$BooleanRef ref$BooleanRef, d<? super SharingCommand> dVar) {
            this.f20085a = ref$BooleanRef;
            this.f20086b = dVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object a(int r5, kotlin.coroutines.c<? super tf.d> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof kotlinx.coroutines.flow.StartedLazily$command$1$1$emit$1
                if (r0 == 0) goto L13
                r0 = r6
                kotlinx.coroutines.flow.StartedLazily$command$1$1$emit$1 r0 = (kotlinx.coroutines.flow.StartedLazily$command$1$1$emit$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.StartedLazily$command$1$1$emit$1 r0 = new kotlinx.coroutines.flow.StartedLazily$command$1$1$emit$1
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.result
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L2f
                if (r2 != r3) goto L27
                androidx.activity.s.u0(r6)
                goto L49
            L27:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L2f:
                androidx.activity.s.u0(r6)
                if (r5 <= 0) goto L4c
                kotlin.jvm.internal.Ref$BooleanRef r5 = r4.f20085a
                boolean r6 = r5.element
                if (r6 != 0) goto L4c
                r5.element = r3
                kotlinx.coroutines.flow.SharingCommand r5 = kotlinx.coroutines.flow.SharingCommand.START
                r0.label = r3
                kotlinx.coroutines.flow.d<kotlinx.coroutines.flow.SharingCommand> r6 = r4.f20086b
                java.lang.Object r5 = r6.emit(r5, r0)
                if (r5 != r1) goto L49
                return r1
            L49:
                tf.d r5 = tf.d.f30009a
                return r5
            L4c:
                tf.d r5 = tf.d.f30009a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.StartedLazily$command$1.AnonymousClass1.a(int, kotlin.coroutines.c):java.lang.Object");
        }

        @Override // kotlinx.coroutines.flow.d
        public final /* bridge */ /* synthetic */ Object emit(Object obj, kotlin.coroutines.c cVar) {
            return a(((Number) obj).intValue(), cVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartedLazily$command$1(a0<Integer> a0Var, kotlin.coroutines.c<? super StartedLazily$command$1> cVar) {
        super(2, cVar);
        this.$subscriptionCount = a0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        StartedLazily$command$1 startedLazily$command$1 = new StartedLazily$command$1(this.$subscriptionCount, cVar);
        startedLazily$command$1.L$0 = obj;
        return startedLazily$command$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.activity.s.u0(obj);
        } else {
            androidx.activity.s.u0(obj);
            Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
            a0<Integer> a0Var = this.$subscriptionCount;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(ref$BooleanRef, (d) this.L$0);
            this.label = 1;
            if (a0Var.a(anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        throw new KotlinNothingValueException();
    }

    @Override // cg.p
    public final Object invoke(d<? super SharingCommand> dVar, kotlin.coroutines.c<? super tf.d> cVar) {
        return ((StartedLazily$command$1) create(dVar, cVar)).invokeSuspend(tf.d.f30009a);
    }
}

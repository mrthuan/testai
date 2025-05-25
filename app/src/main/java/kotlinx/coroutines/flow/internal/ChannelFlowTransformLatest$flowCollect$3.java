package kotlinx.coroutines.flow.internal;

import androidx.activity.s;
import cg.p;
import cg.q;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.w;
import kotlinx.coroutines.y0;

/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* compiled from: Merge.kt */
@wf.c(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3", f = "Merge.kt", l = {27}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class ChannelFlowTransformLatest$flowCollect$3 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super tf.d>, Object> {
    final /* synthetic */ kotlinx.coroutines.flow.d<R> $collector;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ChannelFlowTransformLatest<T, R> this$0;

    /* compiled from: Merge.kt */
    /* renamed from: kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1<T> implements kotlinx.coroutines.flow.d {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef<y0> f20099a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ w f20100b;
        public final /* synthetic */ ChannelFlowTransformLatest<T, R> c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.flow.d<R> f20101d;

        /* compiled from: Merge.kt */
        @wf.c(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2", f = "Merge.kt", l = {34}, m = "invokeSuspend")
        /* renamed from: kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2  reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass2 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super tf.d>, Object> {
            final /* synthetic */ kotlinx.coroutines.flow.d<R> $collector;
            final /* synthetic */ T $value;
            int label;
            final /* synthetic */ ChannelFlowTransformLatest<T, R> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass2(ChannelFlowTransformLatest<T, R> channelFlowTransformLatest, kotlinx.coroutines.flow.d<? super R> dVar, T t4, kotlin.coroutines.c<? super AnonymousClass2> cVar) {
                super(2, cVar);
                this.this$0 = channelFlowTransformLatest;
                this.$collector = dVar;
                this.$value = t4;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
                return new AnonymousClass2(this.this$0, this.$collector, this.$value, cVar);
            }

            @Override // cg.p
            public /* bridge */ /* synthetic */ Object invoke(w wVar, kotlin.coroutines.c<? super tf.d> cVar) {
                return invoke2(wVar, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.label;
                if (i10 != 0) {
                    if (i10 == 1) {
                        s.u0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    s.u0(obj);
                    q<kotlinx.coroutines.flow.d<? super R>, T, kotlin.coroutines.c<? super tf.d>, Object> qVar = this.this$0.f20098e;
                    Object obj3 = this.$collector;
                    T t4 = this.$value;
                    this.label = 1;
                    if (qVar.invoke(obj3, t4, this) == obj2) {
                        return obj2;
                    }
                }
                return tf.d.f30009a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final Object invoke2(w wVar, kotlin.coroutines.c<? super tf.d> cVar) {
                return ((AnonymousClass2) create(wVar, cVar)).invokeSuspend(tf.d.f30009a);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Ref$ObjectRef<y0> ref$ObjectRef, w wVar, ChannelFlowTransformLatest<T, R> channelFlowTransformLatest, kotlinx.coroutines.flow.d<? super R> dVar) {
            this.f20099a = ref$ObjectRef;
            this.f20100b = wVar;
            this.c = channelFlowTransformLatest;
            this.f20101d = dVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
        @Override // kotlinx.coroutines.flow.d
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(T r8, kotlin.coroutines.c<? super tf.d> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$emit$1
                if (r0 == 0) goto L13
                r0 = r9
                kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$emit$1 r0 = (kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$emit$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$emit$1 r0 = new kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$emit$1
                r0.<init>(r7, r9)
            L18:
                java.lang.Object r9 = r0.result
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L39
                if (r2 != r3) goto L31
                java.lang.Object r8 = r0.L$2
                kotlinx.coroutines.y0 r8 = (kotlinx.coroutines.y0) r8
                java.lang.Object r8 = r0.L$1
                java.lang.Object r0 = r0.L$0
                kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1 r0 = (kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3.AnonymousClass1) r0
                androidx.activity.s.u0(r9)
                goto L5c
            L31:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L39:
                androidx.activity.s.u0(r9)
                kotlin.jvm.internal.Ref$ObjectRef<kotlinx.coroutines.y0> r9 = r7.f20099a
                T r9 = r9.element
                kotlinx.coroutines.y0 r9 = (kotlinx.coroutines.y0) r9
                if (r9 == 0) goto L5b
                kotlinx.coroutines.flow.internal.ChildCancelledException r2 = new kotlinx.coroutines.flow.internal.ChildCancelledException
                r2.<init>()
                r9.b(r2)
                r0.L$0 = r7
                r0.L$1 = r8
                r0.L$2 = r9
                r0.label = r3
                java.lang.Object r9 = r9.h(r0)
                if (r9 != r1) goto L5b
                return r1
            L5b:
                r0 = r7
            L5c:
                kotlin.jvm.internal.Ref$ObjectRef<kotlinx.coroutines.y0> r9 = r0.f20099a
                kotlinx.coroutines.CoroutineStart r1 = kotlinx.coroutines.CoroutineStart.UNDISPATCHED
                kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2 r2 = new kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2
                kotlinx.coroutines.flow.d<R> r4 = r0.f20101d
                kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest<T, R> r5 = r0.c
                r6 = 0
                r2.<init>(r5, r4, r8, r6)
                kotlinx.coroutines.w r8 = r0.f20100b
                kotlinx.coroutines.l1 r8 = pdf.pdfreader.viewer.editor.free.utils.t0.d0(r8, r6, r1, r2, r3)
                r9.element = r8
                tf.d r8 = tf.d.f30009a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3.AnonymousClass1.emit(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChannelFlowTransformLatest$flowCollect$3(ChannelFlowTransformLatest<T, R> channelFlowTransformLatest, kotlinx.coroutines.flow.d<? super R> dVar, kotlin.coroutines.c<? super ChannelFlowTransformLatest$flowCollect$3> cVar) {
        super(2, cVar);
        this.this$0 = channelFlowTransformLatest;
        this.$collector = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        ChannelFlowTransformLatest$flowCollect$3 channelFlowTransformLatest$flowCollect$3 = new ChannelFlowTransformLatest$flowCollect$3(this.this$0, this.$collector, cVar);
        channelFlowTransformLatest$flowCollect$3.L$0 = obj;
        return channelFlowTransformLatest$flowCollect$3;
    }

    @Override // cg.p
    public /* bridge */ /* synthetic */ Object invoke(w wVar, kotlin.coroutines.c<? super tf.d> cVar) {
        return invoke2(wVar, cVar);
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
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            ChannelFlowTransformLatest<T, R> channelFlowTransformLatest = this.this$0;
            kotlinx.coroutines.flow.c<S> cVar = channelFlowTransformLatest.f20117d;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(ref$ObjectRef, (w) this.L$0, channelFlowTransformLatest, this.$collector);
            this.label = 1;
            if (cVar.a(anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return tf.d.f30009a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(w wVar, kotlin.coroutines.c<? super tf.d> cVar) {
        return ((ChannelFlowTransformLatest$flowCollect$3) create(wVar, cVar)).invokeSuspend(tf.d.f30009a);
    }
}

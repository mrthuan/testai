package kotlinx.coroutines.flow;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import lib.zj.office.fc.hslf.record.SlideAtom;

/* compiled from: SafeCollector.common.kt */
/* loaded from: classes.dex */
public final class FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 implements c<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f20078a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ cg.p f20079b;

    /* compiled from: Emitters.kt */
    /* renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2<T> implements d {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f20080a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ cg.p f20081b;

        /* compiled from: Emitters.kt */
        @wf.c(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2", f = "Transform.kt", l = {223, 224}, m = "emit")
        /* renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1  reason: invalid class name */
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
                return AnonymousClass2.this.emit(null, this);
            }
        }

        public AnonymousClass2(d dVar, cg.p pVar) {
            this.f20080a = dVar;
            this.f20081b = pVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x005f A[RETURN] */
        @Override // kotlinx.coroutines.flow.d
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(T r6, kotlin.coroutines.c<? super tf.d> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1.AnonymousClass2.AnonymousClass1
                if (r0 == 0) goto L13
                r0 = r7
                kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1 r0 = (kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1.AnonymousClass2.AnonymousClass1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1 r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.result
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r0.label
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L3c
                if (r2 == r4) goto L32
                if (r2 != r3) goto L2a
                androidx.activity.s.u0(r7)
                goto L60
            L2a:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L32:
                java.lang.Object r6 = r0.L$1
                kotlinx.coroutines.flow.d r6 = (kotlinx.coroutines.flow.d) r6
                java.lang.Object r2 = r0.L$0
                androidx.activity.s.u0(r7)
                goto L52
            L3c:
                androidx.activity.s.u0(r7)
                r0.L$0 = r6
                kotlinx.coroutines.flow.d r7 = r5.f20080a
                r0.L$1 = r7
                r0.label = r4
                cg.p r2 = r5.f20081b
                java.lang.Object r2 = r2.invoke(r6, r0)
                if (r2 != r1) goto L50
                return r1
            L50:
                r2 = r6
                r6 = r7
            L52:
                r7 = 0
                r0.L$0 = r7
                r0.L$1 = r7
                r0.label = r3
                java.lang.Object r6 = r6.emit(r2, r0)
                if (r6 != r1) goto L60
                return r1
            L60:
                tf.d r6 = tf.d.f30009a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
        }
    }

    public FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(cg.p pVar, c cVar) {
        this.f20078a = cVar;
        this.f20079b = pVar;
    }

    @Override // kotlinx.coroutines.flow.c
    public final Object a(d<? super Object> dVar, kotlin.coroutines.c cVar) {
        Object a10 = this.f20078a.a(new AnonymousClass2(dVar, this.f20079b), cVar);
        if (a10 == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return a10;
        }
        return tf.d.f30009a;
    }
}

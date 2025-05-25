package kotlinx.coroutines.flow.internal;

import androidx.activity.s;
import cg.p;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: Combine.kt */
@wf.c(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1", f = "Combine.kt", l = {89}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class CombineKt$zipImpl$1$1$second$1 extends SuspendLambda implements p<kotlinx.coroutines.channels.j<? super Object>, kotlin.coroutines.c<? super tf.d>, Object> {
    final /* synthetic */ kotlinx.coroutines.flow.c<Object> $flow2;
    private /* synthetic */ Object L$0;
    int label;

    /* compiled from: Combine.kt */
    /* renamed from: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1<T> implements kotlinx.coroutines.flow.d {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.channels.j<Object> f20108a;

        public AnonymousClass1(kotlinx.coroutines.channels.j<Object> jVar) {
            this.f20108a = jVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
        @Override // kotlinx.coroutines.flow.d
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.c<? super tf.d> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1$1$emit$1
                if (r0 == 0) goto L13
                r0 = r6
                kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1$1$emit$1 r0 = (kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1$1$emit$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1$1$emit$1 r0 = new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1$1$emit$1
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.result
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L2f
                if (r2 != r3) goto L27
                androidx.activity.s.u0(r6)
                goto L45
            L27:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L2f:
                androidx.activity.s.u0(r6)
                kotlinx.coroutines.channels.j<java.lang.Object> r6 = r4.f20108a
                kotlinx.coroutines.channels.i r6 = r6.l()
                if (r5 != 0) goto L3c
                com.android.billingclient.api.a0 r5 = ea.a.f16519d
            L3c:
                r0.label = r3
                java.lang.Object r5 = r6.x(r5, r0)
                if (r5 != r1) goto L45
                return r1
            L45:
                tf.d r5 = tf.d.f30009a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1.AnonymousClass1.emit(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CombineKt$zipImpl$1$1$second$1(kotlinx.coroutines.flow.c<Object> cVar, kotlin.coroutines.c<? super CombineKt$zipImpl$1$1$second$1> cVar2) {
        super(2, cVar2);
        this.$flow2 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        CombineKt$zipImpl$1$1$second$1 combineKt$zipImpl$1$1$second$1 = new CombineKt$zipImpl$1$1$second$1(this.$flow2, cVar);
        combineKt$zipImpl$1$1$second$1.L$0 = obj;
        return combineKt$zipImpl$1$1$second$1;
    }

    @Override // cg.p
    public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.channels.j<? super Object> jVar, kotlin.coroutines.c<? super tf.d> cVar) {
        return invoke2((kotlinx.coroutines.channels.j<Object>) jVar, cVar);
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
            kotlinx.coroutines.flow.c<Object> cVar = this.$flow2;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1((kotlinx.coroutines.channels.j) this.L$0);
            this.label = 1;
            if (cVar.a(anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return tf.d.f30009a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(kotlinx.coroutines.channels.j<Object> jVar, kotlin.coroutines.c<? super tf.d> cVar) {
        return ((CombineKt$zipImpl$1$1$second$1) create(jVar, cVar)).invokeSuspend(tf.d.f30009a);
    }
}

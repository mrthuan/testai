package pdf.pdfreader.viewer.editor.free.feature.billing.ui;

import androidx.activity.s;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.v;
import kotlinx.coroutines.w;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;
import pm.b;

/* compiled from: SubscriptionBlackFridayActivity.kt */
@wf.c(c = "pdf.pdfreader.viewer.editor.free.feature.billing.ui.SubscriptionBlackFridayActivity$initViewModel$1", f = "SubscriptionBlackFridayActivity.kt", l = {ShapeTypes.FLOW_CHART_MAGNETIC_DRUM}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class SubscriptionBlackFridayActivity$initViewModel$1 extends SuspendLambda implements cg.p<w, kotlin.coroutines.c<? super tf.d>, Object> {
    int label;
    final /* synthetic */ SubscriptionBlackFridayActivity this$0;

    /* compiled from: SubscriptionBlackFridayActivity.kt */
    @wf.c(c = "pdf.pdfreader.viewer.editor.free.feature.billing.ui.SubscriptionBlackFridayActivity$initViewModel$1$1", f = "SubscriptionBlackFridayActivity.kt", l = {ShapeTypes.FLOW_CHART_DISPLAY}, m = "invokeSuspend")
    /* renamed from: pdf.pdfreader.viewer.editor.free.feature.billing.ui.SubscriptionBlackFridayActivity$initViewModel$1$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements cg.p<w, kotlin.coroutines.c<? super tf.d>, Object> {
        int label;
        final /* synthetic */ SubscriptionBlackFridayActivity this$0;

        /* compiled from: SubscriptionBlackFridayActivity.kt */
        @wf.c(c = "pdf.pdfreader.viewer.editor.free.feature.billing.ui.SubscriptionBlackFridayActivity$initViewModel$1$1$1", f = "SubscriptionBlackFridayActivity.kt", l = {}, m = "invokeSuspend")
        /* renamed from: pdf.pdfreader.viewer.editor.free.feature.billing.ui.SubscriptionBlackFridayActivity$initViewModel$1$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C03371 extends SuspendLambda implements cg.p<pm.b, kotlin.coroutines.c<? super tf.d>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ SubscriptionBlackFridayActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03371(SubscriptionBlackFridayActivity subscriptionBlackFridayActivity, kotlin.coroutines.c<? super C03371> cVar) {
                super(2, cVar);
                this.this$0 = subscriptionBlackFridayActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
                C03371 c03371 = new C03371(this.this$0, cVar);
                c03371.L$0 = obj;
                return c03371;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label == 0) {
                    s.u0(obj);
                    pm.b bVar = (pm.b) this.L$0;
                    if (bVar instanceof b.a) {
                        this.this$0.p2();
                    } else if (kotlin.jvm.internal.g.a(bVar, b.C0364b.f28976a)) {
                        this.this$0.n2();
                    } else if (kotlin.jvm.internal.g.a(bVar, b.c.f28977a)) {
                        this.this$0.o2();
                    } else if (kotlin.jvm.internal.g.a(bVar, b.d.f28978a)) {
                        this.this$0.r2();
                    } else if (!(bVar instanceof b.h)) {
                        if (!(bVar instanceof b.g) && !(bVar instanceof b.e)) {
                            boolean z10 = bVar instanceof b.f;
                        }
                    } else {
                        SubscriptionBlackFridayActivity subscriptionBlackFridayActivity = this.this$0;
                        ((b.h) bVar).getClass();
                        subscriptionBlackFridayActivity.y2(null);
                        throw null;
                    }
                    return tf.d.f30009a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // cg.p
            public final Object invoke(pm.b bVar, kotlin.coroutines.c<? super tf.d> cVar) {
                return ((C03371) create(bVar, cVar)).invokeSuspend(tf.d.f30009a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SubscriptionBlackFridayActivity subscriptionBlackFridayActivity, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.this$0 = subscriptionBlackFridayActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return new AnonymousClass1(this.this$0, cVar);
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
                v vVar = this.this$0.j2().f24949e;
                C03371 c03371 = new C03371(this.this$0, null);
                this.label = 1;
                if (aj.b.k(vVar, c03371, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return tf.d.f30009a;
        }

        @Override // cg.p
        public final Object invoke(w wVar, kotlin.coroutines.c<? super tf.d> cVar) {
            return ((AnonymousClass1) create(wVar, cVar)).invokeSuspend(tf.d.f30009a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriptionBlackFridayActivity$initViewModel$1(SubscriptionBlackFridayActivity subscriptionBlackFridayActivity, kotlin.coroutines.c<? super SubscriptionBlackFridayActivity$initViewModel$1> cVar) {
        super(2, cVar);
        this.this$0 = subscriptionBlackFridayActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new SubscriptionBlackFridayActivity$initViewModel$1(this.this$0, cVar);
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
            Lifecycle lifecycle = this.this$0.getLifecycle();
            kotlin.jvm.internal.g.d(lifecycle, "lifecycle");
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.a(lifecycle, state, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return tf.d.f30009a;
    }

    @Override // cg.p
    public final Object invoke(w wVar, kotlin.coroutines.c<? super tf.d> cVar) {
        return ((SubscriptionBlackFridayActivity$initViewModel$1) create(wVar, cVar)).invokeSuspend(tf.d.f30009a);
    }
}

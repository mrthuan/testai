package pdf.pdfreader.viewer.editor.free.feature.billing.ui;

import androidx.activity.s;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.w;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;
import pdf.pdfreader.viewer.editor.free.billing.BillingRepository;

/* compiled from: BaseSubscriptionActivity.kt */
@wf.c(c = "pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity$initViewModel$1", f = "BaseSubscriptionActivity.kt", l = {ShapeTypes.ACTION_BUTTON_DOCUMENT}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class BaseSubscriptionActivity$initViewModel$1 extends SuspendLambda implements cg.p<w, kotlin.coroutines.c<? super tf.d>, Object> {
    int label;
    final /* synthetic */ BaseSubscriptionActivity this$0;

    /* compiled from: BaseSubscriptionActivity.kt */
    @wf.c(c = "pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity$initViewModel$1$1", f = "BaseSubscriptionActivity.kt", l = {ShapeTypes.FUNNEL, ShapeTypes.MATH_MULTIPLY}, m = "invokeSuspend")
    /* renamed from: pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity$initViewModel$1$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements cg.p<w, kotlin.coroutines.c<? super tf.d>, Object> {
        int label;
        final /* synthetic */ BaseSubscriptionActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BaseSubscriptionActivity baseSubscriptionActivity, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.this$0 = baseSubscriptionActivity;
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
                if (i10 == 1 || i10 == 2) {
                    s.u0(obj);
                    ((Result) obj).m21unboximpl();
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                s.u0(obj);
                BaseSubscriptionActivity.L.getClass();
                if (BaseSubscriptionActivity.M) {
                    return tf.d.f30009a;
                }
                if (!kotlin.jvm.internal.g.a(this.this$0.j2().f24956l, ol.e.c) && !kotlin.jvm.internal.g.a(this.this$0.j2().f24956l, ol.e.f23480d)) {
                    BillingRepository billingRepository = BillingRepository.f24041a;
                    this.label = 2;
                    if (billingRepository.b(this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    BillingRepository billingRepository2 = BillingRepository.f24041a;
                    this.label = 1;
                    if (billingRepository2.d(this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
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
    public BaseSubscriptionActivity$initViewModel$1(BaseSubscriptionActivity baseSubscriptionActivity, kotlin.coroutines.c<? super BaseSubscriptionActivity$initViewModel$1> cVar) {
        super(2, cVar);
        this.this$0 = baseSubscriptionActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new BaseSubscriptionActivity$initViewModel$1(this.this$0, cVar);
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
        return ((BaseSubscriptionActivity$initViewModel$1) create(wVar, cVar)).invokeSuspend(tf.d.f30009a);
    }
}

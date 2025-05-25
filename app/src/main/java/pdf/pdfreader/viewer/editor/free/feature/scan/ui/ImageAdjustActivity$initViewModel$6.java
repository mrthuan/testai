package pdf.pdfreader.viewer.editor.free.feature.scan.ui;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import pdf.pdfreader.viewer.editor.free.billing.BillingRepository;

/* compiled from: ImageAdjustActivity.kt */
@wf.c(c = "pdf.pdfreader.viewer.editor.free.feature.scan.ui.ImageAdjustActivity$initViewModel$6", f = "ImageAdjustActivity.kt", l = {1502}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ImageAdjustActivity$initViewModel$6 extends SuspendLambda implements cg.p<kotlinx.coroutines.w, kotlin.coroutines.c<? super tf.d>, Object> {
    int label;
    final /* synthetic */ ImageAdjustActivity this$0;

    /* compiled from: ImageAdjustActivity.kt */
    @wf.c(c = "pdf.pdfreader.viewer.editor.free.feature.scan.ui.ImageAdjustActivity$initViewModel$6$1", f = "ImageAdjustActivity.kt", l = {1503}, m = "invokeSuspend")
    /* renamed from: pdf.pdfreader.viewer.editor.free.feature.scan.ui.ImageAdjustActivity$initViewModel$6$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements cg.p<kotlinx.coroutines.w, kotlin.coroutines.c<? super tf.d>, Object> {
        int label;

        public AnonymousClass1(kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return new AnonymousClass1(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 == 1) {
                    androidx.activity.s.u0(obj);
                    ((Result) obj).m21unboximpl();
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                androidx.activity.s.u0(obj);
                BillingRepository billingRepository = BillingRepository.f24041a;
                this.label = 1;
                if (billingRepository.b(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return tf.d.f30009a;
        }

        @Override // cg.p
        public final Object invoke(kotlinx.coroutines.w wVar, kotlin.coroutines.c<? super tf.d> cVar) {
            return ((AnonymousClass1) create(wVar, cVar)).invokeSuspend(tf.d.f30009a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageAdjustActivity$initViewModel$6(ImageAdjustActivity imageAdjustActivity, kotlin.coroutines.c<? super ImageAdjustActivity$initViewModel$6> cVar) {
        super(2, cVar);
        this.this$0 = imageAdjustActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new ImageAdjustActivity$initViewModel$6(this.this$0, cVar);
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
            Lifecycle lifecycle = this.this$0.getLifecycle();
            kotlin.jvm.internal.g.d(lifecycle, "lifecycle");
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
            this.label = 1;
            if (RepeatOnLifecycleKt.a(lifecycle, state, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return tf.d.f30009a;
    }

    @Override // cg.p
    public final Object invoke(kotlinx.coroutines.w wVar, kotlin.coroutines.c<? super tf.d> cVar) {
        return ((ImageAdjustActivity$initViewModel$6) create(wVar, cVar)).invokeSuspend(tf.d.f30009a);
    }
}

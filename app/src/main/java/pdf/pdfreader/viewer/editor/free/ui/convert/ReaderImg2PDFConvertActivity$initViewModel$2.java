package pdf.pdfreader.viewer.editor.free.ui.convert;

import androidx.activity.s;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import cg.p;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g;
import kotlinx.coroutines.w;
import pdf.pdfreader.viewer.editor.free.billing.BillingRepository;

/* compiled from: ReaderImg2PDFConvertActivity.kt */
@wf.c(c = "pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImg2PDFConvertActivity$initViewModel$2", f = "ReaderImg2PDFConvertActivity.kt", l = {282}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ReaderImg2PDFConvertActivity$initViewModel$2 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super tf.d>, Object> {
    int label;
    final /* synthetic */ ReaderImg2PDFConvertActivity this$0;

    /* compiled from: ReaderImg2PDFConvertActivity.kt */
    @wf.c(c = "pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImg2PDFConvertActivity$initViewModel$2$1", f = "ReaderImg2PDFConvertActivity.kt", l = {283}, m = "invokeSuspend")
    /* renamed from: pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImg2PDFConvertActivity$initViewModel$2$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super tf.d>, Object> {
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
                    s.u0(obj);
                    ((Result) obj).m21unboximpl();
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                s.u0(obj);
                BillingRepository billingRepository = BillingRepository.f24041a;
                this.label = 1;
                if (billingRepository.b(this) == coroutineSingletons) {
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
    public ReaderImg2PDFConvertActivity$initViewModel$2(ReaderImg2PDFConvertActivity readerImg2PDFConvertActivity, kotlin.coroutines.c<? super ReaderImg2PDFConvertActivity$initViewModel$2> cVar) {
        super(2, cVar);
        this.this$0 = readerImg2PDFConvertActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new ReaderImg2PDFConvertActivity$initViewModel$2(this.this$0, cVar);
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
            g.d(lifecycle, "lifecycle");
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
    public final Object invoke(w wVar, kotlin.coroutines.c<? super tf.d> cVar) {
        return ((ReaderImg2PDFConvertActivity$initViewModel$2) create(wVar, cVar)).invokeSuspend(tf.d.f30009a);
    }
}

package pdf.pdfreader.viewer.editor.free.ui.convert;

import androidx.activity.s;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import cg.p;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.w;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.feature.ocr.data.OCRWorkFlow;

/* compiled from: ReaderImgPreviewActivity.kt */
@wf.c(c = "pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImgPreviewActivity$initViewModel$1", f = "ReaderImgPreviewActivity.kt", l = {268}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ReaderImgPreviewActivity$initViewModel$1 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super tf.d>, Object> {
    int label;
    final /* synthetic */ ReaderImgPreviewActivity this$0;

    /* compiled from: ReaderImgPreviewActivity.kt */
    @wf.c(c = "pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImgPreviewActivity$initViewModel$1$1", f = "ReaderImgPreviewActivity.kt", l = {269}, m = "invokeSuspend")
    /* renamed from: pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImgPreviewActivity$initViewModel$1$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super tf.d>, Object> {
        int label;
        final /* synthetic */ ReaderImgPreviewActivity this$0;

        /* compiled from: ReaderImgPreviewActivity.kt */
        /* renamed from: pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImgPreviewActivity$initViewModel$1$1$a */
        /* loaded from: classes3.dex */
        public static final class a<T> implements kotlinx.coroutines.flow.d {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ ReaderImgPreviewActivity f27409a;

            public a(ReaderImgPreviewActivity readerImgPreviewActivity) {
                this.f27409a = readerImgPreviewActivity;
            }

            @Override // kotlinx.coroutines.flow.d
            public final Object emit(Object obj, kotlin.coroutines.c cVar) {
                OCRWorkFlow oCRWorkFlow = (OCRWorkFlow) obj;
                if (oCRWorkFlow == OCRWorkFlow.TOOLS_CAMERA || oCRWorkFlow == OCRWorkFlow.TOOLS_CHOOSE || oCRWorkFlow == OCRWorkFlow.IMG_PREVIEW) {
                    this.f27409a.finish();
                }
                return tf.d.f30009a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ReaderImgPreviewActivity readerImgPreviewActivity, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.this$0 = readerImgPreviewActivity;
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
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.u0(obj);
            } else {
                s.u0(obj);
                StateFlowImpl stateFlowImpl = ReaderPdfApplication.k().f28156m;
                a aVar = new a(this.this$0);
                this.label = 1;
                if (stateFlowImpl.a(aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            throw new KotlinNothingValueException();
        }

        @Override // cg.p
        public final Object invoke(w wVar, kotlin.coroutines.c<? super tf.d> cVar) {
            return ((AnonymousClass1) create(wVar, cVar)).invokeSuspend(tf.d.f30009a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderImgPreviewActivity$initViewModel$1(ReaderImgPreviewActivity readerImgPreviewActivity, kotlin.coroutines.c<? super ReaderImgPreviewActivity$initViewModel$1> cVar) {
        super(2, cVar);
        this.this$0 = readerImgPreviewActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new ReaderImgPreviewActivity$initViewModel$1(this.this$0, cVar);
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
        return ((ReaderImgPreviewActivity$initViewModel$1) create(wVar, cVar)).invokeSuspend(tf.d.f30009a);
    }
}

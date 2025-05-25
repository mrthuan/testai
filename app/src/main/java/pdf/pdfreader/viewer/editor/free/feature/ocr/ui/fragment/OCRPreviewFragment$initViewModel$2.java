package pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment;

import android.content.Context;
import androidx.activity.s;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.q;
import cg.p;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g;
import kotlinx.coroutines.w;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;
import pdf.pdfreader.viewer.editor.free.feature.ocr.data.OcrUploadResult;
import pdf.pdfreader.viewer.editor.free.feature.ocr.dialog.OCRLoadingDialog;
import pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.OCRPreviewFragment;
import pdf.pdfreader.viewer.editor.free.feature.ocr.vm.OCRResultViewModel;
import pdf.pdfreader.viewer.editor.free.utils.event.OCREventCenter;
import tf.d;

/* compiled from: OCRPreviewFragment.kt */
@wf.c(c = "pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.OCRPreviewFragment$initViewModel$2", f = "OCRPreviewFragment.kt", l = {ShapeTypes.ACTION_BUTTON_HELP}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class OCRPreviewFragment$initViewModel$2 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super d>, Object> {
    int label;
    final /* synthetic */ OCRPreviewFragment this$0;

    /* compiled from: OCRPreviewFragment.kt */
    @wf.c(c = "pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.OCRPreviewFragment$initViewModel$2$1", f = "OCRPreviewFragment.kt", l = {164}, m = "invokeSuspend")
    /* renamed from: pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.OCRPreviewFragment$initViewModel$2$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super d>, Object> {
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ OCRPreviewFragment this$0;

        /* compiled from: OCRPreviewFragment.kt */
        /* renamed from: pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.OCRPreviewFragment$initViewModel$2$1$a */
        /* loaded from: classes3.dex */
        public static final class a<T> implements kotlinx.coroutines.flow.d {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ OCRPreviewFragment f25186a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ w f25187b;

            public a(OCRPreviewFragment oCRPreviewFragment, w wVar) {
                this.f25186a = oCRPreviewFragment;
                this.f25187b = wVar;
            }

            @Override // kotlinx.coroutines.flow.d
            public final Object emit(Object obj, kotlin.coroutines.c cVar) {
                OcrUploadResult ocrUploadResult = (OcrUploadResult) obj;
                OcrUploadResult ocrUploadResult2 = OcrUploadResult.SHOW_LOADING;
                OCRPreviewFragment oCRPreviewFragment = this.f25186a;
                if (ocrUploadResult == ocrUploadResult2) {
                    OCREventCenter.g();
                    oCRPreviewFragment.f25179m0 = System.currentTimeMillis();
                    OCRLoadingDialog oCRLoadingDialog = oCRPreviewFragment.f25172f0;
                    if (oCRLoadingDialog != null) {
                        oCRLoadingDialog.show();
                    } else {
                        Context r4 = oCRPreviewFragment.r();
                        if (r4 == null) {
                            return d.f30009a;
                        }
                        OCRLoadingDialog oCRLoadingDialog2 = new OCRLoadingDialog(r4);
                        oCRPreviewFragment.f25172f0 = oCRLoadingDialog2;
                        oCRLoadingDialog2.show();
                    }
                    OCRLoadingDialog oCRLoadingDialog3 = oCRPreviewFragment.f25172f0;
                    if (oCRLoadingDialog3 != null) {
                        oCRLoadingDialog3.setOnCancelListener(new pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.a(oCRPreviewFragment, 0));
                    }
                } else {
                    OCRLoadingDialog oCRLoadingDialog4 = oCRPreviewFragment.f25172f0;
                    if (oCRLoadingDialog4 != null) {
                        oCRLoadingDialog4.dismiss();
                    }
                }
                return d.f30009a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(OCRPreviewFragment oCRPreviewFragment, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.this$0 = oCRPreviewFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<d> create(Object obj, kotlin.coroutines.c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
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
                OCRPreviewFragment oCRPreviewFragment = this.this$0;
                OCRPreviewFragment.a aVar = OCRPreviewFragment.f25168p0;
                OCRResultViewModel y02 = oCRPreviewFragment.y0();
                a aVar2 = new a(this.this$0, (w) this.L$0);
                this.label = 1;
                if (y02.f25236f.a(aVar2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            throw new KotlinNothingValueException();
        }

        @Override // cg.p
        public final Object invoke(w wVar, kotlin.coroutines.c<? super d> cVar) {
            return ((AnonymousClass1) create(wVar, cVar)).invokeSuspend(d.f30009a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OCRPreviewFragment$initViewModel$2(OCRPreviewFragment oCRPreviewFragment, kotlin.coroutines.c<? super OCRPreviewFragment$initViewModel$2> cVar) {
        super(2, cVar);
        this.this$0 = oCRPreviewFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new OCRPreviewFragment$initViewModel$2(this.this$0, cVar);
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
            q lifecycle = this.this$0.P;
            g.d(lifecycle, "lifecycle");
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.a(lifecycle, state, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return d.f30009a;
    }

    @Override // cg.p
    public final Object invoke(w wVar, kotlin.coroutines.c<? super d> cVar) {
        return ((OCRPreviewFragment$initViewModel$2) create(wVar, cVar)).invokeSuspend(d.f30009a);
    }
}

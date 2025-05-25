package pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment;

import am.w0;
import android.content.Context;
import android.content.DialogInterface;
import androidx.activity.s;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.q;
import cg.p;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.w;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.feature.ocr.data.OcrUploadResult;
import pdf.pdfreader.viewer.editor.free.feature.ocr.dialog.OCRLoadingDialog;
import pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.OCRResultFragment;
import pdf.pdfreader.viewer.editor.free.feature.ocr.vm.OCRResultViewModel;
import pdf.pdfreader.viewer.editor.free.utils.event.OCREventCenter;
import tf.d;

/* compiled from: OCRResultFragment.kt */
@wf.c(c = "pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.OCRResultFragment$initViewModel$2", f = "OCRResultFragment.kt", l = {323}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class OCRResultFragment$initViewModel$2 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super d>, Object> {
    int label;
    final /* synthetic */ OCRResultFragment this$0;

    /* compiled from: OCRResultFragment.kt */
    @wf.c(c = "pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.OCRResultFragment$initViewModel$2$1", f = "OCRResultFragment.kt", l = {324}, m = "invokeSuspend")
    /* renamed from: pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.OCRResultFragment$initViewModel$2$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super d>, Object> {
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ OCRResultFragment this$0;

        /* compiled from: OCRResultFragment.kt */
        /* renamed from: pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.OCRResultFragment$initViewModel$2$1$a */
        /* loaded from: classes3.dex */
        public static final class a<T> implements kotlinx.coroutines.flow.d {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ OCRResultFragment f25215a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ w f25216b;

            public a(OCRResultFragment oCRResultFragment, w wVar) {
                this.f25215a = oCRResultFragment;
                this.f25216b = wVar;
            }

            @Override // kotlinx.coroutines.flow.d
            public final Object emit(Object obj, kotlin.coroutines.c cVar) {
                OcrUploadResult ocrUploadResult = (OcrUploadResult) obj;
                OcrUploadResult ocrUploadResult2 = OcrUploadResult.SHOW_LOADING;
                final OCRResultFragment oCRResultFragment = this.f25215a;
                if (ocrUploadResult == ocrUploadResult2) {
                    OCREventCenter.g();
                    oCRResultFragment.f25202o0 = System.currentTimeMillis();
                    OCRLoadingDialog oCRLoadingDialog = oCRResultFragment.f25194g0;
                    if (oCRLoadingDialog != null) {
                        oCRLoadingDialog.show();
                    } else {
                        Context r4 = oCRResultFragment.r();
                        if (r4 == null) {
                            return d.f30009a;
                        }
                        OCRLoadingDialog oCRLoadingDialog2 = new OCRLoadingDialog(r4);
                        oCRResultFragment.f25194g0 = oCRLoadingDialog2;
                        oCRLoadingDialog2.show();
                    }
                    OCRLoadingDialog oCRLoadingDialog3 = oCRResultFragment.f25194g0;
                    if (oCRLoadingDialog3 != null) {
                        oCRLoadingDialog3.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.c
                            @Override // android.content.DialogInterface.OnCancelListener
                            public final void onCancel(DialogInterface dialogInterface) {
                                String p10 = ea.a.p("O2hYc10w", "EZzJPsmF");
                                OCRResultFragment oCRResultFragment2 = OCRResultFragment.this;
                                g.e(oCRResultFragment2, p10);
                                l1 l1Var = oCRResultFragment2.f25198k0;
                                if (l1Var != null) {
                                    l1Var.b(null);
                                }
                                oCRResultFragment2.A0().e();
                                oCRResultFragment2.f25199l0 = null;
                                VB vb2 = oCRResultFragment2.Y;
                                g.b(vb2);
                                ((w0) vb2).f1590q.setText("");
                                VB vb3 = oCRResultFragment2.Y;
                                g.b(vb3);
                                ((w0) vb3).f1590q.setVisibility(8);
                                VB vb4 = oCRResultFragment2.Y;
                                g.b(vb4);
                                ((w0) vb4).f1582i.setVisibility(8);
                                VB vb5 = oCRResultFragment2.Y;
                                g.b(vb5);
                                ((w0) vb5).B.setText(R.string.arg_res_0x7f130130);
                                VB vb6 = oCRResultFragment2.Y;
                                g.b(vb6);
                                ((w0) vb6).A.setVisibility(0);
                                tf.c cVar2 = OCREventCenter.f28670a;
                                OCREventCenter.l(ea.a.p("UGElYxZs", "miARKwak"));
                            }
                        });
                    }
                } else {
                    OCRLoadingDialog oCRLoadingDialog4 = oCRResultFragment.f25194g0;
                    if (oCRLoadingDialog4 != null) {
                        oCRLoadingDialog4.dismiss();
                    }
                }
                return d.f30009a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(OCRResultFragment oCRResultFragment, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.this$0 = oCRResultFragment;
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
                OCRResultFragment oCRResultFragment = this.this$0;
                OCRResultFragment.a aVar = OCRResultFragment.f25189r0;
                OCRResultViewModel A0 = oCRResultFragment.A0();
                a aVar2 = new a(this.this$0, (w) this.L$0);
                this.label = 1;
                if (A0.f25236f.a(aVar2, this) == coroutineSingletons) {
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
    public OCRResultFragment$initViewModel$2(OCRResultFragment oCRResultFragment, kotlin.coroutines.c<? super OCRResultFragment$initViewModel$2> cVar) {
        super(2, cVar);
        this.this$0 = oCRResultFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new OCRResultFragment$initViewModel$2(this.this$0, cVar);
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
        return ((OCRResultFragment$initViewModel$2) create(wVar, cVar)).invokeSuspend(d.f30009a);
    }
}

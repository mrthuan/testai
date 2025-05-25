package pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment;

import androidx.activity.s;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.q;
import cg.p;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.w;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;
import pdf.pdfreader.viewer.editor.free.feature.billing.BillingConfigImpl;
import pdf.pdfreader.viewer.editor.free.feature.ocr.helper.OCRStateManager;
import pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.OCRPreviewFragment;
import tf.d;

/* compiled from: OCRPreviewFragment.kt */
@wf.c(c = "pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.OCRPreviewFragment$initViewModel$3", f = "OCRPreviewFragment.kt", l = {ShapeTypes.CHART_X}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class OCRPreviewFragment$initViewModel$3 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super d>, Object> {
    int label;
    final /* synthetic */ OCRPreviewFragment this$0;

    /* compiled from: OCRPreviewFragment.kt */
    @wf.c(c = "pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.OCRPreviewFragment$initViewModel$3$1", f = "OCRPreviewFragment.kt", l = {ShapeTypes.CHART_STAR}, m = "invokeSuspend")
    /* renamed from: pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.OCRPreviewFragment$initViewModel$3$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super d>, Object> {
        int label;
        final /* synthetic */ OCRPreviewFragment this$0;

        /* compiled from: OCRPreviewFragment.kt */
        /* renamed from: pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.OCRPreviewFragment$initViewModel$3$1$a */
        /* loaded from: classes3.dex */
        public static final class a<T> implements kotlinx.coroutines.flow.d {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ OCRPreviewFragment f25188a;

            public a(OCRPreviewFragment oCRPreviewFragment) {
                this.f25188a = oCRPreviewFragment;
            }

            @Override // kotlinx.coroutines.flow.d
            public final Object emit(Object obj, kotlin.coroutines.c cVar) {
                ((Boolean) obj).booleanValue();
                OCRPreviewFragment.a aVar = OCRPreviewFragment.f25168p0;
                OCRPreviewFragment oCRPreviewFragment = this.f25188a;
                oCRPreviewFragment.getClass();
                OCRStateManager.a aVar2 = OCRStateManager.f25059a;
                OCRPreviewFragment$refreshOCRState$1 oCRPreviewFragment$refreshOCRState$1 = new OCRPreviewFragment$refreshOCRState$1(oCRPreviewFragment);
                aVar2.getClass();
                OCRStateManager.a.b(oCRPreviewFragment$refreshOCRState$1);
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
                BillingConfigImpl.c.getClass();
                StateFlowImpl stateFlowImpl = BillingConfigImpl.f24856j;
                a aVar = new a(this.this$0);
                this.label = 1;
                if (stateFlowImpl.a(aVar, this) == coroutineSingletons) {
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
    public OCRPreviewFragment$initViewModel$3(OCRPreviewFragment oCRPreviewFragment, kotlin.coroutines.c<? super OCRPreviewFragment$initViewModel$3> cVar) {
        super(2, cVar);
        this.this$0 = oCRPreviewFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new OCRPreviewFragment$initViewModel$3(this.this$0, cVar);
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
        return ((OCRPreviewFragment$initViewModel$3) create(wVar, cVar)).invokeSuspend(d.f30009a);
    }
}

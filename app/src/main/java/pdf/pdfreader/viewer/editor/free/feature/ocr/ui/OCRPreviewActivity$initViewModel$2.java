package pdf.pdfreader.viewer.editor.free.feature.ocr.ui;

import androidx.activity.s;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import cg.p;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g;
import kotlinx.coroutines.flow.v;
import kotlinx.coroutines.w;
import pdf.pdfreader.viewer.editor.free.feature.ocr.ui.OCRPreviewActivity;
import pdf.pdfreader.viewer.editor.free.feature.ocr.vm.OCRPreviewViewModel;
import tf.d;
import wf.c;

/* compiled from: OCRPreviewActivity.kt */
@c(c = "pdf.pdfreader.viewer.editor.free.feature.ocr.ui.OCRPreviewActivity$initViewModel$2", f = "OCRPreviewActivity.kt", l = {90}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class OCRPreviewActivity$initViewModel$2 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super d>, Object> {
    int label;
    final /* synthetic */ OCRPreviewActivity this$0;

    /* compiled from: OCRPreviewActivity.kt */
    @c(c = "pdf.pdfreader.viewer.editor.free.feature.ocr.ui.OCRPreviewActivity$initViewModel$2$1", f = "OCRPreviewActivity.kt", l = {91}, m = "invokeSuspend")
    /* renamed from: pdf.pdfreader.viewer.editor.free.feature.ocr.ui.OCRPreviewActivity$initViewModel$2$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super d>, Object> {
        int label;
        final /* synthetic */ OCRPreviewActivity this$0;

        /* compiled from: OCRPreviewActivity.kt */
        /* renamed from: pdf.pdfreader.viewer.editor.free.feature.ocr.ui.OCRPreviewActivity$initViewModel$2$1$a */
        /* loaded from: classes3.dex */
        public static final class a<T> implements kotlinx.coroutines.flow.d {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ OCRPreviewActivity f25099a;

            public a(OCRPreviewActivity oCRPreviewActivity) {
                this.f25099a = oCRPreviewActivity;
            }

            @Override // kotlinx.coroutines.flow.d
            public final Object emit(Object obj, kotlin.coroutines.c cVar) {
                ((Boolean) obj).booleanValue();
                OCRPreviewActivity.a2(this.f25099a);
                return d.f30009a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(OCRPreviewActivity oCRPreviewActivity, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.this$0 = oCRPreviewActivity;
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
                OCRPreviewActivity oCRPreviewActivity = this.this$0;
                OCRPreviewActivity.a aVar = OCRPreviewActivity.f25092x;
                v vVar = ((OCRPreviewViewModel) oCRPreviewActivity.f25095u.getValue()).f25233e;
                a aVar2 = new a(this.this$0);
                this.label = 1;
                vVar.getClass();
                if (v.n(vVar, aVar2, this) == coroutineSingletons) {
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
    public OCRPreviewActivity$initViewModel$2(OCRPreviewActivity oCRPreviewActivity, kotlin.coroutines.c<? super OCRPreviewActivity$initViewModel$2> cVar) {
        super(2, cVar);
        this.this$0 = oCRPreviewActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new OCRPreviewActivity$initViewModel$2(this.this$0, cVar);
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
        return d.f30009a;
    }

    @Override // cg.p
    public final Object invoke(w wVar, kotlin.coroutines.c<? super d> cVar) {
        return ((OCRPreviewActivity$initViewModel$2) create(wVar, cVar)).invokeSuspend(d.f30009a);
    }
}

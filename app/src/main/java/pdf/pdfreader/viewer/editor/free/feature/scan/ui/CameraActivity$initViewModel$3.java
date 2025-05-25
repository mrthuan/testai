package pdf.pdfreader.viewer.editor.free.feature.scan.ui;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.StateFlowImpl;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.feature.ocr.data.OCRWorkFlow;

/* compiled from: CameraActivity.kt */
@wf.c(c = "pdf.pdfreader.viewer.editor.free.feature.scan.ui.CameraActivity$initViewModel$3", f = "CameraActivity.kt", l = {1278}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class CameraActivity$initViewModel$3 extends SuspendLambda implements cg.p<kotlinx.coroutines.w, kotlin.coroutines.c<? super tf.d>, Object> {
    int label;
    final /* synthetic */ CameraActivity this$0;

    /* compiled from: CameraActivity.kt */
    @wf.c(c = "pdf.pdfreader.viewer.editor.free.feature.scan.ui.CameraActivity$initViewModel$3$1", f = "CameraActivity.kt", l = {1279}, m = "invokeSuspend")
    /* renamed from: pdf.pdfreader.viewer.editor.free.feature.scan.ui.CameraActivity$initViewModel$3$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements cg.p<kotlinx.coroutines.w, kotlin.coroutines.c<? super tf.d>, Object> {
        int label;
        final /* synthetic */ CameraActivity this$0;

        /* compiled from: CameraActivity.kt */
        /* renamed from: pdf.pdfreader.viewer.editor.free.feature.scan.ui.CameraActivity$initViewModel$3$1$a */
        /* loaded from: classes3.dex */
        public static final class a<T> implements kotlinx.coroutines.flow.d {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ CameraActivity f25740a;

            public a(CameraActivity cameraActivity) {
                this.f25740a = cameraActivity;
            }

            @Override // kotlinx.coroutines.flow.d
            public final Object emit(Object obj, kotlin.coroutines.c cVar) {
                OCRWorkFlow oCRWorkFlow = (OCRWorkFlow) obj;
                if (oCRWorkFlow == OCRWorkFlow.TOOLS_CAMERA || oCRWorkFlow == OCRWorkFlow.TOOLS_CHOOSE || oCRWorkFlow == OCRWorkFlow.IMG_PREVIEW) {
                    this.f25740a.finish();
                }
                return tf.d.f30009a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CameraActivity cameraActivity, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.this$0 = cameraActivity;
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
                androidx.activity.s.u0(obj);
            } else {
                androidx.activity.s.u0(obj);
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
        public final Object invoke(kotlinx.coroutines.w wVar, kotlin.coroutines.c<? super tf.d> cVar) {
            return ((AnonymousClass1) create(wVar, cVar)).invokeSuspend(tf.d.f30009a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraActivity$initViewModel$3(CameraActivity cameraActivity, kotlin.coroutines.c<? super CameraActivity$initViewModel$3> cVar) {
        super(2, cVar);
        this.this$0 = cameraActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new CameraActivity$initViewModel$3(this.this$0, cVar);
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
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.a(lifecycle, state, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return tf.d.f30009a;
    }

    @Override // cg.p
    public final Object invoke(kotlinx.coroutines.w wVar, kotlin.coroutines.c<? super tf.d> cVar) {
        return ((CameraActivity$initViewModel$3) create(wVar, cVar)).invokeSuspend(tf.d.f30009a);
    }
}

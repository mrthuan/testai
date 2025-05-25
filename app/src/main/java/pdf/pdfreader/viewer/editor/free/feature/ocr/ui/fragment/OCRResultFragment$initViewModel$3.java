package pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment;

import am.w0;
import android.os.Handler;
import androidx.activity.s;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.q;
import cg.p;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g;
import kotlinx.coroutines.flow.v;
import kotlinx.coroutines.w;
import pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.OCRResultFragment;
import tf.d;

/* compiled from: OCRResultFragment.kt */
@wf.c(c = "pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.OCRResultFragment$initViewModel$3", f = "OCRResultFragment.kt", l = {346}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class OCRResultFragment$initViewModel$3 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super d>, Object> {
    int label;
    final /* synthetic */ OCRResultFragment this$0;

    /* compiled from: OCRResultFragment.kt */
    @wf.c(c = "pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.OCRResultFragment$initViewModel$3$1", f = "OCRResultFragment.kt", l = {347}, m = "invokeSuspend")
    /* renamed from: pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.OCRResultFragment$initViewModel$3$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super d>, Object> {
        int label;
        final /* synthetic */ OCRResultFragment this$0;

        /* compiled from: OCRResultFragment.kt */
        /* renamed from: pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.OCRResultFragment$initViewModel$3$1$a */
        /* loaded from: classes3.dex */
        public static final class a<T> implements kotlinx.coroutines.flow.d {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ OCRResultFragment f25217a;

            public a(OCRResultFragment oCRResultFragment) {
                this.f25217a = oCRResultFragment;
            }

            @Override // kotlinx.coroutines.flow.d
            public final Object emit(Object obj, kotlin.coroutines.c cVar) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                OCRResultFragment oCRResultFragment = this.f25217a;
                Handler handler = oCRResultFragment.f25200m0;
                b bVar = oCRResultFragment.f25201n0;
                handler.removeCallbacks(bVar);
                if (booleanValue) {
                    VB vb2 = oCRResultFragment.Y;
                    g.b(vb2);
                    ((w0) vb2).c.setVisibility(8);
                    VB vb3 = oCRResultFragment.Y;
                    g.b(vb3);
                    ((w0) vb3).f1583j.setVisibility(8);
                } else {
                    oCRResultFragment.f25200m0.postDelayed(bVar, 10L);
                }
                VB vb4 = oCRResultFragment.Y;
                g.b(vb4);
                ((w0) vb4).f1590q.setCursorVisible(booleanValue);
                if (!booleanValue) {
                    VB vb5 = oCRResultFragment.Y;
                    g.b(vb5);
                    ((w0) vb5).f1590q.clearFocus();
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
                OCRResultFragment oCRResultFragment = this.this$0;
                OCRResultFragment.a aVar = OCRResultFragment.f25189r0;
                v vVar = oCRResultFragment.A0().f25243m;
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
    public OCRResultFragment$initViewModel$3(OCRResultFragment oCRResultFragment, kotlin.coroutines.c<? super OCRResultFragment$initViewModel$3> cVar) {
        super(2, cVar);
        this.this$0 = oCRResultFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new OCRResultFragment$initViewModel$3(this.this$0, cVar);
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
        return ((OCRResultFragment$initViewModel$3) create(wVar, cVar)).invokeSuspend(d.f30009a);
    }
}

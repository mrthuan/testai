package pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment;

import am.x0;
import androidx.activity.s;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.q;
import androidx.recyclerview.widget.RecyclerView;
import cg.p;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g;
import kotlinx.coroutines.w;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;
import pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.OCRSelectTextFragment;
import pdf.pdfreader.viewer.editor.free.feature.ocr.vm.OCRResultViewModel;
import tf.d;

/* compiled from: OCRSelectTextFragment.kt */
@wf.c(c = "pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.OCRSelectTextFragment$initViewModel$1", f = "OCRSelectTextFragment.kt", l = {ShapeTypes.FLOW_CHART_OFFLINE_STORAGE}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class OCRSelectTextFragment$initViewModel$1 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super d>, Object> {
    int label;
    final /* synthetic */ OCRSelectTextFragment this$0;

    /* compiled from: OCRSelectTextFragment.kt */
    @wf.c(c = "pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.OCRSelectTextFragment$initViewModel$1$1", f = "OCRSelectTextFragment.kt", l = {153}, m = "invokeSuspend")
    /* renamed from: pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.OCRSelectTextFragment$initViewModel$1$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super d>, Object> {
        int label;
        final /* synthetic */ OCRSelectTextFragment this$0;

        /* compiled from: OCRSelectTextFragment.kt */
        /* renamed from: pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.OCRSelectTextFragment$initViewModel$1$1$a */
        /* loaded from: classes3.dex */
        public static final class a<T> implements kotlinx.coroutines.flow.d {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ OCRSelectTextFragment f25226a;

            public a(OCRSelectTextFragment oCRSelectTextFragment) {
                this.f25226a = oCRSelectTextFragment;
            }

            @Override // kotlinx.coroutines.flow.d
            public final Object emit(Object obj, kotlin.coroutines.c cVar) {
                List list = (List) obj;
                boolean isEmpty = list.isEmpty();
                OCRSelectTextFragment oCRSelectTextFragment = this.f25226a;
                if (isEmpty) {
                    ((OCRResultViewModel) oCRSelectTextFragment.f25219c0.getValue()).j();
                } else {
                    OCRSelectTextFragment.a aVar = OCRSelectTextFragment.f25218g0;
                    oCRSelectTextFragment.u0().clear();
                    oCRSelectTextFragment.u0().addAll(list);
                    VB vb2 = oCRSelectTextFragment.Y;
                    g.b(vb2);
                    RecyclerView.Adapter adapter = ((x0) vb2).f1635g.getAdapter();
                    if (adapter != null) {
                        adapter.notifyDataSetChanged();
                    }
                    oCRSelectTextFragment.v0();
                }
                return d.f30009a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(OCRSelectTextFragment oCRSelectTextFragment, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.this$0 = oCRSelectTextFragment;
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
                a aVar = new a(this.this$0);
                this.label = 1;
                if (((OCRResultViewModel) this.this$0.f25219c0.getValue()).f25237g.a(aVar, this) == coroutineSingletons) {
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
    public OCRSelectTextFragment$initViewModel$1(OCRSelectTextFragment oCRSelectTextFragment, kotlin.coroutines.c<? super OCRSelectTextFragment$initViewModel$1> cVar) {
        super(2, cVar);
        this.this$0 = oCRSelectTextFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new OCRSelectTextFragment$initViewModel$1(this.this$0, cVar);
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
        return ((OCRSelectTextFragment$initViewModel$1) create(wVar, cVar)).invokeSuspend(d.f30009a);
    }
}

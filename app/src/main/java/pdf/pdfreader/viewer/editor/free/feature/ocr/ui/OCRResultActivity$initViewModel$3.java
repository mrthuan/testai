package pdf.pdfreader.viewer.editor.free.feature.ocr.ui;

import am.t;
import androidx.activity.s;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.g0;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import cg.p;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g;
import kotlinx.coroutines.w;
import pdf.pdfreader.viewer.editor.free.feature.ocr.ui.OCRResultActivity;
import pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.OCRSelectTextFragment;
import pdf.pdfreader.viewer.editor.free.feature.ocr.vm.OCRResultViewModel;
import tf.d;
import wf.c;

/* compiled from: OCRResultActivity.kt */
@c(c = "pdf.pdfreader.viewer.editor.free.feature.ocr.ui.OCRResultActivity$initViewModel$3", f = "OCRResultActivity.kt", l = {120}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class OCRResultActivity$initViewModel$3 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super d>, Object> {
    int label;
    final /* synthetic */ OCRResultActivity this$0;

    /* compiled from: OCRResultActivity.kt */
    @c(c = "pdf.pdfreader.viewer.editor.free.feature.ocr.ui.OCRResultActivity$initViewModel$3$1", f = "OCRResultActivity.kt", l = {121}, m = "invokeSuspend")
    /* renamed from: pdf.pdfreader.viewer.editor.free.feature.ocr.ui.OCRResultActivity$initViewModel$3$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super d>, Object> {
        int label;
        final /* synthetic */ OCRResultActivity this$0;

        /* compiled from: OCRResultActivity.kt */
        /* renamed from: pdf.pdfreader.viewer.editor.free.feature.ocr.ui.OCRResultActivity$initViewModel$3$1$a */
        /* loaded from: classes3.dex */
        public static final class a<T> implements kotlinx.coroutines.flow.d {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ OCRResultActivity f25111a;

            public a(OCRResultActivity oCRResultActivity) {
                this.f25111a = oCRResultActivity;
            }

            @Override // kotlinx.coroutines.flow.d
            public final Object emit(Object obj, kotlin.coroutines.c cVar) {
                if (!((List) obj).isEmpty()) {
                    OCRResultActivity oCRResultActivity = this.f25111a;
                    Fragment D = oCRResultActivity.getSupportFragmentManager().D("OCRSelectTextFragment");
                    if (D == null) {
                        OCRSelectTextFragment.a aVar = OCRSelectTextFragment.f25218g0;
                        g0 supportFragmentManager = oCRResultActivity.getSupportFragmentManager();
                        g.d(supportFragmentManager, "supportFragmentManager");
                        OCRResultActivity.a aVar2 = OCRResultActivity.f25101x;
                        int id2 = ((t) oCRResultActivity.f25104t.getValue()).f1461b.getId();
                        aVar.getClass();
                        OCRSelectTextFragment oCRSelectTextFragment = new OCRSelectTextFragment();
                        String p10 = ea.a.p("AENjUxxsUmMuVC94AUYaYVJtC250", "Jx6ectNL");
                        try {
                            androidx.fragment.app.a aVar3 = new androidx.fragment.app.a(supportFragmentManager);
                            aVar3.c(id2, oCRSelectTextFragment, p10, 1);
                            aVar3.i();
                        } catch (Exception e10) {
                            e10.printStackTrace();
                        }
                    } else {
                        g0 supportFragmentManager2 = oCRResultActivity.getSupportFragmentManager();
                        g.d(supportFragmentManager2, "supportFragmentManager");
                        try {
                            androidx.fragment.app.a aVar4 = new androidx.fragment.app.a(supportFragmentManager2);
                            aVar4.o(D);
                            aVar4.i();
                        } catch (Exception e11) {
                            e11.printStackTrace();
                        }
                    }
                }
                return d.f30009a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(OCRResultActivity oCRResultActivity, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.this$0 = oCRResultActivity;
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
                OCRResultActivity oCRResultActivity = this.this$0;
                OCRResultActivity.a aVar = OCRResultActivity.f25101x;
                OCRResultViewModel b22 = oCRResultActivity.b2();
                a aVar2 = new a(this.this$0);
                this.label = 1;
                if (b22.f25237g.a(aVar2, this) == coroutineSingletons) {
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
    public OCRResultActivity$initViewModel$3(OCRResultActivity oCRResultActivity, kotlin.coroutines.c<? super OCRResultActivity$initViewModel$3> cVar) {
        super(2, cVar);
        this.this$0 = oCRResultActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new OCRResultActivity$initViewModel$3(this.this$0, cVar);
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
        return ((OCRResultActivity$initViewModel$3) create(wVar, cVar)).invokeSuspend(d.f30009a);
    }
}

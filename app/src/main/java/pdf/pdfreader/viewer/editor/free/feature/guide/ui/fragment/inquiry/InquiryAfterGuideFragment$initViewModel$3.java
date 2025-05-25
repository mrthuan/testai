package pdf.pdfreader.viewer.editor.free.feature.guide.ui.fragment.inquiry;

import aj.b;
import android.content.Context;
import androidx.activity.s;
import androidx.fragment.app.g0;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.q;
import cg.p;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g;
import kotlinx.coroutines.flow.v;
import kotlinx.coroutines.w;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.feature.guide.ui.fragment.inquiry.InquiryAfterGuideFragment;
import tf.d;
import tm.a;
import wf.c;

/* compiled from: InquiryAfterGuideFragment.kt */
@c(c = "pdf.pdfreader.viewer.editor.free.feature.guide.ui.fragment.inquiry.InquiryAfterGuideFragment$initViewModel$3", f = "InquiryAfterGuideFragment.kt", l = {122}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class InquiryAfterGuideFragment$initViewModel$3 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super d>, Object> {
    int label;
    final /* synthetic */ InquiryAfterGuideFragment this$0;

    /* compiled from: InquiryAfterGuideFragment.kt */
    @c(c = "pdf.pdfreader.viewer.editor.free.feature.guide.ui.fragment.inquiry.InquiryAfterGuideFragment$initViewModel$3$1", f = "InquiryAfterGuideFragment.kt", l = {123}, m = "invokeSuspend")
    /* renamed from: pdf.pdfreader.viewer.editor.free.feature.guide.ui.fragment.inquiry.InquiryAfterGuideFragment$initViewModel$3$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super d>, Object> {
        int label;
        final /* synthetic */ InquiryAfterGuideFragment this$0;

        /* compiled from: InquiryAfterGuideFragment.kt */
        @c(c = "pdf.pdfreader.viewer.editor.free.feature.guide.ui.fragment.inquiry.InquiryAfterGuideFragment$initViewModel$3$1$1", f = "InquiryAfterGuideFragment.kt", l = {}, m = "invokeSuspend")
        /* renamed from: pdf.pdfreader.viewer.editor.free.feature.guide.ui.fragment.inquiry.InquiryAfterGuideFragment$initViewModel$3$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C03411 extends SuspendLambda implements p<a, kotlin.coroutines.c<? super d>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ InquiryAfterGuideFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03411(InquiryAfterGuideFragment inquiryAfterGuideFragment, kotlin.coroutines.c<? super C03411> cVar) {
                super(2, cVar);
                this.this$0 = inquiryAfterGuideFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.c<d> create(Object obj, kotlin.coroutines.c<?> cVar) {
                C03411 c03411 = new C03411(this.this$0, cVar);
                c03411.L$0 = obj;
                return c03411;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                int i10;
                int i11;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label == 0) {
                    s.u0(obj);
                    if (((a) this.L$0) instanceof a.C0378a) {
                        InquiryAfterGuideFragment inquiryAfterGuideFragment = this.this$0;
                        InquiryAfterGuideFragment.a aVar = InquiryAfterGuideFragment.f25030e0;
                        if (inquiryAfterGuideFragment.u0().d()) {
                            Context context = InquiryAfterGuideFragment.t0(this.this$0).f1462a.getContext();
                            g.d(context, "binding.root.context");
                            boolean j10 = pdf.pdfreader.viewer.editor.free.utils.extension.c.j(context);
                            InquiryAfterGuidePageFragment e10 = this.this$0.u0().e();
                            g0 q5 = this.this$0.q();
                            q5.getClass();
                            androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(q5);
                            if (j10) {
                                i10 = R.anim.slide_right_in;
                            } else {
                                i10 = R.anim.slide_left_in;
                            }
                            if (j10) {
                                i11 = R.anim.slide_left_out;
                            } else {
                                i11 = R.anim.slide_right_out;
                            }
                            aVar2.e(i10, i11);
                            aVar2.d(InquiryAfterGuideFragment.t0(this.this$0).c.getId(), e10, null);
                            if (!aVar2.f3903g) {
                                aVar2.f3733p.z(aVar2, true);
                            } else {
                                throw new IllegalStateException("This transaction is already being added to the back stack");
                            }
                        }
                    }
                    return d.f30009a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // cg.p
            public final Object invoke(a aVar, kotlin.coroutines.c<? super d> cVar) {
                return ((C03411) create(aVar, cVar)).invokeSuspend(d.f30009a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InquiryAfterGuideFragment inquiryAfterGuideFragment, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.this$0 = inquiryAfterGuideFragment;
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
                if (i10 == 1) {
                    s.u0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                s.u0(obj);
                InquiryAfterGuideFragment inquiryAfterGuideFragment = this.this$0;
                InquiryAfterGuideFragment.a aVar = InquiryAfterGuideFragment.f25030e0;
                v vVar = inquiryAfterGuideFragment.u0().f25042f;
                C03411 c03411 = new C03411(this.this$0, null);
                this.label = 1;
                if (b.k(vVar, c03411, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return d.f30009a;
        }

        @Override // cg.p
        public final Object invoke(w wVar, kotlin.coroutines.c<? super d> cVar) {
            return ((AnonymousClass1) create(wVar, cVar)).invokeSuspend(d.f30009a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InquiryAfterGuideFragment$initViewModel$3(InquiryAfterGuideFragment inquiryAfterGuideFragment, kotlin.coroutines.c<? super InquiryAfterGuideFragment$initViewModel$3> cVar) {
        super(2, cVar);
        this.this$0 = inquiryAfterGuideFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new InquiryAfterGuideFragment$initViewModel$3(this.this$0, cVar);
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
        return ((InquiryAfterGuideFragment$initViewModel$3) create(wVar, cVar)).invokeSuspend(d.f30009a);
    }
}

package pdf.pdfreader.viewer.editor.free.ui.feature.debug;

import am.i;
import am.t1;
import androidx.activity.s;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import cg.p;
import com.airbnb.lottie.LottieAnimationView;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g;
import kotlinx.coroutines.w;
import tf.d;

/* compiled from: ReaderDebugActivity.kt */
@wf.c(c = "pdf.pdfreader.viewer.editor.free.ui.feature.debug.ReaderDebugActivity$initViewModel$1", f = "ReaderDebugActivity.kt", l = {116}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class ReaderDebugActivity$initViewModel$1 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super d>, Object> {
    int label;
    final /* synthetic */ ReaderDebugActivity this$0;

    /* compiled from: ReaderDebugActivity.kt */
    @wf.c(c = "pdf.pdfreader.viewer.editor.free.ui.feature.debug.ReaderDebugActivity$initViewModel$1$1", f = "ReaderDebugActivity.kt", l = {117}, m = "invokeSuspend")
    /* renamed from: pdf.pdfreader.viewer.editor.free.ui.feature.debug.ReaderDebugActivity$initViewModel$1$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super d>, Object> {
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ReaderDebugActivity this$0;

        /* compiled from: ReaderDebugActivity.kt */
        @wf.c(c = "pdf.pdfreader.viewer.editor.free.ui.feature.debug.ReaderDebugActivity$initViewModel$1$1$1", f = "ReaderDebugActivity.kt", l = {}, m = "invokeSuspend")
        /* renamed from: pdf.pdfreader.viewer.editor.free.ui.feature.debug.ReaderDebugActivity$initViewModel$1$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C03541 extends SuspendLambda implements p<Boolean, kotlin.coroutines.c<? super d>, Object> {
            final /* synthetic */ w $$this$repeatOnLifecycle;
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ ReaderDebugActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03541(ReaderDebugActivity readerDebugActivity, w wVar, kotlin.coroutines.c<? super C03541> cVar) {
                super(2, cVar);
                this.this$0 = readerDebugActivity;
                this.$$this$repeatOnLifecycle = wVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.c<d> create(Object obj, kotlin.coroutines.c<?> cVar) {
                C03541 c03541 = new C03541(this.this$0, this.$$this$repeatOnLifecycle, cVar);
                c03541.Z$0 = ((Boolean) obj).booleanValue();
                return c03541;
            }

            @Override // cg.p
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, kotlin.coroutines.c<? super d> cVar) {
                return invoke(bool.booleanValue(), cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object m13constructorimpl;
                i iVar;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label == 0) {
                    s.u0(obj);
                    ConstraintLayout constraintLayout = null;
                    if (this.Z$0) {
                        ReaderDebugActivity readerDebugActivity = this.this$0;
                        t1 t1Var = readerDebugActivity.c;
                        if (t1Var != null) {
                            t1Var.f1467b.setVisibility(0);
                            ((LottieAnimationView) t1Var.c).j();
                        } else {
                            try {
                                iVar = readerDebugActivity.f27845a;
                            } catch (Throwable th2) {
                                m13constructorimpl = Result.m13constructorimpl(s.v(th2));
                            }
                            if (iVar != null) {
                                m13constructorimpl = Result.m13constructorimpl(iVar.f966e.inflate());
                                Result.m12boximpl(m13constructorimpl);
                            } else {
                                g.i("binding");
                                throw null;
                            }
                        }
                    } else {
                        t1 t1Var2 = this.this$0.c;
                        if (t1Var2 != null) {
                            constraintLayout = t1Var2.f1467b;
                        }
                        if (constraintLayout != null) {
                            constraintLayout.setVisibility(8);
                        }
                    }
                    return d.f30009a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            public final Object invoke(boolean z10, kotlin.coroutines.c<? super d> cVar) {
                return ((C03541) create(Boolean.valueOf(z10), cVar)).invokeSuspend(d.f30009a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ReaderDebugActivity readerDebugActivity, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.this$0 = readerDebugActivity;
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
                if (i10 == 1) {
                    s.u0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                s.u0(obj);
                ReaderDebugActivity readerDebugActivity = this.this$0;
                boolean z10 = ReaderDebugActivity.f27826e;
                C03541 c03541 = new C03541(this.this$0, (w) this.L$0, null);
                this.label = 1;
                if (aj.b.k(((ReaderDebugViewModel) readerDebugActivity.f27846b.getValue()).f27851e, c03541, this) == coroutineSingletons) {
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
    public ReaderDebugActivity$initViewModel$1(ReaderDebugActivity readerDebugActivity, kotlin.coroutines.c<? super ReaderDebugActivity$initViewModel$1> cVar) {
        super(2, cVar);
        this.this$0 = readerDebugActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new ReaderDebugActivity$initViewModel$1(this.this$0, cVar);
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
        return ((ReaderDebugActivity$initViewModel$1) create(wVar, cVar)).invokeSuspend(d.f30009a);
    }
}

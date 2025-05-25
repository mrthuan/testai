package pdf.pdfreader.viewer.editor.free.ui.convert;

import android.widget.LinearLayout;
import androidx.activity.s;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import cg.p;
import gl.k;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.g;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.w;
import pdf.pdfreader.viewer.editor.free.feature.billing.BillingConfigImpl;

/* compiled from: ReaderImg2PDFChooseActivity.kt */
@wf.c(c = "pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImg2PDFChooseActivity$initViewModel$7", f = "ReaderImg2PDFChooseActivity.kt", l = {1103}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ReaderImg2PDFChooseActivity$initViewModel$7 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super tf.d>, Object> {
    int label;
    final /* synthetic */ ReaderImg2PDFChooseActivity this$0;

    /* compiled from: ReaderImg2PDFChooseActivity.kt */
    @wf.c(c = "pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImg2PDFChooseActivity$initViewModel$7$1", f = "ReaderImg2PDFChooseActivity.kt", l = {1104}, m = "invokeSuspend")
    /* renamed from: pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImg2PDFChooseActivity$initViewModel$7$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super tf.d>, Object> {
        final /* synthetic */ Ref$ObjectRef<Boolean> $lastPremiumState;
        int label;
        final /* synthetic */ ReaderImg2PDFChooseActivity this$0;

        /* compiled from: ReaderImg2PDFChooseActivity.kt */
        /* renamed from: pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImg2PDFChooseActivity$initViewModel$7$1$a */
        /* loaded from: classes3.dex */
        public static final class a<T> implements kotlinx.coroutines.flow.d {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Ref$ObjectRef<Boolean> f27375a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ ReaderImg2PDFChooseActivity f27376b;

            public a(Ref$ObjectRef<Boolean> ref$ObjectRef, ReaderImg2PDFChooseActivity readerImg2PDFChooseActivity) {
                this.f27375a = ref$ObjectRef;
                this.f27376b = readerImg2PDFChooseActivity;
            }

            @Override // kotlinx.coroutines.flow.d
            public final Object emit(Object obj, kotlin.coroutines.c cVar) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                Ref$ObjectRef<Boolean> ref$ObjectRef = this.f27375a;
                Boolean bool = ref$ObjectRef.element;
                if (bool == null) {
                    ref$ObjectRef.element = (T) Boolean.valueOf(booleanValue);
                } else if (!g.a(bool, Boolean.valueOf(booleanValue))) {
                    ReaderImg2PDFChooseActivity readerImg2PDFChooseActivity = this.f27376b;
                    if (booleanValue) {
                        LinearLayout linearLayout = readerImg2PDFChooseActivity.T;
                        if (linearLayout != null) {
                            linearLayout.removeAllViews();
                            k.f17927a.getClass();
                            k.b(readerImg2PDFChooseActivity);
                        } else {
                            g.i("layoutAdBottom");
                            throw null;
                        }
                    } else {
                        k kVar = k.f17927a;
                        LinearLayout linearLayout2 = readerImg2PDFChooseActivity.T;
                        if (linearLayout2 != null) {
                            kVar.getClass();
                            k.d(readerImg2PDFChooseActivity, linearLayout2);
                        } else {
                            g.i("layoutAdBottom");
                            throw null;
                        }
                    }
                    ref$ObjectRef.element = (T) Boolean.valueOf(booleanValue);
                }
                return tf.d.f30009a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Ref$ObjectRef<Boolean> ref$ObjectRef, ReaderImg2PDFChooseActivity readerImg2PDFChooseActivity, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$lastPremiumState = ref$ObjectRef;
            this.this$0 = readerImg2PDFChooseActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return new AnonymousClass1(this.$lastPremiumState, this.this$0, cVar);
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
                a aVar = new a(this.$lastPremiumState, this.this$0);
                this.label = 1;
                if (stateFlowImpl.a(aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            throw new KotlinNothingValueException();
        }

        @Override // cg.p
        public final Object invoke(w wVar, kotlin.coroutines.c<? super tf.d> cVar) {
            return ((AnonymousClass1) create(wVar, cVar)).invokeSuspend(tf.d.f30009a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderImg2PDFChooseActivity$initViewModel$7(ReaderImg2PDFChooseActivity readerImg2PDFChooseActivity, kotlin.coroutines.c<? super ReaderImg2PDFChooseActivity$initViewModel$7> cVar) {
        super(2, cVar);
        this.this$0 = readerImg2PDFChooseActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new ReaderImg2PDFChooseActivity$initViewModel$7(this.this$0, cVar);
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
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            Lifecycle lifecycle = this.this$0.getLifecycle();
            g.d(lifecycle, "lifecycle");
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(ref$ObjectRef, this.this$0, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.a(lifecycle, state, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return tf.d.f30009a;
    }

    @Override // cg.p
    public final Object invoke(w wVar, kotlin.coroutines.c<? super tf.d> cVar) {
        return ((ReaderImg2PDFChooseActivity$initViewModel$7) create(wVar, cVar)).invokeSuspend(tf.d.f30009a);
    }
}

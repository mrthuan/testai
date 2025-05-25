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
import kotlin.jvm.internal.g;
import kotlinx.coroutines.flow.v;
import kotlinx.coroutines.w;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.ads.s.network.NetworkType;

/* compiled from: ReaderImg2PDFConvertActivity.kt */
@wf.c(c = "pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImg2PDFConvertActivity$initViewModel$1", f = "ReaderImg2PDFConvertActivity.kt", l = {269}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ReaderImg2PDFConvertActivity$initViewModel$1 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super tf.d>, Object> {
    int label;
    final /* synthetic */ ReaderImg2PDFConvertActivity this$0;

    /* compiled from: ReaderImg2PDFConvertActivity.kt */
    @wf.c(c = "pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImg2PDFConvertActivity$initViewModel$1$1", f = "ReaderImg2PDFConvertActivity.kt", l = {270}, m = "invokeSuspend")
    /* renamed from: pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImg2PDFConvertActivity$initViewModel$1$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super tf.d>, Object> {
        int label;
        final /* synthetic */ ReaderImg2PDFConvertActivity this$0;

        /* compiled from: ReaderImg2PDFConvertActivity.kt */
        /* renamed from: pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImg2PDFConvertActivity$initViewModel$1$1$a */
        /* loaded from: classes3.dex */
        public static final class a<T> implements kotlinx.coroutines.flow.d {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ ReaderImg2PDFConvertActivity f27397a;

            public a(ReaderImg2PDFConvertActivity readerImg2PDFConvertActivity) {
                this.f27397a = readerImg2PDFConvertActivity;
            }

            @Override // kotlinx.coroutines.flow.d
            public final Object emit(Object obj, kotlin.coroutines.c cVar) {
                if (((NetworkType) obj) != NetworkType.NETWORK_NULL) {
                    k.f17927a.getClass();
                    if (!k.c()) {
                        ea.a.p("em0qZxYyMkQ0Q1tuH2UkdAZhXG4jcg==", "JWRUSUMZ");
                        ReaderImg2PDFConvertActivity readerImg2PDFConvertActivity = this.f27397a;
                        LinearLayout linearLayout = readerImg2PDFConvertActivity.L;
                        if (linearLayout != null) {
                            k.d(readerImg2PDFConvertActivity, linearLayout);
                        } else {
                            g.i("layoutAdBottom");
                            throw null;
                        }
                    }
                }
                return tf.d.f30009a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ReaderImg2PDFConvertActivity readerImg2PDFConvertActivity, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.this$0 = readerImg2PDFConvertActivity;
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
                s.u0(obj);
            } else {
                s.u0(obj);
                v vVar = ReaderPdfApplication.k().f28153j;
                a aVar = new a(this.this$0);
                this.label = 1;
                vVar.getClass();
                if (v.n(vVar, aVar, this) == coroutineSingletons) {
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
    public ReaderImg2PDFConvertActivity$initViewModel$1(ReaderImg2PDFConvertActivity readerImg2PDFConvertActivity, kotlin.coroutines.c<? super ReaderImg2PDFConvertActivity$initViewModel$1> cVar) {
        super(2, cVar);
        this.this$0 = readerImg2PDFConvertActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new ReaderImg2PDFConvertActivity$initViewModel$1(this.this$0, cVar);
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
        return tf.d.f30009a;
    }

    @Override // cg.p
    public final Object invoke(w wVar, kotlin.coroutines.c<? super tf.d> cVar) {
        return ((ReaderImg2PDFConvertActivity$initViewModel$1) create(wVar, cVar)).invokeSuspend(tf.d.f30009a);
    }
}

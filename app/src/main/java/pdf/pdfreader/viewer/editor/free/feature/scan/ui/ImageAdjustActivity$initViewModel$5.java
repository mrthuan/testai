package pdf.pdfreader.viewer.editor.free.feature.scan.ui;

import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.ads.s.network.NetworkType;
import pdf.pdfreader.viewer.editor.free.feature.scan.ui.ImageAdjustActivity;

/* compiled from: ImageAdjustActivity.kt */
@wf.c(c = "pdf.pdfreader.viewer.editor.free.feature.scan.ui.ImageAdjustActivity$initViewModel$5", f = "ImageAdjustActivity.kt", l = {1491}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ImageAdjustActivity$initViewModel$5 extends SuspendLambda implements cg.p<kotlinx.coroutines.w, kotlin.coroutines.c<? super tf.d>, Object> {
    int label;
    final /* synthetic */ ImageAdjustActivity this$0;

    /* compiled from: ImageAdjustActivity.kt */
    @wf.c(c = "pdf.pdfreader.viewer.editor.free.feature.scan.ui.ImageAdjustActivity$initViewModel$5$1", f = "ImageAdjustActivity.kt", l = {1492}, m = "invokeSuspend")
    /* renamed from: pdf.pdfreader.viewer.editor.free.feature.scan.ui.ImageAdjustActivity$initViewModel$5$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements cg.p<kotlinx.coroutines.w, kotlin.coroutines.c<? super tf.d>, Object> {
        int label;
        final /* synthetic */ ImageAdjustActivity this$0;

        /* compiled from: ImageAdjustActivity.kt */
        /* renamed from: pdf.pdfreader.viewer.editor.free.feature.scan.ui.ImageAdjustActivity$initViewModel$5$1$a */
        /* loaded from: classes3.dex */
        public static final class a<T> implements kotlinx.coroutines.flow.d {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ ImageAdjustActivity f25775a;

            public a(ImageAdjustActivity imageAdjustActivity) {
                this.f25775a = imageAdjustActivity;
            }

            @Override // kotlinx.coroutines.flow.d
            public final Object emit(Object obj, kotlin.coroutines.c cVar) {
                if (((NetworkType) obj) != NetworkType.NETWORK_NULL) {
                    gl.k.f17927a.getClass();
                    if (!gl.k.c()) {
                        ea.a.p("em0qZxYyMkQ0Q1tuH2UkdAZhXG4jcg==", "JWRUSUMZ");
                        ImageAdjustActivity.a aVar = ImageAdjustActivity.f25741u0;
                        ImageAdjustActivity imageAdjustActivity = this.f25775a;
                        LinearLayout linearLayout = imageAdjustActivity.y2().c;
                        kotlin.jvm.internal.g.d(linearLayout, "binding.bottomBannerLayout");
                        gl.k.d(imageAdjustActivity, linearLayout);
                    }
                }
                return tf.d.f30009a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ImageAdjustActivity imageAdjustActivity, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.this$0 = imageAdjustActivity;
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
                kotlinx.coroutines.flow.v vVar = ReaderPdfApplication.k().f28153j;
                a aVar = new a(this.this$0);
                this.label = 1;
                vVar.getClass();
                if (kotlinx.coroutines.flow.v.n(vVar, aVar, this) == coroutineSingletons) {
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
    public ImageAdjustActivity$initViewModel$5(ImageAdjustActivity imageAdjustActivity, kotlin.coroutines.c<? super ImageAdjustActivity$initViewModel$5> cVar) {
        super(2, cVar);
        this.this$0 = imageAdjustActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new ImageAdjustActivity$initViewModel$5(this.this$0, cVar);
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
        return ((ImageAdjustActivity$initViewModel$5) create(wVar, cVar)).invokeSuspend(tf.d.f30009a);
    }
}

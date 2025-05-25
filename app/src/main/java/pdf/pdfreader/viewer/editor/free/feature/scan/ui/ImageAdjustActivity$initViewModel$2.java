package pdf.pdfreader.viewer.editor.free.feature.scan.ui;

import am.o2;
import am.p2;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.feature.scan.ui.ImageAdjustActivity;
import pdf.pdfreader.viewer.editor.free.feature.scan.ui.state.ImageAdjustPageMode;
import pdf.pdfreader.viewer.editor.free.utils.event.ScanEventCenter;

/* compiled from: ImageAdjustActivity.kt */
@wf.c(c = "pdf.pdfreader.viewer.editor.free.feature.scan.ui.ImageAdjustActivity$initViewModel$2", f = "ImageAdjustActivity.kt", l = {1351}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ImageAdjustActivity$initViewModel$2 extends SuspendLambda implements cg.p<kotlinx.coroutines.w, kotlin.coroutines.c<? super tf.d>, Object> {
    int label;
    final /* synthetic */ ImageAdjustActivity this$0;

    /* compiled from: ImageAdjustActivity.kt */
    @wf.c(c = "pdf.pdfreader.viewer.editor.free.feature.scan.ui.ImageAdjustActivity$initViewModel$2$1", f = "ImageAdjustActivity.kt", l = {1352}, m = "invokeSuspend")
    /* renamed from: pdf.pdfreader.viewer.editor.free.feature.scan.ui.ImageAdjustActivity$initViewModel$2$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements cg.p<kotlinx.coroutines.w, kotlin.coroutines.c<? super tf.d>, Object> {
        int label;
        final /* synthetic */ ImageAdjustActivity this$0;

        /* compiled from: ImageAdjustActivity.kt */
        /* renamed from: pdf.pdfreader.viewer.editor.free.feature.scan.ui.ImageAdjustActivity$initViewModel$2$1$a */
        /* loaded from: classes3.dex */
        public static final class a<T> implements kotlinx.coroutines.flow.d {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ ImageAdjustActivity f25772a;

            /* compiled from: ImageAdjustActivity.kt */
            /* renamed from: pdf.pdfreader.viewer.editor.free.feature.scan.ui.ImageAdjustActivity$initViewModel$2$1$a$a  reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public /* synthetic */ class C0347a {

                /* renamed from: a  reason: collision with root package name */
                public static final /* synthetic */ int[] f25773a;

                static {
                    int[] iArr = new int[ImageAdjustPageMode.values().length];
                    try {
                        iArr[ImageAdjustPageMode.PREVIEW.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[ImageAdjustPageMode.CROP.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[ImageAdjustPageMode.FILTER.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    f25773a = iArr;
                }
            }

            public a(ImageAdjustActivity imageAdjustActivity) {
                this.f25772a = imageAdjustActivity;
            }

            @Override // kotlinx.coroutines.flow.d
            public final Object emit(Object obj, kotlin.coroutines.c cVar) {
                int i10;
                ConstraintLayout constraintLayout;
                p2 p2Var;
                int i11 = C0347a.f25773a[((mn.b) obj).f22149a.ordinal()];
                int i12 = 8;
                ImageAdjustActivity imageAdjustActivity = this.f25772a;
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 == 3 && (p2Var = imageAdjustActivity.K) != null) {
                            tn.a.b(ScanEventCenter.a(), ea.a.p("KWlddBxy", "nt6l6peB"), ea.a.p("VWkndBZyPXMab3c=", "YzaHY6Xc"));
                            imageAdjustActivity.y2().f688s.setVisibility(8);
                            imageAdjustActivity.G2();
                            imageAdjustActivity.L2(imageAdjustActivity.y2().f693x, false, imageAdjustActivity.f25754m0);
                            imageAdjustActivity.L2(p2Var.f1308f, true, imageAdjustActivity.f25754m0);
                            if (imageAdjustActivity.C2().f23515h.size() > 1) {
                                i12 = 0;
                            }
                            Group group = p2Var.f1305b;
                            group.setVisibility(i12);
                            if (group.getVisibility() == 0) {
                                imageAdjustActivity.H.postDelayed(new y(imageAdjustActivity, 0), 500L);
                                tn.a.b(ScanEventCenter.a(), ea.a.p("KWlddBxy", "ucrCeZZi"), ea.a.p("P2kIdAhya2E4cAp5a3M_b3c=", "4GYdm49l"));
                            }
                            boolean z10 = imageAdjustActivity.C2().f23514g;
                            AppCompatImageView appCompatImageView = p2Var.f1307e;
                            if (z10) {
                                appCompatImageView.setImageResource(R.drawable.ic_home_selected);
                            } else {
                                appCompatImageView.setImageResource(R.drawable.ic_home_unselected_gray);
                            }
                        }
                    } else {
                        o2 o2Var = imageAdjustActivity.J;
                        if (o2Var != null) {
                            tf.c cVar2 = ScanEventCenter.f28674a;
                            ScanEventCenter.g(imageAdjustActivity.b2());
                            imageAdjustActivity.y2().f693x.setVisibility(8);
                            imageAdjustActivity.y2().f688s.setVisibility(8);
                            imageAdjustActivity.G2();
                            imageAdjustActivity.L2(imageAdjustActivity.y2().f693x, false, imageAdjustActivity.f25754m0);
                            o2Var.f1261e.setVisibility(0);
                            imageAdjustActivity.t2(o2Var);
                        }
                    }
                } else {
                    ImageAdjustActivity.a aVar = ImageAdjustActivity.f25741u0;
                    List list = (List) imageAdjustActivity.C2().f23517j.d();
                    if (list != null) {
                        i10 = list.size();
                    } else {
                        i10 = 0;
                    }
                    if (i10 > 1) {
                        imageAdjustActivity.y2().f688s.setVisibility(0);
                    } else {
                        imageAdjustActivity.y2().f688s.setVisibility(8);
                    }
                    imageAdjustActivity.G2();
                    if (imageAdjustActivity.O && imageAdjustActivity.f25753l0 && !imageAdjustActivity.f25751j0) {
                        imageAdjustActivity.f25753l0 = false;
                        imageAdjustActivity.L2(imageAdjustActivity.y2().f693x, false, imageAdjustActivity.f25754m0);
                    } else {
                        imageAdjustActivity.L2(imageAdjustActivity.y2().f693x, true, imageAdjustActivity.f25754m0);
                    }
                    p2 p2Var2 = imageAdjustActivity.K;
                    ConstraintLayout constraintLayout2 = null;
                    if (p2Var2 != null) {
                        constraintLayout = p2Var2.f1308f;
                    } else {
                        constraintLayout = null;
                    }
                    imageAdjustActivity.L2(constraintLayout, false, imageAdjustActivity.f25754m0);
                    o2 o2Var2 = imageAdjustActivity.J;
                    if (o2Var2 != null) {
                        constraintLayout2 = o2Var2.f1261e;
                    }
                    if (constraintLayout2 != null) {
                        constraintLayout2.setVisibility(8);
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
                ImageAdjustActivity imageAdjustActivity = this.this$0;
                ImageAdjustActivity.a aVar = ImageAdjustActivity.f25741u0;
                on.b C2 = imageAdjustActivity.C2();
                a aVar2 = new a(this.this$0);
                this.label = 1;
                if (C2.f23512e.a(aVar2, this) == coroutineSingletons) {
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
    public ImageAdjustActivity$initViewModel$2(ImageAdjustActivity imageAdjustActivity, kotlin.coroutines.c<? super ImageAdjustActivity$initViewModel$2> cVar) {
        super(2, cVar);
        this.this$0 = imageAdjustActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new ImageAdjustActivity$initViewModel$2(this.this$0, cVar);
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
        return ((ImageAdjustActivity$initViewModel$2) create(wVar, cVar)).invokeSuspend(tf.d.f30009a);
    }
}

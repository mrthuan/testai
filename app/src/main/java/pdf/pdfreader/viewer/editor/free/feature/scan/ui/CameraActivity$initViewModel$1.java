package pdf.pdfreader.viewer.editor.free.feature.scan.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.lifecycle.Lifecycle;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDPrintFieldAttributeObject;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.CallbackFlowBuilder;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.feature.scan.widget.CameraGridView;

/* compiled from: CameraActivity.kt */
@wf.c(c = "pdf.pdfreader.viewer.editor.free.feature.scan.ui.CameraActivity$initViewModel$1", f = "CameraActivity.kt", l = {1217}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class CameraActivity$initViewModel$1 extends SuspendLambda implements cg.p<kotlinx.coroutines.w, kotlin.coroutines.c<? super tf.d>, Object> {
    int label;
    final /* synthetic */ CameraActivity this$0;

    /* compiled from: CameraActivity.kt */
    @wf.c(c = "pdf.pdfreader.viewer.editor.free.feature.scan.ui.CameraActivity$initViewModel$1$1", f = "CameraActivity.kt", l = {}, m = "invokeSuspend")
    /* renamed from: pdf.pdfreader.viewer.editor.free.feature.scan.ui.CameraActivity$initViewModel$1$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements cg.p<mn.a, kotlin.coroutines.c<? super tf.d>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ CameraActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CameraActivity cameraActivity, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.this$0 = cameraActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z10;
            ValueAnimator valueAnimator;
            int i10;
            int i11;
            boolean z11;
            ValueAnimator valueAnimator2;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                androidx.activity.s.u0(obj);
                mn.a aVar = (mn.a) this.L$0;
                boolean z12 = true;
                if (aVar.f22145a) {
                    CameraActivity cameraActivity = this.this$0;
                    ValueAnimator valueAnimator3 = cameraActivity.f25731w0;
                    if (valueAnimator3 != null && valueAnimator3.isRunning()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z11) {
                        ValueAnimator valueAnimator4 = cameraActivity.f25732x0;
                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                            z12 = false;
                        }
                        if (z12 && (valueAnimator2 = cameraActivity.f25732x0) != null) {
                            valueAnimator2.cancel();
                        }
                        if (cameraActivity.q2().C.getMeasuredHeight() != cameraActivity.q2().B.getMeasuredHeight() || cameraActivity.q2().B.getVisibility() != 0) {
                            tn.a.d(cameraActivity, ea.a.p("PGNQbhphbQ==", "mLRxio6Y"), ea.a.p("QGMqbhBhD20dclFfGmg5dw==", "rDPakySR"), cameraActivity.c2().concat("_total"), false);
                            tn.a.d(cameraActivity, ea.a.p("PGNQbhphbQ==", "O2G2y2OQ"), ea.a.p("PGNQbhphWm01ci9fBmgHdw==", "kOUOiUwd"), androidx.activity.f.m(cameraActivity.c2(), "_", cameraActivity.v2()), false);
                            cameraActivity.q2().B.setVisibility(0);
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            cameraActivity.f25731w0 = ofFloat;
                            if (ofFloat != null) {
                                ofFloat.setDuration(200L);
                            }
                            ValueAnimator valueAnimator5 = cameraActivity.f25731w0;
                            if (valueAnimator5 != null) {
                                valueAnimator5.addUpdateListener(new k9.a(cameraActivity, 3));
                            }
                            ValueAnimator valueAnimator6 = cameraActivity.f25731w0;
                            if (valueAnimator6 != null) {
                                valueAnimator6.start();
                            }
                        }
                    }
                } else {
                    final CameraActivity cameraActivity2 = this.this$0;
                    ValueAnimator valueAnimator7 = cameraActivity2.f25732x0;
                    if (valueAnimator7 != null && valueAnimator7.isRunning()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        if (cameraActivity2.q2().B.getVisibility() == 0) {
                            cameraActivity2.C2();
                        }
                        ValueAnimator valueAnimator8 = cameraActivity2.f25731w0;
                        if (valueAnimator8 == null || !valueAnimator8.isRunning()) {
                            z12 = false;
                        }
                        if (z12 && (valueAnimator = cameraActivity2.f25731w0) != null) {
                            valueAnimator.cancel();
                        }
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
                        cameraActivity2.f25732x0 = ofFloat2;
                        if (ofFloat2 != null) {
                            ofFloat2.setDuration(200L);
                        }
                        ValueAnimator valueAnimator9 = cameraActivity2.f25732x0;
                        if (valueAnimator9 != null) {
                            valueAnimator9.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: pdf.pdfreader.viewer.editor.free.feature.scan.ui.g
                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator10) {
                                    Float f10;
                                    float f11;
                                    int i12 = CameraActivity.H0;
                                    String p10 = ea.a.p("O2hYc10w", "o3VIU3jj");
                                    CameraActivity cameraActivity3 = CameraActivity.this;
                                    kotlin.jvm.internal.g.e(cameraActivity3, p10);
                                    kotlin.jvm.internal.g.e(valueAnimator10, ea.a.p("Lm5YbRh0Xm9u", "BmjcyuMV"));
                                    LinearLayout linearLayout = cameraActivity3.q2().C;
                                    kotlin.jvm.internal.g.d(linearLayout, ea.a.p("UWklZBpuBS4fb0ZlJWEvbzF0cWgvbGQ=", "4Ga58q1e"));
                                    ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
                                    if (layoutParams != null) {
                                        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                                        if (pdf.pdfreader.viewer.editor.free.utils.extension.a.c(cameraActivity3)) {
                                            Object animatedValue = valueAnimator10.getAnimatedValue();
                                            if (animatedValue instanceof Float) {
                                                f10 = (Float) animatedValue;
                                            } else {
                                                f10 = null;
                                            }
                                            if (f10 != null) {
                                                f11 = f10.floatValue();
                                            } else {
                                                f11 = 0.0f;
                                            }
                                            layoutParams2.height = (int) (f11 * cameraActivity3.q2().C.getMeasuredHeight());
                                            linearLayout.setLayoutParams(layoutParams2);
                                            return;
                                        }
                                        return;
                                    }
                                    throw new NullPointerException(ea.a.p("IXVdbFljVm40bz4gF2VIY1RzGiAxb0VuHG5bbixsIiA7eUFlWWFZZChvI2RbdwFkUmUaLglpC2UScjphIG87dGFMUHkWdUNQO3IrbXM=", "nQsWsvYN"));
                                }
                            });
                        }
                        ValueAnimator valueAnimator10 = cameraActivity2.f25732x0;
                        if (valueAnimator10 != null) {
                            valueAnimator10.addListener(new m(cameraActivity2));
                        }
                        ValueAnimator valueAnimator11 = cameraActivity2.f25732x0;
                        if (valueAnimator11 != null) {
                            valueAnimator11.start();
                        }
                    }
                }
                View view = this.this$0.q2().D;
                if (aVar.f22145a) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                view.setVisibility(i10);
                Object tag = this.this$0.q2().f924v.getTag();
                boolean z13 = aVar.f22146b;
                if (tag == null || ((kotlin.jvm.internal.g.a(this.this$0.q2().f924v.getTag(), PDPrintFieldAttributeObject.CHECKED_STATE_ON) && !z13) || (kotlin.jvm.internal.g.a(this.this$0.q2().f924v.getTag(), PDPrintFieldAttributeObject.CHECKED_STATE_OFF) && z13))) {
                    if (z13) {
                        this.this$0.q2().f924v.setTag(PDPrintFieldAttributeObject.CHECKED_STATE_ON);
                        this.this$0.q2().f924v.setAnimation(R.raw.flashlight_on);
                    } else {
                        this.this$0.q2().f924v.setTag(PDPrintFieldAttributeObject.CHECKED_STATE_OFF);
                        this.this$0.q2().f924v.setAnimation(R.raw.flashlight_off);
                    }
                    CameraActivity cameraActivity3 = this.this$0;
                    if (cameraActivity3.f25723o0) {
                        cameraActivity3.f25723o0 = false;
                        cameraActivity3.q2().f924v.j();
                    } else {
                        cameraActivity3.q2().f924v.setProgress(1.0f);
                    }
                    this.this$0.q2().f925w.setEnabled(z13);
                    this.this$0.r2().o(z13);
                }
                AppCompatImageView appCompatImageView = this.this$0.q2().f927y;
                boolean z14 = aVar.c;
                appCompatImageView.setEnabled(z14);
                this.this$0.q2().f928z.setEnabled(z14);
                CameraGridView cameraGridView = this.this$0.q2().f906d;
                if (z14) {
                    i11 = 0;
                } else {
                    i11 = 4;
                }
                cameraGridView.setVisibility(i11);
                Object tag2 = this.this$0.q2().F.getTag();
                boolean z15 = aVar.f22147d;
                if (tag2 == null || ((kotlin.jvm.internal.g.a(this.this$0.q2().F.getTag(), PDPrintFieldAttributeObject.CHECKED_STATE_ON) && !z15) || (kotlin.jvm.internal.g.a(this.this$0.q2().F.getTag(), PDPrintFieldAttributeObject.CHECKED_STATE_OFF) && z15))) {
                    if (z15) {
                        this.this$0.q2().F.setTag(PDPrintFieldAttributeObject.CHECKED_STATE_ON);
                        this.this$0.q2().F.setAnimation(R.raw.sound_on);
                    } else {
                        this.this$0.q2().F.setTag(PDPrintFieldAttributeObject.CHECKED_STATE_OFF);
                        this.this$0.q2().F.setAnimation(R.raw.sound_off);
                    }
                    CameraActivity cameraActivity4 = this.this$0;
                    if (cameraActivity4.f25722n0) {
                        cameraActivity4.f25722n0 = false;
                        cameraActivity4.q2().F.j();
                    } else {
                        cameraActivity4.q2().F.setProgress(1.0f);
                    }
                    this.this$0.q2().G.setEnabled(z15);
                }
                AppCompatImageView appCompatImageView2 = this.this$0.q2().I;
                boolean z16 = aVar.f22148e;
                appCompatImageView2.setEnabled(z16);
                this.this$0.q2().J.setEnabled(z16);
                return tf.d.f30009a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // cg.p
        public final Object invoke(mn.a aVar, kotlin.coroutines.c<? super tf.d> cVar) {
            return ((AnonymousClass1) create(aVar, cVar)).invokeSuspend(tf.d.f30009a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraActivity$initViewModel$1(CameraActivity cameraActivity, kotlin.coroutines.c<? super CameraActivity$initViewModel$1> cVar) {
        super(2, cVar);
        this.this$0 = cameraActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new CameraActivity$initViewModel$1(this.this$0, cVar);
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
            CameraActivity cameraActivity = this.this$0;
            int i11 = CameraActivity.H0;
            on.a s22 = cameraActivity.s2();
            Lifecycle lifecycle = this.this$0.getLifecycle();
            kotlin.jvm.internal.g.d(lifecycle, "lifecycle");
            CallbackFlowBuilder a10 = androidx.lifecycle.g.a(s22.f23510e, lifecycle, Lifecycle.State.STARTED);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (aj.b.k(a10, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return tf.d.f30009a;
    }

    @Override // cg.p
    public final Object invoke(kotlinx.coroutines.w wVar, kotlin.coroutines.c<? super tf.d> cVar) {
        return ((CameraActivity$initViewModel$1) create(wVar, cVar)).invokeSuspend(tf.d.f30009a);
    }
}

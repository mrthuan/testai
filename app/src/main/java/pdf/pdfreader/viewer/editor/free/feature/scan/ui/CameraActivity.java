package pdf.pdfreader.viewer.editor.free.feature.scan.ui;

import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.PointF;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Vibrator;
import android.text.TextUtils;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.lifecycle.m0;
import com.airbnb.lottie.LottieAnimationView;
import java.io.File;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$BooleanRef;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.ads.AppOpenManager;
import pdf.pdfreader.viewer.editor.free.camera.camera.CameraHelper;
import pdf.pdfreader.viewer.editor.free.camera.widget.CameraView;
import pdf.pdfreader.viewer.editor.free.feature.billing.BillingConfigImpl;
import pdf.pdfreader.viewer.editor.free.feature.ocr.data.OCRWorkFlow;
import pdf.pdfreader.viewer.editor.free.feature.ocr.helper.OCRTransportImageExecutor;
import pdf.pdfreader.viewer.editor.free.feature.ocr.ui.OCRPreviewActivity;
import pdf.pdfreader.viewer.editor.free.feature.scan.ui.state.CameraMode;
import pdf.pdfreader.viewer.editor.free.feature.scan.ui.state.TurnPageMode;
import pdf.pdfreader.viewer.editor.free.feature.scan.widget.CameraGridView;
import pdf.pdfreader.viewer.editor.free.feature.scan.widget.R2LevelView;
import pdf.pdfreader.viewer.editor.free.feature.scan.widget.SwipeScrollView;
import pdf.pdfreader.viewer.editor.free.repo.convert.ImageConvertDataRepository;
import pdf.pdfreader.viewer.editor.free.ui.act.single_choose.SingleImageChooseActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.tools.OperatePDFWatcherActivity;
import pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImg2PDFChooseActivity;
import pdf.pdfreader.viewer.editor.free.ui.dialog.i3;
import pdf.pdfreader.viewer.editor.free.ui.widget.ProgressView;
import pdf.pdfreader.viewer.editor.free.utils.a1;
import pdf.pdfreader.viewer.editor.free.utils.event.AppCoreFilterEvent;
import pdf.pdfreader.viewer.editor.free.utils.event.AppOpenSource;
import pdf.pdfreader.viewer.editor.free.utils.event.OCREventCenter;
import pdf.pdfreader.viewer.editor.free.utils.h1;
import pdf.pdfreader.viewer.editor.free.utils.j1;
import pdf.pdfreader.viewer.editor.free.utils.r0;
import pdf.pdfreader.viewer.editor.free.utils.t0;
import pdf.pdfreader.viewer.editor.free.utils.w0;

/* compiled from: CameraActivity.kt */
/* loaded from: classes3.dex */
public class CameraActivity extends OperatePDFWatcherActivity implements hp.c, CameraHelper.a, SensorEventListener, rl.a {
    public static final /* synthetic */ int H0 = 0;
    public final int A0;
    public boolean B0;
    public final b7.g C0;
    public long D0;
    public boolean E0;
    public int F0;
    public boolean G0;
    public SensorManager N;
    public ln.c P;
    public Size Q;
    public boolean R;
    public pdf.pdfreader.viewer.editor.free.feature.scan.dialog.f Y;
    public boolean Z;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f25710b0;

    /* renamed from: d0  reason: collision with root package name */
    public String f25712d0;

    /* renamed from: e0  reason: collision with root package name */
    public pdf.pdfreader.viewer.editor.free.feature.scan.dialog.q f25713e0;

    /* renamed from: f0  reason: collision with root package name */
    public pdf.pdfreader.viewer.editor.free.feature.scan.dialog.q f25714f0;

    /* renamed from: g0  reason: collision with root package name */
    public a1 f25715g0;

    /* renamed from: i0  reason: collision with root package name */
    public Vibrator f25717i0;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f25718j0;

    /* renamed from: l0  reason: collision with root package name */
    public final androidx.activity.result.c<Intent> f25720l0;

    /* renamed from: m0  reason: collision with root package name */
    public int f25721m0;

    /* renamed from: n0  reason: collision with root package name */
    public boolean f25722n0;

    /* renamed from: o0  reason: collision with root package name */
    public boolean f25723o0;

    /* renamed from: p0  reason: collision with root package name */
    public boolean f25724p0;

    /* renamed from: q0  reason: collision with root package name */
    public ObjectAnimator f25725q0;

    /* renamed from: r0  reason: collision with root package name */
    public ul.b f25726r0;

    /* renamed from: s0  reason: collision with root package name */
    public boolean f25727s0;

    /* renamed from: t0  reason: collision with root package name */
    public AnimatorSet f25728t0;

    /* renamed from: u0  reason: collision with root package name */
    public ScaleAnimation f25729u0;

    /* renamed from: v0  reason: collision with root package name */
    public boolean f25730v0;

    /* renamed from: w0  reason: collision with root package name */
    public ValueAnimator f25731w0;

    /* renamed from: x0  reason: collision with root package name */
    public ValueAnimator f25732x0;

    /* renamed from: y0  reason: collision with root package name */
    public ValueAnimator f25733y0;

    /* renamed from: z0  reason: collision with root package name */
    public ValueAnimator f25734z0;
    public final Handler H = new Handler(Looper.getMainLooper());
    public final tf.c I = kotlin.a.a(new cg.a<am.g>() { // from class: pdf.pdfreader.viewer.editor.free.feature.scan.ui.CameraActivity$binding$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final am.g invoke() {
            View inflate = CameraActivity.this.getLayoutInflater().inflate(R.layout.activity_camera, (ViewGroup) null, false);
            int i10 = R.id.back_iv;
            AppCompatImageView appCompatImageView = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.back_iv);
            if (appCompatImageView != null) {
                i10 = R.id.bottom_guideline;
                if (((Guideline) com.google.android.play.core.assetpacks.c.u(inflate, R.id.bottom_guideline)) != null) {
                    i10 = R.id.bottom_oper_view;
                    View u7 = com.google.android.play.core.assetpacks.c.u(inflate, R.id.bottom_oper_view);
                    if (u7 != null) {
                        i10 = R.id.camera_grid_view;
                        CameraGridView cameraGridView = (CameraGridView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.camera_grid_view);
                        if (cameraGridView != null) {
                            i10 = R.id.camera_level_view;
                            R2LevelView r2LevelView = (R2LevelView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.camera_level_view);
                            if (r2LevelView != null) {
                                i10 = R.id.cameraModeGroup;
                                SwipeScrollView swipeScrollView = (SwipeScrollView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.cameraModeGroup);
                                if (swipeScrollView != null) {
                                    i10 = R.id.cameraModeImg;
                                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.cameraModeImg);
                                    if (appCompatImageView2 != null) {
                                        i10 = R.id.camera_view;
                                        CameraView cameraView = (CameraView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.camera_view);
                                        if (cameraView != null) {
                                            i10 = R.id.camera_view_real_height;
                                            View u10 = com.google.android.play.core.assetpacks.c.u(inflate, R.id.camera_view_real_height);
                                            if (u10 != null) {
                                                i10 = R.id.fl_camera_grid_view;
                                                FrameLayout frameLayout = (FrameLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.fl_camera_grid_view);
                                                if (frameLayout != null) {
                                                    i10 = R.id.fl_camera_view;
                                                    FrameLayout frameLayout2 = (FrameLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.fl_camera_view);
                                                    if (frameLayout2 != null) {
                                                        i10 = R.id.image_num_mark;
                                                        if (((ImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.image_num_mark)) != null) {
                                                            i10 = R.id.image_num_tv;
                                                            TextView textView = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.image_num_tv);
                                                            if (textView != null) {
                                                                i10 = R.id.img_card;
                                                                CardView cardView = (CardView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.img_card);
                                                                if (cardView != null) {
                                                                    i10 = R.id.img_focus_view;
                                                                    ImageView imageView = (ImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.img_focus_view);
                                                                    if (imageView != null) {
                                                                        i10 = R.id.img_focus_view_bg;
                                                                        ImageView imageView2 = (ImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.img_focus_view_bg);
                                                                        if (imageView2 != null) {
                                                                            i10 = R.id.img_group;
                                                                            Group group = (Group) com.google.android.play.core.assetpacks.c.u(inflate, R.id.img_group);
                                                                            if (group != null) {
                                                                                i10 = R.id.img_layout;
                                                                                RelativeLayout relativeLayout = (RelativeLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.img_layout);
                                                                                if (relativeLayout != null) {
                                                                                    i10 = R.id.item_icon;
                                                                                    AppCompatImageView appCompatImageView3 = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.item_icon);
                                                                                    if (appCompatImageView3 != null) {
                                                                                        i10 = R.id.iv_scan_clear;
                                                                                        AppCompatImageView appCompatImageView4 = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.iv_scan_clear);
                                                                                        if (appCompatImageView4 != null) {
                                                                                            i10 = R.id.iv_select_image;
                                                                                            AppCompatImageView appCompatImageView5 = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.iv_select_image);
                                                                                            if (appCompatImageView5 != null) {
                                                                                                i10 = R.id.more_flashlight_container;
                                                                                                LinearLayout linearLayout = (LinearLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.more_flashlight_container);
                                                                                                if (linearLayout != null) {
                                                                                                    i10 = R.id.more_flashlight_iv;
                                                                                                    LottieAnimationView lottieAnimationView = (LottieAnimationView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.more_flashlight_iv);
                                                                                                    if (lottieAnimationView != null) {
                                                                                                        i10 = R.id.more_flashlight_tv;
                                                                                                        TextView textView2 = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.more_flashlight_tv);
                                                                                                        if (textView2 != null) {
                                                                                                            i10 = R.id.more_grid_container;
                                                                                                            LinearLayout linearLayout2 = (LinearLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.more_grid_container);
                                                                                                            if (linearLayout2 != null) {
                                                                                                                i10 = R.id.more_grid_iv;
                                                                                                                AppCompatImageView appCompatImageView6 = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.more_grid_iv);
                                                                                                                if (appCompatImageView6 != null) {
                                                                                                                    i10 = R.id.more_grid_tv;
                                                                                                                    TextView textView3 = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.more_grid_tv);
                                                                                                                    if (textView3 != null) {
                                                                                                                        i10 = R.id.more_iv;
                                                                                                                        AppCompatImageView appCompatImageView7 = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.more_iv);
                                                                                                                        if (appCompatImageView7 != null) {
                                                                                                                            i10 = R.id.more_layout;
                                                                                                                            LinearLayout linearLayout3 = (LinearLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.more_layout);
                                                                                                                            if (linearLayout3 != null) {
                                                                                                                                i10 = R.id.more_layout_child;
                                                                                                                                LinearLayout linearLayout4 = (LinearLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.more_layout_child);
                                                                                                                                if (linearLayout4 != null) {
                                                                                                                                    i10 = R.id.more_layout_overlay;
                                                                                                                                    View u11 = com.google.android.play.core.assetpacks.c.u(inflate, R.id.more_layout_overlay);
                                                                                                                                    if (u11 != null) {
                                                                                                                                        i10 = R.id.more_sound_container;
                                                                                                                                        LinearLayout linearLayout5 = (LinearLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.more_sound_container);
                                                                                                                                        if (linearLayout5 != null) {
                                                                                                                                            i10 = R.id.more_sound_iv;
                                                                                                                                            LottieAnimationView lottieAnimationView2 = (LottieAnimationView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.more_sound_iv);
                                                                                                                                            if (lottieAnimationView2 != null) {
                                                                                                                                                i10 = R.id.more_sound_tv;
                                                                                                                                                TextView textView4 = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.more_sound_tv);
                                                                                                                                                if (textView4 != null) {
                                                                                                                                                    i10 = R.id.more_spirit_level_container;
                                                                                                                                                    LinearLayout linearLayout6 = (LinearLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.more_spirit_level_container);
                                                                                                                                                    if (linearLayout6 != null) {
                                                                                                                                                        i10 = R.id.more_spirit_level_iv;
                                                                                                                                                        AppCompatImageView appCompatImageView8 = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.more_spirit_level_iv);
                                                                                                                                                        if (appCompatImageView8 != null) {
                                                                                                                                                            i10 = R.id.more_spirit_level_tv;
                                                                                                                                                            TextView textView5 = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.more_spirit_level_tv);
                                                                                                                                                            if (textView5 != null) {
                                                                                                                                                                i10 = R.id.next_iv;
                                                                                                                                                                AppCompatImageView appCompatImageView9 = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.next_iv);
                                                                                                                                                                if (appCompatImageView9 != null) {
                                                                                                                                                                    i10 = R.id.progress_bar;
                                                                                                                                                                    ProgressView progressView = (ProgressView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.progress_bar);
                                                                                                                                                                    if (progressView != null) {
                                                                                                                                                                        ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                                                                                                                                                                        i10 = R.id.shot_iv;
                                                                                                                                                                        AppCompatImageView appCompatImageView10 = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.shot_iv);
                                                                                                                                                                        if (appCompatImageView10 != null) {
                                                                                                                                                                            i10 = R.id.top_guideline;
                                                                                                                                                                            if (((Guideline) com.google.android.play.core.assetpacks.c.u(inflate, R.id.top_guideline)) != null) {
                                                                                                                                                                                i10 = R.id.tvModeOcr;
                                                                                                                                                                                TextView textView6 = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tvModeOcr);
                                                                                                                                                                                if (textView6 != null) {
                                                                                                                                                                                    i10 = R.id.tvModeScan;
                                                                                                                                                                                    TextView textView7 = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tvModeScan);
                                                                                                                                                                                    if (textView7 != null) {
                                                                                                                                                                                        i10 = R.id.viewLeftLocation;
                                                                                                                                                                                        View u12 = com.google.android.play.core.assetpacks.c.u(inflate, R.id.viewLeftLocation);
                                                                                                                                                                                        if (u12 != null) {
                                                                                                                                                                                            i10 = R.id.viewRightLocation;
                                                                                                                                                                                            View u13 = com.google.android.play.core.assetpacks.c.u(inflate, R.id.viewRightLocation);
                                                                                                                                                                                            if (u13 != null) {
                                                                                                                                                                                                return new am.g(constraintLayout, appCompatImageView, u7, cameraGridView, r2LevelView, swipeScrollView, appCompatImageView2, cameraView, u10, frameLayout, frameLayout2, textView, cardView, imageView, imageView2, group, relativeLayout, appCompatImageView3, appCompatImageView4, appCompatImageView5, linearLayout, lottieAnimationView, textView2, linearLayout2, appCompatImageView6, textView3, appCompatImageView7, linearLayout3, linearLayout4, u11, linearLayout5, lottieAnimationView2, textView4, linearLayout6, appCompatImageView8, textView5, appCompatImageView9, progressView, constraintLayout, appCompatImageView10, textView6, textView7, u12, u13);
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            throw new NullPointerException(ea.a.p("fGkYc15uLSA6ZRd1XXIyZBh2O2U-IEFpAGhRSRU6IA==", "Or1k7JBW").concat(inflate.getResources().getResourceName(i10)));
        }
    });
    public final androidx.lifecycle.k0 J = new androidx.lifecycle.k0(kotlin.jvm.internal.i.a(on.a.class), new cg.a<androidx.lifecycle.o0>() { // from class: pdf.pdfreader.viewer.editor.free.feature.scan.ui.CameraActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final androidx.lifecycle.o0 invoke() {
            androidx.lifecycle.o0 viewModelStore = ComponentActivity.this.getViewModelStore();
            kotlin.jvm.internal.g.d(viewModelStore, ea.a.p("RWkudz5vBmUeU0BvG2U=", "SumYpRn7"));
            return viewModelStore;
        }
    }, new cg.a<m0.b>() { // from class: pdf.pdfreader.viewer.editor.free.feature.scan.ui.CameraActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final m0.b invoke() {
            m0.b defaultViewModelProviderFactory = ComponentActivity.this.getDefaultViewModelProviderFactory();
            kotlin.jvm.internal.g.d(defaultViewModelProviderFactory, ea.a.p("V2UtYQZsFlYbZUNNBmQzbBRyXXYvZCZyFGExdB5yeQ==", "RRqNK0Cg"));
            return defaultViewModelProviderFactory;
        }
    }, new cg.a<n1.a>() { // from class: pdf.pdfreader.viewer.editor.free.feature.scan.ui.CameraActivity$special$$inlined$viewModels$default$3
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        {
            super(0);
        }

        @Override // cg.a
        public final n1.a invoke() {
            n1.a aVar;
            cg.a aVar2 = cg.a.this;
            if (aVar2 == null || (aVar = (n1.a) aVar2.invoke()) == null) {
                n1.a defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
                kotlin.jvm.internal.g.d(defaultViewModelCreationExtras, ea.a.p("O2hYc1dkUmY7dSZ0I2kNd3hvCmUpQxdlWXQAb1xFKHQ9YXM=", "TgoC8i2P"));
                return defaultViewModelCreationExtras;
            }
            return aVar;
        }
    });
    public final tf.c K = kotlin.a.a(new cg.a<hp.b>() { // from class: pdf.pdfreader.viewer.editor.free.feature.scan.ui.CameraActivity$rotationObserver$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final hp.b invoke() {
            CameraActivity cameraActivity = CameraActivity.this;
            return new hp.b(cameraActivity, cameraActivity);
        }
    });
    public final tf.c L = kotlin.a.a(new cg.a<List<? extends View>>() { // from class: pdf.pdfreader.viewer.editor.free.feature.scan.ui.CameraActivity$rotationAnimViews$2
        {
            super(0);
        }

        @Override // cg.a
        public final List<? extends View> invoke() {
            AppCompatImageView appCompatImageView = CameraActivity.this.q2().f905b;
            kotlin.jvm.internal.g.d(appCompatImageView, ea.a.p("LWlfZBBuUC44YSlrPHY=", "rBmsVCUx"));
            AppCompatImageView appCompatImageView2 = CameraActivity.this.q2().A;
            kotlin.jvm.internal.g.d(appCompatImageView2, ea.a.p("UWklZBpuBS4fb0ZlIHY=", "36U362R5"));
            RelativeLayout relativeLayout = CameraActivity.this.q2().f919q;
            kotlin.jvm.internal.g.d(relativeLayout, ea.a.p("LWlfZBBuUC4zbS1MFHkHdXQ=", "AEpM8eCD"));
            AppCompatImageView appCompatImageView3 = CameraActivity.this.q2().K;
            kotlin.jvm.internal.g.d(appCompatImageView3, ea.a.p("UWklZBpuBS4cZUx0IHY=", "Ae55cifr"));
            LinearLayout linearLayout = CameraActivity.this.q2().B;
            kotlin.jvm.internal.g.d(linearLayout, ea.a.p("LWlfZBBuUC43bzhlOWERb0B0", "gFDPIu2N"));
            AppCompatImageView appCompatImageView4 = CameraActivity.this.q2().f922t;
            kotlin.jvm.internal.g.d(appCompatImageView4, ea.a.p("UWklZBpuBS4bdmdlBWU1dA1tU2dl", "tZasskdh"));
            AppCompatImageView appCompatImageView5 = CameraActivity.this.q2().f921s;
            kotlin.jvm.internal.g.d(appCompatImageView5, ea.a.p("UWklZBpuBS4bdmdjCG4VbCFhcg==", "yIJZsIgS"));
            return ge.a.I(appCompatImageView, appCompatImageView2, relativeLayout, appCompatImageView3, linearLayout, appCompatImageView4, appCompatImageView5);
        }
    });
    public final tf.c M = kotlin.a.a(new cg.a<CameraHelper>() { // from class: pdf.pdfreader.viewer.editor.free.feature.scan.ui.CameraActivity$cameraHelper$2
        {
            super(0);
        }

        @Override // cg.a
        public final CameraHelper invoke() {
            CameraActivity cameraActivity = CameraActivity.this;
            return new CameraHelper(cameraActivity, b.b.x(cameraActivity), CameraActivity.this);
        }
    });
    public boolean O = true;
    public final float[] S = new float[3];
    public final float[] T = new float[3];
    public final float[] U = new float[9];
    public final float[] V = new float[3];
    public final int W = 1;
    public final int X = 2;

    /* renamed from: a0  reason: collision with root package name */
    public int f25709a0 = -1;

    /* renamed from: c0  reason: collision with root package name */
    public int f25711c0 = -1;

    /* renamed from: h0  reason: collision with root package name */
    public String f25716h0 = "";

    /* renamed from: k0  reason: collision with root package name */
    public boolean f25719k0 = true;

    /* compiled from: CameraActivity.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        public static void a(Context context, String str, String workflow, boolean z10, boolean z11) {
            kotlin.jvm.internal.g.e(context, "context");
            kotlin.jvm.internal.g.e(workflow, "workflow");
            Intent intent = new Intent(context, CameraActivity.class);
            intent.putExtra(ea.a.p("KnIKbWxzKnU6Y2U=", "Z9Le3Etp"), str);
            intent.putExtra(ea.a.p("JnN3chZtY2gzcmQ=", "WOJfANWY"), z10);
            intent.putExtra(ea.a.p("FnIDbWx3FXIjZgpvdw==", "7Mpl3zWE"), workflow);
            intent.putExtra(ea.a.p("M2UNXyNzaGMpbQNyVV8xaUpzJl8sbkJyFW4SZQ==", "KdXtJ7e2"), z11);
            if (z11) {
                AppOpenSource appOpenSource = AppCoreFilterEvent.f28650a;
                AppCoreFilterEvent.a(ea.a.p("QGMqbkFwPWEWag==", "SV66ZquO"), ea.a.p("QWNYbgNwNWMnbhBlcg==", "Ww291jAm"), ea.a.p("QGMqbkFwPXMXbFFfGmg5dw==", "m0XLoobK"));
                AppCoreFilterEvent.c();
            }
            context.startActivity(intent);
        }
    }

    /* compiled from: CameraActivity.kt */
    /* loaded from: classes3.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f25735a;

        static {
            int[] iArr = new int[CameraMode.values().length];
            try {
                iArr[CameraMode.Scan.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CameraMode.Ocr.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f25735a = iArr;
        }
    }

    /* compiled from: CameraActivity.kt */
    /* loaded from: classes3.dex */
    public static final class d extends nn.c {
        public d() {
        }

        @Override // nn.c
        public final void a() {
            CameraActivity cameraActivity = CameraActivity.this;
            if (pdf.pdfreader.viewer.editor.free.utils.extension.c.j(cameraActivity)) {
                int i10 = CameraActivity.H0;
                CameraMode cameraMode = cameraActivity.f27006y;
                CameraMode cameraMode2 = CameraMode.Scan;
                if (cameraMode != cameraMode2) {
                    cameraActivity.G2(cameraMode2, Boolean.TRUE);
                    return;
                }
                return;
            }
            int i11 = CameraActivity.H0;
            CameraMode cameraMode3 = cameraActivity.f27006y;
            CameraMode cameraMode4 = CameraMode.Ocr;
            if (cameraMode3 != cameraMode4) {
                cameraActivity.G2(cameraMode4, Boolean.TRUE);
            }
        }

        @Override // nn.c
        public final void b() {
            CameraActivity cameraActivity = CameraActivity.this;
            if (pdf.pdfreader.viewer.editor.free.utils.extension.c.j(cameraActivity)) {
                int i10 = CameraActivity.H0;
                CameraMode cameraMode = cameraActivity.f27006y;
                CameraMode cameraMode2 = CameraMode.Ocr;
                if (cameraMode != cameraMode2) {
                    cameraActivity.G2(cameraMode2, Boolean.TRUE);
                    return;
                }
                return;
            }
            int i11 = CameraActivity.H0;
            CameraMode cameraMode3 = cameraActivity.f27006y;
            CameraMode cameraMode4 = CameraMode.Scan;
            if (cameraMode3 != cameraMode4) {
                cameraActivity.G2(cameraMode4, Boolean.TRUE);
            }
        }
    }

    /* compiled from: CameraActivity.kt */
    /* loaded from: classes3.dex */
    public static final class e implements androidx.lifecycle.x, kotlin.jvm.internal.e {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ cg.l f25739a;

        public e(cg.l lVar) {
            ea.a.p("KXVfYw1pWG4=", "Xi1AjKoN");
            this.f25739a = lVar;
        }

        @Override // kotlin.jvm.internal.e
        public final cg.l a() {
            return this.f25739a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof androidx.lifecycle.x) && (obj instanceof kotlin.jvm.internal.e)) {
                return kotlin.jvm.internal.g.a(this.f25739a, ((kotlin.jvm.internal.e) obj).a());
            }
            return false;
        }

        public final int hashCode() {
            return this.f25739a.hashCode();
        }

        @Override // androidx.lifecycle.x
        public final /* synthetic */ void m(Object obj) {
            this.f25739a.invoke(obj);
        }
    }

    static {
        new a();
    }

    public CameraActivity() {
        androidx.activity.result.c<Intent> registerForActivityResult = registerForActivityResult(new j.d(), new t5.i(11));
        kotlin.jvm.internal.g.d(registerForActivityResult, ea.a.p("F2U9aSJ0EHIObxRBV3Q-dlF0K1Isc0NsloDXKVsgYiBFKXp7cXIQcz1sEiAZPl0gGCByfQ==", "3neZQuqV"));
        this.f25720l0 = registerForActivityResult;
        this.A0 = 200;
        this.C0 = new b7.g(this, 26);
    }

    public static final void l2(CameraActivity cameraActivity) {
        cameraActivity.getClass();
        try {
            if (pdf.pdfreader.viewer.editor.free.utils.extension.a.c(cameraActivity) && !cameraActivity.f25727s0) {
                ImageConvertDataRepository.f26536a.getClass();
                androidx.lifecycle.w wVar = ImageConvertDataRepository.f26546l;
                ArrayList arrayList = (ArrayList) wVar.d();
                int i10 = 0;
                if (arrayList != null && arrayList.size() > 0) {
                    cameraActivity.q2().f918p.setVisibility(0);
                    cameraActivity.q2().f909g.setVisibility(8);
                    cameraActivity.q2().f908f.setVisibility(8);
                    if (cameraActivity.f25719k0) {
                        cameraActivity.q2().f921s.setVisibility(0);
                        cameraActivity.q2().f922t.setVisibility(8);
                    } else {
                        cameraActivity.q2().f921s.setVisibility(8);
                        cameraActivity.q2().f922t.setVisibility(8);
                    }
                    Object obj = arrayList.get(ge.a.A(arrayList));
                    kotlin.jvm.internal.g.d(obj, ea.a.p("CmVbZSt0C2k7dD1zUWwyY0xMO3M9LlphB3Q4bjVlOl0=", "2dy7HGbV"));
                    com.bumptech.glide.e z10 = com.bumptech.glide.b.c(cameraActivity).h(cameraActivity).o(((ul.b) obj).f30404a).z(new c4.f(), true);
                    com.bumptech.glide.a c10 = com.bumptech.glide.a.c();
                    z10.getClass();
                    z10.E = c10;
                    z10.E(cameraActivity.q2().f920r);
                    TextView textView = cameraActivity.q2().f914l;
                    ArrayList arrayList2 = (ArrayList) wVar.d();
                    if (arrayList2 != null) {
                        i10 = arrayList2.size();
                    }
                    textView.setText(String.valueOf(i10));
                    ea.a.p("akNU", "WbLcfDU0");
                    arrayList.size();
                    String str = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
                    return;
                }
                cameraActivity.q2().f918p.setVisibility(4);
                if (cameraActivity.f25730v0 && cameraActivity.y2()) {
                    cameraActivity.q2().f909g.setVisibility(0);
                    cameraActivity.q2().f908f.setVisibility(0);
                }
                if (cameraActivity.f25719k0) {
                    cameraActivity.q2().f921s.setVisibility(8);
                    cameraActivity.q2().f922t.setVisibility(0);
                    return;
                }
                cameraActivity.q2().f921s.setVisibility(8);
                cameraActivity.q2().f922t.setVisibility(8);
            }
        } catch (Exception e10) {
            ea.a.p("akNU", "N4R8SlrM");
            e10.getMessage();
            String str2 = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
        }
    }

    public void A2() {
        if (this.f25709a0 == 0) {
            SingleImageChooseActivity.a aVar = SingleImageChooseActivity.f26980o1;
            boolean z10 = this.f25718j0;
            String p10 = ea.a.p("UGFt", "yFCkSjJJ");
            String workflow = this.f27001t;
            String p11 = ea.a.p("LGFcZQth", "1BFuednB");
            int i10 = this.f25711c0;
            TurnPageMode e22 = e2();
            aVar.getClass();
            kotlin.jvm.internal.g.e(workflow, "workflow");
            ImageConvertDataRepository.f26536a.getClass();
            ImageConvertDataRepository.g();
            String h10 = pdf.pdfreader.viewer.editor.free.utils.v.h();
            new ArrayList();
            List<ul.a> d10 = ImageConvertDataRepository.f26541g.d();
            if (d10 != null) {
                for (ul.a aVar2 : d10) {
                    if (kotlin.jvm.internal.g.a(h10, aVar2.f30401a)) {
                        ImageConvertDataRepository.f26543i.j(aVar2);
                        ImageConvertDataRepository.f26547m.j(aVar2.f30401a);
                    }
                }
            }
            Intent intent = new Intent(this, SingleImageChooseActivity.class);
            intent.putExtra(ea.a.p("JGVIXxBuXnQFZytsGWUaeQ==", "wAZTxTcj"), false);
            intent.putExtra(ea.a.p("WnMOZjBvWl88aA9yZA==", "gp3QB7Ri"), z10);
            intent.putExtra(ea.a.p("VXIkbSxzDXUAY2U=", "K5TdWsF5"), p10);
            intent.putExtra(ea.a.p("UXIZbTp3GnIjZgpvdw==", "WW7veuN4"), workflow);
            intent.putExtra(ea.a.p("GXNoc19vAl8rYQtlRmE=", "6kp77u22"), false);
            intent.putExtra(ea.a.p("WGUyXxVyDW0=", "m1YGSZND"), p11);
            intent.putExtra(ea.a.p("JnNuchx0Vmtl", "OPiLUCsP"), true);
            intent.putExtra(ea.a.p("HWVCYSxlZ3Ancw90XW9u", "7To6G8F2"), i10);
            if (e22 != null) {
                intent.putExtra(ea.a.p("R3U5bid5EmU=", "xTr90vLG"), e22.ordinal());
            }
            startActivity(intent);
            return;
        }
        ReaderImg2PDFChooseActivity.a aVar3 = ReaderImg2PDFChooseActivity.M0;
        boolean z11 = this.f25718j0;
        String p12 = ea.a.p("UGFt", "f622rEXS");
        String str = this.f27001t;
        String p13 = ea.a.p("UGEmZQFh", "aUvaEUUa");
        CameraMode cameraMode = this.f27006y;
        TurnPageMode e23 = e2();
        aVar3.getClass();
        ReaderImg2PDFChooseActivity.a.a(this, z11, p12, str, false, p13, cameraMode, e23);
    }

    public final void B2() {
        ArrayList arrayList = new ArrayList(2);
        if (!pdf.pdfreader.viewer.editor.free.utils.extension.c.a(this)) {
            arrayList.add(ea.a.p("O24Kch1pFS44ZRRtXXMkaVdufEMITXNSQQ==", "czZnrqRU"));
        }
        if (!h1.c()) {
            if (androidx.core.content.a.checkSelfPermission(this, ea.a.p("Lm5VchZpUy4qZThtHHMbaVpuQFcXSTFFEUUcVH1SBUEDX2JUNlJ2R0U=", "ZXG1ND8K")) != 0) {
                arrayList.add(ea.a.p("Um4vchxpBi4CZUZtAHMlaStuHFcUSRdFaUVvVCRSGkF_XxhUPFIjR0U=", "67aTovyb"));
            }
            if (androidx.core.content.a.checkSelfPermission(this, ea.a.p("Lm5VchZpUy4qZThtHHMbaVpuQFIAQSFfN1gFRWpOLUwQU2VPK0FwRQ==", "RGb1rQ8l")) != 0) {
                arrayList.add(ea.a.p("Lm5VchZpUy4qZThtHHMbaVpuQFIAQSFfNlgORT5OLUwQU2VPK0FwRQ==", "ONPDsZll"));
            }
        }
        if (!arrayList.isEmpty()) {
            this.H.postDelayed(this.C0, 500L);
            k0.b.a(this, (String[]) arrayList.toArray(new String[0]), this.A0);
        }
    }

    public void C2() {
        String p10;
        String p11;
        String p12;
        String p13;
        if (((mn.a) s2().f23510e.b()).f22146b) {
            p10 = ea.a.p("WQ==", "fTeqH3UI");
        } else {
            p10 = ea.a.p("Tg==", "FC2wR4pP");
        }
        if (((mn.a) s2().f23510e.b()).c) {
            p11 = ea.a.p("bFk=", "avl6bmas");
        } else {
            p11 = ea.a.p("JU4=", "OBzFqEK7");
        }
        String concat = p10.concat(p11);
        if (((mn.a) s2().f23510e.b()).f22147d) {
            p12 = ea.a.p("EFk=", "W4PMlb1Y");
        } else {
            p12 = ea.a.p("bE4=", "IupnuagL");
        }
        String c10 = a6.h.c(concat, p12);
        if (((mn.a) s2().f23510e.b()).f22148e) {
            p13 = ea.a.p("bFk=", "sPNSGOxo");
        } else {
            p13 = ea.a.p("EE4=", "P3YlLsos");
        }
        tn.a.d(this, ea.a.p("SmNZbhBhbQ==", "tK98sMxp"), ea.a.p("AmMGbjlhIm0ncgNfV2w4c11fIWgmdw==", "LHqgZO4c"), a6.h.c(c10, p13), false);
    }

    @Override // jl.a
    public final View D1() {
        ConstraintLayout constraintLayout = q2().f904a;
        kotlin.jvm.internal.g.d(constraintLayout, ea.a.p("UWklZBpuBS4Ab1t0", "XvodEnj5"));
        return constraintLayout;
    }

    public void D2(String eventValue) {
        kotlin.jvm.internal.g.e(eventValue, "eventValue");
        jn.a.c.getClass();
        if (!kotlin.text.k.O(jn.a.k(), "camperm_show_".concat(eventValue), false)) {
            tn.a.d(this, ea.a.p("Q2U5bRpzEWkdbg==", "A7eHI7pa"), ea.a.p("LGFccBxyWl8paCV3", "Rxhs6ndM"), ea.a.p("R28_YWw=", "vfdqbrSE"), false);
            tn.a.d(this, ea.a.p("P2VDbRBzRGk1bg==", "lTWWeLtv"), ea.a.p("UGEmcBZyD18BaFt3", "kQyoMdrS"), eventValue, false);
            String k10 = jn.a.k();
            jn.a.p(k10 + "|camperm_show_" + eventValue);
        }
    }

    @Override // jl.a
    public final int E1() {
        return 0;
    }

    public void E2() {
        tn.a.d(this, ea.a.p("PGNQbhphbQ==", "ngZGCKI1"), ea.a.p("PGNQbhphWl8paCVvAV8LbFxjaw==", "1VzoV3o6"), c2().concat("_total"), false);
        tn.a.d(this, ea.a.p("MWMxbiBhbQ==", "8lBPChpH"), ea.a.p("PWM4bjdhCV87aAlvQF80bFFjaw==", "C7NYTdAt"), androidx.activity.f.m(c2(), "_", v2()), false);
    }

    @Override // jl.a
    public final int F1() {
        return -14473944;
    }

    public final void F2() {
        pdf.pdfreader.viewer.editor.free.feature.scan.dialog.f fVar = this.Y;
        boolean z10 = false;
        if (fVar != null && fVar.isShowing()) {
            z10 = true;
        }
        if (!z10) {
            this.Y = new pdf.pdfreader.viewer.editor.free.feature.scan.dialog.f(this, this.E0 ? 1 : 0, new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.scan.ui.CameraActivity$showCameraRationale$1
                {
                    super(1);
                }

                @Override // cg.l
                public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                    invoke(bool.booleanValue());
                    return tf.d.f30009a;
                }

                public final void invoke(boolean z11) {
                    if (z11) {
                        CameraActivity cameraActivity = CameraActivity.this;
                        if (cameraActivity.E0) {
                            cameraActivity.F0 = 2;
                            r0.b(cameraActivity);
                            CameraActivity cameraActivity2 = CameraActivity.this;
                            if (cameraActivity2.f25715g0 == null) {
                                cameraActivity2.f25715g0 = new a1(cameraActivity2, cameraActivity2.t2(), null);
                            }
                            a1 a1Var = CameraActivity.this.f25715g0;
                            if (a1Var != null) {
                                Activity activity = a1Var.f28536a;
                                if (com.google.android.play.core.assetpacks.c.W(activity)) {
                                    a1Var.f28540f = false;
                                    a1Var.c.execute(new a1.b(activity));
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        cameraActivity.F0 = 1;
                        cameraActivity.B2();
                        return;
                    }
                    CameraActivity cameraActivity3 = CameraActivity.this;
                    int i10 = CameraActivity.H0;
                    cameraActivity3.p2();
                }
            });
            if (this.E0) {
                I2(3);
            } else {
                I2(2);
            }
            pdf.pdfreader.viewer.editor.free.feature.scan.dialog.f fVar2 = this.Y;
            if (fVar2 != null) {
                fVar2.show();
            }
        }
    }

    @Override // jl.a
    public final int G1() {
        return -14473944;
    }

    public final void G2(CameraMode cameraMode, Boolean bool) {
        boolean z10;
        boolean z11 = false;
        if (kotlin.jvm.internal.g.a(bool, Boolean.FALSE)) {
            int i10 = b.f25735a[cameraMode.ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    AppOpenSource appOpenSource = AppCoreFilterEvent.f28650a;
                    AppCoreFilterEvent.h(ea.a.p("XGM5XxBhD2UAYWt2AGV3", "x5SQKWEA"));
                    q2().f908f.post(new j(this, 0));
                }
            } else {
                AppOpenSource appOpenSource2 = AppCoreFilterEvent.f28650a;
                AppCoreFilterEvent.h(ea.a.p("QGMqbkFwPXMXbFFfGmg5dw==", "axoIljKr"));
                q2().f908f.post(new i(this, 0));
            }
            TextView textView = q2().P;
            if (this.f27006y == CameraMode.Scan) {
                z10 = true;
            } else {
                z10 = false;
            }
            textView.setSelected(z10);
            TextView textView2 = q2().O;
            if (this.f27006y == CameraMode.Ocr) {
                z11 = true;
            }
            textView2.setSelected(z11);
        } else if (this.f25724p0) {
        } else {
            tn.a.d(this, ea.a.p("GGNXbithbQ==", "KQk6HRZk"), ea.a.p("O2MSbghhCF88YQRfV2w-Y2s=", "siHskeDr"), c2(), false);
            this.f25724p0 = true;
            int i11 = b.f25735a[cameraMode.ordinal()];
            if (i11 != 1) {
                if (i11 == 2) {
                    AppOpenSource appOpenSource3 = AppCoreFilterEvent.f28650a;
                    AppCoreFilterEvent.h(ea.a.p("IGNDXxphWmUoYRV2HGV3", "Oz2WABtp"));
                    float w22 = w2();
                    TextView textView3 = q2().P;
                    kotlin.jvm.internal.g.d(textView3, ea.a.p("LGkMZBluPS48ditvUGUEY1lu", "qhNbpZZA"));
                    n2(w22, textView3, false, new cg.a<tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.scan.ui.CameraActivity$switchToMode$4
                        {
                            super(0);
                        }

                        @Override // cg.a
                        public /* bridge */ /* synthetic */ tf.d invoke() {
                            invoke2();
                            return tf.d.f30009a;
                        }

                        /* renamed from: invoke  reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            CameraActivity cameraActivity = CameraActivity.this;
                            CameraMode cameraMode2 = CameraMode.Ocr;
                            int i12 = CameraActivity.H0;
                            cameraActivity.getClass();
                            kotlin.jvm.internal.g.e(cameraMode2, "<set-?>");
                            cameraActivity.f27006y = cameraMode2;
                        }
                    });
                    TextView textView4 = q2().O;
                    kotlin.jvm.internal.g.d(textView4, ea.a.p("LWlfZBBuUC4udgdvEWUnY3I=", "JkbfFPAk"));
                    n2(w22, textView4, true, null);
                    return;
                }
                return;
            }
            AppOpenSource appOpenSource4 = AppCoreFilterEvent.f28650a;
            AppCoreFilterEvent.h(ea.a.p("RGMjbnhwZnMtbANfR2g4dw==", "tD7BJ9uy"));
            float x22 = x2();
            TextView textView5 = q2().P;
            kotlin.jvm.internal.g.d(textView5, ea.a.p("L2kFZFpuFi48ditvUGUEY1lu", "9dMk3qg1"));
            n2(x22, textView5, true, new cg.a<tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.scan.ui.CameraActivity$switchToMode$3
                {
                    super(0);
                }

                @Override // cg.a
                public /* bridge */ /* synthetic */ tf.d invoke() {
                    invoke2();
                    return tf.d.f30009a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    CameraActivity cameraActivity = CameraActivity.this;
                    CameraMode cameraMode2 = CameraMode.Scan;
                    int i12 = CameraActivity.H0;
                    cameraActivity.getClass();
                    kotlin.jvm.internal.g.e(cameraMode2, "<set-?>");
                    cameraActivity.f27006y = cameraMode2;
                }
            });
            TextView textView6 = q2().O;
            kotlin.jvm.internal.g.d(textView6, ea.a.p("LWlfZBBuUC4udgdvEWUnY3I=", "Ao6lKFtc"));
            n2(x22, textView6, false, null);
        }
    }

    public void H2() {
        String concat;
        int i10 = this.F0;
        if (i10 == 0 || i10 == 1 || i10 == 2) {
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        concat = u2().concat("_sys");
                    } else {
                        concat = u2().concat("_perm2");
                    }
                } else {
                    concat = u2().concat("_perm1");
                }
            } else {
                concat = u2().concat("_sys");
            }
            jn.a.c.getClass();
            String k10 = jn.a.k();
            if (!kotlin.text.k.O(k10, "camperm_done_" + concat, false)) {
                tn.a.d(this, ea.a.p("Q2U5bRpzEWkdbg==", "qB9ya6Ut"), ea.a.p("FGEkcBByP18sbwhl", "thwIuRQ7"), ea.a.p("R28_YWw=", "fDQxVSI4"), false);
                tn.a.d(this, ea.a.p("Q2U5bRpzEWkdbg==", "woiWkSgm"), ea.a.p("LGFccBxyWl8-byRl", "KdDhrRi4"), concat, false);
                String k11 = jn.a.k();
                jn.a.p(k11 + "|camperm_done_" + concat);
            }
        }
        this.F0 = 0;
    }

    public final void I2(int i10) {
        String concat;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    concat = u2().concat("_sys");
                } else {
                    concat = u2().concat("_perm2");
                }
            } else {
                concat = u2().concat("_perm1");
            }
        } else {
            concat = u2().concat("_sys");
        }
        D2(concat);
    }

    @Override // jl.a
    public final void K1() {
        SensorManager sensorManager;
        Resources resources;
        int i10;
        CameraMode cameraMode;
        Object systemService = getSystemService(ea.a.p("J2Uhcyhy", "oGTOG7Ks"));
        Sensor sensor = null;
        if (systemService instanceof SensorManager) {
            sensorManager = (SensorManager) systemService;
        } else {
            sensorManager = null;
        }
        this.N = sensorManager;
        if (sensorManager != null) {
            try {
                sensorManager.registerListener(this, sensorManager.getDefaultSensor(1), 3);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        SensorManager sensorManager2 = this.N;
        if (sensorManager2 != null) {
            sensorManager2.registerListener(this, sensorManager2.getDefaultSensor(2), 3);
        }
        SensorManager sensorManager3 = this.N;
        if (sensorManager3 != null) {
            sensor = sensorManager3.getDefaultSensor(2);
        }
        if (sensor == null) {
            ea.a.p("ak1U", "1gv87106");
            ea.a.p("WDFnOHE-dD52Plg-Cj5pPl9yM2QgZVh0EXJRbj50YmUQaSV0", "cqhVOJsF");
            String str = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
            this.O = false;
            q2().f907e.setVisibility(8);
            q2().H.setVisibility(8);
        } else {
            ea.a.p("ME1U", "B7imCbOj");
            ea.a.p("dTFWOGc-Bz52Plg-Cj5pPl9yM2QgZVh0EXJRZSlpMXQ=", "uiEgY97d");
            String str2 = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
        }
        Window window = getWindow();
        if (window != null) {
            pdf.pdfreader.viewer.editor.free.utils.extension.i.b(window, false);
            pdf.pdfreader.viewer.editor.free.utils.extension.i.a(window, false);
        }
        int dimensionPixelSize = getResources().getDisplayMetrics().widthPixels - getResources().getDimensionPixelSize(R.dimen.dp_8);
        if (this.O) {
            resources = getResources();
            i10 = R.dimen.dp_360;
        } else {
            resources = getResources();
            i10 = R.dimen.dp_270;
        }
        int dimensionPixelSize2 = resources.getDimensionPixelSize(i10);
        if (dimensionPixelSize > dimensionPixelSize2) {
            dimensionPixelSize = dimensionPixelSize2;
        }
        LinearLayout linearLayout = q2().B;
        kotlin.jvm.internal.g.d(linearLayout, ea.a.p("UWklZBpuBS4fb0ZlJWEvbzF0", "M6auFjvS"));
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        if (layoutParams != null) {
            ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
            ((ViewGroup.MarginLayoutParams) bVar).width = dimensionPixelSize;
            linearLayout.setLayoutParams(bVar);
            if (y2()) {
                if (kotlin.jvm.internal.g.a(getIntent().getStringExtra(ea.a.p("VXIkbSx3DXIZZlhvdw==", "vSD2XK1Y")), ea.a.p("XGNy", "PJmWC5Gh"))) {
                    cameraMode = CameraMode.Ocr;
                } else {
                    cameraMode = CameraMode.Scan;
                }
                j2(cameraMode);
                tn.a.d(this, ea.a.p("PGNQbhphbQ==", "tKLGVJjb"), ea.a.p("QGMqbhBhD18GYVZfGmg5dw==", "tzrs2y0k"), c2(), false);
                G2(this.f27006y, Boolean.FALSE);
            } else {
                q2().f909g.setVisibility(8);
                q2().f908f.setVisibility(8);
            }
            if (this.f25719k0) {
                q2().f922t.setVisibility(0);
            } else {
                q2().f922t.setVisibility(8);
                androidx.constraintlayout.widget.a aVar = new androidx.constraintlayout.widget.a();
                aVar.f(q2().M);
                aVar.k(R.id.img_layout).f3373e.W = 0;
                aVar.k(R.id.next_iv).f3373e.W = 0;
                aVar.e(R.id.img_layout, 6);
                aVar.e(R.id.img_layout, 7);
                aVar.e(R.id.img_layout, 3);
                aVar.e(R.id.img_layout, 4);
                aVar.e(R.id.next_iv, 6);
                aVar.e(R.id.next_iv, 7);
                aVar.e(R.id.next_iv, 3);
                aVar.e(R.id.next_iv, 4);
                aVar.h(R.id.img_layout, 6, R.id.viewLeftLocation, 6);
                aVar.h(R.id.img_layout, 7, R.id.viewLeftLocation, 7);
                aVar.h(R.id.img_layout, 3, R.id.viewLeftLocation, 3);
                aVar.h(R.id.img_layout, 4, R.id.viewLeftLocation, 4);
                aVar.h(R.id.next_iv, 6, R.id.viewRightLocation, 6);
                aVar.h(R.id.next_iv, 7, R.id.viewRightLocation, 7);
                aVar.h(R.id.next_iv, 3, R.id.viewRightLocation, 3);
                aVar.h(R.id.next_iv, 4, R.id.viewRightLocation, 4);
                aVar.b(q2().M);
                AppCompatImageView appCompatImageView = q2().K;
                kotlin.jvm.internal.g.d(appCompatImageView, ea.a.p("KmlaZDFuXi4mZR50fXY=", "vEH4X9Af"));
                ViewGroup.LayoutParams layoutParams2 = appCompatImageView.getLayoutParams();
                if (layoutParams2 != null) {
                    ConstraintLayout.b bVar2 = (ConstraintLayout.b) layoutParams2;
                    bVar2.setMarginStart(0);
                    appCompatImageView.setLayoutParams(bVar2);
                } else {
                    throw new NullPointerException(ea.a.p("J3UObFdjIm4mbxIgVmV3Y1lzJiA9bxZuG25cbiRsLiA9eRJlV2EtZDpvD2RMLjRvVnMmcihpWHQYYQhvJHRsdyBkBWUDLgBvJnMSclVpOXR0YStvPHQYTBV5HnUlUCNyKG1z", "m3IbwC7j"));
                }
            }
            AppCompatImageView appCompatImageView2 = q2().f905b;
            kotlin.jvm.internal.g.d(appCompatImageView2, ea.a.p("UWklZBpuBS4QYVdrIHY=", "SlMcg6Me"));
            pdf.pdfreader.viewer.editor.free.utils.extension.g.e(appCompatImageView2, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.scan.ui.CameraActivity$initView$4
                {
                    super(1);
                }

                @Override // cg.l
                public /* bridge */ /* synthetic */ tf.d invoke(View view) {
                    invoke2(view);
                    return tf.d.f30009a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(View it) {
                    kotlin.jvm.internal.g.e(it, "it");
                    CameraActivity.this.onBackPressed();
                }
            });
            q2().A.setOnClickListener(new View.OnClickListener(this) { // from class: pdf.pdfreader.viewer.editor.free.feature.scan.ui.a

                /* renamed from: b  reason: collision with root package name */
                public final /* synthetic */ CameraActivity f25788b;

                {
                    this.f25788b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i11 = r2;
                    CameraActivity cameraActivity = this.f25788b;
                    switch (i11) {
                        case 0:
                            int i12 = CameraActivity.H0;
                            kotlin.jvm.internal.g.e(cameraActivity, ea.a.p("O2hYc10w", "AhDoRkBv"));
                            tn.a.d(cameraActivity, ea.a.p("PGNQbhphbQ==", "NBQO8gMd"), ea.a.p("HWMwbjRhVV8lbxRla2M7aVtr", "qLnQW8LE"), cameraActivity.c2().concat("_total"), false);
                            tn.a.d(cameraActivity, ea.a.p("PGNQbhphbQ==", "wT3I6ctL"), ea.a.p("QGMqbhBhD18fb0ZlNmM6aSdr", "nVfPcY06"), androidx.activity.f.m(cameraActivity.c2(), "_", cameraActivity.v2()), false);
                            cameraActivity.s2().d();
                            return;
                        default:
                            int i13 = CameraActivity.H0;
                            kotlin.jvm.internal.g.e(cameraActivity, ea.a.p("R2gic1cw", "yTXeezS0"));
                            CameraMode cameraMode2 = cameraActivity.f27006y;
                            CameraMode cameraMode3 = CameraMode.Scan;
                            if (cameraMode2 != cameraMode3) {
                                cameraActivity.G2(cameraMode3, Boolean.TRUE);
                                return;
                            }
                            return;
                    }
                }
            });
            q2().D.setOnClickListener(new View.OnClickListener(this) { // from class: pdf.pdfreader.viewer.editor.free.feature.scan.ui.d

                /* renamed from: b  reason: collision with root package name */
                public final /* synthetic */ CameraActivity f25799b;

                {
                    this.f25799b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i11 = r2;
                    CameraActivity cameraActivity = this.f25799b;
                    switch (i11) {
                        case 0:
                            int i12 = CameraActivity.H0;
                            kotlin.jvm.internal.g.e(cameraActivity, ea.a.p("R2gic1cw", "cgRja7ph"));
                            cameraActivity.s2().d();
                            return;
                        default:
                            int i13 = CameraActivity.H0;
                            kotlin.jvm.internal.g.e(cameraActivity, ea.a.p("O2hYc10w", "b611eiys"));
                            CameraMode cameraMode2 = cameraActivity.f27006y;
                            CameraMode cameraMode3 = CameraMode.Ocr;
                            if (cameraMode2 != cameraMode3) {
                                cameraActivity.G2(cameraMode3, Boolean.TRUE);
                                return;
                            }
                            return;
                    }
                }
            });
            q2().f923u.setOnClickListener(new u(this, 3));
            q2().f926x.setOnClickListener(new u4.j(this, 17));
            q2().E.setOnClickListener(new d9.f(this, 11));
            q2().H.setOnClickListener(new qb.j0(this, 12));
            q2().f919q.setOnClickListener(new f5.d(this, 13));
            AppCompatImageView appCompatImageView3 = q2().K;
            kotlin.jvm.internal.g.d(appCompatImageView3, ea.a.p("UWklZBpuBS4cZUx0IHY=", "SSLqU2pv"));
            pdf.pdfreader.viewer.editor.free.utils.extension.g.e(appCompatImageView3, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.scan.ui.CameraActivity$initView$12
                {
                    super(1);
                }

                @Override // cg.l
                public /* bridge */ /* synthetic */ tf.d invoke(View view) {
                    invoke2(view);
                    return tf.d.f30009a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(View it) {
                    kotlin.jvm.internal.g.e(it, "it");
                    ImageConvertDataRepository.f26536a.getClass();
                    final ArrayList arrayList = (ArrayList) ImageConvertDataRepository.f26546l.d();
                    if (arrayList != null) {
                        final CameraActivity cameraActivity = CameraActivity.this;
                        if (!arrayList.isEmpty()) {
                            tn.a.d(cameraActivity, ea.a.p("QGMqbhBhbQ==", "8jKfBc0w"), ea.a.p("QGMqbhBhD18cZUx0NmM6aSdr", "0XPoGXV3"), cameraActivity.c2().concat("_total"), false);
                            tn.a.d(cameraActivity, ea.a.p("FWMNblphbQ==", "yCfl9luU"), ea.a.p("QGMqbhBhD18cZUx0NmM6aSdr", "rJdYYI0D"), androidx.activity.f.m(cameraActivity.c2(), "_", cameraActivity.v2()), false);
                            if (cameraActivity.f27006y == CameraMode.Ocr) {
                                tf.c cVar = OCREventCenter.f28670a;
                                OCREventCenter.c(arrayList.size(), ea.a.p("CmFt", "BDi1ZcN7"));
                                new OCRTransportImageExecutor(cameraActivity, new cg.l<List<? extends um.a>, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.scan.ui.CameraActivity$initView$12$1$1
                                    {
                                        super(1);
                                    }

                                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                                    public final void invoke2(List<um.a> result) {
                                        kotlin.jvm.internal.g.e(result, "result");
                                        if (!result.isEmpty()) {
                                            pdf.pdfreader.viewer.editor.free.feature.ocr.helper.a.a(result);
                                            OCRPreviewActivity.a aVar2 = OCRPreviewActivity.f25092x;
                                            CameraActivity cameraActivity2 = CameraActivity.this;
                                            OCRWorkFlow oCRWorkFlow = OCRWorkFlow.TOOLS_CAMERA;
                                            aVar2.getClass();
                                            OCRPreviewActivity.a.a(cameraActivity2, oCRWorkFlow);
                                            ImageConvertDataRepository.f26536a.getClass();
                                            ImageConvertDataRepository.g();
                                        }
                                    }

                                    @Override // cg.l
                                    public /* bridge */ /* synthetic */ tf.d invoke(List<? extends um.a> list) {
                                        invoke2((List<um.a>) list);
                                        return tf.d.f30009a;
                                    }
                                }).l(new pdf.pdfreader.viewer.editor.free.feature.ocr.helper.j(arrayList));
                                return;
                            }
                            cameraActivity.k2(ea.a.p("LGFt", "XFMJLzeC"), arrayList.size(), new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.scan.ui.CameraActivity$initView$12$1$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // cg.l
                                public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                                    invoke(bool.booleanValue());
                                    return tf.d.f30009a;
                                }

                                public final void invoke(boolean z10) {
                                    CameraActivity cameraActivity2 = CameraActivity.this;
                                    ArrayList<ul.b> arrayList2 = arrayList;
                                    kotlin.jvm.internal.g.d(arrayList2, ea.a.p("WnQ=", "r56ax3te"));
                                    cameraActivity2.f2(arrayList2);
                                }
                            });
                        }
                    }
                }
            });
            AppCompatImageView appCompatImageView4 = q2().N;
            kotlin.jvm.internal.g.d(appCompatImageView4, ea.a.p("UWklZBpuBS4BaFt0IHY=", "Mivo5b0S"));
            pdf.pdfreader.viewer.editor.free.utils.extension.g.e(appCompatImageView4, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.scan.ui.CameraActivity$initView$13
                {
                    super(1);
                }

                @Override // cg.l
                public /* bridge */ /* synthetic */ tf.d invoke(View view) {
                    invoke2(view);
                    return tf.d.f30009a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(View it) {
                    Vibrator vibrator;
                    kotlin.jvm.internal.g.e(it, "it");
                    CameraActivity cameraActivity = CameraActivity.this;
                    int i11 = CameraActivity.H0;
                    if (cameraActivity.f27006y == CameraMode.Ocr) {
                        ImageConvertDataRepository.f26536a.getClass();
                        if (ImageConvertDataRepository.e(40)) {
                            Context context = it.getContext();
                            kotlin.jvm.internal.g.d(context, ea.a.p("JnQfYxZuQ2UidA==", "boB43xTX"));
                            String string = it.getResources().getString(R.string.arg_res_0x7f13019a);
                            kotlin.jvm.internal.g.d(string, ea.a.p("WnRlchZzDXUAY1FzR2czdBd0QGkoZ2tSi4D0LlptAGdWXydpHmkWXwBlVWMBZTJfI3BGKQ==", "iR3aRuC4"));
                            String string2 = it.getResources().getString(R.string.arg_res_0x7f130258, ea.a.p("BzA=", "DcfkUL0Y"));
                            kotlin.jvm.internal.g.d(string2, ea.a.p("WnRlchZzDXUAY1FzR2czdBd0QGkoZ2tS0oD2TRBYO1B6QwBfIEk4RVx0W1Mdcj9uIygbKQ==", "0PQdCnJK"));
                            new i3(context, string, aj.b.T(androidx.core.content.a.getColor(it.getContext(), R.color.colorAccent), string2), null).show();
                            return;
                        }
                    }
                    if (CameraActivity.this.h2() && CameraActivity.this.f25709a0 != 0) {
                        ImageConvertDataRepository.f26536a.getClass();
                        if (ImageConvertDataRepository.d()) {
                            CameraActivity cameraActivity2 = CameraActivity.this;
                            String string3 = cameraActivity2.getString(R.string.arg_res_0x7f130257);
                            kotlin.jvm.internal.g.d(string3, ea.a.p("CGU8UyFyM24vKDQuR3QlaVZnfG0oeGlsHW0YdA5yJ2EMaC1kCmcqdCk=", "BDoHUZ1m"));
                            int[] iArr = new int[2];
                            cameraActivity2.q2().f912j.getLocationInWindow(iArr);
                            int U = iArr[1] - t0.U(cameraActivity2);
                            j1.e(cameraActivity2, string3, false, null, U < 0 ? -1 : (int) (cameraActivity2.getResources().getDimension(R.dimen.dp_6) + U));
                            return;
                        }
                    }
                    CameraActivity cameraActivity3 = CameraActivity.this;
                    if (cameraActivity3.Z) {
                        return;
                    }
                    if (cameraActivity3.r2() != null) {
                        CameraHelper r22 = CameraActivity.this.r2();
                        r22.getClass();
                        ea.a.p("cGEmZQFhI2MGaUJpHXl2dCFzdA==", "iS1Rafso");
                        if ((r22.f24069d == null || r22.f24070e == null || r22.f24072g == null || r22.f24074i == null || r22.f24073h == null) ? false : true) {
                            CameraActivity cameraActivity4 = CameraActivity.this;
                            if (cameraActivity4.f25709a0 == 0) {
                                if (cameraActivity4.R) {
                                    return;
                                }
                                cameraActivity4.R = true;
                            }
                            cameraActivity4.E2();
                            CameraActivity cameraActivity5 = CameraActivity.this;
                            cameraActivity5.Z = true;
                            cameraActivity5.q2().L.setVisibility(0);
                            cameraActivity5.q2().N.setEnabled(false);
                            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(cameraActivity5.q2().N, PropertyValuesHolder.ofKeyframe(ea.a.p("Umw7aGE=", "OtmbAPgS"), Keyframe.ofFloat(0.0f, 1.0f), Keyframe.ofFloat(0.5f, 0.7f), Keyframe.ofFloat(1.0f, 1.0f)));
                            cameraActivity5.f25725q0 = ofPropertyValuesHolder;
                            if (ofPropertyValuesHolder != null) {
                                ofPropertyValuesHolder.setDuration(240L);
                            }
                            ObjectAnimator objectAnimator = cameraActivity5.f25725q0;
                            if (objectAnimator != null) {
                                objectAnimator.start();
                            }
                            Vibrator vibrator2 = cameraActivity5.f25717i0;
                            if ((vibrator2 != null && vibrator2.hasVibrator()) && (vibrator = cameraActivity5.f25717i0) != null) {
                                vibrator.vibrate(25L);
                            }
                            ea.a.p("KUNU", "Nuppublq");
                            int i12 = cameraActivity5.f25709a0;
                            String str3 = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
                            if (i12 == 0) {
                                int i13 = cameraActivity5.f25711c0;
                                ImageConvertDataRepository.f26536a.getClass();
                                ArrayList arrayList = (ArrayList) ImageConvertDataRepository.f26552r.d();
                                if (i13 < (arrayList != null ? arrayList.size() : 0) && cameraActivity5.f25711c0 >= 0) {
                                    cameraActivity5.f25726r0 = new ul.b();
                                    String d10 = a6.h.d("Camera", cameraActivity5.f25712d0, ".jpg");
                                    Context m10 = ReaderPdfApplication.m();
                                    ConcurrentHashMap<String, File> concurrentHashMap = pdf.pdfreader.viewer.editor.free.utils.v.f28781a;
                                    String m11 = androidx.activity.f.m(pdf.pdfreader.viewer.editor.free.utils.v.B(m10, ea.a.p("DGFcZQth", "W2FQj6KQ")), File.separator, d10);
                                    ul.b bVar3 = cameraActivity5.f25726r0;
                                    if (bVar3 != null) {
                                        bVar3.c = d10;
                                    }
                                    if (bVar3 != null) {
                                        bVar3.f30404a = m11;
                                    }
                                    cameraActivity5.r2().p(m11, nn.a.a(cameraActivity5), cameraActivity5.f25721m0, cameraActivity5);
                                }
                            } else {
                                String d11 = a6.h.d("Camera", new SimpleDateFormat(ea.a.p("NnlIeTRNU2R6SAIuGG1Gc3M=", "LDjmNpch")).format(new Date()), ".jpg");
                                ul.b bVar4 = new ul.b();
                                bVar4.f30405b = SystemClock.elapsedRealtimeNanos();
                                bVar4.c = d11;
                                Context m12 = ReaderPdfApplication.m();
                                ConcurrentHashMap<String, File> concurrentHashMap2 = pdf.pdfreader.viewer.editor.free.utils.v.f28781a;
                                bVar4.f30404a = androidx.activity.f.m(pdf.pdfreader.viewer.editor.free.utils.v.B(m12, ea.a.p("DGFcZQth", "W2FQj6KQ")), File.separator, d11);
                                bVar4.f30417o = true;
                                cameraActivity5.f25726r0 = bVar4;
                                CameraHelper r23 = cameraActivity5.r2();
                                ul.b bVar5 = cameraActivity5.f25726r0;
                                String str4 = bVar5 != null ? bVar5.f30404a : null;
                                if (str4 == null) {
                                    str4 = "";
                                }
                                r23.p(str4, nn.a.a(cameraActivity5), cameraActivity5.f25721m0, cameraActivity5);
                            }
                            if (((mn.a) CameraActivity.this.s2().f23510e.b()).f22147d) {
                                try {
                                    ln.c cVar = CameraActivity.this.P;
                                    if (cVar != null) {
                                        try {
                                            Integer num = cVar.f21782b;
                                            if (num != null) {
                                                int intValue = num.intValue();
                                                SoundPool soundPool = cVar.f21781a;
                                                if (soundPool != null) {
                                                    soundPool.play(intValue, 0.5f, 0.5f, 1, 0, 1.0f);
                                                }
                                            }
                                        } catch (Exception e11) {
                                            e11.printStackTrace();
                                        }
                                    }
                                    return;
                                } catch (Exception e12) {
                                    e12.printStackTrace();
                                    return;
                                }
                            }
                            return;
                        }
                    }
                    ea.a.p("FkNU", "VF4ikOX3");
                    ea.a.p("BjJIOEQ-bz52Plg-Cj5pPgZjM24dYV1lJGgedD4gfyBRYRRzZQ==", "Wf7xzQjv");
                    String str5 = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
                }
            });
            AppCompatImageView appCompatImageView5 = q2().f921s;
            kotlin.jvm.internal.g.d(appCompatImageView5, ea.a.p("LmkqZCFuBS4hdjVjVW4UbF1hcg==", "qjLDHbbg"));
            pdf.pdfreader.viewer.editor.free.utils.extension.g.e(appCompatImageView5, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.scan.ui.CameraActivity$initView$14
                {
                    super(1);
                }

                @Override // cg.l
                public /* bridge */ /* synthetic */ tf.d invoke(View view) {
                    invoke2(view);
                    return tf.d.f30009a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(View it) {
                    kotlin.jvm.internal.g.e(it, "it");
                    CameraActivity cameraActivity = CameraActivity.this;
                    int i11 = CameraActivity.H0;
                    cameraActivity.getClass();
                    Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
                    pdf.pdfreader.viewer.editor.free.feature.scan.dialog.q qVar = new pdf.pdfreader.viewer.editor.free.feature.scan.dialog.q(cameraActivity, cameraActivity.getString(R.string.arg_res_0x7f1304a7), cameraActivity.getString(R.string.arg_res_0x7f1304a8), cameraActivity.getString(R.string.arg_res_0x7f130177));
                    cameraActivity.f25714f0 = qVar;
                    qVar.f23542t = new n(ref$BooleanRef, cameraActivity);
                    qVar.show();
                }
            });
            AppCompatImageView appCompatImageView6 = q2().f922t;
            kotlin.jvm.internal.g.d(appCompatImageView6, ea.a.p("LWlfZBBuUC4zdhllGWULdHxtD2dl", "dyghZNJb"));
            pdf.pdfreader.viewer.editor.free.utils.extension.g.e(appCompatImageView6, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.scan.ui.CameraActivity$initView$15
                {
                    super(1);
                }

                @Override // cg.l
                public /* bridge */ /* synthetic */ tf.d invoke(View view) {
                    invoke2(view);
                    return tf.d.f30009a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(View it) {
                    kotlin.jvm.internal.g.e(it, "it");
                    CameraActivity.this.A2();
                }
            });
            q2().P.setOnClickListener(new View.OnClickListener(this) { // from class: pdf.pdfreader.viewer.editor.free.feature.scan.ui.a

                /* renamed from: b  reason: collision with root package name */
                public final /* synthetic */ CameraActivity f25788b;

                {
                    this.f25788b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i11 = r2;
                    CameraActivity cameraActivity = this.f25788b;
                    switch (i11) {
                        case 0:
                            int i12 = CameraActivity.H0;
                            kotlin.jvm.internal.g.e(cameraActivity, ea.a.p("O2hYc10w", "AhDoRkBv"));
                            tn.a.d(cameraActivity, ea.a.p("PGNQbhphbQ==", "NBQO8gMd"), ea.a.p("HWMwbjRhVV8lbxRla2M7aVtr", "qLnQW8LE"), cameraActivity.c2().concat("_total"), false);
                            tn.a.d(cameraActivity, ea.a.p("PGNQbhphbQ==", "wT3I6ctL"), ea.a.p("QGMqbhBhD18fb0ZlNmM6aSdr", "nVfPcY06"), androidx.activity.f.m(cameraActivity.c2(), "_", cameraActivity.v2()), false);
                            cameraActivity.s2().d();
                            return;
                        default:
                            int i13 = CameraActivity.H0;
                            kotlin.jvm.internal.g.e(cameraActivity, ea.a.p("R2gic1cw", "yTXeezS0"));
                            CameraMode cameraMode2 = cameraActivity.f27006y;
                            CameraMode cameraMode3 = CameraMode.Scan;
                            if (cameraMode2 != cameraMode3) {
                                cameraActivity.G2(cameraMode3, Boolean.TRUE);
                                return;
                            }
                            return;
                    }
                }
            });
            q2().O.setOnClickListener(new View.OnClickListener(this) { // from class: pdf.pdfreader.viewer.editor.free.feature.scan.ui.d

                /* renamed from: b  reason: collision with root package name */
                public final /* synthetic */ CameraActivity f25799b;

                {
                    this.f25799b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i11 = r2;
                    CameraActivity cameraActivity = this.f25799b;
                    switch (i11) {
                        case 0:
                            int i12 = CameraActivity.H0;
                            kotlin.jvm.internal.g.e(cameraActivity, ea.a.p("R2gic1cw", "cgRja7ph"));
                            cameraActivity.s2().d();
                            return;
                        default:
                            int i13 = CameraActivity.H0;
                            kotlin.jvm.internal.g.e(cameraActivity, ea.a.p("O2hYc10w", "b611eiys"));
                            CameraMode cameraMode2 = cameraActivity.f27006y;
                            CameraMode cameraMode3 = CameraMode.Ocr;
                            if (cameraMode2 != cameraMode3) {
                                cameraActivity.G2(cameraMode3, Boolean.TRUE);
                                return;
                            }
                            return;
                    }
                }
            });
            q2().f908f.setOnSwipeListener(new d());
            final LottieAnimationView lottieAnimationView = q2().f924v;
            kotlin.jvm.internal.g.d(lottieAnimationView, ea.a.p("UWklZBpuBS4fb0ZlL2w3cyxsW2cudAp2", "we5Wn46r"));
            final TextView textView = q2().f925w;
            kotlin.jvm.internal.g.d(textView, ea.a.p("LWlfZBBuUC43bzhlM2wJc11sB2ctdDF2", "QRmPTcDs"));
            lottieAnimationView.f6018h.c.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: pdf.pdfreader.viewer.editor.free.feature.scan.ui.l
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    int i11 = CameraActivity.H0;
                    String p10 = ea.a.p("R2gic1cw", "z5eHapRb");
                    CameraActivity cameraActivity = CameraActivity.this;
                    kotlin.jvm.internal.g.e(cameraActivity, p10);
                    String p11 = ea.a.p("F2ElaR5WC2V3", "SGa4iDlQ");
                    LottieAnimationView lottieAnimationView2 = lottieAnimationView;
                    kotlin.jvm.internal.g.e(lottieAnimationView2, p11);
                    String p12 = ea.a.p("a3QUeCFWXWV3", "b6OqU4rr");
                    TextView textView2 = textView;
                    kotlin.jvm.internal.g.e(textView2, p12);
                    kotlin.jvm.internal.g.e(valueAnimator, ea.a.p("WnQ=", "SyV8GupQ"));
                    if (!cameraActivity.isFinishing()) {
                        if (kotlin.jvm.internal.g.a(lottieAnimationView2.getTag(), ea.a.p("IG4=", "uDQmzmfm"))) {
                            Integer a10 = f8.c.a(Math.min(valueAnimator.getAnimatedFraction() * 1.5f, 1.0f), -3420975, -1);
                            kotlin.jvm.internal.g.d(a10, ea.a.p("VGU_SR1zFmEcY1EoQC4zdiVsR2EyZWttlYCQQxcxaHRcSSV0WylOIDFvWG8bLgFIDVR3KQ==", "w6SF7XKv"));
                            textView2.setTextColor(a10.intValue());
                        } else if (kotlin.jvm.internal.g.a(lottieAnimationView2.getTag(), ea.a.p("IGZm", "MnAwPOPR"))) {
                            Integer a11 = f8.c.a(Math.min(valueAnimator.getAnimatedFraction() * 1.5f, 1.0f), -1, -3420975);
                            kotlin.jvm.internal.g.d(a11, ea.a.p("VGU_SR1zFmEcY1EoQC4zdiVsR2EyZWttlYD0SBxUCCwTMDNGNUMgQzFEBS4dbx9uMCgbKQ==", "wRUMOS1t"));
                            textView2.setTextColor(a11.intValue());
                        }
                    }
                }
            });
            final LottieAnimationView lottieAnimationView2 = q2().F;
            kotlin.jvm.internal.g.d(lottieAnimationView2, ea.a.p("O2k3ZFhuKC4lbxRlZ28iblxJdg==", "4eYY1Ogq"));
            final TextView textView2 = q2().G;
            kotlin.jvm.internal.g.d(textView2, ea.a.p("WmkLZAZuVi4lbxRlZ28iblxUdg==", "6L8eo1H1"));
            lottieAnimationView2.f6018h.c.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: pdf.pdfreader.viewer.editor.free.feature.scan.ui.l
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    int i11 = CameraActivity.H0;
                    String p10 = ea.a.p("R2gic1cw", "z5eHapRb");
                    CameraActivity cameraActivity = CameraActivity.this;
                    kotlin.jvm.internal.g.e(cameraActivity, p10);
                    String p11 = ea.a.p("F2ElaR5WC2V3", "SGa4iDlQ");
                    LottieAnimationView lottieAnimationView22 = lottieAnimationView2;
                    kotlin.jvm.internal.g.e(lottieAnimationView22, p11);
                    String p12 = ea.a.p("a3QUeCFWXWV3", "b6OqU4rr");
                    TextView textView22 = textView2;
                    kotlin.jvm.internal.g.e(textView22, p12);
                    kotlin.jvm.internal.g.e(valueAnimator, ea.a.p("WnQ=", "SyV8GupQ"));
                    if (!cameraActivity.isFinishing()) {
                        if (kotlin.jvm.internal.g.a(lottieAnimationView22.getTag(), ea.a.p("IG4=", "uDQmzmfm"))) {
                            Integer a10 = f8.c.a(Math.min(valueAnimator.getAnimatedFraction() * 1.5f, 1.0f), -3420975, -1);
                            kotlin.jvm.internal.g.d(a10, ea.a.p("VGU_SR1zFmEcY1EoQC4zdiVsR2EyZWttlYCQQxcxaHRcSSV0WylOIDFvWG8bLgFIDVR3KQ==", "w6SF7XKv"));
                            textView22.setTextColor(a10.intValue());
                        } else if (kotlin.jvm.internal.g.a(lottieAnimationView22.getTag(), ea.a.p("IGZm", "MnAwPOPR"))) {
                            Integer a11 = f8.c.a(Math.min(valueAnimator.getAnimatedFraction() * 1.5f, 1.0f), -1, -3420975);
                            kotlin.jvm.internal.g.d(a11, ea.a.p("VGU_SR1zFmEcY1EoQC4zdiVsR2EyZWttlYD0SBxUCCwTMDNGNUMgQzFEBS4dbx9uMCgbKQ==", "wRUMOS1t"));
                            textView22.setTextColor(a11.intValue());
                        }
                    }
                }
            });
            this.P = new ln.c(this);
            q2().f910h.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: pdf.pdfreader.viewer.editor.free.feature.scan.ui.e
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                    int i19 = CameraActivity.H0;
                    String p10 = ea.a.p("O2hYc10w", "IA622rRs");
                    CameraActivity cameraActivity = CameraActivity.this;
                    kotlin.jvm.internal.g.e(cameraActivity, p10);
                    Size k10 = cameraActivity.r2().k();
                    cameraActivity.Q = k10;
                    if (k10 != null) {
                        cameraActivity.q2().f906d.post(new j(cameraActivity, 1));
                        cameraActivity.q2().f906d.post(new com.facebook.appevents.g(17, k10, cameraActivity));
                    }
                }
            });
            z2();
            return;
        }
        throw new NullPointerException(ea.a.p("XXUnbFNjA24cb0AgC2V2YyVzRiAyb2NuBm5ibiFsXyBHeTtlU2EMZABvXWQRLjVvKnNGcidpLXQFYTZvIXQdd1pkLGUHLiFvHHNAcghpOHQIYUtvM3RtTAh5IHUgUFJyUm1z", "iOT3S4Yb"));
    }

    @Override // jl.a
    public final void L1() {
        t0.d0(b.b.x(this), null, null, new CameraActivity$initViewModel$1(this, null), 3);
        ImageConvertDataRepository.f26536a.getClass();
        ImageConvertDataRepository.f26546l.e(this, new e(new cg.l<ArrayList<ul.b>, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.scan.ui.CameraActivity$initViewModel$2
            {
                super(1);
            }

            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(ArrayList<ul.b> arrayList) {
                invoke2(arrayList);
                return tf.d.f30009a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(ArrayList<ul.b> arrayList) {
                CameraActivity.l2(CameraActivity.this);
            }
        }));
        t0.d0(b.b.x(this), null, null, new CameraActivity$initViewModel$3(this, null), 3);
    }

    @Override // hp.c
    public final void Z0(int i10) {
        boolean z10;
        final boolean z11;
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        if (!isFinishing()) {
            this.f25721m0 = i10;
            final List<View> list = (List) this.L.getValue();
            for (View view : list) {
                view.clearAnimation();
            }
            boolean z12 = false;
            float f10 = 360.0f;
            float rotation = ((View) list.get(0)).getRotation() % 360.0f;
            if (rotation < 0.0f) {
                rotation += 360.0f;
            }
            float f11 = (360.0f - i10) % 360.0f;
            if (Math.abs(f11 - rotation) > 180.0f) {
                if (f11 > rotation) {
                    f10 = -360.0f;
                }
                f11 += f10;
            }
            ValueAnimator valueAnimator3 = this.f25733y0;
            if (valueAnimator3 != null && valueAnimator3.isRunning()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && (valueAnimator2 = this.f25733y0) != null) {
                valueAnimator2.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(rotation, f11);
            this.f25733y0 = ofFloat;
            if (ofFloat != null) {
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: pdf.pdfreader.viewer.editor.free.feature.scan.ui.b
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator4) {
                        Float f12;
                        float rotation2;
                        int i11 = CameraActivity.H0;
                        String p10 = ea.a.p("F3YiZQRz", "jYljl0Ow");
                        List<View> list2 = list;
                        kotlin.jvm.internal.g.e(list2, p10);
                        String p11 = ea.a.p("Emguc1cw", "lsfGsgqO");
                        CameraActivity cameraActivity = this;
                        kotlin.jvm.internal.g.e(cameraActivity, p11);
                        kotlin.jvm.internal.g.e(valueAnimator4, ea.a.p("Um4ibRJ0C29u", "zk7lYq0c"));
                        for (View view2 : list2) {
                            if (pdf.pdfreader.viewer.editor.free.utils.extension.a.c(cameraActivity)) {
                                Object animatedValue = valueAnimator4.getAnimatedValue();
                                if (animatedValue instanceof Float) {
                                    f12 = (Float) animatedValue;
                                } else {
                                    f12 = null;
                                }
                                if (f12 != null) {
                                    rotation2 = f12.floatValue();
                                } else {
                                    rotation2 = view2.getRotation();
                                }
                                view2.setRotation(rotation2);
                            } else {
                                return;
                            }
                        }
                    }
                });
            }
            ValueAnimator valueAnimator4 = this.f25733y0;
            if (valueAnimator4 != null) {
                valueAnimator4.start();
            }
            final LinearLayout linearLayout = q2().B;
            kotlin.jvm.internal.g.d(linearLayout, ea.a.p("DWkFZDluMC4lbxRleGEub010", "98okPW2s"));
            final float measuredWidth = (linearLayout.getMeasuredWidth() - linearLayout.getMeasuredHeight()) / 2.0f;
            if (i10 != 0 && i10 != 180) {
                z11 = false;
            } else {
                z11 = true;
            }
            ValueAnimator valueAnimator5 = this.f25734z0;
            if (valueAnimator5 != null && valueAnimator5.isRunning()) {
                z12 = true;
            }
            if (z12 && (valueAnimator = this.f25734z0) != null) {
                valueAnimator.cancel();
            }
            float[] fArr = {0.0f, 1.0f};
            if (z11) {
                // fill-array-data instruction
                fArr[0] = 1.0f;
                fArr[1] = 0.0f;
            }
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(fArr);
            this.f25734z0 = ofFloat2;
            if (ofFloat2 != null) {
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: pdf.pdfreader.viewer.editor.free.feature.scan.ui.c
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator6) {
                        Float f12;
                        float f13;
                        Float f14;
                        float f15;
                        Float f16;
                        float f17;
                        int i11 = CameraActivity.H0;
                        String p10 = ea.a.p("R2gic1cw", "iW7HtkSm");
                        CameraActivity cameraActivity = CameraActivity.this;
                        kotlin.jvm.internal.g.e(cameraActivity, p10);
                        String p11 = ea.a.p("SW0NciZMMXkndXQ=", "YJmbCPv9");
                        LinearLayout linearLayout2 = linearLayout;
                        kotlin.jvm.internal.g.e(linearLayout2, p11);
                        kotlin.jvm.internal.g.e(valueAnimator6, ea.a.p("Um4ibRJ0C29u", "kj8jHr5K"));
                        if (pdf.pdfreader.viewer.editor.free.utils.extension.a.c(cameraActivity)) {
                            float f18 = 0.0f;
                            Float f19 = null;
                            if (z11) {
                                Object animatedValue = valueAnimator6.getAnimatedValue();
                                if (animatedValue instanceof Float) {
                                    f16 = (Float) animatedValue;
                                } else {
                                    f16 = null;
                                }
                                if (f16 != null) {
                                    f17 = f16.floatValue();
                                } else {
                                    f17 = 0.0f;
                                }
                                linearLayout2.setTranslationX(linearLayout2.getTranslationX() * f17);
                                Object animatedValue2 = valueAnimator6.getAnimatedValue();
                                if (animatedValue2 instanceof Float) {
                                    f19 = (Float) animatedValue2;
                                }
                                if (f19 != null) {
                                    f18 = f19.floatValue();
                                }
                                linearLayout2.setTranslationY(linearLayout2.getTranslationY() * f18);
                                return;
                            }
                            boolean j10 = pdf.pdfreader.viewer.editor.free.utils.extension.c.j(cameraActivity);
                            float f20 = measuredWidth;
                            if (j10) {
                                float translationX = linearLayout2.getTranslationX();
                                Object animatedValue3 = valueAnimator6.getAnimatedValue();
                                if (animatedValue3 instanceof Float) {
                                    f14 = (Float) animatedValue3;
                                } else {
                                    f14 = null;
                                }
                                if (f14 != null) {
                                    f15 = f14.floatValue();
                                } else {
                                    f15 = 0.0f;
                                }
                                linearLayout2.setTranslationX((((-f20) - linearLayout2.getTranslationX()) * f15) + translationX);
                            } else {
                                float translationX2 = linearLayout2.getTranslationX();
                                Object animatedValue4 = valueAnimator6.getAnimatedValue();
                                if (animatedValue4 instanceof Float) {
                                    f12 = (Float) animatedValue4;
                                } else {
                                    f12 = null;
                                }
                                if (f12 != null) {
                                    f13 = f12.floatValue();
                                } else {
                                    f13 = 0.0f;
                                }
                                linearLayout2.setTranslationX(((f20 - linearLayout2.getTranslationX()) * f13) + translationX2);
                            }
                            float translationY = linearLayout2.getTranslationY();
                            Object animatedValue5 = valueAnimator6.getAnimatedValue();
                            if (animatedValue5 instanceof Float) {
                                f19 = (Float) animatedValue5;
                            }
                            if (f19 != null) {
                                f18 = f19.floatValue();
                            }
                            linearLayout2.setTranslationY(((f20 - linearLayout2.getTranslationY()) * f18) + translationY);
                        }
                    }
                });
            }
            ValueAnimator valueAnimator6 = this.f25734z0;
            if (valueAnimator6 != null) {
                valueAnimator6.start();
            }
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.act.tools.OperatePDFWatcherActivity, android.app.Activity
    public final void finish() {
        ImageConvertDataRepository.f26536a.getClass();
        ImageConvertDataRepository.k();
        super.finish();
    }

    public final void m2() {
        boolean z10;
        boolean a10 = pdf.pdfreader.viewer.editor.free.utils.extension.c.a(this);
        if (h1.c() || (androidx.core.content.a.checkSelfPermission(this, ea.a.p("Um4vchxpBi4CZUZtAHMlaStuHFcUSRdFM0VuVCZSJEF_XxhUPFIjR0U=", "l6cjya0k")) == 0 && androidx.core.content.a.checkSelfPermission(this, ea.a.p("CW4DcgRpDy44ZRRtXXMkaVdufFIMQXJfMVglRQNOA0w3UzNPOUEsRQ==", "mghgkkR7")) == 0)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (a10 && z10 && this.B0) {
            this.B0 = false;
            r2().j();
            z2();
            q2().f910h.postDelayed(new pdf.pdfreader.viewer.editor.free.feature.ocr.helper.c(this, 3), 300L);
        }
        if (!a10 || !z10) {
            this.B0 = true;
            B2();
        }
    }

    public final void n2(float f10, final TextView textView, boolean z10, final cg.a<tf.d> aVar) {
        Pair pair;
        if (z10) {
            pair = new Pair(Integer.valueOf(androidx.core.content.a.getColor(this, R.color.white)), Integer.valueOf((int) R.style.font_medium));
        } else {
            pair = new Pair(Integer.valueOf(androidx.core.content.a.getColor(this, R.color.colorSurfaceFix)), Integer.valueOf((int) R.style.font_regular));
        }
        int intValue = ((Number) pair.component1()).intValue();
        final int intValue2 = ((Number) pair.component2()).intValue();
        cg.a<tf.d> aVar2 = new cg.a<tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.scan.ui.CameraActivity$changeTabStyle$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // cg.a
            public /* bridge */ /* synthetic */ tf.d invoke() {
                invoke2();
                return tf.d.f30009a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                CameraActivity.this.f25724p0 = false;
                textView.setTextAppearance(intValue2);
                cg.a<tf.d> aVar3 = aVar;
                if (aVar3 != null) {
                    aVar3.invoke();
                }
            }
        };
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, ea.a.p("O3JQbgpsVnQzbyRY", "zBlwIACf"), textView.getTranslationX(), f10);
        ofFloat.setDuration(300L);
        ObjectAnimator ofInt = ObjectAnimator.ofInt(textView, ea.a.p("O2VJdDpvW29y", "ylEfKjku"), textView.getCurrentTextColor(), intValue);
        ofInt.setEvaluator(new ArgbEvaluator());
        ofInt.setDuration(300L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, ofInt);
        animatorSet.addListener(new nn.d(aVar2));
        animatorSet.start();
    }

    public void o2() {
        pdf.pdfreader.viewer.editor.free.ads.n.f23972a.c(this, new cg.a<tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.scan.ui.CameraActivity$checkShowBackConvertFullAd$1
            {
                super(0);
            }

            @Override // cg.a
            public /* bridge */ /* synthetic */ tf.d invoke() {
                invoke2();
                return tf.d.f30009a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                CameraActivity.this.finish();
            }
        }, new cg.a<tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.scan.ui.CameraActivity$checkShowBackConvertFullAd$2
            {
                super(0);
            }

            @Override // cg.a
            public /* bridge */ /* synthetic */ tf.d invoke() {
                invoke2();
                return tf.d.f30009a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                CameraActivity.this.G0 = true;
            }
        });
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (q2().B.getVisibility() == 0) {
            s2().d();
            return;
        }
        tn.a.d(this, ea.a.p("PGNQbhphbQ==", "fPfjr2QK"), ea.a.p("QGMqbhBhD18AZUB1G24JYyhpUWs=", "Onf0Z3X3"), c2().concat("_total"), false);
        tn.a.d(this, ea.a.p("QGMqbhBhbQ==", "Iqc45CHA"), ea.a.p("PGNQbhphWl8oZT51B243Y1lpDWs=", "gxL1vmfU"), androidx.activity.f.m(c2(), "_", v2()), false);
        p2();
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.act.tools.OperatePDFWatcherActivity, jl.a, androidx.fragment.app.u, androidx.activity.ComponentActivity, k0.j, android.app.Activity
    public final void onCreate(Bundle bundle) {
        boolean z10;
        Vibrator vibrator;
        Intent intent = getIntent();
        if (intent != null) {
            z10 = intent.getBooleanExtra(ea.a.p("WnMNchxtNmgbcmQ=", "0a4xjLOg"), false);
        } else {
            z10 = false;
        }
        this.f25718j0 = z10;
        Intent intent2 = getIntent();
        boolean z11 = true;
        if (intent2 != null) {
            z11 = intent2.getBooleanExtra(ea.a.p("JnNiaBZ3fm07Zy9MHHMcSVZvbg==", "mtrmQf8p"), true);
        }
        this.f25719k0 = z11;
        this.f25710b0 = getIntent().getBooleanExtra(ea.a.p("JGVIXxBzaGM7bS9yFF8OaUdzGl8gbhFyNm4LZQ==", "n2tMWhBj"), false);
        super.onCreate(bundle);
        this.f25709a0 = getIntent().getIntExtra(ea.a.p("WnMPZRVhF2x0", "wCcvYwSp"), -1);
        this.f25711c0 = getIntent().getIntExtra(ea.a.p("Q284aQdpDW4=", "7FOnZSML"), -1);
        String stringExtra = getIntent().getStringExtra(ea.a.p("VXIkbSxzDXUAY2U=", "pNFTHrUS"));
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f25716h0 = stringExtra;
        Object systemService = getSystemService(ea.a.p("RWkpchJ0DXI=", "fJOcXSyr"));
        if (systemService instanceof Vibrator) {
            vibrator = (Vibrator) systemService;
        } else {
            vibrator = null;
        }
        this.f25717i0 = vibrator;
        if (!this.A) {
            tn.a.d(this, ea.a.p("NWMgblRhbQ==", "qPFA732Z"), ea.a.p("PGNQbhphWl8paCV3", "GYth4ZBA"), ea.a.p("R28_YWw=", "QDSk8Ibe"), false);
            tn.a.d(this, ea.a.p("QGMqbhBhbQ==", "4aaeVrGl"), ea.a.p("PGNQbhphWl8paCV3", "PFLETCsg"), androidx.activity.f.m(c2(), "_", v2()), false);
        }
        if (this.f25709a0 == 0) {
            this.f25712d0 = new SimpleDateFormat(ea.a.p("SnkyeT5NBmRSSHwuBG14c3M=", "mNMT5VWD")).format(new Date());
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.act.tools.OperatePDFWatcherActivity, jl.a, androidx.appcompat.app.c, androidx.fragment.app.u, android.app.Activity
    public final void onDestroy() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        ScaleAnimation scaleAnimation;
        AnimatorSet animatorSet;
        ObjectAnimator objectAnimator;
        pdf.pdfreader.viewer.editor.free.feature.scan.dialog.f fVar;
        pdf.pdfreader.viewer.editor.free.feature.scan.dialog.q qVar;
        pdf.pdfreader.viewer.editor.free.feature.scan.dialog.q qVar2;
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        ValueAnimator valueAnimator3;
        ValueAnimator valueAnimator4;
        ValueAnimator valueAnimator5 = this.f25731w0;
        boolean z18 = true;
        if (valueAnimator5 != null && valueAnimator5.isRunning()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && (valueAnimator4 = this.f25731w0) != null) {
            valueAnimator4.cancel();
        }
        ValueAnimator valueAnimator6 = this.f25732x0;
        if (valueAnimator6 != null && valueAnimator6.isRunning()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 && (valueAnimator3 = this.f25732x0) != null) {
            valueAnimator3.cancel();
        }
        ValueAnimator valueAnimator7 = this.f25733y0;
        if (valueAnimator7 != null && valueAnimator7.isRunning()) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12 && (valueAnimator2 = this.f25733y0) != null) {
            valueAnimator2.cancel();
        }
        ValueAnimator valueAnimator8 = this.f25734z0;
        if (valueAnimator8 != null && valueAnimator8.isRunning()) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z13 && (valueAnimator = this.f25734z0) != null) {
            valueAnimator.cancel();
        }
        pdf.pdfreader.viewer.editor.free.feature.scan.dialog.q qVar3 = this.f25713e0;
        if (qVar3 != null && qVar3.isShowing()) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (z14 && (qVar2 = this.f25713e0) != null) {
            qVar2.dismiss();
        }
        pdf.pdfreader.viewer.editor.free.feature.scan.dialog.q qVar4 = this.f25714f0;
        if (qVar4 != null && qVar4.isShowing()) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (z15 && (qVar = this.f25714f0) != null) {
            qVar.dismiss();
        }
        pdf.pdfreader.viewer.editor.free.feature.scan.dialog.f fVar2 = this.Y;
        if (fVar2 != null && fVar2.isShowing()) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (z16 && (fVar = this.Y) != null) {
            fVar.dismiss();
        }
        ObjectAnimator objectAnimator2 = this.f25725q0;
        if (objectAnimator2 != null && objectAnimator2.isRunning()) {
            z17 = true;
        } else {
            z17 = false;
        }
        if (z17 && (objectAnimator = this.f25725q0) != null) {
            objectAnimator.cancel();
        }
        AnimatorSet animatorSet2 = this.f25728t0;
        if (animatorSet2 == null || !animatorSet2.isRunning()) {
            z18 = false;
        }
        if (z18 && (animatorSet = this.f25728t0) != null) {
            animatorSet.cancel();
        }
        if (this.f25727s0 && (scaleAnimation = this.f25729u0) != null) {
            scaleAnimation.cancel();
        }
        this.H.removeCallbacks(this.C0);
        a1 a1Var = this.f25715g0;
        if (a1Var != null) {
            a1Var.b();
        }
        this.f25715g0 = null;
        super.onDestroy();
        CameraHelper r22 = r2();
        l1.a aVar = r22.f24077l;
        if (aVar != null) {
            r22.f24076k.removeCallbacks(aVar);
        }
        SensorManager sensorManager = this.N;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    @SuppressLint({"MissingSuperCall"})
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (intent != null && intent.hasExtra(ea.a.p("VXIkbSxzDXUAY2U=", "sGQI9uSb"))) {
            String stringExtra = intent.getStringExtra(ea.a.p("KXJebSZzWHUoY2U=", "ecmkUbsM"));
            if (stringExtra == null) {
                stringExtra = "";
            }
            this.f25716h0 = stringExtra;
        }
    }

    @Override // jl.a, androidx.fragment.app.u, android.app.Activity
    public final void onPause() {
        super.onPause();
        hp.a aVar = ((hp.b) this.K.getValue()).f18392b;
        if (aVar != null) {
            aVar.disable();
        }
    }

    @Override // jl.a, androidx.fragment.app.u, androidx.activity.ComponentActivity, android.app.Activity
    public final void onRequestPermissionsResult(int i10, String[] permissions, int[] grantResults) {
        boolean z10;
        kotlin.jvm.internal.g.e(permissions, "permissions");
        kotlin.jvm.internal.g.e(grantResults, "grantResults");
        super.onRequestPermissionsResult(i10, permissions, grantResults);
        this.D0 = System.currentTimeMillis();
        if (i10 == this.A0) {
            this.H.removeCallbacks(this.C0);
            if (grantResults.length == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                boolean z11 = true;
                for (int i11 : grantResults) {
                    if (i11 != 0) {
                        z11 = false;
                    }
                }
                if (z11) {
                    H2();
                    m2();
                    return;
                }
                boolean z12 = true;
                for (String str : permissions) {
                    kotlin.jvm.internal.g.b(str);
                    if (androidx.core.content.a.checkSelfPermission(this, str) != 0 && !k0.b.b(this, str)) {
                        z12 = false;
                    }
                }
                if (z12) {
                    F2();
                    return;
                }
                this.E0 = true;
                F2();
            }
        }
    }

    @Override // jl.a, androidx.fragment.app.u, android.app.Activity
    public final void onResume() {
        Context context;
        super.onResume();
        boolean z10 = false;
        if (this.G0) {
            this.G0 = false;
            this.H.postDelayed(new f(this, 0), 10L);
            return;
        }
        hp.b bVar = (hp.b) this.K.getValue();
        hp.a aVar = bVar.f18392b;
        if (aVar != null && aVar.canDetectOrientation()) {
            bVar.f18392b.enable();
        } else {
            WeakReference<Context> weakReference = bVar.f18391a;
            if (weakReference != null && weakReference.get() != null) {
                context = weakReference.get();
            } else {
                context = null;
            }
            if (context != null) {
                hp.a aVar2 = new hp.a(bVar, context);
                bVar.f18392b = aVar2;
                if (aVar2.canDetectOrientation()) {
                    bVar.f18392b.enable();
                }
            }
        }
        if (AppOpenManager.c().f23910j) {
            return;
        }
        if (System.currentTimeMillis() - this.D0 > 600) {
            if (pdf.pdfreader.viewer.editor.free.utils.extension.c.a(this) && this.F0 == 2) {
                H2();
            }
            pdf.pdfreader.viewer.editor.free.feature.scan.dialog.f fVar = this.Y;
            if (fVar != null && fVar.isShowing()) {
                z10 = true;
            }
            if (!z10) {
                m2();
            }
        }
        a1 a1Var = this.f25715g0;
        if (a1Var != null) {
            a1Var.b();
        }
        this.f25715g0 = null;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        boolean z10;
        boolean z11;
        float[] fArr;
        Sensor sensor;
        float f10;
        float f11;
        boolean z12;
        boolean z13;
        float[] fArr2;
        Sensor sensor2;
        if (sensorEvent != null && (sensor2 = sensorEvent.sensor) != null && sensor2.getType() == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        float[] fArr3 = this.T;
        float[] fArr4 = this.S;
        if (z10) {
            if (sensorEvent != null) {
                fArr2 = sensorEvent.values;
            } else {
                fArr2 = null;
            }
            System.arraycopy(fArr2, 0, fArr4, 0, fArr4.length);
        } else {
            if (sensorEvent != null && (sensor = sensorEvent.sensor) != null && sensor.getType() == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (sensorEvent != null) {
                    fArr = sensorEvent.values;
                } else {
                    fArr = null;
                }
                System.arraycopy(fArr, 0, fArr3, 0, fArr3.length);
            }
        }
        float[] fArr5 = this.U;
        SensorManager.getRotationMatrix(fArr5, null, fArr4, fArr3);
        float[] fArr6 = this.V;
        SensorManager.getOrientation(fArr5, fArr6);
        if (((mn.a) s2().f23510e.b()).f22148e && this.O) {
            R2LevelView r2LevelView = q2().f907e;
            double d10 = -fArr6[this.X];
            double d11 = fArr6[this.W];
            if (r2LevelView.getVisibility() != 0) {
                r2LevelView.setVisibility(0);
            }
            float f12 = r2LevelView.f25865a;
            float f13 = f12 - r2LevelView.f25866b;
            double radians = f12 / Math.toRadians(90.0d);
            PointF pointF = r2LevelView.f25871h;
            PointF pointF2 = new PointF((float) (pointF.x - (-(d10 * radians))), (float) (pointF.y - (-(d11 * radians))));
            r2LevelView.f25872i = pointF2;
            float f14 = pointF2.x - pointF.x;
            float f15 = pointF.y - pointF2.y;
            if (((f15 * f15) + (f14 * f14)) - (f13 * f13) > 0.0f) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                double d12 = f13;
                double atan2 = Math.atan2(f11 - f10, f14);
                if (atan2 < 0.0d) {
                    atan2 += 6.283185307179586d;
                }
                double d13 = atan2;
                pointF2.set((float) ((Math.cos(d13) * d12) + pointF.x), (float) android.support.v4.media.session.h.a(d13, d12, pointF.y));
            }
            PointF pointF3 = r2LevelView.f25872i;
            if (pointF3 != null && Math.abs(pointF3.x - pointF.x) < 3.0f && Math.abs(pointF3.y - pointF.y) < 3.0f) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z13) {
                r2LevelView.f25869f = true;
            } else {
                r2LevelView.f25869f = false;
            }
            r2LevelView.invalidate();
            return;
        }
        q2().f907e.setVisibility(8);
    }

    @Override // jl.a, androidx.appcompat.app.c, androidx.fragment.app.u, android.app.Activity
    public final void onStart() {
        super.onStart();
        r2().i();
    }

    @Override // jl.a, androidx.appcompat.app.c, androidx.fragment.app.u, android.app.Activity
    public final void onStop() {
        super.onStop();
        r2().j();
    }

    public final void p2() {
        int i10;
        if (this.f25709a0 == 0) {
            finish();
            return;
        }
        ImageConvertDataRepository.f26536a.getClass();
        ArrayList arrayList = (ArrayList) ImageConvertDataRepository.f26546l.d();
        if (arrayList != null) {
            i10 = arrayList.size();
        } else {
            i10 = 0;
        }
        if (i10 > 0) {
            final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
            pdf.pdfreader.viewer.editor.free.feature.scan.dialog.q qVar = new pdf.pdfreader.viewer.editor.free.feature.scan.dialog.q(this);
            this.f25713e0 = qVar;
            qVar.f23542t = new c(ref$BooleanRef, this);
            qVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: pdf.pdfreader.viewer.editor.free.feature.scan.ui.h
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    int i11 = CameraActivity.H0;
                    String p10 = ea.a.p("F2k4Qx9pAWs9aw==", "OVSDMe0R");
                    Ref$BooleanRef ref$BooleanRef2 = Ref$BooleanRef.this;
                    kotlin.jvm.internal.g.e(ref$BooleanRef2, p10);
                    String p11 = ea.a.p("R2gic1cw", "SNaKMv1p");
                    CameraActivity cameraActivity = this;
                    kotlin.jvm.internal.g.e(cameraActivity, p11);
                    if (!ref$BooleanRef2.element) {
                        tn.a.d(cameraActivity, ea.a.p("QGMqbhBhbQ==", "SWzQlKcL"), ea.a.p("LGFcchx0QnI0XylhG2MNbGpjAmkmaw==", "bFwnbIJB"), cameraActivity.c2().concat("_total"), false);
                        tn.a.d(cameraActivity, ea.a.p("QGMqbhBhbQ==", "AjbkTC40"), ea.a.p("UGEmchZ0F3IcX1dhB2MzbBtjXmklaw==", "9SGzrjlU"), androidx.activity.f.m(cameraActivity.c2(), "_", cameraActivity.v2()), false);
                    }
                }
            });
            tn.a.d(this, ea.a.p("QGMqbhBhbQ==", "QySFuNDx"), ea.a.p("O2E9chN0PXImXxVoW3c=", "8ZXPvHhp"), c2().concat("_total"), false);
            tn.a.d(this, ea.a.p("QGMqbhBhbQ==", "HpE7hY52"), ea.a.p("UGEmchZ0F3IcX0doBnc=", "iSYf48SB"), androidx.activity.f.m(c2(), "_", v2()), false);
            pdf.pdfreader.viewer.editor.free.feature.scan.dialog.q qVar2 = this.f25713e0;
            if (qVar2 != null) {
                qVar2.show();
            }
        } else if (kotlin.jvm.internal.g.a(this.f25716h0, ea.a.p("R28kbHM=", "qwkUrEx5"))) {
            o2();
        } else {
            finish();
        }
    }

    public final am.g q2() {
        return (am.g) this.I.getValue();
    }

    public final CameraHelper r2() {
        return (CameraHelper) this.M.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x00f3, code lost:
        if (jn.a.i() == 1) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0142  */
    @Override // rl.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void s0() {
        /*
            Method dump skipped, instructions count: 781
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.feature.scan.ui.CameraActivity.s0():void");
    }

    public final on.a s2() {
        return (on.a) this.J.getValue();
    }

    public Class<?> t2() {
        return CameraActivity.class;
    }

    public final String u2() {
        String str = this.f25716h0;
        switch (str.hashCode()) {
            case -1354797089:
                if (str.equals(ea.a.p("VG8FYTRk", "A77kPcMv"))) {
                    return ea.a.p("AmRk", "sgcUOq3K");
                }
                break;
            case -934416070:
                if (str.equals(ea.a.p("PWVFYRJl", "wjlTVIKb"))) {
                    return ea.a.p("PWVFYRJl", "jfLXzg2L");
                }
                break;
            case 104387:
                if (str.equals(ea.a.p("Jm1n", "YBfG1R4i"))) {
                    return ea.a.p("UGEmZQFh", "jj7YSfnu");
                }
                break;
            case 110545371:
                if (str.equals(ea.a.p("O29ebHM=", "6243w3IL"))) {
                    return ea.a.p("PGNQbhdlcg==", "TzcpTJZm");
                }
                break;
        }
        return ea.a.p("QGMqbh1lcg==", "TVqVTFaE");
    }

    public final String v2() {
        if (kotlin.jvm.internal.g.a(this.f25716h0, ea.a.p("IGNy", "214VxPpQ"))) {
            return ea.a.p("O29ebHM=", "uuT8gGNK");
        }
        return this.f25716h0;
    }

    public final float w2() {
        if (pdf.pdfreader.viewer.editor.free.utils.extension.c.j(this)) {
            return (q2().f908f.getWidth() / 2) - (q2().O.getWidth() / 2);
        }
        return ((q2().f908f.getWidth() / 2) - (q2().O.getWidth() / 2)) - q2().P.getWidth();
    }

    public final float x2() {
        if (pdf.pdfreader.viewer.editor.free.utils.extension.c.j(this)) {
            return ((q2().f908f.getWidth() / 2) - (q2().P.getWidth() / 2)) - q2().O.getWidth();
        }
        return (q2().f908f.getWidth() / 2) - (q2().P.getWidth() / 2);
    }

    public final boolean y2() {
        boolean z10;
        if (!this.f25710b0) {
            return false;
        }
        if (TextUtils.isEmpty(this.f27001t)) {
            Intent intent = getIntent();
            String str = OperatePDFWatcherActivity.E;
            if (intent.hasExtra(str)) {
                String stringExtra = getIntent().getStringExtra(str);
                if (stringExtra == null) {
                    stringExtra = "";
                }
                this.f27001t = stringExtra;
            }
        }
        if (!TextUtils.equals(ea.a.p("IWNy", "9eNxjQLp"), this.f27001t) && !TextUtils.equals(ea.a.p("F2MIbiFlMzI4ZGY=", "87diOABm"), this.f27001t)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            return false;
        }
        BillingConfigImpl.c.getClass();
        if (!BillingConfigImpl.r()) {
            return false;
        }
        return true;
    }

    public final void z2() {
        try {
            q2().M.post(new k(this, 0));
        } catch (Exception e10) {
            e10.printStackTrace();
            ea.a.p("DENU", "oFUic71U");
            e10.getMessage();
            String str = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
        }
    }

    /* compiled from: CameraActivity.kt */
    /* loaded from: classes3.dex */
    public static final class c implements oo.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Ref$BooleanRef f25736a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ CameraActivity f25737b;

        public c(Ref$BooleanRef ref$BooleanRef, CameraActivity cameraActivity) {
            this.f25736a = ref$BooleanRef;
            this.f25737b = cameraActivity;
        }

        @Override // oo.a
        public final void a() {
            this.f25736a.element = true;
            CameraActivity cameraActivity = this.f25737b;
            cameraActivity.getClass();
            tn.a.d(cameraActivity, ea.a.p("QGMqbhBhbQ==", "bgwpo2SZ"), ea.a.p("LGFcchx0QnI0Xzt1HHQ3Y1lpDWs=", "iCXjy8Xi"), cameraActivity.c2().concat("_total"), false);
            tn.a.d(cameraActivity, ea.a.p("QGMqbhBhbQ==", "6e8wxgP0"), ea.a.p("LGFcchx0QnI0Xzt1HHQ3Y1lpDWs=", "ZMRZkdvE"), androidx.activity.f.m(cameraActivity.c2(), "_", cameraActivity.v2()), false);
            w0.a().f28790a.execute(new c6.b(5));
            if (kotlin.jvm.internal.g.a(cameraActivity.f25716h0, ea.a.p("PG8bbHM=", "23HtcrrZ"))) {
                cameraActivity.o2();
            } else {
                cameraActivity.finish();
            }
        }

        @Override // oo.a
        public final void cancel() {
        }
    }

    @Override // jl.a
    public final void C1() {
    }

    @Override // pdf.pdfreader.viewer.editor.free.camera.camera.CameraHelper.a
    public final void K0() {
    }

    @Override // pdf.pdfreader.viewer.editor.free.camera.camera.CameraHelper.a
    public final void T0() {
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}

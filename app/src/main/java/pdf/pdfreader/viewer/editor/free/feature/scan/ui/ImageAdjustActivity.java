package pdf.pdfreader.viewer.editor.free.feature.scan.ui;

import am.o2;
import am.p2;
import am.q2;
import am.t1;
import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.m0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.e;
import androidx.viewpager2.widget.ViewPager2;
import com.airbnb.lottie.LottieAnimationView;
import com.inmobi.commons.core.configs.TelemetryConfig;
import com.lib.flutter.encrypt.EngineHelper;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$LongRef;
import kotlinx.coroutines.y0;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.ReaderSplashActivity;
import pdf.pdfreader.viewer.editor.free.ads.anim.BannerLoadingAnimation;
import pdf.pdfreader.viewer.editor.free.convert.opt.OptTaskWrapper;
import pdf.pdfreader.viewer.editor.free.feature.billing.BillingConfigImpl;
import pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity;
import pdf.pdfreader.viewer.editor.free.feature.billing.ui.SubscriptionDarkTestFActivity;
import pdf.pdfreader.viewer.editor.free.feature.billing.ui.i;
import pdf.pdfreader.viewer.editor.free.feature.ocr.data.OcrUploadResult;
import pdf.pdfreader.viewer.editor.free.feature.ocr.dialog.OCRLoadingDialog;
import pdf.pdfreader.viewer.editor.free.feature.ocr.helper.OCRStateManager;
import pdf.pdfreader.viewer.editor.free.feature.ocr.helper.OCRTransportImageExecutor;
import pdf.pdfreader.viewer.editor.free.feature.ocr.vm.OCRResultViewModel;
import pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.dialog.PageManagerQuitDialog;
import pdf.pdfreader.viewer.editor.free.feature.scan.adapter.ThumbAdapter;
import pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.ImageAdjustFiltersAdapter;
import pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.ImageAdjustPayload;
import pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.ImageAdjustType;
import pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.vh.ImageAdjustFilterViewHolder;
import pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.vh.ImageAdjustPreviewViewHolder;
import pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.vh.ImageAdjustToolsViewHolder;
import pdf.pdfreader.viewer.editor.free.feature.scan.dialog.ImageAdjustDeleteConfirmDialog;
import pdf.pdfreader.viewer.editor.free.feature.scan.dialog.ImageAdjustLeaveDialog;
import pdf.pdfreader.viewer.editor.free.feature.scan.ui.CameraActivity;
import pdf.pdfreader.viewer.editor.free.feature.scan.ui.ImageAdjustActivity;
import pdf.pdfreader.viewer.editor.free.feature.scan.ui.ImageAdjustActivity$initViewModel$3;
import pdf.pdfreader.viewer.editor.free.feature.scan.ui.state.ImageAdjustPageMode;
import pdf.pdfreader.viewer.editor.free.feature.scan.ui.state.TurnPageMode;
import pdf.pdfreader.viewer.editor.free.pic.widget.CropImageView;
import pdf.pdfreader.viewer.editor.free.repo.convert.ImageConvertDataRepository;
import pdf.pdfreader.viewer.editor.free.scan.group.enumerate.GroupAiFilterType;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderHomeActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.tools.OperatePDFWatcherActivity;
import pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImg2PDFChooseActivity;
import pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImg2PDFConvertActivity;
import pdf.pdfreader.viewer.editor.free.ui.dialog.i3;
import pdf.pdfreader.viewer.editor.free.ui.feature.debug.ReaderDebugActivity;
import pdf.pdfreader.viewer.editor.free.ui.widget.guide.OCRTrialGuideView;
import pdf.pdfreader.viewer.editor.free.utils.event.AppCoreFilterEvent;
import pdf.pdfreader.viewer.editor.free.utils.event.AppOpenSource;
import pdf.pdfreader.viewer.editor.free.utils.event.OCREventCenter;
import pdf.pdfreader.viewer.editor.free.utils.event.ScanEventCenter;
import pdf.pdfreader.viewer.editor.free.utils.j1;
import pdf.pdfreader.viewer.editor.free.utils.t0;
import pdf.pdfreader.viewer.editor.free.utils.w0;

/* compiled from: ImageAdjustActivity.kt */
/* loaded from: classes3.dex */
public class ImageAdjustActivity extends OperatePDFWatcherActivity {

    /* renamed from: u0  reason: collision with root package name */
    public static final a f25741u0;
    public o2 J;
    public p2 K;
    public q2 L;
    public t1 M;
    public boolean O;
    public boolean P;
    public OCRLoadingDialog U;
    public i3 V;
    public i3 W;
    public y0 X;

    /* renamed from: b0  reason: collision with root package name */
    public ImageAdjustFiltersAdapter f25743b0;

    /* renamed from: c0  reason: collision with root package name */
    public OptTaskWrapper f25744c0;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f25745d0;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f25746e0;

    /* renamed from: f0  reason: collision with root package name */
    public List<? extends ul.b> f25747f0;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f25748g0;

    /* renamed from: h0  reason: collision with root package name */
    public int f25749h0;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f25750i0;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f25751j0;

    /* renamed from: m0  reason: collision with root package name */
    public int f25754m0;

    /* renamed from: n0  reason: collision with root package name */
    public boolean f25755n0;

    /* renamed from: o0  reason: collision with root package name */
    public PopupWindow f25756o0;

    /* renamed from: p0  reason: collision with root package name */
    public ObjectAnimator f25757p0;

    /* renamed from: r0  reason: collision with root package name */
    public long f25759r0;

    /* renamed from: s0  reason: collision with root package name */
    public boolean f25760s0;

    /* renamed from: t0  reason: collision with root package name */
    public boolean f25761t0;
    public final Handler H = new Handler(Looper.getMainLooper());
    public final tf.c I = kotlin.a.a(new cg.a<am.a>() { // from class: pdf.pdfreader.viewer.editor.free.feature.scan.ui.ImageAdjustActivity$binding$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final am.a invoke() {
            View inflate = ImageAdjustActivity.this.getLayoutInflater().inflate(R.layout.activity_adjust_image, (ViewGroup) null, false);
            int i10 = R.id.back_iv;
            AppCompatImageView appCompatImageView = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.back_iv);
            if (appCompatImageView != null) {
                i10 = R.id.bottomBannerLayout;
                LinearLayout linearLayout = (LinearLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.bottomBannerLayout);
                if (linearLayout != null) {
                    i10 = R.id.crop_guide_vs;
                    ViewStub viewStub = (ViewStub) com.google.android.play.core.assetpacks.c.u(inflate, R.id.crop_guide_vs);
                    if (viewStub != null) {
                        i10 = R.id.crop_iv;
                        if (((AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.crop_iv)) != null) {
                            i10 = R.id.crop_layout;
                            LinearLayout linearLayout2 = (LinearLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.crop_layout);
                            if (linearLayout2 != null) {
                                i10 = R.id.crop_tools_vs;
                                ViewStub viewStub2 = (ViewStub) com.google.android.play.core.assetpacks.c.u(inflate, R.id.crop_tools_vs);
                                if (viewStub2 != null) {
                                    i10 = R.id.crop_tv;
                                    if (((TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.crop_tv)) != null) {
                                        i10 = R.id.current_index_tv;
                                        TextView textView = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.current_index_tv);
                                        if (textView != null) {
                                            i10 = R.id.current_slash_tv;
                                            if (((TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.current_slash_tv)) != null) {
                                                i10 = R.id.extract_iv;
                                                if (((AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.extract_iv)) != null) {
                                                    i10 = R.id.extract_iv_pro;
                                                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.extract_iv_pro);
                                                    if (appCompatImageView2 != null) {
                                                        i10 = R.id.extract_layout;
                                                        ConstraintLayout constraintLayout = (ConstraintLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.extract_layout);
                                                        if (constraintLayout != null) {
                                                            i10 = R.id.extract_tv;
                                                            if (((TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.extract_tv)) != null) {
                                                                i10 = R.id.extract_tv_free_count;
                                                                TextView textView2 = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.extract_tv_free_count);
                                                                if (textView2 != null) {
                                                                    i10 = R.id.filters_iv;
                                                                    if (((AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.filters_iv)) != null) {
                                                                        i10 = R.id.filters_layout;
                                                                        LinearLayout linearLayout3 = (LinearLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.filters_layout);
                                                                        if (linearLayout3 != null) {
                                                                            i10 = R.id.filters_tools_vs;
                                                                            ViewStub viewStub3 = (ViewStub) com.google.android.play.core.assetpacks.c.u(inflate, R.id.filters_tools_vs);
                                                                            if (viewStub3 != null) {
                                                                                i10 = R.id.filters_tv;
                                                                                if (((TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.filters_tv)) != null) {
                                                                                    i10 = R.id.index_layout;
                                                                                    LinearLayout linearLayout4 = (LinearLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.index_layout);
                                                                                    if (linearLayout4 != null) {
                                                                                        i10 = R.id.left_iv;
                                                                                        if (((AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.left_iv)) != null) {
                                                                                            i10 = R.id.left_layout;
                                                                                            LinearLayout linearLayout5 = (LinearLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.left_layout);
                                                                                            if (linearLayout5 != null) {
                                                                                                i10 = R.id.left_tv;
                                                                                                if (((TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.left_tv)) != null) {
                                                                                                    i10 = R.id.next_iv;
                                                                                                    AppCompatImageView appCompatImageView3 = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.next_iv);
                                                                                                    if (appCompatImageView3 != null) {
                                                                                                        i10 = R.id.ocrTrialGuideView;
                                                                                                        OCRTrialGuideView oCRTrialGuideView = (OCRTrialGuideView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.ocrTrialGuideView);
                                                                                                        if (oCRTrialGuideView != null) {
                                                                                                            i10 = R.id.preview_tools;
                                                                                                            if (((ConstraintLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.preview_tools)) != null) {
                                                                                                                i10 = R.id.previous_iv;
                                                                                                                AppCompatImageView appCompatImageView4 = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.previous_iv);
                                                                                                                if (appCompatImageView4 != null) {
                                                                                                                    i10 = R.id.retake_iv;
                                                                                                                    if (((AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.retake_iv)) != null) {
                                                                                                                        i10 = R.id.retake_layout;
                                                                                                                        LinearLayout linearLayout6 = (LinearLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.retake_layout);
                                                                                                                        if (linearLayout6 != null) {
                                                                                                                            i10 = R.id.retake_tv;
                                                                                                                            if (((TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.retake_tv)) != null) {
                                                                                                                                i10 = R.id.rv_thumb;
                                                                                                                                RecyclerView recyclerView = (RecyclerView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.rv_thumb);
                                                                                                                                if (recyclerView != null) {
                                                                                                                                    i10 = R.id.save_iv;
                                                                                                                                    AppCompatImageView appCompatImageView5 = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.save_iv);
                                                                                                                                    if (appCompatImageView5 != null) {
                                                                                                                                        i10 = R.id.swipe_guide_vs;
                                                                                                                                        ViewStub viewStub4 = (ViewStub) com.google.android.play.core.assetpacks.c.u(inflate, R.id.swipe_guide_vs);
                                                                                                                                        if (viewStub4 != null) {
                                                                                                                                            i10 = R.id.tools_layout;
                                                                                                                                            FrameLayout frameLayout = (FrameLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tools_layout);
                                                                                                                                            if (frameLayout != null) {
                                                                                                                                                i10 = R.id.tools_line;
                                                                                                                                                View u7 = com.google.android.play.core.assetpacks.c.u(inflate, R.id.tools_line);
                                                                                                                                                if (u7 != null) {
                                                                                                                                                    i10 = R.id.top_tools;
                                                                                                                                                    FrameLayout frameLayout2 = (FrameLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.top_tools);
                                                                                                                                                    if (frameLayout2 != null) {
                                                                                                                                                        i10 = R.id.total_index_tv;
                                                                                                                                                        TextView textView3 = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.total_index_tv);
                                                                                                                                                        if (textView3 != null) {
                                                                                                                                                            i10 = R.id.view_pager;
                                                                                                                                                            ViewPager2 viewPager2 = (ViewPager2) com.google.android.play.core.assetpacks.c.u(inflate, R.id.view_pager);
                                                                                                                                                            if (viewPager2 != null) {
                                                                                                                                                                return new am.a((ConstraintLayout) inflate, appCompatImageView, linearLayout, viewStub, linearLayout2, viewStub2, textView, appCompatImageView2, constraintLayout, textView2, linearLayout3, viewStub3, linearLayout4, linearLayout5, appCompatImageView3, oCRTrialGuideView, appCompatImageView4, linearLayout6, recyclerView, appCompatImageView5, viewStub4, frameLayout, u7, frameLayout2, textView3, viewPager2);
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
            throw new NullPointerException(ea.a.p("OGkmcwVuUCA6ZRd1XXIyZBh2O2U-IEFpAGhRSRU6IA==", "mluUl7pB").concat(inflate.getResources().getResourceName(i10)));
        }
    });
    public final tf.c N = kotlin.a.a(new cg.a<ArrayList<String>>() { // from class: pdf.pdfreader.viewer.editor.free.feature.scan.ui.ImageAdjustActivity$payloads$2
        @Override // cg.a
        public final ArrayList<String> invoke() {
            return ge.a.j("");
        }
    });
    public int Q = -1;
    public int R = -1;
    public final androidx.lifecycle.k0 S = new androidx.lifecycle.k0(kotlin.jvm.internal.i.a(on.b.class), new cg.a<androidx.lifecycle.o0>() { // from class: pdf.pdfreader.viewer.editor.free.feature.scan.ui.ImageAdjustActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final androidx.lifecycle.o0 invoke() {
            androidx.lifecycle.o0 viewModelStore = ComponentActivity.this.getViewModelStore();
            kotlin.jvm.internal.g.d(viewModelStore, ea.a.p("RWkudz5vBmUeU0BvG2U=", "leuSR3q9"));
            return viewModelStore;
        }
    }, new cg.a<m0.b>() { // from class: pdf.pdfreader.viewer.editor.free.feature.scan.ui.ImageAdjustActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final m0.b invoke() {
            m0.b defaultViewModelProviderFactory = ComponentActivity.this.getDefaultViewModelProviderFactory();
            kotlin.jvm.internal.g.d(defaultViewModelProviderFactory, ea.a.p("K2VXYQxsQ1YzZT1NGmQNbGVyAXYsZAByPGE5dAJyeQ==", "NWQOzZmI"));
            return defaultViewModelProviderFactory;
        }
    }, new cg.a<n1.a>() { // from class: pdf.pdfreader.viewer.editor.free.feature.scan.ui.ImageAdjustActivity$special$$inlined$viewModels$default$3
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
                kotlin.jvm.internal.g.d(defaultViewModelCreationExtras, ea.a.p("EGg_c3RkIGYpdQp0Ymkyd3VvNmUlQ0RlFXQYbz9FOnQWYXM=", "YrdVZEZ7"));
                return defaultViewModelCreationExtras;
            }
            return aVar;
        }
    });
    public final androidx.lifecycle.k0 T = new androidx.lifecycle.k0(kotlin.jvm.internal.i.a(OCRResultViewModel.class), new cg.a<androidx.lifecycle.o0>() { // from class: pdf.pdfreader.viewer.editor.free.feature.scan.ui.ImageAdjustActivity$special$$inlined$viewModels$default$5
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final androidx.lifecycle.o0 invoke() {
            androidx.lifecycle.o0 viewModelStore = ComponentActivity.this.getViewModelStore();
            kotlin.jvm.internal.g.d(viewModelStore, ea.a.p("RWkudz5vBmUeU0BvG2U=", "a8e0w4km"));
            return viewModelStore;
        }
    }, new cg.a<m0.b>() { // from class: pdf.pdfreader.viewer.editor.free.feature.scan.ui.ImageAdjustActivity$special$$inlined$viewModels$default$4
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final m0.b invoke() {
            m0.b defaultViewModelProviderFactory = ComponentActivity.this.getDefaultViewModelProviderFactory();
            kotlin.jvm.internal.g.d(defaultViewModelProviderFactory, ea.a.p("V2UtYQZsFlYbZUNNBmQzbBRyXXYvZCZycGEvdF9yeQ==", "6L0B53ba"));
            return defaultViewModelProviderFactory;
        }
    }, new cg.a<n1.a>() { // from class: pdf.pdfreader.viewer.editor.free.feature.scan.ui.ImageAdjustActivity$special$$inlined$viewModels$default$6
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
                kotlin.jvm.internal.g.d(defaultViewModelCreationExtras, ea.a.p("HGgGc1hkKGYpdQp0Ymkyd3VvNmUlQ0RlFXQYbz9FOnQaYXM=", "eVhovMr7"));
                return defaultViewModelCreationExtras;
            }
            return aVar;
        }
    });
    public final ThumbAdapter Y = new ThumbAdapter(b.b.x(this));
    public final tf.c Z = kotlin.a.a(new cg.a<pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.b>() { // from class: pdf.pdfreader.viewer.editor.free.feature.scan.ui.ImageAdjustActivity$pageAdapter$2

        /* compiled from: ImageAdjustActivity.kt */
        /* loaded from: classes3.dex */
        public static final class a implements ImageAdjustPreviewViewHolder.b {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ ImageAdjustActivity f25779a;

            public a(ImageAdjustActivity imageAdjustActivity) {
                this.f25779a = imageAdjustActivity;
            }

            @Override // pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.vh.ImageAdjustPreviewViewHolder.b
            public final void a(ul.b bVar) {
                tf.c cVar = ScanEventCenter.f28674a;
                ImageAdjustActivity imageAdjustActivity = this.f25779a;
                String d22 = imageAdjustActivity.d2();
                HashSet<String> hashSet = ScanEventCenter.f28675b;
                if (!hashSet.contains(ea.a.p("HmEhZSVkHHU7dDlkUWwydF1fMWwgY2s=", "W7nFDvcO"))) {
                    hashSet.add(ea.a.p("Q2EsZRJkCHUBdGtkDGwzdCFfUWwvY2s=", "aFwr0tuA"));
                    tn.a.d(ScanEventCenter.a(), ea.a.p("Q2EsZSxhBmoHc3Q=", "OGUA0knL"), ea.a.p("Q2EsZRJkCHUBdGtkDGwzdCFfUWwvY2s=", "W9HD7SjC"), d22, false);
                }
                ImageAdjustActivity.p2(imageAdjustActivity, bVar);
            }

            @Override // pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.vh.ImageAdjustPreviewViewHolder.b
            public final void b() {
                Object m13constructorimpl;
                ImageAdjustActivity imageAdjustActivity = this.f25779a;
                if (imageAdjustActivity.O && !imageAdjustActivity.P) {
                    imageAdjustActivity.P = true;
                    imageAdjustActivity.E2();
                    if (imageAdjustActivity.J != null) {
                        imageAdjustActivity.C2().f();
                        return;
                    }
                    try {
                        m13constructorimpl = Result.m13constructorimpl(imageAdjustActivity.y2().f675f.inflate());
                    } catch (Throwable th2) {
                        m13constructorimpl = Result.m13constructorimpl(androidx.activity.s.v(th2));
                    }
                    Result.m12boximpl(m13constructorimpl);
                }
            }
        }

        /* compiled from: ImageAdjustActivity.kt */
        /* loaded from: classes3.dex */
        public static final class b implements ImageAdjustToolsViewHolder.a {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ ImageAdjustActivity f25780a;

            public b(ImageAdjustActivity imageAdjustActivity) {
                this.f25780a = imageAdjustActivity;
            }

            @Override // pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.vh.ImageAdjustToolsViewHolder.a
            public final void a() {
                ImageAdjustActivity imageAdjustActivity = this.f25780a;
                if (imageAdjustActivity.h2()) {
                    ImageConvertDataRepository.f26536a.getClass();
                    if (ImageConvertDataRepository.d()) {
                        String string = imageAdjustActivity.getString(R.string.arg_res_0x7f130257);
                        kotlin.jvm.internal.g.d(string, ea.a.p("KGVFUw1yXm49KBguBnQaaVtnQG0keDpsKm0AdDRyDmEsaFRkJmdHdCk=", "EZr8Cikk"));
                        ImageAdjustActivity.q2(imageAdjustActivity, string);
                        return;
                    }
                }
                tn.a.b(ScanEventCenter.a(), ea.a.p("P2FWZSZhU2ovc3Q=", "MPkJvxBv"), ea.a.p("LmRVcBhnUl8zbTpvB3Q3Y1lpDWs=", "zYMNNFms"));
                ReaderImg2PDFChooseActivity.a aVar = ReaderImg2PDFChooseActivity.M0;
                boolean z10 = imageAdjustActivity.O;
                String p10 = ea.a.p("LG9fYR1k", "sJA6vJI2");
                String str = imageAdjustActivity.f27001t;
                String p11 = ea.a.p("LmRbdQp0", "git4uAuy");
                aVar.getClass();
                ReaderImg2PDFChooseActivity.a.a(imageAdjustActivity, z10, p10, str, true, p11, null, null);
            }

            @Override // pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.vh.ImageAdjustToolsViewHolder.a
            public final void b() {
                ImageAdjustActivity imageAdjustActivity = this.f25780a;
                if (imageAdjustActivity.h2()) {
                    ImageConvertDataRepository.f26536a.getClass();
                    if (ImageConvertDataRepository.d()) {
                        String string = imageAdjustActivity.getString(R.string.arg_res_0x7f130257);
                        kotlin.jvm.internal.g.d(string, ea.a.p("L2U6Uz1yEW4vKDQuR3QlaVZnfG0oeGlsHW0YdA5yJ2EraCtkFmcIdCk=", "6mHNIxX2"));
                        ImageAdjustActivity.q2(imageAdjustActivity, string);
                        return;
                    }
                }
                tn.a.b(ScanEventCenter.a(), ea.a.p("CmESZThhXWo9c3Q=", "cXzug9T6"), ea.a.p("UmQmcCVnEV84aAl0W180bFFjaw==", "g73BDtDf"));
                int i10 = CameraActivity.H0;
                CameraActivity.a.a(imageAdjustActivity, ea.a.p("UG8lYRdk", "mckL2j50"), imageAdjustActivity.f27001t, imageAdjustActivity.O, false);
            }
        }

        /* compiled from: ImageAdjustActivity.kt */
        /* loaded from: classes3.dex */
        public static final class c implements ImageAdjustFilterViewHolder.a {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ ImageAdjustActivity f25781a;

            public c(ImageAdjustActivity imageAdjustActivity) {
                this.f25781a = imageAdjustActivity;
            }

            @Override // pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.vh.ImageAdjustFilterViewHolder.a
            public final void a(ul.b bVar) {
                ImageAdjustActivity.p2(this.f25781a, bVar);
            }
        }

        {
            super(0);
        }

        @Override // cg.a
        public final pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.b invoke() {
            LifecycleCoroutineScopeImpl x4 = b.b.x(ImageAdjustActivity.this);
            ImageAdjustActivity imageAdjustActivity = ImageAdjustActivity.this;
            ImageAdjustActivity.a aVar = ImageAdjustActivity.f25741u0;
            boolean z10 = imageAdjustActivity.f27005x == TurnPageMode.ConvertItemClick.ordinal();
            ImageAdjustActivity imageAdjustActivity2 = ImageAdjustActivity.this;
            return new pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.b(x4, z10, new a(imageAdjustActivity2), new b(imageAdjustActivity2), new c(imageAdjustActivity2));
        }
    });

    /* renamed from: a0  reason: collision with root package name */
    public final c f25742a0 = new c();

    /* renamed from: k0  reason: collision with root package name */
    public final g f25752k0 = new g();

    /* renamed from: l0  reason: collision with root package name */
    public boolean f25753l0 = true;

    /* renamed from: q0  reason: collision with root package name */
    public final b7.g f25758q0 = new b7.g(this, 27);

    /* compiled from: ImageAdjustActivity.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        public static void a(Context context, String workflow) {
            kotlin.jvm.internal.g.e(context, "context");
            kotlin.jvm.internal.g.e(workflow, "workflow");
            Intent intent = new Intent(context, ImageAdjustActivity.class);
            intent.putExtra(ea.a.p("KnNrZTxhGGU=", "UcC9Hsg4"), true);
            intent.putExtra(ea.a.p("VXIkbSx3DXIZZlhvdw==", "DJqhB60K"), workflow);
            context.startActivity(intent);
        }

        public static void b(ReaderSplashActivity context, String str, String str2) {
            kotlin.jvm.internal.g.e(context, "context");
            tn.a.a(ReaderPdfApplication.m(), ea.a.p("UG85ZSxpD2c=", "bo7S5xxi"));
            Intent intent = new Intent(context, ImageAdjustActivity.class);
            intent.putExtra(ea.a.p("P2FWZSZmRW83Mg==", "DeGfzWBG"), ea.a.p("Q2EsZSxzCmEAZWtpBGExZQ==", "buLAV5IT"));
            intent.putExtra(ea.a.p("PG9Echpl", "vXozc8Dk"), str);
            intent.putExtra(ea.a.p("MXMOciJtPGghcmQ=", "vJXHMhb7"), true);
            intent.putExtra(ea.a.p("KXJebSZ3WHIxZiZvdw==", "PwUg1dbB"), str2);
            i.a aVar = pdf.pdfreader.viewer.editor.free.feature.billing.ui.i.f24934a;
            String p10 = ea.a.p("R2gicmQ=", "GB01YAGp");
            aVar.getClass();
            i.a.b(context, intent, p10, SubscriptionDarkTestFActivity.class);
            context.startActivity(intent);
        }
    }

    /* compiled from: ImageAdjustActivity.kt */
    /* loaded from: classes3.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f25762a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f25763b;

        static {
            int[] iArr = new int[OCRStateManager.OCRState.values().length];
            try {
                iArr[OCRStateManager.OCRState.vip.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OCRStateManager.OCRState.free.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OCRStateManager.OCRState.billing.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f25762a = iArr;
            int[] iArr2 = new int[OcrUploadResult.values().length];
            try {
                iArr2[OcrUploadResult.IMAGE_UPLOAD_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[OcrUploadResult.NETWORK_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            f25763b = iArr2;
        }
    }

    /* compiled from: ImageAdjustActivity.kt */
    /* loaded from: classes3.dex */
    public static final class c implements com.lib.flutter.encrypt.e {
        public c() {
        }

        @Override // com.lib.flutter.encrypt.e
        public final void a(String str) {
            ImageAdjustActivity imageAdjustActivity = ImageAdjustActivity.this;
            if (pdf.pdfreader.viewer.editor.free.utils.extension.a.b(imageAdjustActivity)) {
                return;
            }
            if (BillingConfigImpl.c.w()) {
                String p10 = ea.a.p("N3ItbQJ1KSA9cwNyGCAka1FwcmkkYVFlRlA1RhJvLHYicjxCCm4qZTogFWhbdw==", "GxGHkDyZ");
                int i10 = zk.a.f32399a;
                pdf.pdfreader.viewer.editor.free.utils.t1.b(p10);
                return;
            }
            gl.k kVar = gl.k.f17927a;
            ea.a.p("Bm1QZxxBU2ovcz5BFnQBdlx0FyA2aAp3", "zOposjUx");
            kVar.getClass();
            ea.a.p("em0qZxYyMkQ0Q1tuH2UkdAZhXG4jcg==", "JWRUSUMZ");
            tn.a.d(imageAdjustActivity, ea.a.p("UG8ldhZyFnAWZmthZA==", "Df4xOTaN"), ea.a.p("KW8JdityPXAsZjliVW45ZUpfIWgmdw==", "A6JgNIHy"), ea.a.p("UmQhdQB0", "8sa6Obti"), false);
            a aVar = ImageAdjustActivity.f25741u0;
            gl.k.e(str, imageAdjustActivity.y2().c);
        }

        @Override // com.lib.flutter.encrypt.e
        public final void b() {
            View childAt;
            ImageAdjustActivity imageAdjustActivity = ImageAdjustActivity.this;
            if (pdf.pdfreader.viewer.editor.free.utils.extension.a.b(imageAdjustActivity)) {
                return;
            }
            gl.k kVar = gl.k.f17927a;
            ea.a.p("O20XZwhBLWo9cxJBV3Q-dlF0KyAmbn5pEGUwZANvLXQxbxh0DGknZXI=", "m9rvmIHQ");
            kVar.getClass();
            ea.a.p("em0qZxYyMkQ0Q1tuH2UkdAZhXG4jcg==", "JWRUSUMZ");
            a aVar = ImageAdjustActivity.f25741u0;
            if (imageAdjustActivity.y2().c.getChildCount() > 0 && (childAt = imageAdjustActivity.y2().c.getChildAt(0)) != null && (childAt instanceof BannerLoadingAnimation)) {
                imageAdjustActivity.y2().c.removeAllViews();
            }
        }
    }

    /* compiled from: ImageAdjustActivity.kt */
    /* loaded from: classes3.dex */
    public static final class e implements zo.b {
        public e() {
        }

        @Override // zo.b
        public final void a(View view, float f10) {
            boolean z10;
            Drawable drawable;
            CropImageView cropImageView = (CropImageView) view.findViewById(R.id.filter_iv);
            CropImageView cropImageView2 = (CropImageView) view.findViewById(R.id.preview_iv);
            if (f10 == 0.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            Drawable drawable2 = null;
            if (z10) {
                a aVar = ImageAdjustActivity.f25741u0;
                ImageAdjustActivity imageAdjustActivity = ImageAdjustActivity.this;
                view.setTag(Integer.valueOf(imageAdjustActivity.C2().f23518k));
                if (cropImageView != null) {
                    drawable = cropImageView.getDrawable();
                } else {
                    drawable = null;
                }
                if (drawable == null) {
                    if (cropImageView2 != null) {
                        drawable2 = cropImageView2.getDrawable();
                    }
                    if (drawable2 == null) {
                        if (cropImageView2 != null) {
                            cropImageView2.setCloseIconVisible(false);
                        }
                        if (cropImageView != null) {
                            cropImageView.setCloseIconVisible(false);
                            return;
                        }
                        return;
                    }
                }
                if (imageAdjustActivity.f27005x == TurnPageMode.ConvertItemClick.ordinal()) {
                    if (cropImageView2 != null) {
                        cropImageView2.setCloseIconVisible(false);
                    }
                    if (cropImageView != null) {
                        cropImageView.setCloseIconVisible(false);
                        return;
                    }
                    return;
                }
                if (cropImageView2 != null) {
                    cropImageView2.setCloseIconVisible(true);
                }
                if (cropImageView != null) {
                    cropImageView.setCloseIconVisible(true);
                    return;
                }
                return;
            }
            view.setTag(null);
            if (cropImageView2 != null) {
                cropImageView2.setCloseIconVisible(false);
            }
            if (cropImageView != null) {
                cropImageView.setCloseIconVisible(false);
            }
        }
    }

    /* compiled from: ImageAdjustActivity.kt */
    /* loaded from: classes3.dex */
    public static final class f extends ViewPager2.g {
        public f() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        @SuppressLint({"SetTextI18n"})
        public final void c(int i10) {
            String valueOf;
            int i11;
            int i12;
            boolean z10;
            LinearLayout linearLayout;
            LinearLayout linearLayout2;
            ea.a.p("BG0pZ1JBEWo9cxJBV3Q-dlF0eQ==", "G6MH7uhn");
            String str = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
            a aVar = ImageAdjustActivity.f25741u0;
            ImageAdjustActivity imageAdjustActivity = ImageAdjustActivity.this;
            int i13 = imageAdjustActivity.C2().f23518k;
            imageAdjustActivity.C2().f23518k = i10;
            if (i13 != i10) {
                if (imageAdjustActivity.C2().i() == null) {
                    tn.a.b(ScanEventCenter.a(), ea.a.p("P2FWZSZhU2ovc3Q=", "iR41uKYD"), ea.a.p("MGRTcC1nB187aAl3", "oUQ7LbNC"));
                    imageAdjustActivity.E2();
                }
                tf.c cVar = ScanEventCenter.f28674a;
                String d22 = imageAdjustActivity.d2();
                HashSet<String> hashSet = ScanEventCenter.f28675b;
                if (!hashSet.contains(ea.a.p("P2FWZRhkXXUpdBVwFGcNc2pjAmkmaw==", "y6rOTQtD"))) {
                    hashSet.add(ea.a.p("P2FWZRhkXXUpdBVwFGcNc2pjAmkmaw==", "idQpzwRo"));
                    tn.a.d(ScanEventCenter.a(), ea.a.p("Q2EsZSxhBmoHc3Q=", "2j1S8CUU"), ea.a.p("Q2EsZRJkCHUBdGtwCGczcxtjXmklaw==", "C2lrDSoh"), d22, false);
                }
                if (imageAdjustActivity.C2().j() == ImageAdjustPageMode.CROP) {
                    ScanEventCenter.e(imageAdjustActivity.d2());
                }
            }
            int size = imageAdjustActivity.C2().f23515h.size();
            TextView textView = imageAdjustActivity.y2().f676g;
            if (i10 >= size) {
                valueOf = String.valueOf(size);
            } else {
                valueOf = String.valueOf(i10 + 1);
            }
            textView.setText(valueOf);
            AppCompatImageView appCompatImageView = imageAdjustActivity.y2().f686q;
            if (i10 == 0) {
                i11 = 4;
            } else {
                i11 = 0;
            }
            appCompatImageView.setVisibility(i11);
            AppCompatImageView appCompatImageView2 = imageAdjustActivity.y2().f684o;
            if (imageAdjustActivity.C2().j() != ImageAdjustPageMode.PREVIEW ? i10 >= size - 1 : !(imageAdjustActivity.f27005x == TurnPageMode.ConvertItemClick.ordinal() || imageAdjustActivity.f27005x == TurnPageMode.AddPages.ordinal() ? i10 < size - 1 : i10 < size)) {
                i12 = 4;
            } else {
                i12 = 0;
            }
            appCompatImageView2.setVisibility(i12);
            boolean z11 = true;
            if (i10 < size) {
                z10 = true;
            } else {
                z10 = false;
            }
            ImageAdjustActivity.l2(imageAdjustActivity, z10);
            o2 o2Var = imageAdjustActivity.J;
            if (o2Var != null) {
                imageAdjustActivity.t2(o2Var);
            }
            p2 p2Var = imageAdjustActivity.K;
            if (p2Var != null) {
                imageAdjustActivity.H2(p2Var);
            }
            q2 q2Var = imageAdjustActivity.L;
            if (q2Var == null || (linearLayout2 = q2Var.f1349a) == null || linearLayout2.getVisibility() != 0) {
                z11 = false;
            }
            if (z11 && imageAdjustActivity.y2().f682m.getVisibility() == 4 && !kotlin.jvm.internal.g.a(imageAdjustActivity.y2().f682m.getTag(), Integer.valueOf(i10))) {
                q2 q2Var2 = imageAdjustActivity.L;
                if (q2Var2 != null) {
                    linearLayout = q2Var2.f1349a;
                } else {
                    linearLayout = null;
                }
                if (linearLayout != null) {
                    linearLayout.setVisibility(8);
                }
                imageAdjustActivity.y2().f682m.setVisibility(0);
            }
            ImageAdjustActivity.o2(imageAdjustActivity, i10);
        }
    }

    /* compiled from: ImageAdjustActivity.kt */
    /* loaded from: classes3.dex */
    public static final class g implements LayoutTransition.TransitionListener {
        public g() {
        }

        @Override // android.animation.LayoutTransition.TransitionListener
        public final void endTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i10) {
            a aVar = ImageAdjustActivity.f25741u0;
            ImageAdjustActivity.this.J2();
        }

        @Override // android.animation.LayoutTransition.TransitionListener
        public final void startTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i10) {
            a aVar = ImageAdjustActivity.f25741u0;
            ImageAdjustActivity.this.J2();
        }
    }

    /* compiled from: ImageAdjustActivity.kt */
    /* loaded from: classes3.dex */
    public static final class h extends androidx.activity.n {
        public h() {
            super(true);
        }

        @Override // androidx.activity.n
        public final void a() {
            a aVar = ImageAdjustActivity.f25741u0;
            ImageAdjustActivity imageAdjustActivity = ImageAdjustActivity.this;
            if (imageAdjustActivity.C2().j() == ImageAdjustPageMode.PREVIEW) {
                ImageAdjustActivity.m2(imageAdjustActivity);
            }
        }
    }

    /* compiled from: ImageAdjustActivity.kt */
    /* loaded from: classes3.dex */
    public static final class i implements androidx.lifecycle.x, kotlin.jvm.internal.e {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ cg.l f25770a;

        public i(cg.l lVar) {
            ea.a.p("F3UbYyZpPm4=", "41quRQFt");
            this.f25770a = lVar;
        }

        @Override // kotlin.jvm.internal.e
        public final cg.l a() {
            return this.f25770a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof androidx.lifecycle.x) && (obj instanceof kotlin.jvm.internal.e)) {
                return kotlin.jvm.internal.g.a(this.f25770a, ((kotlin.jvm.internal.e) obj).a());
            }
            return false;
        }

        public final int hashCode() {
            return this.f25770a.hashCode();
        }

        @Override // androidx.lifecycle.x
        public final /* synthetic */ void m(Object obj) {
            this.f25770a.invoke(obj);
        }
    }

    static {
        ea.a.p("em0qZxZBBmoHc0BBCnQ_di10eQ==", "mU6B5gPo");
        f25741u0 = new a();
    }

    public static final void l2(ImageAdjustActivity imageAdjustActivity, boolean z10) {
        LinearLayout linearLayout = imageAdjustActivity.y2().f687r;
        kotlin.jvm.internal.g.d(linearLayout, ea.a.p("BmkgZCNuJi46ZRJhX2UbYUFvJ3Q=", "Q1dNJAZq"));
        v2(linearLayout, z10);
        LinearLayout linearLayout2 = imageAdjustActivity.y2().f683n;
        kotlin.jvm.internal.g.d(linearLayout2, ea.a.p("UWklZBpuBS4eZVJ0JWEvbzF0", "aEwb5WxZ"));
        v2(linearLayout2, z10);
        LinearLayout linearLayout3 = imageAdjustActivity.y2().f680k;
        kotlin.jvm.internal.g.d(linearLayout3, ea.a.p("AWkmZCtuLS4uaQp0UXIkTFl5PXV0", "E1cHBJmH"));
        v2(linearLayout3, z10);
        LinearLayout linearLayout4 = imageAdjustActivity.y2().f674e;
        kotlin.jvm.internal.g.d(linearLayout4, ea.a.p("UWklZBpuBS4RcltwJWEvbzF0", "JSSzvluS"));
        v2(linearLayout4, z10);
        ConstraintLayout constraintLayout = imageAdjustActivity.y2().f678i;
        kotlin.jvm.internal.g.d(constraintLayout, ea.a.p("LWlfZBBuUC4_eD5yFGMcTFR5AXV0", "mxGLrmej"));
        v2(constraintLayout, z10);
    }

    public static final void m2(final ImageAdjustActivity imageAdjustActivity) {
        ul.b bVar;
        if (imageAdjustActivity.f27005x == TurnPageMode.ConvertItemClick.ordinal()) {
            ImageConvertDataRepository.f26536a.getClass();
            ArrayList<ul.b> arrayList = (ArrayList) ImageConvertDataRepository.f26552r.d();
            if (arrayList != null) {
                for (ul.b bVar2 : arrayList) {
                    if (bVar2.f30424v && (bVar = bVar2.f30423u) != null) {
                        String p10 = ea.a.p("JXRXaVxhUGULbwhmXWc=", "TZLy17Xj");
                        ul.c cVar = bVar2.f30419q;
                        kotlin.jvm.internal.g.d(cVar, p10);
                        String p11 = ea.a.p("UmQhdQB0K20VLl1tCGczQytuVGln", "aHmLVa0Z");
                        ul.c cVar2 = bVar.f30419q;
                        kotlin.jvm.internal.g.d(cVar2, p11);
                        ge.a.p(cVar, cVar2);
                        String p12 = ea.a.p("OHRvYRxqDXM8SQthU2UUb1ZmO2c=", "F7QAxx71");
                        ul.c cVar3 = bVar2.f30420r;
                        kotlin.jvm.internal.g.d(cVar3, p12);
                        String p13 = ea.a.p("EmQQdRt0Hm0vLgdkXnUkdHFtM2csQ1luEmln", "LZszhWHk");
                        ul.c cVar4 = bVar.f30420r;
                        kotlin.jvm.internal.g.d(cVar4, p13);
                        ge.a.p(cVar3, cVar4);
                        ho.b bVar3 = cVar.c;
                        if (bVar3 != null) {
                            bVar3.f18386e = null;
                        }
                        ul.b bVar4 = bVar2.f30423u;
                        if (bVar4 != null) {
                            bVar2.f30404a = bVar4.f30404a;
                        }
                        bVar2.f30424v = false;
                        bVar2.f30416n = null;
                        bVar2.f30413k = null;
                        bVar2.f30414l = null;
                        bVar2.f30415m = null;
                    }
                }
            }
            ImageConvertDataRepository.f26536a.getClass();
            ImageConvertDataRepository.g();
            ImageConvertDataRepository.f26551q.j(null);
            imageAdjustActivity.finish();
            imageAdjustActivity.overridePendingTransition(0, R.anim.activity_slide_out_bottom);
            return;
        }
        tf.c cVar5 = ScanEventCenter.f28674a;
        String d22 = imageAdjustActivity.d2();
        HashSet<String> hashSet = ScanEventCenter.f28675b;
        if (!hashSet.contains(ea.a.p("P2ECZRNkO3U7dDlyUXQiclZfMWwgY2s=", "qeOerQg8"))) {
            hashSet.add(ea.a.p("AWENZSlkXHU7dDlyUXQiclZfMWwgY2s=", "QrqjH6M3"));
            tn.a.d(ScanEventCenter.a(), ea.a.p("Q2EsZSxhBmoHc3Q=", "vjq0f4lT"), ea.a.p("P2FWZRhkXXUpdBVyEHQdcltfDWwsY2s=", "GBopxpQV"), d22, false);
        }
        if (imageAdjustActivity.h2()) {
            PageManagerQuitDialog pageManagerQuitDialog = new PageManagerQuitDialog(imageAdjustActivity);
            pageManagerQuitDialog.f23542t = new m0(imageAdjustActivity);
            pageManagerQuitDialog.show();
            return;
        }
        ImageAdjustLeaveDialog imageAdjustLeaveDialog = new ImageAdjustLeaveDialog(imageAdjustActivity);
        imageAdjustLeaveDialog.f23542t = new androidx.fragment.app.w() { // from class: pdf.pdfreader.viewer.editor.free.feature.scan.ui.ImageAdjustActivity$showQuitConfirmDialog$2$1
            @Override // oo.a
            public final void a() {
                ImageAdjustActivity.a aVar = ImageAdjustActivity.f25741u0;
                final ImageAdjustActivity imageAdjustActivity2 = ImageAdjustActivity.this;
                if (imageAdjustActivity2.f27005x == TurnPageMode.AddPages.ordinal()) {
                    ImageConvertDataRepository.f26536a.getClass();
                    ImageConvertDataRepository.g();
                    ImageConvertDataRepository.f26551q.j(null);
                    gl.k.f17927a.getClass();
                    gl.k.b(imageAdjustActivity2);
                    imageAdjustActivity2.finish();
                    return;
                }
                w0.a().f28790a.execute(new a6.c(6));
                pdf.pdfreader.viewer.editor.free.ads.n.f23972a.c(imageAdjustActivity2, new cg.a<tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.scan.ui.ImageAdjustActivity$showQuitConfirmDialog$2$1$ok$1
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
                        ImageAdjustActivity imageAdjustActivity3 = ImageAdjustActivity.this;
                        ImageAdjustActivity.a aVar2 = ImageAdjustActivity.f25741u0;
                        imageAdjustActivity3.s2();
                    }
                }, new cg.a<tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.scan.ui.ImageAdjustActivity$showQuitConfirmDialog$2$1$ok$2
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
                        ImageAdjustActivity.this.f25755n0 = true;
                    }
                });
            }
        };
        imageAdjustLeaveDialog.show();
    }

    public static final void n2(ImageAdjustActivity imageAdjustActivity, OCRStateManager.OCRState oCRState) {
        imageAdjustActivity.getClass();
        int i10 = b.f25762a[oCRState.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    imageAdjustActivity.y2().f677h.setVisibility(0);
                    imageAdjustActivity.y2().f679j.setVisibility(8);
                    return;
                }
                return;
            }
            BillingConfigImpl.c.getClass();
            if (BillingConfigImpl.p()) {
                ig.h<Object>[] hVarArr = BillingConfigImpl.f24850d;
                ig.h<Object> hVar = hVarArr[4];
                pdf.pdfreader.viewer.editor.free.datasource.sp.a aVar = BillingConfigImpl.f24866t;
                if (!((Boolean) aVar.b(hVar)).booleanValue()) {
                    aVar.c(hVarArr[4], Boolean.TRUE);
                    imageAdjustActivity.y2().f685p.s();
                }
                imageAdjustActivity.y2().f677h.setVisibility(8);
                imageAdjustActivity.y2().f679j.setVisibility(0);
                imageAdjustActivity.y2().f679j.setText(String.valueOf(BillingConfigImpl.j()));
                return;
            }
            imageAdjustActivity.y2().f677h.setVisibility(8);
            imageAdjustActivity.y2().f679j.setVisibility(8);
            return;
        }
        imageAdjustActivity.y2().f677h.setVisibility(8);
        imageAdjustActivity.y2().f679j.setVisibility(8);
    }

    public static final void o2(ImageAdjustActivity imageAdjustActivity, int i10) {
        View view;
        ThumbAdapter thumbAdapter = imageAdjustActivity.Y;
        thumbAdapter.f25626g = i10;
        if (thumbAdapter.getItemCount() > 0) {
            thumbAdapter.notifyItemRangeChanged(0, thumbAdapter.getItemCount(), (ArrayList) imageAdjustActivity.N.getValue());
        }
        if (i10 >= 0 && i10 < thumbAdapter.getItemCount()) {
            try {
                RecyclerView.m layoutManager = imageAdjustActivity.y2().f688s.getLayoutManager();
                if (layoutManager != null) {
                    view = layoutManager.C(i10);
                } else {
                    view = null;
                }
                if (view == null) {
                    imageAdjustActivity.y2().f688s.r0(i10);
                }
                imageAdjustActivity.y2().f688s.post(new n0.h(imageAdjustActivity, i10, 2));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public static final void p2(ImageAdjustActivity imageAdjustActivity, ul.b bVar) {
        imageAdjustActivity.getClass();
        tn.a.b(ScanEventCenter.a(), ea.a.p("P2FWZSZhU2ovc3Q=", "t8OmRjUz"), ea.a.p("UmQhdQB0BmUeZWtzAW93", "OvT3GS0o"));
        ImageAdjustDeleteConfirmDialog imageAdjustDeleteConfirmDialog = new ImageAdjustDeleteConfirmDialog(imageAdjustActivity);
        imageAdjustDeleteConfirmDialog.f23542t = new l0(imageAdjustActivity, bVar);
        imageAdjustDeleteConfirmDialog.setOnDismissListener(new z(imageAdjustDeleteConfirmDialog, 0));
        imageAdjustDeleteConfirmDialog.show();
    }

    public static final void q2(ImageAdjustActivity imageAdjustActivity, String str) {
        int dimension;
        int[] iArr = new int[2];
        imageAdjustActivity.y2().f695z.getLocationInWindow(iArr);
        int U = iArr[1] - t0.U(imageAdjustActivity);
        if (U < 0) {
            dimension = -1;
        } else {
            dimension = (int) (imageAdjustActivity.getResources().getDimension(R.dimen.dp_6) + U);
        }
        j1.e(imageAdjustActivity, str, false, null, dimension);
    }

    public static void v2(ViewGroup viewGroup, boolean z10) {
        viewGroup.setEnabled(z10);
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            kotlin.jvm.internal.g.d(childAt, ea.a.p("VGU_QxtpDmQzdBxpB2QzeCk=", "pNDv1SRI"));
            childAt.setEnabled(z10);
        }
    }

    public static void x2(View view, float f10) {
        view.setAlpha(f10);
        view.setScaleX(f10);
        view.setScaleY(f10);
    }

    public final OCRResultViewModel A2() {
        return (OCRResultViewModel) this.T.getValue();
    }

    public final pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.b B2() {
        return (pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.b) this.Z.getValue();
    }

    public final on.b C2() {
        return (on.b) this.S.getValue();
    }

    @Override // jl.a
    public final View D1() {
        ConstraintLayout constraintLayout = y2().f671a;
        kotlin.jvm.internal.g.d(constraintLayout, ea.a.p("LWkFZChuCi46bwl0", "u9OkAmLF"));
        return constraintLayout;
    }

    public final void D2() {
        tf.d dVar;
        final ArrayList arrayList = C2().f23515h;
        final Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.element = C2().f23518k;
        boolean z10 = false;
        if (arrayList.size() > 40) {
            String string = getResources().getString(R.string.arg_res_0x7f13019a);
            kotlin.jvm.internal.g.d(string, ea.a.p("PWVCbwxyVGUpLi1lAVMcclxuCSgXLhZ0jYCQLg9tMWcqX11pFGlDXyhlK2MdZQxfUnAaKQ==", "zpl2o6fP"));
            String string2 = getResources().getString(R.string.arg_res_0x7f130258, ea.a.p("ezA=", "vF3sr6ge"));
            kotlin.jvm.internal.g.d(string2, ea.a.p("EGUVb0JyBGU7LgFlQFMjclFuNSgbLkV0loDXTRBYHVArQy1fZEk9RWZ0CVNAcj5uXyh7KQ==", "enbf7gyy"));
            new i3(this, string, aj.b.T(androidx.core.content.a.getColor(this, R.color.colorAccent), string2), null).show();
            return;
        }
        if (ReaderDebugActivity.f27841t || cl.b.b(this)) {
            z10 = true;
        } else {
            if (!this.f25760s0) {
                tf.c cVar = OCREventCenter.f28670a;
                OCREventCenter.e(z2(OcrUploadResult.NETWORK_ERROR));
                this.f25760s0 = true;
            }
            i3 i3Var = this.V;
            if (i3Var != null) {
                i3Var.show();
                dVar = tf.d.f30009a;
            } else {
                dVar = null;
            }
            if (dVar == null) {
                String string3 = getResources().getString(R.string.arg_res_0x7f1302af);
                kotlin.jvm.internal.g.d(string3, ea.a.p("PWVCbwxyVGUpLi1lAVMcclxuCSgXLhZ0PGkgZ2luAnQ4b0NrJmVFcjVyKQ==", "41KENNGg"));
                String string4 = getResources().getString(R.string.arg_res_0x7f130109);
                kotlin.jvm.internal.g.d(string4, ea.a.p("PWVCbwxyVGUpLi1lAVMcclxuCSgXLhZ0PmkhZ0dkJXchbF5hHV9RYTNsL2Qp", "IpoDLOiJ"));
                i3 i3Var2 = new i3(this, string3, string4, null);
                this.V = i3Var2;
                i3Var2.B = new cg.a<tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.scan.ui.ImageAdjustActivity$networkIsAvailable$1$1
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
                        ImageAdjustActivity imageAdjustActivity = ImageAdjustActivity.this;
                        if (imageAdjustActivity.f25761t0) {
                            return;
                        }
                        tf.c cVar2 = OCREventCenter.f28670a;
                        OCREventCenter.d(imageAdjustActivity.z2(OcrUploadResult.NETWORK_ERROR));
                        ImageAdjustActivity.this.f25761t0 = true;
                    }
                };
                i3Var2.show();
            }
        }
        if (!z10) {
            return;
        }
        OCRTransportImageExecutor oCRTransportImageExecutor = new OCRTransportImageExecutor(this, new cg.l<List<? extends um.a>, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.scan.ui.ImageAdjustActivity$goToExtractText$1

            /* compiled from: ImageAdjustActivity.kt */
            @wf.c(c = "pdf.pdfreader.viewer.editor.free.feature.scan.ui.ImageAdjustActivity$goToExtractText$1$2", f = "ImageAdjustActivity.kt", l = {1670}, m = "invokeSuspend")
            /* renamed from: pdf.pdfreader.viewer.editor.free.feature.scan.ui.ImageAdjustActivity$goToExtractText$1$2  reason: invalid class name */
            /* loaded from: classes3.dex */
            public static final class AnonymousClass2 extends SuspendLambda implements cg.p<kotlinx.coroutines.w, kotlin.coroutines.c<? super tf.d>, Object> {
                final /* synthetic */ List<ul.b> $images;
                final /* synthetic */ List<um.a> $result;
                final /* synthetic */ Ref$IntRef $startIndex;
                private /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ ImageAdjustActivity this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(List<um.a> list, ImageAdjustActivity imageAdjustActivity, List<ul.b> list2, Ref$IntRef ref$IntRef, kotlin.coroutines.c<? super AnonymousClass2> cVar) {
                    super(2, cVar);
                    this.$result = list;
                    this.this$0 = imageAdjustActivity;
                    this.$images = list2;
                    this.$startIndex = ref$IntRef;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$result, this.this$0, this.$images, this.$startIndex, cVar);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                /* JADX WARN: Code restructure failed: missing block: B:31:0x007f, code lost:
                    r1 = (um.a) kotlin.collections.m.t0(r14.element, r13.$result);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:32:0x0089, code lost:
                    if (r1 != null) goto L53;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:33:0x008b, code lost:
                    r1 = r13.$result;
                    r14.element = 0;
                    r1 = r1.get(0);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:34:0x0095, code lost:
                    r5 = r13.this$0;
                    r6 = pdf.pdfreader.viewer.editor.free.feature.scan.ui.ImageAdjustActivity.f25741u0;
                    r5 = r5.A2();
                    r6 = r13.this$0;
                    r13.L$0 = r14;
                    r13.label = 1;
                    r1 = r5.g(r1, r6, r13);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:35:0x00a7, code lost:
                    if (r1 != r0) goto L56;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:36:0x00a9, code lost:
                    return r0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:37:0x00aa, code lost:
                    r0 = r14;
                    r14 = r1;
                 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r14) {
                    /*
                        Method dump skipped, instructions count: 410
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.feature.scan.ui.ImageAdjustActivity$goToExtractText$1.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
                }

                @Override // cg.p
                public final Object invoke(kotlinx.coroutines.w wVar, kotlin.coroutines.c<? super tf.d> cVar) {
                    return ((AnonymousClass2) create(wVar, cVar)).invokeSuspend(tf.d.f30009a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(List<um.a> result) {
                kotlin.jvm.internal.g.e(result, "result");
                if (!result.isEmpty()) {
                    if (result.size() < arrayList.size()) {
                        ImageAdjustActivity imageAdjustActivity = this;
                        j1.e(imageAdjustActivity, imageAdjustActivity.getResources().getString(R.string.arg_res_0x7f130569), false, null, -1);
                    }
                    final ImageAdjustActivity imageAdjustActivity2 = this;
                    OCRLoadingDialog oCRLoadingDialog = imageAdjustActivity2.U;
                    if (oCRLoadingDialog != null) {
                        oCRLoadingDialog.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: pdf.pdfreader.viewer.editor.free.feature.scan.ui.e0
                            @Override // android.content.DialogInterface.OnCancelListener
                            public final void onCancel(DialogInterface dialogInterface) {
                                String p10 = ea.a.p("IWgYc14w", "U6UqzpMw");
                                ImageAdjustActivity imageAdjustActivity3 = ImageAdjustActivity.this;
                                kotlin.jvm.internal.g.e(imageAdjustActivity3, p10);
                                y0 y0Var = imageAdjustActivity3.X;
                                if (y0Var != null) {
                                    y0Var.b(null);
                                }
                                imageAdjustActivity3.A2().e();
                            }
                        });
                    }
                    ImageAdjustActivity imageAdjustActivity3 = this;
                    imageAdjustActivity3.X = t0.d0(b.b.x(imageAdjustActivity3), null, null, new AnonymousClass2(result, this, arrayList, ref$IntRef, null), 3);
                    return;
                }
                ImageAdjustActivity imageAdjustActivity4 = this;
                j1.e(imageAdjustActivity4, imageAdjustActivity4.getResources().getString(R.string.arg_res_0x7f13019f), false, null, -1);
                OCRLoadingDialog oCRLoadingDialog2 = this.U;
                if (oCRLoadingDialog2 != null) {
                    oCRLoadingDialog2.dismiss();
                }
            }

            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(List<? extends um.a> list) {
                invoke2((List<um.a>) list);
                return tf.d.f30009a;
            }
        });
        OCREventCenter.g();
        this.f25759r0 = System.currentTimeMillis();
        oCRTransportImageExecutor.c = new d();
        oCRTransportImageExecutor.l(new pdf.pdfreader.viewer.editor.free.feature.ocr.helper.n(arrayList));
    }

    @Override // jl.a
    public final int E1() {
        return 0;
    }

    public final void E2() {
        ConstraintLayout constraintLayout;
        t1 t1Var = this.M;
        if (t1Var != null) {
            constraintLayout = t1Var.c();
        } else {
            constraintLayout = null;
        }
        if (constraintLayout != null) {
            constraintLayout.setVisibility(8);
        }
    }

    @Override // jl.a
    public final int F1() {
        return androidx.core.content.a.getColor(this, R.color.colorPrimaryOld);
    }

    public final void F2(List<? extends ul.b> list) {
        if (isFinishing() || isDestroyed() || list == null) {
            return;
        }
        if (this.f27005x == TurnPageMode.ConvertItemClick.ordinal()) {
            ImageConvertDataRepository.f26536a.getClass();
            ImageConvertDataRepository.f26549o.j(null);
        }
        ImageConvertDataRepository.f26536a.getClass();
        ArrayList<ul.b> arrayList = new ArrayList<>();
        androidx.lifecycle.w<ArrayList<ul.b>> wVar = ImageConvertDataRepository.f26549o;
        ArrayList<ul.b> d10 = wVar.d();
        if (d10 != null && (!d10.isEmpty())) {
            arrayList.addAll(d10);
        }
        int size = arrayList.size();
        for (ul.b bVar : list) {
            bVar.b(true);
            size++;
            bVar.c(size);
            arrayList.add(bVar);
        }
        wVar.j(arrayList);
        ArrayList<ul.b> d11 = ImageConvertDataRepository.f26545k.d();
        if (d11 != null) {
            for (ul.b bVar2 : d11) {
                bVar2.b(false);
            }
        }
        ImageConvertDataRepository.g();
        ImageConvertDataRepository.f26551q.j(null);
        ReaderImg2PDFConvertActivity.a aVar = ReaderImg2PDFConvertActivity.f27381i0;
        String p10 = ea.a.p("J20hczVsU2N0", "IANFP6qe");
        boolean z10 = this.O;
        String workflow = this.f27001t;
        aVar.getClass();
        kotlin.jvm.internal.g.e(workflow, "workflow");
        Intent intent = new Intent(this, ReaderImg2PDFConvertActivity.class);
        intent.putExtra(ea.a.p("H28hcgtl", "bjlThlpH"), p10);
        intent.putExtra(ea.a.p("WnMNchxtNmgbcmQ=", "HmE77s3a"), z10);
        intent.putExtra(ea.a.p("VXIkbSx3DXIZZlhvdw==", "WQZc1U0G"), workflow);
        startActivity(intent);
        finish();
    }

    public final void G2() {
        if (this.f25754m0 == 0) {
            this.f25754m0 = getResources().getDimensionPixelSize(R.dimen.dp_164);
        }
    }

    public final void H2(p2 p2Var) {
        ImageAdjustFiltersAdapter imageAdjustFiltersAdapter;
        ul.b i10;
        int j10;
        if (p2Var.f1304a.getVisibility() != 8 && (imageAdjustFiltersAdapter = this.f25743b0) != null && (i10 = C2().i()) != null && (j10 = imageAdjustFiltersAdapter.j(this, i10)) >= 0) {
            p2Var.f1306d.r0(j10);
        }
    }

    public final void I2() {
        if (this.f27005x != TurnPageMode.ConvertItemClick.ordinal() && this.f27005x != TurnPageMode.AddPages.ordinal()) {
            BillingConfigImpl.c.getClass();
            if (BillingConfigImpl.r()) {
                tf.c cVar = ScanEventCenter.f28674a;
                String d22 = d2();
                HashSet<String> hashSet = ScanEventCenter.f28675b;
                if (!hashSet.contains(ea.a.p("P2FWZRhkXXUpdBVlDXQaYVZ0MXMtb3c=", "dilRY6Mc"))) {
                    hashSet.add(ea.a.p("Q2EsZRJkCHUBdGtlEXQkYSd0bXMub3c=", "ju2FDwas"));
                    tn.a.d(ScanEventCenter.a(), ea.a.p("Q2EsZSxhBmoHc3Q=", "Ejm755cX"), ea.a.p("Q2EsZRJkCHUBdGtlEXQkYSd0bXMub3c=", "kYvKarrq"), d22, false);
                }
                y2().f678i.setVisibility(0);
                OCRStateManager.a aVar = OCRStateManager.f25059a;
                cg.l<OCRStateManager.OCRState, tf.d> lVar = new cg.l<OCRStateManager.OCRState, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.scan.ui.ImageAdjustActivity$refreshOCRState$1
                    {
                        super(1);
                    }

                    @Override // cg.l
                    public /* bridge */ /* synthetic */ tf.d invoke(OCRStateManager.OCRState oCRState) {
                        invoke2(oCRState);
                        return tf.d.f30009a;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2(OCRStateManager.OCRState it) {
                        kotlin.jvm.internal.g.e(it, "it");
                        ImageAdjustActivity.n2(ImageAdjustActivity.this, it);
                    }
                };
                aVar.getClass();
                OCRStateManager.a.b(lVar);
                return;
            }
            y2().f678i.setVisibility(8);
            return;
        }
        y2().f678i.setVisibility(8);
    }

    public final void J2() {
        if (!y2().f695z.e() && (!C2().f23515h.isEmpty())) {
            y2().f695z.g();
        }
    }

    @Override // jl.a
    public final void K1() {
        LayoutTransition layoutTransition = y2().f671a.getLayoutTransition();
        if (layoutTransition != null) {
            layoutTransition.addTransitionListener(this.f25752k0);
        }
        I2();
        y2().f671a.addOnLayoutChangeListener(new pdf.pdfreader.viewer.editor.free.feature.billing.ui.c(this, 2));
        AppCompatImageView appCompatImageView = y2().f672b;
        kotlin.jvm.internal.g.d(appCompatImageView, ea.a.p("E2kNZFhuDy4qYQVrfXY=", "Liqc1hq3"));
        pdf.pdfreader.viewer.editor.free.utils.extension.g.e(appCompatImageView, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.scan.ui.ImageAdjustActivity$initView$2
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
                ImageAdjustActivity.m2(ImageAdjustActivity.this);
            }
        });
        AppCompatImageView appCompatImageView2 = y2().f689t;
        kotlin.jvm.internal.g.d(appCompatImageView2, ea.a.p("W2kGZD1uLy47YRBlfXY=", "UN9hTHcB"));
        pdf.pdfreader.viewer.editor.free.utils.extension.g.e(appCompatImageView2, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.scan.ui.ImageAdjustActivity$initView$3
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
                pdf.pdfreader.viewer.editor.free.convert.opt.h hVar;
                File file;
                kotlin.jvm.internal.g.e(it, "it");
                tf.c cVar = ScanEventCenter.f28674a;
                String d22 = ImageAdjustActivity.this.d2();
                HashSet<String> hashSet = ScanEventCenter.f28675b;
                if (!hashSet.contains(ea.a.p("Q2EsZRJkCHUBdGtuDHgiXydsW2Nr", "sxGMh0AC"))) {
                    hashSet.add(ea.a.p("P2FWZRhkXXUpdBVuEHgcX1ZsB2Nr", "1GbiGFDD"));
                    tn.a.d(ScanEventCenter.a(), ea.a.p("OGFUZRphHmo9c3Q=", "nDH3EzD9"), ea.a.p("Q2EsZRJkCHUBdGtuDHgiXydsW2Nr", "UpC6RfSg"), d22, false);
                }
                final ImageAdjustActivity imageAdjustActivity = ImageAdjustActivity.this;
                final OptTaskWrapper optTaskWrapper = new OptTaskWrapper(imageAdjustActivity, imageAdjustActivity.f19294h, kotlin.collections.m.E0(imageAdjustActivity.C2().f23515h), new cg.l<List<? extends ul.b>, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.scan.ui.ImageAdjustActivity$optImage$1
                    {
                        super(1);
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2(List<? extends ul.b> result) {
                        kotlin.jvm.internal.g.e(result, "result");
                        if (ImageAdjustActivity.this.isFinishing() || ImageAdjustActivity.this.isDestroyed()) {
                            return;
                        }
                        ImageAdjustActivity imageAdjustActivity2 = ImageAdjustActivity.this;
                        if (imageAdjustActivity2.f25745d0) {
                            imageAdjustActivity2.f25746e0 = true;
                            imageAdjustActivity2.f25747f0 = result;
                            return;
                        }
                        imageAdjustActivity2.F2(result);
                    }

                    @Override // cg.l
                    public /* bridge */ /* synthetic */ tf.d invoke(List<? extends ul.b> list) {
                        invoke2(list);
                        return tf.d.f30009a;
                    }
                });
                String string = imageAdjustActivity.getResources().getString(R.string.arg_res_0x7f1303cd);
                kotlin.jvm.internal.g.d(string, ea.a.p("SmUCbwZyCmU7LgFlQFMjclFuNSgbLkV0loDXZTBkJ3JncANvEGUacyFuAV9YbzZkUW41KQ==", "Nn8qsiue"));
                optTaskWrapper.f24131f = string;
                float a10 = pdf.pdfreader.viewer.editor.free.utils.f0.a();
                List<ul.b> images = optTaskWrapper.c;
                float f10 = 0.0f;
                for (ul.b bVar : images) {
                    f10 += (float) bVar.f30406d;
                }
                float f11 = ((f10 * 2) / 1000.0f) / 1000.0f;
                dp.a.a().getClass();
                dp.a.c("img2PdfMemory-------->needSpace:" + f11 + "----freeInternalStorage:" + a10);
                int i10 = (f11 > a10 ? 1 : (f11 == a10 ? 0 : -1));
                final Context context = optTaskWrapper.f24127a;
                if (i10 > 0) {
                    new pdf.pdfreader.viewer.editor.free.ui.dialog.x(context, context.getString(R.string.arg_res_0x7f1302ad), context.getString(R.string.arg_res_0x7f1304da), context.getString(R.string.arg_res_0x7f130421)).show();
                } else {
                    pdf.pdfreader.viewer.editor.free.convert.opt.h hVar2 = new pdf.pdfreader.viewer.editor.free.convert.opt.h();
                    kotlin.jvm.internal.g.e(context, "context");
                    kotlin.jvm.internal.g.e(images, "images");
                    hVar2.c = optTaskWrapper;
                    optTaskWrapper.d();
                    hVar2.f24154b.set(0);
                    if (hVar2.f24153a == null) {
                        ge.a.z().getClass();
                        int[] B = ge.a.B(context);
                        hVar2.f24153a = new ThreadPoolExecutor(B[0], B[1], (long) TelemetryConfig.DEFAULT_LOG_RETRY_INTERVAL, TimeUnit.SECONDS, new LinkedBlockingQueue(100000), new ThreadPoolExecutor.CallerRunsPolicy());
                    }
                    final Vector vector = new Vector();
                    final int size = images.size();
                    File file2 = new File(pdf.pdfreader.viewer.editor.free.utils.v.E());
                    if (!file2.exists()) {
                        file2.mkdirs();
                    }
                    File file3 = new File(file2, ea.a.p("IHBFSRRhUGU=", "RyDcjTfI"));
                    if (!file3.exists()) {
                        file3.mkdir();
                    }
                    for (final ul.b bVar2 : images) {
                        ThreadPoolExecutor threadPoolExecutor = hVar2.f24153a;
                        if (threadPoolExecutor != null) {
                            final pdf.pdfreader.viewer.editor.free.convert.opt.h hVar3 = hVar2;
                            final File file4 = file3;
                            hVar = hVar2;
                            file = file3;
                            threadPoolExecutor.execute(new Runnable() { // from class: pdf.pdfreader.viewer.editor.free.convert.opt.b
                                /* JADX WARN: Code restructure failed: missing block: B:54:0x0164, code lost:
                                    r0 = new ln.a(r6);
                                    kotlin.jvm.internal.g.d(r3.f30404a, ea.a.p("PHJSSRRhUGV0ZiNsEFAJdGg=", "jwERc6rU"));
                                 */
                                /* JADX WARN: Code restructure failed: missing block: B:55:0x0182, code lost:
                                    if (r0.a(r11) >= 0.2d) goto L65;
                                 */
                                /* JADX WARN: Code restructure failed: missing block: B:56:0x0184, code lost:
                                    r4.c = new io.d(r6);
                                 */
                                /* JADX WARN: Code restructure failed: missing block: B:57:0x018c, code lost:
                                    r4.c = new io.e(r6);
                                 */
                                /* JADX WARN: Code restructure failed: missing block: B:58:0x0193, code lost:
                                    r0 = r4.c;
                                 */
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // java.lang.Runnable
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                                */
                                public final void run() {
                                    /*
                                        Method dump skipped, instructions count: 543
                                        To view this dump change 'Code comments level' option to 'DEBUG'
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.convert.opt.b.run():void");
                                }
                            });
                        } else {
                            hVar = hVar2;
                            file = file3;
                        }
                        hVar2 = hVar;
                        file3 = file;
                    }
                }
                imageAdjustActivity.f25744c0 = optTaskWrapper;
            }
        });
        ConstraintLayout constraintLayout = y2().f678i;
        kotlin.jvm.internal.g.d(constraintLayout, ea.a.p("DmkZZC9uLS4teBJyVWMjTFl5PXV0", "OilwFJ37"));
        pdf.pdfreader.viewer.editor.free.utils.extension.g.e(constraintLayout, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.scan.ui.ImageAdjustActivity$initView$4
            {
                super(1);
            }

            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(View view) {
                invoke2(view);
                return tf.d.f30009a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(final View it) {
                kotlin.jvm.internal.g.e(it, "it");
                tf.c cVar = ScanEventCenter.f28674a;
                String d22 = ImageAdjustActivity.this.d2();
                HashSet<String> hashSet = ScanEventCenter.f28675b;
                if (!hashSet.contains(ea.a.p("Q2EsZRJkCHUBdGtlEXQkYSd0bWMqaSBr", "7hyo0iFn"))) {
                    hashSet.add(ea.a.p("Q2EsZRJkCHUBdGtlEXQkYSd0bWMqaSBr", "Jav5lgdW"));
                    tn.a.d(ScanEventCenter.a(), ea.a.p("Q2EsZSxhBmoHc3Q=", "NaUUE1Jx"), ea.a.p("Q2EsZRJkCHUBdGtlEXQkYSd0bWMqaSBr", "tSH7i4oO"), d22, false);
                }
                OCRStateManager.a aVar = OCRStateManager.f25059a;
                final ImageAdjustActivity imageAdjustActivity = ImageAdjustActivity.this;
                cg.a<tf.d> aVar2 = new cg.a<tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.scan.ui.ImageAdjustActivity$initView$4.1
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
                        ImageAdjustActivity imageAdjustActivity2 = ImageAdjustActivity.this;
                        ImageAdjustActivity.a aVar3 = ImageAdjustActivity.f25741u0;
                        imageAdjustActivity2.D2();
                    }
                };
                final ImageAdjustActivity imageAdjustActivity2 = ImageAdjustActivity.this;
                cg.a<tf.d> aVar3 = new cg.a<tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.scan.ui.ImageAdjustActivity$initView$4.2
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
                        ImageAdjustActivity.this.f25750i0 = true;
                        BillingConfigImpl.c.getClass();
                        BillingConfigImpl.f24865s.c(BillingConfigImpl.f24850d[3], Boolean.TRUE);
                        BaseSubscriptionActivity.a aVar4 = BaseSubscriptionActivity.L;
                        Context context = it.getContext();
                        kotlin.jvm.internal.g.d(context, ea.a.p("WnRlYxxuFmUKdA==", "d0Lk4CVw"));
                        String p10 = ea.a.p("HmNy", "BoqVmeRr");
                        aVar4.getClass();
                        BaseSubscriptionActivity.a.a(context, p10);
                    }
                };
                aVar.getClass();
                OCRStateManager.a.a(aVar2, aVar3);
            }
        });
        y2().f687r.setOnClickListener(new qb.j0(this, 13));
        y2().f683n.setOnClickListener(new f5.d(this, 14));
        y2().f680k.setOnClickListener(new f5.e(this, 14));
        y2().f674e.setOnClickListener(new q(this, 0));
        y2().f686q.setOnClickListener(new u(this, 0));
        y2().f684o.setOnClickListener(new v(this, 0));
        ViewPager2 viewPager2 = y2().f695z;
        viewPager2.setAdapter(B2());
        androidx.recyclerview.widget.e<ul.b> h10 = B2().h();
        h10.f4410d.add(new e.a() { // from class: pdf.pdfreader.viewer.editor.free.feature.scan.ui.w
            @Override // androidx.recyclerview.widget.e.a
            public final void a(List list, List list2) {
                boolean z10;
                boolean z11;
                ImageAdjustActivity.a aVar = ImageAdjustActivity.f25741u0;
                String p10 = ea.a.p("O2hYc10w", "LhCoddgl");
                ImageAdjustActivity imageAdjustActivity = ImageAdjustActivity.this;
                kotlin.jvm.internal.g.e(imageAdjustActivity, p10);
                kotlin.jvm.internal.g.e(list, ea.a.p("P3JUdhBvQnMWaTl0", "Kl43Ef3y"));
                kotlin.jvm.internal.g.e(list2, ea.a.p("UHU5chZuFkwbc3Q=", "3s5kdGY7"));
                int i10 = -1;
                if (list2.size() > list.size()) {
                    if (imageAdjustActivity.f27005x != TurnPageMode.ConvertItemClick.ordinal() && imageAdjustActivity.f27005x != TurnPageMode.AddPages.ordinal()) {
                        Iterator it = list.iterator();
                        int i11 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            if (((ul.b) it.next()).f30418p == ImageAdjustType.TOOLS) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (z11) {
                                i10 = i11;
                                break;
                            }
                            i11++;
                        }
                    } else {
                        i10 = ge.a.A(list);
                    }
                } else if (imageAdjustActivity.f27005x != TurnPageMode.ConvertItemClick.ordinal() && imageAdjustActivity.f27005x != TurnPageMode.AddPages.ordinal()) {
                    int i12 = imageAdjustActivity.f25749h0;
                    Iterator it2 = list2.iterator();
                    int i13 = 0;
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        if (((ul.b) it2.next()).f30418p == ImageAdjustType.TOOLS) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            i10 = i13;
                            break;
                        }
                        i13++;
                    }
                    i10 = Math.min(i12, i10 - 1);
                } else {
                    i10 = Math.min(imageAdjustActivity.f25749h0, ge.a.A(list2));
                }
                imageAdjustActivity.y2().f695z.post(new qb.t0(imageAdjustActivity, i10, 3));
            }
        });
        viewPager2.setCurrentItem(0);
        viewPager2.setOffscreenPageLimit(1);
        viewPager2.setPageTransformer(new zo.a(getResources().getDimensionPixelSize(R.dimen.dp_28), new e()));
        viewPager2.f(new f());
        RecyclerView recyclerView = y2().f688s;
        recyclerView.setItemAnimator(null);
        ThumbAdapter thumbAdapter = this.Y;
        recyclerView.setAdapter(thumbAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(0));
        thumbAdapter.f25631l = new cg.l<Integer, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.scan.ui.ImageAdjustActivity$initView$12$1
            {
                super(1);
            }

            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(Integer num) {
                invoke(num.intValue());
                return tf.d.f30009a;
            }

            public final void invoke(int i10) {
                tf.c cVar = ScanEventCenter.f28674a;
                String d22 = ImageAdjustActivity.this.d2();
                HashSet<String> hashSet = ScanEventCenter.f28675b;
                if (!hashSet.contains(ea.a.p("P2FWZRhkXXUpdBV0HXUFYlthB2waYwlpKGs=", "neOGKOCV"))) {
                    hashSet.add(ea.a.p("P2FWZRhkXXUpdBV0HXUFYlthB2waYwlpE2s=", "eYK1phuZ"));
                    tn.a.d(ScanEventCenter.a(), ea.a.p("SWEoZRRhCGo9c3Q=", "e19OKlKe"), ea.a.p("P2FWZRhkXXUpdBV0HXUFYlthB2waYwlpKms=", "NjeXImLJ"), d22, false);
                }
                ImageAdjustActivity.o2(ImageAdjustActivity.this, i10);
                ImageAdjustActivity.this.K2(i10);
            }
        };
        y2().f675f.setOnInflateListener(new a0(this, 0));
        y2().f681l.setOnInflateListener(new ViewStub.OnInflateListener() { // from class: pdf.pdfreader.viewer.editor.free.feature.scan.ui.b0
            @Override // android.view.ViewStub.OnInflateListener
            public final void onInflate(ViewStub viewStub, View view) {
                ImageAdjustActivity.a aVar = ImageAdjustActivity.f25741u0;
                String p10 = ea.a.p("O2hYc10w", "Dn3Ugk3c");
                ImageAdjustActivity imageAdjustActivity = ImageAdjustActivity.this;
                kotlin.jvm.internal.g.e(imageAdjustActivity, p10);
                int i10 = R.id.apply_all_group;
                Group group = (Group) com.google.android.play.core.assetpacks.c.u(view, R.id.apply_all_group);
                if (group != null) {
                    i10 = R.id.filters_line;
                    View u7 = com.google.android.play.core.assetpacks.c.u(view, R.id.filters_line);
                    if (u7 != null) {
                        i10 = R.id.filters_recycler;
                        RecyclerView recyclerView2 = (RecyclerView) com.google.android.play.core.assetpacks.c.u(view, R.id.filters_recycler);
                        if (recyclerView2 != null) {
                            i10 = R.id.filters_tools_apply_all_iv;
                            AppCompatImageView appCompatImageView3 = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(view, R.id.filters_tools_apply_all_iv);
                            if (appCompatImageView3 != null) {
                                i10 = R.id.filters_tools_apply_all_tv;
                                TextView textView = (TextView) com.google.android.play.core.assetpacks.c.u(view, R.id.filters_tools_apply_all_tv);
                                if (textView != null) {
                                    i10 = R.id.filters_tools_close_iv;
                                    AppCompatImageView appCompatImageView4 = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(view, R.id.filters_tools_close_iv);
                                    if (appCompatImageView4 != null) {
                                        i10 = R.id.filters_tools_confirm_iv;
                                        AppCompatImageView appCompatImageView5 = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(view, R.id.filters_tools_confirm_iv);
                                        if (appCompatImageView5 != null) {
                                            ConstraintLayout constraintLayout2 = (ConstraintLayout) view;
                                            LottieAnimationView lottieAnimationView = (LottieAnimationView) com.google.android.play.core.assetpacks.c.u(view, R.id.lottieApplyAll);
                                            if (lottieAnimationView != null) {
                                                p2 p2Var = new p2(constraintLayout2, group, u7, recyclerView2, appCompatImageView3, textView, appCompatImageView4, appCompatImageView5, constraintLayout2, lottieAnimationView);
                                                constraintLayout2.setOnClickListener(new s(0));
                                                appCompatImageView4.setOnClickListener(new u(imageAdjustActivity, 1));
                                                appCompatImageView5.setOnClickListener(new v(imageAdjustActivity, 1));
                                                appCompatImageView3.setOnClickListener(new pdf.pdfreader.viewer.editor.free.feature.ocr.ui.adapter.e(1, imageAdjustActivity, p2Var));
                                                textView.setOnClickListener(new t(imageAdjustActivity, p2Var, 0));
                                                ArrayList arrayList = new ArrayList();
                                                GroupAiFilterType.Companion.getClass();
                                                ArrayList arrayList2 = new ArrayList();
                                                arrayList2.add(GroupAiFilterType.RAW);
                                                arrayList2.add(GroupAiFilterType.SUPER_DOCS);
                                                arrayList2.add(GroupAiFilterType.CUSTOM2);
                                                arrayList2.add(GroupAiFilterType.SUPER_IMAGE);
                                                arrayList2.add(GroupAiFilterType.BLEND_ALPHA);
                                                arrayList2.add(GroupAiFilterType.CONTRAST);
                                                arrayList2.add(GroupAiFilterType.CUSTOM_BW1);
                                                arrayList2.add(GroupAiFilterType.CUSTOM_BW2);
                                                arrayList2.add(GroupAiFilterType.GRAYSCALE);
                                                arrayList2.add(GroupAiFilterType.REVERSE_COLOR);
                                                Iterator it = arrayList2.iterator();
                                                while (it.hasNext()) {
                                                    GroupAiFilterType groupAiFilterType = (GroupAiFilterType) it.next();
                                                    Context context = recyclerView2.getContext();
                                                    kotlin.jvm.internal.g.d(context, ea.a.p("NGUteVRsUnIeaQN3GmM4bkxlKnQ=", "tOFN77Mv"));
                                                    kotlin.jvm.internal.g.e(groupAiFilterType, "<this>");
                                                    ho.b a10 = go.a.a(context, groupAiFilterType);
                                                    Context context2 = recyclerView2.getContext();
                                                    kotlin.jvm.internal.g.d(context2, ea.a.p("PWVSeRpsUnIMaS93W2MHbkFlFnQ=", "gvJyWrWN"));
                                                    a10.f18384b = nn.b.a(context2, groupAiFilterType);
                                                    arrayList.add(a10);
                                                }
                                                ImageAdjustFiltersAdapter imageAdjustFiltersAdapter = new ImageAdjustFiltersAdapter(b.b.x(imageAdjustActivity), arrayList, new f0(imageAdjustActivity));
                                                recyclerView2.setAdapter(imageAdjustFiltersAdapter);
                                                recyclerView2.getContext();
                                                recyclerView2.setLayoutManager(new LinearLayoutManager(0));
                                                imageAdjustActivity.f25743b0 = imageAdjustFiltersAdapter;
                                                ea.a.p("O29ebApCXm4-aSRn", "lPPnLY2F");
                                                imageAdjustActivity.H2(p2Var);
                                                imageAdjustActivity.K = p2Var;
                                                imageAdjustActivity.C2().g();
                                                return;
                                            }
                                            i10 = R.id.lottieApplyAll;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException(ea.a.p("fmk4cxpuBSAAZUV1AHIzZGR2W2UxIDRpBWgQSXY6IA==", "q02MpOQh").concat(view.getResources().getResourceName(i10)));
            }
        });
        y2().f690u.setOnInflateListener(new ViewStub.OnInflateListener() { // from class: pdf.pdfreader.viewer.editor.free.feature.scan.ui.c0
            @Override // android.view.ViewStub.OnInflateListener
            public final void onInflate(ViewStub viewStub, View view) {
                ImageAdjustActivity.a aVar = ImageAdjustActivity.f25741u0;
                String p10 = ea.a.p("O2hYc10w", "AWvvwBTB");
                ImageAdjustActivity imageAdjustActivity = ImageAdjustActivity.this;
                kotlin.jvm.internal.g.e(imageAdjustActivity, p10);
                if (view != null) {
                    imageAdjustActivity.L = new q2((LinearLayout) view);
                    imageAdjustActivity.y2().f682m.setVisibility(4);
                    imageAdjustActivity.y2().f682m.setTag(Integer.valueOf(imageAdjustActivity.C2().f23518k));
                    return;
                }
                throw new NullPointerException(ea.a.p("PW9edC9pUnc=", "ePTDrZrI"));
            }
        });
        y2().f673d.setOnInflateListener(new pdf.pdfreader.viewer.editor.free.feature.billing.ui.n(this, 1));
    }

    public final void K2(int i10) {
        if (y2().f695z.e()) {
            y2().f695z.b();
        }
        if (!y2().f695z.e() && i10 >= 0 && i10 < B2().getItemCount()) {
            y2().f695z.setCurrentItem(i10);
        }
    }

    @Override // jl.a
    @SuppressLint({"SetTextI18n"})
    public final void L1() {
        t0.d0(b.b.x(this), null, null, new ImageAdjustActivity$initViewModel$1(this, null), 3);
        t0.d0(b.b.x(this), null, null, new ImageAdjustActivity$initViewModel$2(this, null), 3);
        ImageConvertDataRepository.f26536a.getClass();
        ImageConvertDataRepository.f26552r.e(this, new i(new cg.l<ArrayList<ul.b>, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.scan.ui.ImageAdjustActivity$initViewModel$3

            /* compiled from: ImageAdjustActivity.kt */
            /* loaded from: classes3.dex */
            public /* synthetic */ class a {

                /* renamed from: a  reason: collision with root package name */
                public static final /* synthetic */ int[] f25774a;

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
                    f25774a = iArr;
                }
            }

            {
                super(1);
            }

            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(ArrayList<ul.b> arrayList) {
                invoke2(arrayList);
                return tf.d.f30009a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(final ArrayList<ul.b> arrayList) {
                ul.c cVar;
                if (arrayList == null) {
                    return;
                }
                if (arrayList.isEmpty()) {
                    ImageAdjustActivity imageAdjustActivity = ImageAdjustActivity.this;
                    ImageAdjustActivity.a aVar = ImageAdjustActivity.f25741u0;
                    if (imageAdjustActivity.f27005x == TurnPageMode.AddPages.ordinal()) {
                        gl.k kVar = gl.k.f17927a;
                        ImageAdjustActivity imageAdjustActivity2 = ImageAdjustActivity.this;
                        kVar.getClass();
                        gl.k.b(imageAdjustActivity2);
                        ImageAdjustActivity.this.finish();
                        return;
                    }
                    ImageAdjustActivity.this.s2();
                    return;
                }
                ImageAdjustActivity imageAdjustActivity3 = ImageAdjustActivity.this;
                jn.a.c.getClass();
                int j10 = jn.a.j();
                GroupAiFilterType groupAiFilterType = GroupAiFilterType.RAW;
                if (j10 != 0) {
                    switch (j10) {
                        case 2:
                            groupAiFilterType = GroupAiFilterType.SUPER_DOCS;
                            break;
                        case 3:
                            groupAiFilterType = GroupAiFilterType.CUSTOM2;
                            break;
                        case 4:
                            groupAiFilterType = GroupAiFilterType.SUPER_IMAGE;
                            break;
                        case 5:
                            groupAiFilterType = GroupAiFilterType.BLEND_ALPHA;
                            break;
                        case 6:
                            groupAiFilterType = GroupAiFilterType.CONTRAST;
                            break;
                        case 7:
                            groupAiFilterType = GroupAiFilterType.CUSTOM_BW1;
                            break;
                        case 8:
                            groupAiFilterType = GroupAiFilterType.CUSTOM_BW2;
                            break;
                        case 9:
                            groupAiFilterType = GroupAiFilterType.GRAYSCALE;
                            break;
                        case 10:
                            groupAiFilterType = GroupAiFilterType.REVERSE_COLOR;
                            break;
                    }
                } else {
                    groupAiFilterType = GroupAiFilterType.AUTO;
                }
                final ho.b a10 = go.a.a(imageAdjustActivity3, groupAiFilterType);
                final boolean z10 = ImageAdjustActivity.this.O || jn.a.i() == 1;
                ul.b bVar = (ul.b) kotlin.collections.m.t0(0, ImageAdjustActivity.this.C2().f23515h);
                final ho.b bVar2 = (bVar == null || (cVar = bVar.f30419q) == null) ? null : cVar.c;
                ImageAdjustActivity imageAdjustActivity4 = ImageAdjustActivity.this;
                imageAdjustActivity4.f27004w.postDelayed(imageAdjustActivity4.C, 500L);
                ExecutorService executorService = w0.a().c;
                final ImageAdjustActivity imageAdjustActivity5 = ImageAdjustActivity.this;
                executorService.execute(new Runnable() { // from class: pdf.pdfreader.viewer.editor.free.feature.scan.ui.i0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ho.b bVar3;
                        String p10 = ea.a.p("R2gic1cw", "L5768TEK");
                        final ImageAdjustActivity imageAdjustActivity6 = imageAdjustActivity5;
                        kotlin.jvm.internal.g.e(imageAdjustActivity6, p10);
                        String p11 = ea.a.p("a2RUZhh1W3QbYmk=", "D8bLeuMI");
                        ho.b bVar4 = a10;
                        kotlin.jvm.internal.g.e(bVar4, p11);
                        final ArrayList arrayList2 = arrayList;
                        Iterator it = arrayList2.iterator();
                        while (true) {
                            boolean z11 = true;
                            if (!it.hasNext()) {
                                break;
                            }
                            ul.b bVar5 = (ul.b) it.next();
                            ImageAdjustActivity.a aVar2 = ImageAdjustActivity.f25741u0;
                            int i10 = ImageAdjustActivity$initViewModel$3.a.f25774a[imageAdjustActivity6.C2().j().ordinal()];
                            if (i10 != 1) {
                                if (i10 != 2) {
                                    if (i10 == 3) {
                                        bVar5.f30418p = ImageAdjustType.FILTER;
                                    }
                                } else {
                                    bVar5.f30418p = ImageAdjustType.CROP;
                                }
                            } else {
                                bVar5.f30418p = ImageAdjustType.PREVIEW;
                            }
                            ul.c cVar2 = bVar5.f30419q;
                            if (cVar2.c == null) {
                                cVar2.f30428e = z10;
                                boolean z12 = imageAdjustActivity6.C2().f23514g;
                                ul.c cVar3 = bVar5.f30419q;
                                if (z12 && (bVar3 = bVar2) != null) {
                                    cVar3.c = bVar3.d();
                                } else {
                                    cVar3.c = bVar4.d();
                                }
                            }
                        }
                        final Ref$LongRef ref$LongRef = new Ref$LongRef();
                        ImageAdjustActivity.a aVar3 = ImageAdjustActivity.f25741u0;
                        pdf.pdfreader.viewer.editor.free.feature.scan.dialog.l lVar = imageAdjustActivity6.f27003v;
                        if (((lVar == null || !lVar.isShowing()) ? false : false) && imageAdjustActivity6.B > 0) {
                            long currentTimeMillis = ((long) OS2WindowsMetricsTable.WEIGHT_CLASS_MEDIUM) - (System.currentTimeMillis() - imageAdjustActivity6.B);
                            ref$LongRef.element = currentTimeMillis;
                            if (currentTimeMillis < 0) {
                                ref$LongRef.element = 0L;
                            }
                            imageAdjustActivity6.B = 0L;
                        }
                        imageAdjustActivity6.H.post(new Runnable() { // from class: pdf.pdfreader.viewer.editor.free.feature.scan.ui.j0
                            @Override // java.lang.Runnable
                            public final void run() {
                                String p12 = ea.a.p("PGgxc2sw", "DGHXOA8d");
                                final ImageAdjustActivity imageAdjustActivity7 = ImageAdjustActivity.this;
                                kotlin.jvm.internal.g.e(imageAdjustActivity7, p12);
                                String p13 = ea.a.p("RmRRbCB5IWQ=", "UAb4ADyq");
                                Ref$LongRef ref$LongRef2 = ref$LongRef;
                                kotlin.jvm.internal.g.e(ref$LongRef2, p13);
                                ImageAdjustActivity.a aVar4 = ImageAdjustActivity.f25741u0;
                                imageAdjustActivity7.f27004w.removeCallbacks(imageAdjustActivity7.C);
                                Handler handler = imageAdjustActivity7.H;
                                final ArrayList arrayList3 = arrayList2;
                                handler.postDelayed(new Runnable() { // from class: pdf.pdfreader.viewer.editor.free.feature.scan.ui.k0
                                    /* JADX WARN: Code restructure failed: missing block: B:7:0x001f, code lost:
                                        if (r0.isShowing() == true) goto L7;
                                     */
                                    @Override // java.lang.Runnable
                                    /*
                                        Code decompiled incorrectly, please refer to instructions dump.
                                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                                    */
                                    public final void run() {
                                        /*
                                            r3 = this;
                                            java.lang.String r0 = "I2gMc0Mw"
                                            java.lang.String r1 = "y9WegPCe"
                                            java.lang.String r0 = ea.a.p(r0, r1)
                                            pdf.pdfreader.viewer.editor.free.feature.scan.ui.ImageAdjustActivity r1 = pdf.pdfreader.viewer.editor.free.feature.scan.ui.ImageAdjustActivity.this
                                            kotlin.jvm.internal.g.e(r1, r0)
                                            boolean r0 = pdf.pdfreader.viewer.editor.free.utils.extension.a.c(r1)
                                            if (r0 == 0) goto L44
                                            pdf.pdfreader.viewer.editor.free.feature.scan.ui.ImageAdjustActivity$a r0 = pdf.pdfreader.viewer.editor.free.feature.scan.ui.ImageAdjustActivity.f25741u0
                                            pdf.pdfreader.viewer.editor.free.feature.scan.dialog.l r0 = r1.f27003v
                                            if (r0 == 0) goto L22
                                            boolean r0 = r0.isShowing()
                                            r2 = 1
                                            if (r0 != r2) goto L22
                                            goto L23
                                        L22:
                                            r2 = 0
                                        L23:
                                            if (r2 == 0) goto L2c
                                            pdf.pdfreader.viewer.editor.free.feature.scan.dialog.l r0 = r1.f27003v
                                            if (r0 == 0) goto L2c
                                            r0.dismiss()
                                        L2c:
                                            on.b r0 = r1.C2()
                                            java.util.ArrayList r1 = r2
                                            java.lang.String r2 = "images"
                                            kotlin.jvm.internal.g.e(r1, r2)
                                            java.util.ArrayList r2 = r0.f23515h
                                            r2.clear()
                                            r2.addAll(r1)
                                            androidx.lifecycle.w<java.util.List<ul.b>> r0 = r0.f23516i
                                            r0.j(r2)
                                        L44:
                                            return
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.feature.scan.ui.k0.run():void");
                                    }
                                }, ref$LongRef2.element);
                            }
                        });
                    }
                });
            }
        }));
        C2().f23517j.e(this, new i(new cg.l<List<? extends ul.b>, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.scan.ui.ImageAdjustActivity$initViewModel$4
            {
                super(1);
            }

            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(List<? extends ul.b> list) {
                invoke2(list);
                return tf.d.f30009a;
            }

            /* JADX WARN: Code restructure failed: missing block: B:17:0x00b8, code lost:
                if (r8.this$0.C2().f23518k >= r9.size()) goto L18;
             */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x00cc, code lost:
                if (r2 >= ge.a.A(r9)) goto L18;
             */
            /* JADX WARN: Code restructure failed: missing block: B:23:0x00e0, code lost:
                if (r2 >= ge.a.A(r9)) goto L18;
             */
            /* JADX WARN: Code restructure failed: missing block: B:25:0x00e3, code lost:
                r4 = 0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:26:0x00e4, code lost:
                r0.setVisibility(r4);
                pdf.pdfreader.viewer.editor.free.feature.scan.ui.ImageAdjustActivity.l2(r8.this$0, true);
                r0 = r8.this$0;
                r0.f25749h0 = r0.C2().f23518k;
             */
            /* JADX WARN: Code restructure failed: missing block: B:27:0x0106, code lost:
                if (((mn.b) r8.this$0.C2().f23512e.b()).f22149a != r5) goto L24;
             */
            /* JADX WARN: Code restructure failed: missing block: B:29:0x010c, code lost:
                if (r9.size() <= 1) goto L23;
             */
            /* JADX WARN: Code restructure failed: missing block: B:30:0x010e, code lost:
                r8.this$0.y2().f688s.setVisibility(0);
             */
            /* JADX WARN: Code restructure failed: missing block: B:31:0x011a, code lost:
                r8.this$0.y2().f688s.setVisibility(8);
             */
            /* JADX WARN: Code restructure failed: missing block: B:32:0x0127, code lost:
                r0 = r8.this$0.Y;
                ea.a.p("D20VZwxz", "WsftiTHv");
                r0.getClass();
                r2 = kotlin.collections.m.F0(r9);
                r4 = new java.util.ArrayList();
                r4.addAll(r2);
                r2 = new ul.b();
                r2.f30411i = ea.a.p("PWVBbBhjUkg1bC5lB1YBZXc=", "mQovEtRi");
                r4.add(r2);
                ((androidx.recyclerview.widget.e) r0.f25625f.getValue()).b(r4);
                r0 = r8.this$0.Y;
             */
            /* JADX WARN: Code restructure failed: missing block: B:33:0x0169, code lost:
                if (r0.getItemCount() <= 0) goto L27;
             */
            /* JADX WARN: Code restructure failed: missing block: B:34:0x016b, code lost:
                r0.notifyItemRangeChanged(0, r0.getItemCount());
             */
            /* JADX WARN: Code restructure failed: missing block: B:36:0x017c, code lost:
                if (r8.this$0.f27005x == pdf.pdfreader.viewer.editor.free.feature.scan.ui.state.TurnPageMode.ConvertItemClick.ordinal()) goto L77;
             */
            /* JADX WARN: Code restructure failed: missing block: B:38:0x0188, code lost:
                if (r8.this$0.f27005x != pdf.pdfreader.viewer.editor.free.feature.scan.ui.state.TurnPageMode.AddPages.ordinal()) goto L31;
             */
            /* JADX WARN: Code restructure failed: missing block: B:40:0x018b, code lost:
                r0 = r8.this$0.B2();
             */
            /* JADX WARN: Code restructure failed: missing block: B:41:0x019b, code lost:
                if (r8.this$0.C2().j() != r5) goto L76;
             */
            /* JADX WARN: Code restructure failed: missing block: B:42:0x019d, code lost:
                r2 = true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:43:0x019f, code lost:
                r2 = false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:44:0x01a0, code lost:
                r0.i(r9, r2);
             */
            /* JADX WARN: Code restructure failed: missing block: B:45:0x01a4, code lost:
                r8.this$0.B2().i(r9, false);
             */
            /* JADX WARN: Code restructure failed: missing block: B:46:0x01ad, code lost:
                r0 = r8.this$0;
                r2 = r0.K;
             */
            /* JADX WARN: Code restructure failed: missing block: B:47:0x01b1, code lost:
                if (r2 == null) goto L38;
             */
            /* JADX WARN: Code restructure failed: missing block: B:48:0x01b3, code lost:
                r0.H2(r2);
             */
            /* JADX WARN: Code restructure failed: missing block: B:49:0x01b6, code lost:
                r0 = r8.this$0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:50:0x01c2, code lost:
                if (r0.C2().f23515h.size() <= 1) goto L62;
             */
            /* JADX WARN: Code restructure failed: missing block: B:51:0x01c4, code lost:
                jn.a.c.getClass();
                r2 = jn.a.f19323d;
                r5 = r2[10];
                r6 = jn.a.f19334o;
             */
            /* JADX WARN: Code restructure failed: missing block: B:52:0x01db, code lost:
                if (((java.lang.Boolean) r6.b(r5)).booleanValue() != false) goto L44;
             */
            /* JADX WARN: Code restructure failed: missing block: B:53:0x01dd, code lost:
                r5 = pdf.pdfreader.viewer.editor.free.utils.c.f28558a;
             */
            /* JADX WARN: Code restructure failed: missing block: B:54:0x01ed, code lost:
                if (pdf.pdfreader.viewer.editor.free.utils.c.f28559b.getBoolean(ea.a.p("DWURdTJfB2w_YR9za3M_b09fO20oZ1NfFWQbdSJ0HWccaRdl", "HqisUfB6"), false) != false) goto L44;
             */
            /* JADX WARN: Code restructure failed: missing block: B:57:0x01f3, code lost:
                if (r0.f25748g0 == false) goto L46;
             */
            /* JADX WARN: Code restructure failed: missing block: B:59:0x01f7, code lost:
                r0.f25748g0 = true;
                r6.c(r2[10], java.lang.Boolean.FALSE);
                r0.y2().f695z.post(new pdf.pdfreader.viewer.editor.free.feature.scan.ui.x(r0, 0));
                r1 = r0.y2().f695z;
                kotlin.jvm.internal.g.d(r1, ea.a.p("E2klZF9uCS4-aQN3ZGEwZXI=", "WdqK6nAj"));
             */
            /* JADX WARN: Code restructure failed: missing block: B:60:0x0226, code lost:
                if (pdf.pdfreader.viewer.editor.free.utils.extension.c.j(r0) == false) goto L58;
             */
            /* JADX WARN: Code restructure failed: missing block: B:62:0x0238, code lost:
                if (r0.C2().f23518k < ge.a.A(r0.C2().f23515h)) goto L57;
             */
            /* JADX WARN: Code restructure failed: missing block: B:63:0x023a, code lost:
                r2 = android.animation.ValueAnimator.ofFloat(0.0f, -20.0f, 0.0f, 20.0f, 0.0f).setDuration(2000L);
             */
            /* JADX WARN: Code restructure failed: missing block: B:64:0x0248, code lost:
                r2 = android.animation.ValueAnimator.ofFloat(0.0f, 20.0f, 0.0f, -20.0f, 0.0f).setDuration(2000L);
             */
            /* JADX WARN: Code restructure failed: missing block: B:66:0x0266, code lost:
                if (r0.C2().f23518k < ge.a.A(r0.C2().f23515h)) goto L61;
             */
            /* JADX WARN: Code restructure failed: missing block: B:67:0x0268, code lost:
                r2 = android.animation.ValueAnimator.ofFloat(0.0f, 20.0f, 0.0f, -20.0f, 0.0f).setDuration(2000L);
             */
            /* JADX WARN: Code restructure failed: missing block: B:68:0x0276, code lost:
                r2 = android.animation.ValueAnimator.ofFloat(0.0f, -20.0f, 0.0f, 20.0f, 0.0f).setDuration(2000L);
             */
            /* JADX WARN: Code restructure failed: missing block: B:69:0x0283, code lost:
                r2.addUpdateListener(new k9.b(r0, 3));
                ea.a.p("Lm5YbRh0WHI=", "tDELnKEn");
                r2.addListener(new pdf.pdfreader.viewer.editor.free.feature.scan.ui.d0(r1, r0));
                r1.a();
                r2.start();
             */
            /* JADX WARN: Code restructure failed: missing block: B:70:0x02a2, code lost:
                kotlin.Result.m13constructorimpl(r0.y2().f690u.inflate());
             */
            /* JADX WARN: Code restructure failed: missing block: B:72:0x02b0, code lost:
                r0 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:73:0x02b1, code lost:
                kotlin.Result.m13constructorimpl(androidx.activity.s.v(r0));
             */
            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void invoke2(java.util.List<? extends ul.b> r9) {
                /*
                    Method dump skipped, instructions count: 802
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.feature.scan.ui.ImageAdjustActivity$initViewModel$4.invoke2(java.util.List):void");
            }
        }));
        t0.d0(b.b.x(this), null, null, new ImageAdjustActivity$initViewModel$5(this, null), 3);
        t0.d0(b.b.x(this), null, null, new ImageAdjustActivity$initViewModel$6(this, null), 3);
        t0.d0(b.b.x(this), null, null, new ImageAdjustActivity$initViewModel$7(this, null), 3);
        t0.d0(b.b.x(this), null, null, new ImageAdjustActivity$initViewModel$8(this, null), 3);
    }

    public final void L2(ViewGroup viewGroup, boolean z10, int i10) {
        if (viewGroup == null) {
            return;
        }
        if (z10) {
            viewGroup.setVisibility(0);
        } else {
            viewGroup.setVisibility(8);
        }
    }

    public final void M2() {
        boolean z10;
        int i10;
        View contentView;
        PopupWindow popupWindow = this.f25756o0;
        if (popupWindow != null && popupWindow.isShowing()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            int[] iArr = new int[2];
            p2 p2Var = this.K;
            if (p2Var != null) {
                p2Var.f1307e.getLocationOnScreen(iArr);
                PopupWindow popupWindow2 = this.f25756o0;
                if (popupWindow2 != null) {
                    int i11 = iArr[1];
                    if (popupWindow2 != null && (contentView = popupWindow2.getContentView()) != null) {
                        i10 = contentView.getMeasuredHeight();
                    } else {
                        i10 = 0;
                    }
                    popupWindow2.update(0, getResources().getDimensionPixelSize(R.dimen.dp_46) + (i11 - i10), -2, -2);
                }
            }
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.act.tools.OperatePDFWatcherActivity, jl.a, androidx.fragment.app.u, androidx.activity.ComponentActivity, k0.j, android.app.Activity
    public void onCreate(Bundle bundle) {
        boolean z10;
        boolean z11;
        int i10 = -1;
        boolean z12 = true;
        if (bundle != null) {
            this.f25751j0 = true;
            this.P = bundle.getBoolean(ea.a.p("JnNlaBByU0U0dC9yNnIHcHhvCmU=", "ry8R43Um"), false);
            this.Q = bundle.getInt(ea.a.p("LHVDchxuQ1YzZT1wFGcNUlBzGm83ZQ==", "1dxtADDk"), -1);
        }
        Intent intent = getIntent();
        if (intent != null && intent.hasExtra(ea.a.p("PGVdZRp0fm4-ZXg=", "dK2tyonY"))) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            Intent intent2 = getIntent();
            if (intent2 != null) {
                i10 = intent2.getIntExtra(ea.a.p("RGUJZRp0Am4sZXg=", "Cw7eyKd8"), -1);
            }
            this.R = i10;
        } else if (bundle != null) {
            this.R = bundle.getInt(ea.a.p("PGVdZRp0fm4-ZXg=", "JlJobdC8"), -1);
        }
        Intent intent3 = getIntent();
        if (intent3 == null || !intent3.hasExtra(ea.a.p("WnMNchxtNmgbcmQ=", "V4G5MuQq"))) {
            z12 = false;
        }
        if (z12) {
            Intent intent4 = getIntent();
            if (intent4 != null) {
                z11 = intent4.getBooleanExtra(ea.a.p("InMpch5tHmghcmQ=", "lBKoqJHM"), false);
            } else {
                z11 = false;
            }
            this.O = z11;
        } else if (bundle != null) {
            this.O = bundle.getBoolean(ea.a.p("GnMociBtJWghcmQ=", "ngsnOqe9"), false);
        }
        super.onCreate(bundle);
        tf.c cVar = ScanEventCenter.f28674a;
        tn.a.d(ScanEventCenter.a(), ea.a.p("AWEQZRdhLWo9c3Q=", "XgqwHIN9"), ea.a.p("Q2EsZRJkCHUBdGtzAW93", "8v0umWLJ"), d2(), false);
        AppOpenSource appOpenSource = AppCoreFilterEvent.f28650a;
        AppCoreFilterEvent.a(ea.a.p("XGM5XxptBTICZFJfG2UldSh0bXYvZXc=", "au7V9Rbh"));
        if (i2()) {
            AppCoreFilterEvent.h(ea.a.p("QGMqbkFwPWEWag==", "DZ0WP2iE"));
        } else if (TextUtils.equals(ea.a.p("Jm1WMglkZg==", "PgDxLQKt"), this.f27001t) || TextUtils.equals(ea.a.p("PGhQcmU=", "l4QttLmP"), this.f27001t)) {
            AppCoreFilterEvent.h(ea.a.p("Wm0sMgNfEWgddw==", "x0kq2zLp"));
            AppCoreFilterEvent.h(ea.a.p("HW0NMgVfBWRq", "vhtjudfH"));
        }
        getOnBackPressedDispatcher().a(this, new h());
        no.f.b(this).getClass();
        if (no.f.h(this)) {
            if (TextUtils.equals(getIntent().getStringExtra(ea.a.p("BGEfZWhmPW8lMg==", "YLtx7Ot9")), ea.a.p("Q2EsZSxsA24VdVVnDF81aCtvQWU=", "h9JRXLF5"))) {
                String p10 = ea.a.p("IWVGZhVvdw==", "z84xPUut");
                String p11 = ea.a.p("Q3IudhplFV8dbldyDGEiZRtmW3I1dA==", "N4y3x0do");
                no.f.b(this).getClass();
                tn.a.d(this, p10, p11, no.f.c().concat("_lang"), false);
            } else if (TextUtils.equals(getIntent().getStringExtra(ea.a.p("Q2EsZSxmEG8fMg==", "B0snOG5R")), ea.a.p("OmEIZQtsDG4vdQdnUV8lZVthPmw=", "nIJoTm9R"))) {
                String p12 = ea.a.p("PGUmZiFvdw==", "JmRQMqC3");
                String p13 = ea.a.p("HnJcdh5lMV8nbgVyUWEjZWdmO3I6dA==", "YMn9wFsQ");
                no.f.b(this).getClass();
                tn.a.d(this, p12, p13, no.f.c().concat("_noti"), false);
            }
        }
        EngineHelper engineHelper = EngineHelper.f15726a;
        String p14 = ea.a.p("Jm1QZxwyZ0QcQyVuA2UadHdhAG4gciR8Bm0XZ1MyNkQJQ15uD2VFdBhhJG4QckI=", "KkIcov6f");
        engineHelper.getClass();
        EngineHelper.h(p14, this.f25742a0);
        if (!this.A) {
            gl.k kVar = gl.k.f17927a;
            ea.a.p("Bm1QZxxBU2ovcz5BFnQBdlx0FyAqbiZyJ2EMZVZsW2Fk", "ofUiBxv4");
            kVar.getClass();
            ea.a.p("em0qZxYyMkQ0Q1tuH2UkdAZhXG4jcg==", "JWRUSUMZ");
            LinearLayout linearLayout = y2().c;
            kotlin.jvm.internal.g.d(linearLayout, ea.a.p("FmkUZBNuJC4qbxJ0W20VYVZuN3IFYU9vAXQ=", "qZtzzCUA"));
            gl.k.d(this, linearLayout);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000c, code lost:
        if (r0.isRunning() == true) goto L5;
     */
    @Override // pdf.pdfreader.viewer.editor.free.ui.act.tools.OperatePDFWatcherActivity, jl.a, androidx.appcompat.app.c, androidx.fragment.app.u, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onDestroy() {
        /*
            r3 = this;
            super.onDestroy()
            android.animation.ObjectAnimator r0 = r3.f25757p0
            if (r0 == 0) goto Lf
            boolean r0 = r0.isRunning()
            r1 = 1
            if (r0 != r1) goto Lf
            goto L10
        Lf:
            r1 = 0
        L10:
            if (r1 == 0) goto L19
            android.animation.ObjectAnimator r0 = r3.f25757p0
            if (r0 == 0) goto L19
            r0.cancel()
        L19:
            r3.w2()
            android.os.Handler r0 = r3.H
            b7.g r1 = r3.f25758q0
            r0.removeCallbacks(r1)
            gl.k r0 = gl.k.f17927a
            java.lang.String r1 = "em0qZxZBBmoHc0BBCnQ_di10SyApbgdlQXQLbyMgF2Vebz1lU2wLcwZlWmVy"
            java.lang.String r2 = "2yZeamJc"
            ea.a.p(r1, r2)
            r0.getClass()
            java.lang.String r0 = "em0qZxYyMkQ0Q1tuH2UkdAZhXG4jcg=="
            java.lang.String r1 = "JWRUSUMZ"
            ea.a.p(r0, r1)
            com.lib.flutter.encrypt.EngineHelper r0 = com.lib.flutter.encrypt.EngineHelper.f15726a
            r0.getClass()
            pdf.pdfreader.viewer.editor.free.feature.scan.ui.ImageAdjustActivity$c r0 = r3.f25742a0
            com.lib.flutter.encrypt.EngineHelper.e(r0)
            am.a r0 = r3.y2()
            androidx.constraintlayout.widget.ConstraintLayout r0 = r0.f671a
            android.animation.LayoutTransition r0 = r0.getLayoutTransition()
            if (r0 == 0) goto L51
            pdf.pdfreader.viewer.editor.free.feature.scan.ui.ImageAdjustActivity$g r1 = r3.f25752k0
            r0.removeTransitionListener(r1)
        L51:
            java.util.HashSet<java.lang.String> r0 = pdf.pdfreader.viewer.editor.free.utils.event.ScanEventCenter.f28675b
            r0.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.feature.scan.ui.ImageAdjustActivity.onDestroy():void");
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        boolean z10 = false;
        if (intent != null && intent.getBooleanExtra(ea.a.p("WnMZZQdhCWU=", "nqol3Smk"), false)) {
            z10 = true;
        }
        if (z10) {
            int currentItem = y2().f695z.getCurrentItem();
            if (currentItem >= 0 && currentItem < B2().getItemCount()) {
                B2().notifyItemChanged(currentItem);
            }
            if (currentItem >= 0) {
                ThumbAdapter thumbAdapter = this.Y;
                if (currentItem < thumbAdapter.getItemCount()) {
                    thumbAdapter.h(currentItem).f30416n = null;
                    thumbAdapter.notifyItemChanged(currentItem);
                }
            }
            E2();
        }
    }

    @Override // jl.a, androidx.fragment.app.u, android.app.Activity
    public final void onPause() {
        super.onPause();
        gl.k.f17927a.getClass();
        gl.l.f17929o.l();
        gl.m.f17930o.l();
    }

    @Override // jl.a, androidx.fragment.app.u, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.f25755n0) {
            this.f25755n0 = false;
            this.H.postDelayed(new k(this, 1), 10L);
            return;
        }
        if (this.f25750i0) {
            this.f25750i0 = false;
            if (BillingConfigImpl.c.w()) {
                D2();
            }
        }
        gl.k kVar = gl.k.f17927a;
        LinearLayout linearLayout = y2().c;
        kVar.getClass();
        gl.k.a(this, linearLayout, this.f25742a0);
        gl.l.f17929o.m();
        gl.m.f17930o.m();
    }

    @Override // jl.a, androidx.activity.ComponentActivity, k0.j, android.app.Activity
    public final void onSaveInstanceState(Bundle outState) {
        kotlin.jvm.internal.g.e(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putBoolean(ea.a.p("JnNlaBByU0U0dC9yNnIHcHhvCmU=", "XKW3BobT"), this.P);
        outState.putInt(ea.a.p("LHVDchxuQ1YzZT1wFGcNUlBzGm83ZQ==", "UsCEglVh"), y2().f695z.getCurrentItem());
    }

    @Override // jl.a, androidx.appcompat.app.c, androidx.fragment.app.u, android.app.Activity
    public final void onStart() {
        super.onStart();
        this.f25745d0 = false;
        if (this.f25746e0) {
            this.f25746e0 = false;
            OptTaskWrapper optTaskWrapper = this.f25744c0;
            if (optTaskWrapper != null) {
                optTaskWrapper.b(100, 100);
            }
            F2(this.f25747f0);
        }
    }

    @Override // jl.a, androidx.appcompat.app.c, androidx.fragment.app.u, android.app.Activity
    public final void onStop() {
        super.onStop();
        this.f25745d0 = true;
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void r2(ImageAdjustFiltersAdapter imageAdjustFiltersAdapter, ho.b bVar, p2 p2Var) {
        int i10;
        tn.a.b(ScanEventCenter.a(), ea.a.p("VWkndBZy", "y175Cr7x"), ea.a.p("VWkndBZyPWECcFh5NmM6aSdr", "Se0QjkZ4"));
        on.b C2 = C2();
        if (C2.f23513f == null) {
            C2.f23513f = Boolean.valueOf(C2.f23514g);
        }
        C2.f23514g = !C2.f23514g;
        boolean z10 = C2().f23514g;
        AppCompatImageView appCompatImageView = p2Var.f1307e;
        if (z10) {
            appCompatImageView.setImageResource(R.drawable.ic_home_selected);
            C2().d(bVar);
            B2().notifyItemRangeChanged(0, B2().getItemCount(), ImageAdjustPayload.FILTER);
            ImageAdjustFiltersAdapter imageAdjustFiltersAdapter2 = this.f25743b0;
            if (imageAdjustFiltersAdapter2 != null) {
                i10 = imageAdjustFiltersAdapter2.getItemCount();
            } else {
                i10 = 0;
            }
            imageAdjustFiltersAdapter.notifyItemRangeChanged(0, i10, (ArrayList) this.N.getValue());
            return;
        }
        appCompatImageView.setImageResource(R.drawable.ic_home_unselected_gray);
    }

    public final void s2() {
        gl.k.f17927a.getClass();
        gl.k.b(this);
        if (!h2()) {
            Intent intent = new Intent(this, ReaderHomeActivity.class);
            intent.putExtra(ea.a.p("HGUdXy1lQF8hbhJlWnQIZFdfPG89aF9uZw==", "PDwdC723"), true);
            startActivity(intent);
        }
        finish();
        ImageConvertDataRepository.f26536a.getClass();
        ImageConvertDataRepository.f();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
        if (r0.f30428e == true) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void t2(am.o2 r4) {
        /*
            r3 = this;
            androidx.constraintlayout.widget.ConstraintLayout r0 = r4.f1258a
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L39
            on.b r0 = r3.C2()
            ul.c r0 = r0.k()
            if (r0 == 0) goto L18
            boolean r0 = r0.f30428e
            r1 = 1
            if (r0 != r1) goto L18
            goto L19
        L18:
            r1 = 0
        L19:
            if (r1 != 0) goto L1f
            r0 = 2131231754(0x7f08040a, float:1.8079598E38)
            goto L22
        L1f:
            r0 = 2131231543(0x7f080337, float:1.807917E38)
        L22:
            androidx.appcompat.widget.AppCompatImageView r2 = r4.c
            r2.setImageResource(r0)
            if (r1 != 0) goto L2d
            r0 = 2131951744(0x7f130080, float:1.9539911E38)
            goto L30
        L2d:
            r0 = 2131952322(0x7f1302c2, float:1.9541083E38)
        L30:
            java.lang.String r0 = r3.getString(r0)
            android.widget.TextView r4 = r4.f1260d
            r4.setText(r0)
        L39:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.feature.scan.ui.ImageAdjustActivity.t2(am.o2):void");
    }

    public final void u2(boolean z10) {
        RecyclerView recyclerView;
        View view;
        RecyclerView.m layoutManager;
        View C;
        RecyclerView.m layoutManager2;
        View C2;
        Bitmap bitmap;
        View view2;
        View C3;
        Bitmap bitmap2;
        View C4;
        RecyclerView.m layoutManager3;
        View C5;
        RecyclerView.m layoutManager4;
        View C6;
        CropImageView cropImageView;
        View view3;
        RecyclerView.m layoutManager5;
        View C7;
        RecyclerView.m layoutManager6;
        View C8;
        CropImageView cropImageView2;
        try {
            View childAt = y2().f695z.getChildAt(0);
            View view4 = null;
            if (childAt instanceof RecyclerView) {
                recyclerView = (RecyclerView) childAt;
            } else {
                recyclerView = null;
            }
            if (z10) {
                if (recyclerView != null && (layoutManager6 = recyclerView.getLayoutManager()) != null && (C8 = layoutManager6.C(0)) != null && (cropImageView2 = (CropImageView) C8.findViewById(R.id.preview_iv)) != null) {
                    bitmap = cropImageView2.getBitmap();
                } else {
                    bitmap = null;
                }
                if (bitmap == null) {
                    if (recyclerView != null && (layoutManager5 = recyclerView.getLayoutManager()) != null && (C7 = layoutManager5.C(0)) != null) {
                        view3 = C7.findViewById(R.id.place_holder_iv);
                    } else {
                        view3 = null;
                    }
                    if (view3 != null) {
                        view3.setVisibility(0);
                    }
                } else {
                    RecyclerView.m layoutManager7 = recyclerView.getLayoutManager();
                    if (layoutManager7 != null && (C3 = layoutManager7.C(0)) != null) {
                        view2 = C3.findViewById(R.id.place_holder_iv);
                    } else {
                        view2 = null;
                    }
                    if (view2 != null) {
                        view2.setVisibility(8);
                    }
                }
                if (recyclerView != null && (layoutManager4 = recyclerView.getLayoutManager()) != null && (C6 = layoutManager4.C(1)) != null && (cropImageView = (CropImageView) C6.findViewById(R.id.preview_iv)) != null) {
                    bitmap2 = cropImageView.getBitmap();
                } else {
                    bitmap2 = null;
                }
                if (bitmap2 == null) {
                    if (recyclerView != null && (layoutManager3 = recyclerView.getLayoutManager()) != null && (C5 = layoutManager3.C(1)) != null) {
                        view4 = C5.findViewById(R.id.place_holder_iv);
                    }
                    if (view4 != null) {
                        view4.setVisibility(0);
                        return;
                    }
                    return;
                }
                RecyclerView.m layoutManager8 = recyclerView.getLayoutManager();
                if (layoutManager8 != null && (C4 = layoutManager8.C(1)) != null) {
                    view4 = C4.findViewById(R.id.place_holder_iv);
                }
                if (view4 != null) {
                    view4.setVisibility(8);
                    return;
                }
                return;
            }
            if (recyclerView != null && (layoutManager2 = recyclerView.getLayoutManager()) != null && (C2 = layoutManager2.C(0)) != null) {
                view = C2.findViewById(R.id.place_holder_iv);
            } else {
                view = null;
            }
            if (view != null) {
                view.setVisibility(8);
            }
            if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null && (C = layoutManager.C(1)) != null) {
                view4 = C.findViewById(R.id.place_holder_iv);
            }
            if (view4 != null) {
                view4.setVisibility(8);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0009, code lost:
        if (r0.isShowing() == true) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void w2() {
        /*
            r2 = this;
            android.widget.PopupWindow r0 = r2.f25756o0
            if (r0 == 0) goto Lc
            boolean r0 = r0.isShowing()
            r1 = 1
            if (r0 != r1) goto Lc
            goto Ld
        Lc:
            r1 = 0
        Ld:
            if (r1 == 0) goto L1d
            android.os.Handler r0 = r2.H
            b7.g r1 = r2.f25758q0
            r0.removeCallbacks(r1)
            android.widget.PopupWindow r0 = r2.f25756o0
            if (r0 == 0) goto L1d
            r0.dismiss()
        L1d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.feature.scan.ui.ImageAdjustActivity.w2():void");
    }

    public final am.a y2() {
        return (am.a) this.I.getValue();
    }

    public final String z2(OcrUploadResult ocrUploadResult) {
        int i10 = b.f25763b[ocrUploadResult.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                return ea.a.p("emQubgdp", "5LWRvqhx");
            }
            return ea.a.p("K2VCdxxyaw==", "qqE6sXrQ");
        }
        return ea.a.p("Q3A-bw5k", "V36RoQ7s");
    }

    /* compiled from: ImageAdjustActivity.kt */
    /* loaded from: classes3.dex */
    public static final class d implements pdf.pdfreader.viewer.editor.free.feature.ocr.helper.i {
        public d() {
        }

        @Override // pdf.pdfreader.viewer.editor.free.feature.ocr.helper.i
        public final void show() {
            tf.d dVar;
            ImageAdjustActivity imageAdjustActivity = ImageAdjustActivity.this;
            OCRLoadingDialog oCRLoadingDialog = imageAdjustActivity.U;
            if (oCRLoadingDialog != null) {
                oCRLoadingDialog.show();
                dVar = tf.d.f30009a;
            } else {
                dVar = null;
            }
            if (dVar == null) {
                OCRLoadingDialog oCRLoadingDialog2 = new OCRLoadingDialog(imageAdjustActivity);
                imageAdjustActivity.U = oCRLoadingDialog2;
                oCRLoadingDialog2.show();
            }
        }

        @Override // pdf.pdfreader.viewer.editor.free.feature.ocr.helper.i
        public final void cancel() {
        }
    }

    @Override // jl.a
    public final void C1() {
    }
}

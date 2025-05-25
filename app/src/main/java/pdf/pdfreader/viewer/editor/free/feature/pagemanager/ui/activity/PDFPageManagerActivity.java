package pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity;

import am.p1;
import am.u2;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.g0;
import androidx.lifecycle.m0;
import androidx.recyclerview.widget.RecyclerView;
import bm.c;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;
import eightbitlab.com.blurview.BlurView;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Ref$IntRef;
import lib.zj.pdfeditor.PDFListener;
import lib.zj.pdfeditor.ReaderPDFCore;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.data.FileRepository;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.feature.billing.BillingConfigImpl;
import pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity;
import pdf.pdfreader.viewer.editor.free.feature.pagemanager.data.PageRGBColor;
import pdf.pdfreader.viewer.editor.free.feature.pagemanager.data.PageSize;
import pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.PDFPageManagerActivity;
import pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.dialog.ChooseInsertTypeDialog;
import pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.dialog.PageManagerDeleteConfirmDialog;
import pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.fragment.d;
import pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.widget.FastScrollRecyclerView;
import pdf.pdfreader.viewer.editor.free.observer.StorageFileObserver;
import pdf.pdfreader.viewer.editor.free.repo.convert.ImageConvertDataRepository;
import pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImg2PDFChooseActivity;
import pdf.pdfreader.viewer.editor.free.ui.dialog.OperateInterceptDialog;
import pdf.pdfreader.viewer.editor.free.ui.dialog.OperatePdfFailedDialog;
import pdf.pdfreader.viewer.editor.free.ui.dialog.x2;
import pdf.pdfreader.viewer.editor.free.ui.myview.InterceptTouchFrameLayout;
import pdf.pdfreader.viewer.editor.free.ui.widget.ProgressView;
import pdf.pdfreader.viewer.editor.free.utils.drag.DragSelectionProcessor;
import pdf.pdfreader.viewer.editor.free.utils.e1;
import pdf.pdfreader.viewer.editor.free.utils.event.AppCoreFilterEvent;
import pdf.pdfreader.viewer.editor.free.utils.event.AppOpenSource;
import pdf.pdfreader.viewer.editor.free.utils.f0;
import pdf.pdfreader.viewer.editor.free.utils.j1;
import pdf.pdfreader.viewer.editor.free.utils.k0;
import pdf.pdfreader.viewer.editor.free.utils.w0;
import qb.j0;
import qb.t0;

/* compiled from: PDFPageManagerActivity.kt */
/* loaded from: classes3.dex */
public final class PDFPageManagerActivity extends f implements PDFListener {
    public ValueAnimator A0;
    public int B0;
    public int C0;
    public ObjectAnimator D0;
    public final LinkedHashSet E0;
    public long F0;
    public OperateInterceptDialog G0;
    public pdf.pdfreader.viewer.editor.free.utils.drag.a I;
    public boolean K;
    public Parcelable N;
    public boolean O;
    public int P;
    public PdfPreviewEntity Q;
    public boolean R;
    public boolean S;
    public x2 T;
    public boolean U;
    public boolean V;

    /* renamed from: c0  reason: collision with root package name */
    public File f25264c0;

    /* renamed from: d0  reason: collision with root package name */
    public PdfPreviewEntity f25265d0;

    /* renamed from: f0  reason: collision with root package name */
    public boolean f25267f0;

    /* renamed from: g0  reason: collision with root package name */
    public OperatePdfFailedDialog f25268g0;

    /* renamed from: i0  reason: collision with root package name */
    public final PDFPageManagerActivity$handler$1 f25270i0;

    /* renamed from: j0  reason: collision with root package name */
    public final tf.c f25271j0;

    /* renamed from: k0  reason: collision with root package name */
    public final androidx.activity.result.c<Intent> f25272k0;

    /* renamed from: l0  reason: collision with root package name */
    public long f25273l0;

    /* renamed from: m0  reason: collision with root package name */
    public final r f25274m0;

    /* renamed from: n0  reason: collision with root package name */
    public f0 f25275n0;

    /* renamed from: o0  reason: collision with root package name */
    public ArrayList f25276o0;

    /* renamed from: p0  reason: collision with root package name */
    public boolean f25277p0;

    /* renamed from: q0  reason: collision with root package name */
    public boolean f25278q0;

    /* renamed from: r0  reason: collision with root package name */
    public boolean f25279r0;

    /* renamed from: s0  reason: collision with root package name */
    public volatile boolean f25280s0;

    /* renamed from: t0  reason: collision with root package name */
    public volatile long f25281t0;

    /* renamed from: u0  reason: collision with root package name */
    public PopupWindow f25282u0;

    /* renamed from: v0  reason: collision with root package name */
    public ObjectAnimator f25283v0;

    /* renamed from: w0  reason: collision with root package name */
    public boolean f25284w0;

    /* renamed from: x0  reason: collision with root package name */
    public boolean f25285x0;

    /* renamed from: y0  reason: collision with root package name */
    public int f25286y0;

    /* renamed from: z0  reason: collision with root package name */
    public ValueAnimator f25287z0;
    public static final String I0 = ea.a.p("LHVDchxuQ18qYS1l", "18obBIuP");
    public static final String J0 = ea.a.p("P2RXXxxuQ2kueQ==", "W6gg8rbJ");
    public static final a H0 = new a();
    public final String G = ea.a.p("I0QrUAtnHU0pbgdnUXIWY0xpJGk9eQ==", "66smjxoq");
    public final tf.c H = kotlin.a.a(new cg.a<am.p>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.PDFPageManagerActivity$binding$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final am.p invoke() {
            View inflate = PDFPageManagerActivity.this.getLayoutInflater().inflate(R.layout.activity_pdf_page_manager, (ViewGroup) null, false);
            int i10 = R.id.barrier;
            if (((Barrier) com.google.android.play.core.assetpacks.c.u(inflate, R.id.barrier)) != null) {
                i10 = R.id.barrier_save;
                if (((Barrier) com.google.android.play.core.assetpacks.c.u(inflate, R.id.barrier_save)) != null) {
                    i10 = R.id.check_all;
                    CheckBox checkBox = (CheckBox) com.google.android.play.core.assetpacks.c.u(inflate, R.id.check_all);
                    if (checkBox != null) {
                        i10 = R.id.con_bottom;
                        if (((ConstraintLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.con_bottom)) != null) {
                            i10 = R.id.con_select;
                            ConstraintLayout constraintLayout = (ConstraintLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.con_select);
                            if (constraintLayout != null) {
                                i10 = R.id.insert_progressbar;
                                View u7 = com.google.android.play.core.assetpacks.c.u(inflate, R.id.insert_progressbar);
                                if (u7 != null) {
                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) u7;
                                    if (((LinearLayout) com.google.android.play.core.assetpacks.c.u(u7, R.id.ll_operate_container)) != null) {
                                        u2 u2Var = new u2(constraintLayout2, constraintLayout2);
                                        i10 = R.id.iv_back;
                                        AppCompatImageView appCompatImageView = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.iv_back);
                                        if (appCompatImageView != null) {
                                            i10 = R.id.iv_delete;
                                            AppCompatImageView appCompatImageView2 = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.iv_delete);
                                            if (appCompatImageView2 != null) {
                                                i10 = R.id.iv_extract;
                                                AppCompatImageView appCompatImageView3 = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.iv_extract);
                                                if (appCompatImageView3 != null) {
                                                    i10 = R.id.iv_insert;
                                                    if (((AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.iv_insert)) != null) {
                                                        i10 = R.id.iv_page_setup;
                                                        AppCompatImageView appCompatImageView4 = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.iv_page_setup);
                                                        if (appCompatImageView4 != null) {
                                                            i10 = R.id.iv_redo;
                                                            AppCompatImageView appCompatImageView5 = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.iv_redo);
                                                            if (appCompatImageView5 != null) {
                                                                i10 = R.id.iv_rotate;
                                                                AppCompatImageView appCompatImageView6 = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.iv_rotate);
                                                                if (appCompatImageView6 != null) {
                                                                    i10 = R.id.iv_save_icon;
                                                                    AppCompatImageView appCompatImageView7 = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.iv_save_icon);
                                                                    if (appCompatImageView7 != null) {
                                                                        i10 = R.id.iv_undo;
                                                                        AppCompatImageView appCompatImageView8 = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.iv_undo);
                                                                        if (appCompatImageView8 != null) {
                                                                            i10 = R.id.layout_all;
                                                                            LinearLayout linearLayout = (LinearLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.layout_all);
                                                                            if (linearLayout != null) {
                                                                                i10 = R.id.lyLoading;
                                                                                LinearLayout linearLayout2 = (LinearLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.lyLoading);
                                                                                if (linearLayout2 != null) {
                                                                                    i10 = R.id.overlay;
                                                                                    View u10 = com.google.android.play.core.assetpacks.c.u(inflate, R.id.overlay);
                                                                                    if (u10 != null) {
                                                                                        i10 = R.id.page_manager_blur_extract_success_bg;
                                                                                        BlurView blurView = (BlurView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.page_manager_blur_extract_success_bg);
                                                                                        if (blurView != null) {
                                                                                            i10 = R.id.page_manager_cl_extract_success_root;
                                                                                            ConstraintLayout constraintLayout3 = (ConstraintLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.page_manager_cl_extract_success_root);
                                                                                            if (constraintLayout3 != null) {
                                                                                                i10 = R.id.page_manager_fl_page_setting;
                                                                                                FrameLayout frameLayout = (FrameLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.page_manager_fl_page_setting);
                                                                                                if (frameLayout != null) {
                                                                                                    i10 = R.id.page_manager_iv_extract_success_close;
                                                                                                    AppCompatImageView appCompatImageView9 = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.page_manager_iv_extract_success_close);
                                                                                                    if (appCompatImageView9 != null) {
                                                                                                        i10 = R.id.page_manager_lottie_extract_loading;
                                                                                                        LottieAnimationView lottieAnimationView = (LottieAnimationView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.page_manager_lottie_extract_loading);
                                                                                                        if (lottieAnimationView != null) {
                                                                                                            i10 = R.id.page_manager_tv_extract_success_content;
                                                                                                            AppCompatTextView appCompatTextView = (AppCompatTextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.page_manager_tv_extract_success_content);
                                                                                                            if (appCompatTextView != null) {
                                                                                                                i10 = R.id.page_manager_tv_extract_success_share;
                                                                                                                AppCompatTextView appCompatTextView2 = (AppCompatTextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.page_manager_tv_extract_success_share);
                                                                                                                if (appCompatTextView2 != null) {
                                                                                                                    i10 = R.id.page_manager_tv_extract_success_title;
                                                                                                                    if (((AppCompatTextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.page_manager_tv_extract_success_title)) != null) {
                                                                                                                        i10 = R.id.page_manager_tv_extract_success_view;
                                                                                                                        AppCompatTextView appCompatTextView3 = (AppCompatTextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.page_manager_tv_extract_success_view);
                                                                                                                        if (appCompatTextView3 != null) {
                                                                                                                            i10 = R.id.pdf_manager_fl_rv_container;
                                                                                                                            if (((InterceptTouchFrameLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.pdf_manager_fl_rv_container)) != null) {
                                                                                                                                i10 = R.id.pdf_manager_rv;
                                                                                                                                FastScrollRecyclerView fastScrollRecyclerView = (FastScrollRecyclerView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.pdf_manager_rv);
                                                                                                                                if (fastScrollRecyclerView != null) {
                                                                                                                                    i10 = R.id.progressView;
                                                                                                                                    if (((ProgressView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.progressView)) != null) {
                                                                                                                                        i10 = R.id.rl_save;
                                                                                                                                        RelativeLayout relativeLayout = (RelativeLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.rl_save);
                                                                                                                                        if (relativeLayout != null) {
                                                                                                                                            ConstraintLayout constraintLayout4 = (ConstraintLayout) inflate;
                                                                                                                                            i10 = R.id.save_anim;
                                                                                                                                            ProgressView progressView = (ProgressView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.save_anim);
                                                                                                                                            if (progressView != null) {
                                                                                                                                                i10 = R.id.save_iv_vip;
                                                                                                                                                AppCompatImageView appCompatImageView10 = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.save_iv_vip);
                                                                                                                                                if (appCompatImageView10 != null) {
                                                                                                                                                    i10 = R.id.tipsLl;
                                                                                                                                                    View u11 = com.google.android.play.core.assetpacks.c.u(inflate, R.id.tipsLl);
                                                                                                                                                    if (u11 != null) {
                                                                                                                                                        int i11 = R.id.tipsCloseIv;
                                                                                                                                                        AppCompatImageView appCompatImageView11 = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(u11, R.id.tipsCloseIv);
                                                                                                                                                        if (appCompatImageView11 != null) {
                                                                                                                                                            LinearLayout linearLayout3 = (LinearLayout) u11;
                                                                                                                                                            AppCompatTextView appCompatTextView4 = (AppCompatTextView) com.google.android.play.core.assetpacks.c.u(u11, R.id.tipsTv);
                                                                                                                                                            if (appCompatTextView4 != null) {
                                                                                                                                                                p1 p1Var = new p1(linearLayout3, appCompatImageView11, linearLayout3, appCompatTextView4);
                                                                                                                                                                i10 = R.id.title_bar;
                                                                                                                                                                if (((ConstraintLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.title_bar)) != null) {
                                                                                                                                                                    i10 = R.id.top_select_all;
                                                                                                                                                                    if (((TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.top_select_all)) != null) {
                                                                                                                                                                        i10 = R.id.tv_delete;
                                                                                                                                                                        AppCompatTextView appCompatTextView5 = (AppCompatTextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_delete);
                                                                                                                                                                        if (appCompatTextView5 != null) {
                                                                                                                                                                            i10 = R.id.tv_extract;
                                                                                                                                                                            AppCompatTextView appCompatTextView6 = (AppCompatTextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_extract);
                                                                                                                                                                            if (appCompatTextView6 != null) {
                                                                                                                                                                                i10 = R.id.tv_insert;
                                                                                                                                                                                if (((AppCompatTextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_insert)) != null) {
                                                                                                                                                                                    i10 = R.id.tv_page_setup;
                                                                                                                                                                                    AppCompatTextView appCompatTextView7 = (AppCompatTextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_page_setup);
                                                                                                                                                                                    if (appCompatTextView7 != null) {
                                                                                                                                                                                        i10 = R.id.tv_pages;
                                                                                                                                                                                        TextView textView = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_pages);
                                                                                                                                                                                        if (textView != null) {
                                                                                                                                                                                            i10 = R.id.tv_rotate;
                                                                                                                                                                                            AppCompatTextView appCompatTextView8 = (AppCompatTextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_rotate);
                                                                                                                                                                                            if (appCompatTextView8 != null) {
                                                                                                                                                                                                i10 = R.id.tv_select;
                                                                                                                                                                                                TextView textView2 = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_select);
                                                                                                                                                                                                if (textView2 != null) {
                                                                                                                                                                                                    i10 = R.id.tv_select_num;
                                                                                                                                                                                                    TextView textView3 = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_select_num);
                                                                                                                                                                                                    if (textView3 != null) {
                                                                                                                                                                                                        i10 = R.id.viewBottomOverlayLine;
                                                                                                                                                                                                        View u12 = com.google.android.play.core.assetpacks.c.u(inflate, R.id.viewBottomOverlayLine);
                                                                                                                                                                                                        if (u12 != null) {
                                                                                                                                                                                                            i10 = R.id.viewDelete;
                                                                                                                                                                                                            View u13 = com.google.android.play.core.assetpacks.c.u(inflate, R.id.viewDelete);
                                                                                                                                                                                                            if (u13 != null) {
                                                                                                                                                                                                                i10 = R.id.viewExtract;
                                                                                                                                                                                                                View u14 = com.google.android.play.core.assetpacks.c.u(inflate, R.id.viewExtract);
                                                                                                                                                                                                                if (u14 != null) {
                                                                                                                                                                                                                    i10 = R.id.viewInsert;
                                                                                                                                                                                                                    View u15 = com.google.android.play.core.assetpacks.c.u(inflate, R.id.viewInsert);
                                                                                                                                                                                                                    if (u15 != null) {
                                                                                                                                                                                                                        i10 = R.id.viewPageSetup;
                                                                                                                                                                                                                        View u16 = com.google.android.play.core.assetpacks.c.u(inflate, R.id.viewPageSetup);
                                                                                                                                                                                                                        if (u16 != null) {
                                                                                                                                                                                                                            i10 = R.id.viewRotate;
                                                                                                                                                                                                                            View u17 = com.google.android.play.core.assetpacks.c.u(inflate, R.id.viewRotate);
                                                                                                                                                                                                                            if (u17 != null) {
                                                                                                                                                                                                                                i10 = R.id.view_status_bar;
                                                                                                                                                                                                                                View u18 = com.google.android.play.core.assetpacks.c.u(inflate, R.id.view_status_bar);
                                                                                                                                                                                                                                if (u18 != null) {
                                                                                                                                                                                                                                    return new am.p(constraintLayout4, checkBox, constraintLayout, u2Var, appCompatImageView, appCompatImageView2, appCompatImageView3, appCompatImageView4, appCompatImageView5, appCompatImageView6, appCompatImageView7, appCompatImageView8, linearLayout, linearLayout2, u10, blurView, constraintLayout3, frameLayout, appCompatImageView9, lottieAnimationView, appCompatTextView, appCompatTextView2, appCompatTextView3, fastScrollRecyclerView, relativeLayout, constraintLayout4, progressView, appCompatImageView10, p1Var, appCompatTextView5, appCompatTextView6, appCompatTextView7, textView, appCompatTextView8, textView2, textView3, u12, u13, u14, u15, u16, u17, u18);
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
                                                                                                                                                            } else {
                                                                                                                                                                i11 = R.id.tipsTv;
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        throw new NullPointerException(ea.a.p("Cmk_cyFuLyA6ZRd1XXIyZBh2O2U-IEFpAGhRSRU6IA==", "pEGLHHbd").concat(u11.getResources().getResourceName(i11)));
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
                                    } else {
                                        throw new NullPointerException(ea.a.p("AmlCcxBuUCAoZTt1HHINZBV2B2UyIBJpA2h3SQk6IA==", "gw2hwWMl").concat(u7.getResources().getResourceName(R.id.ll_operate_container)));
                                    }
                                }
                            }
                        }
                    }
                }
            }
            throw new NullPointerException(ea.a.p("IGkFcyVuNyA6ZRd1XXIyZBh2O2U-IEFpAGhRSRU6IA==", "49mvLPbj").concat(inflate.getResources().getResourceName(i10)));
        }
    });
    public final tf.c J = kotlin.a.a(new cg.a<an.b>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.PDFPageManagerActivity$viewModel$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final an.b invoke() {
            return (an.b) new m0(PDFPageManagerActivity.this).a(an.b.class);
        }
    });
    public final tf.c L = kotlin.a.a(new cg.a<ArrayList<String>>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.PDFPageManagerActivity$payloads$2
        @Override // cg.a
        public final ArrayList<String> invoke() {
            return ge.a.j("");
        }
    });
    public final ArrayList<bn.a> M = new ArrayList<>();
    public final int W = 200;
    public final int X = OS2WindowsMetricsTable.WEIGHT_CLASS_MEDIUM;
    public final int Y = 204;
    public final int Z = PglCryptUtils.LOAD_SO_FAILED;

    /* renamed from: a0  reason: collision with root package name */
    public final int f25262a0 = PglCryptUtils.INPUT_INVALID;

    /* renamed from: b0  reason: collision with root package name */
    public final int f25263b0 = PglCryptUtils.COMPRESS_FAILED;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f25266e0 = true;

    /* renamed from: h0  reason: collision with root package name */
    public final ThreadPoolExecutor f25269h0 = new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new ThreadPoolExecutor.CallerRunsPolicy());

    /* compiled from: PDFPageManagerActivity.kt */
    /* loaded from: classes3.dex */
    public static final class a {
    }

    /* compiled from: Comparisons.kt */
    /* loaded from: classes3.dex */
    public static final class c<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t4, T t10) {
            return com.google.android.play.core.assetpacks.c.o(Integer.valueOf(((bn.a) t4).f5491e), Integer.valueOf(((bn.a) t10).f5491e));
        }
    }

    /* compiled from: PDFPageManagerActivity.kt */
    /* loaded from: classes3.dex */
    public static final class d implements DragSelectionProcessor.b {
        public d() {
        }

        @Override // pdf.pdfreader.viewer.editor.free.utils.drag.DragSelectionProcessor.b
        public final void a(int i10, int i11, boolean z10, boolean z11) {
            boolean z12;
            boolean z13;
            boolean z14;
            PDFPageManagerActivity pDFPageManagerActivity = PDFPageManagerActivity.this;
            if (!pDFPageManagerActivity.R) {
                return;
            }
            if (z11) {
                a aVar = PDFPageManagerActivity.H0;
                bn.a h10 = pDFPageManagerActivity.q2().h(i10);
                if (h10 != null && h10.f5492f) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                pDFPageManagerActivity.K = !z14;
            }
            if (i10 > i11) {
                return;
            }
            while (true) {
                bn.a h11 = pDFPageManagerActivity.q2().h(i10);
                if (pDFPageManagerActivity.K) {
                    if (h11 != null && !h11.f5492f) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        pDFPageManagerActivity.s2().d(h11);
                    }
                } else {
                    if (h11 != null && h11.f5492f) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        pDFPageManagerActivity.s2().g(h11);
                    }
                }
                if (i10 != i11) {
                    i10++;
                } else {
                    return;
                }
            }
        }

        @Override // pdf.pdfreader.viewer.editor.free.utils.drag.DragSelectionProcessor.b
        public final Set<Integer> q() {
            return null;
        }
    }

    /* compiled from: PDFPageManagerActivity.kt */
    /* loaded from: classes3.dex */
    public static final class e implements androidx.lifecycle.x, kotlin.jvm.internal.e {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ cg.l f25294a;

        public e(cg.l lVar) {
            ea.a.p("KXVfYw1pWG4=", "XwbikVji");
            this.f25294a = lVar;
        }

        @Override // kotlin.jvm.internal.e
        public final cg.l a() {
            return this.f25294a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof androidx.lifecycle.x) && (obj instanceof kotlin.jvm.internal.e)) {
                return kotlin.jvm.internal.g.a(this.f25294a, ((kotlin.jvm.internal.e) obj).a());
            }
            return false;
        }

        public final int hashCode() {
            return this.f25294a.hashCode();
        }

        @Override // androidx.lifecycle.x
        public final /* synthetic */ void m(Object obj) {
            this.f25294a.invoke(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.PDFPageManagerActivity$handler$1] */
    public PDFPageManagerActivity() {
        final Looper mainLooper = Looper.getMainLooper();
        this.f25270i0 = new Handler(mainLooper) { // from class: pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.PDFPageManagerActivity$handler$1
            @Override // android.os.Handler
            public final void handleMessage(Message msg) {
                String string;
                kotlin.jvm.internal.g.e(msg, "msg");
                super.handleMessage(msg);
                PDFPageManagerActivity.a aVar = PDFPageManagerActivity.H0;
                PDFPageManagerActivity pDFPageManagerActivity = PDFPageManagerActivity.this;
                pDFPageManagerActivity.o2().f1280t.setVisibility(8);
                int i10 = msg.what;
                boolean z10 = false;
                Integer num = null;
                PdfPreviewEntity pdfPreviewEntity = null;
                if (i10 == pDFPageManagerActivity.W) {
                    Object obj = msg.obj;
                    if (obj instanceof PdfPreviewEntity) {
                        pdfPreviewEntity = (PdfPreviewEntity) obj;
                    }
                    pDFPageManagerActivity.f25265d0 = pdfPreviewEntity;
                    pDFPageManagerActivity.f25278q0 = true;
                    tn.a.b(pDFPageManagerActivity, ea.a.p("Im5WcBhnZQ==", "nXG2cVn3"), ea.a.p("Im5WcBhnUl8_eD5yFGMcX1FsCV8zaQB3", "KUXUEJgx"));
                    PdfPreviewEntity pdfPreviewEntity2 = pDFPageManagerActivity.f25265d0;
                    if (pdfPreviewEntity2 != null) {
                        pDFPageManagerActivity.o2().f1281u.setText(pDFPageManagerActivity.getString(R.string.arg_res_0x7f130149, pdf.pdfreader.viewer.editor.free.utils.v.p(pdfPreviewEntity2.getPath())));
                    }
                    ObjectAnimator objectAnimator = pDFPageManagerActivity.D0;
                    if (objectAnimator != null && objectAnimator.isRunning()) {
                        z10 = true;
                    }
                    if (!z10) {
                        pDFPageManagerActivity.o2().f1277q.getViewTreeObserver().addOnGlobalLayoutListener(new a0(pDFPageManagerActivity));
                    }
                } else if (i10 == pDFPageManagerActivity.X) {
                    pDFPageManagerActivity.u2();
                    Object obj2 = msg.obj;
                    if (obj2 instanceof Integer) {
                        num = (Integer) obj2;
                    }
                    if (num != null && num.intValue() == pDFPageManagerActivity.f25263b0) {
                        new pdf.pdfreader.viewer.editor.free.ui.dialog.x(pDFPageManagerActivity, 0).show();
                        return;
                    }
                    if (num != null && num.intValue() == pDFPageManagerActivity.Z) {
                        string = pDFPageManagerActivity.getString(R.string.arg_res_0x7f130129);
                    } else {
                        string = pDFPageManagerActivity.getString(R.string.arg_res_0x7f1301a4);
                    }
                    kotlin.jvm.internal.g.d(string, ea.a.p("WmZrKBZyEEMdZFEgVD12ZTZybW8pbWog0oDwIGwgEyATIGsgUyBCIFIgFCBJIHYgZCASfQ==", "0VL3hzuN"));
                    if (pDFPageManagerActivity.f25268g0 == null) {
                        OperatePdfFailedDialog operatePdfFailedDialog = new OperatePdfFailedDialog(pDFPageManagerActivity, new cg.a<tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.PDFPageManagerActivity$handler$1$handleMessage$1
                            /* renamed from: invoke  reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                            }

                            @Override // cg.a
                            public /* bridge */ /* synthetic */ tf.d invoke() {
                                invoke2();
                                return tf.d.f30009a;
                            }
                        });
                        String string2 = pDFPageManagerActivity.getString(R.string.arg_res_0x7f130128);
                        kotlin.jvm.internal.g.d(string2, ea.a.p("KGVFUw1yXm49KBguBnQaaVtnQGU9dBdhBXQPZghpPWUrX1ZwDSk=", "OvNRfPiQ"));
                        operatePdfFailedDialog.H(string2, string);
                        pDFPageManagerActivity.f25268g0 = operatePdfFailedDialog;
                    }
                    OperatePdfFailedDialog operatePdfFailedDialog2 = pDFPageManagerActivity.f25268g0;
                    if (operatePdfFailedDialog2 != null) {
                        operatePdfFailedDialog2.show();
                    }
                } else if (i10 == pDFPageManagerActivity.Y) {
                    pDFPageManagerActivity.u2();
                }
            }
        };
        this.f25271j0 = kotlin.a.a(new cg.a<vm.i>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.PDFPageManagerActivity$pageAdapter$2
            {
                super(0);
            }

            @Override // cg.a
            public final vm.i invoke() {
                PDFPageManagerActivity pDFPageManagerActivity = PDFPageManagerActivity.this;
                PDFPageManagerActivity.a aVar = PDFPageManagerActivity.H0;
                final vm.i iVar = new vm.i(pDFPageManagerActivity.s2());
                final PDFPageManagerActivity pDFPageManagerActivity2 = PDFPageManagerActivity.this;
                iVar.f30870j = new cg.l<Integer, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.PDFPageManagerActivity$pageAdapter$2$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // cg.l
                    public /* bridge */ /* synthetic */ tf.d invoke(Integer num) {
                        invoke(num.intValue());
                        return tf.d.f30009a;
                    }

                    public final void invoke(int i10) {
                        pdf.pdfreader.viewer.editor.free.utils.drag.a aVar2;
                        if (!vm.i.this.f30876p || (aVar2 = pDFPageManagerActivity2.I) == null) {
                            return;
                        }
                        aVar2.d(i10);
                    }
                };
                iVar.f30871k = new cg.l<Integer, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.PDFPageManagerActivity$pageAdapter$2$1$2
                    {
                        super(1);
                    }

                    @Override // cg.l
                    public /* bridge */ /* synthetic */ tf.d invoke(Integer num) {
                        invoke(num.intValue());
                        return tf.d.f30009a;
                    }

                    public final void invoke(int i10) {
                        PDFPageManagerActivity pDFPageManagerActivity3 = PDFPageManagerActivity.this;
                        PDFPageManagerActivity.a aVar2 = PDFPageManagerActivity.H0;
                        if (pDFPageManagerActivity3.i2()) {
                            return;
                        }
                        if (PDFPageManagerActivity.this.t2()) {
                            PDFPageManagerActivity pDFPageManagerActivity4 = PDFPageManagerActivity.this;
                            String string = pDFPageManagerActivity4.getString(R.string.arg_res_0x7f1304d5);
                            kotlin.jvm.internal.g.d(string, ea.a.p("VGU_UwdyC24VKGYuGnQkaSpnHHQpXyl1XXBqcCZnAV9AYT1lLGYLcgF0a2cZdCk=", "05GdGO7M"));
                            pDFPageManagerActivity4.M2(4, string);
                            return;
                        }
                        PDFPageManagerActivity pDFPageManagerActivity5 = PDFPageManagerActivity.this;
                        if (pDFPageManagerActivity5.Q != null) {
                            pDFPageManagerActivity5.finish();
                        }
                    }
                };
                iVar.f30872l = new cg.p<Integer, Integer, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.PDFPageManagerActivity$pageAdapter$2$1$3
                    {
                        super(2);
                    }

                    @Override // cg.p
                    public /* bridge */ /* synthetic */ tf.d invoke(Integer num, Integer num2) {
                        invoke(num.intValue(), num2.intValue());
                        return tf.d.f30009a;
                    }

                    public final void invoke(int i10, int i11) {
                        PDFPageManagerActivity pDFPageManagerActivity3 = PDFPageManagerActivity.this;
                        PDFPageManagerActivity.a aVar2 = PDFPageManagerActivity.H0;
                        pDFPageManagerActivity3.getClass();
                        w0.a().c.execute(new wl.c(i10, i11, pDFPageManagerActivity3));
                    }
                };
                iVar.f30873m = new cg.a<Boolean>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.PDFPageManagerActivity$pageAdapter$2$1$4
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // cg.a
                    public final Boolean invoke() {
                        PDFPageManagerActivity pDFPageManagerActivity3 = PDFPageManagerActivity.this;
                        PDFPageManagerActivity.a aVar2 = PDFPageManagerActivity.H0;
                        return Boolean.valueOf(pDFPageManagerActivity3.i2());
                    }
                };
                return iVar;
            }
        });
        androidx.activity.result.c<Intent> registerForActivityResult = registerForActivityResult(new j.d(), new d9.g(this, 11));
        kotlin.jvm.internal.g.d(registerForActivityResult, ea.a.p("PWVWaQp0UnIcbzhBFnQBdlx0F1IgcxBsq4DAcx9sDEQudFApcyAXIHogaiBVfWIgFSBOfQ==", "ofQUIfjx"));
        this.f25272k0 = registerForActivityResult;
        this.f25274m0 = new r(this, 0);
        this.E0 = new LinkedHashSet();
        this.F0 = -1L;
    }

    public static long p2(long j10) {
        if (j10 <= 0) {
            return 0L;
        }
        long currentTimeMillis = System.currentTimeMillis() - j10;
        if (currentTimeMillis >= 200) {
            return 0L;
        }
        return 200 - currentTimeMillis;
    }

    public final void A2(final boolean z10) {
        try {
            final ReaderPDFCore readerPDFCore = new ReaderPDFCore(this, this.f25314u);
            if (readerPDFCore.needsPassword() && !TextUtils.isEmpty(this.f25315v)) {
                readerPDFCore.authenticatePassword(this.f25315v);
            }
            readerPDFCore.countPages();
            readerPDFCore.transportData(this.f25317x);
            ReaderPDFCore readerPDFCore2 = this.f25317x;
            if (readerPDFCore2 != null) {
                readerPDFCore2.onDestroy();
            }
            this.f25313t.post(new Runnable() { // from class: pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.v

                /* renamed from: d  reason: collision with root package name */
                public final /* synthetic */ boolean f25352d = true;

                @Override // java.lang.Runnable
                public final void run() {
                    PDFPageManagerActivity.a aVar = PDFPageManagerActivity.H0;
                    String p10 = ea.a.p("O2hYc10w", "AlcngpwW");
                    PDFPageManagerActivity pDFPageManagerActivity = PDFPageManagerActivity.this;
                    kotlin.jvm.internal.g.e(pDFPageManagerActivity, p10);
                    String p11 = ea.a.p("F24udzBvEGU=", "1pOZtfA0");
                    ReaderPDFCore readerPDFCore3 = readerPDFCore;
                    kotlin.jvm.internal.g.e(readerPDFCore3, p11);
                    pDFPageManagerActivity.f25317x = readerPDFCore3;
                    pDFPageManagerActivity.q2().f30867g = pDFPageManagerActivity.f25317x;
                    if (z10) {
                        pDFPageManagerActivity.h2();
                    }
                    if (this.f25352d) {
                        pDFPageManagerActivity.b2(false);
                    }
                }
            });
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final void B2() {
        v2();
        o2().c.setAlpha(1.0f);
        ConstraintLayout constraintLayout = o2().c;
        kotlin.jvm.internal.g.d(constraintLayout, ea.a.p("UWklZBpuBS4Rb1pTDGwzY3Q=", "efMFnaLo"));
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = this.C0;
            constraintLayout.setLayoutParams(layoutParams);
            return;
        }
        throw new NullPointerException(ea.a.p("IXVdbFljVm40bz4gF2VIY1RzGiAxb0VuW25CbkFsAiA7eUFlWWFZZChvI2RbdgFlQi44aSB3InJbdR8ueGEXbzp0YWELYVpz", "Cspk4o4n"));
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.f, jl.a
    public final void C1() {
        this.O = BillingConfigImpl.c.w();
        o2().f1273m.setOnClickListener(new f5.e(this, 11));
        o2().f1265e.setOnClickListener(new k9.c(this, 9));
        TextView textView = o2().I;
        kotlin.jvm.internal.g.d(textView, ea.a.p("UWklZBpuBS4GdmdlBWU1dA==", "60NLbn8I"));
        pdf.pdfreader.viewer.editor.free.utils.extension.g.e(textView, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.PDFPageManagerActivity$findView$3
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
                PDFPageManagerActivity pDFPageManagerActivity = PDFPageManagerActivity.this;
                PDFPageManagerActivity.a aVar = PDFPageManagerActivity.H0;
                pDFPageManagerActivity.l2();
            }
        });
        o2().f1275o.setOnClickListener(new u4.g(this, 10));
        ((AppCompatImageView) o2().C.f1303e).setOnClickListener(new u4.j(this, 12));
        View view = o2().N;
        kotlin.jvm.internal.g.d(view, ea.a.p("LWlfZBBuUC4saS93PG4bZUd0", "QJjgvbXE"));
        pdf.pdfreader.viewer.editor.free.utils.extension.g.e(view, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.PDFPageManagerActivity$findView$6
            {
                super(1);
            }

            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(View view2) {
                invoke2(view2);
                return tf.d.f30009a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View it) {
                kotlin.jvm.internal.g.e(it, "it");
                PDFPageManagerActivity pDFPageManagerActivity = PDFPageManagerActivity.this;
                PDFPageManagerActivity.a aVar = PDFPageManagerActivity.H0;
                if (pDFPageManagerActivity.i2()) {
                    return;
                }
                final PDFPageManagerActivity pDFPageManagerActivity2 = PDFPageManagerActivity.this;
                pDFPageManagerActivity2.getClass();
                ChooseInsertTypeDialog chooseInsertTypeDialog = new ChooseInsertTypeDialog(pDFPageManagerActivity2);
                chooseInsertTypeDialog.f25360y = new cg.a<tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.PDFPageManagerActivity$showInsertTypeDialog$1
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
                        tn.a.b(PDFPageManagerActivity.this, ea.a.p("Im5WcBhnZQ==", "vUiYuCdW"), ea.a.p("LG4lcAZnLF8hbhVlRnQIYlRhPGsWY1ppF2s=", "hbABgI9I"));
                        Intent intent = new Intent(PDFPageManagerActivity.this, PDFCreatorActivity.class);
                        intent.putExtra(ea.a.p("KW9DbQ==", "1pRoT3fg"), 102);
                        PDFPageManagerActivity.this.f25272k0.a(intent);
                    }
                };
                chooseInsertTypeDialog.f25361z = new cg.a<tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.PDFPageManagerActivity$showInsertTypeDialog$2
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
                        ImageConvertDataRepository.f26536a.getClass();
                        ImageConvertDataRepository.f();
                        tn.a.b(PDFPageManagerActivity.this, ea.a.p("O24vcC5nZQ==", "ANVHOEbq"), ea.a.p("Xm4scBJnB18bbkdlG3QJaSlhVWUZYy9pKWs=", "J517LQDc"));
                        ReaderImg2PDFChooseActivity.a aVar2 = ReaderImg2PDFChooseActivity.M0;
                        PDFPageManagerActivity pDFPageManagerActivity3 = PDFPageManagerActivity.this;
                        String p10 = ea.a.p("Jm5CZQt0", "ArOXgIuQ");
                        String p11 = ea.a.p("Q2EsZT5hDGEVZXI=", "WF9A8NaV");
                        aVar2.getClass();
                        ReaderImg2PDFChooseActivity.a.b(pDFPageManagerActivity3, p10, p11);
                    }
                };
                pDFPageManagerActivity2.W1(chooseInsertTypeDialog);
                tn.a.b(pDFPageManagerActivity2, ea.a.p("Im5WcBhnZQ==", "G2DPTyP3"), ea.a.p("Xm4scBJnB18bbkdlG3QJbSFtR18waSZ3", "jaVkJg4L"));
            }
        });
        View view2 = o2().P;
        kotlin.jvm.internal.g.d(view2, ea.a.p("UWklZBpuBS4EaVF3O28iYTBl", "S1iYFdwd"));
        pdf.pdfreader.viewer.editor.free.utils.extension.g.e(view2, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.PDFPageManagerActivity$findView$7
            {
                super(1);
            }

            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(View view3) {
                invoke2(view3);
                return tf.d.f30009a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View it) {
                kotlin.jvm.internal.g.e(it, "it");
                PDFPageManagerActivity pDFPageManagerActivity = PDFPageManagerActivity.this;
                PDFPageManagerActivity.a aVar = PDFPageManagerActivity.H0;
                if (pDFPageManagerActivity.i2()) {
                    return;
                }
                tn.a.b(PDFPageManagerActivity.this, ea.a.p("Im5WcBhnZQ==", "fwesQTOr"), ea.a.p("Im5WcBhnUl8obz5hAWU3Y1lpDWs=", "hMeJRVdk"));
                PDFPageManagerActivity pDFPageManagerActivity2 = PDFPageManagerActivity.this;
                pDFPageManagerActivity2.getClass();
                w0.a().c.execute(new t(pDFPageManagerActivity2));
            }
        });
        View view3 = o2().M;
        kotlin.jvm.internal.g.d(view3, ea.a.p("UWklZBpuBS4EaVF3LHgiciVjdA==", "8HqD2aBb"));
        pdf.pdfreader.viewer.editor.free.utils.extension.g.e(view3, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.PDFPageManagerActivity$findView$8
            {
                super(1);
            }

            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(View view4) {
                invoke2(view4);
                return tf.d.f30009a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View it) {
                kotlin.jvm.internal.g.e(it, "it");
                PDFPageManagerActivity pDFPageManagerActivity = PDFPageManagerActivity.this;
                PDFPageManagerActivity.a aVar = PDFPageManagerActivity.H0;
                if (pDFPageManagerActivity.i2()) {
                    return;
                }
                tn.a.b(PDFPageManagerActivity.this, ea.a.p("Xm4scBJnZQ==", "ivh0KGtS"), ea.a.p("Xm4scBJnB18XeEByCGMiXydsW2Nr", "RKhbSWUz"));
                if (PDFPageManagerActivity.this.t2()) {
                    PDFPageManagerActivity pDFPageManagerActivity2 = PDFPageManagerActivity.this;
                    String string = pDFPageManagerActivity2.getString(R.string.arg_res_0x7f1304d4);
                    kotlin.jvm.internal.g.d(string, ea.a.p("ImVMUzxyDG4vKDQuR3QlaVZnfHQmX1N4AHIQYyVfMWEzZWdmIXIWdBdnFnQp", "88E8HeTA"));
                    pDFPageManagerActivity2.M2(3, string);
                    return;
                }
                PDFPageManagerActivity.this.n2();
            }
        });
        View view4 = o2().L;
        kotlin.jvm.internal.g.d(view4, ea.a.p("LmkMZBpuCi4-aQN3cGU7ZUxl", "qGLbsmHd"));
        pdf.pdfreader.viewer.editor.free.utils.extension.g.e(view4, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.PDFPageManagerActivity$findView$9
            {
                super(1);
            }

            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(View view5) {
                invoke2(view5);
                return tf.d.f30009a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View it) {
                kotlin.jvm.internal.g.e(it, "it");
                PDFPageManagerActivity pDFPageManagerActivity = PDFPageManagerActivity.this;
                PDFPageManagerActivity.a aVar = PDFPageManagerActivity.H0;
                if (pDFPageManagerActivity.i2()) {
                    return;
                }
                tn.a.b(PDFPageManagerActivity.this, ea.a.p("G24FcChnZQ==", "hdvbIqWI"), ea.a.p("Im5WcBhnUl8-ZSZlAWU3Y1lpDWs=", "KAJcTz4I"));
                PDFPageManagerActivity pDFPageManagerActivity2 = PDFPageManagerActivity.this;
                pDFPageManagerActivity2.getClass();
                ArrayList arrayList = (ArrayList) pDFPageManagerActivity2.s2().f1705d.d();
                PageManagerDeleteConfirmDialog pageManagerDeleteConfirmDialog = new PageManagerDeleteConfirmDialog(pDFPageManagerActivity2, arrayList != null ? arrayList.size() : 0);
                pageManagerDeleteConfirmDialog.f23542t = new z(pDFPageManagerActivity2);
                pDFPageManagerActivity2.W1(pageManagerDeleteConfirmDialog);
            }
        });
        View view5 = o2().O;
        kotlin.jvm.internal.g.d(view5, ea.a.p("UWklZBpuBS4EaVF3OWExZRdlRnVw", "4Aa5HJYG"));
        pdf.pdfreader.viewer.editor.free.utils.extension.g.e(view5, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.PDFPageManagerActivity$findView$10
            {
                super(1);
            }

            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(View view6) {
                invoke2(view6);
                return tf.d.f30009a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View it) {
                kotlin.jvm.internal.g.e(it, "it");
                PDFPageManagerActivity pDFPageManagerActivity = PDFPageManagerActivity.this;
                PDFPageManagerActivity.a aVar = PDFPageManagerActivity.H0;
                if (pDFPageManagerActivity.i2()) {
                    return;
                }
                ArrayList arrayList = (ArrayList) PDFPageManagerActivity.this.s2().f1705d.d();
                if ((arrayList != null ? arrayList.size() : 0) > 300) {
                    PDFPageManagerActivity pDFPageManagerActivity2 = PDFPageManagerActivity.this;
                    pDFPageManagerActivity2.h(pDFPageManagerActivity2.getString(R.string.arg_res_0x7f130460, ea.a.p("ADAw", "11Z5DqR6")));
                    return;
                }
                d.a aVar2 = pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.fragment.d.f25379j0;
                g0 supportFragmentManager = PDFPageManagerActivity.this.getSupportFragmentManager();
                kotlin.jvm.internal.g.d(supportFragmentManager, ea.a.p("RHU5cApyOUY6YQFtUW4jTVluM2cscg==", "eV7IeMK1"));
                aVar2.getClass();
                androidx.fragment.app.a aVar3 = new androidx.fragment.app.a(supportFragmentManager);
                aVar3.f3902f = 4099;
                aVar3.c(R.id.page_manager_fl_page_setting, new pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.fragment.d(), ea.a.p("H0R3UBhnUlM_dD5pG2cuclRnA2UrdA==", "vdwzG32p"), 1);
                aVar3.g();
                tn.a.b(PDFPageManagerActivity.this, ea.a.p("Im5WcBhnZQ==", "FiBGhMAc"), ea.a.p("W24FcClnI184YQFlR2UjX1tsO2Nr", "gI6bHFGt"));
                tn.a.b(PDFPageManagerActivity.this, ea.a.p("I25ecAhnZQ==", "uWN9ihsp"), ea.a.p("Xm4scBJnB18CYVNlGmUiXzJpV3c=", "X609YiA6"));
            }
        });
        RelativeLayout relativeLayout = o2().f1285y;
        kotlin.jvm.internal.g.d(relativeLayout, ea.a.p("UWklZBpuBS4AbGdhH2U=", "qv5qeRo5"));
        pdf.pdfreader.viewer.editor.free.utils.extension.g.e(relativeLayout, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.PDFPageManagerActivity$findView$11
            {
                super(1);
            }

            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(View view6) {
                invoke2(view6);
                return tf.d.f30009a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View it) {
                kotlin.jvm.internal.g.e(it, "it");
                PDFPageManagerActivity pDFPageManagerActivity = PDFPageManagerActivity.this;
                PDFPageManagerActivity.a aVar = PDFPageManagerActivity.H0;
                if (pDFPageManagerActivity.i2()) {
                    return;
                }
                PDFPageManagerActivity.this.k2(0);
            }
        });
        o2().f1272l.setOnClickListener(new p(this, 0));
        o2().f1269i.setOnClickListener(new j0(this, 10));
        AppCompatImageView appCompatImageView = o2().f1279s;
        kotlin.jvm.internal.g.d(appCompatImageView, ea.a.p("GmkZZD5uXi44YQFleWE5YV9lIEk_RU50BmESdAJ1IWMdcwRDO29KZQ==", "zhxwW9Z7"));
        pdf.pdfreader.viewer.editor.free.utils.extension.g.e(appCompatImageView, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.PDFPageManagerActivity$findView$14
            {
                super(1);
            }

            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(View view6) {
                invoke2(view6);
                return tf.d.f30009a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View it) {
                kotlin.jvm.internal.g.e(it, "it");
                PDFPageManagerActivity pDFPageManagerActivity = PDFPageManagerActivity.this;
                PDFPageManagerActivity.a aVar = PDFPageManagerActivity.H0;
                pDFPageManagerActivity.u2();
            }
        });
        AppCompatTextView appCompatTextView = o2().f1282v;
        kotlin.jvm.internal.g.d(appCompatTextView, ea.a.p("LWlfZBBuUC4qYS1lOGEGYVJlHFQzRR10QGEtdBR1MmMqc0JTEWFFZQ==", "v4KN2NGQ"));
        pdf.pdfreader.viewer.editor.free.utils.extension.g.e(appCompatTextView, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.PDFPageManagerActivity$findView$15
            {
                super(1);
            }

            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(View view6) {
                invoke2(view6);
                return tf.d.f30009a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View it) {
                kotlin.jvm.internal.g.e(it, "it");
                tn.a.b(PDFPageManagerActivity.this, ea.a.p("Xm4scBJnZQ==", "5P14kGLD"), ea.a.p("Xm4scBJnB18XeEByCGMiXyBsVV81aCJyBF8IbDhjaw==", "akQFwk7N"));
                PDFPageManagerActivity pDFPageManagerActivity = PDFPageManagerActivity.this;
                PdfPreviewEntity pdfPreviewEntity = pDFPageManagerActivity.f25265d0;
                if (pdfPreviewEntity != null) {
                    e1.e(pDFPageManagerActivity, pdfPreviewEntity);
                }
                PDFPageManagerActivity.this.u2();
            }
        });
        AppCompatTextView appCompatTextView2 = o2().f1283w;
        kotlin.jvm.internal.g.d(appCompatTextView2, ea.a.p("M2lfZDhuAy44YQFleWE5YV9lIFQ_RU50BmESdAJ1IWM0c0JWOGV3", "JbQ1QdHZ"));
        pdf.pdfreader.viewer.editor.free.utils.extension.g.e(appCompatTextView2, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.PDFPageManagerActivity$findView$16
            {
                super(1);
            }

            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(View view6) {
                invoke2(view6);
                return tf.d.f30009a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View it) {
                kotlin.jvm.internal.g.e(it, "it");
                tn.a.b(PDFPageManagerActivity.this, ea.a.p("Xm4scBJnZQ==", "cz5lYNI8"), ea.a.p("Im5WcBhnUl8_eD5yFGMcX1FsCV8zaQB3a2NYaQdr", "w2f144dn"));
                PDFPageManagerActivity pDFPageManagerActivity = PDFPageManagerActivity.this;
                PDFPageManagerActivity.a aVar = PDFPageManagerActivity.H0;
                if (pDFPageManagerActivity.t2()) {
                    PDFPageManagerActivity pDFPageManagerActivity2 = PDFPageManagerActivity.this;
                    String string = pDFPageManagerActivity2.getString(R.string.arg_res_0x7f13010e);
                    kotlin.jvm.internal.g.d(string, ea.a.p("KGVFUw1yXm49KBguBnQaaVtnQGUhaRFfPW0qZylfDGk_c25tCmcp", "VucJTKLx"));
                    pDFPageManagerActivity2.M2(5, string);
                    return;
                }
                PDFPageManagerActivity.this.O2();
            }
        });
    }

    public final void C2(int i10) {
        if (i10 >= 0 && i10 < q2().getItemCount()) {
            this.f25313t.post(new t0(this, i10, 2));
        }
    }

    @Override // jl.a
    public final View D1() {
        ConstraintLayout constraintLayout = o2().f1286z;
        kotlin.jvm.internal.g.d(constraintLayout, ea.a.p("CWkfZAFuUC46bwl0Ymkydw==", "Q7kqh7zN"));
        return constraintLayout;
    }

    public final void D2(int i10, boolean z10) {
        if (z10) {
            G2(true);
            F2(true);
            E2(false);
            H2(true);
        } else if (i10 <= 0) {
            G2(false);
            F2(false);
            E2(false);
            H2(false);
        } else {
            G2(true);
            F2(true);
            E2(true);
            H2(true);
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.f, jl.a
    public final int E1() {
        return 0;
    }

    public final void E2(boolean z10) {
        o2().L.setEnabled(z10);
        if (z10) {
            o2().f1266f.setImageTintList(androidx.core.content.a.getColorStateList(this, R.color.colorSurface));
            o2().D.setTextColor(androidx.core.content.a.getColor(this, R.color.colorSurface));
            return;
        }
        o2().f1266f.setImageTintList(androidx.core.content.a.getColorStateList(this, R.color.color_9798A2_61626C));
        o2().D.setTextColor(androidx.core.content.a.getColor(this, R.color.color_9798A2_61626C));
    }

    public final void F2(boolean z10) {
        o2().M.setEnabled(z10);
        if (z10) {
            o2().f1267g.setImageTintList(androidx.core.content.a.getColorStateList(this, R.color.colorSurface));
            o2().E.setTextColor(androidx.core.content.a.getColor(this, R.color.colorSurface));
            return;
        }
        o2().f1267g.setImageTintList(androidx.core.content.a.getColorStateList(this, R.color.color_9798A2_61626C));
        o2().E.setTextColor(androidx.core.content.a.getColor(this, R.color.color_9798A2_61626C));
    }

    public final void G2(boolean z10) {
        o2().P.setEnabled(z10);
        if (z10) {
            o2().f1270j.setImageTintList(androidx.core.content.a.getColorStateList(this, R.color.colorSurface));
            o2().H.setTextColor(androidx.core.content.a.getColor(this, R.color.colorSurface));
            return;
        }
        o2().f1270j.setImageTintList(androidx.core.content.a.getColorStateList(this, R.color.color_9798A2_61626C));
        o2().H.setTextColor(androidx.core.content.a.getColor(this, R.color.color_9798A2_61626C));
    }

    public final void H2(boolean z10) {
        o2().O.setEnabled(z10);
        if (z10) {
            o2().f1268h.setImageTintList(androidx.core.content.a.getColorStateList(this, R.color.colorSurface));
            o2().F.setTextColor(androidx.core.content.a.getColor(this, R.color.colorSurface));
            return;
        }
        o2().f1268h.setImageTintList(androidx.core.content.a.getColorStateList(this, R.color.color_9798A2_61626C));
        o2().F.setTextColor(androidx.core.content.a.getColor(this, R.color.color_9798A2_61626C));
    }

    public final void I2(int i10) {
        if (i10 <= 1) {
            o2().G.setText(getString(R.string.arg_res_0x7f1300d7, String.valueOf(i10)));
        } else {
            o2().G.setText(getString(R.string.arg_res_0x7f13059b, String.valueOf(i10)));
        }
    }

    public final void J2(boolean z10) {
        if (z10) {
            BillingConfigImpl billingConfigImpl = BillingConfigImpl.c;
            billingConfigImpl.getClass();
            if (BillingConfigImpl.v() && billingConfigImpl.z() && !billingConfigImpl.w()) {
                o2().B.setVisibility(0);
                return;
            } else {
                o2().B.setVisibility(8);
                return;
            }
        }
        o2().B.setVisibility(8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x004b, code lost:
        if (((java.lang.Boolean) wm.b.f31383i.b(wm.b.f31378d[3])).booleanValue() != false) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    @Override // pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.f, jl.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void K1() {
        /*
            Method dump skipped, instructions count: 373
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.PDFPageManagerActivity.K1():void");
    }

    public final void K2(ViewGroup viewGroup, boolean z10, int i10) {
        int height;
        ValueAnimator valueAnimator;
        v2();
        ValueAnimator valueAnimator2 = this.f25287z0;
        if (valueAnimator2 != null) {
            boolean z11 = true;
            if (!valueAnimator2.isRunning()) {
                z11 = false;
            }
            if (z11 && (valueAnimator = this.f25287z0) != null) {
                valueAnimator.cancel();
            }
        }
        if (z10) {
            height = viewGroup.getHeight();
        } else {
            height = viewGroup.getHeight();
            i10 = 0;
        }
        if (z10) {
            if (viewGroup.getVisibility() != 0) {
                height = 0;
            }
            viewGroup.setVisibility(0);
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(height, i10);
        this.f25287z0 = ofInt;
        if (ofInt != null) {
            ofInt.addUpdateListener(new k9.a(viewGroup, 2));
        }
        ValueAnimator valueAnimator3 = this.f25287z0;
        if (valueAnimator3 != null) {
            valueAnimator3.addListener(new b0(viewGroup, z10));
        }
        ValueAnimator valueAnimator4 = this.f25287z0;
        if (valueAnimator4 != null) {
            valueAnimator4.setDuration(200L);
        }
        ValueAnimator valueAnimator5 = this.f25287z0;
        if (valueAnimator5 != null) {
            valueAnimator5.setInterpolator(new LinearInterpolator());
        }
        ValueAnimator valueAnimator6 = this.f25287z0;
        if (valueAnimator6 != null) {
            valueAnimator6.start();
        }
    }

    @Override // jl.a
    public final void L1() {
        BillingConfigImpl.c.getClass();
        BillingConfigImpl.x().e(this, new e(new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.PDFPageManagerActivity$initViewModel$1
            {
                super(1);
            }

            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                invoke2(bool);
                return tf.d.f30009a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Boolean bool) {
                if (kotlin.jvm.internal.g.a(bool, Boolean.valueOf(PDFPageManagerActivity.this.O))) {
                    return;
                }
                PDFPageManagerActivity pDFPageManagerActivity = PDFPageManagerActivity.this;
                kotlin.jvm.internal.g.d(bool, ea.a.p("AnQ=", "N4kHgfQ1"));
                pDFPageManagerActivity.O = bool.booleanValue();
                if (kotlin.jvm.internal.g.a(bool, Boolean.TRUE)) {
                    PDFPageManagerActivity.this.J2(false);
                }
            }
        }));
        s2().f1705d.e(this, new e(new cg.l<ArrayList<bn.a>, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.PDFPageManagerActivity$initViewModel$2
            {
                super(1);
            }

            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(ArrayList<bn.a> arrayList) {
                invoke2(arrayList);
                return tf.d.f30009a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(ArrayList<bn.a> arrayList) {
                PDFPageManagerActivity pDFPageManagerActivity = PDFPageManagerActivity.this;
                if (pDFPageManagerActivity.R) {
                    TextView textView = pDFPageManagerActivity.o2().J;
                    PDFPageManagerActivity pDFPageManagerActivity2 = PDFPageManagerActivity.this;
                    Object[] objArr = new Object[1];
                    objArr[0] = String.valueOf(arrayList != null ? arrayList.size() : 0);
                    textView.setText(pDFPageManagerActivity2.getString(R.string.arg_res_0x7f130416, objArr));
                }
                PDFPageManagerActivity.this.z2();
                PDFPageManagerActivity.this.x2();
            }
        }));
    }

    public final void L2(ConstraintLayout constraintLayout, boolean z10) {
        float alpha;
        float f10;
        boolean z11;
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2 = this.A0;
        if (valueAnimator2 != null) {
            if (valueAnimator2.isRunning()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11 && (valueAnimator = this.A0) != null) {
                valueAnimator.cancel();
            }
        }
        float f11 = 0.0f;
        if (z10) {
            alpha = constraintLayout.getAlpha();
            f10 = 1.0f;
        } else {
            alpha = constraintLayout.getAlpha();
            f10 = 0.0f;
        }
        if (z10) {
            if (constraintLayout.getVisibility() == 0) {
                f11 = alpha;
            }
            constraintLayout.setVisibility(0);
            alpha = f11;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(alpha, f10);
        this.A0 = ofFloat;
        if (ofFloat != null) {
            ofFloat.addUpdateListener(new d9.j(constraintLayout, 1));
        }
        ValueAnimator valueAnimator3 = this.A0;
        if (valueAnimator3 != null) {
            valueAnimator3.addListener(new c0(constraintLayout, z10));
        }
        ValueAnimator valueAnimator4 = this.A0;
        if (valueAnimator4 != null) {
            valueAnimator4.setDuration(200L);
        }
        ValueAnimator valueAnimator5 = this.A0;
        if (valueAnimator5 != null) {
            valueAnimator5.setInterpolator(new LinearInterpolator());
        }
        ValueAnimator valueAnimator6 = this.A0;
        if (valueAnimator6 != null) {
            valueAnimator6.start();
        }
    }

    public final void M2(int i10, String str) {
        String string;
        boolean z10;
        if (i10 != 3 && i10 != 4) {
            string = getString(R.string.arg_res_0x7f130384);
        } else {
            string = getString(R.string.arg_res_0x7f130022);
        }
        String str2 = string;
        kotlin.jvm.internal.g.d(str2, ea.a.p("JmYZbhx4Q1MuZTogSD1IMxV8EiArZR10r4DEclZhL2U9X1VpCmNWcj4pQCBVIEggFSBOfQ==", "m6bvMb3K"));
        String p10 = ea.a.p("Wm5RcDdnZQ==", "Zk76VEff");
        if (BillingConfigImpl.c.z() && BillingConfigImpl.v()) {
            z10 = true;
        } else {
            z10 = false;
        }
        x2 x2Var = new x2(this, p10, str2, str, z10);
        this.T = x2Var;
        x2Var.f23542t = new e0(this, i10);
        W1(x2Var);
    }

    public final void N2(boolean z10, boolean z11) {
        boolean z12;
        int i10;
        int i11;
        if (!z10 && !z11) {
            z12 = false;
        } else {
            z12 = true;
        }
        Boolean valueOf = Boolean.valueOf(z12);
        o2().f1272l.setEnabled(z10);
        if (valueOf != null && valueOf.booleanValue()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        o2().f1272l.setVisibility(i10);
        Boolean valueOf2 = Boolean.valueOf(z12);
        o2().f1269i.setEnabled(z11);
        if (valueOf2 != null && valueOf2.booleanValue()) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        o2().f1269i.setVisibility(i11);
        if (!this.R) {
            if (z12) {
                o2().G.setVisibility(8);
            } else {
                o2().G.setVisibility(0);
            }
        } else {
            o2().G.setVisibility(8);
        }
        if (!this.R) {
            return;
        }
        if (!z12 && !t2()) {
            o2().f1285y.setVisibility(8);
            J2(false);
            return;
        }
        o2().f1285y.setVisibility(0);
        J2(true);
        if (t2()) {
            o2().f1285y.setEnabled(true);
            o2().f1285y.setAlpha(1.0f);
            o2().f1271k.setAlpha(1.0f);
            return;
        }
        o2().f1285y.setEnabled(false);
        if (pdf.pdfreader.viewer.editor.free.utils.extension.c.h(this)) {
            o2().f1285y.setAlpha(0.4f);
        } else {
            o2().f1271k.setAlpha(0.4f);
        }
    }

    public final void O2() {
        PdfPreviewEntity pdfPreviewEntity = this.f25265d0;
        if (pdfPreviewEntity != null) {
            pdfPreviewEntity.setRecent(1);
            pdfPreviewEntity.setRecentDate(System.currentTimeMillis());
            FileRepository.I(pdfPreviewEntity);
            bm.c.b(this).i(pdfPreviewEntity);
            k0.i(this, pdfPreviewEntity.getPath(), pdfPreviewEntity, ea.a.p("CVJ-TSZQdkcfXwdBO0EvRQ==", "tiDPWybZ"));
        }
        u2();
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.f
    public final View c2() {
        return o2().f1274n;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.f
    public final View d2() {
        return o2().Q;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.f
    public final void e2(final boolean z10) {
        final boolean z11;
        ArrayList<bn.a> arrayList;
        final ReaderPDFCore readerPDFCore = this.f25317x;
        if (readerPDFCore != null) {
            ArrayList<bn.a> arrayList2 = this.M;
            arrayList2.clear();
            final Ref$IntRef ref$IntRef = new Ref$IntRef();
            ref$IntRef.element = -1;
            ArrayList arrayList3 = new ArrayList();
            androidx.lifecycle.w wVar = an.a.c;
            Collection collection = (Collection) wVar.d();
            if (collection != null && !collection.isEmpty()) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (!z11 && (arrayList = (ArrayList) wVar.d()) != null) {
                ea.a.p("JnQ=", "LzsLuyNP");
                for (bn.a aVar : arrayList) {
                    arrayList3.add(Integer.valueOf(aVar.f5491e));
                }
            }
            final ArrayList arrayList4 = new ArrayList();
            int countPages = readerPDFCore.countPages();
            for (int i10 = 0; i10 < countPages; i10++) {
                bn.a aVar2 = new bn.a();
                if (!z11) {
                    if (arrayList3.contains(Integer.valueOf(i10))) {
                        aVar2.f5492f = true;
                        arrayList4.add(aVar2);
                        if (ref$IntRef.element == -1) {
                            ref$IntRef.element = i10;
                        }
                    }
                } else if (i10 == this.P) {
                    aVar2.f5492f = true;
                    arrayList4.add(aVar2);
                }
                aVar2.f5491e = i10;
                arrayList2.add(aVar2);
            }
            this.f25313t.post(new Runnable() { // from class: pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.w
                /* JADX WARN: Code restructure failed: missing block: B:50:0x0160, code lost:
                    if (((java.lang.Boolean) wm.b.f31380f.b(wm.b.f31378d[1])).booleanValue() != false) goto L58;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:52:0x0164, code lost:
                    if (wm.b.f31381g != false) goto L52;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:53:0x0166, code lost:
                    r0 = true;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:54:0x0167, code lost:
                    if (r0 == false) goto L57;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:55:0x0169, code lost:
                    r5.postDelayed(new pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.q(r1, 2), 500);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:56:0x0173, code lost:
                    return;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:66:?, code lost:
                    return;
                 */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final void run() {
                    /*
                        Method dump skipped, instructions count: 372
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.w.run():void");
                }
            });
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.f
    public final void f2() {
        finish();
    }

    @Override // android.app.Activity
    public final void finish() {
        boolean z10;
        if (this.Q != null) {
            androidx.lifecycle.w<ArrayList<bn.a>> wVar = an.a.f1699a;
            ym.b bVar = new ym.b();
            androidx.lifecycle.w wVar2 = an.a.c;
            Collection collection = (Collection) wVar2.d();
            int i10 = 0;
            if (collection != null && !collection.isEmpty()) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                bVar.f32187a = 0;
            } else {
                ArrayList arrayList = (ArrayList) wVar2.d();
                if (arrayList != null) {
                    ea.a.p("G2EJdWU=", "Temeqvo9");
                    bn.a aVar = (bn.a) kotlin.collections.m.x0(arrayList);
                    if (aVar != null) {
                        i10 = aVar.f5491e;
                    }
                }
                bVar.f32187a = i10;
            }
            bVar.f32188b = this.U;
            bVar.c = this.Q;
            an.a.f1703f.j(bVar);
        }
        super.finish();
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.f
    public final void g2(ArrayList arrayList, PageSize pageSize, PageRGBColor pageRGBColor) {
        if (pageSize != null && pageRGBColor != null) {
            w0.a().c.execute(new a6.g(1, pageSize, pageRGBColor, this, arrayList));
        }
    }

    public final void h(String str) {
        Drawable drawable;
        if (TextUtils.equals(str, getString(R.string.arg_res_0x7f1303e5))) {
            drawable = androidx.core.content.a.getDrawable(this, R.drawable.ic_copy_success);
        } else {
            drawable = null;
        }
        j1.e(this, str, false, drawable, r2());
    }

    public final void h2() {
        boolean z10;
        bn.a aVar;
        androidx.lifecycle.w wVar = an.a.c;
        Collection collection = (Collection) wVar.d();
        if (collection != null && !collection.isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            bn.a h10 = q2().h(0);
            if (h10 != null) {
                h10.f5492f = true;
            }
            s2().d(h10);
            return;
        }
        ArrayList arrayList = (ArrayList) wVar.d();
        tf.d dVar = null;
        if (arrayList != null) {
            aVar = (bn.a) kotlin.collections.m.x0(arrayList);
        } else {
            aVar = null;
        }
        s2().f();
        if (aVar != null) {
            s2().d(aVar);
            dVar = tf.d.f30009a;
        }
        if (dVar == null) {
            bn.a h11 = q2().h(0);
            if (h11 != null) {
                h11.f5492f = true;
            }
            s2().d(h11);
        }
    }

    public final boolean i2() {
        boolean z10;
        LottieAnimationView lottieAnimationView = o2().f1280t;
        kotlin.jvm.internal.g.d(lottieAnimationView, ea.a.p("UWklZBpuBS4CYVNlJGE4YSNlQEwpdDdpMUUKdDNhU3R_bypkGm5n", "TrA0d8hO"));
        if (lottieAnimationView.getVisibility() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            h(getString(R.string.arg_res_0x7f13012f));
            return true;
        } else if (!this.f25279r0) {
            return false;
        } else {
            h(getString(R.string.arg_res_0x7f13044f));
            return true;
        }
    }

    public final void j2() {
        PopupWindow popupWindow = this.f25282u0;
        boolean z10 = false;
        if (popupWindow != null && popupWindow.isShowing()) {
            z10 = true;
        }
        if (z10) {
            o2().f1275o.setVisibility(8);
            PopupWindow popupWindow2 = this.f25282u0;
            if (popupWindow2 != null) {
                popupWindow2.dismiss();
            }
        }
    }

    public final void k2(int i10) {
        List<String> list;
        boolean z10;
        boolean z11;
        bn.a aVar;
        boolean z12;
        ArrayList arrayList;
        BillingConfigImpl billingConfigImpl = BillingConfigImpl.c;
        if (billingConfigImpl.z() && BillingConfigImpl.v() && !billingConfigImpl.w()) {
            this.f25286y0 = i10;
            this.f25284w0 = true;
            BaseSubscriptionActivity.a aVar2 = BaseSubscriptionActivity.L;
            String p10 = ea.a.p("Xm4scBJnZQ==", "5NavGssw");
            aVar2.getClass();
            BaseSubscriptionActivity.a.a(this, p10);
            return;
        }
        this.U = true;
        if (this.f25276o0 == null) {
            this.f25276o0 = new ArrayList();
        }
        ArrayList arrayList2 = this.f25276o0;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        ReaderPDFCore readerPDFCore = this.f25317x;
        Integer num = null;
        if (readerPDFCore != null) {
            list = readerPDFCore.getSavePageManagerType();
        } else {
            list = null;
        }
        List<String> list2 = list;
        int i11 = 0;
        if (list2 != null && !list2.isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10 && (arrayList = this.f25276o0) != null) {
            arrayList.addAll(list2);
        }
        if (o2().f1285y.getVisibility() == 0) {
            this.f25281t0 = 0L;
            this.f25313t.postDelayed(new androidx.activity.k(this, 27), 200L);
        }
        this.f25280s0 = false;
        ReaderPDFCore readerPDFCore2 = this.f25317x;
        if (readerPDFCore2 != null) {
            readerPDFCore2.setSavingPdf(true);
        }
        this.f25279r0 = true;
        Collection collection = (Collection) s2().f1705d.d();
        if (collection != null && !collection.isEmpty()) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!z11) {
            vm.i q22 = q2();
            ArrayList arrayList3 = (ArrayList) s2().f1705d.d();
            if (arrayList3 != null) {
                aVar = (bn.a) kotlin.collections.m.x0(arrayList3);
            } else {
                aVar = null;
            }
            if (aVar != null) {
                Integer valueOf = Integer.valueOf(q22.f30865e.indexOf(aVar));
                if (valueOf.intValue() != -1) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    num = valueOf;
                }
                if (num != null) {
                    i11 = num.intValue();
                }
            } else {
                q22.getClass();
            }
        }
        w0.a().c.execute(new pdf.pdfreader.viewer.editor.free.feature.ocr.helper.f(i10, this, i11, 1));
    }

    public final void l2() {
        int i10;
        this.R = true;
        this.f25277p0 = true;
        q2().f30876p = true;
        this.f25313t.postDelayed(new androidx.activity.i(this, 29), 10L);
        o2().G.setVisibility(8);
        o2().f1265e.setImageResource(R.drawable.ic_home_arrow);
        TextView textView = o2().J;
        Object[] objArr = new Object[1];
        ArrayList arrayList = (ArrayList) an.a.c.d();
        if (arrayList != null) {
            i10 = arrayList.size();
        } else {
            i10 = 0;
        }
        objArr[0] = String.valueOf(i10);
        textView.setText(getString(R.string.arg_res_0x7f130416, objArr));
        if (((LinearLayout) o2().C.f1302d).getVisibility() == 0) {
            ConstraintLayout constraintLayout = o2().c;
            kotlin.jvm.internal.g.d(constraintLayout, ea.a.p("LWlfZBBuUC45byRTEGwNY3Q=", "pGTmZBX4"));
            L2(constraintLayout, true);
            B2();
            this.S = true;
            LinearLayout linearLayout = (LinearLayout) o2().C.f1302d;
            kotlin.jvm.internal.g.d(linearLayout, ea.a.p("LWlfZBBuUC4uaTpzOWxGdFxwHUxs", "QkFClpkQ"));
            K2(linearLayout, false, this.B0);
        } else {
            this.S = false;
            o2().c.setAlpha(1.0f);
            ConstraintLayout constraintLayout2 = o2().c;
            kotlin.jvm.internal.g.d(constraintLayout2, ea.a.p("E2kGZDtuNy4rbwhTUWwyY3Q=", "8tqhRPpF"));
            K2(constraintLayout2, true, this.C0);
        }
        ReaderPDFCore readerPDFCore = this.f25317x;
        if (readerPDFCore != null) {
            readerPDFCore.doPageManagerStateCallback();
        }
        x2();
    }

    public final void m2() {
        boolean z10;
        int i10;
        int i11 = 0;
        this.R = false;
        q2().f30876p = false;
        o2().I.setVisibility(0);
        o2().f1265e.setImageResource(R.drawable.ic_close_black);
        TextView textView = o2().G;
        AppCompatImageView appCompatImageView = o2().f1272l;
        kotlin.jvm.internal.g.d(appCompatImageView, ea.a.p("UWklZBpuBS4bdmFuDW8=", "t5suHpwk"));
        if (appCompatImageView.getVisibility() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        textView.setVisibility(i10);
        o2().f1285y.setVisibility(8);
        J2(false);
        o2().A.setVisibility(8);
        if (this.S) {
            LinearLayout linearLayout = (LinearLayout) o2().C.f1302d;
            kotlin.jvm.internal.g.d(linearLayout, ea.a.p("FWkfZB5uUS48aRZzeGx5dFFwIUxs", "TPwqw6uJ"));
            K2(linearLayout, true, this.B0);
            ConstraintLayout constraintLayout = o2().c;
            kotlin.jvm.internal.g.d(constraintLayout, ea.a.p("LWlfZBBuUC45byRTEGwNY3Q=", "LBrkPzwJ"));
            L2(constraintLayout, false);
        } else {
            ConstraintLayout constraintLayout2 = o2().c;
            kotlin.jvm.internal.g.d(constraintLayout2, ea.a.p("UWklZBpuBS4Rb1pTDGwzY3Q=", "8aIsXf6E"));
            K2(constraintLayout2, false, this.C0);
        }
        ArrayList arrayList = (ArrayList) an.a.c.d();
        if (arrayList != null) {
            i11 = arrayList.size();
        }
        if (i11 != 1) {
            h2();
        }
        x2();
    }

    public final void n2() {
        BillingConfigImpl billingConfigImpl = BillingConfigImpl.c;
        billingConfigImpl.getClass();
        if (BillingConfigImpl.s() && billingConfigImpl.z() && !billingConfigImpl.w()) {
            this.f25285x0 = true;
            BaseSubscriptionActivity.a aVar = BaseSubscriptionActivity.L;
            String p10 = ea.a.p("Vng_chJjdA==", "5IHq4CvO");
            aVar.getClass();
            BaseSubscriptionActivity.a.a(this, p10);
        } else if (A1() && z1(20000000L)) {
            ArrayList arrayList = new ArrayList();
            ArrayList<bn.a> arrayList2 = (ArrayList) an.a.c.d();
            if (arrayList2 != null) {
                if (arrayList2.size() > 1) {
                    kotlin.collections.j.j0(arrayList2, new c());
                }
                for (bn.a aVar2 : arrayList2) {
                    arrayList.add(Integer.valueOf(aVar2.f5491e));
                }
            }
            u2();
            o2().f1280t.setFrame(0);
            o2().f1280t.setVisibility(0);
            w0.a().c.execute(new com.facebook.appevents.g(15, this, arrayList));
        }
    }

    public final am.p o2() {
        return (am.p) this.H.getValue();
    }

    @Override // jl.a, androidx.fragment.app.u, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i11 == -1 && i10 == 205) {
            androidx.lifecycle.w<ArrayList<bn.a>> wVar = an.a.f1699a;
            List<? extends ul.b> list = an.a.f1702e;
            an.a.f1702e = null;
            if (list != null) {
                w0.a().c.execute(new n0.g(27, this, list));
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        boolean z10;
        List<Fragment> H = getSupportFragmentManager().H();
        kotlin.jvm.internal.g.d(H, ea.a.p("NnVGcA1yMEY6YQFtUW4jTVluM2cschhmBmEWbTRuNnM=", "7BE6bDFq"));
        ArrayList arrayList = new ArrayList();
        for (Object obj : H) {
            if (obj instanceof pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.fragment.d) {
                arrayList.add(obj);
            }
        }
        boolean z11 = true;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.fragment.d) it.next()).t0();
            }
            return;
        }
        LottieAnimationView lottieAnimationView = o2().f1280t;
        kotlin.jvm.internal.g.d(lottieAnimationView, ea.a.p("UWklZBpuBS4CYVNlJGE4YSNlQEwpdDdpMUUKdDNhU3R_bypkGm5n", "TrA0d8hO"));
        if (lottieAnimationView.getVisibility() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            cg.a<tf.d> aVar = new cg.a<tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.PDFPageManagerActivity$onBackPressed$2
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
                    PDFPageManagerActivity pDFPageManagerActivity = PDFPageManagerActivity.this;
                    pDFPageManagerActivity.E0.add(Long.valueOf(pDFPageManagerActivity.F0));
                    PDFPageManagerActivity pDFPageManagerActivity2 = PDFPageManagerActivity.this;
                    pDFPageManagerActivity2.f25270i0.sendEmptyMessage(pDFPageManagerActivity2.Y);
                }
            };
            if (this.G0 == null) {
                String string = getResources().getString(R.string.arg_res_0x7f1304dc);
                kotlin.jvm.internal.g.d(string, ea.a.p("QWU4bwZyAWUBLlNlHVMici1uVSgULjB0tYDSb0BjIV9BZSZvBWU9cQdpQF8Icz1fI3BGKQ==", "Wt5INqjS"));
                String string2 = getResources().getString(R.string.arg_res_0x7f130131);
                kotlin.jvm.internal.g.d(string2, ea.a.p("QWU4bwZyAWUBLlNlHVMici1uVSgULjB00oCUYTR0AG9dXz5uFWkMaQFoa3EcaSJfI3BGKQ==", "02Wibemc"));
                this.G0 = new OperateInterceptDialog(this, string, string2);
            }
            OperateInterceptDialog operateInterceptDialog = this.G0;
            if ((operateInterceptDialog == null || operateInterceptDialog.isShowing()) ? false : false) {
                OperateInterceptDialog operateInterceptDialog2 = this.G0;
                if (operateInterceptDialog2 != null) {
                    operateInterceptDialog2.A = new d0(aVar);
                }
                if (operateInterceptDialog2 != null) {
                    operateInterceptDialog2.show();
                }
            }
        } else if (!this.V) {
            if (this.f25279r0) {
                h(getString(R.string.arg_res_0x7f13044f));
            } else if (o2().f1277q.getVisibility() == 0) {
                u2();
            } else if (this.R) {
                if (t2()) {
                    String string3 = getString(R.string.arg_res_0x7f13010e);
                    kotlin.jvm.internal.g.d(string3, ea.a.p("BWUmU0ZyKm4vKDQuR3QlaVZnfGUtaUJfHW0QZzRfNmkScw1tQWcp", "HXbR2C8D"));
                    M2(2, string3);
                    return;
                }
                m2();
            } else if (t2()) {
                String string4 = getString(R.string.arg_res_0x7f13010e);
                kotlin.jvm.internal.g.d(string4, ea.a.p("VGU_UwdyC24VKGYuGnQkaSpnHGUiaTdfJG1UZwJfN2lDcxRtAGcp", "M5gC5Xnw"));
                M2(1, string4);
            } else {
                super.onBackPressed();
            }
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.f, jl.a, androidx.fragment.app.u, androidx.activity.ComponentActivity, k0.j, android.app.Activity
    public final void onCreate(Bundle bundle) {
        PdfPreviewEntity pdfPreviewEntity;
        if (bundle != null) {
            this.f25266e0 = false;
            this.N = bundle.getParcelable(ea.a.p("QWUoeRBsB3IhdFV0ZQ==", "OOYSG9ET"));
            this.R = bundle.getBoolean(ea.a.p("JnN8dRV0XnA2ZQloGmkLZXhvCmVs", "ns82e3uN"));
        } else {
            this.f25266e0 = true;
            this.f25267f0 = false;
            wm.b.c.getClass();
            if (wm.b.h() < 2) {
                wm.b.f31379e.c(wm.b.f31378d[0], Integer.valueOf(wm.b.h() + 1));
            }
            tn.a.a(ReaderPdfApplication.m(), ea.a.p("UG85ZSxtDGcCYVNl", "7gZ8d0ct"));
        }
        this.P = getIntent().getIntExtra(I0, 0);
        Serializable serializableExtra = getIntent().getSerializableExtra(J0);
        if (serializableExtra instanceof PdfPreviewEntity) {
            pdfPreviewEntity = (PdfPreviewEntity) serializableExtra;
        } else {
            pdfPreviewEntity = null;
        }
        this.Q = pdfPreviewEntity;
        super.onCreate(bundle);
        AppOpenSource appOpenSource = AppCoreFilterEvent.f28650a;
        AppCoreFilterEvent.g(ea.a.p("XmElYRRlPXMab3c=", "FuEAvS7l"));
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.f, jl.a, androidx.appcompat.app.c, androidx.fragment.app.u, android.app.Activity
    public final void onDestroy() {
        boolean z10;
        x2 x2Var;
        boolean z11;
        ValueAnimator valueAnimator;
        boolean z12;
        ValueAnimator valueAnimator2;
        ObjectAnimator objectAnimator;
        super.onDestroy();
        removeCallbacksAndMessages(null);
        Handler handler = this.f25313t;
        handler.removeCallbacks(this.f25274m0);
        handler.removeCallbacksAndMessages(null);
        ObjectAnimator objectAnimator2 = this.f25283v0;
        boolean z13 = true;
        if (objectAnimator2 != null && objectAnimator2.isRunning()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && (objectAnimator = this.f25283v0) != null) {
            objectAnimator.cancel();
        }
        j2();
        ValueAnimator valueAnimator3 = this.f25287z0;
        if (valueAnimator3 != null) {
            if (valueAnimator3.isRunning()) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12 && (valueAnimator2 = this.f25287z0) != null) {
                valueAnimator2.cancel();
            }
        }
        ValueAnimator valueAnimator4 = this.A0;
        if (valueAnimator4 != null) {
            if (valueAnimator4.isRunning()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11 && (valueAnimator = this.A0) != null) {
                valueAnimator.cancel();
            }
        }
        x2 x2Var2 = this.T;
        if (x2Var2 == null || !x2Var2.isShowing()) {
            z13 = false;
        }
        if (z13 && (x2Var = this.T) != null) {
            x2Var.cancel();
        }
        w0.a().c.execute(new q(this, 0));
    }

    @Override // jl.a, androidx.fragment.app.u, android.app.Activity
    public final void onResume() {
        super.onResume();
        x2 x2Var = this.T;
        if (x2Var != null) {
            x2Var.J();
        }
        if (this.f25284w0) {
            this.f25284w0 = false;
            if (BillingConfigImpl.c.w()) {
                k2(this.f25286y0);
            }
        }
        if (this.f25285x0) {
            this.f25285x0 = false;
            if (BillingConfigImpl.c.w()) {
                n2();
            }
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.f, jl.a, androidx.activity.ComponentActivity, k0.j, android.app.Activity
    public final void onSaveInstanceState(Bundle outState) {
        Parcelable parcelable;
        kotlin.jvm.internal.g.e(outState, "outState");
        super.onSaveInstanceState(outState);
        String p10 = ea.a.p("NWU7eRRsLXIbdAd0ZQ==", "FKGXwHVy");
        RecyclerView.m layoutManager = o2().f1284x.getLayoutManager();
        if (layoutManager != null) {
            parcelable = layoutManager.r0();
        } else {
            parcelable = null;
        }
        outState.putParcelable(p10, parcelable);
        outState.putBoolean(ea.a.p("WnMGdR90C3AeZXdoBmk1ZQlvVmVs", "PV5JJKTL"), this.R);
    }

    public final vm.i q2() {
        return (vm.i) this.f25271j0.getValue();
    }

    public final int r2() {
        int[] iArr = new int[2];
        o2().f1284x.getLocationInWindow(iArr);
        int U = iArr[1] - pdf.pdfreader.viewer.editor.free.utils.t0.U(this);
        if (U < 0) {
            return -1;
        }
        return (int) (getResources().getDimension(R.dimen.dp_6) + U);
    }

    public final an.b s2() {
        return (an.b) this.J.getValue();
    }

    public final boolean t2() {
        ReaderPDFCore readerPDFCore = this.f25317x;
        if (readerPDFCore != null) {
            return readerPDFCore.isUndoable();
        }
        return false;
    }

    public final void u2() {
        if (o2().f1277q.getVisibility() == 0) {
            tn.a.b(this, ea.a.p("Xm4scBJnZQ==", "44R0eRrz"), ea.a.p("Im5WcBhnUl8_eD5yFGMcX1FsCV8mbApzZQ==", "zDB61bkQ"));
        }
        ObjectAnimator objectAnimator = this.D0;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        o2().f1277q.setVisibility(8);
    }

    public final void v2() {
        if (this.B0 == 0) {
            this.B0 = getResources().getDimensionPixelSize(R.dimen.dp_44);
        }
        if (this.C0 == 0) {
            this.C0 = getResources().getDimensionPixelSize(R.dimen.dp_34);
        }
    }

    @Override // jl.a
    public final void w1(int i10) {
        if (i10 == 1) {
            n2();
        }
    }

    public final boolean w2() {
        int i10;
        ArrayList arrayList = (ArrayList) s2().f1705d.d();
        if (arrayList != null) {
            i10 = arrayList.size();
        } else {
            i10 = 0;
        }
        if (i10 <= 0 || i10 != q2().f30865e.size()) {
            return false;
        }
        return true;
    }

    public final void x2() {
        if (q2().getItemCount() > 0) {
            q2().notifyItemRangeChanged(0, q2().getItemCount(), (ArrayList) this.L.getValue());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
        if (r4 == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void y2(java.lang.Throwable r8) {
        /*
            r7 = this;
            int r0 = r7.f25262a0
            int r1 = r7.X
            pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.PDFPageManagerActivity$handler$1 r2 = r7.f25270i0
            if (r8 == 0) goto L51
            boolean r3 = r8 instanceof java.io.IOException
            if (r3 == 0) goto L25
            java.lang.String r3 = r8.getMessage()
            r4 = 0
            if (r3 == 0) goto L23
            java.lang.String r5 = "fW9rcwNhAWVSbFFmHSA5bmRkV3YvY2U="
            java.lang.String r6 = "TPgD2I5L"
            java.lang.String r5 = ea.a.p(r5, r6)
            boolean r3 = kotlin.text.k.O(r3, r5, r4)
            r5 = 1
            if (r3 != r5) goto L23
            r4 = r5
        L23:
            if (r4 != 0) goto L2d
        L25:
            r3 = 20
            boolean r3 = jl.a.N1(r3)
            if (r3 == 0) goto L3b
        L2d:
            int r8 = r7.f25263b0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            android.os.Message r8 = r2.obtainMessage(r1, r8)
            r8.sendToTarget()
            goto L4e
        L3b:
            boolean r8 = r8 instanceof java.lang.OutOfMemoryError
            if (r8 == 0) goto L42
            int r8 = r7.Z
            goto L43
        L42:
            r8 = r0
        L43:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            android.os.Message r8 = r2.obtainMessage(r1, r8)
            r8.sendToTarget()
        L4e:
            tf.d r8 = tf.d.f30009a
            goto L52
        L51:
            r8 = 0
        L52:
            if (r8 != 0) goto L5f
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            android.os.Message r8 = r2.obtainMessage(r1, r8)
            r8.sendToTarget()
        L5f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.PDFPageManagerActivity.y2(java.lang.Throwable):void");
    }

    public final void z2() {
        int i10;
        boolean w22 = w2();
        if (o2().f1273m.getVisibility() == 0) {
            o2().f1263b.setChecked(w22);
        }
        boolean w23 = w2();
        ArrayList arrayList = (ArrayList) s2().f1705d.d();
        if (arrayList != null) {
            i10 = arrayList.size();
        } else {
            i10 = 0;
        }
        D2(i10, w23);
    }

    /* compiled from: PDFPageManagerActivity.kt */
    /* loaded from: classes3.dex */
    public static final class b implements sn.a {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ List<Integer> f25289b;
        public final /* synthetic */ long c;

        public b(List<Integer> list, long j10) {
            this.f25289b = list;
            this.c = j10;
        }

        @Override // sn.a
        public final void a(Exception exc) {
            a aVar = PDFPageManagerActivity.H0;
            PDFPageManagerActivity pDFPageManagerActivity = PDFPageManagerActivity.this;
            pDFPageManagerActivity.y2(exc);
            try {
                File file = pDFPageManagerActivity.f25264c0;
                if (file != null) {
                    file.delete();
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        @Override // sn.a
        public final void b(String str) {
            pdf.pdfreader.viewer.editor.free.observer.a aVar = StorageFileObserver.f25899a;
            if (str == null) {
                str = "";
            }
            StorageFileObserver.b(str);
        }

        @Override // sn.a
        public final void c(String str) {
            PDFPageManagerActivity pDFPageManagerActivity = PDFPageManagerActivity.this;
            long j10 = this.c;
            File file = new File(str);
            if (file.exists()) {
                PdfPreviewEntity pdfPreviewEntity = new PdfPreviewEntity();
                pdfPreviewEntity.setDate(file.lastModified());
                pdfPreviewEntity.setPath(file.getAbsolutePath());
                pdfPreviewEntity.setSize(file.length());
                pdfPreviewEntity.setName(bg.b.B0(file));
                pdfPreviewEntity.setOtherStrOne(ea.a.p("Y0RG", "UXma17mF"));
                pdfPreviewEntity.setPage(this.f25289b.size());
                bm.c.b(pDFPageManagerActivity).f(ge.a.H(pdfPreviewEntity), new a(str, pdfPreviewEntity, pDFPageManagerActivity, j10));
            }
            if (tf.d.f30009a == null) {
                a aVar = PDFPageManagerActivity.H0;
                PDFPageManagerActivity.this.y2(null);
            }
        }

        /* compiled from: PDFPageManagerActivity.kt */
        /* loaded from: classes3.dex */
        public static final class a implements c.InterfaceC0042c {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f25290a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ PdfPreviewEntity f25291b;
            public final /* synthetic */ PDFPageManagerActivity c;

            /* renamed from: d  reason: collision with root package name */
            public final /* synthetic */ long f25292d;

            public a(String str, PdfPreviewEntity pdfPreviewEntity, PDFPageManagerActivity pDFPageManagerActivity, long j10) {
                this.f25290a = str;
                this.f25291b = pdfPreviewEntity;
                this.c = pDFPageManagerActivity;
                this.f25292d = j10;
            }

            @Override // bm.c.InterfaceC0042c
            public final void b(ArrayList arrayList) {
                String str;
                long j10 = this.f25292d;
                PdfPreviewEntity pdfPreviewEntity = this.f25291b;
                PDFPageManagerActivity pDFPageManagerActivity = this.c;
                int i10 = 0;
                if (!arrayList.isEmpty()) {
                    str = ((PdfPreviewEntity) arrayList.get(0)).getPath();
                } else {
                    str = this.f25290a;
                }
                pdf.pdfreader.viewer.editor.free.observer.a aVar = StorageFileObserver.f25899a;
                Context m10 = ReaderPdfApplication.m();
                kotlin.jvm.internal.g.d(m10, ea.a.p("VGU_SR1zFmEcY1EoKQ==", "KKbT2Dm0"));
                kotlin.jvm.internal.g.d(str, ea.a.p("Q2E_aDVvEERi", "n490BQKG"));
                StorageFileObserver.c(m10, str, true);
                try {
                    pdf.pdfreader.viewer.editor.free.utils.v.b();
                    if (true ^ arrayList.isEmpty()) {
                        pdfPreviewEntity = (PdfPreviewEntity) arrayList.get(0);
                    }
                    Message obtainMessage = pDFPageManagerActivity.f25270i0.obtainMessage(pDFPageManagerActivity.W, pdfPreviewEntity);
                    kotlin.jvm.internal.g.d(obtainMessage, ea.a.p("J2FfZBVlRS41Yj5hHG4lZUZzD2cgKG8gtIDMIE8geCBvIBEgWSAXIHogaiBVIEggFSBOKQ==", "4FbEVjoX"));
                    long currentTimeMillis = System.currentTimeMillis() - j10;
                    o9.d.s(pDFPageManagerActivity.G, "extract use time: " + currentTimeMillis);
                    int i11 = (int) (((long) OS2WindowsMetricsTable.WEIGHT_CLASS_MEDIUM) - currentTimeMillis);
                    if (i11 > 0) {
                        i10 = i11;
                    }
                    pDFPageManagerActivity.f25270i0.sendMessageDelayed(obtainMessage, i10);
                } catch (Throwable th2) {
                    if (true ^ arrayList.isEmpty()) {
                        pdfPreviewEntity = (PdfPreviewEntity) arrayList.get(0);
                    }
                    Message obtainMessage2 = pDFPageManagerActivity.f25270i0.obtainMessage(pDFPageManagerActivity.W, pdfPreviewEntity);
                    kotlin.jvm.internal.g.d(obtainMessage2, ea.a.p("J2FfZBVlRS41Yj5hHG4lZUZzD2cgKG8g0IDqIGUgSiBvIBEgWSAXIHogaiBVIEggFSBOKQ==", "WwoD2LEj"));
                    long currentTimeMillis2 = System.currentTimeMillis() - j10;
                    o9.d.s(pDFPageManagerActivity.G, "extract use time: " + currentTimeMillis2);
                    int i12 = (int) (((long) OS2WindowsMetricsTable.WEIGHT_CLASS_MEDIUM) - currentTimeMillis2);
                    if (i12 > 0) {
                        i10 = i12;
                    }
                    pDFPageManagerActivity.f25270i0.sendMessageDelayed(obtainMessage2, i10);
                    throw th2;
                }
            }

            @Override // bm.c.InterfaceC0042c
            public final void a() {
            }
        }
    }

    @Override // lib.zj.pdfeditor.PDFListener
    public void onPdfEvent(int i10, int i11, Object obj) {
    }
}

package pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui;

import am.n1;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.g0;
import androidx.lifecycle.k0;
import androidx.lifecycle.m0;
import androidx.lifecycle.o0;
import androidx.lifecycle.w;
import androidx.lifecycle.x;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.play.core.assetpacks.b1;
import en.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;
import lib.zj.pdfeditor.ReaderPDFCore;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.bean.ThirdOpenBean;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.feature.billing.BillingConfigImpl;
import pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity;
import pdf.pdfreader.viewer.editor.free.feature.bridge.SplashLoadingFragment;
import pdf.pdfreader.viewer.editor.free.feature.pdf2image.adapter.Pdf2ImagePicPreviewAdapter;
import pdf.pdfreader.viewer.editor.free.feature.pdf2image.data.ImageFileInfo;
import pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.Pdf2ImageBigPicPreviewActivity;
import pdf.pdfreader.viewer.editor.free.feature.pdf2image.widget.Pdf2ImageConvertCompletedView;
import pdf.pdfreader.viewer.editor.free.fnbridge.FlutterEncryptConfig;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderHomeActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.tools.ToolsType;
import pdf.pdfreader.viewer.editor.free.ui.myview.InterceptTouchFrameLayout;
import pdf.pdfreader.viewer.editor.free.ui.myview.ReaderRoundProgressBar;
import pdf.pdfreader.viewer.editor.free.ui.widget.ProgressView;
import pdf.pdfreader.viewer.editor.free.utils.drag.DragSelectionProcessor;
import pdf.pdfreader.viewer.editor.free.utils.event.AppCoreFilterEvent;
import pdf.pdfreader.viewer.editor.free.utils.event.AppOpenSource;
import pdf.pdfreader.viewer.editor.free.utils.event.EventCenter;
import pdf.pdfreader.viewer.editor.free.utils.h1;
import pdf.pdfreader.viewer.editor.free.utils.share.ThirdOpenParseManager;
import pdf.pdfreader.viewer.editor.free.utils.share.ThirdOpenStatus;
import pdf.pdfreader.viewer.editor.free.utils.t1;
import pdf.pdfreader.viewer.editor.free.utils.w0;
import x0.f0;
import x0.n0;

/* compiled from: Pdf2ImagePicPreviewActivity.kt */
/* loaded from: classes3.dex */
public final class Pdf2ImagePicPreviewActivity extends BasePdf2ImageActivity {
    public static final /* synthetic */ int I0 = 0;
    public boolean B0;
    public int C0;
    public ValueAnimator D0;
    public ValueAnimator E0;
    public boolean F0;
    public boolean G0;
    public boolean H0;

    /* renamed from: r0  reason: collision with root package name */
    public pdf.pdfreader.viewer.editor.free.utils.drag.a f25520r0;

    /* renamed from: t0  reason: collision with root package name */
    public boolean f25522t0;

    /* renamed from: v0  reason: collision with root package name */
    public boolean f25524v0;

    /* renamed from: w0  reason: collision with root package name */
    public boolean f25525w0;

    /* renamed from: x0  reason: collision with root package name */
    public boolean f25526x0;

    /* renamed from: y0  reason: collision with root package name */
    public Parcelable f25527y0;

    /* renamed from: z0  reason: collision with root package name */
    public Boolean f25528z0;

    /* renamed from: o0  reason: collision with root package name */
    public final tf.c f25517o0 = kotlin.a.a(new cg.a<am.n>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.Pdf2ImagePicPreviewActivity$binding$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final am.n invoke() {
            View inflate = Pdf2ImagePicPreviewActivity.this.getLayoutInflater().inflate(R.layout.activity_pdf2image_pic_preview, (ViewGroup) null, false);
            int i10 = R.id.check_all;
            CheckBox checkBox = (CheckBox) com.google.android.play.core.assetpacks.c.u(inflate, R.id.check_all);
            if (checkBox != null) {
                i10 = R.id.check_no_watermark;
                CheckBox checkBox2 = (CheckBox) com.google.android.play.core.assetpacks.c.u(inflate, R.id.check_no_watermark);
                if (checkBox2 != null) {
                    i10 = R.id.check_watermark;
                    CheckBox checkBox3 = (CheckBox) com.google.android.play.core.assetpacks.c.u(inflate, R.id.check_watermark);
                    if (checkBox3 != null) {
                        i10 = R.id.con_bottom;
                        ConstraintLayout constraintLayout = (ConstraintLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.con_bottom);
                        if (constraintLayout != null) {
                            i10 = R.id.con_preview_save;
                            ConstraintLayout constraintLayout2 = (ConstraintLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.con_preview_save);
                            if (constraintLayout2 != null) {
                                i10 = R.id.iv_back;
                                AppCompatImageView appCompatImageView = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.iv_back);
                                if (appCompatImageView != null) {
                                    i10 = R.id.iv_vip;
                                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.iv_vip);
                                    if (appCompatImageView2 != null) {
                                        i10 = R.id.layout_all;
                                        LinearLayout linearLayout = (LinearLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.layout_all);
                                        if (linearLayout != null) {
                                            i10 = R.id.layout_no_watermark;
                                            ConstraintLayout constraintLayout3 = (ConstraintLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.layout_no_watermark);
                                            if (constraintLayout3 != null) {
                                                i10 = R.id.layout_watermark;
                                                LinearLayout linearLayout2 = (LinearLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.layout_watermark);
                                                if (linearLayout2 != null) {
                                                    i10 = R.id.ll_convert;
                                                    LinearLayout linearLayout3 = (LinearLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.ll_convert);
                                                    if (linearLayout3 != null) {
                                                        i10 = R.id.ll_convert_space;
                                                        View u7 = com.google.android.play.core.assetpacks.c.u(inflate, R.id.ll_convert_space);
                                                        if (u7 != null) {
                                                            i10 = R.id.ll_mark_container;
                                                            LinearLayout linearLayout4 = (LinearLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.ll_mark_container);
                                                            if (linearLayout4 != null) {
                                                                i10 = R.id.lyLoading;
                                                                LinearLayout linearLayout5 = (LinearLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.lyLoading);
                                                                if (linearLayout5 != null) {
                                                                    i10 = R.id.pdf2image_convert_completed;
                                                                    Pdf2ImageConvertCompletedView pdf2ImageConvertCompletedView = (Pdf2ImageConvertCompletedView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.pdf2image_convert_completed);
                                                                    if (pdf2ImageConvertCompletedView != null) {
                                                                        i10 = R.id.pdf_to_image_fl_rv_container;
                                                                        if (((InterceptTouchFrameLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.pdf_to_image_fl_rv_container)) != null) {
                                                                            i10 = R.id.pdf_to_image_rv;
                                                                            RecyclerView recyclerView = (RecyclerView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.pdf_to_image_rv);
                                                                            if (recyclerView != null) {
                                                                                i10 = R.id.progressView;
                                                                                if (((ProgressView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.progressView)) != null) {
                                                                                    i10 = R.id.root_preview_progressbar;
                                                                                    View u10 = com.google.android.play.core.assetpacks.c.u(inflate, R.id.root_preview_progressbar);
                                                                                    if (u10 != null) {
                                                                                        n1 a10 = n1.a(u10);
                                                                                        ConstraintLayout constraintLayout4 = (ConstraintLayout) inflate;
                                                                                        i10 = R.id.splash_root;
                                                                                        FrameLayout frameLayout = (FrameLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.splash_root);
                                                                                        if (frameLayout != null) {
                                                                                            i10 = R.id.title_bar;
                                                                                            if (((ConstraintLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.title_bar)) != null) {
                                                                                                i10 = R.id.top_select_all;
                                                                                                if (((TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.top_select_all)) != null) {
                                                                                                    i10 = R.id.tv_no_watermark;
                                                                                                    if (((AppCompatTextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_no_watermark)) != null) {
                                                                                                        i10 = R.id.tv_page_next;
                                                                                                        TextView textView = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_page_next);
                                                                                                        if (textView != null) {
                                                                                                            i10 = R.id.tv_save;
                                                                                                            AppCompatTextView appCompatTextView = (AppCompatTextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_save);
                                                                                                            if (appCompatTextView != null) {
                                                                                                                i10 = R.id.tv_share;
                                                                                                                TextView textView2 = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_share);
                                                                                                                if (textView2 != null) {
                                                                                                                    i10 = R.id.view_bottom_divider;
                                                                                                                    View u11 = com.google.android.play.core.assetpacks.c.u(inflate, R.id.view_bottom_divider);
                                                                                                                    if (u11 != null) {
                                                                                                                        i10 = R.id.view_status_bar;
                                                                                                                        View u12 = com.google.android.play.core.assetpacks.c.u(inflate, R.id.view_status_bar);
                                                                                                                        if (u12 != null) {
                                                                                                                            i10 = R.id.view_top_divider;
                                                                                                                            View u13 = com.google.android.play.core.assetpacks.c.u(inflate, R.id.view_top_divider);
                                                                                                                            if (u13 != null) {
                                                                                                                                return new am.n(constraintLayout4, checkBox, checkBox2, checkBox3, constraintLayout, constraintLayout2, appCompatImageView, appCompatImageView2, linearLayout, constraintLayout3, linearLayout2, linearLayout3, u7, linearLayout4, linearLayout5, pdf2ImageConvertCompletedView, recyclerView, a10, constraintLayout4, frameLayout, textView, appCompatTextView, textView2, u11, u12, u13);
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
            throw new NullPointerException(ea.a.p("AmlCcxBuUCAoZTt1HHINZBV2B2UyIBJpNWgYSQ06IA==", "ky1OA8IC").concat(inflate.getResources().getResourceName(i10)));
        }
    });

    /* renamed from: p0  reason: collision with root package name */
    public final tf.c f25518p0 = kotlin.a.a(new cg.a<en.b>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.Pdf2ImagePicPreviewActivity$viewModel$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final en.b invoke() {
            return (en.b) new m0(Pdf2ImagePicPreviewActivity.this).a(en.b.class);
        }
    });

    /* renamed from: q0  reason: collision with root package name */
    public final tf.c f25519q0 = kotlin.a.a(new cg.a<ArrayList<String>>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.Pdf2ImagePicPreviewActivity$payloads$2
        @Override // cg.a
        public final ArrayList<String> invoke() {
            return ge.a.j("");
        }
    });

    /* renamed from: s0  reason: collision with root package name */
    public final ArrayList<bn.a> f25521s0 = new ArrayList<>();

    /* renamed from: u0  reason: collision with root package name */
    public final k0 f25523u0 = new k0(kotlin.jvm.internal.i.a(pdf.pdfreader.viewer.editor.free.feature.bridge.c.class), new cg.a<o0>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.Pdf2ImagePicPreviewActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final o0 invoke() {
            o0 viewModelStore = ComponentActivity.this.getViewModelStore();
            kotlin.jvm.internal.g.d(viewModelStore, ea.a.p("RWkudz5vBmUeU0BvG2U=", "SQarj759"));
            return viewModelStore;
        }
    }, new cg.a<m0.b>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.Pdf2ImagePicPreviewActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final m0.b invoke() {
            m0.b defaultViewModelProviderFactory = ComponentActivity.this.getDefaultViewModelProviderFactory();
            kotlin.jvm.internal.g.d(defaultViewModelProviderFactory, ea.a.p("V2UtYQZsFlYbZUNNBmQzbBRyXXYvZCZyFWFRdD9yeQ==", "S2PNNlXT"));
            return defaultViewModelProviderFactory;
        }
    }, new cg.a<n1.a>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.Pdf2ImagePicPreviewActivity$special$$inlined$viewModels$default$3
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
                kotlin.jvm.internal.g.d(defaultViewModelCreationExtras, ea.a.p("R2gic11kB2YTdVh0P2kzdwlvVmUqQzFlFHQkbwxFGXRBYXM=", "uMbaawM0"));
                return defaultViewModelCreationExtras;
            }
            return aVar;
        }
    });
    public final tf.c A0 = kotlin.a.a(new cg.a<Pdf2ImagePicPreviewAdapter>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.Pdf2ImagePicPreviewActivity$pdf2ImagePicPreviewAdapter$2
        {
            super(0);
        }

        @Override // cg.a
        public final Pdf2ImagePicPreviewAdapter invoke() {
            Pdf2ImagePicPreviewActivity pdf2ImagePicPreviewActivity = Pdf2ImagePicPreviewActivity.this;
            int i10 = Pdf2ImagePicPreviewActivity.I0;
            final Pdf2ImagePicPreviewAdapter pdf2ImagePicPreviewAdapter = new Pdf2ImagePicPreviewAdapter(pdf2ImagePicPreviewActivity.d3());
            final Pdf2ImagePicPreviewActivity pdf2ImagePicPreviewActivity2 = Pdf2ImagePicPreviewActivity.this;
            pdf2ImagePicPreviewAdapter.f25435k = new cg.l<Integer, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.Pdf2ImagePicPreviewActivity$pdf2ImagePicPreviewAdapter$2$1$1
                {
                    super(1);
                }

                @Override // cg.l
                public /* bridge */ /* synthetic */ tf.d invoke(Integer num) {
                    invoke(num.intValue());
                    return tf.d.f30009a;
                }

                public final void invoke(int i11) {
                    pdf.pdfreader.viewer.editor.free.utils.drag.a aVar = Pdf2ImagePicPreviewActivity.this.f25520r0;
                    if (aVar != null) {
                        aVar.d(i11);
                    }
                }
            };
            pdf2ImagePicPreviewAdapter.f25436l = new cg.p<bn.a, Integer, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.Pdf2ImagePicPreviewActivity$pdf2ImagePicPreviewAdapter$2$1$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // cg.p
                public /* bridge */ /* synthetic */ tf.d invoke(bn.a aVar, Integer num) {
                    invoke(aVar, num.intValue());
                    return tf.d.f30009a;
                }

                public final void invoke(bn.a item, int i11) {
                    kotlin.jvm.internal.g.e(item, "item");
                    tn.a.d(Pdf2ImagePicPreviewActivity.this, ea.a.p("LG9fdhxydA==", "vGFrWTQy"), ea.a.p("PzJYYxZuQWUodBV2HGUfX1ZsB2Nr", "DDm6XZXm"), androidx.activity.f.m(Pdf2ImagePicPreviewActivity.this.u2(), "_", Pdf2ImagePicPreviewActivity.this.r2()), false);
                    Pdf2ImageBigPicPreviewActivity.a aVar = Pdf2ImageBigPicPreviewActivity.f25491w0;
                    Pdf2ImagePicPreviewActivity pdf2ImagePicPreviewActivity3 = Pdf2ImagePicPreviewActivity.this;
                    String str = pdf2ImagePicPreviewActivity3.I;
                    boolean z10 = pdf2ImagePicPreviewAdapter.f25432h;
                    String str2 = pdf2ImagePicPreviewActivity3.K;
                    String str3 = pdf2ImagePicPreviewActivity3.J;
                    int i12 = item.f5491e;
                    boolean J2 = pdf2ImagePicPreviewActivity3.J2();
                    aVar.getClass();
                    Pdf2ImageBigPicPreviewActivity.a.a(pdf2ImagePicPreviewActivity3, str, z10, str2, str3, i12, J2);
                }
            };
            pdf2ImagePicPreviewAdapter.f25437m = new cg.a<tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.Pdf2ImagePicPreviewActivity$pdf2ImagePicPreviewAdapter$2$1$3
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
                    Pdf2ImagePicPreviewActivity pdf2ImagePicPreviewActivity3 = Pdf2ImagePicPreviewActivity.this;
                    String string = pdf2ImagePicPreviewActivity3.getString(R.string.arg_res_0x7f130257);
                    kotlin.jvm.internal.g.d(string, ea.a.p("VGU_UwdyC24VKGYuGnQkaSpnHG0neBxsHW0IdApyCGFQaC5kLGcSdCk=", "taUm2c1T"));
                    pdf2ImagePicPreviewActivity3.V2(string);
                }
            };
            return pdf2ImagePicPreviewAdapter;
        }
    });

    /* compiled from: Pdf2ImagePicPreviewActivity.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        public static void a(Context context, String pdfPath, String str, String pdfPwd, boolean z10) {
            kotlin.jvm.internal.g.e(context, "context");
            kotlin.jvm.internal.g.e(pdfPath, "pdfPath");
            kotlin.jvm.internal.g.e(pdfPwd, "pdfPwd");
            ReaderPdfApplication.k().g(null);
            w<ArrayList<bn.a>> wVar = en.a.f16815a;
            a.C0215a.a();
            Intent intent = new Intent(context, Pdf2ImagePicPreviewActivity.class);
            intent.putExtra(ea.a.p("P2RXXwlhQ2g=", "L2RY3zU3"), pdfPath);
            intent.putExtra(ea.a.p("JnNubBZuUF8zbStnZQ==", "ZiYnIvAT"), z10);
            intent.putExtra(ea.a.p("VXIkbQ==", "aWeX5Mu7"), str);
            intent.putExtra(ea.a.p("P2RXXwl3ZA==", "tlmjw6Li"), pdfPwd);
            context.startActivity(intent);
            if (z10) {
                tn.a.a(ReaderPdfApplication.m(), ea.a.p("UG85ZSxwFm9s", "Maa3yCmd"));
                return;
            }
            tn.a.a(ReaderPdfApplication.m(), ea.a.p("LG9DZSZwQ29p", "ou2RYZgN"));
        }
    }

    /* compiled from: Pdf2ImagePicPreviewActivity.kt */
    /* loaded from: classes3.dex */
    public static final class b implements x<Map<Uri, ? extends ip.c>> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ThirdOpenBean f25529a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Pdf2ImagePicPreviewActivity f25530b;
        public final /* synthetic */ Bundle c;

        public b(ThirdOpenBean thirdOpenBean, Pdf2ImagePicPreviewActivity pdf2ImagePicPreviewActivity, Bundle bundle) {
            this.f25529a = thirdOpenBean;
            this.f25530b = pdf2ImagePicPreviewActivity;
            this.c = bundle;
        }

        @Override // androidx.lifecycle.x
        public final void m(Map<Uri, ? extends ip.c> map) {
            String str;
            Map<Uri, ? extends ip.c> map2 = map;
            if (map2 != null) {
                ea.a.p("G2hYch1PR2U0UCtyBmUlYVthCWVy", "r6KA2GMI");
                map2.toString();
                ip.c cVar = map2.get(this.f25529a.getUri());
                Pdf2ImagePicPreviewActivity pdf2ImagePicPreviewActivity = this.f25530b;
                if (cVar != null) {
                    ThirdOpenStatus thirdOpenStatus = ThirdOpenStatus.PARSE;
                    ThirdOpenStatus thirdOpenStatus2 = cVar.f18970b;
                    if (thirdOpenStatus2 != thirdOpenStatus) {
                        pdf2ImagePicPreviewActivity.f25524v0 = false;
                        pdf2ImagePicPreviewActivity.b3().f1133s.setVisibility(0);
                        ViewGroup viewGroup = (ViewGroup) pdf2ImagePicPreviewActivity.findViewById(16908290);
                        if (viewGroup != null) {
                            viewGroup.removeView(pdf2ImagePicPreviewActivity.findViewById(R.id.loadingRoot));
                            try {
                                h1.f(androidx.core.content.a.getColor(pdf2ImagePicPreviewActivity, R.color.no_color), pdf2ImagePicPreviewActivity, pdf.pdfreader.viewer.editor.free.utils.extension.c.h(pdf2ImagePicPreviewActivity), pdf2ImagePicPreviewActivity.f19294h);
                            } catch (Exception e10) {
                                e10.printStackTrace();
                            }
                        }
                        pdf2ImagePicPreviewActivity.R2();
                        if (thirdOpenStatus2 != ThirdOpenStatus.DONE) {
                            t1.b(ea.a.p("R2QJUEBlAGktd0Z0XGklZHdwN25pcFdyB2U0ciNvMDE=", "LR7o2v29"));
                            pdf2ImagePicPreviewActivity.U2();
                        } else {
                            PdfPreviewEntity pdfPreviewEntity = cVar.c;
                            if (pdfPreviewEntity != null) {
                                String path = pdfPreviewEntity.getPath();
                                kotlin.jvm.internal.g.d(path, ea.a.p("ImgBclNPOWUmUgNzQWwjLl1uJmk9eRhwFXRo", "29Vh7I7s"));
                                pdf2ImagePicPreviewActivity.I = path;
                                pdf2ImagePicPreviewActivity.getIntent().putExtra(ea.a.p("Q2QtXwNhFmg=", "3bqZOX00"), pdf2ImagePicPreviewActivity.I);
                                pdf2ImagePicPreviewActivity.C2(this.c);
                            } else {
                                t1.b(ea.a.p("P2RXUAtlQWk_d2p0HWkaZHpwC25lcARyA2Ugch5vPzI=", "ZI4MpelM"));
                                pdf2ImagePicPreviewActivity.U2();
                            }
                        }
                        ThirdOpenParseManager.f28764f.i(this);
                        return;
                    }
                }
                int i10 = Pdf2ImagePicPreviewActivity.I0;
                pdf2ImagePicPreviewActivity.b3().f1133s.setVisibility(8);
                ViewGroup viewGroup2 = (ViewGroup) pdf2ImagePicPreviewActivity.findViewById(16908290);
                if (viewGroup2 != null) {
                    View inflate = LayoutInflater.from(pdf2ImagePicPreviewActivity).inflate(R.layout.layout_pdf2image_third_wait, viewGroup2, false);
                    View findViewById = inflate.findViewById(R.id.view_status_placeholder);
                    if (findViewById != null) {
                        ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
                        if (layoutParams != null) {
                            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                            layoutParams2.height = aj.b.B(pdf2ImagePicPreviewActivity);
                            findViewById.setLayoutParams(layoutParams2);
                        } else {
                            throw new NullPointerException(ea.a.p("IXVdbFljVm40bz4gF2VIY1RzGiAxb0VuJG5YbgVsOSA7eUFlWWFZZChvI2RbdwFkUmUaLglpC2UqcjlhCW8gdGFMUHkWdUNQO3IrbXM=", "tpjOKupU"));
                        }
                    }
                    ((LottieAnimationView) inflate.findViewById(R.id.loadingLottie)).setAnimation(R.raw.loading);
                    TextView textView = (TextView) inflate.findViewById(R.id.loadingText);
                    Intent intent = pdf2ImagePicPreviewActivity.getIntent();
                    if (intent != null) {
                        str = intent.getStringExtra(ea.a.p("O3lBZT1lRGMOZTJ0", "tyuVhAFb"));
                    } else {
                        str = null;
                    }
                    textView.setText(str);
                    ((ImageView) inflate.findViewById(R.id.loadingBack)).setOnClickListener(new q(pdf2ImagePicPreviewActivity, 1));
                    viewGroup2.addView(inflate, new FrameLayout.LayoutParams(-1, -1));
                }
            }
        }
    }

    /* compiled from: Pdf2ImagePicPreviewActivity.kt */
    /* loaded from: classes3.dex */
    public static final class c extends Pdf2ImageConvertCompletedView.a {
        public c() {
        }

        @Override // pdf.pdfreader.viewer.editor.free.feature.pdf2image.widget.Pdf2ImageConvertCompletedView.a, pdf.pdfreader.viewer.editor.free.feature.pdf2word.widget.BasePdfConvertCompletedView.a
        public final void a() {
            Pdf2ImagePicPreviewActivity pdf2ImagePicPreviewActivity = Pdf2ImagePicPreviewActivity.this;
            pdf.pdfreader.viewer.editor.free.utils.p.q(pdf2ImagePicPreviewActivity, pdf2ImagePicPreviewActivity.w2());
        }

        @Override // pdf.pdfreader.viewer.editor.free.feature.pdf2word.widget.BasePdfConvertCompletedView.a
        public final void close() {
            Pdf2ImagePicPreviewActivity.this.onBackPressed();
        }

        @Override // pdf.pdfreader.viewer.editor.free.feature.pdf2image.widget.Pdf2ImageConvertCompletedView.a, pdf.pdfreader.viewer.editor.free.feature.pdf2word.widget.BasePdfConvertCompletedView.a
        /* renamed from: g */
        public final void b(Context context, List<ImageFileInfo> list) {
            kotlin.jvm.internal.g.e(context, "context");
            super.b(context, list);
            Pdf2ImagePicPreviewActivity pdf2ImagePicPreviewActivity = Pdf2ImagePicPreviewActivity.this;
            pdf.pdfreader.viewer.editor.free.utils.p.p(pdf2ImagePicPreviewActivity, pdf2ImagePicPreviewActivity.w2());
            if (pdf2ImagePicPreviewActivity.L) {
                AppOpenSource appOpenSource = AppCoreFilterEvent.f28650a;
                AppCoreFilterEvent.h(ea.a.p("QzInbx1nPWYbbl1zaA==", "3tSfFofj"));
                return;
            }
            AppOpenSource appOpenSource2 = AppCoreFilterEvent.f28650a;
            AppCoreFilterEvent.h(ea.a.p("STJebRRfFmkmaRVo", "ul97spE7"));
        }

        @Override // pdf.pdfreader.viewer.editor.free.feature.pdf2image.widget.Pdf2ImageConvertCompletedView.a, pdf.pdfreader.viewer.editor.free.feature.pdf2word.widget.BasePdfConvertCompletedView.a
        /* renamed from: h */
        public final void e(Context context, List<ImageFileInfo> list) {
            kotlin.jvm.internal.g.e(context, "context");
            Pdf2ImagePicPreviewActivity pdf2ImagePicPreviewActivity = Pdf2ImagePicPreviewActivity.this;
            pdf.pdfreader.viewer.editor.free.utils.p.n(pdf2ImagePicPreviewActivity, pdf2ImagePicPreviewActivity.w2());
            pdf2ImagePicPreviewActivity.q2(list);
        }
    }

    /* compiled from: Pdf2ImagePicPreviewActivity.kt */
    /* loaded from: classes3.dex */
    public static final class d implements DragSelectionProcessor.b {
        public d() {
        }

        @Override // pdf.pdfreader.viewer.editor.free.utils.drag.DragSelectionProcessor.b
        public final void a(int i10, int i11, boolean z10, boolean z11) {
            Pdf2ImagePicPreviewActivity pdf2ImagePicPreviewActivity = Pdf2ImagePicPreviewActivity.this;
            if (z11) {
                int i12 = Pdf2ImagePicPreviewActivity.I0;
                bn.a aVar = pdf2ImagePicPreviewActivity.c3().f25429e.get(i10);
                kotlin.jvm.internal.g.d(aVar, ea.a.p("WnQubQBbEm8BaUBpBm5d", "Br0M3d1Q"));
                pdf2ImagePicPreviewActivity.f25522t0 = !aVar.f5492f;
            }
            if (i10 > i11) {
                return;
            }
            while (true) {
                int i13 = Pdf2ImagePicPreviewActivity.I0;
                bn.a aVar2 = pdf2ImagePicPreviewActivity.c3().f25429e.get(i10);
                kotlin.jvm.internal.g.d(aVar2, ea.a.p("WnQubQBbEm8BaUBpBm5d", "Br0M3d1Q"));
                bn.a aVar3 = aVar2;
                if (pdf2ImagePicPreviewActivity.f25522t0) {
                    if (pdf2ImagePicPreviewActivity.L) {
                        pdf2ImagePicPreviewActivity.d3().getClass();
                        if (en.b.d() >= 24) {
                            String string = pdf2ImagePicPreviewActivity.getString(R.string.arg_res_0x7f130257);
                            kotlin.jvm.internal.g.d(string, ea.a.p("JGUuUzVyJ24vKDQuR3QlaVZnfG0oeGlsHW0YdA5yJ2EgaD9kHmc-dCk=", "qgCZANXF"));
                            pdf2ImagePicPreviewActivity.V2(string);
                            return;
                        }
                    }
                    if (!aVar3.f5492f) {
                        pdf2ImagePicPreviewActivity.d3().getClass();
                        w<ArrayList<bn.a>> wVar = en.a.f16815a;
                        ArrayList<bn.a> b10 = a.C0215a.b();
                        aVar3.f5492f = true;
                        aVar3.f5493g = b10.size() + 1;
                        b10.add(aVar3);
                        en.a.c.j(b10);
                    }
                } else if (aVar3.f5492f) {
                    pdf2ImagePicPreviewActivity.d3().getClass();
                    w<ArrayList<bn.a>> wVar2 = en.a.f16815a;
                    a.C0215a.d(aVar3);
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

    /* compiled from: Pdf2ImagePicPreviewActivity.kt */
    /* loaded from: classes3.dex */
    public static final class e implements x, kotlin.jvm.internal.e {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ cg.l f25533a;

        public e(cg.l lVar) {
            ea.a.p("KXVfYw1pWG4=", "UjRDGMKQ");
            this.f25533a = lVar;
        }

        @Override // kotlin.jvm.internal.e
        public final cg.l a() {
            return this.f25533a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof x) && (obj instanceof kotlin.jvm.internal.e)) {
                return kotlin.jvm.internal.g.a(this.f25533a, ((kotlin.jvm.internal.e) obj).a());
            }
            return false;
        }

        public final int hashCode() {
            return this.f25533a.hashCode();
        }

        @Override // androidx.lifecycle.x
        public final /* synthetic */ void m(Object obj) {
            this.f25533a.invoke(obj);
        }
    }

    public static final void Y2(Pdf2ImagePicPreviewActivity pdf2ImagePicPreviewActivity, boolean z10) {
        String str;
        String str2;
        if (pdf2ImagePicPreviewActivity.b3().c.isChecked()) {
            if (pdf2ImagePicPreviewActivity.I2()) {
                pdf2ImagePicPreviewActivity.G0 = true;
                pdf2ImagePicPreviewActivity.H0 = z10;
                BaseSubscriptionActivity.a aVar = BaseSubscriptionActivity.L;
                if (pdf2ImagePicPreviewActivity.L) {
                    str = "Q2QtMh9vDGc=";
                    str2 = "2X1PxawI";
                } else {
                    str = "Q2QtMhptZw==";
                    str2 = "SGZabBiH";
                }
                String p10 = ea.a.p(str, str2);
                aVar.getClass();
                BaseSubscriptionActivity.a.a(pdf2ImagePicPreviewActivity, p10);
                return;
            }
            pdf2ImagePicPreviewActivity.S2(z10);
            return;
        }
        pdf2ImagePicPreviewActivity.S2(z10);
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.BasePdf2ImageActivity
    public final View A2() {
        return b3().f1139y;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.BasePdf2ImageActivity
    public final void B2() {
        com.gyf.immersionbar.g gVar;
        if (!this.f19294h && (gVar = this.S) != null) {
            gVar.j(!pdf.pdfreader.viewer.editor.free.utils.extension.c.h(this));
            gVar.i(R.color.colorPrimary);
            gVar.f();
        }
        ((ConstraintLayout) b3().f1132r.f1170f).setVisibility(8);
    }

    @Override // jl.a
    public final void C1() {
        ConstraintLayout constraintLayout = b3().f1133s;
        d9.g gVar = new d9.g(this, 12);
        WeakHashMap<View, n0> weakHashMap = f0.f31435a;
        f0.i.u(constraintLayout, gVar);
    }

    @Override // jl.a
    public final View D1() {
        ConstraintLayout constraintLayout = b3().f1133s;
        kotlin.jvm.internal.g.d(constraintLayout, ea.a.p("LWlfZBBuUC4obyV0I2kNdw==", "wZDVh8sN"));
        return constraintLayout;
    }

    @Override // jl.a
    public final int E1() {
        return 0;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.BasePdf2ImageActivity
    public final boolean J2() {
        return b3().f1118d.isChecked();
    }

    @Override // jl.a
    public final void K1() {
        int i10;
        if (this.L) {
            b3().f1128n.setVisibility(8);
            b3().f1126l.setVisibility(8);
            b3().f1127m.setVisibility(8);
            b3().f1135u.setVisibility(0);
        } else {
            b3().f1128n.setVisibility(0);
            b3().f1135u.setVisibility(8);
            if (G2()) {
                b3().f1126l.setVisibility(8);
                b3().f1127m.setVisibility(8);
                b3().f1120f.setVisibility(0);
            } else {
                b3().f1126l.setVisibility(0);
                b3().f1127m.setVisibility(0);
                b3().f1120f.setVisibility(8);
            }
        }
        b3().f1134t.setOnClickListener(new pdf.pdfreader.viewer.editor.free.feature.billing.ui.q(1));
        LinearLayout linearLayout = (LinearLayout) b3().f1132r.f1168d;
        kotlin.jvm.internal.g.d(linearLayout, ea.a.p("UWklZBpuBS4Ab1t0OXIzdi1lRVA0byRyB3NDYgpyQGxfTztlAWEWZTFvWnQIaThlcg==", "b0knN04T"));
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        if (layoutParams != null) {
            ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
            ((ViewGroup.MarginLayoutParams) bVar).width = z2();
            linearLayout.setLayoutParams(bVar);
            b3().f1130p.setChildListener(new c());
            if (getResources().getDisplayMetrics().heightPixels > getResources().getDisplayMetrics().widthPixels * 1.35d) {
                i10 = 2;
            } else {
                i10 = 3;
            }
            b3().f1131q.setAdapter(c3());
            c3().f25432h = this.L;
            c3().f25433i = ((getResources().getDisplayMetrics().widthPixels - getResources().getDimensionPixelSize(R.dimen.dp_20)) - (getResources().getDimensionPixelSize(R.dimen.dp_12) * i10)) / i10;
            c3().f25434j = (c3().f25433i * ShapeTypes.CHART_STAR) / ShapeTypes.ACTION_BUTTON_BACK_PREVIOUS;
            b3().f1131q.setLayoutManager(new GridLayoutManager(i10));
            b3().f1131q.setHasFixedSize(true);
            DragSelectionProcessor dragSelectionProcessor = new DragSelectionProcessor(new d());
            dragSelectionProcessor.f28620a = DragSelectionProcessor.Mode.Simple;
            pdf.pdfreader.viewer.editor.free.utils.drag.a aVar = new pdf.pdfreader.viewer.editor.free.utils.drag.a();
            aVar.f28634k = dragSelectionProcessor;
            b3().f1131q.r(aVar);
            this.f25520r0 = aVar;
            b3().f1121g.setOnClickListener(new q(this, 0));
            b3().f1123i.setOnClickListener(new k9.c(this, 14));
            b3().f1125k.setOnClickListener(new u4.g(this, 13));
            b3().f1124j.setOnClickListener(new u4.j(this, 14));
            this.f25526x0 = BillingConfigImpl.c.w();
            h3();
            LinearLayout linearLayout2 = b3().f1126l;
            kotlin.jvm.internal.g.d(linearLayout2, ea.a.p("LWlfZBBuUC42bAlvG3YNcnQ=", "ZiPKlXsG"));
            pdf.pdfreader.viewer.editor.free.utils.extension.g.e(linearLayout2, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.Pdf2ImagePicPreviewActivity$initView$9
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
                    Pdf2ImagePicPreviewActivity pdf2ImagePicPreviewActivity = Pdf2ImagePicPreviewActivity.this;
                    String p10 = ea.a.p("LG9fdhxydA==", "hAAorFj4");
                    String p11 = ea.a.p("AzIoYx5uOGU6dDljW3YyckxfMWwgY2s=", "mnsAqNwH");
                    String u22 = Pdf2ImagePicPreviewActivity.this.u2();
                    String r22 = Pdf2ImagePicPreviewActivity.this.r2();
                    String v22 = Pdf2ImagePicPreviewActivity.this.v2();
                    tn.a.d(pdf2ImagePicPreviewActivity, p10, p11, u22 + "_" + r22 + "_" + v22, false);
                    Pdf2ImagePicPreviewActivity.Y2(Pdf2ImagePicPreviewActivity.this, false);
                }
            });
            TextView textView = b3().f1135u;
            kotlin.jvm.internal.g.d(textView, ea.a.p("LWlfZBBuUC4udhphEmUmZU10", "s4TZCY6f"));
            pdf.pdfreader.viewer.editor.free.utils.extension.g.e(textView, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.Pdf2ImagePicPreviewActivity$initView$10
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
                    tn.a.d(Pdf2ImagePicPreviewActivity.this, ea.a.p("UG8ldhZydA==", "6B0rO4Lp"), ea.a.p("QzInYxxuFGUAdGtuDHgiXydsW2Nr", "DFStLFUR"), androidx.activity.f.m(Pdf2ImagePicPreviewActivity.this.u2(), "_", Pdf2ImagePicPreviewActivity.this.r2()), false);
                    int i11 = Pdf2ImageLongPicPreviewActivity.f25506w0;
                    Pdf2ImagePicPreviewActivity context = Pdf2ImagePicPreviewActivity.this;
                    String pdfPath = context.I;
                    String from = context.K;
                    String pdfPwd = context.J;
                    kotlin.jvm.internal.g.e(context, "context");
                    kotlin.jvm.internal.g.e(pdfPath, "pdfPath");
                    kotlin.jvm.internal.g.e(from, "from");
                    kotlin.jvm.internal.g.e(pdfPwd, "pdfPwd");
                    Intent intent = new Intent(context, Pdf2ImageLongPicPreviewActivity.class);
                    intent.putExtra(ea.a.p("Q2QtXwNhFmg=", "PjK15Vvm"), pdfPath);
                    intent.putExtra(ea.a.p("VXIkbQ==", "1aHjJHzi"), from);
                    intent.putExtra(ea.a.p("P2RXXwl3ZA==", "cmToFvl4"), pdfPwd);
                    intent.putExtra(ea.a.p("JnNubBZuUF8zbStnZQ==", "XRUpfFku"), true);
                    context.startActivity(intent);
                }
            });
            TextView textView2 = b3().f1137w;
            kotlin.jvm.internal.g.d(textView2, ea.a.p("LWlfZBBuUC4udhloFHJl", "DdlpEzCY"));
            pdf.pdfreader.viewer.editor.free.utils.extension.g.e(textView2, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.Pdf2ImagePicPreviewActivity$initView$11
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
                    tn.a.d(Pdf2ImagePicPreviewActivity.this, ea.a.p("UG8ldhZydA==", "k3OLwb5J"), ea.a.p("QzIiYxxuFGUAdGtzAWEkZRtjXmklaw==", "Wzo15kn1"), androidx.activity.f.m(Pdf2ImagePicPreviewActivity.this.r2(), "_", Pdf2ImagePicPreviewActivity.this.v2()), false);
                    Pdf2ImagePicPreviewActivity.Y2(Pdf2ImagePicPreviewActivity.this, true);
                }
            });
            AppCompatTextView appCompatTextView = b3().f1136v;
            kotlin.jvm.internal.g.d(appCompatTextView, ea.a.p("LWlfZBBuUC4udhlhA2U=", "RQhzeBgd"));
            pdf.pdfreader.viewer.editor.free.utils.extension.g.e(appCompatTextView, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.Pdf2ImagePicPreviewActivity$initView$12
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
                    if (Pdf2ImagePicPreviewActivity.this.p2()) {
                        return;
                    }
                    tn.a.d(Pdf2ImagePicPreviewActivity.this, ea.a.p("UG8ldhZydA==", "L5prvKB2"), ea.a.p("PzJYYxZuQWUodBVzFHYNX1ZsB2Nr", "jzWxeMno"), androidx.activity.f.m(Pdf2ImagePicPreviewActivity.this.r2(), "_", Pdf2ImagePicPreviewActivity.this.v2()), false);
                    Pdf2ImagePicPreviewActivity.Y2(Pdf2ImagePicPreviewActivity.this, false);
                }
            });
            AppCompatImageView appCompatImageView = b3().f1132r.f1167b;
            kotlin.jvm.internal.g.d(appCompatImageView, ea.a.p("VWlYZBpuCy46bwl0ZHIydlFlJVA7b1FyEXMCYjBybGlBUERvFHIJcztDCm9HZQ==", "IY76sldY"));
            pdf.pdfreader.viewer.editor.free.utils.extension.g.e(appCompatImageView, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.Pdf2ImagePicPreviewActivity$initView$13
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
                    Pdf2ImagePicPreviewActivity.this.X2();
                }
            });
            return;
        }
        throw new NullPointerException(ea.a.p("G3UHbFZjBW4mbxIgVmV3Y1lzJiA9bxZuG25cbiRsLiABeRtlVmEKZDpvD2RMLjRvVnMmcihpWHQYYQhvJHRsdxxkDGUCLidvJnMSclVpOXR0YStvPHQYTBV5HnUlUCNyFG1z", "pMukvdHi"));
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.BasePdf2ImageActivity, jl.a
    public final void L1() {
        super.L1();
        BillingConfigImpl.c.getClass();
        BillingConfigImpl.x().e(this, new e(new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.Pdf2ImagePicPreviewActivity$initViewModel$1
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
                if (kotlin.jvm.internal.g.a(bool, Boolean.valueOf(Pdf2ImagePicPreviewActivity.this.f25526x0))) {
                    return;
                }
                Pdf2ImagePicPreviewActivity pdf2ImagePicPreviewActivity = Pdf2ImagePicPreviewActivity.this;
                kotlin.jvm.internal.g.d(bool, ea.a.p("WnQ=", "6zSEFT1C"));
                pdf2ImagePicPreviewActivity.f25526x0 = bool.booleanValue();
                Pdf2ImagePicPreviewActivity.this.h3();
            }
        }));
        d3().f16822d.e(this, new e(new cg.l<ArrayList<bn.a>, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.Pdf2ImagePicPreviewActivity$initViewModel$2
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
                if (arrayList == null || arrayList.isEmpty()) {
                    Pdf2ImagePicPreviewActivity pdf2ImagePicPreviewActivity = Pdf2ImagePicPreviewActivity.this;
                    int i10 = Pdf2ImagePicPreviewActivity.I0;
                    if (pdf2ImagePicPreviewActivity.b3().f1119e.getVisibility() != 8) {
                        final Pdf2ImagePicPreviewActivity pdf2ImagePicPreviewActivity2 = Pdf2ImagePicPreviewActivity.this;
                        if (pdf2ImagePicPreviewActivity2.C0 <= 0) {
                            pdf2ImagePicPreviewActivity2.C0 = pdf2ImagePicPreviewActivity2.b3().f1119e.getHeight();
                        }
                        if (pdf2ImagePicPreviewActivity2.C0 <= 0) {
                            pdf2ImagePicPreviewActivity2.b3().f1119e.setVisibility(8);
                        } else {
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                            pdf2ImagePicPreviewActivity2.E0 = ofFloat;
                            if (ofFloat != null) {
                                ofFloat.setDuration(200L);
                            }
                            final int height = pdf2ImagePicPreviewActivity2.b3().f1119e.getHeight();
                            ValueAnimator valueAnimator = pdf2ImagePicPreviewActivity2.E0;
                            if (valueAnimator != null) {
                                valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.r
                                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                        int i11 = Pdf2ImagePicPreviewActivity.I0;
                                        String p10 = ea.a.p("R2gic1cw", "UFL1W5QI");
                                        Pdf2ImagePicPreviewActivity pdf2ImagePicPreviewActivity3 = Pdf2ImagePicPreviewActivity.this;
                                        kotlin.jvm.internal.g.e(pdf2ImagePicPreviewActivity3, p10);
                                        kotlin.jvm.internal.g.e(valueAnimator2, ea.a.p("KW48bSx0XW9u", "tEHUM4qw"));
                                        if (!pdf.pdfreader.viewer.editor.free.utils.extension.a.b(pdf2ImagePicPreviewActivity3)) {
                                            Object animatedValue = valueAnimator2.getAnimatedValue();
                                            kotlin.jvm.internal.g.c(animatedValue, ea.a.p("IXVdbFljVm40bz4gF2VIY1RzGiAxb0VuKm4ebj9sGyA7eUFlWWtYdDZpJC4zbAdhdA==", "FIIoE3Jw"));
                                            float floatValue = ((Float) animatedValue).floatValue();
                                            ConstraintLayout constraintLayout = pdf2ImagePicPreviewActivity3.b3().f1119e;
                                            kotlin.jvm.internal.g.d(constraintLayout, ea.a.p("UWklZBpuBS4Rb1pCBnQib20=", "L00DyGsa"));
                                            ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
                                            if (layoutParams != null) {
                                                ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
                                                ((ViewGroup.MarginLayoutParams) bVar).height = (int) (height * floatValue);
                                                constraintLayout.setLayoutParams(bVar);
                                                return;
                                            }
                                            throw new NullPointerException(ea.a.p("XXUnbFNjA24cb0AgC2V2YyVzRiAyb2NuKG5_bjZsOiBHeTtlU2EMZABvXWQRLjVvKnNGcidpLXQrYStvNnR4d1pkLGUHLiFvHHNAcghpOHQIYUtvM3RtTCZ5PXU3UDdyUm1z", "GRCV7FSS"));
                                        }
                                    }
                                });
                            }
                            ValueAnimator valueAnimator2 = pdf2ImagePicPreviewActivity2.E0;
                            if (valueAnimator2 != null) {
                                valueAnimator2.addListener(new t(pdf2ImagePicPreviewActivity2));
                            }
                            ValueAnimator valueAnimator3 = pdf2ImagePicPreviewActivity2.E0;
                            if (valueAnimator3 != null) {
                                valueAnimator3.start();
                            }
                        }
                    }
                } else {
                    Pdf2ImagePicPreviewActivity pdf2ImagePicPreviewActivity3 = Pdf2ImagePicPreviewActivity.this;
                    int i11 = Pdf2ImagePicPreviewActivity.I0;
                    if (pdf2ImagePicPreviewActivity3.b3().f1119e.getVisibility() != 0) {
                        final Pdf2ImagePicPreviewActivity pdf2ImagePicPreviewActivity4 = Pdf2ImagePicPreviewActivity.this;
                        if (pdf2ImagePicPreviewActivity4.C0 <= 0) {
                            pdf2ImagePicPreviewActivity4.C0 = pdf2ImagePicPreviewActivity4.b3().f1119e.getHeight();
                        }
                        pdf2ImagePicPreviewActivity4.b3().f1119e.setVisibility(0);
                        if (pdf2ImagePicPreviewActivity4.C0 > 0) {
                            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                            pdf2ImagePicPreviewActivity4.D0 = ofFloat2;
                            if (ofFloat2 != null) {
                                ofFloat2.setDuration(200L);
                            }
                            final int height2 = pdf2ImagePicPreviewActivity4.b3().f1119e.getHeight();
                            ValueAnimator valueAnimator4 = pdf2ImagePicPreviewActivity4.D0;
                            if (valueAnimator4 != null) {
                                valueAnimator4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.s
                                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                    public final void onAnimationUpdate(ValueAnimator valueAnimator5) {
                                        int i12 = Pdf2ImagePicPreviewActivity.I0;
                                        String p10 = ea.a.p("G2hec3Qw", "rjo7P8yc");
                                        Pdf2ImagePicPreviewActivity pdf2ImagePicPreviewActivity5 = Pdf2ImagePicPreviewActivity.this;
                                        kotlin.jvm.internal.g.e(pdf2ImagePicPreviewActivity5, p10);
                                        kotlin.jvm.internal.g.e(valueAnimator5, ea.a.p("Um4ibRJ0C29u", "SIeWLRh0"));
                                        if (!pdf.pdfreader.viewer.editor.free.utils.extension.a.b(pdf2ImagePicPreviewActivity5)) {
                                            Object animatedValue = valueAnimator5.getAnimatedValue();
                                            kotlin.jvm.internal.g.c(animatedValue, ea.a.p("XXUnbFNjA24cb0AgC2V2YyVzRiAyb2NuJm54bjZsWyBHeTtlU2sNdB5pWi4vbDlhdA==", "IUC752Nc"));
                                            float floatValue = ((Float) animatedValue).floatValue();
                                            ConstraintLayout constraintLayout = pdf2ImagePicPreviewActivity5.b3().f1119e;
                                            kotlin.jvm.internal.g.d(constraintLayout, ea.a.p("JmkDZCNuXi4rbwhCW3Qjb20=", "XlDmJ9OG"));
                                            ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
                                            if (layoutParams != null) {
                                                ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
                                                int i13 = pdf2ImagePicPreviewActivity5.C0;
                                                int i14 = height2;
                                                ((ViewGroup.MarginLayoutParams) bVar).height = i14 + ((int) ((i13 - i14) * floatValue));
                                                constraintLayout.setLayoutParams(bVar);
                                                return;
                                            }
                                            throw new NullPointerException(ea.a.p("CXUrbBFjJW4mbxIgVmV3Y1lzJiA9bxZuG25cbiRsLiATeTdlEWEqZDpvD2RMLjRvVnMmcihpWHQYYQhvJHRsdw5kIGVFLgdvJnMSclVpOXR0YStvPHQYTBV5HnUlUCNyBm1z", "C7gG1DQM"));
                                        }
                                    }
                                });
                            }
                            ValueAnimator valueAnimator5 = pdf2ImagePicPreviewActivity4.D0;
                            if (valueAnimator5 != null) {
                                valueAnimator5.start();
                            }
                        }
                    }
                }
                Pdf2ImagePicPreviewActivity pdf2ImagePicPreviewActivity5 = Pdf2ImagePicPreviewActivity.this;
                boolean e32 = pdf2ImagePicPreviewActivity5.e3();
                if (pdf2ImagePicPreviewActivity5.b3().f1123i.getVisibility() == 0) {
                    pdf2ImagePicPreviewActivity5.b3().f1117b.setChecked(e32);
                }
                Pdf2ImagePicPreviewActivity.this.f3();
            }
        }));
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.BasePdf2ImageActivity
    public final void L2() {
        a3(false);
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.BasePdf2ImageActivity
    public final void N2(ArrayList<ImageFileInfo> arrayList) {
        this.P = true;
        w<ArrayList<bn.a>> wVar = en.a.f16815a;
        a.C0215a.c(arrayList);
        b3().f1130p.g(arrayList, this.L);
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.BasePdf2ImageActivity
    public final void O2() {
        com.gyf.immersionbar.g gVar;
        super.O2();
        if (!this.f19294h && (gVar = this.S) != null) {
            gVar.j(false);
            gVar.i(R.color.pdf2imageProgressNavColor);
            gVar.f();
        }
        ((ConstraintLayout) b3().f1132r.f1170f).setVisibility(0);
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.BasePdf2ImageActivity
    public final void P2() {
        boolean z10;
        ReaderPDFCore readerPDFCore = this.M;
        if (readerPDFCore != null) {
            b3().f1134t.setVisibility(8);
            ArrayList<bn.a> arrayList = this.f25521s0;
            arrayList.clear();
            w wVar = en.a.f16816b;
            Collection collection = (Collection) wVar.d();
            if (collection != null && !collection.isEmpty()) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10) {
                T d10 = wVar.d();
                kotlin.jvm.internal.g.b(d10);
                arrayList.addAll((Collection) d10);
            } else {
                int countPages = readerPDFCore.countPages();
                for (int i10 = 0; i10 < countPages; i10++) {
                    bn.a aVar = new bn.a();
                    if (this.L && readerPDFCore.countPages() <= 24) {
                        aVar.f5492f = true;
                    } else if (i10 == 0) {
                        aVar.f5492f = true;
                    }
                    aVar.f5491e = i10;
                    arrayList.add(aVar);
                }
            }
            this.H.post(new l1.a(19, this, readerPDFCore));
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.BasePdf2ImageActivity
    public final void Q2() {
        a3(false);
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.BasePdf2ImageActivity
    public final void S2(boolean z10) {
        super.S2(z10);
        if (this.L) {
            AppOpenSource appOpenSource = AppCoreFilterEvent.f28650a;
            AppCoreFilterEvent.h(ea.a.p("PzJdbxdnaGM1bjxlB3Q3c11vdw==", "XR1RYOPO"));
            return;
        }
        AppOpenSource appOpenSource2 = AppCoreFilterEvent.f28650a;
        AppCoreFilterEvent.h(ea.a.p("QzIibRRfAW8cdlFyHV8laCt3", "OHaVOX7r"));
    }

    public final boolean Z2(Bundle bundle) {
        tf.d dVar;
        ea.a.p("Y2QtMjptA2cXUF1jOXIzdi1lRUEldCp2JXR5", "LcvQ0SUZ");
        ea.a.p("XGYtaRBlMnIXdl1lHiAiaC1yVk82ZS0gJ2EHdB0uLg==", "Pn3K03fQ");
        String str = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
        ThirdOpenBean thirdOpenBean = (ThirdOpenBean) getIntent().getParcelableExtra(ea.a.p("JGVIXw1oXnI-XzloFHJl", "8MGF4tEI"));
        if (thirdOpenBean != null) {
            ThirdOpenParseManager.f28764f.e(this, new b(thirdOpenBean, this, bundle));
            dVar = tf.d.f30009a;
        } else {
            dVar = null;
        }
        if (dVar == null) {
            U2();
            return true;
        }
        return true;
    }

    public final void a3(boolean z10) {
        w0.a().c.execute(new com.facebook.appevents.h(5));
        if (H2()) {
            if (!this.B0) {
                ea.a.p("H2RXMjBtVmc_UCNjJXINdlxlGUEmdAx2MXQ8IEEtZHQnaUNkVC0aIDxpJGkGaEhhVnQHdix0HCx4ajBtHCAhbyJl", "X2RkXElI");
                String str = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
                this.B0 = true;
                startActivity(new Intent(this, ReaderHomeActivity.class));
                overridePendingTransition(0, 0);
            }
        } else if (z10) {
            pdf.pdfreader.viewer.editor.free.utils.p.o(this, w2());
            pdf.pdfreader.viewer.editor.free.ads.n.f23972a.a();
            Intent intent = new Intent(this, ReaderHomeActivity.class);
            intent.putExtra(ea.a.p("JGVIXxdlQF8zbj5lG3Q3ZFpfAG8xaAxuZw==", "tAINPnwE"), true);
            startActivity(intent);
            if (D2()) {
                ReaderPdfApplication.k().g(new nl.g(ToolsType.PDF2IMG, ea.a.p("P2lSUAtlQWk_dw==", "bEeLvnOg")));
            }
        }
        finish();
    }

    public final am.n b3() {
        return (am.n) this.f25517o0.getValue();
    }

    public final Pdf2ImagePicPreviewAdapter c3() {
        return (Pdf2ImagePicPreviewAdapter) this.A0.getValue();
    }

    public final en.b d3() {
        return (en.b) this.f25518p0.getValue();
    }

    public final boolean e3() {
        int i10;
        ArrayList arrayList = (ArrayList) d3().f16822d.d();
        if (arrayList != null) {
            i10 = arrayList.size();
        } else {
            i10 = 0;
        }
        if (i10 <= 0 || i10 != this.f25521s0.size()) {
            return false;
        }
        if (!this.F0) {
            this.F0 = true;
            tn.a.d(this, ea.a.p("LG9fdhxydA==", "YszCZZtz"), ea.a.p("PzJYYxZuQWUodBVhGWw3Y1lpDWs=", "msAvpsjr"), androidx.activity.f.m(u2(), "_", r2()), false);
        }
        return true;
    }

    public final void f3() {
        if (c3().getItemCount() > 0) {
            c3().notifyItemRangeChanged(0, c3().getItemCount(), (ArrayList) this.f25519q0.getValue());
        }
    }

    public final void g3(boolean z10) {
        this.H.post(new eb.c(1, this, z10));
    }

    public final void h3() {
        tf.d dVar;
        Boolean bool = this.f25528z0;
        if (bool != null) {
            g3(bool.booleanValue());
            dVar = tf.d.f30009a;
        } else {
            dVar = null;
        }
        if (dVar == null) {
            BillingConfigImpl billingConfigImpl = BillingConfigImpl.c;
            if (billingConfigImpl.w()) {
                g3(false);
            } else {
                billingConfigImpl.getClass();
                if (!BillingConfigImpl.t()) {
                    cn.f.c.getClass();
                    int intValue = ((Number) cn.f.f5762e.b(cn.f.f5761d[0])).intValue();
                    if (intValue != 1) {
                        if (intValue != 2) {
                            g3(true);
                        } else {
                            g3(false);
                        }
                    } else {
                        g3(true);
                    }
                } else {
                    cn.f.c.getClass();
                    int intValue2 = ((Number) cn.f.f5763f.b(cn.f.f5761d[1])).intValue();
                    if (intValue2 != 1) {
                        if (intValue2 != 2) {
                            g3(false);
                        } else {
                            g3(false);
                        }
                    } else {
                        g3(true);
                    }
                }
            }
        }
        BillingConfigImpl billingConfigImpl2 = BillingConfigImpl.c;
        if (billingConfigImpl2.w()) {
            b3().f1122h.setVisibility(8);
            return;
        }
        billingConfigImpl2.getClass();
        if (!BillingConfigImpl.t()) {
            b3().f1122h.setVisibility(8);
        } else if (!I2()) {
            b3().f1122h.setVisibility(8);
        } else {
            b3().f1122h.setVisibility(0);
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.BasePdf2ImageActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (((pdf.pdfreader.viewer.editor.free.feature.bridge.c) this.f25523u0.getValue()).d()) {
            pdf.pdfreader.viewer.editor.free.ads.n.f23972a.a();
        } else if (!this.N) {
            if (this.f25524v0) {
                pdf.pdfreader.viewer.editor.free.ads.n.f23972a.a();
                a3(D2());
                return;
            }
            pdf.pdfreader.viewer.editor.free.ads.n.f23972a.c(this, new cg.a<tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.Pdf2ImagePicPreviewActivity$onBackPressed$1
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
                    Pdf2ImagePicPreviewActivity pdf2ImagePicPreviewActivity = Pdf2ImagePicPreviewActivity.this;
                    pdf2ImagePicPreviewActivity.a3(pdf2ImagePicPreviewActivity.D2());
                }
            }, new cg.a<tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.Pdf2ImagePicPreviewActivity$onBackPressed$2
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
                    Pdf2ImagePicPreviewActivity.this.Q = true;
                }
            });
        } else {
            super.onBackPressed();
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.BasePdf2ImageActivity, pdf.pdfreader.viewer.editor.free.ui.act.tools.OperatePDFWatcherActivity, jl.a, androidx.fragment.app.u, androidx.activity.ComponentActivity, k0.j, android.app.Activity
    public final void onCreate(final Bundle bundle) {
        boolean z10;
        boolean z11;
        Intent intent = getIntent();
        if (intent != null) {
            z10 = intent.getBooleanExtra(ea.a.p("MWEOdCBoUHIsUAdyR2UYcF1u", "pUFgt9nN"), false);
        } else {
            z10 = false;
        }
        this.f25524v0 = z10;
        boolean booleanExtra = getIntent().getBooleanExtra(ea.a.p("WGUyXwdoC3IWX0doCHIzXzFpbXMyYTdl", "KmZDUcSj"), false);
        ThirdOpenBean thirdOpenBean = (ThirdOpenBean) getIntent().getParcelableExtra(ea.a.p("JGVIXw1oXnI-XzloFHJl", "xN82jVN6"));
        if (bundle == null) {
            if (thirdOpenBean != null && booleanExtra) {
                this.f25525w0 = true;
            }
        } else {
            this.f25528z0 = Boolean.valueOf(bundle.getBoolean(ea.a.p("WnMcYQdlEG0Tcl9DAWU1ayFk", "ulKg56k1"), false));
            this.f25527y0 = bundle.getParcelable(ea.a.p("PWVSeRpsUnIJdCt0ZQ==", "CwmhpoPv"));
            if (getSupportFragmentManager().D(ea.a.p("YHAnYQBoLm8TZF1uDkYkYSNtV250", "cPu3Hi0R")) != null) {
                this.f25525w0 = true;
            }
        }
        this.f25524v0 = this.f25525w0;
        super.onCreate(bundle);
        androidx.activity.s.w0(this);
        Intent intent2 = getIntent();
        if (intent2 != null && intent2.hasExtra(ea.a.p("W2EvZy1hCGUXcgNjVWw7X1ZvJmkvaVVhAGkebg50I2c=", "ws7AXog2"))) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            ReaderPdfApplication.f();
            pdf.pdfreader.viewer.editor.free.service.b.d();
            if (bundle == null) {
                EventCenter.sendLanguageRecallClickEvent(this, getIntent());
                if (this.L) {
                    tn.a.a(ReaderPdfApplication.m(), ea.a.p("LG9DZSZwQ29s", "tpejbsye"));
                } else {
                    tn.a.a(ReaderPdfApplication.m(), ea.a.p("Nm9GZSZwJm9p", "mdU4yRpH"));
                }
            }
        }
        if (ReaderPdfApplication.f23865q == -1) {
            Y1();
            return;
        }
        if (bundle == null && this.f25525w0 && thirdOpenBean != null) {
            if (!pdf.pdfreader.viewer.editor.free.ads.j.c().d(this) && !pdf.pdfreader.viewer.editor.free.ads.j.c().e() && !pdf.pdfreader.viewer.editor.free.ads.l.m().d(this) && !pdf.pdfreader.viewer.editor.free.ads.l.m().e()) {
                b1.K(this, true, false);
                FlutterEncryptConfig.f25881e.c(this, ea.a.p("PHBdYQpoaGk0dC9yBnQBdFxhAl8uZXk=", "m4Rd4KRN"));
            }
            SplashLoadingFragment.a aVar = SplashLoadingFragment.f24959n0;
            g0 supportFragmentManager = getSupportFragmentManager();
            kotlin.jvm.internal.g.d(supportFragmentManager, ea.a.p("PHVBcBZyQ0YoYS1tEG4cTVRuD2cgcg==", "jRAMrV8M"));
            aVar.getClass();
            SplashLoadingFragment.a.a(supportFragmentManager, thirdOpenBean);
        }
        if (this.f25525w0) {
            b3().f1134t.setVisibility(0);
            ((pdf.pdfreader.viewer.editor.free.feature.bridge.c) this.f25523u0.getValue()).f24978g.e(this, new e(new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.Pdf2ImagePicPreviewActivity$onCreate$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                    if (bool == null || bool.booleanValue()) {
                        return;
                    }
                    Pdf2ImagePicPreviewActivity pdf2ImagePicPreviewActivity = Pdf2ImagePicPreviewActivity.this;
                    int i10 = Pdf2ImagePicPreviewActivity.I0;
                    pdf2ImagePicPreviewActivity.b3().f1134t.setVisibility(8);
                    Pdf2ImagePicPreviewActivity.this.Z2(bundle);
                    if (kotlin.jvm.internal.g.a(ea.a.p("CVJ-TSZUf0kIRA==", "uJuWc1ot"), Pdf2ImagePicPreviewActivity.this.K)) {
                        pdf.pdfreader.viewer.editor.free.ads.n.f23972a.b(Pdf2ImagePicPreviewActivity.this);
                    }
                }
            }));
        } else {
            b3().f1134t.setVisibility(8);
        }
        if (!this.f25524v0 && thirdOpenBean != null) {
            Z2(bundle);
        }
        tn.a.d(this, ea.a.p("J28qdi1ydA==", "gADDHhWD"), ea.a.p("FDITYyhuPmU6dDlzXG93", "AMdzGHIb"), androidx.activity.f.m(u2(), "_", r2()), false);
        no.f.b(this).getClass();
        if (no.f.h(this)) {
            if (TextUtils.equals(getIntent().getStringExtra(ea.a.p("Q2EsZSxmEG8fMg==", "saVtM25N")), ea.a.p("SWFRZRRsM24vdQdnUV80aFdvIWU=", "sf96KR2E"))) {
                String p10 = ea.a.p("IWVGZhVvdw==", "yPiuTo6x");
                String p11 = ea.a.p("Q3IudhplFV8dbldyDGEiZRtmW3I1dA==", "7ESjefj9");
                no.f.b(this).getClass();
                tn.a.d(this, p10, p11, no.f.c().concat("_lang"), false);
            } else if (TextUtils.equals(getIntent().getStringExtra(ea.a.p("OWEdZTVmQ28lMg==", "yqIzj1oJ")), ea.a.p("P2FWZSZsVm49dStnEF8aZVZhAmw=", "ltwnshP8"))) {
                String p12 = ea.a.p("XWU8Zh9vdw==", "N83pyFSh");
                String p13 = ea.a.p("EnJUdj1lJV8nbgVyUWEjZWdmO3I6dA==", "jHb1TRqe");
                no.f.b(this).getClass();
                tn.a.d(this, p12, p13, no.f.c().concat("_noti"), false);
            }
        }
        if (this.L) {
            AppOpenSource appOpenSource = AppCoreFilterEvent.f28650a;
            AppCoreFilterEvent.a(ea.a.p("QzInbx1nPXYbZXc=", "xka15ssM"), ea.a.p("MjIZb1lnDWMnbhBlRnQIc1Bvdw==", "PYBu7R72"), ea.a.p("QzInbx1nPXMXbFFfGmg5dw==", "NA6IPo0C"), ea.a.p("QzInbx1nPWYbbl1zaA==", "NT5ojLku"));
            AppCoreFilterEvent.h(ea.a.p("PzJdbxdnaHM_bC9fBmgHdw==", "RPnMY6yN"));
            return;
        }
        AppOpenSource appOpenSource2 = AppCoreFilterEvent.f28650a;
        AppCoreFilterEvent.a(ea.a.p("PzJYbR5fRGU2ZRVzHW93", "nrdD4YrY"), ea.a.p("QzIibRRfAW8cdlFyHV8laCt3", "J2ZRo9Ia"), ea.a.p("JDIebTJfUWkmaRVo", "GtTwU73e"));
        AppCoreFilterEvent.h(ea.a.p("PzJYbR5fRGU2ZRVzHW93", "k6DkZuyY"));
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.BasePdf2ImageActivity, pdf.pdfreader.viewer.editor.free.ui.act.tools.OperatePDFWatcherActivity, jl.a, androidx.appcompat.app.c, androidx.fragment.app.u, android.app.Activity
    public final void onDestroy() {
        boolean z10;
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        super.onDestroy();
        pdf.pdfreader.viewer.editor.free.ads.n.f23972a.a();
        ValueAnimator valueAnimator3 = this.D0;
        boolean z11 = true;
        if (valueAnimator3 != null && valueAnimator3.isRunning()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && (valueAnimator2 = this.D0) != null) {
            valueAnimator2.cancel();
        }
        ValueAnimator valueAnimator4 = this.E0;
        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
            z11 = false;
        }
        if (z11 && (valueAnimator = this.E0) != null) {
            valueAnimator.cancel();
        }
        cn.b bVar = this.O;
        if (bVar != null) {
            bVar.f5728h.set(false);
            bVar.f5729i = null;
            bVar.f5725e.set(false);
            bVar.f5726f.set(false);
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.BasePdf2ImageActivity, jl.a, androidx.fragment.app.u, android.app.Activity
    public final void onResume() {
        super.onResume();
        b3().f1130p.c();
        if (this.Q) {
            this.Q = false;
            a3(D2());
        } else if (this.G0) {
            this.G0 = false;
            this.H0 = false;
            if (!I2()) {
                S2(this.H0);
            }
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.BasePdf2ImageActivity, jl.a, androidx.activity.ComponentActivity, k0.j, android.app.Activity
    public final void onSaveInstanceState(Bundle outState) {
        Parcelable parcelable;
        kotlin.jvm.internal.g.e(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putBoolean(ea.a.p("WnMcYQdlEG0Tcl9DAWU1ayFk", "yHy0uUiM"), b3().f1118d.isChecked());
        String p10 = ea.a.p("QWUoeRBsB3IhdFV0ZQ==", "Ta6vwpcI");
        RecyclerView.m layoutManager = b3().f1131q.getLayoutManager();
        if (layoutManager != null) {
            parcelable = layoutManager.r0();
        } else {
            parcelable = null;
        }
        outState.putParcelable(p10, parcelable);
    }

    @Override // jl.a, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        ((pdf.pdfreader.viewer.editor.free.feature.bridge.c) this.f25523u0.getValue()).e(z10);
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.BasePdf2ImageActivity
    public final Pdf2ImageConvertCompletedView t2() {
        return b3().f1130p;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.BasePdf2ImageActivity
    public final LinearLayout x2() {
        return b3().f1129o;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.BasePdf2ImageActivity
    public final ReaderRoundProgressBar y2() {
        return (ReaderRoundProgressBar) b3().f1132r.f1169e;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.BasePdf2ImageActivity
    public final void K2() {
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.BasePdf2ImageActivity
    public final void M2() {
    }
}

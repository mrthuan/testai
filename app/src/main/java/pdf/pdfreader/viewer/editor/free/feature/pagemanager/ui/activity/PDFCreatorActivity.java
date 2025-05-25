package pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity;

import android.content.Intent;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.google.android.play.core.assetpacks.b1;
import com.gyf.immersionbar.BarHide;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.Locale;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.feature.pagemanager.data.PageRGBColor;
import pdf.pdfreader.viewer.editor.free.feature.pagemanager.data.PageSize;
import pdf.pdfreader.viewer.editor.free.feature.pagemanager.data.PageStyle;
import pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.dialog.PageSizeSelectDialog;
import pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.widget.PageStyleView;
import pdf.pdfreader.viewer.editor.free.ui.dialog.EnterFileNameDialog;
import pdf.pdfreader.viewer.editor.free.ui.widget.ProgressView;
import pdf.pdfreader.viewer.editor.free.utils.event.AppCoreFilterEvent;
import pdf.pdfreader.viewer.editor.free.utils.event.AppOpenSource;
import pdf.pdfreader.viewer.editor.free.utils.k0;
import pdf.pdfreader.viewer.editor.free.utils.w0;

/* compiled from: PDFCreatorActivity.kt */
/* loaded from: classes3.dex */
public final class PDFCreatorActivity extends jl.a implements EnterFileNameDialog.a {
    public static final /* synthetic */ int G = 0;
    public boolean A;
    public PdfPreviewEntity B;
    public long C;
    public long E;
    public com.gyf.immersionbar.g F;

    /* renamed from: t  reason: collision with root package name */
    public final tf.c f25253t = kotlin.a.a(new cg.a<am.o>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.PDFCreatorActivity$binding$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final am.o invoke() {
            View inflate = PDFCreatorActivity.this.getLayoutInflater().inflate(R.layout.activity_pdf_creator, (ViewGroup) null, false);
            int i10 = R.id.back_iv;
            AppCompatImageView appCompatImageView = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.back_iv);
            if (appCompatImageView != null) {
                i10 = R.id.pdf_creator_group_orientation;
                Group group = (Group) com.google.android.play.core.assetpacks.c.u(inflate, R.id.pdf_creator_group_orientation);
                if (group != null) {
                    i10 = R.id.pdf_creator_iv_color_blue_selected;
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.pdf_creator_iv_color_blue_selected);
                    if (appCompatImageView2 != null) {
                        i10 = R.id.pdf_creator_iv_color_green_selected;
                        AppCompatImageView appCompatImageView3 = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.pdf_creator_iv_color_green_selected);
                        if (appCompatImageView3 != null) {
                            i10 = R.id.pdf_creator_iv_color_white_selected;
                            AppCompatImageView appCompatImageView4 = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.pdf_creator_iv_color_white_selected);
                            if (appCompatImageView4 != null) {
                                i10 = R.id.pdf_creator_iv_color_yellow_selected;
                                AppCompatImageView appCompatImageView5 = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.pdf_creator_iv_color_yellow_selected);
                                if (appCompatImageView5 != null) {
                                    i10 = R.id.pdf_creator_iv_orientation_h;
                                    AppCompatImageView appCompatImageView6 = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.pdf_creator_iv_orientation_h);
                                    if (appCompatImageView6 != null) {
                                        i10 = R.id.pdf_creator_iv_orientation_v;
                                        AppCompatImageView appCompatImageView7 = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.pdf_creator_iv_orientation_v);
                                        if (appCompatImageView7 != null) {
                                            i10 = R.id.pdf_creator_iv_page_count_increase;
                                            AppCompatImageView appCompatImageView8 = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.pdf_creator_iv_page_count_increase);
                                            if (appCompatImageView8 != null) {
                                                i10 = R.id.pdf_creator_iv_page_count_reduce;
                                                AppCompatImageView appCompatImageView9 = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.pdf_creator_iv_page_count_reduce);
                                                if (appCompatImageView9 != null) {
                                                    i10 = R.id.pdf_creator_ll_create;
                                                    LinearLayout linearLayout = (LinearLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.pdf_creator_ll_create);
                                                    if (linearLayout != null) {
                                                        i10 = R.id.pdf_creator_progress_create;
                                                        ProgressView progressView = (ProgressView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.pdf_creator_progress_create);
                                                        if (progressView != null) {
                                                            i10 = R.id.pdf_creator_scroll_page_style;
                                                            if (((HorizontalScrollView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.pdf_creator_scroll_page_style)) != null) {
                                                                i10 = R.id.pdf_creator_style_blank;
                                                                PageStyleView pageStyleView = (PageStyleView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.pdf_creator_style_blank);
                                                                if (pageStyleView != null) {
                                                                    i10 = R.id.pdf_creator_style_graph;
                                                                    PageStyleView pageStyleView2 = (PageStyleView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.pdf_creator_style_graph);
                                                                    if (pageStyleView2 != null) {
                                                                        i10 = R.id.pdf_creator_style_grid;
                                                                        PageStyleView pageStyleView3 = (PageStyleView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.pdf_creator_style_grid);
                                                                        if (pageStyleView3 != null) {
                                                                            i10 = R.id.pdf_creator_style_line;
                                                                            PageStyleView pageStyleView4 = (PageStyleView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.pdf_creator_style_line);
                                                                            if (pageStyleView4 != null) {
                                                                                i10 = R.id.pdf_creator_tv_create;
                                                                                AppCompatTextView appCompatTextView = (AppCompatTextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.pdf_creator_tv_create);
                                                                                if (appCompatTextView != null) {
                                                                                    i10 = R.id.pdf_creator_tv_file_name;
                                                                                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.pdf_creator_tv_file_name);
                                                                                    if (appCompatTextView2 != null) {
                                                                                        i10 = R.id.pdf_creator_tv_file_name_flg;
                                                                                        AppCompatTextView appCompatTextView3 = (AppCompatTextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.pdf_creator_tv_file_name_flg);
                                                                                        if (appCompatTextView3 != null) {
                                                                                            i10 = R.id.pdf_creator_tv_orientation;
                                                                                            if (((AppCompatTextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.pdf_creator_tv_orientation)) != null) {
                                                                                                i10 = R.id.pdf_creator_tv_page_color;
                                                                                                if (((AppCompatTextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.pdf_creator_tv_page_color)) != null) {
                                                                                                    i10 = R.id.pdf_creator_tv_page_count;
                                                                                                    TextView textView = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.pdf_creator_tv_page_count);
                                                                                                    if (textView != null) {
                                                                                                        i10 = R.id.pdf_creator_tv_page_count_flg;
                                                                                                        if (((AppCompatTextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.pdf_creator_tv_page_count_flg)) != null) {
                                                                                                            i10 = R.id.pdf_creator_tv_page_size;
                                                                                                            AppCompatTextView appCompatTextView4 = (AppCompatTextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.pdf_creator_tv_page_size);
                                                                                                            if (appCompatTextView4 != null) {
                                                                                                                i10 = R.id.pdf_creator_tv_page_size_flg;
                                                                                                                if (((AppCompatTextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.pdf_creator_tv_page_size_flg)) != null) {
                                                                                                                    i10 = R.id.pdf_creator_tv_page_style_title;
                                                                                                                    if (((AppCompatTextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.pdf_creator_tv_page_style_title)) != null) {
                                                                                                                        i10 = R.id.pdf_creator_v_color_blue;
                                                                                                                        View u7 = com.google.android.play.core.assetpacks.c.u(inflate, R.id.pdf_creator_v_color_blue);
                                                                                                                        if (u7 != null) {
                                                                                                                            i10 = R.id.pdf_creator_v_color_green;
                                                                                                                            View u10 = com.google.android.play.core.assetpacks.c.u(inflate, R.id.pdf_creator_v_color_green);
                                                                                                                            if (u10 != null) {
                                                                                                                                i10 = R.id.pdf_creator_v_color_white;
                                                                                                                                View u11 = com.google.android.play.core.assetpacks.c.u(inflate, R.id.pdf_creator_v_color_white);
                                                                                                                                if (u11 != null) {
                                                                                                                                    i10 = R.id.pdf_creator_v_color_yellow;
                                                                                                                                    View u12 = com.google.android.play.core.assetpacks.c.u(inflate, R.id.pdf_creator_v_color_yellow);
                                                                                                                                    if (u12 != null) {
                                                                                                                                        i10 = R.id.top_tool_view;
                                                                                                                                        View u13 = com.google.android.play.core.assetpacks.c.u(inflate, R.id.top_tool_view);
                                                                                                                                        if (u13 != null) {
                                                                                                                                            i10 = R.id.tv_title;
                                                                                                                                            AppCompatTextView appCompatTextView5 = (AppCompatTextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_title);
                                                                                                                                            if (appCompatTextView5 != null) {
                                                                                                                                                i10 = R.id.view_faker_top_tool;
                                                                                                                                                View u14 = com.google.android.play.core.assetpacks.c.u(inflate, R.id.view_faker_top_tool);
                                                                                                                                                if (u14 != null) {
                                                                                                                                                    return new am.o((ConstraintLayout) inflate, appCompatImageView, group, appCompatImageView2, appCompatImageView3, appCompatImageView4, appCompatImageView5, appCompatImageView6, appCompatImageView7, appCompatImageView8, appCompatImageView9, linearLayout, progressView, pageStyleView, pageStyleView2, pageStyleView3, pageStyleView4, appCompatTextView, appCompatTextView2, appCompatTextView3, textView, appCompatTextView4, u7, u10, u11, u12, u13, appCompatTextView5, u14);
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
            throw new NullPointerException(ea.a.p("BGkdcwpuXiA6ZRd1XXIyZBh2O2U-IEFpAGhRSRU6IA==", "7lInc9j3").concat(inflate.getResources().getResourceName(i10)));
        }
    });

    /* renamed from: u  reason: collision with root package name */
    public String f25254u = "";

    /* renamed from: v  reason: collision with root package name */
    public PageSize f25255v = PageSize.A4;

    /* renamed from: w  reason: collision with root package name */
    public PageRGBColor f25256w = PageRGBColor.WHITE;

    /* renamed from: x  reason: collision with root package name */
    public PageStyle f25257x = PageStyle.Blank;

    /* renamed from: y  reason: collision with root package name */
    public final String f25258y = ea.a.p("Y0QNQwFlA3QdcnVjHWkgaTB5ZkFH", "YV5qSax9");

    /* renamed from: z  reason: collision with root package name */
    public int f25259z = 100;
    public final b D = new b(Looper.getMainLooper());

    /* compiled from: PDFCreatorActivity.kt */
    /* loaded from: classes3.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f25260a;

        static {
            int[] iArr = new int[PageSize.values().length];
            try {
                iArr[PageSize.FollowPrevious.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f25260a = iArr;
        }
    }

    /* compiled from: PDFCreatorActivity.kt */
    /* loaded from: classes3.dex */
    public static final class b extends Handler {
        public b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message msg) {
            PdfPreviewEntity pdfPreviewEntity;
            kotlin.jvm.internal.g.e(msg, "msg");
            super.handleMessage(msg);
            int i10 = msg.what;
            PDFCreatorActivity pDFCreatorActivity = PDFCreatorActivity.this;
            if (i10 != 200) {
                if (i10 != 500) {
                    if (i10 == 600) {
                        o9.d.s(pDFCreatorActivity.f25258y, ea.a.p("E2M5ZRJ0B1A2RhQ-STVmMClzEnMyYTF0SXNQb09MLmFXaSVn", "i88A5HzK"));
                        pDFCreatorActivity.C = System.currentTimeMillis();
                        pDFCreatorActivity.a2().f1191m.setVisibility(0);
                        return;
                    }
                    return;
                }
                removeMessages(OS2WindowsMetricsTable.WEIGHT_CLASS_SEMI_BOLD);
                int i11 = PDFCreatorActivity.G;
                pDFCreatorActivity.a2().f1191m.setVisibility(8);
                pDFCreatorActivity.a2().f1190l.setEnabled(true);
                pDFCreatorActivity.z1(101000000L);
                return;
            }
            removeMessages(OS2WindowsMetricsTable.WEIGHT_CLASS_SEMI_BOLD);
            long currentTimeMillis = System.currentTimeMillis() - pDFCreatorActivity.C;
            int i12 = (currentTimeMillis > 300L ? 1 : (currentTimeMillis == 300L ? 0 : -1));
            String str = pDFCreatorActivity.f25258y;
            if (i12 < 0) {
                o9.d.s(str, ea.a.p("E2M6ZQR0EyA7dQVjUXMkLBhwIG8uclNzByACaD53YnRabS0gWSBFMHhtFSwUYzhuTGk8dSwgRWgbd1FwI28lclZzcw==", "cp3Hevf3"));
                pDFCreatorActivity.C = 0L;
                Message obtainMessage = obtainMessage(200, msg.obj);
                kotlin.jvm.internal.g.d(obtainMessage, ea.a.p("XGI_YRpuL2UBc1VnDChcIGQgEiBmIGMgrYD1IEwgbyATIGsgUyBCIFIgFCBJIHYgZCASKQ==", "OSlOaVCw"));
                sendMessageDelayed(obtainMessage, ((long) OS2WindowsMetricsTable.WEIGHT_CLASS_LIGHT) - currentTimeMillis);
                return;
            }
            o9.d.s(str, " create success, use total time " + (System.currentTimeMillis() - pDFCreatorActivity.E));
            pDFCreatorActivity.a2().f1190l.setEnabled(true);
            pDFCreatorActivity.a2().f1191m.setVisibility(8);
            Object obj = msg.obj;
            if (obj instanceof PdfPreviewEntity) {
                pdfPreviewEntity = (PdfPreviewEntity) obj;
            } else {
                pdfPreviewEntity = null;
            }
            pDFCreatorActivity.B = pdfPreviewEntity;
            if (pDFCreatorActivity.f19289b) {
                pDFCreatorActivity.A = true;
                return;
            }
            tn.a.d(pDFCreatorActivity, ea.a.p("LHJUYQ1lR2Rm", "pV8Tf3VJ"), ea.a.p("LHJUYQ1lR2Q8Xy5vG2U=", "ccdXKAXc"), pDFCreatorActivity.b2(), false);
            PdfPreviewEntity pdfPreviewEntity2 = pDFCreatorActivity.B;
            if (pdfPreviewEntity2 != null) {
                k0.i(pDFCreatorActivity, pdfPreviewEntity2.getPath(), pdfPreviewEntity2, ea.a.p("QWEWZSpwHmYXYxRlVXQ4cg==", "po1quzO7"));
            }
            b1.Y();
            tn.a.a(ReaderPdfApplication.m(), ea.a.p("LG9DZSZjRWU7dC9fEW8GZQ==", "pQFYDjMy"));
            pDFCreatorActivity.finish();
            AppOpenSource appOpenSource = AppCoreFilterEvent.f28650a;
            AppCoreFilterEvent.g(ea.a.p("UHIuYQdlPXAWZmtkBm5l", "dpKhwcn5"));
        }
    }

    @Override // jl.a
    public final void C1() {
        Object obj;
        com.gyf.immersionbar.g gVar;
        this.F = com.gyf.immersionbar.g.r(this);
        if (this.f19294h && new com.gyf.immersionbar.a(this).f13751b && (gVar = this.F) != null) {
            gVar.e(BarHide.FLAG_HIDE_NAVIGATION_BAR);
        }
        com.gyf.immersionbar.g gVar2 = this.F;
        if (gVar2 != null) {
            gVar2.p(a2().C);
            gVar2.f13799k.f13757d = false;
            gVar2.o(!pdf.pdfreader.viewer.editor.free.utils.extension.c.h(this));
            gVar2.j(!pdf.pdfreader.viewer.editor.free.utils.extension.c.h(this));
            gVar2.i(R.color.colorPrimary);
            gVar2.h();
            gVar2.f();
        }
        if (!this.c) {
            tn.a.a(ReaderPdfApplication.m(), ea.a.p("UG85ZSxjEGUTdGU=", "yJra06aH"));
            AppOpenSource appOpenSource = AppCoreFilterEvent.f28650a;
            AppCoreFilterEvent.g(ea.a.p("LHJUYQ1laHA-ZhVzHW93", "TMrNsTuX"));
        }
        this.f25259z = getIntent().getIntExtra(ea.a.p("VW85bQ==", "9BjwPGYa"), 100);
        PageStyleView pageStyleView = a2().f1192n;
        kotlin.jvm.internal.g.d(pageStyleView, ea.a.p("LWlfZBBuUC4qZCxDB2UJdFpyPXQ8bABCNGE6aw==", "yx4iXTj8"));
        h2(pageStyleView);
        if (this.f25259z == 102) {
            a2().B.setText(R.string.arg_res_0x7f1301ad);
            a2().f1198t.setVisibility(8);
            a2().f1197s.setVisibility(8);
            a2().f1196r.setText(R.string.arg_res_0x7f1301b1);
        }
        a2().f1181b.setOnClickListener(new View.OnClickListener(this) { // from class: pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.g

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ PDFCreatorActivity f25321b;

            {
                this.f25321b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i10 = r2;
                PDFCreatorActivity pDFCreatorActivity = this.f25321b;
                switch (i10) {
                    case 0:
                        int i11 = PDFCreatorActivity.G;
                        kotlin.jvm.internal.g.e(pDFCreatorActivity, ea.a.p("EWgxc0Aw", "J4eXdIqs"));
                        pDFCreatorActivity.finish();
                        return;
                    default:
                        int i12 = PDFCreatorActivity.G;
                        kotlin.jvm.internal.g.e(pDFCreatorActivity, ea.a.p("AWghc2Uw", "D9uHAsyg"));
                        if (!pDFCreatorActivity.d2()) {
                            pDFCreatorActivity.f25257x = PageStyle.Grid;
                            kotlin.jvm.internal.g.d(view, ea.a.p("JnQ=", "IvRK8wiI"));
                            pDFCreatorActivity.h2(view);
                            return;
                        }
                        return;
                }
            }
        });
        a2().f1192n.setOnClickListener(new View.OnClickListener(this) { // from class: pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.l

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ PDFCreatorActivity f25331b;

            {
                this.f25331b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i10 = r2;
                PDFCreatorActivity pDFCreatorActivity = this.f25331b;
                switch (i10) {
                    case 0:
                        int i11 = PDFCreatorActivity.G;
                        kotlin.jvm.internal.g.e(pDFCreatorActivity, ea.a.p("O2hYc10w", "fDjOWtbU"));
                        if (!pDFCreatorActivity.d2()) {
                            pDFCreatorActivity.f25257x = PageStyle.Blank;
                            kotlin.jvm.internal.g.d(view, ea.a.p("JnQ=", "z3ruvxCM"));
                            pDFCreatorActivity.h2(view);
                            return;
                        }
                        return;
                    default:
                        int i12 = PDFCreatorActivity.G;
                        kotlin.jvm.internal.g.e(pDFCreatorActivity, ea.a.p("R2gic1cw", "8qxSjICu"));
                        if (!pDFCreatorActivity.d2()) {
                            pDFCreatorActivity.f25256w = PageRGBColor.LIGHT_YELLOW;
                            AppCompatImageView appCompatImageView = pDFCreatorActivity.a2().f1185g;
                            kotlin.jvm.internal.g.d(appCompatImageView, ea.a.p("UWklZBpuBS4CZFJDG2U3dCtye3YFby9vC1kGbCdvBFNWbC5jB2Vk", "ycKs0WDk"));
                            pDFCreatorActivity.g2(appCompatImageView);
                            pDFCreatorActivity.i2(androidx.core.content.a.getColor(pDFCreatorActivity, R.color.color_100_F8F5E4));
                            return;
                        }
                        return;
                }
            }
        });
        a2().f1195q.setOnClickListener(new View.OnClickListener(this) { // from class: pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.m

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ PDFCreatorActivity f25333b;

            {
                this.f25333b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i10 = r2;
                PDFCreatorActivity pDFCreatorActivity = this.f25333b;
                switch (i10) {
                    case 0:
                        int i11 = PDFCreatorActivity.G;
                        kotlin.jvm.internal.g.e(pDFCreatorActivity, ea.a.p("R2gic1cw", "M0DL6lh7"));
                        if (!pDFCreatorActivity.d2()) {
                            pDFCreatorActivity.f25257x = PageStyle.Line;
                            kotlin.jvm.internal.g.d(view, ea.a.p("JnQ=", "pWJ632CV"));
                            pDFCreatorActivity.h2(view);
                            return;
                        }
                        return;
                    default:
                        int i12 = PDFCreatorActivity.G;
                        kotlin.jvm.internal.g.e(pDFCreatorActivity, ea.a.p("R2gic1cw", "JmiRaOTt"));
                        if (!pDFCreatorActivity.d2()) {
                            pDFCreatorActivity.a2().f1187i.setSelected(false);
                            view.setSelected(true);
                            return;
                        }
                        return;
                }
            }
        });
        a2().f1194p.setOnClickListener(new View.OnClickListener(this) { // from class: pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.g

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ PDFCreatorActivity f25321b;

            {
                this.f25321b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i10 = r2;
                PDFCreatorActivity pDFCreatorActivity = this.f25321b;
                switch (i10) {
                    case 0:
                        int i11 = PDFCreatorActivity.G;
                        kotlin.jvm.internal.g.e(pDFCreatorActivity, ea.a.p("EWgxc0Aw", "J4eXdIqs"));
                        pDFCreatorActivity.finish();
                        return;
                    default:
                        int i12 = PDFCreatorActivity.G;
                        kotlin.jvm.internal.g.e(pDFCreatorActivity, ea.a.p("AWghc2Uw", "D9uHAsyg"));
                        if (!pDFCreatorActivity.d2()) {
                            pDFCreatorActivity.f25257x = PageStyle.Grid;
                            kotlin.jvm.internal.g.d(view, ea.a.p("JnQ=", "IvRK8wiI"));
                            pDFCreatorActivity.h2(view);
                            return;
                        }
                        return;
                }
            }
        });
        a2().f1193o.setOnClickListener(new View.OnClickListener(this) { // from class: pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.h

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ PDFCreatorActivity f25323b;

            {
                this.f25323b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i10 = r2;
                PDFCreatorActivity pDFCreatorActivity = this.f25323b;
                switch (i10) {
                    case 0:
                        int i11 = PDFCreatorActivity.G;
                        kotlin.jvm.internal.g.e(pDFCreatorActivity, ea.a.p("R2gic1cw", "OH2SGXZB"));
                        if (!pDFCreatorActivity.d2()) {
                            pDFCreatorActivity.a2().f1186h.setSelected(false);
                            view.setSelected(true);
                            return;
                        }
                        return;
                    default:
                        int i12 = PDFCreatorActivity.G;
                        kotlin.jvm.internal.g.e(pDFCreatorActivity, ea.a.p("O2hYc10w", "Tbnb32J3"));
                        if (!pDFCreatorActivity.d2()) {
                            pDFCreatorActivity.f25257x = PageStyle.Graph;
                            kotlin.jvm.internal.g.d(view, ea.a.p("M3Q=", "EqZDGPmm"));
                            pDFCreatorActivity.h2(view);
                            return;
                        }
                        return;
                }
            }
        });
        a2().f1203y.setOnClickListener(new View.OnClickListener(this) { // from class: pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.i

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ PDFCreatorActivity f25325b;

            {
                this.f25325b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i10 = r2;
                PDFCreatorActivity pDFCreatorActivity = this.f25325b;
                switch (i10) {
                    case 0:
                        int i11 = PDFCreatorActivity.G;
                        kotlin.jvm.internal.g.e(pDFCreatorActivity, ea.a.p("MmgHc2kw", "84FnMXQ7"));
                        if (!pDFCreatorActivity.d2()) {
                            try {
                                pDFCreatorActivity.a2().f1199u.setText(String.valueOf(Integer.parseInt(pDFCreatorActivity.a2().f1199u.getText().toString()) - 1));
                                pDFCreatorActivity.f2();
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        return;
                    default:
                        int i12 = PDFCreatorActivity.G;
                        kotlin.jvm.internal.g.e(pDFCreatorActivity, ea.a.p("R2gic1cw", "hZas90Ym"));
                        if (!pDFCreatorActivity.d2()) {
                            pDFCreatorActivity.f25256w = PageRGBColor.WHITE;
                            AppCompatImageView appCompatImageView = pDFCreatorActivity.a2().f1184f;
                            kotlin.jvm.internal.g.d(appCompatImageView, ea.a.p("LWlfZBBuUC4qZCxDB2UJdFpyJ3YGbwlvI1cEaRtla2UjZVJ0HGQ=", "IwgzQlo8"));
                            pDFCreatorActivity.g2(appCompatImageView);
                            pDFCreatorActivity.i2(androidx.core.content.a.getColor(pDFCreatorActivity, R.color.white));
                            return;
                        }
                        return;
                }
            }
        });
        a2().f1201w.setOnClickListener(new View.OnClickListener(this) { // from class: pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.j

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ PDFCreatorActivity f25327b;

            {
                this.f25327b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i10 = r2;
                PDFCreatorActivity pDFCreatorActivity = this.f25327b;
                switch (i10) {
                    case 0:
                        int i11 = PDFCreatorActivity.G;
                        kotlin.jvm.internal.g.e(pDFCreatorActivity, ea.a.p("O2hYc10w", "zkpRyhiC"));
                        if (!pDFCreatorActivity.d2()) {
                            try {
                                pDFCreatorActivity.a2().f1199u.setText(String.valueOf(Integer.parseInt(pDFCreatorActivity.a2().f1199u.getText().toString()) + 1));
                                pDFCreatorActivity.f2();
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        return;
                    default:
                        int i12 = PDFCreatorActivity.G;
                        kotlin.jvm.internal.g.e(pDFCreatorActivity, ea.a.p("R2gic1cw", "8NX5aQMA"));
                        if (!pDFCreatorActivity.d2()) {
                            pDFCreatorActivity.f25256w = PageRGBColor.LIGHT_BLUE;
                            AppCompatImageView appCompatImageView = pDFCreatorActivity.a2().f1182d;
                            kotlin.jvm.internal.g.d(appCompatImageView, ea.a.p("UWklZBpuBS4CZFJDG2U3dCtye3YFby9vQUItdTNTLWxWYz9lZA==", "3AVHWZJ0"));
                            pDFCreatorActivity.g2(appCompatImageView);
                            pDFCreatorActivity.i2(androidx.core.content.a.getColor(pDFCreatorActivity, R.color.color_100_DCE7F5));
                            return;
                        }
                        return;
                }
            }
        });
        a2().f1202x.setOnClickListener(new View.OnClickListener(this) { // from class: pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.k

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ PDFCreatorActivity f25329b;

            {
                this.f25329b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i10 = r2;
                final PDFCreatorActivity pDFCreatorActivity = this.f25329b;
                switch (i10) {
                    case 0:
                        int i11 = PDFCreatorActivity.G;
                        kotlin.jvm.internal.g.e(pDFCreatorActivity, ea.a.p("O2hYc10w", "kCiTyG1c"));
                        if (!pDFCreatorActivity.d2()) {
                            EnterFileNameDialog enterFileNameDialog = new EnterFileNameDialog(pDFCreatorActivity, pDFCreatorActivity, true);
                            enterFileNameDialog.f27435u = new cg.a<String>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.PDFCreatorActivity$showGiveNameDialog$1$1
                                {
                                    super(0);
                                }

                                @Override // cg.a
                                public final String invoke() {
                                    return PDFCreatorActivity.this.f25254u;
                                }
                            };
                            PDFCreatorActivity$showGiveNameDialog$1$2 pDFCreatorActivity$showGiveNameDialog$1$2 = new cg.l<String, Boolean>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.PDFCreatorActivity$showGiveNameDialog$1$2
                                @Override // cg.l
                                public final Boolean invoke(String name) {
                                    kotlin.jvm.internal.g.e(name, "name");
                                    sn.d d10 = sn.d.d();
                                    String concat = name.concat(".pdf");
                                    String p10 = ea.a.p("IXILYU1l", "bfBn9I2l");
                                    d10.getClass();
                                    return Boolean.valueOf(sn.d.a(concat, p10));
                                }
                            };
                            kotlin.jvm.internal.g.e(pDFCreatorActivity$showGiveNameDialog$1$2, "<set-?>");
                            enterFileNameDialog.f27436v = pDFCreatorActivity$showGiveNameDialog$1$2;
                            enterFileNameDialog.setOnDismissListener(new n());
                            enterFileNameDialog.setCanceledOnTouchOutside(true);
                            enterFileNameDialog.show();
                            return;
                        }
                        return;
                    default:
                        int i12 = PDFCreatorActivity.G;
                        kotlin.jvm.internal.g.e(pDFCreatorActivity, ea.a.p("O2hYc10w", "UwgPh8Zc"));
                        if (!pDFCreatorActivity.d2()) {
                            pDFCreatorActivity.f25256w = PageRGBColor.LIGHT_GREEN;
                            AppCompatImageView appCompatImageView = pDFCreatorActivity.a2().f1183e;
                            kotlin.jvm.internal.g.d(appCompatImageView, ea.a.p("CmkKZAFuXi44ZABDRmU2dFdyG3YKb1pvBkcDZTRuEWUEZQd0DWQ=", "pChdh9Fv"));
                            pDFCreatorActivity.g2(appCompatImageView);
                            pDFCreatorActivity.i2(androidx.core.content.a.getColor(pDFCreatorActivity, R.color.color_100_DDF2E1));
                            return;
                        }
                        return;
                }
            }
        });
        a2().f1204z.setOnClickListener(new View.OnClickListener(this) { // from class: pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.l

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ PDFCreatorActivity f25331b;

            {
                this.f25331b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i10 = r2;
                PDFCreatorActivity pDFCreatorActivity = this.f25331b;
                switch (i10) {
                    case 0:
                        int i11 = PDFCreatorActivity.G;
                        kotlin.jvm.internal.g.e(pDFCreatorActivity, ea.a.p("O2hYc10w", "fDjOWtbU"));
                        if (!pDFCreatorActivity.d2()) {
                            pDFCreatorActivity.f25257x = PageStyle.Blank;
                            kotlin.jvm.internal.g.d(view, ea.a.p("JnQ=", "z3ruvxCM"));
                            pDFCreatorActivity.h2(view);
                            return;
                        }
                        return;
                    default:
                        int i12 = PDFCreatorActivity.G;
                        kotlin.jvm.internal.g.e(pDFCreatorActivity, ea.a.p("R2gic1cw", "8qxSjICu"));
                        if (!pDFCreatorActivity.d2()) {
                            pDFCreatorActivity.f25256w = PageRGBColor.LIGHT_YELLOW;
                            AppCompatImageView appCompatImageView = pDFCreatorActivity.a2().f1185g;
                            kotlin.jvm.internal.g.d(appCompatImageView, ea.a.p("UWklZBpuBS4CZFJDG2U3dCtye3YFby9vC1kGbCdvBFNWbC5jB2Vk", "ycKs0WDk"));
                            pDFCreatorActivity.g2(appCompatImageView);
                            pDFCreatorActivity.i2(androidx.core.content.a.getColor(pDFCreatorActivity, R.color.color_100_F8F5E4));
                            return;
                        }
                        return;
                }
            }
        });
        a2().f1186h.setOnClickListener(new View.OnClickListener(this) { // from class: pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.m

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ PDFCreatorActivity f25333b;

            {
                this.f25333b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i10 = r2;
                PDFCreatorActivity pDFCreatorActivity = this.f25333b;
                switch (i10) {
                    case 0:
                        int i11 = PDFCreatorActivity.G;
                        kotlin.jvm.internal.g.e(pDFCreatorActivity, ea.a.p("R2gic1cw", "M0DL6lh7"));
                        if (!pDFCreatorActivity.d2()) {
                            pDFCreatorActivity.f25257x = PageStyle.Line;
                            kotlin.jvm.internal.g.d(view, ea.a.p("JnQ=", "pWJ632CV"));
                            pDFCreatorActivity.h2(view);
                            return;
                        }
                        return;
                    default:
                        int i12 = PDFCreatorActivity.G;
                        kotlin.jvm.internal.g.e(pDFCreatorActivity, ea.a.p("R2gic1cw", "JmiRaOTt"));
                        if (!pDFCreatorActivity.d2()) {
                            pDFCreatorActivity.a2().f1187i.setSelected(false);
                            view.setSelected(true);
                            return;
                        }
                        return;
                }
            }
        });
        a2().f1187i.setOnClickListener(new View.OnClickListener(this) { // from class: pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.h

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ PDFCreatorActivity f25323b;

            {
                this.f25323b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i10 = r2;
                PDFCreatorActivity pDFCreatorActivity = this.f25323b;
                switch (i10) {
                    case 0:
                        int i11 = PDFCreatorActivity.G;
                        kotlin.jvm.internal.g.e(pDFCreatorActivity, ea.a.p("R2gic1cw", "OH2SGXZB"));
                        if (!pDFCreatorActivity.d2()) {
                            pDFCreatorActivity.a2().f1186h.setSelected(false);
                            view.setSelected(true);
                            return;
                        }
                        return;
                    default:
                        int i12 = PDFCreatorActivity.G;
                        kotlin.jvm.internal.g.e(pDFCreatorActivity, ea.a.p("O2hYc10w", "Tbnb32J3"));
                        if (!pDFCreatorActivity.d2()) {
                            pDFCreatorActivity.f25257x = PageStyle.Graph;
                            kotlin.jvm.internal.g.d(view, ea.a.p("M3Q=", "EqZDGPmm"));
                            pDFCreatorActivity.h2(view);
                            return;
                        }
                        return;
                }
            }
        });
        a2().f1189k.setOnClickListener(new View.OnClickListener(this) { // from class: pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.i

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ PDFCreatorActivity f25325b;

            {
                this.f25325b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i10 = r2;
                PDFCreatorActivity pDFCreatorActivity = this.f25325b;
                switch (i10) {
                    case 0:
                        int i11 = PDFCreatorActivity.G;
                        kotlin.jvm.internal.g.e(pDFCreatorActivity, ea.a.p("MmgHc2kw", "84FnMXQ7"));
                        if (!pDFCreatorActivity.d2()) {
                            try {
                                pDFCreatorActivity.a2().f1199u.setText(String.valueOf(Integer.parseInt(pDFCreatorActivity.a2().f1199u.getText().toString()) - 1));
                                pDFCreatorActivity.f2();
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        return;
                    default:
                        int i12 = PDFCreatorActivity.G;
                        kotlin.jvm.internal.g.e(pDFCreatorActivity, ea.a.p("R2gic1cw", "hZas90Ym"));
                        if (!pDFCreatorActivity.d2()) {
                            pDFCreatorActivity.f25256w = PageRGBColor.WHITE;
                            AppCompatImageView appCompatImageView = pDFCreatorActivity.a2().f1184f;
                            kotlin.jvm.internal.g.d(appCompatImageView, ea.a.p("LWlfZBBuUC4qZCxDB2UJdFpyJ3YGbwlvI1cEaRtla2UjZVJ0HGQ=", "IwgzQlo8"));
                            pDFCreatorActivity.g2(appCompatImageView);
                            pDFCreatorActivity.i2(androidx.core.content.a.getColor(pDFCreatorActivity, R.color.white));
                            return;
                        }
                        return;
                }
            }
        });
        a2().f1188j.setOnClickListener(new View.OnClickListener(this) { // from class: pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.j

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ PDFCreatorActivity f25327b;

            {
                this.f25327b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i10 = r2;
                PDFCreatorActivity pDFCreatorActivity = this.f25327b;
                switch (i10) {
                    case 0:
                        int i11 = PDFCreatorActivity.G;
                        kotlin.jvm.internal.g.e(pDFCreatorActivity, ea.a.p("O2hYc10w", "zkpRyhiC"));
                        if (!pDFCreatorActivity.d2()) {
                            try {
                                pDFCreatorActivity.a2().f1199u.setText(String.valueOf(Integer.parseInt(pDFCreatorActivity.a2().f1199u.getText().toString()) + 1));
                                pDFCreatorActivity.f2();
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        return;
                    default:
                        int i12 = PDFCreatorActivity.G;
                        kotlin.jvm.internal.g.e(pDFCreatorActivity, ea.a.p("R2gic1cw", "8NX5aQMA"));
                        if (!pDFCreatorActivity.d2()) {
                            pDFCreatorActivity.f25256w = PageRGBColor.LIGHT_BLUE;
                            AppCompatImageView appCompatImageView = pDFCreatorActivity.a2().f1182d;
                            kotlin.jvm.internal.g.d(appCompatImageView, ea.a.p("UWklZBpuBS4CZFJDG2U3dCtye3YFby9vQUItdTNTLWxWYz9lZA==", "3AVHWZJ0"));
                            pDFCreatorActivity.g2(appCompatImageView);
                            pDFCreatorActivity.i2(androidx.core.content.a.getColor(pDFCreatorActivity, R.color.color_100_DCE7F5));
                            return;
                        }
                        return;
                }
            }
        });
        a2().f1187i.setSelected(true);
        f2();
        this.f25254u = a0.a.h("PDFReader", new SimpleDateFormat(ea.a.p("bHkyeQpNL2QWX3xIBG0=", "qU3alLtw"), pdf.pdfreader.viewer.editor.free.utils.a0.d(this)).format(Long.valueOf(System.currentTimeMillis())));
        AppCompatTextView appCompatTextView = a2().f1197s;
        String str = this.f25254u;
        appCompatTextView.setText(str + ".pdf");
        a2().f1197s.setOnClickListener(new View.OnClickListener(this) { // from class: pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.k

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ PDFCreatorActivity f25329b;

            {
                this.f25329b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i10 = r2;
                final PDFCreatorActivity pDFCreatorActivity = this.f25329b;
                switch (i10) {
                    case 0:
                        int i11 = PDFCreatorActivity.G;
                        kotlin.jvm.internal.g.e(pDFCreatorActivity, ea.a.p("O2hYc10w", "kCiTyG1c"));
                        if (!pDFCreatorActivity.d2()) {
                            EnterFileNameDialog enterFileNameDialog = new EnterFileNameDialog(pDFCreatorActivity, pDFCreatorActivity, true);
                            enterFileNameDialog.f27435u = new cg.a<String>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.PDFCreatorActivity$showGiveNameDialog$1$1
                                {
                                    super(0);
                                }

                                @Override // cg.a
                                public final String invoke() {
                                    return PDFCreatorActivity.this.f25254u;
                                }
                            };
                            PDFCreatorActivity$showGiveNameDialog$1$2 pDFCreatorActivity$showGiveNameDialog$1$2 = new cg.l<String, Boolean>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.PDFCreatorActivity$showGiveNameDialog$1$2
                                @Override // cg.l
                                public final Boolean invoke(String name) {
                                    kotlin.jvm.internal.g.e(name, "name");
                                    sn.d d10 = sn.d.d();
                                    String concat = name.concat(".pdf");
                                    String p10 = ea.a.p("IXILYU1l", "bfBn9I2l");
                                    d10.getClass();
                                    return Boolean.valueOf(sn.d.a(concat, p10));
                                }
                            };
                            kotlin.jvm.internal.g.e(pDFCreatorActivity$showGiveNameDialog$1$2, "<set-?>");
                            enterFileNameDialog.f27436v = pDFCreatorActivity$showGiveNameDialog$1$2;
                            enterFileNameDialog.setOnDismissListener(new n());
                            enterFileNameDialog.setCanceledOnTouchOutside(true);
                            enterFileNameDialog.show();
                            return;
                        }
                        return;
                    default:
                        int i12 = PDFCreatorActivity.G;
                        kotlin.jvm.internal.g.e(pDFCreatorActivity, ea.a.p("O2hYc10w", "UwgPh8Zc"));
                        if (!pDFCreatorActivity.d2()) {
                            pDFCreatorActivity.f25256w = PageRGBColor.LIGHT_GREEN;
                            AppCompatImageView appCompatImageView = pDFCreatorActivity.a2().f1183e;
                            kotlin.jvm.internal.g.d(appCompatImageView, ea.a.p("CmkKZAFuXi44ZABDRmU2dFdyG3YKb1pvBkcDZTRuEWUEZQd0DWQ=", "pChdh9Fv"));
                            pDFCreatorActivity.g2(appCompatImageView);
                            pDFCreatorActivity.i2(androidx.core.content.a.getColor(pDFCreatorActivity, R.color.color_100_DDF2E1));
                            return;
                        }
                        return;
                }
            }
        });
        if (this.f25259z == 102) {
            this.f25255v = PageSize.FollowPrevious;
            a2().f1200v.setText(R.string.arg_res_0x7f130169);
            e2();
        } else {
            wm.a.c.getClass();
            String pageSizeStr = (String) wm.a.f31373e.b(wm.a.f31372d[0]);
            kotlin.jvm.internal.g.e(pageSizeStr, "pageSizeStr");
            Iterator it = ge.a.I(PageSize.A3, PageSize.A4, PageSize.A5, PageSize.B4, PageSize.B5, PageSize.Letter, PageSize.Legal).iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (kotlin.text.j.G(((PageSize) obj).name(), pageSizeStr, true)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            PageSize pageSize = (PageSize) obj;
            if (pageSize == null) {
                pageSize = PageSize.B4;
            }
            this.f25255v = pageSize;
            a2().f1200v.setText(this.f25255v.name());
        }
        AppCompatTextView appCompatTextView2 = a2().f1200v;
        kotlin.jvm.internal.g.d(appCompatTextView2, ea.a.p("UWklZBpuBS4CZFJDG2U3dCtyZnYWYSRlYmkTZQ==", "1i53MO4l"));
        pdf.pdfreader.viewer.editor.free.utils.extension.g.e(appCompatTextView2, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.PDFCreatorActivity$findView$15
            {
                super(1);
            }

            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(View view) {
                invoke2(view);
                return tf.d.f30009a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View it2) {
                kotlin.jvm.internal.g.e(it2, "it");
                PDFCreatorActivity pDFCreatorActivity = PDFCreatorActivity.this;
                int i10 = PDFCreatorActivity.G;
                if (pDFCreatorActivity.d2()) {
                    return;
                }
                PDFCreatorActivity pDFCreatorActivity2 = PDFCreatorActivity.this;
                final PDFCreatorActivity pDFCreatorActivity3 = PDFCreatorActivity.this;
                PageSizeSelectDialog pageSizeSelectDialog = new PageSizeSelectDialog(pDFCreatorActivity3, pDFCreatorActivity3.f25255v, pDFCreatorActivity3.f25259z != 102, new cg.l<PageSize, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.PDFCreatorActivity$findView$15.1
                    {
                        super(1);
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2(PageSize it3) {
                        kotlin.jvm.internal.g.e(it3, "it");
                        PDFCreatorActivity.this.f25255v = it3;
                        if (kotlin.jvm.internal.g.a(it3.name(), ea.a.p("dW8nbBx3MnIXdl1vHHM=", "mSberucZ"))) {
                            PDFCreatorActivity.this.a2().f1200v.setText(R.string.arg_res_0x7f130169);
                        } else {
                            PDFCreatorActivity.this.a2().f1200v.setText(it3.name());
                        }
                        PDFCreatorActivity.this.e2();
                    }

                    @Override // cg.l
                    public /* bridge */ /* synthetic */ tf.d invoke(PageSize pageSize2) {
                        invoke2(pageSize2);
                        return tf.d.f30009a;
                    }
                });
                pageSizeSelectDialog.setCanceledOnTouchOutside(true);
                pageSizeSelectDialog.show();
                pDFCreatorActivity2.getClass();
            }
        });
        TextView textView = a2().f1199u;
        kotlin.jvm.internal.g.d(textView, ea.a.p("C2lXZDBuHS44ZABDRmU2dFdyBnYZYVFlN28EbnQ=", "YLi9Yz9I"));
        pdf.pdfreader.viewer.editor.free.utils.extension.g.e(textView, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.PDFCreatorActivity$findView$16
            {
                super(1);
            }

            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(View view) {
                invoke2(view);
                return tf.d.f30009a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View it2) {
                kotlin.jvm.internal.g.e(it2, "it");
                PDFCreatorActivity pDFCreatorActivity = PDFCreatorActivity.this;
                int i10 = PDFCreatorActivity.G;
                if (pDFCreatorActivity.d2()) {
                    return;
                }
                PDFCreatorActivity pDFCreatorActivity2 = PDFCreatorActivity.this;
                pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.dialog.b bVar = new pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.dialog.b(PDFCreatorActivity.this);
                final PDFCreatorActivity pDFCreatorActivity3 = PDFCreatorActivity.this;
                String obj2 = pDFCreatorActivity3.a2().f1199u.getText().toString();
                kotlin.jvm.internal.g.e(obj2, "<set-?>");
                bVar.f25369q = obj2;
                bVar.setCanceledOnTouchOutside(true);
                bVar.show();
                bVar.f25367o = new cg.l<String, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.PDFCreatorActivity$findView$16$1$1
                    {
                        super(1);
                    }

                    @Override // cg.l
                    public /* bridge */ /* synthetic */ tf.d invoke(String str2) {
                        invoke2(str2);
                        return tf.d.f30009a;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2(String count) {
                        kotlin.jvm.internal.g.e(count, "count");
                        PDFCreatorActivity pDFCreatorActivity4 = PDFCreatorActivity.this;
                        int i11 = PDFCreatorActivity.G;
                        pDFCreatorActivity4.a2().f1199u.setText(count);
                        PDFCreatorActivity.this.f2();
                    }
                };
                pDFCreatorActivity2.getClass();
            }
        });
        a2().f1199u.setText(ea.a.p("MQ==", "iRREzjQy"));
        LinearLayout linearLayout = a2().f1190l;
        kotlin.jvm.internal.g.d(linearLayout, ea.a.p("LWlfZBBuUC4qZCxDB2UJdFpyImwGcgBhGGU=", "VvzelFfs"));
        pdf.pdfreader.viewer.editor.free.utils.extension.g.e(linearLayout, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.PDFCreatorActivity$findView$17
            {
                super(1);
            }

            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(View view) {
                invoke2(view);
                return tf.d.f30009a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View it2) {
                kotlin.jvm.internal.g.e(it2, "it");
                PDFCreatorActivity pDFCreatorActivity = PDFCreatorActivity.this;
                int i10 = PDFCreatorActivity.G;
                pDFCreatorActivity.c2();
            }
        });
    }

    @Override // jl.a
    public final View D1() {
        ConstraintLayout constraintLayout = a2().f1180a;
        kotlin.jvm.internal.g.d(constraintLayout, ea.a.p("LWlfZBBuUC4obyV0", "T4Ue4TNN"));
        return constraintLayout;
    }

    @Override // jl.a
    public final int E1() {
        return 0;
    }

    public final am.o a2() {
        return (am.o) this.f25253t.getValue();
    }

    public final String b2() {
        String p10;
        String f10;
        String p11;
        boolean z10;
        boolean z11;
        int i10 = this.f25259z;
        if (i10 != 100) {
            if (i10 != 101) {
                p10 = null;
            } else {
                p10 = ea.a.p("TW8EbHM=", "tK9kpPXf");
            }
        } else {
            p10 = ea.a.p("W28mZSx0DW8ecw==", "2vysD0NT");
        }
        String name = this.f25257x.name();
        Locale locale = Locale.ENGLISH;
        String f11 = a6.h.f("L04CTDhTSA==", "9zjEqIIE", locale, name, locale);
        kotlin.jvm.internal.g.d(f11, ea.a.p("R2gic1NhESAYYUJhR2w3biMuYXQ0aS1nQy4Dbz1vMGVBQypzFigObxFhWGUp", "jwqGXA5f"));
        int i11 = 1;
        if (a.f25260a[this.f25255v.ordinal()] == 1) {
            f10 = ea.a.p("KXA=", "8weQZ2lo");
        } else {
            f10 = a6.h.f("Ck52TDBTSA==", "i6YlBNrx", locale, this.f25255v.name(), locale);
            kotlin.jvm.internal.g.d(f10, ea.a.p("R2gic1NhESAYYUJhR2w3biMuYXQ0aS1nXi43bzRvE2VBQypzFigObxFhWGUp", "wCxd033Y"));
        }
        int ordinal = this.f25256w.ordinal() - 1;
        if (a2().f1186h.isSelected()) {
            p11 = ea.a.p("aA==", "zDhaKTt1");
        } else {
            p11 = ea.a.p("dg==", "B0YruX8P");
        }
        int parseInt = Integer.parseInt(a2().f1199u.getText().toString());
        if (parseInt != 1) {
            if (2 <= parseInt && parseInt < 6) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                i11 = 2;
            } else {
                if (6 <= parseInt && parseInt < 11) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    i11 = 3;
                } else {
                    if (11 > parseInt || parseInt >= 16) {
                        i11 = 0;
                    }
                    if (i11 != 0) {
                        i11 = 4;
                    } else {
                        i11 = 5;
                    }
                }
            }
        }
        StringBuilder sb2 = new StringBuilder();
        if (p10 != null) {
            sb2.append(p10.concat("_"));
        }
        sb2.append(f11 + "_" + f10 + "_" + ordinal + "_" + p11 + "_" + i11);
        String sb3 = sb2.toString();
        kotlin.jvm.internal.g.d(sb3, ea.a.p("YHQ5aR1nIHUbbFBlGyh_LiVwQmw_KCF1J2xTZSFBE3RabyUpXXQNUwZyXW4OKCk=", "N7SpbnpM"));
        return sb3;
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.dialog.EnterFileNameDialog.a
    public final void c(String str, boolean z10) {
        this.f25254u = str;
        AppCompatTextView appCompatTextView = a2().f1197s;
        String str2 = this.f25254u;
        appCompatTextView.setText(str2 + ".pdf");
    }

    public final void c2() {
        if (!A1() || !z1(5000000L)) {
            return;
        }
        if (this.f25259z == 102) {
            ym.a aVar = new ym.a();
            aVar.f32183e = Integer.parseInt(a2().f1199u.getText().toString());
            aVar.f32181b = this.f25256w.getR();
            aVar.c = this.f25256w.getG();
            aVar.f32182d = this.f25256w.getB();
            aVar.f32186h = this.f25257x.getStyle();
            PageSize pageSize = this.f25255v;
            if (pageSize != PageSize.FollowPrevious) {
                aVar.f32180a = new Rect(0, 0, Math.round((pageSize.getW() * 72) / 25.4f), Math.round((this.f25255v.getH() * 72) / 25.4f));
                if (a2().f1186h.isSelected()) {
                    aVar.f32185g = 1;
                } else {
                    aVar.f32185g = 0;
                }
            } else {
                aVar.f32185g = 0;
            }
            tn.a.d(this, ea.a.p("FW43cAJnZQ==", "WqxPc73p"), ea.a.p("W24NcFVnMV8hbhVlRnQIYlRhPGsWZFluZQ==", "lR6j4To9"), b2(), false);
            Intent intent = new Intent();
            intent.putExtra(ea.a.p("UWwqbhhQA2cXSVpmbw==", "r5pXfglW"), aVar);
            tf.d dVar = tf.d.f30009a;
            setResult(-1, intent);
            finish();
            return;
        }
        a2().f1190l.setEnabled(false);
        wm.a aVar2 = wm.a.c;
        String name = this.f25255v.name();
        aVar2.getClass();
        kotlin.jvm.internal.g.e(name, "<set-?>");
        wm.a.f31373e.c(wm.a.f31372d[0], name);
        w0.a().c.execute(new androidx.activity.k(this, 26));
    }

    public final boolean d2() {
        return !a2().f1190l.isEnabled();
    }

    public final void e2() {
        if (this.f25255v == PageSize.FollowPrevious) {
            a2().c.setVisibility(8);
        } else if (a2().c.getVisibility() == 8) {
            a2().c.setVisibility(0);
            a2().f1186h.setSelected(false);
            a2().f1187i.setSelected(true);
        }
    }

    public final void f2() {
        a2().f1189k.setEnabled(!kotlin.jvm.internal.g.a(a2().f1199u.getText(), ea.a.p("MQ==", "mLVnN9RC")));
        a2().f1188j.setEnabled(!kotlin.jvm.internal.g.a(a2().f1199u.getText(), ea.a.p("fTAw", "scLrJBYH")));
    }

    public final void g2(AppCompatImageView appCompatImageView) {
        int i10;
        int i11;
        int i12;
        AppCompatImageView appCompatImageView2 = a2().f1184f;
        kotlin.jvm.internal.g.d(appCompatImageView2, ea.a.p("LWlfZBBuUC4qZCxDB2UJdFpyJ3YGbwlvC1c9aUVlK2UjZVJ0HGQ=", "sP8oyU1x"));
        int i13 = 0;
        if (kotlin.jvm.internal.g.a(a2().f1184f, appCompatImageView)) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        appCompatImageView2.setVisibility(i10);
        AppCompatImageView appCompatImageView3 = a2().f1182d;
        kotlin.jvm.internal.g.d(appCompatImageView3, ea.a.p("CmlWZF5uPi44ZABDRmU2dFdyG3YKb1pvBkIddTRTJ2wNY0xlZA==", "WLh87YWt"));
        if (kotlin.jvm.internal.g.a(a2().f1182d, appCompatImageView)) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        appCompatImageView3.setVisibility(i11);
        AppCompatImageView appCompatImageView4 = a2().f1185g;
        kotlin.jvm.internal.g.d(appCompatImageView4, ea.a.p("LWlfZBBuUC4qZCxDB2UJdFpyJ3YGbwlvO1kfbBtvIVMqbFRjDWVk", "rUyzIzwV"));
        if (kotlin.jvm.internal.g.a(a2().f1185g, appCompatImageView)) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        appCompatImageView4.setVisibility(i12);
        AppCompatImageView appCompatImageView5 = a2().f1183e;
        kotlin.jvm.internal.g.d(appCompatImageView5, ea.a.p("LWlfZBBuUC4qZCxDB2UJdFpyJ3YGbwlvBUcYZQluPmUjZVJ0HGQ=", "V3hIwjlm"));
        if (!kotlin.jvm.internal.g.a(a2().f1183e, appCompatImageView)) {
            i13 = 8;
        }
        appCompatImageView5.setVisibility(i13);
    }

    public final void h2(View view) {
        a2().f1192n.setSelected(kotlin.jvm.internal.g.a(view, a2().f1192n));
        a2().f1195q.setSelected(kotlin.jvm.internal.g.a(view, a2().f1195q));
        a2().f1194p.setSelected(kotlin.jvm.internal.g.a(view, a2().f1194p));
        a2().f1193o.setSelected(kotlin.jvm.internal.g.a(view, a2().f1193o));
    }

    public final void i2(int i10) {
        a2().f1192n.setPageBgColor(i10);
        a2().f1195q.setPageBgColor(i10);
        a2().f1194p.setPageBgColor(i10);
        a2().f1193o.setPageBgColor(i10);
    }

    @Override // jl.a, androidx.appcompat.app.c, androidx.fragment.app.u, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        this.D.removeCallbacksAndMessages(null);
    }

    @Override // jl.a, androidx.fragment.app.u, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.A) {
            this.A = false;
            PdfPreviewEntity pdfPreviewEntity = this.B;
            if (pdfPreviewEntity != null) {
                this.D.obtainMessage(200, pdfPreviewEntity).sendToTarget();
            }
        }
    }

    @Override // jl.a
    public final void w1(int i10) {
        if (i10 == 1) {
            c2();
        }
    }

    @Override // jl.a
    public final void K1() {
    }
}

package pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui;

import am.n1;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.lifecycle.w;
import androidx.viewpager2.widget.ViewPager2;
import en.a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import lib.zj.pdfeditor.ReaderPDFCore;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.feature.ocr.data.OCRWorkFlow;
import pdf.pdfreader.viewer.editor.free.feature.ocr.helper.OCRTransportImageExecutor;
import pdf.pdfreader.viewer.editor.free.feature.ocr.ui.OCRPreviewActivity;
import pdf.pdfreader.viewer.editor.free.feature.pdf2image.data.ImageFileInfo;
import pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.Pdf2ImageBigPicPreviewActivity;
import pdf.pdfreader.viewer.editor.free.feature.pdf2image.widget.Pdf2ImageConvertCompletedView;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderHomeActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.tools.ToolsType;
import pdf.pdfreader.viewer.editor.free.ui.myview.ReaderRoundProgressBar;
import pdf.pdfreader.viewer.editor.free.utils.t0;
import pdf.pdfreader.viewer.editor.free.utils.w0;

/* compiled from: Pdf2ImageBigPicPreviewActivity.kt */
/* loaded from: classes3.dex */
public final class Pdf2ImageBigPicPreviewActivity extends BasePdf2ImageActivity {

    /* renamed from: p0  reason: collision with root package name */
    public int f25495p0;

    /* renamed from: q0  reason: collision with root package name */
    public int f25496q0;

    /* renamed from: r0  reason: collision with root package name */
    public int f25497r0;

    /* renamed from: s0  reason: collision with root package name */
    public boolean f25498s0;

    /* renamed from: u0  reason: collision with root package name */
    public ValueAnimator f25500u0;

    /* renamed from: v0  reason: collision with root package name */
    public ValueAnimator f25501v0;

    /* renamed from: x0  reason: collision with root package name */
    public static final String f25492x0 = ea.a.p("UHU5chZuFl8CYVNl", "3aQVnxkL");

    /* renamed from: y0  reason: collision with root package name */
    public static final String f25493y0 = ea.a.p("EHMddzd0JHIlYRRr", "1ByBVAHe");

    /* renamed from: w0  reason: collision with root package name */
    public static final a f25491w0 = new a();

    /* renamed from: o0  reason: collision with root package name */
    public final tf.c f25494o0 = kotlin.a.a(new cg.a<am.q>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.Pdf2ImageBigPicPreviewActivity$binding$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final am.q invoke() {
            View inflate = Pdf2ImageBigPicPreviewActivity.this.getLayoutInflater().inflate(R.layout.activity_pdf_to_image_big_image_preview, (ViewGroup) null, false);
            int i10 = R.id.backImg;
            AppCompatImageView appCompatImageView = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.backImg);
            if (appCompatImageView != null) {
                i10 = R.id.cardView1;
                FrameLayout frameLayout = (FrameLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.cardView1);
                if (frameLayout != null) {
                    i10 = R.id.centerFl;
                    FrameLayout frameLayout2 = (FrameLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.centerFl);
                    if (frameLayout2 != null) {
                        i10 = R.id.checkIv;
                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.checkIv);
                        if (appCompatImageView2 != null) {
                            i10 = R.id.frameIv1;
                            if (((AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.frameIv1)) != null) {
                                i10 = R.id.group_select_image;
                                Group group = (Group) com.google.android.play.core.assetpacks.c.u(inflate, R.id.group_select_image);
                                if (group != null) {
                                    i10 = R.id.iv_select_image;
                                    AppCompatImageView appCompatImageView3 = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.iv_select_image);
                                    if (appCompatImageView3 != null) {
                                        i10 = R.id.ll_convert;
                                        ConstraintLayout constraintLayout = (ConstraintLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.ll_convert);
                                        if (constraintLayout != null) {
                                            i10 = R.id.ll_select_num;
                                            if (((LinearLayoutCompat) com.google.android.play.core.assetpacks.c.u(inflate, R.id.ll_select_num)) != null) {
                                                i10 = R.id.newMarkAllowIv;
                                                if (((ImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.newMarkAllowIv)) != null) {
                                                    i10 = R.id.pdf2image_convert_completed;
                                                    Pdf2ImageConvertCompletedView pdf2ImageConvertCompletedView = (Pdf2ImageConvertCompletedView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.pdf2image_convert_completed);
                                                    if (pdf2ImageConvertCompletedView != null) {
                                                        i10 = R.id.preview_done_allow_iv;
                                                        if (((AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.preview_done_allow_iv)) != null) {
                                                            i10 = R.id.root_preview_progressbar;
                                                            View u7 = com.google.android.play.core.assetpacks.c.u(inflate, R.id.root_preview_progressbar);
                                                            if (u7 != null) {
                                                                n1 a10 = n1.a(u7);
                                                                ConstraintLayout constraintLayout2 = (ConstraintLayout) inflate;
                                                                i10 = R.id.titleTv;
                                                                AppCompatTextView appCompatTextView = (AppCompatTextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.titleTv);
                                                                if (appCompatTextView != null) {
                                                                    i10 = R.id.toolBarBg;
                                                                    View u10 = com.google.android.play.core.assetpacks.c.u(inflate, R.id.toolBarBg);
                                                                    if (u10 != null) {
                                                                        i10 = R.id.tv_convert;
                                                                        TextView textView = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_convert);
                                                                        if (textView != null) {
                                                                            i10 = R.id.tv_select_num;
                                                                            TextView textView2 = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_select_num);
                                                                            if (textView2 != null) {
                                                                                i10 = R.id.viewBottomGallery;
                                                                                ConstraintLayout constraintLayout3 = (ConstraintLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.viewBottomGallery);
                                                                                if (constraintLayout3 != null) {
                                                                                    i10 = R.id.viewPager;
                                                                                    ViewPager2 viewPager2 = (ViewPager2) com.google.android.play.core.assetpacks.c.u(inflate, R.id.viewPager);
                                                                                    if (viewPager2 != null) {
                                                                                        i10 = R.id.view_status_bar;
                                                                                        View u11 = com.google.android.play.core.assetpacks.c.u(inflate, R.id.view_status_bar);
                                                                                        if (u11 != null) {
                                                                                            return new am.q(constraintLayout2, appCompatImageView, frameLayout, frameLayout2, appCompatImageView2, group, appCompatImageView3, constraintLayout, pdf2ImageConvertCompletedView, a10, constraintLayout2, appCompatTextView, u10, textView, textView2, constraintLayout3, viewPager2, u11);
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
            throw new NullPointerException(ea.a.p("fmk4cxpuBSAAZUV1AHIzZGR2W2UxIDRpHmgQSSk6IA==", "j0mp7YZf").concat(inflate.getResources().getResourceName(i10)));
        }
    });

    /* renamed from: t0  reason: collision with root package name */
    public final tf.c f25499t0 = kotlin.a.a(new cg.a<pdf.pdfreader.viewer.editor.free.feature.pdf2image.adapter.a>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.Pdf2ImageBigPicPreviewActivity$viewpageAdapter$2
        @Override // cg.a
        public final pdf.pdfreader.viewer.editor.free.feature.pdf2image.adapter.a invoke() {
            return new pdf.pdfreader.viewer.editor.free.feature.pdf2image.adapter.a();
        }
    });

    /* compiled from: Pdf2ImageBigPicPreviewActivity.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        public static void a(jl.a context, String pdfPath, boolean z10, String from, String pdfPwd, int i10, boolean z11) {
            kotlin.jvm.internal.g.e(context, "context");
            kotlin.jvm.internal.g.e(pdfPath, "pdfPath");
            kotlin.jvm.internal.g.e(from, "from");
            kotlin.jvm.internal.g.e(pdfPwd, "pdfPwd");
            Intent intent = new Intent(context, Pdf2ImageBigPicPreviewActivity.class);
            intent.putExtra(ea.a.p("AWQsXzZhLWg=", "M6qJFYzs"), pdfPath);
            intent.putExtra(ea.a.p("WnMUbBxuBV8bbVVnZQ==", "P0FzvyPV"), z10);
            intent.putExtra(ea.a.p("VXIEbQ==", "mI3k9tyQ"), from);
            intent.putExtra(ea.a.p("Q2QtXwN3ZA==", "yayWF4Na"), pdfPwd);
            intent.putExtra(ea.a.p("UHU5chZuFl8CYVNl", "QpWDHY04"), i10);
            intent.putExtra(ea.a.p("M3MPdzF0LXIlYRRr", "XoZPPHGE"), z11);
            context.startActivity(intent);
        }
    }

    /* compiled from: Pdf2ImageBigPicPreviewActivity.kt */
    /* loaded from: classes3.dex */
    public static final class b extends Pdf2ImageConvertCompletedView.a {
        public b() {
        }

        @Override // pdf.pdfreader.viewer.editor.free.feature.pdf2image.widget.Pdf2ImageConvertCompletedView.a, pdf.pdfreader.viewer.editor.free.feature.pdf2word.widget.BasePdfConvertCompletedView.a
        public final void a() {
            Pdf2ImageBigPicPreviewActivity pdf2ImageBigPicPreviewActivity = Pdf2ImageBigPicPreviewActivity.this;
            pdf.pdfreader.viewer.editor.free.utils.p.q(pdf2ImageBigPicPreviewActivity, pdf2ImageBigPicPreviewActivity.w2());
        }

        @Override // pdf.pdfreader.viewer.editor.free.feature.pdf2word.widget.BasePdfConvertCompletedView.a
        public final void close() {
            Pdf2ImageBigPicPreviewActivity.this.onBackPressed();
        }

        @Override // pdf.pdfreader.viewer.editor.free.feature.pdf2image.widget.Pdf2ImageConvertCompletedView.a, pdf.pdfreader.viewer.editor.free.feature.pdf2word.widget.BasePdfConvertCompletedView.a
        /* renamed from: g */
        public final void b(Context context, List<ImageFileInfo> list) {
            kotlin.jvm.internal.g.e(context, "context");
            super.b(context, list);
            Pdf2ImageBigPicPreviewActivity pdf2ImageBigPicPreviewActivity = Pdf2ImageBigPicPreviewActivity.this;
            pdf.pdfreader.viewer.editor.free.utils.p.p(pdf2ImageBigPicPreviewActivity, pdf2ImageBigPicPreviewActivity.w2());
        }

        @Override // pdf.pdfreader.viewer.editor.free.feature.pdf2image.widget.Pdf2ImageConvertCompletedView.a, pdf.pdfreader.viewer.editor.free.feature.pdf2word.widget.BasePdfConvertCompletedView.a
        /* renamed from: h */
        public final void e(Context context, List<ImageFileInfo> list) {
            kotlin.jvm.internal.g.e(context, "context");
            Pdf2ImageBigPicPreviewActivity pdf2ImageBigPicPreviewActivity = Pdf2ImageBigPicPreviewActivity.this;
            pdf.pdfreader.viewer.editor.free.utils.p.n(pdf2ImageBigPicPreviewActivity, pdf2ImageBigPicPreviewActivity.w2());
            pdf2ImageBigPicPreviewActivity.q2(list);
        }
    }

    /* compiled from: Pdf2ImageBigPicPreviewActivity.kt */
    /* loaded from: classes3.dex */
    public static final class c extends ViewPager2.g {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ViewPager2 f25504b;

        public c(ViewPager2 viewPager2) {
            this.f25504b = viewPager2;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public final void c(int i10) {
            boolean z10;
            Pdf2ImageBigPicPreviewActivity pdf2ImageBigPicPreviewActivity = Pdf2ImageBigPicPreviewActivity.this;
            int i11 = 0;
            if (pdf2ImageBigPicPreviewActivity.f25495p0 != i10) {
                int itemCount = pdf2ImageBigPicPreviewActivity.b3().getItemCount();
                int i12 = pdf2ImageBigPicPreviewActivity.f25495p0;
                if (i12 >= 0 && i12 < itemCount) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    ViewPager2 viewPager2 = this.f25504b;
                    if (viewPager2.isInLayout()) {
                        viewPager2.post(new u.j(this, pdf2ImageBigPicPreviewActivity.f25495p0, pdf2ImageBigPicPreviewActivity, 3));
                    } else {
                        pdf2ImageBigPicPreviewActivity.b3().notifyItemChanged(pdf2ImageBigPicPreviewActivity.f25495p0);
                    }
                }
            }
            pdf2ImageBigPicPreviewActivity.f25495p0 = i10;
            String string = pdf2ImageBigPicPreviewActivity.getString(R.string.arg_res_0x7f130048);
            kotlin.jvm.internal.g.d(string, ea.a.p("KGVFUw1yXm49KBguBnQaaVtnQGEpbDpwKGcgcwViG2Esa1R0KQ==", "bM3OIEZi"));
            Object[] objArr = new Object[2];
            objArr[0] = String.valueOf(pdf2ImageBigPicPreviewActivity.f25495p0 + 1);
            ArrayList arrayList = (ArrayList) en.a.f16816b.d();
            if (arrayList != null) {
                i11 = arrayList.size();
            }
            objArr[1] = String.valueOf(i11);
            String format = String.format(string, Arrays.copyOf(objArr, 2));
            kotlin.jvm.internal.g.d(format, ea.a.p("VW85bRJ0SmYdcllhHSx2KiVyVXMp", "gj4r03hO"));
            SpannableString spannableString = new SpannableString(format);
            int Y = kotlin.text.k.Y(format, ea.a.p("Lw==", "Un6UN3fa"), 6);
            if (!pdf2ImageBigPicPreviewActivity.F2()) {
                spannableString.setSpan(new RelativeSizeSpan(0.75f), Y, format.length(), 17);
            }
            pdf2ImageBigPicPreviewActivity.Z2().f1320l.setText(spannableString);
            pdf2ImageBigPicPreviewActivity.Y2((bn.a) kotlin.collections.m.t0(i10, pdf2ImageBigPicPreviewActivity.b3().f25452d));
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.BasePdf2ImageActivity
    public final View A2() {
        return Z2().f1326r;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.BasePdf2ImageActivity
    public final void B2() {
        com.gyf.immersionbar.g gVar;
        if (!this.f19294h && (gVar = this.S) != null) {
            gVar.j(!pdf.pdfreader.viewer.editor.free.utils.extension.c.h(this));
            gVar.i(R.color.colorPrimary);
            gVar.f();
        }
        ((ConstraintLayout) Z2().f1318j.f1170f).setVisibility(8);
    }

    @Override // jl.a
    public final View D1() {
        ConstraintLayout constraintLayout = Z2().f1319k;
        kotlin.jvm.internal.g.d(constraintLayout, ea.a.p("UWklZBpuBS4Ab1t0P2kzdw==", "561pYh3H"));
        return constraintLayout;
    }

    @Override // jl.a
    public final int E1() {
        return 0;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.BasePdf2ImageActivity
    public final boolean J2() {
        return this.f25498s0;
    }

    @Override // jl.a
    public final void K1() {
        if (F2()) {
            Z2().f1322n.setText(R.string.arg_res_0x7f130437);
        } else {
            Z2().f1322n.setText(R.string.arg_res_0x7f130106);
        }
        LinearLayout linearLayout = (LinearLayout) Z2().f1318j.f1168d;
        kotlin.jvm.internal.g.d(linearLayout, ea.a.p("LWlfZBBuUC4obyV0JXINdlxlGVA3bwJyE3McYhNyf2wjT0FlC2FDZRlvJHQUaQZlcg==", "Z4AhvorQ"));
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        if (layoutParams != null) {
            ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
            ((ViewGroup.MarginLayoutParams) bVar).width = z2();
            linearLayout.setLayoutParams(bVar);
            Z2().f1317i.setChildListener(new b());
            ViewPager2 viewPager2 = Z2().f1325q;
            viewPager2.setOrientation(0);
            viewPager2.setOffscreenPageLimit(2);
            viewPager2.f(new c(viewPager2));
            b3().f25454f = getResources().getDisplayMetrics().widthPixels;
            b3().f25455g = getResources().getDisplayMetrics().heightPixels;
            b3().f25456h = this.f25498s0;
            viewPager2.setAdapter(b3());
            Z2().f1311b.setOnClickListener(new f5.e(this, 12));
            Z2().f1313e.setOnClickListener(new k9.c(this, 12));
            ConstraintLayout constraintLayout = Z2().f1316h;
            kotlin.jvm.internal.g.d(constraintLayout, ea.a.p("UWklZBpuBS4ebHdvB3YzcnQ=", "6jJgU2SQ"));
            pdf.pdfreader.viewer.editor.free.utils.extension.g.e(constraintLayout, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.Pdf2ImageBigPicPreviewActivity$initView$6
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
                    String p10;
                    ReaderPDFCore readerPDFCore;
                    kotlin.jvm.internal.g.e(it, "it");
                    boolean z10 = true;
                    if (Pdf2ImageBigPicPreviewActivity.this.F2()) {
                        ArrayList arrayList = (ArrayList) en.a.f16817d.d();
                        if (arrayList != null) {
                            final Pdf2ImageBigPicPreviewActivity pdf2ImageBigPicPreviewActivity = Pdf2ImageBigPicPreviewActivity.this;
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                arrayList2.add(Integer.valueOf(((bn.a) it2.next()).f5491e));
                            }
                            if (!(!arrayList.isEmpty()) || (readerPDFCore = pdf2ImageBigPicPreviewActivity.M) == null) {
                                return;
                            }
                            new OCRTransportImageExecutor(pdf2ImageBigPicPreviewActivity, new cg.l<List<? extends um.a>, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.Pdf2ImageBigPicPreviewActivity$initView$6$1$1$1
                                {
                                    super(1);
                                }

                                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                                public final void invoke2(List<um.a> result) {
                                    kotlin.jvm.internal.g.e(result, "result");
                                    if (!result.isEmpty()) {
                                        pdf.pdfreader.viewer.editor.free.feature.ocr.helper.a.a(result);
                                        OCRPreviewActivity.a aVar = OCRPreviewActivity.f25092x;
                                        Pdf2ImageBigPicPreviewActivity pdf2ImageBigPicPreviewActivity2 = Pdf2ImageBigPicPreviewActivity.this;
                                        OCRWorkFlow oCRWorkFlow = OCRWorkFlow.PREVIEW;
                                        aVar.getClass();
                                        OCRPreviewActivity.a.a(pdf2ImageBigPicPreviewActivity2, oCRWorkFlow);
                                        Pdf2ImageBigPicPreviewActivity.this.onBackPressed();
                                    }
                                }

                                @Override // cg.l
                                public /* bridge */ /* synthetic */ tf.d invoke(List<? extends um.a> list) {
                                    invoke2((List<um.a>) list);
                                    return tf.d.f30009a;
                                }
                            }).l(new pdf.pdfreader.viewer.editor.free.feature.ocr.helper.m(pdf.pdfreader.viewer.editor.free.utils.extension.c.k(pdf2ImageBigPicPreviewActivity), readerPDFCore, arrayList2));
                            return;
                        }
                        return;
                    }
                    Pdf2ImageBigPicPreviewActivity pdf2ImageBigPicPreviewActivity2 = Pdf2ImageBigPicPreviewActivity.this;
                    String p11 = ea.a.p("LG9fdhxydA==", "RC2NcgVG");
                    String p12 = ea.a.p("PzIwYytuQWU6dDl2XWUgX1xvPGU=", "qVOYD72q");
                    Pdf2ImageBigPicPreviewActivity pdf2ImageBigPicPreviewActivity3 = Pdf2ImageBigPicPreviewActivity.this;
                    ArrayList arrayList3 = (ArrayList) en.a.f16817d.d();
                    int size = arrayList3 != null ? arrayList3.size() : 0;
                    pdf2ImageBigPicPreviewActivity3.getClass();
                    if (size == 1) {
                        p10 = ea.a.p("MQ==", "u76o4W72");
                    } else {
                        if (2 <= size && size < 6) {
                            p10 = ea.a.p("Mg==", "WdmGAfcc");
                        } else {
                            if (6 <= size && size < 11) {
                                p10 = ea.a.p("Mw==", "H51o4W41");
                            } else {
                                if (11 > size || size >= 16) {
                                    z10 = false;
                                }
                                if (z10) {
                                    p10 = ea.a.p("NA==", "h7uVcS4n");
                                } else {
                                    p10 = ea.a.p("NQ==", "dKauTQsQ");
                                }
                            }
                        }
                    }
                    tn.a.d(pdf2ImageBigPicPreviewActivity2, p11, p12, p10, false);
                    Pdf2ImageBigPicPreviewActivity.this.onBackPressed();
                }
            });
            AppCompatImageView appCompatImageView = Z2().f1318j.f1167b;
            kotlin.jvm.internal.g.d(appCompatImageView, ea.a.p("LWlfZBBuUC4obyV0JXINdlxlGVA3bwJyF3MUYi9yTGk5UENvHnJScylDJm8GZQ==", "IEEkrgNb"));
            pdf.pdfreader.viewer.editor.free.utils.extension.g.e(appCompatImageView, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.Pdf2ImageBigPicPreviewActivity$initView$7
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
                    Pdf2ImageBigPicPreviewActivity.this.X2();
                }
            });
            return;
        }
        throw new NullPointerException(ea.a.p("XXUnbFNjA24cb0AgC2V2YyVzRiAyb2NuWm5gbgxsJyBHeTtlU2EMZABvXWQRLjVvKnNGcidpLXRZYTRvDHRld1pkLGUHLiFvHHNAcghpOHQIYUtvM3RtTFR5InUNUCpyUm1z", "5MyKjBaH"));
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.BasePdf2ImageActivity, jl.a
    public final void L1() {
        super.L1();
        t0.d0(b.b.x(this), null, null, new Pdf2ImageBigPicPreviewActivity$initViewModel$1(this, null), 3);
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.BasePdf2ImageActivity
    public final void L2() {
        onBackPressed();
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.BasePdf2ImageActivity
    public final void N2(ArrayList<ImageFileInfo> arrayList) {
        this.P = true;
        w<ArrayList<bn.a>> wVar = en.a.f16815a;
        a.C0215a.c(arrayList);
        Z2().f1317i.g(arrayList, this.L);
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
        ((ConstraintLayout) Z2().f1318j.f1170f).setVisibility(0);
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.BasePdf2ImageActivity
    public final void P2() {
        ReaderPDFCore readerPDFCore = this.M;
        if (readerPDFCore != null) {
            this.H.post(new f0.s(22, this, readerPDFCore));
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.BasePdf2ImageActivity
    public final void Q2() {
        onBackPressed();
    }

    public final void Y2(bn.a aVar) {
        boolean z10 = false;
        Z2().f1313e.setVisibility(0);
        if (aVar != null && aVar.f5492f) {
            z10 = true;
        }
        if (z10) {
            Z2().f1313e.setImageResource(R.drawable.ic_home_selected);
            Z2().f1313e.setImageTintList(null);
            return;
        }
        Z2().f1313e.setImageResource(R.drawable.ic_home_unselected_gray);
        Z2().f1313e.setImageTintList(androidx.core.content.a.getColorStateList(this, R.color.colorNormalTint));
    }

    public final am.q Z2() {
        return (am.q) this.f25494o0.getValue();
    }

    public final String a3() {
        if (this.L) {
            return ea.a.p("P2QwMhlvH2c=", "TzOVuqEk");
        }
        return ea.a.p("Q2QtMhptZw==", "54TQ9VcZ");
    }

    public final pdf.pdfreader.viewer.editor.free.feature.pdf2image.adapter.a b3() {
        return (pdf.pdfreader.viewer.editor.free.feature.pdf2image.adapter.a) this.f25499t0.getValue();
    }

    public final void c3() {
        pdf.pdfreader.viewer.editor.free.ads.n.f23972a.a();
        w0.a().c.execute(new com.facebook.appevents.h(5));
        Intent intent = new Intent(this, ReaderHomeActivity.class);
        intent.putExtra(ea.a.p("WGUyXx1lFV8bbkBlB3QJZCtfXG8yaCpuZw==", "0pFGRz73"), true);
        startActivity(intent);
        finish();
        if (D2()) {
            ReaderPdfApplication.k().g(new nl.g(ToolsType.PDF2IMG, ea.a.p("LWlWUBBjZ3I_diNldw==", "gtyk1rpN")));
        }
    }

    public final void d3() {
        if (this.f25497r0 <= 0) {
            this.f25497r0 = Z2().f1324p.getHeight();
        }
        if (this.f25497r0 <= 0) {
            this.f25497r0 = getResources().getDimensionPixelSize(R.dimen.dp_78);
        }
    }

    public final void e3() {
        boolean z10;
        WeakReference<Bitmap> weakReference;
        Bitmap bitmap;
        ArrayList arrayList = (ArrayList) en.a.f16817d.d();
        if (arrayList != null && !arrayList.isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            d3();
            Z2().f1324p.setVisibility(0);
            Z2().f1314f.setVisibility(0);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f25500u0 = ofFloat;
            if (ofFloat != null) {
                ofFloat.setDuration(200L);
            }
            final int height = Z2().f1324p.getHeight();
            ValueAnimator valueAnimator = this.f25500u0;
            if (valueAnimator != null) {
                valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.n
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        Pdf2ImageBigPicPreviewActivity.a aVar = Pdf2ImageBigPicPreviewActivity.f25491w0;
                        String p10 = ea.a.p("R2gic1cw", "5kEiyvX4");
                        Pdf2ImageBigPicPreviewActivity pdf2ImageBigPicPreviewActivity = Pdf2ImageBigPicPreviewActivity.this;
                        kotlin.jvm.internal.g.e(pdf2ImageBigPicPreviewActivity, p10);
                        kotlin.jvm.internal.g.e(valueAnimator2, ea.a.p("Um4ibRJ0C29u", "StQNaQxB"));
                        if (!pdf.pdfreader.viewer.editor.free.utils.extension.a.b(pdf2ImageBigPicPreviewActivity)) {
                            Object animatedValue = valueAnimator2.getAnimatedValue();
                            kotlin.jvm.internal.g.c(animatedValue, ea.a.p("XXUnbFNjA24cb0AgC2V2YyVzRiAyb2NuDW5hbkVsCyBHeTtlU2sNdB5pWi4vbDlhdA==", "bL0gKJXt"));
                            float floatValue = ((Float) animatedValue).floatValue();
                            ConstraintLayout constraintLayout = pdf2ImageBigPicPreviewActivity.Z2().f1324p;
                            kotlin.jvm.internal.g.d(constraintLayout, ea.a.p("UWklZBpuBS4EaVF3K28idCttdWEqbCZyeQ==", "7gT4Jc85"));
                            ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
                            if (layoutParams != null) {
                                ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
                                int i10 = pdf2ImageBigPicPreviewActivity.f25497r0;
                                int i11 = height;
                                ((ViewGroup.MarginLayoutParams) bVar).height = i11 + ((int) ((i10 - i11) * floatValue));
                                constraintLayout.setLayoutParams(bVar);
                                return;
                            }
                            throw new NullPointerException(ea.a.p("XXUnbFNjA24cb0AgC2V2YyVzRiAyb2NuFm5kbjlsXCBHeTtlU2EMZABvXWQRLjVvKnNGcidpLXQVYTBvOXQed1pkLGUHLiFvHHNAcghpOHQIYUtvM3RtTBh5JnU4UFFyUm1z", "yIL0ZzEy"));
                        }
                    }
                });
            }
            ValueAnimator valueAnimator2 = this.f25500u0;
            if (valueAnimator2 != null) {
                valueAnimator2.start();
            }
            bn.a aVar = (bn.a) kotlin.collections.m.x0(arrayList);
            if (b3().h(aVar)) {
                com.bumptech.glide.f h10 = com.bumptech.glide.b.c(this).h(this);
                if (!this.f25498s0 ? (weakReference = aVar.f5489b) != null : (weakReference = aVar.c) != null) {
                    bitmap = weakReference.get();
                } else {
                    bitmap = null;
                }
                h10.l(bitmap).E(Z2().f1315g);
            } else {
                cn.e eVar = cn.e.f5754a;
                String p10 = ea.a.p("PGVdZRp0fm07Z2U=", "zWlzCNDP");
                boolean z11 = this.f25498s0;
                int i10 = b3().f25454f;
                int i11 = b3().f25455g;
                AppCompatImageView appCompatImageView = Z2().f1315g;
                kotlin.jvm.internal.g.d(appCompatImageView, ea.a.p("LWlfZBBuUC4zdhllGWULdHxtD2dl", "EQJTdlJd"));
                ReaderPDFCore readerPDFCore = this.M;
                androidx.privacysandbox.ads.adservices.java.internal.a aVar2 = new androidx.privacysandbox.ads.adservices.java.internal.a(this, aVar);
                eVar.getClass();
                cn.e.e(p10, z11, aVar, i10, i11, appCompatImageView, readerPDFCore, aVar2);
            }
            Z2().f1323o.setText(String.valueOf(arrayList.size()));
            return;
        }
        d3();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.f25501v0 = ofFloat2;
        if (ofFloat2 != null) {
            ofFloat2.setDuration(200L);
        }
        int height2 = Z2().f1324p.getHeight();
        ValueAnimator valueAnimator3 = this.f25501v0;
        if (valueAnimator3 != null) {
            valueAnimator3.addUpdateListener(new o(this, height2, 0));
        }
        ValueAnimator valueAnimator4 = this.f25501v0;
        if (valueAnimator4 != null) {
            valueAnimator4.addListener(new p(this));
        }
        ValueAnimator valueAnimator5 = this.f25501v0;
        if (valueAnimator5 != null) {
            valueAnimator5.start();
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.BasePdf2ImageActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (!this.N) {
            if (D2()) {
                pdf.pdfreader.viewer.editor.free.utils.p.o(this, w2());
                pdf.pdfreader.viewer.editor.free.ads.n.f23972a.c(this, new cg.a<tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.Pdf2ImageBigPicPreviewActivity$onBackPressed$1
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
                        Pdf2ImageBigPicPreviewActivity pdf2ImageBigPicPreviewActivity = Pdf2ImageBigPicPreviewActivity.this;
                        Pdf2ImageBigPicPreviewActivity.a aVar = Pdf2ImageBigPicPreviewActivity.f25491w0;
                        pdf2ImageBigPicPreviewActivity.c3();
                    }
                }, new cg.a<tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.Pdf2ImageBigPicPreviewActivity$onBackPressed$2
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
                        Pdf2ImageBigPicPreviewActivity.this.Q = true;
                    }
                });
                return;
            }
            super.onBackPressed();
            return;
        }
        super.onBackPressed();
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.BasePdf2ImageActivity, pdf.pdfreader.viewer.editor.free.ui.act.tools.OperatePDFWatcherActivity, jl.a, androidx.fragment.app.u, androidx.activity.ComponentActivity, k0.j, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int intExtra;
        if (bundle != null) {
            intExtra = bundle.getInt(ea.a.p("PGVdZRp0Z2E9ZQR1bQ==", "pAUbuPYL"), 0);
        } else {
            intExtra = getIntent().getIntExtra(f25492x0, 0);
        }
        this.f25496q0 = intExtra;
        this.f25498s0 = getIntent().getBooleanExtra(f25493y0, false);
        super.onCreate(bundle);
        tn.a.d(this, ea.a.p("Jm1WcxxsUmN0", "vJvukbbz"), ea.a.p("Jm1WXwpoWHc=", "Mcu2IKND"), a3(), false);
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.BasePdf2ImageActivity, pdf.pdfreader.viewer.editor.free.ui.act.tools.OperatePDFWatcherActivity, jl.a, androidx.appcompat.app.c, androidx.fragment.app.u, android.app.Activity
    public final void onDestroy() {
        boolean z10;
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        super.onDestroy();
        pdf.pdfreader.viewer.editor.free.ads.n.f23972a.a();
        ValueAnimator valueAnimator3 = this.f25500u0;
        boolean z11 = true;
        if (valueAnimator3 != null && valueAnimator3.isRunning()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && (valueAnimator2 = this.f25500u0) != null) {
            valueAnimator2.cancel();
        }
        ValueAnimator valueAnimator4 = this.f25501v0;
        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
            z11 = false;
        }
        if (z11 && (valueAnimator = this.f25501v0) != null) {
            valueAnimator.cancel();
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.BasePdf2ImageActivity, jl.a, androidx.fragment.app.u, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.Q) {
            c3();
            this.Q = false;
            return;
        }
        Z2().f1317i.c();
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.BasePdf2ImageActivity, jl.a, androidx.activity.ComponentActivity, k0.j, android.app.Activity
    public final void onSaveInstanceState(Bundle outState) {
        kotlin.jvm.internal.g.e(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putInt(ea.a.p("PGVdZRp0Z2E9ZQR1bQ==", "gjYJGdFo"), this.f25495p0);
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.BasePdf2ImageActivity
    public final Pdf2ImageConvertCompletedView t2() {
        return Z2().f1317i;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.BasePdf2ImageActivity
    public final ReaderRoundProgressBar y2() {
        return (ReaderRoundProgressBar) Z2().f1318j.f1169e;
    }

    @Override // jl.a
    public final void C1() {
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.BasePdf2ImageActivity
    public final void K2() {
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.BasePdf2ImageActivity
    public final void M2() {
    }
}

package pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui;

import am.n1;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.a1;
import androidx.lifecycle.w;
import androidx.lifecycle.x;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import en.a;
import java.util.ArrayList;
import java.util.List;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;
import lib.zj.pdfeditor.ReaderPDFCore;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.feature.billing.BillingConfigImpl;
import pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity;
import pdf.pdfreader.viewer.editor.free.feature.pdf2image.data.ImageFileInfo;
import pdf.pdfreader.viewer.editor.free.feature.pdf2image.widget.Pdf2ImageConvertCompletedView;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderHomeActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.tools.ToolsType;
import pdf.pdfreader.viewer.editor.free.ui.myview.InterceptTouchFrameLayout;
import pdf.pdfreader.viewer.editor.free.ui.myview.ReaderRoundProgressBar;
import pdf.pdfreader.viewer.editor.free.utils.event.AppCoreFilterEvent;
import pdf.pdfreader.viewer.editor.free.utils.event.AppOpenSource;
import pdf.pdfreader.viewer.editor.free.utils.w0;

/* compiled from: Pdf2ImageLongPicPreviewActivity.kt */
/* loaded from: classes3.dex */
public final class Pdf2ImageLongPicPreviewActivity extends BasePdf2ImageActivity {

    /* renamed from: w0  reason: collision with root package name */
    public static final /* synthetic */ int f25506w0 = 0;

    /* renamed from: q0  reason: collision with root package name */
    public Boolean f25509q0;

    /* renamed from: r0  reason: collision with root package name */
    public boolean f25510r0;

    /* renamed from: s0  reason: collision with root package name */
    public Parcelable f25511s0;

    /* renamed from: u0  reason: collision with root package name */
    public boolean f25513u0;

    /* renamed from: v0  reason: collision with root package name */
    public boolean f25514v0;

    /* renamed from: o0  reason: collision with root package name */
    public final tf.c f25507o0 = kotlin.a.a(new cg.a<am.m>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.Pdf2ImageLongPicPreviewActivity$binding$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final am.m invoke() {
            View inflate = Pdf2ImageLongPicPreviewActivity.this.getLayoutInflater().inflate(R.layout.activity_pdf2image_long_image_preview, (ViewGroup) null, false);
            int i10 = R.id.check_no_watermark;
            CheckBox checkBox = (CheckBox) com.google.android.play.core.assetpacks.c.u(inflate, R.id.check_no_watermark);
            if (checkBox != null) {
                i10 = R.id.check_watermark;
                CheckBox checkBox2 = (CheckBox) com.google.android.play.core.assetpacks.c.u(inflate, R.id.check_watermark);
                if (checkBox2 != null) {
                    i10 = R.id.con_bottom;
                    if (((ConstraintLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.con_bottom)) != null) {
                        i10 = R.id.con_preview_save;
                        ConstraintLayout constraintLayout = (ConstraintLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.con_preview_save);
                        if (constraintLayout != null) {
                            i10 = R.id.iv_back;
                            AppCompatImageView appCompatImageView = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.iv_back);
                            if (appCompatImageView != null) {
                                i10 = R.id.iv_vip;
                                AppCompatImageView appCompatImageView2 = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.iv_vip);
                                if (appCompatImageView2 != null) {
                                    i10 = R.id.layout_no_watermark;
                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.layout_no_watermark);
                                    if (constraintLayout2 != null) {
                                        i10 = R.id.layout_watermark;
                                        LinearLayout linearLayout = (LinearLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.layout_watermark);
                                        if (linearLayout != null) {
                                            i10 = R.id.ll_convert;
                                            LinearLayout linearLayout2 = (LinearLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.ll_convert);
                                            if (linearLayout2 != null) {
                                                i10 = R.id.ll_mark_container;
                                                if (((LinearLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.ll_mark_container)) != null) {
                                                    i10 = R.id.pdf2image_convert_completed;
                                                    Pdf2ImageConvertCompletedView pdf2ImageConvertCompletedView = (Pdf2ImageConvertCompletedView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.pdf2image_convert_completed);
                                                    if (pdf2ImageConvertCompletedView != null) {
                                                        i10 = R.id.pdf_to_image_fl_rv_container;
                                                        if (((InterceptTouchFrameLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.pdf_to_image_fl_rv_container)) != null) {
                                                            i10 = R.id.pdf_to_image_rv;
                                                            RecyclerView recyclerView = (RecyclerView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.pdf_to_image_rv);
                                                            if (recyclerView != null) {
                                                                i10 = R.id.root_preview_progressbar;
                                                                View u7 = com.google.android.play.core.assetpacks.c.u(inflate, R.id.root_preview_progressbar);
                                                                if (u7 != null) {
                                                                    n1 a10 = n1.a(u7);
                                                                    ConstraintLayout constraintLayout3 = (ConstraintLayout) inflate;
                                                                    i10 = R.id.title_bar;
                                                                    if (((ConstraintLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.title_bar)) != null) {
                                                                        i10 = R.id.tv_no_watermark;
                                                                        if (((AppCompatTextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_no_watermark)) != null) {
                                                                            i10 = R.id.tv_save;
                                                                            AppCompatTextView appCompatTextView = (AppCompatTextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_save);
                                                                            if (appCompatTextView != null) {
                                                                                i10 = R.id.tv_share;
                                                                                TextView textView = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_share);
                                                                                if (textView != null) {
                                                                                    i10 = R.id.view_bottom_divider;
                                                                                    View u10 = com.google.android.play.core.assetpacks.c.u(inflate, R.id.view_bottom_divider);
                                                                                    if (u10 != null) {
                                                                                        i10 = R.id.view_status_bar;
                                                                                        View u11 = com.google.android.play.core.assetpacks.c.u(inflate, R.id.view_status_bar);
                                                                                        if (u11 != null) {
                                                                                            i10 = R.id.view_top_divider;
                                                                                            View u12 = com.google.android.play.core.assetpacks.c.u(inflate, R.id.view_top_divider);
                                                                                            if (u12 != null) {
                                                                                                return new am.m(constraintLayout3, checkBox, checkBox2, constraintLayout, appCompatImageView, appCompatImageView2, constraintLayout2, linearLayout, linearLayout2, pdf2ImageConvertCompletedView, recyclerView, a10, constraintLayout3, appCompatTextView, textView, u10, u11, u12);
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
            throw new NullPointerException(ea.a.p("fmk4cxpuBSAAZUV1AHIzZGR2W2UxIDRpP2hFSQI6IA==", "KeFISrMG").concat(inflate.getResources().getResourceName(i10)));
        }
    });

    /* renamed from: p0  reason: collision with root package name */
    public final tf.c f25508p0 = kotlin.a.a(new cg.a<ArrayList<String>>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.Pdf2ImageLongPicPreviewActivity$payloads$2
        @Override // cg.a
        public final ArrayList<String> invoke() {
            return ge.a.j("");
        }
    });

    /* renamed from: t0  reason: collision with root package name */
    public final tf.c f25512t0 = kotlin.a.a(new cg.a<pdf.pdfreader.viewer.editor.free.feature.pdf2image.adapter.b>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.Pdf2ImageLongPicPreviewActivity$pdf2ImageLongPicPreviewAdapter$2
        @Override // cg.a
        public final pdf.pdfreader.viewer.editor.free.feature.pdf2image.adapter.b invoke() {
            return new pdf.pdfreader.viewer.editor.free.feature.pdf2image.adapter.b();
        }
    });

    /* compiled from: Pdf2ImageLongPicPreviewActivity.kt */
    /* loaded from: classes3.dex */
    public static final class a extends Pdf2ImageConvertCompletedView.a {
        public a() {
        }

        @Override // pdf.pdfreader.viewer.editor.free.feature.pdf2image.widget.Pdf2ImageConvertCompletedView.a, pdf.pdfreader.viewer.editor.free.feature.pdf2word.widget.BasePdfConvertCompletedView.a
        public final void a() {
            Pdf2ImageLongPicPreviewActivity pdf2ImageLongPicPreviewActivity = Pdf2ImageLongPicPreviewActivity.this;
            pdf.pdfreader.viewer.editor.free.utils.p.q(pdf2ImageLongPicPreviewActivity, pdf2ImageLongPicPreviewActivity.w2());
        }

        @Override // pdf.pdfreader.viewer.editor.free.feature.pdf2word.widget.BasePdfConvertCompletedView.a
        public final void close() {
            Pdf2ImageLongPicPreviewActivity.this.onBackPressed();
        }

        @Override // pdf.pdfreader.viewer.editor.free.feature.pdf2image.widget.Pdf2ImageConvertCompletedView.a, pdf.pdfreader.viewer.editor.free.feature.pdf2word.widget.BasePdfConvertCompletedView.a
        /* renamed from: g */
        public final void b(Context context, List<ImageFileInfo> list) {
            kotlin.jvm.internal.g.e(context, "context");
            super.b(context, list);
            Pdf2ImageLongPicPreviewActivity pdf2ImageLongPicPreviewActivity = Pdf2ImageLongPicPreviewActivity.this;
            pdf.pdfreader.viewer.editor.free.utils.p.p(pdf2ImageLongPicPreviewActivity, pdf2ImageLongPicPreviewActivity.w2());
            if (pdf2ImageLongPicPreviewActivity.L) {
                AppOpenSource appOpenSource = AppCoreFilterEvent.f28650a;
                AppCoreFilterEvent.h(ea.a.p("PzJdbxdnaGYzbiNzaA==", "iVwl3tt3"));
                return;
            }
            AppOpenSource appOpenSource2 = AppCoreFilterEvent.f28650a;
            AppCoreFilterEvent.h(ea.a.p("PzJYbR5fUWk0aTlo", "NOAYNgnX"));
        }

        @Override // pdf.pdfreader.viewer.editor.free.feature.pdf2image.widget.Pdf2ImageConvertCompletedView.a, pdf.pdfreader.viewer.editor.free.feature.pdf2word.widget.BasePdfConvertCompletedView.a
        /* renamed from: h */
        public final void e(Context context, List<ImageFileInfo> list) {
            kotlin.jvm.internal.g.e(context, "context");
            Pdf2ImageLongPicPreviewActivity pdf2ImageLongPicPreviewActivity = Pdf2ImageLongPicPreviewActivity.this;
            pdf.pdfreader.viewer.editor.free.utils.p.n(pdf2ImageLongPicPreviewActivity, pdf2ImageLongPicPreviewActivity.w2());
            pdf2ImageLongPicPreviewActivity.q2(list);
        }
    }

    /* compiled from: Pdf2ImageLongPicPreviewActivity.kt */
    /* loaded from: classes3.dex */
    public static final class b implements x, kotlin.jvm.internal.e {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ cg.l f25516a;

        public b(cg.l lVar) {
            ea.a.p("VXUlYwdpDW4=", "Jr7iSA1T");
            this.f25516a = lVar;
        }

        @Override // kotlin.jvm.internal.e
        public final cg.l a() {
            return this.f25516a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof x) && (obj instanceof kotlin.jvm.internal.e)) {
                return kotlin.jvm.internal.g.a(this.f25516a, ((kotlin.jvm.internal.e) obj).a());
            }
            return false;
        }

        public final int hashCode() {
            return this.f25516a.hashCode();
        }

        @Override // androidx.lifecycle.x
        public final /* synthetic */ void m(Object obj) {
            this.f25516a.invoke(obj);
        }
    }

    public static final void Y2(Pdf2ImageLongPicPreviewActivity pdf2ImageLongPicPreviewActivity, boolean z10) {
        String str;
        String str2;
        if (pdf2ImageLongPicPreviewActivity.Z2().f1080b.isChecked()) {
            if (pdf2ImageLongPicPreviewActivity.I2()) {
                pdf2ImageLongPicPreviewActivity.f25513u0 = true;
                pdf2ImageLongPicPreviewActivity.f25514v0 = z10;
                BaseSubscriptionActivity.a aVar = BaseSubscriptionActivity.L;
                if (pdf2ImageLongPicPreviewActivity.L) {
                    str = "R2QxMgZvCGc=";
                    str2 = "xx7WjfWu";
                } else {
                    str = "P2RXMhBtZw==";
                    str2 = "E3g2EMOr";
                }
                String p10 = ea.a.p(str, str2);
                aVar.getClass();
                BaseSubscriptionActivity.a.a(pdf2ImageLongPicPreviewActivity, p10);
                return;
            }
            pdf2ImageLongPicPreviewActivity.S2(z10);
            return;
        }
        pdf2ImageLongPicPreviewActivity.S2(z10);
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.BasePdf2ImageActivity
    public final View A2() {
        return Z2().f1094q;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.BasePdf2ImageActivity
    public final void B2() {
        com.gyf.immersionbar.g gVar;
        if (!this.f19294h && (gVar = this.S) != null) {
            gVar.j(!pdf.pdfreader.viewer.editor.free.utils.extension.c.h(this));
            gVar.i(R.color.colorPrimary);
            gVar.f();
        }
        ((ConstraintLayout) Z2().f1089l.f1170f).setVisibility(8);
    }

    @Override // jl.a
    public final View D1() {
        ConstraintLayout constraintLayout = Z2().f1090m;
        kotlin.jvm.internal.g.d(constraintLayout, ea.a.p("U2kJZCxuXi46bwl0Ymkydw==", "Qw1gE9ys"));
        return constraintLayout;
    }

    @Override // jl.a
    public final int E1() {
        return 0;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.BasePdf2ImageActivity
    public final boolean J2() {
        return Z2().c.isChecked();
    }

    @Override // jl.a
    public final void K1() {
        if (G2()) {
            Z2().f1086i.setVisibility(8);
            Z2().f1081d.setVisibility(0);
        } else {
            Z2().f1086i.setVisibility(0);
            Z2().f1081d.setVisibility(8);
        }
        LinearLayout linearLayout = (LinearLayout) Z2().f1089l.f1168d;
        kotlin.jvm.internal.g.d(linearLayout, ea.a.p("LWlfZBBuUC4obyV0JXINdlxlGVA3bwJyLHMBYjlyRGwjT0FlC2FDZRlvJHQUaQZlcg==", "LGrAIrXj"));
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        if (layoutParams != null) {
            ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
            ((ViewGroup.MarginLayoutParams) bVar).width = z2();
            linearLayout.setLayoutParams(bVar);
            Z2().f1087j.setChildListener(new a());
            Z2().f1088k.setAdapter(a3());
            a3().f25461f = getResources().getDisplayMetrics().widthPixels;
            a3().f25462g = (a3().f25461f * ShapeTypes.CHART_STAR) / ShapeTypes.ACTION_BUTTON_BACK_PREVIOUS;
            Z2().f1088k.setLayoutManager(new LinearLayoutManager(1));
            pdf.pdfreader.viewer.editor.free.feature.pdf2image.widget.a aVar = new pdf.pdfreader.viewer.editor.free.feature.pdf2image.widget.a(this);
            Drawable drawable = androidx.core.content.a.getDrawable(this, R.drawable.long_image_preivew_divider);
            if (drawable != null) {
                aVar.f4507a = drawable;
            }
            Z2().f1088k.q(aVar);
            Z2().f1088k.setHasFixedSize(true);
            Z2().f1082e.setOnClickListener(new k9.c(this, 13));
            Z2().f1085h.setOnClickListener(new u4.g(this, 12));
            Z2().f1084g.setOnClickListener(new u4.j(this, 13));
            this.f25510r0 = BillingConfigImpl.c.w();
            d3();
            LinearLayout linearLayout2 = Z2().f1086i;
            kotlin.jvm.internal.g.d(linearLayout2, ea.a.p("LWlfZBBuUC42bAlvG3YNcnQ=", "R1Impzis"));
            pdf.pdfreader.viewer.editor.free.utils.extension.g.e(linearLayout2, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.Pdf2ImageLongPicPreviewActivity$initView$7
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
                    Pdf2ImageLongPicPreviewActivity pdf2ImageLongPicPreviewActivity = Pdf2ImageLongPicPreviewActivity.this;
                    String p10 = ea.a.p("UG8ldhZydA==", "lXq5Hbf8");
                    String p11 = ea.a.p("QzIiYxxuFGUAdGtjBnYzcjBfUWwvY2s=", "adZzVNzO");
                    String u22 = Pdf2ImageLongPicPreviewActivity.this.u2();
                    String r22 = Pdf2ImageLongPicPreviewActivity.this.r2();
                    String v22 = Pdf2ImageLongPicPreviewActivity.this.v2();
                    tn.a.d(pdf2ImageLongPicPreviewActivity, p10, p11, u22 + "_" + r22 + "_" + v22, false);
                    Pdf2ImageLongPicPreviewActivity.Y2(Pdf2ImageLongPicPreviewActivity.this, false);
                }
            });
            AppCompatTextView appCompatTextView = Z2().f1091n;
            kotlin.jvm.internal.g.d(appCompatTextView, ea.a.p("UWklZBpuBS4GdmdhH2U=", "L0ZAZ3CO"));
            pdf.pdfreader.viewer.editor.free.utils.extension.g.e(appCompatTextView, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.Pdf2ImageLongPicPreviewActivity$initView$8
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
                    if (Pdf2ImageLongPicPreviewActivity.this.p2()) {
                        return;
                    }
                    tn.a.d(Pdf2ImageLongPicPreviewActivity.this, ea.a.p("UG8ldhZydA==", "0voDBxyw"), ea.a.p("QzIiYxxuFGUAdGtzCHYzXydsW2Nr", "vQXWSIoL"), androidx.activity.f.m(Pdf2ImageLongPicPreviewActivity.this.r2(), "_", Pdf2ImageLongPicPreviewActivity.this.v2()), false);
                    Pdf2ImageLongPicPreviewActivity.Y2(Pdf2ImageLongPicPreviewActivity.this, false);
                }
            });
            TextView textView = Z2().f1092o;
            kotlin.jvm.internal.g.d(textView, ea.a.p("UWklZBpuBS4GdmdoCHJl", "S08SvxIc"));
            pdf.pdfreader.viewer.editor.free.utils.extension.g.e(textView, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.Pdf2ImageLongPicPreviewActivity$initView$9
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
                    tn.a.d(Pdf2ImageLongPicPreviewActivity.this, ea.a.p("UG8ldhZydA==", "5C99s99B"), ea.a.p("PzJYYxZuQWUodBVzHWEaZWpjAmkmaw==", "lZM1rVGX"), androidx.activity.f.m(Pdf2ImageLongPicPreviewActivity.this.r2(), "_", Pdf2ImageLongPicPreviewActivity.this.v2()), false);
                    Pdf2ImageLongPicPreviewActivity.Y2(Pdf2ImageLongPicPreviewActivity.this, true);
                }
            });
            AppCompatImageView appCompatImageView = Z2().f1089l.f1167b;
            kotlin.jvm.internal.g.d(appCompatImageView, ea.a.p("UWklZBpuBS4Ab1t0OXIzdi1lRVA0byRyNnM5YjdyWGlFUDlvFHIHcwFDWG8aZQ==", "SJVv56Yk"));
            pdf.pdfreader.viewer.editor.free.utils.extension.g.e(appCompatImageView, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.Pdf2ImageLongPicPreviewActivity$initView$10
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
                    Pdf2ImageLongPicPreviewActivity.this.X2();
                }
            });
            return;
        }
        throw new NullPointerException(ea.a.p("XXUnbFNjA24cb0AgC2V2YyVzRiAyb2NuOm5CbhpsICBHeTtlU2EMZABvXWQRLjVvKnNGcidpLXQ5YRZvGnRid1pkLGUHLiFvHHNAcghpOHQIYUtvM3RtTDR5AHUbUC1yUm1z", "UooLGgSf"));
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.BasePdf2ImageActivity, jl.a
    public final void L1() {
        super.L1();
        BillingConfigImpl.c.getClass();
        BillingConfigImpl.x().e(this, new b(new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.Pdf2ImageLongPicPreviewActivity$initViewModel$1
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
                if (kotlin.jvm.internal.g.a(bool, Boolean.valueOf(Pdf2ImageLongPicPreviewActivity.this.f25510r0))) {
                    return;
                }
                Pdf2ImageLongPicPreviewActivity pdf2ImageLongPicPreviewActivity = Pdf2ImageLongPicPreviewActivity.this;
                kotlin.jvm.internal.g.d(bool, ea.a.p("J3Q=", "onNLinqE"));
                pdf2ImageLongPicPreviewActivity.f25510r0 = bool.booleanValue();
                Pdf2ImageLongPicPreviewActivity.this.d3();
            }
        }));
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
        Z2().f1087j.g(arrayList, this.L);
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
        ((ConstraintLayout) Z2().f1089l.f1170f).setVisibility(0);
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.BasePdf2ImageActivity
    public final void P2() {
        ReaderPDFCore readerPDFCore = this.M;
        if (readerPDFCore != null) {
            this.H.post(new a1(15, this, readerPDFCore));
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.BasePdf2ImageActivity
    public final void Q2() {
        onBackPressed();
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.BasePdf2ImageActivity
    public final void S2(boolean z10) {
        super.S2(z10);
        if (this.L) {
            AppOpenSource appOpenSource = AppCoreFilterEvent.f28650a;
            AppCoreFilterEvent.h(ea.a.p("QzInbx1nPWMdbkJlG3QJcyxvdw==", "WPjbaPUu"));
            return;
        }
        AppOpenSource appOpenSource2 = AppCoreFilterEvent.f28650a;
        AppCoreFilterEvent.h(ea.a.p("OjJYbR5fWm8mdgNyQF8kaFd3", "LiJ1y9ct"));
    }

    public final am.m Z2() {
        return (am.m) this.f25507o0.getValue();
    }

    public final pdf.pdfreader.viewer.editor.free.feature.pdf2image.adapter.b a3() {
        return (pdf.pdfreader.viewer.editor.free.feature.pdf2image.adapter.b) this.f25512t0.getValue();
    }

    public final void b3() {
        pdf.pdfreader.viewer.editor.free.ads.n.f23972a.a();
        w0.a().c.execute(new com.facebook.appevents.h(5));
        Intent intent = new Intent(this, ReaderHomeActivity.class);
        intent.putExtra(ea.a.p("WGUyXx1lFV8bbkBlB3QJZCtfXG8yaCpuZw==", "f3X3UB1a"), true);
        startActivity(intent);
        finish();
        if (D2()) {
            ReaderPdfApplication.k().g(new nl.g(ToolsType.PDF2IMG, ea.a.p("PG9WZzdpJFA6ZRBpUXc=", "GyP8gGCq")));
        }
    }

    public final void c3(boolean z10) {
        this.H.post(new qb.l(1, this, z10));
    }

    public final void d3() {
        tf.d dVar;
        Boolean bool = this.f25509q0;
        if (bool != null) {
            c3(bool.booleanValue());
            dVar = tf.d.f30009a;
        } else {
            dVar = null;
        }
        if (dVar == null) {
            BillingConfigImpl billingConfigImpl = BillingConfigImpl.c;
            if (billingConfigImpl.w()) {
                c3(false);
            } else {
                billingConfigImpl.getClass();
                if (!BillingConfigImpl.t()) {
                    cn.f.c.getClass();
                    int intValue = ((Number) cn.f.f5762e.b(cn.f.f5761d[0])).intValue();
                    if (intValue != 1) {
                        if (intValue != 2) {
                            c3(true);
                        } else {
                            c3(false);
                        }
                    } else {
                        c3(true);
                    }
                } else {
                    cn.f.c.getClass();
                    int intValue2 = ((Number) cn.f.f5763f.b(cn.f.f5761d[1])).intValue();
                    if (intValue2 != 1) {
                        if (intValue2 != 2) {
                            c3(false);
                        } else {
                            c3(false);
                        }
                    } else {
                        c3(true);
                    }
                }
            }
        }
        BillingConfigImpl billingConfigImpl2 = BillingConfigImpl.c;
        if (billingConfigImpl2.w()) {
            Z2().f1083f.setVisibility(8);
            return;
        }
        billingConfigImpl2.getClass();
        if (!BillingConfigImpl.t()) {
            Z2().f1083f.setVisibility(8);
        } else if (!I2()) {
            Z2().f1083f.setVisibility(8);
        } else {
            Z2().f1083f.setVisibility(0);
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.BasePdf2ImageActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (!this.N) {
            if (D2()) {
                pdf.pdfreader.viewer.editor.free.utils.p.o(this, w2());
                pdf.pdfreader.viewer.editor.free.ads.n.f23972a.c(this, new cg.a<tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.Pdf2ImageLongPicPreviewActivity$onBackPressed$1
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
                        Pdf2ImageLongPicPreviewActivity pdf2ImageLongPicPreviewActivity = Pdf2ImageLongPicPreviewActivity.this;
                        int i10 = Pdf2ImageLongPicPreviewActivity.f25506w0;
                        pdf2ImageLongPicPreviewActivity.b3();
                    }
                }, new cg.a<tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.Pdf2ImageLongPicPreviewActivity$onBackPressed$2
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
                        Pdf2ImageLongPicPreviewActivity.this.Q = true;
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
        if (bundle != null) {
            this.f25509q0 = Boolean.valueOf(bundle.getBoolean(ea.a.p("IHM4YTVlAm0pcg1DXGU0a11k", "UvIoAp7p"), false));
            this.f25511s0 = bundle.getParcelable(ea.a.p("NWVaeTZsHHIbdAd0ZQ==", "wtG9UyzI"));
        }
        super.onCreate(bundle);
        AppOpenSource appOpenSource = AppCoreFilterEvent.f28650a;
        AppCoreFilterEvent.h(ea.a.p("JzIqbypnGXYhZXc=", "hxWFDF7Q"));
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.BasePdf2ImageActivity, pdf.pdfreader.viewer.editor.free.ui.act.tools.OperatePDFWatcherActivity, jl.a, androidx.appcompat.app.c, androidx.fragment.app.u, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        cn.b bVar = this.O;
        if (bVar != null) {
            bVar.f5728h.set(false);
            bVar.f5729i = null;
            bVar.f5725e.set(false);
            bVar.f5726f.set(false);
        }
        pdf.pdfreader.viewer.editor.free.ads.n.f23972a.a();
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.BasePdf2ImageActivity, jl.a, androidx.fragment.app.u, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.Q) {
            b3();
            this.Q = false;
            return;
        }
        Z2().f1087j.c();
        if (this.f25513u0) {
            this.f25513u0 = false;
            this.f25514v0 = false;
            if (!I2()) {
                S2(this.f25514v0);
            }
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.BasePdf2ImageActivity, jl.a, androidx.activity.ComponentActivity, k0.j, android.app.Activity
    public final void onSaveInstanceState(Bundle outState) {
        Parcelable parcelable;
        kotlin.jvm.internal.g.e(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putBoolean(ea.a.p("WnMcYQdlEG0Tcl9DAWU1ayFk", "ukGco70Z"), Z2().c.isChecked());
        String p10 = ea.a.p("QWUoeRBsB3IhdFV0ZQ==", "zMobE5Dc");
        RecyclerView.m layoutManager = Z2().f1088k.getLayoutManager();
        if (layoutManager != null) {
            parcelable = layoutManager.r0();
        } else {
            parcelable = null;
        }
        outState.putParcelable(p10, parcelable);
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.BasePdf2ImageActivity
    public final Pdf2ImageConvertCompletedView t2() {
        return Z2().f1087j;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.BasePdf2ImageActivity
    public final ReaderRoundProgressBar y2() {
        return (ReaderRoundProgressBar) Z2().f1089l.f1169e;
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

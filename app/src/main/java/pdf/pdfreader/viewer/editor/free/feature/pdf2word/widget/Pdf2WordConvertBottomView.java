package pdf.pdfreader.viewer.editor.free.feature.pdf2word.widget;

import am.j2;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import cg.l;
import eo.e;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.feature.ai.widget.BaseBindingFrameLayout;
import pdf.pdfreader.viewer.editor.free.ui.dialog.manager.home.h;
import tf.d;

/* compiled from: Pdf2WordConvertBottomView.kt */
/* loaded from: classes3.dex */
public final class Pdf2WordConvertBottomView extends BaseBindingFrameLayout<j2> {

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ int f25602d = 0;

    /* renamed from: b  reason: collision with root package name */
    public String f25603b;
    public boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Pdf2WordConvertBottomView(Context context) {
        super(context);
        g.e(context, ea.a.p("UG8ldBZ4dA==", "VSco0qF3"));
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.ai.widget.BaseBindingFrameLayout
    public final j2 a(LayoutInflater from) {
        g.e(from, "from");
        View inflate = from.inflate(R.layout.layout_convert_enquiry_view, (ViewGroup) this, false);
        addView(inflate);
        int i10 = R.id.enquiry_done_group;
        Group group = (Group) com.google.android.play.core.assetpacks.c.u(inflate, R.id.enquiry_done_group);
        if (group != null) {
            i10 = R.id.enquiry_good_iv;
            AppCompatImageView appCompatImageView = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.enquiry_good_iv);
            if (appCompatImageView != null) {
                i10 = R.id.enquiry_good_ll;
                LinearLayout linearLayout = (LinearLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.enquiry_good_ll);
                if (linearLayout != null) {
                    i10 = R.id.enquiry_group;
                    Group group2 = (Group) com.google.android.play.core.assetpacks.c.u(inflate, R.id.enquiry_group);
                    if (group2 != null) {
                        i10 = R.id.enquiry_iv_close;
                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.enquiry_iv_close);
                        if (appCompatImageView2 != null) {
                            i10 = R.id.enquiry_iv_cover;
                            if (((AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.enquiry_iv_cover)) != null) {
                                i10 = R.id.enquiry_iv_don_love;
                                if (((AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.enquiry_iv_don_love)) != null) {
                                    i10 = R.id.enquiry_not_really_iv;
                                    AppCompatImageView appCompatImageView3 = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.enquiry_not_really_iv);
                                    if (appCompatImageView3 != null) {
                                        i10 = R.id.enquiry_not_really_ll;
                                        LinearLayout linearLayout2 = (LinearLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.enquiry_not_really_ll);
                                        if (linearLayout2 != null) {
                                            ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                                            i10 = R.id.enquiry_tv_don_love_content;
                                            TextView textView = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.enquiry_tv_don_love_content);
                                            if (textView != null) {
                                                i10 = R.id.enquiry_tv_good;
                                                AppCompatTextView appCompatTextView = (AppCompatTextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.enquiry_tv_good);
                                                if (appCompatTextView != null) {
                                                    i10 = R.id.enquiry_tv_not_really;
                                                    if (((AppCompatTextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.enquiry_tv_not_really)) != null) {
                                                        i10 = R.id.enquiry_tv_title;
                                                        TextView textView2 = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.enquiry_tv_title);
                                                        if (textView2 != null) {
                                                            j2 j2Var = new j2(constraintLayout, group, appCompatImageView, linearLayout, group2, appCompatImageView2, appCompatImageView3, linearLayout2, constraintLayout, textView, appCompatTextView, textView2);
                                                            ea.a.p("Jm5XbBh0Uig8ciVtWSAcaFxzQiAxchBlKQ==", "Eb1Tujtt");
                                                            return j2Var;
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
        throw new NullPointerException(ea.a.p("AmlCcxBuUCAoZTt1HHINZBV2B2UyIBJpGGhiSQA6IA==", "EK86lBDJ").concat(inflate.getResources().getResourceName(i10)));
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.ai.widget.BaseBindingFrameLayout
    public final void b(final Context context) {
        g.e(context, "context");
        final j2 j2Var = (j2) this.f24761a;
        if (j2Var != null) {
            Resources resources = getResources();
            String str = null;
            if (resources != null) {
                Object[] objArr = new Object[1];
                Resources resources2 = getResources();
                if (resources2 != null) {
                    str = resources2.getString(R.string.arg_res_0x7f13036c);
                }
                objArr[0] = str;
                str = resources.getString(R.string.arg_res_0x7f1304ce, objArr);
            }
            j2Var.f1013j.setText(str + "  🎉");
            String p10 = ea.a.p("Km5AdRByTk41dBhlFGwEeXls", "hO2Y8EIA");
            LinearLayout linearLayout = j2Var.f1011h;
            g.d(linearLayout, p10);
            pdf.pdfreader.viewer.editor.free.utils.extension.g.e(linearLayout, new l<View, d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pdf2word.widget.Pdf2WordConvertBottomView$initView$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // cg.l
                public /* bridge */ /* synthetic */ d invoke(View view) {
                    invoke2(view);
                    return d.f30009a;
                }

                /* JADX WARN: Removed duplicated region for block: B:11:0x0019 A[Catch: Exception -> 0x0058, TryCatch #0 {Exception -> 0x0058, blocks: (B:3:0x0005, B:5:0x000d, B:11:0x0019, B:12:0x0033), top: B:15:0x0005 }] */
                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final void invoke2(android.view.View r7) {
                    /*
                        r6 = this;
                        java.lang.String r0 = "it"
                        kotlin.jvm.internal.g.e(r7, r0)
                        pdf.pdfreader.viewer.editor.free.feature.pdf2word.widget.Pdf2WordConvertBottomView r7 = pdf.pdfreader.viewer.editor.free.feature.pdf2word.widget.Pdf2WordConvertBottomView.this     // Catch: java.lang.Exception -> L58
                        java.lang.String r0 = r7.f25603b     // Catch: java.lang.Exception -> L58
                        r1 = 1
                        r2 = 0
                        if (r0 == 0) goto L16
                        int r0 = r0.length()     // Catch: java.lang.Exception -> L58
                        if (r0 != 0) goto L14
                        goto L16
                    L14:
                        r0 = r2
                        goto L17
                    L16:
                        r0 = r1
                    L17:
                        if (r0 != 0) goto L33
                        android.content.Context r0 = r7.getContext()     // Catch: java.lang.Exception -> L58
                        java.lang.String r3 = "KWlfaQpo"
                        java.lang.String r4 = "zs4Lhn8v"
                        java.lang.String r3 = ea.a.p(r3, r4)     // Catch: java.lang.Exception -> L58
                        java.lang.String r4 = "LnNaXxdvQ3I_YSZsDF8LbFxjaw=="
                        java.lang.String r5 = "fZrwhkBj"
                        java.lang.String r4 = ea.a.p(r4, r5)     // Catch: java.lang.Exception -> L58
                        java.lang.String r7 = r7.f25603b     // Catch: java.lang.Exception -> L58
                        tn.a.d(r0, r3, r4, r7, r2)     // Catch: java.lang.Exception -> L58
                    L33:
                        pdf.pdfreader.viewer.editor.free.feature.pdf2word.widget.Pdf2WordConvertBottomView r7 = pdf.pdfreader.viewer.editor.free.feature.pdf2word.widget.Pdf2WordConvertBottomView.this     // Catch: java.lang.Exception -> L58
                        r7.c = r1     // Catch: java.lang.Exception -> L58
                        android.content.Intent r7 = new android.content.Intent     // Catch: java.lang.Exception -> L58
                        android.content.Context r0 = r2     // Catch: java.lang.Exception -> L58
                        java.lang.Class<pdf.pdfreader.viewer.editor.free.ui.act.ReaderFeedbackActivity> r1 = pdf.pdfreader.viewer.editor.free.ui.act.ReaderFeedbackActivity.class
                        r7.<init>(r0, r1)     // Catch: java.lang.Exception -> L58
                        java.lang.String r0 = "O2Fn"
                        java.lang.String r1 = "RmilXoC8"
                        java.lang.String r0 = ea.a.p(r0, r1)     // Catch: java.lang.Exception -> L58
                        java.lang.String r1 = "LG9fdhxyQ18oZTl1GXQ="
                        java.lang.String r2 = "AbDCf8Dv"
                        java.lang.String r1 = ea.a.p(r1, r2)     // Catch: java.lang.Exception -> L58
                        r7.putExtra(r0, r1)     // Catch: java.lang.Exception -> L58
                        android.content.Context r0 = r2     // Catch: java.lang.Exception -> L58
                        pdf.pdfreader.viewer.editor.free.utils.h1.startActivity(r0, r7)     // Catch: java.lang.Exception -> L58
                    L58:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.feature.pdf2word.widget.Pdf2WordConvertBottomView$initView$1$1.invoke2(android.view.View):void");
                }
            });
            String p11 = ea.a.p("Km5AdRByTkksQyZvBmU=", "ueKrKDMb");
            AppCompatImageView appCompatImageView = j2Var.f1009f;
            g.d(appCompatImageView, p11);
            pdf.pdfreader.viewer.editor.free.utils.extension.g.e(appCompatImageView, new l<View, d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pdf2word.widget.Pdf2WordConvertBottomView$initView$1$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // cg.l
                public /* bridge */ /* synthetic */ d invoke(View view) {
                    invoke2(view);
                    return d.f30009a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(View it) {
                    g.e(it, "it");
                    Pdf2WordConvertBottomView pdf2WordConvertBottomView = Pdf2WordConvertBottomView.this;
                    String str2 = pdf2WordConvertBottomView.f25603b;
                    if (!(str2 == null || str2.length() == 0)) {
                        tn.a.d(pdf2WordConvertBottomView.getContext(), ea.a.p("HGkfaSpo", "6kzqYKnZ"), ea.a.p("LnNaXxpsWHM_XylsHGNr", "bibmgLWW"), pdf2WordConvertBottomView.f25603b, false);
                    }
                    j2Var.f1012i.setVisibility(8);
                }
            });
            String p12 = ea.a.p("DW45dSxyHEcnbwJMbA==", "ZvhHEezQ");
            LinearLayout linearLayout2 = j2Var.f1007d;
            g.d(linearLayout2, p12);
            pdf.pdfreader.viewer.editor.free.utils.extension.g.e(linearLayout2, new l<View, d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pdf2word.widget.Pdf2WordConvertBottomView$initView$1$3
                {
                    super(1);
                }

                @Override // cg.l
                public /* bridge */ /* synthetic */ d invoke(View view) {
                    invoke2(view);
                    return d.f30009a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(View it) {
                    g.e(it, "it");
                    Pdf2WordConvertBottomView pdf2WordConvertBottomView = Pdf2WordConvertBottomView.this;
                    String str2 = pdf2WordConvertBottomView.f25603b;
                    if (!(str2 == null || str2.length() == 0)) {
                        tn.a.d(pdf2WordConvertBottomView.getContext(), ea.a.p("KWlfaQpo", "VILZfshU"), ea.a.p("UnMgXxRvDWQtY1hpCms=", "7U6dAS5t"), pdf2WordConvertBottomView.f25603b, false);
                    }
                    if (e.l(ReaderPdfApplication.m().getApplicationContext())) {
                        Pdf2WordConvertBottomView.this.c();
                    } else {
                        eo.d.c(it.getContext(), ea.a.p("Nw==", "C8yYbZDG"), new a(Pdf2WordConvertBottomView.this, it));
                    }
                }

                /* compiled from: Pdf2WordConvertBottomView.kt */
                /* loaded from: classes3.dex */
                public static final class a implements oe.a {

                    /* renamed from: a  reason: collision with root package name */
                    public final /* synthetic */ Pdf2WordConvertBottomView f25604a;

                    /* renamed from: b  reason: collision with root package name */
                    public final /* synthetic */ View f25605b;

                    public a(Pdf2WordConvertBottomView pdf2WordConvertBottomView, View view) {
                        this.f25604a = pdf2WordConvertBottomView;
                        this.f25605b = view;
                    }

                    @Override // oe.a
                    public final void e(int i10) {
                        if (i10 == -1 || i10 == 5) {
                            Pdf2WordConvertBottomView pdf2WordConvertBottomView = this.f25604a;
                            if (i10 == 5) {
                                Context context = this.f25605b.getContext();
                                g.d(context, ea.a.p("O3QZYz9uBmUwdA==", "TjR7PrtQ"));
                                int i11 = Pdf2WordConvertBottomView.f25602d;
                                pdf2WordConvertBottomView.getClass();
                                h hVar = new h();
                                hVar.f28986a = hVar;
                                hVar.c(context);
                            }
                            int i12 = Pdf2WordConvertBottomView.f25602d;
                            pdf2WordConvertBottomView.c();
                        }
                    }

                    @Override // oe.a
                    public final void a() {
                    }

                    @Override // oe.a
                    public final void b() {
                    }

                    @Override // oe.a
                    public final void c() {
                    }

                    @Override // oe.a
                    public final void d() {
                    }
                }
            });
        }
    }

    public final void c() {
        j2 j2Var = (j2) this.f24761a;
        if (j2Var != null) {
            j2Var.f1006b.setVisibility(0);
            j2Var.f1008e.setVisibility(8);
        }
    }

    public final String getEventSource() {
        return this.f25603b;
    }

    public final void setEnquiryTitle(String str) {
        j2 j2Var = (j2) this.f24761a;
        if (j2Var != null) {
            j2Var.f1015l.setText(str);
        }
    }

    public final void setEventSource(String str) {
        this.f25603b = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Pdf2WordConvertBottomView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        g.e(context, ea.a.p("UG8ldBZ4dA==", "RQdDsYES"));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Pdf2WordConvertBottomView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        g.e(context, ea.a.p("UG8ldBZ4dA==", "jJg8YUS5"));
    }
}

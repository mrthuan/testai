package pdf.pdfreader.viewer.editor.free.ui.dialog;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.ui.dialog.PdfReaderOpenDefaultDialog;

/* compiled from: PdfReaderOpenClearDialog.kt */
/* loaded from: classes3.dex */
public final class PdfReaderOpenClearDialog extends oo.g {
    public static final /* synthetic */ int M = 0;
    public final tf.c A;
    public final tf.c B;
    public final tf.c C;
    public final tf.c D;
    public final tf.c E;
    public final tf.c F;
    public final tf.c G;
    public boolean H;
    public final String I;
    public final ActivityInfo J;
    public ro.b<Boolean, PdfReaderOpenClearDialog> K;
    public int L;

    /* renamed from: y  reason: collision with root package name */
    public final int f27447y;

    /* renamed from: z  reason: collision with root package name */
    public final tf.c f27448z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PdfReaderOpenClearDialog(Context context, int i10) {
        super(context, (Object) null);
        kotlin.jvm.internal.g.e(context, ea.a.p("UG8ldBZ4dA==", "Xzq5xIJ5"));
        this.f27447y = i10;
        this.f27448z = kotlin.a.a(new cg.a<View>() { // from class: pdf.pdfreader.viewer.editor.free.ui.dialog.PdfReaderOpenClearDialog$btOk$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // cg.a
            public final View invoke() {
                PdfReaderOpenClearDialog pdfReaderOpenClearDialog = PdfReaderOpenClearDialog.this;
                int i11 = PdfReaderOpenClearDialog.M;
                return pdfReaderOpenClearDialog.x().findViewById(R.id.btOpenClearOk);
            }
        });
        this.A = kotlin.a.a(new cg.a<View>() { // from class: pdf.pdfreader.viewer.editor.free.ui.dialog.PdfReaderOpenClearDialog$btLater$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // cg.a
            public final View invoke() {
                PdfReaderOpenClearDialog pdfReaderOpenClearDialog = PdfReaderOpenClearDialog.this;
                int i11 = PdfReaderOpenClearDialog.M;
                return pdfReaderOpenClearDialog.x().findViewById(R.id.btOpenClearLater);
            }
        });
        this.B = kotlin.a.a(new cg.a<ImageView>() { // from class: pdf.pdfreader.viewer.editor.free.ui.dialog.PdfReaderOpenClearDialog$ivOtherIcon$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // cg.a
            public final ImageView invoke() {
                PdfReaderOpenClearDialog pdfReaderOpenClearDialog = PdfReaderOpenClearDialog.this;
                int i11 = PdfReaderOpenClearDialog.M;
                return (ImageView) pdfReaderOpenClearDialog.x().findViewById(R.id.ivOpenClearOtherIcon);
            }
        });
        this.C = kotlin.a.a(new cg.a<TextView>() { // from class: pdf.pdfreader.viewer.editor.free.ui.dialog.PdfReaderOpenClearDialog$tvOtherName$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // cg.a
            public final TextView invoke() {
                PdfReaderOpenClearDialog pdfReaderOpenClearDialog = PdfReaderOpenClearDialog.this;
                int i11 = PdfReaderOpenClearDialog.M;
                return (TextView) pdfReaderOpenClearDialog.x().findViewById(R.id.tvOpenClearOtherName);
            }
        });
        this.D = kotlin.a.a(new cg.a<TextView>() { // from class: pdf.pdfreader.viewer.editor.free.ui.dialog.PdfReaderOpenClearDialog$tvOpenClearTitle$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // cg.a
            public final TextView invoke() {
                PdfReaderOpenClearDialog pdfReaderOpenClearDialog = PdfReaderOpenClearDialog.this;
                int i11 = PdfReaderOpenClearDialog.M;
                return (TextView) pdfReaderOpenClearDialog.x().findViewById(R.id.tvOpenClearTitle);
            }
        });
        this.E = kotlin.a.a(new cg.a<TextView>() { // from class: pdf.pdfreader.viewer.editor.free.ui.dialog.PdfReaderOpenClearDialog$tvOpenClearDesc2$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // cg.a
            public final TextView invoke() {
                PdfReaderOpenClearDialog pdfReaderOpenClearDialog = PdfReaderOpenClearDialog.this;
                int i11 = PdfReaderOpenClearDialog.M;
                return (TextView) pdfReaderOpenClearDialog.x().findViewById(R.id.tvOpenClearDesc2);
            }
        });
        this.F = kotlin.a.a(new cg.a<ViewGroup>() { // from class: pdf.pdfreader.viewer.editor.free.ui.dialog.PdfReaderOpenClearDialog$contentRoot$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // cg.a
            public final ViewGroup invoke() {
                PdfReaderOpenClearDialog pdfReaderOpenClearDialog = PdfReaderOpenClearDialog.this;
                int i11 = PdfReaderOpenClearDialog.M;
                return (ViewGroup) pdfReaderOpenClearDialog.x().findViewById(R.id.llContentRoot);
            }
        });
        this.G = kotlin.a.a(new cg.a<ImageView>() { // from class: pdf.pdfreader.viewer.editor.free.ui.dialog.PdfReaderOpenClearDialog$ivDefault$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // cg.a
            public final ImageView invoke() {
                PdfReaderOpenClearDialog pdfReaderOpenClearDialog = PdfReaderOpenClearDialog.this;
                int i11 = PdfReaderOpenClearDialog.M;
                return (ImageView) pdfReaderOpenClearDialog.x().findViewById(R.id.ivOpenClear);
            }
        });
        this.I = "";
        this.L = 1;
        PdfReaderOpenDefaultDialog.J.getClass();
        Context m10 = ReaderPdfApplication.m();
        kotlin.jvm.internal.g.c(m10, ea.a.p("IXVdbFljVm40bz4gF2VIY1RzGiAxb0VuKm51bhFsGSA7eUFlWWFZZChvI2RbYwduQWUAdGtDCm4xZSB0M3IUcD9lcg==", "LdmwEXdu"));
        ResolveInfo resolveActivity = ((ContextWrapper) m10).getPackageManager().resolveActivity(PdfReaderOpenDefaultDialog.a.e(i10), 65536);
        ActivityInfo activityInfo = resolveActivity != null ? resolveActivity.activityInfo : null;
        if (activityInfo != null) {
            String str = activityInfo.packageName;
            kotlin.jvm.internal.g.d(str, ea.a.p("WnRlcBJjCWEVZXphBGU=", "dDan0pkf"));
            this.I = str;
            this.J = activityInfo;
        }
    }

    public final void H() {
        if (getContext().getResources().getConfiguration().orientation != this.L && this.f23541s) {
            this.L = getContext().getResources().getConfiguration().orientation;
            int min = Math.min(getContext().getResources().getDisplayMetrics().widthPixels, getContext().getResources().getDisplayMetrics().heightPixels);
            tf.c cVar = this.F;
            Object value = cVar.getValue();
            kotlin.jvm.internal.g.d(value, ea.a.p("D2cudF5jDW4GZVp0O285dHooHC5oKQ==", "c3a85sYQ"));
            ViewGroup.LayoutParams layoutParams = ((ViewGroup) value).getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = min;
                Object value2 = cVar.getValue();
                kotlin.jvm.internal.g.d(value2, ea.a.p("D2cudF5jDW4GZVp0O285dHooHC5oKQ==", "c3a85sYQ"));
                ((ViewGroup) value2).setLayoutParams(layoutParams);
            }
            if (getContext().getResources().getConfiguration().orientation == 1) {
                ViewGroup.LayoutParams layoutParams2 = J().getLayoutParams();
                if (layoutParams2 != null && (layoutParams2 instanceof ViewGroup.MarginLayoutParams)) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                    marginLayoutParams.setMarginStart(getContext().getResources().getDimensionPixelSize(R.dimen.dp_52));
                    marginLayoutParams.setMarginEnd(getContext().getResources().getDimensionPixelSize(R.dimen.dp_52));
                    marginLayoutParams.topMargin = getContext().getResources().getDimensionPixelSize(R.dimen.dp_40);
                    J().setLayoutParams(layoutParams2);
                }
                ViewGroup.LayoutParams layoutParams3 = K().getLayoutParams();
                if (layoutParams3 != null && (layoutParams3 instanceof ViewGroup.MarginLayoutParams)) {
                    ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin = getContext().getResources().getDimensionPixelSize(R.dimen.dp_24);
                    K().setLayoutParams(layoutParams3);
                    return;
                }
                return;
            }
            ViewGroup.LayoutParams layoutParams4 = J().getLayoutParams();
            if (layoutParams4 != null && (layoutParams4 instanceof ViewGroup.MarginLayoutParams)) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams4;
                marginLayoutParams2.setMarginStart(getContext().getResources().getDimensionPixelSize(R.dimen.dp_88));
                marginLayoutParams2.setMarginEnd(getContext().getResources().getDimensionPixelSize(R.dimen.dp_88));
                marginLayoutParams2.topMargin = getContext().getResources().getDimensionPixelSize(R.dimen.dp_32);
                J().setLayoutParams(layoutParams4);
            }
            ViewGroup.LayoutParams layoutParams5 = K().getLayoutParams();
            if (layoutParams5 != null && (layoutParams5 instanceof ViewGroup.MarginLayoutParams)) {
                ((ViewGroup.MarginLayoutParams) layoutParams5).topMargin = getContext().getResources().getDimensionPixelSize(R.dimen.dp_20);
                K().setLayoutParams(layoutParams5);
            }
        }
    }

    public final String I() {
        PdfReaderOpenDefaultDialog.J.getClass();
        StringBuilder g10 = a0.d.g(PdfReaderOpenDefaultDialog.a.g(this.f27447y), "_");
        g10.append(this.I);
        return g10.toString();
    }

    public final ImageView J() {
        Object value = this.G.getValue();
        kotlin.jvm.internal.g.d(value, ea.a.p("D2cudF5pFEQXZlV1BXRoKGouHCk=", "DI0NQ2B3"));
        return (ImageView) value;
    }

    public final TextView K() {
        Object value = this.D.getValue();
        kotlin.jvm.internal.g.d(value, ea.a.p("c2dUdFR0QU8qZSRDGWUJcmFpGmwgPk0uVC4p", "gouGzNMh"));
        return (TextView) value;
    }

    @Override // oo.g, android.app.Dialog
    public final void show() {
        super.show();
        pdf.pdfreader.viewer.editor.free.utils.d1 b10 = pdf.pdfreader.viewer.editor.free.utils.d1.b(getContext());
        b10.c("KEY_TYPE_SET_DEFAULT_SHOW_" + this.f27447y, true);
        this.H = false;
        tn.a.d(getContext(), ea.a.p("C3UAZGU=", "HPlizPVo"), ea.a.p("UGwuYQFfEWgddw==", "smbqrabQ"), I(), false);
    }

    @Override // oo.g
    public final int w() {
        return R.layout.dialog_app_default_open_clear_old;
    }

    @Override // oo.g
    public final void z() {
        String p10;
        ActivityInfo activityInfo = this.J;
        if (activityInfo != null) {
            Object value = this.C.getValue();
            kotlin.jvm.internal.g.d(value, ea.a.p("c2dUdFR0QU8uaC9yO2EFZQsoQC5rKQ==", "ibX18TED"));
            ((TextView) value).setText(activityInfo.loadLabel(getContext().getPackageManager()));
            Object value2 = this.B.getValue();
            kotlin.jvm.internal.g.d(value2, ea.a.p("D2cudF5pFE8GaFFyIGM5bnooHC5oKQ==", "vQPo5LVQ"));
            ((ImageView) value2).setImageDrawable(activityInfo.loadIcon(getContext().getPackageManager()));
        }
        Object value3 = this.f27448z.getValue();
        kotlin.jvm.internal.g.d(value3, ea.a.p("c2dUdFRiQ08xPmIuWy4p", "xV3Qv23W"));
        ((View) value3).setOnClickListener(new k9.c(this, 26));
        Object value4 = this.A.getValue();
        kotlin.jvm.internal.g.d(value4, ea.a.p("D2cudF5iFkwTdFFyVyh4Lmop", "wvg0ASvJ"));
        ((View) value4).setOnClickListener(new u4.g(this, 20));
        switch (this.f27447y) {
            case 1:
                p10 = ea.a.p("Y0RG", "kVQxTXnS");
                break;
            case 2:
                p10 = ea.a.p("Nk9D", "kwr7cURi");
                break;
            case 3:
                p10 = ea.a.p("C09yWA==", "dobWnjKO");
                break;
            case 4:
                p10 = ea.a.p("a0xT", "5q7LYrQa");
                break;
            case 5:
                p10 = ea.a.p("a0wYWA==", "KR9Hhm5W");
                break;
            case 6:
                p10 = ea.a.p("Y1BU", "aAPp1dvA");
                break;
            case 7:
                p10 = ea.a.p("H1BlWA==", "bcQXUUWO");
                break;
            default:
                p10 = ea.a.p("H0RG", "uXmuGAkW");
                break;
        }
        K().setText(getContext().getString(R.string.arg_res_0x7f13046e, p10));
        Object value5 = this.E.getValue();
        kotlin.jvm.internal.g.d(value5, ea.a.p("c2dUdFR0QU8qZSRDGWUJcnFlHWN3Pk0uFi4p", "mg2L8pM1"));
        ((TextView) value5).setText(getContext().getString(R.string.arg_res_0x7f13046d, getContext().getString(R.string.arg_res_0x7f130025)));
        setOnCancelListener(new pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.a(this, 3));
        int min = (int) (Math.min(pdf.pdfreader.viewer.editor.free.utils.t0.p0(getContext()), getContext().getResources().getDisplayMetrics().heightPixels) * 0.72f);
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.dp_270);
        if (min > dimensionPixelSize) {
            min = dimensionPixelSize;
        }
        ViewGroup.LayoutParams layoutParams = J().getLayoutParams();
        layoutParams.width = min;
        layoutParams.height = (min * 2) / 3;
        J().setLayoutParams(layoutParams);
        s().K = false;
        H();
    }
}

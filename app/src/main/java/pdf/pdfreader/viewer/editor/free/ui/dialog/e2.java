package pdf.pdfreader.viewer.editor.free.ui.dialog;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.text.SimpleDateFormat;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.feature.billing.BillingConfigImpl;
import pdf.pdfreader.viewer.editor.free.ui.widget.UpdateHintNewTextView;

/* compiled from: PdfShowMoreMenuDialog.java */
/* loaded from: classes3.dex */
public final class e2 extends oo.g {
    public TextView A;
    public TextView B;
    public TextView C;
    public TextView D;
    public TextView E;
    public TextView F;
    public TextView G;
    public ImageView H;
    public ImageView I;
    public TextView J;
    public ImageView K;
    public ImageView L;
    public TextView M;
    public ImageView N;
    public TextView O;
    public ImageView P;
    public TextView Q;
    public UpdateHintNewTextView R;
    public TextView S;
    public TextView T;
    public ConstraintLayout U;
    public View V;
    public ConstraintLayout W;
    public View X;
    public View Y;
    public boolean Z;

    /* renamed from: a0  reason: collision with root package name */
    public ConstraintLayout f27540a0;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f27541b0;

    /* renamed from: c0  reason: collision with root package name */
    public SimpleDateFormat f27542c0;

    /* renamed from: d0  reason: collision with root package name */
    public UpdateHintNewTextView f27543d0;

    /* renamed from: e0  reason: collision with root package name */
    public View f27544e0;

    /* renamed from: f0  reason: collision with root package name */
    public xn.a f27545f0;

    /* renamed from: y  reason: collision with root package name */
    public final a f27546y;

    /* renamed from: z  reason: collision with root package name */
    public PdfPreviewEntity f27547z;

    /* compiled from: PdfShowMoreMenuDialog.java */
    /* loaded from: classes3.dex */
    public interface a {
    }

    public e2(Context context, PdfPreviewEntity pdfPreviewEntity, ao.n1 n1Var) {
        super(context);
        this.f27541b0 = false;
        this.f27547z = pdfPreviewEntity;
        this.f27546y = n1Var;
    }

    @Override // oo.g
    public final boolean A() {
        return true;
    }

    @Override // oo.g
    public final boolean B() {
        return true;
    }

    @Override // oo.g
    public final boolean C() {
        return true;
    }

    @Override // oo.g
    public final float E() {
        return 1.0f;
    }

    public final void H() {
        boolean z10;
        if (this.V != null) {
            if (pdf.pdfreader.viewer.editor.free.utils.q0.C(getContext())) {
                Context context = getContext();
                kotlin.jvm.internal.g.e(context, "context");
                if (pdf.pdfreader.viewer.editor.free.utils.c1.E(context)) {
                    long size = this.f27547z.getSize();
                    if (lm.e.f21773a && size > 10485760) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10 && !this.f27547z.isOtherBoolOne()) {
                        this.V.setVisibility(0);
                        return;
                    }
                }
            }
            this.V.setVisibility(8);
        }
    }

    public final void I() {
        ConstraintLayout constraintLayout = this.U;
        if (constraintLayout != null && this.T != null && this.X != null) {
            if (constraintLayout.getVisibility() == 8 && this.T.getVisibility() == 8) {
                this.X.setVisibility(8);
            } else {
                this.X.setVisibility(0);
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:1|(3:3|(1:41)(1:7)|(12:11|12|(1:(2:15|(2:17|(1:19)(1:37))(1:38))(1:39))(1:40)|20|(1:22)|23|(1:25)|(1:27)(1:36)|28|29|30|31))|42|12|(0)(0)|20|(0)|23|(0)|(0)(0)|28|29|30|31) */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x018c, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x018d, code lost:
        r9.G.setVisibility(8);
        r0.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x016e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void J() {
        /*
            Method dump skipped, instructions count: 620
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.ui.dialog.e2.J():void");
    }

    public final void K() {
        if (this.f27543d0 != null) {
            if (pdf.pdfreader.viewer.editor.free.utils.q0.g(getContext(), 95, "ocr_update_red_dot_in_175")) {
                this.f27543d0.setVisibility(0);
            } else {
                this.f27543d0.setVisibility(8);
            }
        }
    }

    public final void L() {
        if (this.Y != null) {
            if (pdf.pdfreader.viewer.editor.free.utils.q0.F(getContext())) {
                this.Y.setVisibility(0);
            } else {
                this.Y.setVisibility(8);
            }
        }
    }

    public final void M() {
        if (this.R != null) {
            wm.a aVar = wm.a.c;
            Context context = getContext();
            aVar.getClass();
            kotlin.jvm.internal.g.e(context, "context");
            if (pdf.pdfreader.viewer.editor.free.utils.q0.g(context, 86, ea.a.p("WnMUcxtvFV8CclF2AGUhXylvQGUZcCJnVV9VYQhhEmVsci5kLGQNdC1pWl9YNzM=", "08fuvgdt"))) {
                this.R.setVisibility(0);
            } else {
                this.R.setVisibility(8);
            }
        }
    }

    @Override // oo.g, android.app.Dialog
    public final void show() {
        int i10;
        H();
        L();
        M();
        K();
        View view = this.f27544e0;
        if (view != null) {
            BillingConfigImpl.c.getClass();
            if (BillingConfigImpl.r()) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            view.setVisibility(i10);
        }
        super.show();
    }

    @Override // oo.g
    public final int w() {
        return R.layout.show_pdf_more_menu_dialog;
    }

    @Override // oo.g
    public final void z() {
        View x4 = x();
        this.A = (TextView) x4.findViewById(R.id.dia_main_more_name);
        this.B = (TextView) x4.findViewById(R.id.dia_main_more_path);
        this.D = (TextView) x4.findViewById(R.id.show_pdf_menu_rename);
        this.C = (TextView) x4.findViewById(R.id.show_pdf_compress_pdf);
        this.E = (TextView) x4.findViewById(R.id.show_pdf_menu_merge);
        this.F = (TextView) x4.findViewById(R.id.show_pdf_menu_split);
        this.G = (TextView) x4.findViewById(R.id.show_pdf_set_password);
        this.H = (ImageView) x4.findViewById(R.id.show_pdf_menu_favorite);
        LinearLayout linearLayout = (LinearLayout) x4.findViewById(R.id.show_pdf_menu_print);
        this.I = (ImageView) x4.findViewById(R.id.iv_show_pdf_menu_print);
        this.J = (TextView) x4.findViewById(R.id.tv_show_pdf_menu_print);
        this.K = (ImageView) x4.findViewById(R.id.item_icon);
        LinearLayout linearLayout2 = (LinearLayout) x4.findViewById(R.id.show_pdf_menu_detail);
        this.L = (ImageView) x4.findViewById(R.id.iv_show_pdf_menu_detail);
        this.M = (TextView) x4.findViewById(R.id.tv_show_pdf_menu_detail);
        LinearLayout linearLayout3 = (LinearLayout) x4.findViewById(R.id.show_pdf_menu_share);
        this.N = (ImageView) x4.findViewById(R.id.iv_show_pdf_menu_share);
        this.O = (TextView) x4.findViewById(R.id.tv_show_pdf_menu_share);
        this.P = (ImageView) x4.findViewById(R.id.iv_show_pdf_menu_manage);
        this.Q = (TextView) x4.findViewById(R.id.tv_show_pdf_menu_manage);
        this.R = (UpdateHintNewTextView) x4.findViewById(R.id.new_update_manage_new);
        this.S = (TextView) x4.findViewById(R.id.show_pdf_menu_view_mode);
        this.T = (TextView) x4.findViewById(R.id.show_pdf_menu_go_to);
        this.U = (ConstraintLayout) findViewById(R.id.show_pdf_menu_ai);
        this.X = findViewById(R.id.view_ai_go_to_page_line);
        this.V = findViewById(R.id.new_update_ai_new);
        this.W = (ConstraintLayout) x4.findViewById(R.id.show_pdf_to_image);
        this.Y = x4.findViewById(R.id.new_update_to_image_new);
        this.f27540a0 = (ConstraintLayout) x4.findViewById(R.id.rl_title_wrapper);
        this.f27543d0 = (UpdateHintNewTextView) x4.findViewById(R.id.extract_text_update);
        x4.findViewById(R.id.favorite_layout).setOnClickListener(new t1(this));
        this.f27544e0 = x4.findViewById(R.id.extract_text_layout);
        BillingConfigImpl.c.getClass();
        if (BillingConfigImpl.r()) {
            this.f27544e0.setVisibility(0);
            Context context = getContext();
            String str = pdf.pdfreader.viewer.editor.free.utils.p.f28740a;
            pdf.pdfreader.viewer.editor.free.utils.p.b(context, ea.a.p("EmkPdwdtGHJl", "8ddjXwNq"), ea.a.p("RWkudx5vEGUtb1dyNnM-b3c=", "ngMGn0AZ"), null);
        } else {
            this.f27544e0.setVisibility(8);
        }
        this.f27544e0.setOnClickListener(new v1(this));
        J();
    }
}

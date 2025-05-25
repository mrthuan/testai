package pdf.pdfreader.viewer.editor.free.ui.dialog;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.text.SimpleDateFormat;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.office.OfficeReaderActivity;
import pdf.pdfreader.viewer.editor.free.utils.event.AIEventCenter;

/* compiled from: OfficeShowMoreMenuDialog.java */
/* loaded from: classes3.dex */
public final class z extends oo.g {
    public TextView A;
    public TextView B;
    public ImageView C;
    public ImageView D;
    public TextView E;
    public TextView F;
    public ImageView G;
    public TextView H;
    public ImageView I;
    public TextView J;
    public View K;
    public ConstraintLayout L;
    public boolean M;
    public final int N;
    public ConstraintLayout O;
    public View P;
    public SimpleDateFormat Q;
    public xn.a R;

    /* renamed from: y  reason: collision with root package name */
    public final i f27811y;

    /* renamed from: z  reason: collision with root package name */
    public final PdfPreviewEntity f27812z;

    /* compiled from: OfficeShowMoreMenuDialog.java */
    /* loaded from: classes3.dex */
    public class a extends pdf.pdfreader.viewer.editor.free.utils.l0 {
        public a() {
        }

        @Override // pdf.pdfreader.viewer.editor.free.utils.l0
        public final void a(View view) {
            z zVar = z.this;
            i iVar = zVar.f27811y;
            if (iVar != null) {
                iVar.d();
            }
            zVar.cancel();
        }
    }

    /* compiled from: OfficeShowMoreMenuDialog.java */
    /* loaded from: classes3.dex */
    public class b extends pdf.pdfreader.viewer.editor.free.utils.l0 {
        public b() {
        }

        @Override // pdf.pdfreader.viewer.editor.free.utils.l0
        public final void a(View view) {
            z zVar = z.this;
            if (zVar.f27811y != null) {
                tn.a.d(view.getContext(), ea.a.p("OWlUdyZtWHJl", "F8XihBwl"), ea.a.p("NGkndztvQGUXcgNuVW0yX1tsO2Nr", "JHBBV2CL"), aj.b.t(zVar.f27812z.getOtherStrOne()), false);
                zVar.f27811y.e();
            }
            zVar.cancel();
        }
    }

    /* compiled from: OfficeShowMoreMenuDialog.java */
    /* loaded from: classes3.dex */
    public class c extends pdf.pdfreader.viewer.editor.free.utils.l0 {
        public c() {
        }

        @Override // pdf.pdfreader.viewer.editor.free.utils.l0
        public final void a(View view) {
            z zVar = z.this;
            i iVar = zVar.f27811y;
            if (iVar != null) {
                iVar.b(zVar.f27812z);
            }
            zVar.cancel();
        }
    }

    /* compiled from: OfficeShowMoreMenuDialog.java */
    /* loaded from: classes3.dex */
    public class d extends pdf.pdfreader.viewer.editor.free.utils.l0 {
        public d() {
        }

        @Override // pdf.pdfreader.viewer.editor.free.utils.l0
        public final void a(View view) {
            z.this.I.performClick();
        }
    }

    /* compiled from: OfficeShowMoreMenuDialog.java */
    /* loaded from: classes3.dex */
    public class e extends pdf.pdfreader.viewer.editor.free.utils.l0 {
        public e() {
        }

        @Override // pdf.pdfreader.viewer.editor.free.utils.l0
        public final void a(View view) {
            z zVar = z.this;
            xn.a aVar = zVar.R;
            if (aVar != null) {
                aVar.e();
            }
            zVar.cancel();
        }
    }

    /* compiled from: OfficeShowMoreMenuDialog.java */
    /* loaded from: classes3.dex */
    public class f extends pdf.pdfreader.viewer.editor.free.utils.l0 {
        public f() {
        }

        @Override // pdf.pdfreader.viewer.editor.free.utils.l0
        public final void a(View view) {
            z.this.G.performClick();
        }
    }

    /* compiled from: OfficeShowMoreMenuDialog.java */
    /* loaded from: classes3.dex */
    public class g extends pdf.pdfreader.viewer.editor.free.utils.l0 {
        public g() {
        }

        @Override // pdf.pdfreader.viewer.editor.free.utils.l0
        public final void a(View view) {
            z zVar = z.this;
            xn.a aVar = zVar.R;
            if (aVar != null) {
                aVar.e();
            }
            zVar.cancel();
        }
    }

    /* compiled from: OfficeShowMoreMenuDialog.java */
    /* loaded from: classes3.dex */
    public class h extends pdf.pdfreader.viewer.editor.free.utils.l0 {
        public h() {
        }

        @Override // pdf.pdfreader.viewer.editor.free.utils.l0
        public final void a(View view) {
            z zVar = z.this;
            Context context = zVar.getContext();
            String str = pdf.pdfreader.viewer.editor.free.utils.p.f28740a;
            pdf.pdfreader.viewer.editor.free.utils.p.b(context, ea.a.p("OWlUdyZtWHJl", "dEBNFAvr"), ea.a.p("RWkudx5vEGUtYV1fCmw_Y2s=", "X5nYmBX9"), pdf.pdfreader.viewer.editor.free.utils.p.d(zVar.f27812z));
            AIEventCenter.f28648a.getClass();
            AIEventCenter.b();
            i iVar = zVar.f27811y;
            if (iVar != null) {
                iVar.c();
            }
            if (zVar.P.getVisibility() == 0) {
                zVar.P.setVisibility(8);
                pdf.pdfreader.viewer.editor.free.utils.q0.v(zVar.getContext());
            }
            zVar.cancel();
        }
    }

    /* compiled from: OfficeShowMoreMenuDialog.java */
    /* loaded from: classes3.dex */
    public interface i {
        void a(PdfPreviewEntity pdfPreviewEntity, boolean z10);

        void b(PdfPreviewEntity pdfPreviewEntity);

        void c();

        void d();

        void e();
    }

    static {
        ea.a.p("fGYtaRBlMWgdd3lvG2UbZSp1dmknbCxn", "Ui5ygNQV");
    }

    public z(OfficeReaderActivity officeReaderActivity, PdfPreviewEntity pdfPreviewEntity, int i10, pdf.pdfreader.viewer.editor.free.office.w wVar) {
        super(officeReaderActivity);
        this.M = false;
        this.N = -1;
        this.f27812z = pdfPreviewEntity;
        this.f27811y = wVar;
        this.N = i10;
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
    public final void G() {
        J();
        this.A.setText(this.f27812z.getName());
    }

    public final void H() {
        boolean z10;
        if (this.P != null) {
            if (pdf.pdfreader.viewer.editor.free.utils.q0.C(getContext())) {
                Context context = getContext();
                kotlin.jvm.internal.g.e(context, "context");
                if (pdf.pdfreader.viewer.editor.free.utils.c1.E(context) && this.N == 0) {
                    PdfPreviewEntity pdfPreviewEntity = this.f27812z;
                    long size = pdfPreviewEntity.getSize();
                    if (lm.e.f21773a && size > 10485760) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10 && !pdfPreviewEntity.isOtherBoolOne()) {
                        this.P.setVisibility(0);
                        return;
                    }
                }
            }
            this.P.setVisibility(8);
        }
    }

    public final void I() {
        TextView textView;
        TextView textView2;
        if (this.K != null) {
            ConstraintLayout constraintLayout = this.O;
            if ((constraintLayout != null && constraintLayout.getVisibility() == 0) || (((textView = this.E) != null && textView.getVisibility() == 0) || ((textView2 = this.F) != null && textView2.getVisibility() == 0))) {
                this.K.setVisibility(0);
            } else {
                this.K.setVisibility(4);
            }
        }
    }

    public final void J() {
        PdfPreviewEntity pdfPreviewEntity = this.f27812z;
        if (pdfPreviewEntity != null) {
            if (this.Q == null) {
                this.Q = new SimpleDateFormat(ea.a.p("fk1kZBcvG3kLeQ==", "rmN98x07"), getContext().getResources().getConfiguration().locale);
            }
            String format = this.Q.format(Long.valueOf(pdfPreviewEntity.getDate()));
            Context context = getContext();
            pdfPreviewEntity.getPath();
            String t4 = pdf.pdfreader.viewer.editor.free.utils.v.t(context, pdfPreviewEntity.getSize());
            TextView textView = this.B;
            StringBuilder k10 = a0.a.k(format);
            k10.append(ea.a.p("b8KGIA==", "OlbWTdnm"));
            k10.append(t4);
            textView.setText(k10.toString());
        }
    }

    @Override // oo.g, android.app.Dialog
    public final void show() {
        boolean z10;
        Context context = getContext();
        kotlin.jvm.internal.g.e(context, "context");
        if (pdf.pdfreader.viewer.editor.free.utils.c1.E(context) && this.N == 0) {
            PdfPreviewEntity pdfPreviewEntity = this.f27812z;
            long size = pdfPreviewEntity.getSize();
            if (lm.e.f21773a && size > 10485760) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10 && !pdfPreviewEntity.isOtherBoolOne()) {
                Context context2 = getContext();
                String str = pdf.pdfreader.viewer.editor.free.utils.p.f28740a;
                pdf.pdfreader.viewer.editor.free.utils.p.b(context2, ea.a.p("PWkVd25tDHJl", "1BKp1c7W"), ea.a.p("B2kIdyFvMWUXYQ9fR2g4dw==", "f9qmLCGr"), pdf.pdfreader.viewer.editor.free.utils.p.d(pdfPreviewEntity));
                AIEventCenter.f28648a.getClass();
                AIEventCenter.c();
            }
        }
        H();
        super.show();
    }

    @Override // oo.g
    public final int w() {
        return R.layout.show_office_more_menu_dialog;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0146  */
    @Override // oo.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void z() {
        /*
            Method dump skipped, instructions count: 416
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.ui.dialog.z.z():void");
    }
}

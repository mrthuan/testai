package pdf.pdfreader.viewer.editor.free.ui.dialog;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import java.util.ArrayList;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.PDFPageManagerActivity;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;
import pdf.pdfreader.viewer.editor.free.ui.dialog.e2;

/* compiled from: PdfShowMoreMenuDialog.java */
/* loaded from: classes3.dex */
public final class d2 extends pdf.pdfreader.viewer.editor.free.utils.l0 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e2 f27530b;

    public d2(e2 e2Var) {
        this.f27530b = e2Var;
    }

    @Override // pdf.pdfreader.viewer.editor.free.utils.l0
    public final void a(View view) {
        e2 e2Var = this.f27530b;
        e2.a aVar = e2Var.f27546y;
        if (aVar != null) {
            PdfPreviewEntity pdfPreviewEntity = e2Var.f27547z;
            ao.n1 n1Var = (ao.n1) aVar;
            if (pdfPreviewEntity == null) {
                n1Var.getClass();
            } else {
                ReaderPreviewActivity readerPreviewActivity = n1Var.f5112a;
                if (readerPreviewActivity.I5) {
                    readerPreviewActivity.h(readerPreviewActivity.getResources().getString(R.string.arg_res_0x7f1300d4));
                } else {
                    PDFPageManagerActivity.a aVar2 = PDFPageManagerActivity.H0;
                    String p10 = ea.a.p("P3JUdhBldw==", "juVteYgZ");
                    String pdfPwd = readerPreviewActivity.W;
                    int i10 = readerPreviewActivity.B2;
                    aVar2.getClass();
                    kotlin.jvm.internal.g.e(pdfPwd, "pdfPwd");
                    an.a.f1700b.j(new ArrayList<>());
                    an.a.f1699a.j(new ArrayList<>());
                    an.a.f1701d.j(new ArrayList<>());
                    an.a.f1703f.j(null);
                    an.a.f1702e = null;
                    Intent intent = new Intent(readerPreviewActivity, PDFPageManagerActivity.class);
                    String p11 = ea.a.p("Q2QtXwNhFmg=", "QNxsahaA");
                    String path = pdfPreviewEntity.getPath();
                    if (path == null) {
                        path = "";
                    }
                    intent.putExtra(p11, path);
                    intent.putExtra(ea.a.p("JHJdbQ==", "gyB2HivB"), p10);
                    intent.putExtra(ea.a.p("P2RXXwl3ZA==", "YLBhjpiD"), pdfPwd);
                    intent.putExtra(ea.a.p("JXUCcgBuBV84YQFl", "ZgFpeqbE"), i10);
                    intent.putExtra(ea.a.p("P2RXXxxuQ2kueQ==", "mUiotBNu"), pdfPreviewEntity);
                    readerPreviewActivity.startActivity(intent);
                    String str = pdf.pdfreader.viewer.editor.free.utils.p.f28740a;
                    pdf.pdfreader.viewer.editor.free.utils.p.b(readerPreviewActivity, ea.a.p("OWlUdyZtWHJl", "K6yIcJu1"), ea.a.p("RWkudx5vEGUtbVpnGWExZRtjXmklaw==", "sF0vZ4oS"), null);
                }
            }
        }
        if (e2Var.R.getVisibility() == 0) {
            e2Var.R.setVisibility(8);
            wm.a aVar3 = wm.a.c;
            Context context = e2Var.getContext();
            aVar3.getClass();
            kotlin.jvm.internal.g.e(context, "context");
            pdf.pdfreader.viewer.editor.free.utils.q0.w(context, ea.a.p("WnMUcxtvFV8CclF2AGUhXylvQGUZcCJnU18pYQxhLWVsci5kLGQNdC1pWl9YNzM=", "6DbJoS3p"), false);
        }
        e2Var.cancel();
    }
}

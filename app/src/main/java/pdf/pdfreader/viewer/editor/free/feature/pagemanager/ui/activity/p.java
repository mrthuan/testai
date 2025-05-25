package pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity;

import android.view.View;
import pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.PDFPageManagerActivity;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class p implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f25338a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ PDFPageManagerActivity f25339b;

    public /* synthetic */ p(PDFPageManagerActivity pDFPageManagerActivity, int i10) {
        this.f25338a = i10;
        this.f25339b = pDFPageManagerActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f25338a;
        PDFPageManagerActivity pDFPageManagerActivity = this.f25339b;
        switch (i10) {
            case 0:
                PDFPageManagerActivity.a aVar = PDFPageManagerActivity.H0;
                kotlin.jvm.internal.g.e(pDFPageManagerActivity, ea.a.p("Q2glc1Qw", "c67LpxJv"));
                if (!pDFPageManagerActivity.i2()) {
                    tn.a.b(pDFPageManagerActivity, ea.a.p("Xm4scBJnZQ==", "uLDhdAT5"), ea.a.p("Im5WcBhnUl8vbi5vKmMEaVZr", "JjuAVLAW"));
                    pDFPageManagerActivity.f25269h0.execute(new r(pDFPageManagerActivity, 1));
                    return;
                }
                return;
            default:
                PDFPageManagerActivity.a aVar2 = PDFPageManagerActivity.H0;
                kotlin.jvm.internal.g.e(pDFPageManagerActivity, ea.a.p("R2gic1cw", "J9ztDYP0"));
                pDFPageManagerActivity.j2();
                return;
        }
    }
}

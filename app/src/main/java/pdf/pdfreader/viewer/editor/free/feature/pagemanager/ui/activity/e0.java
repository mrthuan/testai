package pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity;

import pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.PDFPageManagerActivity;
import pdf.pdfreader.viewer.editor.free.utils.w0;

/* compiled from: PDFPageManagerActivity.kt */
/* loaded from: classes3.dex */
public final class e0 implements oo.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ PDFPageManagerActivity f25311a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f25312b;

    public e0(PDFPageManagerActivity pDFPageManagerActivity, int i10) {
        this.f25311a = pDFPageManagerActivity;
        this.f25312b = i10;
    }

    @Override // oo.a
    public final void a() {
        PDFPageManagerActivity.a aVar = PDFPageManagerActivity.H0;
        this.f25311a.k2(this.f25312b);
    }

    @Override // oo.a
    public final void cancel() {
        PDFPageManagerActivity pDFPageManagerActivity = this.f25311a;
        int i10 = this.f25312b;
        if (i10 != 3 && i10 != 4) {
            w0.a().c.execute(new t(i10, pDFPageManagerActivity));
        } else {
            pDFPageManagerActivity.B1(pDFPageManagerActivity.T);
        }
    }
}

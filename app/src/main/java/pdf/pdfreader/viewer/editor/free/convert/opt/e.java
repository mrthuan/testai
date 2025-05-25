package pdf.pdfreader.viewer.editor.free.convert.opt;

import pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.PDFPageManagerActivity;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f24148a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f24149b;
    public final /* synthetic */ int c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f24150d;

    public /* synthetic */ e(int i10, Object obj, int i11, int i12) {
        this.f24148a = i12;
        this.f24150d = obj;
        this.f24149b = i10;
        this.c = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f24148a;
        int i11 = this.c;
        int i12 = this.f24149b;
        Object obj = this.f24150d;
        switch (i10) {
            case 0:
                a aVar = (a) obj;
                kotlin.jvm.internal.g.e(aVar, ea.a.p("YWMYbFpiUmNr", "jbEy63I9"));
                aVar.b(i12, i11);
                return;
            default:
                PDFPageManagerActivity pDFPageManagerActivity = (PDFPageManagerActivity) obj;
                PDFPageManagerActivity.a aVar2 = PDFPageManagerActivity.H0;
                kotlin.jvm.internal.g.e(pDFPageManagerActivity, ea.a.p("R2gic1cw", "i89t5NkV"));
                pDFPageManagerActivity.q2().j(i12, i11);
                return;
        }
    }
}

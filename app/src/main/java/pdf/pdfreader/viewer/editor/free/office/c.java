package pdf.pdfreader.viewer.editor.free.office;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f26071a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ OfficeReaderActivity f26072b;

    public /* synthetic */ c(OfficeReaderActivity officeReaderActivity, int i10) {
        this.f26071a = i10;
        this.f26072b = officeReaderActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f26071a;
        OfficeReaderActivity officeReaderActivity = this.f26072b;
        switch (i10) {
            case 0:
                String str = OfficeReaderActivity.D2;
                kotlin.jvm.internal.g.e(officeReaderActivity, ea.a.p("NmgKc10w", "BGBcylC9"));
                officeReaderActivity.M2();
                return;
            default:
                String str2 = OfficeReaderActivity.D2;
                kotlin.jvm.internal.g.e(officeReaderActivity, ea.a.p("R2gic1cw", "ZRhSzQMu"));
                lo.d.a(officeReaderActivity.B1);
                officeReaderActivity.E2().b().set(false);
                officeReaderActivity.runOnUiThread(new j(officeReaderActivity, 5));
                return;
        }
    }
}

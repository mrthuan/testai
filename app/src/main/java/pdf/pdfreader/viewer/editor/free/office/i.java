package pdf.pdfreader.viewer.editor.free.office;

import android.os.Handler;
import android.view.View;
import lib.zj.office.wp.control.Word;
import pdf.pdfreader.viewer.editor.free.utils.t1;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f26106a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ OfficeReaderActivity f26107b;

    public /* synthetic */ i(OfficeReaderActivity officeReaderActivity, int i10) {
        this.f26106a = i10;
        this.f26107b = officeReaderActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view;
        int i10 = this.f26106a;
        OfficeReaderActivity officeReaderActivity = this.f26107b;
        switch (i10) {
            case 0:
                String str = OfficeReaderActivity.D2;
                kotlin.jvm.internal.g.e(officeReaderActivity, ea.a.p("Q2gFc0sw", "qC7lo3CQ"));
                t1.b(ea.a.p("AGZXaRplZWU7ZC9yNGMcaUNpGnllbwsgAkQMbAp5FW8hZWN1F25WYjZlanQcdARlFWcBbmU=", "KI4ToikR"));
                String str2 = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
                officeReaderActivity.f25927f2 = false;
                officeReaderActivity.a3(true);
                lib.zj.office.system.p pVar = officeReaderActivity.P0;
                if (pVar != null && (view = pVar.getView()) != null && (view instanceof Word)) {
                    Word word = (Word) view;
                    if (!word.T) {
                        Handler handler = word.I;
                        Word.b bVar = word.L;
                        handler.removeCallbacks(bVar);
                        handler.postDelayed(bVar, 2000L);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                String str3 = OfficeReaderActivity.D2;
                kotlin.jvm.internal.g.e(officeReaderActivity, ea.a.p("OmgGc2cw", "PNNoCqh6"));
                officeReaderActivity.k3();
                return;
            case 2:
                String str4 = OfficeReaderActivity.D2;
                kotlin.jvm.internal.g.e(officeReaderActivity, ea.a.p("R2gic1cw", "q5QCWZjD"));
                officeReaderActivity.init();
                return;
            default:
                String str5 = OfficeReaderActivity.D2;
                kotlin.jvm.internal.g.e(officeReaderActivity, ea.a.p("O2hYc10w", "fyFXywX4"));
                officeReaderActivity.f25960r2 = 0;
                officeReaderActivity.g2(true);
                return;
        }
    }
}

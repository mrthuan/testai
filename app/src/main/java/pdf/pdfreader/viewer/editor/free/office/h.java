package pdf.pdfreader.viewer.editor.free.office;

import android.app.Dialog;
import java.util.Map;
import pdf.pdfreader.viewer.editor.free.ads.FullScreenManage;
import pdf.pdfreader.viewer.editor.free.ads.a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class h implements androidx.activity.result.b, a.e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ OfficeReaderActivity f26104a;

    public /* synthetic */ h(OfficeReaderActivity officeReaderActivity) {
        this.f26104a = officeReaderActivity;
    }

    @Override // androidx.activity.result.b
    public final void c(Object obj) {
        OfficeReaderActivity.a2(this.f26104a, (Map) obj);
    }

    @Override // pdf.pdfreader.viewer.editor.free.ads.a.e
    public final void d(Dialog dialog) {
        String str = OfficeReaderActivity.D2;
        String p10 = ea.a.p("R2gic1cw", "9bJ5BkD5");
        OfficeReaderActivity officeReaderActivity = this.f26104a;
        kotlin.jvm.internal.g.e(officeReaderActivity, p10);
        if (dialog != null && dialog.isShowing()) {
            dialog.dismiss();
        }
        officeReaderActivity.f25966t1 = true;
        tf.c cVar = FullScreenManage.f23914a;
        FullScreenManage.h(officeReaderActivity, ea.a.p("PnVYdA==", "oeMyCujO"), false);
        pdf.pdfreader.viewer.editor.free.fnbridge.b bVar = ea.a.f16524i;
        if (bVar != null) {
            bVar.n();
        }
        pdf.pdfreader.viewer.editor.free.fnbridge.b bVar2 = ea.a.f16525j;
        if (bVar2 != null) {
            bVar2.n();
        }
        ea.a.f16525j = null;
    }
}

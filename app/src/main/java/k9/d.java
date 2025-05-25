package k9;

import android.view.View;
import pdf.pdfreader.viewer.editor.free.ui.act.tools.PDFChooseActivity;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class d implements View.OnFocusChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f19647a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f19648b;

    public /* synthetic */ d(Object obj, int i10) {
        this.f19647a = i10;
        this.f19648b = obj;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z10) {
        int i10 = this.f19647a;
        Object obj = this.f19648b;
        switch (i10) {
            case 0:
                g gVar = (g) obj;
                gVar.t(gVar.u());
                return;
            default:
                PDFChooseActivity pDFChooseActivity = (PDFChooseActivity) obj;
                PDFChooseActivity.a aVar = PDFChooseActivity.f27008u0;
                kotlin.jvm.internal.g.e(pDFChooseActivity, ea.a.p("R2gic1cw", "TlRMs20Y"));
                if (z10) {
                    pDFChooseActivity.f27025q0 = true;
                    return;
                }
                return;
        }
    }
}

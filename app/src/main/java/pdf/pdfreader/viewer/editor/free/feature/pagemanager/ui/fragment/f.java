package pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.fragment;

import am.y0;
import androidx.fragment.app.g0;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.fragment.d;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f25390a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d f25391b;

    public /* synthetic */ f(d dVar, int i10) {
        this.f25390a = i10;
        this.f25391b = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        int i10 = this.f25390a;
        d dVar = this.f25391b;
        switch (i10) {
            case 0:
                g.e(dVar, ea.a.p("R2gic1cw", "laNf8ZUT"));
                d.a aVar = d.f25379j0;
                pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.f t4 = dVar.t();
                if (t4 != null && pdf.pdfreader.viewer.editor.free.utils.extension.a.c(t4)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    d.a aVar2 = d.f25379j0;
                    g0 u7 = dVar.u();
                    ea.a.p("Q2E5ZR10JHITZ1llB3QbYSphVWVy", "S9G4CjPN");
                    aVar2.getClass();
                    d.a.a(u7, dVar);
                    VB vb2 = dVar.Y;
                    g.b(vb2);
                    ((y0) vb2).f1665g.setEnabled(true);
                    VB vb3 = dVar.Y;
                    g.b(vb3);
                    ((y0) vb3).f1666h.setVisibility(8);
                    return;
                }
                return;
            default:
                d.a aVar3 = d.f25379j0;
                g.e(dVar, ea.a.p("O2hYc10w", "2vMRWLgN"));
                dVar.u0();
                return;
        }
    }
}

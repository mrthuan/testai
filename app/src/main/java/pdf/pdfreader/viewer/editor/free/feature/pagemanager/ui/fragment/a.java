package pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.fragment;

import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.fragment.d;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f25373a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d f25374b;

    public /* synthetic */ a(d dVar, int i10) {
        this.f25373a = i10;
        this.f25374b = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f25373a;
        d dVar = this.f25374b;
        switch (i10) {
            case 0:
                d.a aVar = d.f25379j0;
                g.e(dVar, ea.a.p("R2gic1cw", "U0o7x2Ah"));
                dVar.z0();
                return;
            default:
                d.a aVar2 = d.f25379j0;
                g.e(dVar, ea.a.p("R2gic1cw", "4opphbSs"));
                if (dVar.D() && !dVar.A) {
                    dVar.y0();
                    return;
                }
                return;
        }
    }
}

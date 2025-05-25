package ao;

import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderHomeActivity;
import pdf.pdfreader.viewer.editor.free.ui.dialog.manager.home.c;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements cg.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5014a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ jl.a f5015b;

    public /* synthetic */ b(jl.a aVar, int i10) {
        this.f5014a = i10;
        this.f5015b = aVar;
    }

    @Override // cg.a
    public final Object invoke() {
        int i10;
        int i11 = this.f5014a;
        jl.a aVar = this.f5015b;
        switch (i11) {
            case 0:
                ((ReaderPreviewActivity) aVar).O5 = true;
                return null;
            default:
                final ReaderHomeActivity readerHomeActivity = (ReaderHomeActivity) aVar;
                ReaderHomeActivity.u uVar = readerHomeActivity.f26669j1;
                LifecycleCoroutineScopeImpl x4 = b.b.x(readerHomeActivity);
                ReaderHomeActivity.k0 k0Var = new ReaderHomeActivity.k0();
                cg.l lVar = new cg.l() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.p
                    @Override // cg.l
                    public final Object invoke(Object obj) {
                        Boolean bool = (Boolean) obj;
                        pdf.pdfreader.viewer.editor.free.ui.dialog.manager.home.c cVar = ReaderHomeActivity.this.E0;
                        if (cVar != null) {
                            boolean booleanValue = bool.booleanValue();
                            pdf.pdfreader.viewer.editor.free.ui.dialog.manager.home.i iVar = cVar.f27673g;
                            if (!booleanValue) {
                                iVar.f28987b = Boolean.FALSE;
                                androidx.lifecycle.w<po.b> wVar = pdf.pdfreader.viewer.editor.free.ui.dialog.manager.home.c.f27668m;
                                c.a.a(iVar);
                            }
                            iVar.c = booleanValue;
                            return null;
                        }
                        return null;
                    }
                };
                uVar.getClass();
                if (uVar.d().b()) {
                    c5.a b10 = c5.a.b();
                    b10.a();
                    Object obj = b10.c.f5583e.i().first;
                    kotlin.jvm.internal.g.d(obj, "getInstance().upgradeCon….upgradeOpenSetting.first");
                    if (((Boolean) obj).booleanValue() && c5.d.k(readerHomeActivity)) {
                        o9.a aVar2 = uVar.d().f18038d;
                        if (aVar2 == null) {
                            i10 = 0;
                        } else {
                            i10 = aVar2.f22746a;
                        }
                        pdf.pdfreader.viewer.editor.free.utils.t0.d0(x4, null, null, new c5.c(readerHomeActivity, i10, uVar, k0Var, lVar, null), 3);
                        return null;
                    }
                }
                lVar.invoke(Boolean.FALSE);
                return null;
        }
    }
}

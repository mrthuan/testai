package pdf.pdfreader.viewer.editor.free.ui.frag;

import com.google.android.material.tabs.TabLayout;
import pdf.pdfreader.viewer.editor.free.feature.billing.BillingConfigImpl;

/* compiled from: PdfReaderFilesFragment.java */
/* loaded from: classes3.dex */
public final class d implements TabLayout.d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f28031a;

    public d(a aVar) {
        this.f28031a = aVar;
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public final void b(TabLayout.g gVar) {
        boolean z10;
        int i10 = gVar.f12980d;
        ro.c cVar = a.f27997y0;
        a aVar = this.f28031a;
        aVar.L0(i10);
        if (!BillingConfigImpl.c.w()) {
            gl.e.f17918a.getClass();
            if (!gl.f.f17921p.f24009i && !gl.g.f17922p.f24009i) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10 && aVar.i() != null) {
                gl.e.d();
            }
        }
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public final void a() {
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public final void c() {
    }
}

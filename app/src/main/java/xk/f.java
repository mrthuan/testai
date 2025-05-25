package xk;

import android.view.View;
import pdf.pdfreader.viewer.editor.free.utils.l0;
import xk.g;

/* compiled from: SignColorAdapter.java */
/* loaded from: classes3.dex */
public final class f extends l0 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ nl.f f31876b;
    public final /* synthetic */ g c;

    public f(g gVar, nl.f fVar) {
        this.c = gVar;
        this.f31876b = fVar;
    }

    @Override // pdf.pdfreader.viewer.editor.free.utils.l0
    public final void a(View view) {
        nl.f fVar = this.f31876b;
        int i10 = fVar.f22603a;
        g gVar = this.c;
        gVar.f31878e = i10;
        gVar.notifyDataSetChanged();
        g.b bVar = gVar.f31879f;
        if (bVar != null) {
            bVar.a(fVar);
        }
    }
}

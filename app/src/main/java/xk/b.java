package xk;

import android.view.View;
import pdf.pdfreader.viewer.editor.free.utils.l0;
import xk.c;

/* compiled from: GraffitiColorAdapter.java */
/* loaded from: classes3.dex */
public final class b extends l0 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ nl.f f31858b;
    public final /* synthetic */ c.C0410c c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ c f31859d;

    public b(c cVar, nl.f fVar, c.C0410c c0410c) {
        this.f31859d = cVar;
        this.f31858b = fVar;
        this.c = c0410c;
    }

    @Override // pdf.pdfreader.viewer.editor.free.utils.l0
    public final void a(View view) {
        nl.f fVar = this.f31858b;
        int i10 = fVar.f22603a;
        c cVar = this.f31859d;
        cVar.f31861e = i10;
        c.b bVar = cVar.f31862f;
        if (bVar != null) {
            bVar.a(fVar, this.c.getBindingAdapterPosition());
        }
        cVar.notifyDataSetChanged();
    }
}

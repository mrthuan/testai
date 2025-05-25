package vm;

import am.k3;
import androidx.appcompat.widget.AppCompatImageView;
import pdf.pdfreader.viewer.editor.free.feature.pagemanager.data.PageSize;

/* compiled from: PageSizeSelectAdapter.kt */
/* loaded from: classes3.dex */
public final class c extends pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.g<PageSize, k3> {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ k3 f30854d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ d f30855e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(k3 k3Var, d dVar) {
        super(k3Var);
        this.f30854d = k3Var;
        this.f30855e = dVar;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.g
    public final void l(int i10, PageSize pageSize) {
        int i11;
        PageSize pageSize2 = pageSize;
        k3 k3Var = this.f30854d;
        k3Var.c.setText(pageSize2.name());
        String p10 = ea.a.p("LWlfZBBuUC4zdC9tJWEPZWZpFGUMdjZlCWU7dBFk", "1KrceXtw");
        AppCompatImageView appCompatImageView = k3Var.f1049b;
        kotlin.jvm.internal.g.d(appCompatImageView, p10);
        if (kotlin.jvm.internal.g.a(pageSize2.name(), this.f30855e.f30856f.name())) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        appCompatImageView.setVisibility(i11);
    }
}

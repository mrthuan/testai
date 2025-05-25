package vm;

import am.j3;
import androidx.appcompat.widget.AppCompatImageView;
import pdf.pdfreader.viewer.editor.free.feature.pagemanager.data.PageRGBColor;

/* compiled from: PageColorSettingAdapter.kt */
/* loaded from: classes3.dex */
public final class a extends pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.g<PageRGBColor, j3> {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ j3 f30851d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ b f30852e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(j3 j3Var, b bVar) {
        super(j3Var);
        this.f30851d = j3Var;
        this.f30852e = bVar;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.g
    public final void l(int i10, PageRGBColor pageRGBColor) {
        PageRGBColor pageRGBColor2 = pageRGBColor;
        PageRGBColor pageRGBColor3 = PageRGBColor.NONE;
        b bVar = this.f30852e;
        int i11 = 0;
        boolean z10 = false;
        j3 j3Var = this.f30851d;
        if (pageRGBColor2 == pageRGBColor3) {
            j3Var.f1018d.setVisibility(8);
            j3Var.f1019e.setVisibility(8);
            j3Var.c.setVisibility(8);
            AppCompatImageView appCompatImageView = j3Var.f1017b;
            appCompatImageView.setVisibility(0);
            if (bVar.f30853f == pageRGBColor2) {
                z10 = true;
            }
            appCompatImageView.setSelected(z10);
            return;
        }
        j3Var.f1018d.setVisibility(0);
        j3Var.f1019e.setVisibility(0);
        if (bVar.f30853f != pageRGBColor2) {
            i11 = 8;
        }
        j3Var.c.setVisibility(i11);
        j3Var.f1017b.setVisibility(8);
        j3Var.f1018d.setBackgroundResource(pageRGBColor2.getColor());
    }
}

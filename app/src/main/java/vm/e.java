package vm;

import am.l3;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.feature.pagemanager.data.PageSize;

/* compiled from: PageSizeSettingAdapter.kt */
/* loaded from: classes3.dex */
public final class e extends pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.g<PageSize, l3> {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ l3 f30857d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ f f30858e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(l3 l3Var, f fVar) {
        super(l3Var);
        this.f30857d = l3Var;
        this.f30858e = fVar;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.g
    public final void l(int i10, PageSize pageSize) {
        PageSize pageSize2 = pageSize;
        PageSize pageSize3 = PageSize.Custom;
        l3 l3Var = this.f30857d;
        if (pageSize2 == pageSize3) {
            l3Var.f1078b.setText(this.c.getString(R.string.arg_res_0x7f1302ed));
        } else {
            l3Var.f1078b.setText(pageSize2.name());
        }
        l3Var.f1078b.setSelected(kotlin.jvm.internal.g.a(pageSize2.name(), this.f30858e.f30859f.name()));
    }
}

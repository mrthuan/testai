package vm;

import am.k3;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.feature.pagemanager.data.PageSize;

/* compiled from: PageSizeSelectAdapter.kt */
/* loaded from: classes3.dex */
public final class d extends pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.f<PageSize, k3> {

    /* renamed from: f  reason: collision with root package name */
    public PageSize f30856f = PageSize.A4;

    @Override // pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.f
    public final k3 h(LayoutInflater layoutInflater, ViewGroup parent) {
        kotlin.jvm.internal.g.e(parent, "parent");
        View inflate = layoutInflater.inflate(R.layout.list_item_page_size_select, parent, false);
        int i10 = R.id.item_page_size_iv_selected;
        AppCompatImageView appCompatImageView = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.item_page_size_iv_selected);
        if (appCompatImageView != null) {
            i10 = R.id.item_page_size_tv_name;
            TextView textView = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.item_page_size_tv_name);
            if (textView != null) {
                k3 k3Var = new k3((LinearLayout) inflate, appCompatImageView, textView);
                ea.a.p("IW43bAV0VigkYR9vQXQebl5sM3QschogBGEDZT90biAuYT1zASk=", "GuHQd394");
                return k3Var;
            }
        }
        throw new NullPointerException(ea.a.p("AmlCcxBuUCAoZTt1HHINZBV2B2UyIBJpQGhmSQ06IA==", "8r234FI1").concat(inflate.getResources().getResourceName(i10)));
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.f
    public final pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.g<PageSize, k3> i(k3 k3Var) {
        k3 binding = k3Var;
        kotlin.jvm.internal.g.e(binding, "binding");
        return new c(binding, this);
    }
}

package vm;

import am.l3;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.feature.pagemanager.data.PageSize;

/* compiled from: PageSizeSettingAdapter.kt */
/* loaded from: classes3.dex */
public final class f extends pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.f<PageSize, l3> {

    /* renamed from: f  reason: collision with root package name */
    public PageSize f30859f = PageSize.Custom;

    @Override // pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.f
    public final l3 h(LayoutInflater layoutInflater, ViewGroup parent) {
        kotlin.jvm.internal.g.e(parent, "parent");
        View inflate = layoutInflater.inflate(R.layout.list_item_page_size_setting, parent, false);
        if (inflate != null) {
            TextView textView = (TextView) inflate;
            l3 l3Var = new l3(textView, textView);
            ea.a.p("Wm4tbBJ0BygeYU1vHHQfbiJsU3Qjcm8gRWEbZSN0QSBVYSdzFik=", "5iMmWiD0");
            return l3Var;
        }
        throw new NullPointerException(ea.a.p("IG8BdDFpInc=", "qkRngGhv"));
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.f
    public final pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.g<PageSize, l3> i(l3 l3Var) {
        l3 binding = l3Var;
        kotlin.jvm.internal.g.e(binding, "binding");
        return new e(binding, this);
    }
}

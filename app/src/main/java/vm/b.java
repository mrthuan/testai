package vm;

import am.j3;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.utils.widget.ImageFilterView;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.feature.pagemanager.data.PageRGBColor;

/* compiled from: PageColorSettingAdapter.kt */
/* loaded from: classes3.dex */
public final class b extends pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.f<PageRGBColor, j3> {

    /* renamed from: f  reason: collision with root package name */
    public PageRGBColor f30853f = PageRGBColor.NONE;

    @Override // pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.f
    public final j3 h(LayoutInflater layoutInflater, ViewGroup parent) {
        kotlin.jvm.internal.g.e(parent, "parent");
        View inflate = layoutInflater.inflate(R.layout.list_item_page_color_setting, parent, false);
        int i10 = R.id.page_color_iv_none;
        AppCompatImageView appCompatImageView = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.page_color_iv_none);
        if (appCompatImageView != null) {
            i10 = R.id.page_color_iv_selected;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.page_color_iv_selected);
            if (appCompatImageView2 != null) {
                i10 = R.id.page_color_iv_value;
                ImageFilterView imageFilterView = (ImageFilterView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.page_color_iv_value);
                if (imageFilterView != null) {
                    i10 = R.id.page_color_v_bord;
                    View u7 = com.google.android.play.core.assetpacks.c.u(inflate, R.id.page_color_v_bord);
                    if (u7 != null) {
                        j3 j3Var = new j3((FrameLayout) inflate, appCompatImageView, appCompatImageView2, imageFilterView, u7);
                        ea.a.p("Wm4tbBJ0BygeYU1vHHQfbiJsU3Qjcm8gSWErZSh0HCBVYSdzFik=", "9YF0jGvT");
                        return j3Var;
                    }
                }
            }
        }
        throw new NullPointerException(ea.a.p("AmlCcxBuUCAoZTt1HHINZBV2B2UyIBJpBGhPSSs6IA==", "2sh6pooG").concat(inflate.getResources().getResourceName(i10)));
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.f
    public final pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.g<PageRGBColor, j3> i(j3 j3Var) {
        j3 binding = j3Var;
        kotlin.jvm.internal.g.e(binding, "binding");
        return new a(binding, this);
    }
}

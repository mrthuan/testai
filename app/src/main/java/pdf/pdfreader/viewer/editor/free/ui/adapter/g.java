package pdf.pdfreader.viewer.editor.free.ui.adapter;

import am.i3;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.feature.pdf2word.widget.PDF2WordSoDownLoadStateView;

/* compiled from: HomeToolsAdapter.kt */
/* loaded from: classes3.dex */
public final class g extends pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.f<no.a, i3> {

    /* renamed from: f  reason: collision with root package name */
    public int f27248f;

    public g(androidx.appcompat.app.c cVar) {
        kotlin.jvm.internal.g.e(cVar, ea.a.p("LmNFaQ9pQ3k=", "GwIdBztg"));
        this.f27248f = 3;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.f
    public final i3 h(LayoutInflater layoutInflater, ViewGroup parent) {
        kotlin.jvm.internal.g.e(parent, "parent");
        View inflate = layoutInflater.inflate(R.layout.list_item_home_tools, parent, false);
        int i10 = R.id.fl_tools_download_state;
        PDF2WordSoDownLoadStateView pDF2WordSoDownLoadStateView = (PDF2WordSoDownLoadStateView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.fl_tools_download_state);
        if (pDF2WordSoDownLoadStateView != null) {
            i10 = R.id.iv_mark_arrow;
            ImageView imageView = (ImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.iv_mark_arrow);
            if (imageView != null) {
                i10 = R.id.iv_tools_item_icon;
                AppCompatImageView appCompatImageView = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.iv_tools_item_icon);
                if (appCompatImageView != null) {
                    i10 = R.id.tv_mark_new;
                    TextView textView = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_mark_new);
                    if (textView != null) {
                        i10 = R.id.tv_tools_item_name;
                        TextView textView2 = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_tools_item_name);
                        if (textView2 != null) {
                            i10 = R.id.v_mark_view;
                            View u7 = com.google.android.play.core.assetpacks.c.u(inflate, R.id.v_mark_view);
                            if (u7 != null) {
                                i3 i3Var = new i3((ConstraintLayout) inflate, pDF2WordSoDownLoadStateView, imageView, appCompatImageView, textView, textView2, u7);
                                ea.a.p("Wm4tbBJ0BygeYU1vHHQfbiJsU3Qjcm8gI2EdZTp0SSBVYSdzFik=", "SoTeaSkb");
                                return i3Var;
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException(ea.a.p("fmk4cxpuBSAAZUV1AHIzZGR2W2UxIDRpPmgVSQU6IA==", "J5AjQxnH").concat(inflate.getResources().getResourceName(i10)));
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.f
    public final pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.g<no.a, i3> i(i3 i3Var) {
        i3 binding = i3Var;
        kotlin.jvm.internal.g.e(binding, "binding");
        return new f(binding, this);
    }
}

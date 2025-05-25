package pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter;

import am.h3;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.collections.m;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.feature.ai.data.AIQuickTag;

/* compiled from: AITagsAdapter.kt */
/* loaded from: classes3.dex */
public final class e extends f<AIQuickTag, h3> {

    /* renamed from: f  reason: collision with root package name */
    public Integer f24700f;

    /* renamed from: g  reason: collision with root package name */
    public Integer f24701g;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i10) {
        String tag;
        AIQuickTag aIQuickTag = (AIQuickTag) m.t0(i10, this.f24702d);
        if (aIQuickTag != null && (tag = aIQuickTag.getTag()) != null) {
            return tag.hashCode();
        }
        return 0;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.f
    public final h3 h(LayoutInflater layoutInflater, ViewGroup parent) {
        kotlin.jvm.internal.g.e(parent, "parent");
        View inflate = layoutInflater.inflate(R.layout.list_item_ai_quick_entrance_tag, parent, false);
        int i10 = R.id.item_ai_tag_iv_icon;
        AppCompatImageView appCompatImageView = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.item_ai_tag_iv_icon);
        if (appCompatImageView != null) {
            LinearLayout linearLayout = (LinearLayout) inflate;
            AppCompatTextView appCompatTextView = (AppCompatTextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.item_ai_tag_tv_tag);
            if (appCompatTextView != null) {
                h3 h3Var = new h3(linearLayout, appCompatImageView, linearLayout, appCompatTextView);
                ea.a.p("Wm4tbBJ0BygeYU1vHHQfbiJsU3Qjcm8gGmFCZQN0YSBVYSdzFik=", "j0mMbIfX");
                return h3Var;
            }
            i10 = R.id.item_ai_tag_tv_tag;
        }
        throw new NullPointerException(ea.a.p("fmk4cxpuBSAAZUV1AHIzZGR2W2UxIDRpAmhFSQg6IA==", "veLztO0U").concat(inflate.getResources().getResourceName(i10)));
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.f
    public final g<AIQuickTag, h3> i(h3 h3Var) {
        h3 binding = h3Var;
        kotlin.jvm.internal.g.e(binding, "binding");
        return new d(binding, this.f24700f, this.f24701g);
    }
}

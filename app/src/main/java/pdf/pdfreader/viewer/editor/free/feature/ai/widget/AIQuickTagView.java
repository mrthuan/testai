package pdf.pdfreader.viewer.editor.free.feature.ai.widget;

import am.g2;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cg.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.m;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.feature.ai.data.AIQuickTag;

/* compiled from: AIQuickTagView.kt */
/* loaded from: classes3.dex */
public final class AIQuickTagView extends BaseBindingFrameLayout<g2> {

    /* renamed from: g  reason: collision with root package name */
    public static final /* synthetic */ int f24742g = 0;

    /* renamed from: b  reason: collision with root package name */
    public pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.e f24743b;
    public cg.l<? super Integer, tf.d> c;

    /* renamed from: d  reason: collision with root package name */
    public p<? super Integer, ? super List<AIQuickTag>, tf.d> f24744d;

    /* renamed from: e  reason: collision with root package name */
    public int f24745e;

    /* renamed from: f  reason: collision with root package name */
    public ArrayList f24746f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AIQuickTagView(Context context) {
        super(context);
        kotlin.jvm.internal.g.e(context, ea.a.p("LG9fdBx4dA==", "LPItIxef"));
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.ai.widget.BaseBindingFrameLayout
    public final g2 a(LayoutInflater from) {
        kotlin.jvm.internal.g.e(from, "from");
        from.inflate(R.layout.layout_ai_quick_entrance_tag, this);
        int i10 = R.id.ai_tag_iv_reload;
        AppCompatImageView appCompatImageView = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(this, R.id.ai_tag_iv_reload);
        if (appCompatImageView != null) {
            i10 = R.id.ai_tag_rv_tags;
            RecyclerView recyclerView = (RecyclerView) com.google.android.play.core.assetpacks.c.u(this, R.id.ai_tag_rv_tags);
            if (recyclerView != null) {
                i10 = R.id.ai_tag_tv_title;
                TextView textView = (TextView) com.google.android.play.core.assetpacks.c.u(this, R.id.ai_tag_tv_title);
                if (textView != null) {
                    g2 g2Var = new g2(this, appCompatImageView, recyclerView, textView);
                    ea.a.p("D24xbC10PygucgltGCAjaFFzKQ==", "dUfWLZY7");
                    return g2Var;
                }
            }
        }
        throw new NullPointerException(ea.a.p("fmk4cxpuBSAAZUV1AHIzZGR2W2UxIDRpNmgXSQU6IA==", "B7A79Six").concat(getResources().getResourceName(i10)));
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.ai.widget.BaseBindingFrameLayout
    public final void b(Context context) {
        kotlin.jvm.internal.g.e(context, "context");
        this.f24743b = new pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.e();
        g2 g2Var = (g2) this.f24761a;
        if (g2Var != null) {
            GridLayoutManager gridLayoutManager = new GridLayoutManager(2);
            RecyclerView recyclerView = g2Var.c;
            recyclerView.setLayoutManager(gridLayoutManager);
            recyclerView.setAdapter(this.f24743b);
            g2Var.f934b.setOnClickListener(new u4.j(this, 3));
        }
    }

    public final void c(int i10, ArrayList arrayList, String str) {
        TextView textView;
        this.f24745e = i10;
        this.f24746f = m.n0(arrayList);
        AppCompatImageView appCompatImageView = null;
        if (str != null) {
            g2 g2Var = (g2) this.f24761a;
            if (g2Var != null) {
                textView = g2Var.f935d;
            } else {
                textView = null;
            }
            if (textView != null) {
                textView.setText(str);
            }
        }
        ArrayList arrayList2 = this.f24746f;
        if (arrayList2 != null) {
            if (arrayList2.size() > 1) {
                g2 g2Var2 = (g2) this.f24761a;
                if (g2Var2 != null) {
                    appCompatImageView = g2Var2.f934b;
                }
                if (appCompatImageView != null) {
                    appCompatImageView.setVisibility(0);
                }
            } else {
                g2 g2Var3 = (g2) this.f24761a;
                if (g2Var3 != null) {
                    appCompatImageView = g2Var3.f934b;
                }
                if (appCompatImageView != null) {
                    appCompatImageView.setVisibility(8);
                }
            }
        }
        d();
    }

    public final void d() {
        List list;
        ArrayList arrayList = this.f24746f;
        if (arrayList == null || (list = (List) m.t0(this.f24745e % arrayList.size(), arrayList)) == null) {
            return;
        }
        pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.e eVar = this.f24743b;
        if (eVar != null) {
            eVar.j(list);
        }
        p<? super Integer, ? super List<AIQuickTag>, tf.d> pVar = this.f24744d;
        if (pVar != null) {
            pVar.invoke(Integer.valueOf(this.f24745e % arrayList.size()), list);
        }
        cg.l<? super Integer, tf.d> lVar = this.c;
        if (lVar != null) {
            lVar.invoke(Integer.valueOf(this.f24745e % arrayList.size()));
        }
        this.f24745e++;
    }

    public final cg.l<Integer, tf.d> getCurrentPageListener() {
        return this.c;
    }

    public final p<Integer, List<AIQuickTag>, tf.d> getShowDataCallback() {
        return this.f24744d;
    }

    public final void setCurrentPageListener(cg.l<? super Integer, tf.d> lVar) {
        this.c = lVar;
    }

    public final void setItemBgDrawable(int i10) {
        pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.e eVar = this.f24743b;
        if (eVar != null) {
            eVar.f24700f = Integer.valueOf(i10);
        }
    }

    public final void setItemTextColor(int i10) {
        pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.e eVar = this.f24743b;
        if (eVar != null) {
            eVar.f24701g = Integer.valueOf(i10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setOnItemClickListener(p<? super Integer, ? super AIQuickTag, tf.d> itemClickListener) {
        kotlin.jvm.internal.g.e(itemClickListener, "itemClickListener");
        pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.e eVar = this.f24743b;
        if (eVar != null) {
            eVar.f24703e = itemClickListener;
        }
    }

    public final void setShowDataCallback(p<? super Integer, ? super List<AIQuickTag>, tf.d> pVar) {
        this.f24744d = pVar;
    }

    public final void setTitleTextColor(int i10) {
        TextView textView;
        g2 g2Var = (g2) this.f24761a;
        if (g2Var != null && (textView = g2Var.f935d) != null) {
            textView.setTextColor(i10);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AIQuickTagView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.g.e(context, ea.a.p("LG9fdBx4dA==", "gmvrJrTf"));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AIQuickTagView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        kotlin.jvm.internal.g.e(context, ea.a.p("UG8ldBZ4dA==", "WC01CK5F"));
    }
}

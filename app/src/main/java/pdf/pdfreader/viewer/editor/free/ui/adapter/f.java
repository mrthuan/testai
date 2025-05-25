package pdf.pdfreader.viewer.editor.free.ui.adapter;

import am.i3;
import android.content.Context;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.NoWhenBranchMatchedException;
import no.b;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.feature.pdf2word.widget.PDF2WordSoDownLoadStateView;
import pdf.pdfreader.viewer.editor.free.ui.data.HomeToolsType;
import pdf.pdfreader.viewer.editor.free.utils.q0;

/* compiled from: HomeToolsAdapter.kt */
/* loaded from: classes3.dex */
public final class f extends pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.g<no.a, i3> {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ i3 f27246d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ g f27247e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i3 i3Var, g gVar) {
        super(i3Var);
        this.f27246d = i3Var;
        this.f27247e = gVar;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.g
    public final void l(int i10, no.a aVar) {
        boolean E;
        no.a aVar2 = aVar;
        int i11 = this.f27247e.f27248f;
        Context context = this.c;
        int i12 = 4;
        i3 i3Var = this.f27246d;
        if (i11 == 4) {
            if (i10 > 3) {
                ConstraintLayout constraintLayout = i3Var.f989a;
                kotlin.jvm.internal.g.d(constraintLayout, ea.a.p("C2kpZDtuEy46bwl0", "AZiGRtkq"));
                ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
                if (layoutParams != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.bottomMargin = 0;
                    constraintLayout.setLayoutParams(marginLayoutParams);
                } else {
                    throw new NullPointerException(ea.a.p("XXUnbFNjA24cb0AgC2V2YyVzRiAyb2NuVm4fbkdsPiBHeTtlU2EMZABvXWRHdj9lMy5kaSN3BHJWdUIuf2EgZ1puB2EKbxd0ImFGYQRz", "922RBWGS"));
                }
            } else {
                ConstraintLayout constraintLayout2 = i3Var.f989a;
                kotlin.jvm.internal.g.d(constraintLayout2, ea.a.p("L2k8ZBpuPi46bwl0", "oHMRsYYB"));
                ViewGroup.LayoutParams layoutParams2 = constraintLayout2.getLayoutParams();
                if (layoutParams2 != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                    marginLayoutParams2.bottomMargin = context.getResources().getDimensionPixelSize(R.dimen.dp_12);
                    constraintLayout2.setLayoutParams(marginLayoutParams2);
                } else {
                    throw new NullPointerException(ea.a.p("XXUnbFNjA24cb0AgC2V2YyVzRiAyb2NuDm57bkNsWyBHeTtlU2EMZABvXWRHdj9lMy5kaSN3BHIOdSYue2FFZ1puB2EKbxd0ImFGYQRz", "aV67LV69"));
                }
            }
        }
        i3Var.f993f.setText(aVar2.f22610b);
        i3Var.f991d.setImageResource(aVar2.f22609a);
        kotlin.jvm.internal.g.e(context, "context");
        HomeToolsType homeToolsType = aVar2.c;
        kotlin.jvm.internal.g.e(homeToolsType, "homeToolsType");
        switch (b.a.f22611a[homeToolsType.ordinal()]) {
            case 1:
                E = q0.E(context);
                break;
            case 2:
                E = false;
                break;
            case 3:
                jn.a.c.getClass();
                E = jn.a.m();
                break;
            case 4:
                E = q0.r(context);
                break;
            case 5:
                E = q0.G(context);
                break;
            case 6:
                E = q0.F(context);
                break;
            case 7:
                E = q0.F(context);
                break;
            case 8:
                wm.a.c.getClass();
                E = wm.a.h(context);
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        if (E) {
            i12 = 0;
        }
        i3Var.f992e.setVisibility(i12);
        i3Var.c.setVisibility(i12);
        HomeToolsType homeToolsType2 = HomeToolsType.pdf2word;
        PDF2WordSoDownLoadStateView pDF2WordSoDownLoadStateView = i3Var.f990b;
        if (homeToolsType == homeToolsType2) {
            pDF2WordSoDownLoadStateView.c();
        } else {
            pDF2WordSoDownLoadStateView.setVisibility(8);
        }
    }
}

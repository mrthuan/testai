package pdf.pdfreader.viewer.editor.free.feature.ai.widget;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import pdf.pdfreader.viewer.editor.free.ui.dialog.PreviewAddTextDialog;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements View.OnLayoutChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f24769a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f24770b;

    public /* synthetic */ c(Object obj, int i10) {
        this.f24769a = i10;
        this.f24770b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        int i18;
        int i19;
        int i20 = this.f24769a;
        Object obj = this.f24770b;
        switch (i20) {
            case 0:
                AIAnswerView.c((AIAnswerView) obj, i11, i13, i15, i17);
                return;
            case 1:
                om.c cVar = (om.c) obj;
                int i21 = om.c.f23503f;
                kotlin.jvm.internal.g.e(cVar, ea.a.p("R2gic1cw", "axBmAmhE"));
                int measuredHeight = view.getMeasuredHeight();
                Object tag = view.getTag();
                if (!(tag instanceof Integer) || measuredHeight != ((Number) tag).intValue()) {
                    view.setTag(Integer.valueOf(view.getMeasuredHeight()));
                    ((TextView) cVar.f23504b.f1650h).getPaint().setShader(new LinearGradient(0.0f, 0.0f, 0.0f, view.getMeasuredHeight(), new int[]{-207707, -11385}, (float[]) null, Shader.TileMode.CLAMP));
                    return;
                }
                return;
            case 2:
                PreviewAddTextDialog previewAddTextDialog = (PreviewAddTextDialog) obj;
                int i22 = PreviewAddTextDialog.f27451o;
                kotlin.jvm.internal.g.e(previewAddTextDialog, ea.a.p("MGg_c28w", "TpDVKJ8q"));
                int visibility = previewAddTextDialog.p().f970b.getVisibility();
                if (view.getPaddingBottom() <= previewAddTextDialog.getContext().getResources().getDisplayMetrics().heightPixels / 4 && previewAddTextDialog.f27456h == 1) {
                    i19 = 0;
                } else {
                    i19 = 8;
                }
                if (visibility != i19 || view.getPaddingStart() != 0 || view.getPaddingEnd() != 0) {
                    previewAddTextDialog.p().f970b.setVisibility(i19);
                    view.setPadding(0, view.getPaddingTop(), 0, view.getPaddingBottom());
                    previewAddTextDialog.r(null);
                    return;
                }
                return;
            default:
                oo.g gVar = (oo.g) obj;
                int i23 = oo.g.f23537x;
                kotlin.jvm.internal.g.e(gVar, ea.a.p("R2gic1cw", "57NNX9vC"));
                BottomSheetBehavior<FrameLayout> s4 = gVar.s();
                if (s4.f12125f) {
                    i18 = -1;
                } else {
                    i18 = s4.f12123e;
                }
                if (i18 != view.getMeasuredHeight()) {
                    gVar.s().D(view.getMeasuredHeight());
                    gVar.s().J = true;
                    gVar.s().E(3);
                    gVar.s().C(gVar.D());
                    return;
                }
                return;
        }
    }
}

package pdf.pdfreader.viewer.editor.free.feature.billing.ui;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import androidx.constraintlayout.widget.ConstraintLayout;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements View.OnLayoutChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f24923a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ jl.a f24924b;

    public /* synthetic */ b(jl.a aVar, int i10) {
        this.f24923a = i10;
        this.f24924b = aVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        float f10;
        int i18 = this.f24923a;
        jl.a aVar = this.f24924b;
        switch (i18) {
            case 0:
                SubscriptionAIActivity subscriptionAIActivity = (SubscriptionAIActivity) aVar;
                int i19 = SubscriptionAIActivity.X;
                kotlin.jvm.internal.g.e(subscriptionAIActivity, ea.a.p("O2hYc10w", "MRDt1KbN"));
                if (view.getMeasuredHeight() > 10) {
                    Space space = subscriptionAIActivity.M2().f1558f;
                    kotlin.jvm.internal.g.d(space, ea.a.p("UWklZBpuBS4CZUZjDG4iUzRhUWUy", "dntv50Uf"));
                    ViewGroup.LayoutParams layoutParams = space.getLayoutParams();
                    if (layoutParams != null) {
                        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
                        ((ViewGroup.MarginLayoutParams) bVar).height = view.getMeasuredHeight() + subscriptionAIActivity.M2().f1558f.getMeasuredHeight();
                        space.setLayoutParams(bVar);
                        return;
                    }
                    throw new NullPointerException(ea.a.p("C3UobHVjL24mbxIgVmV3Y1lzJiA9bxZuG25cbiRsLiAReTRldWEgZDpvD2RMLjRvVnMmcihpWHQYYQhvJHRsdwxkI2UhLg1vJnMSclVpOXR0YStvPHQYTBV5HnUlUCNyBG1z", "qBeDUNwK"));
                }
                return;
            case 1:
                SubscriptionBlackFridayActivity subscriptionBlackFridayActivity = (SubscriptionBlackFridayActivity) aVar;
                int i20 = SubscriptionBlackFridayActivity.f24898a0;
                kotlin.jvm.internal.g.e(subscriptionBlackFridayActivity, ea.a.p("O2hYc10w", "KonERkcE"));
                if (view.getMeasuredHeight() != subscriptionBlackFridayActivity.U) {
                    subscriptionBlackFridayActivity.U = view.getMeasuredHeight();
                    subscriptionBlackFridayActivity.C2().f1494i.getPaint().setShader(new LinearGradient(0.0f, 0.0f, 0.0f, view.getMeasuredHeight(), new int[]{-207707, -11385}, (float[]) null, Shader.TileMode.CLAMP));
                    return;
                }
                return;
            case 2:
                SubscriptionDarkTestFActivity subscriptionDarkTestFActivity = (SubscriptionDarkTestFActivity) aVar;
                int i21 = SubscriptionDarkTestFActivity.f24900a0;
                kotlin.jvm.internal.g.e(subscriptionDarkTestFActivity, ea.a.p("R2gic1cw", "HpfqovaN"));
                if (view.getMeasuredWidth() != subscriptionDarkTestFActivity.V) {
                    subscriptionDarkTestFActivity.V = view.getMeasuredWidth();
                    float measureText = subscriptionDarkTestFActivity.C2().f1522m.getPaint().measureText(subscriptionDarkTestFActivity.C2().f1522m.getText().toString());
                    Context context = view.getContext();
                    kotlin.jvm.internal.g.d(context, ea.a.p("OS5Sbxd0Unh0", "GVUixzve"));
                    if (pdf.pdfreader.viewer.editor.free.utils.extension.c.j(context)) {
                        f10 = view.getMeasuredWidth();
                    } else {
                        f10 = 0.0f;
                    }
                    Context context2 = view.getContext();
                    kotlin.jvm.internal.g.d(context2, ea.a.p("RS4obx10B3h0", "IRWa04Qu"));
                    if (pdf.pdfreader.viewer.editor.free.utils.extension.c.j(context2)) {
                        measureText = view.getMeasuredWidth() - measureText;
                    }
                    subscriptionDarkTestFActivity.C2().f1522m.getPaint().setShader(new LinearGradient(f10, 0.0f, measureText, 0.0f, new int[]{-9583, -21943, -705579}, (float[]) null, Shader.TileMode.CLAMP));
                    return;
                }
                return;
            default:
                ReaderPreviewActivity readerPreviewActivity = (ReaderPreviewActivity) aVar;
                readerPreviewActivity.B3.post(new ao.m(readerPreviewActivity, 2));
                return;
        }
    }
}

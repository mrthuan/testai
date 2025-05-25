package pdf.pdfreader.viewer.editor.free.feature.ai.widget;

import am.c1;
import am.e1;
import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.feature.billing.ui.SubscriptionRetainFragment;
import pdf.pdfreader.viewer.editor.free.feature.guide.ui.fragment.d;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements View.OnLayoutChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f24767a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f24768b;

    public /* synthetic */ b(Object obj, int i10) {
        this.f24767a = i10;
        this.f24768b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        float f10;
        int i18 = this.f24767a;
        Object obj = this.f24768b;
        switch (i18) {
            case 0:
                AIAnswerView.c((AIAnswerView) obj, i11, i13, i15, i17);
                return;
            case 1:
                SubscriptionRetainFragment subscriptionRetainFragment = (SubscriptionRetainFragment) obj;
                String str = SubscriptionRetainFragment.f24912f0;
                kotlin.jvm.internal.g.e(subscriptionRetainFragment, ea.a.p("NWgmc1Uw", "POAOqoMy"));
                int measuredWidth = view.getMeasuredWidth();
                Object tag = view.getTag();
                if (!(tag instanceof Integer) || measuredWidth != ((Number) tag).intValue()) {
                    view.setTag(Integer.valueOf(view.getMeasuredWidth()));
                    VB vb2 = subscriptionRetainFragment.Y;
                    kotlin.jvm.internal.g.b(vb2);
                    TextPaint paint = ((c1) vb2).f792i.getPaint();
                    VB vb3 = subscriptionRetainFragment.Y;
                    kotlin.jvm.internal.g.b(vb3);
                    float measureText = paint.measureText(((c1) vb3).f792i.getText().toString());
                    Context context = view.getContext();
                    kotlin.jvm.internal.g.d(context, ea.a.p("RS4obx10B3h0", "MZlEh5MO"));
                    if (pdf.pdfreader.viewer.editor.free.utils.extension.c.j(context)) {
                        f10 = view.getMeasuredWidth();
                    } else {
                        f10 = 0.0f;
                    }
                    Context context2 = view.getContext();
                    kotlin.jvm.internal.g.d(context2, ea.a.p("RS4obx10B3h0", "fukwaBvG"));
                    if (pdf.pdfreader.viewer.editor.free.utils.extension.c.j(context2)) {
                        measureText = view.getMeasuredWidth() - measureText;
                    }
                    VB vb4 = subscriptionRetainFragment.Y;
                    kotlin.jvm.internal.g.b(vb4);
                    ((c1) vb4).f792i.getPaint().setShader(new LinearGradient(f10, 0.0f, measureText, 0.0f, new int[]{-9583, -21943, -705579}, (float[]) null, Shader.TileMode.CLAMP));
                    return;
                }
                return;
            default:
                pdf.pdfreader.viewer.editor.free.feature.guide.ui.fragment.d dVar = (pdf.pdfreader.viewer.editor.free.feature.guide.ui.fragment.d) obj;
                d.a aVar = pdf.pdfreader.viewer.editor.free.feature.guide.ui.fragment.d.f25027j0;
                kotlin.jvm.internal.g.e(dVar, ea.a.p("O2hYc10w", "KvChohZL"));
                if (view != null && dVar.Z && view.getMeasuredWidth() > 0 && view.getMeasuredHeight() > 0 && view.getMeasuredHeight() / view.getMeasuredWidth() < 1.5555556f) {
                    VB vb5 = dVar.Y;
                    kotlin.jvm.internal.g.b(vb5);
                    String p10 = ea.a.p("UWklZBpuBS4Rb1p0AG4jZRB2", "f8vRe456");
                    AppCompatTextView appCompatTextView = ((e1) vb5).f854b;
                    kotlin.jvm.internal.g.d(appCompatTextView, p10);
                    ViewGroup.LayoutParams layoutParams = appCompatTextView.getLayoutParams();
                    if (layoutParams != null) {
                        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
                        VB vb6 = dVar.Y;
                        kotlin.jvm.internal.g.b(vb6);
                        ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = ((e1) vb6).f854b.getResources().getDimensionPixelSize(R.dimen.dp_21);
                        appCompatTextView.setLayoutParams(bVar);
                        return;
                    }
                    throw new NullPointerException(ea.a.p("XXUnbFNjA24cb0AgC2V2YyVzRiAyb2NuCm5MbjNsXSBHeTtlU2EMZABvXWQRLjVvKnNGcidpLXQJYRhvM3Qfd1pkLGUHLiFvHHNAcghpOHQIYUtvM3RtTAR5DnUyUFByUm1z", "eaF1NlUq"));
                }
                return;
        }
    }
}

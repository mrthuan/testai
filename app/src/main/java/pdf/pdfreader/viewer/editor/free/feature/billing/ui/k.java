package pdf.pdfreader.viewer.editor.free.feature.billing.ui;

import am.x1;
import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.text.TextPaint;
import android.view.View;
import android.widget.TextView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class k implements View.OnLayoutChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f24937a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f24938b;

    public /* synthetic */ k(Object obj, int i10) {
        this.f24937a = i10;
        this.f24938b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        float f10;
        int i18 = this.f24937a;
        Object obj = this.f24938b;
        switch (i18) {
            case 0:
                SubscriptionDarkTestFActivity subscriptionDarkTestFActivity = (SubscriptionDarkTestFActivity) obj;
                int i19 = SubscriptionDarkTestFActivity.f24900a0;
                kotlin.jvm.internal.g.e(subscriptionDarkTestFActivity, ea.a.p("EWgzc2gw", "woeZLmY9"));
                if (view.getMeasuredHeight() != subscriptionDarkTestFActivity.U) {
                    subscriptionDarkTestFActivity.U = view.getMeasuredHeight();
                    subscriptionDarkTestFActivity.C2().f1521l.getPaint().setShader(new LinearGradient(0.0f, 0.0f, 0.0f, view.getMeasuredHeight(), new int[]{-207707, -11385}, (float[]) null, Shader.TileMode.CLAMP));
                    return;
                }
                return;
            default:
                om.c cVar = (om.c) obj;
                int i20 = om.c.f23503f;
                kotlin.jvm.internal.g.e(cVar, ea.a.p("R2gic1cw", "WBX5oYyV"));
                int measuredWidth = view.getMeasuredWidth();
                Object tag = view.getTag();
                if (!(tag instanceof Integer) || measuredWidth != ((Number) tag).intValue()) {
                    view.setTag(Integer.valueOf(view.getMeasuredWidth()));
                    x1 x1Var = cVar.f23504b;
                    TextPaint paint = ((TextView) x1Var.f1651i).getPaint();
                    TextView textView = (TextView) x1Var.f1651i;
                    float measureText = paint.measureText(textView.getText().toString());
                    Context context = view.getContext();
                    kotlin.jvm.internal.g.d(context, ea.a.p("OS5Sbxd0Unh0", "lRhMMoKP"));
                    if (pdf.pdfreader.viewer.editor.free.utils.extension.c.j(context)) {
                        f10 = view.getMeasuredWidth();
                    } else {
                        f10 = 0.0f;
                    }
                    Context context2 = view.getContext();
                    kotlin.jvm.internal.g.d(context2, ea.a.p("MC4qb1Z0XXh0", "7LFI88Zc"));
                    if (pdf.pdfreader.viewer.editor.free.utils.extension.c.j(context2)) {
                        measureText = view.getMeasuredWidth() - measureText;
                    }
                    textView.getPaint().setShader(new LinearGradient(f10, 0.0f, measureText, 0.0f, new int[]{-9583, -21943, -705579}, (float[]) null, Shader.TileMode.CLAMP));
                    return;
                }
                return;
        }
    }
}

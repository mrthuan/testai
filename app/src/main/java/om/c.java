package om;

import am.x1;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.feature.billing.ui.k;
import pdf.pdfreader.viewer.editor.free.feature.billing.ui.widget.BillingIntroduceDetailView;

/* compiled from: SubscriptionJBasicViewHolder.kt */
/* loaded from: classes3.dex */
public final class c extends RecyclerView.b0 implements a {

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ int f23503f = 0;

    /* renamed from: b  reason: collision with root package name */
    public final x1 f23504b;
    public final boolean c;

    /* renamed from: d  reason: collision with root package name */
    public final pdf.pdfreader.viewer.editor.free.feature.ai.widget.c f23505d;

    /* renamed from: e  reason: collision with root package name */
    public final k f23506e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(x1 x1Var, boolean z10) {
        super((ConstraintLayout) x1Var.c);
        ea.a.p("OGkrZBpuZw==", "lKZEsRBq");
        this.f23504b = x1Var;
        this.c = z10;
        this.f23505d = new pdf.pdfreader.viewer.editor.free.feature.ai.widget.c(this, 1);
        this.f23506e = new k(this, 1);
    }

    @Override // om.a
    public final void b() {
        x1 x1Var = this.f23504b;
        ((TextView) x1Var.f1650h).removeOnLayoutChangeListener(this.f23505d);
        ((TextView) x1Var.f1651i).removeOnLayoutChangeListener(this.f23506e);
    }

    @Override // om.a
    public final void d() {
        int i10;
        x1 x1Var = this.f23504b;
        ((TextView) x1Var.f1650h).addOnLayoutChangeListener(this.f23505d);
        ((TextView) x1Var.f1651i).addOnLayoutChangeListener(this.f23506e);
        View view = x1Var.f1648f;
        Space space = (Space) view;
        g.d(space, ea.a.p("VmkjZB5uHi48bxZTRGE0ZQ==", "IP4MwyYq"));
        ViewGroup.LayoutParams layoutParams = space.getLayoutParams();
        if (layoutParams != null) {
            ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
            Context context = ((Space) view).getContext();
            g.d(context, ea.a.p("LWlfZBBuUC4ubzpTBWELZRtjAW4xZR10", "kYxuCRxe"));
            ((ViewGroup.MarginLayoutParams) bVar).height = aj.b.B(context);
            space.setLayoutParams(bVar);
            View findViewById = ((BillingIntroduceDetailView) x1Var.f1649g).findViewById(R.id.aiGroup);
            if (findViewById != null) {
                if (this.c) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                findViewById.setVisibility(i10);
                return;
            }
            return;
        }
        throw new NullPointerException(ea.a.p("XXUnbFNjA24cb0AgC2V2YyVzRiAyb2NuBW5ebiFsWSBHeTtlU2EMZABvXWQRLjVvKnNGcidpLXQGYQpvIXQbd1pkLGUHLiFvHHNAcghpOHQIYUtvM3RtTAt5HHUgUFRyUm1z", "jsT5pUlt"));
    }

    @Override // om.a
    public final void g(int i10) {
    }
}

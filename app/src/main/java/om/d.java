package om;

import am.n1;
import android.content.Context;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: SubscriptionJFunctionViewHolder.kt */
/* loaded from: classes3.dex */
public final class d extends RecyclerView.b0 implements a {

    /* renamed from: b  reason: collision with root package name */
    public final n1 f23507b;
    public final boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(n1 n1Var, boolean z10) {
        super(n1Var.c());
        ea.a.p("UWklZBpuZw==", "6KOY5BuX");
        this.f23507b = n1Var;
        this.c = z10;
    }

    @Override // om.a
    public final void g(int i10) {
        int i11;
        Context context = this.itemView.getContext();
        if (this.c) {
            i11 = 4;
        } else {
            i11 = 3;
        }
        int i12 = i10 % i11;
        n1 n1Var = this.f23507b;
        if (i12 != 0) {
            if (i12 == 1) {
                n1Var.f1167b.setImageResource(R.drawable.ic_subscription_j_sign);
                ((AppCompatTextView) n1Var.f1170f).setText(context.getResources().getString(R.string.arg_res_0x7f13047a));
                return;
            }
            return;
        }
        n1Var.f1167b.setImageResource(R.drawable.ic_subscription_j_edit);
        ((AppCompatTextView) n1Var.f1170f).setText(context.getResources().getString(R.string.arg_res_0x7f130111));
    }

    @Override // om.a
    public final void b() {
    }

    @Override // om.a
    public final void d() {
    }
}

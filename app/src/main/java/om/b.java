package om;

import am.w1;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import kl.h;
import kotlin.jvm.internal.g;
import kotlin.text.k;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: SubscriptionJAIViewHolder.kt */
/* loaded from: classes3.dex */
public final class b extends RecyclerView.b0 implements a {

    /* renamed from: b  reason: collision with root package name */
    public final w1 f23502b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(w1 w1Var) {
        super(w1Var.f1600a);
        ea.a.p("LWlfZBBuZw==", "fVOoDbMV");
        this.f23502b = w1Var;
    }

    @Override // om.a
    public final void d() {
        int i10;
        ViewGroup viewGroup = (ViewGroup) this.f23502b.f1600a.findViewById(R.id.subscriptionPrivilegesCl);
        if (viewGroup != null) {
            boolean a10 = g.a(viewGroup.getTag(), ea.a.p("Sm0tbGw=", "RJ9Lbbj1"));
            int childCount = viewGroup.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = viewGroup.getChildAt(i11);
                g.d(childAt, ea.a.p("KGVFQxFpW2QbdGJpG2QNeCk=", "MhZuDl8B"));
                if (childAt instanceof AppCompatTextView) {
                    AppCompatTextView appCompatTextView = (AppCompatTextView) childAt;
                    if (a10) {
                        i10 = R.dimen.sp_12;
                    } else {
                        i10 = R.dimen.sp_14;
                    }
                    h.a(appCompatTextView, 2, i10);
                }
            }
        }
    }

    @Override // om.a
    public final void g(int i10) {
        String string = this.itemView.getContext().getResources().getString(R.string.arg_res_0x7f13003b, ea.a.p("CFBlLTQ=", "yGcpKTAc"));
        g.d(string, ea.a.p("W28fdAh4Ri46ZRVvQXI0ZUsuNWU9U0JyloDXdDBuNl9IbwZlH2VWXyp5SiAWRwdUFTRwKQ==", "qR8qm2gk"));
        int V = k.V(string, ea.a.p("c1AhLTQ=", "Np4u7lm7"), 0, false, 6);
        int i11 = V + 5;
        if (V >= 0 && i11 <= string.length()) {
            SpannableString spannableString = new SpannableString(string);
            spannableString.setSpan(new ForegroundColorSpan(-14163971), V, i11, 33);
            this.f23502b.f1601b.setText(spannableString);
        }
    }

    @Override // om.a
    public final void b() {
    }
}

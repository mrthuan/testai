package rm;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.b0;
import java.util.List;

/* compiled from: BaseUserGuidePagerAdapter.kt */
/* loaded from: classes3.dex */
public abstract class a<VH extends RecyclerView.b0> extends RecyclerView.Adapter<VH> {

    /* renamed from: d  reason: collision with root package name */
    public final List<h> f29623d;

    public a(List<h> list) {
        kotlin.jvm.internal.g.e(list, ea.a.p("Km5FaQ15", "oJE4Dhmg"));
        this.f29623d = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f29623d.size();
    }
}

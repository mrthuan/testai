package f5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: UpgradeListAdapter.kt */
/* loaded from: classes.dex */
public final class j extends RecyclerView.Adapter<RecyclerView.b0> {

    /* renamed from: d  reason: collision with root package name */
    public final LayoutInflater f17116d;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList<String> f17117e;

    /* compiled from: UpgradeListAdapter.kt */
    /* loaded from: classes.dex */
    public static final class a extends RecyclerView.b0 {

        /* renamed from: b  reason: collision with root package name */
        public final AppCompatTextView f17118b;

        public a(View view) {
            super(view);
            View findViewById = view.findViewById(R.id.tv_new);
            kotlin.jvm.internal.g.d(findViewById, "itemView.findViewById(R.id.tv_new)");
            this.f17118b = (AppCompatTextView) findViewById;
        }
    }

    public j(Context context) {
        LayoutInflater from = LayoutInflater.from(context);
        kotlin.jvm.internal.g.d(from, "from(context)");
        this.f17116d = from;
        this.f17117e = new ArrayList<>();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f17117e.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.b0 holder, int i10) {
        kotlin.jvm.internal.g.e(holder, "holder");
        if (holder instanceof a) {
            ((a) holder).f17118b.setText(this.f17117e.get(i10));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.b0 onCreateViewHolder(ViewGroup parent, int i10) {
        kotlin.jvm.internal.g.e(parent, "parent");
        View inflate = this.f17116d.inflate(R.layout.upgrade_item_rcv_update, parent, false);
        kotlin.jvm.internal.g.d(inflate, "layoutInflater.inflate(R…cv_update, parent, false)");
        return new a(inflate);
    }
}

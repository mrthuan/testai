package pdf.pdfreader.viewer.editor.free.ui.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: SearchHistoryAdapter.kt */
/* loaded from: classes3.dex */
public final class t extends RecyclerView.Adapter<a> {

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList<String> f27305d;

    /* renamed from: e  reason: collision with root package name */
    public final cg.l<String, tf.d> f27306e;

    /* renamed from: f  reason: collision with root package name */
    public final cg.l<Boolean, tf.d> f27307f;

    /* compiled from: SearchHistoryAdapter.kt */
    /* loaded from: classes3.dex */
    public final class a extends RecyclerView.b0 {

        /* renamed from: b  reason: collision with root package name */
        public final TextView f27308b;
        public final AppCompatImageView c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            ea.a.p("OXQXbSBpB3c=", "t7Prvb1t");
            View findViewById = view.findViewById(R.id.tv_history);
            kotlin.jvm.internal.g.d(findViewById, ea.a.p("HHRSbQNpUndmZg9uUFY-ZU9CK0ktKGQuHWRfdCdfKmkGdFhyLCk=", "GOu7U79W"));
            this.f27308b = (TextView) findViewById;
            View findViewById2 = view.findViewById(R.id.img_clear);
            kotlin.jvm.internal.g.d(findViewById2, ea.a.p("IXQ_bT1pH3dmZg9uUFY-ZU9CK0ktKGQuHWRfaTxnHWMkZTtyKQ==", "EsHZkzeQ"));
            this.c = (AppCompatImageView) findViewById2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t(ArrayList<String> arrayList, cg.l<? super String, tf.d> lVar, cg.l<? super Boolean, tf.d> lVar2) {
        kotlin.jvm.internal.g.e(arrayList, ea.a.p("K2FFYXM=", "si3yuZVM"));
        this.f27305d = arrayList;
        this.f27306e = lVar;
        this.f27307f = lVar2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f27305d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(a aVar, int i10) {
        a holder = aVar;
        kotlin.jvm.internal.g.e(holder, "holder");
        String str = this.f27305d.get(i10);
        kotlin.jvm.internal.g.d(str, ea.a.p("V2E_YQBbEm8BaUBpBm5d", "r5wUhRCa"));
        String str2 = str;
        holder.f27308b.setText(str2);
        holder.c.setOnClickListener(new b(i10, this));
        holder.itemView.setOnClickListener(new vm.g(1, this, str2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final a onCreateViewHolder(ViewGroup parent, int i10) {
        kotlin.jvm.internal.g.e(parent, "parent");
        View i11 = androidx.activity.f.i(parent, R.layout.layout_item_search_history, parent, false);
        kotlin.jvm.internal.g.d(i11, ea.a.p("D3IebUJwG3ItbhIuV285dF14JilnaVhmloDXaA5oK3MdbwN5RiAKYTplCHQYIDFhVHM3KQ==", "stiqjzAr"));
        return new a(i11);
    }
}

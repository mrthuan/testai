package pdf.pdfreader.viewer.editor.free.ui.adapter;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ui.act.tools.SearchPDFWhenChooseActivity;

/* compiled from: SearchHistoryWhenChooseAdapter.kt */
/* loaded from: classes3.dex */
public final class u extends RecyclerView.Adapter<a> {

    /* renamed from: d  reason: collision with root package name */
    public final v f27309d;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList f27310e;

    /* compiled from: SearchHistoryWhenChooseAdapter.kt */
    @SuppressLint({"NotifyDataSetChanged"})
    /* loaded from: classes3.dex */
    public final class a extends RecyclerView.b0 {
        public static final /* synthetic */ int c = 0;

        /* renamed from: b  reason: collision with root package name */
        public final TextView f27311b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(u uVar, View view) {
            super(view);
            ea.a.p("RWkudw==", "0FXHPyCT");
            this.f27311b = (TextView) view.findViewById(R.id.tv_history);
            ImageView imageView = (ImageView) view.findViewById(R.id.img_clear);
            if (imageView != null) {
                imageView.setOnClickListener(new pdf.pdfreader.viewer.editor.free.feature.ocr.ui.adapter.e(2, this, uVar));
            }
            view.setOnClickListener(new j(1, this, uVar));
        }
    }

    public u(SearchPDFWhenChooseActivity.c cVar) {
        ea.a.p("IWEubFthG2s=", "71BB9xbL");
        this.f27309d = cVar;
        this.f27310e = new ArrayList();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        ArrayList arrayList = this.f27310e;
        if (arrayList.size() == 0) {
            return 0;
        }
        return arrayList.size() + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i10) {
        boolean z10;
        if (i10 >= 0 && i10 < this.f27310e.size()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return 1;
        }
        return 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(a aVar, int i10) {
        TextView textView;
        a holder = aVar;
        kotlin.jvm.internal.g.e(holder, "holder");
        String str = (String) kotlin.collections.m.t0(i10, this.f27310e);
        if (str != null && (textView = holder.f27311b) != null) {
            textView.setText(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final a onCreateViewHolder(ViewGroup parent, int i10) {
        kotlin.jvm.internal.g.e(parent, "parent");
        if (i10 == 1) {
            View i11 = androidx.activity.f.i(parent, R.layout.layout_item_search_history, parent, false);
            kotlin.jvm.internal.g.d(i11, ea.a.p("KXJebVFwVnI_bj4uFm8GdFB4GilraQtmtICVaGloWHM7b0N5VSBHYShlJHRZIA5hWXMLKQ==", "LKelV361"));
            return new a(this, i11);
        }
        View i12 = androidx.activity.f.i(parent, R.layout.item_search_bottom, parent, false);
        kotlin.jvm.internal.g.d(i12, ea.a.p("VXIkbVtwA3IXbkAuCm84dCF4RiloaS1mhIDcYy9fGm9HdCRtXyASYQBlWnRFIDBhKHNXKQ==", "fzGxa2el"));
        return new a(this, i12);
    }
}

package pdf.pdfreader.viewer.editor.free.ui.widget.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import cg.l;
import cg.p;
import java.util.ArrayList;
import kotlin.collections.m;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ui.widget.sign.SignCreateView;
import pdf.pdfreader.viewer.editor.free.ui.widget.sign.db.SignPathActionInfo;

/* compiled from: SignAdapter.kt */
/* loaded from: classes3.dex */
public final class f extends RecyclerView.Adapter<a> {

    /* renamed from: d  reason: collision with root package name */
    public final p<Integer, SignPathActionInfo, tf.d> f28369d;

    /* renamed from: e  reason: collision with root package name */
    public final l<SignPathActionInfo, tf.d> f28370e;

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList f28371f = new ArrayList();

    /* compiled from: SignAdapter.kt */
    /* loaded from: classes3.dex */
    public static final class a extends RecyclerView.b0 {

        /* renamed from: b  reason: collision with root package name */
        public final ImageView f28372b;
        public final ImageView c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            ea.a.p("JnRUbS9pUnc=", "ybNsuubG");
            View findViewById = view.findViewById(R.id.item_sign_iv);
            kotlin.jvm.internal.g.d(findViewById, ea.a.p("WnQubSVpB3dcZl1uDVY_ZTNCS0kiKBEuDWRCaRZlDF9AaSxuLGkUKQ==", "dlba8n7u"));
            this.f28372b = (ImageView) findViewById;
            View findViewById2 = view.findViewById(R.id.item_sign_iv_close);
            kotlin.jvm.internal.g.d(findViewById2, ea.a.p("JnRUbS9pUnd0ZiNuEVYBZUJCF0khKDcuEGRvaSRlA188aVZuJmlBXzlsJXMQKQ==", "DPgDyAPn"));
            this.c = (ImageView) findViewById2;
        }
    }

    public f(xo.b bVar, SignCreateView.c cVar) {
        this.f28369d = bVar;
        this.f28370e = cVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f28371f.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(a aVar, int i10) {
        a holder = aVar;
        kotlin.jvm.internal.g.e(holder, "holder");
        final SignPathActionInfo signPathActionInfo = (SignPathActionInfo) m.t0(i10, this.f28371f);
        if (signPathActionInfo != null) {
            com.bumptech.glide.b.f(holder.itemView.getContext()).o(signPathActionInfo.getFilePath()).E(holder.f28372b);
            holder.c.setOnClickListener(new g(this, holder, signPathActionInfo));
            View view = holder.itemView;
            kotlin.jvm.internal.g.d(view, ea.a.p("IG85ZAlydGk8ZQtWXWV3", "lrHUlZzq"));
            pdf.pdfreader.viewer.editor.free.utils.extension.g.e(view, new l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.widget.adapter.SignAdapter$onBindViewHolder$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // cg.l
                public /* bridge */ /* synthetic */ tf.d invoke(View view2) {
                    invoke2(view2);
                    return tf.d.f30009a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(View it) {
                    kotlin.jvm.internal.g.e(it, "it");
                    l<SignPathActionInfo, tf.d> lVar = f.this.f28370e;
                    if (lVar != null) {
                        lVar.invoke(signPathActionInfo);
                    }
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final a onCreateViewHolder(ViewGroup parent, int i10) {
        kotlin.jvm.internal.g.e(parent, "parent");
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_sign, parent, false);
        kotlin.jvm.internal.g.d(inflate, ea.a.p("Jm5XbBh0ZQ==", "4NToBlg8"));
        return new a(inflate);
    }
}

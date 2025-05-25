package pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import cg.l;
import cg.p;
import i2.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.m;

/* compiled from: BaseBindingAdapter.kt */
/* loaded from: classes3.dex */
public abstract class f<T, V extends i2.a> extends RecyclerView.Adapter<g<T, V>> {

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f24702d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public p<? super Integer, ? super T, tf.d> f24703e;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f24702d.size();
    }

    public abstract V h(LayoutInflater layoutInflater, ViewGroup viewGroup);

    public abstract g<T, V> i(V v10);

    public final void j(List<? extends T> newData) {
        kotlin.jvm.internal.g.e(newData, "newData");
        ArrayList arrayList = this.f24702d;
        arrayList.clear();
        arrayList.addAll(newData);
        notifyDataSetChanged();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.b0 b0Var, final int i10) {
        g holder = (g) b0Var;
        kotlin.jvm.internal.g.e(holder, "holder");
        final Object t02 = m.t0(i10, this.f24702d);
        if (t02 != null) {
            holder.l(i10, t02);
            View view = holder.itemView;
            kotlin.jvm.internal.g.d(view, ea.a.p("W28nZBZyTGkGZVlWAGV3", "l0TiULfg"));
            pdf.pdfreader.viewer.editor.free.utils.extension.g.e(view, new l<View, tf.d>(this) { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.BaseBindingAdapter$onBindViewHolder$1
                final /* synthetic */ f<Object, i2.a> this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                    this.this$0 = this;
                }

                @Override // cg.l
                public /* bridge */ /* synthetic */ tf.d invoke(View view2) {
                    invoke2(view2);
                    return tf.d.f30009a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(View it) {
                    kotlin.jvm.internal.g.e(it, "it");
                    p<? super Integer, ? super Object, tf.d> pVar = this.this$0.f24703e;
                    if (pVar != null) {
                        pVar.invoke(Integer.valueOf(i10), t02);
                    }
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.b0 onCreateViewHolder(ViewGroup parent, int i10) {
        kotlin.jvm.internal.g.e(parent, "parent");
        LayoutInflater from = LayoutInflater.from(parent.getContext());
        kotlin.jvm.internal.g.d(from, ea.a.p("KXJebVFwVnI_bj4uFm8GdFB4Gik=", "EREf6boD"));
        return i(h(from, parent));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(RecyclerView.b0 b0Var) {
        g holder = (g) b0Var;
        kotlin.jvm.internal.g.e(holder, "holder");
        super.onViewRecycled(holder);
    }
}

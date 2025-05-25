package xk;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ui.dialog.e;
import pdf.pdfreader.viewer.editor.free.ui.feature.debug.ReaderDebugActivity;
import pdf.pdfreader.viewer.editor.free.utils.a0;

/* compiled from: LanguageAdapter.java */
/* loaded from: classes3.dex */
public final class d extends RecyclerView.Adapter<b> {

    /* renamed from: d  reason: collision with root package name */
    public final List<no.c> f31866d;

    /* renamed from: e  reason: collision with root package name */
    public int f31867e = 0;

    /* renamed from: f  reason: collision with root package name */
    public a f31868f;

    /* compiled from: LanguageAdapter.java */
    /* loaded from: classes3.dex */
    public interface a {
    }

    /* compiled from: LanguageAdapter.java */
    /* loaded from: classes3.dex */
    public class b extends RecyclerView.b0 {

        /* renamed from: b  reason: collision with root package name */
        public final TextView f31869b;
        public final ImageView c;

        /* renamed from: d  reason: collision with root package name */
        public final ImageView f31870d;

        /* compiled from: LanguageAdapter.java */
        /* loaded from: classes3.dex */
        public class a implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ View f31872a;

            public a(View view) {
                this.f31872a = view;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i10;
                b bVar = b.this;
                d dVar = d.this;
                int i11 = dVar.f31867e;
                if (i11 < dVar.getItemCount()) {
                    d dVar2 = d.this;
                    int i12 = dVar2.f31867e;
                    View view2 = this.f31872a;
                    if (i12 != ((Integer) view2.getTag()).intValue()) {
                        dVar2.f31867e = ((Integer) view2.getTag()).intValue();
                        if (i11 < dVar2.getItemCount() && i11 >= 0) {
                            dVar2.notifyItemChanged(i11);
                        }
                        if (dVar2.f31867e < dVar2.getItemCount() && (i10 = dVar2.f31867e) >= 0) {
                            dVar2.notifyItemChanged(i10);
                        }
                        a aVar = dVar2.f31868f;
                        if (aVar != null) {
                            int i13 = dVar2.f31867e;
                            e.a aVar2 = (e.a) aVar;
                            int size = a0.f28533e.size() + 1;
                            if (i13 >= 0 && i13 <= size - 1) {
                                pdf.pdfreader.viewer.editor.free.ui.dialog.e eVar = pdf.pdfreader.viewer.editor.free.ui.dialog.e.this;
                                no.c cVar = (no.c) eVar.f27532y.get(i13);
                                if (cVar != null) {
                                    eVar.A = cVar.f22612a;
                                }
                            }
                        }
                    }
                }
            }
        }

        public b(View view) {
            super(view);
            this.c = (ImageView) view.findViewById(R.id.iv);
            this.f31869b = (TextView) view.findViewById(R.id.tv);
            this.f31870d = (ImageView) view.findViewById(R.id.new_tip_iv);
            view.setOnClickListener(new a(view));
        }
    }

    public d(List list) {
        this.f31866d = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f31866d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(b bVar, int i10) {
        int i11;
        b bVar2 = bVar;
        if (i10 >= 0) {
            List<no.c> list = this.f31866d;
            if (i10 <= list.size()) {
                bVar2.itemView.setTag(Integer.valueOf(i10));
                bVar2.f31869b.setText(list.get(i10).f22613b);
                if (i10 == this.f31867e) {
                    i11 = 0;
                } else {
                    i11 = 4;
                }
                bVar2.c.setVisibility(i11);
                ImageView imageView = bVar2.f31870d;
                if (i10 == 1) {
                    if (!a0.f28535g && !ReaderDebugActivity.f27826e) {
                        imageView.setVisibility(8);
                        return;
                    } else {
                        imageView.setVisibility(0);
                        return;
                    }
                }
                imageView.setVisibility(8);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final b onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return new b(androidx.activity.f.i(viewGroup, R.layout.item_change_language, viewGroup, false));
    }
}

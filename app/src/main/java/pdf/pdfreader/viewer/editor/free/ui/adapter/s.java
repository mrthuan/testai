package pdf.pdfreader.viewer.editor.free.ui.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;

/* compiled from: SearchAdapter.java */
/* loaded from: classes3.dex */
public final class s extends RecyclerView.Adapter<b> {

    /* renamed from: d  reason: collision with root package name */
    public final Context f27288d;

    /* renamed from: e  reason: collision with root package name */
    public final a f27289e;

    /* renamed from: g  reason: collision with root package name */
    public String f27291g;

    /* renamed from: h  reason: collision with root package name */
    public SimpleDateFormat f27292h;

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList<PdfPreviewEntity> f27290f = new ArrayList<>();

    /* renamed from: i  reason: collision with root package name */
    public int f27293i = 0;

    /* renamed from: j  reason: collision with root package name */
    public final ArrayList<Long> f27294j = new ArrayList<>();

    /* renamed from: k  reason: collision with root package name */
    public final ArrayList<Long> f27295k = new ArrayList<>();

    /* renamed from: l  reason: collision with root package name */
    public final ArrayList<Long> f27296l = new ArrayList<>();

    /* compiled from: SearchAdapter.java */
    /* loaded from: classes3.dex */
    public interface a {
    }

    /* compiled from: SearchAdapter.java */
    /* loaded from: classes3.dex */
    public static class b extends RecyclerView.b0 {

        /* renamed from: b  reason: collision with root package name */
        public final TextView f27297b;
        public final ConstraintLayout c;

        /* renamed from: d  reason: collision with root package name */
        public final TextView f27298d;

        /* renamed from: e  reason: collision with root package name */
        public final ImageView f27299e;

        /* renamed from: f  reason: collision with root package name */
        public final ImageView f27300f;

        /* renamed from: g  reason: collision with root package name */
        public final AppCompatImageView f27301g;

        /* renamed from: h  reason: collision with root package name */
        public final AppCompatImageView f27302h;

        /* renamed from: i  reason: collision with root package name */
        public final View f27303i;

        /* renamed from: j  reason: collision with root package name */
        public final View f27304j;

        public b(View view) {
            super(view);
            this.f27297b = (TextView) view.findViewById(R.id.item_name);
            this.c = (ConstraintLayout) view.findViewById(R.id.root);
            this.f27299e = (ImageView) view.findViewById(R.id.item_pdf_ck);
            this.f27298d = (TextView) view.findViewById(R.id.item_date);
            this.f27301g = (AppCompatImageView) view.findViewById(R.id.item_pdf_more);
            this.f27302h = (AppCompatImageView) view.findViewById(R.id.item_icon);
            this.f27300f = (ImageView) view.findViewById(R.id.item_book);
            this.f27303i = view.findViewById(R.id.bg_view_high_light);
            this.f27304j = view.findViewById(R.id.select_bg_view);
        }
    }

    static {
        ea.a.p("HGVQchpodmQ7cD5lcg==", "1YkCgLnA");
    }

    public s(Context context, a aVar) {
        this.f27288d = context;
        this.f27289e = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f27290f.size();
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void h(String str, ArrayList arrayList) {
        this.f27291g = str;
        ArrayList<PdfPreviewEntity> arrayList2 = this.f27290f;
        arrayList2.clear();
        if (arrayList != null && !arrayList.isEmpty()) {
            if (this.f27293i == 1) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (this.f27294j.contains(Long.valueOf(((PdfPreviewEntity) it.next()).getId()))) {
                        it.remove();
                    }
                }
            }
            arrayList2.addAll(arrayList);
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(b bVar, int i10) {
        String name;
        b bVar2 = bVar;
        Context context = this.f27288d;
        ArrayList<PdfPreviewEntity> arrayList = this.f27290f;
        if (i10 < arrayList.size() && i10 >= 0) {
            PdfPreviewEntity pdfPreviewEntity = arrayList.get(i10);
            if (this.f27293i == 0) {
                bVar2.c.setBackgroundResource(R.drawable.ripple_normal_item);
                bVar2.f27301g.setVisibility(0);
                bVar2.f27304j.setVisibility(8);
                bVar2.f27299e.setVisibility(8);
            } else {
                bVar2.c.setBackgroundResource(R.drawable.ripple_normal_item);
                bVar2.f27301g.setVisibility(8);
                bVar2.f27299e.setVisibility(0);
            }
            if (this.f27293i == 1) {
                if ((this.f27294j.contains(Long.valueOf(pdfPreviewEntity.getId())) || this.f27296l.contains(Long.valueOf(pdfPreviewEntity.getId()))) && !this.f27295k.contains(Long.valueOf(pdfPreviewEntity.getId()))) {
                    bVar2.f27304j.setVisibility(0);
                    bVar2.f27299e.setImageResource(R.drawable.ic_home_selected);
                } else {
                    bVar2.f27304j.setVisibility(8);
                    bVar2.f27299e.setImageResource(R.drawable.ic_home_unselected_gray);
                }
            }
            try {
                try {
                    name = aj.b.O(pdfPreviewEntity.getPath());
                } catch (Exception unused) {
                    name = pdfPreviewEntity.getName();
                }
                SpannableString spannableString = new SpannableString(name);
                int length = this.f27291g.toLowerCase().length();
                if (name.toLowerCase().contains(this.f27291g.toLowerCase())) {
                    int indexOf = name.toLowerCase().indexOf(this.f27291g.toLowerCase());
                    spannableString.setSpan(new BackgroundColorSpan(androidx.core.content.a.getColor(context, R.color.color_99F4443C)), indexOf, length + indexOf, 33);
                    bVar2.f27297b.setText(spannableString);
                } else {
                    bVar2.f27297b.setText(name);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                bVar2.f27297b.setText(pdfPreviewEntity.getName());
            }
            if (pdfPreviewEntity.getFavorite() == 1) {
                bVar2.f27300f.setVisibility(0);
            } else {
                bVar2.f27300f.setVisibility(4);
            }
            if (this.f27292h == null) {
                this.f27292h = new SimpleDateFormat(ea.a.p("Ak0eZB0vTnkjeQ==", "siGW1U8e"), context.getResources().getConfiguration().locale);
            }
            String format = this.f27292h.format(Long.valueOf(pdfPreviewEntity.getDate()));
            pdfPreviewEntity.getPath();
            pdfPreviewEntity.getPath();
            String t4 = pdf.pdfreader.viewer.editor.free.utils.v.t(context, pdfPreviewEntity.getSize());
            TextView textView = bVar2.f27298d;
            StringBuilder k10 = a0.a.k(format);
            k10.append(ea.a.p("E8L8IA==", "gSVj2Tih"));
            k10.append(t4);
            textView.setText(k10.toString());
            bVar2.itemView.getContext();
            boolean isHighlightOnce = pdfPreviewEntity.isHighlightOnce();
            View view = bVar2.f27303i;
            if (isHighlightOnce) {
                view.setVisibility(0);
                bVar2.itemView.postDelayed(new p(pdfPreviewEntity, bVar2), 2200L);
            } else {
                view.setVisibility(8);
            }
            aj.b.U(bVar2.f27302h, pdfPreviewEntity.getPath(), pdfPreviewEntity.isOtherBoolOne(), pdfPreviewEntity.getOtherStrOne());
            bVar2.c.setOnClickListener(new q(this, pdfPreviewEntity));
            bVar2.f27301g.setOnClickListener(new r(this, pdfPreviewEntity));
            return;
        }
        bVar2.itemView.setVisibility(4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final b onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return new b(LayoutInflater.from(this.f27288d).inflate(R.layout.item_pdf_file, viewGroup, false));
    }
}

package pdf.pdfreader.viewer.editor.free.ui.widget.adapter;

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
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.utils.v;

/* compiled from: EditSearchAdapter.java */
/* loaded from: classes3.dex */
public final class e extends RecyclerView.Adapter<b> {

    /* renamed from: d  reason: collision with root package name */
    public final Context f28356d;

    /* renamed from: e  reason: collision with root package name */
    public final a f28357e;

    /* renamed from: g  reason: collision with root package name */
    public String f28359g;

    /* renamed from: h  reason: collision with root package name */
    public SimpleDateFormat f28360h;

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList<PdfPreviewEntity> f28358f = new ArrayList<>();

    /* renamed from: i  reason: collision with root package name */
    public PdfPreviewEntity f28361i = null;

    /* compiled from: EditSearchAdapter.java */
    /* loaded from: classes3.dex */
    public interface a {
    }

    /* compiled from: EditSearchAdapter.java */
    /* loaded from: classes3.dex */
    public static class b extends RecyclerView.b0 {

        /* renamed from: b  reason: collision with root package name */
        public final TextView f28362b;
        public final ConstraintLayout c;

        /* renamed from: d  reason: collision with root package name */
        public final TextView f28363d;

        /* renamed from: e  reason: collision with root package name */
        public final ImageView f28364e;

        /* renamed from: f  reason: collision with root package name */
        public final ImageView f28365f;

        /* renamed from: g  reason: collision with root package name */
        public final AppCompatImageView f28366g;

        /* renamed from: h  reason: collision with root package name */
        public final AppCompatImageView f28367h;

        /* renamed from: i  reason: collision with root package name */
        public final View f28368i;

        public b(View view) {
            super(view);
            this.f28362b = (TextView) view.findViewById(R.id.item_name);
            this.c = (ConstraintLayout) view.findViewById(R.id.root);
            this.f28364e = (ImageView) view.findViewById(R.id.item_pdf_ck);
            this.f28363d = (TextView) view.findViewById(R.id.item_date);
            this.f28366g = (AppCompatImageView) view.findViewById(R.id.item_pdf_more);
            this.f28367h = (AppCompatImageView) view.findViewById(R.id.item_icon);
            this.f28365f = (ImageView) view.findViewById(R.id.item_book);
            this.f28368i = view.findViewById(R.id.bg_view_high_light);
        }
    }

    public e(Context context, a aVar) {
        this.f28356d = context;
        this.f28357e = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f28358f.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(b bVar, int i10) {
        boolean z10;
        String name;
        b bVar2 = bVar;
        Context context = this.f28356d;
        ArrayList<PdfPreviewEntity> arrayList = this.f28358f;
        if (i10 < arrayList.size() && i10 >= 0) {
            PdfPreviewEntity pdfPreviewEntity = arrayList.get(i10);
            AppCompatImageView appCompatImageView = bVar2.f28366g;
            TextView textView = bVar2.f28362b;
            appCompatImageView.setVisibility(8);
            ImageView imageView = bVar2.f28364e;
            imageView.setVisibility(0);
            if (this.f28361i == pdfPreviewEntity) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                imageView.setImageResource(R.mipmap.ic_single_selected);
            } else {
                imageView.setImageResource(R.mipmap.ic_single_unselected);
            }
            try {
                try {
                    name = aj.b.O(pdfPreviewEntity.getPath());
                } catch (Exception unused) {
                    name = pdfPreviewEntity.getName();
                }
                SpannableString spannableString = new SpannableString(name);
                int length = this.f28359g.toLowerCase().length();
                if (name.toLowerCase().contains(this.f28359g.toLowerCase())) {
                    int indexOf = name.toLowerCase().indexOf(this.f28359g.toLowerCase());
                    spannableString.setSpan(new BackgroundColorSpan(androidx.core.content.a.getColor(context, R.color.color_99F4443C)), indexOf, length + indexOf, 33);
                    textView.setText(spannableString);
                } else {
                    textView.setText(name);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                textView.setText(pdfPreviewEntity.getName());
            }
            int favorite = pdfPreviewEntity.getFavorite();
            ImageView imageView2 = bVar2.f28365f;
            if (favorite == 1) {
                imageView2.setVisibility(0);
            } else {
                imageView2.setVisibility(4);
            }
            if (this.f28360h == null) {
                this.f28360h = new SimpleDateFormat(ea.a.p("fk1kZBcvG3kLeQ==", "S3r4xyGT"), context.getResources().getConfiguration().locale);
            }
            String format = this.f28360h.format(Long.valueOf(pdfPreviewEntity.getDate()));
            pdfPreviewEntity.getPath();
            pdfPreviewEntity.getPath();
            String t4 = v.t(context, pdfPreviewEntity.getSize());
            StringBuilder k10 = a0.a.k(format);
            k10.append(ea.a.p("b8KGIA==", "jfMJyuyI"));
            k10.append(t4);
            bVar2.f28363d.setText(k10.toString());
            bVar2.itemView.getContext();
            boolean isHighlightOnce = pdfPreviewEntity.isHighlightOnce();
            View view = bVar2.f28368i;
            if (isHighlightOnce) {
                view.setVisibility(0);
                bVar2.itemView.postDelayed(new pdf.pdfreader.viewer.editor.free.ui.widget.adapter.b(pdfPreviewEntity, bVar2), 2200L);
            } else {
                view.setVisibility(8);
            }
            aj.b.U(bVar2.f28367h, pdfPreviewEntity.getPath(), pdfPreviewEntity.isOtherBoolOne(), pdfPreviewEntity.getOtherStrOne());
            bVar2.c.setOnClickListener(new c(this, pdfPreviewEntity));
            bVar2.f28366g.setOnClickListener(new d(this, pdfPreviewEntity));
            return;
        }
        bVar2.itemView.setVisibility(4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final b onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return new b(LayoutInflater.from(this.f28356d).inflate(R.layout.item_edit_pdf_file, viewGroup, false));
    }
}

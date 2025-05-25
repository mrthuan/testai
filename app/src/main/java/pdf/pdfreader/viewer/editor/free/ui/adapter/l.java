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
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.bean.DataBridge;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.merge.MergePdfData;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderMergeChooserActivity;

/* compiled from: MergePdfChooserAdapter.kt */
/* loaded from: classes3.dex */
public final class l extends RecyclerView.Adapter<a> {

    /* renamed from: d  reason: collision with root package name */
    public final Context f27259d;

    /* renamed from: e  reason: collision with root package name */
    public final b f27260e;

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList f27261f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList f27262g;

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList f27263h;

    /* renamed from: i  reason: collision with root package name */
    public SimpleDateFormat f27264i;

    /* renamed from: j  reason: collision with root package name */
    public RecyclerView f27265j;

    /* renamed from: k  reason: collision with root package name */
    public String f27266k;

    /* compiled from: MergePdfChooserAdapter.kt */
    /* loaded from: classes3.dex */
    public final class a extends RecyclerView.b0 {

        /* renamed from: i  reason: collision with root package name */
        public static final /* synthetic */ int f27267i = 0;

        /* renamed from: b  reason: collision with root package name */
        public final TextView f27268b;
        public final ImageView c;

        /* renamed from: d  reason: collision with root package name */
        public final ImageView f27269d;

        /* renamed from: e  reason: collision with root package name */
        public final TextView f27270e;

        /* renamed from: f  reason: collision with root package name */
        public final ImageView f27271f;

        /* renamed from: g  reason: collision with root package name */
        public final View f27272g;

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ l f27273h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(l lVar, View view) {
            super(view);
            ea.a.p("WnQubSVpB3c=", "Y9SQ66Me");
            this.f27273h = lVar;
            View findViewById = view.findViewById(R.id.root);
            kotlin.jvm.internal.g.d(findViewById, ea.a.p("JnRUbS9pUnd0ZiNuEVYBZUJCF0khKDcuEGR6ciJvNik=", "mTgAyTMB"));
            View findViewById2 = view.findViewById(R.id.item_name);
            kotlin.jvm.internal.g.d(findViewById2, ea.a.p("JnRUbS9pUnd0ZiNuEVYBZUJCF0khKDcuJmR6aUxlD18hYVxlKQ==", "BnIiOT8b"));
            this.f27268b = (TextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.item_icon);
            kotlin.jvm.internal.g.d(findViewById3, ea.a.p("AXQUbWBpFXdmZg9uUFY-ZU9CK0ktKGQuHWRfaSVlL18BYx5uKQ==", "wjhq6pJv"));
            this.c = (ImageView) findViewById3;
            View findViewById4 = view.findViewById(R.id.item_pdf_ck);
            kotlin.jvm.internal.g.d(findViewById4, ea.a.p("OXQybWFpN3dmZg9uUFY-ZU9CK0ktKGQuHWRfaSVlL18gZDFfVGsp", "OGPW7RnB"));
            this.f27269d = (ImageView) findViewById4;
            View findViewById5 = view.findViewById(R.id.item_date);
            kotlin.jvm.internal.g.d(findViewById5, ea.a.p("JnRUbS9pUnd0ZiNuEVYBZUJCF0khKDcuWGRLaSVlP18rYUVlKQ==", "Uxxe1eQR"));
            this.f27270e = (TextView) findViewById5;
            View findViewById6 = view.findViewById(R.id.item_book);
            kotlin.jvm.internal.g.d(findViewById6, ea.a.p("WnQubSVpB3dcZl1uDVY_ZTNCS0kiKBEuAmR_aSJlGF9RbyRrKQ==", "kQVu8ajw"));
            this.f27271f = (ImageView) findViewById6;
            View findViewById7 = view.findViewById(R.id.select_bg_view);
            kotlin.jvm.internal.g.d(findViewById7, ea.a.p("WnQubSVpB3dcZl1uDVY_ZTNCS0kiKBEuAWRecxZsE2NHXylnLHYLZQUp", "hpsv5EiA"));
            this.f27272g = findViewById7;
            ((ConstraintLayout) findViewById).setOnClickListener(new pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.a(2, this, lVar));
        }
    }

    /* compiled from: MergePdfChooserAdapter.kt */
    /* loaded from: classes3.dex */
    public interface b {
        void a(int i10);

        void b(int i10);
    }

    public l(ReaderMergeChooserActivity readerMergeChooserActivity, ReaderMergeChooserActivity readerMergeChooserActivity2) {
        kotlin.jvm.internal.g.e(readerMergeChooserActivity, ea.a.p("CEMWbixlQXQ=", "17eyX9ei"));
        kotlin.jvm.internal.g.e(readerMergeChooserActivity2, ea.a.p("BWkpdAhuH3I=", "9BiZmz22"));
        this.f27259d = readerMergeChooserActivity;
        this.f27260e = readerMergeChooserActivity2;
        this.f27261f = new ArrayList();
        this.f27262g = new ArrayList();
        this.f27263h = new ArrayList();
        this.f27266k = "";
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f27261f.size();
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void h() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f27263h;
        arrayList2.clear();
        for (MergePdfData mergePdfData : DataBridge.a()) {
            arrayList2.add(Long.valueOf(mergePdfData.getId()));
        }
        Iterator it = this.f27262g.iterator();
        while (it.hasNext()) {
            PdfPreviewEntity pdfPreviewEntity = (PdfPreviewEntity) it.next();
            if (!arrayList2.contains(Long.valueOf(pdfPreviewEntity.getId()))) {
                arrayList.add(pdfPreviewEntity);
            }
        }
        ArrayList arrayList3 = this.f27261f;
        arrayList3.clear();
        List<MergePdfData> mergeDataList = DataBridge.a();
        kotlin.jvm.internal.g.e(arrayList3, "<this>");
        kotlin.jvm.internal.g.e(mergeDataList, "mergeDataList");
        for (MergePdfData mergePdfData2 : mergeDataList) {
            arrayList3.add(mergePdfData2.getPdf());
        }
        arrayList3.addAll(arrayList);
        this.f27260e.a(arrayList2.size());
        notifyDataSetChanged();
        RecyclerView recyclerView = this.f27265j;
        if (recyclerView != null) {
            recyclerView.r0(0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        kotlin.jvm.internal.g.e(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.f27265j = recyclerView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(a aVar, int i10) {
        String name;
        String format;
        a holder = aVar;
        kotlin.jvm.internal.g.e(holder, "holder");
        PdfPreviewEntity pdfPreviewEntity = (PdfPreviewEntity) kotlin.collections.m.t0(i10, this.f27261f);
        if (pdfPreviewEntity != null) {
            Context context = holder.itemView.getContext();
            try {
                String path = pdfPreviewEntity.getPath();
                kotlin.jvm.internal.g.d(path, ea.a.p("Vm4_aQd5THATdGg=", "QaXAhP9J"));
                name = aj.b.O(path);
            } catch (Exception unused) {
                name = pdfPreviewEntity.getName();
                kotlin.jvm.internal.g.d(name, ea.a.p("NAoRIFkgFyB6IGogVSBIIBUgC24xaRF5HG4RbSMKQiBvIBEgWSAXIHogfQ==", "ZDEc2pFb"));
            }
            SpannableString spannableString = new SpannableString(name);
            String str = this.f27266k;
            Locale locale = Locale.ROOT;
            String f10 = a6.h.f("HU9-VA==", "tRhRwnGn", locale, str, locale);
            kotlin.jvm.internal.g.d(f10, ea.a.p("O2hYc1lhRCAwYTxhW2wJblIuPXQ3aQtnZy4ubwBvPmU9Q1BzHChbbzlhJmUp", "QGPTNZLI"));
            ea.a.p("G08WVA==", "xfIYoA9f");
            String lowerCase = name.toLowerCase(locale);
            kotlin.jvm.internal.g.d(lowerCase, ea.a.p("O2hYc1lhRCAwYTxhW2wJblIuPXQ3aQtney4gbyVvEmU9Q1BzHChbbzlhJmUp", "PeAURTie"));
            int V = kotlin.text.k.V(lowerCase, f10, 0, false, 6);
            if (V >= 0) {
                spannableString.setSpan(new BackgroundColorSpan(androidx.core.content.a.getColor(context, R.color.color_99F4443C)), V, f10.length() + V, 33);
            }
            holder.f27268b.setText(spannableString);
            int favorite = pdfPreviewEntity.getFavorite();
            ImageView imageView = holder.f27271f;
            if (favorite == 1) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(4);
            }
            SimpleDateFormat simpleDateFormat = this.f27264i;
            if (simpleDateFormat == null || (format = simpleDateFormat.format(Long.valueOf(pdfPreviewEntity.getDate()))) == null) {
                SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(ea.a.p("fk1kZBcvG3kLeQ==", "gaVXEQHc"), this.f27259d.getResources().getConfiguration().locale);
                this.f27264i = simpleDateFormat2;
                format = simpleDateFormat2.format(Long.valueOf(pdfPreviewEntity.getDate()));
            }
            pdfPreviewEntity.getPath();
            holder.f27270e.setText(androidx.activity.f.m(format, " · ", pdf.pdfreader.viewer.editor.free.utils.v.t(context, pdfPreviewEntity.getSize())));
            aj.b.V(holder.c, pdfPreviewEntity.isOtherBoolOne());
            boolean contains = this.f27263h.contains(Long.valueOf(pdfPreviewEntity.getId()));
            ImageView imageView2 = holder.f27269d;
            View view = holder.f27272g;
            if (contains) {
                view.setVisibility(0);
                imageView2.setImageResource(R.drawable.ic_home_selected);
                return;
            }
            view.setVisibility(8);
            imageView2.setImageResource(R.drawable.ic_home_unselected_gray);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final a onCreateViewHolder(ViewGroup parent, int i10) {
        kotlin.jvm.internal.g.e(parent, "parent");
        View inflate = LayoutInflater.from(this.f27259d).inflate(R.layout.item_merge_pdf_chooser, parent, false);
        kotlin.jvm.internal.g.d(inflate, ea.a.p("VXIkbVttIW8cdFF4HSl4aSpmXmEyZWtS0IDEZhtjXW9ccy5yXyASYQBlWnRFIDBhKHNXKQ==", "2bD5dY5y"));
        return new a(this, inflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        kotlin.jvm.internal.g.e(recyclerView, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
        this.f27265j = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(a aVar, int i10, List payloads) {
        a holder = aVar;
        kotlin.jvm.internal.g.e(holder, "holder");
        kotlin.jvm.internal.g.e(payloads, "payloads");
        if (payloads.size() == 0) {
            super.onBindViewHolder(holder, i10, payloads);
            return;
        }
        PdfPreviewEntity pdfPreviewEntity = (PdfPreviewEntity) kotlin.collections.m.t0(i10, this.f27261f);
        if (pdfPreviewEntity != null) {
            boolean contains = this.f27263h.contains(Long.valueOf(pdfPreviewEntity.getId()));
            ImageView imageView = holder.f27269d;
            View view = holder.f27272g;
            if (contains) {
                view.setVisibility(0);
                imageView.setImageResource(R.drawable.ic_home_selected);
                return;
            }
            view.setVisibility(8);
            imageView.setImageResource(R.drawable.ic_home_unselected_gray);
        }
    }
}

package pdf.pdfreader.viewer.editor.free.ui.adapter;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;

/* compiled from: ChoosePDFAdapter.kt */
/* loaded from: classes3.dex */
public final class ChoosePDFAdapter extends RecyclerView.Adapter<a> {

    /* renamed from: d  reason: collision with root package name */
    public final Context f27092d;

    /* renamed from: e  reason: collision with root package name */
    public final cg.l<PdfPreviewEntity, tf.d> f27093e;

    /* renamed from: f  reason: collision with root package name */
    public final tf.c f27094f;

    /* renamed from: g  reason: collision with root package name */
    public final tf.c f27095g;

    /* renamed from: h  reason: collision with root package name */
    public long f27096h;

    /* renamed from: i  reason: collision with root package name */
    public String f27097i;

    /* compiled from: ChoosePDFAdapter.kt */
    /* loaded from: classes3.dex */
    public final class a extends RecyclerView.b0 {

        /* renamed from: h  reason: collision with root package name */
        public static final /* synthetic */ int f27098h = 0;

        /* renamed from: b  reason: collision with root package name */
        public final AppCompatImageView f27099b;
        public final AppCompatImageView c;

        /* renamed from: d  reason: collision with root package name */
        public final TextView f27100d;

        /* renamed from: e  reason: collision with root package name */
        public final AppCompatImageView f27101e;

        /* renamed from: f  reason: collision with root package name */
        public final TextView f27102f;

        /* renamed from: g  reason: collision with root package name */
        public final View f27103g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ChoosePDFAdapter choosePDFAdapter, View view) {
            super(view);
            ea.a.p("MWkidw==", "OeGG7Jrc");
            View findViewById = view.findViewById(R.id.item_pdf_ck);
            kotlin.jvm.internal.g.d(findViewById, ea.a.p("OWlUd1dmXm4-ViNlAkIRSVEoPC4sZEtpTGUuXx1kMF8sayk=", "kE3h8CmV"));
            this.f27099b = (AppCompatImageView) findViewById;
            View findViewById2 = view.findViewById(R.id.item_icon);
            kotlin.jvm.internal.g.d(findViewById2, ea.a.p("OWlUd1dmXm4-ViNlAkIRSVEoPC4sZEtpLGVcXwZjIW4p", "Q2NjX1oN"));
            this.c = (AppCompatImageView) findViewById2;
            View findViewById3 = view.findViewById(R.id.item_name);
            kotlin.jvm.internal.g.d(findViewById3, ea.a.p("RWkud11mC24WVl1lHkIvSSAoYC4vZG1pF2VfXw9hGWUp", "c2atLwjw"));
            this.f27100d = (TextView) findViewById3;
            View findViewById4 = view.findViewById(R.id.item_book);
            kotlin.jvm.internal.g.d(findViewById4, ea.a.p("OWlUd1dmXm4-ViNlAkIRSVEoPC4sZEtpJWUeXzdvCWsp", "dIzdQsUf"));
            this.f27101e = (AppCompatImageView) findViewById4;
            View findViewById5 = view.findViewById(R.id.item_date);
            kotlin.jvm.internal.g.d(findViewById5, ea.a.p("EWkwd2lmIW4sVg9lQ0IuSVwoAC4gZBhpAGUcXzVhNmUp", "hHgUGHHB"));
            this.f27102f = (TextView) findViewById5;
            View findViewById6 = view.findViewById(R.id.select_bg_view);
            kotlin.jvm.internal.g.d(findViewById6, ea.a.p("IWknd1pmH24sVg9lQ0IuSVwoAC4gZBhzEWwUYyVfIGcIditlAyk=", "6dWBtvnH"));
            this.f27103g = findViewById6;
            view.setOnClickListener(new pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.a(1, this, choosePDFAdapter));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChoosePDFAdapter(Context context, cg.l<? super PdfPreviewEntity, tf.d> lVar) {
        kotlin.jvm.internal.g.e(context, ea.a.p("UG8ldBZ4dA==", "fL0MuNsG"));
        ea.a.p("LGxYYxJDVmw2Yitjaw==", "JFLOm4pz");
        this.f27092d = context;
        this.f27093e = lVar;
        this.f27094f = kotlin.a.a(new cg.a<SimpleDateFormat>() { // from class: pdf.pdfreader.viewer.editor.free.ui.adapter.ChoosePDFAdapter$simpleDateFormat$2
            {
                super(0);
            }

            @Override // cg.a
            public final SimpleDateFormat invoke() {
                return new SimpleDateFormat(ea.a.p("Ak0eZB0vTnkjeQ==", "hgfBQQzx"), ChoosePDFAdapter.this.f27092d.getResources().getConfiguration().locale);
            }
        });
        this.f27095g = kotlin.a.a(new cg.a<List<PdfPreviewEntity>>() { // from class: pdf.pdfreader.viewer.editor.free.ui.adapter.ChoosePDFAdapter$pdfFiles$2
            @Override // cg.a
            public final List<PdfPreviewEntity> invoke() {
                return new ArrayList();
            }
        });
        this.f27096h = -1L;
        this.f27097i = "";
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return h().size();
    }

    public final List<PdfPreviewEntity> h() {
        return (List) this.f27095g.getValue();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(a aVar, int i10) {
        String name;
        a holder = aVar;
        kotlin.jvm.internal.g.e(holder, "holder");
        PdfPreviewEntity pdfPreviewEntity = (PdfPreviewEntity) kotlin.collections.m.t0(i10, h());
        if (pdfPreviewEntity != null) {
            try {
                String path = pdfPreviewEntity.getPath();
                kotlin.jvm.internal.g.d(path, ea.a.p("H24DaQZ5ZHApdGg=", "J7zwrJkL"));
                name = aj.b.O(path);
            } catch (Exception unused) {
                name = pdfPreviewEntity.getName();
                kotlin.jvm.internal.g.d(name, ea.a.p("SAprIFMgQiBSIBQgSSB2IGQgV24yaTd5Z24LbT8KeiATIGsgUyBCIFIgfQ==", "IjZZPGaL"));
            }
            SpannableString spannableString = new SpannableString(name);
            String str = this.f27097i;
            Locale locale = Locale.ROOT;
            String f10 = a6.h.f("C08LVA==", "qXYDcPfX", locale, str, locale);
            kotlin.jvm.internal.g.d(f10, ea.a.p("R2gic1NhESAYYUJhR2w3biMuYXQ0aS1nSy4lbytvOGVBQypzFigObxFhWGUp", "bQgOIaAF"));
            ea.a.p("G08jVA==", "r8IlqLII");
            String lowerCase = name.toLowerCase(locale);
            kotlin.jvm.internal.g.d(lowerCase, ea.a.p("O2hYc1lhRCAwYTxhW2wJblIuPXQ3aQtnUS4ubwBvOWU9Q1BzHChbbzlhJmUp", "238FxZLN"));
            int V = kotlin.text.k.V(lowerCase, f10, 0, false, 6);
            Context context = this.f27092d;
            if (V >= 0) {
                spannableString.setSpan(new BackgroundColorSpan(androidx.core.content.a.getColor(context, R.color.color_99F4443C)), V, f10.length() + V, 33);
            }
            holder.f27100d.setText(spannableString);
            String format = ((SimpleDateFormat) this.f27094f.getValue()).format(Long.valueOf(pdfPreviewEntity.getDate()));
            pdfPreviewEntity.getPath();
            holder.f27102f.setText(androidx.activity.f.m(format, " · ", pdf.pdfreader.viewer.editor.free.utils.v.t(context, pdfPreviewEntity.getSize())));
            holder.f27099b.setImageResource(pdfPreviewEntity.getId() == this.f27096h ? R.drawable.ic_single_selected : R.drawable.ic_split_unselected);
            holder.f27103g.setVisibility(pdfPreviewEntity.getId() == this.f27096h ? 0 : 8);
            holder.f27101e.setVisibility(pdfPreviewEntity.getFavorite() != 1 ? 8 : 0);
            aj.b.U(holder.c, pdfPreviewEntity.getPath(), pdfPreviewEntity.isOtherBoolOne(), pdfPreviewEntity.getOtherStrOne());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final a onCreateViewHolder(ViewGroup parent, int i10) {
        kotlin.jvm.internal.g.e(parent, "parent");
        View i11 = androidx.activity.f.i(parent, R.layout.item_choose_pdf_file, parent, false);
        kotlin.jvm.internal.g.d(i11, ea.a.p("KXJebVFwVnI_bj4uFm8GdFB4GilraQtmr4DIXxdkMl8paV1lVSBHYShlJHRZIA5hWXMLKQ==", "Ah3PMngT"));
        return new a(this, i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(a aVar, int i10, List payloads) {
        a holder = aVar;
        kotlin.jvm.internal.g.e(holder, "holder");
        kotlin.jvm.internal.g.e(payloads, "payloads");
        if (payloads.isEmpty()) {
            super.onBindViewHolder(holder, i10, payloads);
            return;
        }
        PdfPreviewEntity pdfPreviewEntity = (PdfPreviewEntity) kotlin.collections.m.t0(i10, h());
        if (pdfPreviewEntity != null) {
            holder.f27099b.setImageResource(pdfPreviewEntity.getId() == this.f27096h ? R.drawable.ic_single_selected : R.drawable.ic_split_unselected);
            holder.f27103g.setVisibility(pdfPreviewEntity.getId() == this.f27096h ? 0 : 8);
        }
    }
}

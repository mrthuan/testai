package pdf.pdfreader.viewer.editor.free.ui.widget.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.m;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.ui.widget.act.ReaderEditChooserActivity;
import pdf.pdfreader.viewer.editor.free.utils.v;

/* compiled from: EditPdfChooserAdapter.kt */
/* loaded from: classes3.dex */
public final class a extends RecyclerView.Adapter<C0356a> {

    /* renamed from: d  reason: collision with root package name */
    public final Context f28340d;

    /* renamed from: e  reason: collision with root package name */
    public final b f28341e;

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList f28342f;

    /* renamed from: g  reason: collision with root package name */
    public PdfPreviewEntity f28343g;

    /* renamed from: h  reason: collision with root package name */
    public SimpleDateFormat f28344h;

    /* renamed from: i  reason: collision with root package name */
    public RecyclerView f28345i;

    /* compiled from: EditPdfChooserAdapter.kt */
    /* renamed from: pdf.pdfreader.viewer.editor.free.ui.widget.adapter.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public final class C0356a extends RecyclerView.b0 {

        /* renamed from: h  reason: collision with root package name */
        public static final /* synthetic */ int f28346h = 0;

        /* renamed from: b  reason: collision with root package name */
        public final TextView f28347b;
        public final ImageView c;

        /* renamed from: d  reason: collision with root package name */
        public final ImageView f28348d;

        /* renamed from: e  reason: collision with root package name */
        public final TextView f28349e;

        /* renamed from: f  reason: collision with root package name */
        public final ImageView f28350f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ a f28351g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0356a(a aVar, View view) {
            super(view);
            ea.a.p("WnQubSVpB3c=", "G4AKbOSv");
            this.f28351g = aVar;
            View findViewById = view.findViewById(R.id.root);
            kotlin.jvm.internal.g.d(findViewById, ea.a.p("JnRUbS9pUnd0ZiNuEVYBZUJCF0khKDcuPmRXchlvDCk=", "JN3vWyvx"));
            View findViewById2 = view.findViewById(R.id.item_name);
            kotlin.jvm.internal.g.d(findViewById2, ea.a.p("WnQubSVpB3dcZl1uDVY_ZTNCS0kiKBEuX2R9aQ5lHV9dYSZlKQ==", "6SzpTHxA"));
            this.f28347b = (TextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.item_icon);
            kotlin.jvm.internal.g.d(findViewById3, ea.a.p("WnQubSVpB3dcZl1uDVY_ZTNCS0kiKBEuJWRsaRplLl9aYyRuKQ==", "LBnCsJSZ"));
            this.c = (ImageView) findViewById3;
            View findViewById4 = view.findViewById(R.id.item_pdf_ck);
            kotlin.jvm.internal.g.d(findViewById4, ea.a.p("WnQubSVpB3dcZl1uDVY_ZTNCS0kiKBEuWmRDaRVlL19DZC1fEGsp", "3maBwzyg"));
            this.f28348d = (ImageView) findViewById4;
            View findViewById5 = view.findViewById(R.id.item_date);
            kotlin.jvm.internal.g.d(findViewById5, ea.a.p("WnQubSVpB3dcZl1uDVY_ZTNCS0kiKBEuAWRCaRplW19XYT9lKQ==", "hln6vd5M"));
            this.f28349e = (TextView) findViewById5;
            View findViewById6 = view.findViewById(R.id.item_book);
            kotlin.jvm.internal.g.d(findViewById6, ea.a.p("JnRUbS9pUnd0ZiNuEVYBZUJCF0khKDcuAWRbaSxlIl8tb15rKQ==", "JcAFhuXO"));
            this.f28350f = (ImageView) findViewById6;
            ((ConstraintLayout) findViewById).setOnClickListener(new pdf.pdfreader.viewer.editor.free.feature.ocr.ui.adapter.e(6, this, aVar));
        }
    }

    /* compiled from: EditPdfChooserAdapter.kt */
    /* loaded from: classes3.dex */
    public interface b {
        void E0(PdfPreviewEntity pdfPreviewEntity);

        void a(int i10);
    }

    public a(ReaderEditChooserActivity readerEditChooserActivity, ReaderEditChooserActivity readerEditChooserActivity2) {
        kotlin.jvm.internal.g.e(readerEditChooserActivity, ea.a.p("IkNebg1lT3Q=", "oCNgRL2u"));
        kotlin.jvm.internal.g.e(readerEditChooserActivity2, ea.a.p("I2lCdBxuUnI=", "eWcAZ32v"));
        this.f28340d = readerEditChooserActivity;
        this.f28341e = readerEditChooserActivity2;
        this.f28342f = new ArrayList();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f28342f.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        kotlin.jvm.internal.g.e(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.f28345i = recyclerView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(C0356a c0356a, int i10) {
        String format;
        C0356a holder = c0356a;
        kotlin.jvm.internal.g.e(holder, "holder");
        PdfPreviewEntity pdfPreviewEntity = (PdfPreviewEntity) m.t0(i10, this.f28342f);
        if (pdfPreviewEntity != null) {
            Context context = holder.itemView.getContext();
            pdf.pdfreader.viewer.editor.free.utils.extension.b.a(holder.f28347b, pdfPreviewEntity.getName(), pdfPreviewEntity.getPath());
            int favorite = pdfPreviewEntity.getFavorite();
            ImageView imageView = holder.f28350f;
            if (favorite == 1) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(4);
            }
            SimpleDateFormat simpleDateFormat = this.f28344h;
            if (simpleDateFormat == null || (format = simpleDateFormat.format(Long.valueOf(pdfPreviewEntity.getDate()))) == null) {
                SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(ea.a.p("fk1kZBcvG3kLeQ==", "EWmDA7AS"), this.f28340d.getResources().getConfiguration().locale);
                this.f28344h = simpleDateFormat2;
                format = simpleDateFormat2.format(Long.valueOf(pdfPreviewEntity.getDate()));
            }
            pdfPreviewEntity.getPath();
            holder.f28349e.setText(androidx.activity.f.m(format, " · ", v.t(context, pdfPreviewEntity.getSize())));
            aj.b.V(holder.c, pdfPreviewEntity.isOtherBoolOne());
            boolean a10 = kotlin.jvm.internal.g.a(this.f28343g, pdfPreviewEntity);
            ImageView imageView2 = holder.f28348d;
            if (a10) {
                imageView2.setImageResource(R.mipmap.ic_single_selected);
            } else {
                imageView2.setImageResource(R.mipmap.ic_single_unselected);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final C0356a onCreateViewHolder(ViewGroup parent, int i10) {
        kotlin.jvm.internal.g.e(parent, "parent");
        View inflate = LayoutInflater.from(this.f28340d).inflate(R.layout.item_edit_pdf_chooser, parent, false);
        kotlin.jvm.internal.g.d(inflate, ea.a.p("KXJebVFtdG80dC94ASlGaVtmAmExZU1StIDMZg1jD28gc1RyVSBHYShlJHRZIA5hWXMLKQ==", "fvtmVjRg"));
        return new C0356a(this, inflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        kotlin.jvm.internal.g.e(recyclerView, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
        this.f28345i = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(C0356a c0356a, int i10, List payloads) {
        C0356a holder = c0356a;
        kotlin.jvm.internal.g.e(holder, "holder");
        kotlin.jvm.internal.g.e(payloads, "payloads");
        if (payloads.size() == 0) {
            super.onBindViewHolder(holder, i10, payloads);
            return;
        }
        PdfPreviewEntity pdfPreviewEntity = (PdfPreviewEntity) m.t0(i10, this.f28342f);
        if (pdfPreviewEntity != null) {
            boolean a10 = kotlin.jvm.internal.g.a(this.f28343g, pdfPreviewEntity);
            ImageView imageView = holder.f28348d;
            if (a10) {
                imageView.setImageResource(R.mipmap.ic_single_selected);
            } else {
                imageView.setImageResource(R.mipmap.ic_single_unselected);
            }
        }
    }
}

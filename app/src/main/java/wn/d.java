package wn;

import android.text.TextUtils;
import android.widget.Filter;
import android.widget.Filterable;
import java.util.ArrayList;
import java.util.List;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;

/* compiled from: SearchFilter.java */
/* loaded from: classes3.dex */
public final class d implements Filterable {

    /* renamed from: a  reason: collision with root package name */
    public a f31398a = null;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<PdfPreviewEntity> f31399b;
    public final b c;

    /* compiled from: SearchFilter.java */
    /* loaded from: classes3.dex */
    public class a extends Filter {

        /* renamed from: a  reason: collision with root package name */
        public final List<PdfPreviewEntity> f31400a;

        /* renamed from: b  reason: collision with root package name */
        public final b f31401b;

        public a(ArrayList arrayList, b bVar) {
            this.f31400a = new ArrayList();
            this.f31400a = arrayList;
            this.f31401b = bVar;
        }

        @Override // android.widget.Filter
        public final Filter.FilterResults performFiltering(CharSequence charSequence) {
            Filter.FilterResults filterResults = new Filter.FilterResults();
            boolean isEmpty = TextUtils.isEmpty(charSequence);
            List<PdfPreviewEntity> list = this.f31400a;
            if (isEmpty) {
                filterResults.values = list;
                filterResults.count = list.size();
            } else {
                ArrayList arrayList = new ArrayList();
                for (PdfPreviewEntity pdfPreviewEntity : list) {
                    if (pdfPreviewEntity.getName().toLowerCase().contains(charSequence.toString().toLowerCase())) {
                        arrayList.add(pdfPreviewEntity);
                    }
                }
                filterResults.values = arrayList;
                filterResults.count = arrayList.size();
            }
            return filterResults;
        }

        @Override // android.widget.Filter
        public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
            b bVar = this.f31401b;
            if (bVar != null) {
                bVar.l1((ArrayList) filterResults.values);
            }
        }
    }

    /* compiled from: SearchFilter.java */
    /* loaded from: classes3.dex */
    public interface b {
        void l1(ArrayList<PdfPreviewEntity> arrayList);
    }

    public d(ArrayList<PdfPreviewEntity> arrayList, b bVar) {
        this.f31399b = new ArrayList<>();
        this.f31399b = arrayList;
        this.c = bVar;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.f31398a == null) {
            this.f31398a = new a(this.f31399b, this.c);
        }
        return this.f31398a;
    }
}

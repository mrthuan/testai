package pdf.pdfreader.viewer.editor.free.ui.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.split.SplitPdfData;
import pdf.pdfreader.viewer.editor.free.ui.adapter.a0;

/* compiled from: SplitResultAdapter.kt */
/* loaded from: classes3.dex */
public final class a0 extends RecyclerView.Adapter<b> {

    /* renamed from: d  reason: collision with root package name */
    public final Context f27113d;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList f27114e;

    /* renamed from: f  reason: collision with root package name */
    public a f27115f;

    /* compiled from: SplitResultAdapter.kt */
    /* loaded from: classes3.dex */
    public interface a {
        void f(SplitPdfData splitPdfData, int i10);

        void j(SplitPdfData splitPdfData);
    }

    /* compiled from: SplitResultAdapter.kt */
    /* loaded from: classes3.dex */
    public final class b extends RecyclerView.b0 {

        /* renamed from: b  reason: collision with root package name */
        public final ImageView f27116b;
        public final TextView c;

        /* renamed from: d  reason: collision with root package name */
        public final TextView f27117d;

        /* renamed from: e  reason: collision with root package name */
        public final ImageView f27118e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(View view) {
            super(view);
            ea.a.p("JnQ0bRxpC3c=", "7kOQJnxK");
            View findViewById = view.findViewById(R.id.item_icon);
            kotlin.jvm.internal.g.d(findViewById, ea.a.p("JnRUbS9pUnd0ZiNuEVYBZUJCF0khKDcuMWRCaThlJl8mY15uKQ==", "xkblXlLK"));
            this.f27116b = (ImageView) findViewById;
            View findViewById2 = view.findViewById(R.id.pdf_name);
            kotlin.jvm.internal.g.d(findViewById2, ea.a.p("WnQubSVpB3dcZl1uDVY_ZTNCS0kiKBEuG2RkcFxmMm5SbS4p", "rJ8mToYS"));
            this.c = (TextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.pdf_pages);
            kotlin.jvm.internal.g.d(findViewById3, ea.a.p("JnRUbS9pUnd0ZiNuEVYBZUJCF0khKDcuDGRncDNmFHAuZ1RzKQ==", "W3IweIWK"));
            this.f27117d = (TextView) findViewById3;
            View findViewById4 = view.findViewById(R.id.pdf_remove);
            kotlin.jvm.internal.g.d(findViewById4, ea.a.p("WnQubSVpB3dcZl1uDVY_ZTNCS0kiKBEuMWRpcFJmHHJWbSR2Fik=", "XG6CsuaU"));
            this.f27118e = (ImageView) findViewById4;
        }
    }

    public a0(Context context) {
        ea.a.p("LG9fdBx4dA==", "WbrUeJoh");
        this.f27113d = context;
        this.f27114e = new ArrayList();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f27114e.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(b bVar, final int i10) {
        String pageText;
        b holder = bVar;
        kotlin.jvm.internal.g.e(holder, "holder");
        final SplitPdfData splitPdfData = (SplitPdfData) this.f27114e.get(i10);
        String fileName = splitPdfData.getFileName();
        TextView textView = holder.c;
        textView.setText(fileName);
        if (TextUtils.isEmpty(splitPdfData.getPageText())) {
            StringBuilder sb2 = new StringBuilder();
            Iterator<Integer> it = splitPdfData.getPageList().iterator();
            if (it.hasNext()) {
                sb2.append(" ");
                sb2.append(it.next().intValue() + 1);
            }
            while (it.hasNext()) {
                sb2.append(ea.a.p("LA==", "oZtdZt2w"));
                sb2.append(" ");
                sb2.append(it.next().intValue() + 1);
            }
            pageText = "Pages:" + ((Object) sb2);
            splitPdfData.setPageText(pageText);
        } else {
            pageText = splitPdfData.getPageText();
        }
        holder.f27117d.setText(pageText);
        pdf.pdfreader.viewer.editor.free.utils.extension.g.e(textView, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.adapter.SplitResultAdapter$onBindViewHolder$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(View view) {
                invoke2(view);
                return tf.d.f30009a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View it2) {
                kotlin.jvm.internal.g.e(it2, "it");
                a0.a aVar = a0.this.f27115f;
                if (aVar != null) {
                    aVar.j(splitPdfData);
                }
            }
        });
        pdf.pdfreader.viewer.editor.free.utils.extension.g.e(holder.f27118e, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.adapter.SplitResultAdapter$onBindViewHolder$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(View view) {
                invoke2(view);
                return tf.d.f30009a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View it2) {
                kotlin.jvm.internal.g.e(it2, "it");
                a0.a aVar = a0.this.f27115f;
                if (aVar != null) {
                    aVar.f(splitPdfData, i10);
                }
            }
        });
        aj.b.V(holder.f27116b, false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final b onCreateViewHolder(ViewGroup parent, int i10) {
        kotlin.jvm.internal.g.e(parent, "parent");
        View inflate = LayoutInflater.from(this.f27113d).inflate(R.layout.item_split_result, parent, false);
        kotlin.jvm.internal.g.d(inflate, ea.a.p("KXJebVFjWG4uZTJ0XC4BblNsD3QgKDcuoIDNaTpfNGU8dV10VSBHYShlJHRZIA5hWXMLKQ==", "cU2YBkNF"));
        return new b(inflate);
    }
}

package pdf.pdfreader.viewer.editor.free.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.List;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.bean.DataBridge;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.merge.MergePdfData;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderMergePdfActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.tools.ToolsType;
import pdf.pdfreader.viewer.editor.free.ui.adapter.MergePdfAdapter;
import pdf.pdfreader.viewer.editor.free.utils.n0;

/* compiled from: MergePdfAdapter.kt */
/* loaded from: classes3.dex */
public final class MergePdfAdapter extends RecyclerView.Adapter<MergePdfViewHolder> implements ep.a {

    /* renamed from: d  reason: collision with root package name */
    public final Context f27104d;

    /* renamed from: e  reason: collision with root package name */
    public final a f27105e;

    /* renamed from: f  reason: collision with root package name */
    public final List<MergePdfData> f27106f;

    /* renamed from: g  reason: collision with root package name */
    public SimpleDateFormat f27107g;

    /* renamed from: h  reason: collision with root package name */
    public androidx.recyclerview.widget.r f27108h;

    /* compiled from: MergePdfAdapter.kt */
    /* loaded from: classes3.dex */
    public final class MergePdfViewHolder extends RecyclerView.b0 {

        /* renamed from: b  reason: collision with root package name */
        public final TextView f27109b;
        public final ImageView c;

        /* renamed from: d  reason: collision with root package name */
        public final TextView f27110d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MergePdfViewHolder(final MergePdfAdapter mergePdfAdapter, View view) {
            super(view);
            ea.a.p("WnQubSVpB3c=", "v9iBqaRe");
            View findViewById = view.findViewById(R.id.item_name);
            kotlin.jvm.internal.g.d(findViewById, ea.a.p("CnQhbWFpMXdmZg9uUFY-ZU9CK0ktKGQuHWRfaSVlL18NYSllKQ==", "BccD7Tzl"));
            this.f27109b = (TextView) findViewById;
            View findViewById2 = view.findViewById(R.id.item_icon);
            kotlin.jvm.internal.g.d(findViewById2, ea.a.p("BnQWbQBpXHdmZg9uUFY-ZU9CK0ktKGQuHWRfaSVlL18GYxxuKQ==", "WdosV9Yw"));
            this.c = (ImageView) findViewById2;
            View findViewById3 = view.findViewById(R.id.item_date);
            kotlin.jvm.internal.g.d(findViewById3, ea.a.p("WnQubSVpB3dcZl1uDVY_ZTNCS0kiKBEuAGR0aTFlDF9XYT9lKQ==", "iZEaMrvk"));
            this.f27110d = (TextView) findViewById3;
            View findViewById4 = view.findViewById(R.id.item_book);
            kotlin.jvm.internal.g.d(findViewById4, ea.a.p("WnQubSVpB3dcZl1uDVY_ZTNCS0kiKBEuWWRcaRllJ19RbyRrKQ==", "0rmJwLWt"));
            ImageView imageView = (ImageView) findViewById4;
            View findViewById5 = view.findViewById(R.id.item_pdf_remove);
            kotlin.jvm.internal.g.d(findViewById5, ea.a.p("WnQubSVpB3dcZl1uDVY_ZTNCS0kiPBVpUHdRKCsuKGQdaT9lHl8SZBRfRmUEbyBlKQ==", "5oyA1FHc"));
            pdf.pdfreader.viewer.editor.free.utils.extension.g.e(findViewById5, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.adapter.MergePdfAdapter.MergePdfViewHolder.1
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
                    Integer valueOf = Integer.valueOf(MergePdfViewHolder.this.getAdapterPosition());
                    MergePdfAdapter mergePdfAdapter2 = mergePdfAdapter;
                    int intValue = valueOf.intValue();
                    boolean z10 = false;
                    if (intValue >= 0 && intValue < mergePdfAdapter2.getItemCount()) {
                        z10 = true;
                    }
                    if (!z10) {
                        valueOf = null;
                    }
                    if (valueOf != null) {
                        MergePdfAdapter mergePdfAdapter3 = mergePdfAdapter;
                        int intValue2 = valueOf.intValue();
                        ToolsType toolsType = DataBridge.f24029a;
                        DataBridge.c = true;
                        mergePdfAdapter3.f27105e.g0(intValue2);
                        mergePdfAdapter3.f27105e.a(mergePdfAdapter3.f27106f.size());
                    }
                }
            });
            view.findViewById(R.id.item_drag_iv).setOnTouchListener(new View.OnTouchListener(this) { // from class: pdf.pdfreader.viewer.editor.free.ui.adapter.k

                /* renamed from: b  reason: collision with root package name */
                public final /* synthetic */ MergePdfAdapter.MergePdfViewHolder f27258b;

                {
                    this.f27258b = this;
                }

                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    String p10 = ea.a.p("O2hYc10w", "MLRVt1wG");
                    MergePdfAdapter mergePdfAdapter2 = mergePdfAdapter;
                    kotlin.jvm.internal.g.e(mergePdfAdapter2, p10);
                    String p11 = ea.a.p("O2hYc10x", "gysCXsZe");
                    MergePdfAdapter.MergePdfViewHolder mergePdfViewHolder = this.f27258b;
                    kotlin.jvm.internal.g.e(mergePdfViewHolder, p11);
                    if (motionEvent.getActionMasked() == 0) {
                        androidx.recyclerview.widget.r rVar = mergePdfAdapter2.f27108h;
                        if (rVar != null) {
                            rVar.t(mergePdfViewHolder);
                        }
                    } else if (mergePdfAdapter2.f27108h == null) {
                        view2.performClick();
                        return true;
                    }
                    return false;
                }
            });
        }
    }

    /* compiled from: MergePdfAdapter.kt */
    /* loaded from: classes3.dex */
    public interface a {
        void a(int i10);

        void g0(int i10);
    }

    public MergePdfAdapter(ReaderMergePdfActivity readerMergePdfActivity, ReaderMergePdfActivity readerMergePdfActivity2) {
        kotlin.jvm.internal.g.e(readerMergePdfActivity, ea.a.p("XkMkbgdlGnQ=", "CYe148Q5"));
        kotlin.jvm.internal.g.e(readerMergePdfActivity2, ea.a.p("I2lCdBxuUnI=", "MlkAEBjG"));
        this.f27104d = readerMergePdfActivity;
        this.f27105e = readerMergePdfActivity2;
        this.f27106f = DataBridge.a();
    }

    @Override // ep.a
    public final void d(int i10, int i11) {
        DataBridge.f24030b = true;
        String str = n0.f28727a;
        List<MergePdfData> list = this.f27106f;
        if (i10 < i11) {
            int i12 = i10;
            while (i12 < i11) {
                int i13 = i12 + 1;
                Collections.swap(list, i12, i13);
                i12 = i13;
            }
        } else {
            int i14 = i11 + 1;
            if (i14 <= i10) {
                int i15 = i10;
                while (true) {
                    int i16 = i15 - 1;
                    Collections.swap(list, i15, i16);
                    if (i15 == i14) {
                        break;
                    }
                    i15 = i16;
                }
            }
        }
        notifyItemMoved(i10, i11);
    }

    @Override // ep.a
    public final void f() {
        String str = n0.f28727a;
    }

    @Override // ep.a
    public final void g() {
        String str = n0.f28727a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f27106f.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(MergePdfViewHolder mergePdfViewHolder, int i10) {
        String format;
        MergePdfViewHolder holder = mergePdfViewHolder;
        kotlin.jvm.internal.g.e(holder, "holder");
        MergePdfData mergePdfData = (MergePdfData) kotlin.collections.m.t0(i10, this.f27106f);
        if (mergePdfData != null) {
            Context context = holder.itemView.getContext();
            PdfPreviewEntity pdf2 = mergePdfData.getPdf();
            holder.itemView.setOnClickListener(new j(0, this, pdf2));
            pdf.pdfreader.viewer.editor.free.utils.extension.b.a(holder.f27109b, pdf2.getName(), pdf2.getPath());
            SimpleDateFormat simpleDateFormat = this.f27107g;
            if (simpleDateFormat == null || (format = simpleDateFormat.format(Long.valueOf(pdf2.getDate()))) == null) {
                SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(ea.a.p("C016ZDwvKXkxeQ==", "qIFUXPLT"), this.f27104d.getResources().getConfiguration().locale);
                this.f27107g = simpleDateFormat2;
                format = simpleDateFormat2.format(Long.valueOf(pdf2.getDate()));
            }
            pdf2.getPath();
            holder.f27110d.setText(androidx.activity.f.m(format, " · ", pdf.pdfreader.viewer.editor.free.utils.v.t(context, pdf2.getSize())));
            aj.b.V(holder.c, pdf2.isOtherBoolOne());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final MergePdfViewHolder onCreateViewHolder(ViewGroup parent, int i10) {
        kotlin.jvm.internal.g.e(parent, "parent");
        View inflate = LayoutInflater.from(this.f27104d).inflate(R.layout.item_merge_pdf, parent, false);
        kotlin.jvm.internal.g.d(inflate, ea.a.p("KXJebVFtdG80dC94ASlGaVtmAmExZU1SqIDKbQtyPWUQcFVmVSBHYShlJHRZIA5hWXMLKQ==", "UV8bJlnZ"));
        return new MergePdfViewHolder(this, inflate);
    }
}

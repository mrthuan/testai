package pdf.pdfreader.viewer.editor.free.ui.dialog;

import android.content.Context;
import android.content.ContextWrapper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.ui.dialog.PdfReaderOpenDefaultDialog;
import pdf.pdfreader.viewer.editor.free.ui.dialog.a3;
import pdf.pdfreader.viewer.editor.free.utils.ReaderWrapContentLinearLayoutManager;

/* compiled from: SettingDefaultOpenWaysDialog.java */
/* loaded from: classes3.dex */
public final class a3 extends oo.g {
    public static final /* synthetic */ int A = 0;

    /* renamed from: y  reason: collision with root package name */
    public ArrayList f27492y;

    /* renamed from: z  reason: collision with root package name */
    public ro.b<c, PdfReaderOpenClearDialog> f27493z;

    /* compiled from: SettingDefaultOpenWaysDialog.java */
    /* loaded from: classes3.dex */
    public static class a extends RecyclerView.Adapter<b> {

        /* renamed from: d  reason: collision with root package name */
        public final List<c> f27494d;

        /* renamed from: e  reason: collision with root package name */
        public final ro.b<Integer, PdfReaderOpenClearDialog> f27495e;

        public a(List list, d9.g gVar) {
            this.f27494d = list;
            this.f27495e = gVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return this.f27494d.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(b bVar, final int i10) {
            int i11;
            b bVar2 = bVar;
            final c cVar = this.f27494d.get(i10);
            bVar2.f27496b.setText(cVar.f27499b);
            int i12 = 0;
            if (cVar.a()) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            bVar2.c.setVisibility(i11);
            if (cVar.a()) {
                i12 = 8;
            }
            bVar2.f27497d.setVisibility(i12);
            bVar2.itemView.setOnClickListener(new View.OnClickListener() { // from class: pdf.pdfreader.viewer.editor.free.ui.dialog.y2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    final a3.a aVar = a3.a.this;
                    aVar.getClass();
                    a3.c cVar2 = cVar;
                    if (cVar2.a()) {
                        aj.b.W(view.getContext().getString(R.string.arg_res_0x7f130469), view.getContext().getApplicationContext(), false, 0);
                        return;
                    }
                    tn.a.d(view.getContext(), ea.a.p("PGVFdBBuZw==", "PX3IsxKw"), ea.a.p("QGU_dBpuBV8WZVJhHGwiXydsW2Nr", "5ub48B31"), cVar2.f27499b.toLowerCase(Locale.ROOT), false);
                    PdfReaderOpenDefaultDialog.a aVar2 = PdfReaderOpenDefaultDialog.J;
                    aVar2.getClass();
                    int i13 = cVar2.f27498a;
                    if (!TextUtils.isEmpty(PdfReaderOpenDefaultDialog.a.c((ContextWrapper) ReaderPdfApplication.m(), i13))) {
                        PdfReaderOpenClearDialog pdfReaderOpenClearDialog = new PdfReaderOpenClearDialog(view.getContext(), i13);
                        final int i14 = i10;
                        pdfReaderOpenClearDialog.K = new ro.b() { // from class: pdf.pdfreader.viewer.editor.free.ui.dialog.z2
                            @Override // ro.b
                            public final void d(Object obj, Object obj2) {
                                PdfReaderOpenClearDialog pdfReaderOpenClearDialog2 = (PdfReaderOpenClearDialog) obj2;
                                a3.a aVar3 = a3.a.this;
                                aVar3.getClass();
                                boolean booleanValue = ((Boolean) obj).booleanValue();
                                ro.b<Integer, PdfReaderOpenClearDialog> bVar3 = aVar3.f27495e;
                                if (booleanValue) {
                                    if (bVar3 != null) {
                                        bVar3.d(Integer.valueOf(i14), pdfReaderOpenClearDialog2);
                                    }
                                } else if (bVar3 != null) {
                                    bVar3.d(-1, null);
                                }
                            }
                        };
                        pdfReaderOpenClearDialog.show();
                        return;
                    }
                    ro.b<Integer, PdfReaderOpenClearDialog> bVar3 = aVar.f27495e;
                    if (bVar3 != null) {
                        bVar3.d(-1, null);
                    }
                    aVar2.getClass();
                    PdfReaderOpenDefaultDialog.L = i13;
                    PdfReaderOpenDefaultDialog.a.h(view.getContext(), i13, ea.a.p("AmV0", "bIqys8e6"));
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final b onCreateViewHolder(ViewGroup viewGroup, int i10) {
            return new b(androidx.activity.f.i(viewGroup, R.layout.item_default_open_way, viewGroup, false));
        }
    }

    /* compiled from: SettingDefaultOpenWaysDialog.java */
    /* loaded from: classes3.dex */
    public static class b extends RecyclerView.b0 {

        /* renamed from: b  reason: collision with root package name */
        public final TextView f27496b;
        public final ImageView c;

        /* renamed from: d  reason: collision with root package name */
        public final TextView f27497d;

        public b(View view) {
            super(view);
            this.c = (ImageView) view.findViewById(R.id.ivOpenWay);
            this.f27496b = (TextView) view.findViewById(R.id.tvOpenWay);
            this.f27497d = (TextView) view.findViewById(R.id.tvSetOpenWay);
        }
    }

    /* compiled from: SettingDefaultOpenWaysDialog.java */
    /* loaded from: classes3.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final int f27498a;

        /* renamed from: b  reason: collision with root package name */
        public final String f27499b;

        public c(int i10, String str) {
            this.f27498a = i10;
            this.f27499b = str;
        }

        public final boolean a() {
            Context m10 = ReaderPdfApplication.m();
            PdfReaderOpenDefaultDialog.J.getClass();
            return TextUtils.equals(m10.getPackageName(), PdfReaderOpenDefaultDialog.a.c((ContextWrapper) m10, this.f27498a));
        }
    }

    @Override // oo.g
    public final boolean A() {
        return true;
    }

    @Override // oo.g
    public final boolean B() {
        return true;
    }

    @Override // oo.g
    public final int w() {
        return R.layout.dialog_default_open_ways;
    }

    @Override // oo.g
    public final void z() {
        View x4 = x();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new c(1, ea.a.p("H0RG", "zNLwwnzV")));
        arrayList.add(new c(3, ea.a.p("d08IWA==", "nnQPK0WT")));
        arrayList.add(new c(2, ea.a.p("C09D", "PRj8Gnyv")));
        arrayList.add(new c(5, ea.a.p("F0xiWA==", "jC42tATz")));
        arrayList.add(new c(4, ea.a.p("F0xT", "zABUXzxG")));
        arrayList.add(new c(7, ea.a.p("YVA5WA==", "WE1mR9bq")));
        arrayList.add(new c(6, ea.a.p("Y1BU", "csaEFMGl")));
        this.f27492y = arrayList;
        RecyclerView recyclerView = (RecyclerView) x4.findViewById(R.id.recyclerView);
        getContext();
        recyclerView.setLayoutManager(new ReaderWrapContentLinearLayoutManager());
        recyclerView.setAdapter(new a(this.f27492y, new d9.g(this, 18)));
    }
}

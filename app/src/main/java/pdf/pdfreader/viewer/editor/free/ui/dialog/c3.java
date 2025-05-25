package pdf.pdfreader.viewer.editor.free.ui.dialog;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ui.dialog.c3;
import pdf.pdfreader.viewer.editor.free.utils.ReaderWrapContentLinearLayoutManager;

/* compiled from: SettingNightModeDialog.java */
/* loaded from: classes3.dex */
public final class c3 extends oo.g {

    /* renamed from: y  reason: collision with root package name */
    public ro.a<Integer> f27514y;

    /* compiled from: SettingNightModeDialog.java */
    /* loaded from: classes3.dex */
    public static class a extends RecyclerView.Adapter<c> {

        /* renamed from: d  reason: collision with root package name */
        public final List<b> f27515d;

        /* renamed from: e  reason: collision with root package name */
        public int f27516e;

        public a(ArrayList arrayList, int i10) {
            this.f27516e = 0;
            this.f27515d = arrayList;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (((b) arrayList.get(i11)).f27517a == i10) {
                    this.f27516e = i11;
                    return;
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return this.f27515d.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(c cVar, int i10) {
            int i11;
            c cVar2 = cVar;
            cVar2.f27519b.setText(this.f27515d.get(i10).f27518b);
            if (this.f27516e == i10) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            cVar2.c.setVisibility(i11);
            cVar2.itemView.setOnClickListener(new qb.j1(6, this, cVar2));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final c onCreateViewHolder(ViewGroup viewGroup, int i10) {
            return new c(androidx.activity.f.i(viewGroup, R.layout.item_change_theme, viewGroup, false));
        }
    }

    /* compiled from: SettingNightModeDialog.java */
    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f27517a;

        /* renamed from: b  reason: collision with root package name */
        public final String f27518b;

        public b(int i10, String str) {
            this.f27517a = i10;
            this.f27518b = str;
        }
    }

    /* compiled from: SettingNightModeDialog.java */
    /* loaded from: classes3.dex */
    public static class c extends RecyclerView.b0 {

        /* renamed from: b  reason: collision with root package name */
        public final TextView f27519b;
        public final ImageView c;

        public c(View view) {
            super(view);
            this.f27519b = (TextView) view.findViewById(R.id.tvThemeName);
            this.c = (ImageView) view.findViewById(R.id.ivThemeChoose);
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

    @Override // oo.g, android.app.Dialog
    public final void show() {
        super.show();
        tn.a.b(getContext(), ea.a.p("QGU_dBpuZw==", "jP0z0ymO"), ea.a.p("PGVFdBBuUF8uaC9tEF8baFp3", "mejdAXGc"));
    }

    @Override // oo.g
    public final int w() {
        return R.layout.dialog_change_nightmode;
    }

    @Override // oo.g
    public final void z() {
        View x4 = x();
        ArrayList arrayList = new ArrayList();
        String str = no.f.f22617h;
        arrayList.add(new b(0, getContext().getString(R.string.arg_res_0x7f1304c2)));
        arrayList.add(new b(no.f.f22626q, getContext().getString(R.string.arg_res_0x7f130260)));
        arrayList.add(new b(no.f.f22627r, getContext().getString(R.string.arg_res_0x7f130261)));
        RecyclerView recyclerView = (RecyclerView) x4.findViewById(R.id.recyclerView);
        getContext();
        recyclerView.setLayoutManager(new ReaderWrapContentLinearLayoutManager());
        no.f b10 = no.f.b(getContext());
        Context context = getContext();
        b10.getClass();
        final int a10 = no.f.a(context);
        final a aVar = new a(arrayList, a10);
        recyclerView.setAdapter(aVar);
        x4.findViewById(R.id.tv_ok).setOnClickListener(new View.OnClickListener() { // from class: pdf.pdfreader.viewer.editor.free.ui.dialog.b3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i10;
                String str2;
                String str3;
                c3 c3Var = c3.this;
                oo.a aVar2 = c3Var.f23542t;
                if (aVar2 != null) {
                    aVar2.a();
                }
                c3.a aVar3 = aVar;
                List<c3.b> list = aVar3.f27515d;
                if (list != null && aVar3.f27516e < list.size()) {
                    i10 = list.get(aVar3.f27516e).f27517a;
                } else {
                    i10 = 0;
                }
                if (i10 != a10) {
                    Context context2 = view.getContext();
                    String p10 = ea.a.p("QmUNdCpuZw==", "1w1yC9Wv");
                    String p11 = ea.a.p("PGVFdBBuUF8uaC9tEF8LaFRuCWU=", "QVxIujZy");
                    String str4 = no.f.f22617h;
                    if (i10 == 0) {
                        str2 = "IGUfYTtsdA==";
                        str3 = "eiDyNZ1q";
                    } else if (i10 == no.f.f22626q) {
                        str2 = "V2E5aw==";
                        str3 = "lBPKfNaH";
                    } else {
                        str2 = "I2lWaHQ=";
                        str3 = "hLuzIARb";
                    }
                    tn.a.d(context2, p10, p11, ea.a.p(str2, str3), false);
                    ro.a<Integer> aVar4 = c3Var.f27514y;
                    if (aVar4 != null) {
                        aVar4.o(Integer.valueOf(i10));
                    }
                }
                c3Var.dismiss();
            }
        });
    }
}

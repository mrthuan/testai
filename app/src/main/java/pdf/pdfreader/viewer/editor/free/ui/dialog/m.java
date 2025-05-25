package pdf.pdfreader.viewer.editor.free.ui.dialog;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ui.dialog.n;

/* compiled from: GalleryChooserPopu.kt */
/* loaded from: classes3.dex */
public final class m extends RecyclerView.Adapter<a> {

    /* renamed from: d  reason: collision with root package name */
    public String f27654d = "";

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList f27655e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public n.a f27656f;

    /* compiled from: GalleryChooserPopu.kt */
    /* loaded from: classes3.dex */
    public final class a extends RecyclerView.b0 {

        /* renamed from: f  reason: collision with root package name */
        public static final /* synthetic */ int f27657f = 0;

        /* renamed from: b  reason: collision with root package name */
        public final AppCompatImageView f27658b;
        public final View c;

        /* renamed from: d  reason: collision with root package name */
        public final AppCompatTextView f27659d;

        /* renamed from: e  reason: collision with root package name */
        public final AppCompatTextView f27660e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(m mVar, View view) {
            super(view);
            ea.a.p("JnRUbS9pUnc=", "2RVDRwG6");
            View findViewById = view.findViewById(R.id.itemIconIv);
            kotlin.jvm.internal.g.d(findViewById, ea.a.p("WnQubSVpB3dcZl1uDVY_ZTNCS0kiKBEuLWReaTNlDElQbyVJBSk=", "DpGagkZl"));
            this.f27658b = (AppCompatImageView) findViewById;
            View findViewById2 = view.findViewById(R.id.frameIv);
            kotlin.jvm.internal.g.d(findViewById2, ea.a.p("AXQCbTRpM3dmZg9uUFY-ZU9CK0ktKGQuHWRfZiNhL2Uhdik=", "nAhgbV7j"));
            this.c = findViewById2;
            View findViewById3 = view.findViewById(R.id.dirTv);
            kotlin.jvm.internal.g.d(findViewById3, ea.a.p("BnQrbTNpLXdmZg9uUFY-ZU9CK0ktKGQuHWRfZDhyFnYp", "3OoNeH2P"));
            this.f27659d = (AppCompatTextView) findViewById3;
            View findViewById4 = view.findViewById(R.id.countTv);
            kotlin.jvm.internal.g.d(findViewById4, ea.a.p("UHQzbRxpAXdmZg9uUFY-ZU9CK0ktKGQuHWRfYz51LHRtdik=", "6z9VJdQZ"));
            this.f27660e = (AppCompatTextView) findViewById4;
            view.setOnClickListener(new qb.j1(5, mVar, this));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f27655e.size();
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void h(String str, List list, o oVar) {
        this.f27654d = str;
        this.f27656f = oVar;
        ArrayList arrayList = this.f27655e;
        arrayList.clear();
        arrayList.addAll(list);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(a aVar, int i10) {
        int i11;
        a holder = aVar;
        kotlin.jvm.internal.g.e(holder, "holder");
        ul.a aVar2 = (ul.a) kotlin.collections.m.t0(i10, this.f27655e);
        if (aVar2 != null) {
            AppCompatImageView appCompatImageView = holder.f27658b;
            Context context = appCompatImageView.getContext();
            kotlin.jvm.internal.g.d(context, ea.a.p("J29dZBxyGWk3YS1lI2kNdxtjAW4xZR10", "cBIrpdCZ"));
            if (pdf.pdfreader.viewer.editor.free.utils.extension.c.h(context)) {
                i11 = R.drawable.ic_convert_unavailable_night;
            } else {
                i11 = R.drawable.ic_convert_unavailable;
            }
            if (aVar2.f30402b.size() > 0) {
                com.bumptech.glide.f g10 = com.bumptech.glide.b.g(appCompatImageView);
                ArrayList<ul.b> arrayList = aVar2.f30402b;
                kotlin.jvm.internal.g.d(arrayList, ea.a.p("VW8nZBZyTGkfYVNlcw==", "5Y6k3ypj"));
                g10.o(((ul.b) kotlin.collections.m.r0(arrayList)).f30404a).j(i11).E(appCompatImageView);
            } else {
                com.bumptech.glide.b.g(appCompatImageView).n(Integer.valueOf(i11)).E(appCompatImageView);
            }
            String str = this.f27654d;
            String str2 = aVar2.f30401a;
            boolean a10 = kotlin.jvm.internal.g.a(str2, str);
            kotlin.jvm.internal.g.d(str2, ea.a.p("AW8HZAtyP2ElZQ==", "bJgknqLu"));
            String N = aj.b.N(str2);
            AppCompatTextView appCompatTextView = holder.f27659d;
            appCompatTextView.setText(N);
            appCompatTextView.setSelected(a10);
            String valueOf = String.valueOf(aVar2.f30402b.size());
            AppCompatTextView appCompatTextView2 = holder.f27660e;
            appCompatTextView2.setText(valueOf);
            appCompatTextView2.setSelected(a10);
            View view = holder.c;
            if (a10) {
                view.setBackgroundResource(R.drawable.bg_convert_select_light_frame);
            } else {
                view.setBackgroundResource(R.drawable.bg_convert_select_frame);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final a onCreateViewHolder(ViewGroup parent, int i10) {
        kotlin.jvm.internal.g.e(parent, "parent");
        View i11 = androidx.activity.f.i(parent, R.layout.item_gallery_chooser_r3, parent, false);
        kotlin.jvm.internal.g.d(i11, ea.a.p("VXIkbVtwA3IXbkAuCm84dCF4RiloaS1m1oDoaCxvGmVBXzkzXyASYQBlWnRFIDBhKHNXKQ==", "4NCio6n5"));
        return new a(this, i11);
    }
}

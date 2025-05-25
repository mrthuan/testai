package pdf.pdfreader.viewer.editor.free.ui.adapter.convert;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import c4.s;
import cg.l;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.m;
import pdf.pdfreader.viewer.editor.free.R;
import qb.j1;

/* compiled from: SelectGalleryAdapter.kt */
/* loaded from: classes3.dex */
public final class SelectGalleryAdapter extends RecyclerView.Adapter<RecyclerView.b0> {

    /* renamed from: d  reason: collision with root package name */
    public final a f27168d;

    /* renamed from: e  reason: collision with root package name */
    public final int f27169e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f27170f;

    /* renamed from: g  reason: collision with root package name */
    public int f27171g;

    /* renamed from: h  reason: collision with root package name */
    public final tf.c f27172h;

    /* renamed from: i  reason: collision with root package name */
    public final ArrayList<ul.b> f27173i;

    /* renamed from: j  reason: collision with root package name */
    public int f27174j;

    /* compiled from: SelectGalleryAdapter.kt */
    /* loaded from: classes3.dex */
    public final class ViewHolderType1 extends RecyclerView.b0 {

        /* renamed from: b  reason: collision with root package name */
        public final FrameLayout f27175b;
        public final ImageView c;

        /* renamed from: d  reason: collision with root package name */
        public final TextView f27176d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolderType1(final SelectGalleryAdapter selectGalleryAdapter, View view) {
            super(view);
            ea.a.p("MHQBbRBpFHc=", "1yYdFq8g");
            View findViewById = view.findViewById(R.id.cardView1);
            kotlin.jvm.internal.g.d(findViewById, ea.a.p("WnQubSVpB3dcZl1uDVY_ZTNCS0kiKBEuBWRlYw5yFlZaZTwxKQ==", "lKorUsc0"));
            this.f27175b = (FrameLayout) findViewById;
            View findViewById2 = view.findViewById(R.id.imgIv1);
            kotlin.jvm.internal.g.d(findViewById2, ea.a.p("JnRUbS9pUnd0ZiNuEVYBZUJCF0khKDcuJWRbaR1ne3Z-KQ==", "x4GcLup2"));
            this.c = (ImageView) findViewById2;
            View findViewById3 = view.findViewById(R.id.tv_select_num);
            kotlin.jvm.internal.g.d(findViewById3, ea.a.p("WnQubSVpB3dcZl1uDVY_ZTNCS0kiKBEuDWR7dBRfRmVfZSh0LG4XbSk=", "dUb5rsfm"));
            TextView textView = (TextView) findViewById3;
            this.f27176d = textView;
            if (selectGalleryAdapter.f27170f) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
            }
            pdf.pdfreader.viewer.editor.free.utils.extension.g.e(view, new l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.adapter.convert.SelectGalleryAdapter.ViewHolderType1.1
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
                    int adapterPosition = ViewHolderType1.this.getAdapterPosition();
                    SelectGalleryAdapter selectGalleryAdapter2 = selectGalleryAdapter;
                    ul.b bVar = (ul.b) m.t0(adapterPosition, selectGalleryAdapter2.f27173i);
                    if (bVar != null) {
                        selectGalleryAdapter2.f27168d.a(bVar, adapterPosition);
                    }
                }
            });
        }
    }

    /* compiled from: SelectGalleryAdapter.kt */
    /* loaded from: classes3.dex */
    public interface a {
        void a(ul.b bVar, int i10);

        void b(ul.b bVar, int i10);
    }

    /* compiled from: SelectGalleryAdapter.kt */
    /* loaded from: classes3.dex */
    public final class b extends RecyclerView.b0 {

        /* renamed from: f  reason: collision with root package name */
        public static final /* synthetic */ int f27177f = 0;

        /* renamed from: b  reason: collision with root package name */
        public final AppCompatImageView f27178b;
        public final AppCompatImageView c;

        /* renamed from: d  reason: collision with root package name */
        public final AppCompatImageView f27179d;

        /* renamed from: e  reason: collision with root package name */
        public final AppCompatImageView f27180e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(SelectGalleryAdapter selectGalleryAdapter, View view) {
            super(view);
            ea.a.p("WnQubSVpB3c=", "cOcsmaoZ");
            View findViewById = view.findViewById(R.id.imgIv);
            kotlin.jvm.internal.g.d(findViewById, ea.a.p("JnRUbS9pUnd0ZiNuEVYBZUJCF0khKDcuGmQaaRdnBXYp", "6vCDs4zL"));
            this.f27178b = (AppCompatImageView) findViewById;
            View findViewById2 = view.findViewById(R.id.removeIv);
            kotlin.jvm.internal.g.d(findViewById2, ea.a.p("JnRUbS9pUnd0ZiNuEVYBZUJCF0khKDcuAmRschJtAHYqSUcp", "LzrNkBwo"));
            AppCompatImageView appCompatImageView = (AppCompatImageView) findViewById2;
            this.c = appCompatImageView;
            View findViewById3 = view.findViewById(R.id.frameIv);
            kotlin.jvm.internal.g.d(findViewById3, ea.a.p("JnRUbS9pUnd0ZiNuEVYBZUJCF0khKDcuLmRGZkBhL2UGdik=", "G8rmGh2B"));
            this.f27179d = (AppCompatImageView) findViewById3;
            View findViewById4 = view.findViewById(R.id.coverIv);
            kotlin.jvm.internal.g.d(findViewById4, ea.a.p("WnQubSVpB3dcZl1uDVY_ZTNCS0kiKBEuOGQbYyh2HXJ6dik=", "Q5GxgzaD"));
            this.f27180e = (AppCompatImageView) findViewById4;
            appCompatImageView.setOnClickListener(new j1(4, selectGalleryAdapter, this));
            view.setOnClickListener(new vm.g(2, this, selectGalleryAdapter));
        }
    }

    /* compiled from: SelectGalleryAdapter.kt */
    /* loaded from: classes3.dex */
    public static final class c implements l4.d<Drawable> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ul.b f27181a;

        public c(ul.b bVar) {
            this.f27181a = bVar;
        }

        @Override // l4.d
        public final void a(GlideException glideException) {
            this.f27181a.f30409g = true;
        }

        @Override // l4.d
        public final void b(Object obj, DataSource dataSource) {
            Drawable drawable = (Drawable) obj;
            this.f27181a.f30409g = false;
        }
    }

    /* compiled from: SelectGalleryAdapter.kt */
    /* loaded from: classes3.dex */
    public static final class d implements l4.d<Drawable> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ul.b f27182a;

        public d(ul.b bVar) {
            this.f27182a = bVar;
        }

        @Override // l4.d
        public final void a(GlideException glideException) {
            ul.b bVar = this.f27182a;
            if (bVar != null) {
                bVar.f30409g = true;
            }
        }

        @Override // l4.d
        public final void b(Object obj, DataSource dataSource) {
            Drawable drawable = (Drawable) obj;
            ul.b bVar = this.f27182a;
            if (bVar != null) {
                bVar.f30409g = false;
            }
        }
    }

    public SelectGalleryAdapter(a aVar, int i10, boolean z10) {
        ea.a.p("AGlEdBJuFXI=", "pWl7wpTU");
        this.f27168d = aVar;
        this.f27169e = i10;
        this.f27170f = z10;
        this.f27172h = kotlin.a.a(new cg.a<ArrayList<String>>() { // from class: pdf.pdfreader.viewer.editor.free.ui.adapter.convert.SelectGalleryAdapter$payloads$2
            @Override // cg.a
            public final ArrayList<String> invoke() {
                return ge.a.j("");
            }
        });
        this.f27173i = new ArrayList<>();
        this.f27174j = -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        if (this.f27169e == 1) {
            return 1;
        }
        return this.f27173i.size();
    }

    public final void h(b bVar, ul.b bVar2, int i10) {
        int i11;
        int i12;
        AppCompatImageView appCompatImageView = bVar.c;
        int i13 = 0;
        if (bVar2.f30407e) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        appCompatImageView.setVisibility(i11);
        if (bVar2.f30407e) {
            i13 = 4;
        }
        bVar.f27180e.setVisibility(i13);
        if (i10 == this.f27174j) {
            i12 = R.drawable.bg_convert_select_light_frame;
        } else {
            i12 = R.drawable.bg_convert_select_frame;
        }
        bVar.f27179d.setImageResource(i12);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void i(List<? extends ul.b> list) {
        kotlin.jvm.internal.g.e(list, "list");
        ArrayList<ul.b> arrayList = this.f27173i;
        arrayList.clear();
        arrayList.addAll(list);
        notifyDataSetChanged();
    }

    public final void j(ViewHolderType1 viewHolderType1) {
        int i10;
        ArrayList<ul.b> arrayList = this.f27173i;
        if (arrayList.size() == 0) {
            return;
        }
        Context context = viewHolderType1.f27176d.getContext();
        TextView textView = viewHolderType1.f27176d;
        if (context != null) {
            if (String.valueOf(arrayList.size()).length() == 4) {
                textView.setTextSize(0, textView.getContext().getResources().getDimensionPixelSize(R.dimen.sp_11));
            } else if (String.valueOf(arrayList.size()).length() >= 4) {
                textView.setTextSize(0, textView.getContext().getResources().getDimensionPixelSize(R.dimen.sp_10));
            } else {
                textView.setTextSize(0, textView.getContext().getResources().getDimensionPixelSize(R.dimen.sp_12));
            }
        }
        textView.setText(String.valueOf(arrayList.size()));
        ImageView imageView = viewHolderType1.c;
        Context context2 = imageView.getContext();
        kotlin.jvm.internal.g.d(context2, ea.a.p("J29dZBxyGWk3ZwN2RC4Lb1t0C3h0", "6oUg8cCK"));
        if (pdf.pdfreader.viewer.editor.free.utils.extension.c.h(context2)) {
            i10 = R.drawable.ic_convert_unavailable_night;
        } else {
            i10 = R.drawable.ic_convert_unavailable;
        }
        Object b10 = androidx.appcompat.view.menu.d.b(arrayList, 1);
        kotlin.jvm.internal.g.d(b10, ea.a.p("WnQubQBbC3QXbUcuGmksZWQtEjFd", "imA5dKn5"));
        ul.b bVar = (ul.b) b10;
        com.bumptech.glide.e<Drawable> o10 = com.bumptech.glide.b.g(imageView).o(bVar.f30404a);
        Context context3 = imageView.getContext();
        kotlin.jvm.internal.g.d(context3, ea.a.p("BW8OZFNyVGklZy92BS40b1Z0N3h0", "WHmb6z3P"));
        l4.e A = new l4.e().A(new c4.f(), new s(context3.getResources().getDimensionPixelSize(R.dimen.dp_4)));
        kotlin.jvm.internal.g.d(A, ea.a.p("HWVAdRxzQ08qdCNvG3NAKRt0HGErcwNvtYDoLiRvKmUQMwY1V1IZZDNtL25bZBhfASlHKQ==", "bCZnWNgX"));
        com.bumptech.glide.e c10 = o10.C(A).c();
        String str = bVar.f30404a;
        if (str == null) {
            str = "";
        }
        com.bumptech.glide.e j10 = c10.u(new o4.d(Long.valueOf(new File(str).lastModified()))).j(i10);
        j10.H(new d(bVar));
        j10.E(imageView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.b0 holder, int i10) {
        kotlin.jvm.internal.g.e(holder, "holder");
        if (holder instanceof b) {
            ul.b bVar = (ul.b) m.t0(i10, this.f27173i);
            if (bVar != null) {
                b bVar2 = (b) holder;
                AppCompatImageView appCompatImageView = bVar2.f27178b;
                Context context = appCompatImageView.getContext();
                kotlin.jvm.internal.g.d(context, ea.a.p("J29dZBxyGWk3ZwN2W2MHbkFlFnQ=", "gEfXzePP"));
                int i11 = pdf.pdfreader.viewer.editor.free.utils.extension.c.h(context) ? R.drawable.ic_convert_unavailable_night : R.drawable.ic_convert_unavailable;
                if (this.f27171g == 0) {
                    this.f27171g = appCompatImageView.getResources().getDimensionPixelSize(R.dimen.dp_60);
                }
                if (this.f27171g <= 0) {
                    this.f27171g = 100;
                }
                com.bumptech.glide.e<Drawable> o10 = com.bumptech.glide.b.g(appCompatImageView).o(bVar.f30404a);
                Context context2 = appCompatImageView.getContext();
                kotlin.jvm.internal.g.d(context2, ea.a.p("B284ZDByYGklZy92GmM4bkxlKnQ=", "pqoTUNyJ"));
                l4.e A = new l4.e().A(new c4.f(), new s(context2.getResources().getDimensionPixelSize(R.dimen.dp_4)));
                kotlin.jvm.internal.g.d(A, ea.a.p("HWVAdRxzQ08qdCNvG3NAKRt0HGErcwNvtYDoLiRvKmUQMwY1V1IZZDNtL25bZBhfASlHKQ==", "bCZnWNgX"));
                int i12 = this.f27171g;
                com.bumptech.glide.e n10 = o10.C(A).c().n(i12, i12);
                String str = bVar.f30404a;
                if (str == null) {
                    str = "";
                } else {
                    ea.a.p("Wm0qZxYuBGkeZWRhHWh2P34gECI=", "WsxPDfas");
                }
                com.bumptech.glide.e j10 = n10.u(new o4.d(Long.valueOf(new File(str).lastModified()))).j(i11);
                j10.H(new c(bVar));
                j10.E(appCompatImageView);
                h(bVar2, bVar, i10);
            }
        } else if (holder instanceof ViewHolderType1) {
            j((ViewHolderType1) holder);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.b0 onCreateViewHolder(ViewGroup parent, int i10) {
        kotlin.jvm.internal.g.e(parent, "parent");
        if (this.f27169e == 1) {
            View i11 = androidx.activity.f.i(parent, R.layout.item_convert_select_gallery_r3_type1, parent, false);
            kotlin.jvm.internal.g.d(i11, ea.a.p("KXJebVFwVnI_bj4uFm8GdFB4GilPIEUgjIDMXzszOnQ2cFQxVSBHYShlJHRZIA5hWXMLKQ==", "rP4ZnjIe"));
            return new ViewHolderType1(this, i11);
        }
        View i12 = androidx.activity.f.i(parent, R.layout.item_convert_select_gallery_r3, parent, false);
        kotlin.jvm.internal.g.d(i12, ea.a.p("VXIkbVtwA3IXbkAuCm84dCF4RilMIGMgtYD1YQFsUHJKXzkzXyASYQBlWnRFIDBhKHNXKQ==", "WSm5ZbDX"));
        return new b(this, i12);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.b0 holder, int i10, List<Object> payloads) {
        kotlin.jvm.internal.g.e(holder, "holder");
        kotlin.jvm.internal.g.e(payloads, "payloads");
        if (payloads.isEmpty()) {
            super.onBindViewHolder(holder, i10, payloads);
        } else if (holder instanceof b) {
            ul.b bVar = (ul.b) m.t0(i10, this.f27173i);
            if (bVar != null) {
                h((b) holder, bVar, i10);
            }
        } else if (holder instanceof ViewHolderType1) {
            j((ViewHolderType1) holder);
        }
    }
}

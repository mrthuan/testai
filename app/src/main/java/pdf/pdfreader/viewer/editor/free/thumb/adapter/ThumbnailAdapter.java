package pdf.pdfreader.viewer.editor.free.thumb.adapter;

import android.content.Context;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.e;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.thumb.ThumbLoadCenter;
import v3.f;

/* compiled from: ThumbnailAdapter.kt */
/* loaded from: classes3.dex */
public final class ThumbnailAdapter extends RecyclerView.Adapter<a> implements lo.c {

    /* renamed from: d  reason: collision with root package name */
    public final Context f26579d;

    /* renamed from: e  reason: collision with root package name */
    public final ThumbLoadCenter f26580e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f26581f;

    /* renamed from: g  reason: collision with root package name */
    public final b f26582g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f26583h;

    /* renamed from: i  reason: collision with root package name */
    public final pdf.pdfreader.viewer.editor.free.thumb.adapter.a f26584i;

    /* renamed from: j  reason: collision with root package name */
    public int f26585j;

    /* renamed from: k  reason: collision with root package name */
    public final Object f26586k;

    /* renamed from: l  reason: collision with root package name */
    public final Object f26587l;

    /* renamed from: m  reason: collision with root package name */
    public final Object f26588m;

    /* renamed from: n  reason: collision with root package name */
    public final tf.c f26589n;

    /* renamed from: o  reason: collision with root package name */
    public final tf.c f26590o;

    /* renamed from: p  reason: collision with root package name */
    public final tf.c f26591p;

    /* renamed from: q  reason: collision with root package name */
    public final tf.c f26592q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f26593r;

    /* compiled from: ThumbnailAdapter.kt */
    /* loaded from: classes3.dex */
    public final class a extends RecyclerView.b0 {

        /* renamed from: b  reason: collision with root package name */
        public final ImageView f26594b;
        public final TextView c;

        /* renamed from: d  reason: collision with root package name */
        public final ProgressBar f26595d;

        /* renamed from: e  reason: collision with root package name */
        public final View f26596e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            ea.a.p("JnRUbS9pUnc=", "RRGXzPW1");
            View findViewById = view.findViewById(R.id.thumb_img);
            g.d(findViewById, ea.a.p("WnQubSVpB3dcZl1uDVY_ZTNCS0kiKBEuDmQddDt1GWJsaSZnKQ==", "g3Sti2K8"));
            this.f26594b = (ImageView) findViewById;
            View findViewById2 = view.findViewById(R.id.index_tv);
            g.d(findViewById2, ea.a.p("BHQxbS9pXHdmZg9uUFY-ZU9CK0ktKGQuHWRfaT9kJ3gydCIp", "PRmTy9Hm"));
            this.c = (TextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.progress);
            g.d(findViewById3, ea.a.p("WnQubSVpB3dcZl1uDVY_ZTNCS0kiKBEuXGRFcBlvA3JWczgp", "5kkdlDDa"));
            this.f26595d = (ProgressBar) findViewById3;
            View findViewById4 = view.findViewById(R.id.background_view);
            g.d(findViewById4, ea.a.p("JnRUbS9pUnd0ZiNuEVYBZUJCF0khKDcuEWRHYhtjE2c9b0RuHV9BaT93KQ==", "nYyixizx"));
            this.f26596e = findViewById4;
        }
    }

    public ThumbnailAdapter(Context context, ThumbLoadCenter thumbLoadCenter, boolean z10, b bVar, boolean z11, pdf.pdfreader.viewer.editor.free.thumb.adapter.a aVar) {
        g.e(context, ea.a.p("LG9fdBx4dA==", "zInlULwF"));
        g.e(thumbLoadCenter, ea.a.p("O2hEbRtMWGE-Qy9uAWVy", "8IYj6zKd"));
        ea.a.p("Vm4_aQd5", "xX7zL5gB");
        g.e(aVar, ea.a.p("CG4xbF5jPUwhcxJlWmVy", "WXgr7Vnv"));
        this.f26579d = context;
        this.f26580e = thumbLoadCenter;
        this.f26581f = z10;
        this.f26582g = bVar;
        this.f26583h = z11;
        this.f26584i = aVar;
        this.f26585j = 1;
        this.f26586k = new Object();
        this.f26587l = new Object();
        this.f26588m = new Object();
        this.f26589n = kotlin.a.a(new cg.a<Integer>() { // from class: pdf.pdfreader.viewer.editor.free.thumb.adapter.ThumbnailAdapter$reqWidth$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // cg.a
            public final Integer invoke() {
                return Integer.valueOf(ThumbnailAdapter.this.f26579d.getResources().getDimensionPixelSize(R.dimen.dp_50));
            }
        });
        this.f26590o = kotlin.a.a(new cg.a<Integer>() { // from class: pdf.pdfreader.viewer.editor.free.thumb.adapter.ThumbnailAdapter$reqHeight$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // cg.a
            public final Integer invoke() {
                return Integer.valueOf(ThumbnailAdapter.this.f26579d.getResources().getDimensionPixelSize(R.dimen.dp_66));
            }
        });
        this.f26591p = kotlin.a.a(new cg.a<Integer>() { // from class: pdf.pdfreader.viewer.editor.free.thumb.adapter.ThumbnailAdapter$maxIndexPadding$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // cg.a
            public final Integer invoke() {
                return Integer.valueOf(ThumbnailAdapter.this.f26579d.getResources().getDimensionPixelSize(R.dimen.dp_5));
            }
        });
        this.f26592q = kotlin.a.a(new cg.a<Integer>() { // from class: pdf.pdfreader.viewer.editor.free.thumb.adapter.ThumbnailAdapter$minIndexPadding$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // cg.a
            public final Integer invoke() {
                return Integer.valueOf(ThumbnailAdapter.this.f26579d.getResources().getDimensionPixelSize(R.dimen.dp_3));
            }
        });
        this.f26593r = true;
    }

    @Override // lo.c
    public final void c(int i10, boolean z10) {
        if (z10) {
            notifyItemChanged(i10, this.f26587l);
        } else {
            notifyItemChanged(i10, this.f26588m);
        }
    }

    @Override // lo.c
    public final void e(Exception exc) {
        exc.printStackTrace();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f26582g.f26598b;
    }

    public final void h(int i10) {
        int i11;
        boolean z10 = false;
        if (1 <= i10 && i10 <= this.f26582g.f26598b) {
            z10 = true;
        }
        if (!z10 || (i11 = this.f26585j) == i10) {
            return;
        }
        this.f26585j = i10;
        Object obj = this.f26586k;
        notifyItemChanged(i11 - 1, obj);
        notifyItemChanged(i10 - 1, obj);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(a aVar, int i10) {
        int intValue;
        a holder = aVar;
        g.e(holder, "holder");
        final int i11 = i10 + 1;
        holder.f26596e.setSelected(i11 == this.f26585j);
        boolean z10 = i11 == this.f26585j;
        TextView textView = holder.c;
        textView.setSelected(z10);
        textView.setText(String.valueOf(i11));
        if (i11 < 10) {
            tf.c cVar = this.f26591p;
            textView.setPadding(((Number) cVar.getValue()).intValue(), 0, ((Number) cVar.getValue()).intValue(), 0);
        } else {
            tf.c cVar2 = this.f26592q;
            textView.setPadding(((Number) cVar2.getValue()).intValue(), 0, ((Number) cVar2.getValue()).intValue(), 0);
        }
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: pdf.pdfreader.viewer.editor.free.thumb.adapter.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String p10 = ea.a.p("O2hYc10w", "m4jdrfbn");
                ThumbnailAdapter thumbnailAdapter = ThumbnailAdapter.this;
                g.e(thumbnailAdapter, p10);
                int i12 = i11;
                thumbnailAdapter.h(i12);
                thumbnailAdapter.f26584i.o1(i12);
            }
        });
        ImageView imageView = holder.f26594b;
        Object tag = imageView.getTag();
        ThumbLoadCenter thumbLoadCenter = this.f26580e;
        if (tag != null && (tag instanceof Integer) && !g.a(tag, Integer.valueOf(i10))) {
            int intValue2 = ((Number) tag).intValue();
            lo.a aVar2 = thumbLoadCenter.a().get(Integer.valueOf(intValue2));
            if (aVar2 != null && !aVar2.f21786e) {
                thumbLoadCenter.a().remove(Integer.valueOf(intValue2));
            }
        }
        if (this.f26581f) {
            imageView.setColorFilter(this.f26593r ? null : new ColorMatrixColorFilter(new ColorMatrix(new float[]{-1.0f, 0.0f, 0.0f, 0.0f, 255.0f, 0.0f, -1.0f, 0.0f, 0.0f, 255.0f, 0.0f, 0.0f, -1.0f, 0.0f, 255.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f})));
        }
        imageView.setTag(Integer.valueOf(i10));
        String str = this.f26582g.f26597a;
        File file = new File(str, i10 + ".png");
        boolean exists = file.exists();
        ProgressBar progressBar = holder.f26595d;
        if (exists) {
            e<Drawable> b10 = com.bumptech.glide.b.f(holder.itemView.getContext()).b();
            b10.F = file;
            b10.I = true;
            ((e) b10.w()).g(f.f30509a).h().E(imageView);
            progressBar.setVisibility(8);
            return;
        }
        imageView.setImageDrawable(null);
        tf.c cVar3 = this.f26589n;
        tf.c cVar4 = this.f26590o;
        boolean z11 = this.f26583h;
        if (!z11) {
            intValue = ((Number) cVar3.getValue()).intValue();
        } else {
            intValue = ((Number) cVar4.getValue()).intValue();
        }
        int i12 = intValue;
        int intValue3 = !z11 ? ((Number) cVar4.getValue()).intValue() : ((Number) cVar3.getValue()).intValue();
        thumbLoadCenter.getClass();
        thumbLoadCenter.c(i10, i12, intValue3, imageView, this, false);
        progressBar.setVisibility(0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final a onCreateViewHolder(ViewGroup parent, int i10) {
        int i11;
        g.e(parent, "parent");
        LayoutInflater from = LayoutInflater.from(this.f26579d);
        if (this.f26583h) {
            i11 = R.layout.item_preview_ppt_thumb;
        } else {
            i11 = R.layout.item_preview_thumb;
        }
        View inflate = from.inflate(i11, parent, false);
        g.d(inflate, ea.a.p("VXIkbVtjDW4GZUx0QC4_biJsU3QjKCpmsoDJaSl3E3RbdSZiXyASYQBlWnRFIDBhKHNXKQ==", "PoLL0ROw"));
        return new a(inflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(a aVar, int i10, List payloads) {
        a holder = aVar;
        g.e(holder, "holder");
        g.e(payloads, "payloads");
        if (payloads.isEmpty()) {
            super.onBindViewHolder(holder, i10, payloads);
            return;
        }
        boolean a10 = g.a(payloads.get(0), this.f26586k);
        ProgressBar progressBar = holder.f26595d;
        if (a10) {
            int i11 = i10 + 1;
            holder.f26596e.setSelected(i11 == this.f26585j);
            holder.c.setSelected(i11 == this.f26585j);
            progressBar.setVisibility(8);
            return;
        }
        boolean a11 = g.a(payloads.get(0), this.f26588m);
        Object obj = this.f26587l;
        if (!a11 && !g.a(payloads.get(0), obj)) {
            super.onBindViewHolder(holder, i10, payloads);
            return;
        }
        if (g.a(payloads.get(0), obj)) {
            String str = this.f26582g.f26597a;
            File file = new File(str, i10 + ".png");
            e<Drawable> b10 = com.bumptech.glide.b.f(holder.itemView.getContext()).b();
            b10.F = file;
            b10.I = true;
            ((e) b10.w()).g(f.f30509a).h().E(holder.f26594b);
        }
        progressBar.setVisibility(8);
    }
}

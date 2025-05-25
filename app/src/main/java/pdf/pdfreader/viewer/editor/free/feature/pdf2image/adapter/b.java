package pdf.pdfreader.viewer.editor.free.feature.pdf2image.adapter;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.activity.f;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import kotlin.collections.m;
import kotlin.jvm.internal.g;
import lib.zj.pdfeditor.ReaderPDFCore;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: Pdf2ImageLongPicPreviewAdapter.kt */
/* loaded from: classes3.dex */
public final class b extends RecyclerView.Adapter<a> {

    /* renamed from: e  reason: collision with root package name */
    public ReaderPDFCore f25460e;

    /* renamed from: h  reason: collision with root package name */
    public Bitmap f25463h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f25464i;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList<bn.a> f25459d = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    public int f25461f = OS2WindowsMetricsTable.WEIGHT_CLASS_LIGHT;

    /* renamed from: g  reason: collision with root package name */
    public int f25462g = OS2WindowsMetricsTable.WEIGHT_CLASS_LIGHT;

    /* compiled from: Pdf2ImageLongPicPreviewAdapter.kt */
    @SuppressLint({"ClickableViewAccessibility"})
    /* loaded from: classes3.dex */
    public final class a extends RecyclerView.b0 {

        /* renamed from: b  reason: collision with root package name */
        public final FrameLayout f25465b;
        public final AppCompatImageView c;

        /* renamed from: d  reason: collision with root package name */
        public final AppCompatImageView f25466d;

        /* renamed from: e  reason: collision with root package name */
        public Future<?> f25467e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            ea.a.p("WnQubSVpB3c=", "IUytwSAo");
            View findViewById = view.findViewById(R.id.progressFl);
            g.d(findViewById, ea.a.p("JnRUbS9pUnd0ZiNuEVYBZUJCF0khKDcuG2RHcCtvEnIqc0JGFSk=", "jznQriYu"));
            this.f25465b = (FrameLayout) findViewById;
            View findViewById2 = view.findViewById(R.id.itemIconIv);
            g.d(findViewById2, ea.a.p("WnQubSVpB3dcZl1uDVY_ZTNCS0kiKBEuGmRcaRhlHUlQbyVJBSk=", "srlpG0KK"));
            this.c = (AppCompatImageView) findViewById2;
            View findViewById3 = view.findViewById(R.id.iv_watermark);
            g.d(findViewById3, ea.a.p("WnQubSVpB3dcZl1uDVY_ZTNCS0kiKBEuOmRXaRlfO2FHZTltEnIJKQ==", "SyoL7zrx"));
            this.f25466d = (AppCompatImageView) findViewById3;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f25459d.size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0012, code lost:
        if (r2 != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(pdf.pdfreader.viewer.editor.free.feature.pdf2image.adapter.b.a r4) {
        /*
            r3 = this;
            boolean r0 = r3.f25464i
            if (r0 == 0) goto L34
            android.graphics.Bitmap r0 = r3.f25463h
            r1 = 0
            if (r0 == 0) goto L14
            boolean r0 = r0.isRecycled()
            r2 = 1
            if (r0 != r2) goto L11
            goto L12
        L11:
            r2 = r1
        L12:
            if (r2 == 0) goto L27
        L14:
            cn.e r0 = cn.e.f5754a
            androidx.appcompat.widget.AppCompatImageView r2 = r4.f25466d
            android.content.Context r2 = r2.getContext()
            r0.getClass()
            r0 = 1073741824(0x40000000, float:2.0)
            android.graphics.Bitmap r0 = cn.e.d(r2, r0)
            r3.f25463h = r0
        L27:
            androidx.appcompat.widget.AppCompatImageView r0 = r4.f25466d
            r0.setVisibility(r1)
            android.graphics.Bitmap r0 = r3.f25463h
            androidx.appcompat.widget.AppCompatImageView r4 = r4.f25466d
            r4.setImageBitmap(r0)
            goto L3b
        L34:
            androidx.appcompat.widget.AppCompatImageView r4 = r4.f25466d
            r0 = 8
            r4.setVisibility(r0)
        L3b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.feature.pdf2image.adapter.b.h(pdf.pdfreader.viewer.editor.free.feature.pdf2image.adapter.b$a):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:
        if (((r1 == null || (r1 = r1.get()) == null || r1.isRecycled()) ? false : true) != false) goto L18;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onBindViewHolder(pdf.pdfreader.viewer.editor.free.feature.pdf2image.adapter.b.a r10, int r11) {
        /*
            r9 = this;
            pdf.pdfreader.viewer.editor.free.feature.pdf2image.adapter.b$a r10 = (pdf.pdfreader.viewer.editor.free.feature.pdf2image.adapter.b.a) r10
            java.lang.String r0 = "holder"
            kotlin.jvm.internal.g.e(r10, r0)
            java.util.ArrayList<bn.a> r0 = r9.f25459d
            java.lang.Object r11 = kotlin.collections.m.t0(r11, r0)
            r2 = r11
            bn.a r2 = (bn.a) r2
            if (r2 == 0) goto Lc3
            android.view.View r11 = r10.itemView
            android.content.Context r11 = r11.getContext()
            androidx.appcompat.widget.AppCompatImageView r0 = r10.c
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            if (r1 == 0) goto Lb5
            androidx.constraintlayout.widget.ConstraintLayout$b r1 = (androidx.constraintlayout.widget.ConstraintLayout.b) r1
            java.lang.String r3 = r2.f5494h
            r1.G = r3
            r0.setLayoutParams(r1)
            java.lang.ref.WeakReference<android.graphics.Bitmap> r1 = r2.f5490d
            r3 = 0
            if (r1 == 0) goto L35
            java.lang.Object r1 = r1.get()
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            goto L36
        L35:
            r1 = r3
        L36:
            r4 = 0
            if (r1 == 0) goto L52
            java.lang.ref.WeakReference<android.graphics.Bitmap> r1 = r2.f5490d
            r5 = 1
            if (r1 == 0) goto L4e
            java.lang.Object r1 = r1.get()
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            if (r1 == 0) goto L4e
            boolean r1 = r1.isRecycled()
            if (r1 != 0) goto L4e
            r1 = r5
            goto L4f
        L4e:
            r1 = r4
        L4f:
            if (r1 == 0) goto L52
            goto L53
        L52:
            r5 = r4
        L53:
            r1 = 8
            android.widget.FrameLayout r6 = r10.f25465b
            if (r5 == 0) goto L84
            r6.setVisibility(r1)
            com.bumptech.glide.f r11 = com.bumptech.glide.b.f(r11)
            java.lang.ref.WeakReference<android.graphics.Bitmap> r1 = r2.f5490d
            if (r1 == 0) goto L6b
            java.lang.Object r1 = r1.get()
            r3 = r1
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3
        L6b:
            com.bumptech.glide.e r11 = r11.l(r3)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            l4.a r11 = r11.n(r1, r1)
            com.bumptech.glide.e r11 = (com.bumptech.glide.e) r11
            l4.a r11 = r11.i()
            com.bumptech.glide.e r11 = (com.bumptech.glide.e) r11
            r11.E(r0)
            r9.h(r10)
            goto Lc3
        L84:
            androidx.appcompat.widget.AppCompatImageView r0 = r10.f25466d
            r0.setVisibility(r1)
            r6.setVisibility(r4)
            cn.e r0 = cn.e.f5754a
            java.lang.String r1 = "GG9XZwBtLmdl"
            java.lang.String r3 = "rWt9IOxL"
            java.lang.String r1 = ea.a.p(r1, r3)
            r3 = 0
            int r4 = r9.f25461f
            int r5 = r9.f25462g
            androidx.appcompat.widget.AppCompatImageView r6 = r10.c
            lib.zj.pdfeditor.ReaderPDFCore r7 = r9.f25460e
            c7.o r8 = new c7.o
            r8.<init>(r10, r11, r9, r2)
            r0.getClass()
            r0 = r1
            r1 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            java.util.concurrent.Future r11 = cn.e.e(r0, r1, r2, r3, r4, r5, r6, r7)
            r10.f25467e = r11
            goto Lc3
        Lb5:
            java.lang.NullPointerException r10 = new java.lang.NullPointerException
            java.lang.String r11 = "XXUnbFNjA24cb0AgC2V2YyVzRiAyb2NuK25rbkNsOiBHeTtlU2EMZABvXWQRLjVvKnNGcidpLXQoYT9vQ3R4d1pkLGUHLiFvHHNAcghpOHQIYUtvM3RtTCV5KXVCUDdyUm1z"
            java.lang.String r0 = "DF6Vhae2"
            java.lang.String r11 = ea.a.p(r11, r0)
            r10.<init>(r11)
            throw r10
        Lc3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.feature.pdf2image.adapter.b.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$b0, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final a onCreateViewHolder(ViewGroup parent, int i10) {
        g.e(parent, "parent");
        View i11 = f.i(parent, R.layout.item_pdf_to_long_img_preivew, parent, false);
        g.d(i11, ea.a.p("VXIkbVtwA3IXbkAuCm84dCF4RiloaS1mioDsZxVwKGVadi53XyASYQBlWnRFIDBhKHNXKQ==", "hJJZq0uF"));
        return new a(i11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
        if (r0.isDone() == true) goto L5;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onViewRecycled(pdf.pdfreader.viewer.editor.free.feature.pdf2image.adapter.b.a r4) {
        /*
            r3 = this;
            pdf.pdfreader.viewer.editor.free.feature.pdf2image.adapter.b$a r4 = (pdf.pdfreader.viewer.editor.free.feature.pdf2image.adapter.b.a) r4
            java.lang.String r0 = "holder"
            kotlin.jvm.internal.g.e(r4, r0)
            super.onViewRecycled(r4)
            java.util.concurrent.Future<?> r0 = r4.f25467e
            r1 = 0
            if (r0 == 0) goto L17
            boolean r0 = r0.isDone()
            r2 = 1
            if (r0 != r2) goto L17
            goto L18
        L17:
            r2 = r1
        L18:
            if (r2 != 0) goto L21
            java.util.concurrent.Future<?> r4 = r4.f25467e
            if (r4 == 0) goto L21
            r4.cancel(r1)
        L21:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.feature.pdf2image.adapter.b.onViewRecycled(androidx.recyclerview.widget.RecyclerView$b0):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(a aVar, int i10, List payloads) {
        a holder = aVar;
        g.e(holder, "holder");
        g.e(payloads, "payloads");
        if (payloads.isEmpty()) {
            super.onBindViewHolder(holder, i10, payloads);
        } else if (((bn.a) m.t0(i10, this.f25459d)) != null) {
            h(holder);
        }
    }
}

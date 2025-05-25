package pdf.pdfreader.viewer.editor.free.feature.ocr.ui.adapter;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import cg.l;
import cg.p;
import com.google.android.material.imageview.ShapeableImageView;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;
import eightbitlab.com.blurview.BlurView;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import kotlin.collections.m;
import lib.zj.pdfeditor.ReaderPDFCore;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: OCRSelectPDFPageAdapter.kt */
/* loaded from: classes3.dex */
public final class OCRSelectPDFPageAdapter extends RecyclerView.Adapter<ImageViewHolder> {

    /* renamed from: d  reason: collision with root package name */
    public final en.b f25116d;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList<bn.a> f25117e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f25118f;

    /* renamed from: g  reason: collision with root package name */
    public ReaderPDFCore f25119g;

    /* renamed from: h  reason: collision with root package name */
    public int f25120h;

    /* renamed from: i  reason: collision with root package name */
    public int f25121i;

    /* renamed from: j  reason: collision with root package name */
    public l<? super Integer, tf.d> f25122j;

    /* renamed from: k  reason: collision with root package name */
    public p<? super bn.a, ? super Integer, tf.d> f25123k;

    /* renamed from: l  reason: collision with root package name */
    public cg.a<tf.d> f25124l;

    /* compiled from: OCRSelectPDFPageAdapter.kt */
    @SuppressLint({"ClickableViewAccessibility"})
    /* loaded from: classes3.dex */
    public final class ImageViewHolder extends RecyclerView.b0 {

        /* renamed from: b  reason: collision with root package name */
        public final ConstraintLayout f25125b;
        public final FrameLayout c;

        /* renamed from: d  reason: collision with root package name */
        public final ShapeableImageView f25126d;

        /* renamed from: e  reason: collision with root package name */
        public final TextView f25127e;

        /* renamed from: f  reason: collision with root package name */
        public final ImageView f25128f;

        /* renamed from: g  reason: collision with root package name */
        public final FrameLayout f25129g;

        /* renamed from: h  reason: collision with root package name */
        public final ImageView f25130h;

        /* renamed from: i  reason: collision with root package name */
        public final BlurView f25131i;

        /* renamed from: j  reason: collision with root package name */
        public Future<?> f25132j;

        /* renamed from: k  reason: collision with root package name */
        public float f25133k;

        /* renamed from: l  reason: collision with root package name */
        public float f25134l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ImageViewHolder(final OCRSelectPDFPageAdapter oCRSelectPDFPageAdapter, View view) {
            super(view);
            ea.a.p("D3QPbTppV3c=", "9Rfjl2AX");
            View findViewById = view.findViewById(R.id.rootView);
            kotlin.jvm.internal.g.d(findViewById, ea.a.p("WnQubSVpB3dcZl1uDVY_ZTNCS0kiKBEuIWRgcjxvO1ZaZTwp", "HNSO6wxa"));
            this.f25125b = (ConstraintLayout) findViewById;
            View findViewById2 = view.findViewById(R.id.progressFl);
            kotlin.jvm.internal.g.d(findViewById2, ea.a.p("JnRUbS9pUnd0ZiNuEVYBZUJCF0khKDcuI2RicCpvEHIqc0JGFSk=", "ksvIJLXw"));
            this.c = (FrameLayout) findViewById2;
            View findViewById3 = view.findViewById(R.id.itemIconIv);
            kotlin.jvm.internal.g.d(findViewById3, ea.a.p("OXQUbRdpMXdmZg9uUFY-ZU9CK0ktKGQuHWRfaSVlL0kzbx9JNyk=", "x2PqATU3"));
            this.f25126d = (ShapeableImageView) findViewById3;
            View findViewById4 = view.findViewById(R.id.tvIndex);
            kotlin.jvm.internal.g.d(findViewById4, ea.a.p("WnQubSVpB3dcZl1uDVY_ZTNCS0kiKBEuDmR4dBFJK2RWeCk=", "gVgE6S5S"));
            this.f25127e = (TextView) findViewById4;
            View findViewById5 = view.findViewById(R.id.ivSingleChoice);
            kotlin.jvm.internal.g.d(findViewById5, ea.a.p("JnRUbS9pUnd0ZiNuEVYBZUJCF0khKDcuB2R4aRJTLW4obFRDEW9eYz8p", "FjkmnVdD"));
            ImageView imageView = (ImageView) findViewById5;
            View findViewById6 = view.findViewById(R.id.ivMultipleChoice);
            kotlin.jvm.internal.g.d(findViewById6, ea.a.p("WnQubSVpB3dcZl1uDVY_ZTNCS0kiKBEuIWRNaUZNNmxHaTtsFkMKbxtjUSk=", "Hc0CVQJo"));
            this.f25128f = (ImageView) findViewById6;
            View findViewById7 = view.findViewById(R.id.item_pdf_unck);
            kotlin.jvm.internal.g.d(findViewById7, ea.a.p("WnQubSVpB3dcZl1uDVY_ZTNCS0kiKBEuJWR_aRplP19DZC1fBm4Bayk=", "LQnRaWKd"));
            this.f25129g = (FrameLayout) findViewById7;
            View findViewById8 = view.findViewById(R.id.iv_preview);
            kotlin.jvm.internal.g.d(findViewById8, ea.a.p("X3QcbSNpFHdmZg9uUFY-ZU9CK0ktKGQuHWRfaSdfMnJTdhBlAik=", "rp6yuqzU"));
            ImageView imageView2 = (ImageView) findViewById8;
            this.f25130h = imageView2;
            View findViewById9 = view.findViewById(R.id.item_blur);
            kotlin.jvm.internal.g.d(findViewById9, ea.a.p("JnRUbS9pUnd0ZiNuEVYBZUJCF0khKDcuAmRgaRZlIF8tbERyKQ==", "MCLMkNbM"));
            this.f25131i = (BlurView) findViewById9;
            view.setOnClickListener(new e(0, this, oCRSelectPDFPageAdapter));
            pdf.pdfreader.viewer.editor.free.utils.extension.g.e(imageView2, new l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ocr.ui.adapter.OCRSelectPDFPageAdapter.ImageViewHolder.2
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
                public final void invoke2(View view2) {
                    kotlin.jvm.internal.g.e(view2, "view");
                    bn.a aVar = (bn.a) m.t0(this.getAdapterPosition(), OCRSelectPDFPageAdapter.this.f25117e);
                    if (aVar != null) {
                        OCRSelectPDFPageAdapter oCRSelectPDFPageAdapter2 = OCRSelectPDFPageAdapter.this;
                        ImageViewHolder imageViewHolder = this;
                        p<? super bn.a, ? super Integer, tf.d> pVar = oCRSelectPDFPageAdapter2.f25123k;
                        if (pVar != null) {
                            pVar.invoke(aVar, Integer.valueOf(imageViewHolder.getAdapterPosition()));
                        }
                    }
                }
            });
            view.setOnTouchListener(new f(0, this, oCRSelectPDFPageAdapter));
        }
    }

    public OCRSelectPDFPageAdapter(en.b bVar) {
        kotlin.jvm.internal.g.e(bVar, ea.a.p("OWlUdzRvU2Vs", "l4Qh3EsD"));
        this.f25116d = bVar;
        this.f25117e = new ArrayList<>();
        this.f25120h = OS2WindowsMetricsTable.WEIGHT_CLASS_LIGHT;
        this.f25121i = OS2WindowsMetricsTable.WEIGHT_CLASS_LIGHT;
    }

    public static void h(bn.a aVar, ImageViewHolder imageViewHolder) {
        if (aVar.f5492f) {
            imageViewHolder.f25126d.setStrokeColor(androidx.core.content.a.getColorStateList(imageViewHolder.itemView.getContext(), R.color.colorImgSelectedFrame));
            imageViewHolder.f25128f.setVisibility(0);
            imageViewHolder.f25129g.setVisibility(8);
            return;
        }
        imageViewHolder.f25126d.setStrokeColor(androidx.core.content.a.getColorStateList(imageViewHolder.itemView.getContext(), R.color.colorImgUnSelectedFrame));
        imageViewHolder.f25128f.setVisibility(8);
        imageViewHolder.f25129g.setVisibility(0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f25117e.size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0047, code lost:
        if (((r12 == null || (r12 = r12.get()) == null || r12.isRecycled()) ? false : true) != false) goto L16;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onBindViewHolder(pdf.pdfreader.viewer.editor.free.feature.ocr.ui.adapter.OCRSelectPDFPageAdapter.ImageViewHolder r11, int r12) {
        /*
            r10 = this;
            pdf.pdfreader.viewer.editor.free.feature.ocr.ui.adapter.OCRSelectPDFPageAdapter$ImageViewHolder r11 = (pdf.pdfreader.viewer.editor.free.feature.ocr.ui.adapter.OCRSelectPDFPageAdapter.ImageViewHolder) r11
            java.lang.String r0 = "holder"
            kotlin.jvm.internal.g.e(r11, r0)
            java.util.ArrayList<bn.a> r0 = r10.f25117e
            java.lang.Object r0 = kotlin.collections.m.t0(r12, r0)
            bn.a r0 = (bn.a) r0
            if (r0 == 0) goto Laf
            android.view.View r1 = r11.itemView
            android.content.Context r9 = r1.getContext()
            r1 = 1
            int r12 = r12 + r1
            java.lang.String r12 = java.lang.String.valueOf(r12)
            android.widget.TextView r2 = r11.f25127e
            r2.setText(r12)
            java.lang.ref.WeakReference<android.graphics.Bitmap> r12 = r0.f5488a
            r2 = 0
            if (r12 == 0) goto L2e
            java.lang.Object r12 = r12.get()
            android.graphics.Bitmap r12 = (android.graphics.Bitmap) r12
            goto L2f
        L2e:
            r12 = r2
        L2f:
            r3 = 0
            if (r12 == 0) goto L4a
            java.lang.ref.WeakReference<android.graphics.Bitmap> r12 = r0.f5488a
            if (r12 == 0) goto L46
            java.lang.Object r12 = r12.get()
            android.graphics.Bitmap r12 = (android.graphics.Bitmap) r12
            if (r12 == 0) goto L46
            boolean r12 = r12.isRecycled()
            if (r12 != 0) goto L46
            r12 = r1
            goto L47
        L46:
            r12 = r3
        L47:
            if (r12 == 0) goto L4a
            goto L4b
        L4a:
            r1 = r3
        L4b:
            android.widget.FrameLayout r12 = r11.c
            android.widget.ImageView r4 = r11.f25130h
            if (r1 == 0) goto L72
            r4.setVisibility(r3)
            r1 = 8
            r12.setVisibility(r1)
            com.bumptech.glide.f r12 = com.bumptech.glide.b.f(r9)
            java.lang.ref.WeakReference<android.graphics.Bitmap> r1 = r0.f5488a
            if (r1 == 0) goto L68
            java.lang.Object r1 = r1.get()
            r2 = r1
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
        L68:
            com.bumptech.glide.e r12 = r12.l(r2)
            com.google.android.material.imageview.ShapeableImageView r1 = r11.f25126d
            r12.E(r1)
            goto L9b
        L72:
            r1 = 4
            r4.setVisibility(r1)
            r12.setVisibility(r3)
            cn.e r12 = cn.e.f5754a
            java.lang.String r1 = "G20TZwZMUHN0"
            java.lang.String r2 = "Icrrc9b2"
            java.lang.String r1 = ea.a.p(r1, r2)
            r2 = 0
            int r4 = r10.f25120h
            int r5 = r10.f25121i
            com.google.android.material.imageview.ShapeableImageView r6 = r11.f25126d
            lib.zj.pdfeditor.ReaderPDFCore r7 = r10.f25119g
            pdf.pdfreader.viewer.editor.free.feature.ocr.ui.adapter.d r8 = new pdf.pdfreader.viewer.editor.free.feature.ocr.ui.adapter.d
            r8.<init>()
            r12.getClass()
            r3 = r0
            java.util.concurrent.Future r12 = cn.e.e(r1, r2, r3, r4, r5, r6, r7, r8)
            r11.f25132j = r12
        L9b:
            h(r0, r11)
            qe.g r12 = new qe.g
            r12.<init>(r9)
            eightbitlab.com.blurview.BlurView r0 = r11.f25131i
            androidx.constraintlayout.widget.ConstraintLayout r11 = r11.f25125b
            qe.d r11 = r0.b(r11, r12)
            r12 = 1086324736(0x40c00000, float:6.0)
            r11.f29293a = r12
        Laf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.feature.ocr.ui.adapter.OCRSelectPDFPageAdapter.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$b0, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final ImageViewHolder onCreateViewHolder(ViewGroup parent, int i10) {
        kotlin.jvm.internal.g.e(parent, "parent");
        View i11 = androidx.activity.f.i(parent, R.layout.item_ocr_select_pdf_page, parent, false);
        kotlin.jvm.internal.g.d(i11, ea.a.p("VXIkbVtwA3IXbkAuCm84dCF4RiloaS1ms4DgX0BkBF9DYSxlXyASYQBlWnRFIDBhKHNXKQ==", "QF0bhXIx"));
        return new ImageViewHolder(this, i11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
        if (r0.isDone() == true) goto L5;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onViewRecycled(pdf.pdfreader.viewer.editor.free.feature.ocr.ui.adapter.OCRSelectPDFPageAdapter.ImageViewHolder r4) {
        /*
            r3 = this;
            pdf.pdfreader.viewer.editor.free.feature.ocr.ui.adapter.OCRSelectPDFPageAdapter$ImageViewHolder r4 = (pdf.pdfreader.viewer.editor.free.feature.ocr.ui.adapter.OCRSelectPDFPageAdapter.ImageViewHolder) r4
            java.lang.String r0 = "holder"
            kotlin.jvm.internal.g.e(r4, r0)
            super.onViewRecycled(r4)
            java.util.concurrent.Future<?> r0 = r4.f25132j
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
            java.util.concurrent.Future<?> r4 = r4.f25132j
            if (r4 == 0) goto L21
            r4.cancel(r1)
        L21:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.feature.ocr.ui.adapter.OCRSelectPDFPageAdapter.onViewRecycled(androidx.recyclerview.widget.RecyclerView$b0):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(ImageViewHolder imageViewHolder, int i10, List payloads) {
        ImageViewHolder holder = imageViewHolder;
        kotlin.jvm.internal.g.e(holder, "holder");
        kotlin.jvm.internal.g.e(payloads, "payloads");
        if (payloads.isEmpty()) {
            super.onBindViewHolder(holder, i10, payloads);
            return;
        }
        bn.a aVar = (bn.a) m.t0(i10, this.f25117e);
        if (aVar != null) {
            holder.f25127e.setText(String.valueOf(i10 + 1));
            h(aVar, holder);
        }
    }
}

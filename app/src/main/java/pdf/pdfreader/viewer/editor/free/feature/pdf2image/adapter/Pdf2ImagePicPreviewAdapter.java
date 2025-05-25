package pdf.pdfreader.viewer.editor.free.feature.pdf2image.adapter;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.activity.f;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import cg.l;
import cg.p;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;
import eightbitlab.com.blurview.BlurView;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import kotlin.collections.m;
import kotlin.jvm.internal.g;
import lib.zj.pdfeditor.ReaderPDFCore;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.feature.pdf2image.adapter.Pdf2ImagePicPreviewAdapter;
import qb.j1;

/* compiled from: Pdf2ImagePicPreviewAdapter.kt */
/* loaded from: classes3.dex */
public final class Pdf2ImagePicPreviewAdapter extends RecyclerView.Adapter<ImageViewHolder> {

    /* renamed from: d  reason: collision with root package name */
    public final en.b f25428d;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList<bn.a> f25429e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f25430f;

    /* renamed from: g  reason: collision with root package name */
    public ReaderPDFCore f25431g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f25432h;

    /* renamed from: i  reason: collision with root package name */
    public int f25433i;

    /* renamed from: j  reason: collision with root package name */
    public int f25434j;

    /* renamed from: k  reason: collision with root package name */
    public l<? super Integer, tf.d> f25435k;

    /* renamed from: l  reason: collision with root package name */
    public p<? super bn.a, ? super Integer, tf.d> f25436l;

    /* renamed from: m  reason: collision with root package name */
    public cg.a<tf.d> f25437m;

    /* renamed from: n  reason: collision with root package name */
    public Bitmap f25438n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f25439o;

    /* compiled from: Pdf2ImagePicPreviewAdapter.kt */
    @SuppressLint({"ClickableViewAccessibility"})
    /* loaded from: classes3.dex */
    public final class ImageViewHolder extends RecyclerView.b0 {

        /* renamed from: n  reason: collision with root package name */
        public static final /* synthetic */ int f25440n = 0;

        /* renamed from: b  reason: collision with root package name */
        public final ConstraintLayout f25441b;
        public final FrameLayout c;

        /* renamed from: d  reason: collision with root package name */
        public final AppCompatTextView f25442d;

        /* renamed from: e  reason: collision with root package name */
        public final LinearLayout f25443e;

        /* renamed from: f  reason: collision with root package name */
        public final FrameLayout f25444f;

        /* renamed from: g  reason: collision with root package name */
        public final AppCompatImageView f25445g;

        /* renamed from: h  reason: collision with root package name */
        public final AppCompatImageView f25446h;

        /* renamed from: i  reason: collision with root package name */
        public final View f25447i;

        /* renamed from: j  reason: collision with root package name */
        public final BlurView f25448j;

        /* renamed from: k  reason: collision with root package name */
        public Future<?> f25449k;

        /* renamed from: l  reason: collision with root package name */
        public float f25450l;

        /* renamed from: m  reason: collision with root package name */
        public float f25451m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ImageViewHolder(final Pdf2ImagePicPreviewAdapter pdf2ImagePicPreviewAdapter, View view) {
            super(view);
            ea.a.p("WnQubSVpB3c=", "nXO7yZyS");
            View findViewById = view.findViewById(R.id.rootView);
            g.d(findViewById, ea.a.p("WnQubSVpB3dcZl1uDVY_ZTNCS0kiKBEuUGRCciZvH1ZaZTwp", "9lIkwSwt"));
            this.f25441b = (ConstraintLayout) findViewById;
            View findViewById2 = view.findViewById(R.id.progressFl);
            g.d(findViewById2, ea.a.p("WnQubSVpB3dcZl1uDVY_ZTNCS0kiKBEuXGRecEJvInJWczhGHyk=", "5p0E1W5C"));
            this.c = (FrameLayout) findViewById2;
            View findViewById3 = view.findViewById(R.id.indexTv);
            g.d(findViewById3, ea.a.p("WnQubSVpB3dcZl1uDVY_ZTNCS0kiKBEuLmRPaVlkFXhndik=", "Ga7p2mWg"));
            this.f25442d = (AppCompatTextView) findViewById3;
            View findViewById4 = view.findViewById(R.id.indexLinear);
            g.d(findViewById4, ea.a.p("PXQJbRBpNHdmZg9uUFY-ZU9CK0ktKGQuHWRfaT9kJ3gYaQJlJ3Ip", "hPTlFQ9J"));
            this.f25443e = (LinearLayout) findViewById4;
            View findViewById5 = view.findViewById(R.id.expandIv);
            g.d(findViewById5, ea.a.p("LHQSbWJpN3dmZg9uUFY-ZU9CK0ktKGQuHWRfZSlwI24hSQEp", "9LEw4RQH"));
            FrameLayout frameLayout = (FrameLayout) findViewById5;
            this.f25444f = frameLayout;
            View findViewById6 = view.findViewById(R.id.itemIconIv);
            g.d(findViewById6, ea.a.p("WnQubSVpB3dcZl1uDVY_ZTNCS0kiKBEuMGRIaUFlOElQbyVJBSk=", "Yf5Uugme"));
            this.f25445g = (AppCompatImageView) findViewById6;
            View findViewById7 = view.findViewById(R.id.iv_watermark);
            g.d(findViewById7, ea.a.p("WnQubSVpB3dcZl1uDVY_ZTNCS0kiKBEuL2RLaRhfBGFHZTltEnIJKQ==", "FensaSEN"));
            this.f25446h = (AppCompatImageView) findViewById7;
            View findViewById8 = view.findViewById(R.id.viewBoard);
            g.d(findViewById8, ea.a.p("JnRUbS9pUnd0ZiNuEVYBZUJCF0khKDcuPGQadgFlBUIgYUNkKQ==", "jXsQU4hr"));
            this.f25447i = findViewById8;
            View findViewById9 = view.findViewById(R.id.blurView);
            g.d(findViewById9, ea.a.p("WnQubSVpB3dcZl1uDVY_ZTNCS0kiKBEuCmRmYlR1MFZaZTwp", "cH8BiSsk"));
            this.f25448j = (BlurView) findViewById9;
            view.setOnClickListener(new j1(1, this, pdf2ImagePicPreviewAdapter));
            pdf.pdfreader.viewer.editor.free.utils.extension.g.e(frameLayout, new l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pdf2image.adapter.Pdf2ImagePicPreviewAdapter.ImageViewHolder.2
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
                    g.e(view2, "view");
                    bn.a aVar = (bn.a) m.t0(this.getAdapterPosition(), Pdf2ImagePicPreviewAdapter.this.f25429e);
                    if (aVar != null) {
                        Pdf2ImagePicPreviewAdapter pdf2ImagePicPreviewAdapter2 = Pdf2ImagePicPreviewAdapter.this;
                        ImageViewHolder imageViewHolder = this;
                        p<? super bn.a, ? super Integer, tf.d> pVar = pdf2ImagePicPreviewAdapter2.f25436l;
                        if (pVar != null) {
                            pVar.invoke(aVar, Integer.valueOf(imageViewHolder.getAdapterPosition()));
                        }
                    }
                }
            });
            view.setOnTouchListener(new View.OnTouchListener() { // from class: pdf.pdfreader.viewer.editor.free.feature.pdf2image.adapter.d
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    boolean z10;
                    String p10 = ea.a.p("R2gic1cw", "5WQGefsC");
                    Pdf2ImagePicPreviewAdapter.ImageViewHolder imageViewHolder = this;
                    g.e(imageViewHolder, p10);
                    String p11 = ea.a.p("O2hYc10x", "tQnQVF4I");
                    Pdf2ImagePicPreviewAdapter pdf2ImagePicPreviewAdapter2 = pdf2ImagePicPreviewAdapter;
                    g.e(pdf2ImagePicPreviewAdapter2, p11);
                    int action = motionEvent.getAction();
                    if (action != 0) {
                        if (action != 2) {
                            pdf2ImagePicPreviewAdapter2.f25430f = false;
                            return false;
                        } else if (pdf2ImagePicPreviewAdapter2.f25430f) {
                            return false;
                        } else {
                            float x4 = motionEvent.getX();
                            float y10 = motionEvent.getY();
                            if (Math.abs(y10 - imageViewHolder.f25451m) < 5.0f && Math.abs(x4 - imageViewHolder.f25450l) < 5.0f) {
                                return false;
                            }
                            pdf2ImagePicPreviewAdapter2.f25430f = true;
                            if (Math.abs(x4 - imageViewHolder.f25450l) <= Math.abs(y10 - imageViewHolder.f25451m)) {
                                return false;
                            }
                            Integer valueOf = Integer.valueOf(imageViewHolder.getAdapterPosition());
                            int intValue = valueOf.intValue();
                            if (intValue >= 0 && intValue < pdf2ImagePicPreviewAdapter2.f25429e.size()) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (!z10) {
                                valueOf = null;
                            }
                            if (valueOf == null) {
                                return false;
                            }
                            int intValue2 = valueOf.intValue();
                            l<? super Integer, tf.d> lVar = pdf2ImagePicPreviewAdapter2.f25435k;
                            if (lVar != null) {
                                lVar.invoke(Integer.valueOf(intValue2));
                            }
                            return true;
                        }
                    }
                    imageViewHolder.f25450l = motionEvent.getX();
                    imageViewHolder.f25451m = motionEvent.getY();
                    pdf2ImagePicPreviewAdapter2.f25430f = false;
                    return false;
                }
            });
        }
    }

    public Pdf2ImagePicPreviewAdapter(en.b bVar) {
        g.e(bVar, ea.a.p("RWkudz5vBmVs", "HbB5bzxK"));
        this.f25428d = bVar;
        this.f25429e = new ArrayList<>();
        this.f25433i = OS2WindowsMetricsTable.WEIGHT_CLASS_LIGHT;
        this.f25434j = OS2WindowsMetricsTable.WEIGHT_CLASS_LIGHT;
    }

    public static void h(bn.a aVar, ImageViewHolder imageViewHolder) {
        if (aVar.f5492f) {
            imageViewHolder.f25444f.setVisibility(4);
            imageViewHolder.f25443e.setVisibility(0);
            imageViewHolder.f25442d.setText(String.valueOf(aVar.f5493g));
            imageViewHolder.f25447i.setBackgroundResource(R.drawable.bg_convert_select_light_frame_bord1);
            return;
        }
        imageViewHolder.f25443e.setVisibility(4);
        imageViewHolder.f25444f.setVisibility(0);
        imageViewHolder.f25447i.setBackgroundResource(R.drawable.bg_convert_select_frame_r2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f25429e.size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0012, code lost:
        if (r2 != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(pdf.pdfreader.viewer.editor.free.feature.pdf2image.adapter.Pdf2ImagePicPreviewAdapter.ImageViewHolder r4) {
        /*
            r3 = this;
            boolean r0 = r3.f25439o
            if (r0 == 0) goto L34
            android.graphics.Bitmap r0 = r3.f25438n
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
            androidx.appcompat.widget.AppCompatImageView r2 = r4.f25446h
            android.content.Context r2 = r2.getContext()
            r0.getClass()
            r0 = 1065353216(0x3f800000, float:1.0)
            android.graphics.Bitmap r0 = cn.e.d(r2, r0)
            r3.f25438n = r0
        L27:
            androidx.appcompat.widget.AppCompatImageView r0 = r4.f25446h
            r0.setVisibility(r1)
            android.graphics.Bitmap r0 = r3.f25438n
            androidx.appcompat.widget.AppCompatImageView r4 = r4.f25446h
            r4.setImageBitmap(r0)
            goto L3b
        L34:
            androidx.appcompat.widget.AppCompatImageView r4 = r4.f25446h
            r0 = 8
            r4.setVisibility(r0)
        L3b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.feature.pdf2image.adapter.Pdf2ImagePicPreviewAdapter.i(pdf.pdfreader.viewer.editor.free.feature.pdf2image.adapter.Pdf2ImagePicPreviewAdapter$ImageViewHolder):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
        if (((r0 == null || (r0 = r0.get()) == null || r0.isRecycled()) ? false : true) != false) goto L16;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onBindViewHolder(pdf.pdfreader.viewer.editor.free.feature.pdf2image.adapter.Pdf2ImagePicPreviewAdapter.ImageViewHolder r11, int r12) {
        /*
            r10 = this;
            pdf.pdfreader.viewer.editor.free.feature.pdf2image.adapter.Pdf2ImagePicPreviewAdapter$ImageViewHolder r11 = (pdf.pdfreader.viewer.editor.free.feature.pdf2image.adapter.Pdf2ImagePicPreviewAdapter.ImageViewHolder) r11
            java.lang.String r0 = "holder"
            kotlin.jvm.internal.g.e(r11, r0)
            java.util.ArrayList<bn.a> r0 = r10.f25429e
            java.lang.Object r12 = kotlin.collections.m.t0(r12, r0)
            bn.a r12 = (bn.a) r12
            if (r12 == 0) goto Lc3
            android.view.View r0 = r11.itemView
            android.content.Context r8 = r0.getContext()
            java.lang.ref.WeakReference<android.graphics.Bitmap> r0 = r12.f5488a
            r1 = 0
            if (r0 == 0) goto L23
            java.lang.Object r0 = r0.get()
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            goto L24
        L23:
            r0 = r1
        L24:
            r2 = 0
            if (r0 == 0) goto L40
            java.lang.ref.WeakReference<android.graphics.Bitmap> r0 = r12.f5488a
            r3 = 1
            if (r0 == 0) goto L3c
            java.lang.Object r0 = r0.get()
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            if (r0 == 0) goto L3c
            boolean r0 = r0.isRecycled()
            if (r0 != 0) goto L3c
            r0 = r3
            goto L3d
        L3c:
            r0 = r2
        L3d:
            if (r0 == 0) goto L40
            goto L41
        L40:
            r3 = r2
        L41:
            r0 = 8
            android.widget.FrameLayout r4 = r11.c
            android.widget.FrameLayout r9 = r11.f25444f
            if (r3 == 0) goto L6a
            r9.setVisibility(r2)
            r4.setVisibility(r0)
            com.bumptech.glide.f r0 = com.bumptech.glide.b.f(r8)
            java.lang.ref.WeakReference<android.graphics.Bitmap> r2 = r12.f5488a
            if (r2 == 0) goto L5d
            java.lang.Object r1 = r2.get()
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
        L5d:
            com.bumptech.glide.e r0 = r0.l(r1)
            androidx.appcompat.widget.AppCompatImageView r1 = r11.f25445g
            r0.E(r1)
            r10.i(r11)
            goto L9a
        L6a:
            androidx.appcompat.widget.AppCompatImageView r1 = r11.f25446h
            r1.setVisibility(r0)
            r0 = 4
            r9.setVisibility(r0)
            r4.setVisibility(r2)
            cn.e r0 = cn.e.f5754a
            java.lang.String r1 = "K20kZwtMInN0"
            java.lang.String r2 = "l8BEnKHL"
            java.lang.String r1 = ea.a.p(r1, r2)
            r2 = 0
            int r3 = r10.f25433i
            int r4 = r10.f25434j
            androidx.appcompat.widget.AppCompatImageView r5 = r11.f25445g
            lib.zj.pdfeditor.ReaderPDFCore r6 = r10.f25431g
            pdf.pdfreader.viewer.editor.free.feature.pdf2image.adapter.c r7 = new pdf.pdfreader.viewer.editor.free.feature.pdf2image.adapter.c
            r7.<init>(r11, r8, r10, r12)
            r0.getClass()
            r0 = r1
            r1 = r2
            r2 = r12
            java.util.concurrent.Future r0 = cn.e.e(r0, r1, r2, r3, r4, r5, r6, r7)
            r11.f25449k = r0
        L9a:
            h(r12, r11)
            boolean r12 = r12.f5492f
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r12 == 0) goto Lac
            androidx.appcompat.widget.AppCompatTextView r12 = r11.f25442d
            r12.setScaleX(r0)
            r12.setScaleY(r0)
            goto Lb2
        Lac:
            r9.setScaleX(r0)
            r9.setScaleY(r0)
        Lb2:
            qe.g r12 = new qe.g
            r12.<init>(r8)
            eightbitlab.com.blurview.BlurView r0 = r11.f25448j
            androidx.constraintlayout.widget.ConstraintLayout r11 = r11.f25441b
            qe.d r11 = r0.b(r11, r12)
            r12 = 1086324736(0x40c00000, float:6.0)
            r11.f29293a = r12
        Lc3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.feature.pdf2image.adapter.Pdf2ImagePicPreviewAdapter.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$b0, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final ImageViewHolder onCreateViewHolder(ViewGroup parent, int i10) {
        g.e(parent, "parent");
        View i11 = f.i(parent, R.layout.item_pdf_to_img_preivew, parent, false);
        g.d(i11, ea.a.p("KXJebVFwVnI_bj4uFm8GdFB4GilraQtmo4DnZwhwSmUmdlR3VSBHYShlJHRZIA5hWXMLKQ==", "2eiAAAW8"));
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
    public final void onViewRecycled(pdf.pdfreader.viewer.editor.free.feature.pdf2image.adapter.Pdf2ImagePicPreviewAdapter.ImageViewHolder r4) {
        /*
            r3 = this;
            pdf.pdfreader.viewer.editor.free.feature.pdf2image.adapter.Pdf2ImagePicPreviewAdapter$ImageViewHolder r4 = (pdf.pdfreader.viewer.editor.free.feature.pdf2image.adapter.Pdf2ImagePicPreviewAdapter.ImageViewHolder) r4
            java.lang.String r0 = "holder"
            kotlin.jvm.internal.g.e(r4, r0)
            super.onViewRecycled(r4)
            java.util.concurrent.Future<?> r0 = r4.f25449k
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
            java.util.concurrent.Future<?> r4 = r4.f25449k
            if (r4 == 0) goto L21
            r4.cancel(r1)
        L21:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.feature.pdf2image.adapter.Pdf2ImagePicPreviewAdapter.onViewRecycled(androidx.recyclerview.widget.RecyclerView$b0):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(ImageViewHolder imageViewHolder, int i10, List payloads) {
        ImageViewHolder holder = imageViewHolder;
        g.e(holder, "holder");
        g.e(payloads, "payloads");
        if (payloads.isEmpty()) {
            super.onBindViewHolder(holder, i10, payloads);
            return;
        }
        bn.a aVar = (bn.a) m.t0(i10, this.f25429e);
        if (aVar != null) {
            h(aVar, holder);
            i(holder);
        }
    }
}

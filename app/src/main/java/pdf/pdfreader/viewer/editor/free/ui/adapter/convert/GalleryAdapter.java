package pdf.pdfreader.viewer.editor.free.ui.adapter.convert;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import c4.s;
import cg.l;
import com.bumptech.glide.Priority;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;
import eightbitlab.com.blurview.BlurView;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.m;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.data.ImageChooseWorkFlow;
import pdf.pdfreader.viewer.editor.free.ui.adapter.convert.GalleryAdapter;
import pdf.pdfreader.viewer.editor.free.ui.adapter.j;
import pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImg2PDFChooseActivity$galleryAdapter$2;

/* compiled from: GalleryAdapter.kt */
/* loaded from: classes3.dex */
public final class GalleryAdapter extends RecyclerView.Adapter<b> {

    /* renamed from: d  reason: collision with root package name */
    public final uo.a f27147d;

    /* renamed from: e  reason: collision with root package name */
    public final a f27148e;

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList<ul.b> f27149f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f27150g;

    /* renamed from: h  reason: collision with root package name */
    public final tf.c f27151h;

    /* renamed from: i  reason: collision with root package name */
    public ImageChooseWorkFlow f27152i;

    /* renamed from: j  reason: collision with root package name */
    public final int f27153j;

    /* renamed from: k  reason: collision with root package name */
    public cg.a<tf.d> f27154k;

    /* renamed from: l  reason: collision with root package name */
    public int f27155l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f27156m;

    /* compiled from: GalleryAdapter.kt */
    /* loaded from: classes3.dex */
    public final class CameraHolder extends b {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CameraHolder(final GalleryAdapter galleryAdapter, View view) {
            super(view);
            ea.a.p("WnQubSVpB3c=", "SvbmDqAf");
            pdf.pdfreader.viewer.editor.free.utils.extension.g.e(view, new l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.adapter.convert.GalleryAdapter.CameraHolder.1
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
                    GalleryAdapter.this.f27148e.c();
                }
            });
        }
    }

    /* compiled from: GalleryAdapter.kt */
    @SuppressLint({"ClickableViewAccessibility"})
    /* loaded from: classes3.dex */
    public final class ImageViewHolder extends b {

        /* renamed from: m  reason: collision with root package name */
        public static final /* synthetic */ int f27157m = 0;

        /* renamed from: b  reason: collision with root package name */
        public final ConstraintLayout f27158b;
        public final FrameLayout c;

        /* renamed from: d  reason: collision with root package name */
        public final AppCompatTextView f27159d;

        /* renamed from: e  reason: collision with root package name */
        public final LinearLayout f27160e;

        /* renamed from: f  reason: collision with root package name */
        public final ImageView f27161f;

        /* renamed from: g  reason: collision with root package name */
        public final CardView f27162g;

        /* renamed from: h  reason: collision with root package name */
        public final AppCompatImageView f27163h;

        /* renamed from: i  reason: collision with root package name */
        public final View f27164i;

        /* renamed from: j  reason: collision with root package name */
        public final BlurView f27165j;

        /* renamed from: k  reason: collision with root package name */
        public float f27166k;

        /* renamed from: l  reason: collision with root package name */
        public float f27167l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ImageViewHolder(final GalleryAdapter galleryAdapter, View view) {
            super(view);
            ea.a.p("WnQubSVpB3c=", "apmbkrJJ");
            View findViewById = view.findViewById(R.id.rootView);
            kotlin.jvm.internal.g.d(findViewById, ea.a.p("JnRUbS9pUnd0ZiNuEVYBZUJCF0khKDcuP2REcgVvHVYmZUYp", "ClfEVjji"));
            this.f27158b = (ConstraintLayout) findViewById;
            View findViewById2 = view.findViewById(R.id.progressFl);
            kotlin.jvm.internal.g.d(findViewById2, ea.a.p("JnRSbSRpVndmZg9uUFY-ZU9CK0ktKGQuHWRfcCNvJXIqc0RGHik=", "kVO7r3KH"));
            this.c = (FrameLayout) findViewById2;
            View findViewById3 = view.findViewById(R.id.indexTv);
            kotlin.jvm.internal.g.d(findViewById3, ea.a.p("UHRRbSZpEndmZg9uUFY-ZU9CK0ktKGQuHWRfaT9kJ3htdik=", "BD94pw3W"));
            this.f27159d = (AppCompatTextView) findViewById3;
            View findViewById4 = view.findViewById(R.id.indexLinear);
            kotlin.jvm.internal.g.d(findViewById4, ea.a.p("WnQubSVpB3dcZl1uDVY_ZTNCS0kiKBEuJGQZaSJkBHh_aSVlEnIp", "M7LaaKrY"));
            this.f27160e = (LinearLayout) findViewById4;
            View findViewById5 = view.findViewById(R.id.single_iv_selected);
            kotlin.jvm.internal.g.d(findViewById5, ea.a.p("WnQubSVpB3dcZl1uDVY_ZTNCS0kiKBEuHmREcx9uUWxWXyJ2LHMHbBdjQGUNKQ==", "wjv6B0fn"));
            this.f27161f = (ImageView) findViewById5;
            View findViewById6 = view.findViewById(R.id.expandIv);
            kotlin.jvm.internal.g.d(findViewById6, ea.a.p("JXQtbWRpE3dmZg9uUFY-ZU9CK0ktKGQuHWRfZSlwI24oST4p", "6zLH2vbp"));
            CardView cardView = (CardView) findViewById6;
            this.f27162g = cardView;
            View findViewById7 = view.findViewById(R.id.itemIconIv);
            kotlin.jvm.internal.g.d(findViewById7, ea.a.p("KnQ8bRhpMXdmZg9uUFY-ZU9CK0ktKGQuHWRfaSVlL0kgbzdJOCk=", "p2CYNTq9"));
            this.f27163h = (AppCompatImageView) findViewById7;
            View findViewById8 = view.findViewById(R.id.viewBoard);
            kotlin.jvm.internal.g.d(findViewById8, ea.a.p("JnRUbS9pUnd0ZiNuEVYBZUJCF0khKDcuEWRvdjtlRUIgYUNkKQ==", "PDvjxAR2"));
            this.f27164i = findViewById8;
            View findViewById9 = view.findViewById(R.id.blurView);
            kotlin.jvm.internal.g.d(findViewById9, ea.a.p("JnRUbS9pUnd0ZiNuEVYBZUJCF0khKDcuImQWYj11N1YmZUYp", "QBELK8QE"));
            this.f27165j = (BlurView) findViewById9;
            view.setOnClickListener(new j(2, this, galleryAdapter));
            view.setOnLongClickListener(new View.OnLongClickListener() { // from class: pdf.pdfreader.viewer.editor.free.ui.adapter.convert.c
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view2) {
                    String p10 = ea.a.p("O2hYc10w", "sh3ktLQe");
                    GalleryAdapter.ImageViewHolder imageViewHolder = this;
                    kotlin.jvm.internal.g.e(imageViewHolder, p10);
                    String p11 = ea.a.p("O2hYc10x", "MYlGpKoV");
                    GalleryAdapter galleryAdapter2 = galleryAdapter;
                    kotlin.jvm.internal.g.e(galleryAdapter2, p11);
                    int adapterPosition = imageViewHolder.getAdapterPosition();
                    if (((ul.b) m.t0(adapterPosition, galleryAdapter2.f27149f)) != null) {
                        galleryAdapter2.f27148e.a(adapterPosition);
                        return true;
                    }
                    return false;
                }
            });
            pdf.pdfreader.viewer.editor.free.utils.extension.g.e(cardView, new l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.adapter.convert.GalleryAdapter.ImageViewHolder.3
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
                    ul.b bVar = (ul.b) m.t0(this.getAdapterPosition(), GalleryAdapter.this.f27149f);
                    if (bVar != null) {
                        a aVar = GalleryAdapter.this.f27148e;
                        long j10 = bVar.f30405b;
                        String str = bVar.f30404a;
                        if (str == null) {
                            str = "";
                        } else {
                            ea.a.p("JnQfZhBsUlA7dCIgSjpIIiI=", "8us3kmmX");
                        }
                        aVar.b(j10, str);
                    }
                }
            });
            view.setOnTouchListener(new View.OnTouchListener() { // from class: pdf.pdfreader.viewer.editor.free.ui.adapter.convert.d
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    boolean z10;
                    String p10 = ea.a.p("R2gic1cw", "lhG04Fur");
                    GalleryAdapter.ImageViewHolder imageViewHolder = this;
                    kotlin.jvm.internal.g.e(imageViewHolder, p10);
                    String p11 = ea.a.p("M2gQc0cx", "z3Gyc7AT");
                    GalleryAdapter galleryAdapter2 = galleryAdapter;
                    kotlin.jvm.internal.g.e(galleryAdapter2, p11);
                    int action = motionEvent.getAction();
                    if (action != 0) {
                        if (action != 2) {
                            galleryAdapter2.f27150g = false;
                            return false;
                        } else if (galleryAdapter2.f27150g) {
                            return false;
                        } else {
                            float x4 = motionEvent.getX();
                            float y10 = motionEvent.getY();
                            if (Math.abs(y10 - imageViewHolder.f27167l) < 5.0f && Math.abs(x4 - imageViewHolder.f27166k) < 5.0f) {
                                return false;
                            }
                            galleryAdapter2.f27150g = true;
                            if (Math.abs(x4 - imageViewHolder.f27166k) <= Math.abs(y10 - imageViewHolder.f27167l)) {
                                return false;
                            }
                            Integer valueOf = Integer.valueOf(imageViewHolder.getAdapterPosition());
                            int intValue = valueOf.intValue();
                            if (intValue >= 0 && intValue < galleryAdapter2.f27149f.size()) {
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
                            galleryAdapter2.f27148e.a(valueOf.intValue());
                            return true;
                        }
                    }
                    imageViewHolder.f27166k = motionEvent.getX();
                    imageViewHolder.f27167l = motionEvent.getY();
                    galleryAdapter2.f27150g = false;
                    return false;
                }
            });
        }
    }

    /* compiled from: GalleryAdapter.kt */
    /* loaded from: classes3.dex */
    public interface a {
        void a(int i10);

        void b(long j10, String str);

        void c();
    }

    /* compiled from: GalleryAdapter.kt */
    /* loaded from: classes3.dex */
    public class b extends RecyclerView.b0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(View view) {
            super(view);
            ea.a.p("JnRUbS9pUnc=", "jOOei2vI");
        }
    }

    static {
        ea.a.p("dGEnbBZyG0EWYUR0DHI=", "SOAYYsen");
    }

    public GalleryAdapter(uo.a aVar, ReaderImg2PDFChooseActivity$galleryAdapter$2.a aVar2) {
        kotlin.jvm.internal.g.e(aVar, ea.a.p("RWkudz5vBmVs", "Lrwt5Sfb"));
        ea.a.p("XmkAdF1uPHI=", "j72s8YEy");
        this.f27147d = aVar;
        this.f27148e = aVar2;
        this.f27149f = new ArrayList<>();
        this.f27151h = kotlin.a.a(new cg.a<ArrayList<String>>() { // from class: pdf.pdfreader.viewer.editor.free.ui.adapter.convert.GalleryAdapter$payloads$2
            @Override // cg.a
            public final ArrayList<String> invoke() {
                return ge.a.j("");
            }
        });
        this.f27153j = OS2WindowsMetricsTable.WEIGHT_CLASS_MEDIUM;
        this.f27155l = -1;
        this.f27156m = true;
        try {
            Context m10 = ReaderPdfApplication.m();
            kotlin.jvm.internal.g.d(m10, ea.a.p("AmUTSSlzAGEmYwMoKQ==", "k9egGt7x"));
            int i10 = m10.getResources().getDisplayMetrics().widthPixels;
            if (i10 > 0) {
                this.f27153j = ((i10 / 3) * ShapeTypes.DOUBLE_WAVE) / 116;
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f27149f.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i10) {
        boolean z10;
        if (i10 != 0) {
            return 0;
        }
        ul.b bVar = (ul.b) m.t0(i10, this.f27149f);
        if (bVar != null && bVar.f30412j) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return 0;
        }
        return 1;
    }

    public final void h(ul.b bVar, ImageViewHolder imageViewHolder) {
        int i10 = 0;
        if (bVar.f30407e) {
            imageViewHolder.f27162g.setVisibility(4);
            if (this.f27152i == ImageChooseWorkFlow.SingleChoose) {
                imageViewHolder.f27161f.setVisibility(0);
            } else {
                imageViewHolder.f27160e.setVisibility(0);
                imageViewHolder.f27159d.setText(String.valueOf(bVar.f30408f));
            }
            imageViewHolder.f27164i.setBackgroundResource(R.drawable.bg_convert_select_light_frame);
            return;
        }
        CardView cardView = imageViewHolder.f27162g;
        if (bVar.a()) {
            i10 = 4;
        }
        cardView.setVisibility(i10);
        imageViewHolder.f27160e.setVisibility(4);
        imageViewHolder.f27161f.setVisibility(8);
        imageViewHolder.f27164i.setBackgroundResource(R.drawable.bg_convert_select_frame);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0010, code lost:
        if (r1.f30412j == true) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(boolean r5) {
        /*
            r4 = this;
            if (r5 != 0) goto L1c
            java.util.ArrayList<ul.b> r0 = r4.f27149f
            java.lang.Object r1 = kotlin.collections.m.s0(r0)
            ul.b r1 = (ul.b) r1
            r2 = 0
            if (r1 == 0) goto L13
            boolean r1 = r1.f30412j
            r3 = 1
            if (r1 != r3) goto L13
            goto L14
        L13:
            r3 = r2
        L14:
            if (r3 == 0) goto L1c
            r0.remove(r2)
            r4.notifyDataSetChanged()
        L1c:
            r4.f27156m = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.ui.adapter.convert.GalleryAdapter.i(boolean):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(b bVar, int i10) {
        ul.b bVar2;
        Priority priority;
        b holder = bVar;
        kotlin.jvm.internal.g.e(holder, "holder");
        if (!(holder instanceof ImageViewHolder) || (bVar2 = (ul.b) m.t0(i10, this.f27149f)) == null) {
            return;
        }
        Context context = holder.itemView.getContext();
        long j10 = bVar2.f30406d;
        if (j10 < 10485760) {
            priority = Priority.HIGH;
        } else if (j10 > 52428800) {
            priority = Priority.LOW;
        } else {
            priority = Priority.NORMAL;
        }
        bVar2.f30409g = bVar2.a();
        ImageViewHolder imageViewHolder = (ImageViewHolder) holder;
        imageViewHolder.c.setVisibility(bVar2.a() ? 8 : 0);
        AppCompatImageView appCompatImageView = imageViewHolder.f27163h;
        Context context2 = appCompatImageView.getContext();
        kotlin.jvm.internal.g.d(context2, ea.a.p("J29dZBxyGWkuZSdJFm8GSUMuDW8rdAB4dA==", "e6uwIVuP"));
        int i11 = pdf.pdfreader.viewer.editor.free.utils.extension.c.h(context2) ? R.drawable.ic_convert_unavailable_night : R.drawable.ic_convert_unavailable;
        if (bVar2.a()) {
            com.bumptech.glide.e<Drawable> n10 = com.bumptech.glide.b.f(context).n(Integer.valueOf(i11));
            ea.a.p("UG8ldBZ4dA==", "rUcCU0F9");
            l4.e A = new l4.e().A(new c4.f(), new s(context.getResources().getDimensionPixelSize(R.dimen.dp_4)));
            kotlin.jvm.internal.g.d(A, ea.a.p("HWVAdRxzQ08qdCNvG3NAKRt0HGErcwNvtYDoLiRvKmUQMwY1V1IZZDNtL25bZBhfASlHKQ==", "bCZnWNgX"));
            n10.C(A).c().E(appCompatImageView);
        } else {
            com.bumptech.glide.e<Drawable> o10 = com.bumptech.glide.b.f(context).o(bVar2.f30404a);
            o10.E = com.bumptech.glide.a.c();
            ea.a.p("LG9fdBx4dA==", "ipUN1Wzu");
            l4.e A2 = new l4.e().A(new c4.f(), new s(context.getResources().getDimensionPixelSize(R.dimen.dp_4)));
            kotlin.jvm.internal.g.d(A2, ea.a.p("HWVAdRxzQ08qdCNvG3NAKRt0HGErcwNvtYDoLiRvKmUQMwY1V1IZZDNtL25bZBhfASlHKQ==", "bCZnWNgX"));
            int i12 = this.f27153j;
            com.bumptech.glide.e c = o10.C(A2).q(priority).n(i12, i12).c();
            String str = bVar2.f30404a;
            if (str == null) {
                str = "";
            } else {
                ea.a.p("Wm0qZxYuBGkeZWRhHWh2P34gECI=", "S3HSRiwE");
            }
            com.bumptech.glide.e j11 = c.u(new o4.d(Long.valueOf(new File(str).lastModified()))).j(i11);
            j11.H(new e(holder, bVar2));
            j11.E(appCompatImageView);
        }
        h(bVar2, imageViewHolder);
        if (bVar2.f30407e) {
            AppCompatTextView appCompatTextView = imageViewHolder.f27159d;
            appCompatTextView.setScaleX(1.0f);
            appCompatTextView.setScaleY(1.0f);
        } else {
            CardView cardView = imageViewHolder.f27162g;
            cardView.setScaleX(1.0f);
            cardView.setScaleY(1.0f);
        }
        imageViewHolder.f27165j.b(imageViewHolder.f27158b, new qe.g(context)).f29293a = 6.0f;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final b onCreateViewHolder(ViewGroup parent, int i10) {
        kotlin.jvm.internal.g.e(parent, "parent");
        if (i10 == 1) {
            View i11 = androidx.activity.f.i(parent, R.layout.item_convert_gallery_camera_r3, parent, false);
            kotlin.jvm.internal.g.d(i11, ea.a.p("KXJebVFwVnI_bj4uFm8GdFB4GilraQtmjIDjYxJtM3IuX0MzVSBHYShlJHRZIA5hWXMLKQ==", "8MMTnEsV"));
            return new CameraHolder(this, i11);
        }
        View i12 = androidx.activity.f.i(parent, R.layout.item_convert_gallery_r3, parent, false);
        kotlin.jvm.internal.g.d(i12, ea.a.p("KHIVbVFwNnItbhIuV285dF14JilnaVhmloDXYT1sJ3I3XwgzVSAnYTplCHQYIDFhVHM3KQ==", "loNzyWB7"));
        return new ImageViewHolder(this, i12);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(b bVar, int i10, List payloads) {
        ul.b bVar2;
        b holder = bVar;
        kotlin.jvm.internal.g.e(holder, "holder");
        kotlin.jvm.internal.g.e(payloads, "payloads");
        if (payloads.isEmpty()) {
            super.onBindViewHolder(holder, i10, payloads);
        } else if (!(holder instanceof ImageViewHolder) || (bVar2 = (ul.b) m.t0(i10, this.f27149f)) == null) {
        } else {
            h(bVar2, (ImageViewHolder) holder);
        }
    }
}

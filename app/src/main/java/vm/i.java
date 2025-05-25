package vm;

import android.annotation.SuppressLint;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r;
import cg.l;
import cg.p;
import com.google.android.material.imageview.ShapeableImageView;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;
import eightbitlab.com.blurview.BlurView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import kotlin.collections.m;
import lib.zj.pdfeditor.ReaderPDFCore;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.repo.convert.ImageConvertDataRepository;
import vm.i;

/* compiled from: PdfPageManagerAdapter.kt */
/* loaded from: classes3.dex */
public final class i extends RecyclerView.Adapter<a> implements ep.a {

    /* renamed from: d  reason: collision with root package name */
    public final an.b f30864d;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList<bn.a> f30865e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f30866f;

    /* renamed from: g  reason: collision with root package name */
    public ReaderPDFCore f30867g;

    /* renamed from: h  reason: collision with root package name */
    public int f30868h;

    /* renamed from: i  reason: collision with root package name */
    public int f30869i;

    /* renamed from: j  reason: collision with root package name */
    public l<? super Integer, tf.d> f30870j;

    /* renamed from: k  reason: collision with root package name */
    public l<? super Integer, tf.d> f30871k;

    /* renamed from: l  reason: collision with root package name */
    public p<? super Integer, ? super Integer, tf.d> f30872l;

    /* renamed from: m  reason: collision with root package name */
    public cg.a<Boolean> f30873m;

    /* renamed from: n  reason: collision with root package name */
    public r f30874n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f30875o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f30876p;

    /* renamed from: q  reason: collision with root package name */
    public int f30877q;

    /* renamed from: r  reason: collision with root package name */
    public int f30878r;

    /* renamed from: s  reason: collision with root package name */
    public int f30879s;

    /* renamed from: t  reason: collision with root package name */
    public int f30880t;

    /* renamed from: u  reason: collision with root package name */
    public int f30881u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f30882v;

    /* compiled from: PdfPageManagerAdapter.kt */
    @SuppressLint({"ClickableViewAccessibility"})
    /* loaded from: classes3.dex */
    public final class a extends RecyclerView.b0 {

        /* renamed from: n  reason: collision with root package name */
        public static final /* synthetic */ int f30883n = 0;

        /* renamed from: b  reason: collision with root package name */
        public final ConstraintLayout f30884b;
        public final ConstraintLayout c;

        /* renamed from: d  reason: collision with root package name */
        public final FrameLayout f30885d;

        /* renamed from: e  reason: collision with root package name */
        public final ShapeableImageView f30886e;

        /* renamed from: f  reason: collision with root package name */
        public final TextView f30887f;

        /* renamed from: g  reason: collision with root package name */
        public final ImageView f30888g;

        /* renamed from: h  reason: collision with root package name */
        public final ImageView f30889h;

        /* renamed from: i  reason: collision with root package name */
        public final FrameLayout f30890i;

        /* renamed from: j  reason: collision with root package name */
        public final BlurView f30891j;

        /* renamed from: k  reason: collision with root package name */
        public Future<?> f30892k;

        /* renamed from: l  reason: collision with root package name */
        public float f30893l;

        /* renamed from: m  reason: collision with root package name */
        public float f30894m;

        /* compiled from: PdfPageManagerAdapter.kt */
        /* renamed from: vm.i$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0388a extends ViewOutlineProvider {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ View f30895a;

            public C0388a(View view) {
                this.f30895a = view;
            }

            @Override // android.view.ViewOutlineProvider
            public final void getOutline(View view, Outline outline) {
                kotlin.jvm.internal.g.e(view, "view");
                kotlin.jvm.internal.g.e(outline, "outline");
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.f30895a.getContext().getResources().getDimension(R.dimen.dp_6));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(final i iVar, View view) {
            super(view);
            ea.a.p("WnQubSVpB3c=", "JaoPOEaU");
            View findViewById = view.findViewById(R.id.rootView);
            kotlin.jvm.internal.g.d(findViewById, ea.a.p("InQubQdpMXdmZg9uUFY-ZU9CK0ktKGQuHWRfcj5vNlYiZTwp", "LJKKQT7N"));
            this.f30884b = (ConstraintLayout) findViewById;
            View findViewById2 = view.findViewById(R.id.itemIconCl);
            kotlin.jvm.internal.g.d(findViewById2, ea.a.p("JnRUbS9pUnd0ZiNuEVYBZUJCF0khKDcuBmRCaSJlHUksb19DFSk=", "MTGBolVp"));
            this.c = (ConstraintLayout) findViewById2;
            View findViewById3 = view.findViewById(R.id.progressFl);
            kotlin.jvm.internal.g.d(findViewById3, ea.a.p("WnQubSVpB3dcZl1uDVY_ZTNCS0kiKBEuCmRncB1vJXJWczhGHyk=", "cIoBjS9e"));
            this.f30885d = (FrameLayout) findViewById3;
            View findViewById4 = view.findViewById(R.id.itemIconIv);
            kotlin.jvm.internal.g.d(findViewById4, ea.a.p("JnRUbS9pUnd0ZiNuEVYBZUJCF0khKDcuJGRCaTNlVUksb19JDyk=", "jV8bMlG8"));
            this.f30886e = (ShapeableImageView) findViewById4;
            View findViewById5 = view.findViewById(R.id.tvIndex);
            kotlin.jvm.internal.g.d(findViewById5, ea.a.p("P3QObRlpIXdmZg9uUFY-ZU9CK0ktKGQuHWRfdCdJLGQzeCk=", "xmVkODl7"));
            this.f30887f = (TextView) findViewById5;
            View findViewById6 = view.findViewById(R.id.ivSingleChoice);
            kotlin.jvm.internal.g.d(findViewById6, ea.a.p("WnQubSVpB3dcZl1uDVY_ZTNCS0kiKBEuXGR2aTdTLm5UbC5DG28LYxcp", "5XAG6mfh"));
            this.f30888g = (ImageView) findViewById6;
            View findViewById7 = view.findViewById(R.id.ivMultipleChoice);
            kotlin.jvm.internal.g.d(findViewById7, ea.a.p("JnRUbS9pUnd0ZiNuEVYBZUJCF0khKDcuBGRlaRBNHmw7aUFsHENfbzNjLyk=", "At2gmKfk"));
            this.f30889h = (ImageView) findViewById7;
            View findViewById8 = view.findViewById(R.id.item_pdf_unck);
            kotlin.jvm.internal.g.d(findViewById8, ea.a.p("WnQubSVpB3dcZl1uDVY_ZTNCS0kiKBEuOWRvaUFlA19DZC1fBm4Bayk=", "PA5nIme6"));
            FrameLayout frameLayout = (FrameLayout) findViewById8;
            this.f30890i = frameLayout;
            View findViewById9 = view.findViewById(R.id.item_blur);
            kotlin.jvm.internal.g.d(findViewById9, ea.a.p("WnQubSVpB3dcZl1uDVY_ZTNCS0kiKBEuE2R3aUVlL19RbD5yKQ==", "zY1BC5OF"));
            this.f30891j = (BlurView) findViewById9;
            frameLayout.setClipToOutline(true);
            frameLayout.setOutlineProvider(new C0388a(view));
            view.setOnClickListener(new g(0, this, iVar));
            view.setOnLongClickListener(new View.OnLongClickListener() { // from class: vm.h
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view2) {
                    boolean z10;
                    String p10 = ea.a.p("QmgKc2Aw", "sv6cD9s8");
                    i iVar2 = i.this;
                    kotlin.jvm.internal.g.e(iVar2, p10);
                    String p11 = ea.a.p("O2hYc10x", "AlKXRbWp");
                    i.a aVar = this;
                    kotlin.jvm.internal.g.e(aVar, p11);
                    cg.a<Boolean> aVar2 = iVar2.f30873m;
                    if (aVar2 != null && aVar2.invoke().booleanValue()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        iVar2.f30875o = true;
                        r rVar = iVar2.f30874n;
                        if (rVar != null) {
                            rVar.t(aVar);
                        }
                    }
                    return true;
                }
            });
            view.setOnTouchListener(new pdf.pdfreader.viewer.editor.free.feature.ocr.ui.adapter.f(1, iVar, this));
        }
    }

    public i(an.b bVar) {
        kotlin.jvm.internal.g.e(bVar, ea.a.p("L2kud35vFWVs", "B7YK3qnU"));
        this.f30864d = bVar;
        this.f30865e = new ArrayList<>();
        this.f30868h = OS2WindowsMetricsTable.WEIGHT_CLASS_LIGHT;
        this.f30869i = OS2WindowsMetricsTable.WEIGHT_CLASS_LIGHT;
        this.f30880t = -1;
        this.f30881u = -1;
    }

    @Override // ep.a
    public final void d(int i10, int i11) {
        this.f30882v = true;
        if (this.f30880t == -1) {
            this.f30880t = i10;
        }
        this.f30881u = i11;
        j(i10, i11);
    }

    @Override // ep.a
    public final void f() {
        p<? super Integer, ? super Integer, tf.d> pVar;
        if (this.f30882v) {
            int i10 = this.f30880t;
            if (i10 != -1 && this.f30881u != -1 && (pVar = this.f30872l) != null) {
                pVar.invoke(Integer.valueOf(i10), Integer.valueOf(this.f30881u));
            }
            this.f30880t = -1;
            this.f30881u = -1;
            wm.b.c.getClass();
            int i11 = 1;
            if (wm.b.i() < 2) {
                wm.b.f31382h.c(wm.b.f31378d[2], Integer.valueOf(wm.b.i() + 1));
            }
            Iterator<bn.a> it = this.f30865e.iterator();
            int i12 = 0;
            while (it.hasNext()) {
                bn.a next = it.next();
                int i13 = i12 + 1;
                if (i12 >= 0) {
                    bn.a aVar = next;
                    if (aVar.f5492f) {
                        aVar.f5493g = i11;
                        i11++;
                    }
                    aVar.f5491e = i12;
                    i12 = i13;
                } else {
                    ge.a.c0();
                    throw null;
                }
            }
            notifyItemRangeChanged(0, getItemCount(), ge.a.j(""));
            ImageConvertDataRepository.f26536a.getClass();
            ImageConvertDataRepository.n();
        }
    }

    @Override // ep.a
    public final void g() {
        this.f30882v = false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f30865e.size();
    }

    public final bn.a h(int i10) {
        return (bn.a) m.t0(i10, this.f30865e);
    }

    public final void i(int i10, ArrayList arrayList) {
        this.f30865e.addAll(i10, arrayList);
        l();
        notifyItemRangeInserted(i10, arrayList.size());
    }

    public final void j(int i10, int i11) {
        ArrayList<bn.a> arrayList = this.f30865e;
        if (i10 < i11) {
            int i12 = i10;
            while (i12 < i11) {
                int i13 = i12 + 1;
                Collections.swap(arrayList, i12, i13);
                i12 = i13;
            }
        } else {
            int i14 = i11 + 1;
            if (i14 <= i10) {
                int i15 = i10;
                while (true) {
                    Collections.swap(arrayList, i15, i15 - 1);
                    if (i15 == i14) {
                        break;
                    }
                    i15--;
                }
            }
        }
        notifyItemMoved(i10, i11);
    }

    public final void k(bn.a aVar, a aVar2) {
        if (aVar.f5492f) {
            aVar2.f30886e.setStrokeColor(androidx.core.content.a.getColorStateList(aVar2.itemView.getContext(), R.color.colorImgSelectedFrame));
            boolean z10 = this.f30876p;
            FrameLayout frameLayout = aVar2.f30890i;
            ImageView imageView = aVar2.f30888g;
            ImageView imageView2 = aVar2.f30889h;
            if (z10) {
                imageView2.setVisibility(0);
                imageView.setVisibility(8);
                frameLayout.setVisibility(8);
                imageView2.setVisibility(0);
                return;
            }
            imageView.setVisibility(0);
            imageView2.setVisibility(8);
            frameLayout.setVisibility(8);
            return;
        }
        aVar2.f30886e.setStrokeColor(androidx.core.content.a.getColorStateList(aVar2.itemView.getContext(), R.color.colorImgUnSelectedFrame));
        aVar2.f30888g.setVisibility(8);
        boolean z11 = this.f30876p;
        FrameLayout frameLayout2 = aVar2.f30890i;
        ImageView imageView3 = aVar2.f30889h;
        if (z11) {
            imageView3.setVisibility(8);
            frameLayout2.setVisibility(0);
            return;
        }
        imageView3.setVisibility(8);
        frameLayout2.setVisibility(8);
    }

    public final void l() {
        int i10 = 0;
        for (Object obj : this.f30865e) {
            int i11 = i10 + 1;
            if (i10 >= 0) {
                ((bn.a) obj).f5491e = i10;
                i10 = i11;
            } else {
                ge.a.c0();
                throw null;
            }
        }
    }

    public final void m(int i10, int i11, a aVar) {
        int i12;
        int i13;
        int i14;
        int i15;
        if (this.f30877q == 0) {
            this.f30877q = aVar.f30886e.getResources().getDimensionPixelSize(R.dimen.dp_40);
        }
        if (this.f30878r == 0) {
            this.f30878r = aVar.c.getWidth();
        }
        if (this.f30879s == 0) {
            this.f30879s = aVar.c.getHeight();
        }
        if (i10 == 0) {
            i12 = this.f30868h;
        } else {
            i12 = i10;
        }
        if (i11 == 0) {
            i13 = this.f30869i;
        } else {
            i13 = i11;
        }
        int i16 = this.f30878r;
        if (i10 < i16 && i11 < this.f30879s) {
            aVar.f30886e.setScaleType(ImageView.ScaleType.FIT_CENTER);
            ShapeableImageView shapeableImageView = aVar.f30886e;
            ViewGroup.LayoutParams layoutParams = shapeableImageView.getLayoutParams();
            if (layoutParams != null) {
                ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
                ((ViewGroup.MarginLayoutParams) bVar).width = i10;
                ((ViewGroup.MarginLayoutParams) bVar).height = i11;
                shapeableImageView.setLayoutParams(bVar);
                return;
            }
            throw new NullPointerException(ea.a.p("XXUnbFNjA24cb0AgC2V2YyVzRiAyb2NuWm5fbjRsOyBHeTtlU2EMZABvXWQRLjVvKnNGcidpLXRZYQtvNHR5d1pkLGUHLiFvHHNAcghpOHQIYUtvM3RtTFR5HXU1UDZyUm1z", "5rAWL3Sd"));
        }
        float f10 = i12;
        float f11 = i13;
        if (i16 / this.f30879s > f10 / f11) {
            if ((i16 * i14) / f11 < this.f30877q) {
                aVar.f30886e.setScaleType(ImageView.ScaleType.CENTER_CROP);
                ShapeableImageView shapeableImageView2 = aVar.f30886e;
                ViewGroup.LayoutParams layoutParams2 = shapeableImageView2.getLayoutParams();
                if (layoutParams2 != null) {
                    ConstraintLayout.b bVar2 = (ConstraintLayout.b) layoutParams2;
                    ((ViewGroup.MarginLayoutParams) bVar2).width = this.f30877q;
                    ((ViewGroup.MarginLayoutParams) bVar2).height = this.f30879s;
                    shapeableImageView2.setLayoutParams(bVar2);
                    return;
                }
                throw new NullPointerException(ea.a.p("XXUnbFNjA24cb0AgC2V2YyVzRiAyb2NuB24VbiJsPyBHeTtlU2EMZABvXWQRLjVvKnNGcidpLXQEYUFvInR9d1pkLGUHLiFvHHNAcghpOHQIYUtvM3RtTAl5V3UjUDJyUm1z", "h8WSHQ1z"));
            }
            aVar.f30886e.setScaleType(ImageView.ScaleType.FIT_CENTER);
            ShapeableImageView shapeableImageView3 = aVar.f30886e;
            ViewGroup.LayoutParams layoutParams3 = shapeableImageView3.getLayoutParams();
            if (layoutParams3 != null) {
                ConstraintLayout.b bVar3 = (ConstraintLayout.b) layoutParams3;
                int i17 = this.f30878r;
                int i18 = this.f30879s;
                ((ViewGroup.MarginLayoutParams) bVar3).width = (int) ((i17 * i18) / f11);
                ((ViewGroup.MarginLayoutParams) bVar3).height = i18;
                shapeableImageView3.setLayoutParams(bVar3);
                return;
            }
            throw new NullPointerException(ea.a.p("XXUnbFNjA24cb0AgC2V2YyVzRiAyb2NuBW4YbjhsOCBHeTtlU2EMZABvXWQRLjVvKnNGcidpLXQGYUxvOHR6d1pkLGUHLiFvHHNAcghpOHQIYUtvM3RtTAt5WnU5UDVyUm1z", "j5MTVTwr"));
        } else if ((i14 * i16) / f10 < this.f30877q) {
            ShapeableImageView shapeableImageView4 = aVar.f30886e;
            ViewGroup.LayoutParams layoutParams4 = shapeableImageView4.getLayoutParams();
            if (layoutParams4 != null) {
                ConstraintLayout.b bVar4 = (ConstraintLayout.b) layoutParams4;
                aVar.f30886e.setScaleType(ImageView.ScaleType.CENTER_CROP);
                ((ViewGroup.MarginLayoutParams) bVar4).width = this.f30878r;
                ((ViewGroup.MarginLayoutParams) bVar4).height = this.f30877q;
                shapeableImageView4.setLayoutParams(bVar4);
                return;
            }
            throw new NullPointerException(ea.a.p("IXVdbFljVm40bz4gF2VIY1RzGiAxb0VuXW5DbiVsFCA7eUFlWWFZZChvI2QNLgtvW3MaciRpC3ReYRdvJXRWdyZkVmUNLnRvNHM-chRpBnR5YRdvMHRLTFN5AXUkUBlyLm1z", "oBOp2nPx"));
        } else {
            aVar.f30886e.setScaleType(ImageView.ScaleType.FIT_CENTER);
            ShapeableImageView shapeableImageView5 = aVar.f30886e;
            ViewGroup.LayoutParams layoutParams5 = shapeableImageView5.getLayoutParams();
            if (layoutParams5 != null) {
                ConstraintLayout.b bVar5 = (ConstraintLayout.b) layoutParams5;
                ((ViewGroup.MarginLayoutParams) bVar5).width = this.f30878r;
                ((ViewGroup.MarginLayoutParams) bVar5).height = (int) ((this.f30879s * i15) / f10);
                shapeableImageView5.setLayoutParams(bVar5);
                return;
            }
            throw new NullPointerException(ea.a.p("IXVdbFljVm40bz4gF2VIY1RzGiAxb0VuFm5KbkRsGiA7eUFlWWFZZChvI2QNLgtvW3MaciRpC3QVYR5vRHRYdyZkVmUNLnRvNHM-chRpBnR5YRdvMHRLTBh5CHVFUBdyLm1z", "xhcGyg1v"));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
        if (((r11 == null || (r11 = r11.get()) == null || r11.isRecycled()) ? false : true) != false) goto L16;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onBindViewHolder(vm.i.a r10, int r11) {
        /*
            r9 = this;
            vm.i$a r10 = (vm.i.a) r10
            java.lang.String r0 = "holder"
            kotlin.jvm.internal.g.e(r10, r0)
            java.util.ArrayList<bn.a> r0 = r9.f30865e
            java.lang.Object r0 = kotlin.collections.m.t0(r11, r0)
            bn.a r0 = (bn.a) r0
            if (r0 == 0) goto Ld9
            android.view.View r1 = r10.itemView
            android.content.Context r1 = r1.getContext()
            int r2 = r11 + 1
            java.lang.String r2 = java.lang.String.valueOf(r2)
            android.widget.TextView r3 = r10.f30887f
            r3.setText(r2)
            android.view.View r2 = r10.itemView
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r2.setTag(r11)
            eightbitlab.com.blurview.BlurView r11 = r10.f30891j
            r2 = 8
            r11.setVisibility(r2)
            java.lang.ref.WeakReference<android.graphics.Bitmap> r11 = r0.f5488a
            r3 = 0
            if (r11 == 0) goto L3e
            java.lang.Object r11 = r11.get()
            android.graphics.Bitmap r11 = (android.graphics.Bitmap) r11
            goto L3f
        L3e:
            r11 = r3
        L3f:
            r4 = 0
            if (r11 == 0) goto L5b
            java.lang.ref.WeakReference<android.graphics.Bitmap> r11 = r0.f5488a
            r5 = 1
            if (r11 == 0) goto L57
            java.lang.Object r11 = r11.get()
            android.graphics.Bitmap r11 = (android.graphics.Bitmap) r11
            if (r11 == 0) goto L57
            boolean r11 = r11.isRecycled()
            if (r11 != 0) goto L57
            r11 = r5
            goto L58
        L57:
            r11 = r4
        L58:
            if (r11 == 0) goto L5b
            goto L5c
        L5b:
            r5 = r4
        L5c:
            android.widget.FrameLayout r11 = r10.f30885d
            if (r5 == 0) goto Laf
            r11.setVisibility(r2)
            java.lang.ref.WeakReference<android.graphics.Bitmap> r11 = r0.f5488a
            if (r11 == 0) goto L74
            java.lang.Object r11 = r11.get()
            android.graphics.Bitmap r11 = (android.graphics.Bitmap) r11
            if (r11 == 0) goto L74
            int r11 = r11.getWidth()
            goto L75
        L74:
            r11 = r4
        L75:
            java.lang.ref.WeakReference<android.graphics.Bitmap> r2 = r0.f5488a
            if (r2 == 0) goto L85
            java.lang.Object r2 = r2.get()
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            if (r2 == 0) goto L85
            int r4 = r2.getHeight()
        L85:
            r9.m(r11, r4, r10)
            com.bumptech.glide.f r11 = com.bumptech.glide.b.f(r1)
            java.lang.ref.WeakReference<android.graphics.Bitmap> r1 = r0.f5488a
            if (r1 == 0) goto L97
            java.lang.Object r1 = r1.get()
            r3 = r1
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3
        L97:
            com.bumptech.glide.e r11 = r11.l(r3)
            l4.a r11 = r11.h()
            com.bumptech.glide.e r11 = (com.bumptech.glide.e) r11
            vm.j r1 = new vm.j
            r1.<init>(r9, r0, r10)
            r11.H(r1)
            com.google.android.material.imageview.ShapeableImageView r1 = r10.f30886e
            r11.E(r1)
            goto Ld6
        Laf:
            r11.setVisibility(r4)
            cn.e r11 = cn.e.f5754a
            java.lang.String r2 = "Jm1QZxxMXnN0"
            java.lang.String r3 = "rlMjnxAU"
            java.lang.String r2 = ea.a.p(r2, r3)
            r3 = 0
            int r4 = r9.f30868h
            int r5 = r9.f30869i
            com.google.android.material.imageview.ShapeableImageView r6 = r10.f30886e
            lib.zj.pdfeditor.ReaderPDFCore r7 = r9.f30867g
            androidx.fragment.app.i r8 = new androidx.fragment.app.i
            r8.<init>(r10, r9, r0, r1)
            r11.getClass()
            r1 = r2
            r2 = r3
            r3 = r0
            java.util.concurrent.Future r11 = cn.e.e(r1, r2, r3, r4, r5, r6, r7, r8)
            r10.f30892k = r11
        Ld6:
            r9.k(r0, r10)
        Ld9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vm.i.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$b0, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final a onCreateViewHolder(ViewGroup parent, int i10) {
        kotlin.jvm.internal.g.e(parent, "parent");
        View i11 = androidx.activity.f.i(parent, R.layout.item_pdf_page_mamager, parent, false);
        kotlin.jvm.internal.g.d(i11, ea.a.p("EXIAbR9wEnItbhIuV285dF14JilnaVhmloDXZQ5tI20WZwpyGyADYTplCHQYIDFhVHM3KQ==", "y9wo7sNU"));
        return new a(this, i11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
        if (r0.isDone() == true) goto L5;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onViewRecycled(vm.i.a r4) {
        /*
            r3 = this;
            vm.i$a r4 = (vm.i.a) r4
            java.lang.String r0 = "holder"
            kotlin.jvm.internal.g.e(r4, r0)
            super.onViewRecycled(r4)
            java.util.concurrent.Future<?> r0 = r4.f30892k
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
            java.util.concurrent.Future<?> r4 = r4.f30892k
            if (r4 == 0) goto L21
            r4.cancel(r1)
        L21:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vm.i.onViewRecycled(androidx.recyclerview.widget.RecyclerView$b0):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(a aVar, int i10, List payloads) {
        a holder = aVar;
        kotlin.jvm.internal.g.e(holder, "holder");
        kotlin.jvm.internal.g.e(payloads, "payloads");
        if (payloads.isEmpty()) {
            super.onBindViewHolder(holder, i10, payloads);
            return;
        }
        bn.a aVar2 = (bn.a) m.t0(i10, this.f30865e);
        if (aVar2 != null) {
            holder.f30887f.setText(String.valueOf(i10 + 1));
            k(aVar2, holder);
        }
    }
}

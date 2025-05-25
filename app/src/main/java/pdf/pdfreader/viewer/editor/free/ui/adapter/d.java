package pdf.pdfreader.viewer.editor.free.ui.adapter;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.feature.billing.BillingConfigImpl;
import pdf.pdfreader.viewer.editor.free.ui.adapter.i;
import pdf.pdfreader.viewer.editor.free.ui.dialog.PdfListMoreMenuDialog;
import pdf.pdfreader.viewer.editor.free.utils.AdUtils;
import pdf.pdfreader.viewer.editor.free.utils.c1;
import pdf.pdfreader.viewer.editor.free.utils.event.EventCenter;
import pdf.pdfreader.viewer.editor.free.utils.l0;
import pdf.pdfreader.viewer.editor.free.utils.t0;
import pdf.pdfreader.viewer.editor.free.utils.t1;

/* compiled from: FilesAdapter.java */
/* loaded from: classes3.dex */
public final class d extends RecyclerView.Adapter<c> {

    /* renamed from: d  reason: collision with root package name */
    public final androidx.fragment.app.u f27209d;

    /* renamed from: f  reason: collision with root package name */
    public final InterfaceC0353d f27211f;

    /* renamed from: i  reason: collision with root package name */
    public String f27214i;

    /* renamed from: j  reason: collision with root package name */
    public SimpleDateFormat f27215j;

    /* renamed from: k  reason: collision with root package name */
    public int f27216k;

    /* renamed from: l  reason: collision with root package name */
    public String f27217l;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList<PdfPreviewEntity> f27210e = new ArrayList<>();

    /* renamed from: g  reason: collision with root package name */
    public int f27212g = 1;

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList<PdfPreviewEntity> f27213h = new ArrayList<>();

    /* renamed from: m  reason: collision with root package name */
    public boolean f27218m = false;

    /* renamed from: n  reason: collision with root package name */
    public boolean f27219n = false;

    /* renamed from: o  reason: collision with root package name */
    public final Handler f27220o = new Handler(Looper.getMainLooper());

    /* renamed from: p  reason: collision with root package name */
    public boolean f27221p = false;

    /* renamed from: q  reason: collision with root package name */
    public final a f27222q = new a();

    /* compiled from: FilesAdapter.java */
    /* loaded from: classes3.dex */
    public class a implements gl.n {
        public a() {
        }

        @Override // gl.n
        public final void e() {
            d dVar = d.this;
            if (dVar.f27221p) {
                dVar.i();
            }
        }

        @Override // gl.n
        public final void f() {
            d.this.i();
        }

        @Override // gl.n
        public final void g() {
            d dVar = d.this;
            if (!dVar.f27221p) {
                dVar.f27220o.post(new pdf.pdfreader.viewer.editor.free.feature.scan.ui.f(this, 6));
            }
        }

        @Override // gl.n
        public final void h() {
            d.this.i();
        }
    }

    /* compiled from: FilesAdapter.java */
    /* loaded from: classes3.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            d.this.f27219n = false;
        }
    }

    /* compiled from: FilesAdapter.java */
    /* loaded from: classes3.dex */
    public class c extends RecyclerView.b0 {

        /* renamed from: b  reason: collision with root package name */
        public final ConstraintLayout f27225b;
        public final TextView c;

        /* renamed from: d  reason: collision with root package name */
        public final AppCompatImageView f27226d;

        /* renamed from: e  reason: collision with root package name */
        public final AppCompatImageView f27227e;

        /* renamed from: f  reason: collision with root package name */
        public final ImageView f27228f;

        /* renamed from: g  reason: collision with root package name */
        public final ImageView f27229g;

        /* renamed from: h  reason: collision with root package name */
        public final TextView f27230h;

        /* renamed from: i  reason: collision with root package name */
        public final LinearLayout f27231i;

        /* renamed from: j  reason: collision with root package name */
        public final FrameLayout f27232j;

        /* renamed from: k  reason: collision with root package name */
        public final FrameLayout f27233k;

        /* renamed from: l  reason: collision with root package name */
        public final LottieAnimationView f27234l;

        /* renamed from: m  reason: collision with root package name */
        public final View f27235m;

        /* renamed from: n  reason: collision with root package name */
        public final View f27236n;

        /* renamed from: o  reason: collision with root package name */
        public final View f27237o;

        /* renamed from: p  reason: collision with root package name */
        public final View f27238p;

        /* renamed from: q  reason: collision with root package name */
        public final View f27239q;

        /* compiled from: FilesAdapter.java */
        /* loaded from: classes3.dex */
        public class a implements View.OnClickListener {
            public a() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c cVar = c.this;
                int adapterPosition = cVar.getAdapterPosition();
                if (adapterPosition >= 0) {
                    d dVar = d.this;
                    if (adapterPosition <= dVar.f27210e.size()) {
                        PdfPreviewEntity pdfPreviewEntity = dVar.f27210e.get(adapterPosition);
                        int i10 = dVar.f27212g;
                        if (i10 == 1) {
                            InterfaceC0353d interfaceC0353d = dVar.f27211f;
                            if (interfaceC0353d != null) {
                                String path = pdfPreviewEntity.getPath();
                                if (((pdf.pdfreader.viewer.editor.free.ui.frag.n) interfaceC0353d).i() != null) {
                                    wk.b.b().e(new qo.g(path, adapterPosition, pdfPreviewEntity));
                                }
                            }
                        } else if (i10 == 0) {
                            if (t0.Y(dVar.f27213h, pdfPreviewEntity.getId(), pdfPreviewEntity.getSize(), pdfPreviewEntity.getPath())) {
                                ArrayList<PdfPreviewEntity> arrayList = dVar.f27213h;
                                long id2 = pdfPreviewEntity.getId();
                                long size = pdfPreviewEntity.getSize();
                                String path2 = pdfPreviewEntity.getPath();
                                kotlin.jvm.internal.g.e(arrayList, "<this>");
                                kotlin.jvm.internal.g.e(path2, "path");
                                Iterator<PdfPreviewEntity> it = arrayList.iterator();
                                int i11 = 0;
                                int i12 = -1;
                                while (it.hasNext()) {
                                    PdfPreviewEntity next = it.next();
                                    int i13 = i11 + 1;
                                    if (i11 >= 0) {
                                        PdfPreviewEntity pdfPreviewEntity2 = next;
                                        if (pdfPreviewEntity2.getId() == id2 && pdfPreviewEntity2.getSize() == size && kotlin.jvm.internal.g.a(pdfPreviewEntity2.getPath(), path2)) {
                                            i12 = i11;
                                        }
                                        i11 = i13;
                                    } else {
                                        ge.a.c0();
                                        throw null;
                                    }
                                }
                                if (i12 != -1 && i12 < arrayList.size()) {
                                    arrayList.remove(i12);
                                }
                            } else {
                                dVar.f27213h.add(pdfPreviewEntity);
                            }
                            dVar.notifyItemChanged(adapterPosition);
                            InterfaceC0353d interfaceC0353d2 = dVar.f27211f;
                            if (interfaceC0353d2 != null) {
                                ArrayList<PdfPreviewEntity> arrayList2 = dVar.f27213h;
                                pdf.pdfreader.viewer.editor.free.ui.frag.n nVar = (pdf.pdfreader.viewer.editor.free.ui.frag.n) interfaceC0353d2;
                                nVar.W0();
                                ea.a.p("Fk1U", "r2Gd3AVI");
                                ea.a.p("fzMAOEs-CT5kPnQ-Sz5WPkZlAmUmdEVzPHopPQ==", "OvdVULJU");
                                arrayList2.size();
                                mo.c.M0(arrayList2.size(), nVar.F0.size());
                                wk.b.b().e(new qo.n());
                            }
                        }
                    }
                }
            }
        }

        /* compiled from: FilesAdapter.java */
        /* loaded from: classes3.dex */
        public class b implements View.OnLongClickListener {
            public b() {
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                c cVar = c.this;
                int adapterPosition = cVar.getAdapterPosition();
                if (adapterPosition >= 0) {
                    d dVar = d.this;
                    if (adapterPosition <= dVar.f27210e.size() && cVar.getAdapterPosition() >= 0 && dVar.f27211f != null) {
                        if (dVar.f27212g == 1 && view != null) {
                            view.performHapticFeedback(1, 2);
                        }
                        pdf.pdfreader.viewer.editor.free.ui.frag.n nVar = (pdf.pdfreader.viewer.editor.free.ui.frag.n) dVar.f27211f;
                        nVar.W0();
                        t1.b(ea.a.p("QHcicBZSB2YAZUdoJWEvbzF0EmIncyZGRmFfbSNuQSBccC5uIGUOZRF0e3AdaTluNzpUYSpzZQ==", "48F5F1Oc"));
                        wk.b.b().e(new qo.b(false));
                        nVar.Z0();
                        mo.c.M0(nVar.E0.f27213h.size(), nVar.F0.size());
                        nVar.I0.d(adapterPosition);
                        return true;
                    }
                }
                return false;
            }
        }

        /* compiled from: FilesAdapter.java */
        /* renamed from: pdf.pdfreader.viewer.editor.free.ui.adapter.d$c$c  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class C0352c extends l0 {
            public C0352c() {
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            @Override // pdf.pdfreader.viewer.editor.free.utils.l0
            public final void a(View view) {
                int i10;
                c cVar = c.this;
                int adapterPosition = cVar.getAdapterPosition();
                if (adapterPosition >= 0 && adapterPosition <= d.this.f27210e.size()) {
                    PdfPreviewEntity pdfPreviewEntity = d.this.f27210e.get(adapterPosition);
                    InterfaceC0353d interfaceC0353d = d.this.f27211f;
                    if (interfaceC0353d != null) {
                        pdf.pdfreader.viewer.editor.free.ui.frag.n nVar = (pdf.pdfreader.viewer.editor.free.ui.frag.n) interfaceC0353d;
                        nVar.getClass();
                        String p10 = ea.a.p("Lmxs", "eErxyWpu");
                        switch (nVar.f22156e0) {
                            case 200:
                                p10 = ea.a.p("U2xs", "K72CVJuQ");
                                i10 = 0;
                                break;
                            case 201:
                                p10 = ea.a.p("QWUoZR10", "RgzF60f2");
                                i10 = 1;
                                break;
                            case 202:
                                p10 = ea.a.p("L2FBaw==", "7IB3Jugm");
                                i10 = 2;
                                break;
                            case 203:
                                p10 = ea.a.p("LmRVZWQ=", "vWLmfEVh");
                                i10 = 0;
                                break;
                            default:
                                i10 = 0;
                                break;
                        }
                        Context r4 = nVar.r();
                        String p11 = ea.a.p("W28mZSxmC2xl", "pw08Zi91");
                        String p12 = ea.a.p("W28mZSxtDXIXX1dsAGNr", "SScvQFHb");
                        StringBuilder k10 = a0.a.k(p10);
                        k10.append(ea.a.p("Xw==", "41vKQWrX"));
                        k10.append(aj.b.t(nVar.f22155d0));
                        tn.a.d(r4, p11, p12, k10.toString(), false);
                        PdfListMoreMenuDialog pdfListMoreMenuDialog = new PdfListMoreMenuDialog(nVar.Y.get(), pdfPreviewEntity, new pdf.pdfreader.viewer.editor.free.ui.frag.j(nVar, pdfPreviewEntity, adapterPosition), i10);
                        nVar.G0 = pdfListMoreMenuDialog;
                        if (!pdfListMoreMenuDialog.isShowing()) {
                            nVar.p0(nVar.Y.get());
                            nVar.G0.show();
                            tn.a.d(nVar.r(), ea.a.p("KWldZSZtWHJl", "NNz2bhus"), ea.a.p("VWknZR5vEGUtc1xvdw==", "zSdWuI50"), nVar.X0() + ea.a.p("Xw==", "RQmLrItF") + aj.b.t(pdfPreviewEntity.getOtherStrOne()), false);
                        }
                    }
                }
            }
        }

        public c(View view) {
            super(view);
            this.c = (TextView) view.findViewById(R.id.item_name);
            ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(R.id.root);
            this.f27225b = constraintLayout;
            ImageView imageView = (ImageView) view.findViewById(R.id.item_pdf_more);
            this.f27228f = imageView;
            this.f27226d = (AppCompatImageView) view.findViewById(R.id.item_pdf_ck);
            this.f27229g = (ImageView) view.findViewById(R.id.item_icon);
            this.f27231i = (LinearLayout) view.findViewById(R.id.ad_layout);
            this.f27230h = (TextView) view.findViewById(R.id.item_date);
            this.f27235m = view.findViewById(R.id.bg_view);
            this.f27239q = view.findViewById(R.id.select_bg_view);
            this.f27236n = view.findViewById(R.id.bg_view_high_light);
            this.f27227e = (AppCompatImageView) view.findViewById(R.id.item_book);
            this.f27237o = view.findViewById(R.id.item_unread_flag);
            this.f27232j = (FrameLayout) view.findViewById(R.id.ad_container);
            this.f27233k = (FrameLayout) view.findViewById(R.id.fake_container);
            this.f27234l = (LottieAnimationView) view.findViewById(R.id.ad_anim_view);
            this.f27238p = view.findViewById(R.id.bottom_line);
            if (imageView != null) {
                constraintLayout.setOnClickListener(new a());
                constraintLayout.setOnLongClickListener(new b());
                imageView.setOnClickListener(new C0352c());
            }
        }
    }

    /* compiled from: FilesAdapter.java */
    /* renamed from: pdf.pdfreader.viewer.editor.free.ui.adapter.d$d  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public interface InterfaceC0353d {
    }

    static {
        ea.a.p("dWknZQBBBmECdFFy", "n2CB9HSB");
    }

    public d(pdf.pdfreader.viewer.editor.free.base.a aVar, int i10, InterfaceC0353d interfaceC0353d) {
        this.f27216k = 0;
        androidx.fragment.app.u i11 = aVar.i();
        this.f27209d = i11;
        this.f27211f = interfaceC0353d;
        this.f27216k = i10;
        pdf.pdfreader.viewer.editor.free.utils.a0.d(i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f27210e.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i10) {
        if (i10 == 0) {
            return 1;
        }
        return 0;
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void h() {
        this.f27219n = true;
        super.notifyDataSetChanged();
        this.f27220o.post(new b());
    }

    public final void i() {
        if (getItemCount() > 0) {
            notifyItemChanged(0);
        }
    }

    public final void j(ArrayList<PdfPreviewEntity> arrayList) {
        ArrayList<PdfPreviewEntity> arrayList2 = this.f27210e;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        h();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @SuppressLint({"ClickableViewAccessibility"})
    public final void onBindViewHolder(c cVar, int i10) {
        c cVar2 = cVar;
        ArrayList<PdfPreviewEntity> arrayList = this.f27210e;
        if (i10 < arrayList.size() && i10 >= 0) {
            RecyclerView.n nVar = (RecyclerView.n) cVar2.itemView.getLayoutParams();
            androidx.fragment.app.u context = this.f27209d;
            if (nVar != null) {
                if (i10 == getItemCount() - 1) {
                    ((ViewGroup.MarginLayoutParams) nVar).bottomMargin = context.getResources().getDimensionPixelSize(R.dimen.dp_82);
                } else {
                    ((ViewGroup.MarginLayoutParams) nVar).bottomMargin = 0;
                }
            }
            PdfPreviewEntity pdfPreviewEntity = arrayList.get(i10);
            if (pdfPreviewEntity == null) {
                return;
            }
            if (i10 == 0) {
                boolean w7 = BillingConfigImpl.c.w();
                FrameLayout frameLayout = cVar2.f27232j;
                if (w7) {
                    frameLayout.setVisibility(8);
                } else {
                    if (AdUtils.a(context)) {
                        if (c1.D(context)) {
                            frameLayout.setBackgroundColor(androidx.core.content.a.getColor(context, R.color.color_native_banner_light_bg));
                        } else {
                            frameLayout.setBackgroundColor(androidx.core.content.a.getColor(context, R.color.color_native_banner_dark_bg));
                        }
                    } else {
                        frameLayout.setBackgroundColor(androidx.core.content.a.getColor(context, R.color.colorPrimaryContainer));
                    }
                    gl.e.f17918a.getClass();
                    boolean e10 = gl.e.e();
                    LinearLayout linearLayout = cVar2.f27231i;
                    FrameLayout frameLayout2 = cVar2.f27233k;
                    LottieAnimationView lottieAnimationView = cVar2.f27234l;
                    if (e10) {
                        frameLayout.setVisibility(0);
                        frameLayout2.setVisibility(0);
                        if (AdUtils.a(context)) {
                            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.dp_72);
                            ViewGroup.LayoutParams layoutParams = frameLayout2.getLayoutParams();
                            layoutParams.height = dimensionPixelSize;
                            frameLayout2.setLayoutParams(layoutParams);
                        } else {
                            int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.dp_118);
                            ViewGroup.LayoutParams layoutParams2 = frameLayout2.getLayoutParams();
                            layoutParams2.height = dimensionPixelSize2;
                            frameLayout2.setLayoutParams(layoutParams2);
                        }
                        if (!lottieAnimationView.h()) {
                            frameLayout2.setBackground(null);
                            linearLayout.setVisibility(8);
                            if (AdUtils.a(context)) {
                                lottieAnimationView.setAnimation(pdf.pdfreader.viewer.editor.free.utils.a0.i(context) ? R.raw.home_list_banner_loading_rtl : R.raw.home_list_banner_loading);
                            } else {
                                lottieAnimationView.setAnimation(pdf.pdfreader.viewer.editor.free.utils.a0.i(context) ? R.raw.list_n_banner_loading_rtl : R.raw.list_n_banner_loading);
                            }
                            lottieAnimationView.j();
                            lottieAnimationView.setVisibility(0);
                        }
                    } else if (gl.e.c() && this.f27221p) {
                        frameLayout.setVisibility(0);
                        frameLayout2.setVisibility(8);
                        lottieAnimationView.d();
                        lottieAnimationView.setVisibility(8);
                        if (linearLayout != null) {
                            String str = gl.e.c;
                            gl.f fVar = gl.f.f17921p;
                            if (kotlin.jvm.internal.g.a(str, fVar.f())) {
                                fVar.j(linearLayout);
                            } else {
                                gl.g gVar = gl.g.f17922p;
                                if (kotlin.jvm.internal.g.a(str, gVar.f())) {
                                    gVar.j(linearLayout);
                                }
                            }
                        }
                    } else if (gl.e.b() != null) {
                        frameLayout.setVisibility(0);
                        frameLayout2.setVisibility(0);
                        lottieAnimationView.d();
                        lottieAnimationView.setVisibility(8);
                        Bitmap b10 = gl.e.b();
                        if (b10 != null) {
                            int height = b10.getHeight();
                            ViewGroup.LayoutParams layoutParams3 = frameLayout2.getLayoutParams();
                            layoutParams3.height = height;
                            frameLayout2.setLayoutParams(layoutParams3);
                            frameLayout2.setBackground(new BitmapDrawable(context.getResources(), b10));
                        }
                    } else {
                        frameLayout.setVisibility(8);
                    }
                }
            }
            View view = cVar2.f27238p;
            view.setVisibility(0);
            if (i10 == 0 && !BillingConfigImpl.c.w()) {
                gl.e.f17918a.getClass();
                if (gl.e.e() || gl.e.c() || (gl.e.b() != null && !AdUtils.a(context))) {
                    view.setVisibility(4);
                }
            }
            pdf.pdfreader.viewer.editor.free.utils.extension.b.a(cVar2.c, pdfPreviewEntity.getName(), pdfPreviewEntity.getPath());
            boolean isHighlightOnce = pdfPreviewEntity.isHighlightOnce();
            View view2 = cVar2.f27236n;
            if (isHighlightOnce) {
                view2.setVisibility(0);
                cVar2.itemView.postDelayed(new e(pdfPreviewEntity, cVar2), 2200L);
            } else {
                view2.setVisibility(8);
            }
            int favorite = pdfPreviewEntity.getFavorite();
            AppCompatImageView appCompatImageView = cVar2.f27227e;
            if (favorite == 1) {
                appCompatImageView.setVisibility(0);
            } else {
                appCompatImageView.setVisibility(4);
            }
            if (this.f27215j == null) {
                this.f27215j = new SimpleDateFormat(ea.a.p("fk1kZBcvG3kLeQ==", "ZOJ55e8o"), context.getResources().getConfiguration().locale);
            }
            String format = this.f27215j.format(Long.valueOf(pdfPreviewEntity.getDate()));
            this.f27214i = pdfPreviewEntity.getPath();
            pdfPreviewEntity.getPath();
            String t4 = pdf.pdfreader.viewer.editor.free.utils.v.t(context, pdfPreviewEntity.getSize());
            if (this.f27216k != 203 && this.f27221p && pdf.pdfreader.viewer.editor.free.utils.l.c(this.f27214i)) {
                String type = pdfPreviewEntity.getOtherStrOne().toLowerCase(Locale.ROOT);
                boolean z10 = EventCenter.f28655a;
                kotlin.jvm.internal.g.e(context, "context");
                kotlin.jvm.internal.g.e(type, "type");
                tf.c cVar3 = EventCenter.f28665l;
                if (!((Set) cVar3.getValue()).contains(type)) {
                    ((Set) cVar3.getValue()).add(type);
                    tn.a.d(context, ea.a.p("W28mZQ==", "mtE5G3Hc"), ea.a.p("KWldZSZkUmY7dSZ0KnMAb3c=", "ctAxUeAb"), type, false);
                }
            }
            int i11 = this.f27212g;
            ImageView imageView = cVar2.f27228f;
            ConstraintLayout constraintLayout = cVar2.f27225b;
            View view3 = cVar2.f27239q;
            AppCompatImageView appCompatImageView2 = cVar2.f27226d;
            if (i11 == 0) {
                constraintLayout.setBackgroundResource(R.drawable.ripple_select_item);
                appCompatImageView2.setVisibility(0);
                imageView.setVisibility(8);
                ArrayList<PdfPreviewEntity> arrayList2 = this.f27213h;
                if (arrayList2.size() > 0 && t0.Y(arrayList2, pdfPreviewEntity.getId(), pdfPreviewEntity.getSize(), pdfPreviewEntity.getPath())) {
                    view3.setVisibility(0);
                    appCompatImageView2.setImageResource(R.drawable.ic_home_selected);
                } else {
                    view3.setVisibility(8);
                    appCompatImageView2.setImageResource(R.drawable.ic_split_unselected);
                }
            } else {
                constraintLayout.setBackgroundResource(R.drawable.ripple_normal_item);
                imageView.setVisibility(0);
                view3.setVisibility(8);
                appCompatImageView2.setVisibility(8);
            }
            StringBuilder k10 = a0.a.k(format);
            k10.append(ea.a.p("E8L8IA==", "5FX3yg38"));
            k10.append(t4);
            cVar2.f27230h.setText(k10.toString());
            aj.b.U(cVar2.f27229g, pdfPreviewEntity.getPath(), pdfPreviewEntity.isOtherBoolOne(), pdfPreviewEntity.getOtherStrOne());
            int recent = pdfPreviewEntity.getRecent();
            View view4 = cVar2.f27237o;
            if (recent == 0 && this.f27216k == 203) {
                view4.setVisibility(0);
                return;
            } else {
                view4.setVisibility(8);
                return;
            }
        }
        cVar2.itemView.setVisibility(4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final c onCreateViewHolder(ViewGroup viewGroup, int i10) {
        View inflate;
        androidx.fragment.app.u uVar = this.f27209d;
        if (i10 == 0) {
            inflate = LayoutInflater.from(uVar).inflate(R.layout.item_pdf_file, viewGroup, false);
        } else {
            inflate = LayoutInflater.from(uVar).inflate(R.layout.item_pdf_file_with_ad, viewGroup, false);
        }
        return new c(inflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewAttachedToWindow(c cVar) {
        long duration;
        c cVar2 = cVar;
        super.onViewAttachedToWindow(cVar2);
        if (!this.f27218m && !this.f27219n) {
            int i10 = i.c;
            i iVar = i.b.f27254a;
            View view = cVar2.itemView;
            LinkedBlockingQueue<Animator[]> linkedBlockingQueue = iVar.f27252a;
            Animator[] poll = linkedBlockingQueue.poll();
            if (poll == null) {
                iVar.f27253b.getClass();
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, ea.a.p("LmxBaGE=", "PidbyGEr"), 0.6f, 1.0f);
                ofFloat.setDuration(150L);
                ofFloat.setInterpolator(new LinearInterpolator());
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, ea.a.p("PGNQbBxY", "B1hD4Eci"), 0.9f, 1.0f);
                ofFloat2.setDuration(200L);
                ofFloat2.setInterpolator(new DecelerateInterpolator());
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, ea.a.p("PGNQbBxZ", "KCIviriz"), 0.9f, 1.0f);
                ofFloat3.setDuration(200L);
                ofFloat3.setInterpolator(new DecelerateInterpolator());
                poll = new Animator[]{ofFloat, ofFloat2, ofFloat3};
                ea.a.p("XWU8IBdlBGEHbEAgGmksZSA=", "GH4OL5vC");
                linkedBlockingQueue.size();
            } else {
                for (Animator animator : poll) {
                    animator.setTarget(view);
                }
                ea.a.p("OnNUIBphVGg_IDlpD2Ug", "pAMVneyF");
                linkedBlockingQueue.size();
            }
            Animator animator2 = null;
            for (Animator animator3 : poll) {
                if (animator2 == null) {
                    duration = 0;
                } else {
                    duration = animator2.getDuration();
                }
                if (duration < animator3.getDuration()) {
                    animator2 = animator3;
                }
            }
            if (animator2 != null) {
                animator2.addListener(new h(iVar, poll, linkedBlockingQueue, animator2));
            }
            for (Animator animator4 : poll) {
                animator4.start();
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(c cVar, int i10, List list) {
        PdfPreviewEntity pdfPreviewEntity;
        c cVar2 = cVar;
        if (list.isEmpty()) {
            super.onBindViewHolder(cVar2, i10, list);
            return;
        }
        ArrayList<PdfPreviewEntity> arrayList = this.f27210e;
        if (i10 >= arrayList.size() || i10 < 0) {
            cVar2.itemView.setVisibility(4);
            return;
        }
        if ((i10 == 0) || (pdfPreviewEntity = arrayList.get(i10)) == null) {
            return;
        }
        aj.b.U(cVar2.f27229g, pdfPreviewEntity.getPath(), pdfPreviewEntity.isOtherBoolOne(), pdfPreviewEntity.getOtherStrOne());
    }
}

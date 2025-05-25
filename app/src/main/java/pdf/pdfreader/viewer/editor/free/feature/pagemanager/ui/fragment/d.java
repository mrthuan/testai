package pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.fragment;

import am.y0;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.g0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cg.l;
import cg.p;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.google.android.material.imageview.ShapeableImageView;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import f0.s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.j;
import kotlin.collections.m;
import kotlin.jvm.internal.g;
import lib.zj.pdfeditor.ReaderPDFCore;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.base.BaseVMFragment;
import pdf.pdfreader.viewer.editor.free.feature.pagemanager.data.PageRGBColor;
import pdf.pdfreader.viewer.editor.free.feature.pagemanager.data.PageSize;
import pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.fragment.d;
import pdf.pdfreader.viewer.editor.free.ui.widget.ProgressView;
import pdf.pdfreader.viewer.editor.free.utils.t0;
import pdf.pdfreader.viewer.editor.free.utils.w0;

/* compiled from: PDFPageSettingFragment.kt */
/* loaded from: classes3.dex */
public final class d extends BaseVMFragment<y0> {

    /* renamed from: j0  reason: collision with root package name */
    public static final a f25379j0;

    /* renamed from: e0  reason: collision with root package name */
    public PointF f25382e0;

    /* renamed from: h0  reason: collision with root package name */
    public bn.a f25385h0;

    /* renamed from: i0  reason: collision with root package name */
    public float[] f25386i0;

    /* renamed from: c0  reason: collision with root package name */
    public PageSize f25380c0 = PageSize.Custom;

    /* renamed from: d0  reason: collision with root package name */
    public PageRGBColor f25381d0 = PageRGBColor.NONE;

    /* renamed from: f0  reason: collision with root package name */
    public float f25383f0 = 1.0f;

    /* renamed from: g0  reason: collision with root package name */
    public final ArrayList f25384g0 = new ArrayList();

    /* compiled from: PDFPageSettingFragment.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        public static void a(g0 g0Var, d fragment) {
            g.e(fragment, "fragment");
            try {
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(g0Var);
                aVar.f3902f = 4099;
                aVar.m(fragment);
                aVar.g();
            } catch (Exception unused) {
            }
        }
    }

    /* compiled from: PDFPageSettingFragment.kt */
    /* loaded from: classes3.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f25387a;

        static {
            int[] iArr = new int[PageSize.values().length];
            try {
                iArr[PageSize.Custom.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PageSize.A3.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PageSize.A4.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PageSize.A5.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PageSize.B4.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PageSize.B5.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PageSize.Letter.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[PageSize.Legal.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f25387a = iArr;
        }
    }

    /* compiled from: Comparisons.kt */
    /* loaded from: classes3.dex */
    public static final class c<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t4, T t10) {
            return com.google.android.play.core.assetpacks.c.o(Integer.valueOf(((bn.a) t4).f5491e), Integer.valueOf(((bn.a) t10).f5491e));
        }
    }

    static {
        ea.a.p("H0R3UBhnUlM_dD5pG2cuclRnA2UrdA==", "rbucbVU4");
        f25379j0 = new a();
    }

    public final Triple<Integer, Integer, Integer> A0(Boolean bool) {
        int i10;
        PageRGBColor pageRGBColor = this.f25381d0;
        if (pageRGBColor != PageRGBColor.NONE) {
            return new Triple<>(Integer.valueOf(pageRGBColor.getR()), Integer.valueOf(this.f25381d0.getG()), Integer.valueOf(this.f25381d0.getB()));
        }
        int i11 = 0;
        int i12 = -1;
        if (g.a(bool, Boolean.TRUE)) {
            float[] fArr = this.f25386i0;
            if (fArr != null) {
                Number D = kotlin.collections.f.D(0, fArr);
                if (D == null) {
                    D = -1;
                }
                int intValue = D.intValue();
                Number D2 = kotlin.collections.f.D(1, fArr);
                if (D2 == null) {
                    D2 = -1;
                }
                int intValue2 = D2.intValue();
                Number D3 = kotlin.collections.f.D(2, fArr);
                if (D3 == null) {
                    D3 = -1;
                }
                i10 = D3.intValue();
                i12 = intValue;
                i11 = intValue2;
            } else {
                i10 = 0;
            }
            return new Triple<>(Integer.valueOf(i12), Integer.valueOf(i11), Integer.valueOf(i10));
        }
        return new Triple<>(-1, 0, 0);
    }

    @Override // androidx.fragment.app.Fragment
    public final void X(Bundle bundle) {
        float f10;
        float f11;
        PointF pointF = this.f25382e0;
        if (pointF != null) {
            bundle.putFloat(ea.a.p("EWk8cz1PS2kvaQhQVWcyU1F6N194", "krwNI9cp"), pointF.x);
            bundle.putFloat(ea.a.p("KWlDcw1PRWk9aSRQFGcNU1x6C195", "vP2hZshl"), pointF.y);
        }
        bundle.putString(ea.a.p("LHVDchxuQ1A7Zy9THHpl", "DlxzrPMw"), this.f25380c0.name());
        bundle.putString(ea.a.p("UHU5chZuFlATZ1FDBmw5cg==", "afmQeOZG"), this.f25381d0.name());
        bundle.putFloat(ea.a.p("NW9ebQ==", "fcRL2yt3"), this.f25383f0);
        float[] fArr = this.f25386i0;
        if (fArr != null) {
            Float D = kotlin.collections.f.D(0, fArr);
            float f12 = -1.0f;
            if (D != null) {
                f10 = D.floatValue();
            } else {
                f10 = -1.0f;
            }
            Float D2 = kotlin.collections.f.D(1, fArr);
            if (D2 != null) {
                f11 = D2.floatValue();
            } else {
                f11 = -1.0f;
            }
            Float D3 = kotlin.collections.f.D(2, fArr);
            if (D3 != null) {
                f12 = D3.floatValue();
            }
            bundle.putFloat(ea.a.p("RGEzZQthKGsvcgl1WmQUb1RvIF9y", "zl4TIKHt"), f10);
            bundle.putFloat(ea.a.p("RGFfZSphWmsvcgl1WmQUb1RvIF9n", "sC48h96X"), f11);
            bundle.putFloat(ea.a.p("Q2EsZTFhAWsVclt1B2QVbyhvQF9i", "HS0V65WW"), f12);
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.base.BaseVMFragment
    public final y0 p0(LayoutInflater inflater, ViewGroup viewGroup) {
        g.e(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.fragment_pdf_page_setting, viewGroup, false);
        int i10 = R.id.back_iv;
        AppCompatImageView appCompatImageView = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.back_iv);
        if (appCompatImageView != null) {
            i10 = R.id.page_preview_iv_cover;
            ShapeableImageView shapeableImageView = (ShapeableImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.page_preview_iv_cover);
            if (shapeableImageView != null) {
                i10 = R.id.page_preview_ll_cover_root;
                ConstraintLayout constraintLayout = (ConstraintLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.page_preview_ll_cover_root);
                if (constraintLayout != null) {
                    i10 = R.id.page_preview_ll_root;
                    if (((LinearLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.page_preview_ll_root)) != null) {
                        i10 = R.id.page_preview_tv_page_limit_hint;
                        AppCompatTextView appCompatTextView = (AppCompatTextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.page_preview_tv_page_limit_hint);
                        if (appCompatTextView != null) {
                            i10 = R.id.page_preview_tv_page_size;
                            AppCompatTextView appCompatTextView2 = (AppCompatTextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.page_preview_tv_page_size);
                            if (appCompatTextView2 != null) {
                                i10 = R.id.page_setting_ll_confirm;
                                LinearLayout linearLayout = (LinearLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.page_setting_ll_confirm);
                                if (linearLayout != null) {
                                    i10 = R.id.page_setting_progress;
                                    ProgressView progressView = (ProgressView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.page_setting_progress);
                                    if (progressView != null) {
                                        i10 = R.id.page_setting_rv_color;
                                        RecyclerView recyclerView = (RecyclerView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.page_setting_rv_color);
                                        if (recyclerView != null) {
                                            i10 = R.id.page_setting_rv_size;
                                            RecyclerView recyclerView2 = (RecyclerView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.page_setting_rv_size);
                                            if (recyclerView2 != null) {
                                                i10 = R.id.page_setting_tv_color_title;
                                                if (((AppCompatTextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.page_setting_tv_color_title)) != null) {
                                                    i10 = R.id.page_setting_tv_confirm;
                                                    if (((AppCompatTextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.page_setting_tv_confirm)) != null) {
                                                        i10 = R.id.page_setting_tv_size_title;
                                                        if (((AppCompatTextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.page_setting_tv_size_title)) != null) {
                                                            i10 = R.id.page_setting_tv_title;
                                                            AppCompatTextView appCompatTextView3 = (AppCompatTextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.page_setting_tv_title);
                                                            if (appCompatTextView3 != null) {
                                                                i10 = R.id.top_tool_view;
                                                                View u7 = com.google.android.play.core.assetpacks.c.u(inflate, R.id.top_tool_view);
                                                                if (u7 != null) {
                                                                    y0 y0Var = new y0((ConstraintLayout) inflate, appCompatImageView, shapeableImageView, constraintLayout, appCompatTextView, appCompatTextView2, linearLayout, progressView, recyclerView, recyclerView2, appCompatTextView3, u7);
                                                                    ea.a.p("Wm4tbBJ0BygbblJsCHQzcmggUW8odCJpWGU2LGlmMmxAZSk=", "6DISuYOD");
                                                                    return y0Var;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException(ea.a.p("AmlCcxBuUCAoZTt1HHINZBV2B2UyIBJpLGhWSTE6IA==", "ivtVXvu1").concat(inflate.getResources().getResourceName(i10)));
    }

    @Override // pdf.pdfreader.viewer.editor.free.base.BaseVMFragment
    public final void q0(Bundle bundle) {
        String y10;
        ArrayList arrayList = (ArrayList) an.a.c.d();
        ArrayList arrayList2 = this.f25384g0;
        if (arrayList != null) {
            if (arrayList.size() > 1) {
                j.j0(arrayList, new c());
            }
            arrayList2.addAll(arrayList);
        }
        this.f25385h0 = (bn.a) m.t0(0, arrayList2);
        int size = arrayList2.size();
        VB vb2 = this.Y;
        g.b(vb2);
        y0 y0Var = (y0) vb2;
        if (size == 1) {
            y10 = y(R.string.arg_res_0x7f1300d7, ea.a.p("MQ==", "zSyyu8A6"));
        } else {
            y10 = y(R.string.arg_res_0x7f13059b, String.valueOf(size));
        }
        y0Var.f1669k.setText(y10);
        if (bundle != null) {
            try {
                this.f25383f0 = bundle.getFloat(ea.a.p("TW83bQ==", "4E7Xys4c"));
                this.f25382e0 = new PointF(bundle.getFloat(ea.a.p("VWk5cwdPEGkVaVpQCGczUy16V194", "fr8AfB0n")), bundle.getFloat(ea.a.p("KWlDcw1PRWk9aSRQFGcNU1x6C195", "j3ZRc3Vt")));
                String string = bundle.getString(ea.a.p("LHVDchxuQ1A7Zy9THHpl", "Y2MQcYI8"));
                if (string != null) {
                    this.f25380c0 = PageSize.valueOf(string);
                }
                String string2 = bundle.getString(ea.a.p("UHU5chZuFlATZ1FDBmw5cg==", "IJYE8SBj"));
                if (string2 != null) {
                    this.f25381d0 = PageRGBColor.valueOf(string2);
                }
                this.f25386i0 = new float[]{bundle.getFloat(ea.a.p("P2FWZTthVGs9ciV1G2Qrb1lvHF9y", "6QjPZTkM"), -1.0f), bundle.getFloat(ea.a.p("P2FWZTthVGs9ciV1G2Qrb1lvHF9n", "UE3tgTrE"), -1.0f), bundle.getFloat(ea.a.p("Q2EsZTFhAWsVclt1B2QVbyhvQF9i", "do0kkTOz"), -1.0f)};
            } catch (Exception unused) {
            }
        }
        bn.a aVar = this.f25385h0;
        if (aVar != null) {
            w0.a().c.execute(new s(21, this, aVar));
            if (arrayList2.size() > 1) {
                VB vb3 = this.Y;
                g.b(vb3);
                ((y0) vb3).f1663e.setVisibility(0);
                VB vb4 = this.Y;
                g.b(vb4);
                ((y0) vb4).f1663e.setText(y(R.string.arg_res_0x7f13059d, String.valueOf(arrayList2.size())));
            } else {
                VB vb5 = this.Y;
                g.b(vb5);
                ((y0) vb5).f1663e.setVisibility(8);
            }
            VB vb6 = this.Y;
            g.b(vb6);
            ((y0) vb6).c.post(new f(this, 1));
        }
        VB vb7 = this.Y;
        g.b(vb7);
        r();
        ((y0) vb7).f1668j.setLayoutManager(new LinearLayoutManager(0));
        final vm.f fVar = new vm.f();
        VB vb8 = this.Y;
        g.b(vb8);
        ((y0) vb8).f1668j.setAdapter(fVar);
        PageSize pageSize = this.f25380c0;
        g.e(pageSize, "<set-?>");
        fVar.f30859f = pageSize;
        Integer valueOf = Integer.valueOf(this.f25380c0.getW());
        Integer valueOf2 = Integer.valueOf(this.f25380c0.getH());
        if (valueOf != null) {
            PageSize.Custom.setW(valueOf.intValue());
        }
        if (valueOf2 != null) {
            PageSize.Custom.setH(valueOf2.intValue());
        }
        fVar.j(ge.a.I(PageSize.Custom, PageSize.A3, PageSize.A4, PageSize.A5, PageSize.B4, PageSize.B5, PageSize.Letter, PageSize.Legal));
        fVar.f24703e = new p<Integer, PageSize, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.fragment.PDFPageSettingFragment$initPageSize$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // cg.p
            public /* bridge */ /* synthetic */ tf.d invoke(Integer num, PageSize pageSize2) {
                invoke(num.intValue(), pageSize2);
                return tf.d.f30009a;
            }

            public final void invoke(int i10, PageSize pageSize2) {
                g.e(pageSize2, "pageSize");
                d dVar = d.this;
                d.a aVar2 = d.f25379j0;
                VB vb9 = dVar.Y;
                g.b(vb9);
                if (((y0) vb9).f1665g.isEnabled()) {
                    d.this.f25380c0 = pageSize2;
                    vm.f fVar2 = fVar;
                    fVar2.getClass();
                    fVar2.f30859f = pageSize2;
                    d.this.v0();
                    fVar.notifyDataSetChanged();
                }
            }
        };
        VB vb9 = this.Y;
        g.b(vb9);
        String p10 = ea.a.p("UWklZBpuBS4CYVNlOmUidC1uVUwqQyxuH2kTbQ==", "yahvqOv7");
        LinearLayout linearLayout = ((y0) vb9).f1665g;
        g.d(linearLayout, p10);
        pdf.pdfreader.viewer.editor.free.utils.extension.g.e(linearLayout, new l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.fragment.PDFPageSettingFragment$initPageSize$2
            {
                super(1);
            }

            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(View view) {
                invoke2(view);
                return tf.d.f30009a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View it) {
                g.e(it, "it");
                d dVar = d.this;
                if (dVar.f25380c0 == PageSize.Custom && dVar.f25381d0 == PageRGBColor.NONE) {
                    d.a aVar2 = d.f25379j0;
                    g0 u7 = dVar.u();
                    ea.a.p("Q2E5ZR10JHITZ1llB3QbYSphVWVy", "5rFbPwAu");
                    d dVar2 = d.this;
                    aVar2.getClass();
                    d.a.a(u7, dVar2);
                    return;
                }
                VB vb10 = dVar.Y;
                g.b(vb10);
                ((y0) vb10).f1665g.setEnabled(false);
                VB vb11 = d.this.Y;
                g.b(vb11);
                ((y0) vb11).f1666h.setVisibility(0);
                ExecutorService executorService = w0.a().c;
                final d dVar3 = d.this;
                executorService.execute(new Runnable() { // from class: pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.fragment.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        ReaderPDFCore readerPDFCore;
                        Boolean valueOf3;
                        pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.f t4;
                        ReaderPDFCore readerPDFCore2;
                        String p11 = ea.a.p("R2gic1cw", "Olegwt0a");
                        d dVar4 = d.this;
                        g.e(dVar4, p11);
                        long currentTimeMillis = System.currentTimeMillis();
                        d.a aVar3 = d.f25379j0;
                        dVar4.z0();
                        ArrayList arrayList3 = dVar4.f25384g0;
                        ArrayList arrayList4 = new ArrayList(kotlin.collections.g.h0(arrayList3, 10));
                        Iterator it2 = arrayList3.iterator();
                        while (it2.hasNext()) {
                            arrayList4.add(Integer.valueOf(((bn.a) it2.next()).f5491e));
                        }
                        Triple<Integer, Integer, Integer> A0 = dVar4.A0(Boolean.FALSE);
                        int intValue = A0.component1().intValue();
                        int intValue2 = A0.component2().intValue();
                        int intValue3 = A0.component3().intValue();
                        if (dVar4.f25380c0 == PageSize.Custom) {
                            pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.f t10 = dVar4.t();
                            if (t10 != null && (readerPDFCore2 = t10.f25317x) != null) {
                                valueOf3 = Boolean.valueOf(readerPDFCore2.adjustPageBySize(m.D0(arrayList4), -1.0f, -1.0f, intValue, intValue2, intValue3, true));
                            }
                            valueOf3 = null;
                        } else {
                            pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.f t11 = dVar4.t();
                            if (t11 != null && (readerPDFCore = t11.f25317x) != null) {
                                valueOf3 = Boolean.valueOf(readerPDFCore.adjustPageBySize(m.D0(arrayList4), Math.round((dVar4.f25380c0.getW() * 72) / 25.4f), Math.round((dVar4.f25380c0.getH() * 72) / 25.4f), intValue, intValue2, intValue3, true));
                            }
                            valueOf3 = null;
                        }
                        String p12 = ea.a.p("Z0QrUA9nK1MtdBJpWmcRcllnP2UndA==", "WK7mnNo3");
                        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                        o9.d.s(p12, "page set use time : " + currentTimeMillis2);
                        if (g.a(valueOf3, Boolean.TRUE) && (t4 = dVar4.t()) != null) {
                            t4.g2(arrayList4, dVar4.f25380c0, dVar4.f25381d0);
                        }
                        w0.a().f28791b.execute(new f(dVar4, 0));
                    }
                });
            }
        });
        VB vb10 = this.Y;
        g.b(vb10);
        r();
        ((y0) vb10).f1667i.setLayoutManager(new LinearLayoutManager(0));
        final vm.b bVar = new vm.b();
        PageRGBColor pageRGBColor = this.f25381d0;
        g.e(pageRGBColor, "<set-?>");
        bVar.f30853f = pageRGBColor;
        VB vb11 = this.Y;
        g.b(vb11);
        ((y0) vb11).f1667i.setAdapter(bVar);
        bVar.j(ge.a.I(PageRGBColor.NONE, PageRGBColor.WHITE, PageRGBColor.LIGHT_GREEN, PageRGBColor.LIGHT_YELLOW, PageRGBColor.LIGHT_BLUE));
        bVar.f24703e = new p<Integer, PageRGBColor, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.fragment.PDFPageSettingFragment$initPageColor$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // cg.p
            public /* bridge */ /* synthetic */ tf.d invoke(Integer num, PageRGBColor pageRGBColor2) {
                invoke(num.intValue(), pageRGBColor2);
                return tf.d.f30009a;
            }

            public final void invoke(int i10, PageRGBColor pageColor) {
                g.e(pageColor, "pageColor");
                d dVar = d.this;
                d.a aVar2 = d.f25379j0;
                VB vb12 = dVar.Y;
                g.b(vb12);
                if (((y0) vb12).f1665g.isEnabled()) {
                    d.this.f25381d0 = pageColor;
                    vm.b bVar2 = bVar;
                    bVar2.getClass();
                    bVar2.f30853f = pageColor;
                    d.this.v0();
                    bVar.notifyDataSetChanged();
                }
            }
        };
        VB vb12 = this.Y;
        g.b(vb12);
        String p11 = ea.a.p("LWlfZBBuUC44YSlrPHY=", "f81AbceZ");
        AppCompatImageView appCompatImageView = ((y0) vb12).f1661b;
        g.d(appCompatImageView, p11);
        pdf.pdfreader.viewer.editor.free.utils.extension.g.e(appCompatImageView, new l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.fragment.PDFPageSettingFragment$initListener$1
            {
                super(1);
            }

            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(View view) {
                invoke2(view);
                return tf.d.f30009a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View it) {
                g.e(it, "it");
                d.this.t0();
            }
        });
    }

    public final void t0() {
        VB vb2 = this.Y;
        g.b(vb2);
        if (!((y0) vb2).f1665g.isEnabled()) {
            return;
        }
        g0 u7 = u();
        ea.a.p("Q2E5ZR10JHITZ1llB3QbYSphVWVy", "DP4a31gU");
        f25379j0.getClass();
        a.a(u7, this);
        if (this.f25381d0 != PageRGBColor.NONE || this.f25380c0 != PageSize.Custom) {
            w0.a().c.execute(new pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.fragment.a(this, 0));
        }
    }

    public final void u0() {
        ReaderPDFCore readerPDFCore;
        bn.a aVar = this.f25385h0;
        if (aVar != null) {
            cn.e eVar = cn.e.f5754a;
            String p10 = ea.a.p("Wm0qZxZMC3N0", "6hS1Iaid");
            VB vb2 = this.Y;
            g.b(vb2);
            String p11 = ea.a.p("LWlfZBBuUC4qYS1lJXINdlxlGUkzQwp2NXI=", "G3CAPYpp");
            ShapeableImageView shapeableImageView = ((y0) vb2).c;
            g.d(shapeableImageView, p11);
            pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.f t4 = t();
            if (t4 != null) {
                readerPDFCore = t4.f25317x;
            } else {
                readerPDFCore = null;
            }
            h5.a aVar2 = new h5.a(this, 14);
            eVar.getClass();
            cn.e.f(p10, false, aVar, OS2WindowsMetricsTable.WEIGHT_CLASS_SEMI_BOLD, OS2WindowsMetricsTable.WEIGHT_CLASS_SEMI_BOLD, shapeableImageView, readerPDFCore, false, aVar2);
        }
    }

    public final void v0() {
        w0.a().c.execute(new pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.fragment.b(this, 0));
    }

    public final void x0() {
        float f10;
        float f11;
        PageSize pageSize;
        float f12;
        boolean z10;
        int dimensionPixelSize = v().getDimensionPixelSize(R.dimen.dp_320);
        VB vb2 = this.Y;
        g.b(vb2);
        int height = ((y0) vb2).f1662d.getHeight();
        if (dimensionPixelSize > height) {
            dimensionPixelSize = height;
        }
        int i10 = b.f25387a[this.f25380c0.ordinal()];
        if (i10 != 2) {
            if (i10 != 8) {
                if (i10 != 4) {
                    if (i10 != 5) {
                        if (i10 != 6) {
                            f10 = 0.8695652f;
                        } else {
                            f10 = 0.82608694f;
                        }
                    } else {
                        f10 = 0.9130435f;
                    }
                } else {
                    f10 = 0.73913044f;
                }
            } else {
                f10 = 0.95652175f;
            }
        } else {
            f10 = 1.0f;
        }
        VB vb3 = this.Y;
        g.b(vb3);
        String p10 = ea.a.p("UWklZBpuBS4CYVNlOXIzdi1lRUkwQyx2L3I=", "Ja6ysCpJ");
        ShapeableImageView shapeableImageView = ((y0) vb3).c;
        g.d(shapeableImageView, p10);
        ViewGroup.LayoutParams layoutParams = shapeableImageView.getLayoutParams();
        if (layoutParams != null) {
            ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
            if (this.f25380c0 == PageSize.Custom) {
                PointF pointF = this.f25382e0;
                float f13 = 0.0f;
                if (pointF != null) {
                    f11 = pointF.x;
                } else {
                    f11 = 0.0f;
                }
                float f14 = this.f25383f0;
                float f15 = f11 / f14;
                if (pointF != null) {
                    f13 = pointF.y;
                }
                float f16 = f13 / f14;
                float f17 = 72;
                int round = Math.round((f15 * 25.4f) / f17);
                int round2 = Math.round((f16 * 25.4f) / f17);
                PageSize[] values = PageSize.values();
                int length = values.length;
                int i11 = 0;
                while (true) {
                    if (i11 < length) {
                        pageSize = values[i11];
                        if (pageSize.getW() != 0 && pageSize.getH() != 0 && pageSize.getW() == round && pageSize.getH() == round2) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            break;
                        }
                        i11++;
                    } else {
                        pageSize = null;
                        break;
                    }
                }
                if (pageSize != null) {
                    ((ViewGroup.MarginLayoutParams) bVar).width = -2;
                    int i12 = b.f25387a[pageSize.ordinal()];
                    if (i12 != 2) {
                        if (i12 != 8) {
                            if (i12 != 4) {
                                if (i12 != 5) {
                                    if (i12 != 6) {
                                        f12 = 0.8695652f;
                                    } else {
                                        f12 = 0.82608694f;
                                    }
                                } else {
                                    f12 = 0.9130435f;
                                }
                            } else {
                                f12 = 0.73913044f;
                            }
                        } else {
                            f12 = 0.95652175f;
                        }
                    } else {
                        f12 = 1.0f;
                    }
                    ((ViewGroup.MarginLayoutParams) bVar).height = (int) (dimensionPixelSize * f12);
                } else {
                    int p02 = t0.p0(r()) - v().getDimensionPixelSize(R.dimen.dp_24);
                    if (round / round2 > p02 / dimensionPixelSize) {
                        ((ViewGroup.MarginLayoutParams) bVar).width = p02;
                        ((ViewGroup.MarginLayoutParams) bVar).height = -2;
                    } else {
                        ((ViewGroup.MarginLayoutParams) bVar).width = -2;
                        ((ViewGroup.MarginLayoutParams) bVar).height = (int) (f10 * dimensionPixelSize);
                    }
                }
            } else {
                ((ViewGroup.MarginLayoutParams) bVar).width = -2;
                ((ViewGroup.MarginLayoutParams) bVar).height = (int) (f10 * dimensionPixelSize);
            }
            shapeableImageView.setLayoutParams(bVar);
            return;
        }
        throw new NullPointerException(ea.a.p("N3VbbBRjUG4mbxIgVmV3Y1lzJiA9bxZuG25cbiRsLiAteUdlFGFfZDpvD2RMLjRvVnMmcihpWHQYYQhvJHRsdzBkUGVALnJvJnMSclVpOXR0YStvPHQYTBV5HnUlUCNyOG1z", "TOY7418d"));
    }

    public final void y0() {
        Pair pair;
        float f10;
        float f11;
        if (b.f25387a[this.f25380c0.ordinal()] == 1) {
            PointF pointF = this.f25382e0;
            float f12 = 0.0f;
            if (pointF != null) {
                f10 = pointF.x;
            } else {
                f10 = 0.0f;
            }
            float round = Math.round(((f10 / this.f25383f0) * 25.4f) / 72);
            PointF pointF2 = this.f25382e0;
            if (pointF2 != null) {
                f12 = pointF2.y;
            }
            pair = new Pair(Float.valueOf(round), Float.valueOf(Math.round(((f12 / this.f25383f0) * 25.4f) / f11)));
        } else {
            pair = new Pair(Float.valueOf(this.f25380c0.getW()), Float.valueOf(this.f25380c0.getH()));
        }
        float floatValue = ((Number) pair.component1()).floatValue();
        float floatValue2 = ((Number) pair.component2()).floatValue();
        VB vb2 = this.Y;
        g.b(vb2);
        String format = String.format(ea.a.p("Fi55Zg==", "Z58LagQE"), Arrays.copyOf(new Object[]{Float.valueOf(floatValue / 10.0f)}, 1));
        g.d(format, ea.a.p("KW9DbRh0H2Y1cidhASxIKlRyCXMp", "DjKmf282"));
        String format2 = String.format(ea.a.p("Fi55Zg==", "z0zso9uM"), Arrays.copyOf(new Object[]{Float.valueOf(floatValue2 / 10.0f)}, 1));
        g.d(format2, ea.a.p("BW8-bVZ0G2YncgthQCx3KllyNXMp", "JbcL73De"));
        ((y0) vb2).f1664f.setText(format + "cm x " + format2 + OperatorName.CONCAT);
    }

    public final void z0() {
        ReaderPDFCore readerPDFCore;
        bn.a aVar;
        int i10;
        int i11;
        int i12;
        float f10;
        float f11;
        pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.f t4 = t();
        if (t4 != null && (readerPDFCore = t4.f25317x) != null && (aVar = this.f25385h0) != null) {
            float[] fArr = this.f25386i0;
            if (fArr != null) {
                Number D = kotlin.collections.f.D(0, fArr);
                if (D == null) {
                    D = -1;
                }
                int intValue = D.intValue();
                Number D2 = kotlin.collections.f.D(1, fArr);
                if (D2 == null) {
                    D2 = -1;
                }
                int intValue2 = D2.intValue();
                Number D3 = kotlin.collections.f.D(2, fArr);
                if (D3 == null) {
                    D3 = -1;
                }
                i11 = D3.intValue();
                i10 = intValue2;
                i12 = intValue;
            } else {
                i10 = 0;
                i11 = 0;
                i12 = -1;
            }
            PointF pointF = this.f25382e0;
            if (pointF != null) {
                int[] iArr = {aVar.f5491e};
                PageSize pageSize = this.f25380c0;
                PageSize pageSize2 = PageSize.Custom;
                if (pageSize == pageSize2) {
                    f10 = -1.0f;
                } else {
                    f10 = pointF.x / this.f25383f0;
                }
                if (pageSize == pageSize2) {
                    f11 = -1.0f;
                } else {
                    f11 = pointF.y / this.f25383f0;
                }
                readerPDFCore.adjustPageBySize(iArr, f10, f11, i12, i10, i11, false);
            }
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.base.BaseVMFragment
    public final void r0() {
    }

    @Override // pdf.pdfreader.viewer.editor.free.base.BaseVMFragment
    public final void s0() {
    }

    /* compiled from: PDFPageSettingFragment.kt */
    /* renamed from: pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.fragment.d$d  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0343d implements l4.d<Drawable> {
        public C0343d() {
        }

        @Override // l4.d
        public final void b(Object obj, DataSource dataSource) {
            ColorStateList colorStateList;
            Drawable drawable = (Drawable) obj;
            a aVar = d.f25379j0;
            d dVar = d.this;
            VB vb2 = dVar.Y;
            g.b(vb2);
            y0 y0Var = (y0) vb2;
            Context r4 = dVar.r();
            if (r4 != null) {
                colorStateList = androidx.core.content.a.getColorStateList(r4, R.color.color_100_8D8D8);
            } else {
                colorStateList = null;
            }
            y0Var.c.setStrokeColor(colorStateList);
        }

        @Override // l4.d
        public final void a(GlideException glideException) {
        }
    }
}

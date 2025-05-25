package pdf.pdfreader.viewer.editor.free.feature.ocr.ui;

import am.l;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.r;
import androidx.activity.s;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.m0;
import androidx.lifecycle.w;
import androidx.lifecycle.x;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cg.p;
import com.google.android.play.core.assetpacks.c;
import en.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.g;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;
import lib.zj.pdfeditor.ReaderPDFCore;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.feature.ocr.data.OCRWorkFlow;
import pdf.pdfreader.viewer.editor.free.feature.ocr.helper.OCRTransportImageExecutor;
import pdf.pdfreader.viewer.editor.free.feature.ocr.helper.m;
import pdf.pdfreader.viewer.editor.free.feature.ocr.ui.OCRPreviewActivity;
import pdf.pdfreader.viewer.editor.free.feature.ocr.ui.OCRSelectPDFPageActivity;
import pdf.pdfreader.viewer.editor.free.feature.ocr.ui.adapter.OCRSelectPDFPageAdapter;
import pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.f;
import pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.widget.FastScrollRecyclerView;
import pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.Pdf2ImageBigPicPreviewActivity;
import pdf.pdfreader.viewer.editor.free.ui.myview.InterceptTouchFrameLayout;
import pdf.pdfreader.viewer.editor.free.ui.widget.ProgressView;
import pdf.pdfreader.viewer.editor.free.utils.drag.DragSelectionProcessor;
import pdf.pdfreader.viewer.editor.free.utils.event.AppCoreFilterEvent;
import pdf.pdfreader.viewer.editor.free.utils.event.EventCenter;
import pdf.pdfreader.viewer.editor.free.utils.event.OCREventCenter;
import pdf.pdfreader.viewer.editor.free.utils.j1;
import pdf.pdfreader.viewer.editor.free.utils.t0;
import qb.b1;
import tf.d;

/* compiled from: OCRSelectPDFPageActivity.kt */
/* loaded from: classes3.dex */
public final class OCRSelectPDFPageActivity extends f {
    public pdf.pdfreader.viewer.editor.free.utils.drag.a J;
    public boolean L;
    public Parcelable M;
    public int N;
    public static final String Q = ea.a.p("WGUyXxxjEF8CZFJfGWExZRtjR3I0ZS10", "USC2TPmE");
    public static final a P = new a();
    public final tf.c G = kotlin.a.a(new cg.a<l>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ocr.ui.OCRSelectPDFPageActivity$binding$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final l invoke() {
            View inflate = OCRSelectPDFPageActivity.this.getLayoutInflater().inflate(R.layout.activity_ocr_select_pdf_page, (ViewGroup) null, false);
            int i10 = R.id.check_all;
            CheckBox checkBox = (CheckBox) c.u(inflate, R.id.check_all);
            if (checkBox != null) {
                i10 = R.id.continueLayer;
                FrameLayout frameLayout = (FrameLayout) c.u(inflate, R.id.continueLayer);
                if (frameLayout != null) {
                    i10 = R.id.iv_back;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) c.u(inflate, R.id.iv_back);
                    if (appCompatImageView != null) {
                        i10 = R.id.layout_all;
                        LinearLayout linearLayout = (LinearLayout) c.u(inflate, R.id.layout_all);
                        if (linearLayout != null) {
                            i10 = R.id.lyLoading;
                            LinearLayout linearLayout2 = (LinearLayout) c.u(inflate, R.id.lyLoading);
                            if (linearLayout2 != null) {
                                i10 = R.id.nextTv;
                                AppCompatTextView appCompatTextView = (AppCompatTextView) c.u(inflate, R.id.nextTv);
                                if (appCompatTextView != null) {
                                    i10 = R.id.pdf_to_image_fl_rv_container;
                                    if (((InterceptTouchFrameLayout) c.u(inflate, R.id.pdf_to_image_fl_rv_container)) != null) {
                                        i10 = R.id.preview_recycler;
                                        FastScrollRecyclerView fastScrollRecyclerView = (FastScrollRecyclerView) c.u(inflate, R.id.preview_recycler);
                                        if (fastScrollRecyclerView != null) {
                                            i10 = R.id.progressView;
                                            if (((ProgressView) c.u(inflate, R.id.progressView)) != null) {
                                                ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                                                i10 = R.id.title_bar;
                                                if (((ConstraintLayout) c.u(inflate, R.id.title_bar)) != null) {
                                                    i10 = R.id.titleTv;
                                                    if (((TextView) c.u(inflate, R.id.titleTv)) != null) {
                                                        i10 = R.id.top_select_all;
                                                        if (((TextView) c.u(inflate, R.id.top_select_all)) != null) {
                                                            i10 = R.id.view_status_bar;
                                                            View u7 = c.u(inflate, R.id.view_status_bar);
                                                            if (u7 != null) {
                                                                return new l(constraintLayout, checkBox, frameLayout, appCompatImageView, linearLayout, linearLayout2, appCompatTextView, fastScrollRecyclerView, constraintLayout, u7);
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
            throw new NullPointerException(ea.a.p("DGk2cyBuAyA6ZRd1XXIyZBh2O2U-IEFpAGhRSRU6IA==", "hMAEId7X").concat(inflate.getResources().getResourceName(i10)));
        }
    });
    public final tf.c H = kotlin.a.a(new cg.a<en.b>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ocr.ui.OCRSelectPDFPageActivity$viewModel$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final en.b invoke() {
            return (en.b) new m0(OCRSelectPDFPageActivity.this).a(en.b.class);
        }
    });
    public final tf.c I = kotlin.a.a(new cg.a<ArrayList<String>>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ocr.ui.OCRSelectPDFPageActivity$payloads$2
        @Override // cg.a
        public final ArrayList<String> invoke() {
            return ge.a.j("");
        }
    });
    public final ArrayList<bn.a> K = new ArrayList<>();
    public final tf.c O = kotlin.a.a(new cg.a<OCRSelectPDFPageAdapter>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ocr.ui.OCRSelectPDFPageActivity$ocrAdapter$2
        {
            super(0);
        }

        @Override // cg.a
        public final OCRSelectPDFPageAdapter invoke() {
            OCRSelectPDFPageActivity oCRSelectPDFPageActivity = OCRSelectPDFPageActivity.this;
            OCRSelectPDFPageActivity.a aVar = OCRSelectPDFPageActivity.P;
            OCRSelectPDFPageAdapter oCRSelectPDFPageAdapter = new OCRSelectPDFPageAdapter(oCRSelectPDFPageActivity.j2());
            final OCRSelectPDFPageActivity oCRSelectPDFPageActivity2 = OCRSelectPDFPageActivity.this;
            oCRSelectPDFPageAdapter.f25122j = new cg.l<Integer, d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ocr.ui.OCRSelectPDFPageActivity$ocrAdapter$2$1$1
                {
                    super(1);
                }

                @Override // cg.l
                public /* bridge */ /* synthetic */ d invoke(Integer num) {
                    invoke(num.intValue());
                    return d.f30009a;
                }

                public final void invoke(int i10) {
                    pdf.pdfreader.viewer.editor.free.utils.drag.a aVar2 = OCRSelectPDFPageActivity.this.J;
                    if (aVar2 != null) {
                        aVar2.d(i10);
                    }
                }
            };
            oCRSelectPDFPageAdapter.f25123k = new p<bn.a, Integer, d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ocr.ui.OCRSelectPDFPageActivity$ocrAdapter$2$1$2
                {
                    super(2);
                }

                @Override // cg.p
                public /* bridge */ /* synthetic */ d invoke(bn.a aVar2, Integer num) {
                    invoke(aVar2, num.intValue());
                    return d.f30009a;
                }

                public final void invoke(bn.a item, int i10) {
                    g.e(item, "item");
                    Pdf2ImageBigPicPreviewActivity.a aVar2 = Pdf2ImageBigPicPreviewActivity.f25491w0;
                    OCRSelectPDFPageActivity oCRSelectPDFPageActivity3 = OCRSelectPDFPageActivity.this;
                    OCRSelectPDFPageActivity.a aVar3 = OCRSelectPDFPageActivity.P;
                    String str = oCRSelectPDFPageActivity3.f25314u;
                    String p10 = ea.a.p("CVJ-TSZPdFIFRRJUJ0ErVA==", "J1yxv6yZ");
                    String str2 = OCRSelectPDFPageActivity.this.f25315v;
                    int i11 = item.f5491e;
                    aVar2.getClass();
                    Pdf2ImageBigPicPreviewActivity.a.a(oCRSelectPDFPageActivity3, str, false, p10, str2, i11, false);
                }
            };
            oCRSelectPDFPageAdapter.f25124l = new cg.a<d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ocr.ui.OCRSelectPDFPageActivity$ocrAdapter$2$1$3
                {
                    super(0);
                }

                @Override // cg.a
                public /* bridge */ /* synthetic */ d invoke() {
                    invoke2();
                    return d.f30009a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    OCRSelectPDFPageActivity oCRSelectPDFPageActivity3 = OCRSelectPDFPageActivity.this;
                    String string = oCRSelectPDFPageActivity3.getString(R.string.arg_res_0x7f130257);
                    g.d(string, ea.a.p("VGU_UwdyC24VKGYuGnQkaSpnHG0neBxsEG0mdAxyLmFQaC5kLGcSdCk=", "yOSKdJGp"));
                    j1.c(-1, oCRSelectPDFPageActivity3.getResources().getDimensionPixelSize(R.dimen.dp_100), oCRSelectPDFPageActivity3, string, true);
                }
            };
            return oCRSelectPDFPageAdapter;
        }
    });

    /* compiled from: OCRSelectPDFPageActivity.kt */
    /* loaded from: classes3.dex */
    public static final class a {
    }

    /* compiled from: OCRSelectPDFPageActivity.kt */
    /* loaded from: classes3.dex */
    public static final class b implements DragSelectionProcessor.b {
        public b() {
        }

        @Override // pdf.pdfreader.viewer.editor.free.utils.drag.DragSelectionProcessor.b
        public final void a(int i10, int i11, boolean z10, boolean z11) {
            OCRSelectPDFPageActivity oCRSelectPDFPageActivity = OCRSelectPDFPageActivity.this;
            if (z11) {
                a aVar = OCRSelectPDFPageActivity.P;
                bn.a aVar2 = oCRSelectPDFPageActivity.i2().f25117e.get(i10);
                g.d(aVar2, ea.a.p("JnRUbQpbR28paT5pGm5d", "FtUlcxNT"));
                oCRSelectPDFPageActivity.L = !aVar2.f5492f;
            }
            if (i10 > i11) {
                return;
            }
            while (true) {
                a aVar3 = OCRSelectPDFPageActivity.P;
                bn.a aVar4 = oCRSelectPDFPageActivity.i2().f25117e.get(i10);
                g.d(aVar4, ea.a.p("JnRUbQpbR28paT5pGm5d", "FtUlcxNT"));
                bn.a aVar5 = aVar4;
                if (oCRSelectPDFPageActivity.L) {
                    oCRSelectPDFPageActivity.j2().getClass();
                    if (en.b.d() >= 40) {
                        String string = oCRSelectPDFPageActivity.getString(R.string.arg_res_0x7f130257);
                        g.d(string, ea.a.p("M2U-UyFyI24vKDQuR3QlaVZnfG0oeGlsHW0YdA5yJ2E3aC9kCmc6dCk=", "KlTJUJP9"));
                        j1.c(-1, oCRSelectPDFPageActivity.getResources().getDimensionPixelSize(R.dimen.dp_100), oCRSelectPDFPageActivity, string, true);
                        return;
                    } else if (!aVar5.f5492f) {
                        HashSet<String> hashSet = OCREventCenter.f28671b;
                        if (!hashSet.contains(ea.a.p("XGM5cxZsB2MGX0dsAGQzXydsW2Nr", "0R1gZM8b"))) {
                            Context c = r.c("P2M_c1xsXGM8XxVsXWQyX1tsO2Nr", "hQPM99eh", hashSet);
                            OCREventCenter.b(c, a0.a.i("UnA7bBpjA3Qbb1pDBm4iZTx0", "SDVfy9Eh", c, "IGNy", "eZXGenPl"), ea.a.p("IGNDcxxsUmMuXzlsHGQNX1ZsB2Nr", "dBsDZTTN"));
                        }
                        oCRSelectPDFPageActivity.j2().getClass();
                        w<ArrayList<bn.a>> wVar = en.a.f16815a;
                        ArrayList<bn.a> b10 = a.C0215a.b();
                        aVar5.f5492f = true;
                        aVar5.f5493g = b10.size() + 1;
                        b10.add(aVar5);
                        en.a.c.j(b10);
                    }
                } else if (aVar5.f5492f) {
                    oCRSelectPDFPageActivity.j2().getClass();
                    w<ArrayList<bn.a>> wVar2 = en.a.f16815a;
                    a.C0215a.d(aVar5);
                }
                if (i10 != i11) {
                    i10++;
                } else {
                    return;
                }
            }
        }

        @Override // pdf.pdfreader.viewer.editor.free.utils.drag.DragSelectionProcessor.b
        public final Set<Integer> q() {
            return null;
        }
    }

    /* compiled from: OCRSelectPDFPageActivity.kt */
    /* loaded from: classes3.dex */
    public static final class c implements x, e {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ cg.l f25113a;

        public c(cg.l lVar) {
            ea.a.p("VXUlYwdpDW4=", "WRSDorUA");
            this.f25113a = lVar;
        }

        @Override // kotlin.jvm.internal.e
        public final cg.l a() {
            return this.f25113a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof x) && (obj instanceof e)) {
                return g.a(this.f25113a, ((e) obj).a());
            }
            return false;
        }

        public final int hashCode() {
            return this.f25113a.hashCode();
        }

        @Override // androidx.lifecycle.x
        public final /* synthetic */ void m(Object obj) {
            this.f25113a.invoke(obj);
        }
    }

    @Override // jl.a
    public final View D1() {
        ConstraintLayout constraintLayout = h2().f1057i;
        g.d(constraintLayout, ea.a.p("UWklZBpuBS4Ab1t0P2kzdw==", "Za7wWE3Z"));
        return constraintLayout;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.f, jl.a
    public final int E1() {
        return 0;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.f, jl.a
    public final void K1() {
        int i10;
        if (getResources().getDisplayMetrics().heightPixels > getResources().getDisplayMetrics().widthPixels * 1.35d) {
            i10 = 2;
        } else {
            i10 = 3;
        }
        h2().f1056h.setAdapter(i2());
        i2().f25120h = ((getResources().getDisplayMetrics().widthPixels - getResources().getDimensionPixelSize(R.dimen.dp_20)) - (getResources().getDimensionPixelSize(R.dimen.dp_12) * i10)) / i10;
        i2().f25121i = (i2().f25120h * ShapeTypes.CHART_STAR) / ShapeTypes.ACTION_BUTTON_BACK_PREVIOUS;
        h2().f1056h.setLayoutManager(new GridLayoutManager(i10));
        h2().f1056h.setHasFixedSize(true);
        DragSelectionProcessor dragSelectionProcessor = new DragSelectionProcessor(new b());
        dragSelectionProcessor.f28620a = DragSelectionProcessor.Mode.Simple;
        pdf.pdfreader.viewer.editor.free.utils.drag.a aVar = new pdf.pdfreader.viewer.editor.free.utils.drag.a();
        aVar.f28634k = dragSelectionProcessor;
        h2().f1056h.r(aVar);
        this.J = aVar;
        h2().f1052d.setOnClickListener(new f5.d(this, 9));
        h2().f1053e.setOnClickListener(new f5.e(this, 7));
        AppCompatTextView appCompatTextView = h2().f1055g;
        g.d(appCompatTextView, ea.a.p("UWklZBpuBS4cZUx0PXY=", "5rKzXtEp"));
        pdf.pdfreader.viewer.editor.free.utils.extension.g.e(appCompatTextView, new cg.l<View, d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ocr.ui.OCRSelectPDFPageActivity$initView$4
            {
                super(1);
            }

            @Override // cg.l
            public /* bridge */ /* synthetic */ d invoke(View view) {
                invoke2(view);
                return d.f30009a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View it) {
                ReaderPDFCore readerPDFCore;
                g.e(it, "it");
                OCRSelectPDFPageActivity oCRSelectPDFPageActivity = OCRSelectPDFPageActivity.this;
                OCRSelectPDFPageActivity.a aVar2 = OCRSelectPDFPageActivity.P;
                ArrayList arrayList = (ArrayList) oCRSelectPDFPageActivity.j2().f16822d.d();
                if (arrayList != null) {
                    final OCRSelectPDFPageActivity oCRSelectPDFPageActivity2 = OCRSelectPDFPageActivity.this;
                    Context a10 = OCREventCenter.a();
                    OCREventCenter.b(a10, a0.a.i("LnBBbBBjVnQzbyRDGm4cZU10", "1Fc2WBJo", a10, "AWNy", "bqnWAjGr"), ea.a.p("XGM5cxZsB2MGX1plEXQJYyhpUWs=", "0I2o7NWN"));
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(Integer.valueOf(((bn.a) it2.next()).f5491e));
                    }
                    if (!(!arrayList.isEmpty()) || (readerPDFCore = oCRSelectPDFPageActivity2.f25317x) == null) {
                        return;
                    }
                    new OCRTransportImageExecutor(oCRSelectPDFPageActivity2, new cg.l<List<? extends um.a>, d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ocr.ui.OCRSelectPDFPageActivity$initView$4$1$1$1
                        {
                            super(1);
                        }

                        /* renamed from: invoke  reason: avoid collision after fix types in other method */
                        public final void invoke2(List<um.a> result) {
                            g.e(result, "result");
                            if (!result.isEmpty()) {
                                pdf.pdfreader.viewer.editor.free.feature.ocr.helper.a.a(result);
                                OCRPreviewActivity.a aVar3 = OCRPreviewActivity.f25092x;
                                OCRSelectPDFPageActivity oCRSelectPDFPageActivity3 = OCRSelectPDFPageActivity.this;
                                OCRWorkFlow oCRWorkFlow = OCRWorkFlow.PREVIEW;
                                aVar3.getClass();
                                OCRPreviewActivity.a.a(oCRSelectPDFPageActivity3, oCRWorkFlow);
                            }
                        }

                        @Override // cg.l
                        public /* bridge */ /* synthetic */ d invoke(List<? extends um.a> list) {
                            invoke2((List<um.a>) list);
                            return d.f30009a;
                        }
                    }).l(new m(pdf.pdfreader.viewer.editor.free.utils.extension.c.k(oCRSelectPDFPageActivity2), readerPDFCore, arrayList2));
                }
            }
        });
    }

    @Override // jl.a
    public final void L1() {
        j2().f16822d.e(this, new c(new cg.l<ArrayList<bn.a>, d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ocr.ui.OCRSelectPDFPageActivity$initViewModel$1
            {
                super(1);
            }

            @Override // cg.l
            public /* bridge */ /* synthetic */ d invoke(ArrayList<bn.a> arrayList) {
                invoke2(arrayList);
                return d.f30009a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(ArrayList<bn.a> arrayList) {
                OCRSelectPDFPageActivity oCRSelectPDFPageActivity = OCRSelectPDFPageActivity.this;
                OCRSelectPDFPageActivity.a aVar = OCRSelectPDFPageActivity.P;
                oCRSelectPDFPageActivity.h2().f1055g.setEnabled(!(arrayList == null || arrayList.isEmpty()));
                if (arrayList == null || arrayList.isEmpty()) {
                    OCRSelectPDFPageActivity.this.h2().f1055g.setText(OCRSelectPDFPageActivity.this.getString(R.string.arg_res_0x7f130437));
                } else {
                    OCRSelectPDFPageActivity.this.h2().f1055g.setText(OCRSelectPDFPageActivity.this.getString(R.string.arg_res_0x7f130438, String.valueOf(arrayList.size())));
                }
                OCRSelectPDFPageActivity oCRSelectPDFPageActivity2 = OCRSelectPDFPageActivity.this;
                boolean k22 = oCRSelectPDFPageActivity2.k2();
                if (oCRSelectPDFPageActivity2.h2().f1053e.getVisibility() == 0) {
                    oCRSelectPDFPageActivity2.h2().f1051b.setChecked(k22);
                }
                OCRSelectPDFPageActivity oCRSelectPDFPageActivity3 = OCRSelectPDFPageActivity.this;
                if (oCRSelectPDFPageActivity3.i2().getItemCount() > 0) {
                    oCRSelectPDFPageActivity3.i2().notifyItemRangeChanged(0, oCRSelectPDFPageActivity3.i2().getItemCount(), (ArrayList) oCRSelectPDFPageActivity3.I.getValue());
                }
            }
        }));
        t0.d0(b.b.x(this), null, null, new OCRSelectPDFPageActivity$initViewModel$2(this, null), 3);
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.f
    public final View c2() {
        return h2().f1054f;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.f
    public final View d2() {
        return h2().f1058j;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.f
    public final void e2(boolean z10) {
        boolean z11;
        ReaderPDFCore readerPDFCore = this.f25317x;
        if (readerPDFCore != null) {
            ArrayList<bn.a> arrayList = this.K;
            arrayList.clear();
            w wVar = en.a.f16816b;
            Collection collection = (Collection) wVar.d();
            if (collection != null && !collection.isEmpty()) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (!z11) {
                T d10 = wVar.d();
                g.b(d10);
                arrayList.addAll((Collection) d10);
            } else {
                int countPages = readerPDFCore.countPages();
                for (int i10 = 0; i10 < countPages; i10++) {
                    bn.a aVar = new bn.a();
                    int i11 = this.N;
                    if (i11 >= 0 && i11 < readerPDFCore.countPages() && i10 == this.N) {
                        aVar.f5492f = true;
                    }
                    aVar.f5491e = i10;
                    arrayList.add(aVar);
                }
            }
            this.f25313t.post(new b1(this, 2, readerPDFCore, z10));
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.f
    public final void f2() {
        finish();
    }

    public final l h2() {
        return (l) this.G.getValue();
    }

    public final OCRSelectPDFPageAdapter i2() {
        return (OCRSelectPDFPageAdapter) this.O.getValue();
    }

    public final en.b j2() {
        return (en.b) this.H.getValue();
    }

    public final boolean k2() {
        int i10;
        ArrayList arrayList = (ArrayList) j2().f16822d.d();
        if (arrayList != null) {
            i10 = arrayList.size();
        } else {
            i10 = 0;
        }
        if (i10 <= 0 || i10 != this.K.size()) {
            return false;
        }
        return true;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.f, jl.a, androidx.fragment.app.u, androidx.activity.ComponentActivity, k0.j, android.app.Activity
    public final void onCreate(Bundle bundle) {
        if (bundle != null) {
            this.M = bundle.getParcelable(ea.a.p("PWVSeRpsUnIJdCt0ZQ==", "pbcfnxAm"));
        }
        boolean z10 = false;
        this.N = getIntent().getIntExtra(Q, 0);
        super.onCreate(bundle);
        s.w0(this);
        Intent intent = getIntent();
        if (intent != null && intent.hasExtra(ea.a.p("I2FfZwxhUGUFci9jFGwEX1tvGmkjaQZhFmlXbjV0A2c=", "BncTb8jb"))) {
            z10 = true;
        }
        if (z10) {
            ReaderPdfApplication.f();
            pdf.pdfreader.viewer.editor.free.service.b.d();
            if (bundle == null) {
                EventCenter.sendLanguageRecallClickEvent(this, getIntent());
            }
        }
        if (ReaderPdfApplication.f23865q == -1) {
            Y1();
            return;
        }
        Context a10 = OCREventCenter.a();
        OCREventCenter.b(a10, a0.a.i("UnA7bBpjA3Qbb1pDBm4iZTx0", "AxoK6SPV", a10, "IGNy", "gd6rJDde"), ea.a.p("JWNLczxsDmM8XxVoW3c=", "IsJ9YkNG"));
        AppCoreFilterEvent.d();
        AppCoreFilterEvent.h(ea.a.p("XGM5XwNhBWUtc1FsDGMiXzJpV3c=", "ZH26kUe0"));
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.f, jl.a, androidx.appcompat.app.c, androidx.fragment.app.u, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        tf.c cVar = OCREventCenter.f28670a;
        OCREventCenter.f28671b.clear();
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.f, jl.a, androidx.activity.ComponentActivity, k0.j, android.app.Activity
    public final void onSaveInstanceState(Bundle outState) {
        Parcelable parcelable;
        g.e(outState, "outState");
        super.onSaveInstanceState(outState);
        String p10 = ea.a.p("PWVSeRpsUnIJdCt0ZQ==", "IVddTLXR");
        RecyclerView.m layoutManager = h2().f1056h.getLayoutManager();
        if (layoutManager != null) {
            parcelable = layoutManager.r0();
        } else {
            parcelable = null;
        }
        outState.putParcelable(p10, parcelable);
    }

    @Override // jl.a, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.f, jl.a
    public final void C1() {
    }
}

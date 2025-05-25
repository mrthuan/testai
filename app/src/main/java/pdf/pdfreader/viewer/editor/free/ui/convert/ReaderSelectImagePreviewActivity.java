package pdf.pdfreader.viewer.editor.free.ui.convert;

import android.animation.ValueAnimator;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.m0;
import androidx.lifecycle.w;
import androidx.lifecycle.x;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import cg.l;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.m;
import kotlin.jvm.internal.g;
import kotlin.text.k;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.feature.ocr.data.OCRWorkFlow;
import pdf.pdfreader.viewer.editor.free.feature.ocr.helper.OCRTransportImageExecutor;
import pdf.pdfreader.viewer.editor.free.feature.ocr.helper.j;
import pdf.pdfreader.viewer.editor.free.feature.ocr.ui.OCRPreviewActivity;
import pdf.pdfreader.viewer.editor.free.repo.convert.ImageConvertDataRepository;
import pdf.pdfreader.viewer.editor.free.ui.act.single_choose.SingleSelectImagePreviewActivity;
import pdf.pdfreader.viewer.editor.free.ui.adapter.convert.SelectGalleryAdapter;
import pdf.pdfreader.viewer.editor.free.utils.event.OCREventCenter;
import pdf.pdfreader.viewer.editor.free.utils.j1;
import pdf.pdfreader.viewer.editor.free.utils.n0;
import qb.j0;

/* compiled from: ReaderSelectImagePreviewActivity.kt */
/* loaded from: classes3.dex */
public class ReaderSelectImagePreviewActivity extends pdf.pdfreader.viewer.editor.free.ui.act.a {
    public static final String U = ea.a.p("WGUyXxdpEXAeYU1fGXIzdi1lRV8vZA==", "v26DotSX");
    public static final String V = ea.a.p("PG9Echpl", "yC6XT18O");
    public static final String W = ea.a.p("WGUyXxBhD2UAYWttBmRl", "uG56vfBC");
    public ConstraintLayout I;
    public AppCompatTextView J;
    public AppCompatImageView K;
    public ViewPager2 L;
    public RecyclerView M;
    public AppCompatTextView N;
    public View O;
    public String P = "";
    public final tf.c Q = kotlin.a.a(new cg.a<uo.b>() { // from class: pdf.pdfreader.viewer.editor.free.ui.convert.ReaderSelectImagePreviewActivity$viewModel$2
        {
            super(0);
        }

        @Override // cg.a
        public final uo.b invoke() {
            return (uo.b) new m0(ReaderSelectImagePreviewActivity.this).a(uo.b.class);
        }
    });
    public final tf.c R = kotlin.a.a(new cg.a<pdf.pdfreader.viewer.editor.free.ui.adapter.convert.f>() { // from class: pdf.pdfreader.viewer.editor.free.ui.convert.ReaderSelectImagePreviewActivity$viewPagerAdapter$2
        {
            super(0);
        }

        @Override // cg.a
        public final pdf.pdfreader.viewer.editor.free.ui.adapter.convert.f invoke() {
            ArrayList arrayList = (ArrayList) ReaderSelectImagePreviewActivity.this.p2().f30456e.d();
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            return new pdf.pdfreader.viewer.editor.free.ui.adapter.convert.f(arrayList);
        }
    });
    public final tf.c S = kotlin.a.a(new cg.a<SelectGalleryAdapter>() { // from class: pdf.pdfreader.viewer.editor.free.ui.convert.ReaderSelectImagePreviewActivity$selectAdapter$2

        /* compiled from: ReaderSelectImagePreviewActivity.kt */
        /* loaded from: classes3.dex */
        public static final class a implements SelectGalleryAdapter.a {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ ReaderSelectImagePreviewActivity f27413a;

            public a(ReaderSelectImagePreviewActivity readerSelectImagePreviewActivity) {
                this.f27413a = readerSelectImagePreviewActivity;
            }

            @Override // pdf.pdfreader.viewer.editor.free.ui.adapter.convert.SelectGalleryAdapter.a
            public final void a(ul.b bVar, int i10) {
                ReaderSelectImagePreviewActivity readerSelectImagePreviewActivity = this.f27413a;
                ViewPager2 viewPager2 = readerSelectImagePreviewActivity.L;
                if (viewPager2 != null) {
                    if (i10 != viewPager2.getCurrentItem()) {
                        tn.a.d(readerSelectImagePreviewActivity, ea.a.p("EGUKZQF0JmklYQFl", "qWcfbysg"), ea.a.p("QGUnZRB0FGkXd2tzHmkiYyxfUWwvY2s=", "5di5MKw4"), androidx.activity.f.m(readerSelectImagePreviewActivity.c2(), "_", readerSelectImagePreviewActivity.P), false);
                    }
                    ViewPager2 viewPager22 = readerSelectImagePreviewActivity.L;
                    if (viewPager22 != null) {
                        viewPager22.i(i10, true);
                        return;
                    } else {
                        g.i(ea.a.p("MGkPdxxhMmVy", "AzFjLUmH"));
                        throw null;
                    }
                }
                g.i(ea.a.p("T2lSdyZhMmVy", "VX97vURW"));
                throw null;
            }

            @Override // pdf.pdfreader.viewer.editor.free.ui.adapter.convert.SelectGalleryAdapter.a
            public final void b(ul.b bVar, int i10) {
                String p10 = ea.a.p("PGVdZRp0aGk3YS1l", "t4g1wQC4");
                String p11 = ea.a.p("PGVdZRp0QWk_dxVkEGwNdFBfDWwsY2s=", "nnekNuMh");
                ReaderSelectImagePreviewActivity readerSelectImagePreviewActivity = this.f27413a;
                tn.a.d(readerSelectImagePreviewActivity, p10, p11, androidx.activity.f.m(readerSelectImagePreviewActivity.c2(), "_", readerSelectImagePreviewActivity.P), false);
                readerSelectImagePreviewActivity.T = i10;
                bVar.b(false);
                readerSelectImagePreviewActivity.q2().notifyDataSetChanged();
                uo.b p22 = readerSelectImagePreviewActivity.p2();
                p22.getClass();
                w<ArrayList<ul.b>> wVar = p22.f30455d;
                ArrayList<ul.b> d10 = wVar.d();
                if (d10 != null) {
                    d10.remove(bVar);
                    wVar.j(d10);
                }
            }
        }

        {
            super(0);
        }

        @Override // cg.a
        public final SelectGalleryAdapter invoke() {
            ReaderSelectImagePreviewActivity readerSelectImagePreviewActivity = ReaderSelectImagePreviewActivity.this;
            a aVar = new a(readerSelectImagePreviewActivity);
            readerSelectImagePreviewActivity.getClass();
            return new SelectGalleryAdapter(aVar, 0, readerSelectImagePreviewActivity instanceof SingleSelectImagePreviewActivity);
        }
    });
    public int T = -1;

    /* compiled from: ReaderSelectImagePreviewActivity.kt */
    /* loaded from: classes3.dex */
    public static final class a extends ViewPager2.g {
        public a() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public final void c(int i10) {
            boolean z10;
            ea.a.p("P20RUDdlTmktdw==", "19vvE83J");
            ReaderSelectImagePreviewActivity readerSelectImagePreviewActivity = ReaderSelectImagePreviewActivity.this;
            readerSelectImagePreviewActivity.p2().d();
            String str = n0.f28727a;
            if (readerSelectImagePreviewActivity.p2().d() != i10) {
                int itemCount = readerSelectImagePreviewActivity.q2().getItemCount();
                int d10 = readerSelectImagePreviewActivity.p2().d();
                if (d10 >= 0 && d10 < itemCount) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    ViewPager2 viewPager2 = readerSelectImagePreviewActivity.L;
                    if (viewPager2 != null) {
                        if (viewPager2.isInLayout()) {
                            int d11 = readerSelectImagePreviewActivity.p2().d();
                            ViewPager2 viewPager22 = readerSelectImagePreviewActivity.L;
                            if (viewPager22 != null) {
                                viewPager22.post(new rh.g(this, d11, readerSelectImagePreviewActivity, 3));
                            } else {
                                g.i(ea.a.p("RWkudyNhBWVy", "t5TwFEzy"));
                                throw null;
                            }
                        } else {
                            readerSelectImagePreviewActivity.q2().notifyItemChanged(readerSelectImagePreviewActivity.p2().d());
                        }
                    } else {
                        g.i(ea.a.p("OWlUdylhUGVy", "AEXjFWoO"));
                        throw null;
                    }
                }
            }
            readerSelectImagePreviewActivity.p2().f30457f.j(Integer.valueOf(i10));
            ReaderSelectImagePreviewActivity.l2(readerSelectImagePreviewActivity);
            readerSelectImagePreviewActivity.m2();
            SelectGalleryAdapter o22 = readerSelectImagePreviewActivity.o2();
            o22.f27174j = i10;
            o22.notifyItemRangeChanged(0, o22.getItemCount(), (ArrayList) o22.f27172h.getValue());
            RecyclerView recyclerView = readerSelectImagePreviewActivity.M;
            if (recyclerView != null) {
                recyclerView.r0(i10);
            } else {
                g.i(ea.a.p("SmUYZQl0CnY=", "Rf9tjXMw"));
                throw null;
            }
        }
    }

    /* compiled from: ReaderSelectImagePreviewActivity.kt */
    /* loaded from: classes3.dex */
    public static final class b implements x, kotlin.jvm.internal.e {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ l f27412a;

        public b(l lVar) {
            ea.a.p("KXVfYw1pWG4=", "R1Jijhod");
            this.f27412a = lVar;
        }

        @Override // kotlin.jvm.internal.e
        public final l a() {
            return this.f27412a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof x) && (obj instanceof kotlin.jvm.internal.e)) {
                return g.a(this.f27412a, ((kotlin.jvm.internal.e) obj).a());
            }
            return false;
        }

        public final int hashCode() {
            return this.f27412a.hashCode();
        }

        @Override // androidx.lifecycle.x
        public final /* synthetic */ void m(Object obj) {
            this.f27412a.invoke(obj);
        }
    }

    static {
        ea.a.p("Bm1WUAtlQWk_dw==", "CmE3U1KV");
    }

    public static final void l2(ReaderSelectImagePreviewActivity readerSelectImagePreviewActivity) {
        String string;
        int i10;
        readerSelectImagePreviewActivity.getClass();
        boolean j10 = pdf.pdfreader.viewer.editor.free.utils.extension.c.j(readerSelectImagePreviewActivity);
        int i11 = 0;
        int i12 = R.string.arg_res_0x7f1301b7;
        if (j10) {
            if (!TextUtils.equals(readerSelectImagePreviewActivity.P, ea.a.p("BGEuZThh", "2HgCJAy8"))) {
                i12 = R.string.arg_res_0x7f130465;
            }
            Object[] objArr = new Object[2];
            ArrayList arrayList = (ArrayList) readerSelectImagePreviewActivity.p2().f30456e.d();
            if (arrayList != null) {
                i10 = arrayList.size();
            } else {
                i10 = 0;
            }
            objArr[0] = String.valueOf(i10);
            objArr[1] = String.valueOf(readerSelectImagePreviewActivity.p2().d() + 1);
            string = readerSelectImagePreviewActivity.getString(i12, objArr);
        } else {
            if (!TextUtils.equals(readerSelectImagePreviewActivity.P, ea.a.p("WmEaZRxh", "oc9wnrAZ"))) {
                i12 = R.string.arg_res_0x7f130465;
            }
            Object[] objArr2 = new Object[2];
            objArr2[0] = String.valueOf(readerSelectImagePreviewActivity.p2().d() + 1);
            ArrayList arrayList2 = (ArrayList) readerSelectImagePreviewActivity.p2().f30456e.d();
            if (arrayList2 != null) {
                i11 = arrayList2.size();
            }
            objArr2[1] = String.valueOf(i11);
            string = readerSelectImagePreviewActivity.getString(i12, objArr2);
        }
        g.d(string, ea.a.p("JmYRKBBzZVQWKGMpVXtiIBUgTiBlIEUgiIDPYyB1NGUMb0RuDSgefXgpQCBVIEggFSBOfQ==", "gRcpjiTF"));
        SpannableString spannableString = new SpannableString(string);
        int Y = k.Y(string, ea.a.p("Lw==", "75Wg4VvK"), 6);
        if (pdf.pdfreader.viewer.editor.free.utils.extension.c.j(readerSelectImagePreviewActivity)) {
            int i13 = Y + 1;
            if (i13 > 1) {
                spannableString.setSpan(new RelativeSizeSpan(0.75f), 1, i13, 17);
            }
        } else {
            spannableString.setSpan(new RelativeSizeSpan(0.75f), Y, string.length() - 1, 17);
        }
        AppCompatTextView appCompatTextView = readerSelectImagePreviewActivity.J;
        if (appCompatTextView != null) {
            appCompatTextView.setText(spannableString);
        } else {
            g.i(ea.a.p("R2k_bBZUdg==", "vnagfDYe"));
            throw null;
        }
    }

    @Override // jl.a
    public final void C1() {
        View findViewById = findViewById(R.id.rootView);
        g.d(findViewById, ea.a.p("VWklZCVpB3cweX1kQVJ4aSAuQG8pdBVpHHcp", "yOcnaETn"));
        this.O = findViewById;
        View findViewById2 = findViewById(R.id.layout_ad_bottom);
        g.d(findViewById2, ea.a.p("VWklZCVpB3cweX1kQVJ4aSAuXmE_bzZ0CWFUXxFvTHRcbSk=", "V0s8JaIA"));
        LinearLayout linearLayout = (LinearLayout) findViewById2;
        ((AppCompatImageView) findViewById(R.id.backImg)).setOnClickListener(new d9.f(this, 20));
        View findViewById3 = findViewById(R.id.titleTv);
        g.d(findViewById3, ea.a.p("UWkYZAZpAncKeS9kHFJ5aVwuJmk9bFNUAik=", "CE7vPgtW"));
        this.J = (AppCompatTextView) findViewById3;
        View findViewById4 = findViewById(R.id.viewBottomGallery);
        g.d(findViewById4, ea.a.p("DGk5ZARpUncKeS9kHFJ5aVwuJGksd3RvAHQebRZhLmwPci4p", "pVjWR7T4"));
        this.I = (ConstraintLayout) findViewById4;
        View findViewById5 = findViewById(R.id.checkIv);
        ((AppCompatImageView) findViewById5).setOnClickListener(new j0(this, 18));
        g.d(findViewById5, ea.a.p("KWlfZC9pUncYeQNkSUEYcHZvA3AkdCxt2oDsKARoO3N1Ol5uOmxeYzEpQCBVIEggFSBOfQ==", "1jNZ8JpR"));
        this.K = (AppCompatImageView) findViewById5;
        ((TextView) findViewById(R.id.clearTv)).setOnClickListener(new f5.d(this, 20));
        View findViewById6 = findViewById(R.id.viewPager);
        g.d(findViewById6, ea.a.p("VWklZCVpB3cweX1kQVJ4aSAuRGkjdxNhA2UTKQ==", "da5k12F8"));
        this.L = (ViewPager2) findViewById6;
        View findViewById7 = findViewById(R.id.selectRv);
        g.d(findViewById7, ea.a.p("VWklZCVpB3cweX1kQVJ4aSAuQWUqZSB0N3Yp", "eLCzNrXa"));
        this.M = (RecyclerView) findViewById7;
        View findViewById8 = findViewById(R.id.continueTv);
        AppCompatTextView appCompatTextView = (AppCompatTextView) findViewById8;
        g.d(appCompatTextView, ea.a.p("UXQ=", "Hu8sMwvA"));
        pdf.pdfreader.viewer.editor.free.utils.extension.g.e(appCompatTextView, new ReaderSelectImagePreviewActivity$findView$4$1(this));
        g.d(findViewById8, ea.a.p("VWklZCVpB3cweX1kVUEmcAdvX3AndBdloIDfKERoAXMJOiRuMGwLYxkpPiBJIHYgZCASfQ==", "By0h7S0F"));
        this.N = (AppCompatTextView) findViewById8;
    }

    @Override // jl.a
    public final View D1() {
        View view = this.O;
        if (view != null) {
            return view;
        }
        g.i(ea.a.p("Om8sdBxpCnc=", "JJHCJoI6"));
        throw null;
    }

    @Override // jl.a
    public final int E1() {
        return R.layout.activity_r3_img_preview_select;
    }

    @Override // jl.a
    public final void K1() {
        View findViewById = findViewById(R.id.view_status_bar);
        ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        layoutParams.height = aj.b.B(this);
        findViewById.setLayoutParams(layoutParams);
        ViewPager2 viewPager2 = this.L;
        if (viewPager2 != null) {
            viewPager2.setOrientation(0);
            viewPager2.setOffscreenPageLimit(2);
            viewPager2.f(new a());
            viewPager2.setAdapter(q2());
            RecyclerView recyclerView = this.M;
            if (recyclerView != null) {
                recyclerView.setLayoutManager(new LinearLayoutManager(0));
                recyclerView.setAdapter(o2());
                AppCompatTextView appCompatTextView = this.N;
                if (appCompatTextView != null) {
                    appCompatTextView.setText(getString(R.string.arg_res_0x7f1301a9));
                    appCompatTextView.setEnabled(false);
                    appCompatTextView.setAlpha(0.3f);
                    p2().f30458g.e(this, new b(new l<Integer, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.convert.ReaderSelectImagePreviewActivity$initObserver$1
                        {
                            super(1);
                        }

                        @Override // cg.l
                        public /* bridge */ /* synthetic */ tf.d invoke(Integer num) {
                            invoke2(num);
                            return tf.d.f30009a;
                        }

                        /* renamed from: invoke  reason: avoid collision after fix types in other method */
                        public final void invoke2(Integer num) {
                            if (num != null) {
                                ReaderSelectImagePreviewActivity.l2(ReaderSelectImagePreviewActivity.this);
                            }
                        }
                    }));
                    p2().f30456e.e(this, new b(new l<ArrayList<ul.b>, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.convert.ReaderSelectImagePreviewActivity$initObserver$2
                        {
                            super(1);
                        }

                        @Override // cg.l
                        public /* bridge */ /* synthetic */ tf.d invoke(ArrayList<ul.b> arrayList) {
                            invoke2(arrayList);
                            return tf.d.f30009a;
                        }

                        /* renamed from: invoke  reason: avoid collision after fix types in other method */
                        public final void invoke2(ArrayList<ul.b> arrayList) {
                            boolean z10 = true;
                            if (arrayList == null || arrayList.isEmpty()) {
                                AppCompatTextView appCompatTextView2 = ReaderSelectImagePreviewActivity.this.N;
                                if (appCompatTextView2 != null) {
                                    appCompatTextView2.setEnabled(false);
                                    AppCompatTextView appCompatTextView3 = ReaderSelectImagePreviewActivity.this.N;
                                    if (appCompatTextView3 == null) {
                                        g.i(ea.a.p("UG8ldBpuF2Umdg==", "0T1T59JZ"));
                                        throw null;
                                    }
                                    appCompatTextView3.setAlpha(0.3f);
                                } else {
                                    g.i(ea.a.p("LG9fdBBuQmUOdg==", "mGYfhuJf"));
                                    throw null;
                                }
                            } else {
                                ReaderSelectImagePreviewActivity readerSelectImagePreviewActivity = ReaderSelectImagePreviewActivity.this;
                                String str = ReaderSelectImagePreviewActivity.U;
                                if (!readerSelectImagePreviewActivity.r2()) {
                                    AppCompatTextView appCompatTextView4 = ReaderSelectImagePreviewActivity.this.N;
                                    if (appCompatTextView4 != null) {
                                        appCompatTextView4.setEnabled(false);
                                        AppCompatTextView appCompatTextView5 = ReaderSelectImagePreviewActivity.this.N;
                                        if (appCompatTextView5 == null) {
                                            g.i(ea.a.p("UG8ldBpuF2Umdg==", "O0RdyGuE"));
                                            throw null;
                                        }
                                        appCompatTextView5.setAlpha(0.3f);
                                    } else {
                                        g.i(ea.a.p("LG9fdBBuQmUOdg==", "tcp1LjTd"));
                                        throw null;
                                    }
                                } else {
                                    AppCompatTextView appCompatTextView6 = ReaderSelectImagePreviewActivity.this.N;
                                    if (appCompatTextView6 != null) {
                                        appCompatTextView6.setEnabled(true);
                                        AppCompatTextView appCompatTextView7 = ReaderSelectImagePreviewActivity.this.N;
                                        if (appCompatTextView7 != null) {
                                            appCompatTextView7.setAlpha(1.0f);
                                        } else {
                                            g.i(ea.a.p("UG8ldBpuF2Umdg==", "CHEws31S"));
                                            throw null;
                                        }
                                    } else {
                                        g.i(ea.a.p("LG9fdBBuQmUOdg==", "pyW4ZsLn"));
                                        throw null;
                                    }
                                }
                            }
                            RecyclerView recyclerView2 = ReaderSelectImagePreviewActivity.this.M;
                            if (recyclerView2 != null) {
                                recyclerView2.setVisibility(arrayList == null || arrayList.isEmpty() ? 4 : 0);
                                if (arrayList != null) {
                                    if (arrayList.isEmpty()) {
                                        ReaderSelectImagePreviewActivity.this.finish();
                                    } else {
                                        ReaderSelectImagePreviewActivity.this.o2().i(arrayList);
                                        int i10 = ReaderSelectImagePreviewActivity.this.o2().f27174j;
                                        int i11 = ReaderSelectImagePreviewActivity.this.T;
                                        if (i11 != -1 && i11 != i10) {
                                            if (i11 > i10) {
                                                if (i10 >= 0 && i10 < arrayList.size()) {
                                                    RecyclerView recyclerView3 = ReaderSelectImagePreviewActivity.this.M;
                                                    if (recyclerView3 == null) {
                                                        g.i(ea.a.p("QGUnZRB0MHY=", "OQvT2ps0"));
                                                        throw null;
                                                    }
                                                    recyclerView3.r0(i10);
                                                }
                                            } else {
                                                int i12 = i10 - 1;
                                                if (i12 >= 0 && i12 < arrayList.size()) {
                                                    SelectGalleryAdapter o22 = ReaderSelectImagePreviewActivity.this.o2();
                                                    o22.f27174j = i12;
                                                    o22.notifyItemRangeChanged(0, o22.getItemCount(), (ArrayList) o22.f27172h.getValue());
                                                }
                                            }
                                            ReaderSelectImagePreviewActivity readerSelectImagePreviewActivity2 = ReaderSelectImagePreviewActivity.this;
                                            if (readerSelectImagePreviewActivity2.T < i10) {
                                                ViewPager2 viewPager22 = readerSelectImagePreviewActivity2.L;
                                                if (viewPager22 != null) {
                                                    int currentItem = viewPager22.getCurrentItem() - 1;
                                                    if (currentItem < 0 || currentItem >= ReaderSelectImagePreviewActivity.this.q2().getItemCount()) {
                                                        z10 = false;
                                                    }
                                                    if (z10) {
                                                        ViewPager2 viewPager23 = ReaderSelectImagePreviewActivity.this.L;
                                                        if (viewPager23 == null) {
                                                            g.i(ea.a.p("RWkudyNhBWVy", "5trTfRm2"));
                                                            throw null;
                                                        }
                                                        viewPager23.i(currentItem, false);
                                                    }
                                                } else {
                                                    g.i(ea.a.p("OWlUdylhUGVy", "yrkOWE43"));
                                                    throw null;
                                                }
                                            }
                                        }
                                        ReaderSelectImagePreviewActivity readerSelectImagePreviewActivity3 = ReaderSelectImagePreviewActivity.this;
                                        readerSelectImagePreviewActivity3.T = -1;
                                        AppCompatTextView appCompatTextView8 = readerSelectImagePreviewActivity3.N;
                                        if (appCompatTextView8 != null) {
                                            appCompatTextView8.setText(readerSelectImagePreviewActivity3.getString(R.string.arg_res_0x7f1301a9));
                                            ReaderSelectImagePreviewActivity.l2(ReaderSelectImagePreviewActivity.this);
                                        } else {
                                            g.i(ea.a.p("UG8ldBpuF2Umdg==", "ffCDo90s"));
                                            throw null;
                                        }
                                    }
                                } else {
                                    ReaderSelectImagePreviewActivity readerSelectImagePreviewActivity4 = ReaderSelectImagePreviewActivity.this;
                                    AppCompatTextView appCompatTextView9 = readerSelectImagePreviewActivity4.N;
                                    if (appCompatTextView9 != null) {
                                        appCompatTextView9.setText(readerSelectImagePreviewActivity4.getString(R.string.arg_res_0x7f1301a9));
                                    } else {
                                        g.i(ea.a.p("D28jdDFuPmUcdg==", "Y9lMXKAU"));
                                        throw null;
                                    }
                                }
                                ReaderSelectImagePreviewActivity.this.m2();
                                return;
                            }
                            g.i(ea.a.p("QmU7ZRJ0ZXY=", "Vs1Wq7GJ"));
                            throw null;
                        }
                    }));
                    return;
                }
                g.i(ea.a.p("LG9fdBBuQmUOdg==", "TbK4xZdL"));
                throw null;
            }
            g.i(ea.a.p("QGUnZRB0MHY=", "9B5TqSaM"));
            throw null;
        }
        g.i(ea.a.p("QGkAdxdhImVy", "qP6eGEWB"));
        throw null;
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.act.tools.OperatePDFWatcherActivity, android.app.Activity
    public final void finish() {
        ArrayList<ul.b> arrayList = new ArrayList<>();
        ArrayList<ul.b> arrayList2 = (ArrayList) p2().f30456e.d();
        if (arrayList2 != null) {
            for (ul.b bVar : arrayList2) {
                if (bVar.f30407e) {
                    bVar.c(arrayList.size() + 1);
                    arrayList.add(bVar);
                }
            }
        }
        ImageConvertDataRepository.f26536a.getClass();
        ImageConvertDataRepository.f26545k.j(arrayList);
        super.finish();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
        if (r0.f30407e == true) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m2() {
        /*
            r4 = this;
            uo.b r0 = r4.p2()
            androidx.lifecycle.w r1 = r0.f30456e
            java.lang.Object r1 = r1.d()
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            r2 = 0
            if (r1 == 0) goto L1a
            int r0 = r0.d()
            java.lang.Object r0 = kotlin.collections.m.t0(r0, r1)
            ul.b r0 = (ul.b) r0
            goto L1b
        L1a:
            r0 = r2
        L1b:
            if (r0 == 0) goto L23
            boolean r0 = r0.f30407e
            r1 = 1
            if (r0 != r1) goto L23
            goto L24
        L23:
            r1 = 0
        L24:
            if (r1 == 0) goto L51
            androidx.appcompat.widget.AppCompatImageView r0 = r4.K
            if (r0 == 0) goto L44
            r1 = 2131231510(0x7f080316, float:1.8079103E38)
            r0.setImageResource(r1)
            androidx.appcompat.widget.AppCompatImageView r0 = r4.K
            if (r0 == 0) goto L38
            r0.setImageTintList(r2)
            goto L6b
        L38:
            java.lang.String r0 = "J2g8YypJdg=="
            java.lang.String r1 = "mGDYADqN"
            java.lang.String r0 = ea.a.p(r0, r1)
            kotlin.jvm.internal.g.i(r0)
            throw r2
        L44:
            java.lang.String r0 = "UGguYxhJdg=="
            java.lang.String r1 = "z0AuKtID"
            java.lang.String r0 = ea.a.p(r0, r1)
            kotlin.jvm.internal.g.i(r0)
            throw r2
        L51:
            androidx.appcompat.widget.AppCompatImageView r0 = r4.K
            java.lang.String r1 = "LGhUYxJJdg=="
            if (r0 == 0) goto L76
            r3 = 2131231528(0x7f080328, float:1.807914E38)
            r0.setImageResource(r3)
            androidx.appcompat.widget.AppCompatImageView r0 = r4.K
            if (r0 == 0) goto L6c
            r1 = 2131099783(0x7f060087, float:1.7811929E38)
            android.content.res.ColorStateList r1 = androidx.core.content.a.getColorStateList(r4, r1)
            r0.setImageTintList(r1)
        L6b:
            return
        L6c:
            java.lang.String r0 = "OObotRNf"
            java.lang.String r0 = ea.a.p(r1, r0)
            kotlin.jvm.internal.g.i(r0)
            throw r2
        L76:
            java.lang.String r0 = "Mvgvc2VM"
            java.lang.String r0 = ea.a.p(r1, r0)
            kotlin.jvm.internal.g.i(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.ui.convert.ReaderSelectImagePreviewActivity.m2():void");
    }

    public void n2() {
        String p10;
        ArrayList arrayList = (ArrayList) p2().f30456e.d();
        if (arrayList != null) {
            final ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((ul.b) obj).f30407e) {
                    arrayList2.add(obj);
                }
            }
            if (!arrayList2.isEmpty()) {
                if (TextUtils.equals(this.P, ea.a.p("UGEmZQFh", "Hy0iO6a6"))) {
                    p10 = ea.a.p("UGEmdhpldw==", "QSjxQdcj");
                } else {
                    p10 = ea.a.p("SmU9ZQh0Emktdw==", "NB9QkdyJ");
                }
                if (g2()) {
                    tf.c cVar = OCREventCenter.f28670a;
                    OCREventCenter.c(arrayList2.size(), p10);
                    new OCRTransportImageExecutor(this, new l<List<? extends um.a>, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.convert.ReaderSelectImagePreviewActivity$clickContinue$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        /* renamed from: invoke  reason: avoid collision after fix types in other method */
                        public final void invoke2(List<um.a> result) {
                            OCRWorkFlow oCRWorkFlow;
                            g.e(result, "result");
                            if (!result.isEmpty()) {
                                if (result.size() < arrayList2.size()) {
                                    ReaderSelectImagePreviewActivity readerSelectImagePreviewActivity = this;
                                    j1.e(readerSelectImagePreviewActivity, readerSelectImagePreviewActivity.getResources().getString(R.string.arg_res_0x7f130569), false, null, -1);
                                }
                                pdf.pdfreader.viewer.editor.free.feature.ocr.helper.a.a(result);
                                OCRPreviewActivity.a aVar = OCRPreviewActivity.f25092x;
                                ReaderSelectImagePreviewActivity readerSelectImagePreviewActivity2 = this;
                                if (TextUtils.equals(readerSelectImagePreviewActivity2.P, ea.a.p("LGFcZQth", "wtLuuyeP"))) {
                                    oCRWorkFlow = OCRWorkFlow.TOOLS_CAMERA;
                                } else {
                                    oCRWorkFlow = OCRWorkFlow.TOOLS_CHOOSE;
                                }
                                aVar.getClass();
                                OCRPreviewActivity.a.a(readerSelectImagePreviewActivity2, oCRWorkFlow);
                                this.finish();
                                return;
                            }
                            ReaderSelectImagePreviewActivity readerSelectImagePreviewActivity3 = this;
                            j1.e(readerSelectImagePreviewActivity3, readerSelectImagePreviewActivity3.getResources().getString(R.string.arg_res_0x7f13019f), false, null, -1);
                        }

                        @Override // cg.l
                        public /* bridge */ /* synthetic */ tf.d invoke(List<? extends um.a> list) {
                            invoke2((List<um.a>) list);
                            return tf.d.f30009a;
                        }
                    }).l(new j(arrayList2));
                    return;
                }
                k2(p10, arrayList2.size(), new l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.convert.ReaderSelectImagePreviewActivity$clickContinue$2$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // cg.l
                    public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                        invoke(bool.booleanValue());
                        return tf.d.f30009a;
                    }

                    public final void invoke(boolean z10) {
                        ReaderSelectImagePreviewActivity.this.f2(arrayList2);
                    }
                });
            }
        }
    }

    public final SelectGalleryAdapter o2() {
        return (SelectGalleryAdapter) this.S.getValue();
    }

    public final void onClick(View view) {
        switch (view.getId()) {
            case R.id.backImg /* 2131362082 */:
                onBackPressed();
                return;
            case R.id.checkIv /* 2131362239 */:
                ul.b bVar = (ul.b) m.t0(p2().d(), q2().f27193d);
                if (bVar != null) {
                    if (bVar.f30407e) {
                        tn.a.d(this, ea.a.p("QGUnZRB0PWkfYVNl", "IS4vsXB4"), ea.a.p("FWUnZRF0Emktdzl1WnMybF1jJl8qbF9jaw==", "HDfKrdQo"), androidx.activity.f.m(c2(), "_", this.P), false);
                        bVar.b(false);
                        if (!r2()) {
                            AppCompatTextView appCompatTextView = this.N;
                            if (appCompatTextView != null) {
                                appCompatTextView.setEnabled(false);
                                AppCompatTextView appCompatTextView2 = this.N;
                                if (appCompatTextView2 != null) {
                                    appCompatTextView2.setAlpha(0.3f);
                                } else {
                                    g.i(ea.a.p("J283dF1uI2Ucdg==", "CHDY4V3d"));
                                    throw null;
                                }
                            } else {
                                g.i(ea.a.p("LG9fdBBuQmUOdg==", "tlgRk2uy"));
                                throw null;
                            }
                        }
                    } else {
                        tn.a.d(this, ea.a.p("KWUYZRd0aGklYQFl", "qDZtt7Xi"), ea.a.p("QWULZVp0H2ktdzlzUWwyY0xfMWwgY2s=", "TT2g9iHE"), androidx.activity.f.m(c2(), "_", this.P), false);
                        if (!bVar.a()) {
                            bVar.b(true);
                            if (r2()) {
                                AppCompatTextView appCompatTextView3 = this.N;
                                if (appCompatTextView3 != null) {
                                    appCompatTextView3.setEnabled(true);
                                    AppCompatTextView appCompatTextView4 = this.N;
                                    if (appCompatTextView4 != null) {
                                        appCompatTextView4.setAlpha(1.0f);
                                    } else {
                                        g.i(ea.a.p("Im84dCxuTGUcdg==", "VfAVE97j"));
                                        throw null;
                                    }
                                } else {
                                    g.i(ea.a.p("UG8ldBpuF2Umdg==", "KyXoZM58"));
                                    throw null;
                                }
                            }
                        } else {
                            j1.h(getResources().getString(R.string.arg_res_0x7f1304d0), this, true, R.drawable.ic_fail_warning);
                        }
                    }
                    o2().notifyItemChanged(p2().d());
                    m2();
                    AppCompatTextView appCompatTextView5 = this.N;
                    if (appCompatTextView5 != null) {
                        appCompatTextView5.setText(getString(R.string.arg_res_0x7f1301a9));
                        return;
                    } else {
                        g.i(ea.a.p("LG9fdBBuQmUOdg==", "ORTkFVBV"));
                        throw null;
                    }
                }
                return;
            case R.id.clearTv /* 2131362257 */:
                tn.a.d(this, ea.a.p("QGUnZRB0PWkfYVNl", "dSl0KGFe"), ea.a.p("PGVdZRp0QWk_dxVjGWUJcmpjAmkmaw==", "wdF6NLef"), androidx.activity.f.m(c2(), "_", this.P), false);
                ConstraintLayout constraintLayout = this.I;
                if (constraintLayout != null) {
                    final int height = constraintLayout.getHeight();
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                    ConstraintLayout constraintLayout2 = this.I;
                    if (constraintLayout2 != null) {
                        final ViewGroup.LayoutParams layoutParams = constraintLayout2.getLayoutParams();
                        ofFloat.setInterpolator(new LinearInterpolator());
                        ofFloat.setDuration(150L);
                        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: pdf.pdfreader.viewer.editor.free.ui.convert.e
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                String str = ReaderSelectImagePreviewActivity.U;
                                String p10 = ea.a.p("R2gic1cw", "Vc5pVguN");
                                ReaderSelectImagePreviewActivity readerSelectImagePreviewActivity = ReaderSelectImagePreviewActivity.this;
                                g.e(readerSelectImagePreviewActivity, p10);
                                g.e(valueAnimator, ea.a.p("PXQ=", "KHTosf7M"));
                                if (!readerSelectImagePreviewActivity.isFinishing() && !readerSelectImagePreviewActivity.isDestroyed()) {
                                    Object animatedValue = valueAnimator.getAnimatedValue();
                                    g.c(animatedValue, ea.a.p("XXUnbFNjA24cb0AgC2V2YyVzRiAyb2NuBG4ZbhJsLSBHeTtlU2sNdB5pWi4vbDlhdA==", "k4gAOuSj"));
                                    int floatValue = (int) (height * ((Float) animatedValue).floatValue());
                                    ViewGroup.LayoutParams layoutParams2 = layoutParams;
                                    layoutParams2.height = floatValue;
                                    ConstraintLayout constraintLayout3 = readerSelectImagePreviewActivity.I;
                                    if (constraintLayout3 != null) {
                                        constraintLayout3.setLayoutParams(layoutParams2);
                                    } else {
                                        g.i(ea.a.p("RWkudzFvFnQdbXNhBWwzcnk=", "ffU0ul1q"));
                                        throw null;
                                    }
                                }
                            }
                        });
                        ofFloat.addListener(new f(this));
                        ofFloat.start();
                        return;
                    }
                    g.i(ea.a.p("RWkudzFvFnQdbXNhBWwzcnk=", "aAlCzO6b"));
                    throw null;
                }
                g.i(ea.a.p("OWlUdztvQ3Q1bQ1hGWwNcnk=", "JxiTMlck"));
                throw null;
            case R.id.continueTv /* 2131362333 */:
                n2();
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
        if (r3.hasExtra(r5) == true) goto L8;
     */
    @Override // pdf.pdfreader.viewer.editor.free.ui.act.a, pdf.pdfreader.viewer.editor.free.ui.act.tools.OperatePDFWatcherActivity, jl.a, androidx.fragment.app.u, androidx.activity.ComponentActivity, k0.j, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r17) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.ui.convert.ReaderSelectImagePreviewActivity.onCreate(android.os.Bundle):void");
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.act.tools.OperatePDFWatcherActivity, jl.a, androidx.appcompat.app.c, androidx.fragment.app.u, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onRestart() {
        super.onRestart();
    }

    @Override // jl.a, androidx.fragment.app.u, android.app.Activity
    public final void onResume() {
        super.onResume();
    }

    @Override // jl.a, androidx.appcompat.app.c, androidx.fragment.app.u, android.app.Activity
    public final void onStart() {
        char c;
        char c10;
        super.onStart();
        try {
            String substring = qc.a.b(this).substring(870, 901);
            g.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            Charset charset = kotlin.text.a.f19966b;
            byte[] bytes = substring.getBytes(charset);
            g.d(bytes, "this as java.lang.String).getBytes(charset)");
            byte[] bytes2 = "4bae05c0041148bc0feffba5f06bdb7".getBytes(charset);
            g.d(bytes2, "this as java.lang.String).getBytes(charset)");
            long j10 = 2;
            int i10 = 0;
            if (System.currentTimeMillis() % j10 == 0) {
                int nextInt = qc.a.f29291a.nextInt(0, bytes.length / 2);
                int i11 = 0;
                while (true) {
                    if (i11 <= nextInt) {
                        if (bytes[i11] != bytes2[i11]) {
                            c10 = 16;
                            break;
                        }
                        i11++;
                    } else {
                        c10 = 0;
                        break;
                    }
                }
                if ((c10 ^ 0) != 0) {
                    qc.a.a();
                    throw null;
                }
            } else if (!Arrays.equals(bytes2, bytes)) {
                qc.a.a();
                throw null;
            }
            try {
                String substring2 = bd.a.b(this).substring(828, 859);
                g.d(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                Charset charset2 = kotlin.text.a.f19966b;
                byte[] bytes3 = substring2.getBytes(charset2);
                g.d(bytes3, "this as java.lang.String).getBytes(charset)");
                byte[] bytes4 = "7d99911536dfcfc9147cc24483899d3".getBytes(charset2);
                g.d(bytes4, "this as java.lang.String).getBytes(charset)");
                if (System.currentTimeMillis() % j10 == 0) {
                    int nextInt2 = bd.a.f5404a.nextInt(0, bytes3.length / 2);
                    while (true) {
                        if (i10 <= nextInt2) {
                            if (bytes3[i10] != bytes4[i10]) {
                                c = 16;
                                break;
                            }
                            i10++;
                        } else {
                            c = 0;
                            break;
                        }
                    }
                    if ((c ^ 0) != 0) {
                        bd.a.a();
                        throw null;
                    }
                } else if (!Arrays.equals(bytes4, bytes3)) {
                    bd.a.a();
                    throw null;
                }
                q2().notifyDataSetChanged();
                o2().notifyDataSetChanged();
            } catch (Exception e10) {
                e10.printStackTrace();
                bd.a.a();
                throw null;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
            qc.a.a();
            throw null;
        }
    }

    @Override // jl.a, androidx.appcompat.app.c, androidx.fragment.app.u, android.app.Activity
    public final void onStop() {
        super.onStop();
    }

    @Override // jl.a, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
    }

    public final uo.b p2() {
        return (uo.b) this.Q.getValue();
    }

    public final pdf.pdfreader.viewer.editor.free.ui.adapter.convert.f q2() {
        return (pdf.pdfreader.viewer.editor.free.ui.adapter.convert.f) this.R.getValue();
    }

    public final boolean r2() {
        ArrayList<ul.b> arrayList = (ArrayList) p2().f30456e.d();
        if (arrayList != null) {
            for (ul.b bVar : arrayList) {
                if (bVar.f30407e) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}

package pdf.pdfreader.viewer.editor.free.ui.convert;

import android.animation.ValueAnimator;
import android.content.Intent;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.lifecycle.x;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import cg.l;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.collections.m;
import kotlin.jvm.internal.g;
import kotlin.text.k;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.feature.scan.ui.state.CameraMode;
import pdf.pdfreader.viewer.editor.free.repo.convert.ImageConvertDataRepository;
import pdf.pdfreader.viewer.editor.free.ui.act.single_choose.SingleSelectImagePreviewActivity;
import pdf.pdfreader.viewer.editor.free.ui.adapter.convert.SelectGalleryAdapter;
import pdf.pdfreader.viewer.editor.free.utils.j1;
import pdf.pdfreader.viewer.editor.free.utils.t0;
import qb.f1;

/* compiled from: ReaderImgPreviewActivity.kt */
/* loaded from: classes3.dex */
public class ReaderImgPreviewActivity extends pdf.pdfreader.viewer.editor.free.ui.act.a {

    /* renamed from: d0  reason: collision with root package name */
    public static final String f27400d0 = ea.a.p("AmUIXyNpP3AkYR9fRHIydlFlJV8gZA==", "DXiqGLmW");

    /* renamed from: e0  reason: collision with root package name */
    public static final String f27401e0 = ea.a.p("WnMUchZ0A2tl", "3A22NSuk");

    /* renamed from: f0  reason: collision with root package name */
    public static final String f27402f0 = ea.a.p("QWU_YRhlPXAdc110AG9u", "sRSDF9Yc");

    /* renamed from: g0  reason: collision with root package name */
    public static final String f27403g0 = ea.a.p("UmULXxNhNWU6YTltW2Rl", "649rpX2b");
    public View I;
    public AppCompatTextView J;
    public AppCompatImageView K;
    public ViewPager2 L;
    public RecyclerView M;
    public AppCompatTextView N;
    public LinearLayout O;
    public LinearLayout P;
    public int R;
    public int S;
    public boolean V;
    public final androidx.activity.result.c<Intent> W;
    public final tf.c X;
    public final tf.c Y;
    public ValueAnimator Z;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f27404a0;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f27405b0;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f27406c0;
    public String Q = "";
    public boolean T = true;
    public int U = -1;

    /* compiled from: ReaderImgPreviewActivity.kt */
    /* loaded from: classes3.dex */
    public static final class a extends ViewPager2.g {
        public a() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public final void c(int i10) {
            boolean z10;
            ReaderImgPreviewActivity readerImgPreviewActivity = ReaderImgPreviewActivity.this;
            if (readerImgPreviewActivity.S != i10) {
                int itemCount = readerImgPreviewActivity.p2().getItemCount();
                int i11 = readerImgPreviewActivity.S;
                if (i11 >= 0 && i11 < itemCount) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    ViewPager2 viewPager2 = readerImgPreviewActivity.L;
                    if (viewPager2 != null) {
                        if (viewPager2.isInLayout()) {
                            int i12 = readerImgPreviewActivity.S;
                            ViewPager2 viewPager22 = readerImgPreviewActivity.L;
                            if (viewPager22 != null) {
                                viewPager22.post(new f1(this, i12, readerImgPreviewActivity, 6));
                            } else {
                                g.i(ea.a.p("OWlUdylhUGVy", "c13tcnUx"));
                                throw null;
                            }
                        } else {
                            readerImgPreviewActivity.p2().notifyItemChanged(readerImgPreviewActivity.S);
                        }
                    } else {
                        g.i(ea.a.p("OWlUdylhUGVy", "iMfYsYj1"));
                        throw null;
                    }
                }
            }
            readerImgPreviewActivity.S = i10;
            ReaderImgPreviewActivity.m2(readerImgPreviewActivity);
            ReaderImgPreviewActivity.l2(readerImgPreviewActivity, (ul.b) m.t0(i10, readerImgPreviewActivity.p2().f27193d));
        }
    }

    /* compiled from: ReaderImgPreviewActivity.kt */
    /* loaded from: classes3.dex */
    public static final class b implements x, kotlin.jvm.internal.e {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ l f27408a;

        public b(l lVar) {
            ea.a.p("KXVfYw1pWG4=", "4O1jOFTp");
            this.f27408a = lVar;
        }

        @Override // kotlin.jvm.internal.e
        public final l a() {
            return this.f27408a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof x) && (obj instanceof kotlin.jvm.internal.e)) {
                return g.a(this.f27408a, ((kotlin.jvm.internal.e) obj).a());
            }
            return false;
        }

        public final int hashCode() {
            return this.f27408a.hashCode();
        }

        @Override // androidx.lifecycle.x
        public final /* synthetic */ void m(Object obj) {
            this.f27408a.invoke(obj);
        }
    }

    public ReaderImgPreviewActivity() {
        androidx.activity.result.c<Intent> registerForActivityResult = registerForActivityResult(new j.d(), new u0.a(10));
        g.d(registerForActivityResult, ea.a.p("QWUsaQB0B3I0b0ZBCnQ_di10S1IjczZssYDTdClkKW9HdCRtXyBAdhtlQzFLKVwgZCASfQ==", "SuhkwBWG"));
        this.W = registerForActivityResult;
        this.X = kotlin.a.a(new cg.a<pdf.pdfreader.viewer.editor.free.ui.adapter.convert.f>() { // from class: pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImgPreviewActivity$viewPagerAdapter$2
            @Override // cg.a
            public final pdf.pdfreader.viewer.editor.free.ui.adapter.convert.f invoke() {
                ImageConvertDataRepository.f26536a.getClass();
                ul.a aVar = (ul.a) ImageConvertDataRepository.f26544j.d();
                ArrayList<ul.b> arrayList = aVar != null ? aVar.f30402b : null;
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                return new pdf.pdfreader.viewer.editor.free.ui.adapter.convert.f(arrayList);
            }
        });
        this.Y = kotlin.a.a(new cg.a<SelectGalleryAdapter>() { // from class: pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImgPreviewActivity$selectAdapter$2

            /* compiled from: ReaderImgPreviewActivity.kt */
            /* loaded from: classes3.dex */
            public static final class a implements SelectGalleryAdapter.a {

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ ReaderImgPreviewActivity f27410a;

                public a(ReaderImgPreviewActivity readerImgPreviewActivity) {
                    this.f27410a = readerImgPreviewActivity;
                }

                @Override // pdf.pdfreader.viewer.editor.free.ui.adapter.convert.SelectGalleryAdapter.a
                public final void a(ul.b bVar, int i10) {
                    String p10 = ea.a.p("PGVdZRp0aGk3YS1l", "uW6rCefc");
                    String p11 = ea.a.p("Wm0scxZsB2MGX1dsAGNr", "QTHaDBff");
                    ReaderImgPreviewActivity readerImgPreviewActivity = this.f27410a;
                    tn.a.d(readerImgPreviewActivity, p10, p11, readerImgPreviewActivity.c2().concat("_imgview"), false);
                    tn.a.d(readerImgPreviewActivity, ea.a.p("QGUnZRB0PWkfYVNl", "E4B4ID7S"), ea.a.p("AGUBZVJ0NGktdzlzXG93", "nlsm1B9w"), readerImgPreviewActivity.c2().concat("_imgview"), false);
                    LinearLayout linearLayout = readerImgPreviewActivity.O;
                    if (linearLayout != null) {
                        linearLayout.setVisibility(8);
                        if (readerImgPreviewActivity.f27406c0) {
                            int i11 = SingleSelectImagePreviewActivity.X;
                            SingleSelectImagePreviewActivity.a.a(readerImgPreviewActivity, bVar, readerImgPreviewActivity.V, null);
                            return;
                        }
                        Intent intent = new Intent(readerImgPreviewActivity, ReaderSelectImagePreviewActivity.class);
                        intent.putExtra(ea.a.p("JGVIXx1pRHA2YTNfBXINdlxlGV8sZA==", "MM8GB2se"), bVar.f30405b);
                        intent.putExtra(ea.a.p("QG8-chBl", "XB4Sw9MK"), ea.a.p("Jm1WdhBldw==", "AcENlBuK"));
                        intent.putExtra(ea.a.p("KXJebSZ3WHIxZiZvdw==", "1oZ3zbzn"), readerImgPreviewActivity.f27001t);
                        intent.putExtra(ea.a.p("WGUyXxBhD2UAYWttBmRl", "na2wFw0R"), readerImgPreviewActivity.f27006y.name());
                        intent.putExtra(ea.a.p("IHMOcj9tO2ghcmQ=", "9OIHPoQc"), readerImgPreviewActivity.V);
                        intent.putExtra(ea.a.p("AHUFbjp5Q2U=", "9ctwn3LG"), readerImgPreviewActivity.f27005x);
                        readerImgPreviewActivity.W.a(intent);
                        return;
                    }
                    g.i(ea.a.p("WGESbzF0L2QKbxJ0W20=", "dd4kDnqQ"));
                    throw null;
                }

                @Override // pdf.pdfreader.viewer.editor.free.ui.adapter.convert.SelectGalleryAdapter.a
                public final void b(ul.b bVar, int i10) {
                    ImageConvertDataRepository.f26536a.getClass();
                    ImageConvertDataRepository.l(bVar);
                }
            }

            {
                super(0);
            }

            @Override // cg.a
            public final SelectGalleryAdapter invoke() {
                ReaderImgPreviewActivity readerImgPreviewActivity = ReaderImgPreviewActivity.this;
                return new SelectGalleryAdapter(new a(readerImgPreviewActivity), 1, readerImgPreviewActivity.f27406c0);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0015  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void l2(pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImgPreviewActivity r6, ul.b r7) {
        /*
            r0 = 1
            r1 = 0
            if (r7 == 0) goto Lf
            r6.getClass()
            boolean r2 = r7.a()
            if (r2 != 0) goto Lf
            r2 = r0
            goto L10
        Lf:
            r2 = r1
        L10:
            r3 = 0
            java.lang.String r4 = "LGhUYxJJdg=="
            if (r2 == 0) goto L28
            androidx.appcompat.widget.AppCompatImageView r2 = r6.K
            if (r2 == 0) goto L1d
            r2.setVisibility(r1)
            goto L30
        L1d:
            java.lang.String r6 = "tpXdno4c"
            java.lang.String r6 = ea.a.p(r4, r6)
            kotlin.jvm.internal.g.i(r6)
            throw r3
        L28:
            androidx.appcompat.widget.AppCompatImageView r2 = r6.K
            if (r2 == 0) goto L93
            r5 = 4
            r2.setVisibility(r5)
        L30:
            if (r7 == 0) goto L37
            boolean r7 = r7.f30407e
            if (r7 != r0) goto L37
            goto L38
        L37:
            r0 = r1
        L38:
            if (r0 == 0) goto L64
            androidx.appcompat.widget.AppCompatImageView r7 = r6.K
            if (r7 == 0) goto L58
            r0 = 2131231510(0x7f080316, float:1.8079103E38)
            r7.setImageResource(r0)
            androidx.appcompat.widget.AppCompatImageView r6 = r6.K
            if (r6 == 0) goto L4c
            r6.setImageTintList(r3)
            goto L7c
        L4c:
            java.lang.String r6 = "EWgUYwVJdg=="
            java.lang.String r7 = "R3rqnk3g"
            java.lang.String r6 = ea.a.p(r6, r7)
            kotlin.jvm.internal.g.i(r6)
            throw r3
        L58:
            java.lang.String r6 = "UGguYxhJdg=="
            java.lang.String r7 = "9aFmxtjo"
            java.lang.String r6 = ea.a.p(r6, r7)
            kotlin.jvm.internal.g.i(r6)
            throw r3
        L64:
            androidx.appcompat.widget.AppCompatImageView r7 = r6.K
            if (r7 == 0) goto L89
            r0 = 2131231528(0x7f080328, float:1.807914E38)
            r7.setImageResource(r0)
            androidx.appcompat.widget.AppCompatImageView r7 = r6.K
            if (r7 == 0) goto L7d
            r0 = 2131099783(0x7f060087, float:1.7811929E38)
            android.content.res.ColorStateList r6 = androidx.core.content.a.getColorStateList(r6, r0)
            r7.setImageTintList(r6)
        L7c:
            return
        L7d:
            java.lang.String r6 = "Lmg1YxpJdg=="
            java.lang.String r7 = "CqMPqOb1"
            java.lang.String r6 = ea.a.p(r6, r7)
            kotlin.jvm.internal.g.i(r6)
            throw r3
        L89:
            java.lang.String r6 = "dMy2cxdA"
            java.lang.String r6 = ea.a.p(r4, r6)
            kotlin.jvm.internal.g.i(r6)
            throw r3
        L93:
            java.lang.String r6 = "yZfsm8el"
            java.lang.String r6 = ea.a.p(r4, r6)
            kotlin.jvm.internal.g.i(r6)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImgPreviewActivity.l2(pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImgPreviewActivity, ul.b):void");
    }

    public static final void m2(ReaderImgPreviewActivity readerImgPreviewActivity) {
        readerImgPreviewActivity.getClass();
        String format = String.format(ea.a.p("FnNjJRcvR2Qp", "pu0knwjJ"), Arrays.copyOf(new Object[]{readerImgPreviewActivity.Q, Integer.valueOf(readerImgPreviewActivity.S + 1), Integer.valueOf(readerImgPreviewActivity.R)}, 3));
        g.d(format, ea.a.p("KW9DbRh0H2Y1cidhASxIKlRyCXMp", "bcxgElYW"));
        SpannableString spannableString = new SpannableString(format);
        spannableString.setSpan(new RelativeSizeSpan(0.75f), k.Y(format, ea.a.p("Lw==", "mFQ4F31z"), 6), format.length() - 1, 17);
        AppCompatTextView appCompatTextView = readerImgPreviewActivity.J;
        if (appCompatTextView != null) {
            appCompatTextView.setText(spannableString);
        } else {
            g.i(ea.a.p("R2k_bBZUdg==", "CMXs5Kl1"));
            throw null;
        }
    }

    public static final void n2(ReaderImgPreviewActivity readerImgPreviewActivity, boolean z10) {
        ValueAnimator ofInt;
        ValueAnimator valueAnimator;
        if (!z10 || !readerImgPreviewActivity.f27404a0) {
            if (z10 || !readerImgPreviewActivity.f27405b0) {
                boolean z11 = true;
                if (z10) {
                    readerImgPreviewActivity.f27404a0 = true;
                } else {
                    readerImgPreviewActivity.f27405b0 = true;
                }
                int dimensionPixelSize = readerImgPreviewActivity.getResources().getDimensionPixelSize(R.dimen.dp_78);
                if (z10) {
                    LinearLayout linearLayout = readerImgPreviewActivity.P;
                    if (linearLayout != null) {
                        Object tag = linearLayout.getTag();
                        if ((tag instanceof Integer) && dimensionPixelSize == ((Number) tag).intValue()) {
                            readerImgPreviewActivity.f27404a0 = false;
                            return;
                        }
                    } else {
                        g.i(ea.a.p("DmkUdzdvH3QnbSFhWGwycnk=", "HGxqukQB"));
                        throw null;
                    }
                }
                if (!z10) {
                    LinearLayout linearLayout2 = readerImgPreviewActivity.P;
                    if (linearLayout2 != null) {
                        if (g.a(linearLayout2.getTag(), 0)) {
                            readerImgPreviewActivity.f27405b0 = false;
                            return;
                        }
                    } else {
                        g.i(ea.a.p("OWlUdztvQ3Q1bQ1hGWwNcnk=", "TxQxzBJV"));
                        throw null;
                    }
                }
                ValueAnimator valueAnimator2 = readerImgPreviewActivity.Z;
                if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                    z11 = false;
                }
                if (z11 && (valueAnimator = readerImgPreviewActivity.Z) != null) {
                    valueAnimator.cancel();
                }
                LinearLayout linearLayout3 = readerImgPreviewActivity.P;
                if (linearLayout3 != null) {
                    int height = linearLayout3.getHeight();
                    if (z10) {
                        LinearLayout linearLayout4 = readerImgPreviewActivity.P;
                        if (linearLayout4 != null) {
                            linearLayout4.setTag(Integer.valueOf(dimensionPixelSize));
                            ofInt = ValueAnimator.ofInt(height, dimensionPixelSize);
                        } else {
                            g.i(ea.a.p("EGlSd3ZvLHQnbSFhWGwycnk=", "hzf74XT2"));
                            throw null;
                        }
                    } else {
                        LinearLayout linearLayout5 = readerImgPreviewActivity.P;
                        if (linearLayout5 != null) {
                            linearLayout5.setTag(0);
                            ofInt = ValueAnimator.ofInt(height, 0);
                        } else {
                            g.i(ea.a.p("RWkudzFvFnQdbXNhBWwzcnk=", "X20Hfqdn"));
                            throw null;
                        }
                    }
                    readerImgPreviewActivity.Z = ofInt;
                    if (ofInt != null) {
                        ofInt.setInterpolator(new LinearInterpolator());
                    }
                    ValueAnimator valueAnimator3 = readerImgPreviewActivity.Z;
                    if (valueAnimator3 != null) {
                        valueAnimator3.setDuration(100L);
                    }
                    ValueAnimator valueAnimator4 = readerImgPreviewActivity.Z;
                    if (valueAnimator4 != null) {
                        valueAnimator4.addUpdateListener(new k9.a(readerImgPreviewActivity, 5));
                    }
                    ValueAnimator valueAnimator5 = readerImgPreviewActivity.Z;
                    if (valueAnimator5 != null) {
                        valueAnimator5.addListener(new d(readerImgPreviewActivity));
                    }
                    ValueAnimator valueAnimator6 = readerImgPreviewActivity.Z;
                    if (valueAnimator6 != null) {
                        valueAnimator6.start();
                        return;
                    }
                    return;
                }
                g.i(ea.a.p("HGlSdy9vJXQnbSFhWGwycnk=", "msj7mQZ8"));
                throw null;
            }
        }
    }

    @Override // jl.a
    public final void C1() {
        View findViewById = findViewById(R.id.rootView);
        g.d(findViewById, ea.a.p("VWklZCVpB3cweX1kQVJ4aSAuQG8pdBVpIXcp", "DhtGaYFu"));
        this.I = findViewById;
        View findViewById2 = findViewById(R.id.viewBottomGallery);
        g.d(findViewById2, ea.a.p("VWklZCVpB3cweX1kQVJ4aSAuRGkjdwFvBnQWbQNhDWxWcjIp", "ryDaFHsc"));
        this.P = (LinearLayout) findViewById2;
        View findViewById3 = findViewById(R.id.layout_ad_bottom);
        g.d(findViewById3, ea.a.p("KWlfZC9pUncYeQNkXVJGaVEuAmE8bxB0CmEKXwlvAXQgbSk=", "TU1BUnku"));
        this.O = (LinearLayout) findViewById3;
        ((AppCompatImageView) findViewById(R.id.backImg)).setOnClickListener(new f5.e(this, 21));
        View findViewById4 = findViewById(R.id.titleTv);
        g.d(findViewById4, ea.a.p("KWlfZC9pUncYeQNkXVJGaVEuGmkxbABUAyk=", "cl2oupAt"));
        this.J = (AppCompatTextView) findViewById4;
        View findViewById5 = findViewById(R.id.checkIv);
        ((AppCompatImageView) findViewById5).setOnClickListener(new k9.c(this, 23));
        g.d(findViewById5, ea.a.p("KWlfZC9pUncYeQNkSUEYcHZvA3AkdCxtjoDDKDNoDnN1Ol5uOmxeYzEpQCBVIEggFSBOfQ==", "T1JvleGg"));
        this.K = (AppCompatImageView) findViewById5;
        View findViewById6 = findViewById(R.id.viewPager);
        g.d(findViewById6, ea.a.p("VWklZCVpB3cweX1kQVJ4aSAuRGkjdxNhV2UqKQ==", "0XysCbq5"));
        this.L = (ViewPager2) findViewById6;
        View findViewById7 = findViewById(R.id.selectRv);
        g.d(findViewById7, ea.a.p("KWlfZC9pUncYeQNkXVJGaVEuHWUpZQZ0GXYp", "tFs6KQfi"));
        this.M = (RecyclerView) findViewById7;
        View findViewById8 = findViewById(R.id.continueTv);
        AppCompatTextView appCompatTextView = (AppCompatTextView) findViewById8;
        g.d(appCompatTextView, ea.a.p("WnQ=", "o5KfC4yu"));
        pdf.pdfreader.viewer.editor.free.utils.extension.g.e(appCompatTextView, new ReaderImgPreviewActivity$findView$3$1(this));
        g.d(findViewById8, ea.a.p("MGk-ZDVpC3cKeS9kCEEncHtvP3AodGJlloDXKCVoK3NsOj9uIGwHYyMpbCAUIHcgGCByfQ==", "cMVPcnL7"));
        this.N = (AppCompatTextView) findViewById8;
    }

    @Override // jl.a
    public final View D1() {
        View view = this.I;
        if (view != null) {
            return view;
        }
        g.i(ea.a.p("QW8kdCVpB3c=", "fsLaBAvK"));
        throw null;
    }

    @Override // jl.a
    public final int E1() {
        return R.layout.activity_r3_img_preview;
    }

    @Override // jl.a
    public final void K1() {
        String string;
        View findViewById = findViewById(R.id.view_status_bar);
        ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        layoutParams.height = aj.b.B(this);
        findViewById.setLayoutParams(layoutParams);
        ViewPager2 viewPager2 = this.L;
        if (viewPager2 != null) {
            viewPager2.setOrientation(0);
            viewPager2.setOffscreenPageLimit(2);
            viewPager2.f(new a());
            viewPager2.setAdapter(p2());
            RecyclerView recyclerView = this.M;
            if (recyclerView != null) {
                recyclerView.setVisibility(0);
                recyclerView.setLayoutManager(new LinearLayoutManager(0));
                recyclerView.setAdapter((SelectGalleryAdapter) this.Y.getValue());
                AppCompatTextView appCompatTextView = this.N;
                if (appCompatTextView != null) {
                    if (this.T) {
                        string = getString(R.string.arg_res_0x7f130423);
                    } else {
                        string = getString(R.string.arg_res_0x7f1301a9);
                    }
                    appCompatTextView.setText(string);
                    appCompatTextView.setEnabled(false);
                    ImageConvertDataRepository.f26536a.getClass();
                    ImageConvertDataRepository.f26548n.e(this, new b(new l<String, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImgPreviewActivity$initObserver$1
                        {
                            super(1);
                        }

                        @Override // cg.l
                        public /* bridge */ /* synthetic */ tf.d invoke(String str) {
                            invoke2(str);
                            return tf.d.f30009a;
                        }

                        /* renamed from: invoke  reason: avoid collision after fix types in other method */
                        public final void invoke2(String str) {
                            if (TextUtils.isEmpty(str)) {
                                return;
                            }
                            ReaderImgPreviewActivity readerImgPreviewActivity = ReaderImgPreviewActivity.this;
                            g.b(str);
                            readerImgPreviewActivity.Q = aj.b.N(str);
                            ReaderImgPreviewActivity.m2(ReaderImgPreviewActivity.this);
                        }
                    }));
                    ImageConvertDataRepository.f26544j.e(this, new b(new l<ul.a, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImgPreviewActivity$initObserver$2
                        {
                            super(1);
                        }

                        @Override // cg.l
                        public /* bridge */ /* synthetic */ tf.d invoke(ul.a aVar) {
                            invoke2(aVar);
                            return tf.d.f30009a;
                        }

                        /* renamed from: invoke  reason: avoid collision after fix types in other method */
                        public final void invoke2(ul.a aVar) {
                            if (aVar != null) {
                                ReaderImgPreviewActivity.this.R = aVar.f30402b.size();
                                ReaderImgPreviewActivity.m2(ReaderImgPreviewActivity.this);
                            }
                        }
                    }));
                    ImageConvertDataRepository.f26546l.e(this, new b(new l<ArrayList<ul.b>, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImgPreviewActivity$initObserver$3
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
                            String string2;
                            if (arrayList == null || arrayList.isEmpty()) {
                                AppCompatTextView appCompatTextView2 = ReaderImgPreviewActivity.this.N;
                                if (appCompatTextView2 != null) {
                                    appCompatTextView2.setEnabled(false);
                                    ReaderImgPreviewActivity.n2(ReaderImgPreviewActivity.this, false);
                                } else {
                                    g.i(ea.a.p("DG8fdFhuLWUcdg==", "vjoq1XTV"));
                                    throw null;
                                }
                            } else {
                                AppCompatTextView appCompatTextView3 = ReaderImgPreviewActivity.this.N;
                                if (appCompatTextView3 != null) {
                                    appCompatTextView3.setEnabled(true);
                                    ReaderImgPreviewActivity.n2(ReaderImgPreviewActivity.this, true);
                                } else {
                                    g.i(ea.a.p("VG80dDNuRGUcdg==", "Bt7ZZ1Bg"));
                                    throw null;
                                }
                            }
                            ReaderImgPreviewActivity readerImgPreviewActivity = ReaderImgPreviewActivity.this;
                            if (readerImgPreviewActivity.f27406c0) {
                                RecyclerView recyclerView2 = readerImgPreviewActivity.M;
                                if (recyclerView2 == null) {
                                    g.i(ea.a.p("PGVdZRp0ZXY=", "srfbpxVU"));
                                    throw null;
                                }
                                recyclerView2.setVisibility(8);
                            } else {
                                RecyclerView recyclerView3 = readerImgPreviewActivity.M;
                                if (recyclerView3 == null) {
                                    g.i(ea.a.p("QGUnZRB0MHY=", "y630Iw1D"));
                                    throw null;
                                }
                                recyclerView3.setVisibility(arrayList == null || arrayList.isEmpty() ? 8 : 0);
                            }
                            if (arrayList != null) {
                                ((SelectGalleryAdapter) ReaderImgPreviewActivity.this.Y.getValue()).i(arrayList);
                                RecyclerView recyclerView4 = ReaderImgPreviewActivity.this.M;
                                if (recyclerView4 == null) {
                                    g.i(ea.a.p("QGUnZRB0MHY=", "SKDezfWq"));
                                    throw null;
                                }
                                recyclerView4.r0(arrayList.size() - 1);
                            }
                            ReaderImgPreviewActivity readerImgPreviewActivity2 = ReaderImgPreviewActivity.this;
                            AppCompatTextView appCompatTextView4 = readerImgPreviewActivity2.N;
                            if (appCompatTextView4 != null) {
                                if (readerImgPreviewActivity2.T) {
                                    string2 = readerImgPreviewActivity2.getString(R.string.arg_res_0x7f130423);
                                } else {
                                    string2 = readerImgPreviewActivity2.getString(R.string.arg_res_0x7f1301a9);
                                }
                                appCompatTextView4.setText(string2);
                                ReaderImgPreviewActivity readerImgPreviewActivity3 = ReaderImgPreviewActivity.this;
                                ReaderImgPreviewActivity.l2(readerImgPreviewActivity3, (ul.b) m.t0(ReaderImgPreviewActivity.this.S, readerImgPreviewActivity3.p2().f27193d));
                                return;
                            }
                            g.i(ea.a.p("VG8ldD1uBGUcdg==", "2K7KTqdW"));
                            throw null;
                        }
                    }));
                    return;
                }
                g.i(ea.a.p("K28ddANuBmUcdg==", "byHsjsnh"));
                throw null;
            }
            g.i(ea.a.p("BWUYZRJ0I3Y=", "Mqvtqqtc"));
            throw null;
        }
        g.i(ea.a.p("BWlRdyFhMWVy", "Hbs4qVbG"));
        throw null;
    }

    @Override // jl.a
    public final void L1() {
        t0.d0(b.b.x(this), null, null, new ReaderImgPreviewActivity$initViewModel$1(this, null), 3);
    }

    public final void h(String str) {
        int dimension;
        int[] iArr = new int[2];
        ViewPager2 viewPager2 = this.L;
        if (viewPager2 != null) {
            viewPager2.getLocationInWindow(iArr);
            int U = iArr[1] - t0.U(this);
            if (U < 0) {
                dimension = -1;
            } else {
                dimension = (int) (getResources().getDimension(R.dimen.dp_6) + U);
            }
            j1.e(this, str, false, null, dimension);
            return;
        }
        g.i(ea.a.p("RWkudyNhBWVy", "8MUMaS5P"));
        throw null;
    }

    public final String o2() {
        if (g.a(ea.a.p("Q2EsZT5hDGEVZXI=", "SA28kQ5w"), this.f27001t)) {
            return ea.a.p("P2FWZQ==", "AwyLpTX1");
        }
        if (g.a(ea.a.p("QGMqbh1lEDICZGY=", "0ulVjIhO"), this.f27001t)) {
            if (this.f27006y.ordinal() == CameraMode.Ocr.ordinal()) {
                return ea.a.p("IGNy", "WJi3xGD8");
            }
            return ea.a.p("PGNQbktwU2Y=", "tuEkRKNj");
        } else if (g.a(ea.a.p("Q2QtRRdpFkkcc1FydA==", "wZUx53k4"), this.f27001t)) {
            return ea.a.p("VmQidA==", "a9yzCpmL");
        } else {
            if (g.a(ea.a.p("XGNy", "csjTSbjj"), this.f27001t)) {
                return ea.a.p("XGNy", "V9cyOPs0");
            }
            return ea.a.p("Jm1WMglkZg==", "FjeRi28X");
        }
    }

    @Override // jl.a, androidx.fragment.app.u, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        String str;
        super.onActivityResult(i10, i11, intent);
        if (i10 == 200 && i11 == -1) {
            if (intent != null) {
                str = intent.getStringExtra(ea.a.p("PWVCdRV0Z2EuaA==", "4mVftvln"));
            } else {
                str = null;
            }
            Intent intent2 = new Intent();
            intent2.putExtra(ea.a.p("QWU4dR90MmEGaA==", "I0dXEJyp"), str);
            setResult(-1, intent2);
            finish();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x00dd, code lost:
        if (jn.a.i() == 1) goto L74;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onClick(android.view.View r11) {
        /*
            Method dump skipped, instructions count: 654
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImgPreviewActivity.onClick(android.view.View):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
        if (r0.hasExtra(r2) == true) goto L14;
     */
    @Override // pdf.pdfreader.viewer.editor.free.ui.act.a, pdf.pdfreader.viewer.editor.free.ui.act.tools.OperatePDFWatcherActivity, jl.a, androidx.fragment.app.u, androidx.activity.ComponentActivity, k0.j, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r8) {
        /*
            r7 = this;
            android.content.Intent r0 = r7.getIntent()
            r1 = 0
            if (r0 == 0) goto L14
            java.lang.String r2 = "WnMNchxtNmgbcmQ="
            java.lang.String r3 = "5LmSy3Rj"
            java.lang.String r2 = ea.a.p(r2, r3)
            boolean r0 = r0.getBooleanExtra(r2, r1)
            goto L15
        L14:
            r0 = r1
        L15:
            r7.V = r0
            android.content.Intent r0 = r7.getIntent()
            if (r0 == 0) goto L24
            java.lang.String r2 = pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImgPreviewActivity.f27401e0
            boolean r0 = r0.getBooleanExtra(r2, r1)
            goto L25
        L24:
            r0 = r1
        L25:
            r7.T = r0
            android.content.Intent r0 = r7.getIntent()
            r2 = -1
            if (r0 == 0) goto L34
            java.lang.String r3 = pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImgPreviewActivity.f27402f0
            int r2 = r0.getIntExtra(r3, r2)
        L34:
            r7.U = r2
            android.content.Intent r0 = r7.getIntent()
            java.lang.String r2 = pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImgPreviewActivity.f27403g0
            if (r0 == 0) goto L46
            boolean r0 = r0.hasExtra(r2)
            r3 = 1
            if (r0 != r3) goto L46
            goto L47
        L46:
            r3 = r1
        L47:
            if (r3 == 0) goto L60
            android.content.Intent r0 = r7.getIntent()
            if (r0 == 0) goto L5b
            java.lang.String r0 = r0.getStringExtra(r2)
            if (r0 == 0) goto L5b
            pdf.pdfreader.viewer.editor.free.feature.scan.ui.state.CameraMode r0 = pdf.pdfreader.viewer.editor.free.feature.scan.ui.state.CameraMode.valueOf(r0)
            if (r0 != 0) goto L5d
        L5b:
            pdf.pdfreader.viewer.editor.free.feature.scan.ui.state.CameraMode r0 = pdf.pdfreader.viewer.editor.free.feature.scan.ui.state.CameraMode.Scan
        L5d:
            r7.j2(r0)
        L60:
            super.onCreate(r8)
            android.content.Intent r8 = r7.getIntent()
            r2 = -1
            if (r8 == 0) goto L72
            java.lang.String r0 = pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImgPreviewActivity.f27400d0
            long r4 = r8.getLongExtra(r0, r2)
            goto L73
        L72:
            r4 = r2
        L73:
            android.content.Intent r8 = r7.getIntent()
            if (r8 == 0) goto L86
            java.lang.String r0 = "JnNucxBuUGw_XzllGWULdGptAWRl"
            java.lang.String r6 = "AvV3MOFP"
            java.lang.String r0 = ea.a.p(r0, r6)
            boolean r8 = r8.getBooleanExtra(r0, r1)
            goto L87
        L86:
            r8 = r1
        L87:
            r7.f27406c0 = r8
            int r8 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r8 == 0) goto Laa
            androidx.viewpager2.widget.ViewPager2 r8 = r7.L
            if (r8 == 0) goto L9d
            pdf.pdfreader.viewer.editor.free.ui.adapter.convert.f r0 = r7.p2()
            int r0 = r0.h(r4)
            r8.i(r0, r1)
            goto Laa
        L9d:
            java.lang.String r8 = "J2lTdxthMmVy"
            java.lang.String r0 = "9TQ6KU9J"
            java.lang.String r8 = ea.a.p(r8, r0)
            kotlin.jvm.internal.g.i(r8)
            r8 = 0
            throw r8
        Laa:
            java.lang.String r8 = "Jm1WcxxsUmN0"
            java.lang.String r0 = "svdUz83J"
            java.lang.String r8 = ea.a.p(r8, r0)
            java.lang.String r0 = "Jm1WXwpoWHc="
            java.lang.String r2 = "P2cP8Bw3"
            java.lang.String r0 = ea.a.p(r0, r2)
            java.lang.String r2 = r7.o2()
            tn.a.d(r7, r8, r0, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImgPreviewActivity.onCreate(android.os.Bundle):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000c, code lost:
        if (r0.isRunning() == true) goto L5;
     */
    @Override // pdf.pdfreader.viewer.editor.free.ui.act.tools.OperatePDFWatcherActivity, jl.a, androidx.appcompat.app.c, androidx.fragment.app.u, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onDestroy() {
        /*
            r2 = this;
            super.onDestroy()
            android.animation.ValueAnimator r0 = r2.Z
            if (r0 == 0) goto Lf
            boolean r0 = r0.isRunning()
            r1 = 1
            if (r0 != r1) goto Lf
            goto L10
        Lf:
            r1 = 0
        L10:
            if (r1 == 0) goto L19
            android.animation.ValueAnimator r0 = r2.Z
            if (r0 == 0) goto L19
            r0.cancel()
        L19:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImgPreviewActivity.onDestroy():void");
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
        super.onStart();
        p2().notifyDataSetChanged();
        ((SelectGalleryAdapter) this.Y.getValue()).notifyDataSetChanged();
    }

    @Override // jl.a, androidx.appcompat.app.c, androidx.fragment.app.u, android.app.Activity
    public final void onStop() {
        super.onStop();
    }

    @Override // jl.a, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
    }

    public final pdf.pdfreader.viewer.editor.free.ui.adapter.convert.f p2() {
        return (pdf.pdfreader.viewer.editor.free.ui.adapter.convert.f) this.X.getValue();
    }
}

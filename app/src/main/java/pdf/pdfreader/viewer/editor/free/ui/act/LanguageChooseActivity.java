package pdf.pdfreader.viewer.editor.free.ui.act;

import android.animation.LayoutTransition;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.m0;
import androidx.recyclerview.widget.RecyclerView;
import com.lib.flutter.encrypt.NativeGuideLanApi;
import el.b;
import industries.deepthought.decode.Decoder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.ads.anim.LangBannerLoadingAnimation;
import pdf.pdfreader.viewer.editor.free.ads.standard.LanguageMutableNative;
import pdf.pdfreader.viewer.editor.free.ads.standard.banner.BannerType;
import pdf.pdfreader.viewer.editor.free.bean.ThirdOpenBean;
import pdf.pdfreader.viewer.editor.free.feature.billing.BillingConfigImpl;
import pdf.pdfreader.viewer.editor.free.feature.bridge.SplashLoadingFragment;
import pdf.pdfreader.viewer.editor.free.fnbridge.FlutterEncryptConfig;
import pdf.pdfreader.viewer.editor.free.utils.AdUtils;
import pdf.pdfreader.viewer.editor.free.utils.ReaderWrapContentLinearLayoutManager;
import pdf.pdfreader.viewer.editor.free.utils.event.AppCoreFilterEvent;
import pdf.pdfreader.viewer.editor.free.utils.event.AppOpenSource;
import pdf.pdfreader.viewer.editor.free.utils.event.EventCenter;
import x0.f0;

/* compiled from: LanguageChooseActivity.kt */
/* loaded from: classes3.dex */
public final class LanguageChooseActivity extends jl.a implements NativeGuideLanApi {
    public static final /* synthetic */ int H = 0;
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;

    /* renamed from: v  reason: collision with root package name */
    public int f26611v;

    /* renamed from: w  reason: collision with root package name */
    public a f26612w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f26613x;

    /* renamed from: t  reason: collision with root package name */
    public final tf.c f26609t = kotlin.a.a(new cg.a<am.h>() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.LanguageChooseActivity$binding$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final am.h invoke() {
            View inflate = LanguageChooseActivity.this.getLayoutInflater().inflate(R.layout.activity_change_language, (ViewGroup) null, false);
            int i10 = R.id.contentRoot;
            RelativeLayout relativeLayout = (RelativeLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.contentRoot);
            if (relativeLayout != null) {
                i10 = R.id.guideButton;
                AppCompatImageView appCompatImageView = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.guideButton);
                if (appCompatImageView != null) {
                    i10 = R.id.guideContainer;
                    LinearLayout linearLayout = (LinearLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.guideContainer);
                    if (linearLayout != null) {
                        i10 = R.id.guideText;
                        LinearLayout linearLayout2 = (LinearLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.guideText);
                        if (linearLayout2 != null) {
                            i10 = R.id.ivChangeLangOK;
                            AppCompatImageView appCompatImageView2 = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.ivChangeLangOK);
                            if (appCompatImageView2 != null) {
                                i10 = R.id.nativeBannerContainer;
                                ConstraintLayout constraintLayout = (ConstraintLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.nativeBannerContainer);
                                if (constraintLayout != null) {
                                    i10 = R.id.nativeBannerLayout;
                                    FrameLayout frameLayout = (FrameLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.nativeBannerLayout);
                                    if (frameLayout != null) {
                                        i10 = R.id.nativeCardContainer;
                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.nativeCardContainer);
                                        if (constraintLayout2 != null) {
                                            i10 = R.id.nativeCardLayout;
                                            FrameLayout frameLayout2 = (FrameLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.nativeCardLayout);
                                            if (frameLayout2 != null) {
                                                i10 = R.id.nativeCardScrollView;
                                                if (((ScrollView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.nativeCardScrollView)) != null) {
                                                    i10 = R.id.rvChangLang;
                                                    RecyclerView recyclerView = (RecyclerView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.rvChangLang);
                                                    if (recyclerView != null) {
                                                        i10 = R.id.splash_root;
                                                        FrameLayout frameLayout3 = (FrameLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.splash_root);
                                                        if (frameLayout3 != null) {
                                                            return new am.h((RelativeLayout) inflate, relativeLayout, appCompatImageView, linearLayout, linearLayout2, appCompatImageView2, constraintLayout, frameLayout, constraintLayout2, frameLayout2, recyclerView, frameLayout3);
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
            throw new NullPointerException(ea.a.p("fmk4cxpuBSAAZUV1AHIzZGR2W2UxIDRpQWhiSSo6IA==", "5Bnt0ZTD").concat(inflate.getResources().getResourceName(i10)));
        }
    });

    /* renamed from: u  reason: collision with root package name */
    public final tf.c f26610u = kotlin.a.a(new cg.a<List<no.c>>() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.LanguageChooseActivity$dataLangList$2
        @Override // cg.a
        public final List<no.c> invoke() {
            return new ArrayList();
        }
    });

    /* renamed from: y  reason: collision with root package name */
    public final tf.c f26614y = kotlin.a.a(new cg.a<Handler>() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.LanguageChooseActivity$mainHandler$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    });

    /* renamed from: z  reason: collision with root package name */
    public final androidx.lifecycle.k0 f26615z = new androidx.lifecycle.k0(kotlin.jvm.internal.i.a(pdf.pdfreader.viewer.editor.free.feature.bridge.c.class), new cg.a<androidx.lifecycle.o0>() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.LanguageChooseActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final androidx.lifecycle.o0 invoke() {
            androidx.lifecycle.o0 viewModelStore = ComponentActivity.this.getViewModelStore();
            kotlin.jvm.internal.g.d(viewModelStore, ea.a.p("RWkudz5vBmUeU0BvG2U=", "PSFvTSlh"));
            return viewModelStore;
        }
    }, new cg.a<m0.b>() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.LanguageChooseActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final m0.b invoke() {
            m0.b defaultViewModelProviderFactory = ComponentActivity.this.getDefaultViewModelProviderFactory();
            kotlin.jvm.internal.g.d(defaultViewModelProviderFactory, ea.a.p("NmUqYRJsBVYhZRFNW2QybGhyPXYgZFNyMmESdD5yeQ==", "KGRLgqBj"));
            return defaultViewModelProviderFactory;
        }
    }, new cg.a<n1.a>() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.LanguageChooseActivity$special$$inlined$viewModels$default$3
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        {
            super(0);
        }

        @Override // cg.a
        public final n1.a invoke() {
            n1.a aVar;
            cg.a aVar2 = cg.a.this;
            if (aVar2 == null || (aVar = (n1.a) aVar2.invoke()) == null) {
                n1.a defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
                kotlin.jvm.internal.g.d(defaultViewModelCreationExtras, ea.a.p("O2hYc1dkUmY7dSZ0I2kNd3hvCmUpQxdlI3Q8b1hFGnQ9YXM=", "i1zjBU6b"));
                return defaultViewModelCreationExtras;
            }
            return aVar;
        }
    });

    /* compiled from: LanguageChooseActivity.kt */
    /* loaded from: classes3.dex */
    public static final class a extends RecyclerView.Adapter<b> {

        /* renamed from: d  reason: collision with root package name */
        public final List<no.c> f26616d;

        /* renamed from: e  reason: collision with root package name */
        public int f26617e;

        /* renamed from: f  reason: collision with root package name */
        public final cg.l<Integer, tf.d> f26618f;

        /* JADX WARN: Multi-variable type inference failed */
        public a(List<? extends no.c> list, int i10, cg.l<? super Integer, tf.d> lVar) {
            kotlin.jvm.internal.g.e(list, ea.a.p("K2FFYTVpRHQ=", "QhvkEW1b"));
            ea.a.p("XG4CdBZtIWwbY2s=", "aNiNzoSf");
            this.f26616d = list;
            this.f26617e = i10;
            this.f26618f = lVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return this.f26616d.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(b bVar, int i10) {
            int i11;
            b holder = bVar;
            kotlin.jvm.internal.g.e(holder, "holder");
            if (i10 >= 0) {
                List<no.c> list = this.f26616d;
                if (i10 < list.size()) {
                    holder.itemView.setTag(Integer.valueOf(i10));
                    holder.f26619b.setText(list.get(i10).f22613b);
                    if (i10 == this.f26617e) {
                        i11 = R.drawable.ic_home_selected;
                    } else {
                        i11 = R.drawable.ic_home_unselected_gray;
                    }
                    holder.c.setImageResource(i11);
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final b onCreateViewHolder(ViewGroup parent, int i10) {
            kotlin.jvm.internal.g.e(parent, "parent");
            View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_change_language_in_activity, parent, false);
            inflate.setOnClickListener(new g(this, 1));
            ea.a.p("RWkudw==", "SzcB1DlF");
            return new b(inflate);
        }
    }

    /* compiled from: LanguageChooseActivity.kt */
    /* loaded from: classes3.dex */
    public static final class b extends RecyclerView.b0 {

        /* renamed from: b  reason: collision with root package name */
        public final TextView f26619b;
        public final ImageView c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(View view) {
            super(view);
            ea.a.p("WnQubSVpB3c=", "5uQWppZb");
            View findViewById = view.findViewById(R.id.ivLangSelect);
            kotlin.jvm.internal.g.d(findViewById, ea.a.p("WnQubSVpB3dcZl1uDVY_ZTNCS0kiKBEuCGQaaRpMEm5UUy5sFmMWKQ==", "a4ls6Rb8"));
            this.c = (ImageView) findViewById;
            View findViewById2 = view.findViewById(R.id.tvLangDesc);
            kotlin.jvm.internal.g.d(findViewById2, ea.a.p("G3QmbRdpFndmZg9uUFY-ZU9CK0ktKGQuHWRfdCdMI24VRCZzIik=", "GdrCAsq3"));
            this.f26619b = (TextView) findViewById2;
        }
    }

    /* compiled from: LanguageChooseActivity.kt */
    /* loaded from: classes3.dex */
    public static final class d extends androidx.activity.n {
        public d() {
            super(true);
        }

        @Override // androidx.activity.n
        public final void a() {
            int i10 = LanguageChooseActivity.H;
            LanguageChooseActivity languageChooseActivity = LanguageChooseActivity.this;
            if (!languageChooseActivity.e2().d()) {
                if (languageChooseActivity.A) {
                    ReaderPdfApplication.j();
                }
                languageChooseActivity.finish();
            }
        }
    }

    /* compiled from: LanguageChooseActivity.kt */
    /* loaded from: classes3.dex */
    public static final class e implements androidx.lifecycle.x, kotlin.jvm.internal.e {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ cg.l f26622a;

        public e(cg.l lVar) {
            ea.a.p("KXVfYw1pWG4=", "IvGFb2Fu");
            this.f26622a = lVar;
        }

        @Override // kotlin.jvm.internal.e
        public final cg.l a() {
            return this.f26622a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof androidx.lifecycle.x) && (obj instanceof kotlin.jvm.internal.e)) {
                return kotlin.jvm.internal.g.a(this.f26622a, ((kotlin.jvm.internal.e) obj).a());
            }
            return false;
        }

        public final int hashCode() {
            return this.f26622a.hashCode();
        }

        @Override // androidx.lifecycle.x
        public final /* synthetic */ void m(Object obj) {
            this.f26622a.invoke(obj);
        }
    }

    public static String d2(String str) {
        String str2;
        String str3;
        if (kotlin.jvm.internal.g.a(str, ea.a.p("Q2EsZSxtA2lu", "m5GynoYe"))) {
            str2 = "Qg==";
            str3 = "sGOgx2CP";
        } else {
            str2 = "QQ==";
            str3 = "NlPZjfGJ";
        }
        return ea.a.p(str2, str3);
    }

    @Override // jl.a
    public final View D1() {
        RelativeLayout relativeLayout = b2().f940a;
        kotlin.jvm.internal.g.d(relativeLayout, ea.a.p("LWlfZBBuUC4obyV0", "LYGkPQZZ"));
        return relativeLayout;
    }

    @Override // jl.a
    public final int E1() {
        return 0;
    }

    @Override // jl.a
    public final void K1() {
        boolean z10;
        f2();
        b2().f949k.q(new pdf.pdfreader.viewer.editor.free.utils.b0(getResources().getDimensionPixelSize(R.dimen.dp_6)));
        b2().f944f.setOnClickListener(new d9.f(this, 15));
        if (!BillingConfigImpl.c.w() && !androidx.activity.s.x(this)) {
            LanguageMutableNative.a aVar = LanguageMutableNative.f23975h;
            LanguageMutableNative a10 = aVar.a();
            if (a10.f23978a != null && !a10.f23980d) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10 || aVar.a().f23980d) {
                FlutterEncryptConfig.f25878a.getClass();
                if (AdUtils.a(this)) {
                    LanguageMutableNative a11 = aVar.a();
                    FrameLayout frameLayout = b2().f946h;
                    kotlin.jvm.internal.g.d(frameLayout, ea.a.p("UWklZBpuBS4cYUBpH2UUYSpuV3IKYTpvJnQ=", "SXE6FKp5"));
                    a11.d(frameLayout, new LangBannerLoadingAnimation(this, false));
                    b2().f947i.setVisibility(8);
                    b2().f945g.setVisibility(0);
                } else {
                    LanguageMutableNative a12 = aVar.a();
                    FrameLayout frameLayout2 = b2().f948j;
                    kotlin.jvm.internal.g.d(frameLayout2, ea.a.p("UWklZBpuBS4cYUBpH2UVYTZkfmE_bzZ0", "yPlh75nP"));
                    a12.d(frameLayout2, new LangBannerLoadingAnimation(this, true));
                    b2().f948j.setLayoutTransition(new LayoutTransition());
                    b2().f947i.setVisibility(0);
                    b2().f945g.setVisibility(8);
                }
                aVar.a().f23979b = new c();
                return;
            }
            return;
        }
        b2().f947i.setVisibility(8);
        b2().f945g.setVisibility(8);
    }

    @Override // jl.a
    public final void L1() {
        pdf.pdfreader.viewer.editor.free.utils.t0.d0(b.b.x(this), null, null, new LanguageChooseActivity$initViewModel$1(this, null), 3);
        pdf.pdfreader.viewer.editor.free.utils.t0.d0(b.b.x(this), null, null, new LanguageChooseActivity$initViewModel$2(this, null), 3);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0130, code lost:
        if (r0.equals(ea.a.p("B2ETZQZoKG0tXxZwdA==", "4FwtYGP9")) == false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0140, code lost:
        if (r0.equals(ea.a.p("Q2EsZSxoDW0XX0RkZg==", "10nDdNb4")) == false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0150, code lost:
        if (r0.equals(ea.a.p("Q2EsZSxoDW0XX0BvBmxz", "dkjwV0Wa")) == false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0160, code lost:
        if (r0.equals(ea.a.p("Q2EsZSxoDW0XX1F4CmVs", "o2mdyMaS")) == false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0170, code lost:
        if (r0.equals(ea.a.p("Q2EsZSx3C2QVZUBfDGQ_dA==", "57KojexI")) == false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01b7, code lost:
        if (r0.equals(ea.a.p("P2FWZSZoWG0_Xz1vB2Q=", "yelnLOEn")) == false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01c7, code lost:
        if (r0.equals(ea.a.p("P2FWZSZoWG0_XyhvGmsFYUdr", "64ICghLV")) == false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01f1, code lost:
        if (r0.equals(ea.a.p("P2FWZSZoWG0_XytsGV8OaVll", "tInnsYP2")) == false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0258, code lost:
        if (r0.equals(ea.a.p("Q2EsZSx3C2QVZUBfGmM3bnZwVmY=", "KaWzpkXE")) == false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0267, code lost:
        if (r0.equals(ea.a.p("Q2EsZSxzB2EAY2g=", "AaIh9cUN")) == false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x028d, code lost:
        if (r0.equals(ea.a.p("Q2EsZSx3C2QVZUBfAG0xMjRkZg==", "IKs5Ch5r")) == false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x02b3, code lost:
        if (r0.equals(ea.a.p("GmEFZTNoHG0tXxRlV2U5dA==", "BPjblsHu")) == false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x02b6, code lost:
        getIntent().setClass(r12, pdf.pdfreader.viewer.editor.free.ui.act.ReaderHomeActivity.class);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a2() {
        /*
            Method dump skipped, instructions count: 1160
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.ui.act.LanguageChooseActivity.a2():void");
    }

    public final am.h b2() {
        return (am.h) this.f26609t.getValue();
    }

    public final List<no.c> c2() {
        return (List) this.f26610u.getValue();
    }

    public final pdf.pdfreader.viewer.editor.free.feature.bridge.c e2() {
        return (pdf.pdfreader.viewer.editor.free.feature.bridge.c) this.f26615z.getValue();
    }

    public final void f2() {
        boolean z10;
        FlutterEncryptConfig.f25878a.getClass();
        int i10 = 1;
        if (!AdUtils.a(this) && FlutterEncryptConfig.b()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.G = z10;
        c2().clear();
        HashMap<String, String> hashMap = pdf.pdfreader.viewer.editor.free.utils.a0.f28533e;
        if (!this.G) {
            c2().add(new no.c(ea.a.p("K2VXYQxsdA==", "icUMsxUe"), getString(R.string.arg_res_0x7f1304c2)));
        }
        String[] strArr = pdf.pdfreader.viewer.editor.free.utils.a0.f28530a;
        kotlin.jvm.internal.g.d(strArr, ea.a.p("FGFZZyZpPXQ=", "qnX7jNU9"));
        for (String str : strArr) {
            c2().add(new no.c(str, hashMap.get(str)));
        }
        if (this.G) {
            i10 = -1;
        } else if (pdf.pdfreader.viewer.editor.free.utils.a0.h(this)) {
            i10 = 0;
        }
        this.f26611v = i10;
        b2().f949k.setLayoutManager(new ReaderWrapContentLinearLayoutManager());
        this.f26612w = new a(c2(), this.f26611v, new cg.l<Integer, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.LanguageChooseActivity$initLanguageList$1
            {
                super(1);
            }

            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(Integer num) {
                invoke(num.intValue());
                return tf.d.f30009a;
            }

            public final void invoke(int i11) {
                LanguageChooseActivity languageChooseActivity = LanguageChooseActivity.this;
                if (!languageChooseActivity.F && languageChooseActivity.G) {
                    boolean z11 = true;
                    languageChooseActivity.F = true;
                    b.a aVar = el.b.f16791g;
                    el.b a10 = aVar.a();
                    if (a10.f16793a == null || a10.f16795d) {
                        z11 = false;
                    }
                    if (z11) {
                        LanguageChooseActivity.this.b2().f947i.setVisibility(0);
                        el.b a11 = aVar.a();
                        LanguageChooseActivity languageChooseActivity2 = LanguageChooseActivity.this;
                        FrameLayout frameLayout = languageChooseActivity2.b2().f948j;
                        kotlin.jvm.internal.g.d(frameLayout, ea.a.p("UWklZBpuBS4cYUBpH2UVYTZkfmE_bzZ0", "HF4ASv0A"));
                        no.f.b(LanguageChooseActivity.this).getClass();
                        a11.c(languageChooseActivity2, frameLayout, no.f.f() ? R.layout.pre_install_ad_lang_native_card_b : R.layout.ad_lang_native_card_b);
                        return;
                    }
                    aVar.a().f16794b = new a(LanguageChooseActivity.this);
                }
            }

            /* compiled from: LanguageChooseActivity.kt */
            /* loaded from: classes3.dex */
            public static final class a implements hl.a {

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ LanguageChooseActivity f26623a;

                public a(LanguageChooseActivity languageChooseActivity) {
                    this.f26623a = languageChooseActivity;
                }

                @Override // hl.a
                public final void e() {
                    int i10;
                    LanguageChooseActivity languageChooseActivity = this.f26623a;
                    if (pdf.pdfreader.viewer.editor.free.utils.extension.a.c(languageChooseActivity)) {
                        int i11 = LanguageChooseActivity.H;
                        languageChooseActivity.b2().f947i.setVisibility(0);
                        el.b a10 = el.b.f16791g.a();
                        FrameLayout frameLayout = languageChooseActivity.b2().f948j;
                        kotlin.jvm.internal.g.d(frameLayout, ea.a.p("UWklZBpuBS4cYUBpH2UVYTZkfmE_bzZ0", "zNqao5lc"));
                        no.f.b(languageChooseActivity).getClass();
                        if (no.f.f()) {
                            i10 = R.layout.pre_install_ad_lang_native_card_b;
                        } else {
                            i10 = R.layout.ad_lang_native_card_b;
                        }
                        a10.c(languageChooseActivity, frameLayout, i10);
                    }
                }

                @Override // hl.a
                public final void f1(BannerType type) {
                    kotlin.jvm.internal.g.e(type, "type");
                }

                @Override // hl.a
                public final void d() {
                }

                @Override // hl.a
                public final void f() {
                }
            }
        });
        b2().f949k.setAdapter(this.f26612w);
    }

    public final void g2(boolean z10) {
        String str;
        String str2;
        if (!this.c) {
            String p10 = ea.a.p("XWU8Zh9vdw==", "zx0CFUWY");
            String p11 = ea.a.p("I2FfZwxhUGUFYS5fBmgHdw==", "eGFYMrAk");
            no.f.b(this).getClass();
            String c10 = no.f.c();
            if (z10) {
                str = "UWElbhZy";
                str2 = "8Ts0flde";
            } else {
                str = "L2EGZA==";
                str2 = "HLLtyQ3H";
            }
            tn.a.d(this, p10, p11, androidx.activity.f.m(c10, "_", ea.a.p(str, str2)), false);
        }
    }

    @Override // com.lib.flutter.encrypt.NativeGuideLanApi
    public final void j0() {
        int i10;
        int i11;
        if (!this.E) {
            this.C = true;
        } else if (e2().d()) {
            this.D = true;
        } else if (BillingConfigImpl.c.w()) {
            y();
        } else {
            ConstraintLayout constraintLayout = b2().f947i;
            FlutterEncryptConfig.f25878a.getClass();
            int i12 = 8;
            if (AdUtils.a(this)) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            constraintLayout.setVisibility(i10);
            ConstraintLayout constraintLayout2 = b2().f945g;
            if (AdUtils.a(this)) {
                i12 = 0;
            }
            constraintLayout2.setVisibility(i12);
            if (AdUtils.a(this)) {
                if (pdf.pdfreader.viewer.editor.free.utils.c1.D(this)) {
                    b2().f946h.setBackgroundColor(androidx.core.content.a.getColor(this, R.color.color_native_banner_light_bg));
                } else {
                    b2().f946h.setBackgroundColor(androidx.core.content.a.getColor(this, R.color.color_native_banner_dark_bg));
                }
                LanguageMutableNative a10 = LanguageMutableNative.f23975h.a();
                FrameLayout frameLayout = b2().f946h;
                kotlin.jvm.internal.g.d(frameLayout, ea.a.p("LWlfZBBuUC40YT5pA2UqYVtuC3IJYRxvTXQ=", "jkVn8pAb"));
                a10.c(this, frameLayout, R.layout.ad_lang_native_banner, true);
                g2(true);
            } else if (this.F) {
            } else {
                LanguageMutableNative a11 = LanguageMutableNative.f23975h.a();
                FrameLayout frameLayout2 = b2().f948j;
                kotlin.jvm.internal.g.d(frameLayout2, ea.a.p("NmkXZF5uBC4mYRJpQmUUYUpkHmEwb0N0", "3ATy7ci1"));
                no.f.b(this).getClass();
                if (no.f.f()) {
                    i11 = R.layout.pre_install_ad_lang_native_card;
                } else {
                    i11 = R.layout.ad_lang_native_card;
                }
                a11.c(this, frameLayout2, i11, false);
                g2(false);
            }
        }
    }

    @Override // jl.a, androidx.fragment.app.u, androidx.activity.ComponentActivity, k0.j, android.app.Activity
    public final void onCreate(Bundle bundle) {
        boolean z10;
        boolean z11;
        char c10;
        Window window;
        ThirdOpenBean thirdOpenBean = (ThirdOpenBean) getIntent().getParcelableExtra(ea.a.p("I2U8XzxoMXIsXxVoVXJl", "GEHEHXtA"));
        int i10 = 0;
        if (thirdOpenBean != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.A = z10;
        if (!z10 && (window = getWindow()) != null) {
            pdf.pdfreader.viewer.editor.free.utils.extension.i.g(window, androidx.core.content.a.getColor(this, R.color.colorOnPrimary), androidx.core.content.a.getColor(this, R.color.colorOnPrimary));
            pdf.pdfreader.viewer.editor.free.utils.extension.i.h(window, !pdf.pdfreader.viewer.editor.free.utils.extension.c.h(this));
        }
        super.onCreate(bundle);
        if (Decoder.f18572a) {
            qd.a.c(this);
            try {
                String substring = cd.a.b(this).substring(2441, 2472);
                kotlin.jvm.internal.g.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                Charset charset = kotlin.text.a.f19966b;
                byte[] bytes = substring.getBytes(charset);
                kotlin.jvm.internal.g.d(bytes, "this as java.lang.String).getBytes(charset)");
                byte[] bytes2 = "3f2d3e7cf55d7f557bf186481d39ae0".getBytes(charset);
                kotlin.jvm.internal.g.d(bytes2, "this as java.lang.String).getBytes(charset)");
                if (System.currentTimeMillis() % 2 == 0) {
                    int nextInt = cd.a.f5674a.nextInt(0, bytes.length / 2);
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
                        cd.a.a();
                        throw null;
                    }
                } else if (!Arrays.equals(bytes2, bytes)) {
                    cd.a.a();
                    throw null;
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                cd.a.a();
                throw null;
            }
        } else {
            ReaderPdfApplication.o(this);
        }
        NativeGuideLanApi.T0.getClass();
        NativeGuideLanApi.Companion.c = this;
        if (bundle != null) {
            FlutterEncryptConfig.f25878a.getClass();
            if (!FlutterEncryptConfig.c()) {
                finish();
                return;
            }
        }
        getWindow().getDecorView().setBackgroundColor(androidx.core.content.a.getColor(this, R.color.colorOnPrimary));
        if (Build.VERSION.SDK_INT < 27) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 && this.f19294h) {
            getWindow().clearFlags(134217728);
        }
        if (pdf.pdfreader.viewer.editor.free.utils.extension.f.a(23)) {
            View decorView = getWindow().getDecorView();
            h hVar = new h(this);
            WeakHashMap<View, x0.n0> weakHashMap = x0.f0.f31435a;
            f0.i.u(decorView, hVar);
        }
        RelativeLayout relativeLayout = b2().f940a;
        androidx.appcompat.libconvert.helper.b bVar = new androidx.appcompat.libconvert.helper.b(this, 10);
        WeakHashMap<View, x0.n0> weakHashMap2 = x0.f0.f31435a;
        f0.i.u(relativeLayout, bVar);
        final String stringExtra = getIntent().getStringExtra(ea.a.p("Q2EsZSx0bw==", "SsI2SKSq"));
        if (stringExtra == null) {
            stringExtra = "";
        }
        EventCenter.f28658e = ea.a.p("X2ElZw==", "i0aHvwqk");
        if (thirdOpenBean != null) {
            if (bundle == null) {
                if (!pdf.pdfreader.viewer.editor.free.ads.j.c().d(this) && !pdf.pdfreader.viewer.editor.free.ads.j.c().e() && !pdf.pdfreader.viewer.editor.free.ads.l.m().d(this) && !pdf.pdfreader.viewer.editor.free.ads.l.m().e()) {
                    com.google.android.play.core.assetpacks.b1.K(this, true, false);
                    FlutterEncryptConfig.f25881e.c(this, ea.a.p("QHAnYQBoPWkcdFFyGnQ_dC1hXl8tZXk=", "zxHleay8"));
                }
                SplashLoadingFragment.a aVar = SplashLoadingFragment.f24959n0;
                androidx.fragment.app.g0 supportFragmentManager = getSupportFragmentManager();
                kotlin.jvm.internal.g.d(supportFragmentManager, ea.a.p("I3VJcClyPUY6YQFtUW4jTVluM2cscg==", "7zP9FIWO"));
                aVar.getClass();
                SplashLoadingFragment.a.a(supportFragmentManager, thirdOpenBean);
            } else {
                FrameLayout frameLayout = b2().f950l;
                if (getSupportFragmentManager().D(ea.a.p("YHBdYQFoD28pZA9uU0YlYV9tN250", "qb31rCu7")) == null) {
                    i10 = 8;
                }
                frameLayout.setVisibility(i10);
            }
        } else {
            b2().f950l.setVisibility(8);
            fp.a aVar2 = fp.a.f17318a;
            String d22 = d2(stringExtra);
            aVar2.getClass();
            fp.a.a(this, d22);
        }
        getOnBackPressedDispatcher().a(this, new d());
        e2().f24978g.e(this, new e(new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.LanguageChooseActivity$onCreate$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                invoke2(bool);
                return tf.d.f30009a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Boolean bool) {
                ea.a.p("FnAYYSdoB28pZA9uU0YlYV9tN250", "7oEtTKqH");
                (bool == null ? ea.a.p("G3UGbA==", "wmujj7j3") : bool).toString();
                if (bool != null) {
                    bool.booleanValue();
                    if (bool.booleanValue()) {
                        return;
                    }
                    fp.a aVar3 = fp.a.f17318a;
                    LanguageChooseActivity languageChooseActivity = LanguageChooseActivity.this;
                    String str = stringExtra;
                    int i12 = LanguageChooseActivity.H;
                    languageChooseActivity.getClass();
                    String d23 = LanguageChooseActivity.d2(str);
                    aVar3.getClass();
                    fp.a.a(languageChooseActivity, d23);
                    LanguageChooseActivity.this.b2().f950l.setVisibility(8);
                    Window window2 = LanguageChooseActivity.this.getWindow();
                    boolean z12 = true;
                    if (window2 != null) {
                        LanguageChooseActivity languageChooseActivity2 = LanguageChooseActivity.this;
                        window2.getDecorView().setSystemUiVisibility(0);
                        if (Build.VERSION.SDK_INT >= 28) {
                            WindowManager.LayoutParams attributes = window2.getAttributes();
                            attributes.layoutInDisplayCutoutMode = 0;
                            window2.setAttributes(attributes);
                        }
                        pdf.pdfreader.viewer.editor.free.utils.extension.i.g(window2, androidx.core.content.a.getColor(languageChooseActivity2, R.color.colorOnPrimary), androidx.core.content.a.getColor(languageChooseActivity2, R.color.colorOnPrimary));
                        pdf.pdfreader.viewer.editor.free.utils.extension.i.h(window2, !pdf.pdfreader.viewer.editor.free.utils.extension.c.h(languageChooseActivity2));
                        if (languageChooseActivity2.f19294h) {
                            View decorView2 = window2.getDecorView();
                            kotlin.jvm.internal.g.d(decorView2, ea.a.p("JnQfZBxjWHIMaS93", "Yonzje8X"));
                            pdf.pdfreader.viewer.editor.free.utils.extension.i.d(window2, decorView2, new Integer[]{1}, new Integer[]{2});
                        } else {
                            View decorView3 = window2.getDecorView();
                            kotlin.jvm.internal.g.d(decorView3, ea.a.p("W3RmZDNjHXIeaQN3", "Rc2HVrTe"));
                            pdf.pdfreader.viewer.editor.free.utils.extension.i.d(window2, decorView3, new Integer[]{1, 2}, new Integer[0]);
                        }
                    }
                    LanguageChooseActivity languageChooseActivity3 = LanguageChooseActivity.this;
                    if (languageChooseActivity3.D) {
                        languageChooseActivity3.D = false;
                        languageChooseActivity3.j0();
                    }
                    FlutterEncryptConfig flutterEncryptConfig = FlutterEncryptConfig.f25878a;
                    LanguageChooseActivity context = LanguageChooseActivity.this;
                    flutterEncryptConfig.getClass();
                    kotlin.jvm.internal.g.e(context, "context");
                    if (AdUtils.a(context) || !FlutterEncryptConfig.b()) {
                        z12 = false;
                    }
                    if (LanguageChooseActivity.this.G != z12) {
                        ea.a.p("f2ElZwZhBWUxaFtvGmUXYzBpRGkyeQ==", "Qpxbaq3a");
                        LanguageChooseActivity languageChooseActivity4 = LanguageChooseActivity.this;
                        boolean z13 = languageChooseActivity4.G;
                        languageChooseActivity4.f2();
                    }
                }
            }
        }));
        if (wn.b.f31389e) {
            if (AppCoreFilterEvent.f28650a == AppOpenSource.Desk) {
                AppCoreFilterEvent.h(ea.a.p("X2ElZwZhBWUtZFFzaw==", "TjQ0n6Vl"));
            } else if (AppCoreFilterEvent.f28650a == AppOpenSource.Share) {
                AppCoreFilterEvent.h(ea.a.p("LmECZwxhAGUXdA5pRmQ=", "1HBlygo4"));
            }
        }
    }

    @Override // jl.a, androidx.appcompat.app.c, androidx.fragment.app.u, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        ((Handler) this.f26614y.getValue()).removeCallbacksAndMessages(null);
        LanguageMutableNative.a aVar = LanguageMutableNative.f23975h;
        if (aVar.a().f23982f || aVar.a().c) {
            LanguageMutableNative a10 = aVar.a();
            if (a10.f23978a != null) {
                LanguageMutableNative.a(ea.a.p("LGUHdABvMiApZA==", "huHtrKOP"));
            }
            zd.d dVar = a10.f23978a;
            if (dVar != null) {
                dVar.d(this);
            }
            a10.f23978a = null;
            a10.f23982f = false;
            a10.f23983g = false;
            a10.f23980d = false;
            a10.c = false;
            a10.f23981e = false;
            a10.f23979b = null;
            LanguageMutableNative.f23976i = null;
        }
        b.a aVar2 = el.b.f16791g;
        if (aVar2.a().f16796e || aVar2.a().c) {
            el.b a11 = aVar2.a();
            if (a11.f16793a != null) {
                el.b.a(ea.a.p("LWUbdDxvMSApZA==", "H7IhNHKF"));
            }
            zd.d dVar2 = a11.f16793a;
            if (dVar2 != null) {
                dVar2.d(this);
            }
            a11.f16793a = null;
            a11.f16796e = false;
            a11.f16797f = false;
            a11.f16795d = false;
            a11.c = false;
            a11.f16794b = null;
            el.b.f16792h = null;
        }
        aVar.a().f23979b = null;
        aVar2.a().f16794b = null;
        NativeGuideLanApi.T0.getClass();
        NativeGuideLanApi.Companion.c = null;
    }

    @Override // androidx.appcompat.app.c, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (i10 == 4) {
            if (b2().f942d.getVisibility() == 0) {
                b2().f942d.setVisibility(8);
                b2().f944f.setVisibility(0);
                return true;
            }
            String p10 = ea.a.p("XWU8Zh9vdw==", "0GjfBBUo");
            String p11 = ea.a.p("NGENZzRhHmUXYgdjaw==", "9MXcAyYg");
            no.f.b(this).getClass();
            tn.a.d(this, p10, p11, no.f.c(), false);
            wn.b.f31389e = false;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // jl.a, androidx.fragment.app.u, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (e2().d()) {
            return;
        }
        LanguageMutableNative.a aVar = LanguageMutableNative.f23975h;
        boolean z10 = aVar.a().f23983g;
        b.a aVar2 = el.b.f16791g;
        if (z10 || aVar2.a().f16797f) {
            aVar.a().f23983g = false;
            aVar2.a().f16797f = false;
            b2().f942d.setVisibility(0);
            b2().f944f.setVisibility(8);
            b2().f942d.setOnClickListener(new g(this, 0));
            b2().c.setOnClickListener(new f5.e(this, 18));
            b2().f943e.setTranslationY(0.0f);
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.dp_5);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(-1.0f, 1.0f);
            ofFloat.addUpdateListener(new pdf.pdfreader.viewer.editor.free.office.n(this, dimensionPixelSize, 1));
            ofFloat.setDuration(1500L);
            ofFloat.start();
            ofFloat.setRepeatMode(2);
            ofFloat.setRepeatCount(-1);
            String p10 = ea.a.p("XWU8Zh9vdw==", "6LUK90Kp");
            String p11 = ea.a.p("X2ElZwZhBWUtZ0FpDWUJcyxvdw==", "epQvVq5S");
            no.f.b(this).getClass();
            tn.a.d(this, p10, p11, no.f.c(), false);
        }
    }

    @Override // jl.a, androidx.appcompat.app.c, androidx.fragment.app.u, android.app.Activity
    public final void onStart() {
        super.onStart();
        if (e2().d()) {
            return;
        }
        pdf.pdfreader.viewer.editor.free.service.b.f26559a.getClass();
        pdf.pdfreader.viewer.editor.free.service.b.c(this);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0101, code lost:
        if (r3.equals(ea.a.p("Q2EsZSxwBmYtdFtfHm8kZA==", "5bXHRSt5")) == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0111, code lost:
        if (r3.equals(ea.a.p("KmEPZWtoF20tXxZwdA==", "F7Zh4x9Y")) == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0121, code lost:
        if (r3.equals(ea.a.p("NGFWZThoGG0tXxZkZg==", "7uD1gw1I")) == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0132, code lost:
        if (r3.equals(ea.a.p("P2FWZSZoWG0_Xz5vGmxz", "wURetryy")) == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0142, code lost:
        if (r3.equals(ea.a.p("Q2EsZSxoDW0XX1F4CmVs", "AM28foaw")) == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0153, code lost:
        if (r3.equals(ea.a.p("P2FWZSZ3XmQ9ZT5fEGQBdA==", "zfR81xgi")) == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0163, code lost:
        if (r3.equals(ea.a.p("R2EOZTxwA2U-aQN3a28xZlFjZQ==", "kW7icqKC")) == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0173, code lost:
        if (r3.equals(ea.a.p("MWFeZTdwSmU-aQN3a3AzZg==", "pTA9h8Zg")) == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0183, code lost:
        if (r3.equals(ea.a.p("Q2EsZSxoDW0XX0NvG2Q=", "SB0i1bLj")) != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0193, code lost:
        if (r3.equals(ea.a.p("OGFRZTFoCW0tXwRvW2s6YUpr", "PVH6nfYw")) == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01a3, code lost:
        if (r3.equals(ea.a.p("Q2EsZSxwBmYtdFtfAG03Z2U=", "YG7C4oS2")) == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01b3, code lost:
        if (r3.equals(ea.a.p("P2FWZSZoWG0_XytsGV8OaVll", "oBpFnL1M")) == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01c2, code lost:
        if (r3.equals(ea.a.p("Q2EsZSxtA2kcX1dvB3YzcnQ=", "lwHpYavD")) == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01d2, code lost:
        if (r3.equals(ea.a.p("Q2EsZSx3C2QVZUBfGmM3bnZwVmY=", "uo8StjRG")) == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01e1, code lost:
        if (r3.equals(ea.a.p("Q2EsZSxzB2EAY2g=", "aySW8KMQ")) == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01f0, code lost:
        if (r3.equals(ea.a.p("Q2EsZSx3DXIWX0BvNnAyZg==", "0mhCieMQ")) == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01ff, code lost:
        if (r3.equals(ea.a.p("Q2EsZSx3C2QVZUBfAG0xMjRkZg==", "s6rhS4qc")) == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x020e, code lost:
        if (r3.equals(ea.a.p("ImENZQhwFGYXdAlfWG85Z2dpP2EuZQ==", "q6RjWphm")) == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x021d, code lost:
        if (r3.equals(ea.a.p("P2FWZSZoWG0_XzhlFmUGdA==", "RZkc1z4t")) == false) goto L75;
     */
    @Override // jl.a, androidx.appcompat.app.c, androidx.fragment.app.u, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onStop() {
        /*
            Method dump skipped, instructions count: 692
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.ui.act.LanguageChooseActivity.onStop():void");
    }

    @Override // jl.a, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z10) {
        boolean z11;
        super.onWindowFocusChanged(z10);
        this.E = z10;
        if (z10 && this.C) {
            this.C = false;
            j0();
        }
        e2().e(z10);
        if (z10 && !e2().d()) {
            if (!this.B) {
                this.B = true;
                if (Build.VERSION.SDK_INT >= 33) {
                    if (androidx.core.content.a.checkSelfPermission(this, new String[]{ea.a.p("Lm5VchZpUy4qZThtHHMbaVpuQFAKUzFff088SSJJJkEbSX5OUw==", "E1T21hde")}[0]) == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z11) {
                        ((Handler) this.f26614y.getValue()).postDelayed(new f(this, 0), 200L);
                    }
                }
            }
            Window window = getWindow();
            if (window != null) {
                pdf.pdfreader.viewer.editor.free.utils.extension.i.c(window, !this.f19294h);
            }
        }
    }

    @Override // com.lib.flutter.encrypt.NativeGuideLanApi
    public final void y() {
        FlutterEncryptConfig.f25878a.getClass();
        if (AdUtils.a(this)) {
            b2().f947i.setVisibility(8);
        } else if (FlutterEncryptConfig.b()) {
            if (!this.F) {
                b2().f947i.setVisibility(8);
            }
        } else {
            b2().f947i.setVisibility(8);
        }
        b2().f945g.setVisibility(8);
    }

    /* compiled from: LanguageChooseActivity.kt */
    /* loaded from: classes3.dex */
    public static final class c implements hl.a {
        public c() {
        }

        @Override // hl.a
        public final void f() {
            LanguageChooseActivity.this.y();
        }

        @Override // hl.a
        public final void f1(BannerType type) {
            kotlin.jvm.internal.g.e(type, "type");
        }

        @Override // hl.a
        public final void d() {
        }

        @Override // hl.a
        public final void e() {
        }
    }

    @Override // jl.a
    public final void C1() {
    }
}

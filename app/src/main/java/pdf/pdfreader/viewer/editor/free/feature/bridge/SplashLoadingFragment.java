package pdf.pdfreader.viewer.editor.free.feature.bridge;

import am.b1;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.TextAppearanceSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.k;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.g0;
import androidx.fragment.app.u;
import androidx.fragment.app.y0;
import androidx.lifecycle.k0;
import androidx.lifecycle.m0;
import androidx.lifecycle.o0;
import androidx.lifecycle.x;
import cg.l;
import com.airbnb.lottie.LottieAnimationView;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.i;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ads.FullScreenManage;
import pdf.pdfreader.viewer.editor.free.ads.InterstitialAdState;
import pdf.pdfreader.viewer.editor.free.ads.a;
import pdf.pdfreader.viewer.editor.free.ads.j;
import pdf.pdfreader.viewer.editor.free.ads.m;
import pdf.pdfreader.viewer.editor.free.base.BaseVMFragment;
import pdf.pdfreader.viewer.editor.free.bean.ThirdOpenBean;
import pdf.pdfreader.viewer.editor.free.feature.billing.BillingConfigImpl;
import pdf.pdfreader.viewer.editor.free.feature.billing.ui.SubscriptionDarkTestFActivity;
import pdf.pdfreader.viewer.editor.free.feature.billing.ui.i;
import pdf.pdfreader.viewer.editor.free.feature.bridge.SplashLoadingFragment;
import pdf.pdfreader.viewer.editor.free.fnbridge.FlutterEncryptConfig;
import pdf.pdfreader.viewer.editor.free.ui.act.LanguageChooseActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderHomeActivity;
import pdf.pdfreader.viewer.editor.free.utils.a0;
import pdf.pdfreader.viewer.editor.free.utils.event.EventCenter;
import pdf.pdfreader.viewer.editor.free.utils.share.ThirdOpenParseManager;
import pdf.pdfreader.viewer.editor.free.utils.share.ThirdOpenStatus;
import pdf.pdfreader.viewer.editor.free.utils.t1;
import tf.d;

/* compiled from: SplashLoadingFragment.kt */
/* loaded from: classes3.dex */
public final class SplashLoadingFragment extends BaseVMFragment<b1> implements a.d {

    /* renamed from: n0  reason: collision with root package name */
    public static final a f24959n0;

    /* renamed from: d0  reason: collision with root package name */
    public ThirdOpenBean f24961d0;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f24962e0;

    /* renamed from: f0  reason: collision with root package name */
    public boolean f24963f0;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f24964g0;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f24965h0;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f24966i0;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f24967j0;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f24968k0;

    /* renamed from: c0  reason: collision with root package name */
    public final k0 f24960c0 = y0.a(this, i.a(c.class), new cg.a<o0>() { // from class: pdf.pdfreader.viewer.editor.free.feature.bridge.SplashLoadingFragment$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final o0 invoke() {
            o0 viewModelStore = Fragment.this.f0().getViewModelStore();
            g.d(viewModelStore, ea.a.p("QWU6dRpyB0ERdF12AHQvKG0uRGkjdw5vHmU9Uz1vGWU=", "zQIkhH0o"));
            return viewModelStore;
        }
    }, new cg.a<n1.a>() { // from class: pdf.pdfreader.viewer.editor.free.feature.bridge.SplashLoadingFragment$special$$inlined$activityViewModels$default$2
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        {
            super(0);
        }

        @Override // cg.a
        public final n1.a invoke() {
            n1.a aVar;
            cg.a aVar2 = cg.a.this;
            if (aVar2 == null || (aVar = (n1.a) aVar2.invoke()) == null) {
                n1.a defaultViewModelCreationExtras = this.f0().getDefaultViewModelCreationExtras();
                g.d(defaultViewModelCreationExtras, ea.a.p("QWU6dRpyB0ERdF12AHQvKG0uVmUgYTZsG1Y9ZThNDWRWbAhyFmEWaR1ucXgdcjdz", "oTObs08Z"));
                return defaultViewModelCreationExtras;
            }
            return aVar;
        }
    }, new cg.a<m0.b>() { // from class: pdf.pdfreader.viewer.editor.free.feature.bridge.SplashLoadingFragment$special$$inlined$activityViewModels$default$3
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final m0.b invoke() {
            m0.b defaultViewModelProviderFactory = Fragment.this.f0().getDefaultViewModelProviderFactory();
            g.d(defaultViewModelProviderFactory, ea.a.p("QWU6dRpyB0ERdF12AHQvKG0uVmUgYTZsOVZcZTBNBmRWbBtyHHYLZBdycmEKdDlyeQ==", "M5GiKFck"));
            return defaultViewModelProviderFactory;
        }
    });

    /* renamed from: l0  reason: collision with root package name */
    public final k f24969l0 = new k(this, 24);

    /* renamed from: m0  reason: collision with root package name */
    public final tf.c f24970m0 = kotlin.a.a(new cg.a<Handler>() { // from class: pdf.pdfreader.viewer.editor.free.feature.bridge.SplashLoadingFragment$mainHandler$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    });

    /* compiled from: SplashLoadingFragment.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        public static void a(g0 fragmentManager, ThirdOpenBean thirdOpenBean) {
            g.e(fragmentManager, "fragmentManager");
            EventCenter.f28658e = ea.a.p("Omktdw==", "2sLHqcqH");
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(fragmentManager);
            SplashLoadingFragment splashLoadingFragment = new SplashLoadingFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable(ea.a.p("JGVIXw1oXnI-XzloFHJl", "JxmjCGyk"), thirdOpenBean);
            splashLoadingFragment.j0(bundle);
            d dVar = d.f30009a;
            aVar.c(R.id.splash_root, splashLoadingFragment, ea.a.p("BXA5YTtoJG8pZA9uU0YlYV9tN250", "U3VUHhfP"), 1);
            aVar.g();
        }
    }

    /* compiled from: SplashLoadingFragment.kt */
    /* loaded from: classes3.dex */
    public static final class b implements x, e {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ l f24971a;

        public b(l lVar) {
            ea.a.p("VXUlYwdpDW4=", "I0NlzEBi");
            this.f24971a = lVar;
        }

        @Override // kotlin.jvm.internal.e
        public final l a() {
            return this.f24971a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof x) && (obj instanceof e)) {
                return g.a(this.f24971a, ((e) obj).a());
            }
            return false;
        }

        public final int hashCode() {
            return this.f24971a.hashCode();
        }

        @Override // androidx.lifecycle.x
        public final /* synthetic */ void m(Object obj) {
            this.f24971a.invoke(obj);
        }
    }

    static {
        ea.a.p("YHAnYQBoLm8TZF1uDkYkYSNtV250", "KtfFyStA");
        f24959n0 = new a();
    }

    @Override // pdf.pdfreader.viewer.editor.free.ads.a.d
    public final void J() {
        z0();
    }

    @Override // pdf.pdfreader.viewer.editor.free.base.BaseVMFragment, androidx.fragment.app.Fragment
    public final void P() {
        super.P();
        v0().f24977f.j(Boolean.FALSE);
        u i10 = i();
        if (i10 != null && !i10.isFinishing()) {
            ReaderHomeActivity.Z1 = true;
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.base.BaseVMFragment, androidx.fragment.app.Fragment
    public final void T() {
        super.T();
        fp.a.f17318a.getClass();
        fp.a.f17321e = System.nanoTime();
    }

    @Override // pdf.pdfreader.viewer.editor.free.base.BaseVMFragment, androidx.fragment.app.Fragment
    public final void W() {
        super.W();
        toString();
        fp.a.f17318a.getClass();
        fp.a.b();
        if (this.f24965h0) {
            this.f24965h0 = false;
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            u0().postDelayed(new Runnable() { // from class: pdf.pdfreader.viewer.editor.free.feature.bridge.a
                @Override // java.lang.Runnable
                public final void run() {
                    SplashLoadingFragment.a aVar = SplashLoadingFragment.f24959n0;
                    String p10 = ea.a.p("O2hYc10w", "RuQNpxR2");
                    SplashLoadingFragment splashLoadingFragment = this;
                    g.e(splashLoadingFragment, p10);
                    int i10 = zk.a.f32399a;
                    t1.b("third show ad delay " + (SystemClock.elapsedRealtime() - elapsedRealtime) + "ms");
                    splashLoadingFragment.y0();
                }
            }, 500L);
        } else if (this.f24966i0) {
            x0();
        } else {
            u i10 = i();
            if (i10 != null) {
                pdf.pdfreader.viewer.editor.free.utils.extension.a.d(i10);
            }
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.ads.a.d
    public final void a0() {
        x0();
    }

    @Override // pdf.pdfreader.viewer.editor.free.ads.a.d
    public final void close() {
        pdf.pdfreader.viewer.editor.free.ads.l.m().f23968j = null;
        j.c().f23962b = null;
        x0();
    }

    @Override // pdf.pdfreader.viewer.editor.free.base.BaseVMFragment
    public final b1 p0(LayoutInflater inflater, ViewGroup viewGroup) {
        g.e(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.fragment_splash_loading, viewGroup, false);
        int i10 = R.id.logo;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.logo);
        if (lottieAnimationView != null) {
            i10 = R.id.lv_loading;
            if (((LottieAnimationView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.lv_loading)) != null) {
                i10 = R.id.splash_name;
                AppCompatTextView appCompatTextView = (AppCompatTextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.splash_name);
                if (appCompatTextView != null) {
                    i10 = R.id.splash_tips;
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.splash_tips);
                    if (appCompatTextView2 != null) {
                        i10 = R.id.top_space;
                        View u7 = com.google.android.play.core.assetpacks.c.u(inflate, R.id.top_space);
                        if (u7 != null) {
                            b1 b1Var = new b1((ConstraintLayout) inflate, lottieAnimationView, appCompatTextView, appCompatTextView2, u7);
                            ea.a.p("Jm5XbBh0UigzbixsFHQNchkgDW8rdARpLGUjLGFmCGw8ZSk=", "MpQnBQAi");
                            return b1Var;
                        }
                    }
                }
            }
        }
        throw new NullPointerException(ea.a.p("fmk4cxpuBSAAZUV1AHIzZGR2W2UxIDRpQmhxSX06IA==", "6Q9DnM0Q").concat(inflate.getResources().getResourceName(i10)));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0092 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0093  */
    @Override // pdf.pdfreader.viewer.editor.free.base.BaseVMFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q0(android.os.Bundle r7) {
        /*
            r6 = this;
            r6.toString()
            android.content.Context r7 = r6.g0()
            java.lang.String r0 = "PWVAdRByUkM1bj5lDXRAKQ=="
            java.lang.String r1 = "FlY2de8B"
            ea.a.p(r0, r1)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            r2 = 0
            r3 = 1
            if (r0 < r1) goto L5c
            r1 = 32
            if (r0 > r1) goto L5c
            android.content.res.Resources r7 = r7.getResources()
            r0 = 2130903044(0x7f030004, float:1.7412895E38)
            java.lang.String[] r7 = r7.getStringArray(r0)
            java.lang.String r0 = "LG9fdBx4Qy4oZTlvAHILZUYuCWUxUxFyqIDfc1lvGl88eUJ0HG1oZDNhJm8SXwVvUWUCKQ=="
            java.lang.String r1 = "4zsKJy1m"
            java.lang.String r0 = ea.a.p(r0, r1)
            kotlin.jvm.internal.g.d(r7, r0)
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r1 = "fkEFVTVBIVQnUnFS"
            java.lang.String r4 = "0JCFd0EM"
            java.lang.String r1 = ea.a.p(r1, r4)
            kotlin.jvm.internal.g.d(r0, r1)
            java.util.Locale r1 = java.util.Locale.getDefault()
            java.lang.String r4 = "KGVFRBxmVnU2dGIp"
            java.lang.String r5 = "osZEAQ4L"
            java.lang.String r0 = a6.h.f(r4, r5, r1, r0, r1)
            java.lang.String r1 = "O2hYc1lhRCAwYTxhW2wJblIuPXQ3aQtncy5AbzZvEWU9Q1BzHChbbzlhJmUp"
            java.lang.String r4 = "1LMDZ4zf"
            java.lang.String r1 = ea.a.p(r1, r4)
            kotlin.jvm.internal.g.d(r0, r1)
            boolean r7 = kotlin.collections.f.w(r0, r7)
            if (r7 == 0) goto L5c
            r7 = r3
            goto L5d
        L5c:
            r7 = r2
        L5d:
            if (r7 == 0) goto L63
            r6.f24962e0 = r2
            r6.f24963f0 = r3
        L63:
            fp.a r7 = fp.a.f17318a
            r7.getClass()
            long r0 = java.lang.System.nanoTime()
            fp.a.f17319b = r0
            r0 = 0
            fp.a.c = r0
            fp.a.f17320d = r0
            fp.a.f17321e = r0
            android.os.Bundle r7 = r6.f3674g
            if (r7 == 0) goto L89
            java.lang.String r0 = "JGVIXw1oXnI-XzloFHJl"
            java.lang.String r1 = "OuEmBytA"
            java.lang.String r0 = ea.a.p(r0, r1)
            android.os.Parcelable r7 = r7.getParcelable(r0)
            pdf.pdfreader.viewer.editor.free.bean.ThirdOpenBean r7 = (pdf.pdfreader.viewer.editor.free.bean.ThirdOpenBean) r7
            goto L8a
        L89:
            r7 = 0
        L8a:
            r6.f24961d0 = r7
            androidx.fragment.app.u r7 = r6.i()
            if (r7 != 0) goto L93
            return
        L93:
            pdf.pdfreader.viewer.editor.free.feature.billing.BillingConfigImpl r0 = pdf.pdfreader.viewer.editor.free.feature.billing.BillingConfigImpl.c
            boolean r0 = r0.w()
            if (r0 == 0) goto L9e
            r6.f24968k0 = r3
            return
        L9e:
            pdf.pdfreader.viewer.editor.free.ads.j r0 = pdf.pdfreader.viewer.editor.free.ads.j.c()
            boolean r0 = r0.d(r7)
            if (r0 != 0) goto Lc9
            pdf.pdfreader.viewer.editor.free.ads.j r0 = pdf.pdfreader.viewer.editor.free.ads.j.c()
            boolean r0 = r0.e()
            if (r0 != 0) goto Lc9
            pdf.pdfreader.viewer.editor.free.ads.l r0 = pdf.pdfreader.viewer.editor.free.ads.l.m()
            boolean r0 = r0.d(r7)
            if (r0 != 0) goto Lc9
            pdf.pdfreader.viewer.editor.free.ads.l r0 = pdf.pdfreader.viewer.editor.free.ads.l.m()
            boolean r0 = r0.e()
            if (r0 != 0) goto Lc9
            r6.f24968k0 = r3
            return
        Lc9:
            pdf.pdfreader.viewer.editor.free.ads.l r0 = pdf.pdfreader.viewer.editor.free.ads.l.m()
            boolean r7 = r0.d(r7)
            if (r7 != 0) goto Le9
            pdf.pdfreader.viewer.editor.free.ads.l r7 = pdf.pdfreader.viewer.editor.free.ads.l.m()
            boolean r7 = r7.e()
            if (r7 == 0) goto Lde
            goto Le9
        Lde:
            boolean r7 = pdf.pdfreader.viewer.editor.free.fnbridge.FlutterEncryptConfig.f25880d
            if (r7 == 0) goto Lef
            pdf.pdfreader.viewer.editor.free.ads.j r7 = pdf.pdfreader.viewer.editor.free.ads.j.c()
            r7.f23962b = r6
            goto Lef
        Le9:
            pdf.pdfreader.viewer.editor.free.ads.l r7 = pdf.pdfreader.viewer.editor.free.ads.l.m()
            r7.f23968j = r6
        Lef:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.feature.bridge.SplashLoadingFragment.q0(android.os.Bundle):void");
    }

    @Override // pdf.pdfreader.viewer.editor.free.base.BaseVMFragment
    public final void r0() {
        Integer num;
        int length;
        v0().f24977f.j(Boolean.TRUE);
        pdf.pdfreader.viewer.editor.free.utils.c.e();
        VB vb2 = this.Y;
        g.b(vb2);
        b1 b1Var = (b1) vb2;
        ThirdOpenBean thirdOpenBean = this.f24961d0;
        if (thirdOpenBean != null) {
            num = Integer.valueOf(thirdOpenBean.getThirdType());
        } else {
            num = null;
        }
        LottieAnimationView lottieAnimationView = b1Var.f746b;
        if (num != null && num.intValue() == 2) {
            lottieAnimationView.setAnimation(R.raw.data_big_doc);
        } else if (num != null && num.intValue() == 4) {
            lottieAnimationView.setAnimation(R.raw.data_big_ppt);
        } else if (num != null && num.intValue() == 3) {
            lottieAnimationView.setAnimation(R.raw.data_big_xls);
        } else {
            lottieAnimationView.setAnimation(R.raw.logo_data);
        }
        lottieAnimationView.j();
        Context r4 = r();
        if (r4 == null) {
            return;
        }
        try {
            String string = v().getString(R.string.arg_res_0x7f13036c);
            g.d(string, ea.a.p("QWUAbzNyGWU7LgFlQFMjclFuNSgbLkV0BmkfZ39yJ2FXZQFfJ3AKXyZhC2Up", "P93sFzQo"));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
            String p10 = ea.a.p("NWUFZFNy", "X7gd692J");
            int i10 = 0;
            int V = kotlin.text.k.V(string, p10, 0, false, 6);
            if (V != -1 && p10.length() + V <= spannableStringBuilder.length()) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(androidx.core.content.a.getColor(r4, R.color.colorAccent)), V, p10.length() + V, 33);
                if (a0.d(r4).equals(Locale.CHINA) || a0.d(r4).equals(Locale.TRADITIONAL_CHINESE) || a0.d(r4).equals(Locale.JAPANESE) || a0.d(r4).equals(Locale.KOREAN)) {
                    if (V == 0) {
                        i10 = p10.length();
                        length = string.length();
                    } else {
                        length = string.length() - p10.length();
                    }
                    if (length <= spannableStringBuilder.length()) {
                        spannableStringBuilder.setSpan(new TextAppearanceSpan(r4, R.style.style_splash_name_small), i10, length, 33);
                    }
                }
                VB vb3 = this.Y;
                g.b(vb3);
                ((b1) vb3).c.setText(spannableStringBuilder);
            }
        } catch (Exception e10) {
            dp.a.a().getClass();
            dp.a.e(e10);
        }
        try {
            AnimatorSet animatorSet = new AnimatorSet();
            VB vb4 = this.Y;
            g.b(vb4);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(((b1) vb4).c, ea.a.p("LmxBaGE=", "NAwctpVm"), 0.0f, 1.0f);
            ofFloat.setDuration(870L);
            ofFloat.setStartDelay(280L);
            animatorSet.play(ofFloat);
            if (!BillingConfigImpl.c.w()) {
                VB vb5 = this.Y;
                g.b(vb5);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(((b1) vb5).f747d, ea.a.p("LmxBaGE=", "JrmtlEey"), 0.0f, 1.0f);
                ofFloat2.setDuration(870L);
                ofFloat2.setStartDelay(280L);
                animatorSet.play(ofFloat2);
            }
            animatorSet.start();
        } catch (Exception e11) {
            if (r() != null) {
                dp.a aVar = dp.a.f16311a;
                Context r10 = r();
                aVar.getClass();
                dp.a.d(r10, e11);
                VB vb6 = this.Y;
                g.b(vb6);
                ((b1) vb6).c.setAlpha(1.0f);
                if (!BillingConfigImpl.c.w()) {
                    VB vb7 = this.Y;
                    g.b(vb7);
                    ((b1) vb7).f747d.setAlpha(1.0f);
                }
            }
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.base.BaseVMFragment
    public final void s0() {
        v0().f24976e.e(A(), new b(new l<Boolean, d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.bridge.SplashLoadingFragment$initViewModel$1
            {
                super(1);
            }

            @Override // cg.l
            public /* bridge */ /* synthetic */ d invoke(Boolean bool) {
                invoke2(bool);
                return d.f30009a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Boolean bool) {
                u i10;
                ea.a.p("HHBdYQpoe287ZCNuEkYaYVJtC250", "PrNJIwCT");
                (bool == null ? ea.a.p("O3UbbA==", "CqUwkXmF") : bool).toString();
                if (bool != null) {
                    bool.booleanValue();
                    SplashLoadingFragment.this.f24962e0 = bool.booleanValue();
                    SplashLoadingFragment splashLoadingFragment = SplashLoadingFragment.this;
                    boolean z10 = splashLoadingFragment.f24962e0;
                    k kVar = splashLoadingFragment.f24969l0;
                    if (z10 && splashLoadingFragment.f24964g0 && splashLoadingFragment.f24963f0) {
                        splashLoadingFragment.u0().removeCallbacks(kVar);
                        if (kotlin.text.j.G(Build.MANUFACTURER, ea.a.p("RWk9bw==", "brR0iBJA"), true)) {
                            splashLoadingFragment.u0().postDelayed(kVar, 2500L);
                            return;
                        } else {
                            splashLoadingFragment.u0().postDelayed(kVar, 1000L);
                            return;
                        }
                    }
                    splashLoadingFragment.u0().removeCallbacks(kVar);
                    if (splashLoadingFragment.f24962e0 && (i10 = splashLoadingFragment.i()) != null && FlutterEncryptConfig.f25880d) {
                        if (pdf.pdfreader.viewer.editor.free.ads.l.m().d(i10) || j.c().d(i10)) {
                            splashLoadingFragment.z0();
                        }
                    }
                }
            }
        }));
        ThirdOpenParseManager.f28764f.e(this, new b(new l<Map<Uri, ? extends ip.c>, d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.bridge.SplashLoadingFragment$initViewModel$2
            {
                super(1);
            }

            @Override // cg.l
            public /* bridge */ /* synthetic */ d invoke(Map<Uri, ? extends ip.c> map) {
                invoke2((Map<Uri, ip.c>) map);
                return d.f30009a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Map<Uri, ip.c> map) {
                final SplashLoadingFragment splashLoadingFragment;
                ThirdOpenBean thirdOpenBean;
                ip.c cVar;
                if (map == null || (thirdOpenBean = (splashLoadingFragment = SplashLoadingFragment.this).f24961d0) == null || (cVar = map.get(thirdOpenBean.getUri())) == null) {
                    return;
                }
                if (cVar.f18970b != ThirdOpenStatus.PARSE) {
                    splashLoadingFragment.getClass();
                    if (!FlutterEncryptConfig.f25880d || splashLoadingFragment.f24968k0) {
                        u i10 = splashLoadingFragment.i();
                        if (i10 != null && (pdf.pdfreader.viewer.editor.free.ads.l.m().d(i10) || j.c().d(i10))) {
                            splashLoadingFragment.z0();
                        } else {
                            splashLoadingFragment.u0().postDelayed(new Runnable() { // from class: pdf.pdfreader.viewer.editor.free.feature.bridge.b
                                @Override // java.lang.Runnable
                                public final void run() {
                                    String p10 = ea.a.p("R2gic1cw", "PWh533JE");
                                    SplashLoadingFragment splashLoadingFragment2 = SplashLoadingFragment.this;
                                    g.e(splashLoadingFragment2, p10);
                                    SplashLoadingFragment.a aVar = SplashLoadingFragment.f24959n0;
                                    splashLoadingFragment2.t0();
                                    splashLoadingFragment2.x0();
                                }
                            }, 1000L);
                        }
                    }
                }
            }
        }));
    }

    public final void t0() {
        u i10 = i();
        if (i10 != null && !(i10 instanceof LanguageChooseActivity)) {
            Intent intent = new Intent();
            i.a aVar = pdf.pdfreader.viewer.editor.free.feature.billing.ui.i.f24934a;
            String p10 = ea.a.p("R2gicmQ=", "vqO6ms0R");
            aVar.getClass();
            i.a.b(i10, intent, p10, SubscriptionDarkTestFActivity.class);
            if (intent.getComponent() != null) {
                n0(intent);
            }
        }
    }

    public final Handler u0() {
        return (Handler) this.f24970m0.getValue();
    }

    public final c v0() {
        return (c) this.f24960c0.getValue();
    }

    @Override // pdf.pdfreader.viewer.editor.free.ads.a.d
    public final void w(boolean z10) {
        if (z10) {
            this.f24966i0 = true;
            v0();
            return;
        }
        x0();
    }

    public final void x0() {
        if (this.f24019a0) {
            this.f24966i0 = true;
        } else if (this.f24967j0) {
        } else {
            this.f24967j0 = true;
            v0();
            j.c().f23962b = null;
            pdf.pdfreader.viewer.editor.free.ads.l.m().f23968j = null;
            try {
                a aVar = f24959n0;
                g0 u7 = u();
                ea.a.p("AWE1ZSR0I3IpZwtlWnQaYVZhNWVy", "oBqGJeKq");
                aVar.getClass();
                androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(u7);
                aVar2.m(this);
                aVar2.g();
                fp.a.f17318a.getClass();
                fp.a.c(true);
            } catch (Exception e10) {
                this.f24967j0 = false;
                this.f24966i0 = true;
                e10.printStackTrace();
            }
        }
    }

    public final void y0() {
        if (this.f24019a0) {
            this.f24965h0 = true;
            return;
        }
        u i10 = i();
        if (i10 == null) {
            return;
        }
        if (BillingConfigImpl.c.w()) {
            String p10 = ea.a.p("P3JUbRB1WiAvcy9yWSAba1xwTnMtYRdlHGkJZQhwP24OZBFzEW93", "AngQZeGZ");
            int i11 = zk.a.f32399a;
            t1.b(p10);
        } else if (pdf.pdfreader.viewer.editor.free.ads.l.m().d(i10) && !pdf.pdfreader.viewer.editor.free.ads.l.m().g()) {
            t0();
            tf.c cVar = FullScreenManage.f23914a;
            FullScreenManage.h(i10, ea.a.p("PHBdYQpo", "IK3Ye6Wp"), false);
            fp.a.f17318a.getClass();
            if (fp.a.c == 0) {
                fp.a.c = System.nanoTime();
            }
            pdf.pdfreader.viewer.editor.free.ads.l m10 = pdf.pdfreader.viewer.editor.free.ads.l.m();
            m10.getClass();
            m10.j(i10, new m(m10));
            return;
        } else if (j.c().d(i10) && !j.c().f()) {
            t0();
            tf.c cVar2 = FullScreenManage.f23914a;
            FullScreenManage.h(i10, ea.a.p("KnBVYRpo", "noY9imZg"), true);
            fp.a.f17318a.getClass();
            if (fp.a.c == 0) {
                fp.a.c = System.nanoTime();
            }
            j c = j.c();
            c.f23962b = this;
            if (c.c) {
                j.a(ea.a.p("PGhedxBuZw==", "WsQef1Vz"));
                a.d dVar = c.f23962b;
                if (dVar != null) {
                    dVar.w(true);
                    return;
                }
                return;
            } else if (c.d(i10)) {
                c.c = true;
                c.f23965f = InterstitialAdState.SHOWING;
                zd.e eVar = c.f23961a;
                pdf.pdfreader.viewer.editor.free.ads.i iVar = new pdf.pdfreader.viewer.editor.free.ads.i(c);
                be.c cVar3 = eVar.f32357e;
                if (cVar3 != null && cVar3.k()) {
                    eVar.f32357e.getClass();
                    eVar.f32357e.l(i10, iVar);
                    return;
                }
                iVar.a(false);
                return;
            } else {
                j.a(ea.a.p("PGhed1lmVmk2ZS4gG28cIFB4B3MxIARk", "OYEJrGJR"));
                a.d dVar2 = c.f23962b;
                if (dVar2 != null) {
                    dVar2.w(false);
                    return;
                }
                return;
            }
        }
        x0();
    }

    public final void z0() {
        if (this.f24963f0 && !this.f24962e0) {
            this.f24964g0 = true;
        } else if (this.f24966i0) {
        } else {
            y0();
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.ads.a.d
    public final void d() {
    }
}

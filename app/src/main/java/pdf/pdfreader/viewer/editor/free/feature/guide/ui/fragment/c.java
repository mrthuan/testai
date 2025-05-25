package pdf.pdfreader.viewer.editor.free.feature.guide.ui.fragment;

import a6.h;
import am.z0;
import android.animation.LayoutTransition;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import android.widget.Space;
import androidx.activity.s;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.u;
import androidx.viewpager2.widget.ViewPager2;
import el.e;
import java.util.List;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ads.anim.LangBannerLoadingAnimation;
import pdf.pdfreader.viewer.editor.free.ads.standard.banner.BannerType;
import rm.b;

/* compiled from: PreInstallUserGuideFragment.kt */
/* loaded from: classes3.dex */
public final class c extends BaseUserGuideTestFragment<z0> {

    /* renamed from: i0  reason: collision with root package name */
    public rm.b f25025i0;

    /* renamed from: k0  reason: collision with root package name */
    public static final String f25024k0 = ea.a.p("H3JUSRdzQ2E2bB9zEHIvdVxkC0Y3YQJtKG50", "uIuyMrcF");

    /* renamed from: j0  reason: collision with root package name */
    public static final a f25023j0 = new a();

    /* compiled from: PreInstallUserGuideFragment.kt */
    /* loaded from: classes3.dex */
    public static final class a {
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.guide.ui.fragment.BaseUserGuideTestFragment
    public final Space A0() {
        VB vb2 = this.Y;
        g.b(vb2);
        String p10 = ea.a.p("LWkrZBpuUC48bxZTRGE0ZQ==", "RqOEs73w");
        Space space = ((z0) vb2).f1693j;
        g.d(space, p10);
        return space;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.guide.ui.fragment.BaseUserGuideTestFragment
    public final ViewPager2 B0() {
        VB vb2 = this.Y;
        g.b(vb2);
        String p10 = ea.a.p("UWklZBpuBS4EaVF3OWExZXI=", "xFQvMI5J");
        ViewPager2 viewPager2 = ((z0) vb2).f1694k;
        g.d(viewPager2, p10);
        return viewPager2;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.guide.ui.fragment.BaseUserGuideTestFragment
    public final void D0(int i10) {
        super.D0(i10);
        e.a aVar = e.f16807g;
        if (aVar.a().c) {
            e a10 = aVar.a();
            u i11 = i();
            if (i11 == null) {
                return;
            }
            a10.b(i11);
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.base.BaseVMFragment
    public final i2.a p0(LayoutInflater inflater, ViewGroup viewGroup) {
        g.e(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.fragment_pre_install_user_guide, viewGroup, false);
        int i10 = R.id.continueTv;
        AppCompatTextView appCompatTextView = (AppCompatTextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.continueTv);
        if (appCompatTextView != null) {
            i10 = R.id.indicator1Container;
            FrameLayout frameLayout = (FrameLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.indicator1Container);
            if (frameLayout != null) {
                i10 = R.id.indicator1Iv;
                AppCompatImageView appCompatImageView = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.indicator1Iv);
                if (appCompatImageView != null) {
                    i10 = R.id.indicator2Container;
                    FrameLayout frameLayout2 = (FrameLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.indicator2Container);
                    if (frameLayout2 != null) {
                        i10 = R.id.indicator2Iv;
                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.indicator2Iv);
                        if (appCompatImageView2 != null) {
                            i10 = R.id.indicator3Container;
                            FrameLayout frameLayout3 = (FrameLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.indicator3Container);
                            if (frameLayout3 != null) {
                                i10 = R.id.indicator3Iv;
                                AppCompatImageView appCompatImageView3 = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.indicator3Iv);
                                if (appCompatImageView3 != null) {
                                    i10 = R.id.nativeCardContainer;
                                    if (((ScrollView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.nativeCardContainer)) != null) {
                                        i10 = R.id.nativeCardLayout;
                                        FrameLayout frameLayout4 = (FrameLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.nativeCardLayout);
                                        if (frameLayout4 != null) {
                                            i10 = R.id.topSpace;
                                            Space space = (Space) com.google.android.play.core.assetpacks.c.u(inflate, R.id.topSpace);
                                            if (space != null) {
                                                i10 = R.id.viewPager;
                                                ViewPager2 viewPager2 = (ViewPager2) com.google.android.play.core.assetpacks.c.u(inflate, R.id.viewPager);
                                                if (viewPager2 != null) {
                                                    z0 z0Var = new z0((ConstraintLayout) inflate, appCompatTextView, frameLayout, appCompatImageView, frameLayout2, appCompatImageView2, frameLayout3, appCompatImageView3, frameLayout4, space, viewPager2);
                                                    ea.a.p("Wm4tbBJ0BygbblJsCHQzcmggUW8odCJpNmU-LEFmVWxAZSk=", "XLa48ITN");
                                                    return z0Var;
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
        throw new NullPointerException(ea.a.p("fmk4cxpuBSAAZUV1AHIzZGR2W2UxIDRpBWhWSR46IA==", "qvZ1DSoF").concat(inflate.getResources().getResourceName(i10)));
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.guide.ui.fragment.BaseUserGuideTestFragment, pdf.pdfreader.viewer.editor.free.base.BaseVMFragment
    public final void r0() {
        boolean z10;
        ViewGroup viewGroup;
        super.r0();
        u i10 = i();
        if (i10 == null) {
            return;
        }
        e.a aVar = e.f16807g;
        e a10 = aVar.a();
        boolean z11 = true;
        if (a10.f16809a != null && a10.f16813f != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            e a11 = aVar.a();
            VB vb2 = this.Y;
            g.b(vb2);
            String p10 = ea.a.p("F2krZCVuPS4mYRJpQmUUYUpkHmEwb0N0", "2cuELZqy");
            FrameLayout frameLayout = ((z0) vb2).f1692i;
            g.d(frameLayout, p10);
            a11.c(frameLayout);
            return;
        }
        aVar.a().f16810b = new b();
        if (!s.x(i10)) {
            e a12 = aVar.a();
            VB vb3 = this.Y;
            g.b(vb3);
            String p11 = ea.a.p("KmkJZCJuMy4mYRJpQmUUYUpkHmEwb0N0", "ftHgKTMO");
            FrameLayout frameLayout2 = ((z0) vb3).f1692i;
            g.d(frameLayout2, p11);
            LangBannerLoadingAnimation langBannerLoadingAnimation = new LangBannerLoadingAnimation(i10, true);
            if (a12.f16809a == null || a12.f16813f == null) {
                z11 = false;
            }
            if (!z11) {
                frameLayout2.setVisibility(0);
                frameLayout2.removeAllViews();
                ViewParent parent = langBannerLoadingAnimation.getParent();
                if (parent instanceof ViewGroup) {
                    viewGroup = (ViewGroup) parent;
                } else {
                    viewGroup = null;
                }
                if (viewGroup != null) {
                    viewGroup.removeView(langBannerLoadingAnimation);
                }
                frameLayout2.addView(langBannerLoadingAnimation);
                langBannerLoadingAnimation.r();
            }
            VB vb4 = this.Y;
            g.b(vb4);
            ((z0) vb4).f1692i.setLayoutTransition(new LayoutTransition());
        }
        aVar.a().b(i10);
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.guide.ui.fragment.BaseUserGuideTestFragment
    public final AppCompatTextView u0() {
        VB vb2 = this.Y;
        g.b(vb2);
        String p10 = ea.a.p("GGkAZBpuDy4rbwh0XW4iZWx2", "dqznshF8");
        AppCompatTextView appCompatTextView = ((z0) vb2).f1686b;
        g.d(appCompatTextView, p10);
        return appCompatTextView;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.guide.ui.fragment.BaseUserGuideTestFragment
    public final AppCompatImageView v0() {
        VB vb2 = this.Y;
        g.b(vb2);
        String p10 = ea.a.p("K2ktZFBuNS4hbgJpV2Ejb0oxG3Y=", "c1IC9RRw");
        AppCompatImageView appCompatImageView = ((z0) vb2).f1687d;
        g.d(appCompatImageView, p10);
        return appCompatImageView;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.guide.ui.fragment.BaseUserGuideTestFragment
    public final AppCompatImageView x0() {
        VB vb2 = this.Y;
        g.b(vb2);
        String p10 = ea.a.p("LWlfZBBuUC4zbi5pFmEcb0cyJ3Y=", "NpZnl6xX");
        AppCompatImageView appCompatImageView = ((z0) vb2).f1689f;
        g.d(appCompatImageView, p10);
        return appCompatImageView;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.guide.ui.fragment.BaseUserGuideTestFragment
    public final AppCompatImageView y0() {
        VB vb2 = this.Y;
        g.b(vb2);
        String p10 = ea.a.p("LWlfZBBuUC4zbi5pFmEcb0czJ3Y=", "QbTUfsiR");
        AppCompatImageView appCompatImageView = ((z0) vb2).f1691h;
        g.d(appCompatImageView, p10);
        return appCompatImageView;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.guide.ui.fragment.BaseUserGuideTestFragment
    public final rm.a<b.a> z0() {
        boolean z10;
        List I;
        Context r4 = r();
        if (r4 == null) {
            return null;
        }
        if (r4.getResources().getDisplayMetrics().heightPixels / pdf.pdfreader.viewer.editor.free.utils.extension.c.k(r4) > 1.8888888f) {
            z10 = true;
        } else {
            z10 = false;
        }
        rm.b bVar = this.f25025i0;
        if (bVar == null) {
            if (z10) {
                String string = r4.getString(R.string.arg_res_0x7f130360);
                String e10 = h.e("Xm86YQRDOm48ZR50GmcydGt0IGknZx5SloDXYTVfL3VedDBfDmk5ZTtfEmlAbDJfX3AmKQ==", "7E2YhULt", string, r4, R.string.arg_res_0x7f13035f);
                g.d(e10, ea.a.p("Om8IYT1DHm48ZR50GmcydGt0IGknZx5SloDXaT9nbHIzYQ9fPHUddCFfAGlYZSRfXGUhKQ==", "PbVkQqQn"));
                String string2 = r4.getString(R.string.arg_res_0x7f130301);
                String e11 = h.e("I29SYRVDWG4uZTJ0W2cNdGZ0HGkrZ01S0IDPaTRnQnArZm5jFm5BZShzI28bXxxpQWwLKQ==", "ptx22iZl", string2, r4, R.string.arg_res_0x7f130574);
                g.d(e11, ea.a.p("X28oYR9DDW4GZUx0R2czdBd0QGkoZ2tS0oDkaThnY3VAZTlfFHULZBdfBV8NZSVfI3BGKQ==", "0BVMC2mG"));
                String string3 = r4.getString(R.string.arg_res_0x7f130303);
                String e12 = h.e("I29SYRVDWG4uZTJ0W2cNdGZ0HGkrZ01Sj4DMbgguAmQpX1RkEHRebj1fPmkBbA1fUnAaKQ==", "hPtBmjor", string3, r4, R.string.arg_res_0x7f130302);
                g.d(e12, ea.a.p("X28oYR9DDW4GZUx0R2czdBd0QGkoZ2tStICTcituAi5DZC1fFmQLdBtuU18NZSVfI3BGKQ==", "V5BeLgXx"));
                I = ge.a.I(new rm.h(R.raw.user_guide_d2_step1, string, e10, ea.a.p("OnNUciZnQmk-ZWVkRy8bdFBwMQ==", "UuLECNO4")), new rm.h(R.raw.user_guide_d2_step2, string2, e11, ea.a.p("H3Mqcj1nGWksZUlkBi8kdF1wMg==", "HmjOblhh")), new rm.h(R.raw.user_guide_d2_step3, string3, e12, ea.a.p("JHMBcjVnAWksZUlkBi8kdF1wMw==", "cvQdjtHf")));
            } else {
                String string4 = r4.getString(R.string.arg_res_0x7f130360);
                String e13 = h.e("I29SYRVDWG4uZTJ0W2cNdGZ0HGkrZ01SiIDDYQlfO3UjdFhfH2lbZSlfPmkBbA1fUnAaKQ==", "Tz3fjemV", string4, r4, R.string.arg_res_0x7f13035f);
                g.d(e13, ea.a.p("I29SYRVDWG4uZTJ0W2cNdGZ0HGkrZ01SpYCQaT9nRnIqYVVfFHVbdDNfLGkZZRtfUWUdKQ==", "6DumG6Qh"));
                String string5 = r4.getString(R.string.arg_res_0x7f130301);
                String e14 = h.e("I29SYRVDWG4uZTJ0W2cNdGZ0HGkrZ01S0YD3aSJnSnArZm5jFm5BZShzI28bXxxpQWwLKQ==", "BWyp3QLd", string5, r4, R.string.arg_res_0x7f130574);
                g.d(e14, ea.a.p("GW8lYSRDHG48ZR50GmcydGt0IGknZx5SloDXaT9nbHUGZTRfL3UaZC1fV19QZSRfX3AmKQ==", "WKuFHsTZ"));
                String string6 = r4.getString(R.string.arg_res_0x7f130303);
                String e15 = h.e("I29SYRVDWG4uZTJ0W2cNdGZ0HGkrZ01SqYD_bhAuGWQpX1RkEHRebj1fPmkBbA1fUnAaKQ==", "WwycKYwi", string6, r4, R.string.arg_res_0x7f130302);
                g.d(e15, ea.a.p("I29SYRVDWG4uZTJ0W2cNdGZ0HGkrZ01SiIDIcjhuKy4_ZFdfHGRedDNuLV8RZRtfUnAaKQ==", "mB1jjnQL"));
                I = ge.a.I(new rm.h(R.raw.pre_install_user_guide_step1, string4, e13, ea.a.p("OnNUciZnQmk-ZWVwB2U3aVtzGmEpbEpzJWUYMQ==", "AQu1Qhpi")), new rm.h(R.raw.pre_install_user_guide_step2, string5, e14, ea.a.p("OnNUciZnQmk-ZWVwB2U3aVtzGmEpbEpzOWUbMg==", "8dMTMkgV")), new rm.h(R.raw.pre_install_user_guide_step3, string6, e15, ea.a.p("RnMucixnF2kWZRtwG2UJaSpzRmEqbGxzOmU_Mw==", "NO82Gn8a")));
            }
            bVar = new rm.b(z10, I);
            this.f25025i0 = bVar;
        }
        return bVar;
    }

    /* compiled from: PreInstallUserGuideFragment.kt */
    /* loaded from: classes3.dex */
    public static final class b implements hl.a {
        public b() {
        }

        @Override // hl.a
        public final void e() {
            e a10 = e.f16807g.a();
            a aVar = c.f25023j0;
            VB vb2 = c.this.Y;
            g.b(vb2);
            String p10 = ea.a.p("UWklZBpuBS4cYUBpH2UVYTZkfmE_bzZ0", "pQaa4n0Y");
            FrameLayout frameLayout = ((z0) vb2).f1692i;
            g.d(frameLayout, p10);
            a10.c(frameLayout);
        }

        @Override // hl.a
        public final void f1(BannerType type) {
            g.e(type, "type");
        }

        @Override // hl.a
        public final void d() {
        }

        @Override // hl.a
        public final void f() {
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.base.BaseVMFragment
    public final void s0() {
    }
}
